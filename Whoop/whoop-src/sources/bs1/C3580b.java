package bs1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import h91.C17027b;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import qj2.AbstractC30437b;

/* JADX INFO: renamed from: bs1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3580b implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14464w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f14465x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C17027b f14466y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f14467z;

    public /* synthetic */ C3580b(InterfaceC4339a interfaceC4339a, C17027b c17027b, Function1 function1, int i13) {
        this.f14464w = i13;
        this.f14465x = interfaceC4339a;
        this.f14466y = c17027b;
        this.f14467z = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f14464w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC3587f.m10939j(this.f14465x, this.f14466y, this.f14467z, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC30437b.m93105j(this.f14465x, this.f14466y, this.f14467z, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue2);
        }
    }
}
