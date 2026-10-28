package cr;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.stripe.android.stripe3ds2.views.InformationZoneView;
import p479s4.AbstractC32122c;

/* JADX INFO: renamed from: cr.n */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC11076n implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35036w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ View f35037x;

    public /* synthetic */ RunnableC11076n(View view, int i13) {
        this.f35036w = i13;
        this.f35037x = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f35036w;
        View view = this.f35037x;
        switch (i13) {
            case 0:
                ((InputMethodManager) AbstractC32122c.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                break;
            case 1:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 2:
                view.performClick();
                break;
            default:
                int i14 = InformationZoneView.f22451L;
                Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
                view.getHitRect(rect);
                view.requestRectangleOnScreen(rect, false);
                break;
        }
    }
}
