package com.whoop.p069ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\"\u0010(\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010#R\u0016\u0010/\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001eR\u0016\u00101\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u001eR\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010#R\u0016\u00104\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010=¨\u0006A"}, m65681d2 = {"Lcom/whoop/ui/DotProgressIndicator;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/TypedArray;", "arr", "Ll83/a0;", "b", "(Landroid/content/res/TypedArray;)V", "a", "()V", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "F", "circleMargin", "x", "circleRadius", "y", "I", "getDotProgressPageCount", "()I", "setDotProgressPageCount", "(I)V", "dotProgressPageCount", "z", "getDotProgressCurrentPageCount", "setDotProgressCurrentPageCount", "dotProgressCurrentPageCount", "E", "horizontalProgressPosition", "circleCenterY", "G", "firstCircleCenterX", "H", "currentPosition", "currentPositionOffset", "Landroid/graphics/Paint;", "J", "Landroid/graphics/Paint;", "unselectedCirclePaint", "K", "selectedCirclePaint", "Landroid/graphics/Path;", "L", "Landroid/graphics/Path;", "firstCirclePath", "M", "circleClipTemp", "legacy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DotProgressIndicator extends View {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private int horizontalProgressPosition;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private float circleCenterY;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private float firstCircleCenterX;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private int currentPosition;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private float currentPositionOffset;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private Paint unselectedCirclePaint;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private Paint selectedCirclePaint;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private Path firstCirclePath;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private Path circleClipTemp;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float circleMargin;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private float circleRadius;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int dotProgressPageCount;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private int dotProgressCurrentPageCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC22676k.m65750j(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156196h);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        m26647b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0081  */
    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX INFO: renamed from: a */
    private final void m26646a() {
        int paddingStart;
        float f13;
        Path path;
        Path path2;
        float paddingEnd;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f14 = this.circleMargin;
        int i13 = this.dotProgressPageCount;
        float fMin = Math.min((width - (f14 * (i13 - 1))) / i13, height);
        float f15 = 2;
        this.circleRadius = fMin / f15;
        this.circleCenterY = getPaddingTop() + (height / 2);
        float f16 = this.circleRadius * f15;
        int i14 = this.dotProgressPageCount;
        float f17 = (this.circleMargin * (i14 - 1)) + (f16 * i14);
        int i15 = this.horizontalProgressPosition;
        if (i15 != 1) {
            if (i15 == 2) {
                paddingEnd = width - getPaddingEnd();
            } else if (i15 != 4) {
                paddingStart = getPaddingStart();
            } else {
                paddingEnd = getPaddingLeft() + (width / 2);
                f17 /= f15;
            }
            f13 = paddingEnd - f17;
            this.firstCircleCenterX = f13 + this.circleRadius;
            path = this.firstCirclePath;
            if (path != null) {
                AbstractC22676k.m65757q("firstCirclePath");
                throw null;
            }
            path.reset();
            path2 = this.firstCirclePath;
            if (path2 != null) {
                AbstractC22676k.m65757q("firstCirclePath");
                throw null;
            }
            path2.addCircle(this.firstCircleCenterX, this.circleCenterY, this.circleRadius, Path.Direction.CW);
            invalidate();
        }
        paddingStart = getPaddingStart();
        f13 = paddingStart;
        this.firstCircleCenterX = f13 + this.circleRadius;
        path = this.firstCirclePath;
        if (path != null) {
            AbstractC22676k.m65757q("firstCirclePath");
            throw null;
        }
        path.reset();
        path2 = this.firstCirclePath;
        if (path2 != null) {
            AbstractC22676k.m65757q("firstCirclePath");
            throw null;
        }
        path2.addCircle(this.firstCircleCenterX, this.circleCenterY, this.circleRadius, Path.Direction.CW);
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    private final void m26647b(TypedArray arr) {
        Paint paint = new Paint(1);
        this.unselectedCirclePaint = paint;
        paint.setColor(-7829368);
        Paint paint2 = new Paint(1);
        this.selectedCirclePaint = paint2;
        paint2.setColor(-1);
        this.circleMargin = getContext().getResources().getDisplayMetrics().density * 8.0f;
        this.firstCirclePath = new Path();
        this.circleClipTemp = new Path();
        this.currentPosition = 1;
        this.currentPositionOffset = 0.1f;
        if (arr != null) {
            int indexCount = arr.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = arr.getIndex(i13);
                if (index == AbstractC36519j.f156200j) {
                    this.circleMargin = arr.getDimensionPixelSize(index, (int) this.circleMargin);
                } else if (index == AbstractC36519j.f156202k) {
                    Paint paint3 = this.selectedCirclePaint;
                    if (paint3 == null) {
                        AbstractC22676k.m65757q("selectedCirclePaint");
                        throw null;
                    }
                    if (paint3 == null) {
                        AbstractC22676k.m65757q("selectedCirclePaint");
                        throw null;
                    }
                    paint3.setColor(arr.getColor(index, paint3.getColor()));
                } else if (index == AbstractC36519j.f156204l) {
                    Paint paint4 = this.unselectedCirclePaint;
                    if (paint4 == null) {
                        AbstractC22676k.m65757q("unselectedCirclePaint");
                        throw null;
                    }
                    if (paint4 == null) {
                        AbstractC22676k.m65757q("unselectedCirclePaint");
                        throw null;
                    }
                    paint4.setColor(arr.getColor(index, paint4.getColor()));
                } else if (index == AbstractC36519j.f156206m) {
                    this.dotProgressPageCount = arr.getInteger(index, 0);
                } else if (index == AbstractC36519j.f156198i) {
                    this.dotProgressCurrentPageCount = arr.getInteger(index, 0);
                } else if (index == AbstractC36519j.f156208n) {
                    this.horizontalProgressPosition = arr.getInteger(index, 0);
                }
            }
        }
    }

    public final int getDotProgressCurrentPageCount() {
        return this.dotProgressCurrentPageCount;
    }

    public final int getDotProgressPageCount() {
        return this.dotProgressPageCount;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint;
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        float f13 = (2 * this.circleRadius) + this.circleMargin;
        int i13 = this.dotProgressPageCount;
        for (int i14 = 0; i14 < i13; i14++) {
            float f14 = (i14 * f13) + this.firstCircleCenterX;
            float f15 = this.circleCenterY;
            float f16 = this.circleRadius;
            if (i14 < this.dotProgressCurrentPageCount) {
                paint = this.selectedCirclePaint;
                if (paint == null) {
                    AbstractC22676k.m65757q("selectedCirclePaint");
                    throw null;
                }
            } else {
                paint = this.unselectedCirclePaint;
                if (paint == null) {
                    AbstractC22676k.m65757q("unselectedCirclePaint");
                    throw null;
                }
            }
            canvas.drawCircle(f14, f15, f16, paint);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        m26646a();
    }

    public final void setDotProgressCurrentPageCount(int i13) {
        this.dotProgressCurrentPageCount = i13;
    }

    public final void setDotProgressPageCount(int i13) {
        this.dotProgressPageCount = i13;
    }
}
