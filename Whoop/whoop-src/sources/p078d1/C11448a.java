package p078d1;

import l83.C23454a0;
import p208i2.C17896l0;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: d1.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C11448a extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11458k f36725w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11448a(C11458k c11458k) {
        super(1, AbstractC22674j.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f36725w = c11458k;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((C17896l0) obj).f69598a;
        InterfaceC39147y interfaceC39147y = (InterfaceC39147y) this.f36725w.f36758R.getValue();
        if (interfaceC39147y != null) {
            if (!interfaceC39147y.mo3532g()) {
                interfaceC39147y = null;
            }
            if (interfaceC39147y != null) {
                interfaceC39147y.mo3515N(fArr);
            }
        }
        return C23454a0.f92919a;
    }
}
