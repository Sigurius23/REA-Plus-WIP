package com.whoop.referafriend;

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
import com.whoop.referafriend.ReferAFriendFragment;
import ej1.C13242h;
import ge3.AbstractC15751g;
import h62.AbstractC16981a;
import h62.C16982b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l62.AbstractC23380a;
import l62.C23384e;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m62.InterfaceC25116g;
import m62.InterfaceC25119j;
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
import p62.AbstractC28945f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s62.C32235a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'¨\u0006+²\u0006\f\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/referafriend/ReferAFriendFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "H", "()Ljava/lang/String;", "source", "Ls62/a;", "x", "I", "()Ls62/a;", "viewModel", "Lh62/b;", "y", "F", "()Lh62/b;", "analytics", "Ll62/e;", "z", "G", "()Ll62/e;", "navRouter", "Lm62/g;", "viewState", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ReferAFriendFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9922e(this, null, new C9921d(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: com.whoop.referafriend.ReferAFriendFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.referafriend.ReferAFriendFragment$onCreateView$1$1$1", m100430f = "ReferAFriendFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9918a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f29352w;

        public C9918a(InterfaceC30057d<? super C9918a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ReferAFriendFragment.this.new C9918a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9918a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f29352w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ReferAFriendFragment.this.m24374I().m100286o(new InterfaceC25119j.c(ReferAFriendFragment.this.m24363H()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.referafriend.ReferAFriendFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9919b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29354w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29355x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29356y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9919b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29354w = componentCallbacks;
            this.f29355x = interfaceC35951a;
            this.f29356y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [h62.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C16982b invoke() {
            ComponentCallbacks componentCallbacks = this.f29354w;
            InterfaceC35951a interfaceC35951a = this.f29355x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29356y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16982b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.referafriend.ReferAFriendFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9920c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29357w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29358x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29359y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9920c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29357w = componentCallbacks;
            this.f29358x = interfaceC35951a;
            this.f29359y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l62.e] */
        @Override // c93.InterfaceC4339a
        public final C23384e invoke() {
            ComponentCallbacks componentCallbacks = this.f29357w;
            InterfaceC35951a interfaceC35951a = this.f29358x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29359y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23384e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.referafriend.ReferAFriendFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9921d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29360w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9921d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f29360w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f29360w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.referafriend.ReferAFriendFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9922e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29361w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29362x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29363y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f29364z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9922e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f29361w = componentCallbacks;
            this.f29362x = interfaceC35951a;
            this.f29363y = interfaceC4339a;
            this.f29364z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, s62.a] */
        @Override // c93.InterfaceC4339a
        public final C32235a invoke() {
            return AbstractC34132o.m107857B(this.f29361w, this.f29362x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32235a.class), this.f29363y, this.f29364z);
        }
    }

    public ReferAFriendFragment() {
        final int i13 = 0;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: g62.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ReferAFriendFragment f58247x;

            {
                this.f58247x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ReferAFriendFragment.m24370P(this.f58247x);
                    default:
                        return ReferAFriendFragment.m24364J(this.f58247x);
                }
            }
        });
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C9919b(this, null, null));
        final int i14 = 1;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C9920c(this, null, new InterfaceC4339a(this) { // from class: g62.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ReferAFriendFragment f58247x;

            {
                this.f58247x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ReferAFriendFragment.m24370P(this.f58247x);
                    default:
                        return ReferAFriendFragment.m24364J(this.f58247x);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    private final C23384e m24362G() {
        return (C23384e) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final String m24363H() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C34911a m24364J(ReferAFriendFragment referAFriendFragment) {
        return AbstractC15751g.m44431K(AbstractC5583n.m16799z(referAFriendFragment), referAFriendFragment.requireActivity(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m24365K(final ReferAFriendFragment referAFriendFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(referAFriendFragment.m24374I().getViewState(), InterfaceC25116g.d.f98436a, null, c28655q, 48, 2);
        boolean zM87157i = c28655q.m87157i(referAFriendFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = referAFriendFragment.new C9918a(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        InterfaceC25116g interfaceC25116gM24366L = m24366L(interfaceC28601c1M87260n);
        boolean zM87157i2 = c28655q.m87157i(referAFriendFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            final int i14 = 0;
            objM87133R2 = new Function1(referAFriendFragment) { // from class: g62.b

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ ReferAFriendFragment f58249x;

                {
                    this.f58249x = referAFriendFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            return ReferAFriendFragment.m24367M(this.f58249x, (InterfaceC25119j) obj);
                        case 1:
                            return ReferAFriendFragment.m24368N(this.f58249x, (AbstractC23380a) obj);
                        default:
                            return ReferAFriendFragment.m24369O(this.f58249x, (AbstractC16981a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function1 = (Function1) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(referAFriendFragment);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            final int i15 = 1;
            objM87133R3 = new Function1(referAFriendFragment) { // from class: g62.b

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ ReferAFriendFragment f58249x;

                {
                    this.f58249x = referAFriendFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            return ReferAFriendFragment.m24367M(this.f58249x, (InterfaceC25119j) obj);
                        case 1:
                            return ReferAFriendFragment.m24368N(this.f58249x, (AbstractC23380a) obj);
                        default:
                            return ReferAFriendFragment.m24369O(this.f58249x, (AbstractC16981a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function2 = (Function1) objM87133R3;
        boolean zM87157i4 = c28655q.m87157i(referAFriendFragment);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i4 || objM87133R4 == c28676v0) {
            final int i16 = 2;
            objM87133R4 = new Function1(referAFriendFragment) { // from class: g62.b

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ ReferAFriendFragment f58249x;

                {
                    this.f58249x = referAFriendFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i16) {
                        case 0:
                            return ReferAFriendFragment.m24367M(this.f58249x, (InterfaceC25119j) obj);
                        case 1:
                            return ReferAFriendFragment.m24368N(this.f58249x, (AbstractC23380a) obj);
                        default:
                            return ReferAFriendFragment.m24369O(this.f58249x, (AbstractC16981a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC28945f.m87886c(interfaceC25116gM24366L, function1, function2, (Function1) objM87133R4, c28655q, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: L */
    private static final InterfaceC25116g m24366L(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC25116g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m24367M(ReferAFriendFragment referAFriendFragment, InterfaceC25119j viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        referAFriendFragment.m24374I().m100286o(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m24368N(ReferAFriendFragment referAFriendFragment, AbstractC23380a navigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        referAFriendFragment.m24362G().m67685a(navigationEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m24369O(ReferAFriendFragment referAFriendFragment, AbstractC16981a analyticsEvent) {
        AbstractC22676k.m65750j(analyticsEvent, "analyticsEvent");
        referAFriendFragment.m24373F().m47809a(analyticsEvent, referAFriendFragment.m24363H());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final String m24370P(ReferAFriendFragment referAFriendFragment) {
        String string = referAFriendFragment.requireArguments().getString("source");
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: F */
    public final C16982b m24373F() {
        return (C16982b) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: I */
    public final C32235a m24374I() {
        return (C32235a) this.viewModel.getValue();
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C13242h(this, 19), true, 21999060));
    }
}
