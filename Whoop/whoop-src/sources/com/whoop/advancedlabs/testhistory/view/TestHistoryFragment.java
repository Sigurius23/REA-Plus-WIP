package com.whoop.advancedlabs.testhistory.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
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
import com.whoop.advancedlabs.testhistory.view.TestHistoryFragment;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd0.InterfaceC22381a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ne0.AbstractC26596a;
import ne0.C26597b;
import nf3.C26669a;
import o02.InterfaceC27353d;
import oe0.AbstractC27868c;
import oe0.AbstractC27870e;
import oe0.C27869d;
import oe2.C27878c;
import of3.InterfaceC27903a;
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
import pf.C29124b;
import q80.C30036h;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qe0.AbstractC30302c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import ya0.C39355a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$¨\u0006(²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;", "Landroidx/fragment/app/m0;", "Lof3/a;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Loe0/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Loe0/d;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lo02/d;", "y", "getBaseNavReducer", "()Lo02/d;", "baseNavReducer", "Lya0/a;", "z", "E", "()Lya0/a;", "analyticsHelper", "Loe0/e;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TestHistoryFragment extends AbstractComponentCallbacksC1320m0 implements InterfaceC27903a {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5881f(this, null, new C5880e(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h baseNavReducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testhistory.view.TestHistoryFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testhistory.view.TestHistoryFragment$onCreateView$1$1$1", m100430f = "TestHistoryFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5876a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23138w;

        public C5876a(InterfaceC30057d<? super C5876a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return TestHistoryFragment.this.new C5876a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5876a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23138w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            TestHistoryFragment.this.m17600F().m84123n(AbstractC27868c.a.f112309a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testhistory.view.TestHistoryFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5877b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23140w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23141x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23142y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5877b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23140w = componentCallbacks;
            this.f23141x = interfaceC35951a;
            this.f23142y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23140w;
            InterfaceC35951a interfaceC35951a = this.f23141x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23142y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testhistory.view.TestHistoryFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5878c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23143w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23144x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23145y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5878c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23143w = componentCallbacks;
            this.f23144x = interfaceC35951a;
            this.f23145y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f23143w;
            InterfaceC35951a interfaceC35951a = this.f23144x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23145y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testhistory.view.TestHistoryFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5879d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23146w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23147x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23148y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5879d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23146w = componentCallbacks;
            this.f23147x = interfaceC35951a;
            this.f23148y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f23146w;
            InterfaceC35951a interfaceC35951a = this.f23147x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23148y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testhistory.view.TestHistoryFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5880e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23149w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5880e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f23149w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f23149w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testhistory.view.TestHistoryFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5881f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23150w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23151x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23152y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f23153z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5881f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f23150w = componentCallbacks;
            this.f23151x = interfaceC35951a;
            this.f23152y = interfaceC4339a;
            this.f23153z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, oe0.d] */
        @Override // c93.InterfaceC4339a
        public final C27869d invoke() {
            return AbstractC34132o.m107857B(this.f23150w, this.f23151x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27869d.class), this.f23152y, this.f23153z);
        }
    }

    public TestHistoryFragment() {
        C30036h c30036h = new C30036h(this, 3);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5877b(this, null, c30036h));
        this.baseNavReducer = AbstractC30060g.m92087G(enumC23463i, new C5878c(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5879d(this, null, null));
    }

    /* JADX INFO: renamed from: E */
    private final C39355a m17599E() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final C27869d m17600F() {
        return (C27869d) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C34911a m17601G(TestHistoryFragment testHistoryFragment) {
        return AbstractC15751g.m44431K(testHistoryFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m17602H(final TestHistoryFragment testHistoryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C26597b c26597b = new C26597b(AbstractC5583n.m16799z(testHistoryFragment), testHistoryFragment.getNavigator());
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(testHistoryFragment.m17600F().getViewState(), AbstractC27870e.b.f112333b, null, c28655q, 48, 2);
            C27869d c27869dM17600F = testHistoryFragment.m17600F();
            boolean zM87157i = c28655q.m87157i(testHistoryFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = testHistoryFragment.new C5876a(null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c27869dM17600F);
            AbstractC27870e abstractC27870eM17603I = m17603I(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(c26597b);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C29124b(c26597b, 12);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(testHistoryFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i14 = 0;
                objM87133R3 = new Function1(testHistoryFragment) { // from class: qe0.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ TestHistoryFragment f123993x;

                    {
                        this.f123993x = testHistoryFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return TestHistoryFragment.m17605K(this.f123993x, (InterfaceC22381a.c) obj);
                            default:
                                return TestHistoryFragment.m17606L(this.f123993x, (AbstractC27868c) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(testHistoryFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i15 = 1;
                objM87133R4 = new Function1(testHistoryFragment) { // from class: qe0.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ TestHistoryFragment f123993x;

                    {
                        this.f123993x = testHistoryFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return TestHistoryFragment.m17605K(this.f123993x, (InterfaceC22381a.c) obj);
                            default:
                                return TestHistoryFragment.m17606L(this.f123993x, (AbstractC27868c) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC30302c.m92613G(abstractC27870eM17603I, function1, function2, (Function1) objM87133R4, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final AbstractC27870e m17603I(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC27870e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m17604J(C26597b c26597b, AbstractC26596a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c26597b.m79101a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m17605K(TestHistoryFragment testHistoryFragment, InterfaceC22381a.c analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        testHistoryFragment.m17599E().m125496e(analyticEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m17606L(TestHistoryFragment testHistoryFragment, AbstractC27868c event) {
        AbstractC22676k.m65750j(event, "event");
        testHistoryFragment.m17600F().m84123n(event);
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 24), true, -292878438));
    }
}
