package o52;

import com.whoop.realtime.presentation.StartActivityActivity;
import lm2.InterfaceC24516b;
import p503tp.C34040k;
import p715kotlin.jvm.functions.Function1;
import pg3.C29218v0;

/* JADX INFO: renamed from: o52.l0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27564l0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110970w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ StartActivityActivity f110971x;

    public /* synthetic */ C27564l0(StartActivityActivity startActivityActivity, int i13) {
        this.f110970w = i13;
        this.f110971x = startActivityActivity;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f110970w) {
            case 0:
                return StartActivityActivity.m23961j2(this.f110971x, (Boolean) obj);
            case 1:
                return StartActivityActivity.m23966l1(this.f110971x, ((Double) obj).doubleValue());
            case 2:
                return StartActivityActivity.m23971n1(this.f110971x, (Boolean) obj);
            case 3:
                return StartActivityActivity.m23983t1(this.f110971x, (InterfaceC24516b) obj);
            case 4:
                return StartActivityActivity.m23927Y0(this.f110971x, (C27580t0) obj);
            case 5:
                return StartActivityActivity.m23893M1(this.f110971x, (C34040k) obj);
            case 6:
                return StartActivityActivity.m23910S1(this.f110971x, (C29218v0) obj);
            case 7:
                return StartActivityActivity.m23916U1(this.f110971x, (C29218v0) obj);
            case 8:
                return StartActivityActivity.m23951g1(this.f110971x, ((Integer) obj).intValue());
            case 9:
                return StartActivityActivity.m23957i1(this.f110971x, ((Boolean) obj).booleanValue());
            default:
                return StartActivityActivity.m23960j1(this.f110971x, ((Double) obj).doubleValue());
        }
    }
}
