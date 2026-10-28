package ed3;

import androidx.glance.appwidget.protobuf.AbstractC1400l;
import cd3.AbstractC4454f;
import dd3.C11972a;
import dd3.EnumC11973b;
import e10.C12554k0;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.MapLikeSerializer;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yb3.AbstractC39421y;
import yc3.AbstractC39440d;
import yc3.AbstractC39447k;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: ed3.n */
/* JADX INFO: loaded from: classes3.dex */
public class C13130n extends AbstractC1400l implements InterfaceC40542e, InterfaceC40540c {

    /* JADX INFO: renamed from: c */
    public EnumC13132p f45416c;

    /* JADX INFO: renamed from: d */
    public final C11972a f45417d;

    /* JADX INFO: renamed from: e */
    public final C12554k0 f45418e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC39443g f45419f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13130n(C11972a proto, C12554k0 writer, InterfaceC39443g descriptor) {
        super(2);
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(writer, "writer");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this.f45416c = EnumC13132p.f45426E;
        this.f45417d = proto;
        this.f45418e = writer;
        this.f45419f = descriptor;
    }

    /* JADX INFO: renamed from: K */
    public final void m36736K(long j7, double d3) {
        C12554k0 c12554k0 = this.f45418e;
        if (j7 == 19500) {
            ((C13118b) c12554k0.f42881x).m36720d(Long.reverseBytes(Double.doubleToRawLongBits(d3)));
            return;
        }
        C12554k0.m35216o(c12554k0, (C13118b) c12554k0.f42881x, EnumC13128l.i64.m36726a((int) (j7 & 2147483647L)));
        ((C13118b) c12554k0.f42881x).m36720d(Long.reverseBytes(Double.doubleToRawLongBits(d3)));
    }

    /* JADX INFO: renamed from: L */
    public final void m36737L(float f13, long j7) {
        C12554k0 c12554k0 = this.f45418e;
        if (j7 == 19500) {
            ((C13118b) c12554k0.f42881x).m36719c(Integer.reverseBytes(Float.floatToRawIntBits(f13)));
            return;
        }
        C12554k0.m35216o(c12554k0, (C13118b) c12554k0.f42881x, EnumC13128l.i32.m36726a((int) (j7 & 2147483647L)));
        ((C13118b) c12554k0.f42881x).m36719c(Integer.reverseBytes(Float.floatToRawIntBits(f13)));
    }

