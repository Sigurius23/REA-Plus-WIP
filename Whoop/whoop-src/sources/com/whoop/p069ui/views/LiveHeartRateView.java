package com.whoop.p069ui.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import bh3.InterfaceC3255b;
import c92.C4329a;
import com.whoop.p069ui.C10594l;
import com.whoop.p069ui.old.Battery;
import com.whoop.p069ui.views.LiveHeartRateView;
import com.whoop.service.rearchitect.C10015c;
import e50.C12723b;
import ge3.AbstractC15751g;
import in2.AbstractC18738j;
import java.util.LinkedList;
import java.util.Queue;
import kk0.C22539b;
import p186h8.C16999a;
import p479s4.AbstractC32122c;
import qr2.AbstractC30556a;
import rd1.C31245d;
import rd1.EnumC31243b;
import se.AbstractC32411b;
import se.AbstractC32417h;
import sj0.C32562a;
import sk.AbstractC32570a;
import td1.EnumC33707e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import vu1.AbstractC36512c;
import vu1.AbstractC36514e;
import vu1.AbstractC36516g;
import vu1.AbstractC36517h;
import vu1.AbstractC36519j;
import zg3.C40634a;

/* JADX INFO: loaded from: classes10.dex */
public class LiveHeartRateView extends FrameLayout {

    /* JADX INFO: renamed from: E */
    View f32299E;

    /* JADX INFO: renamed from: F */
    View f32300F;

    /* JADX INFO: renamed from: G */
    TextView f32301G;

    /* JADX INFO: renamed from: H */
    TextView f32302H;

    /* JADX INFO: renamed from: I */
    TextView f32303I;

    /* JADX INFO: renamed from: J */
    Battery f32304J;

    /* JADX INFO: renamed from: K */
    TextView f32305K;

    /* JADX INFO: renamed from: L */
    View f32306L;

    /* JADX INFO: renamed from: M */
    View f32307M;

    /* JADX INFO: renamed from: N */
    View f32308N;

    /* JADX INFO: renamed from: O */
    TextView f32309O;

    /* JADX INFO: renamed from: P */
    private int f32310P;

    /* JADX INFO: renamed from: Q */
    private int f32311Q;

    /* JADX INFO: renamed from: R */
    private int f32312R;

    /* JADX INFO: renamed from: S */
    private final Handler f32313S;

    /* JADX INFO: renamed from: T */
    private boolean f32314T;

    /* JADX INFO: renamed from: U */
    private boolean f32315U;

    /* JADX INFO: renamed from: V */
    private boolean f32316V;

    /* JADX INFO: renamed from: W */
    private C10623f f32317W;

    /* JADX INFO: renamed from: a0 */
    private C10624g f32318a0;

    /* JADX INFO: renamed from: b0 */
    private C10594l f32319b0;

    /* JADX INFO: renamed from: c0 */
    private final InterfaceC34116n f32320c0;

    /* JADX INFO: renamed from: d0 */
    private boolean f32321d0;

    /* JADX INFO: renamed from: e0 */
    private final InterfaceC33704b f32322e0;

    /* JADX INFO: renamed from: f0 */
    private final C31245d f32323f0;

    /* JADX INFO: renamed from: g0 */
    private final Runnable f32324g0;

    /* JADX INFO: renamed from: h0 */
    private final Runnable f32325h0;

    /* JADX INFO: renamed from: w */
    View f32326w;

    /* JADX INFO: renamed from: x */
    ImageView f32327x;

    /* JADX INFO: renamed from: y */
    ViewFlipper f32328y;

    /* JADX INFO: renamed from: z */
    ImageView f32329z;

