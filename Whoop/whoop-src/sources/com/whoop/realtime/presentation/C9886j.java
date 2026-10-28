package com.whoop.realtime.presentation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import bc3.AbstractC3028k2;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c33.C3936c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.realtime.presentation.C9886j;
import hj0.AbstractC17354m;
import hj0.AbstractC17357p;
import in2.C18731c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import j93.InterfaceC21493z;
import java.util.List;
import java.util.Locale;
import k52.AbstractC22206b;
import l73.AbstractC23412c;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import lm2.InterfaceC24516b;
import m52.AbstractC25091k;
import mf3.C25518a;
import mm.C25680d;
import ny0.C27266m;
import o52.C27554g0;
import o52.C27556h0;
import o52.InterfaceC27543b;
import o52.InterfaceC27562k0;
import or2.AbstractC28163g0;
import p021av.C2088b;
import p190hc.AbstractC17145h;
import p249jc.AbstractC21598x;
import p377or.C28134h;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.InterfaceC22666f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 o2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J#\u0010\u001b\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0019\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0004J\r\u0010$\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\u0004J\r\u0010%\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\u0004J\u0010\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\u0004R\u001a\u00104\u001a\u00020/8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R+\u0010=\u001a\u0002052\u0006\u00106\u001a\u0002058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010SR\u0016\u0010X\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010LR\u001b\u0010\\\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010D\u001a\u0004\bZ\u0010[R\u001b\u0010_\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010D\u001a\u0004\b^\u0010[R\u0018\u0010b\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010e\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u001d0f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010k\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u00103R\u0014\u0010n\u001a\u00020H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006p"}, m65681d2 = {"Lcom/whoop/realtime/presentation/j;", "Lhj0/m;", "Lo52/b;", "<init>", "()V", "Landroid/content/Context;", "context", "Ll83/a0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDetach", "Lkotlin/Function1;", "Llm2/b;", "listener", "f", "(Lkotlin/jvm/functions/Function1;)V", "", "i", "", "id", "g", "(Ljava/lang/Integer;)V", "a", "i0", "t0", "", "Z", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/realtime/presentation/c$a;", "activity", "k0", "(Lcom/whoop/realtime/presentation/c$a;)V", "g0", "r0", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lm52/k;", "<set-?>", "x", "Lcom/whoop/ui/b;", "b0", "()Lm52/k;", "q0", "(Lm52/k;)V", "binding", "Lcom/whoop/realtime/presentation/a;", "y", "Lcom/whoop/realtime/presentation/a;", "adapter", "Lcom/whoop/realtime/presentation/k;", "z", "Ll83/h;", "f0", "()Lcom/whoop/realtime/presentation/k;", "viewModel", "Lo52/k0;", "E", "Lo52/k0;", "_toolbarController", "F", "Lkotlin/jvm/functions/Function1;", "activitySelectedListener", "G", "activityListOpenedListener", "Landroid/animation/Animator;", "H", "Landroid/animation/Animator;", "hideAnimator", "I", "showAnimator", "J", "fragmentHeight", "K", "c0", "()I", "toolbarColorHidden", "L", "d0", "toolbarColorShown", "M", "Ljava/lang/Integer;", "sportId", "b", "()Llm2/b;", "selectedActivity", "Ll73/c;", "r", "()Ll73/c;", "gpsStateListener", "q", "lastTabSelected", "e0", "()Lo52/k0;", "toolbarController", "N", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9886j extends AbstractC17354m implements InterfaceC27543b {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private InterfaceC27562k0 _toolbarController;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private Animator hideAnimator;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private Animator showAnimator;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private float fragmentHeight;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h toolbarColorHidden;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h toolbarColorShown;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private Integer sportId;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private C9877a adapter;

    /* JADX INFO: renamed from: O */
    static final /* synthetic */ InterfaceC21493z[] f28953O = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C9886j.class, "binding", "getBinding()Lcom/whoop/realtime/databinding/FragmentSelectActivityBinding;", 0))};

    /* JADX INFO: renamed from: P */
    public static final int f28954P = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "SelectActivityFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26725b(this, new C27266m(20));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new j(this, null, C25518a.f99923w, null));

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Function1 activitySelectedListener = new C27266m(21);

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private Function1 activityListOpenedListener = new C27266m(22);

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.j$b */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.SelectActivityFragment", m100430f = "SelectActivityFragment.kt", m100431l = {172}, m100432m = "awaitFragmentHeightLayout", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f28968w;

        /* JADX INFO: renamed from: y */
        int f28970y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28968w = obj;
            this.f28970y |= Integer.MIN_VALUE;
            return C9886j.this.m24054Z(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.j$c */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.SelectActivityFragment$awaitFragmentHeightLayout$2", m100430f = "SelectActivityFragment.kt", m100431l = {174}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)F"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28971w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C9886j.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Float> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28971w;
            if (i13 != 0 && i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            while (C9886j.this.fragmentHeight == 0.0f) {
                this.f28971w = 1;
                if (AbstractC3034m0.m8782b(50L, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return new Float(C9886j.this.fragmentHeight);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.j$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m65681d2 = {"com/whoop/realtime/presentation/j$d", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Ll83/a0;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Animator.AnimatorListener {
        public d(C9886j c9886j) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C9886j.this.m24060f0().m24109U();
            C9886j.this.activityListOpenedListener.invoke(Boolean.FALSE);
            C9886j.this.m24059e0().mo24003h().setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C9886j.this.m24060f0().m24110V();
            C9886j.this.m24059e0().mo24003h().setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.j$e */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.SelectActivityFragment$hideNow$1$1", m100430f = "SelectActivityFragment.kt", m100431l = {162}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f28974w;

        /* JADX INFO: renamed from: x */
        int f28975x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C9886j.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            View view;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28975x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C9886j.this.m24059e0().mo24003h().setVisibility(4);
                View viewMo24003h = C9886j.this.m24059e0().mo24003h();
                C9886j c9886j = C9886j.this;
                this.f28974w = viewMo24003h;
                this.f28975x = 1;
                Object objM24054Z = c9886j.m24054Z(this);
                if (objM24054Z == enumC31071a) {
                    return enumC31071a;
                }
                view = viewMo24003h;
                obj = objM24054Z;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                view = (View) this.f28974w;
                AbstractC34132o.m107864I(obj);
            }
            view.setTranslationY(((Number) obj).floatValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.j$f */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Ll83/a0;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements View.OnLayoutChangeListener {
        public f() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            C9886j.this.fragmentHeight = view.getHeight();
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.j$g */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/realtime/presentation/j$g", "Lhc/h;", "", "position", "Ll83/a0;", "onPageSelected", "(I)V", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC17145h {
        public g() {
        }

        @Override // p190hc.AbstractC17145h
        public void onPageSelected(int position) {
            C9886j.this.m24060f0().m24112X(position);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.j$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f28979w;

        public h(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f28979w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f28979w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28979w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.j$i */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m65681d2 = {"com/whoop/realtime/presentation/j$i", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Ll83/a0;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Animator.AnimatorListener {
        public i(C9886j c9886j) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C9886j.this.activityListOpenedListener.invoke(Boolean.TRUE);
            C9886j.this.m24060f0().m24109U();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C9886j.this.m24059e0().mo24003h().setVisibility(0);
            C9886j.this.m24060f0().m24110V();
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.j$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC29049f f28981w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28982x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28983y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f28984z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC29049f interfaceC29049f, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f28981w = interfaceC29049f;
            this.f28982x = interfaceC35951a;
            this.f28983y = interfaceC4339a;
            this.f28984z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.w1, com.whoop.realtime.presentation.k] */
        @Override // c93.InterfaceC4339a
        public final C9887k invoke() {
            InterfaceC29049f interfaceC29049f = this.f28981w;
            InterfaceC35951a interfaceC35951a = this.f28982x;
            InterfaceC4339a state = this.f28983y;
            InterfaceC4339a interfaceC4339a = this.f28984z;
            InterfaceC21461d clazz = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9887k.class);
            AbstractC22676k.m65750j(interfaceC29049f, "<this>");
            AbstractC22676k.m65750j(state, "state");
            AbstractC22676k.m65750j(clazz, "clazz");
            return AbstractC21598x.m60668X(AbstractC29125c.m88492A((ComponentCallbacks) interfaceC29049f), interfaceC35951a, new C2088b(interfaceC29049f, 28), clazz, state, interfaceC4339a);
        }
    }

    public C9886j() {
        final int i13 = 0;
        this.toolbarColorHidden = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: o52.i0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C9886j f110947x;

            {
                this.f110947x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int iM24073u0;
                switch (i13) {
                    case 0:
                        iM24073u0 = C9886j.m24073u0(this.f110947x);
                        break;
                    default:
                        iM24073u0 = C9886j.m24074v0(this.f110947x);
                        break;
                }
                return Integer.valueOf(iM24073u0);
            }
        });
        final int i14 = 1;
        this.toolbarColorShown = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: o52.i0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C9886j f110947x;

            {
                this.f110947x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int iM24073u0;
                switch (i14) {
                    case 0:
                        iM24073u0 = C9886j.m24073u0(this.f110947x);
                        break;
                    default:
                        iM24073u0 = C9886j.m24074v0(this.f110947x);
                        break;
                }
                return Integer.valueOf(iM24073u0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m24052X(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m24053Y(InterfaceC24516b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Z */
    public final Object m24054Z(InterfaceC30057d<? super Float> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f28970y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f28970y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM8750d = bVar.f28968w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f28970y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8750d);
            c cVar = new c(null);
            bVar.f28970y = 1;
            objM8750d = AbstractC3028k2.m8750d(5000L, cVar, bVar);
            if (objM8750d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8750d);
        }
        Float f13 = (Float) objM8750d;
        return new Float(f13 != null ? f13.floatValue() : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m24055a0(AbstractC25091k it) {
        AbstractC22676k.m65750j(it, "it");
        it.f98339c.setAdapter(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b0 */
    private final AbstractC25091k m24056b0() {
        return (AbstractC25091k) this.binding.getValue(this, f28953O[0]);
    }

    /* JADX INFO: renamed from: c0 */
    private final int m24057c0() {
        return ((Number) this.toolbarColorHidden.getValue()).intValue();
    }

    /* JADX INFO: renamed from: d0 */
    private final int m24058d0() {
        return ((Number) this.toolbarColorShown.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public final InterfaceC27562k0 m24059e0() {
        InterfaceC27562k0 interfaceC27562k0 = this._toolbarController;
        if (interfaceC27562k0 != null) {
            return interfaceC27562k0;
        }
        throw new IllegalArgumentException("toolbarController accessed after fragment detached");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final C9887k m24060f0() {
        return (C9887k) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: g0 */
    private final void m24061g0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m24059e0().mo24003h(), "translationY", 0.0f, -this.fragmentHeight);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(m24059e0().mo24002g(), "rotation", -180.0f, 0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C27556h0(this, 0));
        Animator animator = this.hideAnimator;
        if (animator != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorOfFloat);
        animatorSet.setDuration(250L);
        animatorSet.addListener(new d(this));
        animatorSet.start();
        this.hideAnimator = animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m24062h0(C9886j c9886j, ValueAnimator it) {
        AbstractC22676k.m65750j(it, "it");
        View viewMo23996a = c9886j.m24059e0().mo23996a();
        int iM24058d0 = c9886j.m24058d0();
        int iM24057c0 = c9886j.m24057c0();
        Object animatedValue = it.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        viewMo23996a.setBackgroundColor(C18731c.m54471a(iM24058d0, iM24057c0, ((Float) animatedValue).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m24063j0(C9886j c9886j, InterfaceC1585g0 interfaceC1585g0) {
        c9886j.getViewLifecycleOwnerLiveData().removeObservers(c9886j);
        AbstractC22676k.m65747g(interfaceC1585g0);
        AbstractC1613o1.m5020j(interfaceC1585g0).m4972a(c9886j.new e(null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k0 */
    private final void m24064k0(AbstractC9879c.a activity) {
        InterfaceC24516b interfaceC24516bM24014c = activity.getActivity();
        C9877a c9877a = this.adapter;
        if (c9877a != null) {
            c9877a.m24007c(interfaceC24516bM24014c);
        }
        this.activitySelectedListener.invoke(interfaceC24516bM24014c);
        interfaceC24516bM24014c.mo71416i(m24059e0().mo23999d());
        AbstractC9881e.INSTANCE.m24023a(m24059e0().mo24001f(), interfaceC24516bM24014c);
        m24060f0().m24108S(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m24065l0(C9886j c9886j, List it) {
        AbstractC22676k.m65750j(it, "it");
        c9886j.adapter = new C9877a(it, new C27554g0(c9886j, 1));
        c9886j.m24056b0().f98339c.setAdapter(c9886j.adapter);
        new C3936c(c9886j.m24056b0().f98338b, c9886j.m24056b0().f98339c, new C25680d(c9886j, 9)).m11985b();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m24066m0(C9886j c9886j, AbstractC9879c.a activity) {
        AbstractC22676k.m65750j(activity, "activity");
        c9886j.m24064k0(activity);
        c9886j.m24083t0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m24067n0(C9886j c9886j, C28134h tab, int i13) {
        AbstractC22676k.m65750j(tab, "tab");
        String string = c9886j.getString(c9886j.m24060f0().m24106N().get(i13).getTabNameResourceId());
        AbstractC22676k.m65749i(string, "getString(...)");
        Locale locale = Locale.getDefault();
        AbstractC22676k.m65749i(locale, "getDefault(...)");
        String upperCase = string.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        tab.m85123a(upperCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m24068o0(C9886j c9886j, AbstractC9879c.a it) {
        AbstractC22676k.m65750j(it, "it");
        c9886j.m24064k0(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m24069p0(C9886j c9886j, boolean z4) {
        if (z4) {
            c9886j.m24071r0();
        } else {
            c9886j.m24061g0();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q0 */
    private final void m24070q0(AbstractC25091k abstractC25091k) {
        this.binding.setValue(this, f28953O[0], abstractC25091k);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m24071r0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m24059e0().mo24003h(), "translationY", -this.fragmentHeight, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(m24059e0().mo24002g(), "rotation", 0.0f, -180.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C27556h0(this, 1));
        Animator animator = this.showAnimator;
        if (animator != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorOfFloat);
        animatorSet.setDuration(250L);
        animatorSet.addListener(new i(this));
        animatorSet.start();
        this.showAnimator = animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m24072s0(C9886j c9886j, ValueAnimator it) {
        AbstractC22676k.m65750j(it, "it");
        View viewMo23996a = c9886j.m24059e0().mo23996a();
        int iM24057c0 = c9886j.m24057c0();
        int iM24058d0 = c9886j.m24058d0();
        Object animatedValue = it.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        viewMo23996a.setBackgroundColor(C18731c.m54471a(iM24057c0, iM24058d0, ((Float) animatedValue).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final int m24073u0(C9886j c9886j) {
        return AbstractC17357p.m49142b(c9886j, AbstractC22206b.f86245d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final int m24074v0(C9886j c9886j) {
        return AbstractC17357p.m49142b(c9886j, AbstractC22206b.f86244c);
    }

    @Override // o52.InterfaceC27543b
    /* JADX INFO: renamed from: a */
    public void mo24075a() {
    }

    @Override // o52.InterfaceC27543b
    /* JADX INFO: renamed from: b */
    public InterfaceC24516b mo24076b() {
        return m24060f0().m24101F();
    }

    @Override // o52.InterfaceC27543b
    /* JADX INFO: renamed from: f */
    public void mo24077f(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.activitySelectedListener = listener;
    }

    @Override // o52.InterfaceC27543b
    /* JADX INFO: renamed from: g */
    public void mo24078g(Integer id4) {
        this.sportId = id4;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // o52.InterfaceC27543b
    /* JADX INFO: renamed from: i */
    public void mo24079i(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.activityListOpenedListener = listener;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m24080i0() {
        getViewLifecycleOwnerLiveData().observe(this, new h(new C27554g0(this, 4)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onAttach(Context context) {
        AbstractC22676k.m65750j(context, "context");
        super.onAttach(context);
        if (!(context instanceof InterfaceC27562k0)) {
            throw new IllegalStateException("Host activity must implement SelectActivityToolbarController");
        }
        this._toolbarController = (InterfaceC27562k0) context;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC25091k abstractC25091kM73588c = AbstractC25091k.m73588c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC25091kM73588c, "inflate(...)");
        m24070q0(abstractC25091kM73588c);
        View root = m24056b0().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        super.onDestroyView();
        Animator animator = this.hideAnimator;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.showAnimator;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDetach() {
        super.onDetach();
        this._toolbarController = null;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View root = m24056b0().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        AbstractC28163g0.m85252h(this, root, null, AbstractC37056f.m118958J(m24056b0().f98339c), 0, 0, 26, null);
        m24060f0().m24113b0(this.sportId);
        m24060f0().m24111W();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new f());
        } else {
            this.fragmentHeight = view.getHeight();
        }
        observe(m24060f0().getActivitiesLiveData(), new h(new C27554g0(this, 0)));
        m24056b0().f98339c.m5508b(new g());
        observe(m24060f0().getSelectedActivityLiveData(), new h(new C27554g0(this, 2)));
        observe(m24060f0().getToggleListStateLiveData(), new h(new C27554g0(this, 3)));
    }

    @Override // o52.InterfaceC27543b
    /* JADX INFO: renamed from: q */
    public String mo24081q() {
        return m24060f0().getLastTabSelected();
    }

    @Override // o52.InterfaceC27543b
    /* JADX INFO: renamed from: r */
    public AbstractC23412c mo24082r() {
        return m24060f0().m24102G();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m24083t0() {
        m24060f0().m24114c0();
    }
}
