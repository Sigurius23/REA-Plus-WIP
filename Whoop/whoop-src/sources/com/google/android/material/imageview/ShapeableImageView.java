package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import br.C3553a;
import kr.AbstractC22793l;
import kr.C22788g;
import kr.C22792k;
import kr.C22794m;
import kr.InterfaceC22803v;
import p257jq.AbstractC21885a;
import p435qr.AbstractC30554a;
import p479s4.AbstractC32122c;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: loaded from: classes6.dex */
public class ShapeableImageView extends AppCompatImageView implements InterfaceC22803v {
    private static final int DEF_STYLE_RES = 2132084234;
    private static final int UNDEFINED_PADDING = Integer.MIN_VALUE;
    private final Paint borderPaint;
    private int bottomContentPadding;
    private final Paint clearPaint;
    private final RectF destination;
    private int endContentPadding;
    private boolean hasAdjustedPaddingAfterLayoutDirectionResolved;
    private int leftContentPadding;
    private Path maskPath;
    private final RectF maskRect;
    private final Path path;
    private final C22794m pathProvider;
    private int rightContentPadding;
    private C22788g shadowDrawable;
    private C22792k shapeAppearanceModel;
    private int startContentPadding;
    private ColorStateList strokeColor;
    private float strokeWidth;
    private int topContentPadding;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15771c() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m15772d(int i13, int i14) {
        this.destination.set(getPaddingLeft(), getPaddingTop(), i13 - getPaddingRight(), i14 - getPaddingBottom());
        this.pathProvider.m66030a(this.shapeAppearanceModel, 1.0f, this.destination, null, this.path);
        this.maskPath.rewind();
        this.maskPath.addPath(this.path);
        this.maskRect.set(0.0f, 0.0f, i13, i14);
        this.maskPath.addRect(this.maskRect, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.bottomContentPadding;
    }

    public final int getContentPaddingEnd() {
        int i13 = this.endContentPadding;
        if (i13 != Integer.MIN_VALUE) {
            return i13;
        }
        return m15771c() ? this.leftContentPadding : this.rightContentPadding;
    }

    public int getContentPaddingLeft() {
        int i13;
        int i14;
        if (this.startContentPadding != Integer.MIN_VALUE || this.endContentPadding != Integer.MIN_VALUE) {
            if (m15771c() && (i14 = this.endContentPadding) != Integer.MIN_VALUE) {
                return i14;
            }
            if (!m15771c() && (i13 = this.startContentPadding) != Integer.MIN_VALUE) {
                return i13;
            }
        }
        return this.leftContentPadding;
    }

    public int getContentPaddingRight() {
        int i13;
        int i14;
        if (this.startContentPadding != Integer.MIN_VALUE || this.endContentPadding != Integer.MIN_VALUE) {
            if (m15771c() && (i14 = this.startContentPadding) != Integer.MIN_VALUE) {
                return i14;
            }
            if (!m15771c() && (i13 = this.endContentPadding) != Integer.MIN_VALUE) {
                return i13;
            }
        }
        return this.rightContentPadding;
    }

    public final int getContentPaddingStart() {
        int i13 = this.startContentPadding;
        if (i13 != Integer.MIN_VALUE) {
            return i13;
        }
        return m15771c() ? this.rightContentPadding : this.leftContentPadding;
    }

    public int getContentPaddingTop() {
        return this.topContentPadding;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public C22792k getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.maskPath, this.clearPaint);
        if (this.strokeColor == null) {
            return;
        }
        this.borderPaint.setStrokeWidth(this.strokeWidth);
        int colorForState = this.strokeColor.getColorForState(getDrawableState(), this.strokeColor.getDefaultColor());
        if (this.strokeWidth <= 0.0f || colorForState == 0) {
            return;
        }
        this.borderPaint.setColor(colorForState);
        canvas.drawPath(this.path, this.borderPaint);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (!this.hasAdjustedPaddingAfterLayoutDirectionResolved && isLayoutDirectionResolved()) {
            this.hasAdjustedPaddingAfterLayoutDirectionResolved = true;
            if (!isPaddingRelative() && this.startContentPadding == Integer.MIN_VALUE && this.endContentPadding == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        m15772d(i13, i14);
    }

    public final void setContentPadding(int i13, int i14, int i15, int i16) {
        this.startContentPadding = Integer.MIN_VALUE;
        this.endContentPadding = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.leftContentPadding) + i13, (super.getPaddingTop() - this.topContentPadding) + i14, (super.getPaddingRight() - this.rightContentPadding) + i15, (super.getPaddingBottom() - this.bottomContentPadding) + i16);
        this.leftContentPadding = i13;
        this.topContentPadding = i14;
        this.rightContentPadding = i15;
        this.bottomContentPadding = i16;
    }

    public final void setContentPaddingRelative(int i13, int i14, int i15, int i16) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i13, (super.getPaddingTop() - this.topContentPadding) + i14, (super.getPaddingEnd() - getContentPaddingEnd()) + i15, (super.getPaddingBottom() - this.bottomContentPadding) + i16);
        this.leftContentPadding = m15771c() ? i15 : i13;
        this.topContentPadding = i14;
        if (!m15771c()) {
            i13 = i15;
        }
        this.rightContentPadding = i13;
        this.bottomContentPadding = i16;
    }

    @Override // android.view.View
    public final void setPadding(int i13, int i14, int i15, int i16) {
        super.setPadding(getContentPaddingLeft() + i13, getContentPaddingTop() + i14, getContentPaddingRight() + i15, getContentPaddingBottom() + i16);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i13, int i14, int i15, int i16) {
        super.setPaddingRelative(getContentPaddingStart() + i13, getContentPaddingTop() + i14, getContentPaddingEnd() + i15, getContentPaddingBottom() + i16);
    }

    @Override // kr.InterfaceC22803v
    public void setShapeAppearanceModel(C22792k c22792k) {
        this.shapeAppearanceModel = c22792k;
        C22788g c22788g = this.shadowDrawable;
        if (c22788g != null) {
            c22788g.setShapeAppearanceModel(c22792k);
        }
        m15772d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.strokeColor = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i13) {
        setStrokeColor(AbstractC32122c.getColorStateList(getContext(), i13));
    }

    public void setStrokeWidth(float f13) {
        if (this.strokeWidth != f13) {
            this.strokeWidth = f13;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i13) {
        setStrokeWidth(getResources().getDimensionPixelSize(i13));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i13) {
        int i14 = DEF_STYLE_RES;
        super(AbstractC30554a.m93706a(context, attributeSet, i13, i14), attributeSet, i13);
        this.pathProvider = AbstractC22793l.f89778a;
        this.path = new Path();
        this.hasAdjustedPaddingAfterLayoutDirectionResolved = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.clearPaint = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.destination = new RectF();
        this.maskRect = new RectF();
        this.maskPath = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC21885a.f84531H, i13, i14);
        setLayerType(2, null);
        this.strokeColor = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context2, 9);
        this.strokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.leftContentPadding = dimensionPixelSize;
        this.topContentPadding = dimensionPixelSize;
        this.rightContentPadding = dimensionPixelSize;
        this.bottomContentPadding = dimensionPixelSize;
        this.leftContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.topContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.rightContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.bottomContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.startContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.endContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.borderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.shapeAppearanceModel = C22792k.m66026b(context2, attributeSet, i13, i14).m66021a();
        setOutlineProvider(new C3553a(this));
    }
}
