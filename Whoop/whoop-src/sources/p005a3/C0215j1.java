package p005a3;

import p026b2.AbstractC2316v;
import p026b2.InterfaceC2315u;
import p446r1.C30849c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0215j1 {

    /* JADX INFO: renamed from: a */
    public AbstractC2316v f717a;

    /* JADX INFO: renamed from: b */
    public int f718b;

    /* JADX INFO: renamed from: c */
    public C30849c f719c;

    /* JADX INFO: renamed from: d */
    public C30849c f720d;

    /* JADX INFO: renamed from: e */
    public boolean f721e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0223l1 f722f;

    public C0215j1(C0223l1 c0223l1, AbstractC2316v abstractC2316v, int i13, C30849c c30849c, C30849c c30849c2, boolean z4) {
        this.f722f = c0223l1;
        this.f717a = abstractC2316v;
        this.f718b = i13;
        this.f719c = c30849c;
        this.f720d = c30849c2;
        this.f721e = z4;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m541a(int i13, int i14) {
        C30849c c30849c = this.f719c;
        int i15 = this.f718b;
        InterfaceC2315u interfaceC2315u = (InterfaceC2315u) c30849c.f127227w[i13 + i15];
        InterfaceC2315u interfaceC2315u2 = (InterfaceC2315u) this.f720d.f127227w[i15 + i14];
        return AbstractC22676k.m65745e(interfaceC2315u, interfaceC2315u2) || interfaceC2315u.getClass() == interfaceC2315u2.getClass();
    }
}
