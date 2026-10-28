package com.whoop.feedbacksurvey.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf1.C35946a;
import vf1.C35948c;
import vf3.InterfaceC35951a;
import vv1.C36532c;
import w20.C36727q;
import wf1.InterfaceC37243a;
import yb3.AbstractC39414r;
import yf1.AbstractC39519h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/feedbacksurvey/view/FeedbackSurveyFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lvf1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lvf1/c;", "navRouter", "Lvf1/a;", "x", "A", "()Lvf1/a;", "actionRouter", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class FeedbackSurveyFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: com.whoop.feedbacksurvey.view.FeedbackSurveyFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8731a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26002w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26003x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26004y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8731a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26002w = componentCallbacks;
            this.f26003x = interfaceC35951a;
            this.f26004y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vf1.c] */
        @Override // c93.InterfaceC4339a
        public final C35948c invoke() {
            ComponentCallbacks componentCallbacks = this.f26002w;
            InterfaceC35951a interfaceC35951a = this.f26003x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26004y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35948c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.feedbacksurvey.view.FeedbackSurveyFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8732b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26005w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26006x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26007y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8732b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26005w = componentCallbacks;
            this.f26006x = interfaceC35951a;
            this.f26007y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vf1.a] */
        @Override // c93.InterfaceC4339a
        public final C35946a invoke() {
            ComponentCallbacks componentCallbacks = this.f26005w;
            InterfaceC35951a interfaceC35951a = this.f26006x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26007y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35946a.class), interfaceC35951a);
        }
    }

    public FeedbackSurveyFragment() {
        C36532c c36532c = new C36532c(this, 28);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C8731a(this, null, c36532c));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C8732b(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C35946a m21417A() {
        return (C35946a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C35948c m21418B() {
        return (C35948c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m21419C(FeedbackSurveyFragment feedbackSurveyFragment) {
        return AbstractC15751g.m44431K(feedbackSurveyFragment.requireActivity(), AbstractC5583n.m16799z(feedbackSurveyFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m21420D(FeedbackSurveyFragment feedbackSurveyFragment, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Bundle arguments = feedbackSurveyFragment.getArguments();
            String str = null;
            String strM85315e = (arguments == null || (string = arguments.getString("source")) == null) ? null : AbstractC28188o1.m85315e(string);
            if (strM85315e != null && !AbstractC39414r.m125890i0(strM85315e)) {
                str = strM85315e;
            }
            if (str == null) {
                str = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
            }
            AbstractC39519h.m126222e(new InterfaceC37243a.e(str), feedbackSurveyFragment.m21418B(), feedbackSurveyFragment.m21417A(), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 17), true, 689027685));
    }
}
