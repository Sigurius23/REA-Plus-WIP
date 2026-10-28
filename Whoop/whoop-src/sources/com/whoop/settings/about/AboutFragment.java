package com.whoop.settings.about;

import android.content.ComponentCallbacks;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.navigation.AbstractC9597d;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fa2.AbstractC14299b;
import fa2.C14298a;
import fa2.C14300c;
import gb2.C15699a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,¨\u0006."}, m65681d2 = {"Lcom/whoop/settings/about/AboutFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "U", "J", "Lcom/whoop/settings/about/a;", NotificationCompat.CATEGORY_EVENT, "R", "(Lcom/whoop/settings/about/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Lgb2/a;", "<set-?>", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/ui/b;", "G", "()Lgb2/a;", "T", "(Lgb2/a;)V", "binding", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "x", "Ll83/h;", "H", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lfa2/c;", "y", "I", "()Lfa2/c;", "navigationRouter", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AboutFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigationRouter;

    /* JADX INFO: renamed from: z */
    static final /* synthetic */ InterfaceC21493z[] f30335z = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(AboutFragment.class, "binding", "getBinding()Lcom/whoop/settings/databinding/FragmentAboutLandingBinding;", 0))};

    /* JADX INFO: renamed from: E */
    public static final int f30334E = 8;

    /* JADX INFO: renamed from: com.whoop.settings.about.AboutFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10090a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30339w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30340x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30341y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10090a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30339w = componentCallbacks;
            this.f30340x = interfaceC35951a;
            this.f30341y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f30339w;
            InterfaceC35951a interfaceC35951a = this.f30340x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30341y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.about.AboutFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10091b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30342w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30343x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30344y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10091b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30342w = componentCallbacks;
            this.f30343x = interfaceC35951a;
            this.f30344y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fa2.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14300c invoke() {
            ComponentCallbacks componentCallbacks = this.f30342w;
            InterfaceC35951a interfaceC35951a = this.f30343x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30344y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14300c.class), interfaceC35951a);
        }
    }

    public AboutFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10090a(this, null, null));
        this.navigationRouter = AbstractC30060g.m92087G(enumC23463i, new C10091b(this, null, null));
    }

    /* JADX INFO: renamed from: G */
    private final C15699a m25318G() {
        return (C15699a) this.binding.getValue(this, f30335z[0]);
    }

    /* JADX INFO: renamed from: H */
    private final FeatureFlagChecker m25319H() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final C14300c m25320I() {
        return (C14300c) this.navigationRouter.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final void m25321J() {
        C15699a c15699aM25318G = m25318G();
        c15699aM25318G.f58944c.m26687n(new C14298a(this, 0));
        ConstraintLayout termOfServiceLayout = c15699aM25318G.f58961t;
        AbstractC22676k.m65749i(termOfServiceLayout, "termOfServiceLayout");
        AbstractC1953c.m5963a(termOfServiceLayout, new C14298a(this, 1));
        ConstraintLayout privacyPolicyLayout = c15699aM25318G.f58953l;
        AbstractC22676k.m65749i(privacyPolicyLayout, "privacyPolicyLayout");
        AbstractC1953c.m5963a(privacyPolicyLayout, new C14298a(this, 2));
        ConstraintLayout openSourceLicensesLayout = c15699aM25318G.f58947f;
        AbstractC22676k.m65749i(openSourceLicensesLayout, "openSourceLicensesLayout");
        AbstractC1953c.m5963a(openSourceLicensesLayout, new C14298a(this, 3));
        ConstraintLayout patentsLayout = c15699aM25318G.f58950i;
        AbstractC22676k.m65749i(patentsLayout, "patentsLayout");
        AbstractC1953c.m5963a(patentsLayout, new C14298a(this, 4));
        ConstraintLayout regulatoryLabelsLayout = c15699aM25318G.f58956o;
        AbstractC22676k.m65749i(regulatoryLabelsLayout, "regulatoryLabelsLayout");
        AbstractC1953c.m5963a(regulatoryLabelsLayout, new C14298a(this, 5));
        ConstraintLayout safetyRegulatoryLayout = c15699aM25318G.f58958q;
        AbstractC22676k.m65749i(safetyRegulatoryLayout, "safetyRegulatoryLayout");
        AbstractC1953c.m5963a(safetyRegulatoryLayout, new C14298a(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m25322K(AboutFragment aboutFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC5583n.m16799z(aboutFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m25323L(AboutFragment aboutFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        aboutFragment.m25329R(AbstractC10092a.f.f30350a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m25324M(AboutFragment aboutFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        aboutFragment.m25329R(AbstractC10092a.c.f30347a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m25325N(AboutFragment aboutFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        aboutFragment.m25329R(AbstractC10092a.a.f30345a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m25326O(AboutFragment aboutFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        aboutFragment.m25329R(AbstractC10092a.b.f30346a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m25327P(AboutFragment aboutFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        aboutFragment.m25329R(AbstractC10092a.d.f30348a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m25328Q(AboutFragment aboutFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        aboutFragment.m25329R(AbstractC10092a.e.f30349a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private final void m25329R(AbstractC10092a event) {
        C14300c c14300cM25320I = m25320I();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        C14300c.m40905b(c14300cM25320I, event, abstractActivityC1340r0RequireActivity, null, new C14298a(this, 7), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m25330S(AboutFragment aboutFragment, String deepLink) {
        AbstractC22676k.m65750j(deepLink, "deepLink");
        AbstractC28163g0.m85259o(aboutFragment).m85338d(Uri.parse(deepLink));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private final void m25331T(C15699a c15699a) {
        this.binding.setValue(this, f30335z[0], c15699a);
    }

    /* JADX INFO: renamed from: U */
    private final void m25332U() {
        C15699a c15699aM25318G = m25318G();
        boolean zIsFeatureEnabled = m25319H().isFeatureEnabled(FeatureFlagRepositoryKt.DEVICE_SETTINGS_REGULATORY_TILES);
        ConstraintLayout regulatoryLabelsLayout = c15699aM25318G.f58956o;
        AbstractC22676k.m65749i(regulatoryLabelsLayout, "regulatoryLabelsLayout");
        regulatoryLabelsLayout.setVisibility(AbstractC14299b.m40904a(m25319H().isFeatureEnabled(FeatureFlagRepositoryKt.REGULATORY_LABELS_SCREEN), AbstractC9597d.m23117i(AbstractC5583n.m16799z(this)), zIsFeatureEnabled) ? 0 : 8);
        ConstraintLayout safetyRegulatoryLayout = c15699aM25318G.f58958q;
        AbstractC22676k.m65749i(safetyRegulatoryLayout, "safetyRegulatoryLayout");
        safetyRegulatoryLayout.setVisibility(zIsFeatureEnabled ? 8 : 0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C15699a c15699aM44178c = C15699a.m44178c(inflater, container, false);
        AbstractC22676k.m65749i(c15699aM44178c, "inflate(...)");
        m25331T(c15699aM44178c);
        ConstraintLayout constraintLayoutM44179b = m25318G().getRoot();
        AbstractC22676k.m65749i(constraintLayoutM44179b, "getRoot(...)");
        return constraintLayoutM44179b;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ConstraintLayout constraintLayoutM44179b = m25318G().getRoot();
        AbstractC22676k.m65749i(constraintLayoutM44179b, "getRoot(...)");
        AbstractC28163g0.m85252h(this, constraintLayoutM44179b, AbstractC37056f.m118958J(m25318G().f58944c), AbstractC37056f.m118958J(m25318G().f58943b), 0, 0, 24, null);
        m25332U();
        m25321J();
    }
}
