package mt2;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mt2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C25941b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102460w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25945f f102461x;

    public /* synthetic */ C25941b(C25945f c25945f, int i13) {
        this.f102460w = i13;
        this.f102461x = c25945f;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f102460w) {
            case 0:
                return AbstractC25944e.m76751I(this.f102461x, (AbstractC25946g) obj);
            case 1:
                return AbstractC25944e.m76754L(this.f102461x, (AbstractC25946g) obj);
            default:
                return AbstractC25944e.m76748F(this.f102461x, (AbstractC25946g) obj);
        }
    }
}
