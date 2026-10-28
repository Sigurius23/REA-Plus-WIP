package io.sentry.android.replay.util;

import android.os.Build;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.util.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20240h {
    /* JADX INFO: renamed from: a */
    public static String m56154a(EnumC20238f key) {
        String str;
        AbstractC22676k.m65750j(key, "key");
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        int i13 = AbstractC20239g.f76026a[key.ordinal()];
        if (i13 == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = Build.SOC_MANUFACTURER;
        }
        AbstractC22676k.m65747g(str);
        return str;
    }
}
