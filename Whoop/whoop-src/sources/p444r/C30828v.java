package p444r;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.whoop.android.R;

/* JADX INFO: renamed from: r.v */
/* JADX INFO: loaded from: classes5.dex */
public class C30828v {

    /* JADX INFO: renamed from: a */
    public final Context f127122a;

    /* JADX INFO: renamed from: b */
    public final MenuC30818l f127123b;

    /* JADX INFO: renamed from: c */
    public final boolean f127124c;

    /* JADX INFO: renamed from: d */
    public final int f127125d;

    /* JADX INFO: renamed from: e */
    public View f127126e;

    /* JADX INFO: renamed from: g */
    public boolean f127128g;

    /* JADX INFO: renamed from: h */
    public InterfaceC30829w f127129h;

    /* JADX INFO: renamed from: i */
    public AbstractC30826t f127130i;

    /* JADX INFO: renamed from: j */
    public PopupWindow.OnDismissListener f127131j;

    /* JADX INFO: renamed from: f */
    public int f127127f = 8388611;

    /* JADX INFO: renamed from: k */
    public final C30827u f127132k = new C30827u(this);

    public C30828v(Context context, MenuC30818l menuC30818l, View view, boolean z4, int i13, int i14) {
        this.f127122a = context;
        this.f127123b = menuC30818l;
        this.f127126e = view;
        this.f127124c = z4;
        this.f127125d = i13;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC30826t m94834a() {
        AbstractC30826t viewOnKeyListenerC30808c0;
        if (this.f127130i == null) {
            Context context = this.f127122a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC30808c0 = new ViewOnKeyListenerC30812f(context, this.f127126e, this.f127125d, this.f127124c);
            } else {
                viewOnKeyListenerC30808c0 = new ViewOnKeyListenerC30808c0(this.f127122a, this.f127123b, this.f127126e, this.f127125d, this.f127124c);
            }
            viewOnKeyListenerC30808c0.mo94788k(this.f127123b);
            viewOnKeyListenerC30808c0.mo94793r(this.f127132k);
            viewOnKeyListenerC30808c0.mo94789n(this.f127126e);
            viewOnKeyListenerC30808c0.mo94787h(this.f127129h);
            viewOnKeyListenerC30808c0.mo94790o(this.f127128g);
            viewOnKeyListenerC30808c0.mo94791p(this.f127127f);
            this.f127130i = viewOnKeyListenerC30808c0;
        }
        return this.f127130i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94835b() {
        AbstractC30826t abstractC30826t = this.f127130i;
        return abstractC30826t != null && abstractC30826t.mo94784a();
    }

    /* JADX INFO: renamed from: c */
    public void mo94836c() {
        this.f127130i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f127131j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m94837d(int i13, int i14, boolean z4, boolean z13) {
        AbstractC30826t abstractC30826tM94834a = m94834a();
        abstractC30826tM94834a.mo94794s(z13);
        if (z4) {
            if ((Gravity.getAbsoluteGravity(this.f127127f, this.f127126e.getLayoutDirection()) & 7) == 5) {
                i13 -= this.f127126e.getWidth();
            }
            abstractC30826tM94834a.mo94792q(i13);
            abstractC30826tM94834a.mo94795t(i14);
            int i15 = (int) ((this.f127122a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC30826tM94834a.f127120w = new Rect(i13 - i15, i14 - i15, i13 + i15, i14 + i15);
        }
        abstractC30826tM94834a.mo94785c();
    }
}
