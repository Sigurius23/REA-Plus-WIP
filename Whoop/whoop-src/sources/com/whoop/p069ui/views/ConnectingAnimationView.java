package com.whoop.p069ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kn2.RunnableC22599a;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vu1.AbstractC36510a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ7\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010%\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010&\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010 R\u0016\u0010(\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010 R\u0016\u0010*\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010 R\u0014\u0010+\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0016\u0010.\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010B¨\u0006F"}, m65681d2 = {"Lcom/whoop/ui/views/ConnectingAnimationView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll83/a0;", "c", "()V", "f", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "blueOpaque", "x", "blue", "", "y", "F", "halfHeight", "z", "radius", "E", "diameter", "strokeW", "G", "middleW", "H", "middlePadding", "dotRadius", "J", "Z", "flip", "Landroid/graphics/Bitmap;", "K", "Landroid/graphics/Bitmap;", "bitmap", "L", "Landroid/graphics/Canvas;", "dotCanvas", "Landroid/os/Handler;", "M", "Landroid/os/Handler;", "drawHandler", "Landroid/os/HandlerThread;", "N", "Landroid/os/HandlerThread;", "backgroundThread", "O", "uiHandler", "Landroid/graphics/Paint;", "P", "Landroid/graphics/Paint;", "paint", "Q", "paintStroke", "legacy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ConnectingAnimationView extends View {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private float diameter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final float strokeW;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private float middleW;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private float middlePadding;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final float dotRadius;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean flip;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private Bitmap bitmap;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private Canvas dotCanvas;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final Handler drawHandler;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final HandlerThread backgroundThread;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final Handler uiHandler;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final Paint paintStroke;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int blueOpaque;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int blue;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private float halfHeight;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private float radius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectingAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.strokeW = 4.0f;
        this.middlePadding = 6.0f;
        this.dotRadius = 5.0f;
        this.flip = true;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(4.0f);
        paint2.setColor(-16777216);
        this.paintStroke = paint2;
        setWillNotDraw(false);
        this.blue = AbstractC32122c.getColor(getContext(), AbstractC36510a.f156020b);
        this.blueOpaque = AbstractC32122c.getColor(getContext(), AbstractC36510a.f156029h);
        this.uiHandler = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("ConnectingAnimationView draw thread", 10);
        handlerThread.start();
        this.drawHandler = new Handler(handlerThread.getLooper());
        this.backgroundThread = handlerThread;
    }

    /* JADX INFO: renamed from: c */
    private final void m27398c() {
        int i13;
        int i14;
        int i15 = (int) this.middleW;
        int i16 = ((int) this.dotRadius) * 2;
        if (i15 > 0 && i16 > 0) {
            this.bitmap = Bitmap.createBitmap(i15, i16, Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.bitmap;
            AbstractC22676k.m65748h(bitmap, "null cannot be cast to non-null type android.graphics.Bitmap");
            this.dotCanvas = new Canvas(bitmap);
        }
        Canvas canvas = this.dotCanvas;
        if (canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            boolean z4 = this.flip;
            if (z4) {
                i13 = this.blue;
                i14 = this.blueOpaque;
            } else {
                i13 = this.blueOpaque;
                i14 = this.blue;
            }
            this.flip = !z4;
            this.paint.setColor(i13);
            float f13 = this.dotRadius;
            canvas.drawCircle(f13, f13, f13, this.paint);
            float width = canvas.getWidth();
            float f14 = this.dotRadius;
            canvas.drawCircle(width - f14, f14, f14, this.paint);
            float f15 = this.middleW / 20.0f;
            for (int i17 = 1; i17 < 20; i17++) {
                if (i17 % 2 == 0) {
                    this.paint.setColor(i13);
                } else {
                    this.paint.setColor(i14);
                }
                float f16 = this.dotRadius;
                canvas.drawCircle(i17 * f15, f16, f16, this.paint);
            }
        }
        this.uiHandler.post(new RunnableC22599a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m27399d(ConnectingAnimationView connectingAnimationView) {
        connectingAnimationView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m27400e(ConnectingAnimationView connectingAnimationView) {
        connectingAnimationView.m27398c();
    }

    /* JADX INFO: renamed from: f */
    public final void m27401f() {
        this.backgroundThread.quitSafely();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        System.currentTimeMillis();
        this.paint.setColor(this.blue);
        float f13 = this.halfHeight;
        canvas.drawCircle(f13, f13, this.radius, this.paint);
        float width = canvas.getWidth();
        float f14 = this.halfHeight;
        canvas.drawCircle(width - f14, f14, this.radius, this.paint);
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.diameter + this.middlePadding, this.radius, (Paint) null);
        }
        float f15 = this.halfHeight;
        canvas.drawCircle(f15, f15, this.radius, this.paintStroke);
        float width2 = canvas.getWidth();
        float f16 = this.halfHeight;
        canvas.drawCircle(width2 - f16, f16, this.radius, this.paintStroke);
        this.drawHandler.postDelayed(new RunnableC22599a(this, 0), 200L);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        float height = getHeight() / 2.0f;
        this.halfHeight = height;
        float f13 = height - (this.strokeW / 2.0f);
        this.radius = f13;
        this.diameter = f13 * 2.0f;
        float width = getWidth();
        float f14 = this.radius;
        float f15 = (width - (4.0f * f14)) - (this.middlePadding * 2.0f);
        this.middleW = f15;
        Log.d("ConnectingAnimationView", "onLayout radius = " + f14 + ", middleW = " + f15);
        m27398c();
    }
}
