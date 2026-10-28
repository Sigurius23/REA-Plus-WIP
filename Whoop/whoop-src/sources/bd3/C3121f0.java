package bd3;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.C0766i;
import ad3.InterfaceC0768k;
import ae3.C0803k;
import cd3.AbstractC4454f;
import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.JsonDecodingException;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import r80.AbstractC31061c;
import va3.AbstractC35846d;
import va3.AbstractC35854l;
import wc3.InterfaceC37137b;
import yb3.AbstractC39414r;
import yc3.C39446j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40541d;

/* JADX INFO: renamed from: bd3.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3121f0 extends AbstractC35846d implements InterfaceC0768k {

    /* JADX INFO: renamed from: a */
    public final AbstractC0757c f12245a;

    /* JADX INFO: renamed from: b */
    public final EnumC3133l0 f12246b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3110a f12247c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4454f f12248d;

    /* JADX INFO: renamed from: e */
    public int f12249e;

    /* JADX INFO: renamed from: f */
    public C3119e0 f12250f;

    /* JADX INFO: renamed from: g */
    public final C0766i f12251g;

    /* JADX INFO: renamed from: h */
    public final C3137p f12252h;

    public C3121f0(AbstractC0757c json, EnumC3133l0 enumC3133l0, AbstractC3110a abstractC3110a, InterfaceC39443g descriptor, C3119e0 c3119e0) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this.f12245a = json;
        this.f12246b = enumC3133l0;
        this.f12247c = abstractC3110a;
        this.f12248d = json.f2764b;
        this.f12249e = -1;
        this.f12250f = c3119e0;
        C0766i c0766i = json.f2763a;
        this.f12251g = c0766i;
        this.f12252h = c0766i.f2794f ? null : new C3137p(descriptor);
    }

    @Override // ad3.InterfaceC0768k
    /* JADX INFO: renamed from: a */
    public final AbstractC0757c mo1837a() {
        return this.f12245a;
    }

    @Override // ad3.InterfaceC0768k
    /* JADX INFO: renamed from: b */
    public final JsonElement mo1838b() {
        return new C3115c0(this.f12245a.f2763a, this.f12247c).m8979b();
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final InterfaceC40539b beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC0757c abstractC0757c = this.f12245a;
        EnumC3133l0 enumC3133l0M9025u = AbstractC3138q.m9025u(abstractC0757c, descriptor);
        AbstractC3110a abstractC3110a = this.f12247c;
        C0803k c0803k = abstractC3110a.f12211b;
        int i13 = c0803k.f2964b + 1;
        c0803k.f2964b = i13;
        if (i13 == ((Object[]) c0803k.f2965c).length) {
            c0803k.m1948f();
        }
        ((Object[]) c0803k.f2965c)[i13] = descriptor;
        abstractC3110a.mo8955h(enumC3133l0M9025u.f12287w);
        if (abstractC3110a.m8968w() == 4) {
            AbstractC3110a.m8942r(abstractC3110a, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = enumC3133l0M9025u.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new C3121f0(this.f12245a, enumC3133l0M9025u, abstractC3110a, descriptor, this.f12250f);
        }
        return (this.f12246b == enumC3133l0M9025u && abstractC0757c.f2763a.f2794f) ? this : new C3121f0(this.f12245a, enumC3133l0M9025u, abstractC3110a, descriptor, this.f12250f);
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final boolean decodeBoolean() {
        boolean z4;
        boolean z13;
        AbstractC3110a abstractC3110a = this.f12247c;
        int iMo8971z = abstractC3110a.mo8971z();
        if (iMo8971z == abstractC3110a.mo8966t().length()) {
            AbstractC3110a.m8942r(abstractC3110a, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC3110a.mo8966t().charAt(iMo8971z) == '\"') {
            iMo8971z++;
            z4 = true;
        } else {
            z4 = false;
        }
        int iMo8970y = abstractC3110a.mo8970y(iMo8971z);
        if (iMo8970y >= abstractC3110a.mo8966t().length() || iMo8970y == -1) {
            AbstractC3110a.m8942r(abstractC3110a, "EOF", 0, null, 6);
            throw null;
        }
        int i13 = iMo8970y + 1;
        int iCharAt = abstractC3110a.mo8966t().charAt(iMo8970y) | ' ';
        if (iCharAt == 102) {
            abstractC3110a.m8951d(i13, "alse");
            z13 = false;
        } else {
            if (iCharAt != 116) {
                AbstractC3110a.m8942r(abstractC3110a, "Expected valid boolean literal prefix, but had '" + abstractC3110a.m8959l() + '\'', 0, null, 6);
                throw null;
            }
            abstractC3110a.m8951d(i13, "rue");
            z13 = true;
        }
        if (!z4) {
            return z13;
        }
        if (abstractC3110a.f12210a == abstractC3110a.mo8966t().length()) {
            AbstractC3110a.m8942r(abstractC3110a, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC3110a.mo8966t().charAt(abstractC3110a.f12210a) == '\"') {
            abstractC3110a.f12210a++;
            return z13;
        }
        AbstractC3110a.m8942r(abstractC3110a, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final byte decodeByte() {
        AbstractC3110a abstractC3110a = this.f12247c;
        long jM8956i = abstractC3110a.m8956i();
        byte b = (byte) jM8956i;
        if (jM8956i == b) {
            return b;
        }
        AbstractC3110a.m8942r(abstractC3110a, "Failed to parse byte for input '" + jM8956i + '\'', 0, null, 6);
        throw null;
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final char decodeChar() {
        AbstractC3110a abstractC3110a = this.f12247c;
        String strM8959l = abstractC3110a.m8959l();
        if (strM8959l.length() == 1) {
            return strM8959l.charAt(0);
        }
        AbstractC3110a.m8942r(abstractC3110a, AbstractC31061c.m95633i('\'', "Expected single char, but got '", strM8959l), 0, null, 6);
        throw null;
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final double decodeDouble() {
        AbstractC3110a abstractC3110a = this.f12247c;
        String strM8959l = abstractC3110a.m8959l();
        try {
            double d3 = Double.parseDouble(strM8959l);
            if (this.f12245a.f2763a.f2798j || Math.abs(d3) <= Double.MAX_VALUE) {
                return d3;
            }
            AbstractC3138q.m9026v(abstractC3110a, Double.valueOf(d3));
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC3110a.m8942r(abstractC3110a, AbstractC31061c.m95633i('\'', "Failed to parse type 'double' for input '", strM8959l), 0, null, 6);
            throw null;
        }
    }

    @Override // zc3.InterfaceC40539b
    public final int decodeElementIndex(InterfaceC39443g descriptor) {
        int iM9018n;
        boolean z4;
        boolean z13;
        char c3;
        String strM8969x;
        AbstractC3110a abstractC3110a = this.f12247c;
        C0803k c0803k = abstractC3110a.f12211b;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        EnumC3133l0 enumC3133l0 = this.f12246b;
        int iOrdinal = enumC3133l0.ordinal();
        char c7 = ':';
        boolean zM8945B = false;
        AbstractC0757c abstractC0757c = this.f12245a;
        boolean z14 = true;
        int iNextUnmarkedIndex = -1;
        if (iOrdinal == 0) {
            boolean zM8945B2 = abstractC3110a.m8945B();
            while (true) {
                boolean zMo8950c = abstractC3110a.mo8950c();
                C3137p c3137p = this.f12252h;
                if (zMo8950c) {
                    C0766i c0766i = this.f12251g;
                    boolean z15 = c0766i.f2791c;
                    String strM8960m = z15 ? abstractC3110a.m8960m() : abstractC3110a.mo8952e();
                    abstractC3110a.mo8955h(c7);
                    iM9018n = AbstractC3138q.m9018n(descriptor, abstractC0757c, strM8960m);
                    int i13 = iNextUnmarkedIndex;
                    if (iM9018n != -3) {
                        if (c0766i.f2796h) {
                            boolean zIsElementOptional = descriptor.isElementOptional(iM9018n);
                            InterfaceC39443g elementDescriptor = descriptor.getElementDescriptor(iM9018n);
                            if (!zIsElementOptional || elementDescriptor.isNullable() || !abstractC3110a.m8946C(z14)) {
                                if (AbstractC22676k.m65745e(elementDescriptor.getKind(), C39446j.f169712a) && ((!elementDescriptor.isNullable() || !abstractC3110a.m8946C(false)) && (strM8969x = abstractC3110a.m8969x(z15)) != null)) {
                                    int iM9018n2 = AbstractC3138q.m9018n(elementDescriptor, abstractC0757c, strM8969x);
                                    boolean z16 = !abstractC0757c.f2763a.f2794f && elementDescriptor.isNullable();
                                    if (iM9018n2 == -3 && (zIsElementOptional || z16)) {
                                        abstractC3110a.m8957j();
                                    }
                                }
                            }
                            zM8945B2 = abstractC3110a.m8945B();
                            z4 = false;
                        }
                        if (c3137p != null) {
                            c3137p.f12294a.mark(iM9018n);
                        }
                    } else {
                        zM8945B2 = false;
                        z4 = true;
                    }
                    if (z4) {
                        if (!AbstractC3138q.m9020p(abstractC0757c, descriptor)) {
                            C3119e0 c3119e0 = this.f12250f;
                            if (c3119e0 == null || !AbstractC22676k.m65745e(c3119e0.f12243b, strM8960m)) {
                                int i14 = c0803k.f2964b;
                                int[] iArr = (int[]) c0803k.f2966d;
                                if (iArr[i14] == -2) {
                                    iArr[i14] = i13;
                                    c0803k.f2964b = i14 - 1;
                                }
                                int i15 = c0803k.f2964b;
                                if (i15 != i13) {
                                    c0803k.f2964b = i15 + i13;
                                }
                                int iM125893l0 = AbstractC39414r.m125893l0(abstractC3110a.mo8944A(0, abstractC3110a.f12210a), strM8960m, 0, 6);
                                StringBuilder sbM30467u = AbstractC11266d.m30467u(iM125893l0, "Encountered an unknown key '", strM8960m, "' at offset ", " at path: ");
                                sbM30467u.append(c0803k.m1945c());
                                sbM30467u.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                                sbM30467u.append((Object) AbstractC3138q.m9022r(iM125893l0, abstractC3110a.mo8966t()));
                                throw new JsonDecodingException(sbM30467u.toString());
                            }
                            c3119e0.f12243b = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bM8968w = abstractC3110a.m8968w();
                        if (bM8968w == 8 || bM8968w == 6) {
                            while (true) {
                                byte bM8968w2 = abstractC3110a.m8968w();
                                z13 = true;
                                if (bM8968w2 != 1) {
                                    c3 = 6;
                                    if (bM8968w2 == 8 || bM8968w2 == 6) {
                                        arrayList.add(Byte.valueOf(bM8968w2));
                                    } else {
                                        if (bM8968w2 == 9) {
                                            if (((Number) AbstractC25265s.m74112P0(arrayList)).byteValue() != 8) {
                                                throw AbstractC3138q.m9008d(abstractC3110a.mo8966t(), abstractC3110a.f12210a, "found ] instead of } at path: " + c0803k);
                                            }
                                            AbstractC25265s.m74134l1(arrayList);
                                        } else if (bM8968w2 == 7) {
                                            if (((Number) AbstractC25265s.m74112P0(arrayList)).byteValue() != 6) {
                                                throw AbstractC3138q.m9008d(abstractC3110a.mo8966t(), abstractC3110a.f12210a, "found } instead of ] at path: " + c0803k);
                                            }
                                            AbstractC25265s.m74134l1(arrayList);
                                        } else if (bM8968w2 == 10) {
                                            AbstractC3110a.m8942r(abstractC3110a, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        c3 = 6;
                                    }
                                    abstractC3110a.mo8953f();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z15) {
                                    abstractC3110a.m8959l();
                                } else {
                                    abstractC3110a.mo8952e();
                                }
                            }
                        } else {
                            abstractC3110a.m8959l();
                            z13 = true;
                            c3 = 6;
                        }
                        zM8945B2 = abstractC3110a.m8945B();
                        z14 = z13;
                        iNextUnmarkedIndex = i13;
                        c7 = ':';
                    } else {
                        iNextUnmarkedIndex = i13;
                        c7 = ':';
                        z14 = true;
                    }
                } else {
                    iM9018n = iNextUnmarkedIndex;
                    if (zM8945B2) {
                        C0766i c0766i2 = abstractC0757c.f2763a;
                        AbstractC3138q.m9021q(abstractC3110a, "object");
                        throw null;
                    }
                    if (c3137p != null) {
                        iNextUnmarkedIndex = c3137p.f12294a.nextUnmarkedIndex();
                    }
                }
                iNextUnmarkedIndex = iM9018n;
            }
        } else if (iOrdinal != 2) {
            boolean zM8945B3 = abstractC3110a.m8945B();
            if (abstractC3110a.mo8950c()) {
                int i16 = this.f12249e;
                if (i16 != -1 && !zM8945B3) {
                    AbstractC3110a.m8942r(abstractC3110a, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                iNextUnmarkedIndex = i16 + 1;
                this.f12249e = iNextUnmarkedIndex;
            } else if (zM8945B3) {
                C0766i c0766i3 = abstractC0757c.f2763a;
                AbstractC3138q.m9021q(abstractC3110a, "array");
                throw null;
            }
        } else {
            int i17 = this.f12249e;
            boolean z17 = i17 % 2 != 0;
            if (!z17) {
                abstractC3110a.mo8955h(':');
            } else if (i17 != -1) {
                zM8945B = abstractC3110a.m8945B();
            }
            if (abstractC3110a.mo8950c()) {
                if (z17) {
                    if (this.f12249e == -1) {
                        int i18 = abstractC3110a.f12210a;
                        if (zM8945B) {
                            AbstractC3110a.m8942r(abstractC3110a, "Unexpected leading comma", i18, null, 4);
                            throw null;
                        }
                    } else {
                        int i19 = abstractC3110a.f12210a;
                        if (!zM8945B) {
                            AbstractC3110a.m8942r(abstractC3110a, "Expected comma after the key-value pair", i19, null, 4);
                            throw null;
                        }
                    }
                }
                iNextUnmarkedIndex = this.f12249e + 1;
                this.f12249e = iNextUnmarkedIndex;
            } else if (zM8945B) {
                C0766i c0766i4 = abstractC0757c.f2763a;
                AbstractC3138q.m9021q(abstractC3110a, "object");
                throw null;
            }
        }
        if (enumC3133l0 != EnumC3133l0.MAP) {
            ((int[]) c0803k.f2966d)[c0803k.f2964b] = iNextUnmarkedIndex;
        }
        return iNextUnmarkedIndex;
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final int decodeEnum(InterfaceC39443g enumDescriptor) {
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
        return AbstractC3138q.m9019o(enumDescriptor, this.f12245a, decodeString(), " at path " + this.f12247c.f12211b.m1945c());
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final float decodeFloat() {
        AbstractC3110a abstractC3110a = this.f12247c;
        String strM8959l = abstractC3110a.m8959l();
        try {
            float f13 = Float.parseFloat(strM8959l);
            if (this.f12245a.f2763a.f2798j || Math.abs(f13) <= Float.MAX_VALUE) {
                return f13;
            }
            AbstractC3138q.m9026v(abstractC3110a, Float.valueOf(f13));
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC3110a.m8942r(abstractC3110a, AbstractC31061c.m95633i('\'', "Failed to parse type 'float' for input '", strM8959l), 0, null, 6);
            throw null;
        }
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final InterfaceC40541d decodeInline(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return AbstractC3125h0.m8985b(descriptor) ? new C3136o(this.f12247c, this.f12245a) : this;
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final int decodeInt() {
        AbstractC3110a abstractC3110a = this.f12247c;
        long jM8956i = abstractC3110a.m8956i();
        int i13 = (int) jM8956i;
        if (jM8956i == i13) {
            return i13;
        }
        AbstractC3110a.m8942r(abstractC3110a, "Failed to parse int for input '" + jM8956i + '\'', 0, null, 6);
        throw null;
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final long decodeLong() {
        return this.f12247c.m8956i();
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final boolean decodeNotNullMark() {
        C3137p c3137p = this.f12252h;
        return ((c3137p != null ? c3137p.f12295b : false) || this.f12247c.m8946C(true)) ? false : true;
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final Void decodeNull() {
        return null;
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40539b
    public final Object decodeSerializableElement(InterfaceC39443g descriptor, int i13, InterfaceC37137b deserializer, Object obj) {
        C0803k c0803k = this.f12247c.f12211b;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(deserializer, "deserializer");
        boolean z4 = this.f12246b == EnumC3133l0.MAP && (i13 & 1) == 0;
        if (z4) {
            int[] iArr = (int[]) c0803k.f2966d;
            int i14 = c0803k.f2964b;
            if (iArr[i14] == -2) {
                ((Object[]) c0803k.f2965c)[i14] = C3139r.f12298a;
            }
        }
        Object objDecodeSerializableElement = super.decodeSerializableElement(descriptor, i13, deserializer, obj);
        if (z4) {
            int[] iArr2 = (int[]) c0803k.f2966d;
            int i15 = c0803k.f2964b;
            if (iArr2[i15] != -2) {
                int i16 = i15 + 1;
                c0803k.f2964b = i16;
                if (i16 == ((Object[]) c0803k.f2965c).length) {
                    c0803k.m1948f();
                }
            }
            Object[] objArr = (Object[]) c0803k.f2965c;
            int i17 = c0803k.f2964b;
            objArr[i17] = objDecodeSerializableElement;
            ((int[]) c0803k.f2966d)[i17] = -2;
        }
        return objDecodeSerializableElement;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x011d  */
    /* JADX WARN: Code duplicated, block: B:38:0x011e  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x011e, please report this as an issue */
    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final Object decodeSerializableValue(InterfaceC37137b deserializer) {
        String message;
        AbstractC0757c abstractC0757c = this.f12245a;
        AbstractC3110a abstractC3110a = this.f12247c;
        C0803k c0803k = abstractC3110a.f12211b;
        AbstractC22676k.m65750j(deserializer, "deserializer");
        try {
            if (!(deserializer instanceof AbstractPolymorphicSerializer)) {
                return deserializer.deserialize(this);
            }
            C0766i c0766i = abstractC0757c.f2763a;
            String strM9014j = AbstractC3138q.m9014j(abstractC0757c, ((AbstractPolymorphicSerializer) deserializer).getDescriptor());
            String strMo8967v = abstractC3110a.mo8967v(strM9014j, this.f12251g.f2791c);
            if (strMo8967v != null) {
                try {
                    InterfaceC37137b interfaceC37137bM113831k = AbstractC35854l.m113831k((AbstractPolymorphicSerializer) deserializer, this, strMo8967v);
                    C3119e0 c3119e0 = new C3119e0();
                    c3119e0.f12243b = strM9014j;
                    this.f12250f = c3119e0;
                    return interfaceC37137bM113831k.deserialize(this);
                } catch (SerializationException e5) {
                    String message2 = e5.getMessage();
                    AbstractC22676k.m65747g(message2);
                    String strM125900s0 = AbstractC39414r.m125900s0(AbstractC39414r.m125862H0(message2, '\n'), ".");
                    String message3 = e5.getMessage();
                    AbstractC22676k.m65747g(message3);
                    AbstractC3110a.m8942r(abstractC3110a, strM125900s0, 0, AbstractC39414r.m125858D0('\n', message3, ""), 2);
                    throw null;
                }
            }
            if (!(deserializer instanceof AbstractPolymorphicSerializer)) {
                return deserializer.deserialize(this);
            }
            C0766i c0766i2 = abstractC0757c.f2763a;
            String strM9014j2 = AbstractC3138q.m9014j(abstractC0757c, ((AbstractPolymorphicSerializer) deserializer).getDescriptor());
            JsonElement jsonElementMo1838b = mo1838b();
            String serialName = ((AbstractPolymorphicSerializer) deserializer).getDescriptor().getSerialName();
            if (jsonElementMo1838b instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) jsonElementMo1838b;
                JsonElement jsonElement = (JsonElement) jsonObject.get((Object) strM9014j2);
                try {
                    return AbstractC3138q.m9024t(abstractC0757c, strM9014j2, jsonObject, AbstractC35854l.m113831k((AbstractPolymorphicSerializer) deserializer, this, jsonElement != null ? AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement)) : null));
                } catch (SerializationException e13) {
                    String message4 = e13.getMessage();
                    AbstractC22676k.m65747g(message4);
                    throw AbstractC3138q.m9008d(jsonObject.toString(), -1, message4);
                }
            }
            StringBuilder sb4 = new StringBuilder("Expected ");
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            sb4.append(c22673i0.getOrCreateKotlinClass(JsonObject.class).getSimpleName());
            sb4.append(", but had ");
            sb4.append(c22673i0.getOrCreateKotlinClass(jsonElementMo1838b.getClass()).getSimpleName());
            sb4.append(" as the serialized body of ");
            sb4.append(serialName);
            sb4.append(" at element: ");
            sb4.append(c0803k.m1945c());
            throw AbstractC3138q.m9008d(jsonElementMo1838b.toString(), -1, sb4.toString());
            message = e.getMessage();
            AbstractC22676k.m65747g(message);
            if (AbstractC39414r.m125876U(message, "at path", false)) {
                throw e;
            }
            throw new MissingFieldException(e.f89405w, e.getMessage() + " at path: " + c0803k.m1945c(), e);
        } catch (MissingFieldException e14) {
            message = e14.getMessage();
            AbstractC22676k.m65747g(message);
            if (AbstractC39414r.m125876U(message, "at path", false)) {
                throw e14;
            }
            throw new MissingFieldException(e14.f89405w, e14.getMessage() + " at path: " + c0803k.m1945c(), e14);
        }
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final short decodeShort() {
        AbstractC3110a abstractC3110a = this.f12247c;
        long jM8956i = abstractC3110a.m8956i();
        short s13 = (short) jM8956i;
        if (jM8956i == s13) {
            return s13;
        }
        AbstractC3110a.m8942r(abstractC3110a, "Failed to parse short for input '" + jM8956i + '\'', 0, null, 6);
        throw null;
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final String decodeString() {
        boolean z4 = this.f12251g.f2791c;
        AbstractC3110a abstractC3110a = this.f12247c;
        return z4 ? abstractC3110a.m8960m() : abstractC3110a.m8957j();
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40539b
    public final void endStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        int elementsCount = descriptor.getElementsCount();
        AbstractC0757c abstractC0757c = this.f12245a;
        if (elementsCount == 0 && AbstractC3138q.m9020p(abstractC0757c, descriptor)) {
            while (decodeElementIndex(descriptor) != -1) {
            }
        }
        AbstractC3110a abstractC3110a = this.f12247c;
        if (abstractC3110a.m8945B()) {
            C0766i c0766i = abstractC0757c.f2763a;
            AbstractC3138q.m9021q(abstractC3110a, "");
            throw null;
        }
        abstractC3110a.mo8955h(this.f12246b.f12288x);
        C0803k c0803k = abstractC3110a.f12211b;
        int i13 = c0803k.f2964b;
        int[] iArr = (int[]) c0803k.f2966d;
        if (iArr[i13] == -2) {
            iArr[i13] = -1;
            c0803k.f2964b = i13 - 1;
        }
        int i14 = c0803k.f2964b;
        if (i14 != -1) {
            c0803k.f2964b = i14 - 1;
        }
    }

    @Override // zc3.InterfaceC40541d, zc3.InterfaceC40539b
    public final AbstractC4454f getSerializersModule() {
        return this.f12248d;
    }
}
