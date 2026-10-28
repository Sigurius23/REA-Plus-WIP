package com.whoop.community.presentation.p059ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xp0.AbstractC38509f0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR*\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010/\u001a\u00020#2\u0006\u0010$\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R*\u00105\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u00109\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00102\"\u0004\b8\u00104¨\u0006:"}, m65681d2 = {"Lcom/whoop/community/presentation/ui/SimpleDial;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "a", "()V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/RectF;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/graphics/RectF;", "drawRect", "Landroid/graphics/Paint;", "x", "Landroid/graphics/Paint;", "emptyPaint", "y", "dialPaint", "", "value", "z", "F", "getThickness", "()F", "setThickness", "(F)V", "thickness", "E", "getProgress", "setProgress", NotificationCompat.CATEGORY_PROGRESS, "I", "getEmptyColor", "()I", "setEmptyColor", "(I)V", "emptyColor", "G", "getFullColor", "setFullColor", "fullColor", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SimpleDial extends View {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private float progress;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private int emptyColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int fullColor;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final RectF drawRect;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Paint emptyPaint;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Paint dialPaint;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private float thickness;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleDial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: a */
    private final void m19547a() {
        float f13 = this.thickness / 2.0f;
        this.drawRect.left = getPaddingLeft() + f13;
        this.drawRect.top = getPaddingTop() + f13;
        this.drawRect.right = (getWidth() - f13) - getPaddingRight();
        this.drawRect.bottom = (getHeight() - f13) - getPaddingBottom();
        this.emptyPaint.setStrokeWidth(this.thickness);
        this.dialPaint.setStrokeWidth(this.thickness);
        invalidate();
    }

    public final int getEmptyColor() {
        return this.emptyColor;
    }

    public final int getFullColor() {
        return this.fullColor;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final float getThickness() {
        return this.thickness;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawArc(this.drawRect, 0.0f, 360.0f, false, this.emptyPaint);
        canvas.drawArc(this.drawRect, -90.0f, this.progress * 360.0f, false, this.dialPaint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        m19547a();
    }

    public final void setEmptyColor(int i13) {
        this.emptyColor = i13;
        this.emptyPaint.setColor(i13);
        invalidate();
    }

    public final void setFullColor(int i13) {
        this.fullColor = i13;
        this.dialPaint.setColor(i13);
        invalidate();
    }

    public final void setProgress(float f13) {
        this.progress = f13;
        invalidate();
    }

    public final void setThickness(float f13) {
        this.thickness = f13;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleDial(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.drawRect = new RectF();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.emptyPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        this.dialPaint = paint2;
        this.thickness = 2.0f;
        setWillNotDraw(false);
        setLayerType(1, null);
        setMinimumHeight(32);
        setMinimumWidth(32);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC38509f0.f165750g);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        if (indexCount >= 0) {
            int i14 = 0;
            while (true) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == AbstractC38509f0.f165751h) {
                    setEmptyColor(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == AbstractC38509f0.f165752i) {
                    setFullColor(typedArrayObtainStyledAttributes.getColor(index, -16777216));
                } else if (index == AbstractC38509f0.f165753j) {
                    setThickness(typedArrayObtainStyledAttributes.getFloat(index, 2.0f));
                }
                if (i14 == indexCount) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ SimpleDial(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
