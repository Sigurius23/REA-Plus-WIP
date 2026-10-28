package ed3;

import androidx.glance.appwidget.protobuf.AbstractC1400l;
import androidx.room.C1836v0;
import cd3.AbstractC4454f;
import dd3.C11972a;
import dd3.EnumC11973b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.AbstractCollectionSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.ElementMarker;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.MapLikeSerializer;
import kotlinx.serialization.protobuf.internal.ProtobufDecodingException;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import wc3.InterfaceC37137b;
import xc3.AbstractC38195a;
import yb3.AbstractC39421y;
import yc3.AbstractC39440d;
import yc3.AbstractC39447k;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40541d;

/* JADX INFO: renamed from: ed3.m */
/* JADX INFO: loaded from: classes3.dex */
public class C13129m extends AbstractC1400l implements InterfaceC40541d, InterfaceC40539b {

    /* JADX INFO: renamed from: c */
    public final C11972a f45408c;

    /* JADX INFO: renamed from: d */
    public final C13131o f45409d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC39443g f45410e;

    /* JADX INFO: renamed from: f */
    public final int[] f45411f;

    /* JADX INFO: renamed from: g */
    public HashMap f45412g;

    /* JADX INFO: renamed from: h */
    public HashMap f45413h;

    /* JADX INFO: renamed from: i */
    public boolean f45414i;

    /* JADX INFO: renamed from: j */
    public final ElementMarker f45415j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13129m(C11972a c11972a, C13131o c13131o, InterfaceC39443g descriptor) {
        super(2);
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this.f45408c = c11972a;
        this.f45409d = c13131o;
        this.f45410e = descriptor;
        this.f45415j = new ElementMarker(descriptor, new C1836v0(2, this, C13129m.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 7));
        int elementsCount = descriptor.getElementsCount();
        if (elementsCount >= 32) {
            m36735U(descriptor, elementsCount);
            return;
        }
        int i13 = elementsCount + 1;
        int[] iArr = new int[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            iArr[i14] = -1;
        }
        for (int i15 = 0; i15 < elementsCount; i15++) {
            int iM109977L = AbstractC34870c0.m109977L(descriptor, i15, false);
            if (iM109977L > elementsCount || iM109977L == -2) {
                m36735U(descriptor, elementsCount);
                return;
            }
            iArr[iM109977L] = i15;
        }
        this.f45411f = iArr;
    }

