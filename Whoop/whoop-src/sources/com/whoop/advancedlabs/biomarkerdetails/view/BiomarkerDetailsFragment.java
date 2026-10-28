package com.whoop.advancedlabs.biomarkerdetails.view;

import ab0.AbstractC0706a;
import ab0.C0707b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bb0.AbstractC2922b;
import bb0.AbstractC2924d;
import bb0.C2923c;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ci0.C4726a;
import ck1.C4780c;
import com.squareup.wire.AbstractC5583n;
import com.whoop.advancedlabs.biomarkerdetails.view.BiomarkerDetailsFragment;
import com.whoop.whoopaction.domain.models.Action;
import db0.AbstractC11887c;
import dp0.InterfaceC12251g;
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
import vw2.C36548c;
import ya0.C39355a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010+¨\u0006/²\u0006\f\u0010.\u001a\u00020-8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "K", "()Ljava/lang/String;", "id", "x", "L", "source", "Lbb0/c;", "y", "M", "()Lbb0/c;", "viewModel", "Lj02/o0;", "z", "getNavigator", "()Lj02/o0;", "navigator", "Ldp0/g;", "E", "J", "()Ldp0/g;", "globalCoachManager", "Lya0/a;", "F", "I", "()Lya0/a;", "analyticsHelper", "Lbb0/d;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BiomarkerDetailsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h globalCoachManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h id;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5796f(this, null, new C5795e(this), null));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkerdetails.view.BiomarkerDetailsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkerdetails.view.BiomarkerDetailsFragment$onCreateView$1$1$1", m100430f = "BiomarkerDetailsFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5791a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22871w;

        public C5791a(InterfaceC30057d<? super C5791a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return BiomarkerDetailsFragment.this.new C5791a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5791a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f22871w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM17285K = BiomarkerDetailsFragment.this.m17285K();
            if (strM17285K != null) {
                BiomarkerDetailsFragment.this.m17287M().m8523p(new AbstractC2922b.b(strM17285K, null, 2, 0 == true ? 1 : 0));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkerdetails.view.BiomarkerDetailsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5792b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22873w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22874x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22875y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5792b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22873w = componentCallbacks;
            this.f22874x = interfaceC35951a;
            this.f22875y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22873w;
            InterfaceC35951a interfaceC35951a = this.f22874x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22875y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkerdetails.view.BiomarkerDetailsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5793c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22876w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22877x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22878y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5793c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22876w = componentCallbacks;
            this.f22877x = interfaceC35951a;
            this.f22878y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [dp0.g, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC12251g invoke() {
            ComponentCallbacks componentCallbacks = this.f22876w;
            InterfaceC35951a interfaceC35951a = this.f22877x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22878y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC12251g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkerdetails.view.BiomarkerDetailsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5794d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22879w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22880x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22881y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5794d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22879w = componentCallbacks;
            this.f22880x = interfaceC35951a;
            this.f22881y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f22879w;
            InterfaceC35951a interfaceC35951a = this.f22880x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22881y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkerdetails.view.BiomarkerDetailsFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5795e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22882w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5795e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f22882w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f22882w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkerdetails.view.BiomarkerDetailsFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5796f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22883w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22884x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22885y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f22886z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5796f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f22883w = componentCallbacks;
            this.f22884x = interfaceC35951a;
            this.f22885y = interfaceC4339a;
            this.f22886z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, bb0.c] */
        @Override // c93.InterfaceC4339a
        public final C2923c invoke() {
            return AbstractC34132o.m107857B(this.f22883w, this.f22884x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C2923c.class), this.f22885y, this.f22886z);
        }
    }

    public BiomarkerDetailsFragment() {
        final int i13 = 0;
        this.id = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: db0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ BiomarkerDetailsFragment f38853x;

            {
                this.f38853x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return BiomarkerDetailsFragment.m17288N(this.f38853x);
                    case 1:
                        return BiomarkerDetailsFragment.m17296V(this.f38853x);
                    default:
                        return BiomarkerDetailsFragment.m17289O(this.f38853x);
                }
            }
        });
        final int i14 = 1;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: db0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ BiomarkerDetailsFragment f38853x;

            {
                this.f38853x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return BiomarkerDetailsFragment.m17288N(this.f38853x);
                    case 1:
                        return BiomarkerDetailsFragment.m17296V(this.f38853x);
                    default:
                        return BiomarkerDetailsFragment.m17289O(this.f38853x);
                }
            }
        });
        final int i15 = 2;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: db0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ BiomarkerDetailsFragment f38853x;

            {
                this.f38853x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return BiomarkerDetailsFragment.m17288N(this.f38853x);
                    case 1:
                        return BiomarkerDetailsFragment.m17296V(this.f38853x);
                    default:
                        return BiomarkerDetailsFragment.m17289O(this.f38853x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5792b(this, null, interfaceC4339a));
        this.globalCoachManager = AbstractC30060g.m92087G(enumC23463i, new C5793c(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5794d(this, null, null));
    }

    /* JADX INFO: renamed from: I */
    private final C39355a m17283I() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final InterfaceC12251g m17284J() {
        return (InterfaceC12251g) this.globalCoachManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final String m17285K() {
        return (String) this.id.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final String m17286L() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final C2923c m17287M() {
        return (C2923c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final String m17288N(BiomarkerDetailsFragment biomarkerDetailsFragment) {
        return biomarkerDetailsFragment.requireArguments().getString("biomarkerId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C34911a m17289O(BiomarkerDetailsFragment biomarkerDetailsFragment) {
        return AbstractC15751g.m44431K(biomarkerDetailsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m17290P(final BiomarkerDetailsFragment biomarkerDetailsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C0707b c0707b = new C0707b(biomarkerDetailsFragment.getNavigator(), AbstractC5583n.m16799z(biomarkerDetailsFragment), biomarkerDetailsFragment.m17284J());
                c28655q.m87172p0(c0707b);
                objM87133R = c0707b;
            }
            C0707b c0707b2 = (C0707b) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(biomarkerDetailsFragment.m17287M().getViewState(), AbstractC2924d.b.f11783b, null, c28655q, 48, 2);
            C2923c c2923cM17287M = biomarkerDetailsFragment.m17287M();
            boolean zM87157i = c28655q.m87157i(biomarkerDetailsFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = biomarkerDetailsFragment.new C5791a(null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c2923cM17287M);
            AbstractC2924d abstractC2924dM17291Q = m17291Q(interfaceC28601c1M87260n);
            String strM17286L = biomarkerDetailsFragment.m17286L();
            boolean zM87157i2 = c28655q.m87157i(biomarkerDetailsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                final int i14 = 0;
                objM87133R3 = new Function1(biomarkerDetailsFragment) { // from class: db0.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ BiomarkerDetailsFragment f38855x;

                    {
                        this.f38855x = biomarkerDetailsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return BiomarkerDetailsFragment.m17292R(this.f38855x, (AbstractC2922b) obj);
                            case 1:
                                return BiomarkerDetailsFragment.m17293S(this.f38855x, (Action) obj);
                            default:
                                return BiomarkerDetailsFragment.m17294T(this.f38855x, (InterfaceC22381a.c) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(biomarkerDetailsFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                final int i15 = 1;
                objM87133R4 = new Function1(biomarkerDetailsFragment) { // from class: db0.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ BiomarkerDetailsFragment f38855x;

                    {
                        this.f38855x = biomarkerDetailsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return BiomarkerDetailsFragment.m17292R(this.f38855x, (AbstractC2922b) obj);
                            case 1:
                                return BiomarkerDetailsFragment.m17293S(this.f38855x, (Action) obj);
                            default:
                                return BiomarkerDetailsFragment.m17294T(this.f38855x, (InterfaceC22381a.c) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function2 = (Function1) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(biomarkerDetailsFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                final int i16 = 2;
                objM87133R5 = new Function1(biomarkerDetailsFragment) { // from class: db0.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ BiomarkerDetailsFragment f38855x;

                    {
                        this.f38855x = biomarkerDetailsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return BiomarkerDetailsFragment.m17292R(this.f38855x, (AbstractC2922b) obj);
                            case 1:
                                return BiomarkerDetailsFragment.m17293S(this.f38855x, (Action) obj);
                            default:
                                return BiomarkerDetailsFragment.m17294T(this.f38855x, (InterfaceC22381a.c) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function3 = (Function1) objM87133R5;
            boolean zM87157i5 = c28655q.m87157i(c0707b2);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i5 || objM87133R6 == c28676v0) {
                objM87133R6 = new C4780c(c0707b2, 19);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC11887c.m31880O(abstractC2924dM17291Q, strM17286L, function1, function2, function3, (Function1) objM87133R6, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final AbstractC2924d m17291Q(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC2924d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m17292R(BiomarkerDetailsFragment biomarkerDetailsFragment, AbstractC2922b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        biomarkerDetailsFragment.m17287M().m8523p(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m17293S(BiomarkerDetailsFragment biomarkerDetailsFragment, Action action) {
        AbstractC22676k.m65750j(action, "action");
        biomarkerDetailsFragment.m17287M().m8522o(new C36548c(action));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m17294T(BiomarkerDetailsFragment biomarkerDetailsFragment, InterfaceC22381a.c analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        biomarkerDetailsFragment.m17283I().m125496e(analyticEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m17295U(C0707b c0707b, AbstractC0706a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c0707b.m1768a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final String m17296V(BiomarkerDetailsFragment biomarkerDetailsFragment) {
        return biomarkerDetailsFragment.requireArguments().getString("source");
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 20), true, -1955503258));
    }
}
