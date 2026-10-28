package p043c4;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import com.amplitude.android.engagement.types.SurveyListBlock;
import com.amplitude.android.engagement.types.SurveyRatingBlock;
import com.amplitude.android.engagement.types.SurveyResponseEmoji;
import com.amplitude.android.engagement.types.SurveyResponseNPS;
import com.amplitude.android.engagement.types.SurveyResponseText;
import com.amplitude.android.engagement.types.SurveyTextBlock;
import com.amplitude.android.engagement.types.SurveyTextShortBlock;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p088dc.AbstractC11894a;
import p305lj.AbstractC24425e0;
import p328mj.C25594a;
import p328mj.C25607n;
import p390p1.AbstractC28683x;
import p463rj.AbstractC31479j;
import p602x1.C37816b;
import p635y2.AbstractC39125q1;
import p635y2.C39137u1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;
import s30.AbstractC32100b;
import se.AbstractC32411b;
import se.AbstractC32416g;
import sj.C32561l;

/* JADX INFO: renamed from: c4.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C3951c extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f16098E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16099w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f16100x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f16101y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f16102z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3951c(Nudge nudge, int i13, C25594a c25594a, C25607n c25607n, int i14) {
        super(2);
        this.f16099w = 1;
        this.f16101y = nudge;
        this.f16100x = i13;
        this.f16102z = c25594a;
        this.f16098E = c25607n;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16099w) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC32411b.m101089d((InterfaceC4339a) this.f16101y, (C3948a0) this.f16102z, (C37816b) this.f16098E, (Composer) obj, AbstractC28683x.m87244L(this.f16100x | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                Nudge nudge = (Nudge) this.f16101y;
                C25594a c25594a = (C25594a) this.f16102z;
                C25607n c25607n = (C25607n) this.f16098E;
                AbstractC11894a.m31956e(nudge, this.f16100x, c25594a, c25607n, (Composer) obj, AbstractC28683x.m87244L(521));
                break;
            case 2:
                ((Number) obj2).intValue();
                AbstractC32416g.m101147d((String) this.f16102z, (Integer) this.f16098E, (InterfaceC4339a) this.f16101y, (Composer) obj, AbstractC28683x.m87244L(this.f16100x | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                AbstractC31479j.m96925d((SurveyListBlock) this.f16101y, (AbstractC24425e0) this.f16102z, (Function1) this.f16098E, (Composer) obj, AbstractC28683x.m87244L(this.f16100x | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                AbstractC31479j.m96930i((SurveyRatingBlock) this.f16101y, (SurveyResponseEmoji) this.f16102z, (Function1) this.f16098E, (Composer) obj, AbstractC28683x.m87244L(this.f16100x | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                AbstractC31479j.m96931j((SurveyRatingBlock) this.f16101y, (SurveyResponseNPS) this.f16102z, (Function1) this.f16098E, (Composer) obj, AbstractC28683x.m87244L(this.f16100x | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                AbstractC31479j.m96934m((SurveyTextShortBlock) this.f16101y, (SurveyResponseText) this.f16102z, (Function1) this.f16098E, (Composer) obj, AbstractC28683x.m87244L(this.f16100x | 1));
                break;
            case 7:
                ((Number) obj2).intValue();
                AbstractC31479j.m96935n((SurveyTextBlock) this.f16101y, (SurveyResponseText) this.f16102z, (Function1) this.f16098E, (Composer) obj, AbstractC28683x.m87244L(this.f16100x | 1));
                break;
            case 8:
                ((Number) obj2).intValue();
                AbstractC32100b.m99856a((NudgeStep) this.f16101y, (C32561l) this.f16102z, (Modifier) this.f16098E, (Composer) obj, AbstractC28683x.m87244L(73), this.f16100x);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC39125q1.m124657c((C39137u1) this.f16101y, (Modifier) this.f16102z, (InterfaceC4351m) this.f16098E, (Composer) obj, AbstractC28683x.m87244L(this.f16100x | 1));
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3951c(NudgeStep nudgeStep, C32561l c32561l, Modifier modifier, int i13, int i14) {
        super(2);
        this.f16099w = 8;
        this.f16101y = nudgeStep;
        this.f16102z = c32561l;
        this.f16098E = modifier;
        this.f16100x = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3951c(Object obj, Object obj2, InterfaceC23459e interfaceC23459e, int i13, int i14) {
        super(2);
        this.f16099w = i14;
        this.f16101y = obj;
        this.f16102z = obj2;
        this.f16098E = interfaceC23459e;
        this.f16100x = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3951c(String str, Integer num, InterfaceC4339a interfaceC4339a, int i13) {
        super(2);
        this.f16099w = 2;
        this.f16102z = str;
        this.f16098E = num;
        this.f16101y = interfaceC4339a;
        this.f16100x = i13;
    }
}
