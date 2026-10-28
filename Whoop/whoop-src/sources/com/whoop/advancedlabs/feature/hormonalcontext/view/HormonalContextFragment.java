package com.whoop.advancedlabs.feature.hormonalcontext.view;

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
import ic0.C18393a;
import ic0.C18394b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import kd0.InterfaceC22381a;
import kd1.AbstractC22387b0;
import kk1.C22541b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lc0.AbstractC23826h;
import lc0.C23821c;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
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
import ya0.C39355a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/hormonalcontext/view/HormonalContextFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lic0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "D", "()Lic0/b;", "navRouter", "Lic0/a;", "x", "B", "()Lic0/a;", "actionRouter", "Lya0/a;", "y", "C", "()Lya0/a;", "analyticsHelper", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HormonalContextFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.feature.hormonalcontext.view.HormonalContextFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5824a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22992w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22993x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22994y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5824a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22992w = componentCallbacks;
            this.f22993x = interfaceC35951a;
            this.f22994y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ic0.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C18394b invoke() {
            ComponentCallbacks componentCallbacks = this.f22992w;
            InterfaceC35951a interfaceC35951a = this.f22993x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22994y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18394b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.feature.hormonalcontext.view.HormonalContextFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5825b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22995w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22996x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22997y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5825b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22995w = componentCallbacks;
            this.f22996x = interfaceC35951a;
            this.f22997y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ic0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C18393a invoke() {
            ComponentCallbacks componentCallbacks = this.f22995w;
            InterfaceC35951a interfaceC35951a = this.f22996x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22997y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18393a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.feature.hormonalcontext.view.HormonalContextFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5826c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22998w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22999x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23000y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5826c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22998w = componentCallbacks;
            this.f22999x = interfaceC35951a;
            this.f23000y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f22998w;
            InterfaceC35951a interfaceC35951a = this.f22999x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23000y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    public HormonalContextFragment() {
        C19683b c19683b = new C19683b(this, 22);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C5824a(this, null, c19683b));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C5825b(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5826c(this, null, null));
    }

    /* JADX INFO: renamed from: B */
    private final C18393a m17445B() {
        return (C18393a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final C39355a m17446C() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final C18394b m17447D() {
        return (C18394b) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C34911a m17448E(HormonalContextFragment hormonalContextFragment) {
        return AbstractC15751g.m44431K(hormonalContextFragment.requireActivity(), AbstractC5583n.m16799z(hormonalContextFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m17449F(HormonalContextFragment hormonalContextFragment, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                Bundle arguments = hormonalContextFragment.getArguments();
                if (arguments == null || (string = arguments.getString("testId")) == null || (objM87133R = AbstractC28188o1.m85315e(string)) == null) {
                    objM87133R = "";
                }
                c28655q.m87172p0(objM87133R);
            }
            String str = (String) objM87133R;
            C18394b c18394bM17447D = hormonalContextFragment.m17447D();
            C18393a c18393aM17445B = hormonalContextFragment.m17445B();
            boolean zM87157i = c28655q.m87157i(hormonalContextFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C23821c(hormonalContextFragment, 0);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC23826h.m69968f(str, c18394bM17447D, c18393aM17445B, (Function1) objM87133R2, c28655q, 6, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m17450G(HormonalContextFragment hormonalContextFragment, String editType) {
        AbstractC22676k.m65750j(editType, "editType");
        hormonalContextFragment.m17446C().m125496e(new InterfaceC22381a.u0(editType));
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C22541b(this, 14), true, -376207503));
    }
}
