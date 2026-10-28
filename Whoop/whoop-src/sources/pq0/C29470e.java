package pq0;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.viewpager2.widget.ViewPager2;
import as2.AbstractC1953c;
import c33.C3936c;
import c93.InterfaceC4339a;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.google.android.material.tabs.TabLayout;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.domain.model.teams.Widget;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eq0.AbstractC13453d1;
import eq0.AbstractC13479i2;
import iq0.C20838q;
import j93.InterfaceC21493z;
import java.util.List;
import jf3.C21647a;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import live.hms.video.factories.C24148c;
import m83.AbstractC25247g0;
import p161g.AbstractC14917t;
import p190hc.AbstractC17145h;
import p377or.C28134h;
import p429ql.AbstractC30457c;
import p464rl.InterfaceC31508c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.InterfaceC22666f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import vu1.AbstractC36510a;
import wb3.AbstractC37056f;
import xp0.AbstractC38505d0;
import xp0.AbstractC38507e0;
import z82.C40191e;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: pq0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007*\u0001J\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001OB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0019\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010-\u001a\u00020(8\u0016X\u0096D¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R+\u0010:\u001a\u0002022\u0006\u00103\u001a\u0002028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006P"}, m65681d2 = {"Lpq0/e;", "Lpq0/b;", "<init>", "()V", "", "isTeamListVisible", "Ll83/a0;", "k0", "(Z)V", "S", "b0", "d0", "Lpq0/g;", "globalShareErrorState", "a0", "(Lpq0/g;)V", "R", "W", "Landroid/graphics/Bitmap;", "bitmap", "h0", "(Landroid/graphics/Bitmap;)V", "visible", "g0", "i0", "j0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "F", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lz82/e;", "G", "Lz82/e;", "eventDispatcher", "Leq0/d1;", "<set-?>", "H", "Lcom/whoop/ui/b;", "T", "()Leq0/d1;", "f0", "(Leq0/d1;)V", "fragmentGlobalShareDialogBinding", "Lpq0/f;", "I", "Ll83/h;", "U", "()Lpq0/f;", "globalShareDialogViewModel", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "J", "V", "()Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lpq0/j;", "K", "Lpq0/j;", "widgetViewAdapter", "pq0/e$b", "L", "Lpq0/e$b;", "backPressedCallback", "M", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29470e extends AbstractC29467b {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String logTag = "GlobalShareDialogFragment";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C10462b fragmentGlobalShareDialogBinding;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h globalShareDialogViewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h preferenceHelper;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C29475j widgetViewAdapter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final b backPressedCallback;

    /* JADX INFO: renamed from: N */
    static final /* synthetic */ InterfaceC21493z[] f119665N = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C29470e.class, "fragmentGlobalShareDialogBinding", "getFragmentGlobalShareDialogBinding()Lcom/whoop/community/databinding/FragmentGlobalShareDialogBinding;", 0))};

    /* JADX INFO: renamed from: O */
    public static final int f119666O = 8;

    /* JADX INFO: renamed from: pq0.e$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"pq0/e$b", "Lg/t;", "Ll83/a0;", "d", "()V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC14917t {
        public b() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            C29470e.this.m89978k0(false);
        }
    }

    /* JADX INFO: renamed from: pq0.e$c */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"pq0/e$c", "Lql/c;", "Landroid/graphics/Bitmap;", "resource", "Lrl/c;", "transition", "Ll83/a0;", "i", "(Landroid/graphics/Bitmap;Lrl/c;)V", "Landroid/graphics/drawable/Drawable;", "placeholder", "e", "(Landroid/graphics/drawable/Drawable;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC30457c {
        public c() {
            super(0);
        }

        @Override // p429ql.InterfaceC30463i
        /* JADX INFO: renamed from: e */
        public void mo5839e(Drawable placeholder) {
        }

        @Override // p429ql.InterfaceC30463i
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo5838b(Bitmap resource, InterfaceC31508c transition) {
            AbstractC22676k.m65750j(resource, "resource");
            C29470e.this.m89975h0(resource);
        }
    }

    /* JADX INFO: renamed from: pq0.e$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"pq0/e$d", "Lhc/h;", "", "position", "Ll83/a0;", "onPageSelected", "(I)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC17145h {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC13453d1 f119677b;

        public d(AbstractC13453d1 abstractC13453d1) {
            this.f119677b = abstractC13453d1;
        }

        @Override // p190hc.AbstractC17145h
        public void onPageSelected(int position) {
            C40191e c40191e = C29470e.this.eventDispatcher;
            AbstractC1692i1 adapter = this.f119677b.f47203h.getAdapter();
            AbstractC22676k.m65748h(adapter, "null cannot be cast to non-null type com.whoop.community.presentation.share.WidgetViewAdapter");
            c40191e.m129039j0("Swipe", "Share Data - View Data", AbstractC25247g0.m73989X(new C23465k("Data_Attached", ((C29475j) adapter).m90009a(position))));
        }
    }

    /* JADX INFO: renamed from: pq0.e$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f119678w;

        public e(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f119678w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f119678w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f119678w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: pq0.e$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f119679w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f119680x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f119681y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f119679w = componentCallbacks;
            this.f119680x = interfaceC35951a;
            this.f119681y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.local.prefs.PreferenceHelper, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final PreferenceHelper invoke() {
            ComponentCallbacks componentCallbacks = this.f119679w;
            InterfaceC35951a interfaceC35951a = this.f119680x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f119681y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PreferenceHelper.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: pq0.e$g */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f119682w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f119682w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f119682w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f119682w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: pq0.e$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f119683w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f119684x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f119685y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f119686z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f119683w = abstractComponentCallbacksC1320m0;
            this.f119684x = interfaceC35951a;
            this.f119685y = interfaceC4339a;
            this.f119686z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, pq0.f] */
        @Override // c93.InterfaceC4339a
        public final C29471f invoke() {
            return AbstractC37056f.m118952D(this.f119683w, this.f119684x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29471f.class), this.f119685y, this.f119686z);
        }
    }

    public C29470e() {
        C40191e c40191eMo128972l = ((InterfaceC40188b) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null)).getDispatcher();
        AbstractC22676k.m65749i(c40191eMo128972l, "getEventDispatcher(...)");
        this.eventDispatcher = c40191eMo128972l;
        this.fragmentGlobalShareDialogBinding = AbstractC10463c.m26726c(this, null, 1, null);
        this.globalShareDialogViewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new h(this, null, new g(this), null));
        this.preferenceHelper = AbstractC30060g.m92087G(EnumC23463i.f92933w, new f(this, null, null));
        this.widgetViewAdapter = new C29475j(m89963V());
        this.backPressedCallback = new b();
    }

    /* JADX INFO: renamed from: R */
    private final void m89959R() {
        AbstractC13453d1 abstractC13453d1M89961T = m89961T();
        StrokedPillButton strokedPillButton = abstractC13453d1M89961T.f47197b;
        Boolean bool = Boolean.TRUE;
        int i13 = AbstractC36510a.f156038q;
        strokedPillButton.m27362b(bool, i13, i13);
        StrokedPillButton strokedPillButton2 = abstractC13453d1M89961T.f47198c;
        int i14 = AbstractC36510a.f156006O;
        strokedPillButton2.m27362b(bool, i14, i14);
    }

    /* JADX INFO: renamed from: S */
    private final void m89960S() {
        m89976i0();
        m89962U().m89990H(String.valueOf(requireArguments().get("GlobalShareDialogSelectedDate")), String.valueOf(requireArguments().get("GlobalShareDialogSelectedPillar")));
    }

    /* JADX INFO: renamed from: T */
    private final AbstractC13453d1 m89961T() {
        return (AbstractC13453d1) this.fragmentGlobalShareDialogBinding.getValue(this, f119665N[0]);
    }

    /* JADX INFO: renamed from: U */
    private final C29471f m89962U() {
        return (C29471f) this.globalShareDialogViewModel.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final PreferenceHelper m89963V() {
        return (PreferenceHelper) this.preferenceHelper.getValue();
    }

    /* JADX INFO: renamed from: W */
    private final void m89964W() {
        AbstractC13453d1 abstractC13453d1M89961T = m89961T();
        ImageView viewShareClose = abstractC13453d1M89961T.f47202g;
        AbstractC22676k.m65749i(viewShareClose, "viewShareClose");
        AbstractC1953c.m5963a(viewShareClose, new C29469d(this, 1));
        StrokedPillButton globalShareSendToTeam = abstractC13453d1M89961T.f47197b;
        AbstractC22676k.m65749i(globalShareSendToTeam, "globalShareSendToTeam");
        AbstractC1953c.m5963a(globalShareSendToTeam, new C29469d(this, 2));
        StrokedPillButton globalShareShareVia = abstractC13453d1M89961T.f47198c;
        AbstractC22676k.m65749i(globalShareShareVia, "globalShareShareVia");
        AbstractC1953c.m5963a(globalShareShareVia, new C29469d(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m89965X(C29470e c29470e, View it) {
        AbstractC22676k.m65750j(it, "it");
        c29470e.dismiss();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m89966Y(C29470e c29470e, View it) {
        List<Widget> listM90008d;
        AbstractC22676k.m65750j(it, "it");
        C29474i c29474i = (C29474i) c29470e.m89962U().getShareWidgetDialogViewStateLiveData().getValue();
        if (c29474i != null && (listM90008d = c29474i.m90008d()) != null && !listM90008d.isEmpty()) {
            Widget widget = listM90008d.get(c29470e.m89961T().f47203h.getCurrentItem());
            c29470e.eventDispatcher.m129039j0("Press", "Share Data - Send to Team", AbstractC25247g0.m73989X(new C23465k("Data_Attached", widget)));
            c29470e.m89962U().m89991I(widget);
            c29470e.m89978k0(true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m89967Z(C29470e c29470e, View it) {
        List<Widget> listM90008d;
        AbstractC22676k.m65750j(it, "it");
        C29474i c29474i = (C29474i) c29470e.m89962U().getShareWidgetDialogViewStateLiveData().getValue();
        if (c29474i != null && (listM90008d = c29474i.m90008d()) != null) {
            Widget widget = listM90008d.get(c29470e.m89961T().f47203h.getCurrentItem());
            c29470e.eventDispatcher.m129039j0("Press", "Share Data - Share Externally", AbstractC25247g0.m73989X(new C23465k("Data_Attached", widget.getCollection().name())));
            C4964f c4964fM15546j = ComponentCallbacks2C4960b.m15529e(c29470e.requireContext()).m15546j();
            c4964fM15546j.f20321Y = C20838q.f78353a.m57557b(widget.getImageUrl(), c29470e.m89962U().m89987E(), c29470e.m89963V());
            c4964fM15546j.f20323a0 = true;
            c4964fM15546j.m15538z(c29470e.new c());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    private final void m89968a0(C29472g globalShareErrorState) {
        AbstractC13479i2 abstractC13479i2 = m89961T().f47196a;
        boolean z4 = globalShareErrorState != null;
        if (globalShareErrorState != null) {
            abstractC13479i2.f47350a.setText(getString(globalShareErrorState.getErrorDescription()));
            abstractC13479i2.f47352c.setText(getString(globalShareErrorState.getErrorTitle()));
            StrokedPillButton globalShareRetry = abstractC13479i2.f47353d;
            AbstractC22676k.m65749i(globalShareRetry, "globalShareRetry");
            globalShareRetry.setVisibility(globalShareErrorState.getIsRetryVisible() ? 0 : 8);
            abstractC13479i2.f47351b.setImageDrawable(getResources().getDrawable(globalShareErrorState.getErrorIcon(), null));
            StrokedPillButton strokedPillButton = m89961T().f47197b;
            AbstractC22676k.m65747g(strokedPillButton);
            strokedPillButton.setVisibility(globalShareErrorState.getShareButtonVisible() ? 0 : 8);
            if (globalShareErrorState.getShareButtonEnable()) {
                Boolean bool = Boolean.TRUE;
                int i13 = AbstractC36510a.f156038q;
                strokedPillButton.m27362b(bool, i13, i13);
            } else {
                Boolean bool2 = Boolean.FALSE;
                int i14 = AbstractC36510a.f156030i;
                strokedPillButton.m27362b(bool2, i14, i14);
            }
            StrokedPillButton strokedPillButton2 = m89961T().f47198c;
            AbstractC22676k.m65747g(strokedPillButton2);
            strokedPillButton2.setVisibility(globalShareErrorState.getShareButtonVisible() ? 0 : 8);
            if (globalShareErrorState.getShareButtonEnable()) {
                Boolean bool3 = Boolean.TRUE;
                int i15 = AbstractC36510a.f156038q;
                strokedPillButton2.m27362b(bool3, i15, i15);
            } else {
                Boolean bool4 = Boolean.FALSE;
                int i16 = AbstractC36510a.f156030i;
                strokedPillButton2.m27362b(bool4, i16, i16);
            }
        }
        View root = abstractC13479i2.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(z4 ? 0 : 8);
        ViewPager2 widgetPager = m89961T().f47203h;
        AbstractC22676k.m65749i(widgetPager, "widgetPager");
        widgetPager.setVisibility(z4 ? 8 : 0);
    }

    /* JADX INFO: renamed from: b0 */
    private final void m89969b0() {
        AbstractC13453d1 abstractC13453d1M89961T = m89961T();
        abstractC13453d1M89961T.f47203h.setAdapter(this.widgetViewAdapter);
        new C3936c(abstractC13453d1M89961T.f47204i, abstractC13453d1M89961T.f47203h, new C24148c(27)).m11985b();
        abstractC13453d1M89961T.f47203h.m5508b(new d(abstractC13453d1M89961T));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final void m89970c0(C28134h c28134h, int i13) {
        AbstractC22676k.m65750j(c28134h, "<unused var>");
    }

    /* JADX INFO: renamed from: d0 */
    private final void m89971d0() {
        observe(m89962U().getShareWidgetDialogViewStateLiveData(), new e(new C29469d(this, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m89972e0(C29470e c29470e, C29474i it) {
        AbstractC22676k.m65750j(it, "it");
        c29470e.m89959R();
        c29470e.m89968a0(it.getGlobalShareErrorState());
        TabLayout widgetTabLayout = c29470e.m89961T().f47204i;
        AbstractC22676k.m65749i(widgetTabLayout, "widgetTabLayout");
        widgetTabLayout.setVisibility(it.getShowWidgetTab() ? 0 : 8);
        c29470e.widgetViewAdapter.m90012d(it.m90008d(), it.getAuthHeader());
        c29470e.m89977j0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f0 */
    private final void m89973f0(AbstractC13453d1 abstractC13453d1) {
        this.fragmentGlobalShareDialogBinding.setValue(this, f119665N[0], abstractC13453d1);
    }

    /* JADX INFO: renamed from: g0 */
    private final void m89974g0(boolean visible) {
        AbstractC13453d1 abstractC13453d1M89961T = m89961T();
        ImageView viewShareClose = abstractC13453d1M89961T.f47202g;
        AbstractC22676k.m65749i(viewShareClose, "viewShareClose");
        viewShareClose.setVisibility(visible ? 0 : 8);
        TextView shareTitle = abstractC13453d1M89961T.f47201f;
        AbstractC22676k.m65749i(shareTitle, "shareTitle");
        shareTitle.setVisibility(visible ? 0 : 8);
        ViewPager2 widgetPager = abstractC13453d1M89961T.f47203h;
        AbstractC22676k.m65749i(widgetPager, "widgetPager");
        widgetPager.setVisibility(visible ? 0 : 8);
        TabLayout widgetTabLayout = abstractC13453d1M89961T.f47204i;
        AbstractC22676k.m65749i(widgetTabLayout, "widgetTabLayout");
        widgetTabLayout.setVisibility(visible ? 0 : 8);
        StrokedPillButton globalShareSendToTeam = abstractC13453d1M89961T.f47197b;
        AbstractC22676k.m65749i(globalShareSendToTeam, "globalShareSendToTeam");
        globalShareSendToTeam.setVisibility(visible ? 0 : 8);
        StrokedPillButton globalShareShareVia = abstractC13453d1M89961T.f47198c;
        AbstractC22676k.m65749i(globalShareShareVia, "globalShareShareVia");
        globalShareShareVia.setVisibility(visible ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public final void m89975h0(Bitmap bitmap) {
        C20838q c20838q = C20838q.f78353a;
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        Uri uriM57556a = c20838q.m57556a(bitmap, contextRequireContext, getLog());
        if (uriM57556a == null) {
            m89968a0(C29472g.INSTANCE.m90004c());
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uriM57556a);
        intent.putExtra("android.intent.extra.TEXT", getString(AbstractC38505d0.f165720u0));
        intent.setType("image/png");
        startActivity(Intent.createChooser(intent, getString(AbstractC38505d0.f165721u1)));
    }

    /* JADX INFO: renamed from: i0 */
    private final void m89976i0() {
        ThrobberView throbberView = m89961T().f47199d;
        throbberView.m26663f();
        throbberView.setVisibility(0);
    }

    /* JADX INFO: renamed from: j0 */
    private final void m89977j0() {
        ThrobberView throbberView = m89961T().f47199d;
        throbberView.m26664g();
        throbberView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final void m89978k0(boolean isTeamListVisible) {
        m89974g0(!isTeamListVisible);
        FragmentContainerView selectTeamFragmentContainer = m89961T().f47200e;
        AbstractC22676k.m65749i(selectTeamFragmentContainer, "selectTeamFragmentContainer");
        selectTeamFragmentContainer.setVisibility(isTeamListVisible ? 0 : 8);
        if (isTeamListVisible) {
            requireActivity().getOnBackPressedDispatcher().m43015a(this, this.backPressedCallback);
        } else {
            this.backPressedCallback.m43011h();
        }
    }

    @Override // pq0.AbstractC29467b
    public String getLogTag() {
        return this.logTag;
    }

    @Override // pq0.AbstractC29467b, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, AbstractC38507e0.f165740b);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13453d1 abstractC13453d1M38180c = AbstractC13453d1.m38180c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13453d1M38180c, "inflate(...)");
        m89973f0(abstractC13453d1M38180c);
        View root = m89961T().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // pq0.AbstractC29467b, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m89969b0();
        m89964W();
        m89971d0();
        m89960S();
    }
}
