package io.seon.androidsdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.RunnableC1605m;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.seon.androidsdk.service.o */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20684o {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f77414a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f77415b;

    /* JADX INFO: renamed from: c */
    public static Long f77416c;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f77415b = concurrentHashMap;
        f77416c = -1L;
        try {
            concurrentHashMap.put(-1L, new ArrayList());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m56848a(int i13) {
        try {
            Locale locale = Locale.ENGLISH;
            return (i13 & 255) + "." + ((i13 >> 8) & 255) + "." + ((i13 >> 16) & 255) + "." + ((i13 >> 24) & 255);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m56849b(byte[] bArr) {
        StringBuilder sb4 = new StringBuilder();
        for (byte b : bArr) {
            sb4.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: c */
    public static JSONArray m56850c(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object objM56850c : collection) {
            if (objM56850c instanceof Map) {
                objM56850c = m56851d((Map) objM56850c);
            } else if (objM56850c instanceof Collection) {
                objM56850c = m56850c((Collection) objM56850c);
            }
            jSONArray.put(objM56850c);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m56851d(Map... mapArr) {
        JSONObject jSONObject = new JSONObject();
        for (Map map : mapArr) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        try {
                            if (value instanceof Collection) {
                                value = m56850c((Collection) value);
                            } else if (value instanceof Map) {
                                value = m56851d((Map) value);
                            }
                            jSONObject.put(str, value);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public static void m56852e() {
        try {
            f77414a.decrementAndGet();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m56853f(String str, Throwable th3) {
        String str2;
        try {
            long id4 = Thread.currentThread().getId();
            ConcurrentHashMap concurrentHashMap = f77415b;
            if (concurrentHashMap.containsKey(Long.valueOf(id4))) {
                f77416c = Long.valueOf(id4);
            }
            if (!concurrentHashMap.containsKey(f77416c)) {
                f77416c = -1L;
            }
            if (th3 == null) {
                str2 = str;
            } else {
                Locale locale = Locale.ENGLISH;
                str2 = str + ": " + th3.getClass().getSimpleName() + "-" + th3.getMessage();
            }
            if (((ArrayList) concurrentHashMap.get(f77416c)).contains(str2)) {
                return;
            }
            ((ArrayList) concurrentHashMap.get(f77416c)).add(str2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m56854g(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m56855h(String str, String str2) {
        try {
            int length = str.length();
            int length2 = str2.length();
            if (length2 == 0) {
                return true;
            }
            if (length2 <= length) {
                for (int i13 = 0; i13 <= length - length2; i13++) {
                    int i14 = 0;
                    while (i14 < length2 && str.charAt(i13 + i14) == str2.charAt(i14)) {
                        i14++;
                    }
                    if (i14 == length2) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static String m56856i(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            String str2 = (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, str);
            if (str2 == null || str2.length() == 0) {
                return null;
            }
            return str2;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static ArrayList m56857j() {
        try {
            return (ArrayList) f77415b.get(-1L);
        } catch (Exception e5) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(e5.getMessage());
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static Activity m56858k() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(objInvoke);
            if (map != null) {
                for (Object obj : map.values()) {
                    Class<?> cls2 = obj.getClass();
                    Field declaredField2 = cls2.getDeclaredField("paused");
                    declaredField2.setAccessible(true);
                    if (!declaredField2.getBoolean(obj)) {
                        Field declaredField3 = cls2.getDeclaredField("activity");
                        declaredField3.setAccessible(true);
                        return (Activity) declaredField3.get(obj);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static synchronized void m56859l(Runnable runnable) {
        try {
            Looper mainLooper = Looper.getMainLooper();
            Looper looperMyLooper = Looper.myLooper();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RunnableC1605m runnableC1605m = new RunnableC1605m(runnable, countDownLatch, 23);
            if (looperMyLooper == mainLooper) {
                runnableC1605m.run();
            } else {
                if (looperMyLooper == null) {
                    Looper.prepare();
                }
                new Handler(mainLooper).post(runnableC1605m);
            }
            try {
                if (!countDownLatch.await(500, TimeUnit.MILLISECONDS)) {
                    throw new TimeoutException();
                }
            } catch (Throwable unused) {
            }
            countDownLatch.countDown();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: m */
    public static ArrayList m56860m() {
        try {
            return (ArrayList) f77415b.get(Long.valueOf(Thread.currentThread().getId()));
        } catch (Exception e5) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(e5.getMessage());
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static synchronized void m56861n() {
        try {
            if (f77414a.incrementAndGet() == 1) {
                AbstractC20674j0.m56826c();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m56862o() {
        try {
            long id4 = Thread.currentThread().getId();
            ConcurrentHashMap concurrentHashMap = f77415b;
            concurrentHashMap.remove(Long.valueOf(id4));
            concurrentHashMap.put(Long.valueOf(id4), new ArrayList());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m56863p() {
        try {
            f77415b.remove(Long.valueOf(Thread.currentThread().getId()));
        } catch (Throwable unused) {
        }
    }
}
