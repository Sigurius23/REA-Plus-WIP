package com.whoop.sage.onboarding.view;

import a72.AbstractC0524a;
import a72.C0525b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.sage.onboarding.view.SageOnboardingFragment;
import ge3.AbstractC15751g;
import hj0.AbstractC17357p;
import i72.AbstractC18206a;
import i72.C18207b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import j02.InterfaceC21159o0;
import j72.AbstractC21403h;
import j72.AbstractC21405j;
import j72.C21404i;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import kk1.C22541b;
import l72.AbstractC23408o;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import o02.InterfaceC27353d;
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
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0015\u001a\u0004\b/\u00100¨\u00064²\u0006\f\u00103\u001a\u0002028\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "H", "()Z", "skipToManualEntry", "Lj72/i;", "x", "I", "()Lj72/i;", "viewModel", "", "y", "getSource", "()Ljava/lang/String;", "source", "Lj02/o0;", "z", "getNavigator", "()Lj02/o0;", "navigator", "Lo02/d;", "E", "getNavigatorReducer", "()Lo02/d;", "navigatorReducer", "La72/b;", "F", "G", "()La72/b;", "analyticsHelper", "Lj72/j;", "viewState", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SageOnboardingFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h navigatorReducer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h skipToManualEntry;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.view.SageOnboardingFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9950a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29390w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29391x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29392y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9950a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29390w = componentCallbacks;
            this.f29391x = interfaceC35951a;
            this.f29392y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f29390w;
            InterfaceC35951a interfaceC35951a = this.f29391x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29392y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.view.SageOnboardingFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9951b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29393w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29394x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29395y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9951b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29393w = componentCallbacks;
            this.f29394x = interfaceC35951a;
            this.f29395y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f29393w;
            InterfaceC35951a interfaceC35951a = this.f29394x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29395y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.view.SageOnboardingFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9952c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29396w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29397x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29398y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9952c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29396w = componentCallbacks;
            this.f29397x = interfaceC35951a;
            this.f29398y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [a72.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C0525b invoke() {
            ComponentCallbacks componentCallbacks = this.f29396w;
            InterfaceC35951a interfaceC35951a = this.f29397x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29398y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C0525b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.view.SageOnboardingFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9953d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29399w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9953d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f29399w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f29399w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.view.SageOnboardingFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9954e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29400w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29401x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29402y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f29403z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9954e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f29400w = componentCallbacks;
            this.f29401x = interfaceC35951a;
            this.f29402y = interfaceC4339a;
            this.f29403z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, j72.i] */
        @Override // c93.InterfaceC4339a
        public final C21404i invoke() {
            return AbstractC34132o.m107857B(this.f29400w, this.f29401x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21404i.class), this.f29402y, this.f29403z);
        }
    }

    public SageOnboardingFragment() {
        final int i13 = 0;
        this.skipToManualEntry = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: l72.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SageOnboardingFragment f92739x;

            {
                this.f92739x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return Boolean.valueOf(SageOnboardingFragment.m24426P(this.f92739x));
                    case 1:
                        return SageOnboardingFragment.m24428R(this.f92739x);
                    case 2:
                        return SageOnboardingFragment.m24427Q(this.f92739x);
                    default:
                        return SageOnboardingFragment.m24420J(this.f92739x);
                }
            }
        });
        final int i14 = 1;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: l72.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SageOnboardingFragment f92739x;

            {
                this.f92739x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return Boolean.valueOf(SageOnboardingFragment.m24426P(this.f92739x));
                    case 1:
                        return SageOnboardingFragment.m24428R(this.f92739x);
                    case 2:
                        return SageOnboardingFragment.m24427Q(this.f92739x);
                    default:
                        return SageOnboardingFragment.m24420J(this.f92739x);
                }
            }
        };
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9954e(this, null, new C9953d(this), interfaceC4339a));
        final int i15 = 2;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: l72.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SageOnboardingFragment f92739x;

            {
                this.f92739x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return Boolean.valueOf(SageOnboardingFragment.m24426P(this.f92739x));
                    case 1:
                        return SageOnboardingFragment.m24428R(this.f92739x);
                    case 2:
                        return SageOnboardingFragment.m24427Q(this.f92739x);
                    default:
                        return SageOnboardingFragment.m24420J(this.f92739x);
                }
            }
        });
        final int i16 = 3;
        InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a(this) { // from class: l72.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SageOnboardingFragment f92739x;

            {
                this.f92739x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return Boolean.valueOf(SageOnboardingFragment.m24426P(this.f92739x));
                    case 1:
                        return SageOnboardingFragment.m24428R(this.f92739x);
                    case 2:
                        return SageOnboardingFragment.m24427Q(this.f92739x);
                    default:
                        return SageOnboardingFragment.m24420J(this.f92739x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C9950a(this, null, interfaceC4339a2));
        this.navigatorReducer = AbstractC30060g.m92087G(enumC23463i, new C9951b(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C9952c(this, null, null));
    }

    /* JADX INFO: renamed from: G */
    private final C0525b m24417G() {
        return (C0525b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final boolean m24418H() {
        return ((Boolean) this.skipToManualEntry.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: I */
    private final C21404i m24419I() {
        return (C21404i) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C34911a m24420J(SageOnboardingFragment sageOnboardingFragment) {
        return AbstractC15751g.m44431K(sageOnboardingFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m24421K(final SageOnboardingFragment sageOnboardingFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(sageOnboardingFragment.m24419I().getViewState(), AbstractC21405j.f.f82062a, null, c28655q, 48, 2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C18207b(AbstractC5583n.m16799z(sageOnboardingFragment), sageOnboardingFragment.getNavigator(), sageOnboardingFragment.m24418H());
                c28655q.m87172p0(objM87133R);
            }
            C18207b c18207b = (C18207b) objM87133R;
            AbstractC28163g0.m85256l(sageOnboardingFragment);
            AbstractC21405j abstractC21405jM24422L = m24422L(interfaceC28601c1M87260n);
            boolean zM87157i = c28655q.m87157i(sageOnboardingFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                final int i14 = 0;
                objM87133R2 = new Function1(sageOnboardingFragment) { // from class: l72.k

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SageOnboardingFragment f92741x;

                    {
                        this.f92741x = sageOnboardingFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return SageOnboardingFragment.m24423M(this.f92741x, (AbstractC21403h) obj);
                            default:
                                return SageOnboardingFragment.m24425O(this.f92741x, (AbstractC0524a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i2 = c28655q.m87157i(c18207b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C19962a(c18207b, 28);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(sageOnboardingFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                final int i15 = 1;
                objM87133R4 = new Function1(sageOnboardingFragment) { // from class: l72.k

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SageOnboardingFragment f92741x;

                    {
                        this.f92741x = sageOnboardingFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return SageOnboardingFragment.m24423M(this.f92741x, (AbstractC21403h) obj);
                            default:
                                return SageOnboardingFragment.m24425O(this.f92741x, (AbstractC0524a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC23408o.m67820N(abstractC21405jM24422L, function1, function2, (Function1) objM87133R4, sageOnboardingFragment.m24418H(), c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final AbstractC21405j m24422L(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC21405j) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m24423M(SageOnboardingFragment sageOnboardingFragment, AbstractC21403h event) {
        AbstractC22676k.m65750j(event, "event");
        sageOnboardingFragment.m24419I().m60145n(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m24424N(C18207b c18207b, AbstractC18206a event) {
        AbstractC22676k.m65750j(event, "event");
        c18207b.m52275a(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m24425O(SageOnboardingFragment sageOnboardingFragment, AbstractC0524a event) {
        AbstractC22676k.m65750j(event, "event");
        sageOnboardingFragment.m24417G().m1289B(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final boolean m24426P(SageOnboardingFragment sageOnboardingFragment) {
        Bundle arguments = sageOnboardingFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("skipToManualEntry", false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final String m24427Q(SageOnboardingFragment sageOnboardingFragment) {
        Bundle arguments = sageOnboardingFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("source");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C34911a m24428R(SageOnboardingFragment sageOnboardingFragment) {
        return AbstractC15751g.m44431K(Boolean.valueOf(sageOnboardingFragment.m24418H()));
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C22541b(this, 13), true, -1532455179));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        getActivity();
    }
}
