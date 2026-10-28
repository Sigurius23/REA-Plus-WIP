package p463rj;

import c93.InterfaceC4339a;
import com.amplitude.android.engagement.types.SurveyRatingBlock;
import com.amplitude.android.engagement.types.SurveyResponseNumber;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: rj.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C31477h extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Function1 f129705w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Integer f129706x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f129707y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ SurveyRatingBlock f129708z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31477h(Function1 function1, Integer num, int i13, SurveyRatingBlock surveyRatingBlock) {
        super(0);
        this.f129705w = function1;
        this.f129706x = num;
        this.f129707y = i13;
        this.f129708z = surveyRatingBlock;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        SurveyResponseNumber surveyResponseNumber;
        Integer num = this.f129706x;
        int i13 = this.f129707y;
        if (num != null && num.intValue() == i13) {
            surveyResponseNumber = null;
        } else {
            SurveyRatingBlock surveyRatingBlock = this.f129708z;
            surveyResponseNumber = new SurveyResponseNumber(surveyRatingBlock.getUuid(), i13, surveyRatingBlock.getMeta().getOptions());
        }
        this.f129705w.invoke(surveyResponseNumber);
        return C23454a0.f92919a;
    }
}
