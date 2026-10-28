package p479s4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import androidx.compose.p018ui.node.NodeCoordinator;
import b30.C2570m;
import com.amplitude.android.engagement.C4861a;
import com.squareup.wire.AbstractC5583n;
import com.squareup.wire.C5576g;
import com.squareup.wire.EnumC5593x;
import com.squareup.wire.InterfaceC5570a0;
import com.stripe.android.core.exception.APIConnectionException;
import io.getstream.video.android.core.filter.FilterObject;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import l83.C23467m;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import n23.C26200c;
import p000.AbstractC11266d;
import p005a3.AbstractC0265x0;
import p005a3.C0230n0;
import p031b9.AbstractC2875y;
import p032bc.C2953i;
import p035bp.C3512c;
import p197hj.C17338u;
import p249jc.AbstractC21598x;
import p450r5.C30929c;
import p505ts.AbstractC34132o;
import p507tx.C34231b;
import p507tx.C34237h;
import p532ur.C35175d;
import p532ur.C35178g;
import p598wy.InterfaceC37689b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import u33.EnumC34512e;
import w33.C36794c;
import w63.C36866a;
import x63.InterfaceC38034f;
import y00.AbstractC38963t7;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: s4.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32120a implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static APIConnectionException m99975a(IOException e5, String str) {
        AbstractC22676k.m65750j(e5, "e");
        String str2 = "(" + str + ")";
        if (str == null || AbstractC39414r.m125890i0(str)) {
            str2 = null;
        }
        return new APIConnectionException(AbstractC2875y.m8300m("IOException during API request to ", AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{"Stripe", str2}), " ", null, null, null, 62), ": ", e5.getMessage(), ". Please check your internet connection and try again. If this problem persists, you should check Stripe's service status at https://status.stripe.com/, or let us know at support@stripe.com."), e5);
    }

    /* JADX INFO: renamed from: b */
    public static C35175d m99976b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new C35175d(new C35178g(context));
    }

    /* JADX INFO: renamed from: c */
    public static C34237h m99977c(Class cls, String str, EnumC5593x enumC5593x, ClassLoader classLoader, int i13) throws IllegalAccessException, NoSuchFieldException {
        Object objM107888l;
        ClassLoader classLoader2 = (i13 & 8) != 0 ? cls.getClassLoader() : classLoader;
        try {
            objM107888l = Class.forName(cls.getName().concat("$Builder"));
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        Class<C5576g> cls2 = (Class) objM107888l;
        if (cls2 == null) {
            cls2 = C5576g.class;
        }
        Class<C5576g> cls3 = cls2;
        C30929c c30929c = new C30929c(8, cls3, cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Field[] declaredFields = cls.getDeclaredFields();
        AbstractC22676k.m65749i(declaredFields, "messageType.declaredFields");
        for (Field field : declaredFields) {
            InterfaceC5570a0 interfaceC5570a0 = (InterfaceC5570a0) field.getAnnotation(InterfaceC5570a0.class);
            if (interfaceC5570a0 != null) {
                linkedHashMap.put(Integer.valueOf(interfaceC5570a0.tag()), new C34231b(interfaceC5570a0, cls, field, cls3, classLoader2));
            } else if (AbstractC22676k.m65745e(field.getType(), AbstractC5583n.class)) {
                Class<?> declaringClass = field.getDeclaringClass();
                String name = field.getName();
                AbstractC22676k.m65749i(name, "messageField.name");
                String upperCase = name.concat("_keys").toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                Field declaredField = declaringClass.getDeclaredField(upperCase);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.Set<com.squareup.wire.OneOf.Key<*>>");
                Iterator it = ((Set) obj).iterator();
                if (it.hasNext()) {
                    throw AbstractC11266d.m30454h(it);
                }
            } else {
                continue;
            }
        }
        InterfaceC21461d interfaceC21461dM60666V = AbstractC21598x.m60666V(cls);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC22676k.m65749i(mapUnmodifiableMap, "unmodifiableMap(fields)");
        return new C34237h(new C2570m(interfaceC21461dM60666V, cls3, c30929c, mapUnmodifiableMap, str, enumC5593x));
    }

    /* JADX INFO: renamed from: d */
    public static C26200c m99978d(EnumC34512e enumC34512e, Throwable th3, int i13) {
        if ((i13 & 4) != 0) {
            th3 = null;
        }
        return new C26200c(enumC34512e.f145085x, enumC34512e.f145084w, -1, th3);
    }

    /* JADX INFO: renamed from: e */
    public static int m99979e(Context context, String str) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageInfo = ((Context) C3512c.m10398a(context).f3422w).getPackageManager().getPackageInfo(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC0265x0 m99980f(AbstractC0265x0 abstractC0265x0) {
        C0230n0 c0230n0 = abstractC0265x0.f904O.f4858O;
        while (true) {
            C0230n0 c0230n0M588G = c0230n0.m588G();
            C0230n0 c0230n1 = null;
            if ((c0230n0M588G != null ? c0230n0M588G.f759G : null) == null) {
                AbstractC0265x0 abstractC0265x0Mo3530e1 = ((NodeCoordinator) c0230n0.f783e0.f741e).mo3530e1();
                AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
                return abstractC0265x0Mo3530e1;
            }
            C0230n0 c0230n0M588G2 = c0230n0.m588G();
            if (c0230n0M588G2 != null) {
                c0230n1 = c0230n0M588G2.f759G;
            }
            AbstractC22676k.m65747g(c0230n1);
            C0230n0 c0230n0M588G3 = c0230n0.m588G();
            AbstractC22676k.m65747g(c0230n0M588G3);
            c0230n0 = c0230n0M588G3.f759G;
            AbstractC22676k.m65747g(c0230n0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m99981g(String str) {
        Activity activityM49083a = C17338u.f67142w.m49083a();
        if (activityM49083a == null) {
            C4861a.f20259o.m16032K("PlayStoreHandler: No current activity available for app review.");
        } else {
            C35175d c35175dM99976b = m99976b(activityM49083a);
            c35175dM99976b.m111311b().addOnCompleteListener(new C2953i(c35175dM99976b, activityM49083a, str, 16));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m99982h(Activity activity, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("market://details?id=%s", Arrays.copyOf(new Object[]{str}, 1))));
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://play.google.com/store/apps/details?id=%s", Arrays.copyOf(new Object[]{str}, 1))));
        try {
            try {
                activity.startActivity(intent);
                C4861a.f20259o.m16047a0("PlayStoreHandler: Play Store listing opened via " + intent.getData() + '.');
            } catch (ActivityNotFoundException unused) {
                C4861a.f20259o.m16032K(AbstractC31061c.m95633i('.', "PlayStoreHandler: Failed to open Play Store for package: ", str));
            }
        } catch (ActivityNotFoundException unused2) {
            activity.startActivity(intent2);
            C4861a.f20259o.m16047a0("PlayStoreHandler:Play Store listing opened via " + intent2.getData() + '.');
        }
    }

    /* JADX INFO: renamed from: i */
    public static Intent m99983i(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i13) {
        return ((i13 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i13 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, AbstractC32122c.obtainAndCheckReceiverPermission(context), handler);
    }

    /* JADX INFO: renamed from: j */
    public static final void m99984j(C36866a c36866a, InterfaceC38034f pool) {
        AbstractC22676k.m65750j(pool, "pool");
        while (c36866a != null) {
            C36866a c36866aM118244g = c36866a.m118244g();
            c36866a.m118247j(pool);
            c36866a = c36866aM118244g;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final long m99985k(C36866a c36866a) {
        long j7 = 0;
        do {
            j7 += (long) (c36866a.f77287c - c36866a.f77286b);
            c36866a = c36866a.m118245h();
        } while (c36866a != null);
        return j7;
    }

    /* JADX INFO: renamed from: l */
    public static void m99986l(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    /* JADX INFO: renamed from: n */
    public static final Map m99987n(FilterObject filterObject) {
        AbstractC22676k.m65750j(filterObject, "<this>");
        if (!(filterObject instanceof C36794c)) {
            throw new NoWhenBranchMatchedException();
        }
        C36794c c36794c = (C36794c) filterObject;
        return AbstractC38963t7.m124385o(c36794c.f157409a, AbstractC25247g0.m73989X(new C23465k("$in", c36794c.f157410b)));
    }
}
