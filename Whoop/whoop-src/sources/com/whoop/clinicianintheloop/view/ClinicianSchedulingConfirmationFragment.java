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
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import ko0.C22644b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lc0.C23821c;
import live.hms.video.connection.degredation.C24117a;
import lo0.InterfaceC24586j;
import mw1.C25985a;
import no0.AbstractC26971s;
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
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lko0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lko0/b;", "navRouter", "x", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ClinicianSchedulingConfirmationFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: y */
    public static final int f24390y = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C6198b(this, null, new C24117a(this, 25)));

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.view.ClinicianSchedulingConfirmationFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6198b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24392w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24393x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24394y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6198b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24392w = componentCallbacks;
            this.f24393x = interfaceC35951a;
            this.f24394y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ko0.b] */
        @Override // c93.InterfaceC4339a
        public final C22644b invoke() {
            ComponentCallbacks componentCallbacks = this.f24392w;
            InterfaceC35951a interfaceC35951a = this.f24393x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24394y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22644b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: B */
    private final C22644b m18480B() {
        return (C22644b) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m18481C(ClinicianSchedulingConfirmationFragment clinicianSchedulingConfirmationFragment) {
        return AbstractC15751g.m44431K(clinicianSchedulingConfirmationFragment.requireActivity(), AbstractC5583n.m16799z(clinicianSchedulingConfirmationFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m18482D(ClinicianSchedulingConfirmationFragment clinicianSchedulingConfirmationFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                Bundle arguments = clinicianSchedulingConfirmationFragment.getArguments();
                objM87133R = arguments != null ? arguments.getString("appointmentId") : null;
                if (objM87133R == null) {
                    objM87133R = "";
                }
                c28655q.m87172p0(objM87133R);
            }
            String str = (String) objM87133R;
            boolean zM87157i = c28655q.m87157i(clinicianSchedulingConfirmationFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C23821c(clinicianSchedulingConfirmationFragment, 28);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC26971s.m80788l(str, (Function1) objM87133R2, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m18483E(ClinicianSchedulingConfirmationFragment clinicianSchedulingConfirmationFragment, InterfaceC24586j it) {
        AbstractC22676k.m65750j(it, "it");
        clinicianSchedulingConfirmationFragment.m18480B().m65594e(it);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 12), true, -2140074924));
    }
}
