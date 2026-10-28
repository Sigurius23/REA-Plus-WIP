package p318m3;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import p006a4.AbstractC0354a;
import p029b5.AbstractC2722a;
import p048ce.AbstractC4482w;
import p079d2.AbstractC11480b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C24982l extends Canvas {

    /* JADX INFO: renamed from: a */
    public Canvas f97762a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return AbstractC4482w.m14014x(canvas, path);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return AbstractC4482w.m13966B(canvas, rectF);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op3) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.clipPath(path, op3);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op3) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op3);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            AbstractC0354a.m965e(canvas);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i13, int i14, int i15, int i16) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawARGB(i13, i14, i15, i16);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f13, float f14, boolean z4, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawArc(rectF, f13, f14, z4, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f13, float f14, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f13, f14, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i13, int i14, float[] fArr, int i15, int[] iArr, int i16, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i13, i14, fArr, i15, iArr, i16, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f13, float f14, float f15, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawCircle(f13, f14, f15, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i13) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawColor(i13);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f13, float f14, RectF rectF2, float f15, float f16, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            AbstractC0354a.m969i(canvas, rectF, f13, f14, rectF2, f15, f16, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i13, float[] fArr, int i14, int i15, Font font, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            AbstractC11480b.m30880f(canvas, iArr, i13, fArr, i14, i15, font, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f13, float f14, float f15, float f16, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawLine(f13, f14, f15, f16, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i13, int i14, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawLines(fArr, i13, i14, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            AbstractC11480b.m30881g(canvas, ninePatch, rect, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f13, float f14, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawPoint(f13, f14, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i13, int i14, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i13, i14, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i13, int i14, float[] fArr, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i13, i14, fArr, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i13, int i14, int i15) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawRGB(i13, i14, i15);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            AbstractC0354a.m971k(canvas, renderNode);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f13, float f14, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f13, f14, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i13, int i14, float f13, float f14, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawText(cArr, i13, i14, f13, f14, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i13, int i14, Path path, float f13, float f14, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i13, i14, path, f13, f14, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i13, int i14, int i15, int i16, float f13, float f14, boolean z4, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i13, i14, i15, i16, f13, f14, z4, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i13, float[] fArr, int i14, float[] fArr2, int i15, int[] iArr, int i16, short[] sArr, int i17, int i18, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i13, fArr, i14, fArr2, i15, iArr, i16, sArr, i17, i18, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            AbstractC0354a.m973m(canvas);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f97762a;
        if (canvas == null) {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.restore();
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i13) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.restoreToCount(i13);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f13) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.rotate(f13);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.save();
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i13) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i13);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i13, int i14) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i13, i14);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f13, float f14) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.scale(f13, f14);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i13) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.setDensity(i13);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f13, float f14) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.skew(f13, f14);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f13, float f14) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.translate(f13, f14);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return AbstractC4482w.m13965A(canvas, rect);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op3) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.clipRect(rect, op3);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f13, float f14, float f15, float f16, float f17, float f18, boolean z4, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawArc(f13, f14, f15, f16, f17, f18, z4, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j7) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            AbstractC0354a.m967g(canvas, j7);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f13, float f14, float f15, float f16, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawOval(f13, f14, f15, f16, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            AbstractC11480b.m30882h(canvas, ninePatch, rectF, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f13, float f14, float f15, float f16, float f17, float f18, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawRoundRect(f13, f14, f15, f16, f17, f18, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f13, float f14, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawText(str, f13, f14, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f13, float f14, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f13, f14, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return AbstractC2722a.m7683j(canvas, rectF);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i13) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i13);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f13, float f14, float f15, float f16) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return AbstractC4482w.m14015y(canvas, f13, f14, f15, f16);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i13, PorterDuff.Mode mode) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawColor(i13, mode);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f13, float f14, float f15, float f16, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawRect(f13, f14, f15, f16, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i13, int i14, float f13, float f14, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawText(str, i13, i14, f13, f14, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f13, float f14, float f15, float f16, Paint paint, int i13) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.saveLayer(f13, f14, f15, f16, paint, i13);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f13, float f14, float f15, float f16, int i13, int i14) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f13, f14, f15, f16, i13, i14);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i13, int i14, int i15, int i16) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return AbstractC4482w.m14016z(canvas, i13, i14, i15, i16);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i13, int i14, float f13, float f14, int i15, int i16, boolean z4, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i13, i14, f13, f14, i15, i16, z4, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i13, BlendMode blendMode) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            AbstractC0354a.m966f(canvas, i13, blendMode);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            AbstractC0354a.m970j(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i13, int i14, float f13, float f14, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawText(charSequence, i13, i14, f13, f14, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i13, int i14, int i15, int i16, float f13, float f14, boolean z4, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i13, i14, i15, i16, f13, f14, z4, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return AbstractC2722a.m7682i(canvas, path);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f13, float f14, float f15, float f16, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.saveLayer(f13, f14, f15, f16, paint);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f13, float f14, float f15, float f16, int i13) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f13, f14, f15, f16, i13);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f13, float f14, float f15, float f16, Region.Op op3) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.clipRect(f13, f14, f15, f16, op3);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i13, int i14, int i15, int i16, int i17, int i18, boolean z4, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i13, i14, i15, i16, i17, i18, z4, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j7, BlendMode blendMode) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            AbstractC0354a.m968h(canvas, j7, blendMode);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f13, float f14, float f15, float f16, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.quickReject(f13, f14, f15, f16, edgeType);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f13, float f14, float f15, float f16) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.clipRect(f13, f14, f15, f16);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f13, float f14, float f15, float f16) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return AbstractC2722a.m7681h(canvas, f13, f14, f15, f16);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i13, int i14, int i15, int i16) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            return canvas.clipRect(i13, i14, i15, i16);
        }
        AbstractC22676k.m65757q("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i13, int i14, int i15, int i16, float f13, float f14, boolean z4, Paint paint) {
        Canvas canvas = this.f97762a;
        if (canvas != null) {
            AbstractC0354a.m972l(canvas, measuredText, i13, i14, i15, i16, f13, f14, z4, paint);
        } else {
            AbstractC22676k.m65757q("nativeCanvas");
            throw null;
        }
    }
}
