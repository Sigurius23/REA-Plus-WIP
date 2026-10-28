package p463rj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.SurveyRatingBlock;
import com.amplitude.android.engagement.types.SurveyResponseNumber;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: rj.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C31476g extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f129700E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f129701w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SurveyRatingBlock f129702x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ SurveyResponseNumber f129703y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f129704z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31476g(SurveyRatingBlock surveyRatingBlock, SurveyResponseNumber surveyResponseNumber, Function1 function1, int i13, int i14) {
        super(2);
        this.f129701w = i14;
        this.f129702x = surveyRatingBlock;
        this.f129703y = surveyResponseNumber;
        this.f129704z = function1;
        this.f129700E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f129701w;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i13) {
            case 0:
                AbstractC31479j.m96932k(this.f129702x, this.f129703y, this.f129704z, composer, AbstractC28683x.m87244L(this.f129700E | 1));
                break;
            default:
                AbstractC31479j.m96933l(this.f129702x, this.f129703y, this.f129704z, composer, AbstractC28683x.m87244L(this.f129700E | 1));
                break;
        }
        return C23454a0.f92919a;
    }
}
