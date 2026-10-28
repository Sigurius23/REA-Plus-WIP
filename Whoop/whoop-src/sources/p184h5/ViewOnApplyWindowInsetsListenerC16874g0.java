package p184h5;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: h5.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC16874g0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public C16905q1 f64818a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f64819b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC16915u f64820c;

    public ViewOnApplyWindowInsetsListenerC16874g0(View view, InterfaceC16915u interfaceC16915u) {
        this.f64819b = view;
        this.f64820c = interfaceC16915u;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C16905q1 c16905q1M47596h = C16905q1.m47596h(view, windowInsets);
        int i13 = Build.VERSION.SDK_INT;
        InterfaceC16915u interfaceC16915u = this.f64820c;
        if (i13 < 30) {
            AbstractC16877h0.m47506a(windowInsets, this.f64819b);
            if (c16905q1M47596h.equals(this.f64818a)) {
                return interfaceC16915u.mo1682o(view, c16905q1M47596h).m47602g();
            }
        }
        this.f64818a = c16905q1M47596h;
        C16905q1 c16905q1Mo1682o = interfaceC16915u.mo1682o(view, c16905q1M47596h);
        if (i13 >= 30) {
            return c16905q1Mo1682o.m47602g();
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16871f0.m47500c(view);
        return c16905q1Mo1682o.m47602g();
    }
}
