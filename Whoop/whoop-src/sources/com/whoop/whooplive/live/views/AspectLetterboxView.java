package com.whoop.whooplive.live.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import pz2.AbstractC29655h;
import vu1.AbstractC36510a;

/* JADX INFO: loaded from: classes11.dex */
public class AspectLetterboxView extends View {

    /* JADX INFO: renamed from: E */
    private Rect f33368E;

    /* JADX INFO: renamed from: w */
    private float f33369w;

    /* JADX INFO: renamed from: x */
    private Paint f33370x;

    /* JADX INFO: renamed from: y */
    private int f33371y;

    /* JADX INFO: renamed from: z */
    private Rect f33372z;

    public AspectLetterboxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC29655h.f121199a);
        m28630a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private void m28630a(TypedArray typedArray) {
        this.f33370x = new Paint();
        this.f33372z = new Rect();
        this.f33368E = new Rect();
        if (typedArray != null) {
            setAspectRatio(typedArray.getFloat(AbstractC29655h.f121200b, 1.0f));
            setShadeColor(typedArray.getInt(AbstractC29655h.f121201c, AbstractC36510a.f156018a));
        }
    }

    public float getAspectRatio() {
        return this.f33369w;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(this.f33372z, this.f33370x);
        canvas.drawRect(this.f33368E, this.f33370x);
    }

    @Override // android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        int i17 = ((i16 - i14) - ((int) ((i15 - i13) * this.f33369w))) / 2;
        this.f33372z.set(i13, 0, i15, i17);
        this.f33368E.set(i13, i16 - i17, i15, i16);
    }

    public void setAspectRatio(float f13) {
        this.f33369w = f13;
    }

    public void setShadeColor(int i13) {
        this.f33371y = i13;
        this.f33370x.setColor(i13);
    }
}
