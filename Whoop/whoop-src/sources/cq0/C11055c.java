package cq0;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: cq0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C11055c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34719w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC11057e f34720x;

    public /* synthetic */ C11055c(AbstractC11057e abstractC11057e, int i13) {
        this.f34719w = i13;
        this.f34720x = abstractC11057e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34719w) {
            case 0:
                return AbstractC11057e.m29742w(this.f34720x, obj);
            case 1:
                return AbstractC11057e.m29734o(this.f34720x, obj);
            case 2:
                return AbstractC11057e.m29740u(this.f34720x, obj);
            default:
                return AbstractC11057e.m29738s(this.f34720x, obj);
        }
    }
}
