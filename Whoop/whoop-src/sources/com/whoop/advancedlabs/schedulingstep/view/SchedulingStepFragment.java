package com.whoop.advancedlabs.schedulingstep.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import ie0.AbstractC18441a;
import ie0.C18442b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import je0.AbstractC21618a;
import je0.AbstractC21620c;
import je0.C21619b;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import kk1.C22541b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lc0.C23821c;
import le0.AbstractC23873b;
import le0.C23872a;
import or2.AbstractC28163g0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u0006R\u001d\u0010-\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u0006¨\u00062²\u0006\f\u00101\u001a\u0002008\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "K", "()Ljava/lang/String;", "M", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lje0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "N", "()Lje0/b;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lie0/b;", "y", "I", "()Lie0/b;", "navRouter", "z", "J", "stepType", "E", "L", "testType", "F", "a", "Lje0/c;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SchedulingStepFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: G */
    public static final int f23117G = 8;

    /* JADX INFO: renamed from: H */
    private static final String f23118H = "OVERVIEW";

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5875e(this, null, new C5874d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C5873c(this, null, new C23872a(this, 0)));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter = AbstractC30060g.m92088H(new C23872a(this, 1));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h stepType = AbstractC30060g.m92088H(new C23872a(this, 2));

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h testType = AbstractC30060g.m92088H(new C23872a(this, 3));

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingstep.view.SchedulingStepFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingstep.view.SchedulingStepFragment$onCreateView$1$1$1", m100430f = "SchedulingStepFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5872b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23124w;

        public C5872b(InterfaceC30057d<? super C5872b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SchedulingStepFragment.this.new C5872b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5872b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23124w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SchedulingStepFragment.this.m17584N().m60803n(new AbstractC21618a.a(SchedulingStepFragment.this.m17580J(), SchedulingStepFragment.this.m17582L()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingstep.view.SchedulingStepFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5873c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23126w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23127x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23128y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5873c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23126w = componentCallbacks;
            this.f23127x = interfaceC35951a;
            this.f23128y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23126w;
            InterfaceC35951a interfaceC35951a = this.f23127x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23128y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingstep.view.SchedulingStepFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5874d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23129w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5874d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f23129w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f23129w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingstep.view.SchedulingStepFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5875e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23130w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23131x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23132y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f23133z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5875e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f23130w = componentCallbacks;
            this.f23131x = interfaceC35951a;
            this.f23132y = interfaceC4339a;
            this.f23133z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, je0.b] */
        @Override // c93.InterfaceC4339a
        public final C21619b invoke() {
            return AbstractC34132o.m107857B(this.f23130w, this.f23131x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21619b.class), this.f23132y, this.f23133z);
        }
    }

    /* JADX INFO: renamed from: I */
    private final C18442b m17579I() {
        return (C18442b) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final String m17580J() {
        return (String) this.stepType.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final String m17581K() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("step")) == null) ? f23118H : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final String m17582L() {
        return (String) this.testType.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final String m17583M() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("testType");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final C21619b m17584N() {
        return (C21619b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C18442b m17585O(SchedulingStepFragment schedulingStepFragment) {
        return (C18442b) AbstractC29125c.m88492A(schedulingStepFragment).m122602a(new C23872a(schedulingStepFragment, 4), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18442b.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C34911a m17586P(SchedulingStepFragment schedulingStepFragment) {
        return AbstractC15751g.m44431K(AbstractC5583n.m16799z(schedulingStepFragment), schedulingStepFragment.getNavigator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C34911a m17587Q(SchedulingStepFragment schedulingStepFragment) {
        return AbstractC15751g.m44431K(schedulingStepFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m17588R(SchedulingStepFragment schedulingStepFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(schedulingStepFragment.m17584N().getViewState(), AbstractC21620c.b.f82982b, null, c28655q, 48, 2);
            C21619b c21619bM17584N = schedulingStepFragment.m17584N();
            boolean zM87157i = c28655q.m87157i(schedulingStepFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = schedulingStepFragment.new C5872b(null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c21619bM17584N);
            AbstractC21620c abstractC21620cM17589S = m17589S(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(schedulingStepFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C23821c(schedulingStepFragment, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC23873b.m70143s(abstractC21620cM17589S, (Function1) objM87133R2, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    private static final AbstractC21620c m17589S(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC21620c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m17590T(SchedulingStepFragment schedulingStepFragment, AbstractC18441a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        schedulingStepFragment.m17579I().m53138a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final String m17591U(SchedulingStepFragment schedulingStepFragment) {
        return schedulingStepFragment.m17581K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final String m17592V(SchedulingStepFragment schedulingStepFragment) {
        return schedulingStepFragment.m17583M();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C22541b(this, 15), true, -912317370));
    }
}
