package uw0;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: uw0.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C35298h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f150308w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f150309x;

    public /* synthetic */ C35298h(Function1 function1, int i13) {
        this.f150308w = i13;
        this.f150309x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f150308w) {
            case 0:
                return AbstractC35302l.m112032q(this.f150309x, obj);
            case 1:
                return AbstractC35307q.m112095h(this.f150309x, (String) obj);
            case 2:
                return AbstractC35307q.m112097j(this.f150309x, ((Integer) obj).intValue());
            default:
                return AbstractC35307q.m112098k(this.f150309x, (String) obj);
        }
    }
}
