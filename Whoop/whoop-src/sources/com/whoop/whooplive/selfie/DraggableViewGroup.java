package com.whoop.whooplive.selfie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import e50.C12723b;
import lh3.C24082e;
import pz2.AbstractC29650c;
import pz2.AbstractC29655h;
import qr2.AbstractC30556a;
import tr2.C34117o;
import tr2.InterfaceC34116n;
import xg3.C38274a;
import xg3.C38280g;

/* JADX INFO: loaded from: classes11.dex */
public class DraggableViewGroup extends FrameLayout {

    /* JADX INFO: renamed from: E */
    private int f33426E;

    /* JADX INFO: renamed from: F */
    private int f33427F;

    /* JADX INFO: renamed from: G */
    private float f33428G;

    /* JADX INFO: renamed from: H */
    private float f33429H;

    /* JADX INFO: renamed from: I */
    private ScaleGestureDetector f33430I;

    /* JADX INFO: renamed from: J */
    private GestureDetector f33431J;

    /* JADX INFO: renamed from: K */
    private float f33432K;

    /* JADX INFO: renamed from: L */
    private float f33433L;

    /* JADX INFO: renamed from: M */
    private float f33434M;

    /* JADX INFO: renamed from: N */
    private float f33435N;

    /* JADX INFO: renamed from: O */
    private boolean f33436O;

    /* JADX INFO: renamed from: P */
    private int f33437P;

    /* JADX INFO: renamed from: Q */
    private View f33438Q;

    /* JADX INFO: renamed from: R */
    private Rect f33439R;

    /* JADX INFO: renamed from: S */
    int[] f33440S;

    /* JADX INFO: renamed from: T */
    private C24082e f33441T;

    /* JADX INFO: renamed from: U */
    private C24082e f33442U;

    /* JADX INFO: renamed from: w */
    private InterfaceC34116n f33443w;

    /* JADX INFO: renamed from: x */
    private boolean f33444x;

    /* JADX INFO: renamed from: y */
    private int f33445y;

