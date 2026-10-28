package p087db;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.material.carousel.CarouselLayoutManager;
import io.sentry.android.replay.C20203e0;
import java.lang.ref.WeakReference;
import jo.C21830s;
import jo.RunnableC21831t;
import lr.RunnableC24693e;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: db.k */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC11857k implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38686w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f38687x;

    public /* synthetic */ ViewOnLayoutChangeListenerC11857k(Object obj, int i13) {
        this.f38686w = i13;
        this.f38687x = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        int height;
        int height2;
        int height3;
        int height4;
        switch (this.f38686w) {
            case 0:
                C11882x c11882x = (C11882x) this.f38687x;
                int i25 = c11882x.f38792L;
                PopupWindow popupWindow = c11882x.f38790K;
                int i26 = i16 - i14;
                int i27 = i24 - i18;
                if ((i15 - i13 != i19 - i17 || i26 != i27) && popupWindow.isShowing()) {
                    c11882x.m31862q();
                    popupWindow.update(view, (c11882x.getWidth() - popupWindow.getWidth()) - i25, (-popupWindow.getHeight()) - i25, -1, -1);
                }
                break;
            case 1:
                C11842c0 c11842c0 = (C11842c0) this.f38687x;
                C11882x c11882x2 = (C11882x) c11842c0.f38616x;
                int width = (c11882x2.getWidth() - c11882x2.getPaddingLeft()) - c11882x2.getPaddingRight();
                int height5 = (c11882x2.getHeight() - c11882x2.getPaddingBottom()) - c11882x2.getPaddingTop();
                ViewGroup viewGroup = c11842c0.f38595c;
                int iM31784c = C11842c0.m31784c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iM31784c, C11842c0.m31784c(c11842c0.f38603k) + C11842c0.m31784c(c11842c0.f38601i));
                ViewGroup viewGroup2 = c11842c0.f38596d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z4 = width <= iMax || height5 <= (height2 * 2) + paddingBottom;
                if (c11842c0.f38613u != z4) {
                    c11842c0.f38613u = z4;
                    view.post(new RunnableC11883y(c11842c0, 1));
                }
                boolean z13 = i15 - i13 != i19 - i17;
                if (!c11842c0.f38613u && z13) {
                    view.post(new RunnableC11883y(c11842c0, 2));
                    break;
                }
                break;
            case 2:
                C20203e0 c20203e0 = (C20203e0) this.f38687x;
                int i28 = i16 - i14;
                int i29 = i24 - i18;
                if (i15 - i13 != i19 - i17 || i28 != i29) {
                    WeakReference weakReference = (WeakReference) AbstractC25265s.m74114R0(c20203e0.f75884G);
                    if (AbstractC22676k.m65745e(view, weakReference != null ? (View) weakReference.get() : null)) {
                        AbstractC22676k.m65747g(view);
                        c20203e0.m56125h(view);
                        break;
                    }
                }
                break;
            case 3:
                C21830s c21830s = (C21830s) this.f38687x;
                int i34 = c21830s.f84179N0;
                PopupWindow popupWindow2 = c21830s.f84175L0;
                int i35 = i16 - i14;
                int i36 = i24 - i18;
                if ((i15 - i13 != i19 - i17 || i35 != i36) && popupWindow2.isShowing()) {
                    c21830s.m61771p();
                    popupWindow2.update(view, (c21830s.getWidth() - popupWindow2.getWidth()) - i34, (-popupWindow2.getHeight()) - i34, -1, -1);
                }
                break;
            case 4:
                C11842c0 c11842c1 = (C11842c0) this.f38687x;
                C21830s c21830s2 = (C21830s) c11842c1.f38616x;
                int width2 = (c21830s2.getWidth() - c21830s2.getPaddingLeft()) - c21830s2.getPaddingRight();
                int height6 = (c21830s2.getHeight() - c21830s2.getPaddingBottom()) - c21830s2.getPaddingTop();
                ViewGroup viewGroup3 = c11842c1.f38595c;
                int iM31785d = C11842c0.m31785d(viewGroup3) - (viewGroup3 != null ? viewGroup3.getPaddingRight() + viewGroup3.getPaddingLeft() : 0);
                if (viewGroup3 == null) {
                    height3 = 0;
                } else {
                    height3 = viewGroup3.getHeight();
                    ViewGroup.LayoutParams layoutParams3 = viewGroup3.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        height3 += marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                    }
                }
                int paddingBottom2 = height3 - (viewGroup3 != null ? viewGroup3.getPaddingBottom() + viewGroup3.getPaddingTop() : 0);
                int iMax2 = Math.max(iM31785d, C11842c0.m31785d(c11842c1.f38603k) + C11842c0.m31785d(c11842c1.f38601i));
                ViewGroup viewGroup4 = c11842c1.f38596d;
                if (viewGroup4 == null) {
                    height4 = 0;
                } else {
                    height4 = viewGroup4.getHeight();
                    ViewGroup.LayoutParams layoutParams4 = viewGroup4.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        height4 += marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin;
                    }
                }
                boolean z14 = width2 <= iMax2 || height6 <= (height4 * 2) + paddingBottom2;
                if (c11842c1.f38613u != z14) {
                    c11842c1.f38613u = z14;
                    view.post(new RunnableC21831t(c11842c1, 1));
                }
                boolean z15 = i15 - i13 != i19 - i17;
                if (!c11842c1.f38613u && z15) {
                    view.post(new RunnableC21831t(c11842c1, 2));
                    break;
                }
                break;
            default:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f38687x;
                if (i13 != i17 || i14 != i18 || i15 != i19 || i16 != i24) {
                    view.post(new RunnableC24693e(carouselLayoutManager, 21));
                }
                break;
        }
    }
}
