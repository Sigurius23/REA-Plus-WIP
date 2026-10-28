package com.whoop.hormonalinsights.symptompatterns.view;

import a80.C0539c;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import aq1.AbstractC1912f;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.hormonalinsights.symptompatterns.view.SymptomPatternsFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import hj0.AbstractC17357p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
import uf3.C34911a;
import vf3.InterfaceC35951a;
import xp1.AbstractC38530a;
import xp1.C38531b;
import yn1.AbstractC39672a;
import yn1.C39673b;
import yp1.AbstractC39703b;
import yp1.C39702a;
import zp1.AbstractC40940a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001f¨\u0006#²\u0006\f\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lyp1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "G", "()Lyp1/a;", "viewModel", "Lxp1/b;", "x", "F", "()Lxp1/b;", "router", "Lyn1/b;", "y", "E", "()Lyn1/b;", "analyticsHelper", "Lyp1/b;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SymptomPatternsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h router;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.symptompatterns.view.SymptomPatternsFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8948a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26784w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26785x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26786y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8948a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26784w = componentCallbacks;
            this.f26785x = interfaceC35951a;
            this.f26786y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xp1.b] */
        @Override // c93.InterfaceC4339a
        public final C38531b invoke() {
            ComponentCallbacks componentCallbacks = this.f26784w;
            InterfaceC35951a interfaceC35951a = this.f26785x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26786y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38531b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.symptompatterns.view.SymptomPatternsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8949b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26787w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26788x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26789y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8949b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26787w = componentCallbacks;
            this.f26788x = interfaceC35951a;
            this.f26789y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yn1.b] */
        @Override // c93.InterfaceC4339a
        public final C39673b invoke() {
            ComponentCallbacks componentCallbacks = this.f26787w;
            InterfaceC35951a interfaceC35951a = this.f26788x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26789y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39673b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.symptompatterns.view.SymptomPatternsFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8950c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26790w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8950c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26790w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26790w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.symptompatterns.view.SymptomPatternsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8951d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26791w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26792x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26793y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26794z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8951d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26791w = componentCallbacks;
            this.f26792x = interfaceC35951a;
            this.f26793y = interfaceC4339a;
            this.f26794z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, yp1.a] */
        @Override // c93.InterfaceC4339a
        public final C39702a invoke() {
            return AbstractC34132o.m107857B(this.f26791w, this.f26792x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39702a.class), this.f26793y, this.f26794z);
        }
    }

    public SymptomPatternsFragment() {
        final int i13 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: aq1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SymptomPatternsFragment f7541x;

            {
                this.f7541x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return SymptomPatternsFragment.m22186N(this.f7541x);
                    default:
                        return SymptomPatternsFragment.m22185M(this.f7541x);
                }
            }
        };
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8951d(this, null, new C8950c(this), interfaceC4339a));
        final int i14 = 1;
        InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a(this) { // from class: aq1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SymptomPatternsFragment f7541x;

            {
                this.f7541x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return SymptomPatternsFragment.m22186N(this.f7541x);
                    default:
                        return SymptomPatternsFragment.m22185M(this.f7541x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.router = AbstractC30060g.m92087G(enumC23463i, new C8948a(this, null, interfaceC4339a2));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8949b(this, null, null));
    }

    /* JADX INFO: renamed from: E */
    private final C39673b m22177E() {
        return (C39673b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final C38531b m22178F() {
        return (C38531b) this.router.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final C39702a m22179G() {
        return (C39702a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m22180H(final SymptomPatternsFragment symptomPatternsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC39703b abstractC39703bM22181I = m22181I(AbstractC28683x.m87260n(symptomPatternsFragment.m22179G().getViewState(), AbstractC39703b.b.f170891b, null, c28655q, 48, 2));
            boolean zM87157i = c28655q.m87157i(symptomPatternsFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new Function1(symptomPatternsFragment) { // from class: aq1.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SymptomPatternsFragment f7543x;

                    {
                        this.f7543x = symptomPatternsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return SymptomPatternsFragment.m22182J(this.f7543x, (AbstractC40940a) obj);
                            case 1:
                                return SymptomPatternsFragment.m22183K(this.f7543x, (AbstractC38530a) obj);
                            default:
                                return SymptomPatternsFragment.m22184L(this.f7543x, (AbstractC39672a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(symptomPatternsFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i15 = 1;
                objM87133R2 = new Function1(symptomPatternsFragment) { // from class: aq1.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SymptomPatternsFragment f7543x;

                    {
                        this.f7543x = symptomPatternsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return SymptomPatternsFragment.m22182J(this.f7543x, (AbstractC40940a) obj);
                            case 1:
                                return SymptomPatternsFragment.m22183K(this.f7543x, (AbstractC38530a) obj);
                            default:
                                return SymptomPatternsFragment.m22184L(this.f7543x, (AbstractC39672a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(symptomPatternsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i16 = 2;
                objM87133R3 = new Function1(symptomPatternsFragment) { // from class: aq1.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SymptomPatternsFragment f7543x;

                    {
                        this.f7543x = symptomPatternsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return SymptomPatternsFragment.m22182J(this.f7543x, (AbstractC40940a) obj);
                            case 1:
                                return SymptomPatternsFragment.m22183K(this.f7543x, (AbstractC38530a) obj);
                            default:
                                return SymptomPatternsFragment.m22184L(this.f7543x, (AbstractC39672a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC1912f.m5856l(abstractC39703bM22181I, null, function1, function2, (Function1) objM87133R3, c28655q, 0, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final AbstractC39703b m22181I(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC39703b) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m22182J(SymptomPatternsFragment symptomPatternsFragment, AbstractC40940a it) {
        AbstractC22676k.m65750j(it, "it");
        symptomPatternsFragment.m22179G().m127041n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m22183K(SymptomPatternsFragment symptomPatternsFragment, AbstractC38530a it) {
        AbstractC22676k.m65750j(it, "it");
        symptomPatternsFragment.m22178F().m123429a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m22184L(SymptomPatternsFragment symptomPatternsFragment, AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        symptomPatternsFragment.m22177E().m126872M(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34911a m22185M(SymptomPatternsFragment symptomPatternsFragment) {
        return AbstractC15751g.m44431K(symptomPatternsFragment.requireActivity(), AbstractC5583n.m16799z(symptomPatternsFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C34911a m22186N(SymptomPatternsFragment symptomPatternsFragment) {
        Bundle arguments = symptomPatternsFragment.getArguments();
        String string = arguments != null ? arguments.getString("featureType") : null;
        Bundle arguments2 = symptomPatternsFragment.getArguments();
        return AbstractC15751g.m44431K(string, arguments2 != null ? arguments2.getString("pregnancyId") : null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C0539c(this, 4), true, 190580505));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        getActivity();
        m22179G().m127041n(AbstractC40940a.a.f176622a);
    }
}
