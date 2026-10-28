package com.whoop.community.presentation.chat;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1633v0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.community.presentation.chat.NotificationSettingsFragment;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eq0.AbstractC13473h1;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iq0.C20818a0;
import iq0.C20820b0;
import iq0.C20833l;
import iq0.C20846y;
import iq0.EnumC20824d0;
import j93.InterfaceC21493z;
import java.util.WeakHashMap;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p000.AbstractC11266d;
import p114eb.C12962i;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p543v4.C35643b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import vu1.AbstractC36510a;
import xp0.AbstractC38499a0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010+\u001a\u00020&8\u0014X\u0094D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R+\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020,8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, m65681d2 = {"Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "I", "T", "P", "", "notificationType", "R", "(Ljava/lang/String;)V", "Landroid/widget/RadioButton;", "O", "(Ljava/lang/String;)Landroid/widget/RadioButton;", "", "selectedRadioButtonId", "N", "(I)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "", "x", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Leq0/h1;", "<set-?>", "y", "Lcom/whoop/ui/b;", "L", "()Leq0/h1;", "V", "(Leq0/h1;)V", "dataBinding", "Liq0/b0;", "z", "Ll83/h;", "M", "()Liq0/b0;", "notificationSettingsViewModel", "Liq0/a0;", "E", "Leb/i;", "K", "()Liq0/a0;", "args", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NotificationSettingsFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: F */
    static final /* synthetic */ InterfaceC21493z[] f24955F = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(NotificationSettingsFragment.class, "dataBinding", "getDataBinding()Lcom/whoop/community/databinding/FragmentNotificationSettingsBinding;", 0))};

    /* JADX INFO: renamed from: G */
    public static final int f24956G = 8;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "NotificationSettingsFragment";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C10462b dataBinding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h notificationSettingsViewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6336d(this, null, new C6335c(this), null));

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C20818a0.class), new C6334b(this));

    /* JADX INFO: renamed from: com.whoop.community.presentation.chat.NotificationSettingsFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6333a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f24962w;

        public C6333a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f24962w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f24962w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24962w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.chat.NotificationSettingsFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6334b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24963w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6334b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f24963w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f24963w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f24963w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.chat.NotificationSettingsFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6335c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24964w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6335c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24964w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24964w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.chat.NotificationSettingsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6336d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24965w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24966x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24967y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24968z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6336d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24965w = componentCallbacks;
            this.f24966x = interfaceC35951a;
            this.f24967y = interfaceC4339a;
            this.f24968z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, iq0.b0] */
        @Override // c93.InterfaceC4339a
        public final C20820b0 invoke() {
            return AbstractC34132o.m107857B(this.f24965w, this.f24966x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C20820b0.class), this.f24967y, this.f24968z);
        }
    }

    /* JADX INFO: renamed from: I */
    private final void m19275I() {
        View root = m19278L().getRoot();
        C20833l c20833l = new C20833l(this, 2);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(root, c20833l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C16905q1 m19276J(NotificationSettingsFragment notificationSettingsFragment, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "<unused var>");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C35643b c35643bMo47530g = windowInsets.f64864a.mo47530g(1);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        WhoopNewToolbar notificationSettingsToolbar = notificationSettingsFragment.m19278L().f47328b;
        AbstractC22676k.m65749i(notificationSettingsToolbar, "notificationSettingsToolbar");
        ViewGroup.LayoutParams layoutParams = notificationSettingsToolbar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = c35643bMo47530g.f151450b;
        notificationSettingsToolbar.setLayoutParams(marginLayoutParams);
        return windowInsets;
    }

    /* JADX INFO: renamed from: K */
    private final C20818a0 m19277K() {
        return (C20818a0) this.args.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final AbstractC13473h1 m19278L() {
        return (AbstractC13473h1) this.dataBinding.getValue(this, f24955F[0]);
    }

    /* JADX INFO: renamed from: M */
    private final C20820b0 m19279M() {
        return (C20820b0) this.notificationSettingsViewModel.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final String m19280N(int selectedRadioButtonId) {
        if (selectedRadioButtonId == AbstractC38499a0.f165139O) {
            return EnumC20824d0.ALL_NEW_MESSAGES.getDisplayValue();
        }
        return selectedRadioButtonId == AbstractC38499a0.f165117L4 ? EnumC20824d0.MENTIONS_ONLY.getDisplayValue() : EnumC20824d0.NONE.getDisplayValue();
    }

    /* JADX INFO: renamed from: O */
    private final RadioButton m19281O(String notificationType) {
        if (AbstractC22676k.m65745e(notificationType, EnumC20824d0.ALL_NEW_MESSAGES.getDisplayValue())) {
            RadioButton radioButton = m19278L().f47327a.f47205a;
            AbstractC22676k.m65747g(radioButton);
            return radioButton;
        }
        if (AbstractC22676k.m65745e(notificationType, EnumC20824d0.MENTIONS_ONLY.getDisplayValue())) {
            RadioButton radioButton2 = m19278L().f47327a.f47206b;
            AbstractC22676k.m65747g(radioButton2);
            return radioButton2;
        }
        RadioButton radioButton3 = m19278L().f47327a.f47207c;
        AbstractC22676k.m65747g(radioButton3);
        return radioButton3;
    }

    /* JADX INFO: renamed from: P */
    private final void m19282P() {
        observe(m19279M().getNotificationViewState(), new C6333a(new C20846y(this, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m19283Q(NotificationSettingsFragment notificationSettingsFragment, String it) {
        AbstractC22676k.m65750j(it, "it");
        notificationSettingsFragment.m19284R(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private final void m19284R(String notificationType) {
        m19281O(notificationType).setChecked(true);
        m19278L().f47327a.f47208d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: iq0.z
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i13) {
                NotificationSettingsFragment.m19285S(this.f78372a, radioGroup, i13);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final void m19285S(NotificationSettingsFragment notificationSettingsFragment, RadioGroup radioGroup, int i13) {
        AbstractC22676k.m65750j(radioGroup, "radioGroup");
        notificationSettingsFragment.m19279M().m57422I(notificationSettingsFragment.m19280N(radioGroup.getCheckedRadioButtonId()));
    }

    /* JADX INFO: renamed from: T */
    private final void m19286T() {
        m19278L().f47328b.m26687n(new C20846y(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m19287U(NotificationSettingsFragment notificationSettingsFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC5583n.m16799z(notificationSettingsFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: V */
    private final void m19288V(AbstractC13473h1 abstractC13473h1) {
        this.dataBinding.setValue(this, f24955F[0], abstractC13473h1);
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13473h1 abstractC13473h1M38197c = AbstractC13473h1.m38197c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13473h1M38197c, "inflate(...)");
        m19288V(abstractC13473h1M38197c);
        View root = m19278L().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m19275I();
        m19286T();
        m19279M().m57421H(m19277K().m57406a().getId());
        m19279M().m57418D();
        m19278L().getRoot().setBackgroundColor(getResources().getColor(AbstractC36510a.f156000I, null));
        m19282P();
    }
}
