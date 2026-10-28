package de.hdodenhof.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import s53.C32227b;
import w03.AbstractC36686a;

/* JADX INFO: loaded from: classes11.dex */
public class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: U */
    public static final ImageView.ScaleType f39329U = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: V */
    public static final Bitmap.Config f39330V = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: E */
    public final Paint f39331E;

    /* JADX INFO: renamed from: F */
    public final Paint f39332F;

    /* JADX INFO: renamed from: G */
    public int f39333G;

    /* JADX INFO: renamed from: H */
    public int f39334H;

    /* JADX INFO: renamed from: I */
    public int f39335I;

    /* JADX INFO: renamed from: J */
    public Bitmap f39336J;

    /* JADX INFO: renamed from: K */
    public BitmapShader f39337K;

    /* JADX INFO: renamed from: L */
    public int f39338L;

    /* JADX INFO: renamed from: M */
    public int f39339M;

    /* JADX INFO: renamed from: N */
    public float f39340N;

    /* JADX INFO: renamed from: O */
    public float f39341O;

    /* JADX INFO: renamed from: P */
    public ColorFilter f39342P;

    /* JADX INFO: renamed from: Q */
    public boolean f39343Q;

    /* JADX INFO: renamed from: R */
    public boolean f39344R;

    /* JADX INFO: renamed from: S */
    public boolean f39345S;

    /* JADX INFO: renamed from: T */
    public boolean f39346T;

    /* JADX INFO: renamed from: w */
    public final RectF f39347w;

    /* JADX INFO: renamed from: x */
    public final RectF f39348x;

    /* JADX INFO: renamed from: y */
    public final Matrix f39349y;

    /* JADX INFO: renamed from: z */
    public final Paint f39350z;

    public CircleImageView(Context context) {
        super(context);
        this.f39347w = new RectF();
        this.f39348x = new RectF();
        this.f39349y = new Matrix();
        this.f39350z = new Paint();
        this.f39331E = new Paint();
        this.f39332F = new Paint();
        this.f39333G = -16777216;
        this.f39334H = 0;
        this.f39335I = 0;
        m32973a();
    }

    /* JADX INFO: renamed from: a */
    public final void m32973a() {
        super.setScaleType(f39329U);
        this.f39343Q = true;
        setOutlineProvider(new C32227b(this, 2));
        if (this.f39344R) {
            m32975c();
            this.f39344R = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m32974b() {
        Bitmap bitmap = null;
        if (this.f39346T) {
            this.f39336J = null;
        } else {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    try {
                        boolean z4 = drawable instanceof ColorDrawable;
                        Bitmap.Config config = f39330V;
                        Bitmap bitmapCreateBitmap = z4 ? Bitmap.createBitmap(2, 2, config) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        drawable.draw(canvas);
                        bitmap = bitmapCreateBitmap;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
            this.f39336J = bitmap;
        }
        m32975c();
    }

    /* JADX INFO: renamed from: c */
    public final void m32975c() {
        float fWidth;
        float fHeight;
        int i13;
        if (!this.f39343Q) {
            this.f39344R = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.f39336J == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.f39336J;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39337K = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = this.f39350z;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setShader(this.f39337K);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.f39331E;
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f39333G);
        paint2.setStrokeWidth(this.f39334H);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint3 = this.f39332F;
        paint3.setStyle(style2);
        paint3.setAntiAlias(true);
        paint3.setColor(this.f39335I);
        this.f39339M = this.f39336J.getHeight();
        this.f39338L = this.f39336J.getWidth();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMin = Math.min(width, height);
        float paddingLeft = ((width - iMin) / 2.0f) + getPaddingLeft();
        float paddingTop = ((height - iMin) / 2.0f) + getPaddingTop();
        float f13 = iMin;
        RectF rectF = new RectF(paddingLeft, paddingTop, paddingLeft + f13, f13 + paddingTop);
        RectF rectF2 = this.f39348x;
        rectF2.set(rectF);
        this.f39341O = Math.min((rectF2.height() - this.f39334H) / 2.0f, (rectF2.width() - this.f39334H) / 2.0f);
        RectF rectF3 = this.f39347w;
        rectF3.set(rectF2);
        if (!this.f39345S && (i13 = this.f39334H) > 0) {
            float f14 = i13 - 1.0f;
            rectF3.inset(f14, f14);
        }
        this.f39340N = Math.min(rectF3.height() / 2.0f, rectF3.width() / 2.0f);
        if (paint != null) {
            paint.setColorFilter(this.f39342P);
        }
        Matrix matrix = this.f39349y;
        matrix.set(null);
        float fWidth2 = 0.0f;
        if (rectF3.height() * this.f39338L > rectF3.width() * this.f39339M) {
            fWidth = rectF3.height() / this.f39339M;
            fHeight = 0.0f;
            fWidth2 = (rectF3.width() - (this.f39338L * fWidth)) * 0.5f;
        } else {
            fWidth = rectF3.width() / this.f39338L;
            fHeight = (rectF3.height() - (this.f39339M * fWidth)) * 0.5f;
        }
        matrix.setScale(fWidth, fWidth);
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + rectF3.left, ((int) (fHeight + 0.5f)) + rectF3.top);
        this.f39337K.setLocalMatrix(matrix);
        invalidate();
    }

    public int getBorderColor() {
        return this.f39333G;
    }

    public int getBorderWidth() {
        return this.f39334H;
    }

    public int getCircleBackgroundColor() {
        return this.f39335I;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.f39342P;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f39329U;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f39346T) {
            super.onDraw(canvas);
            return;
        }
        if (this.f39336J == null) {
            return;
        }
        int i13 = this.f39335I;
        RectF rectF = this.f39347w;
        if (i13 != 0) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.f39340N, this.f39332F);
        }
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.f39340N, this.f39350z);
        if (this.f39334H > 0) {
            RectF rectF2 = this.f39348x;
            canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), this.f39341O, this.f39331E);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        m32975c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f39346T) {
            return super.onTouchEvent(motionEvent);
        }
        float x3 = motionEvent.getX();
        float y13 = motionEvent.getY();
        RectF rectF = this.f39348x;
        if (!rectF.isEmpty()) {
            if (Math.pow(y13 - rectF.centerY(), 2.0d) + Math.pow(x3 - rectF.centerX(), 2.0d) > Math.pow(this.f39341O, 2.0d)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z4) {
        if (z4) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i13) {
        if (i13 == this.f39333G) {
            return;
        }
        this.f39333G = i13;
        this.f39331E.setColor(i13);
        invalidate();
    }

    public void setBorderOverlay(boolean z4) {
        if (z4 == this.f39345S) {
            return;
        }
        this.f39345S = z4;
        m32975c();
    }

    public void setBorderWidth(int i13) {
        if (i13 == this.f39334H) {
            return;
        }
        this.f39334H = i13;
        m32975c();
    }

    public void setCircleBackgroundColor(int i13) {
        if (i13 == this.f39335I) {
            return;
        }
        this.f39335I = i13;
        this.f39332F.setColor(i13);
        invalidate();
    }

    public void setCircleBackgroundColorResource(int i13) {
        setCircleBackgroundColor(getContext().getResources().getColor(i13));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f39342P) {
            return;
        }
        this.f39342P = colorFilter;
        Paint paint = this.f39350z;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z4) {
        if (this.f39346T == z4) {
            return;
        }
        this.f39346T = z4;
        m32974b();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m32974b();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m32974b();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i13) {
        super.setImageResource(i13);
        m32974b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m32974b();
    }

    @Override // android.view.View
    public final void setPadding(int i13, int i14, int i15, int i16) {
        super.setPadding(i13, i14, i15, i16);
        m32975c();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i13, int i14, int i15, int i16) {
        super.setPaddingRelative(i13, i14, i15, i16);
        m32975c();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == f39329U) {
            return;
        }
        throw new IllegalArgumentException("ScaleType " + scaleType + " not supported.");
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f39347w = new RectF();
        this.f39348x = new RectF();
        this.f39349y = new Matrix();
        this.f39350z = new Paint();
        this.f39331E = new Paint();
        this.f39332F = new Paint();
        this.f39333G = -16777216;
        this.f39334H = 0;
        this.f39335I = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36686a.f157123a, 0, 0);
        this.f39334H = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f39333G = typedArrayObtainStyledAttributes.getColor(0, -16777216);
        this.f39345S = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.f39335I = typedArrayObtainStyledAttributes.getColor(3, 0);
        typedArrayObtainStyledAttributes.recycle();
        m32973a();
    }
}
