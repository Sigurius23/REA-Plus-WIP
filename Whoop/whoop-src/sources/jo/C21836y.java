package jo;

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

/* JADX INFO: renamed from: jo.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C21836y {

    /* JADX INFO: renamed from: A */
    public int f84240A;

    /* JADX INFO: renamed from: B */
    public int f84241B;

    /* JADX INFO: renamed from: C */
    public int f84242C;

    /* JADX INFO: renamed from: D */
    public int f84243D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f84244E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f84245F;

    /* JADX INFO: renamed from: G */
    public int f84246G;

    /* JADX INFO: renamed from: H */
    public int f84247H;

    /* JADX INFO: renamed from: I */
    public int f84248I;

    /* JADX INFO: renamed from: J */
    public Rect f84249J;

    /* JADX INFO: renamed from: a */
    public final float f84250a;

    /* JADX INFO: renamed from: b */
    public final float f84251b;

    /* JADX INFO: renamed from: c */
    public final float f84252c;

    /* JADX INFO: renamed from: d */
    public final float f84253d;

    /* JADX INFO: renamed from: e */
    public final float f84254e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f84255f;

    /* JADX INFO: renamed from: g */
    public final Paint f84256g;

    /* JADX INFO: renamed from: h */
    public final Paint f84257h;

    /* JADX INFO: renamed from: i */
    public CharSequence f84258i;

    /* JADX INFO: renamed from: j */
    public Layout.Alignment f84259j;

    /* JADX INFO: renamed from: k */
    public Bitmap f84260k;

    /* JADX INFO: renamed from: l */
    public float f84261l;

    /* JADX INFO: renamed from: m */
    public int f84262m;

    /* JADX INFO: renamed from: n */
    public int f84263n;

    /* JADX INFO: renamed from: o */
    public float f84264o;

    /* JADX INFO: renamed from: p */
    public int f84265p;

    /* JADX INFO: renamed from: q */
    public float f84266q;

    /* JADX INFO: renamed from: r */
    public float f84267r;

    /* JADX INFO: renamed from: s */
    public int f84268s;

    /* JADX INFO: renamed from: t */
    public int f84269t;

    /* JADX INFO: renamed from: u */
    public int f84270u;

    /* JADX INFO: renamed from: v */
    public int f84271v;

    /* JADX INFO: renamed from: w */
    public int f84272w;

    /* JADX INFO: renamed from: x */
    public float f84273x;

    /* JADX INFO: renamed from: y */
    public float f84274y;

    /* JADX INFO: renamed from: z */
    public float f84275z;

    public C21836y(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f84254e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f84253d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f84250a = fRound;
        this.f84251b = fRound;
        this.f84252c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f84255f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f84256g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f84257h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m61778a(Canvas canvas, boolean z4) {
        Canvas canvas2;
        if (!z4) {
            this.f84249J.getClass();
            this.f84260k.getClass();
            canvas.drawBitmap(this.f84260k, (Rect) null, this.f84249J, this.f84257h);
            return;
        }
        StaticLayout staticLayout = this.f84244E;
        StaticLayout staticLayout2 = this.f84245F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f84246G, this.f84247H);
        if (Color.alpha(this.f84270u) > 0) {
            int i13 = this.f84270u;
            Paint paint = this.f84256g;
            paint.setColor(i13);
            canvas2 = canvas;
            canvas2.drawRect(-this.f84248I, 0.0f, staticLayout.getWidth() + this.f84248I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i14 = this.f84272w;
        TextPaint textPaint = this.f84255f;
        if (i14 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f84250a);
            textPaint.setColor(this.f84271v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f13 = this.f84251b;
            if (i14 == 2) {
                float f14 = this.f84252c;
                textPaint.setShadowLayer(f13, f14, f14, this.f84271v);
            } else if (i14 == 3 || i14 == 4) {
                boolean z13 = i14 == 3;
                int i15 = z13 ? -1 : this.f84271v;
                int i16 = z13 ? this.f84271v : -1;
                float f15 = f13 / 2.0f;
                textPaint.setColor(this.f84268s);
                textPaint.setStyle(Paint.Style.FILL);
                float f16 = -f15;
                textPaint.setShadowLayer(f13, f16, f16, i15);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f13, f15, f15, i16);
            }
        }
        textPaint.setColor(this.f84268s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
