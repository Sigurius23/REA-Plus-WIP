package jo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.health.platform.client.proto.C1533u;
import io.sentry.RunnableC20277c7;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import no.nordicsemi.android.dfu.DfuBaseService;
import p087db.C11845e;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31558o1;
import p465rm.C31571u;
import p465rm.InterfaceC31519b1;

/* JADX INFO: renamed from: jo.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C21816e extends View implements InterfaceC21810a0 {

    /* JADX INFO: renamed from: E */
    public final Paint f84090E;

    /* JADX INFO: renamed from: F */
    public final Paint f84091F;

    /* JADX INFO: renamed from: G */
    public final Paint f84092G;

    /* JADX INFO: renamed from: H */
    public final Paint f84093H;

    /* JADX INFO: renamed from: I */
    public final Paint f84094I;

    /* JADX INFO: renamed from: J */
    public final Paint f84095J;

    /* JADX INFO: renamed from: K */
    public final Drawable f84096K;

    /* JADX INFO: renamed from: L */
    public final int f84097L;

    /* JADX INFO: renamed from: M */
    public final int f84098M;

    /* JADX INFO: renamed from: N */
    public final int f84099N;

    /* JADX INFO: renamed from: O */
    public final int f84100O;

    /* JADX INFO: renamed from: P */
    public final int f84101P;

    /* JADX INFO: renamed from: Q */
    public final int f84102Q;

    /* JADX INFO: renamed from: R */
    public final int f84103R;

    /* JADX INFO: renamed from: S */
    public final int f84104S;

    /* JADX INFO: renamed from: T */
    public final int f84105T;

    /* JADX INFO: renamed from: U */
    public final StringBuilder f84106U;

    /* JADX INFO: renamed from: V */
    public final Formatter f84107V;

    /* JADX INFO: renamed from: W */
    public final RunnableC20277c7 f84108W;

    /* JADX INFO: renamed from: a0 */
    public final CopyOnWriteArraySet f84109a0;

    /* JADX INFO: renamed from: b0 */
    public final Point f84110b0;

    /* JADX INFO: renamed from: c0 */
    public final float f84111c0;

    /* JADX INFO: renamed from: d0 */
    public int f84112d0;

    /* JADX INFO: renamed from: e0 */
    public long f84113e0;

    /* JADX INFO: renamed from: f0 */
    public int f84114f0;

    /* JADX INFO: renamed from: g0 */
    public Rect f84115g0;

    /* JADX INFO: renamed from: h0 */
    public final ValueAnimator f84116h0;

    /* JADX INFO: renamed from: i0 */
    public float f84117i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f84118j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f84119k0;

    /* JADX INFO: renamed from: l0 */
    public long f84120l0;

    /* JADX INFO: renamed from: m0 */
    public long f84121m0;

    /* JADX INFO: renamed from: n0 */
    public long f84122n0;

    /* JADX INFO: renamed from: o0 */
    public long f84123o0;

    /* JADX INFO: renamed from: p0 */
    public int f84124p0;

    /* JADX INFO: renamed from: q0 */
    public long[] f84125q0;

    /* JADX INFO: renamed from: r0 */
    public boolean[] f84126r0;

    /* JADX INFO: renamed from: w */
    public final Rect f84127w;

    /* JADX INFO: renamed from: x */
    public final Rect f84128x;

    /* JADX INFO: renamed from: y */
    public final Rect f84129y;

    /* JADX INFO: renamed from: z */
    public final Rect f84130z;

    public C21816e(Context context) {
        super(context, null, 0);
        this.f84127w = new Rect();
        this.f84128x = new Rect();
        this.f84129y = new Rect();
        this.f84130z = new Rect();
        Paint paint = new Paint();
        this.f84090E = paint;
        Paint paint2 = new Paint();
        this.f84091F = paint2;
        Paint paint3 = new Paint();
        this.f84092G = paint3;
        Paint paint4 = new Paint();
        this.f84093H = paint4;
        Paint paint5 = new Paint();
        this.f84094I = paint5;
        Paint paint6 = new Paint();
        this.f84095J = paint6;
        paint6.setAntiAlias(true);
        this.f84109a0 = new CopyOnWriteArraySet();
        this.f84110b0 = new Point();
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f84111c0 = f13;
        this.f84105T = m61745a(f13, -50);
        int iM61745a = m61745a(f13, 4);
        int iM61745a2 = m61745a(f13, 26);
        int iM61745a3 = m61745a(f13, 4);
        int iM61745a4 = m61745a(f13, 12);
        int iM61745a5 = m61745a(f13, 0);
        int iM61745a6 = m61745a(f13, 16);
        this.f84097L = iM61745a;
        this.f84098M = iM61745a2;
        this.f84099N = 0;
        this.f84100O = iM61745a3;
        this.f84101P = iM61745a4;
        this.f84102Q = iM61745a5;
        this.f84103R = iM61745a6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        this.f84096K = null;
        StringBuilder sb4 = new StringBuilder();
        this.f84106U = sb4;
        this.f84107V = new Formatter(sb4, Locale.getDefault());
        this.f84108W = new RunnableC20277c7(this, 17);
        this.f84104S = (Math.max(iM61745a5, Math.max(iM61745a4, iM61745a6)) + 1) / 2;
        this.f84117i0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f84116h0 = valueAnimator;
        valueAnimator.addUpdateListener(new C11845e(this, 3));
        this.f84121m0 = -9223372036854775807L;
        this.f84113e0 = -9223372036854775807L;
        this.f84112d0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m61745a(float f13, int i13) {
        return (int) ((i13 * f13) + 0.5f);
    }

    private long getPositionIncrement() {
        long j7 = this.f84113e0;
        if (j7 != -9223372036854775807L) {
            return j7;
        }
        long j13 = this.f84121m0;
        if (j13 == -9223372036854775807L) {
            return 0L;
        }
        return j13 / ((long) this.f84112d0);
    }

    private String getProgressText() {
        return AbstractC24567y.m71690u(this.f84106U, this.f84107V, this.f84122n0);
    }

    private long getScrubberPosition() {
        Rect rect = this.f84128x;
        if (rect.width() <= 0 || this.f84121m0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f84130z.width()) * this.f84121m0) / ((long) rect.width());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m61746b(long j7) {
        long j13 = this.f84121m0;
        if (j13 <= 0) {
            return false;
        }
        long j14 = this.f84119k0 ? this.f84120l0 : this.f84122n0;
        long jM71678i = AbstractC24567y.m71678i(j14 + j7, 0L, j13);
        if (jM71678i == j14) {
            return false;
        }
        if (this.f84119k0) {
            m61750f(jM71678i);
        } else {
            m61747c(jM71678i);
        }
        m61749e();
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m61747c(long j7) {
        this.f84120l0 = j7;
        this.f84119k0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f84109a0.iterator();
        while (it.hasNext()) {
            C21830s c21830s = ((ViewOnClickListenerC21823l) it.next()).f84145w;
            c21830s.f84223x0 = true;
            TextView textView = c21830s.f84178N;
            if (textView != null) {
                textView.setText(AbstractC24567y.m71690u(c21830s.f84182P, c21830s.f84184Q, j7));
            }
            c21830s.f84165G0.m31793h();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m61748d(boolean z4) {
        InterfaceC31519b1 interfaceC31519b1;
        int iM97206Y;
        removeCallbacks(this.f84108W);
        this.f84119k0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        for (ViewOnClickListenerC21823l viewOnClickListenerC21823l : this.f84109a0) {
            long j7 = this.f84120l0;
            C21830s c21830s = viewOnClickListenerC21823l.f84145w;
            c21830s.f84223x0 = false;
            if (!z4 && (interfaceC31519b1 = c21830s.f84215r0) != null) {
                C31571u c31571u = (C31571u) interfaceC31519b1;
                AbstractC31558o1 abstractC31558o1M97209b0 = c31571u.m97209b0();
                if (c21830s.f84221w0 && !abstractC31558o1M97209b0.m97175p()) {
                    int iMo97137o = abstractC31558o1M97209b0.mo97137o();
                    iM97206Y = 0;
                    while (true) {
                        long jM71669G = AbstractC24567y.m71669G(abstractC31558o1M97209b0.mo97136m(iM97206Y, c21830s.f84188S, 0L).f130318N);
                        if (j7 < jM71669G) {
                            break;
                        }
                        if (iM97206Y == iMo97137o - 1) {
                            j7 = jM71669G;
                            break;
                        } else {
                            j7 -= jM71669G;
                            iM97206Y++;
                        }
                    }
                } else {
                    iM97206Y = c31571u.m97206Y();
                }
                c31571u.m97222q0(iM97206Y, j7);
                c21830s.m61769n();
            }
            c21830s.f84165G0.m31794i();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f84096K;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m61749e() {
        Rect rect = this.f84129y;
        Rect rect2 = this.f84128x;
        rect.set(rect2);
        Rect rect3 = this.f84130z;
        rect3.set(rect2);
        long j7 = this.f84119k0 ? this.f84120l0 : this.f84122n0;
        if (this.f84121m0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f84123o0) / this.f84121m0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j7) / this.f84121m0)), rect2.right);
        } else {
            int i13 = rect2.left;
            rect.right = i13;
            rect3.right = i13;
        }
        invalidate(this.f84127w);
    }

    /* JADX INFO: renamed from: f */
    public final void m61750f(long j7) {
        if (this.f84120l0 == j7) {
            return;
        }
        this.f84120l0 = j7;
        Iterator it = this.f84109a0.iterator();
        while (it.hasNext()) {
            C21830s c21830s = ((ViewOnClickListenerC21823l) it.next()).f84145w;
            TextView textView = c21830s.f84178N;
            if (textView != null) {
                textView.setText(AbstractC24567y.m71690u(c21830s.f84182P, c21830s.f84184Q, j7));
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f84128x.width() / this.f84111c0);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j7 = this.f84121m0;
        if (j7 == 0 || j7 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j7 / ((long) iWidth);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f84096K;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i13;
        canvas.save();
        Rect rect = this.f84128x;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i14 = iCenterY + iHeight;
        long j7 = this.f84121m0;
        Paint paint = this.f84092G;
        Rect rect2 = this.f84130z;
        if (j7 <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i14, paint);
        } else {
            Rect rect3 = this.f84129y;
            int i15 = rect3.left;
            int i16 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i16), rect2.right);
            int i17 = rect.right;
            if (iMax < i17) {
                canvas.drawRect(iMax, iCenterY, i17, i14, paint);
            }
            int iMax2 = Math.max(i15, rect2.right);
            if (i16 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i16, i14, this.f84091F);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i14, this.f84090E);
            }
            if (this.f84124p0 != 0) {
                long[] jArr = this.f84125q0;
                jArr.getClass();
                boolean[] zArr = this.f84126r0;
                zArr.getClass();
                int i18 = this.f84100O;
                int i19 = i18 / 2;
                int i24 = 0;
                int i25 = 0;
                while (i25 < this.f84124p0) {
                    int iMin = Math.min(rect.width() - i18, Math.max(i24, ((int) ((((long) rect.width()) * AbstractC24567y.m71678i(jArr[i25], 0L, this.f84121m0)) / this.f84121m0)) - i19)) + rect.left;
                    int i26 = i25;
                    canvas.drawRect(iMin, iCenterY, iMin + i18, i14, zArr[i25] ? this.f84094I : this.f84093H);
                    i25 = i26 + 1;
                    i24 = i24;
                }
            }
            canvas2 = canvas;
        }
        if (this.f84121m0 > 0) {
            int iM71677h = AbstractC24567y.m71677h(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f84096K;
            if (drawable == null) {
                if (this.f84119k0 || isFocused()) {
                    i13 = this.f84103R;
                } else {
                    i13 = isEnabled() ? this.f84101P : this.f84102Q;
                }
                canvas2.drawCircle(iM71677h, iCenterY2, (int) ((i13 * this.f84117i0) / 2.0f), this.f84095J);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f84117i0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f84117i0)) / 2;
                drawable.setBounds(iM71677h - intrinsicWidth, iCenterY2 - intrinsicHeight, iM71677h + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z4, int i13, Rect rect) {
        super.onFocusChanged(z4, i13, rect);
        if (!this.f84119k0 || z4) {
            return;
        }
        m61748d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f84121m0 <= 0) {
            return;
        }
        if (AbstractC24567y.f95875a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(DfuBaseService.ERROR_REMOTE_MASK);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i13 != 66) {
                switch (i13) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (m61746b(positionIncrement)) {
                            RunnableC20277c7 runnableC20277c7 = this.f84108W;
                            removeCallbacks(runnableC20277c7);
                            postDelayed(runnableC20277c7, 1000L);
                            return true;
                        }
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        if (m61746b(positionIncrement)) {
                            RunnableC20277c7 runnableC20277c8 = this.f84108W;
                            removeCallbacks(runnableC20277c8);
                            postDelayed(runnableC20277c8, 1000L);
                            return true;
                        }
                        break;
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        if (this.f84119k0) {
                            m61748d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f84119k0) {
                m61748d(false);
                return true;
            }
        }
        return super.onKeyDown(i13, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i17 = i15 - i13;
        int i18 = i16 - i14;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i17 - getPaddingRight();
        int i19 = this.f84118j0 ? 0 : this.f84104S;
        int i24 = this.f84099N;
        int i25 = this.f84097L;
        int i26 = this.f84098M;
        if (i24 == 1) {
            paddingBottom = (i18 - getPaddingBottom()) - i26;
            paddingBottom2 = ((i18 - getPaddingBottom()) - i25) - Math.max(i19 - (i25 / 2), 0);
        } else {
            paddingBottom = (i18 - i26) / 2;
            paddingBottom2 = (i18 - i25) / 2;
        }
        Rect rect2 = this.f84127w;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i26 + paddingBottom);
        this.f84128x.set(rect2.left + i19, paddingBottom2, rect2.right - i19, i25 + paddingBottom2);
        if (AbstractC24567y.f95875a >= 29 && ((rect = this.f84115g0) == null || rect.width() != i17 || this.f84115g0.height() != i18)) {
            Rect rect3 = new Rect(0, 0, i17, i18);
            this.f84115g0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m61749e();
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int i15 = this.f84098M;
        if (mode == 0) {
            size = i15;
        } else if (mode != 1073741824) {
            size = Math.min(i15, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i13), size);
        Drawable drawable = this.f84096K;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        Drawable drawable = this.f84096K;
        if (drawable == null || AbstractC24567y.f95875a < 23 || !drawable.setLayoutDirection(i13)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f84121m0 > 0) {
            int x3 = (int) motionEvent.getX();
            int y13 = (int) motionEvent.getY();
            Point point = this.f84110b0;
            point.set(x3, y13);
            int i13 = point.x;
            int i14 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f84128x;
            Rect rect2 = this.f84130z;
            if (action == 0) {
                int i15 = i13;
                if (this.f84127w.contains(i15, i14)) {
                    rect2.right = AbstractC24567y.m71677h(i15, rect.left, rect.right);
                    m61747c(getScrubberPosition());
                    m61749e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f84119k0) {
                    m61748d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f84119k0) {
                        m61748d(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f84119k0) {
                if (i14 < this.f84105T) {
                    int i16 = this.f84114f0;
                    rect2.right = AbstractC24567y.m71677h(((i13 - i16) / 3) + i16, rect.left, rect.right);
                } else {
                    this.f84114f0 = i13;
                    rect2.right = AbstractC24567y.m71677h(i13, rect.left, rect.right);
                }
                m61750f(getScrubberPosition());
                m61749e();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i13, Bundle bundle) {
        if (super.performAccessibilityAction(i13, bundle)) {
            return true;
        }
        if (this.f84121m0 <= 0) {
            return false;
        }
        if (i13 == 8192) {
            if (m61746b(-getPositionIncrement())) {
                m61748d(false);
            }
        } else {
            if (i13 != 4096) {
                return false;
            }
            if (m61746b(getPositionIncrement())) {
                m61748d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i13) {
        this.f84093H.setColor(i13);
        invalidate(this.f84127w);
    }

    public void setBufferedColor(int i13) {
        this.f84091F.setColor(i13);
        invalidate(this.f84127w);
    }

    public void setBufferedPosition(long j7) {
        if (this.f84123o0 == j7) {
            return;
        }
        this.f84123o0 = j7;
        m61749e();
    }

    public void setDuration(long j7) {
        if (this.f84121m0 == j7) {
            return;
        }
        this.f84121m0 = j7;
        if (this.f84119k0 && j7 == -9223372036854775807L) {
            m61748d(true);
        }
        m61749e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (!this.f84119k0 || z4) {
            return;
        }
        m61748d(true);
    }

    public void setKeyCountIncrement(int i13) {
        AbstractC24543a.m71569e(i13 > 0);
        this.f84112d0 = i13;
        this.f84113e0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j7) {
        AbstractC24543a.m71569e(j7 > 0);
        this.f84112d0 = -1;
        this.f84113e0 = j7;
    }

    public void setPlayedAdMarkerColor(int i13) {
        this.f84094I.setColor(i13);
        invalidate(this.f84127w);
    }

    public void setPlayedColor(int i13) {
        this.f84090E.setColor(i13);
        invalidate(this.f84127w);
    }

    public void setPosition(long j7) {
        if (this.f84122n0 == j7) {
            return;
        }
        this.f84122n0 = j7;
        setContentDescription(getProgressText());
        m61749e();
    }

    public void setScrubberColor(int i13) {
        this.f84095J.setColor(i13);
        invalidate(this.f84127w);
    }

    public void setUnplayedColor(int i13) {
        this.f84092G.setColor(i13);
        invalidate(this.f84127w);
    }
}
