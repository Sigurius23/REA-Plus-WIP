package p370oj;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.NudgeStep;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p477s2.AbstractC32076h;
import p715kotlin.jvm.internal.AbstractC22680m;
import sj.C32561l;

/* JADX INFO: renamed from: oj.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C27969p extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f112793E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f112794F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f112795G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112796w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f112797x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f112798y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f112799z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27969p(DebugStatus debugStatus, String str, boolean z4, InterfaceC4351m interfaceC4351m, int i13, int i14) {
        super(2);
        this.f112793E = debugStatus;
        this.f112794F = str;
        this.f112797x = z4;
        this.f112795G = interfaceC4351m;
        this.f112798y = i13;
        this.f112799z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f112796w) {
            case 0:
                ((Number) obj2).intValue();
                DebugStatus debugStatus = (DebugStatus) this.f112793E;
                String str = (String) this.f112794F;
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f112795G;
                AbstractC3269g.m9503g(debugStatus, str, this.f112797x, interfaceC4351m, (Composer) obj, AbstractC28683x.m87244L(this.f112798y | 1), this.f112799z);
                break;
            default:
                ((Number) obj2).intValue();
                NudgeStep nudgeStep = (NudgeStep) this.f112793E;
                C32561l c32561l = (C32561l) this.f112794F;
                Modifier modifier = (Modifier) this.f112795G;
                AbstractC32076h.m99768a(nudgeStep, c32561l, modifier, this.f112797x, (Composer) obj, AbstractC28683x.m87244L(this.f112798y | 1), this.f112799z);
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27969p(NudgeStep nudgeStep, C32561l c32561l, Modifier modifier, boolean z4, int i13, int i14) {
        super(2);
        this.f112793E = nudgeStep;
        this.f112794F = c32561l;
        this.f112795G = modifier;
        this.f112797x = z4;
        this.f112798y = i13;
        this.f112799z = i14;
    }
}
