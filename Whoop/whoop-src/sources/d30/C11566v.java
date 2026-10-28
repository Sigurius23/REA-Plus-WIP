package d30;

import b30.C2476a1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import java.util.List;
import n53.C26318e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30063j;
import s20.C32077a;
import t00.C33254a;
import t20.C33333n;

/* JADX INFO: renamed from: d30.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C11566v {

    /* JADX INFO: renamed from: a */
    public final String f37317a;

    /* JADX INFO: renamed from: b */
    public final C32077a f37318b;

    /* JADX INFO: renamed from: c */
    public final List f37319c;

    /* JADX INFO: renamed from: d */
    public final C22672i f37320d;

    /* JADX INFO: renamed from: e */
    public final C33333n f37321e;

    /* JADX INFO: renamed from: f */
    public final C22672i f37322f;

    /* JADX INFO: renamed from: g */
    public final C33254a f37323g;

    /* JADX INFO: renamed from: h */
    public final boolean f37324h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2994c0 f37325i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC30063j f37326j;

    /* JADX INFO: renamed from: k */
    public final C13045h2 f37327k;

    /* JADX INFO: renamed from: l */
    public final C26318e f37328l;

    /* JADX WARN: Multi-variable type inference failed */
    public C11566v(String selectedPaymentMethodCode, C32077a c32077a, List list, InterfaceC4351m interfaceC4351m, C33333n c33333n, Function1 function1, C33254a c33254a, boolean z4, InterfaceC13037f2 processing, C13096w1 validationRequested, C13081r1 paymentMethodIncentive, InterfaceC2994c0 coroutineScope, InterfaceC30063j uiContext) {
        AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC22676k.m65750j(processing, "processing");
        AbstractC22676k.m65750j(validationRequested, "validationRequested");
        AbstractC22676k.m65750j(paymentMethodIncentive, "paymentMethodIncentive");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(uiContext, "uiContext");
        this.f37317a = selectedPaymentMethodCode;
        this.f37318b = c32077a;
        this.f37319c = list;
        this.f37320d = (C22672i) interfaceC4351m;
        this.f37321e = c33333n;
        this.f37322f = (C22672i) function1;
        this.f37323g = c33254a;
        this.f37324h = z4;
        this.f37325i = coroutineScope;
        this.f37326j = uiContext;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        this.f37327k = c13045h2M36593c;
        this.f37328l = AbstractC3269g.m9513t(processing, paymentMethodIncentive, c13045h2M36593c, new C2476a1(this, 10));
        AbstractC3006f0.m8732z(coroutineScope, null, null, new C11552o(validationRequested, this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c93.m, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX INFO: renamed from: a */
    public final void m30998a(InterfaceC11543j1 interfaceC11543j1) {
        boolean zEquals = interfaceC11543j1.equals(C11537h1.f37203a);
        String str = this.f37317a;
        if (zEquals) {
            this.f37322f.invoke(str);
        } else {
            if (!(interfaceC11543j1 instanceof C11540i1)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f37320d.invoke(((C11540i1) interfaceC11543j1).f37215a, str);
        }
    }
}
