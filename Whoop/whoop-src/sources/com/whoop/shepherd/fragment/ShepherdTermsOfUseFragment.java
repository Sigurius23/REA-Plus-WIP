package com.whoop.shepherd.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.shepherd.fragment.ShepherdTermsOfUseFragment;
import fi0.InterfaceC14515a;
import ge2.InterfaceC15739d;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no0.C26954j0;
import o02.InterfaceC27353d;
import oe2.C27878c;
import p114eb.AbstractC12939a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p709he2.Function1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pe2.AbstractC29117a;
import pe2.C29118b;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lcom/whoop/shepherd/fragment/ShepherdTermsOfUseFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Ljava/lang/String;", "entryPoint", "Lfi0/a;", "x", "D", "()Lfi0/a;", "analytics", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lo02/d;", "z", "getNavigatorReducer", "()Lo02/d;", "navigatorReducer", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ShepherdTermsOfUseFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h entryPoint;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h navigatorReducer;

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdTermsOfUseFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10198a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30823w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30824x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30825y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10198a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30823w = componentCallbacks;
            this.f30824x = interfaceC35951a;
            this.f30825y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            ComponentCallbacks componentCallbacks = this.f30823w;
            InterfaceC35951a interfaceC35951a = this.f30824x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30825y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdTermsOfUseFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10199b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30826w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30827x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30828y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10199b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30826w = componentCallbacks;
            this.f30827x = interfaceC35951a;
            this.f30828y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f30826w;
            InterfaceC35951a interfaceC35951a = this.f30827x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30828y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdTermsOfUseFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10200c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30829w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30830x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30831y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10200c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30829w = componentCallbacks;
            this.f30830x = interfaceC35951a;
            this.f30831y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f30829w;
            InterfaceC35951a interfaceC35951a = this.f30830x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30831y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    public ShepherdTermsOfUseFragment() {
        final int i13 = 0;
        this.entryPoint = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: oe2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ShepherdTermsOfUseFragment f112424x;

            {
                this.f112424x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ShepherdTermsOfUseFragment.m25894C(this.f112424x);
                    default:
                        return ShepherdTermsOfUseFragment.m25897F(this.f112424x);
                }
            }
        });
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C10198a(this, null, null));
        final int i14 = 1;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10199b(this, null, new InterfaceC4339a(this) { // from class: oe2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ShepherdTermsOfUseFragment f112424x;

            {
                this.f112424x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ShepherdTermsOfUseFragment.m25894C(this.f112424x);
                    default:
                        return ShepherdTermsOfUseFragment.m25897F(this.f112424x);
                }
            }
        }));
        this.navigatorReducer = AbstractC30060g.m92087G(enumC23463i, new C10200c(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final String m25894C(ShepherdTermsOfUseFragment shepherdTermsOfUseFragment) {
        String string;
        Bundle arguments = shepherdTermsOfUseFragment.getArguments();
        return (arguments == null || (string = arguments.getString("entryPoint")) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: D */
    private final InterfaceC14515a m25895D() {
        return (InterfaceC14515a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final String m25896E() {
        return (String) this.entryPoint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C34911a m25897F(ShepherdTermsOfUseFragment shepherdTermsOfUseFragment) {
        return AbstractC15751g.m44431K(shepherdTermsOfUseFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m25898G(ShepherdTermsOfUseFragment shepherdTermsOfUseFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC5583n.m16799z(shepherdTermsOfUseFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C29118b(abstractC12939a0, (InterfaceC14515a) AbstractC29125c.m88492A(shepherdTermsOfUseFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null), shepherdTermsOfUseFragment.getNavigator());
                c28655q.m87172p0(objM87133R2);
            }
            C29118b c29118b = (C29118b) objM87133R2;
            boolean zM87157i = c28655q.m87157i(abstractC12939a0) | c28655q.m87157i(shepherdTermsOfUseFragment) | c28655q.m87157i(c29118b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C26954j0(abstractC12939a0, shepherdTermsOfUseFragment, c29118b, 7);
                c28655q.m87172p0(objM87133R3);
            }
            Function1.m48689C((p715kotlin.jvm.functions.Function1) objM87133R3, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m25899H(AbstractC12939a0 abstractC12939a0, ShepherdTermsOfUseFragment shepherdTermsOfUseFragment, C29118b c29118b, InterfaceC15739d.c navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (navEvent.equals(InterfaceC15739d.a.f59340a)) {
            abstractC12939a0.m36410z();
        } else {
            if (!navEvent.equals(InterfaceC15739d.b.f59341a)) {
                throw new NoWhenBranchMatchedException();
            }
            shepherdTermsOfUseFragment.m25895D().mo41424f("ANF", "Open", "Afib onboarding", "ANF");
            c29118b.m88488a(new AbstractC29117a.f("ARRHYTHMIA_EDUCATION", shepherdTermsOfUseFragment.m25896E()));
        }
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 4), true, 1116802936));
    }
}
