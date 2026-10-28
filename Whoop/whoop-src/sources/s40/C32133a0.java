package s40;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.whoop.android.R;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: s40.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32133a0 extends FrameLayout {

    /* JADX INFO: renamed from: w */
    public final Animation f133156w;

    /* JADX INFO: renamed from: x */
    public final Animation f133157x;

    public C32133a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textInputStyle);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.stripe_card_widget_progress_fade_in);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC32191z(this, 0));
        this.f133156w = animationLoadAnimation;
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.stripe_card_widget_progress_fade_out);
        animationLoadAnimation2.setAnimationListener(new AnimationAnimationListenerC32191z(this, 1));
        this.f133157x = animationLoadAnimation2;
        LayoutInflater.from(context).inflate(R.layout.stripe_card_widget_progress_view, this);
        if (((ProgressBar) AbstractC34235f.m108203J(this, R.id.card_loading)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(R.id.card_loading)));
        }
        setBackgroundResource(R.drawable.stripe_card_progress_background);
        setClipToOutline(true);
        setVisibility(4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.stripe_card_widget_progress_size);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        setLayoutParams(layoutParams);
    }
}
