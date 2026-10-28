package io.sentry.android.core;

import aa3.C0656u0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import bd3.C3130k;
import bd3.C3142u;
import io.sentry.AbstractC20445o4;
import io.sentry.C20321e5;
import io.sentry.C20323e7;
import io.sentry.C20337g0;
import io.sentry.C20457p3;
import io.sentry.C20510q3;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20258b0;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.anr.AbstractC20055c;
import io.sentry.android.core.anr.AbstractC20057e;
import io.sentry.android.core.anr.C20053a;
import io.sentry.android.core.anr.C20056d;
import io.sentry.android.core.internal.util.C20105f;
import io.sentry.cache.AbstractC20278a;
import io.sentry.cache.C20283f;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.InterfaceC20354a;
import io.sentry.hints.InterfaceC20355b;
import io.sentry.protocol.C20466a;
import io.sentry.protocol.C20469b0;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20471c0;
import io.sentry.protocol.C20472d;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20476f;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20490n;
import io.sentry.protocol.C20492p;
import io.sentry.protocol.C20496q;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.C20500u;
import io.sentry.protocol.C20501v;
import io.sentry.protocol.C20505z;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.profiling.C20493a;
import io.sentry.util.AbstractC20589k;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC11266d;
import p014aj.C0928c;
import p014aj.C0929d;
import p085d9.C11803t;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: io.sentry.android.core.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20077g0 implements InterfaceC20258b0 {

    /* JADX INFO: renamed from: E */
    public final C20283f f75401E;

    /* JADX INFO: renamed from: F */
    public final List f75402F = Collections.singletonList(new C20074f0(this));

    /* JADX INFO: renamed from: w */
    public final Context f75403w;

    /* JADX INFO: renamed from: x */
    public final SentryAndroidOptions f75404x;

    /* JADX INFO: renamed from: y */
    public final C20121k0 f75405y;

    /* JADX INFO: renamed from: z */
    public final C0928c f75406z;

    public C20077g0(Context context, C20121k0 c20121k0, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.f75403w = applicationContext != null ? applicationContext : context;
        this.f75404x = sentryAndroidOptions;
        this.f75405y = c20121k0;
        this.f75401E = sentryAndroidOptions.findPersistingScopeObserver();
        this.f75406z = new C0928c(new C0929d(sentryAndroidOptions), 15);
    }

    /* JADX INFO: renamed from: a */
    public final Object m55946a(C20513q6 c20513q6, String str, Class cls) {
        C20283f c20283f = this.f75401E;
        if (c20283f == null) {
            return null;
        }
        return c20283f.m56266d(c20513q6, str, cls);
    }

    /* JADX WARN: Code duplicated, block: B:190:0x0440  */
    /* JADX WARN: Code duplicated, block: B:343:0x0726  */
    /* JADX WARN: Code duplicated, block: B:347:0x073f  */
    /* JADX WARN: Code duplicated, block: B:366:0x0828  */
    /* JADX WARN: Code duplicated, block: B:370:0x082f  */
    /* JADX WARN: Code duplicated, block: B:405:0x08a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:406:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:409:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:413:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:416:0x08cd  */
    /* JADX WARN: Instruction removed from duplicated block: B:370:0x082f, please report this as an issue */
    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: h */
    public final C20321e5 mo55901h(C20321e5 c20321e5, C20337g0 c20337g0) {
        C20074f0 c20074f0;
        Context context;
        String str;
        C20074f0 c20074f1;
        String str2;
        File[] fileArr;
        String strM56061a;
        ArrayList arrayList;
        boolean z4;
        C20466a c20466aMo56538d;
        List listAsList;
        ArrayList arrayListM56480d;
        List list;
        String str3;
        String cacheDirPath;
        long time;
        long j7;
        C11803t c11803tM55923i;
        int i13;
        int i14;
        String str4;
        DisplayMetrics displayMetrics;
        String strM56061a2;
        C20471c0 c20471c0;
        ArrayList arrayList2;
        Object objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
        boolean z13 = objM56491b instanceof InterfaceC20355b;
        SentryAndroidOptions sentryAndroidOptions = this.f75404x;
        if (!z13) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return c20321e5;
        }
        InterfaceC20355b interfaceC20355b = (InterfaceC20355b) objM56491b;
        Iterator it = this.f75402F.iterator();
        do {
            if (!it.hasNext()) {
                c20074f0 = null;
                break;
            }
            c20074f0 = (C20074f0) it.next();
            c20074f0.getClass();
        } while (!(objM56491b instanceof InterfaceC20354a));
        if (c20074f0 != null) {
            boolean zEquals = interfaceC20355b instanceof InterfaceC20354a ? "anr_background".equals(((InterfaceC20354a) interfaceC20355b).mo56083d()) : false;
            C20077g0 c20077g0 = c20074f0.f75399a;
            if (c20321e5.f76875H == null) {
                c20321e5.f76875H = "java";
            }
            if (c20321e5.m56480d() == null) {
                C20490n c20490n = new C20490n();
                if (interfaceC20355b.mo56062a()) {
                    c20490n.f76740w = "AppExitInfo";
                } else {
                    c20490n.f76740w = "HistoricalAppExitInfo";
                }
                ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(zEquals ? "Background ANR" : "ANR", Thread.currentThread());
                ArrayList arrayListM56481e = c20321e5.m56481e();
                if (arrayListM56481e == null) {
                    c20471c0 = null;
                    break;
                }
                Iterator it3 = arrayListM56481e.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        c20471c0 = null;
                        break;
                    }
                    c20471c0 = (C20471c0) it3.next();
                    String str5 = c20471c0.f76629y;
                    if (str5 != null && str5.equals("main")) {
                        break;
                    }
                }
                if (c20471c0 == null) {
                    c20471c0 = new C20471c0();
                    c20471c0.f76624I = new C20469b0();
                }
                c20077g0.f75406z.getClass();
                C20469b0 c20469b0 = c20471c0.f76624I;
                if (c20469b0 == null) {
                    arrayList2 = new ArrayList(0);
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(C0928c.m2290J(applicationNotResponding, c20490n, c20471c0.f76627w, c20469b0.f76614w, true));
                    arrayList2 = arrayList3;
                }
                c20321e5.f76304T = new C0656u0(arrayList2);
            }
        }
        C20470c c20470c = c20321e5.f76884x;
        C20492p c20492pMo56541g = c20470c.mo56541g();
        Context context2 = this.f75403w;
        c20470c.mo56552r(C20130n0.m56031c(context2, sentryAndroidOptions).f75623g);
        if (c20492pMo56541g != null) {
            String str6 = c20492pMo56541g.f76751w;
            c20470c.mo56545k(c20492pMo56541g, (str6 == null || str6.isEmpty()) ? "os_1" : "os_" + str6.trim().toLowerCase(Locale.ROOT));
        }
        C20476f c20476fMo56539e = c20470c.mo56539e();
        C20121k0 c20121k0 = this.f75405y;
        if (c20476fMo56539e == null) {
            C20476f c20476f = new C20476f();
            c20476f.f76675x = Build.MANUFACTURER;
            c20476f.f76676y = Build.BRAND;
            c20476f.f76677z = AbstractC20118j0.m56009c(sentryAndroidOptions.getLogger());
            c20476f.f76643E = Build.MODEL;
            c20476f.f76644F = Build.ID;
            c20476f.f76645G = Build.SUPPORTED_ABIS;
            ActivityManager.MemoryInfo memoryInfoM56010d = AbstractC20118j0.m56010d(context2, sentryAndroidOptions.getLogger());
            context = context2;
            if (memoryInfoM56010d != null) {
                c20476f.f76651M = Long.valueOf(memoryInfoM56010d.totalMem);
            }
            c20476f.f76650L = c20121k0.m56021a();
            InterfaceC20602v0 logger = sentryAndroidOptions.getLogger();
            try {
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th3) {
                logger.mo16060j(EnumC20436n5.ERROR, "Error getting DisplayMetrics.", th3);
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                c20476f.f76659U = Integer.valueOf(displayMetrics.widthPixels);
                c20476f.f76660V = Integer.valueOf(displayMetrics.heightPixels);
                c20476f.f76661W = Float.valueOf(displayMetrics.density);
                c20476f.f76662X = Integer.valueOf(displayMetrics.densityDpi);
            }
            if (c20476f.f76665a0 == null) {
                try {
                    strM56061a2 = AbstractC20157t0.m56061a(context);
                } catch (Throwable th4) {
                    sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting installationId.", th4);
                    strM56061a2 = null;
                }
                c20476f.f76665a0 = strM56061a2;
            }
            ArrayList arrayListM55999a = C20105f.f75530c.m55999a();
            if (!arrayListM55999a.isEmpty()) {
                c20476f.f76670f0 = Double.valueOf(((Integer) Collections.max(arrayListM55999a)).doubleValue());
                c20476f.f76669e0 = Integer.valueOf(arrayListM55999a.size());
            }
            c20470c.mo56549o(c20476f);
        } else {
            context = context2;
        }
        if (!interfaceC20355b.mo56062a()) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return c20321e5;
        }
        if (c20321e5.f76886z == null) {
            c20321e5.f76886z = (C20496q) m55946a(sentryAndroidOptions, "request.json", C20496q.class);
        }
        if (c20321e5.f76876I == null) {
            c20321e5.f76876I = (C20481h0) m55946a(sentryAndroidOptions, "user.json", C20481h0.class);
        }
        Map map = (Map) m55946a(sentryAndroidOptions, "tags.json", Map.class);
        if (map != null) {
            if (c20321e5.f76872E == null) {
                c20321e5.m56672c(new HashMap(map));
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    if (!c20321e5.f76872E.containsKey(entry.getKey())) {
                        c20321e5.m56671b((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        List list2 = (List) m55946a(sentryAndroidOptions, "breadcrumbs.json", List.class);
        if (list2 != null) {
            List list3 = c20321e5.f76880M;
            if (list3 == null) {
                c20321e5.f76880M = new ArrayList(list2);
            } else {
                list3.addAll(list2);
            }
        }
        Map map2 = (Map) m55946a(sentryAndroidOptions, "extras.json", Map.class);
        if (map2 != null) {
            if (c20321e5.f76882O == null) {
                c20321e5.f76882O = new HashMap(new HashMap(map2));
            } else {
                Iterator it4 = map2.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    Iterator it5 = it4;
                    if (!c20321e5.f76882O.containsKey(entry2.getKey())) {
                        c20321e5.f76882O.put((String) entry2.getKey(), entry2.getValue());
                    }
                    it4 = it5;
                }
            }
        }
        C20470c c20470c2 = (C20470c) m55946a(sentryAndroidOptions, "contexts.json", C20470c.class);
        if (c20470c2 != null) {
            Iterator it6 = new C20470c(c20470c2).f76618w.entrySet().iterator();
            while (it6.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it6.next();
                Object value = entry3.getValue();
                Iterator it7 = it6;
                if ((!"trace".equals(entry3.getKey()) || !(value instanceof C20323e7)) && !c20470c.mo56535a(entry3.getKey())) {
                    c20470c.mo56545k(value, (String) entry3.getKey());
                }
                it6 = it7;
            }
        }
        String str7 = (String) m55946a(sentryAndroidOptions, "transaction.json", String.class);
        if (c20321e5.f76306V == null) {
            c20321e5.f76306V = str7;
        }
        List list4 = (List) m55946a(sentryAndroidOptions, "fingerprint.json", List.class);
        if (c20321e5.f76307W == null) {
            c20321e5.f76307W = list4 != null ? new ArrayList(list4) : null;
        }
        EnumC20436n5 enumC20436n5 = (EnumC20436n5) m55946a(sentryAndroidOptions, "level.json", EnumC20436n5.class);
        if (c20321e5.f76305U == null) {
            c20321e5.f76305U = enumC20436n5;
        }
        C20323e7 c20323e7 = (C20323e7) m55946a(sentryAndroidOptions, "trace.json", C20323e7.class);
        if (c20470c.mo56543i() == null && c20323e7 != null) {
            c20470c.mo56556v(c20323e7);
        }
        String str8 = (String) m55946a(sentryAndroidOptions, "replay.json", String.class);
        String cacheDirPath2 = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath2 == null) {
            str2 = "anr_background";
            c20074f1 = c20074f0;
            str = "ANR";
        } else {
            str = "ANR";
            c20074f1 = c20074f0;
            str2 = "anr_background";
            if (!new File(cacheDirPath2, AbstractC11266d.m30461o("replay_", str8)).exists()) {
                String str9 = (String) AbstractC20278a.m56253c(sentryAndroidOptions, ".options-cache", "replay-error-sample-rate.json", String.class);
                if (str9 != null) {
                    try {
                        if (Double.parseDouble(str9) < AbstractC20589k.m56722a().m56721c()) {
                            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", c20321e5.f76883w);
                        } else {
                            File[] fileArrListFiles = new File(cacheDirPath2).listFiles();
                            if (fileArrListFiles != null) {
                                int length = fileArrListFiles.length;
                                long jLastModified = Long.MIN_VALUE;
                                String strSubstring = null;
                                int i15 = 0;
                                while (i15 < length) {
                                    File file = fileArrListFiles[i15];
                                    if (file.isDirectory()) {
                                        fileArr = fileArrListFiles;
                                        if (file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= ((Date) c20321e5.f76300P.clone()).getTime()) {
                                            jLastModified = file.lastModified();
                                            strSubstring = file.getName().substring(7);
                                        }
                                    } else {
                                        fileArr = fileArrListFiles;
                                    }
                                    i15++;
                                    fileArrListFiles = fileArr;
                                }
                                str8 = strSubstring;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                Charset charset = C20283f.f76164c;
                                AbstractC20278a.m56254d(sentryAndroidOptions, str8, ".scope-cache", "replay.json");
                                c20470c.mo56545k(str8, "replay_id");
                            }
                        }
                    } catch (Throwable th5) {
                        sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error parsing replay sample rate.", th5);
                    }
                }
            } else if (str8 != null) {
                Charset charset2 = C20283f.f76164c;
                AbstractC20278a.m56254d(sentryAndroidOptions, str8, ".scope-cache", "replay.json");
                c20470c.mo56545k(str8, "replay_id");
            }
        }
        if (c20321e5.f76873F == null) {
            c20321e5.f76873F = (String) AbstractC20278a.m56253c(sentryAndroidOptions, ".options-cache", "release.json", String.class);
        }
        if (c20321e5.f76874G == null) {
            String environment = (String) AbstractC20278a.m56253c(sentryAndroidOptions, ".options-cache", "environment.json", String.class);
            if (environment == null) {
                environment = sentryAndroidOptions.getEnvironment();
            }
            c20321e5.f76874G = environment;
        }
        if (c20321e5.f76879L == null) {
            c20321e5.f76879L = (String) AbstractC20278a.m56253c(sentryAndroidOptions, ".options-cache", "dist.json", String.class);
        }
        if (c20321e5.f76879L == null && (str4 = (String) AbstractC20278a.m56253c(sentryAndroidOptions, ".options-cache", "release.json", String.class)) != null) {
            try {
                c20321e5.f76879L = str4.substring(str4.indexOf(43) + 1);
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to parse release from scope cache: %s", str4);
            }
        }
        C20472d c20472d = c20321e5.f76881N;
        if (c20472d == null) {
            c20472d = new C20472d();
        }
        if (c20472d.f76632x == null) {
            c20472d.f76632x = new ArrayList(new ArrayList());
        }
        List list5 = c20472d.f76632x;
        if (list5 != null) {
            String str10 = (String) AbstractC20278a.m56253c(sentryAndroidOptions, ".options-cache", "proguard-uuid.json", String.class);
            if (str10 != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str10);
                list5.add(debugImage);
            }
            c20321e5.f76881N = c20472d;
        } else {
            interfaceC20355b = interfaceC20355b;
        }
        if (c20321e5.f76885y == null) {
            c20321e5.f76885y = (C20499t) AbstractC20278a.m56253c(sentryAndroidOptions, ".options-cache", "sdk-version.json", C20499t.class);
        }
        C20466a c20466aMo56538d2 = c20470c.mo56538d();
        if (c20466aMo56538d2 == null) {
            c20466aMo56538d2 = new C20466a();
        }
        C20466a c20466a = c20466aMo56538d2;
        Context context3 = context;
        c20466a.f76596E = (String) AbstractC20118j0.f75581c.m56072b(context3);
        PackageInfo packageInfoM56012f = AbstractC20118j0.m56012f(context3, c20121k0);
        if (packageInfoM56012f != null) {
            c20466a.f76606w = packageInfoM56012f.packageName;
        }
        String str11 = c20321e5.f76873F;
        if (str11 == null) {
            str11 = (String) AbstractC20278a.m56253c(sentryAndroidOptions, ".options-cache", "release.json", String.class);
        }
        if (str11 != null) {
            try {
                String strSubstring2 = str11.substring(str11.indexOf(64) + 1, str11.indexOf(43));
                String strSubstring3 = str11.substring(str11.indexOf(43) + 1);
                c20466a.f76597F = strSubstring2;
                c20466a.f76598G = strSubstring3;
            } catch (Throwable unused2) {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to parse release from scope cache: %s", str11);
            }
        }
        try {
            C3130k c3130k = C20130n0.m56031c(context3, sentryAndroidOptions).f75622f;
            if (c3130k != null) {
                c20466a.f76603L = Boolean.valueOf(c3130k.f12276b);
                String[] strArr = (String[]) c3130k.f12277c;
                if (strArr != null) {
                    c20466a.f76604M = Arrays.asList(strArr);
                }
            }
        } catch (Throwable th6) {
            sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting split apks info.", th6);
        }
        c20470c.mo56547m(c20466a);
        Map map3 = (Map) AbstractC20278a.m56253c(sentryAndroidOptions, ".options-cache", "tags.json", Map.class);
        if (map3 != null) {
            if (c20321e5.f76872E == null) {
                c20321e5.m56672c(new HashMap(map3));
            } else {
                for (Map.Entry entry4 : map3.entrySet()) {
                    if (!c20321e5.f76872E.containsKey(entry4.getKey())) {
                        c20321e5.m56671b((String) entry4.getKey(), (String) entry4.getValue());
                    }
                }
            }
        }
        C20481h0 c20481h0 = c20321e5.f76876I;
        if (c20481h0 == null) {
            c20481h0 = new C20481h0();
            c20321e5.f76876I = c20481h0;
        }
        C20481h0 c20481h1 = c20481h0;
        if (c20481h1.f76688x == null) {
            try {
                strM56061a = AbstractC20157t0.m56061a(context3);
            } catch (Throwable th7) {
                sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting installationId.", th7);
                strM56061a = null;
            }
            c20481h1.f76688x = strM56061a;
        }
        if (c20481h1.f76690z == null && sentryAndroidOptions.isSendDefaultPii()) {
            c20481h1.f76690z = "{{auto}}";
        }
        try {
            C3142u c3142u = C20130n0.m56031c(context3, sentryAndroidOptions).f75621e;
            if (c3142u != null) {
                HashMap map4 = new HashMap();
                map4.put("isSideLoaded", String.valueOf(c3142u.f12307w));
                String str12 = c3142u.f12308x;
                if (str12 != null) {
                    map4.put("installerStore", str12);
                }
                for (Map.Entry entry5 : map4.entrySet()) {
                    c20321e5.m56671b((String) entry5.getKey(), (String) entry5.getValue());
                }
            }
        } catch (Throwable th8) {
            sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting side loaded info.", th8);
        }
        if (c20074f1 != null) {
            InterfaceC20355b interfaceC20355b2 = interfaceC20355b;
            boolean z14 = interfaceC20355b2 instanceof InterfaceC20354a;
            boolean zEquals2 = z14 ? str2.equals(((InterfaceC20354a) interfaceC20355b2).mo56083d()) : false;
            C20077g0 c20077g1 = c20074f1.f75399a;
            SentryAndroidOptions sentryAndroidOptions2 = c20077g1.f75404x;
            if (!sentryAndroidOptions2.isAnrProfilingEnabled() || zEquals2 || (cacheDirPath = sentryAndroidOptions2.getCacheDirPath()) == null) {
                arrayList = null;
            } else {
                File file2 = new File(cacheDirPath);
                if (z14) {
                    Long lMo56081b = ((InterfaceC20354a) interfaceC20355b2).mo56081b();
                    try {
                        if (lMo56081b != null) {
                            time = lMo56081b.longValue();
                        } else if (((Date) c20321e5.f76300P.clone()) != null) {
                            time = ((Date) c20321e5.f76300P.clone()).getTime();
                        } else {
                            arrayList = null;
                        }
                        AbstractC20057e.m55925b(file2);
                        File file3 = new File(file2, "anr_profile_old");
                        if (file3.exists()) {
                            sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.DEBUG, "Reading ANR profile", new Object[0]);
                            C20056d c20056d = new C20056d(sentryAndroidOptions2, file3);
                            try {
                                c11803tM55923i = c20056d.m55923i();
                                try {
                                    c20056d.close();
                                    i14 = 0;
                                } catch (Throwable th9) {
                                    th = th9;
                                    try {
                                        InterfaceC20602v0 logger2 = sentryAndroidOptions2.getLogger();
                                        EnumC20436n5 enumC20436n6 = EnumC20436n5.INFO;
                                        logger2.mo16060j(enumC20436n6, "Could not retrieve ANR profile", th);
                                        if (!AbstractC20057e.m55924a(file2)) {
                                            i13 = 0;
                                            sentryAndroidOptions2.getLogger().mo16066m(enumC20436n6, "Could not delete ANR profile file", new Object[0]);
                                        }
                                        if (c11803tM55923i == null) {
                                            arrayList = null;
                                        } else {
                                            sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.INFO, "ANR profile found", new Object[i13]);
                                            if (j7 >= c11803tM55923i.f38324a) {
                                                arrayList = null;
                                                sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                            } else {
                                                arrayList = null;
                                                sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                                            }
                                        }
                                        if (c20321e5.f76307W == null) {
                                            if (sentryAndroidOptions2.isEnableAnrFingerprinting()) {
                                                listAsList = Arrays.asList("{{ default }}", zEquals2 ? "background-anr" : "foreground-anr");
                                                if (listAsList != null) {
                                                    arrayList = new ArrayList(listAsList);
                                                }
                                                c20321e5.f76307W = arrayList;
                                            } else {
                                                listAsList = Arrays.asList("{{ default }}", zEquals2 ? "background-anr" : "foreground-anr");
                                                if (listAsList != null) {
                                                    arrayList = new ArrayList(listAsList);
                                                }
                                                c20321e5.f76307W = arrayList;
                                            }
                                        }
                                        z4 = !zEquals2;
                                        c20466aMo56538d = c20470c.mo56538d();
                                        if (c20466aMo56538d == null) {
                                            c20466aMo56538d = new C20466a();
                                            c20470c.mo56547m(c20466aMo56538d);
                                        }
                                        if (c20466aMo56538d.f76602K == null) {
                                            c20466aMo56538d.f76602K = Boolean.valueOf(z4);
                                        }
                                        return c20321e5;
                                    } catch (Throwable th10) {
                                        if (!AbstractC20057e.m55924a(file2)) {
                                            sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.INFO, "Could not delete ANR profile file", new Object[0]);
                                        }
                                        throw th10;
                                    }
                                }
                            } catch (Throwable th11) {
                                try {
                                    c20056d.close();
                                    throw th11;
                                } catch (Throwable th12) {
                                    th11.addSuppressed(th12);
                                    throw th11;
                                }
                            }
                        } else {
                            i14 = 0;
                            sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.DEBUG, "No ANR profile file found", new Object[0]);
                            c11803tM55923i = null;
                        }
                        if (!AbstractC20057e.m55924a(file2)) {
                            sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.INFO, "Could not delete ANR profile file", new Object[i14]);
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        c11803tM55923i = null;
                    }
                    j7 = time;
                    i13 = 0;
                    if (c11803tM55923i == null) {
                        arrayList = null;
                    } else {
                        sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.INFO, "ANR profile found", new Object[i13]);
                        if (j7 >= c11803tM55923i.f38324a || j7 > c11803tM55923i.f38325b) {
                            arrayList = null;
                            sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                        } else {
                            C20053a c20053aM55919a = AbstractC20055c.m55919a((ArrayList) c11803tM55923i.f38326c);
                            if (c20053aM55919a == null) {
                                arrayList = null;
                            } else {
                                C20493a c20493aM108197B = AbstractC34235f.m108197B(c11803tM55923i);
                                C20457p3 c20457p3 = new C20457p3(new C20501v(), new C20501v(), null, new HashMap(0), Double.valueOf(j7 / 1000.0d), "java", c20077g1.f75404x);
                                c20457p3.f76564M = c20493aM108197B;
                                C20501v c20501v = C20501v.f76802x.equals(AbstractC20445o4.m56638b().mo56434n(c20457p3)) ? null : c20457p3.f76567x;
                                StackTraceElement[] stackTraceElementArrM55918a = c20053aM55919a.m55918a();
                                if (stackTraceElementArrM55918a.length > 0) {
                                    StackTraceElement stackTraceElement = stackTraceElementArrM55918a[0];
                                    ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
                                    applicationNotResponding2.setStackTrace(stackTraceElementArrM55918a);
                                    C20490n c20490n2 = new C20490n();
                                    c20490n2.f76740w = str;
                                    arrayList = null;
                                    ExceptionMechanismException exceptionMechanismException = new ExceptionMechanismException(c20490n2, applicationNotResponding2, null, false);
                                    C0928c c0928c = c20077g1.f75406z;
                                    c0928c.getClass();
                                    AtomicInteger atomicInteger = new AtomicInteger(-1);
                                    HashSet hashSet = new HashSet();
                                    ArrayDeque arrayDeque = new ArrayDeque();
                                    c0928c.m2296D(exceptionMechanismException, atomicInteger, hashSet, arrayDeque, null);
                                    c20321e5.f76304T = new C0656u0(new ArrayList(arrayDeque));
                                    if (c20501v != null) {
                                        c20470c.mo56545k(new C20510q3(c20501v), "profile");
                                    }
                                } else {
                                    arrayList = null;
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
            }
            if (c20321e5.f76307W == null) {
                if (sentryAndroidOptions2.isEnableAnrFingerprinting() || (arrayListM56480d = c20321e5.m56480d()) == null || arrayListM56480d.isEmpty()) {
                    listAsList = Arrays.asList("{{ default }}", zEquals2 ? "background-anr" : "foreground-anr");
                    if (listAsList != null) {
                        arrayList = new ArrayList(listAsList);
                    }
                    c20321e5.f76307W = arrayList;
                } else {
                    Iterator it8 = arrayListM56480d.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            C20469b0 c20469b1 = ((C20500u) it8.next()).f76795E;
                            if (c20469b1 != null && (list = c20469b1.f76614w) != null && !list.isEmpty()) {
                                Iterator it9 = list.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        C20505z c20505z = (C20505z) it9.next();
                                        Boolean bool = c20505z.f76830K;
                                        if ((bool != null && bool.booleanValue()) || ((str3 = c20505z.f76825F) != null && !AbstractC20055c.m55920b(str3))) {
                                            listAsList = Arrays.asList("{{ default }}", zEquals2 ? "background-anr" : "foreground-anr");
                                            if (listAsList != null) {
                                                arrayList = new ArrayList(listAsList);
                                            }
                                            c20321e5.f76307W = arrayList;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            List listAsList2 = Arrays.asList("system-frames-only-anr", zEquals2 ? "background-anr" : "foreground-anr");
                            if (listAsList2 != null) {
                                arrayList = new ArrayList(listAsList2);
                            }
                            c20321e5.f76307W = arrayList;
                        }
                    }
                }
            }
            z4 = !zEquals2;
            c20466aMo56538d = c20470c.mo56538d();
            if (c20466aMo56538d == null) {
                c20466aMo56538d = new C20466a();
                c20470c.mo56547m(c20466aMo56538d);
            }
            if (c20466aMo56538d.f76602K == null) {
                c20466aMo56538d.f76602K = Boolean.valueOf(z4);
            }
        }
        return c20321e5;
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: i */
    public final C20473d0 mo55902i(C20473d0 c20473d0, C20337g0 c20337g0) {
        return c20473d0;
    }
}
