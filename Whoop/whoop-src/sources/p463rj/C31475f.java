package p463rj;

import c93.InterfaceC4339a;
import com.amplitude.android.engagement.types.SurveyRatingBlock;
import com.amplitude.android.engagement.types.SurveyResponseNPS;
import com.amplitude.android.engagement.types.SurveyResponseNumber;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: rj.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C31475f extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f129695E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f129696w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f129697x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f129698y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ SurveyRatingBlock f129699z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31475f(Function1 function1, boolean z4, SurveyRatingBlock surveyRatingBlock, int i13, int i14) {
        super(0);
        this.f129696w = i14;
        this.f129697x = function1;
        this.f129698y = z4;
        this.f129699z = surveyRatingBlock;
        this.f129695E = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        SurveyResponseNPS surveyResponseNPS;
        SurveyResponseNumber surveyResponseNumber;
        switch (this.f129696w) {
            case 0:
                if (this.f129698y) {
                    surveyResponseNPS = null;
                } else {
                    SurveyRatingBlock surveyRatingBlock = this.f129699z;
                    surveyResponseNPS = new SurveyResponseNPS(surveyRatingBlock.getUuid(), this.f129695E, surveyRatingBlock.getMeta().getOptions());
                }
                this.f129697x.invoke(surveyResponseNPS);
                break;
            default:
                if (this.f129698y) {
                    surveyResponseNumber = null;
                } else {
                    SurveyRatingBlock surveyRatingBlock2 = this.f129699z;
                    surveyResponseNumber = new SurveyResponseNumber(surveyRatingBlock2.getUuid(), this.f129695E, surveyRatingBlock2.getMeta().getOptions());
                }
                this.f129697x.invoke(surveyResponseNumber);
                break;
        }
        return C23454a0.f92919a;
    }
}
