package g40;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.runtime.Composer;
import h00.EnumC16505h0;
import l83.C23454a0;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p390p1.C28655q;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.d4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15340d4 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57646w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f57647x;

    public /* synthetic */ C15340d4(boolean z4, int i13) {
        this.f57646w = i13;
        this.f57647x = z4;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f57646w) {
            case 0:
                C15411q3 it = (C15411q3) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(it, "it");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C28655q) composer).m87153g(it) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC15376j4.m43592h(it, this.f57647x, null, composer, iIntValue & 14, 4);
                    }
                } else {
                    AbstractC15376j4.m43592h(it, this.f57647x, null, composer, iIntValue & 14, 4);
                }
                break;
            default:
                InterfaceC3747i0 AnimatedVisibility = (InterfaceC3747i0) obj;
                Composer composer2 = (Composer) obj2;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
                AbstractC35785b.m113410e(this.f57647x ? EnumC16505h0.f63468z : EnumC16505h0.f63467y, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 16, 0.0f, 0.0f, 13), 5, composer2, 48);
                break;
        }
        return C23454a0.f92919a;
    }
}
