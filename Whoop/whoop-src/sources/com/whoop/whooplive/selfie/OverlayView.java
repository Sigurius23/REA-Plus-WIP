package com.whoop.whooplive.selfie;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;
import bh3.InterfaceC3255b;
import com.whoop.domain.model.ActivityState;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.p069ui.ProgressDialLayout;
import com.whoop.service.network.model.cycles.Cycle;
import com.whoop.service.network.model.cycles.Recovery;
import com.whoop.service.network.model.cycles.Sleep;
import com.whoop.service.network.model.cycles.Strain;
import com.whoop.whooplive.live.views.LiveOverlayView;
import lh3.C24079b;
import mh3.C25566c;
import nf1.AbstractC26661b;
import p479s4.AbstractC32122c;
import pz2.AbstractC29652e;
import pz2.AbstractC29654g;
import qr2.AbstractC30556a;
import rz2.EnumC31928a;
import se.AbstractC32410a;
import tr2.InterfaceC34116n;
import uz2.C35446c;
import uz2.EnumC35444a;
import uz2.EnumC35445b;
import vu1.AbstractC36510a;
import xg3.C38280g;
import xz2.AbstractC38769b;

/* JADX INFO: loaded from: classes11.dex */
public class OverlayView extends ViewFlipper {

    /* JADX INFO: renamed from: E */
    private int f33450E;

    /* JADX INFO: renamed from: F */
    private int f33451F;

    /* JADX INFO: renamed from: G */
    private int f33452G;

    /* JADX INFO: renamed from: H */
    private int f33453H;

    /* JADX INFO: renamed from: I */
    private int f33454I;

    /* JADX INFO: renamed from: J */
    private InterfaceC34116n f33455J;

    /* JADX INFO: renamed from: K */
    private Cycle f33456K;

    /* JADX INFO: renamed from: L */
    private EnumC35445b f33457L;

    /* JADX INFO: renamed from: M */
    private boolean f33458M;

    /* JADX INFO: renamed from: N */
    private boolean f33459N;

    /* JADX INFO: renamed from: O */
    private boolean f33460O;

    /* JADX INFO: renamed from: P */
    private String f33461P;

    /* JADX INFO: renamed from: Q */
    private String f33462Q;

    /* JADX INFO: renamed from: R */
    private String f33463R;

    /* JADX INFO: renamed from: S */
    private String f33464S;

    /* JADX INFO: renamed from: T */
    private C24079b f33465T;

    /* JADX INFO: renamed from: U */
    private C24079b f33466U;

    /* JADX INFO: renamed from: V */
    private C24079b f33467V;

    /* JADX INFO: renamed from: W */
    private C24079b f33468W;

    /* JADX INFO: renamed from: a0 */
    private boolean f33469a0;

    /* JADX INFO: renamed from: b0 */
    private boolean f33470b0;

    /* JADX INFO: renamed from: c0 */
    private Integer f33471c0;

    /* JADX INFO: renamed from: d0 */
    private InterfaceC3255b f33472d0;

    /* JADX INFO: renamed from: e0 */
    private InterfaceC3255b f33473e0;

    /* JADX INFO: renamed from: w */
    private C25566c f33474w;

    /* JADX INFO: renamed from: x */
    private C10870b f33475x;

    /* JADX INFO: renamed from: y */
    private GestureDetector f33476y;

