package b30;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import h20.AbstractC16736t0;
import hc3.C17171d;
import java.util.List;
import n53.C26318e;
import p000.C17820i;
import p003a1.C0106e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.C29818g;
import q20.C29822i;
import q20.C29824j;
import q20.C29828m;
import q20.C29838w;
import q20.C29839x;
import q83.InterfaceC30057d;
import se.AbstractC32411b;
import y00.C38915o4;

/* JADX INFO: renamed from: b30.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2603q0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13037f2 f10128a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13037f2 f10129b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13037f2 f10130c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13037f2 f10131d;

    /* JADX INFO: renamed from: e */
    public final C2539i0 f10132e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 f10133f;

    /* JADX INFO: renamed from: g */
    public final C26318e f10134g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC13037f2 f10135h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC13037f2 f10136i;

    /* JADX INFO: renamed from: j */
    public final C17820i f10137j;

    /* JADX INFO: renamed from: k */
    public final C0106e f10138k;

    /* JADX INFO: renamed from: l */
    public final C2531h0 f10139l;

    /* JADX INFO: renamed from: m */
    public final boolean f10140m;

    /* JADX INFO: renamed from: n */
    public final C17171d f10141n;

    /* JADX INFO: renamed from: o */
    public final C13045h2 f10142o;

    /* JADX INFO: renamed from: p */
    public final C13045h2 f10143p;

    /* JADX INFO: renamed from: q */
    public final C13045h2 f10144q;

    public C2603q0(C26318e paymentOptionsItems, C13045h2 editing, C26318e canEdit, C26318e canRemove, C2539i0 c2539i0, C13081r1 isProcessing, C26318e c26318e, C13081r1 currentSelection, C13081r1 mostRecentlySelectedSavedPaymentMethod, C17820i c17820i, C0106e c0106e, C2531h0 c2531h0, boolean z4) {
        AbstractC22676k.m65750j(paymentOptionsItems, "paymentOptionsItems");
        AbstractC22676k.m65750j(editing, "editing");
        AbstractC22676k.m65750j(canEdit, "canEdit");
        AbstractC22676k.m65750j(canRemove, "canRemove");
        AbstractC22676k.m65750j(isProcessing, "isProcessing");
        AbstractC22676k.m65750j(currentSelection, "currentSelection");
        AbstractC22676k.m65750j(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        this.f10128a = paymentOptionsItems;
        this.f10129b = editing;
        this.f10130c = canEdit;
        this.f10131d = canRemove;
        this.f10132e = c2539i0;
        this.f10133f = isProcessing;
        this.f10134g = c26318e;
        this.f10135h = currentSelection;
        this.f10136i = mostRecentlySelectedSavedPaymentMethod;
        this.f10137j = c17820i;
        this.f10138k = c0106e;
        this.f10139l = c2531h0;
        this.f10140m = z4;
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(AbstractC3050q0.f12078b.plus(AbstractC3006f0.m8710d()));
        this.f10141n = c17171dM8708b;
        AbstractC29840y abstractC29840y = (AbstractC29840y) currentSelection.f45200w.getValue();
        InterfaceC30057d interfaceC30057d = null;
        if (!(abstractC29840y instanceof C29828m) && !(abstractC29840y instanceof C29824j) && !(abstractC29840y instanceof C29838w)) {
            abstractC29840y = null;
        }
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(abstractC29840y);
        this.f10142o = c13045h2M36593c;
        List list = (List) ((InterfaceC4339a) paymentOptionsItems.f104635y).invoke();
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(new C2600p5(list, m7514a((AbstractC29840y) c13045h2M36593c.getValue(), (C38915o4) mostRecentlySelectedSavedPaymentMethod.f45200w.getValue(), list), ((Boolean) editing.getValue()).booleanValue(), ((Boolean) isProcessing.f45200w.getValue()).booleanValue(), ((Boolean) ((InterfaceC4339a) canEdit.f104635y).invoke()).booleanValue(), ((Boolean) ((InterfaceC4339a) canRemove.f104635y).invoke()).booleanValue()));
        this.f10143p = c13045h2M36593c2;
        this.f10144q = c13045h2M36593c2;
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new C2587o0(this, interfaceC30057d, 0), 3);
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new C2587o0(this, interfaceC30057d, 1), 3);
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new C2587o0(this, interfaceC30057d, 2), 3);
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new C2587o0(this, interfaceC30057d, 3), 3);
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new C2587o0(this, interfaceC30057d, 4), 3);
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new C2587o0(this, interfaceC30057d, 5), 3);
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new C2587o0(this, interfaceC30057d, 6), 3);
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new C2587o0(this, interfaceC30057d, 7), 3);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC16736t0 m7514a(AbstractC29840y abstractC29840y, C38915o4 c38915o4, List list) {
        if (!(abstractC29840y instanceof C29838w) && !(abstractC29840y instanceof C29828m) && !(abstractC29840y instanceof C29824j) && !(abstractC29840y instanceof C29839x)) {
            if (!(abstractC29840y instanceof AbstractC29835t) && !(abstractC29840y instanceof C29822i) && !(abstractC29840y instanceof C29818g) && abstractC29840y != null) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC29840y = null;
            if (c38915o4 != null) {
                abstractC29840y = new C29838w(c38915o4, null, null);
            }
        }
        return AbstractC32411b.m101064H(list, abstractC29840y);
    }

    /* JADX INFO: renamed from: b */
    public final void m7515b(AbstractC32411b abstractC32411b) {
        if (abstractC32411b instanceof C2615r5) {
            this.f10138k.invoke(((C2615r5) abstractC32411b).f10191b);
            return;
        }
        if (abstractC32411b instanceof C2622s5) {
            AbstractC29840y abstractC29840y = ((C2622s5) abstractC32411b).f10211b;
            this.f10142o.m36570j(abstractC29840y);
            this.f10139l.invoke(abstractC29840y, Boolean.TRUE);
        } else if (abstractC32411b.equals(C2608q5.f10160b)) {
            this.f10137j.invoke();
        } else {
            if (!abstractC32411b.equals(C2629t5.f10246b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f10132e.invoke();
        }
    }
}
