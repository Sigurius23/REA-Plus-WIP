package com.whoop.memberdataexport.p063ui;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.memberdataexport.models.MemberDataExportModel;
import com.whoop.settings.AbstractC10105i;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.api.QueryParams;
import j93.InterfaceC21467g;
import jf3.C21647a;
import jv1.AbstractC21968a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mw1.C25985a;
import nr0.C27072e;
import nv1.AbstractC27171e;
import nv1.C27170d;
import or2.C28216y;
import ov1.C28396b;
import p000.AbstractC11266d;
import p114eb.C12962i;
import p161g.AbstractC14917t;
import p161g.C14923z;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u001a\u0010\u0018\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010(¨\u0006,²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;", "Lcom/whoop/settings/i;", "<init>", "()V", "", QueryParams.URL, "Ll83/a0;", "Q", "(Ljava/lang/String;)V", "K", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "onResume", "x", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lov1/b;", "y", "Ll83/h;", "M", "()Lov1/b;", "viewModel", "Lnv1/d;", "z", "Leb/i;", "L", "()Lnv1/d;", "args", "Lor2/y;", "E", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "mdeModel", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SubmissionCompleteFragment extends AbstractC10105i {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String logTag = "SubmissionCompleteFragment";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9065f(this, null, new C9064e(this), null));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27170d.class), new C9063d(this));

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9062c(this, null, null));

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.SubmissionCompleteFragment$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/memberdataexport/ui/SubmissionCompleteFragment$a", "Lg/t;", "Ll83/a0;", "d", "()V", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9060a extends AbstractC14917t {
        public C9060a() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            SubmissionCompleteFragment.this.m22584K();
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.SubmissionCompleteFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C9061b extends C22672i implements Function1 {
        public C9061b(Object obj) {
            super(1, 0, SubmissionCompleteFragment.class, obj, "webLinkClickHandler", "webLinkClickHandler(Ljava/lang/String;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m22591a(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((SubmissionCompleteFragment) this.receiver).m22590Q(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m22591a((String) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.SubmissionCompleteFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9062c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27136w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27137x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27138y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9062c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27136w = componentCallbacks;
            this.f27137x = interfaceC35951a;
            this.f27138y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f27136w;
            InterfaceC35951a interfaceC35951a = this.f27137x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27138y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.SubmissionCompleteFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9063d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f27139w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9063d(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f27139w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f27139w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f27139w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.SubmissionCompleteFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9064e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27140w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9064e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27140w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27140w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.SubmissionCompleteFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9065f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27141w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27142x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27143y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27144z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9065f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27141w = componentCallbacks;
            this.f27142x = interfaceC35951a;
            this.f27143y = interfaceC4339a;
            this.f27144z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ov1.b] */
        @Override // c93.InterfaceC4339a
        public final C28396b invoke() {
            return AbstractC34132o.m107857B(this.f27141w, this.f27142x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28396b.class), this.f27143y, this.f27144z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final void m22584K() {
        AbstractC5583n.m16799z(this).m36375A(AbstractC21968a.f85040c, true);
    }

    /* JADX INFO: renamed from: L */
    private final C27170d m22585L() {
        return (C27170d) this.args.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final C28396b m22586M() {
        return (C28396b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m22587N(SubmissionCompleteFragment submissionCompleteFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C14923z onBackPressedDispatcher = submissionCompleteFragment.requireActivity().getOnBackPressedDispatcher();
            InterfaceC1585g0 viewLifecycleOwner = submissionCompleteFragment.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.m43015a(viewLifecycleOwner, submissionCompleteFragment.new C9060a());
            InterfaceC13058l viewState = submissionCompleteFragment.m22586M().getViewState();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(submissionCompleteFragment.m22585L().m81717e());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(submissionCompleteFragment.m22585L().m81714b());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(submissionCompleteFragment.m22585L().m81713a());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(submissionCompleteFragment.m22585L().m81716d());
            String strM81715c = submissionCompleteFragment.m22585L().m81715c();
            AbstractC22676k.m65749i(strM81715c, "getHelpLink(...)");
            MemberDataExportModel.SubmissionComplete submissionComplete = new MemberDataExportModel.SubmissionComplete(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, strM81715c);
            int i14 = TextResource.$stable;
            MemberDataExportModel memberDataExportModelM22588O = m22588O(AbstractC28683x.m87260n(viewState, submissionComplete, null, c28655q, i14 << 3, 2));
            boolean zM87157i = c28655q.m87157i(submissionCompleteFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C27072e(submissionCompleteFragment, 3);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(submissionCompleteFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C9061b(submissionCompleteFragment);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27171e.m81719b(memberDataExportModelM22588O, interfaceC4339a, (Function1) ((InterfaceC21467g) objM87133R2), c28655q, i14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    private static final MemberDataExportModel m22588O(InterfaceC28670t2 interfaceC28670t2) {
        return (MemberDataExportModel) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m22589P(SubmissionCompleteFragment submissionCompleteFragment) {
        submissionCompleteFragment.m22584K();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final void m22590Q(String url) {
        C28216y externalLinkNavigator = getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85434x(abstractActivityC1340r0RequireActivity, url, true);
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // com.whoop.settings.AbstractC10105i, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 18), true, -1813154269));
    }
}