    /* JADX INFO: renamed from: M */
    public final void m36738M(int i13, long j7) {
        C12554k0 c12554k0 = this.f45418e;
        if (j7 == 19500) {
            C12554k0.m35216o(c12554k0, (C13118b) c12554k0.f42881x, i13);
        } else {
            c12554k0.m35228Q(i13, (int) (2147483647L & j7), AbstractC34870c0.m109983S(j7));
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m36739N(long j7, long j13) {
        C12554k0 c12554k0 = this.f45418e;
        if (j7 == 19500) {
            c12554k0.m35239p((C13118b) c12554k0.f42881x, j13, EnumC11973b.DEFAULT);
            return;
        }
        int i13 = (int) (2147483647L & j7);
        EnumC11973b enumC11973bM109983S = AbstractC34870c0.m109983S(j7);
        c12554k0.getClass();
        C13118b c13118b = (C13118b) c12554k0.f42881x;
        C12554k0.m35216o(c12554k0, c13118b, (enumC11973bM109983S == EnumC11973b.FIXED ? EnumC13128l.i64 : EnumC13128l.VARINT).m36726a(i13));
        c12554k0.m35239p(c13118b, j13, enumC11973bM109983S);
    }

    /* JADX INFO: renamed from: O */
    public void mo36724O(long j7, String value) {
        AbstractC22676k.m65750j(value, "value");
        C12554k0 c12554k0 = this.f45418e;
        if (j7 == 19500) {
            c12554k0.getClass();
            c12554k0.m35227P(AbstractC39421y.m125919D(value));
            return;
        }
        c12554k0.getClass();
        byte[] bArrM125919D = AbstractC39421y.m125919D(value);
        C12554k0.m35216o(c12554k0, (C13118b) c12554k0.f42881x, EnumC13128l.SIZE_DELIMITED.m36726a((int) (j7 & 2147483647L)));
        c12554k0.m35227P(bArrM125919D);
    }

    /* JADX INFO: renamed from: P */
    public void mo36723P(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
    }

    /* JADX INFO: renamed from: Q */
    public long mo36722Q(InterfaceC39443g interfaceC39443g, int i13) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        return AbstractC34870c0.m109976K(interfaceC39443g, i13);
    }

    public InterfaceC40540c beginCollection(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC39447k kind = descriptor.getKind();
        C39448l c39448l = C39448l.f169714b;
        if (!AbstractC22676k.m65745e(kind, c39448l)) {
            if (AbstractC22676k.m65745e(kind, C39448l.f169715c)) {
                return new C13120d(((long[]) this.f5934b)[this.f5933a], this.f45417d, this.f45418e, descriptor);
            }
            throw new SerializationException("This serial kind is not supported as collection: " + descriptor);
        }
        long jM4428i = m4428i();
        if ((4294967296L & jM4428i) != 0 && AbstractC34870c0.m109991a0(descriptor.getElementDescriptor(0))) {
            return new C13127k(m4428i(), this.f45417d, this.f45418e, descriptor);
        }
        if (jM4428i == 19500) {
            C12554k0 c12554k0 = this.f45418e;
            C12554k0.m35216o(c12554k0, (C13118b) c12554k0.f42881x, i13);
        }
        InterfaceC39443g interfaceC39443g = this.f45419f;
        if (!AbstractC22676k.m65745e(interfaceC39443g.getKind(), c39448l) || jM4428i == 19500 || interfaceC39443g.equals(descriptor)) {
            return new C13134r(jM4428i, this.f45417d, this.f45418e, descriptor);
        }
        return new C13121e(this.f45417d, this.f45418e, jM4428i, descriptor, new C13118b());
    }

    public InterfaceC40540c beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC39447k kind = descriptor.getKind();
        if (AbstractC22676k.m65745e(kind, C39448l.f169714b)) {
            if (!AbstractC34870c0.m109991a0(descriptor.getElementDescriptor(0)) || (m4428i() & 4294967296L) == 0) {
                return new C13134r(m4428i(), this.f45417d, this.f45418e, descriptor);
            }
            return new C13127k(m4428i(), this.f45417d, this.f45418e, descriptor);
        }
        if (!AbstractC22676k.m65745e(kind, C39448l.f169713a) && !AbstractC22676k.m65745e(kind, C39448l.f169716d) && !(kind instanceof AbstractC39440d)) {
            if (AbstractC22676k.m65745e(kind, C39448l.f169715c)) {
                return new C13120d(m4428i(), this.f45417d, this.f45418e, descriptor);
            }
            throw new SerializationException("This serial kind is not supported as structure: " + descriptor);
        }
        long jM4428i = m4428i();
        if (jM4428i == 19500 && descriptor.equals(this.f45419f)) {
            return this;
        }
        if (AbstractC34870c0.m109989Z(jM4428i)) {
            return new C13124h(this.f45417d, this.f45418e, descriptor);
        }
        return new C13121e(m4428i(), this.f45417d, this.f45418e, descriptor);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeBoolean(boolean z4) {
        m36738M(z4 ? 1 : 0, m4431o());
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeBooleanElement(InterfaceC39443g descriptor, int i13, boolean z4) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        m36738M(z4 ? 1 : 0, mo36722Q(descriptor, i13));
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeByte(byte b) {
        m36738M(b, m4431o());
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeByteElement(InterfaceC39443g descriptor, int i13, byte b) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        m36738M(b, mo36722Q(descriptor, i13));
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeChar(char c3) {
        m36738M(c3, m4431o());
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeCharElement(InterfaceC39443g descriptor, int i13, char c3) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        m36738M(c3, mo36722Q(descriptor, i13));
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeDouble(double d3) {
        m36736K(m4431o(), d3);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeDoubleElement(InterfaceC39443g descriptor, int i13, double d3) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        m36736K(mo36722Q(descriptor, i13), d3);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeEnum(InterfaceC39443g enumDescriptor, int i13) {
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
        long jM4431o = m4431o();
        int iM109977L = AbstractC34870c0.m109977L(enumDescriptor, i13, true);
        C12554k0 c12554k0 = this.f45418e;
        if (jM4431o == 19500) {
            C12554k0.m35216o(c12554k0, (C13118b) c12554k0.f42881x, iM109977L);
        } else {
            c12554k0.m35228Q(iM109977L, (int) (jM4431o & 2147483647L), EnumC11973b.DEFAULT);
        }
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeFloat(float f13) {
        m36737L(f13, m4431o());
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeFloatElement(InterfaceC39443g descriptor, int i13, float f13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        m36737L(f13, mo36722Q(descriptor, i13));
    }

    public InterfaceC40542e encodeInline(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        m4433r(m4430n());
        return this;
    }

    @Override // zc3.InterfaceC40540c
    public final InterfaceC40542e encodeInlineElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        long jMo36722Q = mo36722Q(descriptor, i13);
        InterfaceC39443g inlineDescriptor = descriptor.getElementDescriptor(i13);
        AbstractC22676k.m65750j(inlineDescriptor, "inlineDescriptor");
        m4433r(jMo36722Q);
        return this;
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeInt(int i13) {
        m36738M(i13, m4431o());
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeIntElement(InterfaceC39443g descriptor, int i13, int i14) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        m36738M(i14, mo36722Q(descriptor, i13));
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeLong(long j7) {
        m36739N(m4431o(), j7);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeLongElement(InterfaceC39443g descriptor, int i13, long j7) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        m36739N(mo36722Q(descriptor, i13), j7);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeNotNullMark() {
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeNull() {
        String str;
        EnumC13132p enumC13132p = this.f45416c;
        if (enumC13132p != EnumC13132p.f45428w) {
            int iOrdinal = enumC13132p.ordinal();
            if (iOrdinal == 1) {
                str = "'null' is not supported for optional properties in ProtoBuf";
            } else if (iOrdinal == 2) {
                str = "'null' is not supported as the value of collection types in ProtoBuf";
            } else if (iOrdinal != 3) {
                str = iOrdinal != 4 ? "'null' is not supported in ProtoBuf" : "'null' is not allowed for not-null properties";
            } else {
                str = "'null' is not supported as the value of a list element in ProtoBuf";
            }
            throw new SerializationException(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    @Override // zc3.InterfaceC40540c
    public final void encodeNullableSerializableElement(InterfaceC39443g descriptor, int i13, InterfaceC37145j serializer, Object obj) {
        EnumC13132p enumC13132p;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(serializer, "serializer");
        if (descriptor.isElementOptional(i13)) {
            enumC13132p = EnumC13132p.f45429x;
        } else {
            AbstractC39447k kind = descriptor.getElementDescriptor(i13).getKind();
            if (AbstractC22676k.m65745e(kind, C39448l.f169715c)) {
                enumC13132p = EnumC13132p.f45430y;
            } else {
                C39448l c39448l = C39448l.f169714b;
                if (AbstractC22676k.m65745e(kind, c39448l)) {
                    enumC13132p = EnumC13132p.f45430y;
                } else {
                    enumC13132p = AbstractC22676k.m65745e(descriptor.getKind(), c39448l) ? EnumC13132p.f45431z : EnumC13132p.f45428w;
                }
            }
        }
        this.f45416c = enumC13132p;
        m4433r(mo36722Q(descriptor, i13));
        super.encodeNullableSerializableValue(serializer, obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    @Override // zc3.InterfaceC40540c
    public final void encodeSerializableElement(InterfaceC39443g descriptor, int i13, InterfaceC37145j serializer, Object obj) {
        EnumC13132p enumC13132p;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(serializer, "serializer");
        if (descriptor.isElementOptional(i13)) {
            enumC13132p = EnumC13132p.f45429x;
        } else {
            InterfaceC39443g elementDescriptor = descriptor.getElementDescriptor(i13);
            if (elementDescriptor.isNullable()) {
                AbstractC39447k kind = elementDescriptor.getKind();
                if (AbstractC22676k.m65745e(kind, C39448l.f169715c)) {
                    enumC13132p = EnumC13132p.f45430y;
                } else {
                    C39448l c39448l = C39448l.f169714b;
                    if (AbstractC22676k.m65745e(kind, c39448l)) {
                        enumC13132p = EnumC13132p.f45430y;
                    } else {
                        enumC13132p = AbstractC22676k.m65745e(descriptor.getKind(), c39448l) ? EnumC13132p.f45431z : EnumC13132p.f45428w;
                    }
                }
            } else {
                enumC13132p = EnumC13132p.f45426E;
            }
        }
        this.f45416c = enumC13132p;
        m4433r(mo36722Q(descriptor, i13));
        encodeSerializableValue(serializer, obj);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeSerializableValue(InterfaceC37145j serializer, Object obj) {
        AbstractC22676k.m65750j(serializer, "serializer");
        if (serializer instanceof MapLikeSerializer) {
            MapLikeSerializer mapLikeSerializer = (MapLikeSerializer) serializer;
            LinkedHashSetSerializer linkedHashSetSerializer = new LinkedHashSetSerializer(AbstractC38195a.m122334b(mapLikeSerializer.getKeySerializer(), mapLikeSerializer.getValueSerializer()));
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            linkedHashSetSerializer.serialize(this, ((Map) obj).entrySet());
            return;
        }
        if (!AbstractC22676k.m65745e(serializer.getDescriptor(), ByteArraySerializer.INSTANCE.getDescriptor())) {
            serializer.serialize(this, obj);
            return;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        byte[] bArr = (byte[]) obj;
        long jM4431o = m4431o();
        C12554k0 c12554k0 = this.f45418e;
        if (jM4431o == 19500) {
            c12554k0.m35227P(bArr);
            return;
        }
        c12554k0.getClass();
        C12554k0.m35216o(c12554k0, (C13118b) c12554k0.f42881x, EnumC13128l.SIZE_DELIMITED.m36726a((int) (jM4431o & 2147483647L)));
        c12554k0.m35227P(bArr);
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeShort(short s13) {
        m36738M(s13, m4431o());
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeShortElement(InterfaceC39443g descriptor, int i13, short s13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        m36738M(s13, mo36722Q(descriptor, i13));
    }

    @Override // zc3.InterfaceC40542e
    public final void encodeString(String value) {
        AbstractC22676k.m65750j(value, "value");
        mo36724O(m4431o(), value);
    }

    @Override // zc3.InterfaceC40540c
    public final void encodeStringElement(InterfaceC39443g descriptor, int i13, String value) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(value, "value");
        mo36724O(mo36722Q(descriptor, i13), value);
    }

    @Override // zc3.InterfaceC40540c
    public final void endStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (this.f5933a >= 0) {
            m4430n();
        }
        mo36723P(descriptor);
    }

    @Override // zc3.InterfaceC40542e
    public final AbstractC4454f getSerializersModule() {
        return this.f45417d.f39316a;
    }

    @Override // zc3.InterfaceC40540c
    public final boolean shouldEncodeElementDefault(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this.f45417d.getClass();
        return false;
    }
}
