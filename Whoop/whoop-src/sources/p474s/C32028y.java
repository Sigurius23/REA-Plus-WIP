package p474s;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.whoop.android.R;

/* JADX INFO: renamed from: s.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C32028y extends RatingBar {

    /* JADX INFO: renamed from: w */
    public final C32020w f132893w;

    public C32028y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC31967i2.m99459a(getContext(), this);
        C32020w c32020w = new C32020w(this);
        this.f132893w = c32020w;
        c32020w.mo99418e(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        Bitmap bitmap = (Bitmap) this.f132893w.f132880c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i13, 0), getMeasuredHeight());
        }
    }
}
