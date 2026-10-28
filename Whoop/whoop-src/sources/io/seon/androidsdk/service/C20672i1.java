package io.seon.androidsdk.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Base64;
import io.sentry.android.core.RunnableC20151r0;
import io.sentry.hints.C20363j;
import io.seon.androidsdk.exception.BehaviouralMonitoringException;
import io.seon.androidsdk.exception.ContextIsMissingException;
import io.seon.androidsdk.exception.InternetAccessException;
import io.seon.androidsdk.exception.SeonException;
import io.seon.androidsdk.exception.SessionIsMissingException;
import java.io.ByteArrayOutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.GZIPOutputStream;
import live.hms.video.error.ErrorCodes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p037bu.C3632c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20672i1 {

    /* JADX INFO: renamed from: k */
    public static final C3632c f77334k = new C3632c(C20672i1.class.getName());

    /* JADX INFO: renamed from: l */
    public static String f77335l = null;

    /* JADX INFO: renamed from: m */
    public static SeonNT f77336m = null;

    /* JADX INFO: renamed from: a */
    public final C20661f f77337a;

    /* JADX INFO: renamed from: b */
    public volatile C20677k0 f77338b;

    /* JADX INFO: renamed from: c */
    public JSONObject f77339c = null;

    /* JADX INFO: renamed from: d */
    public ArrayList f77340d;

    /* JADX INFO: renamed from: e */
    public String f77341e;

    /* JADX INFO: renamed from: f */
    public boolean f77342f;

    /* JADX INFO: renamed from: g */
    public final C20654c1 f77343g;

    /* JADX INFO: renamed from: h */
    public final ReentrantLock f77344h;

    /* JADX INFO: renamed from: i */
    public final Condition f77345i;

    /* JADX INFO: renamed from: j */
    public boolean f77346j;

    public C20672i1(C20661f c20661f) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f77344h = reentrantLock;
        this.f77345i = reentrantLock.newCondition();
        this.f77346j = false;
        this.f77337a = c20661f;
        this.f77338b = new C20677k0(c20661f);
        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
        try {
            this.f77343g = new C20654c1(c20661f.f77293b);
        } catch (Throwable unused) {
        }
        try {
            f77336m = new SeonNT(c20661f.f77293b);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m56814c(InterfaceC20670i... interfaceC20670iArr) {
        Object objM56850c;
        JSONObject jSONObject = new JSONObject();
        for (InterfaceC20670i interfaceC20670i : interfaceC20670iArr) {
            AbstractC20664g abstractC20664g = (AbstractC20664g) interfaceC20670i;
            abstractC20664g.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map mapMo56775b = abstractC20664g.mo56775b();
            try {
                ((Map) abstractC20664g.f77302a.get(abstractC20664g.f77304c)).put("experimental", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Throwable unused) {
            }
            if (mapMo56775b != null) {
                for (Map.Entry entry : ((HashMap) mapMo56775b).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    try {
                        if (value instanceof Collection) {
                            objM56850c = AbstractC20684o.m56850c((Collection) value);
                        } else if (value instanceof Map) {
                            objM56850c = AbstractC20684o.m56851d((Map) value);
                        } else if (value != null && value.getClass().isArray() && value.getClass().getComponentType() == String.class) {
                            jSONObject.put(str, new JSONArray((Collection) Arrays.asList((String[]) value)));
                        } else {
                            m56815f(jSONObject, str, value);
                        }
                        jSONObject.put(str, objM56850c);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public static void m56815f(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj == null) {
            jSONObject.put(str, JSONObject.NULL);
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m56816g(String str) {
        int iM56769a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(str.getBytes());
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        SeonNT seonNT = f77336m;
                        if (seonNT != null) {
                            try {
                                iM56769a = seonNT.m56769a();
                            } catch (Throwable unused) {
                                iM56769a = 64;
                            }
                        } else {
                            iM56769a = 0;
                        }
                        int i13 = iM56769a + 96;
                        if (byteArray.length >= 10 && byteArray[0] == 31 && byteArray[1] == -117) {
                            byteArray[9] = (byte) (i13 & 255);
                        }
                    } catch (Throwable unused2) {
                    }
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th3) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (Exception unused3) {
            return str.getBytes();
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m56817j() {
        try {
            String[] strArrSplit = "6.8.4".split("-")[0].split("\\.");
            return String.format(Locale.US, "%s%02d%02d%02d", "02", Integer.valueOf((strArrSplit.length > 0 ? Integer.parseInt(strArrSplit[0]) : 0) % 100), Integer.valueOf((strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 0) % 100), Integer.valueOf((strArrSplit.length > 2 ? Integer.parseInt(strArrSplit[2]) : 0) % 100));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m56818a() {
        try {
            if (f77335l == null) {
                SharedPreferences sharedPreferences = this.f77337a.f77293b.getSharedPreferences("PREF_UNIQUE_ID", 0);
                String string = sharedPreferences.getString("PREF_UNIQUE_ID", null);
                f77335l = string;
                if (string == null) {
                    f77335l = UUID.randomUUID().toString();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("PREF_UNIQUE_ID", f77335l);
                    editorEdit.apply();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f77335l;
    }

    /* JADX INFO: renamed from: b */
    public final String m56819b(String str, JSONObject jSONObject) {
        String str2;
        try {
            JSONObject jSONObject2 = new JSONObject();
            this.f77337a.getClass();
            jSONObject2.put("source", "android-6.8.4");
            m56815f(jSONObject2, "request_id", str);
            m56815f(jSONObject2, "battery_total_capacity", jSONObject.get("battery_total_capacity"));
            jSONObject2.put("emulator_trigger_cause", "");
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            String strEncodeToString = Base64.encodeToString(bArr, 2);
            byte[] bArrM56816g = m56816g(jSONObject2.toString());
            C20663f1 c20663f1 = this.f77337a.f77294c;
            String str3 = new String(Base64.encode(((JNIHandler) c20663f1.f77300b).encrypt(c20663f1.f77299a, bArrM56816g, bArrM56816g.length, bArr, 1), 2));
            StringBuilder sb4 = new StringBuilder("Android;");
            C20661f c20661f = this.f77337a;
            synchronized (c20661f) {
                str2 = c20661f.f77295d;
            }
            sb4.append(str2);
            sb4.append(";");
            sb4.append(strEncodeToString);
            sb4.append(";");
            sb4.append(str3);
            return sb4.toString();
        } catch (Exception e5) {
            AbstractC20684o.m56853f("DCReq", e5);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x03bb A[Catch: SeonException -> 0x00bd, Exception -> 0x03c2, JSONException -> 0x03c5, TRY_LEAVE, TryCatch #9 {SeonException -> 0x00bd, blocks: (B:12:0x0049, B:16:0x00a9, B:25:0x00c7, B:28:0x00ce, B:30:0x00da, B:33:0x00e3, B:35:0x00f2, B:34:0x00e8, B:36:0x00fa, B:39:0x0100, B:40:0x010c, B:42:0x0113, B:43:0x011f, B:46:0x0125, B:47:0x0131, B:50:0x0138, B:51:0x0144, B:54:0x014a, B:57:0x015a, B:59:0x0164, B:61:0x0171, B:63:0x01a5, B:65:0x01a9, B:67:0x01b8, B:70:0x01c7, B:71:0x01d3, B:73:0x01d9, B:75:0x01e3, B:76:0x01e9, B:77:0x01ef, B:79:0x01f3, B:80:0x01fb, B:82:0x0201, B:84:0x020b, B:85:0x0211, B:86:0x0217, B:87:0x02a3, B:89:0x02a9, B:90:0x02b9, B:92:0x02bf, B:93:0x02cf, B:108:0x0372, B:112:0x037e, B:114:0x03bb, B:128:0x03d8, B:134:0x03e9, B:136:0x03ef, B:141:0x03fb, B:144:0x0403, B:146:0x0409, B:149:0x0414, B:151:0x042f, B:152:0x0432, B:154:0x0441, B:155:0x0444, B:170:0x0489, B:172:0x048f, B:173:0x0493, B:169:0x0484, B:174:0x04b3, B:148:0x040f, B:131:0x03e0, B:133:0x03e6, B:176:0x04b5, B:177:0x04b8, B:111:0x037b), top: B:198:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x03ef A[Catch: SeonException -> 0x00bd, Exception -> 0x03c2, JSONException -> 0x03c5, TRY_LEAVE, TryCatch #9 {SeonException -> 0x00bd, blocks: (B:12:0x0049, B:16:0x00a9, B:25:0x00c7, B:28:0x00ce, B:30:0x00da, B:33:0x00e3, B:35:0x00f2, B:34:0x00e8, B:36:0x00fa, B:39:0x0100, B:40:0x010c, B:42:0x0113, B:43:0x011f, B:46:0x0125, B:47:0x0131, B:50:0x0138, B:51:0x0144, B:54:0x014a, B:57:0x015a, B:59:0x0164, B:61:0x0171, B:63:0x01a5, B:65:0x01a9, B:67:0x01b8, B:70:0x01c7, B:71:0x01d3, B:73:0x01d9, B:75:0x01e3, B:76:0x01e9, B:77:0x01ef, B:79:0x01f3, B:80:0x01fb, B:82:0x0201, B:84:0x020b, B:85:0x0211, B:86:0x0217, B:87:0x02a3, B:89:0x02a9, B:90:0x02b9, B:92:0x02bf, B:93:0x02cf, B:108:0x0372, B:112:0x037e, B:114:0x03bb, B:128:0x03d8, B:134:0x03e9, B:136:0x03ef, B:141:0x03fb, B:144:0x0403, B:146:0x0409, B:149:0x0414, B:151:0x042f, B:152:0x0432, B:154:0x0441, B:155:0x0444, B:170:0x0489, B:172:0x048f, B:173:0x0493, B:169:0x0484, B:174:0x04b3, B:148:0x040f, B:131:0x03e0, B:133:0x03e6, B:176:0x04b5, B:177:0x04b8, B:111:0x037b), top: B:198:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x040f A[Catch: SeonException -> 0x00bd, Exception -> 0x03c2, JSONException -> 0x03c5, TryCatch #9 {SeonException -> 0x00bd, blocks: (B:12:0x0049, B:16:0x00a9, B:25:0x00c7, B:28:0x00ce, B:30:0x00da, B:33:0x00e3, B:35:0x00f2, B:34:0x00e8, B:36:0x00fa, B:39:0x0100, B:40:0x010c, B:42:0x0113, B:43:0x011f, B:46:0x0125, B:47:0x0131, B:50:0x0138, B:51:0x0144, B:54:0x014a, B:57:0x015a, B:59:0x0164, B:61:0x0171, B:63:0x01a5, B:65:0x01a9, B:67:0x01b8, B:70:0x01c7, B:71:0x01d3, B:73:0x01d9, B:75:0x01e3, B:76:0x01e9, B:77:0x01ef, B:79:0x01f3, B:80:0x01fb, B:82:0x0201, B:84:0x020b, B:85:0x0211, B:86:0x0217, B:87:0x02a3, B:89:0x02a9, B:90:0x02b9, B:92:0x02bf, B:93:0x02cf, B:108:0x0372, B:112:0x037e, B:114:0x03bb, B:128:0x03d8, B:134:0x03e9, B:136:0x03ef, B:141:0x03fb, B:144:0x0403, B:146:0x0409, B:149:0x0414, B:151:0x042f, B:152:0x0432, B:154:0x0441, B:155:0x0444, B:170:0x0489, B:172:0x048f, B:173:0x0493, B:169:0x0484, B:174:0x04b3, B:148:0x040f, B:131:0x03e0, B:133:0x03e6, B:176:0x04b5, B:177:0x04b8, B:111:0x037b), top: B:198:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x042f A[Catch: SeonException -> 0x00bd, Exception -> 0x03c2, JSONException -> 0x03c5, TryCatch #9 {SeonException -> 0x00bd, blocks: (B:12:0x0049, B:16:0x00a9, B:25:0x00c7, B:28:0x00ce, B:30:0x00da, B:33:0x00e3, B:35:0x00f2, B:34:0x00e8, B:36:0x00fa, B:39:0x0100, B:40:0x010c, B:42:0x0113, B:43:0x011f, B:46:0x0125, B:47:0x0131, B:50:0x0138, B:51:0x0144, B:54:0x014a, B:57:0x015a, B:59:0x0164, B:61:0x0171, B:63:0x01a5, B:65:0x01a9, B:67:0x01b8, B:70:0x01c7, B:71:0x01d3, B:73:0x01d9, B:75:0x01e3, B:76:0x01e9, B:77:0x01ef, B:79:0x01f3, B:80:0x01fb, B:82:0x0201, B:84:0x020b, B:85:0x0211, B:86:0x0217, B:87:0x02a3, B:89:0x02a9, B:90:0x02b9, B:92:0x02bf, B:93:0x02cf, B:108:0x0372, B:112:0x037e, B:114:0x03bb, B:128:0x03d8, B:134:0x03e9, B:136:0x03ef, B:141:0x03fb, B:144:0x0403, B:146:0x0409, B:149:0x0414, B:151:0x042f, B:152:0x0432, B:154:0x0441, B:155:0x0444, B:170:0x0489, B:172:0x048f, B:173:0x0493, B:169:0x0484, B:174:0x04b3, B:148:0x040f, B:131:0x03e0, B:133:0x03e6, B:176:0x04b5, B:177:0x04b8, B:111:0x037b), top: B:198:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0441 A[Catch: SeonException -> 0x00bd, Exception -> 0x03c2, JSONException -> 0x03c5, TryCatch #9 {SeonException -> 0x00bd, blocks: (B:12:0x0049, B:16:0x00a9, B:25:0x00c7, B:28:0x00ce, B:30:0x00da, B:33:0x00e3, B:35:0x00f2, B:34:0x00e8, B:36:0x00fa, B:39:0x0100, B:40:0x010c, B:42:0x0113, B:43:0x011f, B:46:0x0125, B:47:0x0131, B:50:0x0138, B:51:0x0144, B:54:0x014a, B:57:0x015a, B:59:0x0164, B:61:0x0171, B:63:0x01a5, B:65:0x01a9, B:67:0x01b8, B:70:0x01c7, B:71:0x01d3, B:73:0x01d9, B:75:0x01e3, B:76:0x01e9, B:77:0x01ef, B:79:0x01f3, B:80:0x01fb, B:82:0x0201, B:84:0x020b, B:85:0x0211, B:86:0x0217, B:87:0x02a3, B:89:0x02a9, B:90:0x02b9, B:92:0x02bf, B:93:0x02cf, B:108:0x0372, B:112:0x037e, B:114:0x03bb, B:128:0x03d8, B:134:0x03e9, B:136:0x03ef, B:141:0x03fb, B:144:0x0403, B:146:0x0409, B:149:0x0414, B:151:0x042f, B:152:0x0432, B:154:0x0441, B:155:0x0444, B:170:0x0489, B:172:0x048f, B:173:0x0493, B:169:0x0484, B:174:0x04b3, B:148:0x040f, B:131:0x03e0, B:133:0x03e6, B:176:0x04b5, B:177:0x04b8, B:111:0x037b), top: B:198:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0460 A[Catch: BehaviouralMonitoringException -> 0x047b, Exception -> 0x047d, TRY_LEAVE, TryCatch #6 {Exception -> 0x047d, blocks: (B:156:0x045a, B:158:0x0460), top: B:192:0x045a }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0481  */
    /* JADX WARN: Code duplicated, block: B:172:0x048f A[Catch: SeonException -> 0x00bd, Exception -> 0x03c2, JSONException -> 0x03c5, TryCatch #9 {SeonException -> 0x00bd, blocks: (B:12:0x0049, B:16:0x00a9, B:25:0x00c7, B:28:0x00ce, B:30:0x00da, B:33:0x00e3, B:35:0x00f2, B:34:0x00e8, B:36:0x00fa, B:39:0x0100, B:40:0x010c, B:42:0x0113, B:43:0x011f, B:46:0x0125, B:47:0x0131, B:50:0x0138, B:51:0x0144, B:54:0x014a, B:57:0x015a, B:59:0x0164, B:61:0x0171, B:63:0x01a5, B:65:0x01a9, B:67:0x01b8, B:70:0x01c7, B:71:0x01d3, B:73:0x01d9, B:75:0x01e3, B:76:0x01e9, B:77:0x01ef, B:79:0x01f3, B:80:0x01fb, B:82:0x0201, B:84:0x020b, B:85:0x0211, B:86:0x0217, B:87:0x02a3, B:89:0x02a9, B:90:0x02b9, B:92:0x02bf, B:93:0x02cf, B:108:0x0372, B:112:0x037e, B:114:0x03bb, B:128:0x03d8, B:134:0x03e9, B:136:0x03ef, B:141:0x03fb, B:144:0x0403, B:146:0x0409, B:149:0x0414, B:151:0x042f, B:152:0x0432, B:154:0x0441, B:155:0x0444, B:170:0x0489, B:172:0x048f, B:173:0x0493, B:169:0x0484, B:174:0x04b3, B:148:0x040f, B:131:0x03e0, B:133:0x03e6, B:176:0x04b5, B:177:0x04b8, B:111:0x037b), top: B:198:0x0049 }] */
    /* JADX INFO: renamed from: d */
    public final void m56820d(Boolean bool) throws Throwable {
        JSONObject jSONObject;
        String string;
        String string2;
        String string3;
        Double dValueOf;
        ArrayList arrayList;
        String strM56882j;
        String str;
        Throwable th3;
        String str2;
        String str3;
        C3632c c3632c = f77334k;
        this.f77344h.lock();
        while (this.f77346j) {
            try {
                try {
                    this.f77345i.await();
                } catch (Exception unused) {
                    Thread.currentThread().interrupt();
                    this.f77344h.unlock();
                    return;
                }
            } catch (Throwable th4) {
                this.f77344h.unlock();
                throw th4;
            }
        }
        C20677k0 c20677k0 = this.f77338b;
        this.f77344h.unlock();
        m56822h();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC20684o.m56861n();
        AbstractC20684o.m56862o();
        String strM56797b = this.f77337a.m56797b();
        if (this.f77338b.f77361h.f77424f != null) {
            this.f77338b.f77361h.f77424f.getClass();
        }
        try {
            try {
                Map mapM56802e = c20677k0.f77354a.m56802e();
                Map mapM56802e2 = c20677k0.f77357d.m56802e();
                Map mapM56802e3 = c20677k0.f77358e.m56802e();
                Map mapM56802e4 = c20677k0.f77355b.m56802e();
                Map mapM56802e5 = c20677k0.f77356c.m56802e();
                Map mapM56802e6 = c20677k0.f77359f.m56802e();
                Map mapM56802e7 = c20677k0.f77360g.m56802e();
                Map mapM56802e8 = c20677k0.f77361h.m56802e();
                Map mapM56802e9 = c20677k0.m56834b().m56802e();
                Map mapM56802e10 = c20677k0.f77363j.m56802e();
                Map mapM56802e11 = c20677k0.m56835c().m56802e();
                JSONObject jSONObject2 = new JSONObject();
                String[] strArr = C20650b0.f77231m;
                for (int i13 = 0; i13 < 17; i13++) {
                    try {
                        String str4 = strArr[i13];
                        m56815f(jSONObject2, str4, mapM56802e.get(str4));
                    } catch (JSONException e5) {
                        e = e5;
                        c3632c = c3632c;
                        c3632c.m11163L(6, e);
                        this.f77339c = null;
                        AbstractC20684o.m56852e();
                    } catch (Exception e13) {
                        e = e13;
                        c3632c = c3632c;
                        c3632c.m11163L(6, e);
                        this.f77339c = null;
                        c3632c.m11163L(6, e);
                        AbstractC20684o.m56852e();
                    }
                }
                String[] strArr2 = C20682n.f77401i;
                int i14 = 0;
                while (i14 < 9) {
                    String str5 = strArr2[i14];
                    String[] strArr3 = strArr2;
                    m56815f(jSONObject2, str5, ("enabled_accessibility_apps".equals(str5) || "interfering_apps".equals(str5)) ? AbstractC20684o.m56850c((Collection) mapM56802e2.get(str5)) : mapM56802e2.get(str5));
                    i14++;
                    strArr2 = strArr3;
                }
                String[] strArr4 = C20700w.f77506h;
                for (int i15 = 0; i15 < 6; i15++) {
                    String str6 = strArr4[i15];
                    m56815f(jSONObject2, str6, mapM56802e3.get(str6));
                }
                String[] strArr5 = C20693s0.f77450j;
                for (int i16 = 0; i16 < 17; i16++) {
                    String str7 = strArr5[i16];
                    m56815f(jSONObject2, str7, mapM56802e4.get(str7));
                }
                String[] strArr6 = C20675j1.f77350f;
                for (int i17 = 0; i17 < 4; i17++) {
                    String str8 = strArr6[i17];
                    m56815f(jSONObject2, str8, mapM56802e5.get(str8));
                }
                String[] strArr7 = C20668h0.f77317j;
                for (int i18 = 0; i18 < 10; i18++) {
                    String str9 = strArr7[i18];
                    m56815f(jSONObject2, str9, mapM56802e6.get(str9));
                }
                String[] strArr8 = C20690r.f77436k;
                for (int i19 = 0; i19 < 6; i19++) {
                    String str10 = strArr8[i19];
                    m56815f(jSONObject2, str10, mapM56802e7.get(str10));
                }
                if (mapM56802e8 != null) {
                    jSONObject = new JSONObject();
                    String[] strArr9 = C20687p0.f77421p;
                    for (int i24 = 0; i24 < 8; i24++) {
                        String str11 = strArr9[i24];
                        m56815f(jSONObject, str11, mapM56802e8.get(str11));
                    }
                } else {
                    jSONObject = null;
                }
                m56815f(jSONObject2, "device_location", jSONObject);
                C20363j c20363j = this.f77338b.f77361h.f77424f;
                JSONObject jSONObject3 = new JSONObject();
                c20363j.getClass();
                jSONObject3.put("enabled", false);
                jSONObject3.put("timeout_ms", ErrorCodes.TracksErrors.cGenericTrack);
                jSONObject3.put("prefetch", true);
                jSONObject3.put("max_cache_age", 600);
                m56815f(jSONObject2, "geolocation_config", jSONObject3);
                m56815f(jSONObject2, "location_timestamp", Long.valueOf((jSONObject == null || jSONObject == JSONObject.NULL) ? -1L : ((Long) jSONObject.get("timestamp")).longValue()));
                String[] strArr10 = C20697u0.f77502f;
                for (int i25 = 0; i25 < 2; i25++) {
                    String str12 = strArr10[i25];
                    m56815f(jSONObject2, str12, mapM56802e9.get(str12));
                }
                for (String str13 : C20707z0.f77522i) {
                    Object objM56850c = mapM56802e10.get(str13);
                    if (objM56850c instanceof Collection) {
                        objM56850c = AbstractC20684o.m56850c((Collection) objM56850c);
                    }
                    m56815f(jSONObject2, str13, objM56850c);
                }
                if (C20696u.f77481j == null) {
                    C20696u.f77481j = C20696u.m56887g(C20696u.f77480i);
                }
                for (String str14 : C20696u.f77481j) {
                    Object objM56850c2 = mapM56802e11.get(str14);
                    if (objM56850c2 instanceof Collection) {
                        objM56850c2 = AbstractC20684o.m56850c((Collection) objM56850c2);
                    }
                    m56815f(jSONObject2, str14, objM56850c2);
                }
                m56815f(jSONObject2, "app_guid", m56818a());
                m56815f(jSONObject2, "build_id", Build.ID);
                m56815f(jSONObject2, "build_manufacturer", Build.MANUFACTURER);
                m56815f(jSONObject2, "build_number", Build.DISPLAY);
                m56815f(jSONObject2, "build_time", Long.valueOf(Build.TIME / 1000));
                m56815f(jSONObject2, "session_id", strM56797b);
                this.f77337a.getClass();
                m56815f(jSONObject2, "source", "android-6.8.4");
                this.f77337a.getClass();
                JSONObject jSONObjectM56814c = m56814c(c20677k0.f77354a, c20677k0.f77355b, c20677k0.f77359f, c20677k0.f77356c, c20677k0.f77357d, c20677k0.f77358e, c20677k0.f77360g, c20677k0.f77363j);
                jSONObjectM56814c.put("experimental_device_location", JSONObject.NULL);
                m56815f(jSONObject2, "experimental_fields", jSONObjectM56814c);
                HashMap map = new HashMap();
                for (AbstractC20664g abstractC20664g : c20677k0.m56833a()) {
                    for (String str15 : abstractC20664g.f77302a.keySet()) {
                        map.put(str15, abstractC20664g.f77302a.get(str15));
                    }
                }
                m56815f(jSONObject2, "performance_probes", AbstractC20684o.m56851d(map));
                C20679l0.m56836a(this.f77337a.m56796a(), jSONObject2).m56837b(new C20669h1(this, System.currentTimeMillis(), jSONObject2));
                this.f77337a.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        String string4 = UUID.randomUUID().toString();
                                        m56815f(jSONObject2, "request_id", string4);
                                        C20653c0 c20653c0 = new C20653c0(strM56797b, m56819b(string4, jSONObject2));
                                        this.f77337a.getClass();
                                        Future futureSubmit = executorServiceNewFixedThreadPool.submit(new CallableC20671i0(c20653c0, ErrorCodes.TracksErrors.cGenericTrack));
                                        this.f77337a.getClass();
                                        C20659e0 c20659e0 = (C20659e0) futureSubmit.get(ErrorCodes.TracksErrors.cGenericTrack, TimeUnit.MILLISECONDS);
                                        if (c20659e0 != null && (str3 = c20659e0.f77284a) != null) {
                                            m56815f(jSONObject2, "dynamic_evaluator_results", str3);
                                            m56815f(jSONObject2, "performance_network_call", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                                            if (c20659e0.f77284a.isEmpty()) {
                                                str2 = "DCEmptyResult";
                                                th3 = null;
                                            }
                                            executorServiceNewFixedThreadPool.shutdown();
                                            m56815f(jSONObject2, "is_emulator", Boolean.valueOf(this.f77342f));
                                            m56815f(jSONObject2, "emulator_trigger_causes", AbstractC20684o.m56850c(this.f77340d));
                                            m56815f(jSONObject2, "predicted_emulator_engine", this.f77341e);
                                            m56815f(jSONObject2, "version_code", m56817j());
                                            m56815f(jSONObject2, "performance_exec_time", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                                            if (!jSONObject2.has("media_drm_id")) {
                                                m56815f(jSONObject2, "media_drm_id", null);
                                            }
                                            string = jSONObject2.getString("device_id");
                                            string2 = jSONObject2.getString("media_drm_id");
                                            if ((string != null || string.equals("null")) && string2 != null && !string2.equals("null")) {
                                                m56815f(jSONObject2, "device_id", string2);
                                            }
                                            if (!jSONObject2.has("device_id")) {
                                                m56815f(jSONObject2, "device_id", null);
                                            }
                                            string3 = jSONObject2.getString("true_device_id_source");
                                            if (jSONObject2.has("true_device_id_source") || string3 == null || string3.isEmpty() || string3.equals("null")) {
                                                m56815f(jSONObject2, "true_device_id_source", "l0f60b08-156b-4szd-9ca0-756a7af17ba7");
                                            }
                                            m56815f(jSONObject2, "core_int", AbstractC20676k.m56831e(jSONObject2));
                                            dValueOf = Double.valueOf(c20677k0.f77355b.m56884g());
                                            arrayList = AbstractC20702x.f77515c;
                                            if (!arrayList.contains(dValueOf)) {
                                                arrayList.add(dValueOf);
                                            }
                                            c20677k0.f77355b.getClass();
                                            strM56882j = C20693s0.m56882j();
                                            if (!arrayList.contains(strM56882j)) {
                                                arrayList.add(strM56882j);
                                            }
                                            m56815f(jSONObject2, "device_hash", AbstractC20702x.m56891a(jSONObject2));
                                            m56815f(jSONObject2, "port_scan_result", AbstractC20684o.m56850c(AbstractC20674j0.m56824a()));
                                            if (bool.booleanValue()) {
                                                m56823i();
                                                str = "behaviour_results";
                                                try {
                                                    m56815f(jSONObject2, str, AbstractC20684o.m56851d(this.f77343g.m56781a()));
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    AbstractC20684o.m56853f("bhvrfp", e);
                                                }
                                            } else {
                                                str = "behaviour_results";
                                            }
                                            if (!jSONObject2.has(str)) {
                                                m56815f(jSONObject2, str, null);
                                            }
                                            m56815f(jSONObject2, "stored_errors", AbstractC20684o.m56850c(AbstractC20684o.m56860m()));
                                            AbstractC20684o.m56863p();
                                            m56815f(jSONObject2, "comm_errors", AbstractC20684o.m56850c(AbstractC20684o.m56857j()));
                                            this.f77339c = jSONObject2;
                                            AbstractC20684o.m56852e();
                                        }
                                        th3 = null;
                                        m56815f(jSONObject2, "dynamic_evaluator_results", null);
                                        str2 = "DCFailure";
                                        AbstractC20684o.m56853f(str2, th3);
                                        executorServiceNewFixedThreadPool.shutdown();
                                    } catch (Exception e15) {
                                        try {
                                            c3632c.m11164M(e15);
                                            executorServiceNewFixedThreadPool.shutdown();
                                        } catch (Throwable th5) {
                                            th = th5;
                                            executorServiceNewFixedThreadPool.shutdown();
                                            throw th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        executorServiceNewFixedThreadPool.shutdown();
                                        throw th;
                                    }
                                    string3 = jSONObject2.getString("true_device_id_source");
                                } catch (Throwable unused2) {
                                    string3 = null;
                                }
                                if (bool.booleanValue()) {
                                    m56823i();
                                    str = "behaviour_results";
                                    m56815f(jSONObject2, str, AbstractC20684o.m56851d(this.f77343g.m56781a()));
                                } else {
                                    str = "behaviour_results";
                                }
                            } catch (Exception e16) {
                                e = e16;
                                str = "behaviour_results";
                            }
                            if (!jSONObject2.has(str)) {
                                m56815f(jSONObject2, str, null);
                            }
                            m56815f(jSONObject2, "stored_errors", AbstractC20684o.m56850c(AbstractC20684o.m56860m()));
                            AbstractC20684o.m56863p();
                            m56815f(jSONObject2, "comm_errors", AbstractC20684o.m56850c(AbstractC20684o.m56857j()));
                            this.f77339c = jSONObject2;
                        } catch (BehaviouralMonitoringException e17) {
                            throw e17;
                        }
                        string2 = jSONObject2.getString("media_drm_id");
                    } catch (Throwable unused3) {
                        string2 = null;
                    }
                    string = jSONObject2.getString("device_id");
                } catch (Throwable unused4) {
                    string = null;
                }
                m56815f(jSONObject2, "is_emulator", Boolean.valueOf(this.f77342f));
                m56815f(jSONObject2, "emulator_trigger_causes", AbstractC20684o.m56850c(this.f77340d));
                m56815f(jSONObject2, "predicted_emulator_engine", this.f77341e);
                m56815f(jSONObject2, "version_code", m56817j());
                m56815f(jSONObject2, "performance_exec_time", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                if (!jSONObject2.has("media_drm_id")) {
                    m56815f(jSONObject2, "media_drm_id", null);
                }
                if (string != null) {
                    m56815f(jSONObject2, "device_id", string2);
                } else {
                    m56815f(jSONObject2, "device_id", string2);
                }
                if (!jSONObject2.has("device_id")) {
                    m56815f(jSONObject2, "device_id", null);
                }
                if (jSONObject2.has("true_device_id_source")) {
                    m56815f(jSONObject2, "true_device_id_source", "l0f60b08-156b-4szd-9ca0-756a7af17ba7");
                } else {
                    m56815f(jSONObject2, "true_device_id_source", "l0f60b08-156b-4szd-9ca0-756a7af17ba7");
                }
                m56815f(jSONObject2, "core_int", AbstractC20676k.m56831e(jSONObject2));
                dValueOf = Double.valueOf(c20677k0.f77355b.m56884g());
                arrayList = AbstractC20702x.f77515c;
                if (!arrayList.contains(dValueOf)) {
                    arrayList.add(dValueOf);
                }
                c20677k0.f77355b.getClass();
                strM56882j = C20693s0.m56882j();
                if (!arrayList.contains(strM56882j)) {
                    arrayList.add(strM56882j);
                }
                m56815f(jSONObject2, "device_hash", AbstractC20702x.m56891a(jSONObject2));
                m56815f(jSONObject2, "port_scan_result", AbstractC20684o.m56850c(AbstractC20674j0.m56824a()));
            } catch (SeonException e18) {
                throw e18;
            }
        } catch (JSONException e19) {
            e = e19;
        } catch (Exception e22) {
            e = e22;
        }
        AbstractC20684o.m56852e();
    }

    /* JADX INFO: renamed from: e */
    public final void m56821e(final String str, final InterfaceC20655d interfaceC20655d, final Boolean bool) {
        if (str == null || str.isEmpty()) {
            throw new SessionIsMissingException();
        }
        Context context = this.f77337a.f77293b;
        if (context == null) {
            throw new ContextIsMissingException();
        }
        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            throw new InternetAccessException();
        }
        final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.submit(new Runnable() { // from class: io.seon.androidsdk.service.g1
            /* JADX WARN: Code duplicated, block: B:16:0x002b A[Catch: SeonException -> 0x0020, TRY_LEAVE, TryCatch #1 {SeonException -> 0x0020, blocks: (B:3:0x0012, B:4:0x0015, B:16:0x002b, B:17:0x007d, B:19:0x0087, B:21:0x0090, B:23:0x0097, B:24:0x00a2, B:25:0x00a9, B:7:0x001a, B:13:0x0025), top: B:30:0x0012, inners: #0, #2 }] */
            /* JADX WARN: Code duplicated, block: B:19:0x0087 A[Catch: SeonException -> 0x0020, InterruptedException -> 0x0097, TryCatch #2 {InterruptedException -> 0x0097, blocks: (B:17:0x007d, B:19:0x0087, B:21:0x0090), top: B:31:0x007d, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:21:0x0090 A[Catch: SeonException -> 0x0020, InterruptedException -> 0x0097, TRY_LEAVE, TryCatch #2 {InterruptedException -> 0x0097, blocks: (B:17:0x007d, B:19:0x0087, B:21:0x0090), top: B:31:0x007d, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:24:0x00a2 A[Catch: SeonException -> 0x0020, TryCatch #1 {SeonException -> 0x0020, blocks: (B:3:0x0012, B:4:0x0015, B:16:0x002b, B:17:0x007d, B:19:0x0087, B:21:0x0090, B:23:0x0097, B:24:0x00a2, B:25:0x00a9, B:7:0x001a, B:13:0x0025), top: B:30:0x0012, inners: #0, #2 }] */
            /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:16:0x002b, please report this as an issue */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                String string;
                TimeUnit timeUnit;
                C20672i1 c20672i1 = this.f77308w;
                Boolean bool2 = bool;
                InterfaceC20655d interfaceC20655d2 = interfaceC20655d;
                String str2 = str;
                ExecutorService executorService = executorServiceNewSingleThreadExecutor;
                C3632c c3632c = C20672i1.f77334k;
                try {
                    c20672i1.m56820d(bool2);
                    try {
                        JSONObject jSONObject = c20672i1.f77339c;
                        if (jSONObject != null) {
                            string = jSONObject.toString(0);
                            if (string != null) {
                                throw new SeonException("Fingerprint could not be generated");
                            }
                            byte[] bArr = new byte[16];
                            new SecureRandom().nextBytes(bArr);
                            String strEncodeToString = Base64.encodeToString(bArr, 2);
                            byte[] bArrM56816g = C20672i1.m56816g(string);
                            C20663f1 c20663f1 = c20672i1.f77337a.f77294c;
                            interfaceC20655d2.mo56785a("Android;" + str2 + ";" + strEncodeToString + ";" + new String(Base64.encode(((JNIHandler) c20663f1.f77300b).encrypt(c20663f1.f77299a, bArrM56816g, bArrM56816g.length, bArr, 1), 2)));
                            executorService.shutdown();
                            try {
                                timeUnit = TimeUnit.SECONDS;
                                if (executorService.awaitTermination(3L, timeUnit)) {
                                }
                                executorService.shutdownNow();
                                if (executorService.awaitTermination(3L, timeUnit)) {
                                }
                                c3632c.m11157F(5, "Pool didn't terminate");
                            } catch (InterruptedException unused) {
                                executorService.shutdownNow();
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                    } catch (JSONException e5) {
                        c3632c.m11163L(6, e5);
                    }
                    string = null;
                    if (string != null) {
                        throw new SeonException("Fingerprint could not be generated");
                    }
                    byte[] bArr2 = new byte[16];
                    new SecureRandom().nextBytes(bArr2);
                    String strEncodeToString2 = Base64.encodeToString(bArr2, 2);
                    byte[] bArrM56816g2 = C20672i1.m56816g(string);
                    C20663f1 c20663f2 = c20672i1.f77337a.f77294c;
                    interfaceC20655d2.mo56785a("Android;" + str2 + ";" + strEncodeToString2 + ";" + new String(Base64.encode(((JNIHandler) c20663f2.f77300b).encrypt(c20663f2.f77299a, bArrM56816g2, bArrM56816g2.length, bArr2, 1), 2)));
                    executorService.shutdown();
                    timeUnit = TimeUnit.SECONDS;
                    if (executorService.awaitTermination(3L, timeUnit)) {
                        executorService.shutdownNow();
                        if (executorService.awaitTermination(3L, timeUnit)) {
                            c3632c.m11157F(5, "Pool didn't terminate");
                        }
                    }
                } catch (SeonException e13) {
                    c3632c.m11163L(3, e13);
                }
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m56822h() {
        ReentrantLock reentrantLock = this.f77344h;
        reentrantLock.lock();
        try {
            if (this.f77346j) {
                reentrantLock.unlock();
                return;
            }
            this.f77346j = true;
            reentrantLock.unlock();
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.submit(new RunnableC20151r0(8, this, executorServiceNewSingleThreadExecutor));
        } catch (Exception unused) {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m56823i() {
        try {
            this.f77343g.m56784d();
        } catch (BehaviouralMonitoringException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }
}
