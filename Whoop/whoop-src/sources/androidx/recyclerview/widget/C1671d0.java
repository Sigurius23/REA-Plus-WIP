package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1671d0 extends AbstractC1724q1 implements InterfaceC1756y1 {

    /* JADX INFO: renamed from: C */
    public static final int[] f6604C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D */
    public static final int[] f6605D = new int[0];

    /* JADX INFO: renamed from: A */
    public int f6606A;

    /* JADX INFO: renamed from: B */
    public final RunnableC1758z f6607B;

    /* JADX INFO: renamed from: a */
    public final int f6608a;

    /* JADX INFO: renamed from: b */
    public final int f6609b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f6610c;

    /* JADX INFO: renamed from: d */
    public final Drawable f6611d;

    /* JADX INFO: renamed from: e */
    public final int f6612e;

    /* JADX INFO: renamed from: f */
    public final int f6613f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f6614g;

    /* JADX INFO: renamed from: h */
    public final Drawable f6615h;

    /* JADX INFO: renamed from: i */
    public final int f6616i;

    /* JADX INFO: renamed from: j */
    public final int f6617j;

    /* JADX INFO: renamed from: k */
    public int f6618k;

    /* JADX INFO: renamed from: l */
    public int f6619l;

    /* JADX INFO: renamed from: m */
    public float f6620m;

    /* JADX INFO: renamed from: n */
    public int f6621n;

    /* JADX INFO: renamed from: o */
    public int f6622o;

    /* JADX INFO: renamed from: p */
    public float f6623p;

    /* JADX INFO: renamed from: s */
    public final RecyclerView f6626s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f6633z;

    /* JADX INFO: renamed from: q */
    public int f6624q = 0;

    /* JADX INFO: renamed from: r */
    public int f6625r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f6627t = false;

    /* JADX INFO: renamed from: u */
    public boolean f6628u = false;

    /* JADX INFO: renamed from: v */
    public int f6629v = 0;

    /* JADX INFO: renamed from: w */
    public int f6630w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f6631x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f6632y = new int[2];

    public C1671d0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i13, int i14, int i15) {
        int i16 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6633z = valueAnimatorOfFloat;
        this.f6606A = 0;
        RunnableC1758z runnableC1758z = new RunnableC1758z(this, i16);
        this.f6607B = runnableC1758z;
        C1656a0 c1656a0 = new C1656a0(this);
        this.f6610c = stateListDrawable;
        this.f6611d = drawable;
        this.f6614g = stateListDrawable2;
        this.f6615h = drawable2;
        this.f6612e = Math.max(i13, stateListDrawable.getIntrinsicWidth());
        this.f6613f = Math.max(i13, drawable.getIntrinsicWidth());
        this.f6616i = Math.max(i13, stateListDrawable2.getIntrinsicWidth());
        this.f6617j = Math.max(i13, drawable2.getIntrinsicWidth());
        this.f6608a = i14;
        this.f6609b = i15;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C1661b0(this));
        valueAnimatorOfFloat.addUpdateListener(new C1666c0(this, i16));
        RecyclerView recyclerView2 = this.f6626s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f6626s.removeOnItemTouchListener(this);
            this.f6626s.removeOnScrollListener(c1656a0);
            this.f6626s.removeCallbacks(runnableC1758z);
        }
        this.f6626s = recyclerView;
        recyclerView.addItemDecoration(this, -1);
        this.f6626s.addOnItemTouchListener(this);
        this.f6626s.addOnScrollListener(c1656a0);
    }

    /* JADX INFO: renamed from: g */
    public static int m5221g(float f13, float f14, int[] iArr, int i13, int i14, int i15) {
        int i16 = iArr[1] - iArr[0];
        if (i16 != 0) {
            int i17 = i13 - i15;
            int i18 = (int) (((f14 - f13) / i16) * i17);
            int i19 = i14 + i18;
            if (i19 < i17 && i19 >= 0) {
                return i18;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1756y1
    /* JADX INFO: renamed from: b */
    public final boolean mo5222b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i13 = this.f6629v;
        if (i13 != 1) {
            return i13 == 2;
        }
        boolean zM5225f = m5225f(motionEvent.getX(), motionEvent.getY());
        boolean zM5224e = m5224e(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM5225f && !zM5224e) {
            return false;
        }
        if (zM5224e) {
            this.f6630w = 1;
            this.f6623p = (int) motionEvent.getX();
        } else if (zM5225f) {
            this.f6630w = 2;
            this.f6620m = (int) motionEvent.getY();
        }
        m5226h(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1756y1
    /* JADX INFO: renamed from: d */
    public final void mo5223d(boolean z4) {
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5224e(float f13, float f14) {
        if (f14 < this.f6625r - this.f6616i) {
            return false;
        }
        int i13 = this.f6622o;
        int i14 = this.f6621n;
        return f13 >= ((float) (i13 - (i14 / 2))) && f13 <= ((float) ((i14 / 2) + i13));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5225f(float f13, float f14) {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int layoutDirection = this.f6626s.getLayoutDirection();
        int i13 = this.f6612e;
        if (layoutDirection == 1) {
            if (f13 > i13) {
                return false;
            }
        } else if (f13 < this.f6624q - i13) {
            return false;
        }
        int i14 = this.f6619l;
        int i15 = this.f6618k / 2;
        return f14 >= ((float) (i14 - i15)) && f14 <= ((float) (i15 + i14));
    }

    /* JADX INFO: renamed from: h */
    public final void m5226h(int i13) {
        RunnableC1758z runnableC1758z = this.f6607B;
        StateListDrawable stateListDrawable = this.f6610c;
        if (i13 == 2 && this.f6629v != 2) {
            stateListDrawable.setState(f6604C);
            this.f6626s.removeCallbacks(runnableC1758z);
        }
        if (i13 == 0) {
            this.f6626s.invalidate();
        } else {
            m5227i();
        }
        if (this.f6629v == 2 && i13 != 2) {
            stateListDrawable.setState(f6605D);
            this.f6626s.removeCallbacks(runnableC1758z);
            this.f6626s.postDelayed(runnableC1758z, 1200);
        } else if (i13 == 1) {
            this.f6626s.removeCallbacks(runnableC1758z);
            this.f6626s.postDelayed(runnableC1758z, 1500);
        }
        this.f6629v = i13;
    }

    /* JADX INFO: renamed from: i */
    public final void m5227i() {
        int i13 = this.f6606A;
        ValueAnimator valueAnimator = this.f6633z;
        if (i13 != 0) {
            if (i13 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f6606A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.AbstractC1724q1
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1701k2 c1701k2) {
        int i13 = this.f6624q;
        RecyclerView recyclerView2 = this.f6626s;
        if (i13 != recyclerView2.getWidth() || this.f6625r != recyclerView2.getHeight()) {
            this.f6624q = recyclerView2.getWidth();
            this.f6625r = recyclerView2.getHeight();
            m5226h(0);
            return;
        }
        if (this.f6606A != 0) {
            if (this.f6627t) {
                int i14 = this.f6624q;
                int i15 = this.f6612e;
                int i16 = i14 - i15;
                int i17 = this.f6619l;
                int i18 = this.f6618k;
                int i19 = i17 - (i18 / 2);
                StateListDrawable stateListDrawable = this.f6610c;
                stateListDrawable.setBounds(0, 0, i15, i18);
                int i24 = this.f6613f;
                int i25 = this.f6625r;
                Drawable drawable = this.f6611d;
                drawable.setBounds(0, 0, i24, i25);
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i15, i19);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i15, -i19);
                } else {
                    canvas.translate(i16, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i19);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i16, -i19);
                }
            }
            if (this.f6628u) {
                int i26 = this.f6625r;
                int i27 = this.f6616i;
                int i28 = i26 - i27;
                int i29 = this.f6622o;
                int i34 = this.f6621n;
                int i35 = i29 - (i34 / 2);
                StateListDrawable stateListDrawable2 = this.f6614g;
                stateListDrawable2.setBounds(0, 0, i34, i27);
                int i36 = this.f6624q;
                int i37 = this.f6617j;
                Drawable drawable2 = this.f6615h;
                drawable2.setBounds(0, 0, i36, i37);
                canvas.translate(0.0f, i28);
                drawable2.draw(canvas);
                canvas.translate(i35, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i35, -i28);
            }
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC1756y1
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (this.f6629v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM5225f = m5225f(motionEvent.getX(), motionEvent.getY());
            boolean zM5224e = m5224e(motionEvent.getX(), motionEvent.getY());
            if (zM5225f || zM5224e) {
                if (zM5224e) {
                    this.f6630w = 1;
                    this.f6623p = (int) motionEvent.getX();
                } else if (zM5225f) {
                    this.f6630w = 2;
                    this.f6620m = (int) motionEvent.getY();
                }
                m5226h(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f6629v == 2) {
            this.f6620m = 0.0f;
            this.f6623p = 0.0f;
            m5226h(1);
            this.f6630w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f6629v == 2) {
            m5227i();
            int i13 = this.f6630w;
            int i14 = this.f6609b;
            if (i13 == 1) {
                float x3 = motionEvent.getX();
                int[] iArr = this.f6632y;
                iArr[0] = i14;
                int i15 = this.f6624q - i14;
                iArr[1] = i15;
                float fMax = Math.max(i14, Math.min(i15, x3));
                if (Math.abs(this.f6622o - fMax) >= 2.0f) {
                    int iM5221g = m5221g(this.f6623p, fMax, iArr, this.f6626s.computeHorizontalScrollRange(), this.f6626s.computeHorizontalScrollOffset(), this.f6624q);
                    if (iM5221g != 0) {
                        this.f6626s.scrollBy(iM5221g, 0);
                    }
                    this.f6623p = fMax;
                }
            }
            if (this.f6630w == 2) {
                float y13 = motionEvent.getY();
                int[] iArr2 = this.f6631x;
                iArr2[0] = i14;
                int i16 = this.f6625r - i14;
                iArr2[1] = i16;
                float fMax2 = Math.max(i14, Math.min(i16, y13));
                if (Math.abs(this.f6619l - fMax2) < 2.0f) {
                    return;
                }
                int iM5221g2 = m5221g(this.f6620m, fMax2, iArr2, this.f6626s.computeVerticalScrollRange(), this.f6626s.computeVerticalScrollOffset(), this.f6625r);
                if (iM5221g2 != 0) {
                    this.f6626s.scrollBy(0, iM5221g2);
                }
                this.f6620m = fMax2;
            }
        }
    }
}
