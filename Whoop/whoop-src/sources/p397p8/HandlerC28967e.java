package p397p8;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import ro.C31619d;

/* JADX INFO: renamed from: p8.e */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC28967e extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C28966d c28966d = (C28966d) message.obj;
        int i13 = message.what;
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            RunnableC28963a runnableC28963a = c28966d.f117139a;
            return;
        }
        RunnableC28963a runnableC28963a2 = c28966d.f117139a;
        Object obj = c28966d.f117140b[0];
        if (runnableC28963a2.f117136z.get()) {
            CountDownLatch countDownLatch = runnableC28963a2.f117131F;
            try {
                C31619d c31619d = runnableC28963a2.f117132G;
                if (c31619d.f130654j == runnableC28963a2) {
                    SystemClock.uptimeMillis();
                    c31619d.f130654j = null;
                    c31619d.m97687c();
                }
                countDownLatch.countDown();
            } catch (Throwable th3) {
                countDownLatch.countDown();
                throw th3;
            }
        } else {
            try {
                C31619d c31619d2 = runnableC28963a2.f117132G;
                if (c31619d2.f130653i == runnableC28963a2) {
                    if (!c31619d2.f130649e) {
                        SystemClock.uptimeMillis();
                        c31619d2.f130653i = null;
                        switch (c31619d2.f130655k) {
                            case 1:
                                List list = (List) obj;
                                c31619d2.f130656l = list;
                                c31619d2.m97686b(list);
                                break;
                            default:
                                c31619d2.m97686b(obj);
                                break;
                        }
                    }
                } else if (c31619d2.f130654j == runnableC28963a2) {
                    SystemClock.uptimeMillis();
                    c31619d2.f130654j = null;
                    c31619d2.m97687c();
                }
                runnableC28963a2.f117131F.countDown();
            } catch (Throwable th4) {
                runnableC28963a2.f117131F.countDown();
                throw th4;
            }
        }
        runnableC28963a2.f117135y = 3;
    }
}
