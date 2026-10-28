package com.whoop.weeklyplan.challengelanding.view;

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
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.challengelanding.view.ChallengeLandingFragment;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
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
import ts2.AbstractC34145a;
import ts2.C34146b;
import tx0.C34238a;
import uf3.C34911a;
import us2.AbstractC35223d;
import us2.AbstractC35225f;
import us2.C35224e;
import vf3.InterfaceC35951a;
import vs2.AbstractC36479e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'¨\u0006+²\u0006\f\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Ljava/lang/String;", "source", "Lus2/e;", "x", "G", "()Lus2/e;", "viewModel", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lts2/b;", "z", "E", "()Lts2/b;", "navigationRouter", "Lus2/f;", "viewState", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ChallengeLandingFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10716c(this, null, new C10715b(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h navigationRouter;

    /* JADX INFO: renamed from: com.whoop.weeklyplan.challengelanding.view.ChallengeLandingFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10714a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32662w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32663x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32664y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10714a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32662w = componentCallbacks;
            this.f32663x = interfaceC35951a;
            this.f32664y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f32662w;
            InterfaceC35951a interfaceC35951a = this.f32663x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32664y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.challengelanding.view.ChallengeLandingFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10715b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32665w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10715b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f32665w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f32665w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.challengelanding.view.ChallengeLandingFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10716c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32666w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32667x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32668y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f32669z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10716c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f32666w = componentCallbacks;
            this.f32667x = interfaceC35951a;
            this.f32668y = interfaceC4339a;
            this.f32669z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, us2.e] */
        @Override // c93.InterfaceC4339a
        public final C35224e invoke() {
            return AbstractC34132o.m107857B(this.f32666w, this.f32667x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35224e.class), this.f32668y, this.f32669z);
        }
    }

    public ChallengeLandingFragment() {
        final int i13 = 0;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: vs2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeLandingFragment f155801x;

            {
                this.f155801x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ChallengeLandingFragment.m27856N(this.f155801x);
                    case 1:
                        return ChallengeLandingFragment.m27851I(this.f155801x);
                    default:
                        return ChallengeLandingFragment.m27850H(this.f155801x);
                }
            }
        });
        final int i14 = 1;
        this.navigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10714a(this, null, new InterfaceC4339a(this) { // from class: vs2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeLandingFragment f155801x;

            {
                this.f155801x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ChallengeLandingFragment.m27856N(this.f155801x);
                    case 1:
                        return ChallengeLandingFragment.m27851I(this.f155801x);
                    default:
                        return ChallengeLandingFragment.m27850H(this.f155801x);
                }
            }
        }));
        final int i15 = 2;
        this.navigationRouter = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: vs2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeLandingFragment f155801x;

            {
                this.f155801x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ChallengeLandingFragment.m27856N(this.f155801x);
                    case 1:
                        return ChallengeLandingFragment.m27851I(this.f155801x);
                    default:
                        return ChallengeLandingFragment.m27850H(this.f155801x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private final C34146b m27847E() {
        return (C34146b) this.navigationRouter.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final String m27848F() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final C35224e m27849G() {
        return (C35224e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C34146b m27850H(ChallengeLandingFragment challengeLandingFragment) {
        return new C34146b(AbstractC5583n.m16799z(challengeLandingFragment), challengeLandingFragment.getNavigator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C34911a m27851I(ChallengeLandingFragment challengeLandingFragment) {
        return AbstractC15751g.m44431K(challengeLandingFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m27852J(final ChallengeLandingFragment challengeLandingFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC35225f abstractC35225fM27853K = m27853K(AbstractC28683x.m87261o(challengeLandingFragment.m27849G().getViewState(), c28655q, 0));
            boolean zM87157i = c28655q.m87157i(challengeLandingFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new Function1(challengeLandingFragment) { // from class: vs2.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ChallengeLandingFragment f155803x;

                    {
                        this.f155803x = challengeLandingFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return ChallengeLandingFragment.m27854L(this.f155803x, (AbstractC35223d) obj);
                            default:
                                return ChallengeLandingFragment.m27855M(this.f155803x, (AbstractC34145a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(challengeLandingFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i15 = 1;
                objM87133R2 = new Function1(challengeLandingFragment) { // from class: vs2.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ChallengeLandingFragment f155803x;

                    {
                        this.f155803x = challengeLandingFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return ChallengeLandingFragment.m27854L(this.f155803x, (AbstractC35223d) obj);
                            default:
                                return ChallengeLandingFragment.m27855M(this.f155803x, (AbstractC34145a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC36479e.m116841C(abstractC35225fM27853K, function1, (Function1) objM87133R2, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final AbstractC35225f m27853K(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC35225f) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m27854L(ChallengeLandingFragment challengeLandingFragment, AbstractC35223d it) {
        AbstractC22676k.m65750j(it, "it");
        challengeLandingFragment.m27849G().m111599l(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m27855M(ChallengeLandingFragment challengeLandingFragment, AbstractC34145a it) {
        AbstractC22676k.m65750j(it, "it");
        challengeLandingFragment.m27847E().m107919c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final String m27856N(ChallengeLandingFragment challengeLandingFragment) {
        Bundle arguments = challengeLandingFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("source");
        }
        return null;
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
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m27849G().m111599l(new AbstractC35223d.a(m27848F()));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 26), true, -674686664));
    }
}
