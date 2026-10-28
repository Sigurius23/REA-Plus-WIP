package com.whoop.advancedlabs.scheduleprimer.view;

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
import com.whoop.advancedlabs.scheduleprimer.view.SchedulePrimerFragment;
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
import w20.C36727q;
import wd0.AbstractC37162a;
import wd0.C37163b;
import x30.C37894h1;
import xd0.AbstractC38199c;
import xd0.AbstractC38201e;
import xd0.C38200d;
import ya0.C39355a;
import zd0.AbstractC40545b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#¨\u0006'²\u0006\f\u0010&\u001a\u00020%8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/scheduleprimer/view/SchedulePrimerFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Ljava/lang/String;", "source", "Lxd0/d;", "x", "G", "()Lxd0/d;", "viewModel", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lya0/a;", "z", "E", "()Lya0/a;", "analyticsHelper", "Lxd0/e;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SchedulePrimerFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5861e(this, null, new C5860d(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.scheduleprimer.view.SchedulePrimerFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.scheduleprimer.view.SchedulePrimerFragment$onCreateView$1$1$1", m100430f = "SchedulePrimerFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5857a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23071w;

        public C5857a(InterfaceC30057d<? super C5857a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SchedulePrimerFragment.this.new C5857a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5857a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23071w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SchedulePrimerFragment.this.m17523G().m122345n(AbstractC38199c.a.f163569a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.scheduleprimer.view.SchedulePrimerFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5858b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23073w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23074x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23075y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5858b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23073w = componentCallbacks;
            this.f23074x = interfaceC35951a;
            this.f23075y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23073w;
            InterfaceC35951a interfaceC35951a = this.f23074x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23075y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.scheduleprimer.view.SchedulePrimerFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5859c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23076w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23077x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23078y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5859c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23076w = componentCallbacks;
            this.f23077x = interfaceC35951a;
            this.f23078y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f23076w;
            InterfaceC35951a interfaceC35951a = this.f23077x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23078y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.scheduleprimer.view.SchedulePrimerFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5860d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23079w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5860d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f23079w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f23079w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.scheduleprimer.view.SchedulePrimerFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5861e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23080w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23081x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23082y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f23083z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5861e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f23080w = componentCallbacks;
            this.f23081x = interfaceC35951a;
            this.f23082y = interfaceC4339a;
            this.f23083z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, xd0.d] */
        @Override // c93.InterfaceC4339a
        public final C38200d invoke() {
            return AbstractC34132o.m107857B(this.f23080w, this.f23081x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38200d.class), this.f23082y, this.f23083z);
        }
    }

    public SchedulePrimerFragment() {
        final int i13 = 0;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: zd0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SchedulePrimerFragment f174448x;

            {
                this.f174448x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return SchedulePrimerFragment.m17529M(this.f174448x);
                    default:
                        return SchedulePrimerFragment.m17524H(this.f174448x);
                }
            }
        });
        final int i14 = 1;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: zd0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SchedulePrimerFragment f174448x;

            {
                this.f174448x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return SchedulePrimerFragment.m17529M(this.f174448x);
                    default:
                        return SchedulePrimerFragment.m17524H(this.f174448x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5858b(this, null, interfaceC4339a));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5859c(this, null, null));
    }

    /* JADX INFO: renamed from: E */
    private final C39355a m17521E() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final String m17522F() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final C38200d m17523G() {
        return (C38200d) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C34911a m17524H(SchedulePrimerFragment schedulePrimerFragment) {
        return AbstractC15751g.m44431K(schedulePrimerFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m17525I(SchedulePrimerFragment schedulePrimerFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C37163b c37163b = new C37163b(schedulePrimerFragment.getNavigator(), AbstractC5583n.m16799z(schedulePrimerFragment));
                c28655q.m87172p0(c37163b);
                objM87133R = c37163b;
            }
            C37163b c37163b2 = (C37163b) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(schedulePrimerFragment.m17523G().getViewState(), AbstractC38201e.b.f163592b, null, c28655q, 48, 2);
            C38200d c38200dM17523G = schedulePrimerFragment.m17523G();
            boolean zM87157i = c28655q.m87157i(schedulePrimerFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = schedulePrimerFragment.new C5857a(null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c38200dM17523G);
            AbstractC38201e abstractC38201eM17526J = m17526J(interfaceC28601c1M87260n);
            String strM17522F = schedulePrimerFragment.m17522F();
            boolean zM87157i2 = c28655q.m87157i(schedulePrimerFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C37894h1(schedulePrimerFragment, 15);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(c37163b2);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C37894h1(c37163b2, 16);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC40545b.m131399x(abstractC38201eM17526J, strM17522F, function1, (Function1) objM87133R4, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final AbstractC38201e m17526J(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC38201e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m17527K(SchedulePrimerFragment schedulePrimerFragment, InterfaceC22381a.c analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        schedulePrimerFragment.m17521E().m125496e(analyticEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m17528L(C37163b c37163b, AbstractC37162a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c37163b.m119087a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final String m17529M(SchedulePrimerFragment schedulePrimerFragment) {
        return schedulePrimerFragment.requireArguments().getString("source");
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 26), true, -1462615472));
    }
}
