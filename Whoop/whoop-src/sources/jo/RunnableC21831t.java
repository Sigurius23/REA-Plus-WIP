package jo;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.whoop.android.R;
import java.util.ArrayList;
import p087db.C11842c0;

/* JADX INFO: renamed from: jo.t */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC21831t implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84228w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11842c0 f84229x;

    public /* synthetic */ RunnableC21831t(C11842c0 c11842c0, int i13) {
        this.f84228w = i13;
        this.f84229x = c11842c0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2 A[LOOP:3: B:37:0x00bc->B:39:0x00c2, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f84228w) {
            case 0:
                this.f84229x.m31797n();
                break;
            case 1:
                C11842c0 c11842c0 = this.f84229x;
                View view = c11842c0.f38602j;
                ViewGroup viewGroup = c11842c0.f38597e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(c11842c0.f38613u ? 0 : 4);
                }
                if (view != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int dimensionPixelSize = ((C21830s) c11842c0.f38616x).getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    if (c11842c0.f38613u) {
                        dimensionPixelSize = 0;
                    }
                    marginLayoutParams.bottomMargin = dimensionPixelSize;
                    view.setLayoutParams(marginLayoutParams);
                    if (view instanceof C21816e) {
                        C21816e c21816e = (C21816e) view;
                        Rect rect = c21816e.f84127w;
                        ValueAnimator valueAnimator = c21816e.f84116h0;
                        if (c11842c0.f38613u) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            c21816e.f84118j0 = true;
                            c21816e.f84117i0 = 0.0f;
                            c21816e.invalidate(rect);
                        } else {
                            int i13 = c11842c0.f38612t;
                            if (i13 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                c21816e.f84118j0 = false;
                                c21816e.f84117i0 = 0.0f;
                                c21816e.invalidate(rect);
                            } else if (i13 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                c21816e.f84118j0 = false;
                                c21816e.f84117i0 = 1.0f;
                                c21816e.invalidate(rect);
                            }
                        }
                    }
                }
                for (View view2 : c11842c0.f38611s) {
                    view2.setVisibility((c11842c0.f38613u && C11842c0.m31789m(view2)) ? 4 : 0);
                }
                break;
            case 2:
                C11842c0 c11842c1 = this.f84229x;
                ValueAnimator valueAnimator2 = c11842c1.f38610r;
                View view3 = c11842c1.f38603k;
                C21830s c21830s = (C21830s) c11842c1.f38616x;
                ViewGroup viewGroup2 = c11842c1.f38599g;
                ViewGroup viewGroup3 = c11842c1.f38598f;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (c21830s.getWidth() - c21830s.getPaddingLeft()) - c21830s.getPaddingRight();
                    while (true) {
                        if (viewGroup2.getChildCount() <= 1) {
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                            int iM31785d = C11842c0.m31785d(c11842c1.f38601i);
                            int childCount = viewGroup3.getChildCount() - 1;
                            for (int i14 = 0; i14 < childCount; i14++) {
                                iM31785d += C11842c0.m31785d(viewGroup3.getChildAt(i14));
                            }
                            if (iM31785d > width) {
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                    iM31785d += C11842c0.m31785d(view3);
                                }
                                ArrayList arrayList = new ArrayList();
                                for (int i15 = 0; i15 < childCount; i15++) {
                                    View childAt = viewGroup3.getChildAt(i15);
                                    iM31785d -= C11842c0.m31785d(childAt);
                                    arrayList.add(childAt);
                                    if (iM31785d <= width) {
                                        if (!arrayList.isEmpty()) {
                                            viewGroup3.removeViews(0, arrayList.size());
                                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                                viewGroup2.addView((View) arrayList.get(i16), viewGroup2.getChildCount() - 1);
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (!arrayList.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList.size());
                                    while (i16 < arrayList.size()) {
                                        viewGroup2.addView((View) arrayList.get(i16), viewGroup2.getChildCount() - 1);
                                    }
                                }
                                break;
                            } else {
                                ViewGroup viewGroup4 = c11842c1.f38600h;
                                if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                                    c11842c1.f38609q.cancel();
                                    valueAnimator2.start();
                                    break;
                                }
                            }
                        } else {
                            int childCount2 = viewGroup2.getChildCount() - 2;
                            View childAt2 = viewGroup2.getChildAt(childCount2);
                            viewGroup2.removeViewAt(childCount2);
                            viewGroup3.addView(childAt2, 0);
                        }
                    }
                }
                break;
            case 3:
                this.f84229x.f38606n.start();
                break;
            case 4:
                this.f84229x.f38605m.start();
                break;
            case 5:
                C11842c0 c11842c2 = this.f84229x;
                c11842c2.f38604l.start();
                c11842c2.m31792g((RunnableC21831t) c11842c2.f38589A, 2000L);
                break;
            default:
                this.f84229x.m31796k(2);
                break;
        }
    }
}
