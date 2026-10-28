package com.whoop.whooplive.live.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.whoop.p069ui.C10594l;
import e50.C12723b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import l83.C23454a0;
import l83.C23465k;
import o52.C27566m0;
import p319m4.AbstractC25012a;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import rd1.C31245d;
import rq0.C31703x;
import sj0.C32562a;
import vu1.AbstractC36510a;
import wb3.AbstractC37056f;
import zg3.C40634a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001VB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0014¢\u0006\u0004\b%\u0010\rJ\u000f\u0010&\u001a\u00020\u000bH\u0014¢\u0006\u0004\b&\u0010\rJ\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b'\u0010\u0011J\u001d\u0010*\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b¢\u0006\u0004\b*\u0010$R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R<\u00107\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00170201j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001702`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010=R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010=R\u0014\u0010D\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010CR\u0014\u0010F\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010?R\u0016\u0010J\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010?R\u0016\u0010L\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010?R\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006W"}, m65681d2 = {"Lcom/whoop/whooplive/live/views/WhoopGraphView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "k", "()V", "Landroid/graphics/Canvas;", "canvas", "d", "(Landroid/graphics/Canvas;)V", "f", "Landroid/graphics/Path;", "path", "e", "(Landroid/graphics/Path;)V", "", "min", "max", "j", "(FF)V", "Lsj0/a;", "rtr", "c", "(Lsj0/a;)V", "l", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "lineColor", "fillColor", "i", "Landroid/graphics/Paint;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/graphics/Paint;", "fillPaint", "x", "linePaint", "Ljava/util/ArrayList;", "Ll83/k;", "", "Lkotlin/collections/ArrayList;", "y", "Ljava/util/ArrayList;", "values", "Landroid/graphics/Bitmap;", "z", "Landroid/graphics/Bitmap;", "bitmap", "E", "I", "parentWidth", "F", "parentHeight", "G", "H", "Landroid/graphics/Path;", "linePath", "J", "fillPath", "K", "minHeartRate", "L", "maxHeartRate", "M", "heartRateRange", "Lrd1/d;", "N", "Lrd1/d;", "realTimeStateMachine", "Lcom/whoop/ui/l;", "O", "Lcom/whoop/ui/l;", "subscriptionHandler", "P", "a", "whooplive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WhoopGraphView extends View {

    /* JADX INFO: renamed from: Q */
    public static final int f33380Q = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private int parentWidth;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private int parentHeight;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int lineColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private int fillColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Path linePath;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final Path fillPath;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private float minHeartRate;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private float maxHeartRate;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private float heartRateRange;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private C31245d realTimeStateMachine;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final C10594l subscriptionHandler;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private Paint fillPaint;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private Paint linePaint;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final ArrayList<C23465k> values;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private Bitmap bitmap;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WhoopGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: c */
    private final void m28642c(C32562a rtr) {
        if (rtr != null) {
            m28650l(rtr);
            if (this.values.size() > 0) {
                m28649k();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m28643d(Canvas canvas) {
        this.fillPath.reset();
        int i13 = this.parentHeight;
        float fFloatValue = i13 - (((((Number) this.values.get(0).f92938x).floatValue() - this.minHeartRate) / this.heartRateRange) * i13);
        m28644e(this.fillPath);
        this.fillPath.lineTo(this.parentWidth, this.parentHeight);
        this.fillPath.lineTo(0.0f, this.parentHeight);
        this.fillPath.lineTo(0.0f, fFloatValue);
        this.fillPath.close();
        this.fillPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.parentHeight, this.fillColor, 0, Shader.TileMode.MIRROR));
        canvas.drawPath(this.fillPath, this.fillPaint);
    }

    /* JADX INFO: renamed from: e */
    private final void m28644e(Path path) {
        int i13 = 0;
        long jLongValue = ((Number) this.values.get(0).f92937w).longValue();
        ((Number) ((C23465k) AbstractC25012a.m73371d(this.values, 1)).f92937w).longValue();
        float fLongValue = this.parentWidth / (((Number) ((C23465k) AbstractC25012a.m73371d(this.values, 1)).f92937w).longValue() - jLongValue);
        int i14 = this.parentHeight;
        path.moveTo(0.0f, i14 - (((((Number) this.values.get(0).f92938x).floatValue() - this.minHeartRate) / this.heartRateRange) * i14));
        for (Object obj : this.values) {
            int i15 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C23465k c23465k = (C23465k) obj;
            if (i13 > 0) {
                float fFloatValue = (((Number) c23465k.f92938x).floatValue() - this.minHeartRate) / this.heartRateRange;
                float fLongValue2 = (((Number) c23465k.f92937w).longValue() - jLongValue) * fLongValue;
                int i16 = this.parentHeight;
                path.lineTo(fLongValue2, i16 - (i16 * fFloatValue));
            }
            i13 = i15;
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m28645f(Canvas canvas) {
        this.linePath.reset();
        m28644e(this.linePath);
        this.linePaint.setStrokeWidth(4.0f);
        this.linePaint.setColor(this.lineColor);
        canvas.drawPath(this.linePath, this.linePaint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m28646g(WhoopGraphView whoopGraphView, C32562a c32562a) {
        whoopGraphView.m28642c(c32562a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m28647h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j */
    private final void m28648j(float min, float max) {
        this.maxHeartRate = max;
        this.minHeartRate = min;
        this.heartRateRange = max - min;
        m28649k();
    }

    /* JADX INFO: renamed from: k */
    private final void m28649k() {
        int i13;
        if (this.parentWidth == 0 || 2 > this.values.size() || (i13 = this.parentHeight) == 0) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.parentWidth, i13, Bitmap.Config.ARGB_8888);
        this.bitmap = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.save();
            m28643d(canvas);
            m28645f(canvas);
            canvas.restore();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    private final void m28650l(C32562a rtr) {
        float heartRate = rtr.getHeartRate();
        if (heartRate == 0.0f) {
            return;
        }
        float f13 = this.minHeartRate;
        if (f13 > heartRate) {
            m28648j(heartRate - 1, this.maxHeartRate);
        } else if (heartRate > this.maxHeartRate) {
            m28648j(f13, 1 + heartRate);
        }
        this.values.add(new C23465k(Long.valueOf(rtr.getTimeStamp().m41583j()), Float.valueOf(heartRate)));
    }

    /* JADX INFO: renamed from: i */
    public final void m28651i(int lineColor, int fillColor) {
        this.lineColor = AbstractC32122c.getColor(getContext(), lineColor);
        this.fillColor = AbstractC32122c.getColor(getContext(), fillColor);
        m28649k();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.subscriptionHandler.m27330a(C12723b.m35566a().m35571f().m96241P().m122652B(C40634a.m131874a()).m122661K(new C27566m0(new C31703x(this, 21), 27)));
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.subscriptionHandler.m27331b();
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
        this.bitmap = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.parentWidth = View.MeasureSpec.getSize(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        this.parentHeight = size;
        setMeasuredDimension(this.parentWidth, size);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.bitmap == null) {
            m28649k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhoopGraphView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.fillPaint = new Paint(1);
        this.linePaint = new Paint(1);
        this.values = new ArrayList<>();
        this.linePath = new Path();
        this.fillPath = new Path();
        this.minHeartRate = 40.0f;
        this.maxHeartRate = 60.0f;
        this.heartRateRange = 60.0f - 40.0f;
        this.subscriptionHandler = new C10594l();
        this.lineColor = AbstractC32122c.getColor(context, AbstractC36510a.f156020b);
        this.fillColor = AbstractC32122c.getColor(context, AbstractC36510a.f155992A);
        this.fillPaint.setDither(true);
        this.fillPaint.setStyle(Paint.Style.FILL);
        this.linePaint.setDither(true);
        this.linePaint.setStyle(Paint.Style.STROKE);
        this.realTimeStateMachine = C12723b.m35566a().m35571f();
    }
}
