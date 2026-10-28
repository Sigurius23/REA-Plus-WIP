package com.iterable.iterableapi;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import e61.C12764g;
import ge3.AbstractC15751g;
import ht2.C17632d;
import io.sentry.AbstractC20519r4;
import io.sentry.C20265b7;
import io.sentry.C20275c5;
import io.sentry.InterfaceC20390j1;
import io.sentry.android.core.C20124l0;
import io.sentry.android.core.C20130n0;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import m83.AbstractC25260n;
import p098dt.AbstractC12350b;
import p218ic.AbstractC18386u;
import p218ic.C18358g;
import p218ic.C18382s;
import p218ic.C18384t;
import p218ic.C18389w;
import p218ic.EnumC18371m0;
import p249jc.AbstractC21576f0;
import p249jc.AbstractC21584j0;
import p249jc.C21570c0;
import p249jc.C21572d0;
import p249jc.C21574e0;
import p249jc.C21582i0;
import p392p3.C28761b0;
import p420qc.C30193c;
import p420qc.C30204n;
import p420qc.C30207q;
import p420qc.C30211u;
import p692zt.AbstractC41122z;
import p692zt.C41113q;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: com.iterable.iterableapi.m1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC5351m1 implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21770w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f21771x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f21772y;

    public /* synthetic */ CallableC5351m1(int i13, Object obj, Object obj2) {
        this.f21770w = i13;
        this.f21771x = obj;
        this.f21772y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0186  */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IterableDataEncryptor$DecryptionException, IOException {
        byte[] bArrDoFinal;
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i13;
        ComponentName componentNameStartService;
        switch (this.f21770w) {
            case 0:
                C5390z it = (C5390z) this.f21771x;
                String str3 = (String) this.f21772y;
                AbstractC22676k.m65750j(it, "$it");
                try {
                    byte[] bArrDecode = Base64.decode(str3, 2);
                    boolean z4 = bArrDecode[0] == 1;
                    int i14 = bArrDecode[1] + 2;
                    byte[] bArrM74070k0 = AbstractC25260n.m74070k0(bArrDecode, 2, i14);
                    byte[] bArrM74070k1 = AbstractC25260n.m74070k0(bArrDecode, i14, bArrDecode.length);
                    if (z4) {
                        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                        cipher.init(2, C5390z.m16543c(), new GCMParameterSpec(128, bArrM74070k0));
                        bArrDoFinal = cipher.doFinal(bArrM74070k1);
                        AbstractC22676k.m65749i(bArrDoFinal, "doFinal(...)");
                    } else {
                        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        cipher2.init(2, C5390z.m16543c(), new IvParameterSpec(bArrM74070k0));
                        bArrDoFinal = cipher2.doFinal(bArrM74070k1);
                        AbstractC22676k.m65749i(bArrDoFinal, "doFinal(...)");
                    }
                    return new String(bArrDoFinal, AbstractC39397a.f169546a);
                } catch (IterableDataEncryptor$DecryptionException e5) {
                    throw e5;
                } catch (Exception e13) {
                    AbstractC12350b.m34596q("IterableDataEncryptor", "Decryption failed", e13);
                    throw new IterableDataEncryptor$DecryptionException("Failed to decrypt data", e13);
                }
            case 1:
                InterfaceC20390j1 interfaceC20390j1 = (InterfaceC20390j1) this.f21771x;
                AbstractC20519r4 abstractC20519r4 = (AbstractC20519r4) this.f21772y;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C20275c5.f76146d));
                    try {
                        interfaceC20390j1.mo56235a(bufferedWriter, abstractC20519r4);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th3) {
                        try {
                            bufferedWriter.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        byteArrayOutputStream.close();
                        break;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case 2:
                InterfaceC20390j1 interfaceC20390j2 = (InterfaceC20390j1) this.f21771x;
                C20265b7 c20265b7 = (C20265b7) this.f21772y;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C20275c5.f76146d));
                    try {
                        interfaceC20390j2.mo56235a(bufferedWriter2, c20265b7);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray2;
                    } catch (Throwable th7) {
                        try {
                            bufferedWriter2.close();
                            break;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                } catch (Throwable th9) {
                    try {
                        byteArrayOutputStream2.close();
                        break;
                    } catch (Throwable th10) {
                        th9.addSuppressed(th10);
                    }
                    throw th9;
                }
            case 3:
                return C20130n0.m56031c(((C20124l0) this.f21771x).f75599w, (SentryAndroidOptions) this.f21772y);
            case 4:
                AbstractC21576f0 abstractC21576f0 = (AbstractC21576f0) this.f21771x;
                C21582i0 c21582i0 = (C21582i0) this.f21772y;
                C30207q c30207q = c21582i0.f82758a;
                String str4 = c21582i0.f82760c;
                C30211u c30211u = c21582i0.f82767j;
                boolean z13 = true;
                boolean z14 = false;
                if (abstractC21576f0 instanceof C21572d0) {
                    AbstractC18386u abstractC18386u = ((C21572d0) abstractC21576f0).f82721a;
                    EnumC18371m0 enumC18371m0M92433d = c30211u.m92433d(str4);
                    C30204n c30204nMo5520g = c21582i0.f82766i.mo5520g();
                    c30204nMo5520g.getClass();
                    AbstractC15751g.m44432L(c30204nMo5520g.f123611a, false, true, new C12764g(str4, 8));
                    if (enumC18371m0M92433d == null) {
                        z13 = false;
                    } else if (enumC18371m0M92433d == EnumC18371m0.f71516x) {
                        String str5 = c21582i0.f82770m;
                        if (abstractC18386u instanceof C18384t) {
                            String str6 = AbstractC21584j0.f82776a;
                            C18389w.m52886d().m52891e(str6, "Worker result SUCCESS for " + str5);
                            if (c30207q.m92426c()) {
                                c21582i0.m60628c();
                            } else {
                                c30211u.m92439j(EnumC18371m0.f71517y, str4);
                                C18358g c18358g = ((C18384t) abstractC18386u).f71552a;
                                AbstractC22676k.m65749i(c18358g, "getOutputData(...)");
                                AbstractC15751g.m44432L(c30211u.f123665a, false, true, new C28761b0(6, c18358g, str4));
                                c21582i0.f82764g.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                C30193c c30193c = c21582i0.f82768k;
                                for (String str7 : c30193c.m92416a(str4)) {
                                    if (c30211u.m92433d(str7) == EnumC18371m0.f71512E && ((Boolean) AbstractC15751g.m44432L(c30193c.f123588a, true, false, new C17632d(str7, 26))).booleanValue()) {
                                        C18389w.m52886d().m52891e(AbstractC21584j0.f82776a, "Setting status to enqueued for ".concat(str7));
                                        c30211u.m92439j(EnumC18371m0.f71515w, str7);
                                        c30211u.m92438i(jCurrentTimeMillis, str7);
                                    }
                                }
                            }
                        } else if (abstractC18386u instanceof C18382s) {
                            String str8 = AbstractC21584j0.f82776a;
                            C18389w.m52886d().m52891e(str8, "Worker result RETRY for " + str5);
                            c21582i0.m60627b(-256);
                        } else {
                            String str9 = AbstractC21584j0.f82776a;
                            C18389w.m52886d().m52891e(str9, "Worker result FAILURE for " + str5);
                            if (c30207q.m92426c()) {
                                c21582i0.m60628c();
                            } else {
                                c21582i0.m60629d(abstractC18386u);
                            }
                        }
                        z13 = false;
                    } else if (enumC18371m0M92433d.m52871a()) {
                        z13 = false;
                    } else {
                        c21582i0.m60627b(-512);
                    }
                    z14 = z13;
                } else if (abstractC21576f0 instanceof C21570c0) {
                    c21582i0.m60629d(((C21570c0) abstractC21576f0).f82720a);
                } else {
                    if (!(abstractC21576f0 instanceof C21574e0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i15 = ((C21574e0) abstractC21576f0).f82733a;
                    if (AbstractC22676k.m65745e(c30207q.f123658y, Boolean.TRUE)) {
                        String str10 = AbstractC21584j0.f82776a;
                        C18389w.m52886d().m52888a(str10, "Worker " + c30207q.f123636c + " was interrupted. Backing off.");
                        c21582i0.m60627b(i15);
                    } else {
                        EnumC18371m0 enumC18371m0M92433d2 = c30211u.m92433d(str4);
                        if (enumC18371m0M92433d2 == null || enumC18371m0M92433d2.m52871a()) {
                            String str11 = AbstractC21584j0.f82776a;
                            C18389w.m52886d().m52888a(str11, "Status for " + str4 + " is " + enumC18371m0M92433d2 + " ; not doing any work");
                            z13 = false;
                        } else {
                            String str12 = AbstractC21584j0.f82776a;
                            C18389w.m52886d().m52888a(str12, "Status for " + str4 + " is " + enumC18371m0M92433d2 + "; not doing any work and rescheduling for later execution");
                            c30211u.m92439j(EnumC18371m0.f71515w, str4);
                            c30211u.m92440k(i15, str4);
                            c30211u.m92436g(-1L, str4);
                        }
                    }
                    z14 = z13;
                }
                return Boolean.valueOf(z14);
            default:
                Context context = (Context) this.f21771x;
                Intent intent = (Intent) this.f21772y;
                C41113q c41113qM133448u = C41113q.m133448u();
                c41113qM133448u.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) c41113qM133448u.f177222E).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (c41113qM133448u) {
                    try {
                        str = (String) c41113qM133448u.f177224x;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    c41113qM133448u.f177224x = context.getPackageName() + serviceInfo.name;
                                } else {
                                    c41113qM133448u.f177224x = serviceInfo.name;
                                }
                                str = (String) c41113qM133448u.f177224x;
                            }
                            str = null;
                        }
                    } catch (Throwable th11) {
                        throw th11;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (c41113qM133448u.m133477z(context)) {
                        componentNameStartService = AbstractC41122z.m133497d(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i13 = 404;
                    } else {
                        i13 = -1;
                    }
                } catch (IllegalStateException e14) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e14);
                    i13 = 402;
                } catch (SecurityException e15) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e15);
                    i13 = 401;
                }
                return Integer.valueOf(i13);
        }
    }
}
