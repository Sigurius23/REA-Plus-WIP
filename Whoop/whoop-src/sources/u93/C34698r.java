package u93;

import p715kotlin.jvm.functions.Function1;
import va3.C35850h;
import z93.EnumC40212c;

/* JADX INFO: renamed from: u93.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C34698r implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f146141w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34702t f146142x;

    public /* synthetic */ C34698r(C34702t c34702t, int i13) {
        this.f146141w = i13;
        this.f146142x = c34702t;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f146141w) {
            case 0:
                C35850h c35850h = (C35850h) obj;
                if (c35850h != null) {
                    C34702t c34702t = this.f146142x;
                    return c34702t.m109611c(c35850h, c34702t.m109610b().getContributedFunctions(c35850h, EnumC40212c.f173633F));
                }
                C34702t.m109609a(8);
                throw null;
            default:
                C35850h c35850h2 = (C35850h) obj;
                if (c35850h2 != null) {
                    C34702t c34702t2 = this.f146142x;
                    return c34702t2.m109611c(c35850h2, c34702t2.m109610b().getContributedVariables(c35850h2, EnumC40212c.f173633F));
                }
                C34702t.m109609a(4);
                throw null;
        }
    }
}
