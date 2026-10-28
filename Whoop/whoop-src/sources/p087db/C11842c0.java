package p087db;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import b30.ViewOnClickListenerC2558k3;
import com.whoop.android.R;
import java.util.ArrayList;
import jo.C21830s;
import jo.C21833v;
import jo.C21834w;
import jo.InterfaceC21829r;
import jo.RunnableC21831t;
import jo.ViewOnClickListenerC21821j;
import jo.ViewOnLayoutChangeListenerC21835x;
import p087db.C11842c0;

/* JADX INFO: renamed from: db.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11842c0 {

    /* JADX INFO: renamed from: A */
    public final Runnable f38589A;

    /* JADX INFO: renamed from: B */
    public final Runnable f38590B;

    /* JADX INFO: renamed from: C */
    public final Runnable f38591C;

    /* JADX INFO: renamed from: D */
    public final View.OnLayoutChangeListener f38592D;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38593a;

    /* JADX INFO: renamed from: b */
    public final View f38594b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f38595c;

    /* JADX INFO: renamed from: d */
    public final ViewGroup f38596d;

    /* JADX INFO: renamed from: e */
    public final ViewGroup f38597e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f38598f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f38599g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f38600h;

    /* JADX INFO: renamed from: i */
    public final ViewGroup f38601i;

    /* JADX INFO: renamed from: j */
    public final View f38602j;

    /* JADX INFO: renamed from: k */
    public final View f38603k;

    /* JADX INFO: renamed from: l */
    public final AnimatorSet f38604l;

    /* JADX INFO: renamed from: m */
    public final AnimatorSet f38605m;

    /* JADX INFO: renamed from: n */
    public final AnimatorSet f38606n;

    /* JADX INFO: renamed from: o */
    public final AnimatorSet f38607o;

    /* JADX INFO: renamed from: p */
    public final AnimatorSet f38608p;

    /* JADX INFO: renamed from: q */
    public final ValueAnimator f38609q;

    /* JADX INFO: renamed from: r */
    public final ValueAnimator f38610r;

    /* JADX INFO: renamed from: s */
    public final ArrayList f38611s;

    /* JADX INFO: renamed from: t */
    public int f38612t;

    /* JADX INFO: renamed from: u */
    public boolean f38613u;

    /* JADX INFO: renamed from: v */
    public boolean f38614v;

    /* JADX INFO: renamed from: w */
    public boolean f38615w;

    /* JADX INFO: renamed from: x */
    public final FrameLayout f38616x;

    /* JADX INFO: renamed from: y */
    public final Runnable f38617y;

    /* JADX INFO: renamed from: z */
    public final Runnable f38618z;

    public C11842c0(C11882x c11882x) {
        final int i13 = 0;
        this.f38593a = 0;
        this.f38616x = c11882x;
        this.f38617y = new RunnableC11883y(this, i13);
        final int i14 = 3;
        this.f38618z = new RunnableC11883y(this, i14);
        this.f38589A = new RunnableC11883y(this, 4);
        this.f38590B = new RunnableC11883y(this, 5);
        this.f38591C = new RunnableC11883y(this, 6);
        final int i15 = 1;
        this.f38592D = new ViewOnLayoutChangeListenerC11857k(this, i15);
        this.f38615w = true;
        this.f38612t = 0;
        this.f38611s = new ArrayList();
        this.f38594b = c11882x.findViewById(R.id.exo_controls_background);
        this.f38595c = (ViewGroup) c11882x.findViewById(R.id.exo_center_controls);
        this.f38597e = (ViewGroup) c11882x.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) c11882x.findViewById(R.id.exo_bottom_bar);
        this.f38596d = viewGroup;
        this.f38601i = (ViewGroup) c11882x.findViewById(R.id.exo_time);
        View viewFindViewById = c11882x.findViewById(R.id.exo_progress);
        this.f38602j = viewFindViewById;
        this.f38598f = (ViewGroup) c11882x.findViewById(R.id.exo_basic_controls);
        this.f38599g = (ViewGroup) c11882x.findViewById(R.id.exo_extra_controls);
        this.f38600h = (ViewGroup) c11882x.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = c11882x.findViewById(R.id.exo_overflow_show);
        this.f38603k = viewFindViewById2;
        View viewFindViewById3 = c11882x.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            int i16 = 7;
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC2558k3(this, i16));
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC2558k3(this, i16));
        }
        final int i17 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: db.z

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C11842c0 f38851b;

            {
                this.f38851b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i14) {
                    case 0:
                        C11842c0 c11842c0 = this.f38851b;
                        c11842c0.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c11842c0.f38594b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c11842c0.f38595c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c11842c0.f38597e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        C11842c0 c11842c1 = this.f38851b;
                        c11842c1.getClass();
                        c11842c1.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        C11842c0 c11842c2 = this.f38851b;
                        c11842c2.getClass();
                        c11842c2.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C11842c0 c11842c3 = this.f38851b;
                        c11842c3.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = c11842c3.f38594b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = c11842c3.f38595c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = c11842c3.f38597e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new C11838a0(this, 0));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: db.z

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C11842c0 f38851b;

            {
                this.f38851b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        C11842c0 c11842c0 = this.f38851b;
                        c11842c0.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c11842c0.f38594b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c11842c0.f38595c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c11842c0.f38597e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        C11842c0 c11842c1 = this.f38851b;
                        c11842c1.getClass();
                        c11842c1.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        C11842c0 c11842c2 = this.f38851b;
                        c11842c2.getClass();
                        c11842c2.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C11842c0 c11842c3 = this.f38851b;
                        c11842c3.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = c11842c3.f38594b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = c11842c3.f38595c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = c11842c3.f38597e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new C11838a0(this, 1));
        Resources resources = c11882x.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f38604l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C11840b0(this, c11882x, i13));
        animatorSet.play(valueAnimatorOfFloat).with(m31786e(viewFindViewById, 0.0f, dimension)).with(m31786e(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f38605m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C11840b0(this, c11882x, i15));
        animatorSet2.play(m31786e(viewFindViewById, dimension, dimension2)).with(m31786e(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f38606n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C11840b0(this, c11882x, i17));
        animatorSet3.play(valueAnimatorOfFloat).with(m31786e(viewFindViewById, 0.0f, dimension2)).with(m31786e(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f38607o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C11838a0(this, 2));
        animatorSet4.play(valueAnimatorOfFloat2).with(m31786e(viewFindViewById, dimension, 0.0f)).with(m31786e(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f38608p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new C11838a0(this, 3));
        animatorSet5.play(valueAnimatorOfFloat2).with(m31786e(viewFindViewById, dimension2, 0.0f)).with(m31786e(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f38609q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: db.z

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C11842c0 f38851b;

            {
                this.f38851b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i15) {
                    case 0:
                        C11842c0 c11842c0 = this.f38851b;
                        c11842c0.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c11842c0.f38594b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c11842c0.f38595c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c11842c0.f38597e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        C11842c0 c11842c1 = this.f38851b;
                        c11842c1.getClass();
                        c11842c1.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        C11842c0 c11842c2 = this.f38851b;
                        c11842c2.getClass();
                        c11842c2.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C11842c0 c11842c3 = this.f38851b;
                        c11842c3.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = c11842c3.f38594b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = c11842c3.f38595c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = c11842c3.f38597e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new C11838a0(this, 4));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f38610r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: db.z

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C11842c0 f38851b;

            {
                this.f38851b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i17) {
                    case 0:
                        C11842c0 c11842c0 = this.f38851b;
                        c11842c0.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c11842c0.f38594b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c11842c0.f38595c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c11842c0.f38597e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        C11842c0 c11842c1 = this.f38851b;
                        c11842c1.getClass();
                        c11842c1.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        C11842c0 c11842c2 = this.f38851b;
                        c11842c2.getClass();
                        c11842c2.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C11842c0 c11842c3 = this.f38851b;
                        c11842c3.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = c11842c3.f38594b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = c11842c3.f38595c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = c11842c3.f38597e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new C11838a0(this, 5));
    }

    /* JADX INFO: renamed from: c */
    public static int m31784c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    /* JADX INFO: renamed from: d */
    public static int m31785d(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    /* JADX INFO: renamed from: e */
    public static ObjectAnimator m31786e(View view, float f13, float f14) {
        return ObjectAnimator.ofFloat(view, "translationY", f13, f14);
    }

    /* JADX INFO: renamed from: f */
    public static ObjectAnimator m31787f(View view, float f13, float f14) {
        return ObjectAnimator.ofFloat(view, "translationY", f13, f14);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m31788l(View view) {
        int id4 = view.getId();
        return id4 == R.id.exo_bottom_bar || id4 == R.id.exo_prev || id4 == R.id.exo_next || id4 == R.id.exo_rew || id4 == R.id.exo_rew_with_amount || id4 == R.id.exo_ffwd || id4 == R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m31789m(View view) {
        int id4 = view.getId();
        return id4 == R.id.exo_bottom_bar || id4 == R.id.exo_prev || id4 == R.id.exo_next || id4 == R.id.exo_rew || id4 == R.id.exo_rew_with_amount || id4 == R.id.exo_ffwd || id4 == R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: renamed from: a */
    public final void m31790a(float f13) {
        switch (this.f38593a) {
            case 0:
                ViewGroup viewGroup = this.f38600h;
                if (viewGroup != null) {
                    viewGroup.setTranslationX((int) ((1.0f - f13) * viewGroup.getWidth()));
                }
                ViewGroup viewGroup2 = this.f38601i;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(1.0f - f13);
                }
                ViewGroup viewGroup3 = this.f38598f;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(1.0f - f13);
                }
                break;
            default:
                ViewGroup viewGroup4 = this.f38600h;
                if (viewGroup4 != null) {
                    viewGroup4.setTranslationX((int) ((1.0f - f13) * viewGroup4.getWidth()));
                }
                ViewGroup viewGroup5 = this.f38601i;
                if (viewGroup5 != null) {
                    viewGroup5.setAlpha(1.0f - f13);
                }
                ViewGroup viewGroup6 = this.f38598f;
                if (viewGroup6 != null) {
                    viewGroup6.setAlpha(1.0f - f13);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31791b(View view) {
        switch (this.f38593a) {
            case 0:
                return view != null && this.f38611s.contains(view);
            default:
                return view != null && this.f38611s.contains(view);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m31792g(Runnable runnable, long j7) {
        switch (this.f38593a) {
            case 0:
                if (j7 >= 0) {
                    ((C11882x) this.f38616x).postDelayed(runnable, j7);
                }
                break;
            default:
                if (j7 >= 0) {
                    ((C21830s) this.f38616x).postDelayed(runnable, j7);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m31793h() {
        switch (this.f38593a) {
            case 0:
                C11882x c11882x = (C11882x) this.f38616x;
                c11882x.removeCallbacks((RunnableC11883y) this.f38591C);
                c11882x.removeCallbacks((RunnableC11883y) this.f38618z);
                c11882x.removeCallbacks((RunnableC11883y) this.f38590B);
                c11882x.removeCallbacks((RunnableC11883y) this.f38589A);
                break;
            default:
                C21830s c21830s = (C21830s) this.f38616x;
                c21830s.removeCallbacks((RunnableC21831t) this.f38591C);
                c21830s.removeCallbacks((RunnableC21831t) this.f38618z);
                c21830s.removeCallbacks((RunnableC21831t) this.f38590B);
                c21830s.removeCallbacks((RunnableC21831t) this.f38589A);
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m31794i() {
        switch (this.f38593a) {
            case 0:
                if (this.f38612t != 3) {
                    m31793h();
                    int showTimeoutMs = ((C11882x) this.f38616x).getShowTimeoutMs();
                    if (showTimeoutMs > 0) {
                        if (!this.f38615w) {
                            m31792g((RunnableC11883y) this.f38591C, showTimeoutMs);
                        } else if (this.f38612t != 1) {
                            m31792g((RunnableC11883y) this.f38590B, showTimeoutMs);
                        } else {
                            m31792g((RunnableC11883y) this.f38589A, 2000L);
                        }
                    }
                    break;
                }
                break;
            default:
                if (this.f38612t != 3) {
                    m31793h();
                    int showTimeoutMs2 = ((C21830s) this.f38616x).getShowTimeoutMs();
                    if (showTimeoutMs2 > 0) {
                        if (!this.f38615w) {
                            m31792g((RunnableC21831t) this.f38591C, showTimeoutMs2);
                        } else if (this.f38612t != 1) {
                            m31792g((RunnableC21831t) this.f38590B, showTimeoutMs2);
                        } else {
                            m31792g((RunnableC21831t) this.f38589A, 2000L);
                        }
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m31795j(View view, boolean z4) {
        switch (this.f38593a) {
            case 0:
                if (view != null) {
                    ArrayList arrayList = this.f38611s;
                    if (!z4) {
                        view.setVisibility(8);
                        arrayList.remove(view);
                    } else {
                        if (this.f38613u && m31788l(view)) {
                            view.setVisibility(4);
                        } else {
                            view.setVisibility(0);
                        }
                        arrayList.add(view);
                    }
                    break;
                }
                break;
            default:
                if (view != null) {
                    ArrayList arrayList2 = this.f38611s;
                    if (!z4) {
                        view.setVisibility(8);
                        arrayList2.remove(view);
                    } else {
                        if (this.f38613u && m31789m(view)) {
                            view.setVisibility(4);
                        } else {
                            view.setVisibility(0);
                        }
                        arrayList2.add(view);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m31796k(int i13) {
        switch (this.f38593a) {
            case 0:
                C11882x c11882x = (C11882x) this.f38616x;
                int i14 = this.f38612t;
                this.f38612t = i13;
                if (i13 == 2) {
                    c11882x.setVisibility(8);
                } else if (i14 == 2) {
                    c11882x.setVisibility(0);
                }
                if (i14 != i13) {
                    for (InterfaceC11881w interfaceC11881w : c11882x.f38846z) {
                        c11882x.getVisibility();
                        ((ViewOnClickListenerC11846e0) interfaceC11881w).f38631y.m5084m();
                    }
                }
                break;
            default:
                C21830s c21830s = (C21830s) this.f38616x;
                int i15 = this.f38612t;
                this.f38612t = i13;
                if (i13 == 2) {
                    c21830s.setVisibility(8);
                } else if (i15 == 2) {
                    c21830s.setVisibility(0);
                }
                if (i15 != i13) {
                    for (InterfaceC21829r interfaceC21829r : c21830s.f84222x) {
                        c21830s.getVisibility();
                        ((ViewOnLayoutChangeListenerC21835x) interfaceC21829r).f84239y.m15575j();
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m31797n() {
        switch (this.f38593a) {
            case 0:
                if (!this.f38615w) {
                    m31796k(0);
                    m31794i();
                } else {
                    int i13 = this.f38612t;
                    if (i13 == 1) {
                        this.f38607o.start();
                    } else if (i13 == 2) {
                        this.f38608p.start();
                    } else if (i13 == 3) {
                        this.f38614v = true;
                    } else if (i13 == 4) {
                    }
                    m31794i();
                }
                break;
            default:
                if (!this.f38615w) {
                    m31796k(0);
                    m31794i();
                } else {
                    int i14 = this.f38612t;
                    if (i14 == 1) {
                        this.f38607o.start();
                    } else if (i14 == 2) {
                        this.f38608p.start();
                    } else if (i14 == 3) {
                        this.f38614v = true;
                    } else if (i14 == 4) {
                    }
                    m31794i();
                }
                break;
        }
    }

    public C11842c0(C21830s c21830s) {
        final int i13 = 1;
        this.f38593a = 1;
        this.f38616x = c21830s;
        final int i14 = 0;
        this.f38617y = new RunnableC21831t(this, i14);
        final int i15 = 3;
        this.f38618z = new RunnableC21831t(this, i15);
        int i16 = 4;
        this.f38589A = new RunnableC21831t(this, i16);
        this.f38590B = new RunnableC21831t(this, 5);
        this.f38591C = new RunnableC21831t(this, 6);
        this.f38592D = new ViewOnLayoutChangeListenerC11857k(this, i16);
        this.f38615w = true;
        this.f38612t = 0;
        this.f38611s = new ArrayList();
        this.f38594b = c21830s.findViewById(R.id.exo_controls_background);
        this.f38595c = (ViewGroup) c21830s.findViewById(R.id.exo_center_controls);
        this.f38597e = (ViewGroup) c21830s.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) c21830s.findViewById(R.id.exo_bottom_bar);
        this.f38596d = viewGroup;
        this.f38601i = (ViewGroup) c21830s.findViewById(R.id.exo_time);
        View viewFindViewById = c21830s.findViewById(R.id.exo_progress);
        this.f38602j = viewFindViewById;
        this.f38598f = (ViewGroup) c21830s.findViewById(R.id.exo_basic_controls);
        this.f38599g = (ViewGroup) c21830s.findViewById(R.id.exo_extra_controls);
        this.f38600h = (ViewGroup) c21830s.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = c21830s.findViewById(R.id.exo_overflow_show);
        this.f38603k = viewFindViewById2;
        View viewFindViewById3 = c21830s.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC21821j(this, i15));
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC21821j(this, i15));
        }
        final int i17 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jo.u

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C11842c0 f84231b;

            {
                this.f84231b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i15) {
                    case 0:
                        C11842c0 c11842c0 = this.f84231b;
                        c11842c0.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c11842c0.f38594b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c11842c0.f38595c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c11842c0.f38597e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        C11842c0 c11842c1 = this.f84231b;
                        c11842c1.getClass();
                        c11842c1.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        C11842c0 c11842c2 = this.f84231b;
                        c11842c2.getClass();
                        c11842c2.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C11842c0 c11842c3 = this.f84231b;
                        c11842c3.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = c11842c3.f38594b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = c11842c3.f38595c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = c11842c3.f38597e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new C21833v(this, i14));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jo.u

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C11842c0 f84231b;

            {
                this.f84231b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i14) {
                    case 0:
                        C11842c0 c11842c0 = this.f84231b;
                        c11842c0.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c11842c0.f38594b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c11842c0.f38595c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c11842c0.f38597e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        C11842c0 c11842c1 = this.f84231b;
                        c11842c1.getClass();
                        c11842c1.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        C11842c0 c11842c2 = this.f84231b;
                        c11842c2.getClass();
                        c11842c2.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C11842c0 c11842c3 = this.f84231b;
                        c11842c3.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = c11842c3.f38594b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = c11842c3.f38595c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = c11842c3.f38597e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new C21833v(this, i13));
        Resources resources = c21830s.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f38604l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C21834w(this, c21830s, i14));
        animatorSet.play(valueAnimatorOfFloat).with(m31787f(viewFindViewById, 0.0f, dimension)).with(m31787f(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f38605m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C21834w(this, c21830s, i13));
        animatorSet2.play(m31787f(viewFindViewById, dimension, dimension2)).with(m31787f(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f38606n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C21834w(this, c21830s, i17));
        animatorSet3.play(valueAnimatorOfFloat).with(m31787f(viewFindViewById, 0.0f, dimension2)).with(m31787f(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f38607o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C21833v(this, i17));
        animatorSet4.play(valueAnimatorOfFloat2).with(m31787f(viewFindViewById, dimension, 0.0f)).with(m31787f(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f38608p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new C21833v(this, i15));
        animatorSet5.play(valueAnimatorOfFloat2).with(m31787f(viewFindViewById, dimension2, 0.0f)).with(m31787f(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f38609q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jo.u

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C11842c0 f84231b;

            {
                this.f84231b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        C11842c0 c11842c0 = this.f84231b;
                        c11842c0.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c11842c0.f38594b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c11842c0.f38595c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c11842c0.f38597e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        C11842c0 c11842c1 = this.f84231b;
                        c11842c1.getClass();
                        c11842c1.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        C11842c0 c11842c2 = this.f84231b;
                        c11842c2.getClass();
                        c11842c2.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C11842c0 c11842c3 = this.f84231b;
                        c11842c3.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = c11842c3.f38594b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = c11842c3.f38595c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = c11842c3.f38597e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new C21833v(this, 4));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f38610r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jo.u

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C11842c0 f84231b;

            {
                this.f84231b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i17) {
                    case 0:
                        C11842c0 c11842c0 = this.f84231b;
                        c11842c0.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c11842c0.f38594b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c11842c0.f38595c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c11842c0.f38597e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        C11842c0 c11842c1 = this.f84231b;
                        c11842c1.getClass();
                        c11842c1.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        C11842c0 c11842c2 = this.f84231b;
                        c11842c2.getClass();
                        c11842c2.m31790a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C11842c0 c11842c3 = this.f84231b;
                        c11842c3.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = c11842c3.f38594b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = c11842c3.f38595c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = c11842c3.f38597e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new C21833v(this, 5));
    }
}
