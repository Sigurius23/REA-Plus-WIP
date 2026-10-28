package p044c5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import bd3.C3143v;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p002a0.C0005a0;
import p002a0.C0021f1;
import p097ds.RunnableC12316s;
import p497t7.InterfaceC33561b;
import p505ts.AbstractC34132o;
import p508ty.C34249c;
import p543v4.AbstractC35646e;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: c5.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4216h {

    /* JADX INFO: renamed from: a */
    public static final C0005a0 f17094a = new C0005a0(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f17095b;

    /* JADX INFO: renamed from: c */
    public static final Object f17096c;

    /* JADX INFO: renamed from: d */
    public static final C0021f1 f17097d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, InterfaceC33561b.INVALID_OWNERSHIP, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC4219k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f17095b = threadPoolExecutor;
        f17096c = new Object();
        f17097d = new C0021f1(0);
    }

    /* JADX INFO: renamed from: a */
    public static String m13078a(int i13, List list) {
        StringBuilder sb4 = new StringBuilder();
        for (int i14 = 0; i14 < list.size(); i14++) {
            sb4.append(((C4212d) list.get(i14)).f17084e);
            sb4.append("-");
            sb4.append(i13);
            if (i14 < list.size() - 1) {
                sb4.append(";");
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: b */
    public static C4215g m13079b(String str, Context context, List list, int i13) {
        int i14;
        Typeface typefaceMo107898n;
        C0005a0 c0005a0 = f17094a;
        Trace.beginSection(AbstractC29125c.m88517Z("getFontSync"));
        try {
            Typeface typeface = (Typeface) c0005a0.m2c(str);
            if (typeface != null) {
                C4215g c4215g = new C4215g(typeface);
                Trace.endSection();
                return c4215g;
            }
            try {
                C3143v c3143vM13075a = AbstractC4211c.m13075a(context, list);
                List list2 = (List) c3143vM13075a.f12311y;
                int i15 = c3143vM13075a.f12310x;
                if (i15 == 0) {
                    C4217i[] c4217iArr = (C4217i[]) list2.get(0);
                    if (c4217iArr == null || c4217iArr.length == 0) {
                        i14 = 1;
                    } else {
                        int length = c4217iArr.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= length) {
                                i14 = 0;
                                break;
                            }
                            int i17 = c4217iArr[i16].f17102e;
                            if (i17 != 0) {
                                if (i17 >= 0) {
                                    i14 = i17;
                                    break;
                                }
                                i14 = -3;
                                break;
                            }
                            i16++;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        i14 = -3;
                        break;
                    }
                    i14 = -2;
                }
                if (i14 != 0) {
                    C4215g c4215g2 = new C4215g(i14);
                    Trace.endSection();
                    return c4215g2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    C4217i[] c4217iArr2 = (C4217i[]) list2.get(0);
                    AbstractC34132o abstractC34132o = AbstractC35646e.f151456a;
                    Trace.beginSection(AbstractC29125c.m88517Z("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceMo107898n = AbstractC35646e.f151456a.mo107898n(context, c4217iArr2, i13);
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } else {
                    AbstractC34132o abstractC34132o2 = AbstractC35646e.f151456a;
                    Trace.beginSection(AbstractC29125c.m88517Z("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceMo107898n = AbstractC35646e.f151456a.mo107899o(context, list2, i13);
                        Trace.endSection();
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
                if (typefaceMo107898n == null) {
                    C4215g c4215g3 = new C4215g(-3);
                    Trace.endSection();
                    return c4215g3;
                }
                c0005a0.m3d(str, typefaceMo107898n);
                C4215g c4215g4 = new C4215g(typefaceMo107898n);
                Trace.endSection();
                return c4215g4;
            } catch (PackageManager.NameNotFoundException unused) {
                C4215g c4215g5 = new C4215g(-1);
                Trace.endSection();
                return c4215g5;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m13080c(Context context, List list, int i13, C20378c c20378c) {
        String strM13078a = m13078a(i13, list);
        Typeface typeface = (Typeface) f17094a.m2c(strM13078a);
        if (typeface != null) {
            ((ExecutorC4220l) c20378c.f76423y).execute(new RunnableC12316s(3, (C34249c) c20378c.f76422x, typeface));
            return typeface;
        }
        C4214f c4214f = new C4214f(c20378c, 0);
        synchronized (f17096c) {
            try {
                C0021f1 c0021f1 = f17097d;
                ArrayList arrayList = (ArrayList) c0021f1.get(strM13078a);
                if (arrayList != null) {
                    arrayList.add(c4214f);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c4214f);
                c0021f1.put(strM13078a, arrayList2);
                CallableC4213e callableC4213e = new CallableC4213e(strM13078a, context, list, i13, 1);
                ThreadPoolExecutor threadPoolExecutor = f17095b;
                C4214f c4214f2 = new C4214f(strM13078a, 1);
                Handler handler = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                RunnableC4221m runnableC4221m = new RunnableC4221m();
                runnableC4221m.f17107x = callableC4213e;
                runnableC4221m.f17108y = c4214f2;
                runnableC4221m.f17109z = handler;
                threadPoolExecutor.execute(runnableC4221m);
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static Typeface m13081d(Context context, C4212d c4212d, C20378c c20378c, int i13, int i14) {
        C34249c c34249c = (C34249c) c20378c.f76422x;
        ExecutorC4220l executorC4220l = (ExecutorC4220l) c20378c.f76423y;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{c4212d}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        String strM13078a = m13078a(i13, Collections.unmodifiableList(arrayList));
        Typeface typeface = (Typeface) f17094a.m2c(strM13078a);
        if (typeface != null) {
            executorC4220l.execute(new RunnableC12316s(3, c34249c, typeface));
            return typeface;
        }
        if (i14 == -1) {
            ArrayList arrayList2 = new ArrayList(1);
            Object obj2 = new Object[]{c4212d}[0];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
            C4215g c4215gM13079b = m13079b(strM13078a, context, Collections.unmodifiableList(arrayList2), i13);
            c20378c.m56581D(c4215gM13079b);
            return c4215gM13079b.f17092a;
        }
        try {
            try {
                try {
                    C4215g c4215g = (C4215g) f17095b.submit(new CallableC4213e(strM13078a, context, c4212d, i13, 0)).get(i14, TimeUnit.MILLISECONDS);
                    c20378c.m56581D(c4215g);
                    return c4215g.f17092a;
                } catch (InterruptedException e5) {
                    throw e5;
                }
            } catch (ExecutionException e13) {
                throw new RuntimeException(e13);
            } catch (TimeoutException unused) {
                throw new InterruptedException("timeout");
            }
        } catch (InterruptedException unused2) {
            executorC4220l.execute(new RunnableC4209a(c34249c, -3, 0));
            return null;
        }
    }
}
