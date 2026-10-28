package p087db;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: renamed from: db.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11866o0 {

    /* JADX INFO: renamed from: A */
    public int f38706A;

    /* JADX INFO: renamed from: B */
    public int f38707B;

    /* JADX INFO: renamed from: C */
    public int f38708C;

    /* JADX INFO: renamed from: D */
    public int f38709D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f38710E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f38711F;

    /* JADX INFO: renamed from: G */
    public int f38712G;

    /* JADX INFO: renamed from: H */
    public int f38713H;

    /* JADX INFO: renamed from: I */
    public int f38714I;

    /* JADX INFO: renamed from: J */
    public Rect f38715J;

    /* JADX INFO: renamed from: a */
    public final float f38716a;

    /* JADX INFO: renamed from: b */
    public final float f38717b;

    /* JADX INFO: renamed from: c */
    public final float f38718c;

    /* JADX INFO: renamed from: d */
    public final float f38719d;

    /* JADX INFO: renamed from: e */
    public final float f38720e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f38721f;

    /* JADX INFO: renamed from: g */
    public final Paint f38722g;

    /* JADX INFO: renamed from: h */
    public final Paint f38723h;

    /* JADX INFO: renamed from: i */
    public CharSequence f38724i;

    /* JADX INFO: renamed from: j */
    public Layout.Alignment f38725j;

    /* JADX INFO: renamed from: k */
    public Bitmap f38726k;

    /* JADX INFO: renamed from: l */
    public float f38727l;

    /* JADX INFO: renamed from: m */
    public int f38728m;

    /* JADX INFO: renamed from: n */
    public int f38729n;

    /* JADX INFO: renamed from: o */
    public float f38730o;

    /* JADX INFO: renamed from: p */
    public int f38731p;

    /* JADX INFO: renamed from: q */
    public float f38732q;

    /* JADX INFO: renamed from: r */
    public float f38733r;

    /* JADX INFO: renamed from: s */
    public int f38734s;

    /* JADX INFO: renamed from: t */
    public int f38735t;

    /* JADX INFO: renamed from: u */
    public int f38736u;

    /* JADX INFO: renamed from: v */
    public int f38737v;

    /* JADX INFO: renamed from: w */
    public int f38738w;

    /* JADX INFO: renamed from: x */
    public float f38739x;

    /* JADX INFO: renamed from: y */
    public float f38740y;

    /* JADX INFO: renamed from: z */
    public float f38741z;

    public C11866o0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f38720e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f38719d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f38716a = fRound;
        this.f38717b = fRound;
        this.f38718c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f38721f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f38722g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f38723h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m31840a(Canvas canvas, boolean z4) {
        Canvas canvas2;
        if (!z4) {
            this.f38715J.getClass();
            this.f38726k.getClass();
            canvas.drawBitmap(this.f38726k, (Rect) null, this.f38715J, this.f38723h);
            return;
        }
        StaticLayout staticLayout = this.f38710E;
        StaticLayout staticLayout2 = this.f38711F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f38712G, this.f38713H);
        if (Color.alpha(this.f38736u) > 0) {
            int i13 = this.f38736u;
            Paint paint = this.f38722g;
            paint.setColor(i13);
            canvas2 = canvas;
            canvas2.drawRect(-this.f38714I, 0.0f, staticLayout.getWidth() + this.f38714I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i14 = this.f38738w;
        TextPaint textPaint = this.f38721f;
        if (i14 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f38716a);
            textPaint.setColor(this.f38737v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f13 = this.f38717b;
            if (i14 == 2) {
                float f14 = this.f38718c;
                textPaint.setShadowLayer(f13, f14, f14, this.f38737v);
            } else if (i14 == 3 || i14 == 4) {
                boolean z13 = i14 == 3;
                int i15 = z13 ? -1 : this.f38737v;
                int i16 = z13 ? this.f38737v : -1;
                float f15 = f13 / 2.0f;
                textPaint.setColor(this.f38734s);
                textPaint.setStyle(Paint.Style.FILL);
                float f16 = -f15;
                textPaint.setShadowLayer(f13, f16, f16, i15);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f13, f15, f15, i16);
            }
        }
        textPaint.setColor(this.f38734s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
