package p415q6;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import e93.AbstractC12889b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import p358o6.AbstractC27596d;
import p358o6.AbstractC27597e;
import p358o6.C27595c;
import p358o6.C27598f;
import p358o6.InterfaceC27593a;
import p395p6.C28932x1;
import p636y3.C39176h;
import p715kotlin.NoWhenBranchMatchedException;
import pt2.C29529k;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: q6.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29995e {

    /* JADX INFO: renamed from: a */
    public static final C27595c f122484a = new C27595c("android.widget.extra.CHECKED");

    /* JADX INFO: renamed from: a */
    public static final Uri m91722a(C28932x1 c28932x1, int i13, EnumC29992b enumC29992b, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(enumC29992b.name());
        builder.appendQueryParameter("appWidgetId", String.valueOf(c28932x1.f117050b));
        builder.appendQueryParameter("viewId", String.valueOf(i13));
        builder.appendQueryParameter("viewSize", C39176h.m124788d(c28932x1.f117058j));
        builder.appendQueryParameter("extraData", str);
        if (c28932x1.f117054f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(c28932x1.f117059k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: b */
    public static final Intent m91723b(InterfaceC27593a interfaceC27593a, C28932x1 c28932x1, int i13, C29529k c29529k) {
        if (interfaceC27593a instanceof C29993c) {
            C29993c c29993c = (C29993c) interfaceC27593a;
            Intent intentM91726e = m91726e(c29993c, c29993c.f122483b);
            if (intentM91726e.getData() == null) {
                intentM91726e.setData(m91722a(c28932x1, i13, EnumC29992b.f122480x, String.valueOf(intentM91726e.getFlags())));
            }
            return intentM91726e;
        }
        if (!(interfaceC27593a instanceof AbstractC27597e)) {
            throw new IllegalStateException(("Cannot create fill-in Intent for action type: " + interfaceC27593a).toString());
        }
        ComponentName componentName = c28932x1.f117062n;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", c28932x1.f117050b);
        EnumC29992b enumC29992b = EnumC29992b.f122479w;
        Intent intent = new Intent();
        intent.setComponent(c28932x1.f117063o.f117029a);
        intent.setData(m91722a(c28932x1, i13, enumC29992b, ""));
        intent.putExtra("ACTION_TYPE", "BROADCAST");
        intent.putExtra("ACTION_INTENT", intentPutExtra);
        return intent;
    }

    /* JADX INFO: renamed from: c */
    public static C27598f m91724c(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("ActionCallbackBroadcastReceiver:parameters");
        if (bundle2 == null) {
            throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
        }
        C27598f c27598fM121632P = AbstractC37978j.m121632P(new AbstractC27596d[0]);
        LinkedHashMap linkedHashMap = c27598fM121632P.f111088a;
        for (String str : bundle2.keySet()) {
            C27595c c27595c = new C27595c(str);
            Object obj = bundle2.get(str);
            linkedHashMap.get(c27595c);
            if (obj == null) {
                linkedHashMap.remove(c27595c);
            } else {
                linkedHashMap.put(c27595c, obj);
            }
        }
        if (bundle.containsKey("android.widget.extra.CHECKED")) {
            Boolean boolValueOf = Boolean.valueOf(bundle.getBoolean("android.widget.extra.CHECKED"));
            C27595c c27595c2 = f122484a;
            linkedHashMap.get(c27595c2);
            linkedHashMap.put(c27595c2, boolValueOf);
        }
        return c27598fM121632P;
    }

    /* JADX INFO: renamed from: d */
    public static final PendingIntent m91725d(InterfaceC27593a interfaceC27593a, C28932x1 c28932x1, int i13, C29529k c29529k) {
        Context context = c28932x1.f117049a;
        if (interfaceC27593a instanceof C29993c) {
            C29993c c29993c = (C29993c) interfaceC27593a;
            Intent intentM91726e = m91726e(c29993c, c29993c.f122483b);
            if (intentM91726e.getData() == null) {
                intentM91726e.setData(m91722a(c28932x1, i13, EnumC29992b.f122480x, String.valueOf(intentM91726e.getFlags())));
            }
            return PendingIntent.getActivity(context, 0, intentM91726e, 201326592, null);
        }
        if (!(interfaceC27593a instanceof AbstractC27597e)) {
            throw new IllegalStateException(("Cannot create PendingIntent for action type: " + interfaceC27593a).toString());
        }
        ComponentName componentName = c28932x1.f117062n;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", c28932x1.f117050b);
        intentPutExtra.setData(m91722a(c28932x1, i13, EnumC29992b.f122480x, null));
        return PendingIntent.getBroadcast(context, 0, intentPutExtra, 201326592);
    }

    /* JADX INFO: renamed from: e */
    public static final Intent m91726e(C29993c c29993c, C27598f c27598f) {
        if (!(c29993c instanceof C29993c)) {
            throw new IllegalStateException(("Action type not defined in app widget package: " + c29993c).toString());
        }
        Intent intent = c29993c.f122482a;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(c27598f.f111088a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            arrayList.add(new C23465k(((C27595c) entry.getKey()).f111087a, entry.getValue()));
        }
        C23465k[] c23465kArr = (C23465k[]) arrayList.toArray(new C23465k[0]);
        intent.putExtras(AbstractC12889b.m36273g((C23465k[]) Arrays.copyOf(c23465kArr, c23465kArr.length)));
        return intent;
    }

    /* JADX INFO: renamed from: f */
    public static final void m91727f(Activity activity, Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.");
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type");
        }
        Bundle bundleExtra = intent.getBundleExtra("ACTIVITY_OPTIONS");
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(Build.VERSION.SDK_INT >= 31 ? AbstractC29994d.m91721a(new StrictMode.VmPolicy.Builder(vmPolicy)).build() : new StrictMode.VmPolicy.Builder().build());
        int iOrdinal = EnumC29992b.valueOf(stringExtra).ordinal();
        if (iOrdinal == 0) {
            activity.startActivity(intent2, bundleExtra);
        } else if (iOrdinal == 1) {
            activity.sendBroadcast(intent2);
        } else if (iOrdinal == 2) {
            activity.startService(intent2);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            activity.sendBroadcast(intent2);
        } else {
            activity.startForegroundService(intent2);
        }
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }
}