    /* JADX INFO: renamed from: K */
    public final Object m36727K(InterfaceC37137b deserializer, Object obj) {
        String string;
        C39448l c39448l = C39448l.f169715c;
        AbstractC22676k.m65750j(deserializer, "deserializer");
        try {
            if (deserializer instanceof MapLikeSerializer) {
                return m36734S(deserializer, obj);
            }
            if (AbstractC22676k.m65745e(deserializer.getDescriptor(), ByteArraySerializer.INSTANCE.getDescriptor())) {
                return m36733R((byte[]) obj);
            }
            return deserializer instanceof AbstractCollectionSerializer ? ((AbstractCollectionSerializer) deserializer).merge(this, obj) : deserializer.deserialize(this);
        } catch (ProtobufDecodingException e5) {
            long jM4428i = m4428i();
            InterfaceC39443g descriptor = deserializer.getDescriptor();
            InterfaceC39443g interfaceC39443g = this.f45410e;
            if (AbstractC22676k.m65745e(interfaceC39443g, descriptor)) {
                string = "Error while decoding " + interfaceC39443g.getSerialName();
            } else if (AbstractC22676k.m65745e(interfaceC39443g.getKind(), C39448l.f169714b) && !AbstractC22676k.m65745e(deserializer.getDescriptor().getKind(), c39448l)) {
                StringBuilder sb4 = new StringBuilder("Error while decoding index ");
                sb4.append(((int) (jM4428i & 2147483647L)) - 1);
                sb4.append(" in repeated field of ");
                sb4.append(deserializer.getDescriptor().getSerialName());
                string = sb4.toString();
            } else if (AbstractC22676k.m65745e(interfaceC39443g.getKind(), c39448l)) {
                int i13 = ((int) (jM4428i & 2147483647L)) - 1;
                StringBuilder sbM30467u = AbstractC11266d.m30467u(i13 / 2, "Error while decoding ", i13 % 2 == 0 ? "key" : "value", " of index ", " in map field of ");
                sbM30467u.append(deserializer.getDescriptor().getSerialName());
                string = sbM30467u.toString();
            } else {
                string = "Error while decoding " + deserializer.getDescriptor().getSerialName() + " at proto number " + ((int) (jM4428i & 2147483647L)) + " of " + interfaceC39443g.getSerialName();
            }
            throw new ProtobufDecodingException(string, e5);
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m36728L(long j7) {
        int iM36731O = m36731O(j7);
        if (iM36731O == 0) {
            return false;
        }
        if (iM36731O == 1) {
            return true;
        }
        throw new SerializationException(AbstractC2875y.m8295h(iM36731O, "Unexpected boolean value: "));
    }

    /* JADX INFO: renamed from: M */
    public final double m36729M(long j7) {
        C13131o c13131o = this.f45409d;
        try {
            return j7 == 19500 ? Double.longBitsToDouble(c13131o.m36755p()) : c13131o.m36750k();
        } catch (ProtobufDecodingException e5) {
            throw new ProtobufDecodingException("Error while decoding proto number " + ((int) (j7 & 2147483647L)) + " of " + this.f45410e.getSerialName(), e5);
        }
    }

    /* JADX INFO: renamed from: N */
    public final float m36730N(long j7) {
        C13131o c13131o = this.f45409d;
        try {
            return j7 == 19500 ? Float.intBitsToFloat(c13131o.m36753n()) : c13131o.m36751l();
        } catch (ProtobufDecodingException e5) {
            throw new ProtobufDecodingException("Error while decoding proto number " + ((int) (j7 & 2147483647L)) + " of " + this.f45410e.getSerialName(), e5);
        }
    }

    /* JADX INFO: renamed from: O */
    public final int m36731O(long j7) {
        C13131o c13131o = this.f45409d;
        try {
            return j7 == 19500 ? c13131o.m36742c(EnumC11973b.DEFAULT) : c13131o.m36752m(AbstractC34870c0.m109983S(j7));
        } catch (ProtobufDecodingException e5) {
            throw new ProtobufDecodingException("Error while decoding proto number " + ((int) (j7 & 2147483647L)) + " of " + this.f45410e.getSerialName(), e5);
        }
    }

    /* JADX INFO: renamed from: P */
    public final long m36732P(long j7) {
        C13131o c13131o = this.f45409d;
        try {
            return j7 == 19500 ? c13131o.m36743d(EnumC11973b.DEFAULT) : c13131o.m36754o(AbstractC34870c0.m109983S(j7));
        } catch (ProtobufDecodingException e5) {
            throw new ProtobufDecodingException("Error while decoding proto number " + ((int) (j7 & 2147483647L)) + " of " + this.f45410e.getSerialName(), e5);
        }
    }

    /* JADX INFO: renamed from: Q */
    public String mo36725Q(long j7) {
        C13131o c13131o = this.f45409d;
        try {
            if (j7 != 19500) {
                return c13131o.m36756q();
            }
            int iM36742c = c13131o.m36742c(EnumC11973b.DEFAULT);
            C13131o.m36740b(iM36742c);
            C13117a c13117a = (C13117a) c13131o.f45424e;
            byte[] bArr = c13117a.f45381a;
            int i13 = c13117a.f45383c;
            String strM125918C = AbstractC39421y.m125918C(i13, i13 + iM36742c, 4, bArr);
            c13117a.f45383c += iM36742c;
            return strM125918C;
        } catch (ProtobufDecodingException e5) {
            throw new ProtobufDecodingException("Error while decoding proto number " + ((int) (j7 & 2147483647L)) + " of " + this.f45410e.getSerialName(), e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [long] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v9, types: [byte[]] */
    /* JADX INFO: renamed from: R */
    public final byte[] m36733R(byte[] bArr) {
        byte[] bArrM36748i;
        byte[] bArrM36749j;
        long jM4428i = m4428i();
        C13131o c13131o = this.f45409d;
        try {
            if (jM4428i == 19500) {
                bArrM36749j = c13131o.m36749j();
            } else {
                bArrM36748i = c13131o.m36748i();
            }
            if (bArr == null) {
                jM4428i = bArrM36748i;
                jM4428i = bArrM36749j;
                return jM4428i;
            }
            jM4428i = bArrM36748i;
            jM4428i = bArrM36749j;
            return AbstractC25260n.m74030F0(bArr, jM4428i);
        } catch (ProtobufDecodingException e5) {
            throw new ProtobufDecodingException("Error while decoding proto number " + ((int) (jM4428i & 2147483647L)) + " of " + this.f45410e.getSerialName(), e5);
        }
    }

    /* JADX INFO: renamed from: S */
    public final LinkedHashMap m36734S(InterfaceC37137b interfaceC37137b, Object obj) {
        AbstractC22676k.m65748h(interfaceC37137b, "null cannot be cast to non-null type kotlinx.serialization.internal.MapLikeSerializer<kotlin.Any?, kotlin.Any?, T of kotlinx.serialization.protobuf.internal.ProtobufDecoder.deserializeMap, *>");
        MapLikeSerializer mapLikeSerializer = (MapLikeSerializer) interfaceC37137b;
        MapEntrySerializer mapEntrySerializerM122334b = AbstractC38195a.m122334b(mapLikeSerializer.getKeySerializer(), mapLikeSerializer.getValueSerializer());
        Map map = obj instanceof Map ? (Map) obj : null;
        Set<Map.Entry> set = (Set) new LinkedHashSetSerializer(mapEntrySerializerM122334b).merge(this, map != null ? map.entrySet() : null);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(set, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Map.Entry entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: T */
    public long mo36721T(InterfaceC39443g interfaceC39443g, int i13) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        return AbstractC34870c0.m109976K(interfaceC39443g, i13);
    }

    /* JADX INFO: renamed from: U */
    public final void m36735U(InterfaceC39443g interfaceC39443g, int i13) {
        HashMap map = new HashMap(i13, 1.0f);
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            if (AbstractC34870c0.m109977L(interfaceC39443g, i15, false) == -2) {
                List listM109979N = AbstractC34870c0.m109979N(interfaceC39443g.getElementDescriptor(i15), this.f45408c.f39316a);
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM109979N, 10));
                Iterator it = listM109979N.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf((int) (AbstractC34870c0.m109976K((InterfaceC39443g) it.next(), 0) & 2147483647L)));
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    map.put(Integer.valueOf(((Number) it3.next()).intValue()), Integer.valueOf(i15));
                }
                i14++;
            } else {
                map.put(Integer.valueOf(AbstractC34870c0.m109977L(interfaceC39443g, i15, false)), Integer.valueOf(i15));
            }
        }
        if (i14 > 0) {
            this.f45413h = new HashMap(i14, 1.0f);
        }
        this.f45412g = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x007a: MOVE (r14 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:33:0x007a */
    public InterfaceC40539b beginStructure(InterfaceC39443g descriptor) {
        Integer num;
        InterfaceC39443g interfaceC39443g = this.f45410e;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        try {
            AbstractC39447k kind = descriptor.getKind();
            C39448l c39448l = C39448l.f169714b;
            boolean zM65745e = AbstractC22676k.m65745e(kind, c39448l);
            C11972a c11972a = this.f45408c;
            C13131o c13131o = this.f45409d;
            try {
                try {
                    if (!zM65745e) {
                        if (!AbstractC22676k.m65745e(kind, C39448l.f169713a) && !AbstractC22676k.m65745e(kind, C39448l.f169716d) && !(kind instanceof AbstractC39440d)) {
                            if (AbstractC22676k.m65745e(kind, C39448l.f169715c)) {
                                return new C13119c(c11972a, new C13131o(m4428i() == 19500 ? c13131o.m36745f() : c13131o.m36744e()), m4428i(), descriptor);
                            }
                            throw new SerializationException("Primitives are not supported at top-level");
                        }
                        long jM4428i = m4428i();
                        if (jM4428i == 19500 && AbstractC22676k.m65745e(interfaceC39443g, descriptor)) {
                            return this;
                        }
                        if (!AbstractC34870c0.m109989Z(jM4428i)) {
                            return new C13129m(c11972a, AbstractC34924m.m110150k(c13131o, jM4428i), descriptor);
                        }
                        int i13 = ((int) (jM4428i & 2147483647L)) - 1;
                        HashMap map = this.f45413h;
                        if (map != null && (num = (Integer) map.get(Integer.valueOf(i13))) != null) {
                            jM4428i = (jM4428i & 1152921500311879680L) | ((long) num.intValue());
                        }
                        return new C13125i(c11972a, c13131o, jM4428i, descriptor);
                    }
                    long jM4428i2 = m4428i();
                    if (AbstractC22676k.m65745e(interfaceC39443g.getKind(), c39448l) && jM4428i2 != 19500 && !interfaceC39443g.equals(descriptor)) {
                        C13131o c13131oM110150k = AbstractC34924m.m110150k(c13131o, jM4428i2);
                        c13131oM110150k.m36757r();
                        EnumC11973b enumC11973b = EnumC11973b.DEFAULT;
                        return new C13133q(c11972a, c13131oM110150k, 1, descriptor);
                    }
                    try {
                        return (((EnumC13128l) c13131o.f45425f) == EnumC13128l.SIZE_DELIMITED && AbstractC34870c0.m109991a0(descriptor.getElementDescriptor(0))) ? new C13126j(c11972a, new C13131o(c13131o.m36744e()), descriptor) : new C13133q(c11972a, c13131o, jM4428i2, descriptor);
                    } catch (ProtobufDecodingException e5) {
                        e = e5;
                        descriptor = descriptor;
                        InterfaceC39443g interfaceC39443g2 = descriptor;
                        throw new ProtobufDecodingException("Fail to begin structure for " + interfaceC39443g2.getSerialName() + " in " + interfaceC39443g.getSerialName() + " at proto number " + ((int) (m4428i() & 2147483647L)), e);
                    }
                } catch (ProtobufDecodingException e13) {
                    e = e13;
                    throw new ProtobufDecodingException("Fail to begin structure for " + interfaceC39443g2.getSerialName() + " in " + interfaceC39443g.getSerialName() + " at proto number " + ((int) (m4428i() & 2147483647L)), e);
                }
            } catch (ProtobufDecodingException e14) {
                e = e14;
                throw new ProtobufDecodingException("Fail to begin structure for " + interfaceC39443g2.getSerialName() + " in " + interfaceC39443g.getSerialName() + " at proto number " + ((int) (m4428i() & 2147483647L)), e);
            }
        } catch (ProtobufDecodingException e15) {
            e = e15;
        }
    }

    @Override // zc3.InterfaceC40541d
    public final boolean decodeBoolean() {
        return m36728L(m4431o());
    }

    @Override // zc3.InterfaceC40539b
    public final boolean decodeBooleanElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return m36728L(mo36721T(descriptor, i13));
    }

    @Override // zc3.InterfaceC40541d
    public final byte decodeByte() {
        return (byte) m36731O(m4431o());
    }

    @Override // zc3.InterfaceC40539b
    public final byte decodeByteElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return (byte) m36731O(mo36721T(descriptor, i13));
    }

    @Override // zc3.InterfaceC40541d
    public final char decodeChar() {
        return (char) m36731O(m4431o());
    }

    @Override // zc3.InterfaceC40539b
    public final char decodeCharElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return (char) m36731O(mo36721T(descriptor, i13));
    }

