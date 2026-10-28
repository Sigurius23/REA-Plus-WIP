package h20;

import a30.C0296h1;
import a30.C0299i1;
import a30.C0302j1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import ec3.C13081r1;
import l83.C23454a0;
import p337n8.C26444a;
import p599wz.EnumC37721h0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29815e0;
import q20.AbstractC29840y;
import q20.C29807a0;
import q20.C29809b0;
import q20.C29811c0;
import q20.C29813d0;
import q20.C29828m;
import q83.InterfaceC30057d;
import r20.C30871i;
import v00.C35459c0;
import w20.C36709a0;
import w20.C36711b0;
import w20.C36722l;
import y00.EnumC38853i;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: h20.d4 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16644d4 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64001w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16686k4 f64002x;

    public /* synthetic */ C16644d4(C16686k4 c16686k4, int i13) {
        this.f64001w = i13;
        this.f64002x = c16686k4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC37721h0 enumC37721h0;
        InterfaceC38802c8 interfaceC38802c8;
        switch (this.f64001w) {
            case 0:
                AbstractC29815e0 abstractC29815e0 = (AbstractC29815e0) obj;
                if (this.f64002x.f64168l0 != EnumC16656f4.f64039x) {
                    return null;
                }
                return abstractC29815e0;
            case 1:
                AbstractC29815e0 abstractC29815e1 = (AbstractC29815e0) obj;
                EnumC16656f4 enumC16656f4 = EnumC16656f4.f64038w;
                C16686k4 c16686k4 = this.f64002x;
                if (c16686k4.f64168l0 != enumC16656f4) {
                    abstractC29815e1 = null;
                }
                if (abstractC29815e1 == null) {
                    return null;
                }
                if (abstractC29815e1 instanceof C29809b0) {
                    C29813d0 c29813d0 = ((C29809b0) abstractC29815e1).f121879a;
                    return new C0299i1(c29813d0 != null ? c29813d0.f121871a : null);
                }
                if (abstractC29815e1 instanceof C29811c0) {
                    AbstractC29840y abstractC29840y = (AbstractC29840y) c16686k4.f43028z.m5001b("IN_PROGRESS_PAYMENT_SELECTION");
                    C29828m c29828m = abstractC29840y instanceof C29828m ? (C29828m) abstractC29840y : null;
                    return (c29828m == null || (enumC37721h0 = c29828m.f121915x) == null || enumC37721h0 == EnumC37721h0.f161649w) ? C0302j1.f1043a : new C0299i1(null);
                }
                if (abstractC29815e1 instanceof C29807a0) {
                    return new C0296h1(((C29807a0) abstractC29815e1).f121862b);
                }
                throw new NoWhenBranchMatchedException();
            default:
                C36722l cvcRecollectionData = (C36722l) obj;
                AbstractC22676k.m65750j(cvcRecollectionData, "cvcRecollectionData");
                C16686k4 c16686k5 = this.f64002x;
                C36709a0 c36709a0 = c16686k5.f64164h0;
                String str = cvcRecollectionData.f157210a;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                EnumC38853i cardBrand = cvcRecollectionData.f157211b;
                C35459c0 c35459c0 = (C35459c0) c16686k5.f43008L.getValue();
                boolean z4 = false;
                if (c35459c0 != null && (interfaceC38802c8 = c35459c0.f150996w) != null && !interfaceC38802c8.mo124338q0()) {
                    z4 = true;
                }
                AbstractC22676k.m65750j(cardBrand, "cardBrand");
                C13081r1 processing = c16686k5.f43013Q;
                C26444a c26444aM5043b = AbstractC1640x1.m5043b(c16686k5);
                c36709a0.getClass();
                AbstractC22676k.m65750j(processing, "processing");
                C36711b0 c36711b0 = new C36711b0(str2, cardBrand, z4, processing, c26444aM5043b);
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c16686k5), null, null, new C16670i0(c36711b0, c16686k5, (InterfaceC30057d) null, 2), 3);
                c16686k5.f43009M.m94922e(new C30871i(c36711b0));
                return C23454a0.f92919a;
        }
    }
}
