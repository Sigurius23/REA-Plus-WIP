package so;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import ce3.C4497a0;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kp.AbstractC22733a;
import p002a0.C0021f1;
import p073cq.C11040i;
import p073cq.C11052u;
import p073cq.RunnableC11042k;
import q30.C29938w0;

/* JADX INFO: renamed from: so.b */
/* JADX INFO: loaded from: classes.dex */
public final class C32785b {

    /* JADX INFO: renamed from: h */
    public static int f136463h;

    /* JADX INFO: renamed from: i */
    public static PendingIntent f136464i;

    /* JADX INFO: renamed from: j */
    public static final Pattern f136465j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b */
    public final Context f136467b;

    /* JADX INFO: renamed from: c */
    public final C4497a0 f136468c;

    /* JADX INFO: renamed from: d */
    public final ScheduledThreadPoolExecutor f136469d;

    /* JADX INFO: renamed from: f */
    public Messenger f136471f;

    /* JADX INFO: renamed from: g */
    public C32791h f136472g;

    /* JADX INFO: renamed from: a */
    public final C0021f1 f136466a = new C0021f1(0);

    /* JADX INFO: renamed from: e */
    public final Messenger f136470e = new Messenger(new HandlerC32789f(this, Looper.getMainLooper()));

    public C32785b(Context context) {
        this.f136467b = context;
        this.f136468c = new C4497a0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f136469d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX INFO: renamed from: a */
    public final C11052u m102845a(Bundle bundle) {
        String string;
        synchronized (C32785b.class) {
            int i13 = f136463h;
            f136463h = i13 + 1;
            string = Integer.toString(i13);
        }
        C11040i c11040i = new C11040i();
        synchronized (this.f136466a) {
            this.f136466a.put(string, c11040i);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f136468c.m14110d() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f136467b;
        synchronized (C32785b.class) {
            try {
                if (f136464i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f136464i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC22733a.f89412a);
                }
                intent.putExtra("app", f136464i);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f136470e);
        if (this.f136471f != null || this.f136472g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f136471f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f136472g.m102847b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f136468c.m14110d() == 2) {
                    this.f136467b.sendBroadcast(intent);
                } else {
                    this.f136467b.startService(intent);
                }
            }
        } else if (this.f136468c.m14110d() == 2) {
            this.f136467b.sendBroadcast(intent);
        } else {
            this.f136467b.startService(intent);
        }
        c11040i.f34644a.addOnCompleteListener(ExecutorC32799p.f136503w, new C29938w0(this, string, this.f136469d.schedule(new RunnableC11042k(1, c11040i), 30L, TimeUnit.SECONDS)));
        return c11040i.f34644a;
    }

    /* JADX INFO: renamed from: b */
    public final void m102846b(Bundle bundle, String str) {
        synchronized (this.f136466a) {
            try {
                C11040i c11040i = (C11040i) this.f136466a.remove(str);
                if (c11040i != null) {
                    c11040i.m29687b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
