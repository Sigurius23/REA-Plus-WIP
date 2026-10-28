package p692zt;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.internal.C5099k0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.whoop.service.network.model.UserSessionDto;
import io.sentry.android.core.C20119j1;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p002a0.C0022g;

/* JADX INFO: renamed from: zt.w */
/* JADX INFO: loaded from: classes.dex */
public final class C41119w {

    /* JADX INFO: renamed from: i */
    public static final long f177246i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f177247j = 0;

    /* JADX INFO: renamed from: a */
    public final Context f177248a;

    /* JADX INFO: renamed from: b */
    public final C20119j1 f177249b;

    /* JADX INFO: renamed from: c */
    public final C5099k0 f177250c;

    /* JADX INFO: renamed from: d */
    public final FirebaseMessaging f177251d;

    /* JADX INFO: renamed from: f */
    public final ScheduledThreadPoolExecutor f177253f;

    /* JADX INFO: renamed from: h */
    public final C41117u f177255h;

    /* JADX INFO: renamed from: e */
    public final C0022g f177252e = new C0022g(0);

    /* JADX INFO: renamed from: g */
    public boolean f177254g = false;

    public C41119w(FirebaseMessaging firebaseMessaging, C20119j1 c20119j1, C41117u c41117u, C5099k0 c5099k0, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f177251d = firebaseMessaging;
        this.f177249b = c20119j1;
        this.f177255h = c41117u;
        this.f177250c = c5099k0;
        this.f177248a = context;
        this.f177253f = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public static void m133483a(Task task) throws IOException {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Tasks.m15637a(task, 30L);
        } catch (InterruptedException | TimeoutException e5) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e5);
        } catch (ExecutionException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e13);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m133484b(String str) throws IOException {
        String strM16386a = this.f177251d.m16386a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        C5099k0 c5099k0 = this.f177250c;
        m133483a(c5099k0.m16011o(c5099k0.m16001T(strM16386a, "/topics/" + str, bundle)));
    }

    /* JADX INFO: renamed from: c */
    public final void m133485c(String str) throws IOException {
        String strM16386a = this.f177251d.m16386a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
        C5099k0 c5099k0 = this.f177250c;
        m133483a(c5099k0.m16011o(c5099k0.m16001T(strM16386a, "/topics/" + str, bundle)));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m133486d(boolean z4) {
        this.f177254g = z4;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0106 */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:86:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:86:0x002b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0093, please report this as an issue */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m133487e() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p692zt.C41119w.m133487e():boolean");
    }

    /* JADX INFO: renamed from: f */
    public final void m133488f(long j7) {
        this.f177253f.schedule(new RunnableC41121y(this, this.f177248a, this.f177249b, Math.min(Math.max(30L, 2 * j7), f177246i)), j7, TimeUnit.SECONDS);
        m133486d(true);
    }
}