    /* JADX INFO: renamed from: z */
    private C10869a f33477z;

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.OverlayView$a */
    public class C10869a extends GestureDetector.SimpleOnGestureListener {
        public /* synthetic */ C10869a(OverlayView overlayView, int i13) {
            this();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
            EnumC35444a enumC35444a;
            if (Math.abs(f13) > Math.abs(f14)) {
                int i13 = 0;
                if (!OverlayView.this.m28727r()) {
                    EnumC35444a enumC35444a2 = (EnumC35444a) OverlayView.this.f33465T.m70997Z();
                    if (OverlayView.this.m28728s()) {
                        int iOrdinal = enumC35444a2.ordinal();
                        int length = EnumC35444a.values().length;
                        int i14 = motionEvent2.getRawX() > motionEvent.getRawX() ? iOrdinal - 1 : iOrdinal + 1;
                        if (i14 < 0) {
                            i13 = length - 1;
                        } else if (i14 < length) {
                            i13 = i14;
                        }
                        enumC35444a = EnumC35444a.values()[i13];
                    } else {
                        enumC35444a = EnumC35444a.LIGHT;
                        if (enumC35444a2 == enumC35444a) {
                            enumC35444a = EnumC35444a.DARK;
                        }
                    }
                    OverlayView.this.f33465T.onNext(enumC35444a);
                    OverlayView.this.m28711C(enumC35444a);
                } else if (!OverlayView.this.f33469a0) {
                    int iOrdinal2 = ((EnumC31928a) OverlayView.this.f33468W.m70997Z()).ordinal();
                    int length2 = EnumC31928a.values().length;
                    int i15 = motionEvent2.getRawX() > motionEvent.getRawX() ? iOrdinal2 - 1 : iOrdinal2 + 1;
                    if (i15 < 0) {
                        i13 = length2 - 1;
                    } else if (i15 < length2) {
                        i13 = i15;
                    }
                    OverlayView.this.f33468W.onNext(EnumC31928a.values()[i13]);
                    return true;
                }
            }
            return true;
        }

        private C10869a() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.OverlayView$b */
    public static class C10870b {

        /* JADX INFO: renamed from: a */
        View f33479a;

        /* JADX INFO: renamed from: b */
        ProgressDialLayout f33480b;

        /* JADX INFO: renamed from: c */
        TextView f33481c;

        /* JADX INFO: renamed from: d */
        ProgressDialLayout f33482d;

        /* JADX INFO: renamed from: e */
        TextView f33483e;

        /* JADX INFO: renamed from: f */
        ProgressDialLayout f33484f;

        /* JADX INFO: renamed from: g */
        TextView f33485g;

        /* JADX INFO: renamed from: h */
        DraggableViewGroup f33486h;

        /* JADX INFO: renamed from: i */
        ProgressDialLayout f33487i;

        /* JADX INFO: renamed from: j */
        TextView f33488j;

        /* JADX INFO: renamed from: k */
        DraggableViewGroup f33489k;

        /* JADX INFO: renamed from: l */
        ProgressDialLayout f33490l;

        /* JADX INFO: renamed from: m */
        TextView f33491m;

        /* JADX INFO: renamed from: n */
        DraggableViewGroup f33492n;

        /* JADX INFO: renamed from: o */
        ProgressDialLayout f33493o;

        /* JADX INFO: renamed from: p */
        TextView f33494p;

        /* JADX INFO: renamed from: q */
        LiveOverlayView f33495q;

