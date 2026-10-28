package n20;

import android.app.Application;
import androidx.lifecycle.AbstractC1564b;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1601k1;
import bc3.AbstractC3006f0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import g73.C15556d;
import k20.C22136a;
import k20.C22150o;
import ng3.C26702o;
import p279kd.C22379f;
import p470rv.AbstractC31834n;
import p499t9.C33623c0;
import p499t9.C33647p;
import q20.AbstractC29840y;
import q83.InterfaceC30057d;
import u00.C34377e;
import vv1.C36532c;

/* JADX INFO: renamed from: n20.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C26186u extends AbstractC1564b {

    /* JADX INFO: renamed from: E */
    public volatile AbstractC29840y f103856E;

    /* JADX INFO: renamed from: F */
    public final C13045h2 f103857F;

    /* JADX INFO: renamed from: G */
    public final C13081r1 f103858G;

    /* JADX INFO: renamed from: H */
    public final C13081r1 f103859H;

    /* JADX INFO: renamed from: I */
    public final C36532c f103860I;

    /* JADX INFO: renamed from: x */
    public final C1601k1 f103861x;

    /* JADX INFO: renamed from: y */
    public final C26167b f103862y;

    /* JADX INFO: renamed from: z */
    public boolean f103863z;

    public C26186u(Application application, C1601k1 c1601k1, String str, Integer num) {
        super(application);
        this.f103861x = c1601k1;
        C26167b c26167b = new C26167b(new C15556d(27), new C34377e(12), new C33623c0(), new C33647p(7), new C15556d(18), new C26702o(11, false), num, application, str, this);
        this.f103862y = c26167b;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f103857F = c13045h2M36593c;
        this.f103858G = AbstractC13091v.m36598h(c13045h2M36593c);
        this.f103859H = c1601k1.m5002c(null, "state");
        this.f103860I = AbstractC31834n.m98894c(this, c1601k1);
        C22136a c22136a = (C22136a) c26167b.f103710c0.get();
        c22136a.m63389h(new C22150o(c22136a.f85863a), null);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C22379f(this, (InterfaceC30057d) null, 11), 3);
    }

    /* JADX INFO: renamed from: g */
    public final C26173h m77735g() {
        return (C26173h) this.f103861x.m5001b("state");
    }
}
