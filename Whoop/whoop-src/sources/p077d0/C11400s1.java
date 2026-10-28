package p077d0;

import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: d0.s1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11400s1 {

    /* JADX INFO: renamed from: a */
    public final C11351f2 f36545a;

    /* JADX INFO: renamed from: b */
    public final C28633k1 f36546b = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C11421z1 f36547c;

    public C11400s1(C11421z1 c11421z1, C11351f2 c11351f2, String str) {
        this.f36547c = c11421z1;
        this.f36545a = c11351f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final C11397r1 m30630a(Function1 function1, Function1 function2) {
        C11397r1 c11397r1M30631b = m30631b();
        C11421z1 c11421z1 = this.f36547c;
        if (c11397r1M30631b == null) {
            Object objInvoke = function2.invoke(c11421z1.f36630a.mo2428y0());
            Object objInvoke2 = function2.invoke(c11421z1.f36630a.mo2428y0());
            C11351f2 c11351f2 = this.f36545a;
            AbstractC11395r abstractC11395r = (AbstractC11395r) c11351f2.f36396a.invoke(objInvoke2);
            abstractC11395r.mo30610d();
            C11409v1 c11409v1 = new C11409v1(c11421z1, objInvoke, abstractC11395r, c11351f2);
            c11397r1M30631b = new C11397r1(this, c11409v1, function1, function2);
            this.f36546b.setValue(c11397r1M30631b);
            c11421z1.f36638i.add(c11409v1);
        }
        c11397r1M30631b.f36542y = (AbstractC22680m) function2;
        c11397r1M30631b.f36541x = function1;
        c11397r1M30631b.m30629a(c11421z1.m30664f());
        return c11397r1M30631b;
    }

    /* JADX INFO: renamed from: b */
    public final C11397r1 m30631b() {
        return (C11397r1) this.f36546b.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: c */
    public final void m30632c() {
        C11397r1 c11397r1M30631b = m30631b();
        if (c11397r1M30631b != null) {
            C11409v1 c11409v1 = c11397r1M30631b.f36540w;
            ?? r10 = c11397r1M30631b.f36542y;
            C11421z1 c11421z1 = this.f36547c;
            c11409v1.m30644g(r10.invoke(c11421z1.m30664f().mo11596c()), c11397r1M30631b.f36542y.invoke(c11421z1.m30664f().mo11595b()), (InterfaceC11337c0) c11397r1M30631b.f36541x.invoke(c11421z1.m30664f()));
        }
    }
}
