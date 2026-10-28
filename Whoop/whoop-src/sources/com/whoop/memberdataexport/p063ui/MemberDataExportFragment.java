package com.whoop.memberdataexport.p063ui;

import android.content.ComponentCallbacks;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.design.util.TextResource;
import com.whoop.memberdataexport.models.MemberDataExportModel;
import d13.AbstractC11478a;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21467g;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mw1.C25985a;
import nr0.C27072e;
import nv1.AbstractC27169c;
import or2.AbstractC28163g0;
import or2.C28216y;
import ov1.AbstractC28395a;
import ov1.C28396b;
import p000.AbstractC11266d;
import p114eb.C12969k0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)¨\u0006-²\u0006\f\u0010,\u001a\u00020+8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", QueryParams.URL, "Ll83/a0;", "J", "(Ljava/lang/String;)V", "uriStr", "E", NotificationCompat.CATEGORY_EMAIL, "submissionLoadingDisplay", "submissionSuccessDisplay", "I", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "onResume", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "log", "Lov1/b;", "x", "Ll83/h;", "D", "()Lov1/b;", "viewModel", "Lor2/y;", "y", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "viewState", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MemberDataExportFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n log = InterfaceC34116n.INSTANCE.m107848a("MemberDataExportFragment");

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9059f(this, null, new C9058e(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9057d(this, null, null));

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.MemberDataExportFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C9054a extends C22672i implements Function1 {
        public C9054a(Object obj) {
            super(1, 0, MemberDataExportFragment.class, obj, "webLinkClickHandler", "webLinkClickHandler(Ljava/lang/String;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m22577a(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((MemberDataExportFragment) this.receiver).m22574J(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m22577a((String) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.MemberDataExportFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C9055b extends C22672i implements Function1 {
        public C9055b(Object obj) {
            super(1, 0, MemberDataExportFragment.class, obj, "navigateToDeepLink", "navigateToDeepLink(Ljava/lang/String;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m22578a(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((MemberDataExportFragment) this.receiver).m22569E(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m22578a((String) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.MemberDataExportFragment$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C9056c extends C22672i implements Function3 {
        public C9056c(Object obj) {
            super(3, 0, MemberDataExportFragment.class, obj, "submitButtonClickHandler", "submitButtonClickHandler(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m22579a(String p13, String p14, String p15) {
            AbstractC22676k.m65750j(p13, "p0");
            AbstractC22676k.m65750j(p14, "p1");
            AbstractC22676k.m65750j(p15, "p2");
            ((MemberDataExportFragment) this.receiver).m22573I(p13, p14, p15);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m22579a((String) obj, (String) obj2, (String) obj3);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.MemberDataExportFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9057d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27123w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27124x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27125y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9057d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27123w = componentCallbacks;
            this.f27124x = interfaceC35951a;
            this.f27125y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f27123w;
            InterfaceC35951a interfaceC35951a = this.f27124x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27125y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.MemberDataExportFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9058e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27126w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9058e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27126w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27126w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.MemberDataExportFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9059f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27127w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27128x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27129y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27130z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9059f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27127w = componentCallbacks;
            this.f27128x = interfaceC35951a;
            this.f27129y = interfaceC4339a;
            this.f27130z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ov1.b] */
        @Override // c93.InterfaceC4339a
        public final C28396b invoke() {
            return AbstractC34132o.m107857B(this.f27127w, this.f27128x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28396b.class), this.f27129y, this.f27130z);
        }
    }

    /* JADX INFO: renamed from: D */
    private final C28396b m22568D() {
        return (C28396b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final void m22569E(String uriStr) {
        Uri uri = Uri.parse(uriStr);
        C12969k0 c12969k0M30854f = AbstractC11478a.m30854f(uri, "uri", uri, null, null);
        if (AbstractC5583n.m16799z(this).m36396k().mo36468j(c12969k0M30854f) != null) {
            AbstractC5583n.m16799z(this).m36404s(c12969k0M30854f);
        } else {
            AbstractC5583n.m16799z(this).m36410z();
            this.log.mo85222m(AbstractC11266d.m30461o("Deep Link not found: ", uriStr), new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m22570F(MemberDataExportFragment memberDataExportFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC13058l viewState = memberDataExportFragment.m22568D().getViewState();
            MemberDataExportModel.LoadingEmptyMemberDataExportModel loadingEmptyMemberDataExportModel = MemberDataExportModel.LoadingEmptyMemberDataExportModel.INSTANCE;
            int i14 = TextResource.$stable;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewState, loadingEmptyMemberDataExportModel, null, c28655q, i14 << 3, 2);
            if (m22571G(interfaceC28601c1M87260n) instanceof MemberDataExportModel.LoadingEmptyMemberDataExportModel) {
                memberDataExportFragment.m22568D().m86089n(AbstractC28395a.a.f114564a);
            }
            MemberDataExportModel memberDataExportModelM22571G = m22571G(interfaceC28601c1M87260n);
            boolean zM87157i = c28655q.m87157i(memberDataExportFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C27072e(memberDataExportFragment, 2);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(memberDataExportFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C9054a(memberDataExportFragment);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) ((InterfaceC21467g) objM87133R2);
            boolean zM87157i3 = c28655q.m87157i(memberDataExportFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C9055b(memberDataExportFragment);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) ((InterfaceC21467g) objM87133R3);
            boolean zM87157i4 = c28655q.m87157i(memberDataExportFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C9056c(memberDataExportFragment);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC27169c.m81706s(memberDataExportModelM22571G, interfaceC4339a, function1, function2, (Function3) ((InterfaceC21467g) objM87133R4), c28655q, i14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final MemberDataExportModel m22571G(InterfaceC28670t2 interfaceC28670t2) {
        return (MemberDataExportModel) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m22572H(MemberDataExportFragment memberDataExportFragment) {
        AbstractC5583n.m16799z(memberDataExportFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final void m22573I(String email, String submissionLoadingDisplay, String submissionSuccessDisplay) {
        AbstractC9070a.a aVarM22600a = AbstractC9070a.m22600a(email, submissionLoadingDisplay, submissionSuccessDisplay);
        AbstractC22676k.m65749i(aVarM22600a, "memberdataexportActionMe…ortSubmitmdefragment(...)");
        AbstractC28163g0.m85259o(this).m85340f(aVarM22600a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final void m22574J(String url) {
        C28216y externalLinkNavigator = getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85434x(abstractActivityC1340r0RequireActivity, url, true);
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 17), true, -2094778115));
    }
}
