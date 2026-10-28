package com.google.android.gms.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.util.Log;
import java.util.Arrays;
import p310lp.AbstractC24626e;
import p310lp.C24623b;
import p310lp.C24627f;
import p529uo.AbstractC35135w;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.google.android.gms.common.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4989f {

    /* JADX INFO: renamed from: b */
    public static C4989f f20530b;

    /* JADX INFO: renamed from: a */
    public final Context f20531a;

    public C4989f(Context context, int i13) {
        switch (i13) {
            case 1:
                this.f20531a = context;
                break;
            default:
                this.f20531a = context.getApplicationContext();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4989f m15614a(Context context) {
        AbstractC35135w.m111094f(context);
        synchronized (C4989f.class) {
            if (f20530b == null) {
                BinderC4993j binderC4993j = AbstractC4997n.f20550a;
                synchronized (AbstractC4997n.class) {
                    if (AbstractC4997n.f20552c == null) {
                        AbstractC4997n.f20552c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f20530b = new C4989f(context, 0);
            }
        }
        return f20530b;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m15615c(PackageInfo packageInfo, boolean z4) {
        C24627f c24627f;
        int i13;
        if (packageInfo != null) {
            if (z4 && (C4987d.GOOGLE_PLAY_STORE_PACKAGE.equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z4 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                C24627f c24627f2 = z4 ? AbstractC4996m.f20549c : AbstractC4996m.f20548b;
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    C24623b c24623b = AbstractC24626e.f96357x;
                    c24627f = C24627f.f96358E;
                } else {
                    C24623b c24623b2 = AbstractC24626e.f96357x;
                    Object[] objArrCopyOf = new Object[4];
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    int length = signingCertificateHistory.length;
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < length) {
                        byte[] byteArray = signingCertificateHistory[i14].toByteArray();
                        byteArray.getClass();
                        int length2 = objArrCopyOf.length;
                        int i16 = i15 + 1;
                        if (i16 < 0) {
                            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                        }
                        if (i16 <= length2) {
                            i13 = length2;
                        } else {
                            i13 = (length2 >> 1) + length2 + 1;
                            if (i13 < i16) {
                                int iHighestOneBit = Integer.highestOneBit(i15);
                                i13 = iHighestOneBit + iHighestOneBit;
                            }
                            if (i13 < 0) {
                                i13 = Integer.MAX_VALUE;
                            }
                        }
                        if (i13 > length2) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i13);
                        }
                        objArrCopyOf[i15] = byteArray;
                        i14++;
                        i15 = i16;
                    }
                    c24627f = i15 == 0 ? C24627f.f96358E : new C24627f(i15, objArrCopyOf);
                }
                if (c24627f.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                AbstractC24626e abstractC24626eMo71959f = c24627f.mo71959f();
                int size = abstractC24626eMo71959f.size();
                int i17 = 0;
                while (i17 < size) {
                    byte[] bArr = (byte[]) abstractC24626eMo71959f.get(i17);
                    C24623b c24623bListIterator = c24627f2.listIterator(0);
                    do {
                        int i18 = i17 + 1;
                        if (!c24623bListIterator.hasNext()) {
                            i17 = i18;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) c24623bListIterator.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z4 ? m15616d(packageInfo, AbstractC4996m.f20547a) : m15616d(packageInfo, AbstractC4996m.f20547a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static AbstractBinderC4994k m15616d(PackageInfo packageInfo, AbstractBinderC4994k... abstractBinderC4994kArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            BinderC4995l binderC4995l = new BinderC4995l(packageInfo.signatures[0].toByteArray());
            for (int i13 = 0; i13 < abstractBinderC4994kArr.length; i13++) {
                if (abstractBinderC4994kArr[i13].equals(binderC4995l)) {
                    return abstractBinderC4994kArr[i13];
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public SharedPreferences m15617b() {
        SharedPreferences sharedPreferences = this.f20531a.getSharedPreferences("com.amplitude.engagement", 0);
        AbstractC22676k.m65749i(sharedPreferences, "context.getSharedPrefere…t\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
