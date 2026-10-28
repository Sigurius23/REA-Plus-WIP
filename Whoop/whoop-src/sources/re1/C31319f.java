package re1;

import c93.InterfaceC4339a;
import com.whoop.design.model.FeatureEducationSentence;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: re1.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31319f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128892w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FeatureEducationSentence f128893x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f128894y;

    public /* synthetic */ C31319f(FeatureEducationSentence featureEducationSentence, Function1 function1, int i13) {
        this.f128892w = i13;
        this.f128893x = featureEducationSentence;
        this.f128894y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f128892w) {
            case 0:
                return AbstractC31323j.m96337K(this.f128893x, this.f128894y);
            default:
                return AbstractC31323j.m96340N(this.f128893x, this.f128894y);
        }
    }
}
