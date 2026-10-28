package p463rj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.SurveyRatingBlock;
import l83.C23454a0;
import p305lj.AbstractC24425e0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: rj.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C31473d extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f129685E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f129686w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SurveyRatingBlock f129687x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC24425e0 f129688y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f129689z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31473d(SurveyRatingBlock surveyRatingBlock, AbstractC24425e0 abstractC24425e0, Function1 function1, int i13, int i14) {
        super(2);
        this.f129686w = i14;
        this.f129687x = surveyRatingBlock;
        this.f129688y = abstractC24425e0;
        this.f129689z = function1;
        this.f129685E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f129686w;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i13) {
            case 0:
                AbstractC31479j.m96929h(this.f129687x, this.f129688y, this.f129689z, composer, AbstractC28683x.m87244L(this.f129685E | 1));
                break;
            default:
                AbstractC31479j.m96929h(this.f129687x, this.f129688y, this.f129689z, composer, AbstractC28683x.m87244L(this.f129685E | 1));
                break;
        }
        return C23454a0.f92919a;
    }
}
