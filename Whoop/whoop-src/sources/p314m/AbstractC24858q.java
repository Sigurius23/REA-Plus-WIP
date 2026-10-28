package p314m;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.profileinstaller.RunnableC1654e;
import androidx.room.ExecutorC1834u1;
import java.lang.ref.WeakReference;
import lr.RunnableC24693e;
import p002a0.C0007b;
import p002a0.C0025h;
import p029b5.C2728g;
import p073cq.ExecutorC11049r;
import p408q.AbstractC29658b;
import p408q.InterfaceC29657a;

/* JADX INFO: renamed from: m.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24858q {

    /* JADX INFO: renamed from: w */
    public static final ExecutorC1834u1 f97382w = new ExecutorC1834u1(new ExecutorC11049r(1));

    /* JADX INFO: renamed from: x */
    public static final int f97383x = -100;

    /* JADX INFO: renamed from: y */
    public static C2728g f97384y = null;

    /* JADX INFO: renamed from: z */
    public static C2728g f97385z = null;

    /* JADX INFO: renamed from: E */
    public static Boolean f97377E = null;

    /* JADX INFO: renamed from: F */
    public static boolean f97378F = false;

    /* JADX INFO: renamed from: G */
    public static final C0025h f97379G = new C0025h(0);

    /* JADX INFO: renamed from: H */
    public static final Object f97380H = new Object();

    /* JADX INFO: renamed from: I */
    public static final Object f97381I = new Object();

    /* JADX INFO: renamed from: c */
    public static void m72879c() {
        C2728g c2728g;
        C0025h c0025h = f97379G;
        c0025h.getClass();
        C0007b c0007b = new C0007b(c0025h);
        while (c0007b.hasNext()) {
            AbstractC24858q abstractC24858q = (AbstractC24858q) ((WeakReference) c0007b.next()).get();
            if (abstractC24858q != null) {
                LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) abstractC24858q;
                Context context = layoutInflaterFactory2C24829a0.f97209K;
                if (m72882h(context) && (c2728g = f97384y) != null && !c2728g.equals(f97385z)) {
                    f97382w.execute(new RunnableC24693e(context, 1));
                }
                layoutInflaterFactory2C24829a0.m72806s(true, true);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static C2728g m72880d() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM72881e = m72881e();
            if (objM72881e != null) {
                return C2728g.m7699f(AbstractC24857p.m72877a(objM72881e));
            }
        } else {
            C2728g c2728g = f97384y;
            if (c2728g != null) {
                return c2728g;
            }
        }
        return C2728g.f10738b;
    }

    /* JADX INFO: renamed from: e */
    public static Object m72881e() {
        Context context;
        C0025h c0025h = f97379G;
        c0025h.getClass();
        C0007b c0007b = new C0007b(c0025h);
        while (c0007b.hasNext()) {
            AbstractC24858q abstractC24858q = (AbstractC24858q) ((WeakReference) c0007b.next()).get();
            if (abstractC24858q != null && (context = ((LayoutInflaterFactory2C24829a0) abstractC24858q).f97209K) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m72882h(Context context) {
        if (f97377E == null) {
            try {
                int i13 = AppLocalesMetadataHolderService.f4218w;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AbstractC24841g0.m72842a() | 128).metaData;
                if (bundle != null) {
                    f97377E = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f97377E = Boolean.FALSE;
            }
        }
        return f97377E.booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static void m72883k(LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0) {
        synchronized (f97380H) {
            try {
                C0025h c0025h = f97379G;
                c0025h.getClass();
                C0007b c0007b = new C0007b(c0025h);
                while (c0007b.hasNext()) {
                    AbstractC24858q abstractC24858q = (AbstractC24858q) ((WeakReference) c0007b.next()).get();
                    if (abstractC24858q == layoutInflaterFactory2C24829a0 || abstractC24858q == null) {
                        c0007b.remove();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m72884r(Context context) {
        if (m72882h(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f97378F) {
                    return;
                }
                f97382w.execute(new RunnableC1654e(context, 2));
                return;
            }
            synchronized (f97381I) {
                try {
                    C2728g c2728g = f97384y;
                    if (c2728g == null) {
                        if (f97385z == null) {
                            f97385z = C2728g.m7698a(AppLocalesStorageHelper.readLocales(context));
                        }
                        if (f97385z.m7701c()) {
                        } else {
                            f97384y = f97385z;
                        }
                    } else if (!c2728g.equals(f97385z)) {
                        C2728g c2728g2 = f97384y;
                        f97385z = c2728g2;
                        AppLocalesStorageHelper.persistLocales(context, c2728g2.m7703e());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo72796f();

    /* JADX INFO: renamed from: g */
    public abstract void mo72797g();

    /* JADX INFO: renamed from: i */
    public abstract void mo72798i();

    /* JADX INFO: renamed from: j */
    public abstract void mo72799j();

    /* JADX INFO: renamed from: l */
    public abstract boolean mo72800l(int i13);

    /* JADX INFO: renamed from: m */
    public abstract void mo72801m(int i13);

    /* JADX INFO: renamed from: n */
    public abstract void mo72802n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo72803o(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: p */
    public abstract void mo72804p(CharSequence charSequence);

    /* JADX INFO: renamed from: q */
    public abstract AbstractC29658b mo72805q(InterfaceC29657a interfaceC29657a);
}
