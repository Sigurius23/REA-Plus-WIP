package p313lz;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import ec3.C13096w1;
import kz.C22908e;
import kz.C22909f;
import l83.C23454a0;
import l83.C23468n;
import p266jz.C22058f;
import p505ts.AbstractC34132o;
import p619xl.C38445a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import y00.C38842g8;

/* JADX INFO: renamed from: lz.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C24811h extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C24812i f97129E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f97130F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97131w;

    /* JADX INFO: renamed from: x */
    public boolean f97132x;

    /* JADX INFO: renamed from: y */
    public int f97133y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f97134z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24811h(C24812i c24812i, boolean z4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f97131w = i13;
        this.f97129E = c24812i;
        this.f97130F = z4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f97131w) {
            case 0:
                C24811h c24811h = new C24811h(this.f97129E, this.f97130F, interfaceC30057d, 0);
                c24811h.f97134z = obj;
                return c24811h;
            default:
                C24811h c24811h2 = new C24811h(this.f97129E, this.f97130F, interfaceC30057d, 1);
                c24811h2.f97134z = obj;
                return c24811h2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f97131w) {
            case 0:
                break;
        }
        return ((C24811h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM107888l;
        Throwable thM68037a;
        boolean z4;
        Object objM123183t;
        C24812i c24812i;
        Object objM107888l2;
        Throwable thM68037a2;
        boolean z13;
        Object objM123183t2;
        C24812i c24812i2;
        switch (this.f97131w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f97133y;
                C23454a0 c23454a0 = C23454a0.f92919a;
                C24812i c24812i3 = this.f97129E;
                try {
                    if (i13 != 0) {
                        if (i13 == 1) {
                            z4 = this.f97132x;
                            c24812i = (C24812i) this.f97134z;
                            AbstractC34132o.m107864I(obj);
                            objM123183t = ((C23468n) obj).f92940w;
                        } else {
                            if (i13 != 2 && i13 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj);
                        }
                        objM107888l = c23454a0;
                        thM68037a = C23468n.m68037a(objM107888l);
                        if (thM68037a != null) {
                            c24812i3.m72715g("Failed to complete session for data flow", thM68037a);
                        }
                        return c23454a0;
                    }
                    AbstractC34132o.m107864I(obj);
                    z4 = this.f97130F;
                    C38445a c38445a = c24812i3.f97139x;
                    C22058f c22058fMo66638b = c24812i3.f97141z.mo66638b();
                    this.f97134z = c24812i3;
                    this.f97132x = z4;
                    this.f97133y = 1;
                    objM123183t = c38445a.m123183t(c22058fMo66638b, this);
                    if (objM123183t == enumC31071a) {
                        return enumC31071a;
                    }
                    c24812i = c24812i3;
                    AbstractC34132o.m107864I(objM123183t);
                    FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) objM123183t;
                    if (financialConnectionsSession.getPaymentAccount() == null && z4) {
                        C13096w1 c13096w1 = c24812i.f97135E;
                        C24807d c24807d = new C24807d(C22908e.f90456w);
                        this.f97134z = null;
                        this.f97133y = 2;
                        if (c13096w1.emit(c24807d, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        C13096w1 c13096w2 = c24812i.f97135E;
                        C24807d c24807d2 = new C24807d(new C22909f(financialConnectionsSession, (C38842g8) null, 5));
                        this.f97134z = null;
                        this.f97133y = 3;
                        if (c13096w2.emit(c24807d2, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                    objM107888l = c23454a0;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    c24812i3.m72715g("Failed to complete session for data flow", thM68037a);
                }
                return c23454a0;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f97133y;
                C23454a0 c23454a1 = C23454a0.f92919a;
                C24812i c24812i4 = this.f97129E;
                try {
                    if (i14 != 0) {
                        if (i14 == 1) {
                            z13 = this.f97132x;
                            c24812i2 = (C24812i) this.f97134z;
                            AbstractC34132o.m107864I(obj);
                            objM123183t2 = ((C23468n) obj).f92940w;
                        } else {
                            if (i14 != 2 && i14 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj);
                        }
                        objM107888l2 = c23454a1;
                        thM68037a2 = C23468n.m68037a(objM107888l2);
                        if (thM68037a2 != null) {
                            c24812i4.m72715g("Failed to complete session for token flow", thM68037a2);
                        }
                        return c23454a1;
                    }
                    AbstractC34132o.m107864I(obj);
                    z13 = this.f97130F;
                    C38445a c38445a2 = c24812i4.f97139x;
                    C22058f c22058fMo66638b2 = c24812i4.f97141z.mo66638b();
                    this.f97134z = c24812i4;
                    this.f97132x = z13;
                    this.f97133y = 1;
                    objM123183t2 = c38445a2.m123183t(c22058fMo66638b2, this);
                    if (objM123183t2 == enumC31071a2) {
                        return enumC31071a2;
                    }
                    c24812i2 = c24812i4;
                    AbstractC34132o.m107864I(objM123183t2);
                    FinancialConnectionsSession financialConnectionsSession2 = (FinancialConnectionsSession) objM123183t2;
                    if (financialConnectionsSession2.getPaymentAccount() == null && z13) {
                        C13096w1 c13096w3 = c24812i2.f97135E;
                        C24807d c24807d3 = new C24807d(C22908e.f90456w);
                        this.f97134z = null;
                        this.f97133y = 2;
                        if (c13096w3.emit(c24807d3, this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    } else {
                        C13096w1 c13096w4 = c24812i2.f97135E;
                        C38842g8 parsedToken = financialConnectionsSession2.getParsedToken();
                        if (parsedToken == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        C24807d c24807d4 = new C24807d(new C22909f(financialConnectionsSession2, parsedToken, 1));
                        this.f97134z = null;
                        this.f97133y = 3;
                        if (c13096w4.emit(c24807d4, this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                    objM107888l2 = c23454a1;
                } catch (Throwable th4) {
                    objM107888l2 = AbstractC34132o.m107888l(th4);
                }
                thM68037a2 = C23468n.m68037a(objM107888l2);
                if (thM68037a2 != null) {
                    c24812i4.m72715g("Failed to complete session for token flow", thM68037a2);
                }
                return c23454a1;
        }
    }
}
