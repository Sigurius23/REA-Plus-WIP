package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class JsonTreeReader extends JsonReader {
    private int[] pathIndices;
    private String[] pathNames;
    private Object[] stack;
    private int stackSize;
    private static final Reader UNREADABLE_READER = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i13, int i14) {
            throw new AssertionError();
        }
    };
    private static final Object SENTINEL_CLOSED = new Object();

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonTreeReader$2 */
    public static /* synthetic */ class C52502 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(UNREADABLE_READER);
        this.stack = new Object[32];
        this.stackSize = 0;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        push(jsonElement);
    }

    private void expect(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    private String getPath(boolean z4) {
        StringBuilder sb4 = new StringBuilder("$");
        int i13 = 0;
        while (true) {
            int i14 = this.stackSize;
            if (i13 >= i14) {
                return sb4.toString();
            }
            Object[] objArr = this.stack;
            Object obj = objArr[i13];
            if (obj instanceof JsonArray) {
                i13++;
                if (i13 < i14 && (objArr[i13] instanceof Iterator)) {
                    int i15 = this.pathIndices[i13];
                    if (z4 && i15 > 0 && (i13 == i14 - 1 || i13 == i14 - 2)) {
                        i15--;
                    }
                    sb4.append('[');
                    sb4.append(i15);
                    sb4.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i13 = i13 + 1) < i14 && (objArr[i13] instanceof Iterator)) {
                sb4.append('.');
                String str = this.pathNames[i13];
                if (str != null) {
                    sb4.append(str);
                }
            }
            i13++;
        }
    }

    private String locationString() {
        return " at path " + getPath();
    }

    private String nextName(boolean z4) throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.stackSize - 1] = z4 ? "<skipped>" : str;
        push(entry.getValue());
        return str;
    }

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    private Object popStack() {
        Object[] objArr = this.stack;
        int i13 = this.stackSize - 1;
        this.stackSize = i13;
        Object obj = objArr[i13];
        objArr[i13] = null;
        return obj;
    }

    private void push(Object obj) {
        int i13 = this.stackSize;
        Object[] objArr = this.stack;
        if (i13 == objArr.length) {
            int i14 = i13 * 2;
            this.stack = Arrays.copyOf(objArr, i14);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i14);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i14);
        }
        Object[] objArr2 = this.stack;
        int i15 = this.stackSize;
        this.stackSize = i15 + 1;
        objArr2[i15] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        expect(JsonToken.BEGIN_ARRAY);
        push(((JsonArray) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        expect(JsonToken.BEGIN_OBJECT);
        push(((JsonObject) peekStack()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.stack = new Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i13 = this.stackSize;
        if (i13 > 0) {
            int[] iArr = this.pathIndices;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        expect(JsonToken.END_OBJECT);
        this.pathNames[this.stackSize - 1] = null;
        popStack();
        popStack();
        int i13 = this.stackSize;
        if (i13 > 0) {
            int[] iArr = this.pathIndices;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken jsonTokenPeek = peek();
        return (jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_DOCUMENT) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        expect(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) popStack()).getAsBoolean();
        int i13 = this.stackSize;
        if (i13 > 0) {
            int[] iArr = this.pathIndices;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        double asDouble = ((JsonPrimitive) peekStack()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + asDouble);
        }
        popStack();
        int i13 = this.stackSize;
        if (i13 > 0) {
            int[] iArr = this.pathIndices;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        int asInt = ((JsonPrimitive) peekStack()).getAsInt();
        popStack();
        int i13 = this.stackSize;
        if (i13 > 0) {
            int[] iArr = this.pathIndices;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
        return asInt;
    }

    public JsonElement nextJsonElement() throws IOException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.NAME && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_DOCUMENT) {
            JsonElement jsonElement = (JsonElement) peekStack();
            skipValue();
            return jsonElement;
        }
        throw new IllegalStateException("Unexpected " + jsonTokenPeek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        long asLong = ((JsonPrimitive) peekStack()).getAsLong();
        popStack();
        int i13 = this.stackSize;
        if (i13 > 0) {
            int[] iArr = this.pathIndices;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        expect(JsonToken.NULL);
        popStack();
        int i13 = this.stackSize;
        if (i13 > 0) {
            int[] iArr = this.pathIndices;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        String asString = ((JsonPrimitive) popStack()).getAsString();
        int i13 = this.stackSize;
        if (i13 > 0) {
            int[] iArr = this.pathIndices;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
        return asString;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.stackSize == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objPeekStack = peekStack();
        if (objPeekStack instanceof Iterator) {
            boolean z4 = this.stack[this.stackSize - 2] instanceof JsonObject;
            Iterator it = (Iterator) objPeekStack;
            if (!it.hasNext()) {
                return z4 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z4) {
                return JsonToken.NAME;
            }
            push(it.next());
            return peek();
        }
        if (objPeekStack instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objPeekStack instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (objPeekStack instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) objPeekStack;
            if (jsonPrimitive.isString()) {
                return JsonToken.STRING;
            }
            if (jsonPrimitive.isBoolean()) {
                return JsonToken.BOOLEAN;
            }
            if (jsonPrimitive.isNumber()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (objPeekStack instanceof JsonNull) {
            return JsonToken.NULL;
        }
        if (objPeekStack == SENTINEL_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objPeekStack.getClass().getName() + " is not supported");
    }

    public void promoteNameToValue() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        push(entry.getValue());
        push(new JsonPrimitive((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        int i13 = C52502.$SwitchMap$com$google$gson$stream$JsonToken[peek().ordinal()];
        if (i13 == 1) {
            nextName(true);
            return;
        }
        if (i13 == 2) {
            endArray();
            return;
        }
        if (i13 == 3) {
            endObject();
            return;
        }
        if (i13 != 4) {
            popStack();
            int i14 = this.stackSize;
            if (i14 > 0) {
                int[] iArr = this.pathIndices;
                int i15 = i14 - 1;
                iArr[i15] = iArr[i15] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return "JsonTreeReader" + locationString();
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        return nextName(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return getPath(false);
    }
}
