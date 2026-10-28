package p463rj;

import c93.InterfaceC4339a;
import com.amplitude.android.engagement.types.SurveyRatingBlock;
import com.amplitude.android.engagement.types.SurveyResponseEmoji;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: rj.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C31474e extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f129690E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Function1 f129691w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f129692x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ SurveyRatingBlock f129693y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f129694z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31474e(Function1 function1, boolean z4, SurveyRatingBlock surveyRatingBlock, int i13, String str) {
        super(0);
        this.f129691w = function1;
        this.f129692x = z4;
        this.f129693y = surveyRatingBlock;
        this.f129694z = i13;
        this.f129690E = str;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        SurveyResponseEmoji surveyResponseEmoji;
        if (this.f129692x) {
            surveyResponseEmoji = null;
        } else {
            SurveyRatingBlock surveyRatingBlock = this.f129693y;
            surveyResponseEmoji = new SurveyResponseEmoji(surveyRatingBlock.getUuid(), this.f129694z, surveyRatingBlock.getMeta().getOptions(), this.f129690E);
        }
        this.f129691w.invoke(surveyResponseEmoji);
        return C23454a0.f92919a;
    }
}
