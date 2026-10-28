package v20;

import androidx.compose.runtime.Composer;
import b30.AbstractC2526g3;
import b30.C2550j3;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity;
import d40.AbstractC11673r;
import h40.C16845k;
import l83.C23454a0;
import ou1.C28376a;
import p095dp.AbstractC12240d;
import p097ds.AbstractC12313p;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p460rg.AbstractC31366a;
import p550vd.AbstractC35902e;
import p602x1.AbstractC37817c;
import q83.InterfaceC30057d;
import s40.C32139c0;

/* JADX INFO: renamed from: v20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C35563c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151291w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ BacsMandateConfirmationActivity f151292x;

    public /* synthetic */ C35563c(BacsMandateConfirmationActivity bacsMandateConfirmationActivity, int i13) {
        this.f151291w = i13;
        this.f151292x = bacsMandateConfirmationActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x012f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0156  */
    /* JADX WARN: Code duplicated, block: B:52:0x0165  */
    /* JADX WARN: Code duplicated, block: B:56:0x018a  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        Object objM87133R;
        boolean zM87157i;
        Object objM87133R2;
        InterfaceC30057d interfaceC30057d;
        C16845k c16845kM113944O;
        C28655q c28655q2;
        boolean zM87157i2;
        Object objM87133R3;
        boolean zM87157i3;
        Object objM87133R4;
        int i13 = this.f151291w;
        C28676v0 c28676v0 = C28635l.f115821a;
        int i14 = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        BacsMandateConfirmationActivity bacsMandateConfirmationActivity = this.f151292x;
        int i15 = 2;
        int i16 = 3;
        switch (i13) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(-637927801);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C28376a(7);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    C2550j3 c2550j3 = new C2550j3(false, false, false, (InterfaceC4339a) objM87133R);
                    c28655q.m87150e0(-637921354);
                    zM87157i = c28655q.m87157i(bacsMandateConfirmationActivity);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C35562b(bacsMandateConfirmationActivity, i16);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C35562b(bacsMandateConfirmationActivity, i16);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    AbstractC2526g3.m7464c(0.0f, 432, c28655q, c2550j3, (InterfaceC4339a) objM87133R2, false, true);
                } else {
                    C28655q c28655q3 = (C28655q) composer;
                    if (!c28655q3.m87121F()) {
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(-637927801);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        C2550j3 c2550j4 = new C2550j3(false, false, false, (InterfaceC4339a) objM87133R);
                        c28655q.m87150e0(-637921354);
                        zM87157i = c28655q.m87157i(bacsMandateConfirmationActivity);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i || objM87133R2 == c28676v0) {
                            objM87133R2 = new C35562b(bacsMandateConfirmationActivity, i16);
                            c28655q.m87172p0(objM87133R2);
                        }
                        c28655q.m87173q(false);
                        AbstractC2526g3.m7464c(0.0f, 432, c28655q, c2550j4, (InterfaceC4339a) objM87133R2, false, true);
                    } else {
                        c28655q3.m87138X();
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    int i17 = BacsMandateConfirmationActivity.f22387y;
                    AbstractC31366a.m96462b(bacsMandateConfirmationActivity.m16865o(), composer2, 0);
                } else {
                    C28655q c28655q4 = (C28655q) composer2;
                    if (!c28655q4.m87121F()) {
                        int i18 = BacsMandateConfirmationActivity.f22387y;
                        AbstractC31366a.m96462b(bacsMandateConfirmationActivity.m16865o(), composer2, 0);
                    } else {
                        c28655q4.m87138X();
                    }
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    AbstractC12240d.m34061a(AbstractC37817c.m121344e(-1765080658, composer3, new C35563c(bacsMandateConfirmationActivity, i14)), AbstractC37817c.m121344e(2109767693, composer3, new C35563c(bacsMandateConfirmationActivity, 1)), null, null, composer3, 54, 12);
                } else {
                    C28655q c28655q5 = (C28655q) composer3;
                    if (!c28655q5.m87121F()) {
                        AbstractC12240d.m34061a(AbstractC37817c.m121344e(-1765080658, composer3, new C35563c(bacsMandateConfirmationActivity, i14)), AbstractC37817c.m121344e(2109767693, composer3, new C35563c(bacsMandateConfirmationActivity, 1)), null, null, composer3, 54, 12);
                    } else {
                        c28655q5.m87138X();
                    }
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    interfaceC30057d = null;
                    c16845kM113944O = AbstractC35902e.m113944O(null, composer4, 3);
                    c28655q2 = (C28655q) composer4;
                    c28655q2.m87150e0(-1893479488);
                    zM87157i2 = c28655q2.m87157i(bacsMandateConfirmationActivity) | c28655q2.m87157i(c16845kM113944O);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new C32139c0(bacsMandateConfirmationActivity, c16845kM113944O, interfaceC30057d, 18);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32139c0(bacsMandateConfirmationActivity, c16845kM113944O, interfaceC30057d, 18);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q2.m87173q(false);
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, c16845kM113944O);
                    c28655q2.m87150e0(-1893463756);
                    zM87157i3 = c28655q2.m87157i(bacsMandateConfirmationActivity);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R4 = new C35562b(bacsMandateConfirmationActivity, i15);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C35562b(bacsMandateConfirmationActivity, i15);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c28655q2.m87173q(false);
                    AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) objM87133R4, AbstractC37817c.m121344e(-643028593, c28655q2, new C35563c(bacsMandateConfirmationActivity, i15)), c28655q2, 24584, 6);
                } else {
                    C28655q c28655q6 = (C28655q) composer4;
                    if (!c28655q6.m87121F()) {
                        interfaceC30057d = null;
                        c16845kM113944O = AbstractC35902e.m113944O(null, composer4, 3);
                        c28655q2 = (C28655q) composer4;
                        c28655q2.m87150e0(-1893479488);
                        zM87157i2 = c28655q2.m87157i(bacsMandateConfirmationActivity) | c28655q2.m87157i(c16845kM113944O);
                        objM87133R3 = c28655q2.m87133R();
                        if (zM87157i2 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C32139c0(bacsMandateConfirmationActivity, c16845kM113944O, interfaceC30057d, 18);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        c28655q2.m87173q(false);
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, c16845kM113944O);
                        c28655q2.m87150e0(-1893463756);
                        zM87157i3 = c28655q2.m87157i(bacsMandateConfirmationActivity);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87157i3 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C35562b(bacsMandateConfirmationActivity, i15);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        c28655q2.m87173q(false);
                        AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) objM87133R4, AbstractC37817c.m121344e(-643028593, c28655q2, new C35563c(bacsMandateConfirmationActivity, i15)), c28655q2, 24584, 6);
                    } else {
                        c28655q6.m87138X();
                    }
                }
                break;
            default:
                Composer composer5 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1769676313, composer5, new C35563c(bacsMandateConfirmationActivity, i16)), composer5, 12582912, 127);
                } else {
                    C28655q c28655q7 = (C28655q) composer5;
                    if (!c28655q7.m87121F()) {
                        AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1769676313, composer5, new C35563c(bacsMandateConfirmationActivity, i16)), composer5, 12582912, 127);
                    } else {
                        c28655q7.m87138X();
                    }
                }
                break;
        }
        return c23454a0;
    }
}
