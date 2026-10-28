package p027b3;

import android.os.Build;
import android.os.Process;
import androidx.compose.p018ui.platform.AndroidComposeView;
import io.sentry.android.core.internal.util.C20104e;
import io.sentry.android.ndk.SentryNdk;
import io.seon.androidsdk.service.AbstractC20684o;
import io.seon.androidsdk.service.C20682n;
import io.seon.androidsdk.service.C20691r0;
import java.util.concurrent.atomic.AtomicInteger;
import p002a0.C0047q0;

/* JADX INFO: renamed from: b3.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2411n implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9465w;

    public /* synthetic */ RunnableC2411n(int i13) {
        this.f9465w = i13;
    }

    /* JADX INFO: renamed from: a */
    private final void m7405a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9465w) {
            case 0:
                C0047q0 c0047q0 = AndroidComposeView.f4889k1;
                synchronized (c0047q0) {
                    try {
                        int i13 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = c0047q0.f136a;
                            int i14 = c0047q0.f137b;
                            while (i13 < i14) {
                                AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i13];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                Class cls = AndroidComposeView.f4886h1;
                                androidComposeView.setShowLayoutBounds(AbstractC2417o0.m7419k());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    AndroidComposeView.m3567o(androidComposeView.getRoot());
                                }
                                i13++;
                            }
                        } else {
                            Object[] objArr2 = c0047q0.f136a;
                            int i15 = c0047q0.f137b;
                            while (i13 < i15) {
                                AndroidComposeView.m3567o(((AndroidComposeView) objArr2[i13]).getRoot());
                                i13++;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 1:
                return;
            case 2:
                C20104e.f75529b = Process.myTid();
                return;
            case 3:
                SentryNdk.lambda$static$0();
                return;
            default:
                AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                try {
                    C20691r0 c20691r0 = C20682n.f77406n;
                    c20691r0.f77447d.lock();
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (System.currentTimeMillis() - c20691r0.f77445b >= c20691r0.f77446c || c20691r0.f77445b == -1) {
                            c20691r0.f77444a = C20682n.m56843h();
                            c20691r0.f77445b = jCurrentTimeMillis;
                        }
                        break;
                    } catch (Throwable unused) {
                    }
                    c20691r0.f77447d.unlock();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
        }
    }
}
