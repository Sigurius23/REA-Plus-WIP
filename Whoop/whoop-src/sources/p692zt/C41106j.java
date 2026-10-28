package p692zt;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.profileinstaller.ExecutorC1651b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.iterable.iterableapi.CallableC5351m1;
import java.util.concurrent.ExecutorService;
import p002a0.C0022g;
import p073cq.InterfaceC11033b;
import p320m5.ExecutorC25061e;
import p537ux.C35331f0;
import p691zs.C41073a;

/* JADX INFO: renamed from: zt.j */
/* JADX INFO: loaded from: classes.dex */
public final class C41106j {

    /* JADX INFO: renamed from: c */
    public static final Object f177203c = new Object();

    /* JADX INFO: renamed from: d */
    public static ServiceConnectionC41099c0 f177204d;

    /* JADX INFO: renamed from: a */
    public final Object f177205a;

    /* JADX INFO: renamed from: b */
    public final Object f177206b;

    public C41106j(ExecutorService executorService) {
        this.f177206b = new C0022g(0);
        this.f177205a = executorService;
    }

    /* JADX INFO: renamed from: a */
    public static Task m133442a(Context context, Intent intent, boolean z4) {
        ServiceConnectionC41099c0 serviceConnectionC41099c0;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f177203c) {
            try {
                if (f177204d == null) {
                    f177204d = new ServiceConnectionC41099c0(context);
                }
                serviceConnectionC41099c0 = f177204d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z4) {
            return serviceConnectionC41099c0.m133435b(intent).continueWith(new ExecutorC1651b(0), new C41073a(5));
        }
        if (C41113q.m133448u().m133477z(context)) {
            AbstractC41122z.m133496c(context, serviceConnectionC41099c0, intent);
        } else {
            serviceConnectionC41099c0.m133435b(intent);
        }
        return Tasks.m15640d(-1);
    }

    /* JADX INFO: renamed from: b */
    public Task m133443b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f177205a;
        ExecutorC1651b executorC1651b = (ExecutorC1651b) this.f177206b;
        boolean z4 = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z13 = (intent.getFlags() & 268435456) != 0;
        return (!z4 || z13) ? Tasks.m15638b(executorC1651b, new CallableC5351m1(5, context, intent)).continueWithTask(executorC1651b, new InterfaceC11033b() { // from class: zt.i
            @Override // p073cq.InterfaceC11033b
            /* JADX INFO: renamed from: a */
            public final Object mo11178a(Task task) {
                return ((Integer) task.getResult()).intValue() != 402 ? task : C41106j.m133442a(context, intent, z13).continueWith(new ExecutorC25061e(0), new C35331f0(16));
            }
        }) : m133442a(context, intent, z13);
    }

    public C41106j(Context context) {
        this.f177205a = context;
        this.f177206b = new ExecutorC1651b(0);
    }
}
