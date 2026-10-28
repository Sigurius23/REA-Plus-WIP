package com.whoop.whooplabs.feature;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.WhoopLabsScreenModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whooplabs.feature.WhoopLabsFragment;
import com.whoop.whooplabs.feature.navigation.AbstractC10838a;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import com.whoop.whooplabs.feature.navigation.C10839b;
import ge3.AbstractC15751g;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import j93.InterfaceC21467g;
import jx2.AbstractC22042f;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import o02.InterfaceC27353d;
import or2.AbstractC28163g0;
import p114eb.C12991u0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import zw2.C41178b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u00105R\u001d\u00109\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u001c\u001a\u0004\b8\u0010\u0018R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u001c\u001a\u0004\b<\u0010=¨\u0006?"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/WhoopLabsFragment;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "K", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lzw2/b;", "x", "Ll83/h;", "L", "()Lzw2/b;", "analytics", "Lcom/whoop/whooplabs/feature/navigation/a;", "y", "Lcom/whoop/whooplabs/feature/navigation/a;", "O", "()Lcom/whoop/whooplabs/feature/navigation/a;", "U", "(Lcom/whoop/whooplabs/feature/navigation/a;)V", "navHostEntry", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "z", "P", "()Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "onboardingStatusChecker", "Lo02/d;", "E", "M", "()Lo02/d;", "baseNavReducer", "", "F", "N", "()I", "campaignId", "G", "Q", "sessionId", "Lj02/o0;", "H", "getNavigator", "()Lj02/o0;", "navigator", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WhoopLabsFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h baseNavReducer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h campaignId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h sessionId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "DWL/WhoopLabsFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public AbstractC10838a navHostEntry;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h onboardingStatusChecker;

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.WhoopLabsFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10825a extends C22672i implements InterfaceC4339a {
        public C10825a(Object obj) {
            super(0, 0, WhoopLabsFragment.class, obj, "closeWhoopLabsScreen", "closeWhoopLabsScreen()V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134200invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134200invoke() {
            ((WhoopLabsFragment) this.receiver).m28543K();
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.WhoopLabsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10826b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f33221w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33222x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33223y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10826b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33221w = componentCallbacks;
            this.f33222x = interfaceC35951a;
            this.f33223y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zw2.b] */
        @Override // c93.InterfaceC4339a
        public final C41178b invoke() {
            ComponentCallbacks componentCallbacks = this.f33221w;
            InterfaceC35951a interfaceC35951a = this.f33222x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f33223y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C41178b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.WhoopLabsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10827c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f33224w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33225x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33226y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10827c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33224w = componentCallbacks;
            this.f33225x = interfaceC35951a;
            this.f33226y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.onboarding.OnboardingStatusChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final OnboardingStatusChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f33224w;
            InterfaceC35951a interfaceC35951a = this.f33225x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f33226y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(OnboardingStatusChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.WhoopLabsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10828d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f33227w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33228x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33229y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10828d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33227w = componentCallbacks;
            this.f33228x = interfaceC35951a;
            this.f33229y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f33227w;
            InterfaceC35951a interfaceC35951a = this.f33228x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f33229y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.WhoopLabsFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10829e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f33230w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33231x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33232y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10829e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33230w = componentCallbacks;
            this.f33231x = interfaceC35951a;
            this.f33232y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f33230w;
            InterfaceC35951a interfaceC35951a = this.f33231x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f33232y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    public WhoopLabsFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C10826b(this, null, null));
        this.onboardingStatusChecker = AbstractC30060g.m92087G(enumC23463i, new C10827c(this, null, null));
        this.baseNavReducer = AbstractC30060g.m92087G(enumC23463i, new C10828d(this, null, null));
        final int i13 = 0;
        this.campaignId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: jx2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WhoopLabsFragment f85470x;

            {
                this.f85470x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return Integer.valueOf(WhoopLabsFragment.m28542J(this.f85470x));
                    case 1:
                        return WhoopLabsFragment.m28551T(this.f85470x);
                    default:
                        return WhoopLabsFragment.m28549R(this.f85470x);
                }
            }
        });
        final int i14 = 1;
        this.sessionId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: jx2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WhoopLabsFragment f85470x;

            {
                this.f85470x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return Integer.valueOf(WhoopLabsFragment.m28542J(this.f85470x));
                    case 1:
                        return WhoopLabsFragment.m28551T(this.f85470x);
                    default:
                        return WhoopLabsFragment.m28549R(this.f85470x);
                }
            }
        });
        final int i15 = 2;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10829e(this, null, new InterfaceC4339a(this) { // from class: jx2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ WhoopLabsFragment f85470x;

            {
                this.f85470x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return Integer.valueOf(WhoopLabsFragment.m28542J(this.f85470x));
                    case 1:
                        return WhoopLabsFragment.m28551T(this.f85470x);
                    default:
                        return WhoopLabsFragment.m28549R(this.f85470x);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final int m28542J(WhoopLabsFragment whoopLabsFragment) {
        return whoopLabsFragment.requireArguments().getInt("campaignId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final void m28543K() {
        AbstractC5583n.m16799z(this).m36410z();
    }

    /* JADX INFO: renamed from: L */
    private final C41178b m28544L() {
        return (C41178b) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final InterfaceC27353d m28545M() {
        return (InterfaceC27353d) this.baseNavReducer.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final int m28546N() {
        return ((Number) this.campaignId.getValue()).intValue();
    }

    /* JADX INFO: renamed from: P */
    private final OnboardingStatusChecker m28547P() {
        return (OnboardingStatusChecker) this.onboardingStatusChecker.getValue();
    }

    /* JADX INFO: renamed from: Q */
    private final String m28548Q() {
        return (String) this.sessionId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C34911a m28549R(WhoopLabsFragment whoopLabsFragment) {
        return AbstractC15751g.m44431K(whoopLabsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m28550S(WhoopLabsFragment whoopLabsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("WhoopLabsNavHost", null, c28655q, 6, 2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C10839b c10839b = new C10839b(c12991u0M58963a, AbstractC5583n.m16799z(whoopLabsFragment), whoopLabsFragment.m28545M(), whoopLabsFragment.getNavigator());
                c28655q.m87172p0(c10839b);
                objM87133R = c10839b;
            }
            C10839b c10839b2 = (C10839b) objM87133R;
            AbstractC10838a abstractC10838aM28552O = whoopLabsFragment.m28552O();
            C41178b c41178bM28544L = whoopLabsFragment.m28544L();
            boolean zM87157i = c28655q.m87157i(whoopLabsFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C10825a(whoopLabsFragment);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22042f.m63027H(abstractC10838aM28552O, c12991u0M58963a, c10839b2, c41178bM28544L, (InterfaceC4339a) ((InterfaceC21467g) objM87133R2), c28655q, 0, 0);
            if (whoopLabsFragment.m28546N() != 0) {
                AppScreen.C9414s6 c9414s6 = AppScreen.C9414s6.f27926w;
                Integer numValueOf = Integer.valueOf(whoopLabsFragment.m28546N());
                String strM28548Q = whoopLabsFragment.m28548Q();
                c10839b2.m28564c(new AbstractC10840c.i(new C9598e(c9414s6, new WhoopLabsScreenModel(numValueOf, strM28548Q != null ? AbstractC39421y.m125932Q(strM28548Q) : null, (String) null, 4, (DefaultConstructorMarker) null), null, 4, null)));
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final String m28551T(WhoopLabsFragment whoopLabsFragment) {
        return whoopLabsFragment.requireArguments().getString("sessionId");
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: O */
    public final AbstractC10838a m28552O() {
        AbstractC10838a abstractC10838a = this.navHostEntry;
        if (abstractC10838a != null) {
            return abstractC10838a;
        }
        AbstractC22676k.m65757q("navHostEntry");
        throw null;
    }

    /* JADX INFO: renamed from: U */
    public final void m28553U(AbstractC10838a abstractC10838a) {
        AbstractC22676k.m65750j(abstractC10838a, "<set-?>");
        this.navHostEntry = abstractC10838a;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        AbstractC10838a aVar;
        super.onCreate(savedInstanceState);
        String string = requireArguments().getString("campaignFilter");
        if (m28547P().shouldGoToFeatureEducation(FeatureEducationType.DIGITAL_WHOOP_LABS_EDUCATION)) {
            aVar = AbstractC10838a.c.f33251a;
        } else {
            aVar = (string == null || AbstractC39414r.m125890i0(string)) ? AbstractC10838a.b.f33250a : new AbstractC10838a.a(string);
        }
        m28553U(aVar);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC28163g0.m85256l(this);
        return AbstractC22387b0.m64387c(this, new C37816b(new C17098f(this, 24), true, -945268872));
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }
}
