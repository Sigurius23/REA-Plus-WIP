package u10;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.paymentelement.embedded.manage.ManageActivity;
import d40.AbstractC11673r;
import h40.C16845k;
import l83.C23454a0;
import o73.C27648a;
import p000.C2175b;
import p097ds.AbstractC12313p;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p550vd.AbstractC35902e;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: u10.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C34419g implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144652w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ManageActivity f144653x;

    public /* synthetic */ C34419g(ManageActivity manageActivity, int i13) {
        this.f144652w = i13;
        this.f144653x = manageActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ManageActivity manageActivity;
        InterfaceC28601c1 interfaceC28601c1M83597t;
        C28655q c28655q;
        boolean zM87153g;
        Object objM87133R;
        boolean zM87157i;
        Object objM87133R2;
        switch (this.f144652w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        manageActivity = this.f144653x;
                        interfaceC28601c1M83597t = C27648a.m83597t(manageActivity.m16854r().f144668c, composer, 0);
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(938748723);
                        zM87153g = c28655q.m87153g(interfaceC28601c1M83597t);
                        objM87133R = c28655q.m87133R();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (zM87153g || objM87133R == c28676v0) {
                            objM87133R = new C2175b(interfaceC28601c1M83597t, 11);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        C16845k c16845kM113944O = AbstractC35902e.m113944O((Function1) objM87133R, c28655q, 1);
                        c28655q.m87150e0(938754672);
                        zM87157i = c28655q.m87157i(manageActivity);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i || objM87133R2 == c28676v0) {
                            objM87133R2 = new C34417e(manageActivity, 4);
                            c28655q.m87172p0(objM87133R2);
                        }
                        c28655q.m87173q(false);
                        AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) objM87133R2, AbstractC37817c.m121344e(1832322730, c28655q, new C34418f(0, manageActivity, interfaceC28601c1M83597t)), c28655q, 24584, 6);
                    }
                } else {
                    manageActivity = this.f144653x;
                    interfaceC28601c1M83597t = C27648a.m83597t(manageActivity.m16854r().f144668c, composer, 0);
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(938748723);
                    zM87153g = c28655q.m87153g(interfaceC28601c1M83597t);
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (zM87153g) {
                        objM87133R = new C2175b(interfaceC28601c1M83597t, 11);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2175b(interfaceC28601c1M83597t, 11);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    C16845k c16845kM113944O2 = AbstractC35902e.m113944O((Function1) objM87133R, c28655q, 1);
                    c28655q.m87150e0(938754672);
                    zM87157i = c28655q.m87157i(manageActivity);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C34417e(manageActivity, 4);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C34417e(manageActivity, 4);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    AbstractC12313p.m34277b(c16845kM113944O2, null, 0.0f, (InterfaceC4339a) objM87133R2, AbstractC37817c.m121344e(1832322730, c28655q, new C34418f(0, manageActivity, interfaceC28601c1M83597t)), c28655q, 24584, 6);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1304251054, composer2, new C34419g(this.f144653x, 0)), composer2, 12582912, 127);
                    }
                } else {
                    AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1304251054, composer2, new C34419g(this.f144653x, 0)), composer2, 12582912, 127);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
