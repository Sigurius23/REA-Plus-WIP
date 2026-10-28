package p463rj;

import com.amplitude.android.engagement.types.SurveyListBlock;
import com.amplitude.android.engagement.types.SurveyResponseSelect;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: rj.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C31472c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C31485p f129680E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f129681w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f129682x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ SurveyListBlock f129683y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f129684z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31472c(Function1 function1, SurveyListBlock surveyListBlock, int i13, C31485p c31485p, int i14) {
        super(1);
        this.f129681w = i14;
        this.f129682x = function1;
        this.f129683y = surveyListBlock;
        this.f129684z = i13;
        this.f129680E = c31485p;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f129681w) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Function1 function1 = this.f129682x;
                if (zBooleanValue) {
                    function1.invoke(new SurveyResponseSelect(this.f129683y.getUuid(), this.f129684z, this.f129680E.f129728a, null, 8, null));
                } else {
                    function1.invoke(null);
                }
                break;
            default:
                String newText = (String) obj;
                AbstractC22676k.m65750j(newText, "newText");
                this.f129682x.invoke(new SurveyResponseSelect(this.f129683y.getUuid(), this.f129684z, this.f129680E.f129728a, newText));
                break;
        }
        return C23454a0.f92919a;
    }
}
