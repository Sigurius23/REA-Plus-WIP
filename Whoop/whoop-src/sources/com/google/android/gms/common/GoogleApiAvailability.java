package com.google.android.gms.common;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.google.android.gms.common.api.AbstractC4977h;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.InterfaceC4981l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import jp.AbstractC21845c;
import jp.HandlerC21846d;
import kr.C22786e;
import p031b9.AbstractC2875y;
import p035bp.AbstractC3511b;
import p236j.AbstractC21065d;
import p479s4.AbstractC32120a;
import p479s4.AbstractC32122c;
import p529uo.AbstractC35127o;
import p529uo.AbstractC35135w;
import p529uo.AbstractDialogInterfaceOnClickListenerC35130r;
import p687zo.AbstractC40909b;
import to.AbstractC34006y;
import to.C33962a0;
import to.C33971f;
import to.C33990o0;
import to.C34007z;
import to.InterfaceC33977i;
import u00.C34377e;

/* JADX INFO: loaded from: classes.dex */
public class GoogleApiAvailability extends C4987d {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private String zac;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C4987d.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final Task zai(InterfaceC4981l interfaceC4981l, InterfaceC4981l... interfaceC4981lArr) {
        C33971f c33971f;
        AbstractC35135w.m111095g(interfaceC4981l, "Requested API must not be null.");
        for (InterfaceC4981l interfaceC4981l2 : interfaceC4981lArr) {
            AbstractC35135w.m111095g(interfaceC4981l2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(interfaceC4981lArr.length + 1);
        arrayList.add(interfaceC4981l);
        arrayList.addAll(Arrays.asList(interfaceC4981lArr));
        synchronized (C33971f.f142416R) {
            AbstractC35135w.m111095g(C33971f.f142417S, "Must guarantee manager is non-null before using getInstance");
            c33971f = C33971f.f142417S;
        }
        c33971f.getClass();
        C33990o0 c33990o0 = new C33990o0(arrayList);
        HandlerC21846d handlerC21846d = c33971f.f142427N;
        handlerC21846d.sendMessage(handlerC21846d.obtainMessage(2, c33990o0));
        return c33990o0.m107463b();
    }

    public Task<Void> checkApiAvailability(AbstractC4977h abstractC4977h, AbstractC4977h... abstractC4977hArr) {
        return zai(abstractC4977h, abstractC4977hArr).onSuccessTask(C22786e.f89708x);
    }

    public int getClientVersion(Context context) {
        AtomicBoolean atomicBoolean = AbstractC4988e.f20525a;
        return AbstractC32120a.m99979e(context, context.getPackageName());
    }

    public Dialog getErrorDialog(Activity activity, int i13, int i14) {
        return getErrorDialog(activity, i13, i14, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.C4987d
    public Intent getErrorResolutionIntent(Context context, int i13, String str) {
        return super.getErrorResolutionIntent(context, i13, str);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, C4969a c4969a) {
        PendingIntent pendingIntent;
        int i13 = c4969a.f20480x;
        return (i13 == 0 || (pendingIntent = c4969a.f20481y) == null) ? getErrorResolutionPendingIntent(context, i13, 0) : pendingIntent;
    }

    public final String getErrorString(int i13) {
        AtomicBoolean atomicBoolean = AbstractC4988e.f20525a;
        return C4969a.m15587f(i13);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, C4987d.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final boolean isUserResolvableError(int i13) {
        AtomicBoolean atomicBoolean = AbstractC4988e.f20525a;
        return i13 == 1 || i13 == 2 || i13 == 3 || i13 == 9;
    }

    public Task<Void> makeGooglePlayServicesAvailable(Activity activity) {
        int i13 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("makeGooglePlayServicesAvailable must be called from the main thread");
        }
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i13);
        if (iIsGooglePlayServicesAvailable == 0) {
            return Tasks.m15640d(null);
        }
        C33962a0 c33962a0M107415m = C33962a0.m107415m(activity);
        c33962a0M107415m.m107469l(new C4969a(iIsGooglePlayServicesAvailable, null), 0);
        return c33962a0M107415m.m107419n();
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(Context context, String str) {
        Object systemService = context.getSystemService("notification");
        AbstractC35135w.m111094f(systemService);
        AbstractC35135w.m111094f(((NotificationManager) systemService).getNotificationChannel(str));
        synchronized (zaa) {
            this.zac = str;
        }
    }

    public boolean showErrorDialogFragment(Activity activity, int i13, int i14) {
        return showErrorDialogFragment(activity, i13, i14, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(Context context, int i13) {
        zac(context, i13, null, getErrorResolutionPendingIntent(context, i13, 0, "n"));
    }

    public final Dialog zaa(Context context, int i13, AbstractDialogInterfaceOnClickListenerC35130r abstractDialogInterfaceOnClickListenerC35130r, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2 = null;
        if (i13 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(AbstractC35127o.m111078c(context, i13));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strM111080e = AbstractC35127o.m111080e(context, i13);
        DialogInterface.OnClickListener onClickListener2 = abstractDialogInterfaceOnClickListenerC35130r;
        if (strM111080e != null) {
            if (abstractDialogInterfaceOnClickListenerC35130r == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strM111080e, onClickListener2);
        }
        String strM111076a = AbstractC35127o.m111076a(context, i13);
        if (strM111076a != null) {
            builder2.setTitle(strM111076a);
        }
        Log.w("GoogleApiAvailability", AbstractC2875y.m8295h(i13, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder2.create();
    }

    public final boolean zab(Activity activity, InterfaceC33977i interfaceC33977i, int i13, int i14, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i13, AbstractDialogInterfaceOnClickListenerC35130r.m111087d(getErrorResolutionIntent(activity, i13, "d"), interfaceC33977i), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        zag(activity, dialogZaa, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final void zac(Context context, int i13, String str, PendingIntent pendingIntent) {
        String str2;
        int i14;
        Log.w("GoogleApiAvailability", AbstractC2875y.m8296i(i13, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i13 == 18) {
            zah(context);
            return;
        }
        if (pendingIntent == null) {
            if (i13 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM111077b = AbstractC35127o.m111077b(context, i13);
        String strM111079d = AbstractC35127o.m111079d(context, i13);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC35135w.m111094f(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(strM111077b).setStyle(new NotificationCompat.BigTextStyle().bigText(strM111079d));
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC40909b.f176319b == null) {
            AbstractC40909b.f176319b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = AbstractC40909b.f176319b.booleanValue();
        int i15 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i16 = context.getApplicationInfo().icon;
            if (i16 != 0) {
                i15 = i16;
            }
            style.setSmallIcon(i15).setPriority(2);
            if (AbstractC40909b.m132601c(context)) {
                style.addAction(2131231367, resources.getString(com.whoop.android.R.string.common_open_on_phone), pendingIntent);
            } else {
                style.setContentIntent(pendingIntent);
            }
        } else {
            style.setSmallIcon(R.drawable.stat_sys_warning).setTicker(resources.getString(com.whoop.android.R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(strM111079d);
        }
        synchronized (zaa) {
            str2 = this.zac;
        }
        if (str2 == null) {
            str2 = "com.google.android.gms.availability";
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.whoop.android.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        style.setChannelId(str2);
        Notification notificationBuild = style.build();
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            AbstractC4988e.f20525a.set(false);
            i14 = 10436;
        } else {
            i14 = 39789;
        }
        notificationManager.notify(i14, notificationBuild);
    }

    public final boolean zad(Context context, C4969a c4969a, int i13) {
        PendingIntent errorResolutionPendingIntent;
        if (AbstractC3511b.m10397z(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, c4969a)) == null) {
            return false;
        }
        zac(context, c4969a.f20480x, null, AbstractC21845c.m61828a(context, GoogleApiActivity.m15590a(context, errorResolutionPendingIntent, i13, true), AbstractC21845c.f84374a | 134217728));
        return true;
    }

    public final Dialog zae(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC35127o.m111078c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        zag(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final C34007z zaf(Context context, AbstractC34006y abstractC34006y) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C34007z c34007z = new C34007z(abstractC34006y);
        AbstractC32122c.registerReceiver(context, c34007z, intentFilter, 2);
        c34007z.m107492a(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return c34007z;
        }
        abstractC34006y.mo107467a();
        c34007z.m107493b();
        return null;
    }

    public final void zag(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC1340r0) {
                C4990g.m15618z(dialog, onCancelListener).show(((AbstractActivityC1340r0) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC4985b.m15610a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void zah(Context context) {
        new HandlerC4992i(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public Dialog getErrorDialog(Activity activity, int i13, int i14, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i13, AbstractDialogInterfaceOnClickListenerC35130r.m111085b(activity, getErrorResolutionIntent(activity, i13, "d"), i14), onCancelListener, null);
    }

    @Override // com.google.android.gms.common.C4987d
    public int isGooglePlayServicesAvailable(Context context, int i13) {
        return super.isGooglePlayServicesAvailable(context, i13);
    }

    public boolean showErrorDialogFragment(Activity activity, int i13, int i14, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i13, i14, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zag(activity, errorDialog, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public Task<Void> checkApiAvailability(InterfaceC4981l interfaceC4981l, InterfaceC4981l... interfaceC4981lArr) {
        return zai(interfaceC4981l, interfaceC4981lArr).onSuccessTask(C34377e.f144465x);
    }

    public void showErrorNotification(Context context, C4969a c4969a) {
        zac(context, c4969a.f20480x, null, getErrorResolutionPendingIntent(context, c4969a));
    }

    public Dialog getErrorDialog(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, int i13, int i14) {
        return getErrorDialog(abstractComponentCallbacksC1320m0, i13, i14, (DialogInterface.OnCancelListener) null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i13, int i14) {
        return getErrorResolutionPendingIntent(context, i13, i14, null);
    }

    public boolean showErrorDialogFragment(Activity activity, int i13, AbstractC21065d abstractC21065d, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i13, null, onCancelListener, new DialogInterfaceOnClickListenerC4991h(this, activity, i13, abstractC21065d));
        if (dialogZaa == null) {
            return false;
        }
        zag(activity, dialogZaa, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public Dialog getErrorDialog(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, int i13, int i14, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(abstractComponentCallbacksC1320m0.requireContext(), i13, AbstractDialogInterfaceOnClickListenerC35130r.m111086c(abstractComponentCallbacksC1320m0, getErrorResolutionIntent(abstractComponentCallbacksC1320m0.requireContext(), i13, "d"), i14), onCancelListener, null);
    }
}
