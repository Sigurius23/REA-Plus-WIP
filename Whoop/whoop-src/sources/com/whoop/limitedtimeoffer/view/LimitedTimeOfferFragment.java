package com.whoop.limitedtimeoffer.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import bv1.C3671a;
import bv1.C3673c;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.limitedtimeoffer.view.LimitedTimeOfferFragment;
import ej1.C13242h;
import ev1.AbstractC13689h;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;
import zu1.C41153f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\"R\u001d\u0010%\u001a\u0004\u0018\u00010\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b$\u0010\"¨\u0006&"}, m65681d2 = {"Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lbv1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Lbv1/c;", "navRouter", "Lbv1/a;", "x", "C", "()Lbv1/a;", "actionRouter", "Lzu1/f;", "y", "D", "()Lzu1/f;", "ltoDismissHandler", "", "z", "G", "()Ljava/lang/String;", "source", "F", "offerId", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LimitedTimeOfferFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h offerId;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h ltoDismissHandler;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: com.whoop.limitedtimeoffer.view.LimitedTimeOfferFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9051a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27111w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27112x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27113y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9051a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27111w = componentCallbacks;
            this.f27112x = interfaceC35951a;
            this.f27113y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bv1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C3673c invoke() {
            ComponentCallbacks componentCallbacks = this.f27111w;
            InterfaceC35951a interfaceC35951a = this.f27112x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27113y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3673c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.limitedtimeoffer.view.LimitedTimeOfferFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9052b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27114w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27115x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27116y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9052b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27114w = componentCallbacks;
            this.f27115x = interfaceC35951a;
            this.f27116y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bv1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C3671a invoke() {
            ComponentCallbacks componentCallbacks = this.f27114w;
            InterfaceC35951a interfaceC35951a = this.f27115x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27116y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3671a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.limitedtimeoffer.view.LimitedTimeOfferFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9053c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27117w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27118x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27119y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9053c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27117w = componentCallbacks;
            this.f27118x = interfaceC35951a;
            this.f27119y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zu1.f] */
        @Override // c93.InterfaceC4339a
        public final C41153f invoke() {
            ComponentCallbacks componentCallbacks = this.f27117w;
            InterfaceC35951a interfaceC35951a = this.f27118x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27119y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C41153f.class), interfaceC35951a);
        }
    }

    public LimitedTimeOfferFragment() {
        final int i13 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: ev1.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LimitedTimeOfferFragment f48498x;

            {
                this.f48498x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return LimitedTimeOfferFragment.m22557H(this.f48498x);
                    case 1:
                        return LimitedTimeOfferFragment.m22560K(this.f48498x);
                    default:
                        return LimitedTimeOfferFragment.m22558I(this.f48498x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C9051a(this, null, interfaceC4339a));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C9052b(this, null, null));
        this.ltoDismissHandler = AbstractC30060g.m92087G(enumC23463i, new C9053c(this, null, null));
        final int i14 = 1;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ev1.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LimitedTimeOfferFragment f48498x;

            {
                this.f48498x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return LimitedTimeOfferFragment.m22557H(this.f48498x);
                    case 1:
                        return LimitedTimeOfferFragment.m22560K(this.f48498x);
                    default:
                        return LimitedTimeOfferFragment.m22558I(this.f48498x);
                }
            }
        });
        final int i15 = 2;
        this.offerId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ev1.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LimitedTimeOfferFragment f48498x;

            {
                this.f48498x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return LimitedTimeOfferFragment.m22557H(this.f48498x);
                    case 1:
                        return LimitedTimeOfferFragment.m22560K(this.f48498x);
                    default:
                        return LimitedTimeOfferFragment.m22558I(this.f48498x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: C */
    private final C3671a m22554C() {
        return (C3671a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final C41153f m22555D() {
        return (C41153f) this.ltoDismissHandler.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C3673c m22556E() {
        return (C3673c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C34911a m22557H(LimitedTimeOfferFragment limitedTimeOfferFragment) {
        return AbstractC15751g.m44431K(limitedTimeOfferFragment.requireActivity(), AbstractC5583n.m16799z(limitedTimeOfferFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final String m22558I(LimitedTimeOfferFragment limitedTimeOfferFragment) {
        String string;
        Bundle arguments = limitedTimeOfferFragment.getArguments();
        String strM85315e = (arguments == null || (string = arguments.getString("offerId")) == null) ? null : AbstractC28188o1.m85315e(string);
        if (strM85315e == null || AbstractC39414r.m125890i0(strM85315e)) {
            return null;
        }
        return strM85315e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m22559J(LimitedTimeOfferFragment limitedTimeOfferFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C3673c c3673cM22556E = limitedTimeOfferFragment.m22556E();
            C3671a c3671aM22554C = limitedTimeOfferFragment.m22554C();
            C41153f c41153fM22555D = limitedTimeOfferFragment.m22555D();
            String strM22563F = limitedTimeOfferFragment.m22563F();
            String str = strM22563F == null ? "" : strM22563F;
            String strM22564G = limitedTimeOfferFragment.m22564G();
            AbstractC13689h.m38650e(c3673cM22556E, c3671aM22554C, c41153fM22555D, str, strM22564G == null ? "" : strM22564G, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final String m22560K(LimitedTimeOfferFragment limitedTimeOfferFragment) {
        String string;
        Bundle arguments = limitedTimeOfferFragment.getArguments();
        String strM85315e = (arguments == null || (string = arguments.getString("source")) == null) ? null : AbstractC28188o1.m85315e(string);
        if (strM85315e == null || AbstractC39414r.m125890i0(strM85315e)) {
            return null;
        }
        return strM85315e;
    }

    /* JADX INFO: renamed from: F */
    public final String m22563F() {
        return (String) this.offerId.getValue();
    }

    /* JADX INFO: renamed from: G */
    public final String m22564G() {
        return (String) this.source.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C13242h(this, 4), true, 860692207));
    }
}
