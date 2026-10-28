package com.squareup.wire;

import j93.InterfaceC21461d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import ne3.AbstractC26604b;
import ne3.C26616h;
import ne3.C26617h0;
import ne3.C26624l;
import ne3.InterfaceC26618i;
import ne3.InterfaceC26620j;
import p479s4.AbstractC32120a;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;

/* JADX INFO: renamed from: com.squareup.wire.q */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5586q {
    public static final AbstractC5586q BOOL;
    public static final AbstractC5586q BOOL_VALUE;
    public static final AbstractC5586q BYTES;
    public static final AbstractC5586q BYTES_VALUE;
    public static final C5585p Companion = new C5585p();
    public static final AbstractC5586q DOUBLE;
    public static final AbstractC5586q DOUBLE_ARRAY;
    public static final AbstractC5586q DOUBLE_VALUE;
    public static final AbstractC5586q DURATION;
    public static final AbstractC5586q EMPTY;
    public static final AbstractC5586q FIXED32;
    public static final AbstractC5586q FIXED32_ARRAY;
    public static final AbstractC5586q FIXED64;
    public static final AbstractC5586q FIXED64_ARRAY;
    public static final AbstractC5586q FLOAT;
    public static final AbstractC5586q FLOAT_ARRAY;
    public static final AbstractC5586q FLOAT_VALUE;
    public static final AbstractC5586q INSTANT;
    public static final AbstractC5586q INT32;
    public static final AbstractC5586q INT32_ARRAY;
    public static final AbstractC5586q INT32_VALUE;
    public static final AbstractC5586q INT64;
    public static final AbstractC5586q INT64_ARRAY;
    public static final AbstractC5586q INT64_VALUE;
    public static final AbstractC5586q SFIXED32;
    public static final AbstractC5586q SFIXED32_ARRAY;
    public static final AbstractC5586q SFIXED64;
    public static final AbstractC5586q SFIXED64_ARRAY;
    public static final AbstractC5586q SINT32;
    public static final AbstractC5586q SINT32_ARRAY;
    public static final AbstractC5586q SINT64;
    public static final AbstractC5586q SINT64_ARRAY;
    public static final AbstractC5586q STRING;
    public static final AbstractC5586q STRING_VALUE;
    public static final AbstractC5586q STRUCT_LIST;
    public static final AbstractC5586q STRUCT_MAP;
    public static final AbstractC5586q STRUCT_NULL;
    public static final AbstractC5586q STRUCT_VALUE;
    public static final AbstractC5586q UINT32;
    public static final AbstractC5586q UINT32_ARRAY;
    public static final AbstractC5586q UINT32_VALUE;
    public static final AbstractC5586q UINT64;
    public static final AbstractC5586q UINT64_ARRAY;
    public static final AbstractC5586q UINT64_VALUE;
    private final EnumC5573d fieldEncoding;
    private final Object identity;
    private final AbstractC5586q packedAdapter;
    private final AbstractC5586q repeatedAdapter;
    private final String sourceFile;
    private final EnumC5593x syntax;
    private final InterfaceC21461d type;
    private final String typeUrl;

    static {
        C5571b c5571b;
        C5571b c5571b2;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        EnumC5573d enumC5573d = EnumC5573d.VARINT;
        EnumC5593x enumC5593x = EnumC5593x.PROTO_2;
        C5571b c5571b3 = new C5571b(enumC5573d, c22673i0.getOrCreateKotlinClass(Boolean.TYPE), null, enumC5593x, Boolean.FALSE, 3);
        BOOL = c5571b3;
        Class cls = Integer.TYPE;
        int i13 = 0;
        String str = null;
        C5571b c5571b4 = new C5571b(enumC5573d, c22673i0.getOrCreateKotlinClass(cls), str, enumC5593x, i13, 10);
        INT32 = c5571b4;
        INT32_ARRAY = new C5574e(c5571b4, 0);
        C5571b c5571b5 = new C5571b(enumC5573d, c22673i0.getOrCreateKotlinClass(cls), str, enumC5593x, i13, 19);
        UINT32 = c5571b5;
        UINT32_ARRAY = new C5574e(c5571b5, 0);
        C5571b c5571b6 = new C5571b(enumC5573d, c22673i0.getOrCreateKotlinClass(cls), str, enumC5593x, i13, 12);
        SINT32 = c5571b6;
        SINT32_ARRAY = new C5574e(c5571b6, 0);
        int i14 = 7;
        EnumC5573d enumC5573d2 = EnumC5573d.FIXED32;
        C5571b c5571b7 = new C5571b(enumC5573d2, c22673i0.getOrCreateKotlinClass(cls), null, enumC5593x, i13, i14);
        FIXED32 = c5571b7;
        FIXED32_ARRAY = new C5574e(c5571b7, 0);
        C5571b c5571b8 = new C5571b(enumC5573d2, c22673i0.getOrCreateKotlinClass(cls), null, enumC5593x, i13, i14);
        SFIXED32 = c5571b8;
        SFIXED32_ARRAY = new C5574e(c5571b8, 0);
        Class cls2 = Long.TYPE;
        long j7 = 0L;
        String str2 = null;
        C5571b c5571b9 = new C5571b(enumC5573d, c22673i0.getOrCreateKotlinClass(cls2), str2, enumC5593x, j7, 11);
        INT64 = c5571b9;
        INT64_ARRAY = new C5574e(c5571b9, 1);
        C5571b c5571b10 = new C5571b(enumC5573d, c22673i0.getOrCreateKotlinClass(cls2), str2, enumC5593x, j7, 20);
        UINT64 = c5571b10;
        UINT64_ARRAY = new C5574e(c5571b10, 1);
        C5571b c5571b11 = new C5571b(enumC5573d, c22673i0.getOrCreateKotlinClass(cls2), str2, enumC5593x, j7, 13);
        SINT64 = c5571b11;
        SINT64_ARRAY = new C5574e(c5571b11, 1);
        int i15 = 8;
        EnumC5573d enumC5573d3 = EnumC5573d.FIXED64;
        C5571b c5571b12 = new C5571b(enumC5573d3, c22673i0.getOrCreateKotlinClass(cls2), null, enumC5593x, j7, i15);
        FIXED64 = c5571b12;
        FIXED64_ARRAY = new C5574e(c5571b12, 1);
        String str3 = null;
        C5571b c5571b13 = new C5571b(enumC5573d3, c22673i0.getOrCreateKotlinClass(cls2), str3, enumC5593x, j7, i15);
        SFIXED64 = c5571b13;
        SFIXED64_ARRAY = new C5574e(c5571b13, 1);
        C5571b c5571b14 = new C5571b(enumC5573d2, c22673i0.getOrCreateKotlinClass(Float.TYPE), str3, enumC5593x, Float.valueOf(0.0f), 1);
        FLOAT = c5571b14;
        FLOAT_ARRAY = new C5569a(c5571b14, (byte) 0);
        C5571b c5571b15 = new C5571b(enumC5573d3, c22673i0.getOrCreateKotlinClass(Double.TYPE), str3, enumC5593x, Double.valueOf(0.0d), 0);
        DOUBLE = c5571b15;
        DOUBLE_ARRAY = new C5569a(c5571b15);
        EnumC5573d enumC5573d4 = EnumC5573d.LENGTH_DELIMITED;
        C5571b c5571b16 = new C5571b(enumC5573d4, c22673i0.getOrCreateKotlinClass(C26624l.class), str3, enumC5593x, C26624l.f105881E, 4);
        BYTES = c5571b16;
        C5571b c5571b17 = new C5571b(enumC5573d4, c22673i0.getOrCreateKotlinClass(String.class), str3, enumC5593x, "", 14);
        STRING = c5571b17;
        EnumC5593x enumC5593x2 = EnumC5593x.PROTO_3;
        EMPTY = new C5571b(enumC5573d4, c22673i0.getOrCreateKotlinClass(C23454a0.class), "type.googleapis.com/google.protobuf.Empty", enumC5593x2, 6);
        STRUCT_MAP = new C5571b(enumC5573d4, c22673i0.getOrCreateKotlinClass(Map.class), "type.googleapis.com/google.protobuf.Struct", enumC5593x2, 16);
        STRUCT_LIST = new C5571b(enumC5573d4, c22673i0.getOrCreateKotlinClass(Map.class), "type.googleapis.com/google.protobuf.ListValue", enumC5593x2, 15);
        STRUCT_NULL = new C5571b(enumC5573d, c22673i0.getOrCreateKotlinClass(Void.class), "type.googleapis.com/google.protobuf.NullValue", enumC5593x2, 17);
        STRUCT_VALUE = new C5571b(enumC5573d4, c22673i0.getOrCreateKotlinClass(Object.class), "type.googleapis.com/google.protobuf.Value", enumC5593x2, 18);
        DOUBLE_VALUE = AbstractC35785b.m113416k(c5571b15, "type.googleapis.com/google.protobuf.DoubleValue");
        FLOAT_VALUE = AbstractC35785b.m113416k(c5571b14, "type.googleapis.com/google.protobuf.FloatValue");
        INT64_VALUE = AbstractC35785b.m113416k(c5571b9, "type.googleapis.com/google.protobuf.Int64Value");
        UINT64_VALUE = AbstractC35785b.m113416k(c5571b10, "type.googleapis.com/google.protobuf.UInt64Value");
        INT32_VALUE = AbstractC35785b.m113416k(c5571b4, "type.googleapis.com/google.protobuf.Int32Value");
        UINT32_VALUE = AbstractC35785b.m113416k(c5571b5, "type.googleapis.com/google.protobuf.UInt32Value");
        BOOL_VALUE = AbstractC35785b.m113416k(c5571b3, "type.googleapis.com/google.protobuf.BoolValue");
        STRING_VALUE = AbstractC35785b.m113416k(c5571b17, "type.googleapis.com/google.protobuf.StringValue");
        BYTES_VALUE = AbstractC35785b.m113416k(c5571b16, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            c5571b = new C5571b(enumC5573d4, c22673i0.getOrCreateKotlinClass(Duration.class), "type.googleapis.com/google.protobuf.Duration", enumC5593x2, 5);
        } catch (NoClassDefFoundError unused) {
            c5571b = new C5571b();
        }
        DURATION = c5571b;
        try {
            c5571b2 = new C5571b(enumC5573d4, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Instant.class), "type.googleapis.com/google.protobuf.Timestamp", enumC5593x2, 9);
        } catch (NoClassDefFoundError unused2) {
            c5571b2 = new C5571b();
        }
        INSTANT = c5571b2;
    }

    public AbstractC5586q(EnumC5573d fieldEncoding, InterfaceC21461d interfaceC21461d, String str, EnumC5593x syntax, Object obj, String str2) {
        C5584o c5584o;
        EnumC5573d enumC5573d;
        AbstractC22676k.m65750j(fieldEncoding, "fieldEncoding");
        AbstractC22676k.m65750j(syntax, "syntax");
        this.fieldEncoding = fieldEncoding;
        this.type = interfaceC21461d;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = obj;
        this.sourceFile = str2;
        boolean z4 = this instanceof C5584o;
        C5589t c5589t = null;
        if (z4 || (this instanceof C5589t) || fieldEncoding == (enumC5573d = EnumC5573d.LENGTH_DELIMITED)) {
            c5584o = null;
        } else {
            if (getFieldEncoding$wire_runtime() == enumC5573d) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            c5584o = new C5584o(this);
        }
        this.packedAdapter = c5584o;
        if (!(this instanceof C5589t) && !z4) {
            c5589t = new C5589t(this);
        }
        this.repeatedAdapter = c5589t;
    }

    public static final <M extends AbstractC5581l> AbstractC5586q get(M message) {
        Companion.getClass();
        AbstractC22676k.m65750j(message, "message");
        return C5585p.m16802a(message.getClass());
    }

    public static final <E extends InterfaceC5594y> AbstractC5572c newEnumAdapter(Class<E> type) {
        Companion.getClass();
        AbstractC22676k.m65750j(type, "type");
        return new C5592w(type);
    }

    public static final <K, V> AbstractC5586q newMapAdapter(AbstractC5586q keyAdapter, AbstractC5586q valueAdapter) {
        Companion.getClass();
        AbstractC22676k.m65750j(keyAdapter, "keyAdapter");
        AbstractC22676k.m65750j(valueAdapter, "valueAdapter");
        return new C5578i(keyAdapter, valueAdapter);
    }

    public static final <M extends AbstractC5581l, B extends AbstractC5579j> AbstractC5586q newMessageAdapter(Class<M> type) {
        Companion.getClass();
        AbstractC22676k.m65750j(type, "type");
        return AbstractC32120a.m99977c(type, null, EnumC5593x.PROTO_2, null, 24);
    }

    public final AbstractC5586q asPacked() {
        if (this.fieldEncoding == EnumC5573d.LENGTH_DELIMITED) {
            throw new IllegalArgumentException("Unable to pack a length-delimited type.");
        }
        AbstractC5586q abstractC5586q = this.packedAdapter;
        if (abstractC5586q != null) {
            return abstractC5586q;
        }
        throw new UnsupportedOperationException("Can't create a packed adapter from a packed or repeated adapter.");
    }

    public final AbstractC5586q asRepeated() {
        AbstractC5586q abstractC5586q = this.repeatedAdapter;
        if (abstractC5586q != null) {
            return abstractC5586q;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public abstract Object decode(C5587r c5587r);

    public final Object decode(InputStream stream2) throws IOException {
        AbstractC22676k.m65750j(stream2, "stream");
        return decode(AbstractC26604b.m79158c(AbstractC26604b.m79166k(stream2)));
    }

    public abstract void encode(C5588s c5588s, Object obj);

    public abstract void encode(C5591v c5591v, Object obj);

    public final void encode(OutputStream stream2, Object obj) throws IOException {
        AbstractC22676k.m65750j(stream2, "stream");
        C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(AbstractC26604b.m79164i(stream2));
        encode(c26617h0M79157b, obj);
        c26617h0M79157b.mo79203e();
    }

    public final C26624l encodeByteString(Object obj) throws IOException {
        C26616h c26616h = new C26616h();
        encode(c26616h, obj);
        return c26616h.mo79218m0(c26616h.f105866x);
    }

    public void encodeWithTag(C5588s writer, int i13, Object obj) throws IOException {
        AbstractC22676k.m65750j(writer, "writer");
        if (obj != null) {
            writer.m16819b(i13, getFieldEncoding$wire_runtime());
            if (getFieldEncoding$wire_runtime() == EnumC5573d.LENGTH_DELIMITED) {
                writer.m16820c(encodedSize(obj));
            }
            encode(writer, obj);
        }
    }

    public abstract int encodedSize(Object obj);

    public int encodedSizeWithTag(int i13, Object obj) {
        int i14;
        if (obj == null) {
            return 0;
        }
        int iEncodedSize = encodedSize(obj);
        int i15 = 5;
        if (getFieldEncoding$wire_runtime() == EnumC5573d.LENGTH_DELIMITED) {
            if ((iEncodedSize & (-128)) == 0) {
                i14 = 1;
            } else if ((iEncodedSize & (-16384)) == 0) {
                i14 = 2;
            } else if ((iEncodedSize & (-2097152)) == 0) {
                i14 = 3;
            } else {
                i14 = (iEncodedSize & (-268435456)) == 0 ? 4 : 5;
            }
            iEncodedSize += i14;
        }
        int i16 = (i13 << 3) | 0;
        if ((i16 & (-128)) == 0) {
            i15 = 1;
        } else if ((i16 & (-16384)) == 0) {
            i15 = 2;
        } else if ((i16 & (-2097152)) == 0) {
            i15 = 3;
        } else if ((i16 & (-268435456)) == 0) {
            i15 = 4;
        }
        return iEncodedSize + i15;
    }

    public final EnumC5573d getFieldEncoding$wire_runtime() {
        return this.fieldEncoding;
    }

    public final Object getIdentity() {
        return this.identity;
    }

    public final AbstractC5586q getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    public final AbstractC5586q getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final EnumC5593x getSyntax() {
        return this.syntax;
    }

    public final InterfaceC21461d getType() {
        return this.type;
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final boolean isStruct$wire_runtime() {
        return equals(STRUCT_MAP) || equals(STRUCT_LIST) || equals(STRUCT_VALUE) || equals(STRUCT_NULL);
    }

    public abstract Object redact(Object obj);

    public String toString(Object obj) {
        return String.valueOf(obj);
    }

    public final void tryDecode(C5587r reader, List<Object> destination) throws IOException {
        AbstractC22676k.m65750j(reader, "reader");
        AbstractC22676k.m65750j(destination, "destination");
        int i13 = reader.f22110e;
        if (i13 != 0 && i13 != 1) {
            if (i13 != 2) {
                if (i13 != 5) {
                    throw new ProtocolException("unexpected state: " + reader.f22110e);
                }
            } else if (reader.f22107b >= reader.f22108c) {
                reader.f22108c = reader.f22112g;
                reader.f22112g = -1L;
                reader.f22110e = 6;
                return;
            }
        }
        destination.add(decode(reader));
    }

    public final AbstractC5586q withLabel$wire_runtime(EnumC5595z label) {
        AbstractC22676k.m65750j(label, "label");
        if (label.m16831a()) {
            return label == EnumC5595z.f22131E ? asPacked() : asRepeated();
        }
        return this;
    }

    public final Object decode(byte[] bytes) throws IOException {
        AbstractC22676k.m65750j(bytes, "bytes");
        C26616h c26616h = new C26616h();
        c26616h.m134462write(bytes);
        return decode(c26616h);
    }

    public static final <M> AbstractC5586q get(Class<M> cls) {
        Companion.getClass();
        return C5585p.m16802a(cls);
    }

    public static final <M extends AbstractC5581l, B extends AbstractC5579j> AbstractC5586q newMessageAdapter(Class<M> type, String typeUrl) {
        Companion.getClass();
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(typeUrl, "typeUrl");
        return AbstractC32120a.m99977c(type, typeUrl, EnumC5593x.PROTO_2, null, 24);
    }

    public static final AbstractC5586q get(String str, ClassLoader classLoader) {
        Companion.getClass();
        return C5585p.m16803b(str, classLoader);
    }

    public final void encode(InterfaceC26618i sink, Object obj) throws IOException {
        AbstractC22676k.m65750j(sink, "sink");
        C5591v c5591v = new C5591v();
        encode(c5591v, obj);
        c5591v.m16822a();
        sink.mo79189N0(c5591v.f22119a);
    }

    public static final AbstractC5586q get(String adapterString) {
        Companion.getClass();
        AbstractC22676k.m65750j(adapterString, "adapterString");
        return C5585p.m16803b(adapterString, AbstractC5586q.class.getClassLoader());
    }

    public static final <M extends AbstractC5581l, B extends AbstractC5579j> AbstractC5586q newMessageAdapter(Class<M> type, String typeUrl, EnumC5593x syntax) {
        Companion.getClass();
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(typeUrl, "typeUrl");
        AbstractC22676k.m65750j(syntax, "syntax");
        return AbstractC32120a.m99977c(type, typeUrl, syntax, null, 24);
    }

    public final Object decode(C26624l bytes) throws IOException {
        AbstractC22676k.m65750j(bytes, "bytes");
        C26616h c26616h = new C26616h();
        c26616h.m79217l1(bytes);
        return decode(c26616h);
    }

    public void encodeWithTag(C5591v writer, int i13, Object obj) throws IOException {
        AbstractC22676k.m65750j(writer, "writer");
        if (obj != null) {
            if (getFieldEncoding$wire_runtime() == EnumC5573d.LENGTH_DELIMITED) {
                int iM16823b = writer.m16823b();
                encode(writer, obj);
                writer.m16829h(writer.m16823b() - iM16823b);
            } else {
                encode(writer, obj);
            }
            writer.m16828g(i13, getFieldEncoding$wire_runtime());
        }
    }

    public static final <M extends AbstractC5581l, B extends AbstractC5579j> AbstractC5586q newMessageAdapter(Class<M> type, String typeUrl, EnumC5593x syntax, ClassLoader classLoader) {
        Companion.getClass();
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(typeUrl, "typeUrl");
        AbstractC22676k.m65750j(syntax, "syntax");
        return AbstractC32120a.m99977c(type, typeUrl, syntax, classLoader, 16);
    }

    public final Object decode(InterfaceC26620j source) throws IOException {
        AbstractC22676k.m65750j(source, "source");
        return decode(new C5587r(source));
    }

    public final byte[] encode(Object obj) throws IOException {
        C26616h c26616h = new C26616h();
        encode(c26616h, obj);
        return c26616h.m79201b0(c26616h.f105866x);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC5586q(EnumC5573d enumC5573d, InterfaceC21461d interfaceC21461d, String str, EnumC5593x syntax) {
        this(enumC5573d, interfaceC21461d, str, syntax, null);
        AbstractC22676k.m65750j(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC5586q(EnumC5573d fieldEncoding, InterfaceC21461d interfaceC21461d, String str, EnumC5593x syntax, Object obj) {
        this(fieldEncoding, interfaceC21461d, str, syntax, obj, null);
        AbstractC22676k.m65750j(fieldEncoding, "fieldEncoding");
        AbstractC22676k.m65750j(syntax, "syntax");
    }
}
