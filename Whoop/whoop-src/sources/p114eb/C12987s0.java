package p114eb;

import e93.AbstractC12889b;
import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12987s0 extends AbstractC12979o0 {

    /* JADX INFO: renamed from: f */
    public final C12967j1 f44863f;

    /* JADX INFO: renamed from: g */
    public final String f44864g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f44865h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12987s0(C12967j1 provider, String startDestination) {
        super(provider.mo36434b(AbstractC12889b.m36241G(C12989t0.class)), (String) null);
        AbstractC22676k.m65750j(provider, "provider");
        AbstractC22676k.m65750j(startDestination, "startDestination");
        this.f44865h = new ArrayList();
        this.f44863f = provider;
        this.f44864g = startDestination;
    }

    /* JADX INFO: renamed from: g */
    public final C12985r0 m36490g() {
        C12985r0 c12985r0 = (C12985r0) super.mo36473a();
        ArrayList<C12977n0> nodes = this.f44865h;
        AbstractC22676k.m65750j(nodes, "nodes");
        for (C12977n0 c12977n0 : nodes) {
            if (c12977n0 != null) {
                c12985r0.m36484p(c12977n0);
            }
        }
        String str = this.f44864g;
        if (str != null) {
            c12985r0.m36489v(str);
            return c12985r0;
        }
        if (((String) this.f44828b) != null) {
            throw new IllegalStateException("You must set a start destination route");
        }
        throw new IllegalStateException("You must set a start destination id");
    }
}
