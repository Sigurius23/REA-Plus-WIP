package com.whoop.advancedlabs.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.navigation.AbstractC9597d;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import jd0.C21608a;
import jd0.C21610c;
import kd0.InterfaceC22381a;
import kd1.AbstractC22387b0;
import kf0.AbstractC22433h;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Ljd0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Ljd0/c;", "navRouter", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "x", "C", "()Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "onboardingStatusChecker", "Ljd0/a;", "y", "A", "()Ljd0/a;", "actionRouter", "", "z", "Z", "hasNavigatedToOnboarding", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AdvancedLabsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h onboardingStatusChecker;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean hasNavigatedToOnboarding;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.view.AdvancedLabsFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5907a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23234w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23235x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23236y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5907a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23234w = componentCallbacks;
            this.f23235x = interfaceC35951a;
            this.f23236y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jd0.c] */
        @Override // c93.InterfaceC4339a
        public final C21610c invoke() {
            ComponentCallbacks componentCallbacks = this.f23234w;
            InterfaceC35951a interfaceC35951a = this.f23235x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23236y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21610c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.view.AdvancedLabsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5908b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23237w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23238x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23239y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5908b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23237w = componentCallbacks;
            this.f23238x = interfaceC35951a;
            this.f23239y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.onboarding.OnboardingStatusChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final OnboardingStatusChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f23237w;
            InterfaceC35951a interfaceC35951a = this.f23238x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23239y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(OnboardingStatusChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.view.AdvancedLabsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5909c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23240w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23241x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23242y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5909c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23240w = componentCallbacks;
            this.f23241x = interfaceC35951a;
            this.f23242y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jd0.a] */
        @Override // c93.InterfaceC4339a
        public final C21608a invoke() {
            ComponentCallbacks componentCallbacks = this.f23240w;
            InterfaceC35951a interfaceC35951a = this.f23241x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23242y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21608a.class), interfaceC35951a);
        }
    }

    public AdvancedLabsFragment() {
        C19683b c19683b = new C19683b(this, 16);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C5907a(this, null, c19683b));
        this.onboardingStatusChecker = AbstractC30060g.m92087G(enumC23463i, new C5908b(this, null, null));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C5909c(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C21608a m17685A() {
        return (C21608a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C21610c m17686B() {
        return (C21610c) this.navRouter.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final OnboardingStatusChecker m17687C() {
        return (OnboardingStatusChecker) this.onboardingStatusChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C34911a m17688D(AdvancedLabsFragment advancedLabsFragment) {
        return AbstractC15751g.m44431K(advancedLabsFragment.requireActivity(), AbstractC5583n.m16799z(advancedLabsFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m17689E(AdvancedLabsFragment advancedLabsFragment, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                Bundle arguments = advancedLabsFragment.getArguments();
                String str = null;
                String strM85315e = (arguments == null || (string = arguments.getString("source")) == null) ? null : AbstractC28188o1.m85315e(string);
                if (strM85315e != null && !AbstractC39414r.m125890i0(strM85315e)) {
                    str = strM85315e;
                }
                objM87133R = str == null ? "none" : str;
                c28655q.m87172p0(objM87133R);
            }
            String str2 = (String) objM87133R;
            if (!advancedLabsFragment.hasNavigatedToOnboarding && advancedLabsFragment.m17687C().shouldGoToFeatureEducation(FeatureEducationType.ADVANCED_LABS_EARLY_ACCESS_ONBOARDING)) {
                advancedLabsFragment.hasNavigatedToOnboarding = true;
                advancedLabsFragment.m17686B().m60774e(InterfaceC22381a.y.f87457a);
            }
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = Boolean.valueOf(AbstractC9597d.m23119k(AbstractC5583n.m16799z(advancedLabsFragment)));
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22433h.m64699l(str2, advancedLabsFragment.m17686B(), advancedLabsFragment.m17685A(), !((Boolean) objM87133R2).booleanValue(), c28655q, 6, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        AbstractC28163g0.m85256l(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C17098f(this, 29), true, -1117603044));
    }
}