    /* JADX INFO: renamed from: z */
    private int f33446z;

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.DraggableViewGroup$a */
    public class C10867a extends GestureDetector.SimpleOnGestureListener {
        public /* synthetic */ C10867a(DraggableViewGroup draggableViewGroup, int i13) {
            this();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
            if (DraggableViewGroup.this.f33436O) {
                return false;
            }
            if (motionEvent.getPointerId(0) != motionEvent2.getPointerId(0)) {
                DraggableViewGroup.this.f33443w.mo85226q("Pointer IDs do not match", new AbstractC30556a.a[0]);
                return false;
            }
            if (DraggableViewGroup.this.f33437P == Integer.MIN_VALUE) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) DraggableViewGroup.this.f33438Q.getLayoutParams();
                DraggableViewGroup.this.f33434M = marginLayoutParams.leftMargin;
                DraggableViewGroup.this.f33435N = marginLayoutParams.topMargin;
                DraggableViewGroup.this.f33437P = motionEvent.getPointerId(0);
            }
            float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
            float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
            int i13 = (int) (DraggableViewGroup.this.f33434M + rawX);
            int i14 = (int) (DraggableViewGroup.this.f33435N + rawY);
            if (DraggableViewGroup.this.m28704u()) {
                DraggableViewGroup.this.f33441T.onNext(new Pair(Integer.valueOf(i13), Integer.valueOf(i14)));
                return true;
            }
            DraggableViewGroup.this.m28707x(i13, i14);
            return true;
        }

        private C10867a() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.DraggableViewGroup$b */
    public class C10868b extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* JADX INFO: renamed from: w */
        private float f33448w;

        public /* synthetic */ C10868b(DraggableViewGroup draggableViewGroup, int i13) {
            this();
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan();
            if (Math.abs(currentSpan - this.f33448w) < DraggableViewGroup.this.f33433L) {
                return false;
            }
            this.f33448w = currentSpan;
            DraggableViewGroup.this.f33436O = true;
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (scaleFactor == 1.0f) {
                return false;
            }
            DraggableViewGroup.this.f33432K *= scaleFactor;
            DraggableViewGroup draggableViewGroup = DraggableViewGroup.this;
            draggableViewGroup.f33432K = Math.max(draggableViewGroup.f33429H, Math.min(DraggableViewGroup.this.f33432K, DraggableViewGroup.this.f33428G));
            if (DraggableViewGroup.this.f33444x) {
                DraggableViewGroup.this.f33442U.onNext(Float.valueOf(DraggableViewGroup.this.f33432K));
                return true;
            }
            DraggableViewGroup draggableViewGroup2 = DraggableViewGroup.this;
            draggableViewGroup2.m28708y(draggableViewGroup2.f33432K);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            this.f33448w = Float.MIN_VALUE;
        }

        private C10868b() {
            this.f33448w = Float.MIN_VALUE;
        }
    }

    public DraggableViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33432K = 1.0f;
        this.f33439R = new Rect();
        this.f33440S = new int[2];
        this.f33441T = C24082e.m71000Y();
        this.f33442U = C24082e.m71000Y();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC29655h.f121202d, 0, 0);
        m28703t(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private int getParentHeight() {
        return ((View) getParent()).getMeasuredHeight();
    }

    private int getParentWidth() {
        return ((View) getParent()).getMeasuredWidth();
    }

    /* JADX INFO: renamed from: s */
    private boolean m28702s(View view, int i13, int i14) {
        view.getDrawingRect(this.f33439R);
        Rect rect = this.f33439R;
        rect.right = rect.left + ((int) (view.getScaleX() * rect.width()));
        Rect rect2 = this.f33439R;
        rect2.bottom = rect2.top + ((int) (view.getScaleY() * rect2.height()));
        view.getLocationOnScreen(this.f33440S);
        Rect rect3 = this.f33439R;
        int[] iArr = this.f33440S;
        rect3.offset(iArr[0], iArr[1]);
        return this.f33439R.contains(i13, i14);
    }

    /* JADX INFO: renamed from: t */
    private void m28703t(TypedArray typedArray) {
        this.f33443w = new C34117o(C12723b.m35566a().m35569d(), "DraggableViewGroup");
        int i13 = 0;
        this.f33431J = new GestureDetector(getContext(), new C10867a(this, i13));
        this.f33430I = new ScaleGestureDetector(getContext(), new C10868b(this, i13));
        this.f33433L = getResources().getDimensionPixelSize(AbstractC29650c.f121094b);
        if (typedArray != null) {
            setSyncWithSiblings(typedArray.getBoolean(AbstractC29655h.f121209k, false));
            this.f33445y = typedArray.getDimensionPixelSize(AbstractC29655h.f121204f, 0);
            this.f33446z = typedArray.getDimensionPixelSize(AbstractC29655h.f121205g, 0);
            this.f33426E = typedArray.getDimensionPixelSize(AbstractC29655h.f121206h, 0);
            this.f33427F = typedArray.getDimensionPixelSize(AbstractC29655h.f121203e, 0);
            this.f33428G = typedArray.getFloat(AbstractC29655h.f121207i, 2.0f);
            this.f33429H = typedArray.getFloat(AbstractC29655h.f121208j, 0.5f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            return;
        }
        if (getChildCount() == 1) {
            this.f33438Q = getChildAt(0);
            return;
        }
        throw new IllegalStateException("DraggableViewGroup " + getId() + " must have exactly 1 child View.");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m28702s(this.f33438Q, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f33436O = false;
            this.f33437P = Integer.MIN_VALUE;
        }
        return super.onTouchEvent(motionEvent) | this.f33430I.onTouchEvent(motionEvent) | this.f33431J.onTouchEvent(motionEvent);
    }

    public void setSyncWithSiblings(boolean z4) {
        this.f33444x = z4;
    }

    /* JADX INFO: renamed from: u */
    public boolean m28704u() {
        return this.f33444x;
    }

    /* JADX INFO: renamed from: v */
    public C38280g<Pair<Integer, Integer>> m28705v() {
        return this.f33441T.m122656F(5L, null, C38274a.f164079b);
    }

    /* JADX INFO: renamed from: w */
    public C38280g<Float> m28706w() {
        return this.f33442U.m122656F(5L, null, C38274a.f164079b);
    }

    /* JADX INFO: renamed from: x */
    public void m28707x(int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f33438Q.getLayoutParams();
        int measuredWidth = this.f33438Q.getMeasuredWidth();
        int measuredHeight = this.f33438Q.getMeasuredHeight();
        int scaleX = (int) (this.f33438Q.getScaleX() * measuredWidth);
        int scaleY = (int) (this.f33438Q.getScaleY() * measuredHeight);
        int parentWidth = getParentWidth();
        int parentHeight = getParentHeight();
        int i15 = measuredWidth / 2;
        int i16 = scaleX / 2;
        int i17 = (i13 + i15) - i16;
        int i18 = measuredHeight / 2;
        int i19 = scaleY / 2;
        int i24 = (i14 + i18) - i19;
        int i25 = i17 + scaleX;
        int i26 = i24 + scaleY;
        int i27 = this.f33445y;
        if (i25 < i27) {
            i13 = ((i27 - i15) + i16) - scaleX;
        }
        int i28 = this.f33446z;
        if (i17 > parentWidth - i28) {
            i13 = ((parentWidth - i28) - i15) + i16;
        }
        int i29 = this.f33426E;
        int i34 = i26 < i29 ? ((i29 - i18) + i19) - scaleY : i14;
        int i35 = this.f33427F;
        if (i24 > parentHeight - i35) {
            i34 = ((parentHeight - i35) - i18) + i19;
        }
        marginLayoutParams.leftMargin = i13;
        marginLayoutParams.topMargin = i34;
        this.f33438Q.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: y */
    public void m28708y(float f13) {
        this.f33438Q.setScaleX(f13);
        this.f33438Q.setScaleY(f13);
    }
}
