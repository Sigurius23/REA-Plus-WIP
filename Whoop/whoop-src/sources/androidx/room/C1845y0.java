package androidx.room;

import a30.C0290f1;
import a30.C0307l0;
import a30.C0327u;
import b00.C2179a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import e00.C12500w;
import e10.C12568r0;
import e10.C12575v;
import ec3.C13045h2;
import h20.C16686k4;
import h20.C16759x;
import h20.EnumC16656f4;
import l83.C23454a0;
import l83.C23468n;
import n00.C26075c;
import n00.C26083k;
import p007a6.C0416e;
import p077d0.C11344e;
import p077d0.C11347e2;
import p505ts.AbstractC34132o;
import p599wz.C37718g0;
import p599wz.C37734l1;
import p599wz.C37737m1;
import p599wz.EnumC37721h0;
import p631xz.C38747x;
import p631xz.InterfaceC38735m0;
import p664yy.C39857f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q00.C29734p0;
import q20.AbstractC29840y;
import q20.C29824j;
import q20.C29828m;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s30.AbstractC32100b;
import s83.AbstractC32275i;
import x30.AbstractC37926s0;
import y00.AbstractC38794c0;
import y00.EnumC38796c2;

/* JADX INFO: renamed from: androidx.room.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1845y0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f7219E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7220w;

    /* JADX INFO: renamed from: x */
    public int f7221x;

    /* JADX INFO: renamed from: y */
    public boolean f7222y;

    /* JADX INFO: renamed from: z */
    public Object f7223z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1845y0(C12500w c12500w, String str, boolean z4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f7220w = 1;
        this.f7223z = c12500w;
        this.f7219E = str;
        this.f7222y = z4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f7220w) {
            case 0:
                return new C1845y0((AbstractC1848z0) this.f7223z, this.f7222y, (String[]) this.f7219E, interfaceC30057d, 0);
            case 1:
                return new C1845y0((C12500w) this.f7223z, (String) this.f7219E, this.f7222y, interfaceC30057d);
            case 2:
                return new C1845y0((C11344e) this.f7223z, this.f7222y, (C11347e2) this.f7219E, interfaceC30057d, 2);
            case 3:
                return new C1845y0((C16686k4) this.f7223z, (C0290f1) this.f7219E, interfaceC30057d);
            case 4:
                return new C1845y0((C26083k) this.f7219E, interfaceC30057d);
            default:
                return new C1845y0(this.f7222y, (C29734p0) this.f7223z, (AbstractC38794c0) this.f7219E, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f7220w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((C1845y0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x019b  */
    /* JADX WARN: Code duplicated, block: B:98:0x019e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [e30.c, h20.k4] */
    /* JADX WARN: Type inference failed for: r6v0, types: [q83.d] */
    /* JADX WARN: Type inference failed for: r6v5, types: [zy.c] */
    /* JADX WARN: Type inference failed for: r6v6, types: [zy.c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM43407g;
        Object objM47276a;
        C37718g0 c37718g0;
        Object objM35246b;
        boolean z4;
        C12575v c12575v;
        Throwable th3;
        Object value;
        C37737m1 c37737m1;
        boolean z13;
        Object objM124160k;
        InterfaceC38735m0 interfaceC38735m0M99873w;
        C0416e c0416e;
        int i13 = this.f7220w;
        ?? M121456H = 0;
        M121456H = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f7219E;
        switch (i13) {
            case 0:
                AbstractC1848z0 abstractC1848z0 = (AbstractC1848z0) this.f7223z;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f7221x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C1812n0 c1812n0 = abstractC1848z0.connectionManager;
                InterfaceC30057d interfaceC30057d = null;
                if (c1812n0 == null) {
                    AbstractC22676k.m65757q("connectionManager");
                    throw null;
                }
                C0327u c0327u = new C0327u(abstractC1848z0, this.f7222y, (String[]) obj2, interfaceC30057d, 1);
                this.f7221x = 1;
                return c1812n0.f7123f.mo68210A0(false, c0327u, this) == enumC31071a ? enumC31071a : c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f7221x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C12500w c12500w = (C12500w) this.f7223z;
                    boolean z14 = this.f7222y;
                    String str = c12500w.f42684a.f8870w;
                    C39857f c39857fM35114b = c12500w.m35114b();
                    this.f7221x = 1;
                    objM43407g = c12500w.f42688e.m43407g((String) obj2, z14, str, c39857fM35114b, this);
                    if (objM43407g == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM43407g = ((C23468n) obj).f92940w;
                }
                return new C23468n(objM43407g);
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i16 = this.f7221x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C11344e c11344e = (C11344e) this.f7223z;
                float f13 = this.f7222y ? 1.0f : 0.8f;
                this.f7221x = 1;
                return C11344e.m30547d(c11344e, new Float(f13), (C11347e2) obj2, null, this, 12) == enumC31071a3 ? enumC31071a3 : c23454a0;
            case 3:
                C0290f1 c0290f1 = (C0290f1) obj2;
                ?? r10 = (C16686k4) this.f7223z;
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i17 = this.f7221x;
                if (i17 != 0) {
                    if (i17 == 1) {
                        AbstractC34132o.m107864I(obj);
                        objM47276a = obj;
                    } else {
                        if (i17 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z4 = this.f7222y;
                        AbstractC34132o.m107864I(obj);
                        objM35246b = obj;
                    }
                    if (objM35246b instanceof C12575v) {
                        c12575v = (C12575v) objM35246b;
                    } else {
                        c12575v = null;
                    }
                    if (c12575v != null && (th3 = c12575v.f42944a) != null) {
                        M121456H = AbstractC37926s0.m121456H(th3);
                    }
                    if (!z4) {
                        return c23454a0;
                    }
                    r10.m47240F(c0290f1.f1019E, M121456H);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C16759x c16759x = r10.f43001E;
                C0307l0 c0307l0 = c0290f1.f1019E.f150995l0;
                this.f7221x = 1;
                c16759x.m47278c(c0307l0);
                if (c0307l0 == null || (c37718g0 = c0307l0.f1058w) == null) {
                    objM47276a = Boolean.FALSE;
                } else {
                    C37734l1 c37734l1 = c16759x.f64391a;
                    c37734l1.getClass();
                    C2179a c2179aM77715b = c37734l1.m121148b(c37718g0).m77715b();
                    if (!c2179aM77715b.m6861b() || c2179aM77715b.f8663c) {
                        objM47276a = Boolean.FALSE;
                    } else {
                        int iOrdinal = c0307l0.f1059x.ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1) {
                            objM47276a = c16759x.m47276a(c37718g0, this);
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            objM47276a = Boolean.FALSE;
                        }
                    }
                }
                if (objM47276a != enumC31071a4) {
                }
                return enumC31071a4;
                boolean zBooleanValue = ((Boolean) objM47276a).booleanValue();
                if (zBooleanValue) {
                    r10.m47237C(new C29828m(EnumC37721h0.f161651y, null, null, 6), EnumC16656f4.f64038w);
                }
                r10.f43022Z.m47225a(c0290f1.f1021x);
                AbstractC29840y abstractC29840y = c0290f1.f1022y;
                if (!(abstractC29840y instanceof C29824j) && !(abstractC29840y instanceof C29828m)) {
                    r10.m35340z(abstractC29840y);
                }
                r10.f43007K.m36570j(c0290f1.f1019E);
                C12568r0 c12568r0 = r10.f64175s0;
                this.f7222y = zBooleanValue;
                this.f7221x = 2;
                objM35246b = c12568r0.m35246b(this);
                if (objM35246b != enumC31071a4) {
                    z4 = zBooleanValue;
                    if (objM35246b instanceof C12575v) {
                        c12575v = (C12575v) objM35246b;
                    } else {
                        c12575v = null;
                    }
                    if (c12575v != null) {
                        M121456H = AbstractC37926s0.m121456H(th3);
                    }
                    if (!z4) {
                        return c23454a0;
                    }
                    r10.m47240F(c0290f1.f1019E, M121456H);
                    return c23454a0;
                }
                return enumC31071a4;
            case 4:
                C26083k c26083k = (C26083k) obj2;
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i18 = this.f7221x;
                if (i18 == 0) {
                    AbstractC34132o.m107864I(obj);
                    int i19 = C26083k.f103293R;
                    C13045h2 c13045h2 = c26083k.f103303N;
                    do {
                        value = c13045h2.getValue();
                    } while (!c13045h2.m36569i(value, C26075c.m77570a((C26075c) value, false, null, true, null, null, 223)));
                    String str2 = (String) c26083k.f103300K.f57715n.f45200w.getValue();
                    C37737m1 c37737m2 = c26083k.f103294E;
                    boolean z15 = c37737m2.f161694a;
                    c37737m2.f161694a = false;
                    try {
                        C38747x c38747x = c26083k.f103309z;
                        EnumC38796c2 enumC38796c2 = EnumC38796c2.USER_ACTION;
                        String strM121145b = c26083k.f103306w.m121145b();
                        this.f7223z = c37737m2;
                        this.f7222y = z15;
                        this.f7221x = 1;
                        objM124160k = c38747x.m124160k(str2, enumC38796c2, true, strM121145b, this);
                        if (objM124160k != enumC31071a5) {
                            c37737m1 = c37737m2;
                            z13 = z15;
                            c37737m1.f161694a = z13;
                            interfaceC38735m0M99873w = AbstractC32100b.m99873w(objM124160k);
                            c0416e = new C0416e(c26083k, M121456H, 8);
                            this.f7223z = null;
                            this.f7221x = 2;
                            int i24 = C26083k.f103293R;
                            if (c26083k.m77574l(interfaceC38735m0M99873w, c0416e, this) != enumC31071a5) {
                                return c23454a0;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c37737m1 = c37737m2;
                        z13 = z15;
                        c37737m1.f161694a = z13;
                        throw th;
                    }
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return c23454a0;
                    }
                    z13 = this.f7222y;
                    c37737m1 = (C37737m1) this.f7223z;
                    try {
                        AbstractC34132o.m107864I(obj);
                        objM124160k = ((C23468n) obj).f92940w;
                        c37737m1.f161694a = z13;
                        interfaceC38735m0M99873w = AbstractC32100b.m99873w(objM124160k);
                        c0416e = new C0416e(c26083k, M121456H, 8);
                        this.f7223z = null;
                        this.f7221x = 2;
                        int i25 = C26083k.f103293R;
                        if (c26083k.m77574l(interfaceC38735m0M99873w, c0416e, this) != enumC31071a5) {
                            return c23454a0;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        c37737m1.f161694a = z13;
                        throw th;
                    }
                }
                return enumC31071a5;
            default:
                AbstractC38794c0 abstractC38794c0 = (AbstractC38794c0) obj2;
                C29734p0 c29734p0 = (C29734p0) this.f7223z;
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i26 = this.f7221x;
                if (i26 != 0) {
                    if (i26 != 1 && i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                if (this.f7222y) {
                    this.f7221x = 1;
                    if (C29734p0.m91177g(c29734p0, abstractC38794c0, this) != enumC31071a6) {
                        return c23454a0;
                    }
                } else {
                    this.f7221x = 2;
                    if (c29734p0.m91184q(abstractC38794c0, this) != enumC31071a6) {
                        return c23454a0;
                    }
                }
                return enumC31071a6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1845y0(C16686k4 c16686k4, C0290f1 c0290f1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f7220w = 3;
        this.f7223z = c16686k4;
        this.f7219E = c0290f1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1845y0(Object obj, boolean z4, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f7220w = i13;
        this.f7223z = obj;
        this.f7222y = z4;
        this.f7219E = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1845y0(C26083k c26083k, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f7220w = 4;
        this.f7219E = c26083k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1845y0(boolean z4, C29734p0 c29734p0, AbstractC38794c0 abstractC38794c0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f7220w = 5;
        this.f7222y = z4;
        this.f7223z = c29734p0;
        this.f7219E = abstractC38794c0;
    }
}
