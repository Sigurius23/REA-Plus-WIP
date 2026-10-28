package com.whoop.privacyconsent.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import f42.AbstractC14081a;
import g42.AbstractC15463b;
import g42.C15462a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.EnumC21171u0;
import j42.AbstractC21316a;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l42.AbstractC23333a;
import l42.C23334b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lc0.C23821c;
import live.hms.video.connection.degredation.C24117a;
import lq0.C24656d;
import mw1.C25985a;
import n42.C26282f;
import n42.C26283g;
import n42.C26284h;
import o42.AbstractC27531k;
import or2.AbstractC28163g0;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p42.C28841a;
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
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010&¨\u0006*²\u0006\f\u0010)\u001a\u00020(8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "Ln42/f;", "F", "(Landroid/os/Bundle;)Ln42/f;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "Lp42/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "G", "()Lp42/a;", "viewModel", "Lor2/y;", "x", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lg42/a;", "y", "D", "()Lg42/a;", "privacyConsentAnalytics", "z", "E", "()Ln42/f;", "screenArgs", "Ln42/h;", "viewState", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PrivacyConsentFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h privacyConsentAnalytics;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h screenArgs;

    /* JADX INFO: renamed from: com.whoop.privacyconsent.view.PrivacyConsentFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.view.PrivacyConsentFragment$onCreateView$1$1$1", m100430f = "PrivacyConsentFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9685a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28324w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f28325x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f28326y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ PrivacyConsentFragment f28327z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9685a(boolean z4, InterfaceC28601c1 interfaceC28601c1, PrivacyConsentFragment privacyConsentFragment, InterfaceC30057d<? super C9685a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f28325x = z4;
            this.f28326y = interfaceC28601c1;
            this.f28327z = privacyConsentFragment;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C9685a(this.f28325x, this.f28326y, this.f28327z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9685a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f28324w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC15463b.m43658a(this.f28325x, (Boolean) this.f28326y.getValue())) {
                this.f28327z.m23336D().m43656a(AbstractC22676k.m65745e(this.f28326y.getValue(), Boolean.TRUE));
                this.f28326y.setValue(null);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.privacyconsent.view.PrivacyConsentFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9686b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28328w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28329x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28330y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9686b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28328w = componentCallbacks;
            this.f28329x = interfaceC35951a;
            this.f28330y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f28328w;
            InterfaceC35951a interfaceC35951a = this.f28329x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28330y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.privacyconsent.view.PrivacyConsentFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9687c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28331w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28332x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28333y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9687c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28331w = componentCallbacks;
            this.f28332x = interfaceC35951a;
            this.f28333y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [g42.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C15462a invoke() {
            ComponentCallbacks componentCallbacks = this.f28331w;
            InterfaceC35951a interfaceC35951a = this.f28332x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28333y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15462a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.privacyconsent.view.PrivacyConsentFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9688d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28334w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9688d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f28334w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f28334w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.privacyconsent.view.PrivacyConsentFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9689e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28335w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28336x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28337y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f28338z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9689e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f28335w = componentCallbacks;
            this.f28336x = interfaceC35951a;
            this.f28337y = interfaceC4339a;
            this.f28338z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, p42.a] */
        @Override // c93.InterfaceC4339a
        public final C28841a invoke() {
            return AbstractC34132o.m107857B(this.f28335w, this.f28336x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28841a.class), this.f28337y, this.f28338z);
        }
    }

    public PrivacyConsentFragment() {
        C9688d c9688d = new C9688d(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C9689e(this, null, c9688d, null));
        EnumC23463i enumC23463i2 = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i2, new C9686b(this, null, null));
        this.privacyConsentAnalytics = AbstractC30060g.m92087G(enumC23463i2, new C9687c(this, null, null));
        this.screenArgs = AbstractC30060g.m92087G(enumC23463i, new C24117a(this, 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final C15462a m23336D() {
        return (C15462a) this.privacyConsentAnalytics.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C26282f m23337E() {
        return (C26282f) this.screenArgs.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    private final C26282f m23338F(Bundle bundle) {
        if (bundle != null) {
            return new C26282f(EnumC21171u0.INSTANCE.m59414a(bundle.getString("mode")));
        }
        return new C26282f(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: G */
    private final C28841a m23339G() {
        return (C28841a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m23340H(PrivacyConsentFragment privacyConsentFragment, Composer composer, int i13) {
        boolean z4 = false;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(privacyConsentFragment.m23339G().getViewState(), new C26284h(false, true, null, 5, null), null, c28655q, 0, 2);
            AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(privacyConsentFragment);
            C28216y externalLinkNavigator = privacyConsentFragment.getExternalLinkNavigator();
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = privacyConsentFragment.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            String string = privacyConsentFragment.getString(AbstractC14081a.f50584f);
            AbstractC22676k.m65749i(string, "getString(...)");
            String string2 = privacyConsentFragment.getString(AbstractC14081a.f50595q);
            AbstractC22676k.m65749i(string2, "getString(...)");
            C23334b c23334b = new C23334b(abstractC12939a0M16799z, externalLinkNavigator, abstractActivityC1340r0RequireActivity, string, string2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C26283g c26283gM77993a = m23341I(interfaceC28601c1M87260n).getScreenViewState();
            if (c26283gM77993a != null && c26283gM77993a.getIsRecommendationToggleSuccess()) {
                z4 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zM87155h = c28655q.m87155h(z4) | c28655q.m87157i(privacyConsentFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87155h || objM87133R2 == c28676v0) {
                objM87133R2 = new C9685a(z4, interfaceC28601c1, privacyConsentFragment, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
            C26284h c26284hM23341I = m23341I(interfaceC28601c1M87260n);
            EnumC21171u0 enumC21171u0M77982a = privacyConsentFragment.m23337E().getMode();
            boolean zM87157i = c28655q.m87157i(c23334b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C23821c(c23334b, 22);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i2 = c28655q.m87157i(privacyConsentFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C24656d(23, interfaceC28601c1, privacyConsentFragment);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC27531k.m83004f0(c26284hM23341I, enumC21171u0M77982a, function1, (Function1) objM87133R4, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final C26284h m23341I(InterfaceC28670t2 interfaceC28670t2) {
        return (C26284h) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m23342J(C23334b c23334b, AbstractC23333a it) {
        AbstractC22676k.m65750j(it, "it");
        c23334b.m67567a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m23343K(InterfaceC28601c1 interfaceC28601c1, PrivacyConsentFragment privacyConsentFragment, AbstractC21316a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC21316a.g) {
            interfaceC28601c1.setValue(Boolean.valueOf(((AbstractC21316a.g) event).getIsEnabled()));
        }
        privacyConsentFragment.m23339G().m87734o(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C26282f m23344L(PrivacyConsentFragment privacyConsentFragment) {
        return privacyConsentFragment.m23338F(privacyConsentFragment.getArguments());
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        m23336D().m43657b();
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 8), true, -715931302));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }
}
