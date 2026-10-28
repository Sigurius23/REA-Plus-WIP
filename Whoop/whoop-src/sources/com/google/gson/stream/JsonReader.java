package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import ih0.AbstractC18489d0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import live.hms.video.factories.MediaConstraintsFactory;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes.dex */
public class JsonReader implements Closeable {
    static final int BUFFER_SIZE = 1024;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;

    /* JADX INFO: renamed from: in */
    private final Reader f21626in;
    private int[] pathIndices;
    private String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int[] stack;
    private boolean lenient = false;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    static {
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() { // from class: com.google.gson.stream.JsonReader.1
            @Override // com.google.gson.internal.JsonReaderInternalAccess
            public void promoteNameToValue(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader) jsonReader).promoteNameToValue();
                    return;
                }
                int iDoPeek = jsonReader.peeked;
                if (iDoPeek == 0) {
                    iDoPeek = jsonReader.doPeek();
                }
                if (iDoPeek == 13) {
                    jsonReader.peeked = 9;
                    return;
                }
                if (iDoPeek == 12) {
                    jsonReader.peeked = 8;
                } else {
                    if (iDoPeek == 14) {
                        jsonReader.peeked = 10;
                        return;
                    }
                    throw new IllegalStateException("Expected a name but was " + jsonReader.peek() + jsonReader.locationString());
                }
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f21626in = reader;
    }

    private void checkLenient() throws IOException {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() throws IOException {
        nextNonWhitespace(true);
        int i13 = this.pos;
        this.pos = i13 - 1;
        if (i13 + 4 <= this.limit || fillBuffer(5)) {
            int i14 = this.pos;
            char[] cArr = this.buffer;
            if (cArr[i14] == ')' && cArr[i14 + 1] == ']' && cArr[i14 + 2] == '}' && cArr[i14 + 3] == '\'' && cArr[i14 + 4] == '\n') {
                this.pos = i14 + 5;
            }
        }
    }

    private boolean fillBuffer(int i13) throws IOException {
        int i14;
        int i15;
        char[] cArr = this.buffer;
        int i16 = this.lineStart;
        int i17 = this.pos;
        this.lineStart = i16 - i17;
        int i18 = this.limit;
        if (i18 != i17) {
            int i19 = i18 - i17;
            this.limit = i19;
            System.arraycopy(cArr, i17, cArr, 0, i19);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.f21626in;
            int i24 = this.limit;
            int i25 = reader.read(cArr, i24, cArr.length - i24);
            if (i25 == -1) {
                return false;
            }
            i14 = this.limit + i25;
            this.limit = i14;
            if (this.lineNumber == 0 && (i15 = this.lineStart) == 0 && i14 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i15 + 1;
                i13++;
            }
        } while (i14 < i13);
        return true;
    }

    private String getPath(boolean z4) {
        StringBuilder sb4 = new StringBuilder("$");
        int i13 = 0;
        while (true) {
            int i14 = this.stackSize;
            if (i13 >= i14) {
                return sb4.toString();
            }
            int i15 = this.stack[i13];
            if (i15 == 1 || i15 == 2) {
                int i16 = this.pathIndices[i13];
                if (z4 && i16 > 0 && i13 == i14 - 1) {
                    i16--;
                }
                sb4.append('[');
                sb4.append(i16);
                sb4.append(']');
            } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                sb4.append('.');
                String str = this.pathNames[i13];
                if (str != null) {
                    sb4.append(str);
                }
            }
            i13++;
        }
    }

    private boolean isLiteral(char c3) throws IOException {
        if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
            return false;
        }
        if (c3 != '#') {
            if (c3 == ',') {
                return false;
            }
            if (c3 != '/' && c3 != '=') {
                if (c3 == '{' || c3 == '}' || c3 == ':') {
                    return false;
                }
                if (c3 != ';') {
                    switch (c3) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    private int nextNonWhitespace(boolean z4) throws IOException {
        char[] cArr = this.buffer;
        int i13 = this.pos;
        int i14 = this.limit;
        while (true) {
            if (i13 == i14) {
                this.pos = i13;
                if (!fillBuffer(1)) {
                    if (!z4) {
                        return -1;
                    }
                    throw new EOFException("End of input" + locationString());
                }
                i13 = this.pos;
                i14 = this.limit;
            }
            int i15 = i13 + 1;
            char c3 = cArr[i13];
            if (c3 == '\n') {
                this.lineNumber++;
                this.lineStart = i15;
            } else if (c3 != ' ' && c3 != '\r' && c3 != '\t') {
                if (c3 == '/') {
                    this.pos = i15;
                    if (i15 == i14) {
                        this.pos = i13;
                        boolean zFillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!zFillBuffer) {
                        }
                        return c3;
                    }
                    checkLenient();
                    int i16 = this.pos;
                    char c7 = cArr[i16];
                    if (c7 == '*') {
                        this.pos = i16 + 1;
                        if (!skipTo("*/")) {
                            throw syntaxError("Unterminated comment");
                        }
                        i13 = this.pos + 2;
                        i14 = this.limit;
                    } else {
                        if (c7 != '/') {
                            return c3;
                        }
                        this.pos = i16 + 1;
                        skipToEndOfLine();
                        i13 = this.pos;
                        i14 = this.limit;
                    }
                } else {
                    if (c3 != '#') {
                        this.pos = i15;
                        return c3;
                    }
                    this.pos = i15;
                    checkLenient();
                    skipToEndOfLine();
                    i13 = this.pos;
                    i14 = this.limit;
                }
            }
            i13 = i15;
        }
    }

    private String nextQuotedValue(char c3) throws IOException {
        int i13;
        char[] cArr = this.buffer;
        StringBuilder sb4 = null;
        do {
            int i14 = this.pos;
            int i15 = this.limit;
            while (true) {
                int i16 = i15;
                i13 = i14;
                while (true) {
                    if (i14 < i16) {
                        int i17 = i14 + 1;
                        char c7 = cArr[i14];
                        if (c7 == c3) {
                            this.pos = i17;
                            int i18 = (i17 - i13) - 1;
                            if (sb4 == null) {
                                return new String(cArr, i13, i18);
                            }
                            sb4.append(cArr, i13, i18);
                            return sb4.toString();
                        }
                        if (c7 == '\\') {
                            this.pos = i17;
                            int i19 = i17 - i13;
                            int i24 = i19 - 1;
                            if (sb4 == null) {
                                sb4 = new StringBuilder(Math.max(i19 * 2, 16));
                            }
                            sb4.append(cArr, i13, i24);
                            sb4.append(readEscapeCharacter());
                            i14 = this.pos;
                            i15 = this.limit;
                        } else {
                            if (c7 == '\n') {
                                this.lineNumber++;
                                this.lineStart = i17;
                            }
                            i14 = i17;
                        }
                    }
                }
            }
            if (sb4 == null) {
                sb4 = new StringBuilder(Math.max((i14 - i13) * 2, 16));
            }
            sb4.append(cArr, i13, i14 - i13);
            this.pos = i14;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String nextUnquotedValue() throws IOException {
        String string;
        StringBuilder sb4 = null;
        int i13 = 0;
        while (true) {
            int i14 = 0;
            while (true) {
                int i15 = this.pos;
                if (i15 + i14 < this.limit) {
                    char c3 = this.buffer[i15 + i14];
                    if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                        if (c3 != '#') {
                            if (c3 != ',') {
                                if (c3 != '/' && c3 != '=') {
                                    if (c3 != '{' && c3 != '}' && c3 != ':') {
                                        if (c3 != ';') {
                                            switch (c3) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i14++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        checkLenient();
                    }
                    i13 = i14;
                } else if (i14 >= this.buffer.length) {
                    if (sb4 == null) {
                        sb4 = new StringBuilder(Math.max(i14, 16));
                    }
                    sb4.append(this.buffer, this.pos, i14);
                    this.pos += i14;
                    if (!fillBuffer(1)) {
                    }
                } else if (!fillBuffer(i14 + 1)) {
                    i13 = i14;
                }
                if (sb4 == null) {
                    string = new String(this.buffer, this.pos, i13);
                } else {
                    sb4.append(this.buffer, this.pos, i13);
                    string = sb4.toString();
                }
                this.pos += i13;
                return string;
            }
        }
    }

    private int peekKeyword() throws IOException {
        String str;
        String str2;
        int i13;
        char c3 = this.buffer[this.pos];
        if (c3 == 't' || c3 == 'T') {
            str = MediaConstraintsFactory.kValueTrue;
            str2 = "TRUE";
            i13 = 5;
        } else if (c3 == 'f' || c3 == 'F') {
            str = MediaConstraintsFactory.kValueFalse;
            str2 = "FALSE";
            i13 = 6;
        } else {
            if (c3 != 'n' && c3 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i13 = 7;
        }
        int length = str.length();
        for (int i14 = 1; i14 < length; i14++) {
            if (this.pos + i14 >= this.limit && !fillBuffer(i14 + 1)) {
                return 0;
            }
            char c7 = this.buffer[this.pos + i14];
            if (c7 != str.charAt(i14) && c7 != str2.charAt(i14)) {
                return 0;
            }
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i13;
        return i13;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    private int peekNumber() throws IOException {
        char c3;
        int i13;
        char[] cArr = this.buffer;
        int i14 = this.pos;
        int i15 = this.limit;
        int i16 = 0;
        int i17 = 0;
        char c7 = 0;
        boolean z4 = false;
        int i18 = 1;
        long j7 = 0;
        while (true) {
            char c14 = 2;
            if (i14 + i17 != i15) {
                c3 = cArr[i14 + i17];
                i13 = i16;
                if (c3 != '+') {
                    if (c3 != 'E' || c3 == 'e') {
                        if (c7 == 2 && c7 != 4) {
                            return i13;
                        }
                        c7 = 5;
                    } else if (c3 == '-') {
                        c14 = 6;
                        if (c7 == 0) {
                            c7 = 1;
                            z4 = true;
                        } else if (c7 != 5) {
                            return i13;
                        }
                    } else if (c3 != '.') {
                        if (c3 < '0' || c3 > '9') {
                            if (!isLiteral(c3)) {
                                break;
                            }
                            return i13;
                        }
                        if (c7 == 1 || c7 == 0) {
                            j7 = -(c3 - '0');
                        } else if (c7 == 2) {
                            if (j7 == 0) {
                                return i13;
                            }
                            long j13 = (10 * j7) - ((long) (c3 - '0'));
                            i18 &= (j7 > MIN_INCOMPLETE_INTEGER || (j7 == MIN_INCOMPLETE_INTEGER && j13 < j7)) ? 1 : i13;
                            j7 = j13;
                        } else if (c7 == 3) {
                            c7 = 4;
                        } else if (c7 == 5 || c7 == 6) {
                            c7 = 7;
                        }
                    } else {
                        if (c7 != 2) {
                            return i13;
                        }
                        c7 = 3;
                    }
                    i17++;
                    i16 = i13;
                } else {
                    c14 = 6;
                    if (c7 != 5) {
                        return i13;
                    }
                }
                c7 = c14;
                i17++;
                i16 = i13;
            } else {
                if (i17 == cArr.length) {
                    return i16;
                }
                if (!fillBuffer(i17 + 1)) {
                    i13 = i16;
                    break;
                }
                i14 = this.pos;
                i15 = this.limit;
                c3 = cArr[i14 + i17];
                i13 = i16;
                if (c3 != '+') {
                    if (c3 != 'E') {
                        if (c7 == 2) {
                        }
                        c7 = 5;
                    } else {
                        if (c7 == 2) {
                        }
                        c7 = 5;
                    }
                    i17++;
                    i16 = i13;
                } else {
                    c14 = 6;
                    if (c7 != 5) {
                        return i13;
                    }
                }
                c7 = c14;
                i17++;
                i16 = i13;
            }
        }
        if (c7 == 2 && i18 != 0 && ((j7 != Long.MIN_VALUE || z4) && (j7 != 0 || !z4))) {
            if (!z4) {
                j7 = -j7;
            }
            this.peekedLong = j7;
            this.pos += i17;
            this.peeked = 15;
            return 15;
        }
        if (c7 != 2 && c7 != 4 && c7 != 7) {
            return i13;
        }
        this.peekedNumberLength = i17;
        this.peeked = 16;
        return 16;
    }

    private void push(int i13) {
        int i14 = this.stackSize;
        int[] iArr = this.stack;
        if (i14 == iArr.length) {
            int i15 = i14 * 2;
            this.stack = Arrays.copyOf(iArr, i15);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i15);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i15);
        }
        int[] iArr2 = this.stack;
        int i16 = this.stackSize;
        this.stackSize = i16 + 1;
        iArr2[i16] = i13;
    }

    private char readEscapeCharacter() throws IOException {
        int i13;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i14 = this.pos;
        int i15 = i14 + 1;
        this.pos = i15;
        char c3 = cArr[i14];
        if (c3 == '\n') {
            this.lineNumber++;
            this.lineStart = i15;
            return c3;
        }
        if (c3 == '\"' || c3 == '\'' || c3 == '/' || c3 == '\\') {
            return c3;
        }
        if (c3 == 'b') {
            return '\b';
        }
        if (c3 == 'f') {
            return '\f';
        }
        if (c3 == 'n') {
            return '\n';
        }
        if (c3 == 'r') {
            return '\r';
        }
        if (c3 == 't') {
            return '\t';
        }
        if (c3 != 'u') {
            throw syntaxError("Invalid escape sequence");
        }
        if (i14 + 5 > this.limit && !fillBuffer(4)) {
            throw syntaxError("Unterminated escape sequence");
        }
        int i16 = this.pos;
        int i17 = i16 + 4;
        char c7 = 0;
        while (i16 < i17) {
            char c14 = this.buffer[i16];
            char c15 = (char) (c7 << 4);
            if (c14 >= '0' && c14 <= '9') {
                i13 = c14 - '0';
            } else if (c14 >= 'a' && c14 <= 'f') {
                i13 = c14 - 'W';
            } else {
                if (c14 < 'A' || c14 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(this.buffer, this.pos, 4)));
                }
                i13 = c14 - '7';
            }
            c7 = (char) (i13 + c15);
            i16++;
        }
        this.pos += 4;
        return c7;
    }

    private void skipQuotedValue(char c3) throws IOException {
        char[] cArr = this.buffer;
        do {
            int i13 = this.pos;
            int i14 = this.limit;
            while (i13 < i14) {
                int i15 = i13 + 1;
                char c7 = cArr[i13];
                if (c7 == c3) {
                    this.pos = i15;
                    return;
                }
                if (c7 == '\\') {
                    this.pos = i15;
                    readEscapeCharacter();
                    i13 = this.pos;
                    i14 = this.limit;
                } else {
                    if (c7 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i15;
                    }
                    i13 = i15;
                }
            }
            this.pos = i13;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private boolean skipTo(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i13 = this.pos;
            if (cArr[i13] != '\n') {
                for (int i14 = 0; i14 < length; i14++) {
                    if (this.buffer[this.pos + i14] == str.charAt(i14)) {
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i13 + 1;
            this.pos++;
        }
    }

    private void skipToEndOfLine() throws IOException {
        char c3;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 + 1;
            this.pos = i14;
            c3 = cArr[i13];
            if (c3 == '\n') {
                this.lineNumber++;
                this.lineStart = i14;
                return;
            }
        } while (c3 != '\r');
    }

    private void skipUnquotedValue() throws IOException {
        do {
            int i13 = 0;
            while (true) {
                int i14 = this.pos;
                if (i14 + i13 < this.limit) {
                    char c3 = this.buffer[i14 + i13];
                    if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                        if (c3 != '#') {
                            if (c3 != ',') {
                                if (c3 != '/' && c3 != '=') {
                                    if (c3 != '{' && c3 != '}' && c3 != ':') {
                                        if (c3 != ';') {
                                            switch (c3) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i13++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        checkLenient();
                    }
                    this.pos += i13;
                    return;
                }
                this.pos = i14 + i13;
            }
        } while (fillBuffer(1));
    }

    private IOException syntaxError(String str) throws IOException {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str);
        sbM53374o.append(locationString());
        throw new MalformedJsonException(sbM53374o.toString());
    }

    public void beginArray() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 3) {
            push(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + locationString());
        }
    }

    public void beginObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 1) {
            push(3);
            this.peeked = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + locationString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.f21626in.close();
    }

    public int doPeek() throws IOException {
        int iNextNonWhitespace;
        int[] iArr = this.stack;
        int i13 = this.stackSize;
        int i14 = iArr[i13 - 1];
        if (i14 == 1) {
            iArr[i13 - 1] = 2;
        } else if (i14 == 2) {
            int iNextNonWhitespace2 = nextNonWhitespace(true);
            if (iNextNonWhitespace2 != 44) {
                if (iNextNonWhitespace2 != 59) {
                    if (iNextNonWhitespace2 != 93) {
                        throw syntaxError("Unterminated array");
                    }
                    this.peeked = 4;
                    return 4;
                }
                checkLenient();
            }
        } else {
            if (i14 == 3 || i14 == 5) {
                iArr[i13 - 1] = 4;
                if (i14 == 5 && (iNextNonWhitespace = nextNonWhitespace(true)) != 44) {
                    if (iNextNonWhitespace != 59) {
                        if (iNextNonWhitespace != 125) {
                            throw syntaxError("Unterminated object");
                        }
                        this.peeked = 2;
                        return 2;
                    }
                    checkLenient();
                }
                int iNextNonWhitespace3 = nextNonWhitespace(true);
                if (iNextNonWhitespace3 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (iNextNonWhitespace3 == 39) {
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (iNextNonWhitespace3 == 125) {
                    if (i14 == 5) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = 2;
                    return 2;
                }
                checkLenient();
                this.pos--;
                if (!isLiteral((char) iNextNonWhitespace3)) {
                    throw syntaxError("Expected name");
                }
                this.peeked = 14;
                return 14;
            }
            if (i14 == 4) {
                iArr[i13 - 1] = 5;
                int iNextNonWhitespace4 = nextNonWhitespace(true);
                if (iNextNonWhitespace4 != 58) {
                    if (iNextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        char[] cArr = this.buffer;
                        int i15 = this.pos;
                        if (cArr[i15] == '>') {
                            this.pos = i15 + 1;
                        }
                    }
                }
            } else if (i14 == 6) {
                if (this.lenient) {
                    consumeNonExecutePrefix();
                }
                this.stack[this.stackSize - 1] = 7;
            } else if (i14 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                checkLenient();
                this.pos--;
            } else if (i14 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iNextNonWhitespace5 = nextNonWhitespace(true);
        if (iNextNonWhitespace5 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (iNextNonWhitespace5 == 39) {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
        if (iNextNonWhitespace5 != 44 && iNextNonWhitespace5 != 59) {
            if (iNextNonWhitespace5 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (iNextNonWhitespace5 != 93) {
                if (iNextNonWhitespace5 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                this.pos--;
                int iPeekKeyword = peekKeyword();
                if (iPeekKeyword != 0) {
                    return iPeekKeyword;
                }
                int iPeekNumber = peekNumber();
                if (iPeekNumber != 0) {
                    return iPeekNumber;
                }
                if (!isLiteral(this.buffer[this.pos])) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i14 == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i14 != 1 && i14 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.pos--;
        this.peeked = 7;
        return 7;
    }

    public void endArray() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + locationString());
        }
        int i13 = this.stackSize;
        this.stackSize = i13 - 1;
        int[] iArr = this.pathIndices;
        int i14 = i13 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.peeked = 0;
    }

    public void endObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + locationString());
        }
        int i13 = this.stackSize;
        int i14 = i13 - 1;
        this.stackSize = i14;
        this.pathNames[i14] = null;
        int[] iArr = this.pathIndices;
        int i15 = i13 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.peeked = 0;
    }

    public String getPreviousPath() {
        return getPath(true);
    }

    public boolean hasNext() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        return (iDoPeek == 2 || iDoPeek == 4 || iDoPeek == 17) ? false : true;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    public String locationString() {
        StringBuilder sbM30465s = AbstractC11266d.m30465s(this.lineNumber + 1, (this.pos - this.lineStart) + 1, " at line ", " column ", " path ");
        sbM30465s.append(getPath());
        return sbM30465s.toString();
    }

    public boolean nextBoolean() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i13 = this.stackSize - 1;
            iArr[i13] = iArr[i13] + 1;
            return true;
        }
        if (iDoPeek != 6) {
            throw new IllegalStateException("Expected a boolean but was " + peek() + locationString());
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i14 = this.stackSize - 1;
        iArr2[i14] = iArr2[i14] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i13 = this.stackSize - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (iDoPeek == 8 || iDoPeek == 9) {
            this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
        } else if (iDoPeek == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (iDoPeek != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + locationString());
        }
        this.peeked = 11;
        double d3 = Double.parseDouble(this.peekedString);
        if (!this.lenient && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d3 + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i14 = this.stackSize - 1;
        iArr2[i14] = iArr2[i14] + 1;
        return d3;
    }

    public int nextInt() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            long j7 = this.peekedLong;
            int i13 = (int) j7;
            if (j7 != i13) {
                throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
            }
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i14 = this.stackSize - 1;
            iArr[i14] = iArr[i14] + 1;
            return i13;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + locationString());
            }
            if (iDoPeek == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
            }
            try {
                int i15 = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i16 = this.stackSize - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return i15;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d3 = Double.parseDouble(this.peekedString);
        int i17 = (int) d3;
        if (i17 != d3) {
            throw new NumberFormatException("Expected an int but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i18 = this.stackSize - 1;
        iArr3[i18] = iArr3[i18] + 1;
        return i17;
    }

    public long nextLong() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i13 = this.stackSize - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + locationString());
            }
            if (iDoPeek == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
            }
            try {
                long j7 = Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i14 = this.stackSize - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return j7;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d3 = Double.parseDouble(this.peekedString);
        long j13 = (long) d3;
        if (j13 != d3) {
            throw new NumberFormatException("Expected a long but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i15 = this.stackSize - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return j13;
    }

    public String nextName() throws IOException {
        String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            strNextQuotedValue = nextUnquotedValue();
        } else if (iDoPeek == 12) {
            strNextQuotedValue = nextQuotedValue('\'');
        } else {
            if (iDoPeek != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + locationString());
            }
            strNextQuotedValue = nextQuotedValue('\"');
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = strNextQuotedValue;
        return strNextQuotedValue;
    }

    public void nextNull() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 7) {
            throw new IllegalStateException("Expected null but was " + peek() + locationString());
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i13 = this.stackSize - 1;
        iArr[i13] = iArr[i13] + 1;
    }

    public String nextString() throws IOException {
        String str;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 10) {
            str = nextUnquotedValue();
        } else if (iDoPeek == 8) {
            str = nextQuotedValue('\'');
        } else if (iDoPeek == 9) {
            str = nextQuotedValue('\"');
        } else if (iDoPeek == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (iDoPeek == 15) {
            str = Long.toString(this.peekedLong);
        } else {
            if (iDoPeek != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + locationString());
            }
            str = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i13 = this.stackSize - 1;
        iArr[i13] = iArr[i13] + 1;
        return str;
    }

    public JsonToken peek() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        switch (iDoPeek) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void setLenient(boolean z4) {
        this.lenient = z4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() throws IOException {
        int i13 = 0;
        do {
            int iDoPeek = this.peeked;
            if (iDoPeek == 0) {
                iDoPeek = doPeek();
            }
            switch (iDoPeek) {
                case 1:
                    push(3);
                    i13++;
                    this.peeked = 0;
                    break;
                case 2:
                    if (i13 == 0) {
                        this.pathNames[this.stackSize - 1] = null;
                    }
                    this.stackSize--;
                    i13--;
                    this.peeked = 0;
                    break;
                case 3:
                    push(1);
                    i13++;
                    this.peeked = 0;
                    break;
                case 4:
                    this.stackSize--;
                    i13--;
                    this.peeked = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.peeked = 0;
                    break;
                case 8:
                    skipQuotedValue('\'');
                    this.peeked = 0;
                    break;
                case 9:
                    skipQuotedValue('\"');
                    this.peeked = 0;
                    break;
                case 10:
                    skipUnquotedValue();
                    this.peeked = 0;
                    break;
                case 12:
                    skipQuotedValue('\'');
                    if (i13 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 13:
                    skipQuotedValue('\"');
                    if (i13 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 14:
                    skipUnquotedValue();
                    if (i13 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 16:
                    this.pos += this.peekedNumberLength;
                    this.peeked = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i13 > 0);
        int[] iArr = this.pathIndices;
        int i14 = this.stackSize - 1;
        iArr[i14] = iArr[i14] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + locationString();
    }

    public String getPath() {
        return getPath(false);
    }
}
