package p184h5;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.datastore.preferences.protobuf.AbstractC1230l;
import io.sentry.internal.debugmeta.C20378c;
import java.util.Objects;
import java.util.WeakHashMap;
import p032bc.C2967p;
import p543v4.C35643b;

/* JADX INFO: renamed from: h5.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnApplyWindowInsetsListenerC16924x0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final AbstractC1230l f64890a;

    /* JADX INFO: renamed from: b */
    public C16905q1 f64891b;

    public ViewOnApplyWindowInsetsListenerC16924x0(View view, AbstractC1230l abstractC1230l) {
        C16905q1 c16905q1Mo47495b;
        this.f64890a = abstractC1230l;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        C16905q1 c16905q1M47522a = AbstractC16880i0.m47522a(view);
        if (c16905q1M47522a != null) {
            int i13 = Build.VERSION.SDK_INT;
            c16905q1Mo47495b = (i13 >= 30 ? new C16875g1(c16905q1M47522a) : i13 >= 29 ? new C16872f1(c16905q1M47522a) : new C16869e1(c16905q1M47522a)).mo47495b();
        } else {
            c16905q1Mo47495b = null;
        }
        this.f64891b = c16905q1Mo47495b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f64891b = C16905q1.m47596h(view, windowInsets);
            return C16926y0.m47619i(view, windowInsets);
        }
        C16905q1 c16905q1M47596h = C16905q1.m47596h(view, windowInsets);
        C16899o1 c16899o1 = c16905q1M47596h.f64864a;
        if (this.f64891b == null) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            this.f64891b = AbstractC16880i0.m47522a(view);
        }
        if (this.f64891b == null) {
            this.f64891b = c16905q1M47596h;
            return C16926y0.m47619i(view, windowInsets);
        }
        AbstractC1230l abstractC1230lM47620j = C16926y0.m47620j(view);
        if (abstractC1230lM47620j != null && Objects.equals((WindowInsets) abstractC1230lM47620j.f5423y, windowInsets)) {
            return C16926y0.m47619i(view, windowInsets);
        }
        C16905q1 c16905q1 = this.f64891b;
        int i13 = 0;
        for (int i14 = 1; i14 <= 256; i14 <<= 1) {
            if (!c16899o1.mo47530g(i14).equals(c16905q1.f64864a.mo47530g(i14))) {
                i13 |= i14;
            }
        }
        if (i13 == 0) {
            return C16926y0.m47619i(view, windowInsets);
        }
        C16905q1 c16905q2 = this.f64891b;
        C16866d1 c16866d1 = new C16866d1(i13, (i13 & 8) != 0 ? c16899o1.mo47530g(8).f151452d > c16905q2.f64864a.mo47530g(8).f151452d ? C16926y0.f64894e : C16926y0.f64895f : C16926y0.f64896g, 160L);
        c16866d1.f64800a.mo47491d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c16866d1.f64800a.mo47488a());
        C35643b c35643bMo47530g = c16899o1.mo47530g(i13);
        C35643b c35643bMo47530g2 = c16905q2.f64864a.mo47530g(i13);
        int iMin = Math.min(c35643bMo47530g.f151449a, c35643bMo47530g2.f151449a);
        int i15 = c35643bMo47530g.f151450b;
        int i16 = c35643bMo47530g2.f151450b;
        int iMin2 = Math.min(i15, i16);
        int i17 = c35643bMo47530g.f151451c;
        int i18 = c35643bMo47530g2.f151451c;
        int iMin3 = Math.min(i17, i18);
        int i19 = c35643bMo47530g.f151452d;
        int i24 = i13;
        int i25 = c35643bMo47530g2.f151452d;
        C20378c c20378c = new C20378c(17, C35643b.m112840b(iMin, iMin2, iMin3, Math.min(i19, i25)), C35643b.m112840b(Math.max(c35643bMo47530g.f151449a, c35643bMo47530g2.f151449a), Math.max(i15, i16), Math.max(i17, i18), Math.max(i19, i25)));
        C16926y0.m47616f(view, c16866d1, windowInsets, false);
        duration.addUpdateListener(new C16919v0(c16866d1, c16905q1M47596h, c16905q2, i24, view));
        duration.addListener(new C2967p(view, 2, c16866d1));
        ViewTreeObserverOnPreDrawListenerC16921w.m47614a(view, new RunnableC16922w0(view, c16866d1, c20378c, duration));
        this.f64891b = c16905q1M47596h;
        return C16926y0.m47619i(view, windowInsets);
    }
}
