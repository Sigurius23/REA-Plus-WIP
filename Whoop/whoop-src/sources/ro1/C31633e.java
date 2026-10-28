package ro1;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ro1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C31633e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130695w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31637i f130696x;

    public /* synthetic */ C31633e(C31637i c31637i, int i13) {
        this.f130695w = i13;
        this.f130696x = c31637i;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130695w) {
            case 0:
                return AbstractC31634f.m97754q(this.f130696x, obj);
            default:
                return AbstractC31634f.m97759v(this.f130696x, (AbstractC31635g) obj);
        }
    }
}
