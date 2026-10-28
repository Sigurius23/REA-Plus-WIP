package w20;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity;
import d40.AbstractC11673r;
import h40.C16845k;
import l83.C23454a0;
import o73.C27648a;
import p097ds.AbstractC12313p;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p550vd.AbstractC35902e;
import p602x1.AbstractC37817c;
import q83.InterfaceC30057d;
import s40.C32139c0;
import u10.C34418f;

/* JADX INFO: renamed from: w20.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C36718h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157201w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CvcRecollectionActivity f157202x;

    public /* synthetic */ C36718h(CvcRecollectionActivity cvcRecollectionActivity, int i13) {
        this.f157201w = i13;
        this.f157202x = cvcRecollectionActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC30057d interfaceC30057d;
        C16845k c16845kM113944O;
        CvcRecollectionActivity cvcRecollectionActivity;
        C28655q c28655q;
        boolean zM87157i;
        Object objM87133R;
        boolean zM87157i2;
        Object objM87133R2;
        switch (this.f157201w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        interfaceC30057d = null;
                        c16845kM113944O = AbstractC35902e.m113944O(null, composer, 3);
                        cvcRecollectionActivity = this.f157202x;
                        InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(((C36734x) cvcRecollectionActivity.f22392x.getValue()).f157233w, composer, 0);
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(-1122420617);
                        zM87157i = c28655q.m87157i(cvcRecollectionActivity) | c28655q.m87157i(c16845kM113944O);
                        objM87133R = c28655q.m87133R();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (zM87157i || objM87133R == c28676v0) {
                            objM87133R = new C32139c0(cvcRecollectionActivity, c16845kM113944O, interfaceC30057d, 19);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c16845kM113944O);
                        c28655q.m87150e0(-1122405063);
                        zM87157i2 = c28655q.m87157i(cvcRecollectionActivity);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C36717g(cvcRecollectionActivity, 2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        c28655q.m87173q(false);
                        AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) objM87133R2, AbstractC37817c.m121344e(-8646823, c28655q, new C34418f(1, cvcRecollectionActivity, interfaceC28601c1M83597t)), c28655q, 24584, 6);
                    }
                } else {
                    interfaceC30057d = null;
                    c16845kM113944O = AbstractC35902e.m113944O(null, composer, 3);
                    cvcRecollectionActivity = this.f157202x;
                    InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(((C36734x) cvcRecollectionActivity.f22392x.getValue()).f157233w, composer, 0);
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(-1122420617);
                    zM87157i = c28655q.m87157i(cvcRecollectionActivity) | c28655q.m87157i(c16845kM113944O);
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (zM87157i) {
                        objM87133R = new C32139c0(cvcRecollectionActivity, c16845kM113944O, interfaceC30057d, 19);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C32139c0(cvcRecollectionActivity, c16845kM113944O, interfaceC30057d, 19);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c16845kM113944O);
                    c28655q.m87150e0(-1122405063);
                    zM87157i2 = c28655q.m87157i(cvcRecollectionActivity);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R2 = new C36717g(cvcRecollectionActivity, 2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C36717g(cvcRecollectionActivity, 2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) objM87133R2, AbstractC37817c.m121344e(-8646823, c28655q, new C34418f(1, cvcRecollectionActivity, interfaceC28601c1M83597t2)), c28655q, 24584, 6);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1258848255, composer2, new C36718h(this.f157202x, 0)), composer2, 12582912, 127);
                    }
                } else {
                    AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1258848255, composer2, new C36718h(this.f157202x, 0)), composer2, 12582912, 127);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
