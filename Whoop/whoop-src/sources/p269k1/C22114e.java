package p269k1;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import e93.AbstractC12889b;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.sentry.RunnableC20277c7;
import p181h2.C16617b;
import p181h2.C16620e;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p238j0.C21086l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k1.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C22114e extends View {

    /* JADX INFO: renamed from: F */
    public static final int[] f85800F = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: G */
    public static final int[] f85801G = new int[0];

    /* JADX INFO: renamed from: E */
    public C19683b f85802E;

    /* JADX INFO: renamed from: w */
    public C22116g f85803w;

    /* JADX INFO: renamed from: x */
    public Boolean f85804x;

    /* JADX INFO: renamed from: y */
    public Long f85805y;

    /* JADX INFO: renamed from: z */
    public RunnableC20277c7 f85806z;

    private final void setRippleState(boolean z4) throws Throwable {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f85806z;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l7 = this.f85805y;
        long jLongValue = jCurrentAnimationTimeMillis - (l7 != null ? l7.longValue() : 0L);
        if (z4 || jLongValue >= 5) {
            int[] iArr = z4 ? f85800F : f85801G;
            C22116g c22116g = this.f85803w;
            if (c22116g != null) {
                c22116g.setState(iArr);
            }
        } else {
            RunnableC20277c7 runnableC20277c7 = new RunnableC20277c7(this, 19);
            this.f85806z = runnableC20277c7;
            postDelayed(runnableC20277c7, 50L);
        }
        this.f85805y = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(C22114e c22114e) {
        C22116g c22116g = c22114e.f85803w;
        if (c22116g != null) {
            c22116g.setState(f85801G);
        }
        c22114e.f85806z = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m63317b(C21086l c21086l, boolean z4, long j7, int i13, long j13, float f13, C19683b c19683b) throws Throwable {
        if (this.f85803w == null || !Boolean.valueOf(z4).equals(this.f85804x)) {
            C22116g c22116g = new C22116g(z4);
            setBackground(c22116g);
            this.f85803w = c22116g;
            this.f85804x = Boolean.valueOf(z4);
        }
        C22116g c22116g2 = this.f85803w;
        AbstractC22676k.m65747g(c22116g2);
        this.f85802E = c19683b;
        m63320e(j7, i13, j13, f13);
        if (z4) {
            c22116g2.setHotspot(C16617b.m47189e(c21086l.f79949a), C16617b.m47190f(c21086l.f79949a));
        } else {
            c22116g2.setHotspot(c22116g2.getBounds().centerX(), c22116g2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m63318c() throws Throwable {
        this.f85802E = null;
        RunnableC20277c7 runnableC20277c7 = this.f85806z;
        if (runnableC20277c7 != null) {
            removeCallbacks(runnableC20277c7);
            RunnableC20277c7 runnableC20277c8 = this.f85806z;
            AbstractC22676k.m65747g(runnableC20277c8);
            runnableC20277c8.run();
        } else {
            C22116g c22116g = this.f85803w;
            if (c22116g != null) {
                c22116g.setState(f85801G);
            }
        }
        C22116g c22116g2 = this.f85803w;
        if (c22116g2 == null) {
            return;
        }
        c22116g2.setVisible(false, false);
        unscheduleDrawable(c22116g2);
    }

    /* JADX INFO: renamed from: d */
    public final void m63319d() throws Throwable {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) throws Throwable {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            m63318c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m63320e(long j7, int i13, long j13, float f13) {
        C22116g c22116g = this.f85803w;
        if (c22116g == null) {
            return;
        }
        Integer num = c22116g.f85810y;
        if (num == null || num.intValue() != i13) {
            c22116g.f85810y = Integer.valueOf(i13);
            c22116g.setRadius(i13);
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        long jM51541c = C17919x.m51541c(f13, j13);
        C17919x c17919x = c22116g.f85809x;
        if (!(c17919x == null ? false : C17919x.m51542d(c17919x.f69639a, jM51541c))) {
            c22116g.f85809x = new C17919x(jM51541c);
            c22116g.setColor(ColorStateList.valueOf(AbstractC17918w0.m51506H(jM51541c)));
        }
        Rect rect = new Rect(0, 0, AbstractC12889b.m36258X(C16620e.m47213e(j7)), AbstractC12889b.m36258X(C16620e.m47211c(j7)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c22116g.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C19683b c19683b = this.f85802E;
        if (c19683b != null) {
            c19683b.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
