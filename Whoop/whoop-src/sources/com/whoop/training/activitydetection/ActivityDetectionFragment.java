package com.whoop.training.activitydetection;

import al2.AbstractC0988d;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import as2.AbstractC1953c;
import bl2.C3372a;
import bl2.C3373b;
import bl2.C3375d;
import bl2.C3376e;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.C10540h;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e50.C12724c;
import el2.C13320a;
import gy0.AbstractC16272a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.WeakHashMap;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p012ab.C0680g0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16899o1;
import p184h5.C16905q1;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p543v4.C35643b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import q83.AbstractC30060g;
import tr2.InterfaceC34116n;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R+\u00102\u001a\u00020*2\u0006\u0010+\u001a\u00020*8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Lcom/whoop/training/activitydetection/ActivityDetectionFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "Q", "N", "L", "", "enabled", "F", "(Z)V", "I", "D", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "logger", "x", "Z", "isActivated", "Lbl2/d;", "y", "Ll83/h;", "H", "()Lbl2/d;", "viewModel", "Lel2/a;", "<set-?>", "z", "Lcom/whoop/ui/b;", "G", "()Lel2/a;", "P", "(Lel2/a;)V", "binding", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ActivityDetectionFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E */
    static final /* synthetic */ InterfaceC21493z[] f31446E = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(ActivityDetectionFragment.class, "binding", "getBinding()Lcom/whoop/training/databinding/FragmentActivityDetectionBinding;", 0))};

    /* JADX INFO: renamed from: F */
    public static final int f31447F = 8;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean isActivated;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("ActivityDetectionFragment");

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10425b(this, null, new C10424a(this), null));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: com.whoop.training.activitydetection.ActivityDetectionFragment$a */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10424a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31452w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10424a(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f31452w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f31452w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.training.activitydetection.ActivityDetectionFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10425b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31453w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31454x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31455y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f31456z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10425b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f31453w = componentCallbacks;
            this.f31454x = interfaceC35951a;
            this.f31455y = interfaceC4339a;
            this.f31456z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, bl2.d] */
        @Override // c93.InterfaceC4339a
        public final C3375d invoke() {
            return AbstractC34132o.m107857B(this.f31453w, this.f31454x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3375d.class), this.f31455y, this.f31456z);
        }
    }

    /* JADX INFO: renamed from: D */
    private final void m26526D() {
        C0680g0 c0680g0 = new C0680g0(this, 11);
        ConstraintLayout constraintLayoutM37427b = m26529G().getRoot();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(constraintLayoutM37427b, c0680g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C16905q1 m26527E(ActivityDetectionFragment activityDetectionFragment, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "<unused var>");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C16899o1 c16899o1 = windowInsets.f64864a;
        C35643b c35643bMo47530g = c16899o1.mo47530g(1);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        C35643b c35643bMo47530g2 = c16899o1.mo47530g(2);
        AbstractC22676k.m65749i(c35643bMo47530g2, "getInsets(...)");
        WhoopNewToolbar activityDetectionToolbar = activityDetectionFragment.m26529G().f46149e;
        AbstractC22676k.m65749i(activityDetectionToolbar, "activityDetectionToolbar");
        activityDetectionToolbar.setPadding(activityDetectionToolbar.getPaddingLeft(), c35643bMo47530g.f151450b, activityDetectionToolbar.getPaddingRight(), activityDetectionToolbar.getPaddingBottom());
        LinearLayout fragmentActivityDetectionSettingsDetails = activityDetectionFragment.m26529G().f46150f;
        AbstractC22676k.m65749i(fragmentActivityDetectionSettingsDetails, "fragmentActivityDetectionSettingsDetails");
        fragmentActivityDetectionSettingsDetails.setPadding(fragmentActivityDetectionSettingsDetails.getPaddingLeft(), fragmentActivityDetectionSettingsDetails.getPaddingTop(), fragmentActivityDetectionSettingsDetails.getPaddingRight(), c35643bMo47530g2.f151452d);
        return C16905q1.f64863b;
    }

    /* JADX INFO: renamed from: F */
    private final void m26528F(boolean enabled) {
        m26529G().f46151g.setChecked(enabled);
        LinearLayout fragmentActivityDetectionSettingsDetails = m26529G().f46150f;
        AbstractC22676k.m65749i(fragmentActivityDetectionSettingsDetails, "fragmentActivityDetectionSettingsDetails");
        fragmentActivityDetectionSettingsDetails.setVisibility(enabled ? 0 : 8);
    }

    /* JADX INFO: renamed from: G */
    private final C13320a m26529G() {
        return (C13320a) this.binding.getValue(this, f31446E[0]);
    }

    /* JADX INFO: renamed from: H */
    private final C3375d m26530H() {
        return (C3375d) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final void m26531I() {
        SwitchCompat fragmentActivityDetectionSettingsSwitch = m26529G().f46151g;
        AbstractC22676k.m65749i(fragmentActivityDetectionSettingsSwitch, "fragmentActivityDetectionSettingsSwitch");
        AbstractC1953c.m5963a(fragmentActivityDetectionSettingsSwitch, new C3372a(this, 2));
        m26529G().f46149e.m26687n(new C3372a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m26532J(ActivityDetectionFragment activityDetectionFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        activityDetectionFragment.m26530H().m9755K(!activityDetectionFragment.isActivated);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m26533K(ActivityDetectionFragment activityDetectionFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC5583n.m16799z(activityDetectionFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private final void m26534L() {
        m26530H().m9754F();
        C12724c<C3376e> c12724cM9753E = m26530H().m9753E();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        c12724cM9753E.m35577c(viewLifecycleOwner, new C3372a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m26535M(ActivityDetectionFragment activityDetectionFragment, C3376e it) {
        C10540h c10540hM27202P;
        AbstractC22676k.m65750j(it, "it");
        if (it.getIsLoading()) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = activityDetectionFragment.getParentFragmentManager().m4140E("PRIVACY_SETTINGS_DIALOG");
            C10540h c10540hM27205S = abstractComponentCallbacksC1320m0M4140E instanceof C10540h ? (C10540h) abstractComponentCallbacksC1320m0M4140E : null;
            if (c10540hM27205S == null) {
                c10540hM27205S = C10540h.m27205S();
            }
            c10540hM27205S.m27211X(activityDetectionFragment.getParentFragmentManager(), "PRIVACY_SETTINGS_DIALOG", activityDetectionFragment.getString(AbstractC0988d.f3690j), "");
        }
        if (it.getSaveComplete() && (c10540hM27202P = C10540h.m27202P(activityDetectionFragment.getParentFragmentManager(), "PRIVACY_SETTINGS_DIALOG")) != null) {
            c10540hM27202P.dismiss();
        }
        activityDetectionFragment.isActivated = it.getIsActivityDetectionEnabled();
        activityDetectionFragment.m26528F(it.getIsActivityDetectionEnabled());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private final void m26536N() {
        m26530H().getScreenContentStateLiveData().observe(getViewLifecycleOwner(), new C10426a(new C3372a(this, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m26537O(ActivityDetectionFragment activityDetectionFragment, C3373b c3373b) {
        activityDetectionFragment.m26529G().f46146b.setImageResource(c3373b.getActivityDetectionGraphImage());
        activityDetectionFragment.m26529G().f46147c.setText(activityDetectionFragment.getString(c3373b.getDescriptionString()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private final void m26538P(C13320a c13320a) {
        this.binding.setValue(this, f31446E[0], c13320a);
    }

    /* JADX INFO: renamed from: Q */
    private final void m26539Q() {
        m26529G().f46149e.setBackArrowResource(AbstractC16272a.f61961M1);
        m26529G().f46149e.m26686l();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        AbstractC28163g0.m85250f(this, this.logger);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C13320a c13320aM37426c = C13320a.m37426c(inflater, container, false);
        AbstractC22676k.m65749i(c13320aM37426c, "inflate(...)");
        m26538P(c13320aM37426c);
        ConstraintLayout constraintLayoutM37427b = m26529G().getRoot();
        AbstractC22676k.m65749i(constraintLayoutM37427b, "getRoot(...)");
        return constraintLayoutM37427b;
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
        m26539Q();
        m26536N();
        m26534L();
        m26531I();
        m26526D();
    }
}
