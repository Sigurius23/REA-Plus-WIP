package gn2;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;

/* JADX INFO: renamed from: gn2.c */
/* JADX INFO: loaded from: classes10.dex */
public class C16007c extends LayerDrawable {

    /* JADX INFO: renamed from: E */
    static int f60585E = 1;

    /* JADX INFO: renamed from: z */
    static int f60586z;

    /* JADX INFO: renamed from: w */
    private float f60587w;

    /* JADX INFO: renamed from: x */
    private int f60588x;

    /* JADX INFO: renamed from: y */
    private C16006b f60589y;

    public C16007c() {
        this(new ShapeDrawable(), new ShapeDrawable());
    }

    /* JADX INFO: renamed from: a */
    public static Drawable[] m45303a(Drawable drawable, Drawable drawable2) {
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[f60586z] = drawable;
        drawableArr[f60585E] = drawable2;
        return drawableArr;
    }

    /* JADX INFO: renamed from: b */
    private ShapeDrawable m45304b() {
        return (ShapeDrawable) getDrawable(f60586z);
    }

    /* JADX INFO: renamed from: c */
    private ShapeDrawable m45305c() {
        return (ShapeDrawable) getDrawable(f60585E);
    }

    /* JADX INFO: renamed from: d */
    private void m45306d() {
        this.f60589y = new C16006b();
        ShapeDrawable shapeDrawableM45305c = m45305c();
        shapeDrawableM45305c.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawableM45305c.getPaint().setAntiAlias(true);
        m45312j(12.0f);
    }

    /* JADX INFO: renamed from: e */
    private void m45307e() {
        Shape shapeM45302a = this.f60589y.m45302a(this.f60588x);
        ShapeDrawable shapeDrawableM45305c = m45305c();
        ShapeDrawable shapeDrawableM45304b = m45304b();
        shapeDrawableM45305c.setShape(shapeM45302a);
        shapeDrawableM45304b.setShape(shapeM45302a);
        int iCeil = (int) Math.ceil(this.f60587w / 2.0f);
        setLayerInset(f60585E, iCeil, iCeil, iCeil, iCeil);
        int iFloor = (int) Math.floor(this.f60587w / 2.0f);
        int i13 = iFloor + 1;
        int i14 = iFloor - 1;
        setLayerInset(f60586z, i13, i13, i14, i14);
        invalidateDrawable(shapeDrawableM45304b);
        invalidateDrawable(shapeDrawableM45305c);
    }

    /* JADX INFO: renamed from: f */
    public void m45308f(int i13) {
        this.f60588x = i13;
        m45307e();
    }

    /* JADX INFO: renamed from: g */
    public void m45309g(int i13) {
        m45304b().getPaint().setColor(i13);
    }

    /* JADX INFO: renamed from: h */
    public void m45310h(int i13) {
        m45305c().getPaint().setColor(i13);
    }

    /* JADX INFO: renamed from: i */
    public void m45311i(boolean z4) {
        m45304b().getPaint().setAlpha(!z4 ? 1 : 0);
    }

    /* JADX INFO: renamed from: j */
    public void m45312j(float f13) {
        m45304b().getPaint().setAntiAlias(f13 <= 0.0f);
        this.f60587w = f13;
        m45305c().getPaint().setStrokeWidth(f13);
        m45307e();
    }

    private C16007c(ShapeDrawable shapeDrawable, ShapeDrawable shapeDrawable2) {
        super(m45303a(shapeDrawable, shapeDrawable2));
        m45306d();
    }
}
