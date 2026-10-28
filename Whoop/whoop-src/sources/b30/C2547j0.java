package b30;

import androidx.room.C1836v0;
import bc3.AbstractC3006f0;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13087t1;
import hc3.C17171d;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p000.C29656q;
import p003a1.C0106e;
import p477s2.AbstractC32073e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29810c;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s20.C32077a;
import t20.C33333n;

/* JADX INFO: renamed from: b30.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2547j0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13037f2 f9881a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13037f2 f9882b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13087t1 f9883c;

    /* JADX INFO: renamed from: d */
    public final C0106e f9884d;

    /* JADX INFO: renamed from: e */
    public final C0106e f9885e;

    /* JADX INFO: renamed from: f */
    public final C2539i0 f9886f;

    /* JADX INFO: renamed from: g */
    public final C0106e f9887g;

    /* JADX INFO: renamed from: h */
    public final C1836v0 f9888h;

    /* JADX INFO: renamed from: i */
    public final C0106e f9889i;

    /* JADX INFO: renamed from: j */
    public final C29656q f9890j;

    /* JADX INFO: renamed from: k */
    public final C17171d f9891k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC30063j f9892l;

    /* JADX INFO: renamed from: m */
    public final C2531h0 f9893m;

    /* JADX INFO: renamed from: n */
    public final boolean f9894n;

    /* JADX INFO: renamed from: o */
    public final C13045h2 f9895o;

    /* JADX INFO: renamed from: p */
    public final C13045h2 f9896p;

    /* JADX INFO: renamed from: q */
    public final C13045h2 f9897q;

    /* JADX INFO: renamed from: r */
    public final C13045h2 f9898r;

    public C2547j0(String initiallySelectedPaymentMethodType, C13081r1 selection, C13081r1 processing, C13096w1 validationRequested, C13081r1 incentive, ArrayList arrayList, C0106e c0106e, C0106e c0106e2, C2539i0 c2539i0, C0106e c0106e3, C1836v0 c1836v0, C0106e c0106e4, C29656q c29656q, C17171d c17171d, InterfaceC30063j uiContext, C2531h0 c2531h0, boolean z4) {
        AbstractC22676k.m65750j(initiallySelectedPaymentMethodType, "initiallySelectedPaymentMethodType");
        AbstractC22676k.m65750j(selection, "selection");
        AbstractC22676k.m65750j(processing, "processing");
        AbstractC22676k.m65750j(validationRequested, "validationRequested");
        AbstractC22676k.m65750j(incentive, "incentive");
        AbstractC22676k.m65750j(uiContext, "uiContext");
        this.f9881a = selection;
        this.f9882b = processing;
        this.f9883c = validationRequested;
        this.f9884d = c0106e;
        this.f9885e = c0106e2;
        this.f9886f = c2539i0;
        this.f9887g = c0106e3;
        this.f9888h = c1836v0;
        this.f9889i = c0106e4;
        this.f9890j = c29656q;
        this.f9891k = c17171d;
        this.f9892l = uiContext;
        this.f9893m = c2531h0;
        this.f9894n = z4;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(initiallySelectedPaymentMethodType);
        this.f9895o = c13045h2M36593c;
        this.f9896p = c13045h2M36593c;
        String str = (String) c13045h2M36593c.getValue();
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(new C2482b(str, arrayList, (C32077a) c0106e.invoke(str), (List) c0106e2.invoke(str), (AbstractC29840y) selection.f45200w.getValue(), ((Boolean) processing.f45200w.getValue()).booleanValue(), false, (C29810c) incentive.f45200w.getValue(), (C33333n) c29656q.invoke(str)));
        this.f9897q = c13045h2M36593c2;
        this.f9898r = c13045h2M36593c2;
        InterfaceC30057d interfaceC30057d = null;
        AbstractC3006f0.m8732z(c17171d, null, null, new C2523g0(this, interfaceC30057d, 0), 3);
        AbstractC3006f0.m8732z(c17171d, null, null, new C2523g0(this, interfaceC30057d, 1), 3);
        AbstractC3006f0.m8732z(c17171d, null, null, new C2523g0(this, interfaceC30057d, 2), 3);
        AbstractC3006f0.m8732z(c17171d, null, null, new C2523g0(this, interfaceC30057d, 3), 3);
        AbstractC3006f0.m8732z(c17171d, null, null, new C2523g0(this, interfaceC30057d, 4), 3);
    }

    /* JADX INFO: renamed from: a */
    public final void m7467a(AbstractC32073e abstractC32073e) {
        int iM36284n;
        if (abstractC32073e instanceof C2506e) {
            this.f9887g.invoke(((C2506e) abstractC32073e).f9761a);
            return;
        }
        if (abstractC32073e instanceof C2490c) {
            C2490c c2490c = (C2490c) abstractC32073e;
            this.f9888h.invoke(c2490c.f9705a, c2490c.f9706b);
            return;
        }
        if (abstractC32073e instanceof C2498d) {
            Object value = this.f9896p.getValue();
            String str = ((C2498d) abstractC32073e).f9738a;
            if (AbstractC22676k.m65745e(value, str)) {
                return;
            }
            this.f9895o.m36570j(str);
            this.f9889i.invoke(str);
            return;
        }
        if (!(abstractC32073e instanceof C2514f)) {
            throw new NoWhenBranchMatchedException();
        }
        C2474a data = ((C2514f) abstractC32073e).f9783a;
        AbstractC22676k.m65750j(data, "data");
        List list = data.f9627a;
        int size = list.size();
        float f13 = data.f9628b;
        float f14 = data.f9629c;
        float f15 = AbstractC2581n2.f10041a;
        if (size <= 0) {
            iM36284n = 0;
        } else if (size == 1) {
            iM36284n = 1;
        } else {
            float f16 = f15 + f13;
            int i13 = (int) (f14 / f16);
            if (Float.compare(f14 - (i13 * f16), f13 * 0.95f) >= 0) {
                i13++;
            }
            iM36284n = AbstractC12889b.m36284n(i13, 1, size);
        }
        List list2 = list;
        this.f9893m.invoke(AbstractC25265s.m74156w1(list2, iM36284n), AbstractC25265s.m74161z0(list2, iM36284n));
    }
}
