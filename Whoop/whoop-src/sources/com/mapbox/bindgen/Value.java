package com.mapbox.bindgen;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Value {
    private Object contents;

    /* JADX INFO: renamed from: com.mapbox.bindgen.Value$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C53931 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private Value(Object obj) {
        this.contents = obj;
    }

    private void buildJson(JsonWriter jsonWriter) throws IOException {
        Object obj = this.contents;
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Double) {
            jsonWriter.value(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            jsonWriter.value(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof List) {
            jsonWriter.beginArray();
            Iterator it = ((List) this.contents).iterator();
            while (it.hasNext()) {
                ((Value) it.next()).buildJson(jsonWriter);
            }
            jsonWriter.endArray();
            return;
        }
        if (!(obj instanceof HashMap)) {
            throw new RuntimeException("Unhandled value type");
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((HashMap) this.contents).entrySet()) {
            jsonWriter.name((String) entry.getKey());
            ((Value) entry.getValue()).buildJson(jsonWriter);
        }
        jsonWriter.endObject();
    }

    public static Expected<String, Value> fromJson(String str) {
        try {
            return ExpectedFactory.createValue(fromJsonHelper(str));
        } catch (IOException e5) {
            return ExpectedFactory.createError(e5.getMessage());
        }
    }

    private static Value fromJsonHelper(String str) throws IOException {
        return read(new JsonReader(new StringReader(str)));
    }

    public static Value nullValue() {
        return new Value();
    }

    private static Value read(JsonReader jsonReader) throws IOException {
        switch (C53931.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()]) {
            case 1:
                return new Value(jsonReader.nextString());
            case 2:
                String strNextString = jsonReader.nextString();
                return (strNextString.indexOf(46) > -1 || strNextString.contains("e") || strNextString.contains("E")) ? new Value(Double.valueOf(strNextString)) : new Value(Long.valueOf(strNextString));
            case 3:
                return new Value(jsonReader.nextBoolean());
            case 4:
                jsonReader.nextNull();
                return new Value();
            case 5:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(read(jsonReader));
                }
                jsonReader.endArray();
                return new Value((List<Value>) arrayList);
            case 6:
                HashMap map = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), read(jsonReader));
                }
                jsonReader.endObject();
                return new Value((HashMap<String, Value>) map);
            default:
                throw new IllegalArgumentException("Invalid JSON string stream");
        }
    }

    public static Value valueOf(double d3) {
        return new Value(Double.valueOf(d3));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Value) {
            Object obj2 = this.contents;
            if (obj2 == null && ((Value) obj).contents == null) {
                return true;
            }
            if (obj2 == null) {
                return false;
            }
            Value value = (Value) obj;
            if (value.contents == null) {
                return false;
            }
            if (obj2.getClass().isAssignableFrom(value.contents.getClass())) {
                return this.contents.equals(value.contents);
            }
        }
        return this.contents.equals(obj);
    }

    public Object getContents() {
        return this.contents;
    }

    public int hashCode() {
        Object obj = this.contents;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toJson() {
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                buildJson(jsonWriter);
                jsonWriter.close();
            } catch (Throwable th3) {
                try {
                    jsonWriter.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return stringWriter.toString();
    }

    public String toString() {
        Object obj = this.contents;
        return obj == null ? "" : obj.toString();
    }

    public static Value valueOf(long j7) {
        return new Value(Long.valueOf(j7));
    }

    public Value(double d3) {
        this.contents = Double.valueOf(d3);
    }

    public static Value valueOf(boolean z4) {
        return new Value(Boolean.valueOf(z4));
    }

    public static Value valueOf(String str) {
        return new Value(str);
    }

    public Value(long j7) {
        this.contents = Long.valueOf(j7);
    }

    public static Value valueOf(List<Value> list) {
        return new Value(list);
    }

    public static Value valueOf(HashMap<String, Value> map) {
        return new Value(map);
    }

    public Value(boolean z4) {
        this.contents = Boolean.valueOf(z4);
    }

    public Value(String str) {
        this.contents = str;
    }

    public Value(List<Value> list) {
        this.contents = list;
    }

    public Value(HashMap<String, Value> map) {
        this.contents = map;
    }

    private Value() {
        this.contents = null;
    }
}
