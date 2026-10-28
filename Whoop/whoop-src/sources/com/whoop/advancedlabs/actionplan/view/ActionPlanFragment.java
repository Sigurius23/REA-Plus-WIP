package com.whoop.advancedlabs.actionplan.view;

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
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd0.InterfaceC22381a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p736sz0.C33205o0;
import pa0.C29036a;
import pf.AbstractC29125c;
import q11.C29793c;
import q80.C30036h;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qa0.AbstractC30111c;
import qa0.C30110b;
import qa0.InterfaceC30109a;
import r12.C30856a;
import r83.EnumC31071a;
import rq0.C31703x;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sa0.AbstractC32325b;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import ya0.C39355a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lqa0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Lqa0/b;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lya0/a;", "y", "D", "()Lya0/a;", "analyticsHelper", "Lqa0/c;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ActionPlanFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5787f(this, null, new C5786e(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.actionplan.view.ActionPlanFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.view.ActionPlanFragment$onCreateView$1$1$1", m100430f = "ActionPlanFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5782a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22838w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f22840y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5782a(String str, InterfaceC30057d<? super C5782a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f22840y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ActionPlanFragment.this.new C5782a(this.f22840y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5782a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f22838w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ActionPlanFragment.this.m17257E().m92239r(new InterfaceC30109a.d(this.f22840y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.actionplan.view.ActionPlanFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.view.ActionPlanFragment$onCreateView$1$2$1", m100430f = "ActionPlanFragment.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5783b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22841w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C29036a f22843y;

        /* JADX INFO: renamed from: com.whoop.advancedlabs.actionplan.view.ActionPlanFragment$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C29036a f22844w;

            public a(C29036a c29036a) {
                this.f22844w = c29036a;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC30109a.e eVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f22844w.m88269a(eVar);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5783b(C29036a c29036a, InterfaceC30057d<? super C5783b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f22843y = c29036a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ActionPlanFragment.this.new C5783b(this.f22843y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5783b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f22841w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM92237n = ActionPlanFragment.this.m17257E().getNavigationEvents();
                a aVar = new a(this.f22843y);
                this.f22841w = 1;
                if (interfaceC13058lM92237n.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.actionplan.view.ActionPlanFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5784c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22845w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22846x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22847y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5784c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22845w = componentCallbacks;
            this.f22846x = interfaceC35951a;
            this.f22847y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22845w;
            InterfaceC35951a interfaceC35951a = this.f22846x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22847y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.actionplan.view.ActionPlanFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5785d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22848w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22849x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22850y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5785d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22848w = componentCallbacks;
            this.f22849x = interfaceC35951a;
            this.f22850y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f22848w;
            InterfaceC35951a interfaceC35951a = this.f22849x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22850y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.actionplan.view.ActionPlanFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5786e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22851w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5786e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f22851w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f22851w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.actionplan.view.ActionPlanFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5787f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22852w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22853x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22854y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f22855z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5787f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f22852w = componentCallbacks;
            this.f22853x = interfaceC35951a;
            this.f22854y = interfaceC4339a;
            this.f22855z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, qa0.b] */
        @Override // c93.InterfaceC4339a
        public final C30110b invoke() {
            return AbstractC34132o.m107857B(this.f22852w, this.f22853x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30110b.class), this.f22854y, this.f22855z);
        }
    }

    public ActionPlanFragment() {
        C30036h c30036h = new C30036h(this, 29);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5784c(this, null, c30036h));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5785d(this, null, null));
    }

    /* JADX INFO: renamed from: D */
    private final C39355a m17256D() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final C30110b m17257E() {
        return (C30110b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C34911a m17258F(ActionPlanFragment actionPlanFragment) {
        return AbstractC15751g.m44431K(actionPlanFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m17259G(ActionPlanFragment actionPlanFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Bundle arguments = actionPlanFragment.getArguments();
            String string = arguments != null ? arguments.getString("testId") : null;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C29036a(AbstractC5583n.m16799z(actionPlanFragment), actionPlanFragment.getNavigator());
                c28655q.m87172p0(objM87133R);
            }
            C29036a c29036a = (C29036a) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(actionPlanFragment.m17257E().getViewState(), new AbstractC30111c.a(C33205o0.f138451a.m105288b(), null, null, 6, null), null, c28655q, 0, 2);
            C30110b c30110bM17257E = actionPlanFragment.m17257E();
            boolean zM87157i = c28655q.m87157i(actionPlanFragment) | c28655q.m87153g(string);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = actionPlanFragment.new C5782a(string, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87254h(c30110bM17257E, string, (InterfaceC4351m) objM87133R2, c28655q);
            C30110b c30110bM17257E2 = actionPlanFragment.m17257E();
            boolean zM87157i2 = c28655q.m87157i(actionPlanFragment) | c28655q.m87157i(c29036a);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = actionPlanFragment.new C5783b(c29036a, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c30110bM17257E2);
            AbstractC30111c abstractC30111cM17260H = m17260H(interfaceC28601c1M87260n);
            boolean zM87157i3 = c28655q.m87157i(c29036a) | c28655q.m87157i(actionPlanFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C29793c(28, c29036a, actionPlanFragment);
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function1 = (Function1) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(actionPlanFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                objM87133R5 = new C31703x(actionPlanFragment, 10);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC32325b.m100599l(abstractC30111cM17260H, function1, (Function1) objM87133R5, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final AbstractC30111c m17260H(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC30111c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m17261I(C29036a c29036a, ActionPlanFragment actionPlanFragment, InterfaceC30109a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC30109a.e) {
            c29036a.m88269a((InterfaceC30109a.e) event);
        } else if (event instanceof InterfaceC30109a.g) {
            actionPlanFragment.m17257E().m92239r((InterfaceC30109a.g) event);
        } else {
            if (!(event instanceof InterfaceC30109a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            actionPlanFragment.m17257E().m92238q(((InterfaceC30109a.b) event).getActionViewEvent());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m17262J(ActionPlanFragment actionPlanFragment, InterfaceC22381a.c analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        actionPlanFragment.m17256D().m125496e(analyticEvent);
        return C23454a0.f92919a;
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
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C30856a(this, 19), true, -966773979));
    }
}
