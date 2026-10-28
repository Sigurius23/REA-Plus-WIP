package fr;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import cc.C4409p;
import java.util.ArrayList;
import p027b3.AbstractC2351b;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: fr.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C14705p extends AbstractC14702m {

    /* JADX INFO: renamed from: L */
    public final AbstractC14704o f54366L;

    /* JADX INFO: renamed from: M */
    public AbstractC2351b f54367M;

    /* JADX INFO: renamed from: N */
    public C4409p f54368N;

    public C14705p(Context context, AbstractC14694e abstractC14694e, AbstractC14704o abstractC14704o, AbstractC2351b abstractC2351b) {
        super(context, abstractC14694e);
        this.f54366L = abstractC14704o;
        this.f54367M = abstractC2351b;
        abstractC2351b.f9291b = this;
    }

    @Override // fr.AbstractC14702m
    /* JADX INFO: renamed from: d */
    public final boolean mo42142d(boolean z4, boolean z13, boolean z14) {
        C4409p c4409p;
        boolean zMo42142d = super.mo42142d(z4, z13, z14);
        if (this.f54359y != null && Settings.Global.getFloat(this.f54357w.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (c4409p = this.f54368N) != null) {
            return c4409p.setVisible(z4, z13);
        }
        if (!isRunning()) {
            this.f54367M.mo7253f();
        }
        if (z4 && z14) {
            this.f54367M.mo7250I();
        }
        return zMo42142d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i13;
        C4409p c4409p;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            C14690a c14690a = this.f54359y;
            AbstractC14694e abstractC14694e = this.f54358x;
            if (c14690a != null && Settings.Global.getFloat(this.f54357w.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (c4409p = this.f54368N) != null) {
                c4409p.setBounds(getBounds());
                this.f54368N.setTint(abstractC14694e.f54314c[0]);
                this.f54368N.draw(canvas);
                return;
            }
            canvas.save();
            Rect bounds = getBounds();
            float fM42144b = m42144b();
            ObjectAnimator objectAnimator = this.f54360z;
            boolean z4 = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f54351E;
            boolean z13 = objectAnimator2 != null && objectAnimator2.isRunning();
            AbstractC14704o abstractC14704o = this.f54366L;
            abstractC14704o.f54365a.mo42130a();
            abstractC14704o.mo42131a(canvas, bounds, fM42144b, z4, z13);
            int i14 = abstractC14694e.f54318g;
            int i15 = this.f54356J;
            Paint paint = this.f54355I;
            if (i14 == 0) {
                this.f54366L.mo42134d(canvas, paint, 0.0f, 1.0f, abstractC14694e.f54315d, i15, 0);
                i13 = i14;
            } else {
                C14703n c14703n = (C14703n) ((ArrayList) this.f54367M.f9292c).get(0);
                C14703n c14703n2 = (C14703n) AbstractC25012a.m73371d((ArrayList) this.f54367M.f9292c, 1);
                AbstractC14704o abstractC14704o2 = this.f54366L;
                if (abstractC14704o2 instanceof C14706q) {
                    i13 = i14;
                    abstractC14704o2.mo42134d(canvas, paint, 0.0f, c14703n.f54361a, abstractC14694e.f54315d, i15, i13);
                    this.f54366L.mo42134d(canvas, paint, c14703n2.f54362b, 1.0f, abstractC14694e.f54315d, i15, i13);
                } else {
                    i13 = i14;
                    i15 = 0;
                    abstractC14704o2.mo42134d(canvas, paint, c14703n2.f54362b, c14703n.f54361a + 1.0f, abstractC14694e.f54315d, 0, i13);
                }
            }
            for (int i16 = 0; i16 < ((ArrayList) this.f54367M.f9292c).size(); i16++) {
                C14703n c14703n3 = (C14703n) ((ArrayList) this.f54367M.f9292c).get(i16);
                this.f54366L.mo42133c(canvas, paint, c14703n3, this.f54356J);
                if (i16 > 0 && i13 > 0) {
                    this.f54366L.mo42134d(canvas, paint, ((C14703n) ((ArrayList) this.f54367M.f9292c).get(i16 - 1)).f54362b, c14703n3.f54361a, abstractC14694e.f54315d, i15, i13);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f54366L.mo42135e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f54366L.mo42136f();
    }
}
