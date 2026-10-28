package io.sentry.android.core.internal.util;

import ge3.AbstractC15751g;
import io.sentry.C20535s;
import io.sentry.util.C20579a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C20105f {

    /* JADX INFO: renamed from: c */
    public static final C20105f f75530c = new C20105f();

    /* JADX INFO: renamed from: a */
    public final C20579a f75531a = new C20579a();

    /* JADX INFO: renamed from: b */
    public final ArrayList f75532b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final ArrayList m55999a() {
        ArrayList arrayList = this.f75532b;
        C20535s c20535sM56711a = this.f75531a.m56711a();
        try {
            if (!arrayList.isEmpty()) {
                c20535sM56711a.close();
                return arrayList;
            }
            File[] fileArrListFiles = new File("/sys/devices/system/cpu").listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList2 = new ArrayList();
                c20535sM56711a.close();
                return arrayList2;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String strM44437Q = AbstractC15751g.m44437Q(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (strM44437Q != null) {
                            arrayList.add(Integer.valueOf((int) (Long.parseLong(strM44437Q.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            c20535sM56711a.close();
            return arrayList;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
