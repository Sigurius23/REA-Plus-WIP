package s53;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import io.github.florent37.shapeofview.shapes.BubbleView;
import java.util.WeakHashMap;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p508ty.C34249c;
import q30.C29938w0;
import q83.AbstractC30060g;
import t53.InterfaceC33546a;

/* JADX INFO: renamed from: s53.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC32228c extends FrameLayout {

    /* JADX INFO: renamed from: E */
    public boolean f133437E;

    /* JADX INFO: renamed from: F */
    public Bitmap f133438F;

    /* JADX INFO: renamed from: G */
    public final Path f133439G;

    /* JADX INFO: renamed from: w */
    public final Paint f133440w;

    /* JADX INFO: renamed from: x */
    public final Path f133441x;

    /* JADX INFO: renamed from: y */
    public Drawable f133442y;

    /* JADX INFO: renamed from: z */
    public final C29938w0 f133443z;

    public AbstractC32228c(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f133440w = paint;
        this.f133441x = new Path();
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f133442y = null;
        this.f133443z = new C29938w0(13);
        this.f133437E = true;
        this.f133439G = new Path();
        paint.setAntiAlias(true);
        setDrawingCacheEnabled(true);
        setWillNotDraw(false);
        paint.setColor(-16776961);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
        paint.setXfermode(porterDuffXfermode);
        setLayerType(1, null);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC32226a.f133434b);
            if (typedArrayObtainStyledAttributes.hasValue(0) && -1 != (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1))) {
                setDrawable(resourceId);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m100252a(float f13) {
        return f13 * getContext().getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: b */
    public final void m100253b() {
        this.f133437E = true;
        postInvalidate();
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01d3  */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f13;
        Path path;
        super.dispatchDraw(canvas);
        boolean z4 = this.f133437E;
        Path path2 = this.f133439G;
        if (z4) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            path2.reset();
            path2.addRect(0.0f, 0.0f, getWidth() * 1.0f, getHeight() * 1.0f, Path.Direction.CW);
            C29938w0 c29938w0 = this.f133443z;
            if (c29938w0 != null) {
                Path path3 = (Path) c29938w0.f122260x;
                if (width <= 0 || height <= 0) {
                    f13 = 0.0f;
                } else {
                    path3.reset();
                    InterfaceC33546a interfaceC33546a = (InterfaceC33546a) c29938w0.f122262z;
                    if (interfaceC33546a != null) {
                        RectF rectF = new RectF(0.0f, 0.0f, width, height);
                        BubbleView bubbleView = (BubbleView) ((C34249c) interfaceC33546a).f143660x;
                        float f14 = bubbleView.f74951I;
                        path = new Path();
                        float f15 = f14 < 0.0f ? 0.0f : f14;
                        float f16 = f14 < 0.0f ? 0.0f : f14;
                        float f17 = f14 < 0.0f ? 0.0f : f14;
                        if (f14 < 0.0f) {
                            f14 = 0.0f;
                        }
                        int i13 = bubbleView.f74950H;
                        f13 = 0.0f;
                        float f18 = i13 == 3 ? bubbleView.f74952J : 0.0f;
                        float f19 = i13 == 2 ? bubbleView.f74952J : 0.0f;
                        float f24 = i13 == 4 ? bubbleView.f74952J : 0.0f;
                        float f25 = i13 == 1 ? bubbleView.f74952J : 0.0f;
                        float f26 = rectF.left;
                        float f27 = f18 + f26;
                        float f28 = f19 + rectF.top;
                        float f29 = rectF.right;
                        float f34 = f29 - f24;
                        float f35 = f14;
                        float f36 = rectF.bottom - f25;
                        float f37 = bubbleView.f74954L * (f26 + f29);
                        float f38 = f15 / 2.0f;
                        float f39 = f27 + f38;
                        path.moveTo(f39, f28);
                        if (bubbleView.f74950H == 2) {
                            path.lineTo(f37 - bubbleView.f74953K, f28);
                            path.lineTo(f37, rectF.top);
                            path.lineTo(bubbleView.f74953K + f37, f28);
                        }
                        float f43 = f16 / 2.0f;
                        path.lineTo(f34 - f43, f28);
                        path.quadTo(f34, f28, f34, f28 + f43);
                        if (bubbleView.f74950H == 4) {
                            path.lineTo(f34, (f36 - ((1.0f - bubbleView.f74954L) * f36)) - bubbleView.f74953K);
                            path.lineTo(rectF.right, f36 - ((1.0f - bubbleView.f74954L) * f36));
                            path.lineTo(f34, (f36 - ((1.0f - bubbleView.f74954L) * f36)) + bubbleView.f74953K);
                        }
                        float f44 = f35 / 2.0f;
                        path.lineTo(f34, f36 - f44);
                        path.quadTo(f34, f36, f34 - f44, f36);
                        if (bubbleView.f74950H == 1) {
                            path.lineTo(bubbleView.f74953K + f37, f36);
                            path.lineTo(f37, rectF.bottom);
                            path.lineTo(f37 - bubbleView.f74953K, f36);
                        }
                        float f45 = f17 / 2.0f;
                        path.lineTo(f27 + f45, f36);
                        path.quadTo(f27, f36, f27, f36 - f45);
                        if (bubbleView.f74950H == 3) {
                            path.lineTo(f27, (f36 - ((1.0f - bubbleView.f74954L) * f36)) + bubbleView.f74953K);
                            path.lineTo(rectF.left, f36 - ((1.0f - bubbleView.f74954L) * f36));
                            path.lineTo(f27, (f36 - ((1.0f - bubbleView.f74954L) * f36)) - bubbleView.f74953K);
                        }
                        path.lineTo(f27, f28 + f38);
                        path.quadTo(f27, f28, f39, f28);
                        path.close();
                    } else {
                        f13 = 0.0f;
                        path = null;
                    }
                    if (path != null) {
                        path3.set(path);
                    }
                    Path path4 = this.f133441x;
                    path4.reset();
                    path4.set(path3);
                    if (isInEditMode() || this.f133442y != null) {
                        Bitmap bitmap = this.f133438F;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        this.f133438F = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(this.f133438F);
                        Drawable drawable = this.f133442y;
                        if (drawable != null) {
                            drawable.setBounds(0, 0, width, height);
                            this.f133442y.draw(canvas2);
                        } else {
                            canvas2.drawPath(path4, (Paint) c29938w0.f122261y);
                        }
                    }
                    path2 = path2;
                    path2.op(path4, Path.Op.DIFFERENCE);
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    if (AbstractC16877h0.m47510e(this) > f13) {
                        try {
                            setOutlineProvider(getOutlineProvider());
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            } else {
                f13 = 0.0f;
            }
            postInvalidate();
            this.f133437E = false;
        } else {
            f13 = 0.0f;
        }
        boolean zIsInEditMode = isInEditMode();
        Paint paint = this.f133440w;
        if (!zIsInEditMode && this.f133442y == null) {
            canvas.drawPath(path2, paint);
            return;
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        float f46 = f13;
        canvas.drawBitmap(this.f133438F, f46, f46, paint);
    }

    @Override // android.view.View
    @TargetApi(21)
    public ViewOutlineProvider getOutlineProvider() {
        return new C32227b(this, 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        if (z4) {
            m100253b();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i13) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
    }

    public void setClipPathCreator(InterfaceC33546a interfaceC33546a) {
        this.f133443z.f122262z = interfaceC33546a;
        m100253b();
    }

    public void setDrawable(Drawable drawable) {
        this.f133442y = drawable;
        m100253b();
    }

    public void setDrawable(int i13) {
        setDrawable(AbstractC30060g.m92133x(getContext(), i13));
    }
}
