package p087db;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.whoop.android.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: db.y */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC11883y implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38848w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11842c0 f38849x;

    public /* synthetic */ RunnableC11883y(C11842c0 c11842c0, int i13) {
        this.f38848w = i13;
        this.f38849x = c11842c0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2 A[LOOP:3: B:37:0x00bc->B:39:0x00c2, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38848w) {
            case 0:
                this.f38849x.m31797n();
                break;
            case 1:
                C11842c0 c11842c0 = this.f38849x;
                View view = c11842c0.f38602j;
                ViewGroup viewGroup = c11842c0.f38597e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(c11842c0.f38613u ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = ((C11882x) c11842c0.f38616x).getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (c11842c0.f38613u) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof C11847f) {
                        C11847f c11847f = (C11847f) view;
                        Rect rect = c11847f.f38669w;
                        ValueAnimator valueAnimator = c11847f.f38658h0;
                        if (c11842c0.f38613u) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            c11847f.f38660j0 = true;
                            c11847f.f38659i0 = 0.0f;
                            c11847f.invalidate(rect);
                        } else {
                            int i13 = c11842c0.f38612t;
                            if (i13 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                c11847f.f38660j0 = false;
                                c11847f.f38659i0 = 0.0f;
                                c11847f.invalidate(rect);
                            } else if (i13 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                c11847f.f38660j0 = false;
                                c11847f.f38659i0 = 1.0f;
                                c11847f.invalidate(rect);
                            }
                        }
                    }
                }
                for (View view2 : c11842c0.f38611s) {
                    view2.setVisibility((c11842c0.f38613u && C11842c0.m31788l(view2)) ? 4 : 0);
                }
                break;
            case 2:
                C11842c0 c11842c1 = this.f38849x;
                ValueAnimator valueAnimator2 = c11842c1.f38610r;
                View view3 = c11842c1.f38603k;
                C11882x c11882x = (C11882x) c11842c1.f38616x;
                ViewGroup viewGroup2 = c11842c1.f38599g;
                ViewGroup viewGroup3 = c11842c1.f38598f;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (c11882x.getWidth() - c11882x.getPaddingLeft()) - c11882x.getPaddingRight();
                    while (true) {
                        if (viewGroup2.getChildCount() <= 1) {
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                            int iM31784c = C11842c0.m31784c(c11842c1.f38601i);
                            int childCount = viewGroup3.getChildCount() - 1;
                            for (int i14 = 0; i14 < childCount; i14++) {
                                iM31784c += C11842c0.m31784c(viewGroup3.getChildAt(i14));
                            }
                            if (iM31784c > width) {
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                    iM31784c += C11842c0.m31784c(view3);
                                }
                                ArrayList arrayList = new ArrayList();
                                for (int i15 = 0; i15 < childCount; i15++) {
                                    View childAt = viewGroup3.getChildAt(i15);
                                    iM31784c -= C11842c0.m31784c(childAt);
                                    arrayList.add(childAt);
                                    if (iM31784c <= width) {
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
                this.f38849x.f38606n.start();
                break;
            case 4:
                this.f38849x.f38605m.start();
                break;
            case 5:
                C11842c0 c11842c2 = this.f38849x;
                c11842c2.f38604l.start();
                c11842c2.m31792g((RunnableC11883y) c11842c2.f38589A, 2000L);
                break;
            default:
                this.f38849x.m31796k(2);
                break;
        }
    }
}
