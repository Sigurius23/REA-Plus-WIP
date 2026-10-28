package mq0;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1620r;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.recyclerview.widget.RecyclerView;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eq0.AbstractC13469g2;
import eq0.AbstractC13559z0;
import ge3.AbstractC15751g;
import hj0.AbstractC17352k;
import iq0.C20841t;
import j93.InterfaceC21493z;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import mm1.C25694h;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.InterfaceC22666f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import xp0.AbstractC38505d0;
import xp0.AbstractC38507e0;
import xp0.AbstractC38529z;

/* JADX INFO: renamed from: mq0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020!8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R+\u0010-\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, m65681d2 = {"Lmq0/e;", "Lhj0/k;", "<init>", "()V", "Leq0/z0;", "S", "()Leq0/z0;", "Ll83/a0;", "U", "Lmq0/j;", "dataWidgetViewState", "Q", "(Lmq0/j;)V", "Lmq0/c;", "dataWidgetErrorState", "R", "(Lmq0/c;)V", "X", "Y", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "G", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "<set-?>", "H", "Lcom/whoop/ui/b;", "N", "W", "(Leq0/z0;)V", "dataBinding", "Lmq0/i;", "I", "Ll83/h;", "O", "()Lmq0/i;", "dataWidgetViewModel", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "J", "P", "()Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lmq0/a;", "K", "Lmq0/a;", "dataWidgetCategoryAdapter", "L", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25880e extends AbstractC17352k {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String logTag = "DataWidgetFragment";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C10462b dataBinding = AbstractC10463c.m26725b(this, new C25694h(21));

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h dataWidgetViewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h preferenceHelper;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C25876a dataWidgetCategoryAdapter;

    /* JADX INFO: renamed from: M */
    static final /* synthetic */ InterfaceC21493z[] f102077M = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C25880e.class, "dataBinding", "getDataBinding()Lcom/whoop/community/databinding/FragmentDataWidgetBinding;", 0))};

    /* JADX INFO: renamed from: N */
    public static final int f102078N = 8;

    /* JADX INFO: renamed from: mq0.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f102084w;

        public b(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f102084w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f102084w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f102084w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: mq0.e$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f102085w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f102086x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f102087y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f102085w = componentCallbacks;
            this.f102086x = interfaceC35951a;
            this.f102087y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.local.prefs.PreferenceHelper, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final PreferenceHelper invoke() {
            ComponentCallbacks componentCallbacks = this.f102085w;
            InterfaceC35951a interfaceC35951a = this.f102086x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f102087y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PreferenceHelper.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: mq0.e$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f102088w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f102088w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f102088w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: mq0.e$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f102089w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f102090x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f102091y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f102092z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f102089w = componentCallbacks;
            this.f102090x = interfaceC35951a;
            this.f102091y = interfaceC4339a;
            this.f102092z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mq0.i] */
        @Override // c93.InterfaceC4339a
        public final C25884i invoke() {
            return AbstractC34132o.m107857B(this.f102089w, this.f102090x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25884i.class), this.f102091y, this.f102092z);
        }
    }

    public C25880e() {
        C24117a c24117a = new C24117a(this, 16);
        this.dataWidgetViewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new e(this, null, new d(this), c24117a));
        this.preferenceHelper = AbstractC30060g.m92087G(EnumC23463i.f92933w, new c(this, null, null));
        this.dataWidgetCategoryAdapter = new C25876a(m76498P(), new C25879d(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m76493K(AbstractC13559z0 it) {
        AbstractC22676k.m65750j(it, "it");
        it.f47800a.setAdapter(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m76494L(C25880e c25880e, C20841t it) {
        AbstractC22676k.m65750j(it, "it");
        InterfaceC1620r parentFragment = c25880e.getParentFragment();
        AbstractC22676k.m65748h(parentFragment, "null cannot be cast to non-null type com.whoop.community.presentation.datawidget.DataWidgetListener");
        ((InterfaceC25883h) parentFragment).mo5835c(it);
        c25880e.dismiss();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34911a m76495M(C25880e c25880e) {
        return AbstractC15751g.m44431K(c25880e.requireContext());
    }

    /* JADX INFO: renamed from: N */
    private final AbstractC13559z0 m76496N() {
        return (AbstractC13559z0) this.dataBinding.getValue(this, f102077M[0]);
    }

    /* JADX INFO: renamed from: O */
    private final C25884i m76497O() {
        return (C25884i) this.dataWidgetViewModel.getValue();
    }

    /* JADX INFO: renamed from: P */
    private final PreferenceHelper m76498P() {
        return (PreferenceHelper) this.preferenceHelper.getValue();
    }

    /* JADX INFO: renamed from: Q */
    private final void m76499Q(C25885j dataWidgetViewState) {
        this.dataWidgetCategoryAdapter.m76483c(dataWidgetViewState.m76531c(), dataWidgetViewState.getAuthHeader());
    }

    /* JADX INFO: renamed from: R */
    private final void m76500R(C25878c dataWidgetErrorState) {
        AbstractC13469g2 abstractC13469g2 = m76496N().f47801b;
        boolean z4 = dataWidgetErrorState != null;
        if (dataWidgetErrorState != null) {
            abstractC13469g2.f47314a.setText(dataWidgetErrorState.getErrorDescription());
            abstractC13469g2.f47316c.setText(dataWidgetErrorState.getErrorTitle());
            StrokedPillButton dataWidgetTryAgain = abstractC13469g2.f47317d;
            AbstractC22676k.m65749i(dataWidgetTryAgain, "dataWidgetTryAgain");
            dataWidgetTryAgain.setVisibility(dataWidgetErrorState.getIsTryAgainVisible() ? 0 : 8);
            abstractC13469g2.f47315b.setImageDrawable(AbstractC22676k.m65745e(dataWidgetErrorState.getErrorTitle(), getString(AbstractC38505d0.f165620T)) ? getResources().getDrawable(AbstractC38529z.f165824q, null) : getResources().getDrawable(AbstractC38529z.f165816i, null));
        }
        View root = abstractC13469g2.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(z4 ? 0 : 8);
        RecyclerView categoryRecyclerview = m76496N().f47800a;
        AbstractC22676k.m65749i(categoryRecyclerview, "categoryRecyclerview");
        categoryRecyclerview.setVisibility(z4 ? 8 : 0);
    }

    /* JADX INFO: renamed from: S */
    private final AbstractC13559z0 m76501S() {
        AbstractC13559z0 abstractC13559z0M76496N = m76496N();
        ImageView shareDataClose = abstractC13559z0M76496N.f47803d;
        AbstractC22676k.m65749i(shareDataClose, "shareDataClose");
        AbstractC1953c.m5963a(shareDataClose, new C25879d(this, 2));
        abstractC13559z0M76496N.f47800a.setAdapter(this.dataWidgetCategoryAdapter);
        return abstractC13559z0M76496N;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m76502T(C25880e c25880e, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25880e.dismiss();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: U */
    private final void m76503U() {
        observe(m76497O().getDataWidgetViewStateLiveData(), new b(new C25879d(this, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m76504V(C25880e c25880e, C25885j it) {
        AbstractC22676k.m65750j(it, "it");
        c25880e.m76507Y();
        c25880e.m76500R(it.getDataWidgetErrorState());
        c25880e.m76499Q(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    private final void m76505W(AbstractC13559z0 abstractC13559z0) {
        this.dataBinding.setValue(this, f102077M[0], abstractC13559z0);
    }

    /* JADX INFO: renamed from: X */
    private final void m76506X() {
        ThrobberView throbberView = m76496N().f47802c;
        throbberView.m26663f();
        throbberView.setVisibility(0);
    }

    /* JADX INFO: renamed from: Y */
    private final void m76507Y() {
        ThrobberView throbberView = m76496N().f47802c;
        throbberView.m26664g();
        throbberView.setVisibility(8);
    }

    @Override // hj0.AbstractC17352k
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17352k, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, AbstractC38507e0.f165739a);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13559z0 abstractC13559z0M38270c = AbstractC13559z0.m38270c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13559z0M38270c, "inflate(...)");
        m76505W(abstractC13559z0M38270c);
        View root = m76496N().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17352k, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m76501S();
        m76506X();
        m76497O().m76527I();
        m76503U();
    }
}
