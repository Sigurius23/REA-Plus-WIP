package p031b9;

import android.util.Pair;
import java.io.IOException;
import p047c9.C4317h;
import p299l9.C23488c0;
import p299l9.C23527t;
import p299l9.C23537y;
import sn.C32745m;
import sn.C32770z;
import sn.InterfaceC32722a0;

/* JADX INFO: renamed from: b9.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2874x0 implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f11423E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f11424F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f11425G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11426w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ IOException f11427x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f11428y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f11429z;

    public /* synthetic */ RunnableC2874x0(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z4, int i13) {
        this.f11426w = i13;
        this.f11429z = obj;
        this.f11423E = obj2;
        this.f11424F = obj3;
        this.f11425G = obj4;
        this.f11427x = iOException;
        this.f11428y = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11426w) {
            case 0:
                C2876y0 c2876y0 = (C2876y0) this.f11429z;
                Pair pair = (Pair) this.f11423E;
                ((C4317h) c2876y0.f11431x.f11037j).mo8315b(((Integer) pair.first).intValue(), (C23488c0) pair.second, (C23527t) this.f11424F, (C23537y) this.f11425G, this.f11427x, this.f11428y);
                break;
            default:
                C32770z c32770z = (C32770z) this.f11429z;
                ((InterfaceC32722a0) this.f11423E).mo91075A(c32770z.f136275a, c32770z.f136276b, (C32745m) this.f11424F, (C23537y) this.f11425G, this.f11427x, this.f11428y);
                break;
        }
    }
}
