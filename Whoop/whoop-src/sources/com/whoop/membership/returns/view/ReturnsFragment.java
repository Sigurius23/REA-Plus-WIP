package com.whoop.membership.returns.view;

import a80.C0539c;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import ay1.AbstractC2154b;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.membership.returns.view.ReturnsFragment;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.C28176k1;
import p003a1.C0103b;
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
import vf3.InterfaceC35951a;
import vx1.AbstractC36558a;
import vx1.C36559b;
import xx1.C38691a;
import xx1.InterfaceC38692b;
import yx1.C39844e;
import yx1.C39845f;
import yx1.InterfaceC39843d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/membership/returns/view/ReturnsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lyx1/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Lyx1/e;", "viewModel", "Lvx1/b;", "x", "D", "()Lvx1/b;", "analyticsHelper", "Lyx1/f;", "viewState", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ReturnsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9138d(this, null, new C9137c(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9136b(this, null, null));

    /* JADX INFO: renamed from: com.whoop.membership.returns.view.ReturnsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.membership.returns.view.ReturnsFragment$onCreateView$1$1$1", m100430f = "ReturnsFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9135a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27331w;

        public C9135a(InterfaceC30057d<? super C9135a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ReturnsFragment.this.new C9135a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9135a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27331w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ReturnsFragment.this.m22844E().m127918n(InterfaceC39843d.a.f172047a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.returns.view.ReturnsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9136b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27333w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27334x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27335y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9136b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27333w = componentCallbacks;
            this.f27334x = interfaceC35951a;
            this.f27335y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vx1.b] */
        @Override // c93.InterfaceC4339a
        public final C36559b invoke() {
            ComponentCallbacks componentCallbacks = this.f27333w;
            InterfaceC35951a interfaceC35951a = this.f27334x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27335y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36559b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.returns.view.ReturnsFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9137c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27336w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9137c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27336w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27336w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.returns.view.ReturnsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9138d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27337w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27338x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27339y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27340z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9138d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27337w = componentCallbacks;
            this.f27338x = interfaceC35951a;
            this.f27339y = interfaceC4339a;
            this.f27340z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, yx1.e] */
        @Override // c93.InterfaceC4339a
        public final C39844e invoke() {
            return AbstractC34132o.m107857B(this.f27337w, this.f27338x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39844e.class), this.f27339y, this.f27340z);
        }
    }

    /* JADX INFO: renamed from: D */
    private final C36559b m22843D() {
        return (C36559b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final C39844e m22844E() {
        return (C39844e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m22845F(final ReturnsFragment returnsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(returnsFragment.m22844E().getViewState(), new C39845f(true, false, null, 6, null), null, c28655q, 0, 2);
        C38691a c38691a = new C38691a(AbstractC5583n.m16799z(returnsFragment), (C28176k1) AbstractC29125c.m88492A(returnsFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28176k1.class), null));
        boolean zM87157i = c28655q.m87157i(returnsFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = returnsFragment.new C9135a(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        C39845f c39845fM22846G = m22846G(interfaceC28601c1M87260n);
        boolean zM87157i2 = c28655q.m87157i(returnsFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            final int i14 = 0;
            objM87133R2 = new Function1(returnsFragment) { // from class: ay1.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ ReturnsFragment f8560x;

                {
                    this.f8560x = returnsFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            return ReturnsFragment.m22847H(this.f8560x, (InterfaceC39843d) obj);
                        default:
                            return ReturnsFragment.m22849J(this.f8560x, (AbstractC36558a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function1 = (Function1) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(c38691a);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C0103b(c38691a, 11);
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function2 = (Function1) objM87133R3;
        boolean zM87157i4 = c28655q.m87157i(returnsFragment);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i4 || objM87133R4 == c28676v0) {
            final int i15 = 1;
            objM87133R4 = new Function1(returnsFragment) { // from class: ay1.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ ReturnsFragment f8560x;

                {
                    this.f8560x = returnsFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            return ReturnsFragment.m22847H(this.f8560x, (InterfaceC39843d) obj);
                        default:
                            return ReturnsFragment.m22849J(this.f8560x, (AbstractC36558a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC2154b.m6705d(c39845fM22846G, function1, function2, (Function1) objM87133R4, c28655q, 0, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: G */
    private static final C39845f m22846G(InterfaceC28670t2 interfaceC28670t2) {
        return (C39845f) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m22847H(ReturnsFragment returnsFragment, InterfaceC39843d it) {
        AbstractC22676k.m65750j(it, "it");
        returnsFragment.m22844E().m127918n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m22848I(C38691a c38691a, InterfaceC38692b navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c38691a.m124097b(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m22849J(ReturnsFragment returnsFragment, AbstractC36558a it) {
        AbstractC22676k.m65750j(it, "it");
        returnsFragment.m22843D().m117279c(it);
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C0539c(this, 5), true, 817586283));
    }
}