        public C10870b(View view) {
            this.f33479a = view.findViewById(AbstractC29652e.f121158o0);
            this.f33480b = (ProgressDialLayout) view.findViewById(AbstractC29652e.f121103C0);
            this.f33481c = (TextView) view.findViewById(AbstractC29652e.f121107E0);
            this.f33482d = (ProgressDialLayout) view.findViewById(AbstractC29652e.f121170u0);
            this.f33483e = (TextView) view.findViewById(AbstractC29652e.f121174w0);
            this.f33484f = (ProgressDialLayout) view.findViewById(AbstractC29652e.f121178y0);
            this.f33485g = (TextView) view.findViewById(AbstractC29652e.f121099A0);
            this.f33486h = (DraggableViewGroup) view.findViewById(AbstractC29652e.f121164r0);
            this.f33487i = (ProgressDialLayout) view.findViewById(AbstractC29652e.f121101B0);
            this.f33488j = (TextView) view.findViewById(AbstractC29652e.f121105D0);
            this.f33489k = (DraggableViewGroup) view.findViewById(AbstractC29652e.f121160p0);
            this.f33490l = (ProgressDialLayout) view.findViewById(AbstractC29652e.f121168t0);
            this.f33491m = (TextView) view.findViewById(AbstractC29652e.f121172v0);
            this.f33492n = (DraggableViewGroup) view.findViewById(AbstractC29652e.f121162q0);
            this.f33493o = (ProgressDialLayout) view.findViewById(AbstractC29652e.f121176x0);
            this.f33494p = (TextView) view.findViewById(AbstractC29652e.f121180z0);
            this.f33495q = (LiveOverlayView) view.findViewById(AbstractC29652e.f121166s0);
        }
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33474w = new C25566c();
        this.f33477z = new C10869a(this, 0);
        this.f33465T = C24079b.m70996Y(EnumC35444a.DARK, true);
        this.f33466U = C24079b.m70996Y(0, true);
        this.f33467V = C24079b.m70996Y("", true);
        this.f33468W = C24079b.m70996Y(EnumC31928a.Normal, true);
        this.f33469a0 = false;
        this.f33470b0 = true;
        this.f33472d0 = new C35446c(this, 2);
        this.f33473e0 = new C35446c(this, 3);
        m28722m();
    }

    /* JADX INFO: renamed from: A */
    private void m28709A() {
        if (this.f33456K != null) {
            if (this.f33465T.m70997Z() == EnumC35444a.TINTED) {
                this.f33475x.f33480b.getProgressDial().setFillColor(this.f33450E);
                this.f33475x.f33487i.getProgressDial().setFillColor(this.f33450E);
                this.f33475x.f33482d.getProgressDial().setFillColor(this.f33450E);
                this.f33475x.f33490l.getProgressDial().setFillColor(this.f33450E);
                return;
            }
            int iM124305b = AbstractC38769b.m124305b(getContext(), this.f33456K.getRecovery());
            this.f33475x.f33482d.getProgressDial().setFillColor(iM124305b);
            this.f33475x.f33490l.getProgressDial().setFillColor(iM124305b);
            this.f33475x.f33480b.getProgressDial().setFillStartColor(this.f33453H);
            this.f33475x.f33480b.getProgressDial().setFillEndColor(this.f33454I);
            this.f33475x.f33487i.getProgressDial().setFillStartColor(this.f33453H);
            this.f33475x.f33487i.getProgressDial().setFillEndColor(this.f33454I);
        }
    }

