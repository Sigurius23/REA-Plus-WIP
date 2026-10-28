package b10;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import ar0.C1926a;
import c93.InterfaceC4339a;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory$ThreeDS2UiType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k83.InterfaceC22297a;
import l83.C23465k;
import l83.C23467m;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25235a0;
import m83.C25272z;
import p012ab.C0680g0;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p664yy.AbstractC39851c;
import p664yy.C39848a0;
import p664yy.C39849b;
import p664yy.C39864i0;
import p664yy.InterfaceC39847a;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.EnumC38832f8;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: b10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2222b extends AbstractC39851c {

    /* JADX INFO: renamed from: j */
    public final Set f8855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2222b(PackageManager packageManager, PackageInfo packageInfo, String str, InterfaceC22297a interfaceC22297a, InterfaceC22297a interfaceC22297a2, Set defaultProductUsageTokens) {
        super(packageManager, packageInfo, str, interfaceC22297a, interfaceC22297a2);
        AbstractC22676k.m65750j(defaultProductUsageTokens, "defaultProductUsageTokens");
        this.f8855j = defaultProductUsageTokens;
    }

    /* JADX INFO: renamed from: c */
    public static C39849b m7051c(C2222b c2222b, PaymentAnalyticsEvent event, Set productUsageTokens, String str, PaymentAnalyticsRequestFactory$ThreeDS2UiType paymentAnalyticsRequestFactory$ThreeDS2UiType, String str2, int i13) {
        String str3;
        EnumC38832f8 enumC38832f8 = EnumC38832f8.Card;
        if ((i13 & 2) != 0) {
            productUsageTokens = C25235a0.f99113w;
        }
        if ((i13 & 4) != 0) {
            str = null;
        }
        if ((i13 & 8) != 0) {
            enumC38832f8 = null;
        }
        if ((i13 & 16) != 0) {
            paymentAnalyticsRequestFactory$ThreeDS2UiType = null;
        }
        if ((i13 & 32) != 0) {
            str2 = null;
        }
        c2222b.getClass();
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(productUsageTokens, "productUsageTokens");
        LinkedHashSet linkedHashSetM34556E = AbstractC12350b.m34556E(c2222b.f8855j, productUsageTokens);
        LinkedHashSet linkedHashSet = !linkedHashSetM34556E.isEmpty() ? linkedHashSetM34556E : null;
        Map mapM95645u = linkedHashSet != null ? AbstractC31061c.m95645u("product_usage", AbstractC25265s.m74110N0(linkedHashSet, ",", null, null, null, 62)) : null;
        Map map = C25272z.f99163w;
        if (mapM95645u == null) {
            mapM95645u = map;
        }
        Map mapM95645u2 = str != null ? AbstractC31061c.m95645u("source_type", str) : null;
        if (mapM95645u2 == null) {
            mapM95645u2 = map;
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(mapM95645u, mapM95645u2);
        if (enumC38832f8 != null) {
            str3 = enumC38832f8.f167154w;
        } else {
            str3 = str == null ? "unknown" : null;
        }
        Map mapM95645u3 = str3 != null ? AbstractC31061c.m95645u("token_type", str3) : null;
        if (mapM95645u3 == null) {
            mapM95645u3 = map;
        }
        LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(linkedHashMapM73995d0, mapM95645u3);
        Map mapM95645u4 = paymentAnalyticsRequestFactory$ThreeDS2UiType != null ? AbstractC31061c.m95645u("3ds2_ui_type", paymentAnalyticsRequestFactory$ThreeDS2UiType.toString()) : null;
        if (mapM95645u4 == null) {
            mapM95645u4 = map;
        }
        LinkedHashMap linkedHashMapM73995d2 = AbstractC25247g0.m73995d0(linkedHashMapM73995d1, mapM95645u4);
        Map mapM95645u5 = str2 != null ? AbstractC31061c.m95645u("error_message", str2) : null;
        if (mapM95645u5 != null) {
            map = mapM95645u5;
        }
        return c2222b.mo7052a(event, AbstractC25247g0.m73995d0(linkedHashMapM73995d2, map));
    }

    @Override // p664yy.AbstractC39851c
    /* JADX INFO: renamed from: a */
    public final C39849b mo7052a(InterfaceC39847a event, Map additionalParams) {
        Object objM107888l;
        Map mapM73990Y;
        C25272z c25272z = C25272z.f99163w;
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(additionalParams, "additionalParams");
        Set set = this.f8855j;
        if (set.isEmpty()) {
            set = null;
        }
        Map mapM95645u = set != null ? AbstractC31061c.m95645u("product_usage", AbstractC25265s.m74110N0(set, ",", null, null, null, 62)) : null;
        if (mapM95645u == null) {
            mapM95645u = c25272z;
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(mapM95645u, additionalParams);
        C23465k c23465k = new C23465k("analytics_ua", "analytics.stripe_android-1.0");
        try {
            String str = (String) this.f172112d.get();
            AbstractC22676k.m65747g(str);
            boolean zM125930O = AbstractC39421y.m125930O(str, "uk_", false);
            objM107888l = str;
            if (zM125930O) {
                objM107888l = "[REDACTED_LIVE_KEY]";
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        boolean z4 = objM107888l instanceof C23467m;
        Object obj = objM107888l;
        if (z4) {
            obj = "pk_undefined";
        }
        Map mapM73990Y2 = AbstractC25247g0.m73990Y(c23465k, new C23465k("publishable_key", obj), new C23465k("os_name", Build.VERSION.CODENAME), new C23465k("os_release", Build.VERSION.RELEASE), new C23465k("os_version", Integer.valueOf(Build.VERSION.SDK_INT)), new C23465k("device_type", AbstractC39851c.f172107h), new C23465k("bindings_version", "22.6.1"), new C23465k("is_development", Boolean.FALSE), new C23465k("session_id", AbstractC39851c.f172106g), new C23465k("timestamp", Double.valueOf(System.currentTimeMillis() / 1000.0d)), new C23465k("locale", Locale.getDefault().toString()));
        String str2 = (String) this.f172113e.get();
        LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(mapM73990Y2, str2 == null ? c25272z : AbstractC31061c.m95645u("network_type", str2));
        String str3 = (String) this.f172114f.get();
        LinkedHashMap linkedHashMapM73995d2 = AbstractC25247g0.m73995d0(linkedHashMapM73995d1, str3 != null ? AbstractC31061c.m95645u("plugin_type", str3) : c25272z);
        PackageInfo packageInfo = this.f172110b;
        PackageManager packageManager = this.f172109a;
        if (packageManager == null || packageInfo == null) {
            mapM73990Y = c25272z;
        } else {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            CharSequence charSequenceLoadLabel = applicationInfo != null ? applicationInfo.loadLabel(packageManager) : null;
            if (charSequenceLoadLabel == null || AbstractC39414r.m125890i0(charSequenceLoadLabel)) {
                charSequenceLoadLabel = null;
            }
            if (charSequenceLoadLabel == null) {
                charSequenceLoadLabel = this.f172111c;
            }
            mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("app_name", charSequenceLoadLabel), new C23465k("app_version", Integer.valueOf(packageInfo.versionCode)));
        }
        return new C39849b(AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(linkedHashMapM73995d2, mapM73990Y), AbstractC25247g0.m73989X(new C23465k(NotificationCompat.CATEGORY_EVENT, event.mo7174b()))), linkedHashMapM73995d0), C39848a0.f172096b.m127932a());
    }

    /* JADX INFO: renamed from: b */
    public final C39849b m7053b(PaymentAnalyticsEvent paymentAnalyticsEvent, String str) {
        Object next;
        PaymentAnalyticsRequestFactory$ThreeDS2UiType.f22325y.getClass();
        Iterator it = PaymentAnalyticsRequestFactory$ThreeDS2UiType.f22324F.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((PaymentAnalyticsRequestFactory$ThreeDS2UiType) next).f22327w, str));
        PaymentAnalyticsRequestFactory$ThreeDS2UiType paymentAnalyticsRequestFactory$ThreeDS2UiType = (PaymentAnalyticsRequestFactory$ThreeDS2UiType) next;
        if (paymentAnalyticsRequestFactory$ThreeDS2UiType == null) {
            paymentAnalyticsRequestFactory$ThreeDS2UiType = PaymentAnalyticsRequestFactory$ThreeDS2UiType.None;
        }
        return m7051c(this, paymentAnalyticsEvent, null, null, paymentAnalyticsRequestFactory$ThreeDS2UiType, null, 46);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2222b(Context context, Set defaultProductUsageTokens, String publishableKey) {
        this(context, defaultProductUsageTokens, new C1926a(publishableKey, 11));
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(defaultProductUsageTokens, "defaultProductUsageTokens");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2222b(Context context, InterfaceC22297a interfaceC22297a) {
        Object objM107888l;
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        try {
            objM107888l = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        PackageInfo packageInfo = (PackageInfo) (objM107888l instanceof C23467m ? null : objM107888l);
        String packageName = context.getApplicationContext().getPackageName();
        this(packageManager, packageInfo, packageName == null ? "" : packageName, interfaceC22297a, new C0680g0(new C39864i0(context), 3), C25235a0.f99113w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2222b(Context context, Set defaultProductUsageTokens, InterfaceC4339a publishableKeyProvider) {
        Object objM107888l;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
        AbstractC22676k.m65750j(defaultProductUsageTokens, "defaultProductUsageTokens");
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        try {
            objM107888l = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        PackageInfo packageInfo = (PackageInfo) (objM107888l instanceof C23467m ? null : objM107888l);
        String packageName = context.getApplicationContext().getPackageName();
        this(packageManager, packageInfo, packageName == null ? "" : packageName, new C2219a(publishableKeyProvider, 0), new C0680g0(new C39864i0(context), 3), defaultProductUsageTokens);
    }
}
