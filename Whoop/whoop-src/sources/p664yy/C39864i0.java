package p664yy;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import org.json.JSONObject;
import p442qy.C30764c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;
import yv0.C39805h;

/* JADX INFO: renamed from: yy.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39864i0 {

    /* JADX INFO: renamed from: b */
    public static final C39805h f172151b = new C39805h(12);

    /* JADX INFO: renamed from: a */
    public final Object f172152a;

    public C39864i0() {
        this.f172152a = f172151b;
    }

    /* JADX INFO: renamed from: a */
    public Map m127937a(C30764c c30764c) {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("os.name", "android"), new C23465k("os.version", String.valueOf(Build.VERSION.SDK_INT)), new C23465k("bindings.version", "22.6.1"), new C23465k("lang", "Java"), new C23465k("publisher", "Stripe"), new C23465k("http.agent", ((Function1) this.f172152a).invoke("http.agent")));
        Map mapM124385o = c30764c != null ? AbstractC38963t7.m124385o("application", c30764c.m94510b()) : null;
        if (mapM124385o == null) {
            mapM124385o = C25272z.f99163w;
        }
        return AbstractC31061c.m95645u("X-Stripe-Client-User-Agent", new JSONObject(AbstractC25247g0.m73995d0(mapM73990Y, mapM124385o)).toString());
    }

    public C39864i0(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f172152a = (ConnectivityManager) systemService;
    }
}
