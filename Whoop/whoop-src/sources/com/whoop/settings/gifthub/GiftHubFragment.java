package com.whoop.settings.gifthub;

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
import com.whoop.settings.gifthub.GiftHubFragment;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pb2.AbstractC29058a;
import pb2.C29060c;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qb2.InterfaceC30185d;
import qb2.InterfaceC30186e;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sb2.AbstractC32347a;
import tb2.C33693a;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"¨\u0006&²\u0006\u000e\u0010%\u001a\u0004\u0018\u00010$8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/settings/gifthub/GiftHubFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ltb2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "G", "()Ltb2/a;", "viewModel", "Lpb2/c;", "x", "E", "()Lpb2/c;", "navRouter", "", "y", "F", "()Ljava/lang/String;", "source", "Lqb2/e;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GiftHubFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10103d(this, null, new C10102c(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: com.whoop.settings.gifthub.GiftHubFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.gifthub.GiftHubFragment$onCreateView$1$1$1", m100430f = "GiftHubFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10100a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30374w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f30376y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10100a(InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super C10100a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30376y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return GiftHubFragment.this.new C10100a(this.f30376y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10100a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f30374w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (GiftHubFragment.m25383J(this.f30376y) == null) {
                GiftHubFragment.this.m25390G().m106450o(new InterfaceC30185d.a(GiftHubFragment.this.m25389F()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.gifthub.GiftHubFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10101b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30377w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30378x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30379y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10101b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30377w = componentCallbacks;
            this.f30378x = interfaceC35951a;
            this.f30379y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, pb2.c] */
        @Override // c93.InterfaceC4339a
        public final C29060c invoke() {
            ComponentCallbacks componentCallbacks = this.f30377w;
            InterfaceC35951a interfaceC35951a = this.f30378x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30379y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29060c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.gifthub.GiftHubFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10102c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30380w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10102c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30380w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30380w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.gifthub.GiftHubFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10103d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30381w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30382x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30383y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30384z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10103d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30381w = componentCallbacks;
            this.f30382x = interfaceC35951a;
            this.f30383y = interfaceC4339a;
            this.f30384z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, tb2.a] */
        @Override // c93.InterfaceC4339a
        public final C33693a invoke() {
            return AbstractC34132o.m107857B(this.f30381w, this.f30382x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33693a.class), this.f30383y, this.f30384z);
        }
    }

    public GiftHubFragment() {
        final int i13 = 0;
        this.navRouter = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10101b(this, null, new InterfaceC4339a(this) { // from class: kb2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GiftHubFragment f87165x;

            {
                this.f87165x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return GiftHubFragment.m25381H(this.f87165x);
                    default:
                        return GiftHubFragment.m25386M(this.f87165x);
                }
            }
        }));
        final int i14 = 1;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: kb2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GiftHubFragment f87165x;

            {
                this.f87165x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return GiftHubFragment.m25381H(this.f87165x);
                    default:
                        return GiftHubFragment.m25386M(this.f87165x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private final C29060c m25380E() {
        return (C29060c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C34911a m25381H(GiftHubFragment giftHubFragment) {
        return AbstractC15751g.m44431K(AbstractC5583n.m16799z(giftHubFragment), giftHubFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m25382I(final GiftHubFragment giftHubFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(giftHubFragment.m25390G().getViewState(), null, null, c28655q, 48, 2);
            InterfaceC30186e interfaceC30186eM25383J = m25383J(interfaceC28601c1M87260n);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(giftHubFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = giftHubFragment.new C10100a(interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, interfaceC30186eM25383J);
            InterfaceC30186e interfaceC30186eM25383J2 = m25383J(interfaceC28601c1M87260n);
            if (interfaceC30186eM25383J2 == null) {
                c28655q.m87150e0(996532933);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(996532934);
                boolean zM87157i = c28655q.m87157i(giftHubFragment);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    final int i14 = 0;
                    objM87133R2 = new Function1(giftHubFragment) { // from class: kb2.b

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ GiftHubFragment f87167x;

                        {
                            this.f87167x = giftHubFragment;
                        }

                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i14) {
                                case 0:
                                    return GiftHubFragment.m25384K(this.f87167x, (InterfaceC30185d) obj);
                                default:
                                    return GiftHubFragment.m25385L(this.f87167x, (AbstractC29058a) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function1 = (Function1) objM87133R2;
                boolean zM87157i2 = c28655q.m87157i(giftHubFragment);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    final int i15 = 1;
                    objM87133R3 = new Function1(giftHubFragment) { // from class: kb2.b

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ GiftHubFragment f87167x;

                        {
                            this.f87167x = giftHubFragment;
                        }

                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i15) {
                                case 0:
                                    return GiftHubFragment.m25384K(this.f87167x, (InterfaceC30185d) obj);
                                default:
                                    return GiftHubFragment.m25385L(this.f87167x, (AbstractC29058a) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC32347a.m100680d(interfaceC30186eM25383J2, function1, (Function1) objM87133R3, c28655q, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final InterfaceC30186e m25383J(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC30186e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m25384K(GiftHubFragment giftHubFragment, InterfaceC30185d viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        giftHubFragment.m25390G().m106450o(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m25385L(GiftHubFragment giftHubFragment, AbstractC29058a navigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        giftHubFragment.m25380E().m88339a(navigationEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final String m25386M(GiftHubFragment giftHubFragment) {
        String string;
        Bundle arguments = giftHubFragment.getArguments();
        String strM85315e = (arguments == null || (string = arguments.getString("source")) == null) ? null : AbstractC28188o1.m85315e(string);
        if (strM85315e == null || AbstractC39414r.m125890i0(strM85315e)) {
            return null;
        }
        return strM85315e;
    }

    /* JADX INFO: renamed from: F */
    public final String m25389F() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: renamed from: G */
    public final C33693a m25390G() {
        return (C33693a) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C17098f(this, 26), true, 1287615359));
    }
}
