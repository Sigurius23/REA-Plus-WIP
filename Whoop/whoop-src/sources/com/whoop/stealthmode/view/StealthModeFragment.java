package com.whoop.stealthmode.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch2.AbstractC4668a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.stealthmode.view.StealthModeFragment;
import e93.AbstractC12889b;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import eh2.EnumC13196a;
import h02.C16574h;
import h02.C16576i;
import hg3.AbstractC17269i;
import hh2.C17292c;
import hh2.C17296g;
import ih2.AbstractC18527b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import jf3.C21647a;
import jh2.C21699a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.C22931l;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
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
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/stealthmode/view/StealthModeFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Leb/u0;", "navController", "Lhh2/g;", "viewState", "Ll83/a0;", "K", "(Leb/u0;Lhh2/g;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "Ljh2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "X", "()Ljh2/a;", "viewModel", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StealthModeFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10253c(this, null, new C10252b(this), null));

    /* JADX INFO: renamed from: com.whoop.stealthmode.view.StealthModeFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.stealthmode.view.StealthModeFragment$onCreateView$1$1$1", m100430f = "StealthModeFragment.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10251a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30979w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C12991u0 f30981y;

        /* JADX INFO: renamed from: com.whoop.stealthmode.view.StealthModeFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12991u0 f30982w;

            public a(C12991u0 c12991u0) {
                this.f30982w = c12991u0;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC10254a abstractC10254a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (AbstractC22676k.m65745e(abstractC10254a, AbstractC10254a.a.f30988a)) {
                    AbstractC12939a0.m36374y(this.f30982w, "EXIT", null, 6);
                } else {
                    if (!AbstractC22676k.m65745e(abstractC10254a, AbstractC10254a.b.f30989a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC12939a0.m36374y(this.f30982w, "LEARN_MORE", null, 6);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10251a(C12991u0 c12991u0, InterfaceC30057d<? super C10251a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30981y = c12991u0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StealthModeFragment.this.new C10251a(this.f30981y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10251a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30979w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM61124l = StealthModeFragment.this.m26110X().getNavigationEvent();
                a aVar = new a(this.f30981y);
                this.f30979w = 1;
                if (interfaceC13058lM61124l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.stealthmode.view.StealthModeFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10252b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30983w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10252b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30983w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30983w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stealthmode.view.StealthModeFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10253c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30984w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30985x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30986y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30987z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10253c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30984w = componentCallbacks;
            this.f30985x = interfaceC35951a;
            this.f30986y = interfaceC4339a;
            this.f30987z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, jh2.a] */
        @Override // c93.InterfaceC4339a
        public final C21699a invoke() {
            return AbstractC34132o.m107857B(this.f30984w, this.f30985x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21699a.class), this.f30986y, this.f30987z);
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m26097K(C12991u0 c12991u0, C17296g c17296g, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1953616701);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c12991u0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c17296g) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(this) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean zM87157i = c28655q.m87157i(c17296g) | c28655q.m87157i(this);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C16574h(6, c17296g, this);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17269i.m48888e(c12991u0, "HOME", null, (Function1) objM87133R, c28655q, i14 & 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(this, c12991u0, c17296g, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m26098L(C17296g c17296g, StealthModeFragment stealthModeFragment, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "HOME", null, new C37816b(new C22931l(29, c17296g, stealthModeFragment), true, -1785441704), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m26099M(C17296g c17296g, final StealthModeFragment stealthModeFragment, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(stealthModeFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            final int i14 = 1;
            objM87133R = new InterfaceC4339a(stealthModeFragment) { // from class: hh2.d

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ StealthModeFragment f66463x;

                {
                    this.f66463x = stealthModeFragment;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            return StealthModeFragment.m26106T(this.f66463x);
                        case 1:
                            return StealthModeFragment.m26100N(this.f66463x);
                        case 2:
                            return StealthModeFragment.m26101O(this.f66463x);
                        case 3:
                            return StealthModeFragment.m26104R(this.f66463x);
                        default:
                            return StealthModeFragment.m26105S(this.f66463x);
                    }
                }
            };
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(stealthModeFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            final int i15 = 2;
            objM87133R2 = new InterfaceC4339a(stealthModeFragment) { // from class: hh2.d

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ StealthModeFragment f66463x;

                {
                    this.f66463x = stealthModeFragment;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            return StealthModeFragment.m26106T(this.f66463x);
                        case 1:
                            return StealthModeFragment.m26100N(this.f66463x);
                        case 2:
                            return StealthModeFragment.m26101O(this.f66463x);
                        case 3:
                            return StealthModeFragment.m26104R(this.f66463x);
                        default:
                            return StealthModeFragment.m26105S(this.f66463x);
                    }
                }
            };
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(stealthModeFragment);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            final int i16 = 0;
            objM87133R3 = new Function1(stealthModeFragment) { // from class: hh2.e

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ StealthModeFragment f66465x;

                {
                    this.f66465x = stealthModeFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i17 = i16;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    switch (i17) {
                        case 0:
                            return StealthModeFragment.m26102P(this.f66465x, zBooleanValue);
                        default:
                            return StealthModeFragment.m26103Q(this.f66465x, zBooleanValue);
                    }
                }
            };
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function1 = (Function1) objM87133R3;
        boolean zM87157i4 = c28655q.m87157i(stealthModeFragment);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i4 || objM87133R4 == c28676v0) {
            final int i17 = 1;
            objM87133R4 = new Function1(stealthModeFragment) { // from class: hh2.e

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ StealthModeFragment f66465x;

                {
                    this.f66465x = stealthModeFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i18 = i17;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    switch (i18) {
                        case 0:
                            return StealthModeFragment.m26102P(this.f66465x, zBooleanValue);
                        default:
                            return StealthModeFragment.m26103Q(this.f66465x, zBooleanValue);
                    }
                }
            };
            c28655q.m87172p0(objM87133R4);
        }
        Function1 function2 = (Function1) objM87133R4;
        boolean zM87157i5 = c28655q.m87157i(stealthModeFragment);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87157i5 || objM87133R5 == c28676v0) {
            final int i18 = 3;
            objM87133R5 = new InterfaceC4339a(stealthModeFragment) { // from class: hh2.d

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ StealthModeFragment f66463x;

                {
                    this.f66463x = stealthModeFragment;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i18) {
                        case 0:
                            return StealthModeFragment.m26106T(this.f66463x);
                        case 1:
                            return StealthModeFragment.m26100N(this.f66463x);
                        case 2:
                            return StealthModeFragment.m26101O(this.f66463x);
                        case 3:
                            return StealthModeFragment.m26104R(this.f66463x);
                        default:
                            return StealthModeFragment.m26105S(this.f66463x);
                    }
                }
            };
            c28655q.m87172p0(objM87133R5);
        }
        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
        boolean zM87157i6 = c28655q.m87157i(stealthModeFragment);
        Object objM87133R6 = c28655q.m87133R();
        if (zM87157i6 || objM87133R6 == c28676v0) {
            final int i19 = 4;
            objM87133R6 = new InterfaceC4339a(stealthModeFragment) { // from class: hh2.d

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ StealthModeFragment f66463x;

                {
                    this.f66463x = stealthModeFragment;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i19) {
                        case 0:
                            return StealthModeFragment.m26106T(this.f66463x);
                        case 1:
                            return StealthModeFragment.m26100N(this.f66463x);
                        case 2:
                            return StealthModeFragment.m26101O(this.f66463x);
                        case 3:
                            return StealthModeFragment.m26104R(this.f66463x);
                        default:
                            return StealthModeFragment.m26105S(this.f66463x);
                    }
                }
            };
            c28655q.m87172p0(objM87133R6);
        }
        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
        boolean zM87157i7 = c28655q.m87157i(stealthModeFragment);
        Object objM87133R7 = c28655q.m87133R();
        if (zM87157i7 || objM87133R7 == c28676v0) {
            final int i24 = 0;
            objM87133R7 = new InterfaceC4339a(stealthModeFragment) { // from class: hh2.d

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ StealthModeFragment f66463x;

                {
                    this.f66463x = stealthModeFragment;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i24) {
                        case 0:
                            return StealthModeFragment.m26106T(this.f66463x);
                        case 1:
                            return StealthModeFragment.m26100N(this.f66463x);
                        case 2:
                            return StealthModeFragment.m26101O(this.f66463x);
                        case 3:
                            return StealthModeFragment.m26104R(this.f66463x);
                        default:
                            return StealthModeFragment.m26105S(this.f66463x);
                    }
                }
            };
            c28655q.m87172p0(objM87133R7);
        }
        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R7;
        boolean zM87157i8 = c28655q.m87157i(stealthModeFragment);
        Object objM87133R8 = c28655q.m87133R();
        if (zM87157i8 || objM87133R8 == c28676v0) {
            objM87133R8 = new C17292c(stealthModeFragment, 1);
            c28655q.m87172p0(objM87133R8);
        }
        AbstractC18527b.m53705F(c17296g, interfaceC4339a, interfaceC4339a2, function1, function2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, (InterfaceC4351m) objM87133R8, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m26100N(StealthModeFragment stealthModeFragment) {
        AbstractC5583n.m16799z(stealthModeFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m26101O(StealthModeFragment stealthModeFragment) {
        Toast.makeText(stealthModeFragment.getContext(), "Feature in development", 1).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m26102P(StealthModeFragment stealthModeFragment, boolean z4) {
        stealthModeFragment.m26110X().m61125q(new AbstractC4668a.d(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m26103Q(StealthModeFragment stealthModeFragment, boolean z4) {
        stealthModeFragment.m26110X().m61125q(new AbstractC4668a.b(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m26104R(StealthModeFragment stealthModeFragment) {
        Toast.makeText(stealthModeFragment.getContext(), "Feature in development", 1).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m26105S(StealthModeFragment stealthModeFragment) {
        stealthModeFragment.m26110X().m61125q(AbstractC4668a.a.f19112a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m26106T(StealthModeFragment stealthModeFragment) {
        stealthModeFragment.m26110X().m61125q(new AbstractC4668a.d(true));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m26107U(StealthModeFragment stealthModeFragment, EnumC13196a metricType, boolean z4) {
        AbstractC22676k.m65750j(metricType, "metricType");
        stealthModeFragment.m26110X().m61125q(new AbstractC4668a.c(metricType, z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m26108V(StealthModeFragment stealthModeFragment, C12991u0 c12991u0, C17296g c17296g, int i13, Composer composer, int i14) {
        stealthModeFragment.m26097K(c12991u0, c17296g, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public final C21699a m26110X() {
        return (C21699a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m26111Y(StealthModeFragment stealthModeFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("StealthModeNavHost", null, c28655q, 6, 2);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(stealthModeFragment.m26110X().getViewState(), new C17296g(false, true, null, null, 13, null), null, c28655q, 0, 2);
            boolean zM87157i = c28655q.m87157i(stealthModeFragment) | c28655q.m87157i(c12991u0M58963a);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = stealthModeFragment.new C10251a(c12991u0M58963a, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, "stealthModeNavigation");
            stealthModeFragment.m26097K(c12991u0M58963a, m26112Z(interfaceC28601c1M87260n), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    private static final C17296g m26112Z(InterfaceC28670t2 interfaceC28670t2) {
        return (C17296g) interfaceC28670t2.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C17292c(this, 0), true, -1099321208));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }
}
