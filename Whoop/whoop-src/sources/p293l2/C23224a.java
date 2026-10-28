package p293l2;

import androidx.compose.p018ui.platform.AndroidComposeView;
import p005a3.C0230n0;
import p005a3.C0258v;
import p037bu.C3632c;
import p133f1.C13968p1;
import p268k0.AbstractC22086a;
import p389p0.C28521f0;
import p390p1.C28621h1;
import p512u2.AbstractC34454d0;
import p512u2.C34453d;
import p512u2.C34472r;
import so.C32800q;

/* JADX INFO: renamed from: l2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C23224a {

    /* JADX INFO: renamed from: a */
    public boolean f91957a;

    /* JADX INFO: renamed from: b */
    public Object f91958b;

    /* JADX INFO: renamed from: c */
    public Object f91959c;

    /* JADX INFO: renamed from: d */
    public Object f91960d;

    /* JADX INFO: renamed from: e */
    public Object f91961e;

    /* JADX INFO: renamed from: a */
    public int m67206a(C32800q c32800q, AndroidComposeView androidComposeView, boolean z4) {
        int i13;
        boolean z13;
        boolean z14;
        C34453d c34453d = (C34453d) this.f91959c;
        C0258v c0258v = (C0258v) this.f91961e;
        if (this.f91957a) {
            return AbstractC34454d0.m108910a(false, false, false);
        }
        boolean z15 = true;
        try {
            this.f91957a = true;
            C13968p1 c13968p1M11159H = ((C3632c) this.f91960d).m11159H(c32800q, androidComposeView);
            int iM157i = c13968p1M11159H.m39755k().m157i();
            while (true) {
                if (i13 >= iM157i) {
                    z13 = true;
                    break;
                }
                C34472r c34472r = (C34472r) c13968p1M11159H.m39755k().m158j(i13);
                i13 = (c34472r.m108950f() || c34472r.m108953i()) ? 0 : i13 + 1;
                z13 = false;
                break;
            }
            int iM157i2 = c13968p1M11159H.m39755k().m157i();
            for (int i14 = 0; i14 < iM157i2; i14++) {
                C34472r c34472r2 = (C34472r) c13968p1M11159H.m39755k().m158j(i14);
                if (z13 || AbstractC34454d0.m108912c(c34472r2)) {
                    ((C0230n0) this.f91958b).m596N(c34472r2.m108949e(), (C0258v) this.f91961e, c34472r2.m108954j(), true);
                    if (!c0258v.f881w.m104g()) {
                        c34453d.m108906a(c34472r2.m108948d(), c0258v, AbstractC34454d0.m108912c(c34472r2));
                        c0258v.clear();
                    }
                }
            }
            boolean zM108907b = c34453d.m108907b(c13968p1M11159H, z4);
            if (c13968p1M11159H.m39757o()) {
                z14 = false;
                break;
            }
            int iM157i3 = c13968p1M11159H.m39755k().m157i();
            int i15 = 0;
            while (true) {
                if (i15 >= iM157i3) {
                    z14 = false;
                    break;
                }
                C34472r c34472r3 = (C34472r) c13968p1M11159H.m39755k().m158j(i15);
                if (AbstractC34454d0.m108922m(c34472r3) && c34472r3.m108956l()) {
                    z14 = true;
                    break;
                }
                i15++;
            }
            int iM157i4 = c13968p1M11159H.m39755k().m157i();
            int i16 = 0;
            while (true) {
                if (i16 >= iM157i4) {
                    z15 = false;
                    break;
                }
                if (((C34472r) c13968p1M11159H.m39755k().m158j(i16)).m108956l()) {
                    break;
                }
                i16++;
            }
            return AbstractC34454d0.m108910a(zM108907b, z14, z15);
        } finally {
            this.f91957a = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m67207b(int i13, int i14) {
        if (i13 < 0.0f) {
            AbstractC22086a.m63158a("Index should be non-negative (" + i13 + ')');
        }
        ((C28621h1) this.f91958b).m87025y(i13);
        ((C28521f0) this.f91961e).m86825a(i13);
        ((C28621h1) this.f91959c).m87025y(i14);
    }
}
