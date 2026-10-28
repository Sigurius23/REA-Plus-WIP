package com.wdullaer.materialdatetimepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes6.dex */
public class VerticalTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: w */
    public final boolean f22597w;

    public VerticalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int gravity = getGravity();
        if (!Gravity.isVertical(gravity) || (gravity & 112) != 80) {
            this.f22597w = true;
        } else {
            setGravity((gravity & 7) | 48);
            this.f22597w = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        canvas.save();
        if (this.f22597w) {
            canvas.translate(getWidth(), 0.0f);
            canvas.rotate(90.0f);
        } else {
            canvas.translate(0.0f, getHeight());
            canvas.rotate(-90.0f);
        }
        canvas.translate(getCompoundPaddingLeft(), getExtendedPaddingTop());
        getLayout().draw(canvas);
        canvas.restore();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i14, i13);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }
}
