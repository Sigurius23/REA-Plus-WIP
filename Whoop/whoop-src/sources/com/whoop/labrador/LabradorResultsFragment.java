package com.whoop.labrador;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.labrador.LabradorResultsFragment;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p698au1.AbstractC2072q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import r12.C30856a;
import rs1.C31790b;
import ss1.C32948a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import yt1.C39769b;
import yt1.InterfaceC39768a;
import zt1.C41130e;
import zt1.InterfaceC41128c;
import zt1.InterfaceC41129d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010*¨\u0006.²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/labrador/LabradorResultsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/content/Context;", "context", "Ll83/a0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lzt1/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "G", "()Lzt1/e;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lss1/a;", "y", "E", "()Lss1/a;", "analytics", "Lyt1/b;", "z", "F", "()Lyt1/b;", "labradorResultsNavigator", "Ltr2/n;", "Ltr2/n;", "logger", "Lzt1/c;", "state", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LabradorResultsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h labradorResultsNavigator;

    /* JADX INFO: renamed from: com.whoop.labrador.LabradorResultsFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9002a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26954w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26955x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26956y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9002a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26954w = componentCallbacks;
            this.f26955x = interfaceC35951a;
            this.f26956y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26954w;
            InterfaceC35951a interfaceC35951a = this.f26955x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26956y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.LabradorResultsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9003b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26957w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26958x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26959y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9003b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26957w = componentCallbacks;
            this.f26958x = interfaceC35951a;
            this.f26959y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ss1.a] */
        @Override // c93.InterfaceC4339a
        public final C32948a invoke() {
            ComponentCallbacks componentCallbacks = this.f26957w;
            InterfaceC35951a interfaceC35951a = this.f26958x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26959y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32948a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.LabradorResultsFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9004c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26960w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9004c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26960w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26960w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.LabradorResultsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9005d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26961w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26962x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26963y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26964z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9005d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26961w = componentCallbacks;
            this.f26962x = interfaceC35951a;
            this.f26963y = interfaceC4339a;
            this.f26964z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, zt1.e] */
        @Override // c93.InterfaceC4339a
        public final C41130e invoke() {
            return AbstractC34132o.m107857B(this.f26961w, this.f26962x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C41130e.class), this.f26963y, this.f26964z);
        }
    }

    public LabradorResultsFragment() {
        C9004c c9004c = new C9004c(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C9005d(this, null, c9004c, null));
        C31790b c31790b = new C31790b(this, 0);
        EnumC23463i enumC23463i2 = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i2, new C9002a(this, null, c31790b));
        this.analytics = AbstractC30060g.m92087G(enumC23463i2, new C9003b(this, null, null));
        this.labradorResultsNavigator = AbstractC30060g.m92087G(enumC23463i, new C31790b(this, 1));
        this.logger = InterfaceC34116n.INSTANCE.m107848a("LabradorResultsFragment");
    }

    /* JADX INFO: renamed from: E */
    private final C32948a m22409E() {
        return (C32948a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final C39769b m22410F() {
        return (C39769b) this.labradorResultsNavigator.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final C41130e m22411G() {
        return (C41130e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C39769b m22412H(LabradorResultsFragment labradorResultsFragment) {
        return new C39769b(labradorResultsFragment.getNavigator(), labradorResultsFragment.m22409E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C34911a m22413I(LabradorResultsFragment labradorResultsFragment) {
        return AbstractC15751g.m44431K(labradorResultsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m22414J(final LabradorResultsFragment labradorResultsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(labradorResultsFragment.m22411G().getViewState(), InterfaceC41128c.b.f177293a, null, c28655q, 48, 2);
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            InterfaceC41128c interfaceC41128cM22415K = m22415K(interfaceC28601c1M87260n);
            boolean zM87157i = c28655q.m87157i(labradorResultsFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C31790b(labradorResultsFragment, 2);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(labradorResultsFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i14 = 0;
                objM87133R2 = new Function1(labradorResultsFragment) { // from class: rs1.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ LabradorResultsFragment f131610x;

                    {
                        this.f131610x = labradorResultsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return LabradorResultsFragment.m22417M(this.f131610x, (InterfaceC41129d) obj);
                            default:
                                return LabradorResultsFragment.m22418N(this.f131610x, (InterfaceC39768a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(labradorResultsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i15 = 1;
                objM87133R3 = new Function1(labradorResultsFragment) { // from class: rs1.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ LabradorResultsFragment f131610x;

                    {
                        this.f131610x = labradorResultsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return LabradorResultsFragment.m22417M(this.f131610x, (InterfaceC41129d) obj);
                            default:
                                return LabradorResultsFragment.m22418N(this.f131610x, (InterfaceC39768a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC2072q.m6520F(interfaceC41128cM22415K, interfaceC4339a, function1, (Function1) objM87133R3, c28655q, 0, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final InterfaceC41128c m22415K(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC41128c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m22416L(LabradorResultsFragment labradorResultsFragment) {
        AbstractC5583n.m16799z(labradorResultsFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m22417M(LabradorResultsFragment labradorResultsFragment, InterfaceC41129d it) {
        AbstractC22676k.m65750j(it, "it");
        labradorResultsFragment.m22411G().m133537l(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m22418N(LabradorResultsFragment labradorResultsFragment, InterfaceC39768a it) {
        AbstractC22676k.m65750j(it, "it");
        labradorResultsFragment.m22410F().m127317a(it);
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onAttach(Context context) {
        AbstractC22676k.m65750j(context, "context");
        super.onAttach(context);
        AbstractC28163g0.m85250f(this, this.logger);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C30856a(this, 10), true, 385934940));
    }
}