    @Override // zc3.InterfaceC40539b
    public final int decodeCollectionSize(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return -1;
    }

    @Override // zc3.InterfaceC40541d
    public final double decodeDouble() {
        return m36729M(m4431o());
    }

    @Override // zc3.InterfaceC40539b
    public final double decodeDoubleElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return m36729M(mo36721T(descriptor, i13));
    }

    public int decodeElementIndex(InterfaceC39443g descriptor) {
        int iIntValue;
        HashMap map;
        C13131o c13131o = this.f45409d;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        while (true) {
            try {
                int iM36757r = c13131o.m36757r();
                ElementMarker elementMarker = this.f45415j;
                if (iM36757r == -1) {
                    return elementMarker.nextUnmarkedIndex();
                }
                if (iM36757r == 0) {
                    throw new SerializationException("0 is not allowed as the protobuf field number in " + descriptor.getSerialName() + ", the input bytes may have been corrupted");
                }
                int[] iArr = this.f45411f;
                if (iArr != null) {
                    iIntValue = (iM36757r < 0 || iM36757r >= iArr.length) ? -1 : iArr[iM36757r];
                } else {
                    HashMap map2 = this.f45412g;
                    AbstractC22676k.m65747g(map2);
                    Object obj = map2.get(Integer.valueOf(iM36757r));
                    if (obj == null) {
                        obj = -1;
                    }
                    iIntValue = ((Number) obj).intValue();
                }
                if (iIntValue != -1) {
                    if (AbstractC34870c0.m109989Z(AbstractC34870c0.m109976K(descriptor, iIntValue)) && (map = this.f45413h) != null) {
                    }
                    elementMarker.mark(iIntValue);
                    return iIntValue;
                }
                c13131o.m36758s();
            } catch (ProtobufDecodingException e5) {
                throw new ProtobufDecodingException("Fail to get element index for " + descriptor.getSerialName() + " in " + this.f45410e.getSerialName(), e5);
            }
        }
    }

    @Override // zc3.InterfaceC40541d
    public final int decodeEnum(InterfaceC39443g enumDescriptor) {
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
        int iM36731O = m36731O(m4431o());
        if (iM36731O < enumDescriptor.getElementsCount() && iM36731O >= 0 && AbstractC34870c0.m109977L(enumDescriptor, iM36731O, true) == iM36731O) {
            return iM36731O;
        }
        int elementsCount = enumDescriptor.getElementsCount();
        for (int i13 = 0; i13 < elementsCount; i13++) {
            if (AbstractC34870c0.m109977L(enumDescriptor, i13, true) == iM36731O) {
                return i13;
            }
        }
        throw new ProtobufDecodingException(iM36731O + " is not among valid " + this.f45410e.getSerialName() + " enum proto numbers", null);
    }

    @Override // zc3.InterfaceC40541d
    public final float decodeFloat() {
        return m36730N(m4431o());
    }

    @Override // zc3.InterfaceC40539b
    public final float decodeFloatElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return m36730N(mo36721T(descriptor, i13));
    }

    @Override // zc3.InterfaceC40541d
    public final InterfaceC40541d decodeInline(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        m4433r(m4430n());
        return this;
    }

    @Override // zc3.InterfaceC40539b
    public final InterfaceC40541d decodeInlineElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        long jMo36721T = mo36721T(descriptor, i13);
        InterfaceC39443g inlineDescriptor = descriptor.getElementDescriptor(i13);
        AbstractC22676k.m65750j(inlineDescriptor, "inlineDescriptor");
        m4433r(jMo36721T);
        return this;
    }

    @Override // zc3.InterfaceC40541d
    public final int decodeInt() {
        return m36731O(m4431o());
    }

    @Override // zc3.InterfaceC40539b
    public final int decodeIntElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return m36731O(mo36721T(descriptor, i13));
    }

    @Override // zc3.InterfaceC40541d
    public final long decodeLong() {
        return m36732P(m4431o());
    }

    @Override // zc3.InterfaceC40539b
    public final long decodeLongElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return m36732P(mo36721T(descriptor, i13));
    }

    @Override // zc3.InterfaceC40541d
    public final boolean decodeNotNullMark() {
        return !this.f45414i;
    }

    @Override // zc3.InterfaceC40541d
    public final Void decodeNull() {
        return null;
    }

    @Override // zc3.InterfaceC40539b
    public final Object decodeNullableSerializableElement(InterfaceC39443g descriptor, int i13, InterfaceC37137b deserializer, Object obj) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(deserializer, "deserializer");
        m4433r(mo36721T(descriptor, i13));
        if (this.f45414i) {
            return null;
        }
        return m36727K(deserializer, obj);
    }

    @Override // zc3.InterfaceC40539b
    public final boolean decodeSequentially() {
        return false;
    }

    @Override // zc3.InterfaceC40539b
    public final Object decodeSerializableElement(InterfaceC39443g descriptor, int i13, InterfaceC37137b deserializer, Object obj) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(deserializer, "deserializer");
        m4433r(mo36721T(descriptor, i13));
        return m36727K(deserializer, obj);
    }

    @Override // zc3.InterfaceC40541d
    public final Object decodeSerializableValue(InterfaceC37137b deserializer) {
        AbstractC22676k.m65750j(deserializer, "deserializer");
        return m36727K(deserializer, null);
    }

    @Override // zc3.InterfaceC40541d
    public final short decodeShort() {
        return (short) m36731O(m4431o());
    }

    @Override // zc3.InterfaceC40539b
    public final short decodeShortElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return (short) m36731O(mo36721T(descriptor, i13));
    }

    @Override // zc3.InterfaceC40541d
    public final String decodeString() {
        return mo36725Q(m4431o());
    }

    @Override // zc3.InterfaceC40539b
    public final String decodeStringElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return mo36725Q(mo36721T(descriptor, i13));
    }

    @Override // zc3.InterfaceC40539b
    public final void endStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
    }

    @Override // zc3.InterfaceC40541d, zc3.InterfaceC40539b
    public final AbstractC4454f getSerializersModule() {
        return this.f45408c.f39316a;
    }
}
