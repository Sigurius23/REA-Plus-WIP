package p692zt;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import live.hms.video.utils.HMSConstantsKt;
import p073cq.C11040i;
import p073cq.C11052u;
import p450r5.RunnableC30928b;
import p479s4.AbstractC32122c;
import p529uo.AbstractC35135w;
import zd3.C40580x;

/* JADX INFO: renamed from: zt.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C41103g {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f177192a;

    /* JADX INFO: renamed from: b */
    public final FirebaseMessagingService f177193b;

    /* JADX INFO: renamed from: c */
    public final C40580x f177194c;

    public C41103g(FirebaseMessagingService firebaseMessagingService, C40580x c40580x, ExecutorService executorService) {
        this.f177192a = executorService;
        this.f177193b = firebaseMessagingService;
        this.f177194c = c40580x;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0258  */
    /* JADX WARN: Code duplicated, block: B:103:0x0266  */
    /* JADX WARN: Code duplicated, block: B:105:0x0272  */
    /* JADX WARN: Code duplicated, block: B:108:0x027e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0283  */
    /* JADX WARN: Code duplicated, block: B:111:0x0286  */
    /* JADX WARN: Code duplicated, block: B:112:0x0294  */
    /* JADX WARN: Code duplicated, block: B:114:0x029a  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:135:0x0309  */
    /* JADX WARN: Code duplicated, block: B:136:0x030b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0339  */
    /* JADX WARN: Code duplicated, block: B:144:0x0367  */
    /* JADX WARN: Code duplicated, block: B:149:0x037d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0380  */
    /* JADX WARN: Code duplicated, block: B:154:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:158:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:168:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:174:0x0412  */
    /* JADX WARN: Code duplicated, block: B:177:0x0421  */
    /* JADX WARN: Code duplicated, block: B:178:0x0423  */
    /* JADX WARN: Code duplicated, block: B:180:0x0429  */
    /* JADX WARN: Code duplicated, block: B:182:0x0442  */
    /* JADX WARN: Code duplicated, block: B:185:0x044f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0460  */
    /* JADX WARN: Code duplicated, block: B:191:0x0469  */
    /* JADX WARN: Code duplicated, block: B:194:0x0484  */
    /* JADX WARN: Code duplicated, block: B:197:0x048e  */
    /* JADX WARN: Code duplicated, block: B:201:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:213:0x0513  */
    /* JADX WARN: Code duplicated, block: B:219:0x036f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0348 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x04b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146  */
    /* JADX WARN: Code duplicated, block: B:58:0x014e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0209  */
    /* JADX WARN: Code duplicated, block: B:91:0x0216  */
    /* JADX WARN: Code duplicated, block: B:92:0x0218  */
    /* JADX WARN: Code duplicated, block: B:97:0x0243  */
    /* JADX WARN: Code duplicated, block: B:99:0x0249  */
    /* JADX WARN: Instruction removed from duplicated block: B:180:0x0429, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:201:0x04a1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX INFO: renamed from: a */
    public final boolean m133437a() {
        C41109m c41109m;
        Bundle bundle;
        int identifier;
        String strM131576l;
        Uri defaultUri;
        String strM131576l2;
        String strM131576l3;
        Uri uri;
        Intent launchIntentForPackage;
        Bundle bundle2;
        PendingIntent activity;
        PendingIntent broadcast;
        String strM131576l4;
        Integer numValueOf;
        CharSequence charSequenceM131576l;
        Integer numM131569e;
        Integer numM131569e2;
        Integer numM131569e3;
        Long lM131574j;
        long[] jArrM131577m;
        int[] iArrM131571g;
        boolean zM131568c;
        ?? r10;
        int i13;
        String strM131576l5;
        int i14;
        int identifier2;
        String string;
        int i15 = 1;
        if (this.f177194c.m131568c("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = this.f177193b;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strM131576l6 = this.f177194c.m131576l("gcm.n.image");
        if (TextUtils.isEmpty(strM131576l6)) {
            c41109m = null;
        } else {
            try {
                c41109m = new C41109m(new URL(strM131576l6));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strM131576l6);
                c41109m = null;
            }
        }
        if (c41109m != null) {
            ExecutorService executorService = this.f177192a;
            C11040i c11040i = new C11040i();
            c41109m.f177213x = executorService.submit(new RunnableC30928b(23, c41109m, c11040i));
            c41109m.f177214y = c11040i.f34644a;
        }
        FirebaseMessagingService firebaseMessagingService2 = this.f177193b;
        C40580x c40580x = this.f177194c;
        AtomicInteger atomicInteger = AbstractC41101e.f177190a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e5) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e5);
        }
        Bundle bundle3 = bundle;
        String strM131576l7 = c40580x.m131576l("gcm.n.android_channel_id");
        try {
            if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                strM131576l7 = null;
            } else {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strM131576l7)) {
                    strM131576l7 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strM131576l7)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strM131576l7) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strM131576l7 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                } else if (notificationManager.getNotificationChannel(strM131576l7) == null) {
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + strM131576l7 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    strM131576l7 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strM131576l7)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strM131576l7) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strM131576l7 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        AtomicInteger atomicInteger2 = AbstractC41101e.f177190a;
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(firebaseMessagingService2, strM131576l7);
        CharSequence charSequenceM131575k = c40580x.m131575k(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(charSequenceM131575k)) {
            builder.setContentTitle(charSequenceM131575k);
        }
        CharSequence charSequenceM131575k2 = c40580x.m131575k(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(charSequenceM131575k2)) {
            builder.setContentText(charSequenceM131575k2);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(charSequenceM131575k2));
        }
        String strM131576l8 = c40580x.m131576l("gcm.n.icon");
        if (!TextUtils.isEmpty(strM131576l8)) {
            identifier = resources.getIdentifier(strM131576l8, "drawable", packageName);
            if (identifier == 0 && (identifier = resources.getIdentifier(strM131576l8, "mipmap", packageName)) == 0) {
                Log.w("FirebaseMessaging", "Icon resource " + strM131576l8 + " not found. Notification will use default icon.");
            } else {
                i15 = 1;
            }
            builder.setSmallIcon(identifier);
            strM131576l = c40580x.m131576l("gcm.n.sound2");
            if (TextUtils.isEmpty(strM131576l)) {
                strM131576l = c40580x.m131576l("gcm.n.sound");
            }
            if (TextUtils.isEmpty(strM131576l)) {
                defaultUri = null;
            } else if (!HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY.equals(strM131576l) || resources.getIdentifier(strM131576l, "raw", packageName) == 0) {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } else {
                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strM131576l);
            }
            if (defaultUri != null) {
                builder.setSound(defaultUri);
            }
            strM131576l2 = c40580x.m131576l("gcm.n.click_action");
            if (TextUtils.isEmpty(strM131576l2)) {
                strM131576l3 = c40580x.m131576l("gcm.n.link_android");
                if (TextUtils.isEmpty(strM131576l3)) {
                    strM131576l3 = c40580x.m131576l("gcm.n.link");
                }
                if (TextUtils.isEmpty(strM131576l3)) {
                    uri = null;
                } else {
                    uri = Uri.parse(strM131576l3);
                }
                if (uri != null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setData(uri);
                } else {
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    if (launchIntentForPackage == null) {
                        Log.w("FirebaseMessaging", "No activity found to launch app");
                    }
                }
            } else {
                launchIntentForPackage = new Intent(strM131576l2);
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setFlags(268435456);
            }
            if (launchIntentForPackage == null) {
                activity = null;
            } else {
                launchIntentForPackage.addFlags(67108864);
                Bundle bundle4 = (Bundle) c40580x.f174776w;
                bundle2 = new Bundle(bundle4);
                for (String str : bundle4.keySet()) {
                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                        bundle2.remove(str);
                    }
                }
                launchIntentForPackage.putExtras(bundle2);
                if (c40580x.m131568c("google.c.a.e")) {
                    launchIntentForPackage.putExtra("gcm.n.analytics_data", c40580x.m131578o());
                }
                activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
            }
            builder.setContentIntent(activity);
            if (c40580x.m131568c("google.c.a.e")) {
                broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c40580x.m131578o())), 1140850688);
            } else {
                broadcast = null;
            }
            if (broadcast != null) {
                builder.setDeleteIntent(broadcast);
            }
            strM131576l4 = c40580x.m131576l("gcm.n.color");
            if (TextUtils.isEmpty(strM131576l4)) {
                i14 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i14 != 0) {
                    numValueOf = Integer.valueOf(AbstractC32122c.getColor(firebaseMessagingService2, i14));
                } else {
                    numValueOf = null;
                }
            } else {
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(strM131576l4));
                } catch (IllegalArgumentException unused3) {
                    Log.w("FirebaseMessaging", "Color is invalid: " + strM131576l4 + ". Notification will use default color.");
                    i14 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i14 != 0) {
                        try {
                            numValueOf = Integer.valueOf(AbstractC32122c.getColor(firebaseMessagingService2, i14));
                        } catch (Resources.NotFoundException unused4) {
                            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                }
            }
            if (numValueOf != null) {
                builder.setColor(numValueOf.intValue());
            }
            builder.setAutoCancel(!c40580x.m131568c("gcm.n.sticky"));
            builder.setLocalOnly(c40580x.m131568c("gcm.n.local_only"));
            charSequenceM131576l = c40580x.m131576l("gcm.n.ticker");
            if (charSequenceM131576l != null) {
                builder.setTicker(charSequenceM131576l);
            }
            numM131569e = c40580x.m131569e("gcm.n.notification_priority");
            if (numM131569e == null) {
                numM131569e = null;
            } else if (numM131569e.intValue() >= -2 || numM131569e.intValue() > 2) {
                Log.w("FirebaseMessaging", "notificationPriority is invalid " + numM131569e + ". Skipping setting notificationPriority.");
                numM131569e = null;
            }
            if (numM131569e != null) {
                builder.setPriority(numM131569e.intValue());
            }
            numM131569e2 = c40580x.m131569e("gcm.n.visibility");
            if (numM131569e2 == null) {
                numM131569e2 = null;
            } else if (numM131569e2.intValue() >= -1 || numM131569e2.intValue() > i15) {
                Log.w("NotificationParams", "visibility is invalid: " + numM131569e2 + ". Skipping setting visibility.");
                numM131569e2 = null;
            }
            if (numM131569e2 != null) {
                builder.setVisibility(numM131569e2.intValue());
            }
            numM131569e3 = c40580x.m131569e("gcm.n.notification_count");
            if (numM131569e3 != null) {
                numM131569e3 = null;
            } else if (numM131569e3.intValue() < 0) {
                Log.w("FirebaseMessaging", "notificationCount is invalid: " + numM131569e3 + ". Skipping setting notificationCount.");
                numM131569e3 = null;
            }
            if (numM131569e3 != null) {
                builder.setNumber(numM131569e3.intValue());
            }
            lM131574j = c40580x.m131574j();
            if (lM131574j != null) {
                builder.setShowWhen(true);
                builder.setWhen(lM131574j.longValue());
            }
            jArrM131577m = c40580x.m131577m();
            if (jArrM131577m != null) {
                builder.setVibrate(jArrM131577m);
            }
            iArrM131571g = c40580x.m131571g();
            if (iArrM131571g != null) {
                builder.setLights(iArrM131571g[0], iArrM131571g[1], iArrM131571g[2]);
            }
            zM131568c = c40580x.m131568c("gcm.n.default_sound");
            r10 = zM131568c;
            if (c40580x.m131568c("gcm.n.default_vibrate_timings")) {
                r10 = (zM131568c ? 1 : 0) | 2;
            }
            i13 = r10;
            if (c40580x.m131568c("gcm.n.default_light_settings")) {
                i13 = (r10 == true ? 1 : 0) | 4;
            }
            builder.setDefaults(i13);
            strM131576l5 = c40580x.m131576l("gcm.n.tag");
            if (TextUtils.isEmpty(strM131576l5)) {
                strM131576l5 = "FCM-Notification:" + SystemClock.uptimeMillis();
            }
            String str2 = strM131576l5;
            if (c41109m != null) {
                try {
                    C11052u c11052u = c41109m.f177214y;
                    AbstractC35135w.m111094f(c11052u);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    Bitmap bitmap = (Bitmap) Tasks.m15637a(c11052u, 5L);
                    builder.setLargeIcon(bitmap);
                    builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
                } catch (InterruptedException unused5) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    c41109m.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e13) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e13.getCause());
                } catch (TimeoutException unused6) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    c41109m.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) this.f177193b.getSystemService("notification")).notify(str2, 0, builder.build());
            return true;
        }
        int i16 = bundle3.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i16 == 0) {
            try {
                i16 = packageManager.getApplicationInfo(packageName, 0).icon;
            } catch (PackageManager.NameNotFoundException e14) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e14);
            }
        }
        identifier = i16 != 0 ? i16 : 17301651;
        builder.setSmallIcon(identifier);
        strM131576l = c40580x.m131576l("gcm.n.sound2");
        if (TextUtils.isEmpty(strM131576l)) {
            strM131576l = c40580x.m131576l("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strM131576l)) {
            defaultUri = null;
        } else if (HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY.equals(strM131576l)) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        if (defaultUri != null) {
            builder.setSound(defaultUri);
        }
        strM131576l2 = c40580x.m131576l("gcm.n.click_action");
        if (TextUtils.isEmpty(strM131576l2)) {
            launchIntentForPackage = new Intent(strM131576l2);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        } else {
            strM131576l3 = c40580x.m131576l("gcm.n.link_android");
            if (TextUtils.isEmpty(strM131576l3)) {
                strM131576l3 = c40580x.m131576l("gcm.n.link");
            }
            if (TextUtils.isEmpty(strM131576l3)) {
                uri = Uri.parse(strM131576l3);
            } else {
                uri = null;
            }
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle5 = (Bundle) c40580x.f174776w;
            bundle2 = new Bundle(bundle5);
            while (r13.hasNext()) {
                if (str.startsWith("google.c.")) {
                    bundle2.remove(str);
                } else {
                    bundle2.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            if (c40580x.m131568c("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", c40580x.m131578o());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        builder.setContentIntent(activity);
        if (c40580x.m131568c("google.c.a.e")) {
            broadcast = null;
        } else {
            broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c40580x.m131578o())), 1140850688);
        }
        if (broadcast != null) {
            builder.setDeleteIntent(broadcast);
        }
        strM131576l4 = c40580x.m131576l("gcm.n.color");
        if (TextUtils.isEmpty(strM131576l4)) {
            numValueOf = Integer.valueOf(Color.parseColor(strM131576l4));
        } else {
            i14 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i14 != 0) {
                numValueOf = Integer.valueOf(AbstractC32122c.getColor(firebaseMessagingService2, i14));
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            builder.setColor(numValueOf.intValue());
        }
        builder.setAutoCancel(!c40580x.m131568c("gcm.n.sticky"));
        builder.setLocalOnly(c40580x.m131568c("gcm.n.local_only"));
        charSequenceM131576l = c40580x.m131576l("gcm.n.ticker");
        if (charSequenceM131576l != null) {
            builder.setTicker(charSequenceM131576l);
        }
        numM131569e = c40580x.m131569e("gcm.n.notification_priority");
        if (numM131569e == null) {
            if (numM131569e.intValue() >= -2) {
            }
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numM131569e + ". Skipping setting notificationPriority.");
            numM131569e = null;
        } else {
            numM131569e = null;
        }
        if (numM131569e != null) {
            builder.setPriority(numM131569e.intValue());
        }
        numM131569e2 = c40580x.m131569e("gcm.n.visibility");
        if (numM131569e2 == null) {
            if (numM131569e2.intValue() >= -1) {
            }
            Log.w("NotificationParams", "visibility is invalid: " + numM131569e2 + ". Skipping setting visibility.");
            numM131569e2 = null;
        } else {
            numM131569e2 = null;
        }
        if (numM131569e2 != null) {
            builder.setVisibility(numM131569e2.intValue());
        }
        numM131569e3 = c40580x.m131569e("gcm.n.notification_count");
        if (numM131569e3 != null) {
            numM131569e3 = null;
        } else if (numM131569e3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numM131569e3 + ". Skipping setting notificationCount.");
            numM131569e3 = null;
        }
        if (numM131569e3 != null) {
            builder.setNumber(numM131569e3.intValue());
        }
        lM131574j = c40580x.m131574j();
        if (lM131574j != null) {
            builder.setShowWhen(true);
            builder.setWhen(lM131574j.longValue());
        }
        jArrM131577m = c40580x.m131577m();
        if (jArrM131577m != null) {
            builder.setVibrate(jArrM131577m);
        }
        iArrM131571g = c40580x.m131571g();
        if (iArrM131571g != null) {
            builder.setLights(iArrM131571g[0], iArrM131571g[1], iArrM131571g[2]);
        }
        zM131568c = c40580x.m131568c("gcm.n.default_sound");
        r10 = zM131568c;
        if (c40580x.m131568c("gcm.n.default_vibrate_timings")) {
            r10 = (zM131568c ? 1 : 0) | 2;
        }
        i13 = r10;
        if (c40580x.m131568c("gcm.n.default_light_settings")) {
            i13 = (r10 == true ? 1 : 0) | 4;
        }
        builder.setDefaults(i13);
        strM131576l5 = c40580x.m131576l("gcm.n.tag");
        if (TextUtils.isEmpty(strM131576l5)) {
            strM131576l5 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str3 = strM131576l5;
        if (c41109m != null) {
            C11052u c11052u2 = c41109m.f177214y;
            AbstractC35135w.m111094f(c11052u2);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            Bitmap bitmap2 = (Bitmap) Tasks.m15637a(c11052u2, 5L);
            builder.setLargeIcon(bitmap2);
            builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap2).bigLargeIcon((Bitmap) null));
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f177193b.getSystemService("notification")).notify(str3, 0, builder.build());
        return true;
    }
}
