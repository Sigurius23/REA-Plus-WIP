package p401pj;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p328mj.C25607n;
import p390p1.AbstractC28683x;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: pj.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C29280n extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC23459e f118489E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f118490F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118491w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f118492x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f118493y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f118494z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29280n(Nudge nudge, NudgeStep nudgeStep, int i13, C25607n c25607n, int i14, int i15) {
        super(2);
        this.f118491w = i15;
        this.f118492x = nudge;
        this.f118493y = nudgeStep;
        this.f118494z = i13;
        this.f118489E = c25607n;
        this.f118490F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f118491w;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i13) {
            case 0:
                AbstractC35903f.m114007b((Nudge) this.f118492x, (NudgeStep) this.f118493y, this.f118494z, (C25607n) this.f118489E, composer, AbstractC28683x.m87244L(this.f118490F | 1));
                break;
            case 1:
                AbstractC37926s0.m121469g((Nudge) this.f118492x, (NudgeStep) this.f118493y, this.f118494z, (C25607n) this.f118489E, composer, AbstractC28683x.m87244L(this.f118490F | 1));
                break;
            default:
                AbstractC1137a.m3601a((Function1) this.f118492x, (Modifier) this.f118493y, (Function1) this.f118489E, composer, AbstractC28683x.m87244L(this.f118494z | 1), this.f118490F);
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29280n(Function1 function1, Modifier modifier, Function1 function2, int i13, int i14) {
        super(2);
        this.f118491w = 2;
        this.f118492x = function1;
        this.f118493y = modifier;
        this.f118489E = function2;
        this.f118494z = i13;
        this.f118490F = i14;
    }
}
