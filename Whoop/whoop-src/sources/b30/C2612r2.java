package b30;

import com.stripe.android.paymentsheet.p055ui.PrimaryButton;
import l83.C23454a0;
import m20.C24940a;
import p077d0.C11409v1;
import p181h2.C16620e;
import p292l1.C23125k4;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.r2 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2612r2 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10175w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28670t2 f10176x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f10177y;

    public /* synthetic */ C2612r2(C23125k4 c23125k4, C11409v1 c11409v1, InterfaceC28601c1 interfaceC28601c1) {
        this.f10176x = c11409v1;
        this.f10177y = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10175w) {
            case 0:
                C24940a AndroidViewBinding = (C24940a) obj;
                AbstractC22676k.m65750j(AndroidViewBinding, "$this$AndroidViewBinding");
                PrimaryButton primaryButton = (PrimaryButton) this.f10177y.getValue();
                if (primaryButton != null) {
                    primaryButton.m16870d((C2598p3) this.f10176x.getValue());
                }
                break;
            default:
                C16620e c16620e = (C16620e) obj;
                float fFloatValue = ((Number) this.f10176x.getValue()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c16620e.f63951a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c16620e.f63951a & 4294967295L)) * fFloatValue;
                InterfaceC28601c1 interfaceC28601c1 = this.f10177y;
                if (Float.intBitsToFloat((int) (((C16620e) interfaceC28601c1.getValue()).f63951a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((C16620e) interfaceC28601c1.getValue()).f63951a & 4294967295L)) != fIntBitsToFloat2) {
                    interfaceC28601c1.setValue(new C16620e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C2612r2(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f10177y = interfaceC28601c1;
        this.f10176x = interfaceC28601c2;
    }
}
