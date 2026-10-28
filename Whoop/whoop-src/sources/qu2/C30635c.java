package qu2;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: qu2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C30635c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125984w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f125985x;

    public /* synthetic */ C30635c(Function1 function1, int i13) {
        this.f125984w = i13;
        this.f125985x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f125984w) {
            case 0:
                return AbstractC30640h.m94097U0(this.f125985x, obj);
            default:
                return AbstractC30640h.m94085O0(this.f125985x, obj);
        }
    }
}
