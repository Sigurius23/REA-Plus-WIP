package p042c2;

import ad3.C0783z;
import android.view.autofill.AutofillManager;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0230n0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p328mj.C25607n;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p409q0.InterfaceC29694r;
import p477s2.AbstractC32076h;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import sj.C32561l;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c2.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C3858c extends AbstractC22680m implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15784w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f15785x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f15786y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3858c(int i13, Object obj, Object obj2) {
        super(4);
        this.f15784w = i13;
        this.f15785x = obj;
        this.f15786y = obj2;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f15784w) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                int iIntValue3 = ((Number) obj3).intValue();
                int iIntValue4 = ((Number) obj4).intValue();
                C3859d c3859d = (C3859d) this.f15785x;
                c3859d.f15792f.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                C0783z c0783z = c3859d.f15787a;
                ((AutofillManager) c0783z.f2818x).requestAutofill(c3859d.f15789c, ((C0230n0) this.f15786y).f795x, c3859d.f15792f);
                break;
            default:
                InterfaceC29694r HorizontalPager = (InterfaceC29694r) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                ((Number) obj4).intValue();
                AbstractC22676k.m65750j(HorizontalPager, "$this$HorizontalPager");
                Nudge nudge = (Nudge) this.f15785x;
                NudgeStep nudgeStep = nudge.getSteps().get(iIntValue5);
                C32561l c32561l = new C32561l(nudge, nudgeStep, iIntValue5, (C25607n) this.f15786y);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9115x, false);
                int iM87266t = AbstractC28683x.m87266t(composer);
                C28655q c28655q = (C28655q) composer;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(composer, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                    AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                }
                AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
                AbstractC32076h.m99768a(nudgeStep, c32561l, null, true, composer, 3144, 4);
                c28655q.m87173q(true);
                break;
        }
        return C23454a0.f92919a;
    }
}
