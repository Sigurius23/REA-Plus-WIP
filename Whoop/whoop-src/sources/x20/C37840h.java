package x20;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity;
import d40.AbstractC11673r;
import h40.C16845k;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import o73.C27648a;
import ou1.C28376a;
import p000.C2175b;
import p097ds.AbstractC12313p;
import p33.C28820m;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p550vd.AbstractC35902e;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import u10.C34418f;
import wr0.C37550r;

/* JADX INFO: renamed from: x20.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C37840h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162004w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PollingActivity f162005x;

    public /* synthetic */ C37840h(PollingActivity pollingActivity, int i13) {
        this.f162004w = i13;
        this.f162005x = pollingActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:33:0x0105  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        PollingActivity pollingActivity;
        InterfaceC28601c1 interfaceC28601c1M83597t;
        C28655q c28655q;
        boolean zM87153g;
        Object objM87133R;
        C28676v0 c28676v0;
        C16845k c16845kM113944O;
        boolean zM87153g2;
        Object objM87133R2;
        boolean zM87153g3;
        Object objM87133R3;
        Object objM87133R4;
        switch (this.f162004w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        pollingActivity = this.f162005x;
                        interfaceC28601c1M83597t = C27648a.m83597t(((C37855w) pollingActivity.f22396y.getValue()).f162054z, composer, 0);
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(1911409787);
                        zM87153g = c28655q.m87153g(interfaceC28601c1M83597t);
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (zM87153g || objM87133R == c28676v0) {
                            objM87133R = new C2175b(interfaceC28601c1M83597t, 12);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        c16845kM113944O = AbstractC35902e.m113944O((Function1) objM87133R, c28655q, 1);
                        c28655q.m87150e0(1911420812);
                        zM87153g2 = c28655q.m87153g(interfaceC28601c1M83597t) | c28655q.m87157i(pollingActivity);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g2 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C37550r(4, pollingActivity, interfaceC28601c1M83597t);
                            c28655q.m87172p0(objM87133R2);
                        }
                        c28655q.m87173q(false);
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, true, c28655q, 6, 0);
                        EnumC37847o enumC37847o = ((C37848p) interfaceC28601c1M83597t.getValue()).f162025c;
                        c28655q.m87150e0(1911431060);
                        zM87153g3 = c28655q.m87153g(interfaceC28601c1M83597t) | c28655q.m87157i(pollingActivity) | c28655q.m87157i(c16845kM113944O);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g3 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C28820m(pollingActivity, c16845kM113944O, interfaceC28601c1M83597t, (InterfaceC30057d) null, 9);
                            c28655q.m87172p0(objM87133R3);
                        }
                        c28655q.m87173q(false);
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, enumC37847o);
                        c28655q.m87150e0(1911442239);
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C28376a(7);
                            c28655q.m87172p0(objM87133R4);
                        }
                        c28655q.m87173q(false);
                        AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) objM87133R4, AbstractC37817c.m121344e(980217339, c28655q, new C34418f(4, pollingActivity, interfaceC28601c1M83597t)), c28655q, 27656, 6);
                    }
                } else {
                    pollingActivity = this.f162005x;
                    interfaceC28601c1M83597t = C27648a.m83597t(((C37855w) pollingActivity.f22396y.getValue()).f162054z, composer, 0);
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(1911409787);
                    zM87153g = c28655q.m87153g(interfaceC28601c1M83597t);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (zM87153g) {
                        objM87133R = new C2175b(interfaceC28601c1M83597t, 12);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2175b(interfaceC28601c1M83597t, 12);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    c16845kM113944O = AbstractC35902e.m113944O((Function1) objM87133R, c28655q, 1);
                    c28655q.m87150e0(1911420812);
                    zM87153g2 = c28655q.m87153g(interfaceC28601c1M83597t) | c28655q.m87157i(pollingActivity);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R2 = new C37550r(4, pollingActivity, interfaceC28601c1M83597t);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C37550r(4, pollingActivity, interfaceC28601c1M83597t);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, true, c28655q, 6, 0);
                    EnumC37847o enumC37847o2 = ((C37848p) interfaceC28601c1M83597t.getValue()).f162025c;
                    c28655q.m87150e0(1911431060);
                    zM87153g3 = c28655q.m87153g(interfaceC28601c1M83597t) | c28655q.m87157i(pollingActivity) | c28655q.m87157i(c16845kM113944O);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R3 = new C28820m(pollingActivity, c16845kM113944O, interfaceC28601c1M83597t, (InterfaceC30057d) null, 9);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C28820m(pollingActivity, c16845kM113944O, interfaceC28601c1M83597t, (InterfaceC30057d) null, 9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    c28655q.m87173q(false);
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, enumC37847o2);
                    c28655q.m87150e0(1911442239);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C28376a(7);
                        c28655q.m87172p0(objM87133R4);
                    }
                    c28655q.m87173q(false);
                    AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) objM87133R4, AbstractC37817c.m121344e(980217339, c28655q, new C34418f(4, pollingActivity, interfaceC28601c1M83597t)), c28655q, 27656, 6);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(1785583267, composer2, new C37840h(this.f162005x, 0)), composer2, 12582912, 127);
                    }
                } else {
                    AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(1785583267, composer2, new C37840h(this.f162005x, 0)), composer2, 12582912, 127);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
