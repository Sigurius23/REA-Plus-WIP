package p133f1;

import j93.AbstractC21478l0;
import p181h2.C16617b;
import p294l3.C23283u0;
import p411q2.InterfaceC29805a;
import p412q3.InterfaceC29884r;
import p510u0.C34346p1;
import p510u0.C34354s0;
import p510u0.EnumC34315f0;
import p510u0.InterfaceC34310d1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f1.l1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13956l1 implements InterfaceC34310d1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13977s1 f49752a;

    public C13956l1(C13977s1 c13977s1) {
        this.f49752a = c13977s1;
    }

    @Override // p510u0.InterfaceC34310d1
    /* JADX INFO: renamed from: a */
    public final void mo35182a() {
    }

    @Override // p510u0.InterfaceC34310d1
    /* JADX INFO: renamed from: b */
    public final void mo35183b(long j7) {
        C34346p1 c34346p1M108662d;
        C13977s1 c13977s1 = this.f49752a;
        long jM39745a = AbstractC13967p0.m39745a(c13977s1.m39781k(true));
        C34354s0 c34354s0 = c13977s1.f49848d;
        if (c34354s0 == null || (c34346p1M108662d = c34354s0.m108662d()) == null) {
            return;
        }
        long jM108652e = c34346p1M108662d.m108652e(jM39745a);
        c13977s1.f49859o = jM108652e;
        c13977s1.f49863s.setValue(new C16617b(jM108652e));
        c13977s1.f49861q = 0L;
        c13977s1.f49862r.setValue(EnumC34315f0.f144080w);
        c13977s1.m39789s(false);
    }

    @Override // p510u0.InterfaceC34310d1
    /* JADX INFO: renamed from: c */
    public final void mo35184c() {
        C13977s1 c13977s1 = this.f49752a;
        c13977s1.f49862r.setValue(null);
        c13977s1.f49863s.setValue(null);
    }

    @Override // p510u0.InterfaceC34310d1
    /* JADX INFO: renamed from: d */
    public final void mo35185d(long j7) {
        C34346p1 c34346p1M108662d;
        InterfaceC29805a interfaceC29805a;
        C13977s1 c13977s1 = this.f49752a;
        c13977s1.f49861q = C16617b.m47192h(c13977s1.f49861q, j7);
        C34354s0 c34354s0 = c13977s1.f49848d;
        if (c34354s0 == null || (c34346p1M108662d = c34354s0.m108662d()) == null) {
            return;
        }
        c13977s1.f49863s.setValue(new C16617b(C16617b.m47192h(c13977s1.f49859o, c13977s1.f49861q)));
        InterfaceC29884r interfaceC29884r = c13977s1.f49846b;
        C16617b c16617bM39779i = c13977s1.m39779i();
        AbstractC22676k.m65747g(c16617bM39779i);
        int iMo15743n = interfaceC29884r.mo15743n(c34346p1M108662d.m108649b(c16617bM39779i.f63937a, true));
        long jM60431f = AbstractC21478l0.m60431f(iMo15743n, iMo15743n);
        if (C23283u0.m67356b(jM60431f, c13977s1.m39783m().f122126b)) {
            return;
        }
        C34354s0 c34354s1 = c13977s1.f49848d;
        if ((c34354s1 == null || ((Boolean) c34354s1.f144323q.getValue()).booleanValue()) && (interfaceC29805a = c13977s1.f49855k) != null) {
            interfaceC29805a.mo7428a(9);
        }
        c13977s1.f49847c.invoke(C13977s1.m39774e(c13977s1.m39783m().f122125a, jM60431f));
        c13977s1.f49867w = new C23283u0(jM60431f);
    }

    @Override // p510u0.InterfaceC34310d1
    public final void onCancel() {
    }

    @Override // p510u0.InterfaceC34310d1
    public final void onStop() {
        C13977s1 c13977s1 = this.f49752a;
        c13977s1.f49862r.setValue(null);
        c13977s1.f49863s.setValue(null);
    }
}
