package cx;

import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import ax.InterfaceC2116a;
import ax.InterfaceC2117b;
import ax.InterfaceC2118c;
import java.util.HashSet;
import java.util.LinkedHashSet;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cx.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C11175k {

    /* JADX INFO: renamed from: a */
    public AbstractActivityC1340r0 f35775a;

    /* JADX INFO: renamed from: b */
    public int f35776b;

    /* JADX INFO: renamed from: c */
    public LinkedHashSet f35777c;

    /* JADX INFO: renamed from: d */
    public LinkedHashSet f35778d;

    /* JADX INFO: renamed from: e */
    public LinkedHashSet f35779e;

    /* JADX INFO: renamed from: f */
    public LinkedHashSet f35780f;

    /* JADX INFO: renamed from: g */
    public LinkedHashSet f35781g;

    /* JADX INFO: renamed from: h */
    public LinkedHashSet f35782h;

    /* JADX INFO: renamed from: i */
    public LinkedHashSet f35783i;

    /* JADX INFO: renamed from: j */
    public LinkedHashSet f35784j;

    /* JADX INFO: renamed from: k */
    public LinkedHashSet f35785k;

    /* JADX INFO: renamed from: l */
    public InterfaceC2118c f35786l;

    /* JADX INFO: renamed from: m */
    public InterfaceC2116a f35787m;

    /* JADX INFO: renamed from: n */
    public InterfaceC2117b f35788n;

    /* JADX INFO: renamed from: a */
    public final AbstractActivityC1340r0 m30280a() {
        AbstractActivityC1340r0 abstractActivityC1340r0 = this.f35775a;
        if (abstractActivityC1340r0 != null) {
            return abstractActivityC1340r0;
        }
        AbstractC22676k.m65757q("activity");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1329o1 m30281b() {
        AbstractC1329o1 supportFragmentManager = m30280a().getSupportFragmentManager();
        AbstractC22676k.m65749i(supportFragmentManager, "getSupportFragmentManager(...)");
        return supportFragmentManager;
    }

    /* JADX INFO: renamed from: c */
    public final C11174j m30282c() {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = m30281b().m4140E("InvisibleFragment");
        if (abstractComponentCallbacksC1320m0M4140E != null) {
            return (C11174j) abstractComponentCallbacksC1320m0M4140E;
        }
        C11174j c11174j = new C11174j();
        C1271a c1271a = new C1271a(m30281b());
        c1271a.mo4042d(0, c11174j, "InvisibleFragment", 1);
        if (c1271a.f5569i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c1271a.f5570j = false;
        c1271a.f5518t.m4136A(c1271a, true);
        return c11174j;
    }

    /* JADX INFO: renamed from: d */
    public final int m30283d() {
        return m30280a().getApplicationInfo().targetSdkVersion;
    }

    /* JADX INFO: renamed from: e */
    public final void m30284e(InterfaceC2118c interfaceC2118c) {
        this.f35786l = interfaceC2118c;
        this.f35776b = m30280a().getRequestedOrientation();
        int i13 = m30280a().getResources().getConfiguration().orientation;
        if (i13 == 1) {
            m30280a().setRequestedOrientation(7);
        } else if (i13 == 2) {
            m30280a().setRequestedOrientation(6);
        }
        C11176l c11176l = new C11176l(this, 3);
        C11176l c11176l2 = new C11176l(this, 0);
        c11176l.f35750b = c11176l2;
        C11176l c11176l3 = new C11176l(this, 5);
        c11176l2.f35750b = c11176l3;
        C11176l c11176l4 = new C11176l(this, 6);
        c11176l3.f35750b = c11176l4;
        C11177m c11177m = new C11177m(this);
        c11176l4.f35750b = c11177m;
        C11176l c11176l5 = new C11176l(this, 2);
        c11177m.f35750b = c11176l5;
        C11176l c11176l6 = new C11176l(this, 4);
        c11176l5.f35750b = c11176l6;
        c11176l6.f35750b = new C11176l(this, 1);
        c11176l.mo30274m();
    }

    /* JADX INFO: renamed from: f */
    public final void m30285f(HashSet permissions, C11176l c11176l) {
        AbstractC22676k.m65750j(permissions, "permissions");
        C11174j c11174jM30282c = m30282c();
        c11174jM30282c.f35772x = this;
        c11174jM30282c.f35773y = c11176l;
        c11174jM30282c.f35774z.mo4052a(permissions.toArray(new String[0]), null);
    }
}
