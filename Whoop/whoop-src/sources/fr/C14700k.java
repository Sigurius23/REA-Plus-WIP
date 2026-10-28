package fr;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import p168g6.C15525f;
import p168g6.C15526g;
import p463rj.AbstractC31479j;

/* JADX INFO: renamed from: fr.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C14700k extends AbstractC14702m {

    /* JADX INFO: renamed from: Q */
    public static final C14699j f54342Q = new C14699j();

    /* JADX INFO: renamed from: L */
    public final AbstractC14704o f54343L;

    /* JADX INFO: renamed from: M */
    public final C15526g f54344M;

    /* JADX INFO: renamed from: N */
    public final C15525f f54345N;

    /* JADX INFO: renamed from: O */
    public final C14703n f54346O;

    /* JADX INFO: renamed from: P */
    public boolean f54347P;

    public C14700k(Context context, AbstractC14694e abstractC14694e, AbstractC14704o abstractC14704o) {
        super(context, abstractC14694e);
        this.f54347P = false;
        this.f54343L = abstractC14704o;
        this.f54346O = new C14703n();
        C15526g c15526g = new C15526g();
        this.f54344M = c15526g;
        c15526g.f58221b = 1.0f;
        c15526g.f58222c = false;
        c15526g.m43711a(50.0f);
        C15525f c15525f = new C15525f(this);
        this.f54345N = c15525f;
        c15525f.f58217m = c15526g;
        if (this.f54354H != 1.0f) {
            this.f54354H = 1.0f;
            invalidateSelf();
        }
    }

    @Override // fr.AbstractC14702m
    /* JADX INFO: renamed from: d */
    public final boolean mo42142d(boolean z4, boolean z13, boolean z14) {
        boolean zMo42142d = super.mo42142d(z4, z13, z14);
        C14690a c14690a = this.f54359y;
        ContentResolver contentResolver = this.f54357w.getContentResolver();
        c14690a.getClass();
        float f13 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f13 == 0.0f) {
            this.f54347P = true;
            return zMo42142d;
        }
        this.f54347P = false;
        this.f54344M.m43711a(50.0f / f13);
        return zMo42142d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Rect bounds = getBounds();
            float fM42144b = m42144b();
            ObjectAnimator objectAnimator = this.f54360z;
            boolean z4 = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f54351E;
            boolean z13 = objectAnimator2 != null && objectAnimator2.isRunning();
            AbstractC14704o abstractC14704o = this.f54343L;
            abstractC14704o.f54365a.mo42130a();
            abstractC14704o.mo42131a(canvas, bounds, fM42144b, z4, z13);
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f54355I;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            AbstractC14694e abstractC14694e = this.f54358x;
            int i13 = abstractC14694e.f54314c[0];
            C14703n c14703n = this.f54346O;
            c14703n.f54363c = i13;
            int iM96938q = abstractC14694e.f54318g;
            if (iM96938q > 0) {
                if (!(this.f54343L instanceof C14706q)) {
                    iM96938q = (int) ((AbstractC31479j.m96938q(c14703n.f54362b, 0.0f, 0.01f) * iM96938q) / 0.01f);
                }
                this.f54343L.mo42134d(canvas, paint, c14703n.f54362b, 1.0f, abstractC14694e.f54315d, this.f54356J, iM96938q);
            } else {
                this.f54343L.mo42134d(canvas, paint, 0.0f, 1.0f, abstractC14694e.f54315d, this.f54356J, 0);
            }
            this.f54343L.mo42133c(canvas, paint, c14703n, this.f54356J);
            this.f54343L.mo42132b(canvas, paint, abstractC14694e.f54314c[0], this.f54356J);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f54343L.mo42135e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f54343L.mo42136f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f54345N.m43710c();
        this.f54346O.f54362b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i13) {
        boolean z4 = this.f54347P;
        C14703n c14703n = this.f54346O;
        C15525f c15525f = this.f54345N;
        if (z4) {
            c15525f.m43710c();
            c14703n.f54362b = i13 / 10000.0f;
            invalidateSelf();
        } else {
            c15525f.f58206b = c14703n.f54362b * 10000.0f;
            c15525f.f58207c = true;
            c15525f.m43708a(i13);
        }
        return true;
    }
}
