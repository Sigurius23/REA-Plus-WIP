package live.hms.video.factories;

import android.util.Pair;
import java.net.InetAddress;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p031b9.C2876y0;
import p047c9.C4317h;
import p299l9.C23488c0;
import p299l9.C23527t;
import p299l9.C23537y;

/* JADX INFO: renamed from: live.hms.video.factories.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC24150e implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f95222E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f95223F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95224w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f95225x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f95226y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f95227z;

    public /* synthetic */ RunnableC24150e(C2876y0 c2876y0, Pair pair, C23527t c23527t, C23537y c23537y, int i13) {
        this.f95227z = c2876y0;
        this.f95222E = pair;
        this.f95225x = c23527t;
        this.f95226y = c23537y;
        this.f95223F = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f95224w) {
            case 0:
                HappyEyeballsDns.race$lambda$4((HappyEyeballsDns) this.f95227z, (InetAddress) this.f95222E, this.f95223F, (AtomicBoolean) this.f95225x, (ArrayBlockingQueue) this.f95226y);
                break;
            case 1:
                HappyEyeballsDns.race$lambda$5((AtomicBoolean) this.f95225x, (ArrayBlockingQueue) this.f95226y, (HappyEyeballsDns) this.f95227z, (InetAddress) this.f95222E, this.f95223F);
                break;
            default:
                C2876y0 c2876y0 = (C2876y0) this.f95227z;
                Pair pair = (Pair) this.f95222E;
                ((C4317h) c2876y0.f11431x.f11037j).mo8319f(((Integer) pair.first).intValue(), (C23488c0) pair.second, (C23527t) this.f95225x, (C23537y) this.f95226y, this.f95223F);
                break;
        }
    }

    public /* synthetic */ RunnableC24150e(AtomicBoolean atomicBoolean, ArrayBlockingQueue arrayBlockingQueue, HappyEyeballsDns happyEyeballsDns, InetAddress inetAddress, int i13) {
        this.f95225x = atomicBoolean;
        this.f95226y = arrayBlockingQueue;
        this.f95227z = happyEyeballsDns;
        this.f95222E = inetAddress;
        this.f95223F = i13;
    }

    public /* synthetic */ RunnableC24150e(HappyEyeballsDns happyEyeballsDns, InetAddress inetAddress, int i13, AtomicBoolean atomicBoolean, ArrayBlockingQueue arrayBlockingQueue) {
        this.f95227z = happyEyeballsDns;
        this.f95222E = inetAddress;
        this.f95223F = i13;
        this.f95225x = atomicBoolean;
        this.f95226y = arrayBlockingQueue;
    }
}
