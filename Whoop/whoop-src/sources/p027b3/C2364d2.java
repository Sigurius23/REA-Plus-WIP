package p027b3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p018ui.platform.AndroidComposeView;
import at.C1956b;
import java.util.ArrayList;
import java.util.Collections;
import p012ab.C0667a;
import p031b9.AbstractC2875y;
import p095dp.AbstractC12240d;
import p164g2.AbstractC15235g;
import p164g2.C15232d;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.d2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2364d2 {

    /* JADX INFO: renamed from: f */
    public static final C1956b f9330f = new C1956b(3);

    /* JADX INFO: renamed from: a */
    public final Rect f9331a = new Rect();

    /* JADX INFO: renamed from: b */
    public final Rect f9332b = new Rect();

    /* JADX INFO: renamed from: c */
    public final Rect f9333c = new Rect();

    /* JADX INFO: renamed from: d */
    public final C2359c2 f9334d = new C2359c2(new C0667a(this));

    /* JADX INFO: renamed from: e */
    public final ArrayList f9335e = new ArrayList();

    /* JADX INFO: renamed from: e */
    public static void m7287e(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    /* JADX INFO: renamed from: a */
    public final View m7288a(int i13, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int iIndexOf;
        int iLastIndexOf;
        int i14;
        Rect rect2 = this.f9331a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 17 || i13 == 33) {
                    m7287e(viewGroup, rect2);
                } else if (i13 == 66 || i13 == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                m7287e(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            m7287e(viewGroup, rect2);
        }
        if (i13 != 1 && i13 != 2) {
            if (i13 == 17 || i13 == 33 || i13 == 66 || i13 == 130) {
                return m7291d(i13, rect2, view, viewGroup, arrayList);
            }
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unknown direction: "));
        }
        C2359c2 c2359c2 = this.f9334d;
        try {
            c2359c2.m7283a(arrayList, viewGroup);
            Collections.sort(arrayList, c2359c2);
            c2359c2.f9318y.m123a();
            c2359c2.f9317x.m137b();
            c2359c2.f9319z.m88a();
            c2359c2.f9316w.m123a();
            int size = arrayList.size();
            View viewM7291d = null;
            if (size < 2) {
                return null;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 17 || i13 == 33 || i13 == 66 || i13 == 130) {
                        viewM7291d = m7291d(i13, this.f9331a, view, viewGroup, arrayList);
                    }
                } else if (size >= 2) {
                    viewM7291d = (view == null || (iLastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i14 = iLastIndexOf + 1) >= size) ? (View) arrayList.get(0) : (View) arrayList.get(i14);
                }
            } else if (size >= 2) {
                viewM7291d = (view == null || (iIndexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(size - 1) : (View) arrayList.get(iIndexOf - 1);
            }
            return viewM7291d == null ? (View) arrayList.get(size - 1) : viewM7291d;
        } catch (Throwable th3) {
            c2359c2.f9318y.m123a();
            c2359c2.f9317x.m137b();
            c2359c2.f9319z.m88a();
            c2359c2.f9316w.m123a();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m7289b(int i13, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View viewM7288a = null;
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (parent instanceof ViewGroup) {
                    if (parent == viewGroup) {
                        if (viewGroup3 != null) {
                            viewGroup2 = viewGroup3;
                            break;
                        }
                        break;
                    }
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                }
                viewGroup2 = viewGroup;
                break;
            }
        }
        viewGroup2 = viewGroup;
        break;
        View viewM34074k = AbstractC12240d.m34074k(view, viewGroup2, i13);
        boolean z4 = true;
        View viewM34074k2 = viewM34074k;
        while (viewM34074k != null) {
            if (viewM34074k.isFocusable() && viewM34074k.getVisibility() == 0 && (!viewM34074k.isInTouchMode() || viewM34074k.isFocusableInTouchMode())) {
                viewM7288a = viewM34074k;
                break;
            }
            viewM34074k = AbstractC12240d.m34074k(viewM34074k, viewGroup2, i13);
            boolean z13 = !z4;
            if (!z4) {
                viewM34074k2 = viewM34074k2 != null ? AbstractC12240d.m34074k(viewM34074k2, viewGroup2, i13) : null;
                if (viewM34074k2 == viewM34074k) {
                    break;
                }
            }
            z4 = z13;
        }
        if (viewM7288a != null) {
            return viewM7288a;
        }
        ArrayList<View> arrayList = this.f9335e;
        try {
            arrayList.clear();
            viewGroup2.addFocusables(arrayList, i13, viewGroup2.isInTouchMode() ? 1 : 0);
            if (!arrayList.isEmpty()) {
                viewM7288a = m7288a(i13, null, view, viewGroup2, arrayList);
            }
            return viewM7288a;
        } finally {
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: c */
    public final View m7290c(AndroidComposeView androidComposeView, Rect rect, int i13) {
        this.f9331a.set(rect);
        Rect rect2 = this.f9331a;
        ArrayList<View> arrayList = this.f9335e;
        try {
            arrayList.clear();
            androidComposeView.addFocusables(arrayList, i13, androidComposeView.isInTouchMode() ? 1 : 0);
            if (arrayList.isEmpty()) {
                return null;
            }
            return m7288a(i13, rect2, null, androidComposeView, arrayList);
        } finally {
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public final View m7291d(int i13, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.f9332b;
        rect2.set(rect);
        if (i13 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i13 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i13 == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i13 == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i14 = 0; i14 < size; i14++) {
            View view3 = (View) arrayList.get(i14);
            if (!AbstractC22676k.m65745e(view3, view) && !AbstractC22676k.m65745e(view3, viewGroup)) {
                Rect rect3 = this.f9333c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                C16618c c16618cM51508J = AbstractC17918w0.m51508J(rect3);
                C16618c c16618cM51508J2 = AbstractC17918w0.m51508J(rect2);
                C16618c c16618cM51508J3 = AbstractC17918w0.m51508J(rect);
                C15232d c15232dM60707v0 = AbstractC21598x.m60707v0(i13);
                if (AbstractC15235g.m43333w(c16618cM51508J, c16618cM51508J2, c16618cM51508J3, c15232dM60707v0 != null ? c15232dM60707v0.f57230a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
