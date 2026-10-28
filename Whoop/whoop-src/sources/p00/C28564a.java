package p00;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import g00.AbstractC14936g;
import g00.C14931b;
import l83.C23454a0;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC23013y;
import p390p1.C28655q;
import p530up.AbstractC35148d;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: p00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C28564a implements Function3 {

    /* JADX INFO: renamed from: x */
    public static final C28564a f115569x = new C28564a(0);

    /* JADX INFO: renamed from: y */
    public static final C28564a f115570y = new C28564a(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115571w;

    public /* synthetic */ C28564a(int i13) {
        this.f115571w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x006a  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f115571w) {
            case 0:
                InterfaceC23013y VerificationBodyContainer = (InterfaceC23013y) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(VerificationBodyContainer, "$this$VerificationBodyContainer");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC34924m.m110141b(null, null, composer, 0, 3);
                    }
                } else {
                    AbstractC34924m.m110141b(null, null, composer, 0, 3);
                }
                break;
            default:
                InterfaceC3747i0 AnimatedVisibility = (InterfaceC3747i0) obj;
                Composer composer2 = (Composer) obj2;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
                C28655q c28655q2 = (C28655q) composer2;
                c28655q2.m87150e0(-443512897);
                C14931b c14931b = (C14931b) c28655q2.m87161k(AbstractC14936g.f55706c);
                c28655q2.m87173q(false);
                AbstractC35148d.m111175f(3, 3078, 4, c14931b.f55674m, 0L, composer2, AbstractC1102d.m3419p(18, AbstractC1136a.m3599a(C2314t.f9131w, "verification_resend_loader_tag")));
                break;
        }
        return C23454a0.f92919a;
    }
}
