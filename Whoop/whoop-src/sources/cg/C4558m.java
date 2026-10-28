package cg;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import tg.C33775g;

/* JADX INFO: renamed from: cg.m */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C4558m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18364w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4555j f18365x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC4565t f18366y;

    public /* synthetic */ C4558m(C4555j c4555j, AbstractC4565t abstractC4565t, int i13) {
        this.f18364w = i13;
        this.f18365x = c4555j;
        this.f18366y = abstractC4565t;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f18364w) {
            case 0:
                AbstractC22676k.m65750j(it, "it");
                C4552g c4552g = this.f18365x.f18351E;
                c4552g.getClass();
                if (this.f18366y.m14243a(C4564s.f18378d)) {
                    c4552g.m14234c(c4552g.f18346z, it);
                } else {
                    c4552g.m14234c(c4552g.f18345y, it);
                }
                break;
            default:
                AbstractC22676k.m65750j(it, "it");
                boolean zM14243a = this.f18366y.m14243a(C4562q.f18376d);
                C4555j c4555j = this.f18365x;
                if (zM14243a) {
                    c4555j.f18353G = C33775g.f141361k.m106779d(it);
                } else {
                    c4555j.f18353G = C33775g.f141361k.m106778c(it);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
