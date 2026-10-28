package p114eb;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12963i0 extends C12967j1 {

    /* JADX INFO: renamed from: c */
    public final C12960h0 f44777c = new C12960h0();

    public C12963i0() {
        m36450a(new C12989t0(this));
    }

    @Override // p114eb.C12967j1
    /* JADX INFO: renamed from: b */
    public final AbstractC12964i1 mo36434b(String name) {
        AbstractC22676k.m65750j(name, "name");
        try {
            return super.mo36434b(name);
        } catch (IllegalStateException unused) {
            C12960h0 c12960h0 = this.f44777c;
            AbstractC22676k.m65748h(c12960h0, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
            return c12960h0;
        }
    }
}
