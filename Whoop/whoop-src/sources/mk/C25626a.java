package mk;

import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import ck.C4773c;
import lk.C24488g;
import p007a6.C0410c;
import p007a6.C0419f;
import p173gj.C15903d;
import p255jk.C21743a;
import p282kk.C22532a;
import p282kk.C22533b;
import p282kk.EnumC22535d;
import p282kk.InterfaceC22536e;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mk.a */
/* JADX INFO: loaded from: classes.dex */
public final class C25626a implements InterfaceC22536e {

    /* JADX INFO: renamed from: E */
    public C24488g f100567E;

    /* JADX INFO: renamed from: x */
    public C15903d f100569x;

    /* JADX INFO: renamed from: z */
    public C22533b f100571z;

    /* JADX INFO: renamed from: w */
    public final C37199o f100568w = new C37199o(25, false);

    /* JADX INFO: renamed from: y */
    public final boolean f100570y = true;

    @Override // p282kk.InterfaceC22536e
    /* JADX INFO: renamed from: a */
    public final C21743a mo15042a(C21743a c21743a) {
        return null;
    }

    @Override // p282kk.InterfaceC22536e
    /* JADX INFO: renamed from: b */
    public final void mo15043b(C15903d c15903d) {
        this.f100569x = c15903d;
        C37199o c37199o = this.f100568w;
        c37199o.getClass();
        c37199o.f159041x = c15903d;
        C22533b c22533b = new C22533b(c15903d);
        this.f100571z = c22533b;
        c22533b.f88566i = true;
        C15903d c15903d2 = c22533b.f88558a;
        AbstractC3076z abstractC3076z = c15903d2.f60133f;
        C22532a c22532a = new C22532a(c22533b, null);
        InterfaceC2994c0 interfaceC2994c0 = c22533b.f88563f;
        AbstractC3006f0.m8732z(interfaceC2994c0, abstractC3076z, null, c22532a, 2);
        AbstractC3006f0.m8732z(interfaceC2994c0, c15903d2.f60132e, null, new C0419f(c22533b, null), 2);
        this.f100567E = new C24488g(c15903d.m44883d(), c15903d, c15903d.f60138k, c15903d.f60128a, this);
        C4773c c4773c = new C4773c(1);
        m75401d();
        c37199o.m119224f(c4773c);
    }

    /* JADX INFO: renamed from: c */
    public final void m75400c(C21743a c21743a) {
        if (c21743a.f83629a != null || c21743a.f83630b != null) {
            AbstractC3006f0.m8732z(m75401d().f60130c, m75401d().f60133f, null, new C0410c(this, c21743a, null, 25), 2);
        } else {
            m75401d().f60138k.warn("Event is invalid for missing information like userId and deviceId. Dropping event: " + c21743a.mo61353a());
        }
    }

    /* JADX INFO: renamed from: d */
    public final C15903d m75401d() {
        C15903d c15903d = this.f100569x;
        if (c15903d != null) {
            return c15903d;
        }
        AbstractC22676k.m65757q("amplitude");
        throw null;
    }

    @Override // p282kk.InterfaceC22536e
    public final EnumC22535d getType() {
        return EnumC22535d.f88575y;
    }
}
