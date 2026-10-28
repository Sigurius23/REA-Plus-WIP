package com.whoop.shepherd.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fe2.C14416a;
import ge2.C15737b;
import ge2.InterfaceC15736a;
import ge2.InterfaceC15738c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nr0.C27072e;
import oe2.C27878c;
import or2.AbstractC28163g0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p558vp.AbstractC36259c;
import p602x1.C37816b;
import p709he2.AbstractC17218d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lge2/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lge2/b;", "viewModel", "Lge2/c;", "viewState", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ShepherdSubmitTermsOfUseFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10197b(this, null, new C10196a(this), null));

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdSubmitTermsOfUseFragment$a */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10196a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30814w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10196a(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30814w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30814w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdSubmitTermsOfUseFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10197b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30815w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30816x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30817y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30818z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10197b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30815w = componentCallbacks;
            this.f30816x = interfaceC35951a;
            this.f30817y = interfaceC4339a;
            this.f30818z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ge2.b] */
        @Override // c93.InterfaceC4339a
        public final C15737b invoke() {
            return AbstractC34132o.m107857B(this.f30815w, this.f30816x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15737b.class), this.f30817y, this.f30818z);
        }
    }

    /* JADX INFO: renamed from: B */
    private final C15737b m25885B() {
        return (C15737b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m25886C(ShepherdSubmitTermsOfUseFragment shepherdSubmitTermsOfUseFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C14416a(AbstractC5583n.m16799z(shepherdSubmitTermsOfUseFragment));
                c28655q.m87172p0(objM87133R);
            }
            C14416a c14416a = (C14416a) objM87133R;
            InterfaceC15738c interfaceC15738cM25887D = m25887D(AbstractC36259c.m115714z(shepherdSubmitTermsOfUseFragment.m25885B().getViewState(), InterfaceC15738c.b.f59338a, c28655q, 48));
            boolean zM87157i = c28655q.m87157i(c14416a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C27072e(c14416a, 14);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            boolean zM87157i2 = c28655q.m87157i(shepherdSubmitTermsOfUseFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C27072e(shepherdSubmitTermsOfUseFragment, 15);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC17218d.m48682e(interfaceC15738cM25887D, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final InterfaceC15738c m25887D(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC15738c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m25888E(C14416a c14416a) {
        c14416a.m41112a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m25889F(ShepherdSubmitTermsOfUseFragment shepherdSubmitTermsOfUseFragment) {
        shepherdSubmitTermsOfUseFragment.m25885B().m44371l(InterfaceC15736a.a.f59328a);
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 3), true, -531416504));
    }
}
