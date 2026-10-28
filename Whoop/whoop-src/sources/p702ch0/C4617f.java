package p702ch0;

import p715kotlin.jvm.functions.Function1;
import yg0.AbstractC39523b;
import zg0.AbstractC40624g;

/* JADX INFO: renamed from: ch0.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4617f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18616w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4656v0 f18617x;

    public /* synthetic */ C4617f(C4656v0 c4656v0, int i13) {
        this.f18616w = i13;
        this.f18617x = c4656v0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18616w) {
            case 0:
                return AbstractC4639n.m14475N(this.f18617x, (AbstractC39523b) obj);
            case 1:
                return AbstractC4639n.m14484W(this.f18617x, (AbstractC39523b) obj);
            case 2:
                return AbstractC4610c1.m14361t(this.f18617x, (AbstractC40624g) obj);
            default:
                return AbstractC4610c1.m14362u(this.f18617x, ((Integer) obj).intValue());
        }
    }
}
