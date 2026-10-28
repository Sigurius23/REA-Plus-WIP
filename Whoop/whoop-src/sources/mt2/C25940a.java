package mt2;

import nt2.AbstractC27131a;
import nt2.C27133c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mt2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C25940a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102458w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27133c f102459x;

    public /* synthetic */ C25940a(C27133c c27133c, int i13) {
        this.f102458w = i13;
        this.f102459x = c27133c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f102458w) {
            case 0:
                return AbstractC25944e.m76750H(this.f102459x, (AbstractC27131a) obj);
            case 1:
                return AbstractC25944e.m76753K(this.f102459x, (AbstractC27131a) obj);
            case 2:
                return AbstractC25944e.m76744B(this.f102459x, (AbstractC27131a) obj);
            case 3:
                return AbstractC25944e.m76747E(this.f102459x, (AbstractC27131a) obj);
            default:
                return AbstractC25944e.m76781y(this.f102459x, (AbstractC27131a) obj);
        }
    }
}
