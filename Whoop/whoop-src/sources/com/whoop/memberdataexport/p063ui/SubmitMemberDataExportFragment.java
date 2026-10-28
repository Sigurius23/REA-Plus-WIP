package com.whoop.memberdataexport.p063ui;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.memberdataexport.models.MemberDataExportModel;
import com.whoop.settings.AbstractC10105i;
import ec3.InterfaceC13058l;
import j93.InterfaceC21467g;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mw1.C25985a;
import nv1.AbstractC27173g;
import nv1.C27172f;
import nv1.C27174h;
import or2.AbstractC28163g0;
import ov1.AbstractC28395a;
import ov1.C28396b;
import p000.AbstractC11266d;
import p114eb.C12962i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
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
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'²\u0006\f\u0010&\u001a\u00020%8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;", "Lcom/whoop/settings/i;", "<init>", "()V", "Lnv1/h;", "unavailableBodyArgs", "Ll83/a0;", "M", "(Lnv1/h;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "onResume", "", "x", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lov1/b;", "y", "Ll83/h;", "J", "()Lov1/b;", "viewModel", "Lnv1/f;", "z", "Leb/i;", "I", "()Lnv1/f;", "args", "Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "mdeModel", "member-data-export_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SubmitMemberDataExportFragment extends AbstractC10105i {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String logTag = "SubmitMemberDataExportFragment";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9069d(this, null, new C9068c(this), null));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27172f.class), new C9067b(this));

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.SubmitMemberDataExportFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C9066a extends C22672i implements Function1 {
        public C9066a(Object obj) {
            super(1, 0, SubmitMemberDataExportFragment.class, obj, "submissionIsComplete", "submissionIsComplete(Lcom/whoop/memberdataexport/ui/UnavailableBodyArgs;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m22599a(C27174h p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((SubmitMemberDataExportFragment) this.receiver).m22598M(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m22599a((C27174h) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.SubmitMemberDataExportFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9067b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f27148w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9067b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f27148w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f27148w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f27148w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.SubmitMemberDataExportFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9068c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27149w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9068c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27149w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27149w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.memberdataexport.ui.SubmitMemberDataExportFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9069d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27150w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27151x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27152y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27153z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9069d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27150w = componentCallbacks;
            this.f27151x = interfaceC35951a;
            this.f27152y = interfaceC4339a;
            this.f27153z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ov1.b] */
        @Override // c93.InterfaceC4339a
        public final C28396b invoke() {
            return AbstractC34132o.m107857B(this.f27150w, this.f27151x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28396b.class), this.f27152y, this.f27153z);
        }
    }

    /* JADX INFO: renamed from: I */
    private final C27172f m22594I() {
        return (C27172f) this.args.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final C28396b m22595J() {
        return (C28396b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m22596K(SubmitMemberDataExportFragment submitMemberDataExportFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC13058l viewState = submitMemberDataExportFragment.m22595J().getViewState();
            MemberDataExportModel.SubmittingMemberDataExportModel submittingMemberDataExportModel = new MemberDataExportModel.SubmittingMemberDataExportModel(AbstractC8693b.m21278l(submitMemberDataExportFragment.m22594I().m81722b()), AbstractC8693b.m21278l(submitMemberDataExportFragment.m22594I().m81723c()));
            int i14 = TextResource.$stable;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewState, submittingMemberDataExportModel, null, c28655q, i14 << 3, 2);
            if (m22597L(interfaceC28601c1M87260n) instanceof MemberDataExportModel.SubmittingMemberDataExportModel) {
                C28396b c28396bM22595J = submitMemberDataExportFragment.m22595J();
                String strM81721a = submitMemberDataExportFragment.m22594I().m81721a();
                AbstractC22676k.m65749i(strM81721a, "getEmail(...)");
                c28396bM22595J.m86089n(new AbstractC28395a.b(strM81721a));
            }
            MemberDataExportModel memberDataExportModelM22597L = m22597L(interfaceC28601c1M87260n);
            String strM81723c = submitMemberDataExportFragment.m22594I().m81723c();
            AbstractC22676k.m65749i(strM81723c, "getSubmissionSuccessDisplay(...)");
            boolean zM87157i = c28655q.m87157i(submitMemberDataExportFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C9066a(submitMemberDataExportFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27173g.m81731h(memberDataExportModelM22597L, strM81723c, (Function1) ((InterfaceC21467g) objM87133R), c28655q, i14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final MemberDataExportModel m22597L(InterfaceC28670t2 interfaceC28670t2) {
        return (MemberDataExportModel) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final void m22598M(C27174h unavailableBodyArgs) {
        AbstractC9071b.a aVarM22604a = AbstractC9071b.m22604a(unavailableBodyArgs.getTitle(), unavailableBodyArgs.getHeadline(), unavailableBodyArgs.getBody(), unavailableBodyArgs.getHelpText(), unavailableBodyArgs.getHelpLink());
        AbstractC22676k.m65749i(aVarM22604a, "memberdataexportActionMe…sioncompletefragment(...)");
        AbstractC28163g0.m85259o(this).m85340f(aVarM22604a);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 19), true, -300940915));
    }
}
