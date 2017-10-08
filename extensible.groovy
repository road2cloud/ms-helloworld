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
