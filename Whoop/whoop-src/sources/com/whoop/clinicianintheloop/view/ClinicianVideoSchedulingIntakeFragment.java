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
import ko0.C22646d;
import ko0.C22647e;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import mw1.C25985a;
import no0.AbstractC26950h0;
import or2.AbstractC28163g0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingIntakeFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lko0/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lko0/e;", "navRouter", "Lko0/d;", "x", "A", "()Lko0/d;", "actionRouter", "y", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ClinicianVideoSchedulingIntakeFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: z */
    public static final int f24406z = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingIntakeFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6203b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24409w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24410x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24411y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6203b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24409w = componentCallbacks;
            this.f24410x = interfaceC35951a;
            this.f24411y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ko0.e] */
        @Override // c93.InterfaceC4339a
        public final C22647e invoke() {
            ComponentCallbacks componentCallbacks = this.f24409w;
            InterfaceC35951a interfaceC35951a = this.f24410x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24411y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22647e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.view.ClinicianVideoSchedulingIntakeFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6204c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24412w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24413x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24414y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6204c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24412w = componentCallbacks;
            this.f24413x = interfaceC35951a;
            this.f24414y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ko0.d] */
        @Override // c93.InterfaceC4339a
        public final C22646d invoke() {
            ComponentCallbacks componentCallbacks = this.f24412w;
            InterfaceC35951a interfaceC35951a = this.f24413x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24414y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22646d.class), interfaceC35951a);
        }
    }

    public ClinicianVideoSchedulingIntakeFragment() {
        C24117a c24117a = new C24117a(this, 27);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C6203b(this, null, c24117a));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C6204c(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C22646d m18496A() {
        return (C22646d) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C22647e m18497B() {
        return (C22647e) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m18498C(ClinicianVideoSchedulingIntakeFragment clinicianVideoSchedulingIntakeFragment) {
        return AbstractC15751g.m44431K(clinicianVideoSchedulingIntakeFragment.requireActivity(), AbstractC5583n.m16799z(clinicianVideoSchedulingIntakeFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m18499D(ClinicianVideoSchedulingIntakeFragment clinicianVideoSchedulingIntakeFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                Bundle arguments = clinicianVideoSchedulingIntakeFragment.getArguments();
                objM87133R = arguments != null ? arguments.getString("appointmentType") : null;
                if (objM87133R == null) {
                    objM87133R = "";
                }
                c28655q.m87172p0(objM87133R);
            }
            String str = (String) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                Bundle arguments2 = clinicianVideoSchedulingIntakeFragment.getArguments();
                objM87133R2 = arguments2 != null ? arguments2.getString("intakeType") : null;
                c28655q.m87172p0(objM87133R2);
            }
            String str2 = (String) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                Bundle arguments3 = clinicianVideoSchedulingIntakeFragment.getArguments();
                String string = arguments3 != null ? arguments3.getString("appointmentId") : null;
                c28655q.m87172p0(string);
                objM87133R3 = string;
            }
            AbstractC26950h0.m80509f(clinicianVideoSchedulingIntakeFragment.m18497B(), clinicianVideoSchedulingIntakeFragment.m18496A(), str, str2, (String) objM87133R3, c28655q, 28032, 0);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 14), true, 1431304332));
    }
}
