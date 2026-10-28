package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
import java.util.WeakHashMap;
import l83.C23465k;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.screenshot.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C20230j extends Canvas {

    /* JADX INFO: renamed from: a */
    public Canvas f75998a;

    /* JADX INFO: renamed from: b */
    public final Paint f75999b = new Paint();

    /* JADX INFO: renamed from: c */
    public final Paint f76000c = new Paint();

    /* JADX INFO: renamed from: d */
    public final Rect f76001d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Bitmap f76002e;

    /* JADX INFO: renamed from: f */
    public final Canvas f76003f;

    /* JADX INFO: renamed from: g */
    public final Rect f76004g;

    /* JADX INFO: renamed from: h */
    public final WeakHashMap f76005h;

    public C20230j() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        this.f76002e = bitmapCreateBitmap;
        this.f76003f = new Canvas(bitmapCreateBitmap);
        this.f76004g = new Rect(0, 0, 1, 1);
        this.f76005h = new WeakHashMap();
    }

    /* JADX INFO: renamed from: c */
    public static BitmapShader m56148c(Paint paint) {
        if (paint != null) {
            Shader shader = paint.getShader();
            if (shader instanceof BitmapShader) {
                paint.setShader(null);
                return (BitmapShader) shader;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m56149a(float f13, float f14, Paint paint) {
        ColorFilter colorFilter = paint.getColorFilter();
        Paint paint2 = this.f76000c;
        paint2.setColorFilter(colorFilter);
        int color = paint.getColor();
        paint2.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        Rect rect = this.f76001d;
        drawRoundRect(rect.left + f13, rect.top + f14, rect.right + f13, rect.bottom + f14, 10.0f, 10.0f, paint2);
    }

    /* JADX INFO: renamed from: b */
    public final Canvas m56150b() {
        Canvas canvas = this.f75998a;
        if (canvas != null) {
            return canvas;
        }
        AbstractC22676k.m65757q("delegate");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        AbstractC22676k.m65750j(path, "path");
        return m56150b().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rect) {
        AbstractC22676k.m65750j(rect, "rect");
        return m56150b().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op3) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(op3, "op");
        return m56150b().clipPath(path, op3);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rect, Region.Op op3) {
        AbstractC22676k.m65750j(rect, "rect");
        AbstractC22676k.m65750j(op3, "op");
        return m56150b().clipRect(rect, op3);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        m56150b().concat(matrix);
    }

    /* JADX INFO: renamed from: d */
    public final int m56151d(Bitmap bitmap, Paint paint, Rect rect) {
        int pixel = -16777216;
        if (bitmap.isRecycled()) {
            return -16777216;
        }
        WeakHashMap weakHashMap = this.f76005h;
        C23465k c23465k = (C23465k) weakHashMap.get(bitmap);
        if (c23465k != null && ((Number) c23465k.f92937w).intValue() == bitmap.getGenerationId()) {
            return ((Number) c23465k.f92938x).intValue();
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        Bitmap bitmap2 = this.f76002e;
        Rect rect2 = this.f76004g;
        Canvas canvas = this.f76003f;
        if (config == config2 && Build.VERSION.SDK_INT >= 31) {
            BitmapShader bitmapShaderM56148c = m56148c(paint);
            canvas.drawBitmap(bitmap.asShared(), rect, rect2, paint);
            if (bitmapShaderM56148c != null && paint != null) {
                paint.setShader(bitmapShaderM56148c);
            }
            pixel = bitmap2.getPixel(0, 0);
        } else if (bitmap.getConfig() != config2) {
            BitmapShader bitmapShaderM56148c2 = m56148c(paint);
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            if (bitmapShaderM56148c2 != null && paint != null) {
                paint.setShader(bitmapShaderM56148c2);
            }
            pixel = bitmap2.getPixel(0, 0);
        }
        weakHashMap.put(bitmap, new C23465k(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(pixel)));
        return pixel;
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        m56150b().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i13, int i14, int i15, int i16) {
        m56150b().drawARGB(i13, i14, i15, i16);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF oval, float f13, float f14, boolean z4, Paint paint) {
        AbstractC22676k.m65750j(oval, "oval");
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawArc(oval, f13, f14, z4, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] colors, int i13, int i14, float f13, float f14, int i15, int i16, boolean z4, Paint paint) {
        AbstractC22676k.m65750j(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i13, int i14, float[] verts, int i15, int[] iArr, int i16, Paint paint) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        AbstractC22676k.m65750j(verts, "verts");
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f13, float f14, float f15, Paint paint) {
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawCircle(f13, f14, f15, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i13) {
        m56150b().drawColor(i13);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF outer, float f13, float f14, RectF inner, float f15, float f16, Paint paint) {
        AbstractC22676k.m65750j(outer, "outer");
        AbstractC22676k.m65750j(inner, "inner");
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawDoubleRoundRect(outer, f13, f14, inner, f15, f16, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] glyphIds, int i13, float[] positions, int i14, int i15, Font font, Paint paint) {
        AbstractC22676k.m65750j(glyphIds, "glyphIds");
        AbstractC22676k.m65750j(positions, "positions");
        AbstractC22676k.m65750j(font, "font");
        AbstractC22676k.m65750j(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f13, float f14, float f15, float f16, Paint paint) {
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawLine(f13, f14, f15, f16, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] pts, int i13, int i14, Paint paint) {
        AbstractC22676k.m65750j(pts, "pts");
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawLines(pts, i13, i14, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawMesh(Mesh mesh, BlendMode blendMode, Paint paint) {
        AbstractC22676k.m65750j(mesh, "mesh");
        AbstractC22676k.m65750j(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF oval, Paint paint) {
        AbstractC22676k.m65750j(oval, "oval");
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawOval(oval, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawPaint(paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch patch, Rect dst, Paint paint) {
        AbstractC22676k.m65750j(patch, "patch");
        AbstractC22676k.m65750j(dst, "dst");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawPath(path, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        AbstractC22676k.m65750j(picture, "picture");
        Paint paint = this.f75999b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        m56150b().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f13, float f14, Paint paint) {
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawPoint(f13, f14, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i13, int i14, Paint paint) {
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawPoints(fArr, i13, i14, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String text, float[] pos, Paint paint) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(pos, "pos");
        AbstractC22676k.m65750j(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i13, int i14, int i15) {
        m56150b().drawRGB(i13, i14, i15);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rect, Paint paint) {
        AbstractC22676k.m65750j(rect, "rect");
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawRect(rect, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        AbstractC22676k.m65750j(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rect, float f13, float f14, Paint paint) {
        AbstractC22676k.m65750j(rect, "rect");
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawRoundRect(rect, f13, f14, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] text, int i13, int i14, float f13, float f14, Paint paint) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(paint, "paint");
        paint.getTextBounds(text, i13, i14, this.f76001d);
        m56149a(f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String text, Path path, float f13, float f14, Paint paint) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] text, int i13, int i14, int i15, int i16, float f13, float f14, boolean z4, Paint paint) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(paint, "paint");
        paint.getTextBounds(text, 0, i13 + i14, this.f76001d);
        m56149a(f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode mode, int i13, float[] verts, int i14, float[] fArr, int i15, int[] iArr, int i16, short[] sArr, int i17, int i18, Paint paint) {
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(verts, "verts");
        AbstractC22676k.m65750j(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        m56150b().enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect bounds) {
        AbstractC22676k.m65750j(bounds, "bounds");
        return m56150b().getClipBounds(bounds);
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return m56150b().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return m56150b().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return m56150b().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix ctm) {
        AbstractC22676k.m65750j(ctm, "ctm");
        m56150b().getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return m56150b().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return m56150b().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return m56150b().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return m56150b().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isHardwareAccelerated() {
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return m56150b().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rect, Canvas.EdgeType type) {
        AbstractC22676k.m65750j(rect, "rect");
        AbstractC22676k.m65750j(type, "type");
        return m56150b().quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        m56150b().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i13) {
        m56150b().restoreToCount(i13);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f13) {
        m56150b().rotate(f13);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return m56150b().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i13) {
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        int iSaveLayer = m56150b().saveLayer(rectF, paint, i13);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderM56148c);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i13, int i14) {
        return m56150b().saveLayerAlpha(rectF, i13, i14);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f13, float f14) {
        m56150b().scale(f13, f14);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        m56150b().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i13) {
        m56150b().setDensity(i13);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        m56150b().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        m56150b().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f13, float f14) {
        m56150b().skew(f13, f14);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f13, float f14) {
        m56150b().translate(f13, f14);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        AbstractC22676k.m65750j(rect, "rect");
        return m56150b().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        AbstractC22676k.m65750j(path, "path");
        return m56150b().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op3) {
        AbstractC22676k.m65750j(rect, "rect");
        AbstractC22676k.m65750j(op3, "op");
        return m56150b().clipRect(rect, op3);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] colors, int i13, int i14, int i15, int i16, int i17, int i18, boolean z4, Paint paint) {
        AbstractC22676k.m65750j(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j7) {
        m56150b().drawColor(j7);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] text, int i13, int i14, float[] pos, Paint paint) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(pos, "pos");
        AbstractC22676k.m65750j(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] text, int i13, int i14, Path path, float f13, float f14, Paint paint) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rect) {
        AbstractC22676k.m65750j(rect, "rect");
        return m56150b().quickReject(rect);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i13) {
        return m56150b().saveLayerAlpha(rectF, i13);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f13, float f14, float f15, float f16) {
        return m56150b().clipOutRect(f13, f14, f15, f16);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rect) {
        AbstractC22676k.m65750j(rect, "rect");
        return m56150b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f13, float f14, Paint paint) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        int iM56151d = m56151d(bitmap, paint, null);
        Paint paint2 = this.f75999b;
        paint2.setColor(iM56151d);
        paint2.setColorFilter(null);
        m56150b().drawRect(f13, f14, f13 + bitmap.getWidth(), f14 + bitmap.getHeight(), paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i13, PorterDuff.Mode mode) {
        AbstractC22676k.m65750j(mode, "mode");
        m56150b().drawColor(i13, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String text, float f13, float f14, Paint paint) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(paint, "paint");
        paint.getTextBounds(text, 0, text.length(), this.f76001d);
        m56149a(f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence text, int i13, int i14, int i15, int i16, float f13, float f14, boolean z4, Paint paint) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(paint, "paint");
        paint.getTextBounds(text.toString(), i13, i14, this.f76001d);
        m56149a(f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType type) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(type, "type");
        return m56150b().quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f13, float f14, float f15, float f16, int i13, int i14) {
        return m56150b().saveLayerAlpha(f13, f14, f15, f16, i13, i14);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i13, int i14, int i15, int i16) {
        return m56150b().clipOutRect(i13, i14, i15, i16);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        AbstractC22676k.m65750j(rect, "rect");
        return m56150b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f13, float f14, float f15, float f16, float f17, float f18, boolean z4, Paint paint) {
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawArc(f13, f14, f15, f16, f17, f18, z4, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i13, BlendMode mode) {
        AbstractC22676k.m65750j(mode, "mode");
        m56150b().drawColor(i13, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF outer, float[] outerRadii, RectF inner, float[] innerRadii, Paint paint) {
        AbstractC22676k.m65750j(outer, "outer");
        AbstractC22676k.m65750j(outerRadii, "outerRadii");
        AbstractC22676k.m65750j(inner, "inner");
        AbstractC22676k.m65750j(innerRadii, "innerRadii");
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] pts, Paint paint) {
        AbstractC22676k.m65750j(pts, "pts");
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawLines(pts, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f13, float f14, float f15, float f16, Paint paint) {
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawOval(f13, f14, f15, f16, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch patch, RectF dst, Paint paint) {
        AbstractC22676k.m65750j(patch, "patch");
        AbstractC22676k.m65750j(dst, "dst");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF dst) {
        AbstractC22676k.m65750j(picture, "picture");
        AbstractC22676k.m65750j(dst, "dst");
        Paint paint = this.f75999b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        m56150b().drawRect(dst, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] pts, Paint paint) {
        AbstractC22676k.m65750j(pts, "pts");
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawPoints(pts, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect r10, Paint paint) {
        AbstractC22676k.m65750j(r10, "r");
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawRect(r10, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f13, float f14, float f15, float f16, float f17, float f18, Paint paint) {
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawRoundRect(f13, f14, f15, f16, f17, f18, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        AbstractC22676k.m65750j(path, "path");
        return m56150b().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        int iSaveLayer = m56150b().saveLayer(rectF, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderM56148c);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f13, float f14, float f15, float f16, int i13) {
        return m56150b().saveLayerAlpha(f13, f14, f15, f16, i13);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f13, float f14, float f15, float f16, Region.Op op3) {
        AbstractC22676k.m65750j(op3, "op");
        return m56150b().clipRect(f13, f14, f15, f16, op3);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j7, BlendMode mode) {
        AbstractC22676k.m65750j(mode, "mode");
        m56150b().drawColor(j7, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String text, int i13, int i14, float f13, float f14, Paint paint) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(paint, "paint");
        paint.getTextBounds(text, i13, i14, this.f76001d);
        m56149a(f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText text, int i13, int i14, int i15, int i16, float f13, float f14, boolean z4, Paint paint) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(paint, "paint");
        paint.getTextBounds(text.toString(), i13, i14, this.f76001d);
        m56149a(f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f13, float f14, float f15, float f16, Canvas.EdgeType type) {
        AbstractC22676k.m65750j(type, "type");
        return m56150b().quickReject(f13, f14, f15, f16, type);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f13, float f14, float f15, float f16) {
        return m56150b().clipRect(f13, f14, f15, f16);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f13, float f14, float f15, float f16) {
        return m56150b().quickReject(f13, f14, f15, f16);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i13, int i14, int i15, int i16) {
        return m56150b().clipRect(i13, i14, i15, i16);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF dst, Paint paint) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        AbstractC22676k.m65750j(dst, "dst");
        int iM56151d = m56151d(bitmap, paint, rect);
        Paint paint2 = this.f75999b;
        paint2.setColor(iM56151d);
        paint2.setColorFilter(null);
        m56150b().drawRect(dst, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect dst) {
        AbstractC22676k.m65750j(picture, "picture");
        AbstractC22676k.m65750j(dst, "dst");
        Paint paint = this.f75999b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        m56150b().drawRect(dst, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f13, float f14, float f15, float f16, Paint paint) {
        AbstractC22676k.m65750j(paint, "paint");
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        m56150b().drawRect(f13, f14, f15, f16, paint);
        paint.setShader(bitmapShaderM56148c);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence text, int i13, int i14, float f13, float f14, Paint paint) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(paint, "paint");
        paint.getTextBounds(text.toString(), 0, text.length(), this.f76001d);
        m56149a(f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f13, float f14, float f15, float f16, Paint paint, int i13) {
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        int iSaveLayer = m56150b().saveLayer(f13, f14, f15, f16, paint, i13);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderM56148c);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f13, float f14, float f15, float f16, Paint paint) {
        BitmapShader bitmapShaderM56148c = m56148c(paint);
        int iSaveLayer = m56150b().saveLayer(f13, f14, f15, f16, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderM56148c);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect dst, Paint paint) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        AbstractC22676k.m65750j(dst, "dst");
        int iM56151d = m56151d(bitmap, paint, rect);
        Paint paint2 = this.f75999b;
        paint2.setColor(iM56151d);
        paint2.setColorFilter(null);
        m56150b().drawRect(dst, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        AbstractC22676k.m65750j(matrix, "matrix");
        int iM56151d = m56151d(bitmap, paint, null);
        Paint paint2 = this.f75999b;
        paint2.setColor(iM56151d);
        paint2.setColorFilter(null);
        int iSave = m56150b().save();
        m56150b().setMatrix(matrix);
        m56150b().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint2);
        m56150b().restoreToCount(iSave);
    }
}
