package cz;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ck1.C4780c;
import com.stripe.android.customersheet.CustomerSheetActivity;
import d40.AbstractC11673r;
import h40.C16845k;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import o73.C27648a;
import p097ds.AbstractC12313p;
import p108e4.AbstractC12667a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p550vd.AbstractC35902e;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: cz.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C11196e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35908w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CustomerSheetActivity f35909x;

    public /* synthetic */ C11196e(CustomerSheetActivity customerSheetActivity, int i13) {
        this.f35908w = i13;
        this.f35909x = customerSheetActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:33:0x0104  */
    /* JADX WARN: Code duplicated, block: B:42:0x0146  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        boolean zM87157i;
        Object objM87133R;
        C16845k c16845kM113944O;
        InterfaceC28601c1 interfaceC28601c1M83597t;
        boolean zM87153g;
        Object objM87133R2;
        boolean zM87157i2;
        Object objM87133R3;
        boolean zM87157i3;
        Object objM87133R4;
        int i13 = this.f35908w;
        int i14 = 1;
        int i15 = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        CustomerSheetActivity customerSheetActivity = this.f35909x;
        int i16 = 3;
        switch (i13) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    int i17 = CustomerSheetActivity.f22164z;
                    AbstractC12667a.m35453e(customerSheetActivity.m16837p(), composer, 0);
                } else {
                    C28655q c28655q2 = (C28655q) composer;
                    if (!c28655q2.m87121F()) {
                        int i18 = CustomerSheetActivity.f22164z;
                        AbstractC12667a.m35453e(customerSheetActivity.m16837p(), composer, 0);
                    } else {
                        c28655q2.m87138X();
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    c28655q = (C28655q) composer2;
                    c28655q.m87150e0(-1294835918);
                    zM87157i = c28655q.m87157i(customerSheetActivity);
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (zM87157i) {
                        objM87133R = new C4780c(customerSheetActivity, 13);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C4780c(customerSheetActivity, 13);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    c16845kM113944O = AbstractC35902e.m113944O((Function1) objM87133R, c28655q, 1);
                    int i19 = CustomerSheetActivity.f22164z;
                    interfaceC28601c1M83597t = C27648a.m83597t(customerSheetActivity.m16837p().f35966O, c28655q, 0);
                    AbstractC11239z0 abstractC11239z0 = (AbstractC11239z0) interfaceC28601c1M83597t.getValue();
                    c28655q.m87150e0(-1294823987);
                    zM87153g = c28655q.m87153g(interfaceC28601c1M83597t) | c28655q.m87157i(c16845kM113944O) | c28655q.m87157i(customerSheetActivity);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new C11194d(interfaceC28601c1M83597t, c16845kM113944O, customerSheetActivity, (InterfaceC30057d) null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C11194d(interfaceC28601c1M83597t, c16845kM113944O, customerSheetActivity, (InterfaceC30057d) null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, abstractC11239z0);
                    c28655q.m87150e0(-1294817280);
                    zM87157i2 = c28655q.m87157i(customerSheetActivity);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new C11192c(customerSheetActivity, i16);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11192c(customerSheetActivity, i16);
                        c28655q.m87172p0(objM87133R3);
                    }
                    c28655q.m87173q(false);
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
                    c28655q.m87150e0(-1294809982);
                    zM87157i3 = c28655q.m87157i(customerSheetActivity);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R4 = new C11192c(customerSheetActivity, 4);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C11192c(customerSheetActivity, 4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    c28655q.m87173q(false);
                    AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) objM87133R4, AbstractC37817c.m121344e(1179106086, c28655q, new C11196e(customerSheetActivity, i15)), c28655q, 24584, 6);
                } else {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (!c28655q3.m87121F()) {
                        c28655q = (C28655q) composer2;
                        c28655q.m87150e0(-1294835918);
                        zM87157i = c28655q.m87157i(customerSheetActivity);
                        objM87133R = c28655q.m87133R();
                        C28676v0 c28676v1 = C28635l.f115821a;
                        if (zM87157i || objM87133R == c28676v1) {
                            objM87133R = new C4780c(customerSheetActivity, 13);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        c16845kM113944O = AbstractC35902e.m113944O((Function1) objM87133R, c28655q, 1);
                        int i110 = CustomerSheetActivity.f22164z;
                        interfaceC28601c1M83597t = C27648a.m83597t(customerSheetActivity.m16837p().f35966O, c28655q, 0);
                        AbstractC11239z0 abstractC11239z1 = (AbstractC11239z0) interfaceC28601c1M83597t.getValue();
                        c28655q.m87150e0(-1294823987);
                        zM87153g = c28655q.m87153g(interfaceC28601c1M83597t) | c28655q.m87157i(c16845kM113944O) | c28655q.m87157i(customerSheetActivity);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g || objM87133R2 == c28676v1) {
                            objM87133R2 = new C11194d(interfaceC28601c1M83597t, c16845kM113944O, customerSheetActivity, (InterfaceC30057d) null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        c28655q.m87173q(false);
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, abstractC11239z1);
                        c28655q.m87150e0(-1294817280);
                        zM87157i2 = c28655q.m87157i(customerSheetActivity);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R3 == c28676v1) {
                            objM87133R3 = new C11192c(customerSheetActivity, i16);
                            c28655q.m87172p0(objM87133R3);
                        }
                        c28655q.m87173q(false);
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
                        c28655q.m87150e0(-1294809982);
                        zM87157i3 = c28655q.m87157i(customerSheetActivity);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i3 || objM87133R4 == c28676v1) {
                            objM87133R4 = new C11192c(customerSheetActivity, 4);
                            c28655q.m87172p0(objM87133R4);
                        }
                        c28655q.m87173q(false);
                        AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) objM87133R4, AbstractC37817c.m121344e(1179106086, c28655q, new C11196e(customerSheetActivity, i15)), c28655q, 24584, 6);
                    } else {
                        c28655q3.m87138X();
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(1303563646, composer3, new C11196e(customerSheetActivity, i14)), composer3, 12582912, 127);
                } else {
                    C28655q c28655q4 = (C28655q) composer3;
                    if (!c28655q4.m87121F()) {
                        AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(1303563646, composer3, new C11196e(customerSheetActivity, i14)), composer3, 12582912, 127);
                    } else {
                        c28655q4.m87138X();
                    }
                }
                break;
        }
        return c23454a0;
    }
}
