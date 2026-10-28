package io.sentry.android.core;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import m83.AbstractC25260n;
import p098dt.C12355g;
import p098dt.C12357i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.core.j1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20119j1 {

    /* JADX INFO: renamed from: a */
    public int f75584a;

    /* JADX INFO: renamed from: b */
    public int f75585b;

    /* JADX INFO: renamed from: c */
    public Object f75586c;

    /* JADX INFO: renamed from: d */
    public Object f75587d;

    /* JADX INFO: renamed from: e */
    public Object f75588e;

    /* JADX INFO: renamed from: c */
    public static String m56014c(C12355g c12355g) {
        c12355g.m34610a();
        C12357i c12357i = c12355g.f41521c;
        String str = c12357i.f41537e;
        if (str != null) {
            return str;
        }
        c12355g.m34610a();
        String str2 = c12357i.f41534b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX INFO: renamed from: a */
    public int m56015a(long j7) {
        int i13 = this.f75584a + 1;
        long[] jArr = (long[]) this.f75586c;
        int length = jArr.length;
        if (i13 > length) {
            int i14 = length * 2;
            long[] jArr2 = new long[i14];
            int[] iArr = new int[i14];
            AbstractC25260n.m74066g0(jArr, jArr2, 0, 0, jArr.length);
            AbstractC25260n.m74069j0(0, 0, (int[]) this.f75587d, iArr, 14);
            this.f75586c = jArr2;
            this.f75587d = iArr;
        }
        int i15 = this.f75584a;
        this.f75584a = i15 + 1;
        int length2 = ((int[]) this.f75588e).length;
        if (this.f75585b >= length2) {
            int i16 = length2 * 2;
            int[] iArr2 = new int[i16];
            int i17 = 0;
            while (i17 < i16) {
                int i18 = i17 + 1;
                iArr2[i17] = i18;
                i17 = i18;
            }
            AbstractC25260n.m74069j0(0, 0, (int[]) this.f75588e, iArr2, 14);
            this.f75588e = iArr2;
        }
        int i19 = this.f75585b;
        int[] iArr3 = (int[]) this.f75588e;
        this.f75585b = iArr3[i19];
        long[] jArr3 = (long[]) this.f75586c;
        jArr3[i15] = j7;
        ((int[]) this.f75587d)[i15] = i19;
        iArr3[i19] = i15;
        while (i15 > 0) {
            int i24 = ((i15 + 1) >> 1) - 1;
            if (AbstractC22676k.m65752l(jArr3[i24], j7) <= 0) {
                break;
            }
            m56020g(i24, i15);
            i15 = i24;
        }
        return i19;
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m56016b() {
        try {
            if (((String) this.f75587d) == null) {
                m56019f();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return (String) this.f75587d;
    }

    /* JADX INFO: renamed from: d */
    public PackageInfo m56017d(String str) {
        try {
            return ((Context) this.f75586c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e5) {
            Log.w("FirebaseMessaging", "Failed to find package " + e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m56018e() {
        int i13;
        synchronized (this) {
            i13 = this.f75585b;
            if (i13 == 0) {
                PackageManager packageManager = ((Context) this.f75586c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i13 = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        this.f75585b = 2;
                    } else {
                        this.f75585b = 2;
                    }
                    i13 = 2;
                }
            }
        }
        return i13 != 0;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m56019f() {
        PackageInfo packageInfoM56017d = m56017d(((Context) this.f75586c).getPackageName());
        if (packageInfoM56017d != null) {
            this.f75587d = Integer.toString(packageInfoM56017d.versionCode);
            this.f75588e = packageInfoM56017d.versionName;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m56020g(int i13, int i14) {
        long[] jArr = (long[]) this.f75586c;
        int[] iArr = (int[]) this.f75587d;
        int[] iArr2 = (int[]) this.f75588e;
        long j7 = jArr[i13];
        jArr[i13] = jArr[i14];
        jArr[i14] = j7;
        int i15 = iArr[i13];
        int i16 = iArr[i14];
        iArr[i13] = i16;
        iArr[i14] = i15;
        iArr2[i16] = i13;
        iArr2[i15] = i14;
    }
}
