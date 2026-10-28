package p470rv;

import com.mapbox.common.location.Location;
import ec3.InterfaceC13062m;
import java.util.Arrays;
import l83.C23454a0;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: rv.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C31824d implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131850w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31833m f131851x;

    public /* synthetic */ C31824d(C31833m c31833m, int i13) {
        this.f131850w = i13;
        this.f131851x = c31833m;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        int i13 = this.f131850w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C31833m c31833m = this.f131851x;
        switch (i13) {
            case 0:
                double[] dArr = {((Number) obj).doubleValue()};
                C31838r c31838r = c31833m.f131892y;
                if (c31838r != null) {
                    C31838r.m98908d(c31838r, Arrays.copyOf(dArr, 1), 4);
                }
                break;
            default:
                Double horizontalAccuracy = ((Location) obj).getHorizontalAccuracy();
                if (horizontalAccuracy != null) {
                    double[] dArr2 = {horizontalAccuracy.doubleValue()};
                    C31838r c31838r2 = c31833m.f131892y;
                    if (c31838r2 != null) {
                        c31838r2.m98913f(Arrays.copyOf(dArr2, 1));
                    }
                }
                break;
        }
        return c23454a0;
    }
}
