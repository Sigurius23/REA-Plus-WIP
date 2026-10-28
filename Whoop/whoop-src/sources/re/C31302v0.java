package re;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31302v0 {

    /* JADX INFO: renamed from: a */
    public String f128847a;

    /* JADX INFO: renamed from: b */
    public C31276i0 f128848b;

    /* JADX INFO: renamed from: c */
    public C31310z0 f128849c;

    /* JADX INFO: renamed from: d */
    public C31258b1 f128850d;

    /* JADX INFO: renamed from: a */
    public final C31304w0 m96307a() {
        return new C31304w0(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m96308b(Function1 block) {
        AbstractC22676k.m65750j(block, "block");
        C31274h0 c31274h0 = new C31274h0();
        block.invoke(c31274h0);
        this.f128848b = new C31276i0(c31274h0);
    }

    /* JADX INFO: renamed from: c */
    public final void m96309c(String str) {
        this.f128847a = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m96310d(Function1 block) {
        AbstractC22676k.m65750j(block, "block");
        C31308y0 c31308y0 = new C31308y0();
        block.invoke(c31308y0);
        this.f128849c = new C31310z0(c31308y0);
    }

    /* JADX INFO: renamed from: e */
    public final void m96311e(Function1 block) {
        AbstractC22676k.m65750j(block, "block");
        block.invoke(new C31255a1());
        this.f128850d = new C31258b1();
    }
}
