package p107e3;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.google.android.gms.tasks.Tasks;
import com.mapbox.maps.renderer.RunnableC5555c;
import p073cq.C11040i;
import p549vb.AbstractC35862g;

/* JADX INFO: renamed from: e3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12601b {
    /* JADX INFO: renamed from: a */
    public static void m35314a(Context context, boolean z4, C11040i c11040i) {
        try {
            if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            SharedPreferences.Editor editorEdit = AbstractC35862g.m113840c(context).edit();
            editorEdit.putBoolean("proxy_notification_initialized", true);
            editorEdit.apply();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z4) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            c11040i.m29689d(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ContentCaptureSession m35315b(View view) {
        return view.getContentCaptureSession();
    }

    /* JADX INFO: renamed from: c */
    public static void m35316c(Context context) {
        boolean z4;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (AbstractC35862g.m113840c(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z4 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT >= 29) {
            new RunnableC5555c(context, z4, new C11040i()).run();
        } else {
            Tasks.m15640d(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m35317d(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return true;
                }
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m35318e(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }
}
