package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p020ap.ThreadFactoryC1879b;
import p044c5.RunnableC4221m;
import p692zt.C41106j;
import va3.AbstractC35854l;

/* JADX INFO: loaded from: classes6.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static SoftReference f21609a;

    /* JADX INFO: renamed from: b */
    public static SoftReference f21610b;

    /* JADX INFO: renamed from: a */
    public static int m16381a(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (!AbstractC35854l.m113837q(intentPutExtras)) {
            return -1;
        }
        AbstractC35854l.m113836p(intentPutExtras.getExtras(), "_nd");
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        synchronized (FirebaseInstanceIdReceiver.class) {
            try {
                SoftReference softReference = f21609a;
                ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC1879b("firebase-iid-executor")));
                    f21609a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
                executorService = executorServiceUnconfigurableExecutorService;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        executorService.execute(new Runnable(this) { // from class: so.j
            @Override // java.lang.Runnable
            public final void run() {
                Executor executorUnconfigurableExecutorService;
                int iM16381a;
                Intent intent2 = intent;
                Context context2 = context;
                boolean z4 = zIsOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent3 != null) {
                        iM16381a = FirebaseInstanceIdReceiver.m16381a(intent3);
                    } else {
                        int iIntValue = 500;
                        if (intent2.getExtras() != null) {
                            C32784a c32784a = new C32784a(intent2);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference2 = FirebaseInstanceIdReceiver.f21610b;
                                    executorUnconfigurableExecutorService = softReference2 != null ? (Executor) softReference2.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1879b("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f21610b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            executorUnconfigurableExecutorService.execute(new RunnableC4221m(context2, c32784a, countDownLatch));
                            try {
                                iIntValue = ((Integer) Tasks.await(new C41106j(context2).m133443b(intent2))).intValue();
                            } catch (InterruptedException | ExecutionException e5) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e5);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e13) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e13.toString()));
                            }
                        }
                        iM16381a = iIntValue;
                    }
                    if (z4 && pendingResult != null) {
                        pendingResult.setResultCode(iM16381a);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                } catch (Throwable th5) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th5;
                }
            }
        });
    }
}
