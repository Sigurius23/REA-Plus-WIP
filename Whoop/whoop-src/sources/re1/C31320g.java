package re1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.model.FeatureEducationSentence;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: re1.g */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31320g implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128895w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FeatureEducationSentence f128896x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f128897y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f128898z;

    public /* synthetic */ C31320g(FeatureEducationSentence featureEducationSentence, Function1 function1, int i13, int i14) {
        this.f128895w = i14;
        this.f128896x = featureEducationSentence;
        this.f128897y = function1;
        this.f128898z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f128895w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC31323j.m96338L(this.f128896x, this.f128897y, this.f128898z, composer, iIntValue);
            default:
                return AbstractC31323j.m96341O(this.f128896x, this.f128897y, this.f128898z, composer, iIntValue);
        }
    }
}
