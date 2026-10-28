package p664yy;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: yy.e0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC39856e0 {

    /* JADX INFO: renamed from: a */
    public static final String f172127a;

    static {
        String strName = AbstractC39397a.f169546a.name();
        AbstractC22676k.m65749i(strName, "name(...)");
        f172127a = strName;
    }

    /* JADX INFO: renamed from: b */
    public static LinkedHashMap m127931b() {
        C23465k c23465k = new C23465k("lang", "kotlin");
        C23465k c23465k2 = new C23465k("bindings_version", "22.6.1");
        C23465k c23465k3 = new C23465k("os_version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        return AbstractC25247g0.m73993b0(c23465k, c23465k2, c23465k3, new C23465k("type", str + "_" + str2 + "_" + str3), new C23465k("model", str3));
    }

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap m127932a() {
        return AbstractC25247g0.m73995d0(mo127928c(), AbstractC25247g0.m73990Y(new C23465k("User-Agent", mo127929d()), new C23465k("Accept-Charset", f172127a), new C23465k("X-Stripe-User-Agent", mo127930e())));
    }

    /* JADX INFO: renamed from: c */
    public abstract Map mo127928c();

    /* JADX INFO: renamed from: d */
    public abstract String mo127929d();

    /* JADX INFO: renamed from: e */
    public abstract String mo127930e();
}
