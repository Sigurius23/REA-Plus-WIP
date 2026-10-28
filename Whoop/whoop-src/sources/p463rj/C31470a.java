package p463rj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.SurveyListBlock;
import com.amplitude.android.engagement.types.SurveyResponseSelect;
import java.util.List;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: rj.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C31470a extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f129668E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f129669F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f129670w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SurveyListBlock f129671x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f129672y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ SurveyResponseSelect f129673z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31470a(SurveyListBlock surveyListBlock, List list, SurveyResponseSelect surveyResponseSelect, Function1 function1, int i13, int i14) {
        super(2);
        this.f129670w = i14;
        this.f129671x = surveyListBlock;
        this.f129672y = list;
        this.f129673z = surveyResponseSelect;
        this.f129668E = function1;
        this.f129669F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f129670w) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC31479j.m96926e(this.f129671x, this.f129672y, this.f129673z, this.f129668E, (Composer) obj, AbstractC28683x.m87244L(this.f129669F | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC31479j.m96928g(this.f129671x, this.f129672y, this.f129673z, this.f129668E, (Composer) obj, AbstractC28683x.m87244L(this.f129669F | 1));
                break;
        }
        return C23454a0.f92919a;
    }
}
