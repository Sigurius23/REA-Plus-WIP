package bd3;

import ad3.AbstractC0757c;
import cd3.AbstractC4454f;
import l83.C23474t;
import l83.C23476v;
import l83.C23479y;
import p482s7.AbstractC32237a;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import va3.AbstractC35846d;
import yb3.AbstractC39421y;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: bd3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C3136o extends AbstractC35846d {

    /* JADX INFO: renamed from: a */
    public final AbstractC3110a f12292a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4454f f12293b;

    public C3136o(AbstractC3110a abstractC3110a, AbstractC0757c json) {
        AbstractC22676k.m65750j(json, "json");
        this.f12292a = abstractC3110a;
        this.f12293b = json.f2764b;
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final byte decodeByte() {
        AbstractC3110a abstractC3110a = this.f12292a;
        String strM8959l = abstractC3110a.m8959l();
        try {
            return AbstractC32237a.m100302q(strM8959l);
        } catch (IllegalArgumentException unused) {
            AbstractC3110a.m8942r(abstractC3110a, AbstractC31061c.m95633i('\'', "Failed to parse type 'UByte' for input '", strM8959l), 0, null, 6);
            throw null;
        }
    }

    @Override // zc3.InterfaceC40539b
    public final int decodeElementIndex(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final int decodeInt() {
        AbstractC3110a abstractC3110a = this.f12292a;
        String strM8959l = abstractC3110a.m8959l();
        try {
            AbstractC22676k.m65750j(strM8959l, "<this>");
            C23474t c23474tM100303r = AbstractC32237a.m100303r(10, strM8959l);
            if (c23474tM100303r != null) {
                return c23474tM100303r.f92952w;
            }
            AbstractC39421y.m125923H(strM8959l);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC3110a.m8942r(abstractC3110a, AbstractC31061c.m95633i('\'', "Failed to parse type 'UInt' for input '", strM8959l), 0, null, 6);
            throw null;
        }
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final long decodeLong() {
        AbstractC3110a abstractC3110a = this.f12292a;
        String strM8959l = abstractC3110a.m8959l();
        try {
            AbstractC22676k.m65750j(strM8959l, "<this>");
            C23476v c23476vM100304s = AbstractC32237a.m100304s(strM8959l);
            if (c23476vM100304s != null) {
                return c23476vM100304s.f92954w;
            }
            AbstractC39421y.m125923H(strM8959l);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC3110a.m8942r(abstractC3110a, AbstractC31061c.m95633i('\'', "Failed to parse type 'ULong' for input '", strM8959l), 0, null, 6);
            throw null;
        }
    }

    @Override // va3.AbstractC35846d, zc3.InterfaceC40541d
    public final short decodeShort() {
        C23479y c23479y;
        AbstractC3110a abstractC3110a = this.f12292a;
        String strM8959l = abstractC3110a.m8959l();
        try {
            AbstractC22676k.m65750j(strM8959l, "<this>");
            C23474t c23474tM100303r = AbstractC32237a.m100303r(10, strM8959l);
            if (c23474tM100303r != null) {
                int i13 = c23474tM100303r.f92952w;
                c23479y = Integer.compareUnsigned(i13, 65535) > 0 ? null : new C23479y((short) i13);
            }
            if (c23479y != null) {
                return c23479y.f92957w;
            }
            AbstractC39421y.m125923H(strM8959l);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC3110a.m8942r(abstractC3110a, AbstractC31061c.m95633i('\'', "Failed to parse type 'UShort' for input '", strM8959l), 0, null, 6);
            throw null;
        }
    }

    @Override // zc3.InterfaceC40541d, zc3.InterfaceC40539b
    public final AbstractC4454f getSerializersModule() {
        return this.f12293b;
    }
}
