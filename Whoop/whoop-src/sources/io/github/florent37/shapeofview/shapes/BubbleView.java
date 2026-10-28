package io.github.florent37.shapeofview.shapes;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p508ty.C34249c;
import s53.AbstractC32226a;
import s53.AbstractC32228c;

/* JADX INFO: loaded from: classes3.dex */
public class BubbleView extends AbstractC32228c {

    /* JADX INFO: renamed from: H */
    public int f74950H;

    /* JADX INFO: renamed from: I */
    public float f74951I;

    /* JADX INFO: renamed from: J */
    public float f74952J;

    /* JADX INFO: renamed from: K */
    public float f74953K;

    /* JADX INFO: renamed from: L */
    public float f74954L;

    public BubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74950H = 1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC32226a.f133433a);
            this.f74951I = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, (int) m100252a(10.0f));
            this.f74950H = typedArrayObtainStyledAttributes.getInteger(2, this.f74950H);
            this.f74952J = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, (int) m100252a(10.0f));
            this.f74953K = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, (int) m100252a(10.0f));
            this.f74954L = typedArrayObtainStyledAttributes.getFloat(0, 0.5f);
            typedArrayObtainStyledAttributes.recycle();
        }
        super.setClipPathCreator(new C34249c(this, 4));
    }

    public float getArrowHeight() {
        return this.f74952J;
    }

    public float getArrowHeightDp() {
        return getArrowHeight() / getContext().getResources().getDisplayMetrics().density;
    }

    public float getArrowWidth() {
        return this.f74953K;
    }

    public float getBorderRadius() {
        return this.f74951I;
    }

    public float getBorderRadiusDp() {
        return getBorderRadius() / getContext().getResources().getDisplayMetrics().density;
    }

    public int getPosition() {
        return this.f74950H;
    }

    public void setArrowHeight(float f13) {
        this.f74952J = f13;
        m100253b();
    }

    public void setArrowHeightDp(float f13) {
        setArrowHeight(m100252a(f13));
    }

    public void setArrowWidth(float f13) {
        this.f74953K = f13;
        m100253b();
    }

    public void setArrowWidthDp(float f13) {
        setArrowWidth(m100252a(f13));
    }

    public void setBorderRadius(float f13) {
        this.f74951I = f13;
        m100253b();
    }

    public void setBorderRadiusDp(float f13) {
        this.f74951I = m100252a(f13);
        m100253b();
    }

    public void setPosition(int i13) {
        this.f74950H = i13;
        m100253b();
    }

    public void setPositionPer(float f13) {
        this.f74954L = f13;
        m100253b();
    }
}
