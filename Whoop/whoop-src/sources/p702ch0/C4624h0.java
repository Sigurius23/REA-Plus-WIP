package p702ch0;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function3;
import zg0.C40619b;
import zg0.C40626i;

/* JADX INFO: renamed from: ch0.h0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4624h0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18652w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18653x;

    public /* synthetic */ C4624h0(Object obj, int i13) {
        this.f18652w = i13;
        this.f18653x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f18652w) {
            case 0:
                return Function1.m14405N((C40626i) this.f18653x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return Function1.m14406O((C40626i) this.f18653x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return Function1.m14407P((C40626i) this.f18653x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC4653u.m14652r((C40619b) this.f18653x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
