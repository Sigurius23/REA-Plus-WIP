package com.whoop.p069ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tr2.InterfaceC34116n;
import vu1.AbstractC36510a;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 M2\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0007¢\u0006\u0004\b \u0010!R*\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@GX\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u00100\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@GX\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0011R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010,R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010,R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010,R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010<R\u0014\u0010D\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010@R&\u0010I\u001a\u0012\u0012\u0004\u0012\u00020\u00060Ej\b\u0012\u0004\u0012\u00020\u0006`F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006N"}, m65681d2 = {"Lcom/whoop/ui/views/RealTimeHeartGraph;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "top", "bottom", "Ll83/a0;", "d", "(II)V", "newHR", "a", "(I)V", "", "history", "b", "(Ljava/util/List;)V", "", "changed", "left", "right", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "c", "()V", "", "value", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "F", "getGradientScale", "()F", "setGradientScale", "(F)V", "gradientScale", "x", "I", "getGradientColor", "()I", "setGradientColor", "gradientColor", "Ltr2/n;", "y", "Ltr2/n;", "logger", "z", "maxHR", "E", "avgHR", "hrTotal", "Landroid/graphics/Path;", "G", "Landroid/graphics/Path;", "area", "Landroid/graphics/Paint;", "H", "Landroid/graphics/Paint;", "areaPaint", "line", "J", "linePaint", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "K", "Ljava/util/ArrayList;", "points", "L", "Z", "skippedFirstPoint", "M", "legacy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RealTimeHeartGraph extends View {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private int avgHR;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private int hrTotal;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Path area;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final Paint areaPaint;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Path line;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final Paint linePaint;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private ArrayList<Integer> points;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean skippedFirstPoint;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float gradientScale;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int gradientColor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private int maxHR;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealTimeHeartGraph(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: d */
    private final void m27464d(int top, int bottom) {
        this.areaPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (bottom - top) * this.gradientScale, getResources().getColor(AbstractC36510a.f156020b, getContext().getTheme()), this.gradientColor, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: a */
    public final void m27465a(int newHR) {
        if (!this.skippedFirstPoint) {
            this.skippedFirstPoint = true;
            return;
        }
        this.points.add(Integer.valueOf(newHR));
        int i13 = this.hrTotal + newHR;
        this.hrTotal = i13;
        this.avgHR = i13 / this.points.size();
        int i14 = this.maxHR;
        if (i14 >= newHR) {
            newHR = i14;
        }
        this.maxHR = newHR;
        m27467c();
    }

    /* JADX INFO: renamed from: b */
    public final void m27466b(List<Integer> history) {
        AbstractC22676k.m65750j(history, "history");
        this.points.clear();
        this.hrTotal = 0;
        Iterator<T> it = history.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            this.points.add(Integer.valueOf(iIntValue));
            this.hrTotal += iIntValue;
            int i13 = this.maxHR;
            if (i13 >= iIntValue) {
                iIntValue = i13;
            }
            this.maxHR = iIntValue;
        }
        if (this.points.size() > 0) {
            this.avgHR = this.hrTotal / this.points.size();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27467c() {
        if (this.points.size() < 2) {
            return;
        }
        float width = getWidth() / (this.points.size() - 1.0f);
        int height = (int) (getHeight() * 0.2f);
        float f13 = this.avgHR * 1.6f;
        float f14 = this.maxHR * 1.6f;
        if (f13 < f14) {
            f13 = f14;
        }
        float height2 = getHeight();
        if (f13 < 1.0f) {
            f13 = 1.0f;
        }
        float f15 = height2 / f13;
        float size = this.points.size() > getWidth() ? this.points.size() / getWidth() : 1.0f;
        this.line.reset();
        this.area.reset();
        this.line.moveTo(0.0f, getHeight() - (this.points.get(0).floatValue() * f15));
        this.area.moveTo(0.0f, getHeight());
        for (float f16 = 0.0f; f16 < this.points.size(); f16 += size) {
            Integer num = this.points.get((int) f16);
            AbstractC22676k.m65749i(num, "get(...)");
            float f17 = f16 * width;
            float height3 = ((getHeight() - height) - (num.intValue() * f15)) + height;
            this.line.lineTo(f17, height3);
            this.area.lineTo(f17, height3);
        }
        this.area.lineTo(getWidth(), getHeight());
        this.area.lineTo(0.0f, getHeight());
        invalidate();
    }

    public final int getGradientColor() {
        return this.gradientColor;
    }

    public final float getGradientScale() {
        return this.gradientScale;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.area, this.areaPaint);
        canvas.drawPath(this.line, this.linePaint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        m27464d(top, bottom);
        super.onLayout(changed, left, top, right, bottom);
        m27467c();
    }

    public final void setGradientColor(int i13) {
        this.gradientColor = i13;
        invalidate();
    }

    public final void setGradientScale(float f13) {
        this.gradientScale = f13;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTimeHeartGraph(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.gradientScale = 1.0f;
        this.gradientColor = getResources().getColor(AbstractC36510a.f156016Y, context.getTheme());
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC36519j.f156171V, i13, 0);
            setGradientScale(typedArrayObtainStyledAttributes.getFloat(AbstractC36519j.f156175X, 1.0f));
            setGradientColor(typedArrayObtainStyledAttributes.getInt(AbstractC36519j.f156173W, getResources().getColor(AbstractC36510a.f156016Y, context.getTheme())));
            typedArrayObtainStyledAttributes.recycle();
            this.logger = InterfaceC34116n.INSTANCE.m107848a("RealTimeHeartGraph");
            this.area = new Path();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            this.areaPaint = paint;
            this.line = new Path();
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(4.0f);
            paint2.setColor(getResources().getColor(AbstractC36510a.f156020b, context.getTheme()));
            this.linePaint = paint2;
            this.points = new ArrayList<>(0);
        } catch (Throwable th3) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th3;
        }
    }

    public /* synthetic */ RealTimeHeartGraph(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
