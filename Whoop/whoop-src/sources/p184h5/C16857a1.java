package p184h5;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.datastore.preferences.protobuf.AbstractC1230l;
import com.mapbox.maps.C5538l;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: h5.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16857a1 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a */
    public final AbstractC1230l f64772a;

    /* JADX INFO: renamed from: b */
    public List f64773b;

    /* JADX INFO: renamed from: c */
    public ArrayList f64774c;

    /* JADX INFO: renamed from: d */
    public final HashMap f64775d;

    public C16857a1(AbstractC1230l abstractC1230l) {
        super(abstractC1230l.f5422x);
        this.f64775d = new HashMap();
        this.f64772a = abstractC1230l;
    }

    /* JADX INFO: renamed from: a */
    public final C16866d1 m47484a(WindowInsetsAnimation windowInsetsAnimation) {
        C16866d1 c16866d1 = (C16866d1) this.f64775d.get(windowInsetsAnimation);
        if (c16866d1 == null) {
            c16866d1 = new C16866d1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c16866d1.f64800a = new C16860b1(windowInsetsAnimation);
            }
            this.f64775d.put(windowInsetsAnimation, c16866d1);
        }
        return c16866d1;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f64772a.mo3872g(m47484a(windowInsetsAnimation));
        this.f64775d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        m47484a(windowInsetsAnimation);
        this.f64772a.mo3873h();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f64774c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f64774c = arrayList2;
            this.f64773b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM16705e = C5538l.m16705e(list.get(size));
            C16866d1 c16866d1M47484a = m47484a(windowInsetsAnimationM16705e);
            c16866d1M47484a.f64800a.mo47491d(windowInsetsAnimationM16705e.getFraction());
            this.f64774c.add(c16866d1M47484a);
        }
        return this.f64772a.mo3874i(C16905q1.m47596h(null, windowInsets), this.f64773b).m47602g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        return this.f64772a.mo3875j(m47484a(windowInsetsAnimation), C20378c.m56576G(bounds)).m56583F();
    }
}
