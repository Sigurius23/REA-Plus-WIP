package com.whoop.hormonalinsights.menstrualcycleinsights.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.hormonalinsights.menstrualcycleinsights.view.PhaseCoachingFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import hj0.AbstractC17357p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
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
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ro1.AbstractC31638j;
import ro1.C31639k;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import so1.AbstractC32815g0;
import so1.C32813f0;
import to1.AbstractC34020m;
import tx0.C34238a;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vo1.AbstractC36249x;
import yn1.AbstractC39672a;
import yn1.C39673b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010(¨\u0006,²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "H", "()Ljava/lang/String;", "phase", "Li2/x;", "x", "Li2/x;", "statusColor", "Lso1/f0;", "y", "J", "()Lso1/f0;", "viewModel", "Lyn1/b;", "z", "G", "()Lyn1/b;", "analyticsHelper", "Lro1/k;", "E", "I", "()Lro1/k;", "router", "Lso1/g0;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PhaseCoachingFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h router;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h phase;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private C17919x statusColor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8925e(this, null, new C8924d(this), null));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.PhaseCoachingFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.view.PhaseCoachingFragment$onCreateView$1$2$1", m100430f = "PhaseCoachingFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8921a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26687w;

        public C8921a(InterfaceC30057d<? super C8921a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return PhaseCoachingFragment.this.new C8921a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8921a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f26687w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM126875b = C39673b.INSTANCE.m126875b(PhaseCoachingFragment.this.m22034H());
            if (strM126875b != null) {
                PhaseCoachingFragment.this.m22033G().m126872M(new AbstractC39672a.j0(strM126875b));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.PhaseCoachingFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8922b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26689w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26690x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26691y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8922b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26689w = componentCallbacks;
            this.f26690x = interfaceC35951a;
            this.f26691y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yn1.b] */
        @Override // c93.InterfaceC4339a
        public final C39673b invoke() {
            ComponentCallbacks componentCallbacks = this.f26689w;
            InterfaceC35951a interfaceC35951a = this.f26690x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26691y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39673b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.PhaseCoachingFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8923c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26692w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26693x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26694y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8923c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26692w = componentCallbacks;
            this.f26693x = interfaceC35951a;
            this.f26694y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ro1.k] */
        @Override // c93.InterfaceC4339a
        public final C31639k invoke() {
            ComponentCallbacks componentCallbacks = this.f26692w;
            InterfaceC35951a interfaceC35951a = this.f26693x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26694y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31639k.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.PhaseCoachingFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8924d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26695w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8924d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26695w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26695w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.PhaseCoachingFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8925e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26696w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26697x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26698y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26699z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8925e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26696w = componentCallbacks;
            this.f26697x = interfaceC35951a;
            this.f26698y = interfaceC4339a;
            this.f26699z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, so1.f0] */
        @Override // c93.InterfaceC4339a
        public final C32813f0 invoke() {
            return AbstractC34132o.m107857B(this.f26696w, this.f26697x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32813f0.class), this.f26698y, this.f26699z);
        }
    }

    public PhaseCoachingFragment() {
        final int i13 = 0;
        this.phase = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: vo1.u

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PhaseCoachingFragment f155264x;

            {
                this.f155264x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return PhaseCoachingFragment.m22042P(this.f155264x);
                    default:
                        return PhaseCoachingFragment.m22043Q(this.f155264x);
                }
            }
        });
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8922b(this, null, null));
        final int i14 = 1;
        this.router = AbstractC30060g.m92087G(enumC23463i, new C8923c(this, null, new InterfaceC4339a(this) { // from class: vo1.u

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PhaseCoachingFragment f155264x;

            {
                this.f155264x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return PhaseCoachingFragment.m22042P(this.f155264x);
                    default:
                        return PhaseCoachingFragment.m22043Q(this.f155264x);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final C39673b m22033G() {
        return (C39673b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final String m22034H() {
        return (String) this.phase.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final C31639k m22035I() {
        return (C31639k) this.router.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final C32813f0 m22036J() {
        return (C32813f0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m22037K(final PhaseCoachingFragment phaseCoachingFragment, Composer composer, int i13) {
        C17919x c17919xM31989h;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(phaseCoachingFragment.m22036J().getViewState(), AbstractC32815g0.b.f136712b, null, c28655q, 48, 2);
            AbstractC32815g0 abstractC32815g0M22038L = m22038L(interfaceC28601c1M87260n);
            AbstractC32815g0.c cVar = abstractC32815g0M22038L instanceof AbstractC32815g0.c ? (AbstractC32815g0.c) abstractC32815g0M22038L : null;
            InterfaceC39332e interfaceC39332eM102971b = cVar != null ? cVar.getBackgroundColor() : null;
            if (interfaceC39332eM102971b == null) {
                c28655q.m87150e0(-1244984835);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(1206765188);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, interfaceC39332eM102971b.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            phaseCoachingFragment.statusColor = c17919xM31989h;
            if (c17919xM31989h != null) {
                AbstractC28163g0.m85255k(phaseCoachingFragment, AbstractC17918w0.m51506H(C17919x.m51541c(0.3f, c17919xM31989h.f69639a)), 0, 2, null);
            }
            boolean z4 = m22038L(interfaceC28601c1M87260n) instanceof AbstractC32815g0.c;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-1244780203);
                String strM22034H = phaseCoachingFragment.m22034H();
                boolean zM87157i = c28655q.m87157i(phaseCoachingFragment);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = phaseCoachingFragment.new C8921a(null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, strM22034H);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1244507279);
                c28655q.m87173q(false);
            }
            AbstractC32815g0 abstractC32815g0M22038L2 = m22038L(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(phaseCoachingFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i14 = 0;
                objM87133R2 = new Function1(phaseCoachingFragment) { // from class: vo1.v

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PhaseCoachingFragment f155266x;

                    {
                        this.f155266x = phaseCoachingFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return PhaseCoachingFragment.m22039M(this.f155266x, (AbstractC34020m) obj);
                            case 1:
                                return PhaseCoachingFragment.m22040N(this.f155266x, (AbstractC31638j) obj);
                            default:
                                return PhaseCoachingFragment.m22041O(this.f155266x, (AbstractC39672a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(phaseCoachingFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i15 = 1;
                objM87133R3 = new Function1(phaseCoachingFragment) { // from class: vo1.v

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PhaseCoachingFragment f155266x;

                    {
                        this.f155266x = phaseCoachingFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return PhaseCoachingFragment.m22039M(this.f155266x, (AbstractC34020m) obj);
                            case 1:
                                return PhaseCoachingFragment.m22040N(this.f155266x, (AbstractC31638j) obj);
                            default:
                                return PhaseCoachingFragment.m22041O(this.f155266x, (AbstractC39672a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(phaseCoachingFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i16 = 2;
                objM87133R4 = new Function1(phaseCoachingFragment) { // from class: vo1.v

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PhaseCoachingFragment f155266x;

                    {
                        this.f155266x = phaseCoachingFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return PhaseCoachingFragment.m22039M(this.f155266x, (AbstractC34020m) obj);
                            case 1:
                                return PhaseCoachingFragment.m22040N(this.f155266x, (AbstractC31638j) obj);
                            default:
                                return PhaseCoachingFragment.m22041O(this.f155266x, (AbstractC39672a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC36249x.m115644w(abstractC32815g0M22038L2, function1, function2, (Function1) objM87133R4, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final AbstractC32815g0 m22038L(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC32815g0) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m22039M(PhaseCoachingFragment phaseCoachingFragment, AbstractC34020m it) {
        AbstractC22676k.m65750j(it, "it");
        phaseCoachingFragment.m22036J().m102966n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m22040N(PhaseCoachingFragment phaseCoachingFragment, AbstractC31638j it) {
        AbstractC22676k.m65750j(it, "it");
        phaseCoachingFragment.m22035I().m97773a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m22041O(PhaseCoachingFragment phaseCoachingFragment, AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        phaseCoachingFragment.m22033G().m126872M(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final String m22042P(PhaseCoachingFragment phaseCoachingFragment) {
        String string;
        Bundle arguments = phaseCoachingFragment.getArguments();
        return (arguments == null || (string = arguments.getString("phase")) == null) ? "MENSTRUAL" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C34911a m22043Q(PhaseCoachingFragment phaseCoachingFragment) {
        return AbstractC15751g.m44431K(phaseCoachingFragment.requireActivity(), AbstractC5583n.m16799z(phaseCoachingFragment));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 24), true, -1004329743));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        getActivity();
        m22036J().m102966n(new AbstractC34020m.a(m22034H()));
    }
}