    /* JADX INFO: renamed from: B */
    private void m28710B() {
        this.f33475x.f33495q.m28639i((EnumC31928a) this.f33468W.m70997Z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m28711C(EnumC35444a enumC35444a) {
        if (enumC35444a == EnumC35444a.TINTED) {
            EnumC35445b enumC35445b = this.f33457L;
            if (enumC35445b == EnumC35445b.RECOVERY && this.f33456K != null) {
                this.f33471c0 = Integer.valueOf(AbstractC38769b.m124305b(getContext(), this.f33456K.getRecovery()));
            } else if (enumC35445b == EnumC35445b.SLEEP) {
                this.f33471c0 = Integer.valueOf(this.f33452G);
            } else {
                this.f33471c0 = Integer.valueOf(this.f33451F);
            }
        } else {
            this.f33471c0 = Integer.valueOf(this.f33450E);
        }
        this.f33466U.onNext(this.f33471c0);
    }

    /* JADX INFO: renamed from: m */
    private void m28722m() {
        Resources resources = getResources();
        this.f33451F = AbstractC32122c.getColor(getContext(), AbstractC36510a.f156020b);
        this.f33452G = AbstractC32122c.getColor(getContext(), AbstractC36510a.f156026e);
        this.f33453H = AbstractC32122c.getColor(getContext(), AbstractC26661b.f105977c);
        this.f33454I = AbstractC32122c.getColor(getContext(), AbstractC26661b.f105976b);
        this.f33450E = AbstractC32122c.getColor(getContext(), AbstractC36510a.f156042u);
        this.f33455J = InterfaceC34116n.m107846d("OverlayView");
        this.f33476y = new GestureDetector(getContext(), this.f33477z);
        this.f33461P = resources.getString(AbstractC29654g.f121192h);
        this.f33462Q = resources.getString(AbstractC29654g.f121190f);
        this.f33463R = resources.getString(AbstractC29654g.f121191g);
        this.f33464S = resources.getString(AbstractC29654g.f121189e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m28723n(Pair pair) {
        int iIntValue = ((Integer) pair.first).intValue();
        int iIntValue2 = ((Integer) pair.second).intValue();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt instanceof DraggableViewGroup) {
                DraggableViewGroup draggableViewGroup = (DraggableViewGroup) childAt;
                if (draggableViewGroup.m28704u()) {
                    draggableViewGroup.m28707x(iIntValue, iIntValue2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m28724o(Float f13) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt instanceof DraggableViewGroup) {
                DraggableViewGroup draggableViewGroup = (DraggableViewGroup) childAt;
                if (draggableViewGroup.m28704u()) {
                    draggableViewGroup.m28708y(f13.floatValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m28725p(EnumC35444a enumC35444a) {
        m28709A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m28726q(EnumC31928a enumC31928a) {
        m28710B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public boolean m28727r() {
        return this.f33457L == EnumC35445b.LIVE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public boolean m28728s() {
        EnumC35445b enumC35445b = this.f33457L;
        return enumC35445b == EnumC35445b.STRAIN || enumC35445b == EnumC35445b.RECOVERY || enumC35445b == EnumC35445b.SLEEP;
    }

    private void setOverlayViews(Cycle cycle) {
        Strain strain = cycle.getStrain();
        if (strain != null) {
            this.f33455J.mo85219j("Loading strain", new AbstractC30556a.a[0]);
            float scorePercent = (float) cycle.getStrain().getScorePercent();
            this.f33475x.f33487i.setProgress(scorePercent);
            this.f33475x.f33480b.setProgress(scorePercent);
            String strM27183h = AbstractC10538f.m27183h(strain.getScore());
            this.f33475x.f33488j.setText(strM27183h);
            this.f33475x.f33481c.setText(strM27183h);
            this.f33475x.f33495q.m28635c(strain);
        }
        Recovery recovery = cycle.getRecovery();
        if (recovery != null && recovery.hasScore() && recovery.getActivityState() != ActivityState.INCOMPLETE && !recovery.isCurrentlyBlackedOut()) {
            this.f33455J.mo85219j("Loading recovery", new AbstractC30556a.a[0]);
            float score = recovery.getScore() / 100.0f;
            this.f33475x.f33490l.setProgress(score);
            this.f33475x.f33482d.setProgress(score);
            Spannable spannableM27181f = AbstractC10538f.m27181f(getContext(), recovery.getScore());
            TextView textView = this.f33475x.f33491m;
            TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
            textView.setText(spannableM27181f, bufferType);
            this.f33475x.f33483e.setText(spannableM27181f, bufferType);
        }
        Sleep sleep = cycle.getSleep();
        if (sleep == null || sleep.getActivityState() != ActivityState.COMPLETE) {
            this.f33460O = true;
            return;
        }
        this.f33455J.mo85219j("Loading recovery", new AbstractC30556a.a[0]);
        String strM27178c = AbstractC10538f.m27178c(sleep.getQualityDuration());
        this.f33475x.f33485g.setText(strM27178c);
        this.f33475x.f33494p.setText(strM27178c);
    }

    public EnumC35444a getColorMode() {
        return (EnumC35444a) this.f33465T.m70997Z();
    }

    public EnumC35445b getMode() {
        return this.f33457L;
    }

    public Integer getTintColor() {
        return this.f33471c0;
    }

    /* JADX INFO: renamed from: k */
    public boolean m28729k() {
        return AbstractC32410a.m101006O((String) this.f33467V.m70997Z());
    }

    /* JADX INFO: renamed from: l */
    public void m28730l() {
        this.f33475x.f33495q.m28636d();
    }

    @Override // android.widget.ViewFlipper, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33474w.m75180d();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            return;
        }
        this.f33475x = new C10870b(this);
        this.f33474w.m75179c(this.f33465T.m122661K(new C35446c(this, 0)));
        this.f33474w.m75179c(this.f33468W.m122661K(new C35446c(this, 1)));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f33476y.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCycle(Cycle cycle) {
        this.f33456K = cycle;
        if (cycle != null) {
            setOverlayViews(cycle);
        } else {
            this.f33475x.f33487i.setProgress(0.0f);
            this.f33475x.f33480b.setProgress(0.0f);
            String strM27183h = AbstractC10538f.m27183h(0.0f);
            this.f33475x.f33488j.setText(strM27183h);
            this.f33475x.f33481c.setText(strM27183h);
            this.f33460O = true;
            this.f33459N = true;
        }
        this.f33474w.m75179c(C38280g.m122651z(this.f33475x.f33486h.m28705v(), this.f33475x.f33489k.m28705v(), this.f33475x.f33492n.m28705v()).m122661K(this.f33472d0));
        this.f33474w.m75179c(C38280g.m122651z(this.f33475x.f33486h.m28706w(), this.f33475x.f33489k.m28706w(), this.f33475x.f33492n.m28706w()).m122661K(this.f33473e0));
        m28709A();
    }

    public void setMode(EnumC35445b enumC35445b) {
        this.f33457L = enumC35445b;
        boolean z4 = this.f33470b0;
        int iOrdinal = enumC35445b.ordinal();
        if (!z4) {
            iOrdinal--;
        }
        setDisplayedChild(iOrdinal);
        EnumC35445b enumC35445b2 = this.f33457L;
        if (enumC35445b2 == EnumC35445b.STRAIN && this.f33458M) {
            this.f33467V.onNext(this.f33461P);
        } else if (enumC35445b2 == EnumC35445b.RECOVERY && this.f33459N) {
            this.f33467V.onNext(this.f33462Q);
        } else if (enumC35445b2 == EnumC35445b.SLEEP && this.f33460O) {
            this.f33467V.onNext(this.f33463R);
        } else if (enumC35445b2 == EnumC35445b.OVERVIEW && (this.f33460O || this.f33459N || this.f33458M)) {
            this.f33467V.onNext(this.f33464S);
        } else {
            this.f33467V.onNext("");
        }
        m28709A();
        EnumC35444a enumC35444a = (EnumC35444a) this.f33465T.m70997Z();
        if (!m28728s() && this.f33465T.m70997Z() == EnumC35444a.TINTED) {
            enumC35444a = EnumC35444a.DARK;
        }
        this.f33465T.onNext(enumC35444a);
        m28711C(enumC35444a);
    }

    public void setVideoEnabled(boolean z4) {
        this.f33470b0 = z4;
    }

    /* JADX INFO: renamed from: t */
    public C38280g<EnumC35444a> m28731t() {
        return this.f33465T;
    }

    /* JADX INFO: renamed from: u */
    public C38280g<EnumC31928a> m28732u() {
        return this.f33468W;
    }

    /* JADX INFO: renamed from: v */
    public C38280g<String> m28733v() {
        return this.f33467V;
    }

    /* JADX INFO: renamed from: w */
    public C38280g<Integer> m28734w() {
        return this.f33466U;
    }

    /* JADX INFO: renamed from: x */
    public void m28735x() {
        this.f33475x.f33495q.m28637e();
    }

    /* JADX INFO: renamed from: y */
    public void m28736y() {
        this.f33475x.f33495q.m28637e();
    }

    /* JADX INFO: renamed from: z */
    public void m28737z() {
        this.f33475x.f33495q.setVisibility(0);
    }
}
