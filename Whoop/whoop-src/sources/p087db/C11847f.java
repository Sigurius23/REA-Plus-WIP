package p087db;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.RunnableC1319m;
import androidx.health.platform.client.proto.C1533u;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: db.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C11847f extends View implements InterfaceC11872r0 {

    /* JADX INFO: renamed from: E */
    public final Paint f38632E;

    /* JADX INFO: renamed from: F */
    public final Paint f38633F;

    /* JADX INFO: renamed from: G */
    public final Paint f38634G;

    /* JADX INFO: renamed from: H */
    public final Paint f38635H;

    /* JADX INFO: renamed from: I */
    public final Paint f38636I;

    /* JADX INFO: renamed from: J */
    public final Paint f38637J;

    /* JADX INFO: renamed from: K */
    public final Drawable f38638K;

    /* JADX INFO: renamed from: L */
    public final int f38639L;

    /* JADX INFO: renamed from: M */
    public final int f38640M;

    /* JADX INFO: renamed from: N */
    public final int f38641N;

    /* JADX INFO: renamed from: O */
    public final int f38642O;

    /* JADX INFO: renamed from: P */
    public final int f38643P;

    /* JADX INFO: renamed from: Q */
    public final int f38644Q;

    /* JADX INFO: renamed from: R */
    public final int f38645R;

    /* JADX INFO: renamed from: S */
    public final int f38646S;

    /* JADX INFO: renamed from: T */
    public final int f38647T;

    /* JADX INFO: renamed from: U */
    public final StringBuilder f38648U;

    /* JADX INFO: renamed from: V */
    public final Formatter f38649V;

    /* JADX INFO: renamed from: W */
    public final RunnableC1319m f38650W;

    /* JADX INFO: renamed from: a0 */
    public final CopyOnWriteArraySet f38651a0;

    /* JADX INFO: renamed from: b0 */
    public final Point f38652b0;

    /* JADX INFO: renamed from: c0 */
    public final float f38653c0;

    /* JADX INFO: renamed from: d0 */
    public int f38654d0;

    /* JADX INFO: renamed from: e0 */
    public long f38655e0;

    /* JADX INFO: renamed from: f0 */
    public int f38656f0;

    /* JADX INFO: renamed from: g0 */
    public Rect f38657g0;

    /* JADX INFO: renamed from: h0 */
    public final ValueAnimator f38658h0;

    /* JADX INFO: renamed from: i0 */
    public float f38659i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f38660j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f38661k0;

    /* JADX INFO: renamed from: l0 */
    public long f38662l0;

    /* JADX INFO: renamed from: m0 */
    public long f38663m0;

    /* JADX INFO: renamed from: n0 */
    public long f38664n0;

    /* JADX INFO: renamed from: o0 */
    public long f38665o0;

    /* JADX INFO: renamed from: p0 */
    public int f38666p0;

    /* JADX INFO: renamed from: q0 */
    public long[] f38667q0;

    /* JADX INFO: renamed from: r0 */
    public boolean[] f38668r0;

    /* JADX INFO: renamed from: w */
    public final Rect f38669w;

    /* JADX INFO: renamed from: x */
    public final Rect f38670x;

    /* JADX INFO: renamed from: y */
    public final Rect f38671y;

    /* JADX INFO: renamed from: z */
    public final Rect f38672z;

    public C11847f(Context context, AttributeSet attributeSet, int i13) {
        super(context, null, 0);
        this.f38669w = new Rect();
        this.f38670x = new Rect();
        this.f38671y = new Rect();
        this.f38672z = new Rect();
        Paint paint = new Paint();
        this.f38632E = paint;
        Paint paint2 = new Paint();
        this.f38633F = paint2;
        Paint paint3 = new Paint();
        this.f38634G = paint3;
        Paint paint4 = new Paint();
        this.f38635H = paint4;
        Paint paint5 = new Paint();
        this.f38636I = paint5;
        Paint paint6 = new Paint();
        this.f38637J = paint6;
        paint6.setAntiAlias(true);
        this.f38651a0 = new CopyOnWriteArraySet();
        this.f38652b0 = new Point();
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f38653c0 = f13;
        this.f38647T = m31798a(f13, -50);
        int iM31798a = m31798a(f13, 4);
        int iM31798a2 = m31798a(f13, 26);
        int iM31798a3 = m31798a(f13, 4);
        int iM31798a4 = m31798a(f13, 12);
        int iM31798a5 = m31798a(f13, 0);
        int iM31798a6 = m31798a(f13, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC11854i0.f38680b, 0, i13);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f38638K = drawable;
                if (drawable != null) {
                    int i14 = AbstractC38065t.f163031a;
                    if (i14 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i14 < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    iM31798a2 = Math.max(drawable.getMinimumHeight(), iM31798a2);
                }
                this.f38639L = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iM31798a);
                this.f38640M = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iM31798a2);
                this.f38641N = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f38642O = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iM31798a3);
                this.f38643P = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iM31798a4);
                this.f38644Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iM31798a5);
                this.f38645R = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iM31798a6);
                int i15 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i16 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i17 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i18 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i19 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i24 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i15);
                paint6.setColor(i16);
                paint2.setColor(i17);
                paint3.setColor(i18);
                paint4.setColor(i19);
                paint5.setColor(i24);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        } else {
            this.f38639L = iM31798a;
            this.f38640M = iM31798a2;
            this.f38641N = 0;
            this.f38642O = iM31798a3;
            this.f38643P = iM31798a4;
            this.f38644Q = iM31798a5;
            this.f38645R = iM31798a6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f38638K = null;
        }
        StringBuilder sb4 = new StringBuilder();
        this.f38648U = sb4;
        this.f38649V = new Formatter(sb4, Locale.getDefault());
        this.f38650W = new RunnableC1319m(this, 20);
        Drawable drawable2 = this.f38638K;
        if (drawable2 != null) {
            this.f38646S = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f38646S = (Math.max(this.f38644Q, Math.max(this.f38643P, this.f38645R)) + 1) / 2;
        }
        this.f38659i0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f38658h0 = valueAnimator;
        valueAnimator.addUpdateListener(new C11845e(this, 0));
        this.f38663m0 = -9223372036854775807L;
        this.f38655e0 = -9223372036854775807L;
        this.f38654d0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m31798a(float f13, int i13) {
        return (int) ((i13 * f13) + 0.5f);
    }

    private long getPositionIncrement() {
        long j7 = this.f38655e0;
        if (j7 != -9223372036854775807L) {
            return j7;
        }
        long j13 = this.f38663m0;
        if (j13 == -9223372036854775807L) {
            return 0L;
        }
        return j13 / ((long) this.f38654d0);
    }

    private String getProgressText() {
        return AbstractC38065t.m121932y(this.f38648U, this.f38649V, this.f38664n0);
    }

    private long getScrubberPosition() {
        Rect rect = this.f38670x;
        if (rect.width() <= 0 || this.f38663m0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f38672z.width()) * this.f38663m0) / ((long) rect.width());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31799b(long j7) {
        long j13 = this.f38663m0;
        if (j13 <= 0) {
            return false;
        }
        long j14 = this.f38661k0 ? this.f38662l0 : this.f38664n0;
        long jM121915h = AbstractC38065t.m121915h(j14 + j7, 0L, j13);
        if (jM121915h == j14) {
            return false;
        }
        if (this.f38661k0) {
            m31803f(jM121915h);
        } else {
            m31800c(jM121915h);
        }
        m31802e();
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m31800c(long j7) {
        this.f38662l0 = j7;
        this.f38661k0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f38651a0.iterator();
        while (it.hasNext()) {
            ((InterfaceC11870q0) it.next()).mo31812a(j7);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m31801d(boolean z4) {
        removeCallbacks(this.f38650W);
        this.f38661k0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f38651a0.iterator();
        while (it.hasNext()) {
            ((InterfaceC11870q0) it.next()).mo31814c(this.f38662l0, z4);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f38638K;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m31802e() {
        Rect rect = this.f38671y;
        Rect rect2 = this.f38670x;
        rect.set(rect2);
        Rect rect3 = this.f38672z;
        rect3.set(rect2);
        long j7 = this.f38661k0 ? this.f38662l0 : this.f38664n0;
        if (this.f38663m0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f38665o0) / this.f38663m0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j7) / this.f38663m0)), rect2.right);
        } else {
            int i13 = rect2.left;
            rect.right = i13;
            rect3.right = i13;
        }
        invalidate(this.f38669w);
    }

    /* JADX INFO: renamed from: f */
    public final void m31803f(long j7) {
        if (this.f38662l0 == j7) {
            return;
        }
        this.f38662l0 = j7;
        Iterator it = this.f38651a0.iterator();
        while (it.hasNext()) {
            ((InterfaceC11870q0) it.next()).mo31813b(j7);
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f38670x.width() / this.f38653c0);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j7 = this.f38663m0;
        if (j7 == 0 || j7 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j7 / ((long) iWidth);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f38638K;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i13;
        canvas.save();
        Rect rect = this.f38670x;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i14 = iCenterY + iHeight;
        long j7 = this.f38663m0;
        Paint paint = this.f38634G;
        Rect rect2 = this.f38672z;
        if (j7 <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i14, paint);
        } else {
            Rect rect3 = this.f38671y;
            int i15 = rect3.left;
            int i16 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i16), rect2.right);
            int i17 = rect.right;
            if (iMax < i17) {
                canvas.drawRect(iMax, iCenterY, i17, i14, paint);
            }
            int iMax2 = Math.max(i15, rect2.right);
            if (i16 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i16, i14, this.f38633F);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i14, this.f38632E);
            }
            if (this.f38666p0 != 0) {
                long[] jArr = this.f38667q0;
                jArr.getClass();
                boolean[] zArr = this.f38668r0;
                zArr.getClass();
                int i18 = this.f38642O;
                int i19 = i18 / 2;
                int i24 = 0;
                int i25 = 0;
                while (i25 < this.f38666p0) {
                    int iMin = Math.min(rect.width() - i18, Math.max(i24, ((int) ((((long) rect.width()) * AbstractC38065t.m121915h(jArr[i25], 0L, this.f38663m0)) / this.f38663m0)) - i19)) + rect.left;
                    int i26 = i25;
                    canvas.drawRect(iMin, iCenterY, iMin + i18, i14, zArr[i25] ? this.f38636I : this.f38635H);
                    i25 = i26 + 1;
                    i24 = i24;
                }
            }
            canvas2 = canvas;
        }
        if (this.f38663m0 > 0) {
            int iM121914g = AbstractC38065t.m121914g(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f38638K;
            if (drawable == null) {
                if (this.f38661k0 || isFocused()) {
                    i13 = this.f38645R;
                } else {
                    i13 = isEnabled() ? this.f38643P : this.f38644Q;
                }
                canvas2.drawCircle(iM121914g, iCenterY2, (int) ((i13 * this.f38659i0) / 2.0f), this.f38637J);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f38659i0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f38659i0)) / 2;
                drawable.setBounds(iM121914g - intrinsicWidth, iCenterY2 - intrinsicHeight, iM121914g + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z4, int i13, Rect rect) {
        super.onFocusChanged(z4, i13, rect);
        if (!this.f38661k0 || z4) {
            return;
        }
        m31801d(false);
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
        if (this.f38663m0 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
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
                        if (m31799b(positionIncrement)) {
                            RunnableC1319m runnableC1319m = this.f38650W;
                            removeCallbacks(runnableC1319m);
                            postDelayed(runnableC1319m, 1000L);
                            return true;
                        }
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        if (m31799b(positionIncrement)) {
                            RunnableC1319m runnableC1319m2 = this.f38650W;
                            removeCallbacks(runnableC1319m2);
                            postDelayed(runnableC1319m2, 1000L);
                            return true;
                        }
                        break;
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        if (this.f38661k0) {
                            m31801d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f38661k0) {
                m31801d(false);
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
        int i19 = this.f38660j0 ? 0 : this.f38646S;
        int i24 = this.f38641N;
        int i25 = this.f38639L;
        int i26 = this.f38640M;
        if (i24 == 1) {
            paddingBottom = (i18 - getPaddingBottom()) - i26;
            paddingBottom2 = ((i18 - getPaddingBottom()) - i25) - Math.max(i19 - (i25 / 2), 0);
        } else {
            paddingBottom = (i18 - i26) / 2;
            paddingBottom2 = (i18 - i25) / 2;
        }
        Rect rect2 = this.f38669w;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i26 + paddingBottom);
        this.f38670x.set(rect2.left + i19, paddingBottom2, rect2.right - i19, i25 + paddingBottom2);
        if (AbstractC38065t.f163031a >= 29 && ((rect = this.f38657g0) == null || rect.width() != i17 || this.f38657g0.height() != i18)) {
            Rect rect3 = new Rect(0, 0, i17, i18);
            this.f38657g0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m31802e();
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int i15 = this.f38640M;
        if (mode == 0) {
            size = i15;
        } else if (mode != 1073741824) {
            size = Math.min(i15, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i13), size);
        Drawable drawable = this.f38638K;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        Drawable drawable = this.f38638K;
        if (drawable == null || AbstractC38065t.f163031a < 23 || !drawable.setLayoutDirection(i13)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f38663m0 > 0) {
            int x3 = (int) motionEvent.getX();
            int y13 = (int) motionEvent.getY();
            Point point = this.f38652b0;
            point.set(x3, y13);
            int i13 = point.x;
            int i14 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f38670x;
            Rect rect2 = this.f38672z;
            if (action == 0) {
                int i15 = i13;
                if (this.f38669w.contains(i15, i14)) {
                    rect2.right = AbstractC38065t.m121914g(i15, rect.left, rect.right);
                    m31800c(getScrubberPosition());
                    m31802e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f38661k0) {
                    m31801d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f38661k0) {
                        m31801d(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f38661k0) {
                if (i14 < this.f38647T) {
                    int i16 = this.f38656f0;
                    rect2.right = AbstractC38065t.m121914g(((i13 - i16) / 3) + i16, rect.left, rect.right);
                } else {
                    this.f38656f0 = i13;
                    rect2.right = AbstractC38065t.m121914g(i13, rect.left, rect.right);
                }
                m31803f(getScrubberPosition());
                m31802e();
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
        if (this.f38663m0 <= 0) {
            return false;
        }
        if (i13 == 8192) {
            if (m31799b(-getPositionIncrement())) {
                m31801d(false);
            }
        } else {
            if (i13 != 4096) {
                return false;
            }
            if (m31799b(getPositionIncrement())) {
                m31801d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i13) {
        this.f38635H.setColor(i13);
        invalidate(this.f38669w);
    }

    public void setBufferedColor(int i13) {
        this.f38633F.setColor(i13);
        invalidate(this.f38669w);
    }

    public void setBufferedPosition(long j7) {
        if (this.f38665o0 == j7) {
            return;
        }
        this.f38665o0 = j7;
        m31802e();
    }

    public void setDuration(long j7) {
        if (this.f38663m0 == j7) {
            return;
        }
        this.f38663m0 = j7;
        if (this.f38661k0 && j7 == -9223372036854775807L) {
            m31801d(true);
        }
        m31802e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (!this.f38661k0 || z4) {
            return;
        }
        m31801d(true);
    }

    public void setKeyCountIncrement(int i13) {
        AbstractC35849g.m113802d(i13 > 0);
        this.f38654d0 = i13;
        this.f38655e0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j7) {
        AbstractC35849g.m113802d(j7 > 0);
        this.f38654d0 = -1;
        this.f38655e0 = j7;
    }

    public void setPlayedAdMarkerColor(int i13) {
        this.f38636I.setColor(i13);
        invalidate(this.f38669w);
    }

    public void setPlayedColor(int i13) {
        this.f38632E.setColor(i13);
        invalidate(this.f38669w);
    }

    public void setPosition(long j7) {
        if (this.f38664n0 == j7) {
            return;
        }
        this.f38664n0 = j7;
        setContentDescription(getProgressText());
        m31802e();
    }

    public void setScrubberColor(int i13) {
        this.f38637J.setColor(i13);
        invalidate(this.f38669w);
    }

    public void setUnplayedColor(int i13) {
        this.f38634G.setColor(i13);
        invalidate(this.f38669w);
    }
}
