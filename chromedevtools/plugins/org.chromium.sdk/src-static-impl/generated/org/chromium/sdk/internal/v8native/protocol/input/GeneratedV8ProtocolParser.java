// This is a generated source.
// See org.chromium.sdk.internal.protocolparser.dynamicimpl.DynamicParserImpl for details

package org.chromium.sdk.internal.v8native.protocol.input;

public class GeneratedV8ProtocolParser implements org.chromium.sdk.internal.v8native.protocol.input.V8NativeProtocolParser {
  @Override public org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage parseIncomingMessage(org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return Value_13.parse(obj);
  }

  @Override public org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle parseScriptHandle(org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return Value_31.parse(obj);
  }

  @Override public org.chromium.sdk.internal.v8native.protocol.input.FrameObject parseFrameObject(org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return Value_12.parse(obj);
  }

  @Override public org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle parseValueHandle(org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return Value_36.parse(obj);
  }

  @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef parseSomeRef(org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return Value_34.parse(obj);
  }

  @Override public org.chromium.sdk.internal.v8native.protocol.input.data.ContextData parseContextData(org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return Value_23.parse(obj);
  }

  @Override public org.chromium.sdk.internal.v8native.protocol.input.SuccessCommandResponse parseSuccessCommandResponse(org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return Value_20.parse(obj);
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage
  public static class Value_13 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage {
    public static Value_13 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_13(input);
    }
    Value_13(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      int code = -1;
      if (Value_7.checkSubtypeConditions(underlying)) {
        if (code == -1) {
          code = 0;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("More than one case match");
        }
      }
      if (Value_5.checkSubtypeConditions(underlying)) {
        if (code == -1) {
          code = 1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("More than one case match");
        }
      }
      if (code == -1) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Not a singe case matches");
      }
      auto_alg_field_0 = (code == 0) ? new Value_7(underlying, this) : null;
      auto_alg_field_1 = (code == 1) ? new Value_5(underlying, this) : null;
    }
    private final Value_7 auto_alg_field_0;
    private final Value_5 auto_alg_field_1;
    @Override public org.chromium.sdk.internal.v8native.protocol.input.CommandResponse asCommandResponse() {
      return auto_alg_field_1;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.EventNotification asEventNotification() {
      return auto_alg_field_0;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.MessageType type()    {
      org.chromium.sdk.internal.v8native.protocol.input.MessageType result;
      try {
        Object value0 = underlying.get("type");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("type");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          try {
            if (value0 instanceof String == false) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("String value expected");
            }
            String stringValue = (String) value0;
            stringValue = stringValue.toUpperCase();
            org.chromium.sdk.internal.v8native.protocol.input.MessageType r1 = org.chromium.sdk.internal.v8native.protocol.input.MessageType.valueOf(stringValue);
            result = r1;
          } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field type in type org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage", e);
          }
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: type");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public long seq()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("seq");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("seq");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: seq");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.EventNotification
  public static class Value_7 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.EventNotification {
    public static Value_7 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_13 superTypeValue = Value_13.parse(input);
      Value_7 result = superTypeValue.auto_alg_field_0;
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_7(Object input, org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("body");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("body");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_8 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_8.parse(value0);
          }
          this.field_body = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field body", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: body");
      }

