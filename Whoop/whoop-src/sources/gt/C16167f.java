package gt;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import ht.ScheduledExecutorServiceC17618g;
import ht.ThreadFactoryC17612a;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import st.InterfaceC32956a;
import u93.C34671d0;

/* JADX INFO: renamed from: gt.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16167f implements InterfaceC32956a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61437a;

    public /* synthetic */ C16167f(int i13) {
        this.f61437a = i13;
    }

    @Override // st.InterfaceC32956a
    public final Object get() {
        switch (this.f61437a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                C16173l c16173l = ExecutorsRegistrar.f21605a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new ScheduledExecutorServiceC17618g(Executors.newFixedThreadPool(4, new ThreadFactoryC17612a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f21608d.get());
            case 3:
                C16173l c16173l2 = ExecutorsRegistrar.f21605a;
                return new ScheduledExecutorServiceC17618g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC17612a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f21608d.get());
            case 4:
                C16173l c16173l3 = ExecutorsRegistrar.f21605a;
                return new ScheduledExecutorServiceC17618g(Executors.newCachedThreadPool(new ThreadFactoryC17612a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f21608d.get());
            case 5:
                C16173l c16173l4 = ExecutorsRegistrar.f21605a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC17612a("Firebase Scheduler", 0, null));
            default:
                C34671d0 c34671d0 = FirebaseMessaging.f21612k;
                return null;
        }
    }
}
