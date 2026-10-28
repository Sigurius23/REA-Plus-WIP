package d50;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

/* JADX INFO: renamed from: d50.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C11711e extends View {
    public C11711e(Context context) {
        super(context);
        new Paint();
        new Paint();
        new Paint();
    }

    public ObjectAnimator getDisappearAnimator() {
        Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
        return null;
    }

    public ObjectAnimator getReappearAnimator() {
        Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
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

    public void setSelection(int i13) {
    }
}
