package com.whoop.challengedetails.view;

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
import hn0.C17514a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ln0.C24521a;
import ln0.InterfaceC24522b;
import mn0.C25708b;
import mn0.C25709c;
import mn0.InterfaceC25707a;
import oe2.C27878c;
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
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qn0.AbstractC30511f;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "F", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "onCreate", "(Landroid/os/Bundle;)V", "Lmn0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Lmn0/b;", "viewModel", "Lhn0/a;", "x", "D", "()Lhn0/a;", "analyticsHelper", "Lmn0/c;", "viewState", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ChallengeDetailsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6124d(this, null, new C6123c(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C6122b(this, null, null));

    /* JADX INFO: renamed from: com.whoop.challengedetails.view.ChallengeDetailsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.challengedetails.view.ChallengeDetailsFragment$onCreateView$1$1$1", m100430f = "ChallengeDetailsFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6121a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24325w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f24327y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6121a(String str, InterfaceC30057d<? super C6121a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24327y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChallengeDetailsFragment.this.new C6121a(this.f24327y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6121a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f24325w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ChallengeDetailsFragment.this.m18404E().m75706n(new InterfaceC25707a.c(this.f24327y));
            ChallengeDetailsFragment.this.m18403D().m49760b(this.f24327y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.challengedetails.view.ChallengeDetailsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6122b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24328w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24329x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24330y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6122b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24328w = componentCallbacks;
            this.f24329x = interfaceC35951a;
            this.f24330y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hn0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C17514a invoke() {
            ComponentCallbacks componentCallbacks = this.f24328w;
            InterfaceC35951a interfaceC35951a = this.f24329x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24330y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17514a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.challengedetails.view.ChallengeDetailsFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6123c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24331w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6123c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24331w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24331w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.challengedetails.view.ChallengeDetailsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6124d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24332w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24333x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24334y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24335z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6124d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24332w = componentCallbacks;
            this.f24333x = interfaceC35951a;
            this.f24334y = interfaceC4339a;
            this.f24335z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mn0.b] */
        @Override // c93.InterfaceC4339a
        public final C25708b invoke() {
            return AbstractC34132o.m107857B(this.f24332w, this.f24333x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25708b.class), this.f24334y, this.f24335z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final C17514a m18403D() {
        return (C17514a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final C25708b m18404E() {
        return (C25708b) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final void m18405F() {
        getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m18406G(ChallengeDetailsFragment challengeDetailsFragment, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        Bundle arguments = challengeDetailsFragment.getArguments();
        if (arguments == null || (string = arguments.getString("name")) == null) {
            string = "";
        }
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(challengeDetailsFragment.m18404E().getViewState(), new C25709c(true, false, null, null, 14, null), null, c28655q, 0, 2);
        C24521a c24521a = new C24521a(AbstractC5583n.m16799z(challengeDetailsFragment));
        boolean zM87157i = c28655q.m87157i(challengeDetailsFragment) | c28655q.m87153g(string);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = challengeDetailsFragment.new C6121a(string, null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        C25709c c25709cM18407H = m18407H(interfaceC28601c1M87260n);
        boolean zM87157i2 = c28655q.m87157i(challengeDetailsFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C29124b(challengeDetailsFragment, 5);
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function1 = (Function1) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(c24521a);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C29124b(c24521a, 6);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC30511f.m93445f(c25709cM18407H, string, function1, (Function1) objM87133R3, c28655q, 0, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: H */
    private static final C25709c m18407H(InterfaceC28670t2 interfaceC28670t2) {
        return (C25709c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m18408I(ChallengeDetailsFragment challengeDetailsFragment, InterfaceC25707a it) {
        AbstractC22676k.m65750j(it, "it");
        challengeDetailsFragment.m18404E().m75706n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m18409J(C24521a c24521a, InterfaceC24522b navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c24521a.m71427a(navEvent);
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m18405F();
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 18), true, -1158935547));
    }
}
