package p027b3;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.lifecycle.C1586g1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import com.whoop.android.R;
import dc3.C11923h;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import hc3.AbstractC17182o;
import hc3.C17171d;
import java.util.LinkedHashMap;
import kc3.C22365e;
import p390p1.AbstractC28667t;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: b3.t3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2445t3 {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f9550a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC13037f2 m7429a(Context context) {
        InterfaceC13037f2 interfaceC13037f2;
        LinkedHashMap linkedHashMap = f9550a;
        synchronized (linkedHashMap) {
            try {
                Object objM36587M = linkedHashMap.get(context);
                if (objM36587M == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    C11923h c11923hM92111d = AbstractC30060g.m92111d(-1, 6, null);
                    C13084s1 c13084s1 = new C13084s1(new C1586g1(contentResolver, uriFor, new C2440s3(c11923hM92111d, Handler.createAsync(Looper.getMainLooper())), c11923hM92111d, context, null));
                    C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
                    C22365e c22365e = AbstractC3050q0.f12077a;
                    objM36587M = AbstractC13091v.m36587M(c13084s1, new C17171d(AbstractC12889b.m36254T(c3004e2M8710d, AbstractC17182o.f65999a)), C13105z1.m36630a(3, 0L), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objM36587M);
                }
                interfaceC13037f2 = (InterfaceC13037f2) objM36587M;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC13037f2;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC28667t m7430b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC28667t) {
            return (AbstractC28667t) tag;
        }
        return null;
    }
}
