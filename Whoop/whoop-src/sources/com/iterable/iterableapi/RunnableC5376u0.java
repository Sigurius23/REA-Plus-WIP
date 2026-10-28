package com.iterable.iterableapi;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC5376u0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractActivityC1340r0 f21841w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f21842x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C5379v0 f21843y;

    public RunnableC5376u0(C5379v0 c5379v0, AbstractActivityC1340r0 abstractActivityC1340r0, float f13) {
        this.f21843y = c5379v0;
        this.f21841w = abstractActivityC1340r0;
        this.f21842x = f13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5379v0 c5379v0;
        C5379v0 c5379v1 = this.f21843y;
        try {
            if (c5379v1.getContext() != null && (c5379v0 = C5379v0.f21859N) != null && c5379v0.getDialog() != null && C5379v0.f21859N.getDialog().getWindow() != null && C5379v0.f21859N.getDialog().isShowing()) {
                this.f21841w.getResources().getDisplayMetrics();
                Window window = C5379v0.f21859N.getDialog().getWindow();
                Rect rect = C5379v0.f21859N.f21867J;
                Display defaultDisplay = ((WindowManager) c5379v1.getContext().getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                int i13 = point.x;
                int i14 = point.y;
                if (rect.bottom == 0 && rect.top == 0) {
                    window.setLayout(i13, i14);
                    c5379v1.getDialog().getWindow().setFlags(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                    return;
                }
                float f13 = this.f21842x * c5379v1.getResources().getDisplayMetrics().density;
                int i15 = c5379v1.getResources().getDisplayMetrics().widthPixels;
                int i16 = (int) f13;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i15, i16);
                int iM16530D = C5379v0.m16530D(rect);
                AbstractC12350b.m34593n("IterableInAppFragmentHTMLNotification", "Resizing WebView directly - gravity: " + iM16530D + " size: " + i15 + "x" + i16 + "px for inset padding: " + rect);
                if (iM16530D == 16) {
                    layoutParams.addRule(13);
                    AbstractC12350b.m34593n("IterableInAppFragmentHTMLNotification", "Applied CENTER_IN_PARENT to WebView");
                } else if (iM16530D == 48) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(14);
                    AbstractC12350b.m34593n("IterableInAppFragmentHTMLNotification", "Applied TOP alignment to WebView");
                } else if (iM16530D == 80) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                    AbstractC12350b.m34593n("IterableInAppFragmentHTMLNotification", "Applied BOTTOM alignment to WebView");
                }
                window.setLayout(-1, -1);
                c5379v1.f21871w.setLayoutParams(layoutParams);
                c5379v1.f21871w.requestLayout();
                if (c5379v1.f21871w.getParent() instanceof ViewGroup) {
                    ((ViewGroup) c5379v1.f21871w.getParent()).requestLayout();
                }
                AbstractC12350b.m34593n("IterableInAppFragmentHTMLNotification", "Applied explicit size and positioning to WebView: " + i15 + "x" + i16);
            }
        } catch (IllegalArgumentException e5) {
            AbstractC12350b.m34596q("IterableInAppFragmentHTMLNotification", "Exception while trying to resize an in-app message", e5);
        }
    }
}
