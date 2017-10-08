import org.boon.Boon;

def jsonEditorOptions = Boon.fromJson(/{
		disable_edit_json: true,
    disable_properties: true,
    no_additional_properties: true,
    disable_collapse: true,
    disable_array_add: true,
    disable_array_delete: true,
    disable_array_reorder: true,
    theme: "bootstrap2",
    iconlib:"fontawesome4",
		schema: {
  "title": "Use Cases",
  "oneOf": [
    {
      "title": "None",
      "type": "object",
      "properties": {
        "method": {
          "type": "string",
          "enum": [
            "none"
          ],
          "options": {
            "hidden": true
          }
        }
      },
      "required": [
        "method"
      ],
      "additionalProperties": false,
      "options": {
        "hidden": true,
        "theme": "bootstrap3",
        "disable_collapse": true,
        "disable_edit_json": true,
        "disable_properties": true
      }
    },
    {
      "title": "Package and build Docker Image + Push to DTR",
      "type": "object",
      "format": "grid",
      "properties": {
        "method": {
          "type": "string",
          "enum": [
            "1"
          ],
          "options": {
            "hidden": true
          }
        },
        "Branch": {
          "title": "Branch Name",
          "type": "string",
          "minLength": 5
        },
        "Push_DB_Scripts": {
          "title": "Push DB Scripts",
          "type": "string",
					"enum": [
            "True",
            "False"
          ]
        }
      },
      "required": [
        "method",
        "Branch",
        "Push_DB_Scripts"
      ],
      "additionalProperties": false,
      "options": {
        "theme": "bootstrap3",
        "disable_collapse": true,
        "disable_edit_json": true,
        "disable_properties": true
      }
    },
    {
      "title": "Credit Card",
      "type": "object",
      "format": "grid",
      "properties": {
        "method": {
          "type": "string",
          "enum": [
            "2"
          ],
          "options": {
            "hidden": true
          }
        },
        "cardType": {
          "title": "Card type",
          "type": "string",
          "enum": [
            "Amex",
            "Discover",
            "MasterCard",
            "Visa"
          ],
          "options": {
            "grid_columns": 3
          }
        },
        "cardNumber": {
          "title": "Card number",
          "type": "string",
          "minLength": 15,
          "maxLength": 16,
          "options": {
            "grid_columns": 4
          }
        },
        "expiration": {
          "title": "Expiration month",
          "type": "string",
          "format": "month",
          "options": {
            "grid_columns": 3
          }
        },
        "CCV": {
          "type": "string",
          "maxLength": 4,
          "minLength": 3,
          "pattern": "[0-9]*",
          "options": {
            "grid_columns": 2
          }
        }
      },
      "required": [
        "method",
        "cardType",
        "cardNumber",
        "expiration",
        "CCV"
      ],
      "additionalProperties": false,
      "options": {
        "theme": "bootstrap3",
        "disable_collapse": true,
        "disable_edit_json": true,
        "disable_properties": true
      }
    }
  ],
  "options": {
    "theme": "bootstrap3",
    "disable_collapse": true,
    "disable_edit_json": true,
    "disable_properties": true
  }
		}
}/);

https://github.com/jdorn/json-editor
http://jeremydorn.com/json-editor/?schema=N4IgLglmA2CmIC4QAUCGBPAtrAdmABALKxgAWA9gCYgA0I5OsA8gGaIDaokM8SAcg3h0w6AA696AIwBWsAMZhaIUQCdy4lZFgBnRKGxkqe8GInawKiDgDmS3AFdMHEDkEgAunXWQGuhKFIISkpcRAt7WABfaLoVWABHewg46gR2EAMKak8QVGCoCAZUaGQ1DS0/FmLtWC9RHxw/AKCQnDCVCOFSWGxEEElycjBzFVRRAGYlSghtVEk4AH05cmhoMZr2zpBp2fnYBdhpsAXpbQZN2u2ZucXVdVhNCB0LmK4oOD6AIVQcAGt8ACiADEACpKETiPrkGTyRR0FjkFSYVCKJDWSzUOh3cpPJoZEhZYwQswWKy2OgOJxpECwFiKHLeQqNYyBYKhBDhKKROiSH6/PioXr+cDvCTfP74HCCoQmSFIEZkpSYKwAGVw1jIiAArNyQGp7JAbHxHJIHkTRX0AErkA1kyUms3CUx9BU2JWq9WahAATl1qDky3seGNmFNKnNPD6AEEAza8PbQ47ZSTLG66MqcGqbF6AIwAJhieoSSRSzkyRh5fIFvViNsN1hDYaU/sDwYd4ZyeSOTOKpXuj2eCCq0BqdQaeLIPQkAyGIzGkzoOxu+2Wq3WvE5i+uewORxOZzaHI6lyXO+xDwqL25b0jSAAwikoPg76gVJjk1CYQolAikSi+uiQRKOeA54uWqRcM68qkmmNI4I4zhyI+YAvm+HhjkyeKsq0V50HIr6UCCUE3h894EfgxLglBICuuScEIdSUbYAAHkoAAiMzLAAbkmhCoOYDyoe+ABq1zofQ9SYcYgGUEsKyOMyCDjIW+Fvo2ZrCtwpEgEJCZNk6co0TBdEZlmGqkIgOZaumqDMWZuYAGwYb40kYnJ0AKX4AAshawMxojJCiTIRtpAL+YFDT4JgDCagZKaKvCiLIqiGQxRZzmKaAMnuZ5iDKbqd53sJRLUbRSq2fZFkIF56YetmVXjFiKJgA8h4gOwAAMAC03ruAAVEojIucK2WrrlCAFoWcSJMkhxlgSFYgKphHOnhBHqeGFLhaMDRKIVxWdvkDS9mUF64ogw6jhJ45Et0Qr9IMwwWPOUzbosq5rKIGxHlsp6LIcUD7ucP0nm9+wgZeIPRAyknDVwd3To9c4TK9uzvSsn3fZuVxo/sAPHKcwPY394OnaBV5AAA=&value=N4IgtgpgLgFg9gExALhAOzmiIC+QAA==&theme=bootstrap3&iconlib=fontawesome4&object_layout=normal&show_errors=interaction&disable_edit_json&disable_collapse&disable_properties
http://schemaform.io/examples/bootstrap-example.html
