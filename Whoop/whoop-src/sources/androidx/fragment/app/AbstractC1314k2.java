package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p009a8.RunnableC0533c;
import p029b5.C2725d;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: androidx.fragment.app.k2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1314k2 {
    /* JADX INFO: renamed from: f */
    public static void m4111f(View view, List list) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (list.get(i13) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (AbstractC16877h0.m47511f(view) != null) {
            list.add(view);
        }
        for (int i14 = size; i14 < list.size(); i14++) {
            View view2 = (View) list.get(i14);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = viewGroup.getChildAt(i15);
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size) {
                            if (AbstractC16877h0.m47511f(childAt) == null) {
                                break;
                            }
                            list.add(childAt);
                            break;
                        } else if (list.get(i16) == childAt) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m4112j(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m4113k(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4090a(View view, Object obj);

    /* JADX INFO: renamed from: b */
    public abstract void mo4091b(Object obj, ArrayList arrayList);

    /* JADX INFO: renamed from: c */
    public void mo4114c(Object obj) {
    }

    /* JADX INFO: renamed from: d */
    public void mo4115d(Object obj, RunnableC0533c runnableC0533c) {
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo4092e(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo4093g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract Object mo4094h(Object obj);

    /* JADX INFO: renamed from: i */
    public Object mo4116i(ViewGroup viewGroup, Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public abstract boolean mo4095l();

    /* JADX INFO: renamed from: m */
    public abstract boolean mo4096m(Object obj);

    /* JADX INFO: renamed from: n */
    public abstract Object mo4097n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: o */
    public abstract Object mo4098o(Object obj, Object obj2);

    /* JADX INFO: renamed from: p */
    public abstract void mo4099p(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: q */
    public abstract void mo4100q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    /* JADX INFO: renamed from: r */
    public void mo4117r(Object obj, float f13) {
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo4101s(View view, Object obj);

    /* JADX INFO: renamed from: t */
    public abstract void mo4102t(Object obj, Rect rect);

    /* JADX INFO: renamed from: u */
    public abstract void mo4103u(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, Object obj, C2725d c2725d, Runnable runnable);

    /* JADX INFO: renamed from: v */
    public void mo4118v(Object obj, C2725d c2725d, RunnableC1319m runnableC1319m, Runnable runnable) {
        ((RunnableC1323n) runnable).run();
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo4104w(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: x */
    public abstract void mo4105x(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* JADX INFO: renamed from: y */
    public abstract Object mo4106y(Object obj);
}
