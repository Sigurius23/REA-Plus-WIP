package p401pj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.internal.AbstractC22680m;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: pj.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29268f0 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118441w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Nudge f118442x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ NudgeStep f118443y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29268f0(Nudge nudge, NudgeStep nudgeStep, int i13, int i14) {
        super(2);
        this.f118441w = i14;
        this.f118442x = nudge;
        this.f118443y = nudgeStep;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f118441w;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i13) {
            case 0:
                AbstractC37978j.m121648i(this.f118442x, this.f118443y, composer, AbstractC28683x.m87244L(73));
                break;
            case 1:
                AbstractC37978j.m121648i(this.f118442x, this.f118443y, composer, AbstractC28683x.m87244L(73));
                break;
            default:
                AbstractC37978j.m121648i(this.f118442x, this.f118443y, composer, AbstractC28683x.m87244L(73));
                break;
        }
        return C23454a0.f92919a;
    }
}
