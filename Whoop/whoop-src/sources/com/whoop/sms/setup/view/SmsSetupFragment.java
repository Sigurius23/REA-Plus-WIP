package com.whoop.sms.setup.view;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import cg2.AbstractC4574a;
import ci0.C4726a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.SmsSupportUrl;
import com.whoop.sms.setup.view.SmsSetupFragment;
import dg2.C12009a;
import eg2.AbstractC13176i;
import eg2.AbstractC13177j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import jf3.C21647a;
import js0.AbstractC21909c;
import js0.C21908b;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import x81.AbstractC38073e;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/sms/setup/view/SmsSetupFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Lcg2/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "D", "(Lcg2/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Ldg2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "C", "()Ldg2/a;", "viewModel", "Ljs0/c;", "x", "B", "()Ljs0/c;", "configurationRepository", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SmsSetupFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10228c(this, null, new C10227b(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h configurationRepository = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10226a(this, null, null));

    /* JADX INFO: renamed from: com.whoop.sms.setup.view.SmsSetupFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10226a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30893w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30894x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30895y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10226a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30893w = componentCallbacks;
            this.f30894x = interfaceC35951a;
            this.f30895y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, js0.c] */
        @Override // c93.InterfaceC4339a
        public final AbstractC21909c invoke() {
            ComponentCallbacks componentCallbacks = this.f30893w;
            InterfaceC35951a interfaceC35951a = this.f30894x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30895y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC21909c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sms.setup.view.SmsSetupFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10227b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30896w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10227b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30896w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30896w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sms.setup.view.SmsSetupFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10228c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30897w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30898x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30899y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30900z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10228c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30897w = componentCallbacks;
            this.f30898x = interfaceC35951a;
            this.f30899y = interfaceC4339a;
            this.f30900z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, dg2.a] */
        @Override // c93.InterfaceC4339a
        public final C12009a invoke() {
            return AbstractC34132o.m107857B(this.f30897w, this.f30898x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12009a.class), this.f30899y, this.f30900z);
        }
    }

    /* JADX INFO: renamed from: B */
    private final AbstractC21909c m25971B() {
        return (AbstractC21909c) this.configurationRepository.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final C12009a m25972C() {
        return (C12009a) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final void m25973D(AbstractC4574a event) {
        if (event instanceof AbstractC4574a.a) {
            AbstractC5583n.m16799z(this).m36410z();
            return;
        }
        if (event instanceof AbstractC4574a.b) {
            AbstractC5583n.m16799z(this).m36410z();
            return;
        }
        if (!(event instanceof AbstractC4574a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC21909c abstractC21909cM25971B = m25971B();
        SmsSupportUrl smsSupportUrl = SmsSupportUrl.INSTANCE;
        C21908b configurations = abstractC21909cM25971B.getConfigurations();
        String name = smsSupportUrl.getName();
        Object defaultValue = smsSupportUrl.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
        Object objM125868N0 = null;
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) defaultValue)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m25974E(final SmsSetupFragment smsSetupFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("sms-onboarding-v2");
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zIsFeatureEnabled) {
                c28655q.m87150e0(-235973654);
                C12009a c12009aM25972C = smsSetupFragment.m25972C();
                boolean zM87157i = c28655q.m87157i(smsSetupFragment);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    final int i14 = 0;
                    objM87133R = new Function1(smsSetupFragment) { // from class: eg2.c

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ SmsSetupFragment f45645x;

                        {
                            this.f45645x = smsSetupFragment;
                        }

                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i14) {
                                case 0:
                                    return SmsSetupFragment.m25975F(this.f45645x, (AbstractC4574a) obj);
                                default:
                                    return SmsSetupFragment.m25976G(this.f45645x, (AbstractC4574a) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC13177j.m37007O(c12009aM25972C, (Function1) objM87133R, c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-235761428);
                C12009a c12009aM25972C2 = smsSetupFragment.m25972C();
                boolean zM87157i2 = c28655q.m87157i(smsSetupFragment);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    final int i15 = 1;
                    objM87133R2 = new Function1(smsSetupFragment) { // from class: eg2.c

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ SmsSetupFragment f45645x;

                        {
                            this.f45645x = smsSetupFragment;
                        }

                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i15) {
                                case 0:
                                    return SmsSetupFragment.m25975F(this.f45645x, (AbstractC4574a) obj);
                                default:
                                    return SmsSetupFragment.m25976G(this.f45645x, (AbstractC4574a) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC13176i.m36988w(c12009aM25972C2, (Function1) objM87133R2, c28655q, 0, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m25975F(SmsSetupFragment smsSetupFragment, AbstractC4574a event) {
        AbstractC22676k.m65750j(event, "event");
        smsSetupFragment.m25973D(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m25976G(SmsSetupFragment smsSetupFragment, AbstractC4574a event) {
        AbstractC22676k.m65750j(event, "event");
        smsSetupFragment.m25973D(event);
        return C23454a0.f92919a;
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 29), true, -552611384));
    }
}
