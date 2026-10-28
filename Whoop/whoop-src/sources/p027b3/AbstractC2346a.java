package p027b3;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p018ui.node.Owner;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.C3003e1;
import c93.InterfaceC4339a;
import cc3.AbstractC4420c;
import cc3.C4419b;
import com.whoop.android.R;
import ge3.AbstractC15751g;
import hc3.C17171d;
import java.lang.ref.WeakReference;
import l83.C23470p;
import p007a6.C0410c;
import p026b2.C2299e;
import p026b2.C2312r;
import p026b2.InterfaceC2317w;
import p117eh.C13184a;
import p390p1.AbstractC28667t;
import p390p1.C28676v0;
import p390p1.C28688y1;
import p390p1.EnumC28681w1;
import p390p1.InterfaceC28663s;
import p390p1.InterfaceC28680w0;
import p602x1.C37816b;
import p603x2.AbstractC37831a;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.C22669g0;
import q83.C30064k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: b3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2346a extends ViewGroup {

    /* JADX INFO: renamed from: I */
    public static final int f9276I = 8;

    /* JADX INFO: renamed from: E */
    private InterfaceC4339a f9277E;

    /* JADX INFO: renamed from: F */
    private boolean f9278F;

    /* JADX INFO: renamed from: G */
    private boolean f9279G;

    /* JADX INFO: renamed from: H */
    private boolean f9280H;

    /* JADX INFO: renamed from: w */
    private WeakReference<AbstractC28667t> f9281w;

    /* JADX INFO: renamed from: x */
    private IBinder f9282x;

    /* JADX INFO: renamed from: y */
    private InterfaceC28663s f9283y;

    /* JADX INFO: renamed from: z */
    private AbstractC28667t f9284z;

    public /* synthetic */ AbstractC2346a(Context context) {
        this(context, null, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(AbstractC28667t abstractC28667t) {
        if (this.f9284z != abstractC28667t) {
            this.f9284z = abstractC28667t;
            if (abstractC28667t != null) {
                this.f9281w = null;
            }
            InterfaceC28663s interfaceC28663s = this.f9283y;
            if (interfaceC28663s != null) {
                interfaceC28663s.dispose();
                this.f9283y = null;
                if (isAttachedToWindow()) {
                    m7236e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f9282x != iBinder) {
            this.f9282x = iBinder;
            this.f9281w = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3598a(Composer composer, int i13);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        m7233b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        m7233b();
        return super.addViewInLayout(view, i13, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m7233b() {
        if (this.f9279G) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX INFO: renamed from: c */
    public final void m7234c() {
        if (this.f9284z == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        m7236e();
    }

    /* JADX INFO: renamed from: d */
    public final void m7235d() {
        InterfaceC28663s interfaceC28663s = this.f9283y;
        if (interfaceC28663s != null) {
            interfaceC28663s.dispose();
        }
        this.f9283y = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: e */
    public final void m7236e() {
        if (this.f9283y == null) {
            try {
                this.f9279G = true;
                this.f9283y = AbstractC2465x3.m7444a(this, m7239h(), new C37816b(new C2312r(this, 1), true, -656146368));
            } finally {
                this.f9279G = false;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo7237f(boolean z4, int i13, int i14, int i15, int i16) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i15 - i13) - getPaddingRight(), (i16 - i14) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo7238g(int i13, int i14) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i13, i14);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i13) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i13)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i14) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i14)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final boolean getHasComposition() {
        return this.f9283y != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f9278F;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC28667t m7239h() {
        C28688y1 c28688y1;
        InterfaceC30063j interfaceC30063j;
        C2363d1 c2363d1;
        int i13;
        Object parent;
        AbstractC28667t abstractC28667tM7430b = this.f9284z;
        if (abstractC28667tM7430b == null) {
            abstractC28667tM7430b = AbstractC2445t3.m7430b(this);
            if (abstractC28667tM7430b == null) {
                ViewParent parent2 = getParent();
                while (true) {
                    if (abstractC28667tM7430b != null || !(parent instanceof View)) {
                        parent = parent2;
                        break;
                    }
                    parent = parent2;
                    View view = (View) parent;
                    abstractC28667tM7430b = AbstractC2445t3.m7430b(view);
                    parent = view.getParent();
                }
            }
            boolean z4 = false;
            if (abstractC28667tM7430b != null) {
                AbstractC28667t abstractC28667t = (!(abstractC28667tM7430b instanceof C28688y1) || ((EnumC28681w1) ((C28688y1) abstractC28667tM7430b).f116055u.getValue()).compareTo(EnumC28681w1.f116015x) > 0) ? abstractC28667tM7430b : null;
                if (abstractC28667t != null) {
                    this.f9281w = new WeakReference<>(abstractC28667t);
                }
            } else {
                abstractC28667tM7430b = null;
            }
            if (abstractC28667tM7430b == null) {
                WeakReference<AbstractC28667t> weakReference = this.f9281w;
                if (weakReference == null || (abstractC28667tM7430b = weakReference.get()) == null || ((abstractC28667tM7430b instanceof C28688y1) && ((EnumC28681w1) ((C28688y1) abstractC28667tM7430b).f116055u.getValue()).compareTo(EnumC28681w1.f116015x) <= 0)) {
                    abstractC28667tM7430b = null;
                }
                if (abstractC28667tM7430b == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC37831a.m121374b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent3 = getParent();
                    while (parent3 instanceof View) {
                        View view3 = (View) parent3;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent3 = view3.getParent();
                    }
                    AbstractC28667t abstractC28667tM7430b2 = AbstractC2445t3.m7430b(view2);
                    if (abstractC28667tM7430b2 == null) {
                        ((C2420o3) AbstractC2425p3.f9512a.get()).getClass();
                        InterfaceC30063j interfaceC30063j2 = C30064k.f122676w;
                        C23470p c23470p = C2353b1.f9294K;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC30063j = (InterfaceC30063j) C2353b1.f9294K.getValue();
                        } else {
                            interfaceC30063j = (InterfaceC30063j) C2353b1.f9295L.get();
                            if (interfaceC30063j == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        InterfaceC30063j interfaceC30063jPlus = interfaceC30063j.plus(interfaceC30063j2);
                        InterfaceC28680w0 interfaceC28680w0 = (InterfaceC28680w0) interfaceC30063jPlus.get(C28676v0.f115975x);
                        if (interfaceC28680w0 != null) {
                            c2363d1 = new C2363d1(interfaceC28680w0);
                            C13184a c13184a = (C13184a) c2363d1.f9329y;
                            synchronized (c13184a.f45697b) {
                                c13184a.f45696a = false;
                            }
                        } else {
                            c2363d1 = null;
                        }
                        C22669g0 c22669g0 = new C22669g0();
                        InterfaceC30063j c2419o2 = (InterfaceC2317w) interfaceC30063jPlus.get(C2299e.f9113P);
                        if (c2419o2 == null) {
                            c2419o2 = new C2419o2();
                            c22669g0.f89336w = c2419o2;
                        }
                        if (c2363d1 != null) {
                            interfaceC30063j2 = c2363d1;
                        }
                        InterfaceC30063j interfaceC30063jPlus2 = interfaceC30063jPlus.plus(interfaceC30063j2).plus(c2419o2);
                        c28688y1 = new C28688y1(interfaceC30063jPlus2);
                        synchronized (c28688y1.f116037c) {
                            i13 = 1;
                            c28688y1.f116054t = true;
                        }
                        C17171d c17171dM8708b = AbstractC3006f0.m8708b(interfaceC30063jPlus2);
                        InterfaceC1585g0 interfaceC1585g0M5017g = AbstractC1613o1.m5017g(view2);
                        AbstractC1638x lifecycle = interfaceC1585g0M5017g != null ? interfaceC1585g0M5017g.getLifecycle() : null;
                        if (lifecycle == null) {
                            AbstractC37831a.m121375c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new KotlinNothingValueException();
                        }
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2380g3(view2, i13, c28688y1));
                        lifecycle.mo4986a(new C2435r3(c17171dM8708b, c2363d1, c28688y1, c22669g0, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, c28688y1);
                        C3003e1 c3003e1 = C3003e1.f12012w;
                        Handler handler = view2.getHandler();
                        int i14 = AbstractC4420c.f17883a;
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2357c0(AbstractC3006f0.m8732z(c3003e1, new C4419b(handler, "windowRecomposer cleanup", false).f17882z, null, new C0410c(c28688y1, view2, z4 ? 1 : 0, 7), 2), 2));
                    } else {
                        if (!(abstractC28667tM7430b2 instanceof C28688y1)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        c28688y1 = (C28688y1) abstractC28667tM7430b2;
                    }
                    C28688y1 c28688y2 = ((EnumC28681w1) c28688y1.f116055u.getValue()).compareTo(EnumC28681w1.f116015x) > 0 ? c28688y1 : null;
                    if (c28688y2 != null) {
                        this.f9281w = new WeakReference<>(c28688y2);
                    }
                    return c28688y1;
                }
            }
        }
        return abstractC28667tM7430b;
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.f9280H || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            m7236e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        mo7237f(z4, i13, i14, i15, i16);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        m7236e();
        mo7238g(i13, i14);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i13);
        }
    }

    public final void setParentCompositionContext(AbstractC28667t abstractC28667t) {
        setParentContext(abstractC28667t);
    }

    public final void setShowLayoutBounds(boolean z4) {
        this.f9278F = z4;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z4);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z4) {
        super.setTransitionGroup(z4);
        this.f9280H = true;
    }

    public final void setViewCompositionStrategy(InterfaceC2385h3 interfaceC2385h3) {
        InterfaceC4339a interfaceC4339a = this.f9277E;
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
        this.f9277E = interfaceC2385h3.mo7388a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractC2346a(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC2357c0 viewOnAttachStateChangeListenerC2357c0 = new ViewOnAttachStateChangeListenerC2357c0(this, 1);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2357c0);
        C2370e3 c2370e3 = new C2370e3(this);
        AbstractC15751g.m44422B(this).f145162a.add(c2370e3);
        this.f9277E = new C2375f3(this, viewOnAttachStateChangeListenerC2357c0, c2370e3, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13) {
        m7233b();
        super.addView(view, i13);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i13, ViewGroup.LayoutParams layoutParams, boolean z4) {
        m7233b();
        return super.addViewInLayout(view, i13, layoutParams, z4);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, int i14) {
        m7233b();
        super.addView(view, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m7233b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        m7233b();
        super.addView(view, i13, layoutParams);
    }
}
