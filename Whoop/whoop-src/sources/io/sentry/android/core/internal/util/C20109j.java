package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.C20121k0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C20109j {

    /* JADX INFO: renamed from: g */
    public static final Charset f75543g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Context f75544a;

    /* JADX INFO: renamed from: b */
    public final C20121k0 f75545b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20602v0 f75546c;

    /* JADX INFO: renamed from: d */
    public final String[] f75547d;

    /* JADX INFO: renamed from: e */
    public final String[] f75548e;

    /* JADX INFO: renamed from: f */
    public final Runtime f75549f;

    public C20109j(Context context, InterfaceC20602v0 interfaceC20602v0, C20121k0 c20121k0) {
        Runtime runtime = Runtime.getRuntime();
        this.f75544a = context;
        AbstractC29125c.m88510S(c20121k0, "The BuildInfoProvider is required.");
        this.f75545b = c20121k0;
        AbstractC29125c.m88510S(interfaceC20602v0, "The Logger is required.");
        this.f75546c = interfaceC20602v0;
        this.f75547d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.f75548e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        AbstractC29125c.m88510S(runtime, "The Runtime is required.");
        this.f75549f = runtime;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX INFO: renamed from: a */
    public final boolean m56002a() {
        boolean z4;
        boolean z13;
        this.f75545b.getClass();
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        String[] strArr = this.f75547d;
        int length = strArr.length;
        int i13 = 0;
        while (true) {
            InterfaceC20602v0 interfaceC20602v0 = this.f75546c;
            if (i13 < length) {
                String str2 = strArr[i13];
                try {
                    if (new File(str2).exists()) {
                        return true;
                    }
                    i13++;
                } catch (RuntimeException e5) {
                    interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, e5, "Error when trying to check if root file %s exists.", str2);
                }
            } else {
                Process process = null;
                try {
                    try {
                        try {
                            Process processExec = this.f75549f.exec(new String[]{"/system/xbin/which", "su"});
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), f75543g));
                            try {
                                z4 = bufferedReader.readLine() != null;
                                bufferedReader.close();
                                processExec.destroy();
                                if (z4) {
                                    return true;
                                }
                                AbstractC29125c.m88510S(interfaceC20602v0, "The ILogger object is required.");
                                PackageManager packageManager = this.f75544a.getPackageManager();
                                if (packageManager != null) {
                                    for (String str3 : this.f75548e) {
                                        try {
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                packageManager.getPackageInfo(str3, PackageManager.PackageInfoFlags.of(0L));
                                            } else {
                                                packageManager.getPackageInfo(str3, 0);
                                            }
                                            z13 = true;
                                        } catch (PackageManager.NameNotFoundException unused) {
                                        }
                                    }
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                return z13;
                            } catch (Throwable th3) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (IOException unused2) {
                            interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "SU isn't found on this Device.", new Object[0]);
                            if (0 != 0) {
                                process.destroy();
                            }
                            z4 = false;
                        }
                    } catch (Throwable th5) {
                        interfaceC20602v0.mo16060j(EnumC20436n5.DEBUG, "Error when trying to check if SU exists.", th5);
                        if (0 != 0) {
                            process.destroy();
                        }
                        z4 = false;
                    }
                } catch (Throwable th6) {
                    if (0 != 0) {
                        process.destroy();
                    }
                    throw th6;
                }
            }
        }
    }
}
