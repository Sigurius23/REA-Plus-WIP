package com.whoop.labrador.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import ci0.C4726a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import du1.AbstractC12376b;
import du1.C12375a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nt1.InterfaceC27122a;
import p000.C29656q;
import p003a1.C0111j;
import p114eb.AbstractC12939a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p725ot1.Function1;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import ss1.C32948a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/labrador/fragment/LabradorEligibilityFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "D", "()Ljava/lang/String;", "entryPoint", "Lss1/a;", "x", "C", "()Lss1/a;", "analytics", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LabradorEligibilityFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h entryPoint = AbstractC30060g.m92088H(new C0111j(this, 24));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analytics = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9026a(this, null, null));

    /* JADX INFO: renamed from: com.whoop.labrador.fragment.LabradorEligibilityFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9026a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27016w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27017x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27018y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9026a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27016w = componentCallbacks;
            this.f27017x = interfaceC35951a;
            this.f27018y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ss1.a] */
        @Override // c93.InterfaceC4339a
        public final C32948a invoke() {
            ComponentCallbacks componentCallbacks = this.f27016w;
            InterfaceC35951a interfaceC35951a = this.f27017x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27018y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32948a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final String m22491B(LabradorEligibilityFragment labradorEligibilityFragment) {
        String string;
        Bundle arguments = labradorEligibilityFragment.getArguments();
        return (arguments == null || (string = arguments.getString("entryPoint")) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: C */
    private final C32948a m22492C() {
        return (C32948a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final String m22493D() {
        return (String) this.entryPoint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m22494E(LabradorEligibilityFragment labradorEligibilityFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC5583n.m16799z(labradorEligibilityFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C12375a(abstractC12939a0, labradorEligibilityFragment.m22492C());
                c28655q.m87172p0(objM87133R2);
            }
            C12375a c12375a = (C12375a) objM87133R2;
            boolean zM87157i = c28655q.m87157i(abstractC12939a0) | c28655q.m87157i(c12375a) | c28655q.m87157i(labradorEligibilityFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C29656q(abstractC12939a0, c12375a, labradorEligibilityFragment, 25);
                c28655q.m87172p0(objM87133R3);
            }
            Function1.m85796H((p715kotlin.jvm.functions.Function1) objM87133R3, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m22495F(AbstractC12939a0 abstractC12939a0, C12375a c12375a, LabradorEligibilityFragment labradorEligibilityFragment, InterfaceC27122a.c navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (navEvent.equals(InterfaceC27122a.a.f108400a)) {
            abstractC12939a0.m36410z();
        } else {
            if (!navEvent.equals(InterfaceC27122a.b.f108401a)) {
                throw new NoWhenBranchMatchedException();
            }
            c12375a.m34723a(new AbstractC12376b.g(labradorEligibilityFragment.m22493D()));
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 10), true, 451198014));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }
}
