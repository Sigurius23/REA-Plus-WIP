package com.iterable.iterableapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.v1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5380v1 {
    /* JADX INFO: renamed from: a */
    public static String m16537a(Context context, String str, boolean z4) {
        String packageName = context.getPackageName();
        if (str == null) {
            str = packageName;
        }
        if (z4) {
            if (!m16539c(context)) {
                return AbstractC2875y.m8299l(str, "_noBadge");
            }
        } else if (m16539c(context)) {
            return AbstractC2875y.m8299l(str, "_noBadge");
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16538b(Bundle bundle) {
        if (bundle.containsKey("itbl")) {
            return new C5377u1(bundle.getString("itbl")).f21846c;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16539c(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getBoolean("iterable_notification_badging", true);
            }
        } catch (PackageManager.NameNotFoundException e5) {
            AbstractC12350b.m34595p("IterableNotification", e5.getLocalizedMessage() + " Failed to read notification badge settings. Setting to defaults - true");
        }
        return true;
    }
}
