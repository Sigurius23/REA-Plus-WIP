package l00;

import a00.C0072g;
import a00.C0074i;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1601k1;
import c00.C3795a;
import cb1.C4387a;
import d00.C11433l;
import h00.C16513l0;
import h20.C16657g;
import h20.C16765y;
import i20.AbstractC17952j;
import i20.C17988y0;
import k20.C22136a;
import m00.C24872d;
import p078d1.C11457j;
import p133f1.C13968p1;
import p298l8.AbstractC23420c;
import p337n8.C26444a;
import p442qy.C30765d;
import p599wz.C37718g0;
import p631xz.C38747x;
import p695zx.C41193o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;

/* JADX INFO: renamed from: l00.g */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C23025g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90773w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3795a f90774x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11433l f90775y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f90776z;

    public /* synthetic */ C23025g(C3795a c3795a, C11433l c11433l, Function1 function1, int i13) {
        this.f90773w = i13;
        this.f90774x = c3795a;
        this.f90775y = c11433l;
        this.f90776z = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f90773w) {
            case 0:
                AbstractC23420c initializer = (AbstractC23420c) obj;
                AbstractC22676k.m65750j(initializer, "$this$initializer");
                C3795a c3795a = this.f90774x.f15512h;
                Function1 function1 = this.f90776z;
                function1.getClass();
                return new C23027i(this.f90775y, c3795a.f15498a, (C38747x) c3795a.f15479H.get(), function1);
            default:
                AbstractC23420c initializer2 = (AbstractC23420c) obj;
                AbstractC22676k.m65750j(initializer2, "$this$initializer");
                C3795a c3795a2 = this.f90774x;
                C37718g0 c37718g0 = c3795a2.f15498a;
                C38747x c38747xM11600b = c3795a2.m11600b();
                C0072g c0072g = new C0072g(((C0074i) c3795a2.f15481J.get()).m208a(c3795a2.m11601c().f161769N), c3795a2.m11600b(), c3795a2.m11599a(), c3795a2.f15508f);
                C26444a c26444aM5043b = AbstractC1640x1.m5043b(c3795a2.m11601c());
                C41193o cardAccountRangeRepositoryFactory = (C41193o) c3795a2.f15482K.get();
                C35459c0 paymentMethodMetadata = c3795a2.f15510g;
                C22136a eventReporter = (C22136a) c3795a2.f15503c0.get();
                C1601k1 savedStateHandle = c3795a2.m11601c().f161763H;
                C11457j c11457j = new C11457j((C17988y0) c3795a2.f15511g0.get(), new C13968p1(c3795a2.f15498a.f161622V, AbstractC17952j.f69732a));
                AbstractC22676k.m65750j(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
                AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
                AbstractC22676k.m65750j(eventReporter, "eventReporter");
                AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
                C16657g c16657g = new C16657g(c26444aM5043b, new C16765y(), cardAccountRangeRepositoryFactory, paymentMethodMetadata, new C4387a(5), new C16513l0(6), null, false, eventReporter, savedStateHandle, c11457j, true, null, null);
                return new C24872d(c37718g0, this.f90775y, c38747xM11600b, c0072g, (C30765d) c3795a2.f15529u.get(), c16657g, c3795a2.m11599a(), c3795a2.f15508f, this.f90776z);
        }
    }
}
