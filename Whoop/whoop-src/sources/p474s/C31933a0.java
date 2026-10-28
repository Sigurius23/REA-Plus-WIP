package p474s;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.whoop.android.R;

/* JADX INFO: renamed from: s.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31933a0 extends SeekBar {

    /* JADX INFO: renamed from: w */
    public final C31937b0 f132628w;

    public C31933a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC31967i2.m99459a(getContext(), this);
        C31937b0 c31937b0 = new C31937b0(this);
        this.f132628w = c31937b0;
        c31937b0.mo99418e(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C31937b0 c31937b0 = this.f132628w;
        C31933a0 c31933a0 = c31937b0.f132631e;
        Drawable drawable = c31937b0.f132632f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c31933a0.getDrawableState())) {
            c31933a0.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f132628w.f132632f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f132628w.m99420j(canvas);
    }
}
