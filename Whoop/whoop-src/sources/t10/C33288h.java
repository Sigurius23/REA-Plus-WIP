package t10;

import androidx.compose.runtime.Composer;
import b30.C2647w2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.paymentelement.embedded.form.FormActivity;
import d40.AbstractC11673r;
import h40.C16845k;
import j93.InterfaceC21467g;
import l83.C23454a0;
import o73.C27648a;
import p00.C28573j;
import p000.C2175b;
import p097ds.AbstractC12313p;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p550vd.AbstractC35902e;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t10.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C33288h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138831w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FormActivity f138832x;

    public /* synthetic */ C33288h(FormActivity formActivity, int i13) {
        this.f138831w = i13;
        this.f138832x = formActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        FormActivity formActivity;
        C33285e c33285e;
        InterfaceC28601c1 interfaceC28601c1M83597t;
        C28655q c28655q;
        boolean zM87153g;
        Object objM87133R;
        boolean zM87157i;
        Object objM87133R2;
        switch (this.f138831w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        formActivity = this.f138832x;
                        c33285e = formActivity.f22337E;
                        if (c33285e != null) {
                            AbstractC22676k.m65757q("formActivityStateHelper");
                            throw null;
                        }
                        interfaceC28601c1M83597t = C27648a.m83597t(c33285e.f138825g, composer, 0);
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(1604244160);
                        zM87153g = c28655q.m87153g(interfaceC28601c1M83597t);
                        objM87133R = c28655q.m87133R();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (zM87153g || objM87133R == c28676v0) {
                            objM87133R = new C2175b(interfaceC28601c1M83597t, 10);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        C16845k c16845kM113944O = AbstractC35902e.m113944O((Function1) objM87133R, c28655q, 1);
                        c28655q.m87150e0(1604249437);
                        zM87157i = c28655q.m87157i(formActivity);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i || objM87133R2 == c28676v0) {
                            C28573j c28573j = new C28573j(0, formActivity, FormActivity.class, "setCancelAndFinish", "setCancelAndFinish()V", 0, 15);
                            c28655q.m87172p0(c28573j);
                            objM87133R2 = c28573j;
                        }
                        c28655q.m87173q(false);
                        AbstractC12313p.m34277b(c16845kM113944O, null, 0.0f, (InterfaceC4339a) ((InterfaceC21467g) objM87133R2), AbstractC37817c.m121344e(-1710455827, c28655q, new C2647w2(28, formActivity, interfaceC28601c1M83597t)), c28655q, 24584, 6);
                    }
                } else {
                    formActivity = this.f138832x;
                    c33285e = formActivity.f22337E;
                    if (c33285e != null) {
                        AbstractC22676k.m65757q("formActivityStateHelper");
                        throw null;
                    }
                    interfaceC28601c1M83597t = C27648a.m83597t(c33285e.f138825g, composer, 0);
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(1604244160);
                    zM87153g = c28655q.m87153g(interfaceC28601c1M83597t);
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (zM87153g) {
                        objM87133R = new C2175b(interfaceC28601c1M83597t, 10);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2175b(interfaceC28601c1M83597t, 10);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    C16845k c16845kM113944O2 = AbstractC35902e.m113944O((Function1) objM87133R, c28655q, 1);
                    c28655q.m87150e0(1604249437);
                    zM87157i = c28655q.m87157i(formActivity);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        C28573j c28573j2 = new C28573j(0, formActivity, FormActivity.class, "setCancelAndFinish", "setCancelAndFinish()V", 0, 15);
                        c28655q.m87172p0(c28573j2);
                        objM87133R2 = c28573j2;
                    } else {
                        C28573j c28573j3 = new C28573j(0, formActivity, FormActivity.class, "setCancelAndFinish", "setCancelAndFinish()V", 0, 15);
                        c28655q.m87172p0(c28573j3);
                        objM87133R2 = c28573j3;
                    }
                    c28655q.m87173q(false);
                    AbstractC12313p.m34277b(c16845kM113944O2, null, 0.0f, (InterfaceC4339a) ((InterfaceC21467g) objM87133R2), AbstractC37817c.m121344e(-1710455827, c28655q, new C2647w2(28, formActivity, interfaceC28601c1M83597t)), c28655q, 24584, 6);
                }
                return C23454a0.f92919a;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1031122795, composer2, new C33288h(this.f138832x, 0)), composer2, 12582912, 127);
                    }
                } else {
                    AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1031122795, composer2, new C33288h(this.f138832x, 0)), composer2, 12582912, 127);
                }
                return C23454a0.f92919a;
        }
    }
}
