package p376oq;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.stripe.android.view.CardNumberTextInputLayout;
import com.whoop.android.R;
import java.util.NoSuchElementException;
import p184h5.C16907r0;

/* JADX INFO: renamed from: oq.a */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC28103a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f113659w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f113660x;

    public /* synthetic */ ViewOnLayoutChangeListenerC28103a(Object obj, int i13) {
        this.f113659w = i13;
        this.f113660x = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        switch (this.f113659w) {
            case 0:
                throw null;
            default:
                view.removeOnLayoutChangeListener(this);
                CardNumberTextInputLayout cardNumberTextInputLayout = (CardNumberTextInputLayout) this.f113660x;
                View view2 = cardNumberTextInputLayout.f22526e1;
                ViewParent parent = view2.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view2);
                }
                C16907r0 c16907r0 = new C16907r0(cardNumberTextInputLayout);
                if (!c16907r0.hasNext()) {
                    throw new NoSuchElementException("Sequence is empty.");
                }
                FrameLayout frameLayout = (FrameLayout) c16907r0.next();
                frameLayout.addView(view2);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(frameLayout.getWidth() - cardNumberTextInputLayout.getResources().getDimensionPixelSize(R.dimen.stripe_card_number_text_input_layout_progress_end_margin));
                layoutParams2.topMargin = cardNumberTextInputLayout.getResources().getDimensionPixelSize(R.dimen.stripe_card_number_text_input_layout_progress_top_margin);
                view2.setLayoutParams(layoutParams2);
                return;
        }
    }
}
