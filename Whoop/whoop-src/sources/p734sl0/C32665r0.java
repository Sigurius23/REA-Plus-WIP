package p734sl0;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import java.util.List;
import nl0.C26804f;
import nl0.C26806h;
import nl0.C26809k;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: sl0.r0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32665r0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135520w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f135521x;

    public /* synthetic */ C32665r0(Object obj, int i13) {
        this.f135520w = i13;
        this.f135521x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f135520w) {
            case 0:
                return AbstractC32679u0.m102332C0((C26809k) this.f135521x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return AbstractC32656p1.m102149u((C26806h) this.f135521x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return AbstractC32700z1.m102621h((InterfaceC4352n) this.f135521x, (String) obj, (List) obj2, (List) obj3);
            case 3:
                return AbstractC32668r3.m102271u((C26804f) this.f135521x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC32673s3.m102317q((InterfaceC4339a) this.f135521x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
