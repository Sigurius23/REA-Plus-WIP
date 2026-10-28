package h20;

import androidx.compose.runtime.Composer;
import b30.C2539i0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.paymentsheet.PaymentOptionsActivity;
import d40.AbstractC11673r;
import h40.C16845k;
import j93.InterfaceC21467g;
import l83.C23454a0;
import o73.C27648a;
import p000.C2175b;
import p097ds.AbstractC12313p;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p550vd.AbstractC35902e;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: h20.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16676j0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64129w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PaymentOptionsActivity f64130x;

    public /* synthetic */ C16676j0(PaymentOptionsActivity paymentOptionsActivity, int i13) {
        this.f64129w = i13;
        this.f64130x = paymentOptionsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x012f  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        PaymentOptionsActivity paymentOptionsActivity;
        InterfaceC28601c1 interfaceC28601c1M83597t;
        C28655q c28655q;
        boolean zM87153g;
        Object objM87133R;
        C16845k c16845kM113944O;
        boolean zM87157i;
        Object objM87133R2;
        C16754w0 c16754w0M16859p;
        boolean zM87157i2;
        Object objM87133R3;
        switch (this.f64129w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        AbstractC12313p.m34287g(this.f64130x.mo7466o(), composer, 8);
                    }
                } else {
                    AbstractC12313p.m34287g(this.f64130x.mo7466o(), composer, 8);
                }
                return C23454a0.f92919a;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue() & 3;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (iIntValue == 2) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        paymentOptionsActivity = this.f64130x;
                        interfaceC28601c1M83597t = C27648a.m83597t(paymentOptionsActivity.mo7466o().f43013Q, composer2, 0);
                        c28655q = (C28655q) composer2;
                        c28655q.m87150e0(1788268271);
                        zM87153g = c28655q.m87153g(interfaceC28601c1M83597t);
                        objM87133R = c28655q.m87133R();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (zM87153g || objM87133R == c28676v0) {
                            objM87133R = new C2175b(interfaceC28601c1M83597t, 5);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        c16845kM113944O = AbstractC35902e.m113944O((Function1) objM87133R, c28655q, 1);
                        c28655q.m87150e0(1788270998);
                        zM87157i = c28655q.m87157i(paymentOptionsActivity) | c28655q.m87157i(c16845kM113944O);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i || objM87133R2 == c28676v0) {
                            objM87133R2 = new C16670i0(paymentOptionsActivity, c16845kM113944O, (InterfaceC30057d) null, 0);
                            c28655q.m87172p0(objM87133R2);
                        }
                        c28655q.m87173q(false);
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
                        c16754w0M16859p = paymentOptionsActivity.mo7466o();
                        c28655q.m87150e0(1788285685);
                        zM87157i2 = c28655q.m87157i(c16754w0M16859p);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R3 == c28676v0) {
                            C2539i0 c2539i0 = new C2539i0(0, c16754w0M16859p, C16754w0.class, "onUserCancel", "onUserCancel()V", 0, 7);
                            c28655q.m87172p0(c2539i0);
                            objM87133R3 = c2539i0;
                        }
                        c28655q.m87173q(false);
                        AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) ((InterfaceC21467g) objM87133R3), AbstractC37817c.m121344e(-1016729028, c28655q, new C16676j0(paymentOptionsActivity, 0)), c28655q, 24584, 6);
                    }
                } else {
                    paymentOptionsActivity = this.f64130x;
                    interfaceC28601c1M83597t = C27648a.m83597t(paymentOptionsActivity.mo7466o().f43013Q, composer2, 0);
                    c28655q = (C28655q) composer2;
                    c28655q.m87150e0(1788268271);
                    zM87153g = c28655q.m87153g(interfaceC28601c1M83597t);
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (zM87153g) {
                        objM87133R = new C2175b(interfaceC28601c1M83597t, 5);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2175b(interfaceC28601c1M83597t, 5);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    c16845kM113944O = AbstractC35902e.m113944O((Function1) objM87133R, c28655q, 1);
                    c28655q.m87150e0(1788270998);
                    zM87157i = c28655q.m87157i(paymentOptionsActivity) | c28655q.m87157i(c16845kM113944O);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C16670i0(paymentOptionsActivity, c16845kM113944O, (InterfaceC30057d) null, 0);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C16670i0(paymentOptionsActivity, c16845kM113944O, (InterfaceC30057d) null, 0);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
                    c16754w0M16859p = paymentOptionsActivity.mo7466o();
                    c28655q.m87150e0(1788285685);
                    zM87157i2 = c28655q.m87157i(c16754w0M16859p);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        C2539i0 c2539i1 = new C2539i0(0, c16754w0M16859p, C16754w0.class, "onUserCancel", "onUserCancel()V", 0, 7);
                        c28655q.m87172p0(c2539i1);
                        objM87133R3 = c2539i1;
                    } else {
                        C2539i0 c2539i2 = new C2539i0(0, c16754w0M16859p, C16754w0.class, "onUserCancel", "onUserCancel()V", 0, 7);
                        c28655q.m87172p0(c2539i2);
                        objM87133R3 = c2539i2;
                    }
                    c28655q.m87173q(false);
                    AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) ((InterfaceC21467g) objM87133R3), AbstractC37817c.m121344e(-1016729028, c28655q, new C16676j0(paymentOptionsActivity, 0)), c28655q, 24584, 6);
                }
                return c23454a0;
            default:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q4 = (C28655q) composer3;
                    if (c28655q4.m87121F()) {
                        c28655q4.m87138X();
                    } else {
                        AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1453511964, composer3, new C16676j0(this.f64130x, 1)), composer3, 12582912, 127);
                    }
                } else {
                    AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1453511964, composer3, new C16676j0(this.f64130x, 1)), composer3, 12582912, 127);
                }
                return C23454a0.f92919a;
        }
    }
}
