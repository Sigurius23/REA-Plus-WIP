package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.getstream.chat.android.models.MessageType;
import io.sentry.C20315e;
import io.sentry.C20337g0;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20308d1;
import io.sentry.android.core.internal.util.C20106g;
import io.sentry.util.AbstractC20591m;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: renamed from: io.sentry.android.core.s1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20155s1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20308d1 f75716a;

    /* JADX INFO: renamed from: b */
    public final SentryAndroidOptions f75717b;

    /* JADX INFO: renamed from: c */
    public final C20106g f75718c = new C20106g(60000, 0);

    /* JADX INFO: renamed from: d */
    public final char[] f75719d = new char[64];

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SystemEventsBreadcrumbsIntegration f75720e;

    public C20155s1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, InterfaceC20308d1 interfaceC20308d1, SentryAndroidOptions sentryAndroidOptions) {
        this.f75720e = systemEventsBreadcrumbsIntegration;
        this.f75716a = interfaceC20308d1;
        this.f75717b = sentryAndroidOptions;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C20152r1 c20152r1;
        Bundle extras;
        int i13;
        String action = intent.getAction();
        boolean zEquals = "android.intent.action.BATTERY_CHANGED".equals(action);
        SentryAndroidOptions sentryAndroidOptions = this.f75717b;
        String str = null;
        if (!zEquals) {
            c20152r1 = null;
        } else {
            if (this.f75718c.m56000a()) {
                return;
            }
            Float fM56030b = C20130n0.m56030b(intent, sentryAndroidOptions);
            c20152r1 = new C20152r1(fM56030b != null ? Integer.valueOf(fM56030b.intValue()) : null, C20130n0.m56032d(intent, sentryAndroidOptions));
            SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = this.f75720e;
            if (c20152r1.equals(systemEventsBreadcrumbsIntegration.f75288L)) {
                return;
            } else {
                systemEventsBreadcrumbsIntegration.f75288L = c20152r1;
            }
        }
        C20315e c20315e = new C20315e(System.currentTimeMillis());
        c20315e.f76286E = MessageType.SYSTEM;
        c20315e.f76288G = "device.event";
        if (action != null) {
            int length = action.length();
            char[] cArr = this.f75719d;
            int length2 = cArr.length;
            int i14 = length - 1;
            while (true) {
                if (i14 >= 0) {
                    char cCharAt = action.charAt(i14);
                    if (cCharAt == '.') {
                        str = new String(cArr, length2, cArr.length - length2);
                        break;
                    }
                    if (length2 == 0) {
                        Charset charset = AbstractC20591m.f77097a;
                        int iLastIndexOf = action.lastIndexOf(".");
                        if (iLastIndexOf >= 0 && action.length() > (i13 = iLastIndexOf + 1)) {
                            str = action.substring(i13);
                            break;
                        }
                        break;
                    }
                    length2--;
                    cArr[length2] = cCharAt;
                    i14--;
                }
                str = action;
                break;
            }
        }
        if (str != null) {
            c20315e.m56470c(str, "action");
        }
        if (c20152r1 != null) {
            Integer num = c20152r1.f75699a;
            if (num != null) {
                c20315e.m56470c(num, "level");
            }
            Boolean bool = c20152r1.f75700b;
            if (bool != null) {
                c20315e.m56470c(bool, "charging");
            }
        } else if (sentryAndroidOptions.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
            HashMap map = new HashMap(extras.size());
            for (String str2 : extras.keySet()) {
                try {
                    Object obj = extras.get(str2);
                    if (obj != null) {
                        map.put(str2, obj.toString());
                    }
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "%s key of the %s action threw an error.", str2, action);
                }
            }
            c20315e.m56470c(map, "extras");
        }
        c20315e.f76290I = EnumC20436n5.INFO;
        C20337g0 c20337g0 = new C20337g0();
        c20337g0.m56493d(intent, "android:intent");
        this.f75716a.mo56429i(c20315e, c20337g0);
    }
}