      Object value3 = underlying.get("refs");
      boolean hasValue4;
      if (value3 == null) {
        hasValue4 = underlying.containsKey("refs");
      } else {
        hasValue4 = true;
      }
      if (hasValue4) {
        try {
          if (value3 instanceof org.json.simple.JSONArray == false) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
          }
          final org.json.simple.JSONArray arrayValue6 = (org.json.simple.JSONArray) value3;
          int size7 = arrayValue6.size();
          java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> list8 = new java.util.ArrayList<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle>(size7);
          for (int index9 = 0; index9 < size7; index9++) {
            Value_33 arrayComponent10;
            if (arrayValue6.get(index9) == null) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
            } else {
              arrayComponent10 = Value_33.parse(arrayValue6.get(index9));
            }
            list8.add(arrayComponent10);
          }
          java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> parsedValue5 = java.util.Collections.unmodifiableList(list8);
          this.field_refs = parsedValue5;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field refs", e);
        }
      } else {
        this.field_refs = null;
      }
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody field_body;
    private final java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> field_refs;
    private final org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage superTypeValue;
    @Override public org.chromium.sdk.internal.v8native.protocol.input.MessageType type()    {
      org.chromium.sdk.internal.v8native.protocol.input.MessageType result;
      try {
        Object value0 = underlying.get("type");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("type");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          try {
            if (value0 instanceof String == false) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("String value expected");
            }
            String stringValue = (String) value0;
            stringValue = stringValue.toUpperCase();
            org.chromium.sdk.internal.v8native.protocol.input.MessageType r1 = org.chromium.sdk.internal.v8native.protocol.input.MessageType.valueOf(stringValue);
            result = r1;
          } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field type in type org.chromium.sdk.internal.v8native.protocol.input.EventNotification", e);
          }
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: type");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody body() {
      return field_body;
    }
    @Override public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> refs() {
      return field_refs;
    }
    @Override public org.json.simple.JSONObject exception()    {
      org.json.simple.JSONObject result;
      Object value0 = underlying.get("exception");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("exception");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        org.json.simple.JSONObject r1 = (org.json.simple.JSONObject) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.String event()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("event");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("event");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: event");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.json.simple.JSONObject getUnderlyingObject()    {
      return underlying;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      {
        Object value = input.get("type");
        boolean hasValue;
        if (value == null) {
          hasValue = input.containsKey("type");
        } else {
          hasValue = true;
        }
      boolean conditionRes;
      if (hasValue) {
        if (value instanceof String == false) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("String value expected");
        }
        String stringValue = (String) value;
        stringValue = stringValue.toUpperCase();
        org.chromium.sdk.internal.v8native.protocol.input.MessageType parserResult = org.chromium.sdk.internal.v8native.protocol.input.MessageType.valueOf(stringValue);
        boolean constraintResult = CUSTOM_CONDITION_0.conforms(parserResult);
        conditionRes = constraintResult;
      } else {
        conditionRes = false;
      }
        if (!conditionRes) {
          return false;
        }
      }
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.SuccessCommandResponse
  public static class Value_20 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.SuccessCommandResponse {
    public static Value_20 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_5 superTypeValue = Value_5.parse(input);
      Value_20 result = superTypeValue.auto_alg_field_0;
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_20(Object input, org.chromium.sdk.internal.v8native.protocol.input.CommandResponse superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("body");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("body");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_6 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_6.parse(value0);
          }
          this.field_body = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field body", e);
        }
      } else {
        this.field_body = null;
      }

      Object value3 = underlying.get("refs");
      boolean hasValue4;
      if (value3 == null) {
        hasValue4 = underlying.containsKey("refs");
      } else {
        hasValue4 = true;
      }
      if (hasValue4) {
        try {
          if (value3 instanceof org.json.simple.JSONArray == false) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
          }
          final org.json.simple.JSONArray arrayValue6 = (org.json.simple.JSONArray) value3;
          int size7 = arrayValue6.size();
          java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> list8 = new java.util.ArrayList<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle>(size7);
          for (int index9 = 0; index9 < size7; index9++) {
            Value_33 arrayComponent10;
            if (arrayValue6.get(index9) == null) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
            } else {
              arrayComponent10 = Value_33.parse(arrayValue6.get(index9));
            }
            list8.add(arrayComponent10);
          }
          java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> parsedValue5 = java.util.Collections.unmodifiableList(list8);
          this.field_refs = parsedValue5;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field refs", e);
        }
      } else {
        this.field_refs = null;
      }
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody field_body;
    private final java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> field_refs;
    private final org.chromium.sdk.internal.v8native.protocol.input.CommandResponse superTypeValue;
    @Override public boolean running()    {
      java.lang.Boolean result;
      try {
        Object value0 = underlying.get("running");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("running");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Boolean r1 = (java.lang.Boolean) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: running");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public boolean success()    {
      java.lang.Boolean result;
      try {
        Object value0 = underlying.get("success");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("success");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Boolean r1 = (java.lang.Boolean) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: success");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody body() {
      return field_body;
    }
    @Override public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> refs() {
      return field_refs;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.CommandResponse getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      {
        Object value = input.get("success");
        boolean hasValue;
        if (value == null) {
          hasValue = input.containsKey("success");
        } else {
          hasValue = true;
        }
      boolean conditionRes;
      if (hasValue) {
        java.lang.Boolean parserResult = (java.lang.Boolean) value;
        conditionRes = true == parserResult;
      } else {
        conditionRes = false;
      }
        if (!conditionRes) {
          return false;
        }
      }
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.FailedCommandResponse
  public static class Value_9 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.FailedCommandResponse {
    public static Value_9 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_5 superTypeValue = Value_5.parse(input);
      Value_9 result = superTypeValue.auto_alg_field_1;
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_9(Object input, org.chromium.sdk.internal.v8native.protocol.input.CommandResponse superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.CommandResponse superTypeValue;
    @Override public java.lang.String message()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("message");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("message");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: message");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.Long requestSeq()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("request_seq");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("request_seq");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: request_seq");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.String command()    {
      java.lang.String result;
      Object value0 = underlying.get("command");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("command");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public boolean success()    {
      java.lang.Boolean result;
      try {
        Object value0 = underlying.get("success");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("success");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Boolean r1 = (java.lang.Boolean) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: success");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.CommandResponse getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      {
        Object value = input.get("success");
        boolean hasValue;
        if (value == null) {
          hasValue = input.containsKey("success");
        } else {
          hasValue = true;
        }
      boolean conditionRes;
      if (hasValue) {
        java.lang.Boolean parserResult = (java.lang.Boolean) value;
        conditionRes = false == parserResult;
      } else {
        conditionRes = false;
      }
        if (!conditionRes) {
          return false;
        }
      }
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.CommandResponse
  public static class Value_5 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.CommandResponse {
    public static Value_5 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_13 superTypeValue = Value_13.parse(input);
      Value_5 result = superTypeValue.auto_alg_field_1;
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_5(Object input, org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;
      int code = -1;
      if (Value_20.checkSubtypeConditions(underlying)) {
        if (code == -1) {
          code = 0;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("More than one case match");
        }
      }
      if (Value_9.checkSubtypeConditions(underlying)) {
        if (code == -1) {
          code = 1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("More than one case match");
        }
      }
      if (code == -1) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Not a singe case matches");
      }
      auto_alg_field_0 = (code == 0) ? new Value_20(underlying, this) : null;
      auto_alg_field_1 = (code == 1) ? new Value_9(underlying, this) : null;
    }
    private final Value_20 auto_alg_field_0;
    private final Value_9 auto_alg_field_1;
    private final org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage superTypeValue;
    @Override public org.chromium.sdk.internal.v8native.protocol.input.FailedCommandResponse asFailure() {
      return auto_alg_field_1;
    }
    @Override public long requestSeq()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("request_seq");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("request_seq");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: request_seq");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public boolean success()    {
      java.lang.Boolean result;
      try {
        Object value0 = underlying.get("success");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("success");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Boolean r1 = (java.lang.Boolean) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: success");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.MessageType type()    {
      org.chromium.sdk.internal.v8native.protocol.input.MessageType result;
      try {
        Object value0 = underlying.get("type");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("type");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          try {
            if (value0 instanceof String == false) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("String value expected");
            }
            String stringValue = (String) value0;
            stringValue = stringValue.toUpperCase();
            org.chromium.sdk.internal.v8native.protocol.input.MessageType r1 = org.chromium.sdk.internal.v8native.protocol.input.MessageType.valueOf(stringValue);
            result = r1;
          } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field type in type org.chromium.sdk.internal.v8native.protocol.input.CommandResponse", e);
          }
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: type");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.SuccessCommandResponse asSuccess() {
      return auto_alg_field_0;
    }
    @Override public java.lang.String command()    {
      java.lang.String result;
      Object value0 = underlying.get("command");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("command");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      {
        Object value = input.get("type");
        boolean hasValue;
        if (value == null) {
          hasValue = input.containsKey("type");
        } else {
          hasValue = true;
        }
      boolean conditionRes;
      if (hasValue) {
        if (value instanceof String == false) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("String value expected");
        }
        String stringValue = (String) value;
        stringValue = stringValue.toUpperCase();
        org.chromium.sdk.internal.v8native.protocol.input.MessageType parserResult = org.chromium.sdk.internal.v8native.protocol.input.MessageType.valueOf(stringValue);
        boolean constraintResult = CUSTOM_CONDITION_1.conforms(parserResult);
        conditionRes = constraintResult;
      } else {
        conditionRes = false;
      }
        if (!conditionRes) {
          return false;
        }
      }
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.BreakEventBody
  public static class Value_2 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.BreakEventBody {
    public static Value_2 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_8 superTypeValue = Value_8.parse(input);
      Value_2 result = superTypeValue.asBreakEventBody();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_2(Object input, org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("breakpoints");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("breakpoints");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          if (value0 instanceof org.json.simple.JSONArray == false) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
          }
          final org.json.simple.JSONArray arrayValue3 = (org.json.simple.JSONArray) value0;
          int size4 = arrayValue3.size();
          java.util.List<java.lang.Long> list5 = new java.util.ArrayList<java.lang.Long>(size4);
          for (int index6 = 0; index6 < size4; index6++) {
            java.lang.Long arrayComponent7 = (java.lang.Long) arrayValue3.get(index6);
            list5.add(arrayComponent7);
          }
          java.util.List<java.lang.Long> parsedValue2 = java.util.Collections.unmodifiableList(list5);
          this.field_breakpoints = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field breakpoints", e);
        }
      } else {
        this.field_breakpoints = null;
      }

      Object value8 = underlying.get("exception");
      boolean hasValue9;
      if (value8 == null) {
        hasValue9 = underlying.containsKey("exception");
      } else {
        hasValue9 = true;
      }
      if (hasValue9) {
        try {
          Value_36 parsedValue10;
          if (value8 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue10 = Value_36.parse(value8);
          }
          this.field_exception = parsedValue10;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field exception", e);
        }
      } else {
        this.field_exception = null;
      }
    }
    private final java.util.List<java.lang.Long> field_breakpoints;
    private final org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle field_exception;
    private final org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody superTypeValue;
    @Override public java.lang.String invocationText()    {
      java.lang.String result;
      Object value0 = underlying.get("invocationText");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("invocationText");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.String sourceLineText()    {
      java.lang.String result;
      Object value0 = underlying.get("sourceLineText");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("sourceLineText");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.util.List<java.lang.Long> breakpoints() {
      return field_breakpoints;
    }
    @Override public java.lang.Long sourceColumn()    {
      java.lang.Long result;
      Object value0 = underlying.get("sourceColumn");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("sourceColumn");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle exception() {
      return field_exception;
    }
    @Override public java.lang.Long sourceLine()    {
      java.lang.Long result;
      Object value0 = underlying.get("sourceLine");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("sourceLine");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public org.json.simple.JSONObject script()    {
      org.json.simple.JSONObject result;
      Object value0 = underlying.get("script");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("script");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        org.json.simple.JSONObject r1 = (org.json.simple.JSONObject) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Boolean uncaught()    {
      java.lang.Boolean result;
      Object value0 = underlying.get("uncaught");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("uncaught");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Boolean r1 = (java.lang.Boolean) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody
  public static class Value_8 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.ObjectValueBase implements org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody {
    public static Value_8 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_8(input);
    }
    Value_8(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
    }
    private final java.util.concurrent.atomic.AtomicReference<Value_2  > lazyCachedField_0 = new java.util.concurrent.atomic.AtomicReference<Value_2>(null);
    private final java.util.concurrent.atomic.AtomicReference<Value_0  > lazyCachedField_1 = new java.util.concurrent.atomic.AtomicReference<Value_0>(null);
    private final java.util.concurrent.atomic.AtomicReference<Value_19  > lazyCachedField_2 = new java.util.concurrent.atomic.AtomicReference<Value_19>(null);
    @Override public Value_19 asScriptCollectedBody() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_19 result = lazyCachedField_2.get();
      if (result != null) {
        return result;
      }
      Value_19 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_19(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_2.compareAndSet(null, parseResult0);
        Value_19 cachedResult = lazyCachedField_2.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public Value_0 asAfterCompileBody() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_0 result = lazyCachedField_1.get();
      if (result != null) {
        return result;
      }
      Value_0 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_0(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_1.compareAndSet(null, parseResult0);
        Value_0 cachedResult = lazyCachedField_1.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public Value_2 asBreakEventBody() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_2 result = lazyCachedField_0.get();
      if (result != null) {
        return result;
      }
      Value_2 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_2(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_0.compareAndSet(null, parseResult0);
        Value_2 cachedResult = lazyCachedField_0.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody
  public static class Value_6 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.ObjectValueBase implements org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody {
    public static Value_6 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_6(input);
    }
    Value_6(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
    }
    private final java.util.concurrent.atomic.AtomicReference<Value_1  > lazyCachedField_0 = new java.util.concurrent.atomic.AtomicReference<Value_1>(null);
    private final java.util.concurrent.atomic.AtomicReference<Value_3  > lazyCachedField_1 = new java.util.concurrent.atomic.AtomicReference<Value_3>(null);
    private final java.util.concurrent.atomic.AtomicReference<Value_36  > lazyCachedField_2 = new java.util.concurrent.atomic.AtomicReference<Value_36>(null);
    private final java.util.concurrent.atomic.AtomicReference<Value_17  > lazyCachedField_3 = new java.util.concurrent.atomic.AtomicReference<Value_17>(null);
    private final java.util.concurrent.atomic.AtomicReference<Value_21  > lazyCachedField_4 = new java.util.concurrent.atomic.AtomicReference<Value_21>(null);
    private final java.util.concurrent.atomic.AtomicReference<Value_4  > lazyCachedField_5 = new java.util.concurrent.atomic.AtomicReference<Value_4>(null);
    private final java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle>  > lazyCachedField_6 = new java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle>>(null);
    private final java.util.concurrent.atomic.AtomicReference<org.json.simple.JSONObject  > lazyCachedField_7 = new java.util.concurrent.atomic.AtomicReference<org.json.simple.JSONObject>(null);
    private final java.util.concurrent.atomic.AtomicReference<Value_15  > lazyCachedField_8 = new java.util.concurrent.atomic.AtomicReference<Value_15>(null);
    private final java.util.concurrent.atomic.AtomicReference<Value_14  > lazyCachedField_9 = new java.util.concurrent.atomic.AtomicReference<Value_14>(null);
    private final java.util.concurrent.atomic.AtomicReference<Value_10  > lazyCachedField_10 = new java.util.concurrent.atomic.AtomicReference<Value_10>(null);
    @Override public Value_1 asBacktraceCommandBody() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_1 result = lazyCachedField_0.get();
      if (result != null) {
        return result;
      }
      Value_1 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_1(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_0.compareAndSet(null, parseResult0);
        Value_1 cachedResult = lazyCachedField_0.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public org.json.simple.JSONObject asLookupMap() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      org.json.simple.JSONObject result = lazyCachedField_7.get();
      if (result != null) {
        return result;
      }
      org.json.simple.JSONObject parseResult0 = (org.json.simple.JSONObject) underlying;
      if (parseResult0 != null) {
        lazyCachedField_7.compareAndSet(null, parseResult0);
        org.json.simple.JSONObject cachedResult = lazyCachedField_7.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public Value_15 asRestartFrameBody() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_15 result = lazyCachedField_8.get();
      if (result != null) {
        return result;
      }
      Value_15 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_15(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_8.compareAndSet(null, parseResult0);
        Value_15 cachedResult = lazyCachedField_8.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public Value_10 asFlagsBody() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_10 result = lazyCachedField_10.get();
      if (result != null) {
        return result;
      }
      Value_10 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_10(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_10.compareAndSet(null, parseResult0);
        Value_10 cachedResult = lazyCachedField_10.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public Value_21 asVersionBody() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_21 result = lazyCachedField_4.get();
      if (result != null) {
        return result;
      }
      Value_21 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_21(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_4.compareAndSet(null, parseResult0);
        Value_21 cachedResult = lazyCachedField_4.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle> asScripts() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle> result = lazyCachedField_6.get();
      if (result != null) {
        return result;
      }
      if (underlying instanceof org.json.simple.JSONArray == false) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
      }
      final org.json.simple.JSONArray arrayValue1 = (org.json.simple.JSONArray) underlying;
      int size2 = arrayValue1.size();
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle> list3 = new java.util.ArrayList<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle>(size2);
      for (int index4 = 0; index4 < size2; index4++) {
        Value_31 arrayComponent5;
        if (arrayValue1.get(index4) == null) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
        } else {
          arrayComponent5 = Value_31.parse(arrayValue1.get(index4));
        }
        list3.add(arrayComponent5);
      }
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle> parseResult0 = java.util.Collections.unmodifiableList(list3);
      if (parseResult0 != null) {
        lazyCachedField_6.compareAndSet(null, parseResult0);
        java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle> cachedResult = lazyCachedField_6.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public Value_36 asEvaluateBody() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_36 result = lazyCachedField_2.get();
      if (result != null) {
        return result;
      }
      Value_36 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = Value_36.parse(underlying);
      }
      if (parseResult0 != null) {
        lazyCachedField_2.compareAndSet(null, parseResult0);
        Value_36 cachedResult = lazyCachedField_2.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public Value_4 asChangeLiveBody() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_4 result = lazyCachedField_5.get();
      if (result != null) {
        return result;
      }
      Value_4 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_4(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_5.compareAndSet(null, parseResult0);
        Value_4 cachedResult = lazyCachedField_5.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public Value_17 asScopeBody() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_17 result = lazyCachedField_3.get();
      if (result != null) {
        return result;
      }
      Value_17 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_17(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_3.compareAndSet(null, parseResult0);
        Value_17 cachedResult = lazyCachedField_3.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public Value_3 asBreakpointBody() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_3 result = lazyCachedField_1.get();
      if (result != null) {
        return result;
      }
      Value_3 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_3(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_1.compareAndSet(null, parseResult0);
        Value_3 cachedResult = lazyCachedField_1.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public Value_14 asListBreakpointsBody() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_14 result = lazyCachedField_9.get();
      if (result != null) {
        return result;
      }
      Value_14 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_14(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_9.compareAndSet(null, parseResult0);
        Value_14 cachedResult = lazyCachedField_9.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.BacktraceCommandBody
  public static class Value_1 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.BacktraceCommandBody {
    public static Value_1 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_6 superTypeValue = Value_6.parse(input);
      Value_1 result = superTypeValue.asBacktraceCommandBody();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_1(Object input, org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("frames");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("frames");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          if (value0 instanceof org.json.simple.JSONArray == false) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
          }
          final org.json.simple.JSONArray arrayValue3 = (org.json.simple.JSONArray) value0;
          int size4 = arrayValue3.size();
          java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FrameObject> list5 = new java.util.ArrayList<org.chromium.sdk.internal.v8native.protocol.input.FrameObject>(size4);
          for (int index6 = 0; index6 < size4; index6++) {
            Value_12 arrayComponent7;
            if (arrayValue3.get(index6) == null) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
            } else {
              arrayComponent7 = Value_12.parse(arrayValue3.get(index6));
            }
            list5.add(arrayComponent7);
          }
          java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FrameObject> parsedValue2 = java.util.Collections.unmodifiableList(list5);
          this.field_frames = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field frames", e);
        }
      } else {
        this.field_frames = null;
      }
    }
    private final java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FrameObject> field_frames;
    private final org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superTypeValue;
    @Override public java.lang.Long fromFrame()    {
      java.lang.Long result;
      Object value0 = underlying.get("fromFrame");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("fromFrame");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Long toFrame()    {
      java.lang.Long result;
      Object value0 = underlying.get("toFrame");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("toFrame");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FrameObject> frames() {
      return field_frames;
    }
    @Override public java.lang.Long totalFrames()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("totalFrames");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("totalFrames");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: totalFrames");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.FrameObject
  public static class Value_12 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.FrameObject {
    public static Value_12 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_12(input);
    }
    Value_12(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);

      Object value0 = underlying.get("script");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("script");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_34 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_34.parse(value0);
          }
          this.field_script = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field script", e);
        }
      } else {
        this.field_script = null;
      }
    }
    private final java.util.concurrent.atomic.AtomicReference<org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef  > lazyCachedField_0 = new java.util.concurrent.atomic.AtomicReference<org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef>(null);
    private final java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject>  > lazyCachedField_1 = new java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject>>(null);
    private final java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef>  > lazyCachedField_2 = new java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef>>(null);
    private final java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject>  > lazyCachedField_3 = new java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject>>(null);
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef field_script;
    @Override public java.lang.Boolean debuggerFrame()    {
      java.lang.Boolean result;
      try {
        Object value0 = underlying.get("debuggerFrame");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("debuggerFrame");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Boolean r1 = (java.lang.Boolean) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: debuggerFrame");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.Long column()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("column");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("column");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: column");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.json.simple.JSONObject func()    {
      org.json.simple.JSONObject result;
      try {
        Object value0 = underlying.get("func");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("func");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          org.json.simple.JSONObject r1 = (org.json.simple.JSONObject) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: func");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.String sourceLineText()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("sourceLineText");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("sourceLineText");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: sourceLineText");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> locals() {
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> result = lazyCachedField_1.get();
      if (result != null) {
        return result;
      }
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> parseResult0;
      try {
        Object value1 = underlying.get("locals");
        boolean hasValue2;
        if (value1 == null) {
          hasValue2 = underlying.containsKey("locals");
        } else {
          hasValue2 = true;
        }
        if (hasValue2) {
          try {
            if (value1 instanceof org.json.simple.JSONArray == false) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
            }
            final org.json.simple.JSONArray arrayValue3 = (org.json.simple.JSONArray) value1;
            final int size4 = arrayValue3.size();
            java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> r1 = new java.util.AbstractList<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject>() {
              private final java.util.concurrent.atomic.AtomicReferenceArray<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> cachedValues = new java.util.concurrent.atomic.AtomicReferenceArray<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject>(size4);

              @Override public int size() { return size4; }

              @Override public org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject get(int index) {
                org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject result0 = cachedValues.get(index);
                if (result0 == null) {
                  try {
                    Object unparsed = arrayValue3.get(index);
                    Value_27 parsed;
                    if (unparsed == null) {
                      throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
                    } else {
                      parsed = Value_27.parse(unparsed);
                    }
                    result0 = parsed;
                  } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
                    throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException(e);
                  }
                  cachedValues.compareAndSet(index, null, result0);
                  result0 = cachedValues.get(index);
                }
                return result0;
              }
            };
            parseResult0 = r1;
          } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field locals in type org.chromium.sdk.internal.v8native.protocol.input.FrameObject", e);
          }
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: locals");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      if (parseResult0 != null) {
        lazyCachedField_1.compareAndSet(null, parseResult0);
        java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> cachedResult = lazyCachedField_1.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> scopes() {
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> result = lazyCachedField_2.get();
      if (result != null) {
        return result;
      }
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> parseResult0;
      try {
        Object value1 = underlying.get("scopes");
        boolean hasValue2;
        if (value1 == null) {
          hasValue2 = underlying.containsKey("scopes");
        } else {
          hasValue2 = true;
        }
        if (hasValue2) {
          try {
            if (value1 instanceof org.json.simple.JSONArray == false) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
            }
            final org.json.simple.JSONArray arrayValue3 = (org.json.simple.JSONArray) value1;
            final int size4 = arrayValue3.size();
            java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> r1 = new java.util.AbstractList<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef>() {
              private final java.util.concurrent.atomic.AtomicReferenceArray<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> cachedValues = new java.util.concurrent.atomic.AtomicReferenceArray<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef>(size4);

              @Override public int size() { return size4; }

              @Override public org.chromium.sdk.internal.v8native.protocol.input.ScopeRef get(int index) {
                org.chromium.sdk.internal.v8native.protocol.input.ScopeRef result0 = cachedValues.get(index);
                if (result0 == null) {
                  try {
                    Object unparsed = arrayValue3.get(index);
                    Value_18 parsed;
                    if (unparsed == null) {
                      throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
                    } else {
                      parsed = Value_18.parse(unparsed);
                    }
                    result0 = parsed;
                  } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
                    throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException(e);
                  }
                  cachedValues.compareAndSet(index, null, result0);
                  result0 = cachedValues.get(index);
                }
                return result0;
              }
            };
            parseResult0 = r1;
          } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field scopes in type org.chromium.sdk.internal.v8native.protocol.input.FrameObject", e);
          }
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: scopes");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      if (parseResult0 != null) {
        lazyCachedField_2.compareAndSet(null, parseResult0);
        java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> cachedResult = lazyCachedField_2.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> arguments() {
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> result = lazyCachedField_3.get();
      if (result != null) {
        return result;
      }
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> parseResult0;
      try {
        Object value1 = underlying.get("arguments");
        boolean hasValue2;
        if (value1 == null) {
          hasValue2 = underlying.containsKey("arguments");
        } else {
          hasValue2 = true;
        }
        if (hasValue2) {
          try {
            if (value1 instanceof org.json.simple.JSONArray == false) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
            }
            final org.json.simple.JSONArray arrayValue3 = (org.json.simple.JSONArray) value1;
            final int size4 = arrayValue3.size();
            java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> r1 = new java.util.AbstractList<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject>() {
              private final java.util.concurrent.atomic.AtomicReferenceArray<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> cachedValues = new java.util.concurrent.atomic.AtomicReferenceArray<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject>(size4);

              @Override public int size() { return size4; }

              @Override public org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject get(int index) {
                org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject result0 = cachedValues.get(index);
                if (result0 == null) {
                  try {
                    Object unparsed = arrayValue3.get(index);
                    Value_27 parsed;
                    if (unparsed == null) {
                      throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
                    } else {
                      parsed = Value_27.parse(unparsed);
                    }
                    result0 = parsed;
                  } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
                    throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException(e);
                  }
                  cachedValues.compareAndSet(index, null, result0);
                  result0 = cachedValues.get(index);
                }
                return result0;
              }
            };
            parseResult0 = r1;
          } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field arguments in type org.chromium.sdk.internal.v8native.protocol.input.FrameObject", e);
          }
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: arguments");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      if (parseResult0 != null) {
        lazyCachedField_3.compareAndSet(null, parseResult0);
        java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> cachedResult = lazyCachedField_3.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public java.lang.String type()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("type");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("type");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: type");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef script() {
      return field_script;
    }
    @Override public long line()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("line");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("line");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: line");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef receiver() {
      org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef result = lazyCachedField_0.get();
      if (result != null) {
        return result;
      }
      org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef parseResult0;
      try {
        Object value1 = underlying.get("receiver");
        boolean hasValue2;
        if (value1 == null) {
          hasValue2 = underlying.containsKey("receiver");
        } else {
          hasValue2 = true;
        }
        if (hasValue2) {
          try {
            Value_34 r1;
            if (value1 == null) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
            } else {
              r1 = Value_34.parse(value1);
            }
            parseResult0 = r1;
          } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field receiver in type org.chromium.sdk.internal.v8native.protocol.input.FrameObject", e);
          }
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: receiver");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      if (parseResult0 != null) {
        lazyCachedField_0.compareAndSet(null, parseResult0);
        org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef cachedResult = lazyCachedField_0.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public java.lang.Long position()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("position");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("position");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: position");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.Boolean constructCall()    {
      java.lang.Boolean result;
      try {
        Object value0 = underlying.get("constructCall");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("constructCall");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Boolean r1 = (java.lang.Boolean) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: constructCall");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public long index()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("index");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("index");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: index");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.String text()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("text");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("text");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: text");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.BreakpointBody
  public static class Value_3 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.BreakpointBody {
    public static Value_3 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_6 superTypeValue = Value_6.parse(input);
      Value_3 result = superTypeValue.asBreakpointBody();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_3(Object input, org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superTypeValue;
    @Override public java.lang.String type()    {
      java.lang.String result;
      Object value0 = underlying.get("type");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("type");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Long line()    {
      java.lang.Long result;
      Object value0 = underlying.get("line");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("line");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.String script_name()    {
      java.lang.String result;
      Object value0 = underlying.get("script_name");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("script_name");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Object column()    {
      java.lang.Object result;
      Object value0 = underlying.get("column");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("column");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Object r1 = (java.lang.Object) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public long breakpoint()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("breakpoint");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("breakpoint");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: breakpoint");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.ScopeBody
  public static class Value_17 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.ScopeBody {
    public static Value_17 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_6 superTypeValue = Value_6.parse(input);
      Value_17 result = superTypeValue.asScopeBody();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_17(Object input, org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("object");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("object");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_26 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_26.parse(value0);
          }
          this.field_object = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field object", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: object");
      }
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle field_object;
    private final org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superTypeValue;
    @Override public long frameIndex()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("frameIndex");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("frameIndex");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: frameIndex");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle object() {
      return field_object;
    }
    @Override public long type()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("type");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("type");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: type");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.String text()    {
      java.lang.String result;
      Object value0 = underlying.get("text");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("text");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public long index()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("index");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("index");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: index");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.ScopeRef
  public static class Value_18 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.ScopeRef {
    public static Value_18 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_18(input);
    }
    Value_18(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
    }
    @Override public long type()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("type");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("type");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: type");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public long index()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("index");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("index");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: index");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.VersionBody
  public static class Value_21 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.VersionBody {
    public static Value_21 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_6 superTypeValue = Value_6.parse(input);
      Value_21 result = superTypeValue.asVersionBody();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_21(Object input, org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superTypeValue;
    @Override public java.lang.String getV8Version()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("V8Version");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("V8Version");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: V8Version");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.AfterCompileBody
  public static class Value_0 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.AfterCompileBody {
    public static Value_0 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_8 superTypeValue = Value_8.parse(input);
      Value_0 result = superTypeValue.asAfterCompileBody();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_0(Object input, org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("script");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("script");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_31 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_31.parse(value0);
          }
          this.field_script = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field script", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: script");
      }
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle field_script;
    private final org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody superTypeValue;
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle script() {
      return field_script;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.ChangeLiveBody
  public static class Value_4 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.ChangeLiveBody {
    public static Value_4 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_6 superTypeValue = Value_6.parse(input);
      Value_4 result = superTypeValue.asChangeLiveBody();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_4(Object input, org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("result");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("result");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          org.chromium.sdk.internal.liveeditprotocol.GeneratedLiveEditProtocolParser.Value_0 parsedValue2;
          if (value0 == null) {
            parsedValue2 = null;
          } else {
            parsedValue2 = org.chromium.sdk.internal.liveeditprotocol.GeneratedLiveEditProtocolParser.Value_0.parse(value0);
          }
          this.field_result = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field result", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: result");
      }
    }
    private final org.chromium.sdk.internal.liveeditprotocol.LiveEditResult field_result;
    private final org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superTypeValue;
    @Override public java.lang.Boolean stepin_recommended()    {
      java.lang.Boolean result;
      Object value0 = underlying.get("stepin_recommended");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("stepin_recommended");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Boolean r1 = (java.lang.Boolean) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Object getChangeLog()    {
      java.lang.Object result;
      try {
        Object value0 = underlying.get("change_log");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("change_log");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Object r1 = (java.lang.Object) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: change_log");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.liveeditprotocol.LiveEditResult getResultDescription() {
      return field_result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody
  public static class Value_15 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody {
    public static Value_15 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_6 superTypeValue = Value_6.parse(input);
      Value_15 result = superTypeValue.asRestartFrameBody();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_15(Object input, org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("result");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("result");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_16 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_16.parse(value0);
          }
          this.field_result = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field result", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: result");
      }
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody.ResultDescription field_result;
    private final org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superTypeValue;
    @Override public org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody.ResultDescription getResultDescription() {
      return field_result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody$ResultDescription
  public static class Value_16 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody.ResultDescription {
    public static Value_16 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_16(input);
    }
    Value_16(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
    }
    @Override public java.lang.Boolean stack_update_needs_step_in()    {
      java.lang.Boolean result;
      Object value0 = underlying.get("stack_update_needs_step_in");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("stack_update_needs_step_in");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Boolean r1 = (java.lang.Boolean) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.ListBreakpointsBody
  public static class Value_14 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.ListBreakpointsBody {
    public static Value_14 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_6 superTypeValue = Value_6.parse(input);
      Value_14 result = superTypeValue.asListBreakpointsBody();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_14(Object input, org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("breakpoints");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("breakpoints");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          if (value0 instanceof org.json.simple.JSONArray == false) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
          }
          final org.json.simple.JSONArray arrayValue3 = (org.json.simple.JSONArray) value0;
          int size4 = arrayValue3.size();
          java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo> list5 = new java.util.ArrayList<org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo>(size4);
          for (int index6 = 0; index6 < size4; index6++) {
            Value_22 arrayComponent7;
            if (arrayValue3.get(index6) == null) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
            } else {
              arrayComponent7 = Value_22.parse(arrayValue3.get(index6));
            }
            list5.add(arrayComponent7);
          }
          java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo> parsedValue2 = java.util.Collections.unmodifiableList(list5);
          this.field_breakpoints = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field breakpoints", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: breakpoints");
      }
    }
    private final java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo> field_breakpoints;
    private final org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superTypeValue;
    @Override public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo> breakpoints() {
      return field_breakpoints;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.ScriptCollectedBody
  public static class Value_19 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.ScriptCollectedBody {
    public static Value_19 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_8 superTypeValue = Value_8.parse(input);
      Value_19 result = superTypeValue.asScriptCollectedBody();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_19(Object input, org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("script");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("script");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_32 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_32.parse(value0);
          }
          this.field_script = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field script", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: script");
      }
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.data.ScriptWithId field_script;
    private final org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody superTypeValue;
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.ScriptWithId script() {
      return field_script;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.FlagsBody
  public static class Value_10 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.FlagsBody {
    public static Value_10 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_6 superTypeValue = Value_6.parse(input);
      Value_10 result = superTypeValue.asFlagsBody();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_10(Object input, org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("flags");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("flags");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          if (value0 instanceof org.json.simple.JSONArray == false) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
          }
          final org.json.simple.JSONArray arrayValue3 = (org.json.simple.JSONArray) value0;
          int size4 = arrayValue3.size();
          java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo> list5 = new java.util.ArrayList<org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo>(size4);
          for (int index6 = 0; index6 < size4; index6++) {
            Value_11 arrayComponent7;
            if (arrayValue3.get(index6) == null) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
            } else {
              arrayComponent7 = Value_11.parse(arrayValue3.get(index6));
            }
            list5.add(arrayComponent7);
          }
          java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo> parsedValue2 = java.util.Collections.unmodifiableList(list5);
          this.field_flags = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field flags", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: flags");
      }
    }
    private final java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo> field_flags;
    private final org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody superTypeValue;
    @Override public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo> flags() {
      return field_flags;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.FlagsBody$FlagInfo
  public static class Value_11 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo {
    public static Value_11 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_11(input);
    }
    Value_11(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
    }
    @Override public java.lang.Object value()    {
      java.lang.Object result;
      try {
        Object value0 = underlying.get("value");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("value");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Object r1 = (java.lang.Object) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: value");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.String name()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("name");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("name");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: name");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle
  public static class Value_33 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle {
    public static Value_33 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_35 superTypeValue = Value_35.parse(input);
      Value_33 result = superTypeValue.auto_alg_field_1;
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_33(Object input, org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;
    }
    private final java.util.concurrent.atomic.AtomicReference<Value_31  > lazyCachedField_0 = new java.util.concurrent.atomic.AtomicReference<Value_31>(null);
    private final java.util.concurrent.atomic.AtomicReference<Value_36  > lazyCachedField_1 = new java.util.concurrent.atomic.AtomicReference<Value_36>(null);
    private final java.util.concurrent.atomic.AtomicReference<Value_24  > lazyCachedField_2 = new java.util.concurrent.atomic.AtomicReference<Value_24>(null);
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized superTypeValue;
    @Override public java.lang.String type()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("type");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("type");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: type");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public Value_31 asScriptHandle() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_31 result = lazyCachedField_0.get();
      if (result != null) {
        return result;
      }
      Value_31 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_31(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_0.compareAndSet(null, parseResult0);
        Value_31 cachedResult = lazyCachedField_0.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public Value_36 asValueHandle() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_36 result = lazyCachedField_1.get();
      if (result != null) {
        return result;
      }
      Value_36 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_36(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_1.compareAndSet(null, parseResult0);
        Value_36 cachedResult = lazyCachedField_1.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public Value_24 asContextHandle() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_24 result = lazyCachedField_2.get();
      if (result != null) {
        return result;
      }
      Value_24 parseResult0;
      if (underlying == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
      } else {
        parseResult0 = new Value_24(underlying, this);
      }
      if (parseResult0 != null) {
        lazyCachedField_2.compareAndSet(null, parseResult0);
        Value_24 cachedResult = lazyCachedField_2.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public long handle()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("handle");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("handle");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: handle");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      {
        Object value = input.get("handle");
        boolean hasValue;
        if (value == null) {
          hasValue = input.containsKey("handle");
        } else {
          hasValue = true;
        }
      boolean conditionRes = hasValue;
        if (!conditionRes) {
          return false;
        }
      }
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle
  public static class Value_31 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle {
    public static Value_31 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_33 superTypeValue = Value_33.parse(input);
      Value_31 result = superTypeValue.asScriptHandle();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_31(Object input, org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("context");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("context");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_34 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_34.parse(value0);
          }
          this.field_context = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field context", e);
        }
      } else {
        this.field_context = null;
      }

      Object value3 = underlying.get("evalFromScript");
      boolean hasValue4;
      if (value3 == null) {
        hasValue4 = underlying.containsKey("evalFromScript");
      } else {
        hasValue4 = true;
      }
      if (hasValue4) {
        try {
          Value_35 parsedValue5;
          if (value3 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue5 = Value_35.parse(value3);
          }
          this.field_evalFromScript = parsedValue5;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field evalFromScript", e);
        }
      } else {
        this.field_evalFromScript = null;
      }
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef field_context;
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized field_evalFromScript;
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle superTypeValue;
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef context() {
      return field_context;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized evalFromScript() {
      return field_evalFromScript;
    }
    @Override public long lineCount()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("lineCount");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("lineCount");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: lineCount");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public long compilationType()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("compilationType");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("compilationType");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: compilationType");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.String source()    {
      java.lang.String result;
      Object value0 = underlying.get("source");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("source");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.String name()    {
      java.lang.String result;
      Object value0 = underlying.get("name");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("name");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public long sourceLength()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("sourceLength");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("sourceLength");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: sourceLength");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public long id()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("id");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("id");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: id");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.json.simple.JSONObject evalFromLocation()    {
      org.json.simple.JSONObject result;
      Object value0 = underlying.get("evalFromLocation");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("evalFromLocation");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        org.json.simple.JSONObject r1 = (org.json.simple.JSONObject) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public long columnOffset()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("columnOffset");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("columnOffset");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: columnOffset");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.Object data()    {
      java.lang.Object result;
      Object value0 = underlying.get("data");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("data");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Object r1 = (java.lang.Object) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.String sourceStart()    {
      java.lang.String result;
      Object value0 = underlying.get("sourceStart");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("sourceStart");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public long scriptType()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("scriptType");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("scriptType");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: scriptType");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public long lineOffset()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("lineOffset");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("lineOffset");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: lineOffset");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.String text()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("text");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("text");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: text");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle
  public static class Value_36 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle {
    public static Value_36 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_33 superTypeValue = Value_33.parse(input);
      Value_36 result = superTypeValue.asValueHandle();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_36(Object input, org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;
      int code = -1;
      if (Value_26.checkSubtypeConditions(underlying)) {
        if (code == -1) {
          code = 0;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("More than one case match");
        }
      }
      auto_alg_field_0 = (code == 0) ? new Value_26(underlying, this) : null;
    }
    private final Value_26 auto_alg_field_0;
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle superTypeValue;
    @Override public java.lang.String className()    {
      java.lang.String result;
      Object value0 = underlying.get("className");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("className");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Object value()    {
      java.lang.Object result;
      Object value0 = underlying.get("value");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("value");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Object r1 = (java.lang.Object) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Long length()    {
      java.lang.Long result;
      Object value0 = underlying.get("length");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("length");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle asObject() {
      return auto_alg_field_0;
    }
    @Override public java.lang.Long fromIndex()    {
      java.lang.Long result;
      Object value0 = underlying.get("fromIndex");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("fromIndex");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.String type()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("type");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("type");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: type");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.Long toIndex()    {
      java.lang.Long result;
      Object value0 = underlying.get("toIndex");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("toIndex");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public void asNotObject() {
    }
    @Override public long handle()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("handle");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("handle");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: handle");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.String text()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("text");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("text");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: text");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.RefWithDisplayData
  public static class Value_30 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.RefWithDisplayData {
    public static Value_30 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_34 superTypeValue = Value_34.parse(input);
      Value_30 result = superTypeValue.auto_alg_field_0;
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_30(Object input, org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef superTypeValue;
    @Override public java.lang.String type()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("type");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("type");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: type");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.Object value()    {
      java.lang.Object result;
      Object value0 = underlying.get("value");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("value");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Object r1 = (java.lang.Object) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Long scriptId()    {
      java.lang.Long result;
      Object value0 = underlying.get("scriptId");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("scriptId");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.String className()    {
      java.lang.String result;
      Object value0 = underlying.get("className");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("className");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.String inferredName()    {
      java.lang.String result;
      Object value0 = underlying.get("inferredName");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("inferredName");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public long ref()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("ref");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("ref");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: ref");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      {
        Object value = input.get("type");
        boolean hasValue;
        if (value == null) {
          hasValue = input.containsKey("type");
        } else {
          hasValue = true;
        }
      boolean conditionRes = hasValue;
        if (!conditionRes) {
          return false;
        }
      }
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject
  public static class Value_27 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject {
    public static Value_27 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_27(input);
    }
    Value_27(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      int code = -1;
      if (Value_28.checkSubtypeConditions(underlying)) {
        if (code == -1) {
          code = 0;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("More than one case match");
        }
      }
      if (Value_29.checkSubtypeConditions(underlying)) {
        if (code == -1) {
          code = 1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("More than one case match");
        }
      }
      if (code == -1) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Not a singe case matches");
      }
      auto_alg_field_0 = (code == 0) ? new Value_28(underlying, this) : null;
      auto_alg_field_1 = (code == 1) ? new Value_29(underlying, this) : null;
    }
    private final Value_28 auto_alg_field_0;
    private final Value_29 auto_alg_field_1;
    @Override public java.lang.Object name()    {
      java.lang.Object result;
      try {
        Object value0 = underlying.get("name");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("name");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Object r1 = (java.lang.Object) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: name");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.PropertyWithValue asPropertyWithValue() {
      return auto_alg_field_1;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.PropertyWithRef asPropertyWithRef() {
      return auto_alg_field_0;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.PropertyWithRef
  public static class Value_28 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.PropertyWithRef {
    public static Value_28 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_27 superTypeValue = Value_27.parse(input);
      Value_28 result = superTypeValue.auto_alg_field_0;
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_28(Object input, org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject superTypeValue;
    @Override public java.lang.Object attributes()    {
      java.lang.Object result;
      Object value0 = underlying.get("attributes");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("attributes");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Object r1 = (java.lang.Object) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Void value()    {
      Void result;
      Object value0 = underlying.get("value");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("value");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        Void r1 = null;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Long propertyType()    {
      java.lang.Long result;
      Object value0 = underlying.get("propertyType");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("propertyType");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public long ref()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("ref");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("ref");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: ref");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      {
        Object value = input.get("value");
        boolean hasValue;
        if (value == null) {
          hasValue = input.containsKey("value");
        } else {
          hasValue = true;
        }
      boolean conditionRes = !hasValue;
        if (!conditionRes) {
          return false;
        }
      }
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.PropertyWithValue
  public static class Value_29 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.PropertyWithValue {
    public static Value_29 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_27 superTypeValue = Value_27.parse(input);
      Value_29 result = superTypeValue.auto_alg_field_1;
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_29(Object input, org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("value");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("value");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_34 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_34.parse(value0);
          }
          this.field_value = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field value", e);
        }
      } else {
        this.field_value = null;
      }
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef field_value;
    private final org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject superTypeValue;
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef value() {
      return field_value;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      {
        Object value = input.get("value");
        boolean hasValue;
        if (value == null) {
          hasValue = input.containsKey("value");
        } else {
          hasValue = true;
        }
      boolean conditionRes = hasValue;
        if (!conditionRes) {
          return false;
        }
      }
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle
  public static class Value_26 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle {
    public static Value_26 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_36 superTypeValue = Value_36.parse(input);
      Value_26 result = superTypeValue.auto_alg_field_0;
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_26(Object input, org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;

      Object value0 = underlying.get("primitiveValue");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("primitiveValue");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_34 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_34.parse(value0);
          }
          this.field_primitiveValue = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field primitiveValue", e);
        }
      } else {
        this.field_primitiveValue = null;
      }

      Object value3 = underlying.get("prototypeObject");
      boolean hasValue4;
      if (value3 == null) {
        hasValue4 = underlying.containsKey("prototypeObject");
      } else {
        hasValue4 = true;
      }
      if (hasValue4) {
        try {
          Value_34 parsedValue5;
          if (value3 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue5 = Value_34.parse(value3);
          }
          this.field_prototypeObject = parsedValue5;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field prototypeObject", e);
        }
      } else {
        this.field_prototypeObject = null;
      }

      Object value6 = underlying.get("protoObject");
      boolean hasValue7;
      if (value6 == null) {
        hasValue7 = underlying.containsKey("protoObject");
      } else {
        hasValue7 = true;
      }
      if (hasValue7) {
        try {
          Value_34 parsedValue8;
          if (value6 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue8 = Value_34.parse(value6);
          }
          this.field_protoObject = parsedValue8;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field protoObject", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: protoObject");
      }

      Object value9 = underlying.get("constructorFunction");
      boolean hasValue10;
      if (value9 == null) {
        hasValue10 = underlying.containsKey("constructorFunction");
      } else {
        hasValue10 = true;
      }
      if (hasValue10) {
        try {
          Value_34 parsedValue11;
          if (value9 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue11 = Value_34.parse(value9);
          }
          this.field_constructorFunction = parsedValue11;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field constructorFunction", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: constructorFunction");
      }

      Object value12 = underlying.get("properties");
      boolean hasValue13;
      if (value12 == null) {
        hasValue13 = underlying.containsKey("properties");
      } else {
        hasValue13 = true;
      }
      if (hasValue13) {
        try {
          if (value12 instanceof org.json.simple.JSONArray == false) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
          }
          final org.json.simple.JSONArray arrayValue15 = (org.json.simple.JSONArray) value12;
          int size16 = arrayValue15.size();
          java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> list17 = new java.util.ArrayList<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject>(size16);
          for (int index18 = 0; index18 < size16; index18++) {
            Value_27 arrayComponent19;
            if (arrayValue15.get(index18) == null) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
            } else {
              arrayComponent19 = Value_27.parse(arrayValue15.get(index18));
            }
            list17.add(arrayComponent19);
          }
          java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> parsedValue14 = java.util.Collections.unmodifiableList(list17);
          this.field_properties = parsedValue14;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field properties", e);
        }
      } else {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: properties");
      }
      int code = -1;
      if (Value_25.checkSubtypeConditions(underlying)) {
        if (code == -1) {
          code = 0;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("More than one case match");
        }
      }
      auto_alg_field_0 = (code == 0) ? new Value_25(underlying, this) : null;
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef field_primitiveValue;
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef field_prototypeObject;
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef field_protoObject;
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef field_constructorFunction;
    private final java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> field_properties;
    private final Value_25 auto_alg_field_0;
    private final org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle superTypeValue;
    @Override public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> properties() {
      return field_properties;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef primitiveValue() {
      return field_primitiveValue;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.FunctionValueHandle asFunction() {
      return auto_alg_field_0;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef prototypeObject() {
      return field_prototypeObject;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef protoObject() {
      return field_protoObject;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef constructorFunction() {
      return field_constructorFunction;
    }
    @Override public void notFunction() {
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      {
        Object value = input.get("properties");
        boolean hasValue;
        if (value == null) {
          hasValue = input.containsKey("properties");
        } else {
          hasValue = true;
        }
      boolean conditionRes = hasValue;
        if (!conditionRes) {
          return false;
        }
      }
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.FunctionValueHandle
  public static class Value_25 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.FunctionValueHandle {
    public static Value_25 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_26 superTypeValue = Value_26.parse(input);
      Value_25 result = superTypeValue.auto_alg_field_0;
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_25(Object input, org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;
    }
    private final java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef>  > lazyCachedField_0 = new java.util.concurrent.atomic.AtomicReference<java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef>>(null);
    private final org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle superTypeValue;
    @Override public java.lang.Long scriptId()    {
      java.lang.Long result;
      Object value0 = underlying.get("scriptId");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("scriptId");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Long column()    {
      java.lang.Long result;
      Object value0 = underlying.get("column");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("column");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.String name()    {
      java.lang.String result;
      Object value0 = underlying.get("name");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("name");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.String inferredName()    {
      java.lang.String result;
      Object value0 = underlying.get("inferredName");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("inferredName");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public boolean resolved()    {
      java.lang.Boolean result;
      try {
        Object value0 = underlying.get("resolved");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("resolved");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Boolean r1 = (java.lang.Boolean) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: resolved");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.String source()    {
      java.lang.String result;
      Object value0 = underlying.get("source");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("source");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> scopes() {
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> result = lazyCachedField_0.get();
      if (result != null) {
        return result;
      }
      java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> parseResult0;
      try {
        Object value1 = underlying.get("scopes");
        boolean hasValue2;
        if (value1 == null) {
          hasValue2 = underlying.containsKey("scopes");
        } else {
          hasValue2 = true;
        }
        if (hasValue2) {
          try {
            if (value1 instanceof org.json.simple.JSONArray == false) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
            }
            final org.json.simple.JSONArray arrayValue3 = (org.json.simple.JSONArray) value1;
            final int size4 = arrayValue3.size();
            java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> r1 = new java.util.AbstractList<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef>() {
              private final java.util.concurrent.atomic.AtomicReferenceArray<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> cachedValues = new java.util.concurrent.atomic.AtomicReferenceArray<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef>(size4);

              @Override public int size() { return size4; }

              @Override public org.chromium.sdk.internal.v8native.protocol.input.ScopeRef get(int index) {
                org.chromium.sdk.internal.v8native.protocol.input.ScopeRef result0 = cachedValues.get(index);
                if (result0 == null) {
                  try {
                    Object unparsed = arrayValue3.get(index);
                    Value_18 parsed;
                    if (unparsed == null) {
                      throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
                    } else {
                      parsed = Value_18.parse(unparsed);
                    }
                    result0 = parsed;
                  } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
                    throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException(e);
                  }
                  cachedValues.compareAndSet(index, null, result0);
                  result0 = cachedValues.get(index);
                }
                return result0;
              }
            };
            parseResult0 = r1;
          } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field scopes in type org.chromium.sdk.internal.v8native.protocol.input.data.FunctionValueHandle", e);
          }
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: scopes");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      if (parseResult0 != null) {
        lazyCachedField_0.compareAndSet(null, parseResult0);
        java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> cachedResult = lazyCachedField_0.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public org.json.simple.JSONObject script()    {
      org.json.simple.JSONObject result;
      Object value0 = underlying.get("script");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("script");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        org.json.simple.JSONObject r1 = (org.json.simple.JSONObject) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Long line()    {
      java.lang.Long result;
      Object value0 = underlying.get("line");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("line");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.Long position()    {
      java.lang.Long result;
      Object value0 = underlying.get("position");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("position");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      {
        Object value = input.get("resolved");
        boolean hasValue;
        if (value == null) {
          hasValue = input.containsKey("resolved");
        } else {
          hasValue = true;
        }
      boolean conditionRes = hasValue;
        if (!conditionRes) {
          return false;
        }
      }
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef
  public static class Value_34 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef {
    public static Value_34 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_35 superTypeValue = Value_35.parse(input);
      Value_34 result = superTypeValue.auto_alg_field_0;
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_34(Object input, org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;
      int code = -1;
      if (Value_30.checkSubtypeConditions(underlying)) {
        if (code == -1) {
          code = 0;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("More than one case match");
        }
      }
      auto_alg_field_0 = (code == 0) ? new Value_30(underlying, this) : null;
    }
    private final Value_30 auto_alg_field_0;
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized superTypeValue;
    @Override public long ref()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("ref");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("ref");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: ref");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.RefWithDisplayData asWithDisplayData() {
      return auto_alg_field_0;
    }
    @Override public void asJustSomeRef() {
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      {
        Object value = input.get("ref");
        boolean hasValue;
        if (value == null) {
          hasValue = input.containsKey("ref");
        } else {
          hasValue = true;
        }
      boolean conditionRes = hasValue;
        if (!conditionRes) {
          return false;
        }
      }
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized
  public static class Value_35 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized {
    public static Value_35 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_35(input);
    }
    Value_35(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      int code = -1;
      if (Value_34.checkSubtypeConditions(underlying)) {
        if (code == -1) {
          code = 0;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("More than one case match");
        }
      }
      if (Value_33.checkSubtypeConditions(underlying)) {
        if (code == -1) {
          code = 1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("More than one case match");
        }
      }
      if (code == -1) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Not a singe case matches");
      }
      auto_alg_field_0 = (code == 0) ? new Value_34(underlying, this) : null;
      auto_alg_field_1 = (code == 1) ? new Value_33(underlying, this) : null;
    }
    private final Value_34 auto_alg_field_0;
    private final Value_33 auto_alg_field_1;
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef asSomeRef() {
      return auto_alg_field_0;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle asSmthWithHandle() {
      return auto_alg_field_1;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.ContextHandle
  public static class Value_24 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.ContextHandle {
    public static Value_24 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      Value_33 superTypeValue = Value_33.parse(input);
      Value_24 result = superTypeValue.asContextHandle();
      if (result == null) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return result;
    }
    Value_24(Object input, org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle superValueParam) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
      this.superTypeValue = superValueParam;
    }
    private final org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle superTypeValue;
    @Override public java.lang.Object data()    {
      java.lang.Object result;
      Object value0 = underlying.get("data");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("data");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Object r1 = (java.lang.Object) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle getSuper() {
      return superTypeValue;
    }
    public static boolean checkSubtypeConditions(org.json.simple.JSONObject input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return true;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.ContextData
  public static class Value_23 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.ContextData {
    public static Value_23 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_23(input);
    }
    Value_23(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
    }
    @Override public java.lang.String type()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("type");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("type");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: type");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public long value()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("value");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("value");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: value");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo
  public static class Value_22 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo {
    public static Value_22 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_22(input);
    }
    Value_22(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
    }
    @Override public java.lang.String condition()    {
      java.lang.String result;
      try {
        Object value0 = underlying.get("condition");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("condition");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.String r1 = (java.lang.String) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: condition");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public long number()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("number");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("number");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: number");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.Long script_id()    {
      java.lang.Long result;
      Object value0 = underlying.get("script_id");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("script_id");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.Long r1 = (java.lang.Long) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public java.lang.String script_name()    {
      java.lang.String result;
      Object value0 = underlying.get("script_name");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("script_name");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
    @Override public long ignoreCount()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("ignoreCount");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("ignoreCount");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: ignoreCount");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public long line()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("line");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("line");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: line");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo.Type type()    {
      org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo.Type result;
      try {
        Object value0 = underlying.get("type");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("type");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          try {
            if (value0 instanceof String == false) {
              throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("String value expected");
            }
            String stringValue = (String) value0;
            stringValue = stringValue.toUpperCase();
            org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo.Type r1 = org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo.Type.valueOf(stringValue);
            result = r1;
          } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field type in type org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo", e);
          }
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: type");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public long hit_count()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("hit_count");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("hit_count");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: hit_count");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.Long groupId()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("groupId");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("groupId");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: groupId");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.Long column()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("column");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("column");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: column");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public boolean active()    {
      java.lang.Boolean result;
      try {
        Object value0 = underlying.get("active");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("active");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Boolean r1 = (java.lang.Boolean) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: active");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public java.lang.String script_regexp()    {
      java.lang.String result;
      Object value0 = underlying.get("script_regexp");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("script_regexp");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        java.lang.String r1 = (java.lang.String) value0;
        result = r1;
      } else {
        result = null;
      }
      return result;
    }
  }

  // Type org.chromium.sdk.internal.v8native.protocol.input.data.ScriptWithId
  public static class Value_32 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.v8native.protocol.input.data.ScriptWithId {
    public static Value_32 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_32(input);
    }
    Value_32(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
    }
    @Override public long id()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("id");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("id");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: id");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
  }

  private static final org.chromium.sdk.internal.v8native.protocol.input.EventNotification.TypeValueCondition CUSTOM_CONDITION_0 = new org.chromium.sdk.internal.v8native.protocol.input.EventNotification.TypeValueCondition();
  private static final org.chromium.sdk.internal.v8native.protocol.input.CommandResponse.TypeValueCondition CUSTOM_CONDITION_1 = new org.chromium.sdk.internal.v8native.protocol.input.CommandResponse.TypeValueCondition();
}
