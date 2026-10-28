package com.whoop.advancedlabs.rafReceiver.view;

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
import com.whoop.advancedlabs.rafReceiver.view.RafReceiverFragment;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import od0.C27835b;
import od0.InterfaceC27834a;
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
import qd0.C30293b;
import qd0.InterfaceC30292a;
import r83.EnumC31071a;
import rd0.C31240b;
import rd0.C31241c;
import rd0.InterfaceC31239a;
import rq0.C31703x;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc0.C32355c;
import tx0.C34238a;
import ud0.AbstractC34790c;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lrd0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Lrd0/b;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lod0/b;", "y", "E", "()Lod0/b;", "analytics", "Lrd0/c;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RafReceiverFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5856e(this, null, new C5855d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.rafReceiver.view.RafReceiverFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.rafReceiver.view.RafReceiverFragment$onCreateView$1$1$1", m100430f = "RafReceiverFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5852a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23053w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f23055y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5852a(String str, InterfaceC30057d<? super C5852a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23055y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RafReceiverFragment.this.new C5852a(this.f23055y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5852a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23053w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            RafReceiverFragment.this.m17508F().m96199n(new InterfaceC31239a.b(this.f23055y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.rafReceiver.view.RafReceiverFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5853b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23056w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23057x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23058y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5853b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23056w = componentCallbacks;
            this.f23057x = interfaceC35951a;
            this.f23058y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23056w;
            InterfaceC35951a interfaceC35951a = this.f23057x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23058y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.rafReceiver.view.RafReceiverFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5854c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23059w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23060x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23061y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5854c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23059w = componentCallbacks;
            this.f23060x = interfaceC35951a;
            this.f23061y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od0.b] */
        @Override // c93.InterfaceC4339a
        public final C27835b invoke() {
            ComponentCallbacks componentCallbacks = this.f23059w;
            InterfaceC35951a interfaceC35951a = this.f23060x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23061y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27835b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.rafReceiver.view.RafReceiverFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5855d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23062w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5855d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f23062w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f23062w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.rafReceiver.view.RafReceiverFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5856e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23063w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23064x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23065y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f23066z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5856e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f23063w = componentCallbacks;
            this.f23064x = interfaceC35951a;
            this.f23065y = interfaceC4339a;
            this.f23066z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rd0.b] */
        @Override // c93.InterfaceC4339a
        public final C31240b invoke() {
            return AbstractC34132o.m107857B(this.f23063w, this.f23064x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31240b.class), this.f23065y, this.f23066z);
        }
    }

    public RafReceiverFragment() {
        C32355c c32355c = new C32355c(this, 18);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5853b(this, null, c32355c));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C5854c(this, null, null));
    }

    /* JADX INFO: renamed from: E */
    private final C27835b m17507E() {
        return (C27835b) this.analytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final C31240b m17508F() {
        return (C31240b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C34911a m17509G(RafReceiverFragment rafReceiverFragment) {
        return AbstractC15751g.m44431K(rafReceiverFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m17510H(final RafReceiverFragment rafReceiverFragment, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C30293b c30293b = new C30293b(AbstractC5583n.m16799z(rafReceiverFragment), rafReceiverFragment.getNavigator());
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(rafReceiverFragment.m17508F().getViewState(), new C31241c(true, false, null, 6, null), null, c28655q, 0, 2);
            Bundle arguments = rafReceiverFragment.getArguments();
            if (arguments == null || (string = arguments.getString("code")) == null) {
                string = "";
            }
            String str = string;
            C31240b c31240bM17508F = rafReceiverFragment.m17508F();
            boolean zM87157i = c28655q.m87157i(rafReceiverFragment) | c28655q.m87153g(str);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = rafReceiverFragment.new C5852a(str, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c31240bM17508F);
            C31241c c31241cM17511I = m17511I(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(c30293b);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C31703x(c30293b, 28);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(rafReceiverFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i14 = 0;
                objM87133R3 = new Function1(rafReceiverFragment) { // from class: ud0.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ RafReceiverFragment f146483x;

                    {
                        this.f146483x = rafReceiverFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return RafReceiverFragment.m17513K(this.f146483x, (InterfaceC31239a) obj);
                            default:
                                return RafReceiverFragment.m17514L(this.f146483x, (InterfaceC27834a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(rafReceiverFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i15 = 1;
                objM87133R4 = new Function1(rafReceiverFragment) { // from class: ud0.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ RafReceiverFragment f146483x;

                    {
                        this.f146483x = rafReceiverFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return RafReceiverFragment.m17513K(this.f146483x, (InterfaceC31239a) obj);
                            default:
                                return RafReceiverFragment.m17514L(this.f146483x, (InterfaceC27834a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC34790c.m109788j(c31241cM17511I, function1, function2, (Function1) objM87133R4, str, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final C31241c m17511I(InterfaceC28670t2 interfaceC28670t2) {
        return (C31241c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m17512J(C30293b c30293b, InterfaceC30292a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c30293b.m92546a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m17513K(RafReceiverFragment rafReceiverFragment, InterfaceC31239a event) {
        AbstractC22676k.m65750j(event, "event");
        rafReceiverFragment.m17508F().m96199n(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m17514L(RafReceiverFragment rafReceiverFragment, InterfaceC27834a analyticsEvent) {
        AbstractC22676k.m65750j(analyticsEvent, "analyticsEvent");
        rafReceiverFragment.m17507E().m83906a(analyticsEvent);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 7), true, 1535343158));
    }
}
