package m23;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import ar.C1916d;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.android.R;
import e10.C12554k0;
import e23.C12599a;
import f23.C14036b;
import f23.EnumC14035a;
import g23.ViewOnTouchListenerC15285a;
import g73.C15556d;
import i23.InterfaceC18016a;
import io.getstream.photoview.dialog.common.pager.MultiTouchViewPager;
import j23.C21262a;
import j23.C21263b;
import java.util.ArrayList;
import java.util.Iterator;
import m83.C25271y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m23.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C24970d extends RelativeLayout {

    /* JADX INFO: renamed from: E */
    public int[] f97718E;

    /* JADX INFO: renamed from: F */
    public View f97719F;

    /* JADX INFO: renamed from: G */
    public final ViewGroup f97720G;

    /* JADX INFO: renamed from: H */
    public final View f97721H;

    /* JADX INFO: renamed from: I */
    public final ViewGroup f97722I;

    /* JADX INFO: renamed from: J */
    public final FrameLayout f97723J;

    /* JADX INFO: renamed from: K */
    public final ImageView f97724K;

    /* JADX INFO: renamed from: L */
    public final MultiTouchViewPager f97725L;

    /* JADX INFO: renamed from: M */
    public C21263b f97726M;

    /* JADX INFO: renamed from: N */
    public final C14036b f97727N;

    /* JADX INFO: renamed from: O */
    public final C12554k0 f97728O;

    /* JADX INFO: renamed from: P */
    public final ScaleGestureDetector f97729P;

    /* JADX INFO: renamed from: Q */
    public ViewOnTouchListenerC15285a f97730Q;

    /* JADX INFO: renamed from: R */
    public boolean f97731R;

    /* JADX INFO: renamed from: S */
    public boolean f97732S;

    /* JADX INFO: renamed from: T */
    public boolean f97733T;

    /* JADX INFO: renamed from: U */
    public EnumC14035a f97734U;

    /* JADX INFO: renamed from: V */
    public Object f97735V;

    /* JADX INFO: renamed from: W */
    public InterfaceC18016a f97736W;

    /* JADX INFO: renamed from: a0 */
    public C15556d f97737a0;

    /* JADX INFO: renamed from: b0 */
    public int f97738b0;

    /* JADX INFO: renamed from: w */
    public boolean f97739w;

    /* JADX INFO: renamed from: x */
    public boolean f97740x;

    /* JADX INFO: renamed from: y */
    public InterfaceC4339a f97741y;

    /* JADX INFO: renamed from: z */
    public Function1 f97742z;

    public C24970d(Context context) {
        super(context, null, 0);
        this.f97739w = true;
        this.f97740x = true;
        this.f97718E = new int[]{0, 0, 0, 0};
        this.f97735V = C25271y.f99162w;
        View.inflate(context, R.layout.view_image_viewer, this);
        this.f97720G = (ViewGroup) findViewById(R.id.rootContainer);
        this.f97721H = findViewById(R.id.backgroundView);
        this.f97722I = (ViewGroup) findViewById(R.id.dismissContainer);
        this.f97723J = (FrameLayout) findViewById(R.id.transitionImageContainer);
        this.f97724K = (ImageView) findViewById(R.id.transitionImageView);
        MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager) findViewById(R.id.imagesPager);
        this.f97725L = multiTouchViewPager;
        AbstractC5583n.m16785k(multiTouchViewPager, new C24968b(this, 0), null, 5);
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.f97727N = new C14036b(context2, new C24968b(this, 1));
        this.f97728O = new C12554k0(getContext(), new C12599a(new C24968b(this, 2), new C24968b(this, 3)));
        this.f97729P = new ScaleGestureDetector(getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener());
    }

    /* JADX INFO: renamed from: a */
    public static void m73290a(C24970d c24970d, MotionEvent it) {
        AbstractC22676k.m65750j(it, "it");
        if (c24970d.f97725L.f74903L0) {
            boolean z4 = c24970d.f97733T;
            View view = c24970d.f97719F;
            if (view == null || z4) {
                return;
            }
            boolean z13 = view.getVisibility() == 0;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", z13 ? 1.0f : 0.0f, z13 ? 0.0f : 1.0f);
            objectAnimatorOfFloat.setDuration(ViewConfiguration.getDoubleTapTimeout());
            if (z13) {
                objectAnimatorOfFloat.addListener(new C1916d(view, 5));
            } else {
                view.setVisibility(0);
            }
            objectAnimatorOfFloat.start();
            super.dispatchTouchEvent(it);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m73291b(C24970d this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return this$0.getShouldDismissToBottom();
    }

    private final boolean getShouldDismissToBottom() {
        return true;
    }

    private final void setStartPosition(int i13) {
        this.f97738b0 = i13;
        setCurrentPosition$photoview_dialog_release(i13);
    }

    /* JADX INFO: renamed from: c */
    public final void m73292c() {
        FrameLayout frameLayout = this.f97723J;
        AbstractC22676k.m65750j(frameLayout, "<this>");
        frameLayout.setVisibility(0);
        MultiTouchViewPager multiTouchViewPager = this.f97725L;
        AbstractC22676k.m65750j(multiTouchViewPager, "<this>");
        multiTouchViewPager.setVisibility(8);
        Integer num = 0;
        ViewGroup viewGroup = this.f97722I;
        AbstractC22676k.m65750j(viewGroup, "<this>");
        if (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(num.intValue());
            marginLayoutParams.topMargin = num.intValue();
            marginLayoutParams.setMarginEnd(num != null ? num.intValue() : marginLayoutParams.getMarginEnd());
            marginLayoutParams.bottomMargin = num != null ? num.intValue() : marginLayoutParams.bottomMargin;
            viewGroup.setLayoutParams(marginLayoutParams);
        }
        if (this.f97737a0 == null) {
            AbstractC22676k.m65757q("transitionImageAnimator");
            throw null;
        }
        getShouldDismissToBottom();
        InterfaceC4339a interfaceC4339a = this.f97741y;
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m73293d() {
        if (!getShouldDismissToBottom()) {
            m73292c();
            return;
        }
        ViewOnTouchListenerC15285a viewOnTouchListenerC15285a = this.f97730Q;
        if (viewOnTouchListenerC15285a != null) {
            viewOnTouchListenerC15285a.m43400a(viewOnTouchListenerC15285a.f57425w.getHeight());
        } else {
            AbstractC22676k.m65757q("swipeDismissHandler");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0188  */
    /* JADX WARN: Code duplicated, block: B:103:0x018c  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        EnumC14035a enumC14035a;
        View view;
        AbstractC22676k.m65750j(event, "event");
        View view2 = this.f97719F;
        if ((view2 == null || view2.getVisibility() != 0 || (view = this.f97719F) == null || !view.dispatchTouchEvent(event)) && this.f97737a0 != null && (!this.f97732S || event.getAction() != 2 || event.getPointerCount() != 1)) {
            int action = event.getAction();
            ViewGroup viewGroup = this.f97720G;
            MultiTouchViewPager multiTouchViewPager = this.f97725L;
            if (action == 1) {
                this.f97732S = false;
                ViewOnTouchListenerC15285a viewOnTouchListenerC15285a = this.f97730Q;
                if (viewOnTouchListenerC15285a == null) {
                    AbstractC22676k.m65757q("swipeDismissHandler");
                    throw null;
                }
                viewOnTouchListenerC15285a.onTouch(viewGroup, event);
                multiTouchViewPager.dispatchTouchEvent(event);
                View view3 = this.f97719F;
                this.f97733T = view3 != null && view3.getVisibility() == 0 && view3.dispatchTouchEvent(event);
            }
            if (event.getAction() == 0) {
                this.f97734U = null;
                this.f97731R = false;
                multiTouchViewPager.dispatchTouchEvent(event);
                ViewOnTouchListenerC15285a viewOnTouchListenerC15285a2 = this.f97730Q;
                if (viewOnTouchListenerC15285a2 == null) {
                    AbstractC22676k.m65757q("swipeDismissHandler");
                    throw null;
                }
                viewOnTouchListenerC15285a2.onTouch(viewGroup, event);
                View view4 = this.f97719F;
                this.f97733T = view4 != null && view4.getVisibility() == 0 && view4.dispatchTouchEvent(event);
            }
            ScaleGestureDetector scaleGestureDetector = this.f97729P;
            scaleGestureDetector.onTouchEvent(event);
            ((GestureDetector) this.f97728O.f42881x).onTouchEvent(event);
            if (this.f97734U == null && (scaleGestureDetector.isInProgress() || event.getPointerCount() > 1 || this.f97731R)) {
                this.f97731R = true;
                return multiTouchViewPager.dispatchTouchEvent(event);
            }
            if (m73294e()) {
                return super.dispatchTouchEvent(event);
            }
            C14036b c14036b = this.f97727N;
            C24968b c24968b = c14036b.f50091a;
            int action2 = event.getAction();
            if (action2 == 0) {
                c14036b.f50093c = event.getX();
                c14036b.f50094d = event.getY();
            } else if (action2 == 1) {
                if (!c14036b.f50095e) {
                    c24968b.invoke(EnumC14035a.f50088x);
                }
                c14036b.f50094d = 0.0f;
                c14036b.f50093c = 0.0f;
                c14036b.f50095e = false;
            } else if (action2 != 2) {
                if (action2 == 3) {
                    if (!c14036b.f50095e) {
                        c24968b.invoke(EnumC14035a.f50088x);
                    }
                    c14036b.f50094d = 0.0f;
                    c14036b.f50093c = 0.0f;
                    c14036b.f50095e = false;
                }
            } else if (!c14036b.f50095e) {
                float x3 = event.getX(0) - c14036b.f50093c;
                float y13 = event.getY(0) - c14036b.f50094d;
                if (((float) Math.sqrt((y13 * y13) + (x3 * x3))) > c14036b.f50092b) {
                    c14036b.f50095e = true;
                    double d3 = 180;
                    double dAtan2 = ((((Math.atan2(c14036b.f50094d - event.getY(), event.getX() - c14036b.f50093c) + 3.141592653589793d) * d3) / 3.141592653589793d) + d3) % ((double) 360);
                    EnumC14035a.f50087w.getClass();
                    if (0.0d <= dAtan2 && dAtan2 <= 45.0d) {
                        enumC14035a = EnumC14035a.f50085F;
                    } else if (45.0d <= dAtan2 && dAtan2 <= 135.0d) {
                        enumC14035a = EnumC14035a.f50089y;
                    } else if (135.0d <= dAtan2 && dAtan2 <= 225.0d) {
                        enumC14035a = EnumC14035a.f50084E;
                    } else if (225.0d > dAtan2 || dAtan2 > 315.0d) {
                        enumC14035a = (315.0d > dAtan2 || dAtan2 > 360.0d) ? EnumC14035a.f50088x : EnumC14035a.f50085F;
                    } else {
                        enumC14035a = EnumC14035a.f50090z;
                    }
                    c24968b.invoke(enumC14035a);
                }
            }
            EnumC14035a enumC14035a2 = this.f97734U;
            int i13 = enumC14035a2 == null ? -1 : AbstractC24969c.f97717a[enumC14035a2.ordinal()];
            if (i13 == 1 || i13 == 2) {
                if (this.f97740x && !this.f97731R && multiTouchViewPager.f74903L0) {
                    ViewOnTouchListenerC15285a viewOnTouchListenerC15285a3 = this.f97730Q;
                    if (viewOnTouchListenerC15285a3 != null) {
                        return viewOnTouchListenerC15285a3.onTouch(viewGroup, event);
                    }
                    AbstractC22676k.m65757q("swipeDismissHandler");
                    throw null;
                }
            } else if (i13 == 3 || i13 == 4) {
                return multiTouchViewPager.dispatchTouchEvent(event);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m73294e() {
        Object next;
        C21263b c21263b = this.f97726M;
        if (c21263b == null) {
            return false;
        }
        int currentPosition$photoview_dialog_release = getCurrentPosition$photoview_dialog_release();
        Iterator it = c21263b.f81179i.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C21262a) next).f81169b != currentPosition$photoview_dialog_release);
        C21262a c21262a = (C21262a) next;
        return c21262a != null && c21262a.f81171d.getScale() > 1.0f;
    }

    /* JADX INFO: renamed from: f */
    public final void m73295f(ArrayList arrayList, int i13, InterfaceC18016a imageLoader) {
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        this.f97735V = arrayList;
        this.f97736W = imageLoader;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        C21263b c21263b = new C21263b(context, arrayList, imageLoader, this.f97739w);
        this.f97726M = c21263b;
        this.f97725L.setAdapter(c21263b);
        setStartPosition(i13);
    }

    public final int[] getContainerPadding$photoview_dialog_release() {
        return this.f97718E;
    }

    public final int getCurrentPosition$photoview_dialog_release() {
        return this.f97725L.getCurrentItem();
    }

    public final int getImagesMargin$photoview_dialog_release() {
        return this.f97725L.getPageMargin();
    }

    public final InterfaceC4339a getOnDismiss$photoview_dialog_release() {
        return this.f97741y;
    }

    public final Function1 getOnPageChange$photoview_dialog_release() {
        return this.f97742z;
    }

    public final View getOverlayView$photoview_dialog_release() {
        return this.f97719F;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i13) {
        findViewById(R.id.backgroundView).setBackgroundColor(i13);
    }

    public final void setContainerPadding$photoview_dialog_release(int[] iArr) {
        AbstractC22676k.m65750j(iArr, "<set-?>");
        this.f97718E = iArr;
    }

    public final void setCurrentPosition$photoview_dialog_release(int i13) {
        this.f97725L.setCurrentItem(i13);
    }

    public final void setImagesMargin$photoview_dialog_release(int i13) {
        this.f97725L.setPageMargin(i13);
    }

    public final void setOnDismiss$photoview_dialog_release(InterfaceC4339a interfaceC4339a) {
        this.f97741y = interfaceC4339a;
    }

    public final void setOnPageChange$photoview_dialog_release(Function1 function1) {
        this.f97742z = function1;
    }

    public final void setOverlayView$photoview_dialog_release(View view) {
        this.f97719F = view;
        if (view != null) {
            this.f97720G.addView(view);
        }
    }

    public final void setSwipeToDismissAllowed$photoview_dialog_release(boolean z4) {
        this.f97740x = z4;
    }

    public final void setZoomingAllowed$photoview_dialog_release(boolean z4) {
        this.f97739w = z4;
    }
}
