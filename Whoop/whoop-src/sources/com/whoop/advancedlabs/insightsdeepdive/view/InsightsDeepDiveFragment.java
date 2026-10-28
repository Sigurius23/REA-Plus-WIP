package com.whoop.advancedlabs.insightsdeepdive.view;

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
import j93.InterfaceC21467g;
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
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uc0.AbstractC34758a;
import uc0.C34759b;
import uf3.C34911a;
import vc0.AbstractC35874a;
import vc0.AbstractC35876c;
import vc0.C35875b;
import vf3.InterfaceC35951a;
import vv1.C36532c;
import w20.C36727q;
import x30.C37894h1;
import xc0.AbstractC38186a;
import ya0.C39355a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lvc0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Lvc0/b;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lya0/a;", "y", "D", "()Lya0/a;", "analyticsHelper", "Lvc0/c;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class InsightsDeepDiveFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5840g(this, null, new C5839f(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment$onCreateView$1$1$1", m100430f = "InsightsDeepDiveFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5834a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23012w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f23014y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5834a(String str, InterfaceC30057d<? super C5834a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23014y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return InsightsDeepDiveFragment.this.new C5834a(this.f23014y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5834a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23012w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InsightsDeepDiveFragment.this.m17469E().m113916o(new AbstractC35874a.b(this.f23014y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment$onCreateView$1$2$1", m100430f = "InsightsDeepDiveFragment.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5835b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23015w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34759b f23017y;

        /* JADX INFO: renamed from: com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C34759b f23018w;

            public a(C34759b c34759b) {
                this.f23018w = c34759b;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC34758a abstractC34758a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f23018w.m109757a(abstractC34758a);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5835b(C34759b c34759b, InterfaceC30057d<? super C5835b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23017y = c34759b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return InsightsDeepDiveFragment.this.new C5835b(this.f23017y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5835b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23015w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM113915l = InsightsDeepDiveFragment.this.m17469E().getNavigationEvents();
                a aVar = new a(this.f23017y);
                this.f23015w = 1;
                if (interfaceC13058lM113915l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C5836c extends C22672i implements Function1 {
        public C5836c(Object obj) {
            super(1, 0, C35875b.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/advancedlabs/insightsdeepdive/presentation/InsightsDeepDiveViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m17478a(AbstractC35874a p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C35875b) this.receiver).m113916o(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m17478a((AbstractC35874a) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5837d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23019w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23020x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23021y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5837d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23019w = componentCallbacks;
            this.f23020x = interfaceC35951a;
            this.f23021y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23019w;
            InterfaceC35951a interfaceC35951a = this.f23020x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23021y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5838e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23022w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23023x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23024y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5838e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23022w = componentCallbacks;
            this.f23023x = interfaceC35951a;
            this.f23024y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f23022w;
            InterfaceC35951a interfaceC35951a = this.f23023x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23024y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5839f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23025w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5839f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f23025w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f23025w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5840g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23026w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23027x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23028y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f23029z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5840g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f23026w = componentCallbacks;
            this.f23027x = interfaceC35951a;
            this.f23028y = interfaceC4339a;
            this.f23029z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, vc0.b] */
        @Override // c93.InterfaceC4339a
        public final C35875b invoke() {
            return AbstractC34132o.m107857B(this.f23026w, this.f23027x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35875b.class), this.f23028y, this.f23029z);
        }
    }

    public InsightsDeepDiveFragment() {
        C36532c c36532c = new C36532c(this, 21);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5837d(this, null, c36532c));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5838e(this, null, null));
    }

    /* JADX INFO: renamed from: D */
    private final C39355a m17468D() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final C35875b m17469E() {
        return (C35875b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C34911a m17470F(InsightsDeepDiveFragment insightsDeepDiveFragment) {
        return AbstractC15751g.m44431K(insightsDeepDiveFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m17471G(InsightsDeepDiveFragment insightsDeepDiveFragment, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C34759b(AbstractC5583n.m16799z(insightsDeepDiveFragment), insightsDeepDiveFragment.getNavigator());
                c28655q.m87172p0(objM87133R);
            }
            C34759b c34759b = (C34759b) objM87133R;
            Bundle arguments = insightsDeepDiveFragment.getArguments();
            if (arguments == null || (string = arguments.getString("insightsId")) == null) {
                string = "";
            }
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(insightsDeepDiveFragment.m17469E().getViewState(), AbstractC35876c.b.f152763b, null, c28655q, 48, 2);
            C35875b c35875bM17469E = insightsDeepDiveFragment.m17469E();
            boolean zM87157i = c28655q.m87157i(insightsDeepDiveFragment) | c28655q.m87153g(string);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = insightsDeepDiveFragment.new C5834a(string, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87254h(c35875bM17469E, string, (InterfaceC4351m) objM87133R2, c28655q);
            C35875b c35875bM17469E2 = insightsDeepDiveFragment.m17469E();
            boolean zM87157i2 = c28655q.m87157i(insightsDeepDiveFragment) | c28655q.m87157i(c34759b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = insightsDeepDiveFragment.new C5835b(c34759b, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c35875bM17469E2);
            AbstractC35876c abstractC35876cM17472H = m17472H(interfaceC28601c1M87260n);
            Bundle arguments2 = insightsDeepDiveFragment.getArguments();
            String string2 = arguments2 != null ? arguments2.getString("source") : null;
            C35875b c35875bM17469E3 = insightsDeepDiveFragment.m17469E();
            boolean zM87157i3 = c28655q.m87157i(c35875bM17469E3);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C5836c(c35875bM17469E3);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC21467g interfaceC21467g = (InterfaceC21467g) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(insightsDeepDiveFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                objM87133R5 = new C37894h1(insightsDeepDiveFragment, 5);
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function1 = (Function1) objM87133R5;
            Function1 function2 = (Function1) interfaceC21467g;
            boolean zM87157i5 = c28655q.m87157i(c34759b);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i5 || objM87133R6 == c28676v0) {
                objM87133R6 = new C37894h1(c34759b, 6);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC38186a.m122308q(abstractC35876cM17472H, string2, function1, function2, (Function1) objM87133R6, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final AbstractC35876c m17472H(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC35876c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m17473I(InsightsDeepDiveFragment insightsDeepDiveFragment, InterfaceC22381a.c analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        insightsDeepDiveFragment.m17468D().m125496e(analyticEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m17474J(C34759b c34759b, AbstractC34758a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c34759b.m109757a(navEvent);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 10), true, 1981496705));
    }
}