    /* JADX INFO: renamed from: com.whoop.ui.views.LiveHeartRateView$a */
    public class RunnableC10618a implements Runnable {
        public RunnableC10618a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (LiveHeartRateView.this.f32313S) {
                try {
                    if (!LiveHeartRateView.this.f32314T) {
                        LiveHeartRateView.this.f32324g0.run();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.views.LiveHeartRateView$b */
    public class RunnableC10619b implements Runnable {
        public RunnableC10619b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (LiveHeartRateView.this.f32313S) {
                LiveHeartRateView.this.f32314T = true;
                LiveHeartRateView.this.f32307M.setVisibility(0);
                LiveHeartRateView.this.f32313S.postDelayed(LiveHeartRateView.this.f32325h0, 800L);
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.views.LiveHeartRateView$c */
    public class RunnableC10620c implements Runnable {
        public RunnableC10620c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (LiveHeartRateView.this.f32313S) {
                LiveHeartRateView.this.f32307M.setVisibility(4);
                LiveHeartRateView.this.f32313S.postDelayed(LiveHeartRateView.this.f32324g0, 800L);
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.views.LiveHeartRateView$d */
    public static /* synthetic */ class C10621d {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f32333a;

        static {
            int[] iArr = new int[EnumC31243b.values().length];
            f32333a = iArr;
            try {
                iArr[EnumC31243b.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32333a[EnumC31243b.ENABLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.views.LiveHeartRateView$e */
    public static abstract class AbstractC10622e {

        /* JADX INFO: renamed from: a */
        private final C10625h f32334a;

        /* JADX INFO: renamed from: b */
        private final View f32335b;

        /* JADX INFO: renamed from: c */
        private final Handler f32336c;

        /* JADX INFO: renamed from: e */
        private boolean f32338e;

        /* JADX INFO: renamed from: f */
        private LinkedList<c> f32339f = new LinkedList<>();

        /* JADX INFO: renamed from: d */
        private final Runnable f32337d = new a();

        /* JADX INFO: renamed from: com.whoop.ui.views.LiveHeartRateView$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC10622e.this.mo27441c();
            }
        }

        /* JADX INFO: renamed from: com.whoop.ui.views.LiveHeartRateView$e$b */
        public class b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ View f32341a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ c f32342b;

            public b(View view, c cVar) {
                this.f32341a = view;
                this.f32342b = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                AbstractC10622e.this.f32334a.m27452b(this.f32341a);
                AbstractC10622e.this.f32339f.remove(this.f32342b);
            }
        }

        /* JADX INFO: renamed from: com.whoop.ui.views.LiveHeartRateView$e$c */
        public static class c {

            /* JADX INFO: renamed from: a */
            final Animator f32344a;

            /* JADX INFO: renamed from: b */
            final View f32345b;

            public c(Animator animator, View view) {
                this.f32344a = animator;
                this.f32345b = view;
            }
        }

        public AbstractC10622e(Handler handler, C10625h c10625h, View view) {
            this.f32334a = c10625h;
            this.f32335b = view;
            this.f32336c = handler;
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo27441c();

        /* JADX INFO: renamed from: d */
        public void m27442d(long j7) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32335b, "scaleX", 1.0f, 0.985f, 1.015f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f32335b, "scaleY", 1.0f, 0.985f, 1.015f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(j7);
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setInterpolator(new C16999a(0));
            animatorSet.start();
        }

        /* JADX INFO: renamed from: e */
        public void m27443e(long j7, long j13) {
            View viewM27451a = this.f32334a.m27451a();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewM27451a, "scaleX", 1.0f, 2.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewM27451a, "scaleY", 1.0f, 2.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewM27451a, "alpha", 0.33f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(j7);
            animatorSet.setDuration(j13);
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            c cVar = new c(animatorSet, viewM27451a);
            animatorSet.addListener(new b(viewM27451a, cVar));
            this.f32339f.add(cVar);
            animatorSet.start();
        }

        /* JADX INFO: renamed from: f */
        public C10625h m27444f() {
            return this.f32334a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m27445g() {
            return this.f32338e;
        }

        /* JADX INFO: renamed from: h */
        public void m27446h(long j7) {
            this.f32336c.postDelayed(this.f32337d, j7);
        }

        /* JADX INFO: renamed from: i */
        public void mo27447i(int i13) {
            m27444f().m27453c(i13);
        }

        /* JADX INFO: renamed from: j */
        public void m27448j() {
            this.f32338e = true;
            this.f32337d.run();
        }

        /* JADX INFO: renamed from: k */
        public void m27449k() {
            this.f32336c.removeCallbacks(this.f32337d);
            this.f32338e = false;
            for (c cVar : this.f32339f) {
                cVar.f32344a.removeAllListeners();
                cVar.f32344a.end();
                cVar.f32344a.cancel();
                this.f32334a.m27452b(cVar.f32345b);
            }
            this.f32339f.clear();
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.views.LiveHeartRateView$f */
    public static class C10623f extends AbstractC10622e {

        /* JADX INFO: renamed from: g */
        private int f32346g;

        public C10623f(Handler handler, C10625h c10625h, View view) {
            super(handler, c10625h, view);
        }

        @Override // com.whoop.p069ui.views.LiveHeartRateView.AbstractC10622e
        /* JADX INFO: renamed from: c */
        public void mo27441c() {
            int i13 = this.f32346g;
            if (i13 != 0) {
                long j7 = (long) ((60.0f / i13) * 1000.0f);
                long jMin = Math.min(j7, 300L);
                m27443e(jMin / 2, 2 * j7);
                m27442d(jMin);
                m27446h(j7);
            }
        }

        @Override // com.whoop.p069ui.views.LiveHeartRateView.AbstractC10622e
        /* JADX INFO: renamed from: i */
        public void mo27447i(int i13) {
            super.m27444f().m27453c(i13);
        }

        /* JADX INFO: renamed from: l */
        public void m27450l(int i13) {
            this.f32346g = i13;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.views.LiveHeartRateView$g */
    public static class C10624g extends AbstractC10622e {
        public C10624g(Handler handler, C10625h c10625h, View view) {
            super(handler, c10625h, view);
        }

        @Override // com.whoop.p069ui.views.LiveHeartRateView.AbstractC10622e
        /* JADX INFO: renamed from: c */
        public void mo27441c() {
            m27443e(0L, 5000L);
            m27446h(2500L);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.views.LiveHeartRateView$h */
    public class C10625h {

        /* JADX INFO: renamed from: a */
        final Queue<View> f32347a;

        /* JADX INFO: renamed from: b */
        private int f32348b;

        public /* synthetic */ C10625h(LiveHeartRateView liveHeartRateView, int i13) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public View m27451a() {
            View viewPoll = this.f32347a.poll();
            if (viewPoll == null) {
                viewPoll = new View(LiveHeartRateView.this.getContext());
                LiveHeartRateView.this.addView(viewPoll, 0, new FrameLayout.LayoutParams(LiveHeartRateView.this.f32326w.getWidth(), LiveHeartRateView.this.f32326w.getHeight()));
            }
            viewPoll.setBackgroundResource(this.f32348b);
            return viewPoll;
        }

        /* JADX INFO: renamed from: b */
        public void m27452b(View view) {
            this.f32347a.add(view);
        }

        /* JADX INFO: renamed from: c */
        public void m27453c(int i13) {
            this.f32348b = i13;
        }

        private C10625h() {
            this.f32347a = new LinkedList();
            this.f32348b = AbstractC36512c.f156073p;
        }
    }

    public LiveHeartRateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32313S = AbstractC32411b.m101066J();
        this.f32319b0 = new C10594l();
        this.f32320c0 = InterfaceC34116n.m107846d("LiveHeartRateView");
        this.f32322e0 = (InterfaceC33704b) AbstractC15751g.m44472y(InterfaceC33704b.class, null, null);
        this.f32323f0 = (C31245d) AbstractC15751g.m44472y(C31245d.class, null, null);
        this.f32324g0 = new RunnableC10619b();
        this.f32325h0 = new RunnableC10620c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156212p);
        m27420q(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: A */
    private void m27402A() {
        m27408I();
        this.f32327x.setVisibility(0);
        this.f32328y.setDisplayedChild(this.f32311Q);
        if (this.f32322e0.mo106484A() == EnumC33707e.NONE || this.f32322e0.mo106484A() == EnumC33707e.CONNECTION_FAILED) {
            this.f32320c0.mo85228t("Displaying \"Disconnected\" message in the Real Time HR UI circle", new AbstractC30556a.a[0]);
            this.f32301G.setText(AbstractC36517h.f156121d);
        } else {
            this.f32320c0.mo85228t("Displaying \"Disabled\" message in the Real Time HR UI circle", new AbstractC30556a.a[0]);
            this.f32301G.setText(AbstractC36517h.f156123f);
        }
    }

    /* JADX INFO: renamed from: B */
    private void m27403B() {
        this.f32327x.setVisibility(8);
        this.f32328y.setDisplayedChild(this.f32310P);
    }

    /* JADX INFO: renamed from: E */
    private void m27404E() {
        this.f32320c0.mo85228t("Showing OffBody", new AbstractC30556a.a[0]);
        m27419o();
        this.f32327x.setVisibility(0);
        this.f32328y.setDisplayedChild(this.f32311Q);
        this.f32301G.setText(AbstractC36517h.f156125h);
    }

    /* JADX INFO: renamed from: F */
    private void m27405F() {
        this.f32327x.setVisibility(0);
        this.f32328y.setDisplayedChild(this.f32312R);
        m27406G();
    }

    /* JADX INFO: renamed from: G */
    private void m27406G() {
        if (this.f32317W.m27445g()) {
            return;
        }
        this.f32317W.m27449k();
        this.f32318a0.m27449k();
        this.f32317W.m27448j();
    }

    /* JADX INFO: renamed from: H */
    private void m27407H() {
        if (this.f32318a0.m27445g()) {
            return;
        }
        this.f32317W.m27449k();
        this.f32318a0.m27449k();
        this.f32318a0.m27448j();
    }

    /* JADX INFO: renamed from: I */
    private void m27408I() {
        AbstractC32411b.m101086b0(new RunnableC10618a());
    }

    /* JADX INFO: renamed from: J */
    private void m27409J() {
        synchronized (this.f32313S) {
            this.f32314T = false;
            this.f32313S.removeCallbacks(this.f32324g0);
            this.f32313S.removeCallbacks(this.f32325h0);
        }
    }

    /* JADX INFO: renamed from: K */
    private void m27410K() {
        if (this.f32316V) {
            m27403B();
            m27407H();
            return;
        }
        if (!((C4329a) AbstractC15751g.m44472y(C4329a.class, null, null)).m13653f()) {
            m27426y();
            return;
        }
        if (!this.f32322e0.mo106484A().isReady()) {
            m27402A();
            return;
        }
        if (this.f32315U) {
            m27403B();
            return;
        }
        int i13 = C10621d.f32333a[this.f32323f0.m96240M().ordinal()];
        if (i13 == 1) {
            this.f32320c0.mo85225p("LiveHeartRateView", "Real time state is unexpectedly disabled.", new AbstractC30556a.a[0]);
            m27402A();
        } else {
            if (i13 != 2) {
                return;
            }
            if (C10015c.m24676u3().get()) {
                m27427z();
            } else {
                m27404E();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private void m27419o() {
        m27409J();
        this.f32307M.setVisibility(4);
    }

    /* JADX INFO: renamed from: q */
    private void m27420q(TypedArray typedArray) {
        LayoutInflater.from(getContext()).inflate(AbstractC36516g.f156111a, this);
        this.f32326w = findViewById(AbstractC36514e.f156089g);
        this.f32327x = (ImageView) findViewById(AbstractC36514e.f156092j);
        this.f32328y = (ViewFlipper) findViewById(AbstractC36514e.f156090h);
        this.f32329z = (ImageView) findViewById(AbstractC36514e.f156093k);
        this.f32299E = findViewById(AbstractC36514e.f156096n);
        this.f32300F = findViewById(AbstractC36514e.f156094l);
        this.f32301G = (TextView) findViewById(AbstractC36514e.f156095m);
        this.f32302H = (TextView) findViewById(AbstractC36514e.f156091i);
        this.f32303I = (TextView) findViewById(AbstractC36514e.f156088f);
        this.f32304J = (Battery) findViewById(AbstractC36514e.f156083a);
        this.f32305K = (TextView) findViewById(AbstractC36514e.f156086d);
        this.f32306L = findViewById(AbstractC36514e.f156084b);
        this.f32307M = findViewById(AbstractC36514e.f156087e);
        this.f32308N = findViewById(AbstractC36514e.f156085c);
        this.f32309O = (TextView) findViewById(AbstractC36514e.f156097o);
        this.f32310P = this.f32328y.indexOfChild(this.f32329z);
        this.f32311Q = this.f32328y.indexOfChild(this.f32300F);
        this.f32312R = this.f32328y.indexOfChild(this.f32299E);
        C10625h c10625h = new C10625h(this, 0);
        this.f32317W = new C10623f(this.f32313S, c10625h, this.f32326w);
        this.f32318a0 = new C10624g(this.f32313S, c10625h, this.f32326w);
        m27435n();
        if (typedArray != null) {
            for (int i13 = 0; i13 < typedArray.getIndexCount(); i13++) {
                int index = typedArray.getIndex(i13);
                if (index == AbstractC36519j.f156214q) {
                    if (typedArray.getBoolean(index, false)) {
                        m27434m();
                    }
                } else if (index == AbstractC36519j.f156216r) {
                    if (typedArray.getBoolean(index, false)) {
                        m27435n();
                    }
                } else if (index == AbstractC36519j.f156222u) {
                    setIconResource(typedArray.getResourceId(index, 0));
                } else if (index == AbstractC36519j.f156220t) {
                    if (typedArray.getBoolean(index, false)) {
                        m27436p();
                    }
                } else if (index == AbstractC36519j.f156226w) {
                    if (typedArray.getBoolean(index, false)) {
                        m27428C();
                    }
                    if (typedArray.getBoolean(index, false)) {
                        m27429D();
                    }
                } else if (index == AbstractC36519j.f156218s) {
                    if (typedArray.getBoolean(index, false)) {
                        m27429D();
                    }
                } else if (index == AbstractC36519j.f156224v) {
                    this.f32321d0 = typedArray.getBoolean(index, true);
                }
            }
        }
        setAlpha(1.0f);
        setClipChildren(false);
        setClipToPadding(false);
        AbstractC32417h.m101189T(this.f32308N, this.f32321d0);
        AbstractC32417h.m101189T(this.f32309O, true ^ this.f32321d0);
        if (isInEditMode()) {
            m27423u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m27421r(Object obj) {
        m27410K();
    }

    private void setRingDrawable(int i13) {
        this.f32318a0.mo27447i(i13);
        this.f32317W.mo27447i(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m27422t(Byte b) {
        this.f32304J.setBatteryLevelPct(b);
        this.f32305K.setText(getContext().getString(AbstractC36517h.f156118a, b));
    }

    /* JADX INFO: renamed from: u */
    private void m27423u() {
        this.f32302H.setText("65");
        this.f32317W.m27450l(65);
        m27405F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m27424v(C22539b c22539b) {
        this.f32306L.setVisibility(c22539b.m65149d() ? 0 : 4);
    }

    /* JADX INFO: renamed from: x */
    private void m27425x() {
        m27409J();
        this.f32307M.setVisibility(0);
    }

    /* JADX INFO: renamed from: y */
    private void m27426y() {
        m27425x();
        this.f32327x.setVisibility(0);
        this.f32328y.setDisplayedChild(this.f32311Q);
        this.f32301G.setText(AbstractC36517h.f156119b);
    }

    /* JADX INFO: renamed from: z */
    private void m27427z() {
        this.f32320c0.mo85228t("Showing Calibrating", new AbstractC30556a.a[0]);
        m27408I();
        this.f32327x.setVisibility(0);
        this.f32328y.setDisplayedChild(this.f32311Q);
        this.f32301G.setText(AbstractC36517h.f156120c);
        m27407H();
    }

    /* JADX INFO: renamed from: C */
    public void m27428C() {
        this.f32316V = true;
    }

    /* JADX INFO: renamed from: D */
    public void m27429D() {
        this.f32321d0 = false;
        this.f32303I.setVisibility(0);
        this.f32308N.setVisibility(8);
    }

    /* JADX INFO: renamed from: i */
    public void m27430i() {
        this.f32326w.setBackgroundResource(AbstractC36512c.f156060c);
        setRingDrawable(AbstractC36512c.f156075r);
    }

    /* JADX INFO: renamed from: j */
    public void m27431j() {
        this.f32326w.setBackgroundResource(AbstractC36512c.f156058a);
        this.f32317W.mo27447i(AbstractC36512c.f156074q);
    }

    /* JADX INFO: renamed from: k */
    public void m27432k() {
        this.f32326w.setBackgroundResource(AbstractC36512c.f156059b);
        this.f32317W.mo27447i(AbstractC36512c.f156073p);
    }

    /* JADX INFO: renamed from: l */
    public void m27433l() {
        this.f32326w.setBackgroundResource(AbstractC36512c.f156061d);
        setRingDrawable(AbstractC36512c.f156073p);
    }

    /* JADX INFO: renamed from: m */
    public void m27434m() {
        this.f32326w.setBackgroundResource(AbstractC36512c.f156061d);
        setRingDrawable(AbstractC36512c.f156073p);
    }

    /* JADX INFO: renamed from: n */
    public void m27435n() {
        this.f32326w.setBackgroundResource(AbstractC36512c.f156062e);
        setRingDrawable(AbstractC36512c.f156073p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        final int i13 = 0;
        this.f32319b0.m27330a(this.f32322e0.getBatteryLevel().m65140j().m122652B(C40634a.m131874a()).m122661K(new InterfaceC3255b(this) { // from class: kn2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LiveHeartRateView f88930x;

            {
                this.f88930x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i13) {
                    case 0:
                        this.f88930x.m27422t((Byte) obj);
                        break;
                    case 1:
                        this.f88930x.m27424v((C22539b) obj);
                        break;
                    case 2:
                        this.f88930x.m27437s((C32562a) obj);
                        break;
                    default:
                        this.f88930x.m27421r(obj);
                        break;
                }
            }
        }));
        final int i14 = 1;
        this.f32319b0.m27330a(this.f32322e0.getChargeStatus().m65151f().m122652B(C40634a.m131874a()).m122661K(new InterfaceC3255b(this) { // from class: kn2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LiveHeartRateView f88930x;

            {
                this.f88930x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i14) {
                    case 0:
                        this.f88930x.m27422t((Byte) obj);
                        break;
                    case 1:
                        this.f88930x.m27424v((C22539b) obj);
                        break;
                    case 2:
                        this.f88930x.m27437s((C32562a) obj);
                        break;
                    default:
                        this.f88930x.m27421r(obj);
                        break;
                }
            }
        }));
        final int i15 = 2;
        this.f32319b0.m27330a(this.f32323f0.m96241P().m122652B(C40634a.m131874a()).m122661K(new InterfaceC3255b(this) { // from class: kn2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LiveHeartRateView f88930x;

            {
                this.f88930x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i15) {
                    case 0:
                        this.f88930x.m27422t((Byte) obj);
                        break;
                    case 1:
                        this.f88930x.m27424v((C22539b) obj);
                        break;
                    case 2:
                        this.f88930x.m27437s((C32562a) obj);
                        break;
                    default:
                        this.f88930x.m27421r(obj);
                        break;
                }
            }
        }));
        final int i16 = 3;
        InterfaceC3255b interfaceC3255b = new InterfaceC3255b(this) { // from class: kn2.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LiveHeartRateView f88930x;

            {
                this.f88930x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i16) {
                    case 0:
                        this.f88930x.m27422t((Byte) obj);
                        break;
                    case 1:
                        this.f88930x.m27424v((C22539b) obj);
                        break;
                    case 2:
                        this.f88930x.m27437s((C32562a) obj);
                        break;
                    default:
                        this.f88930x.m27421r(obj);
                        break;
                }
            }
        };
        this.f32319b0.m27330a(C12723b.m35566a().m35571f().m96242Q().m122652B(C40634a.m131874a()).m122661K(interfaceC3255b));
        this.f32319b0.m27330a(AbstractC32570a.m101620a(getContext()).m122652B(C40634a.m131874a()).m122661K(interfaceC3255b));
        this.f32319b0.m27330a(this.f32322e0.mo106496i().m122652B(C40634a.m131874a()).m122661K(interfaceC3255b));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32319b0.m27331b();
        m27409J();
        this.f32317W.m27449k();
        this.f32318a0.m27449k();
    }

    /* JADX INFO: renamed from: p */
    public void m27436p() {
        this.f32315U = true;
    }

    /* JADX INFO: renamed from: s */
    public void m27437s(C32562a c32562a) {
        if (c32562a == null) {
            if (C10015c.m24676u3().get()) {
                m27427z();
                return;
            } else {
                m27404E();
                return;
            }
        }
        if (!C10015c.m24676u3().get()) {
            m27404E();
            return;
        }
        if (c32562a.getHeartRate() == 0) {
            m27427z();
            return;
        }
        int heartRate = c32562a.getHeartRate();
        this.f32302H.setText(String.valueOf(heartRate));
        this.f32317W.m27450l(heartRate);
        m27405F();
    }

    public void setIconResource(int i13) {
        if (isInEditMode()) {
            this.f32327x.setImageResource(i13);
            this.f32329z.setImageResource(i13);
        } else {
            AbstractC18738j.m54487e(i13, this.f32327x);
            AbstractC18738j.m54487e(i13, this.f32329z);
        }
    }

    public void setZone(String str) {
        this.f32309O.setText(str);
    }

    /* JADX INFO: renamed from: w */
    public void m27438w(int i13, int i14) {
        this.f32309O.setText(i13);
        this.f32309O.setTextColor(AbstractC32122c.getColor(getContext(), i14));
    }
}
