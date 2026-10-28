package d50;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

/* JADX INFO: renamed from: d50.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C11710d extends View {
    public C11710d(Context context) {
        super(context);
        new Paint();
    }

    public ObjectAnimator getDisappearAnimator() {
        Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
        return null;
    }

    public ObjectAnimator getReappearAnimator() {
        Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
        return null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        getWidth();
    }

    public void setAnimationRadiusMultiplier(float f13) {
    }
}
