// This is a generated source.
// See org.chromium.sdk.internal.protocolparser.dynamicimpl.DynamicParserImpl for details

package org.chromium.sdk.internal.shellprotocol.tools.protocol.input;

public class GeneratedToolsProtocolParser implements org.chromium.sdk.internal.shellprotocol.tools.protocol.input.ToolsProtocolParser {
  @Override public org.chromium.sdk.internal.shellprotocol.tools.protocol.input.ToolsMessage parseToolsMessage(org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return Value_0.parse(obj);
  }

  // Type org.chromium.sdk.internal.shellprotocol.tools.protocol.input.ToolsMessage
  public static class Value_0 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.JsonValueBase implements org.chromium.sdk.internal.shellprotocol.tools.protocol.input.ToolsMessage {
    public static Value_0 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_0(input);
    }
    Value_0(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);

      Object value0 = underlying.get("data");
      boolean hasValue1;
      if (value0 == null) {
        hasValue1 = underlying.containsKey("data");
      } else {
        hasValue1 = true;
      }
      if (hasValue1) {
        try {
          Value_1 parsedValue2;
          if (value0 == null) {
            throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("null input");
          } else {
            parsedValue2 = Value_1.parse(value0);
          }
          this.field_data = parsedValue2;
        } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Failed to parse field data", e);
        }
      } else {
        this.field_data = null;
      }
    }
    private final org.chromium.sdk.internal.shellprotocol.tools.protocol.input.ToolsMessage.Data field_data;
    @Override public long result()    {
      java.lang.Long result;
      try {
        Object value0 = underlying.get("result");
        boolean hasValue1;
        if (value0 == null) {
          hasValue1 = underlying.containsKey("result");
        } else {
          hasValue1 = true;
        }
        if (hasValue1) {
          java.lang.Long r1 = (java.lang.Long) value0;
          result = r1;
        } else {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: result");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
    @Override public org.chromium.sdk.internal.shellprotocol.tools.protocol.input.ToolsMessage.Data data() {
      return field_data;
    }
    @Override public java.lang.String command()    {
      java.lang.String result;
      try {
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
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Field is not optional: command");
        }
      } catch (org.chromium.sdk.internal.protocolparser.JsonProtocolParseException e) {
        throw new org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException("On demand parsing failed for " + underlying, e);
      }
      return result;
    }
  }

  // Type org.chromium.sdk.internal.shellprotocol.tools.protocol.input.ToolsMessage$Data
  public static class Value_1 extends org.chromium.sdk.internal.protocolparser.implutil.GeneratedCodeLibrary.ObjectValueBase implements org.chromium.sdk.internal.shellprotocol.tools.protocol.input.ToolsMessage.Data {
    public static Value_1 parse(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return new Value_1(input);
    }
    Value_1(Object input) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      super(input);
    }
    private final java.util.concurrent.atomic.AtomicReference<java.util.List<java.util.List<java.lang.Object>>  > lazyCachedField_0 = new java.util.concurrent.atomic.AtomicReference<java.util.List<java.util.List<java.lang.Object>>>(null);
    private final java.util.concurrent.atomic.AtomicReference<org.json.simple.JSONObject  > lazyCachedField_1 = new java.util.concurrent.atomic.AtomicReference<org.json.simple.JSONObject>(null);
    private final java.util.concurrent.atomic.AtomicReference<java.lang.String  > lazyCachedField_2 = new java.util.concurrent.atomic.AtomicReference<java.lang.String>(null);
    private final java.util.concurrent.atomic.AtomicReference<java.lang.String  > lazyCachedField_3 = new java.util.concurrent.atomic.AtomicReference<java.lang.String>(null);
    @Override public java.lang.String asVersionData() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      java.lang.String result = lazyCachedField_3.get();
      if (result != null) {
        return result;
      }
      java.lang.String parseResult0 = (java.lang.String) underlying;
      if (parseResult0 != null) {
        lazyCachedField_3.compareAndSet(null, parseResult0);
        java.lang.String cachedResult = lazyCachedField_3.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public org.json.simple.JSONObject asDebuggerData() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      org.json.simple.JSONObject result = lazyCachedField_1.get();
      if (result != null) {
        return result;
      }
      org.json.simple.JSONObject parseResult0 = (org.json.simple.JSONObject) underlying;
      if (parseResult0 != null) {
        lazyCachedField_1.compareAndSet(null, parseResult0);
        org.json.simple.JSONObject cachedResult = lazyCachedField_1.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public java.util.List<java.util.List<java.lang.Object>> asListTabsData() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      java.util.List<java.util.List<java.lang.Object>> result = lazyCachedField_0.get();
      if (result != null) {
        return result;
      }
      if (underlying instanceof org.json.simple.JSONArray == false) {
        throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
      }
      final org.json.simple.JSONArray arrayValue1 = (org.json.simple.JSONArray) underlying;
      int size2 = arrayValue1.size();
      java.util.List<java.util.List<java.lang.Object>> list3 = new java.util.ArrayList<java.util.List<java.lang.Object>>(size2);
      for (int index4 = 0; index4 < size2; index4++) {
        if (arrayValue1.get(index4) instanceof org.json.simple.JSONArray == false) {
          throw new org.chromium.sdk.internal.protocolparser.JsonProtocolParseException("Array value expected");
        }
        final org.json.simple.JSONArray arrayValue6 = (org.json.simple.JSONArray) arrayValue1.get(index4);
        int size7 = arrayValue6.size();
        java.util.List<java.lang.Object> list8 = new java.util.ArrayList<java.lang.Object>(size7);
        for (int index9 = 0; index9 < size7; index9++) {
          java.lang.Object arrayComponent10 = (java.lang.Object) arrayValue6.get(index9);
          list8.add(arrayComponent10);
        }
        java.util.List<java.lang.Object> arrayComponent5 = java.util.Collections.unmodifiableList(list8);
        list3.add(arrayComponent5);
      }
      java.util.List<java.util.List<java.lang.Object>> parseResult0 = java.util.Collections.unmodifiableList(list3);
      if (parseResult0 != null) {
        lazyCachedField_0.compareAndSet(null, parseResult0);
        java.util.List<java.util.List<java.lang.Object>> cachedResult = lazyCachedField_0.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
    @Override public java.lang.String asNavigatedData() throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      java.lang.String result = lazyCachedField_2.get();
      if (result != null) {
        return result;
      }
      java.lang.String parseResult0 = (java.lang.String) underlying;
      if (parseResult0 != null) {
        lazyCachedField_2.compareAndSet(null, parseResult0);
        java.lang.String cachedResult = lazyCachedField_2.get();
        parseResult0 = cachedResult;
      }
      return parseResult0;
    }
  }

}
