package com.whoop.clinicianintheloop.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingFormFragment;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io0.C20713a;
import kd1.AbstractC22387b0;
import ko0.C22645c;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import lo0.InterfaceC24602r;
import mw1.C25985a;
import no0.AbstractC26979w;
import or2.AbstractC28163g0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lko0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "D", "()Lko0/c;", "navRouter", "Lio0/a;", "x", "C", "()Lio0/a;", "analyticsHelper", "y", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ClinicianVideoSchedulingFormFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: z */
    public static final int f24396z = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingFormFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6200b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24399w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24400x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24401y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6200b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24399w = componentCallbacks;
            this.f24400x = interfaceC35951a;
            this.f24401y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ko0.c] */
        @Override // c93.InterfaceC4339a
        public final C22645c invoke() {
            ComponentCallbacks componentCallbacks = this.f24399w;
            InterfaceC35951a interfaceC35951a = this.f24400x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24401y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22645c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingFormFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6201c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24402w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24403x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24404y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6201c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24402w = componentCallbacks;
            this.f24403x = interfaceC35951a;
            this.f24404y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [io0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C20713a invoke() {
            ComponentCallbacks componentCallbacks = this.f24402w;
            InterfaceC35951a interfaceC35951a = this.f24403x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24404y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C20713a.class), interfaceC35951a);
        }
    }

    public ClinicianVideoSchedulingFormFragment() {
        C24117a c24117a = new C24117a(this, 26);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C6200b(this, null, c24117a));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C6201c(this, null, null));
    }

    /* JADX INFO: renamed from: C */
    private final C20713a m18488C() {
        return (C20713a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final C22645c m18489D() {
        return (C22645c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C34911a m18490E(ClinicianVideoSchedulingFormFragment clinicianVideoSchedulingFormFragment) {
        return AbstractC15751g.m44431K(clinicianVideoSchedulingFormFragment.requireActivity(), AbstractC5583n.m16799z(clinicianVideoSchedulingFormFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m18491F(final ClinicianVideoSchedulingFormFragment clinicianVideoSchedulingFormFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                Bundle arguments = clinicianVideoSchedulingFormFragment.getArguments();
                objM87133R = arguments != null ? arguments.getString("usState") : null;
                if (objM87133R == null) {
                    objM87133R = "";
                }
                c28655q.m87172p0(objM87133R);
            }
            String str = (String) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                Bundle arguments2 = clinicianVideoSchedulingFormFragment.getArguments();
                String string = arguments2 != null ? arguments2.getString("intakeResponses") : null;
                String str2 = string != null ? string : "";
                c28655q.m87172p0(str2);
                objM87133R2 = str2;
            }
            String str3 = (String) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                Bundle arguments3 = clinicianVideoSchedulingFormFragment.getArguments();
                String string2 = arguments3 != null ? arguments3.getString("rescheduleAppointmentId") : null;
                c28655q.m87172p0(string2);
                objM87133R3 = string2;
            }
            String str4 = (String) objM87133R3;
            boolean zM87157i = c28655q.m87157i(clinicianVideoSchedulingFormFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                final int i14 = 0;
                objM87133R4 = new Function1(clinicianVideoSchedulingFormFragment) { // from class: no0.u

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ClinicianVideoSchedulingFormFragment f107613x;

                    {
                        this.f107613x = clinicianVideoSchedulingFormFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return ClinicianVideoSchedulingFormFragment.m18492G(this.f107613x, (InterfaceC24602r) obj);
                            default:
                                return ClinicianVideoSchedulingFormFragment.m18493H(this.f107613x, (AnalyticEventModel) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function1 = (Function1) objM87133R4;
            boolean zM87157i2 = c28655q.m87157i(clinicianVideoSchedulingFormFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i2 || objM87133R5 == c28676v0) {
                final int i15 = 1;
                objM87133R5 = new Function1(clinicianVideoSchedulingFormFragment) { // from class: no0.u

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ClinicianVideoSchedulingFormFragment f107613x;

                    {
                        this.f107613x = clinicianVideoSchedulingFormFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return ClinicianVideoSchedulingFormFragment.m18492G(this.f107613x, (InterfaceC24602r) obj);
                            default:
                                return ClinicianVideoSchedulingFormFragment.m18493H(this.f107613x, (AnalyticEventModel) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC26979w.m80886w(str, str3, str4, function1, (Function1) objM87133R5, c28655q, 438, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m18492G(ClinicianVideoSchedulingFormFragment clinicianVideoSchedulingFormFragment, InterfaceC24602r event) {
        AbstractC22676k.m65750j(event, "event");
        clinicianVideoSchedulingFormFragment.m18489D().m65596b(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m18493H(ClinicianVideoSchedulingFormFragment clinicianVideoSchedulingFormFragment, AnalyticEventModel event) {
        AbstractC22676k.m65750j(event, "event");
        clinicianVideoSchedulingFormFragment.m18488C().m56903b(event);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 13), true, 1538449628));
    }
}
