package com.whoop.community.presentation.teams;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.viewpager.widget.ViewPager;
import com.whoop.community.presentation.teams.C6376c;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.AbstractViewOnTouchListenerC10539g;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.WhoopZoomageView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eq0.AbstractC13513p1;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import p144fc.AbstractC14355k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import rq0.AbstractC31685o;
import rq0.AbstractC31697u;
import rq0.C31657d;
import rq0.C31695t;
import rq0.C31705y;
import rq0.C31707z;
import rq0.EnumC31701w;
import rq0.InterfaceC31687p;
import se.AbstractC32417h;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: com.whoop.community.presentation.teams.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0003R+\u0010&\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010*\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010'\u001a\u0004\b+\u0010)R\u001a\u0010-\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b'\u0010)R\u001a\u00102\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/c;", "Lrq0/o;", "<init>", "()V", "", "direction", "Ll83/a0;", "f0", "(I)V", "d0", "", "G", "()Ljava/lang/String;", "H", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lrq0/z;", "state", "N", "(Lrq0/z;)V", "O", "Leq0/p1;", "<set-?>", "Lcom/whoop/ui/b;", "Y", "()Leq0/p1;", "e0", "(Leq0/p1;)V", "fragmentTeamCreateLogoBinding", "I", "K", "()I", "titleRes", "J", "nextButtonRes", "layoutRes", "Lrq0/w;", "Lrq0/w;", "getStep", "()Lrq0/w;", "step", "Lrq0/d;", "L", "Lrq0/d;", "pagerAdapter", "M", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6376c extends AbstractC31685o {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C10462b fragmentTeamCreateLogoBinding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int titleRes = AbstractC38505d0.f165634X1;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int nextButtonRes = AbstractC38505d0.f165705q;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int layoutRes = AbstractC38501b0.f165494P;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final EnumC31701w step = EnumC31701w.LOGO;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private C31657d pagerAdapter;

    /* JADX INFO: renamed from: N */
    static final /* synthetic */ InterfaceC21493z[] f25099N = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C6376c.class, "fragmentTeamCreateLogoBinding", "getFragmentTeamCreateLogoBinding()Lcom/whoop/community/databinding/FragmentTeamCreateLogoBinding;", 0))};

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O */
    public static final int f25100O = 8;

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/c$a;", "", "<init>", "()V", "Lcom/whoop/community/presentation/teams/c;", "a", "()Lcom/whoop/community/presentation/teams/c;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6376c m19505a() {
            return new C6376c();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.c$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/community/presentation/teams/c$b", "Lfc/k;", "", "position", "Ll83/a0;", "c", "(I)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC14355k {
        public b() {
        }

        @Override // p144fc.InterfaceC14351g
        /* JADX INFO: renamed from: c */
        public void mo19079c(int position) {
            C31705y c31705yM98185L = C6376c.this.m98185L();
            C31657d c31657d = C6376c.this.pagerAdapter;
            if (c31657d != null) {
                c31705yM98185L.m98309V(c31657d.m97920x(position));
            } else {
                AbstractC22676k.m65757q("pagerAdapter");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.c$c */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"com/whoop/community/presentation/teams/c$c", "Lcom/whoop/ui/g;", "Ll83/a0;", "b", "()V", "c", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractViewOnTouchListenerC10539g {
        public c(Context context) {
            super(context);
        }

        @Override // com.whoop.p069ui.AbstractViewOnTouchListenerC10539g
        /* JADX INFO: renamed from: b */
        public void mo19080b() {
            C6376c.this.m19504f0(1);
        }

        @Override // com.whoop.p069ui.AbstractViewOnTouchListenerC10539g
        /* JADX INFO: renamed from: c */
        public void mo19081c() {
            C6376c.this.m19504f0(-1);
        }
    }

    /* JADX INFO: renamed from: Y */
    private final AbstractC13513p1 m19497Y() {
        return (AbstractC13513p1) this.fragmentTeamCreateLogoBinding.getValue(this, f25099N[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m19498Z(C6376c c6376c, View view) {
        AbstractActivityC1340r0 activity = c6376c.getActivity();
        AbstractC22676k.m65748h(activity, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamCreateActivity");
        ((TeamCreateActivity) activity).m19439L(new C31695t(c6376c, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m19499a0(C6376c c6376c, Bitmap it) {
        AbstractC22676k.m65750j(it, "it");
        c6376c.m98185L().m98310W(true);
        c6376c.m98185L().m98300G(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final void m19500b0(C6376c c6376c, View view) {
        c6376c.m19502d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m19501c0(C6376c c6376c, int i13) {
        c6376c.m98185L().m98311X(i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d0 */
    private final void m19502d0() {
        C31707z c31707zM98187Q = m98187Q();
        if (c31707zM98187Q == null || c31707zM98187Q.getLogoCropping() == null) {
            return;
        }
        C31705y c31705yM98185L = m98185L();
        WhoopZoomageView logoCrop = m19497Y().f47534c;
        AbstractC22676k.m65749i(logoCrop, "logoCrop");
        Resources resources = getResources();
        AbstractC22676k.m65749i(resources, "getResources(...)");
        c31705yM98185L.m98306R(AbstractC31697u.m98268a(logoCrop, resources));
    }

    /* JADX INFO: renamed from: e0 */
    private final void m19503e0(AbstractC13513p1 abstractC13513p1) {
        this.fragmentTeamCreateLogoBinding.setValue(this, f25099N[0], abstractC13513p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final void m19504f0(int direction) {
        m19497Y().f47532a.f47512a.setCurrentItem(m19497Y().f47532a.f47512a.getCurrentItem() + direction);
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: G */
    public String mo19483G() {
        return "Confirm Logo";
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: H */
    public String mo19484H() {
        int size;
        ArrayList<List<InterfaceC31687p>> arrayListM98330o;
        C31707z c31707zM98187Q = m98187Q();
        if (c31707zM98187Q != null) {
            size = c31707zM98187Q.getLogoIndex();
        } else {
            C31707z c31707zM98187Q2 = m98187Q();
            size = 0 % ((c31707zM98187Q2 == null || (arrayListM98330o = c31707zM98187Q2.m98330o()) == null) ? 1 : arrayListM98330o.size());
        }
        if (size == 0) {
            return "Default";
        }
        C31707z c31707zM98187Q3 = m98187Q();
        return (c31707zM98187Q3 != null ? c31707zM98187Q3.getLogoCropping() : null) != null ? "Uploaded" : "Selected";
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: I, reason: from getter */
    public int getLayoutRes() {
        return this.layoutRes;
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: J, reason: from getter */
    public int getNextButtonRes() {
        return this.nextButtonRes;
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: K, reason: from getter */
    public int getTitleRes() {
        return this.titleRes;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: N */
    public void mo19488N(C31707z state) {
        Bitmap bitmapM98327l;
        AbstractActivityC1340r0 activity;
        AbstractC22676k.m65750j(state, "state");
        m98186P(true);
        AbstractC13513p1 abstractC13513p1M19497Y = m19497Y();
        abstractC13513p1M19497Y.f47532a.f47513b.f47470d.setVisibility(8);
        AbstractC32417h.m101189T(abstractC13513p1M19497Y.f47535d, state.getLogoCropping() != null);
        AbstractC32417h.m101189T(abstractC13513p1M19497Y.f47532a.getRoot(), state.getLogoCropping() == null);
        C31657d c31657d = this.pagerAdapter;
        if (c31657d == null) {
            AbstractC22676k.m65757q("pagerAdapter");
            throw null;
        }
        if (AbstractC22676k.m65745e(c31657d.m97918u(), state.m98330o())) {
            C31657d c31657d2 = this.pagerAdapter;
            if (c31657d2 == null) {
                AbstractC22676k.m65757q("pagerAdapter");
                throw null;
            }
            if (c31657d2.m97920x(abstractC13513p1M19497Y.f47532a.f47512a.getCurrentItem()) != state.getLogoIndex()) {
            }
            bitmapM98327l = state.getLogoCropping();
            activity = getActivity();
            AbstractC22676k.m65748h(activity, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamCreateActivity");
            if (AbstractC22676k.m65745e(bitmapM98327l, ((TeamCreateActivity) activity).getLogoCropping())) {
            }
            abstractC13513p1M19497Y.f47534c.setImageBitmap(state.getLogoCropping());
            AbstractActivityC1340r0 activity2 = getActivity();
            AbstractC22676k.m65748h(activity2, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamCreateActivity");
            ((TeamCreateActivity) activity2).m19440M(state.getLogoCropping());
        }
        C31657d c31657d3 = this.pagerAdapter;
        if (c31657d3 == null) {
            AbstractC22676k.m65757q("pagerAdapter");
            throw null;
        }
        c31657d3.m97921y(state.m98330o());
        C31657d c31657d4 = this.pagerAdapter;
        if (c31657d4 == null) {
            AbstractC22676k.m65757q("pagerAdapter");
            throw null;
        }
        c31657d4.m40968j();
        ViewPager viewPager = abstractC13513p1M19497Y.f47532a.f47512a;
        int iM98328m = state.getLogoIndex();
        C31657d c31657d5 = this.pagerAdapter;
        if (c31657d5 == null) {
            AbstractC22676k.m65757q("pagerAdapter");
            throw null;
        }
        viewPager.m5469D((c31657d5.m97918u().size() * 100) + iM98328m, false);
        bitmapM98327l = state.getLogoCropping();
        activity = getActivity();
        AbstractC22676k.m65748h(activity, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamCreateActivity");
        if (AbstractC22676k.m65745e(bitmapM98327l, ((TeamCreateActivity) activity).getLogoCropping())) {
            abstractC13513p1M19497Y.f47534c.setImageBitmap(state.getLogoCropping());
            AbstractActivityC1340r0 activity3 = getActivity();
            AbstractC22676k.m65748h(activity3, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamCreateActivity");
            ((TeamCreateActivity) activity3).m19440M(state.getLogoCropping());
        }
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: O */
    public void mo19489O() {
        m19502d0();
    }

    @Override // rq0.AbstractC31685o, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13513p1 abstractC13513p1M38233c = AbstractC13513p1.m38233c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13513p1M38233c, "inflate(...)");
        m19503e0(abstractC13513p1M38233c);
        View root = m19497Y().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        AbstractActivityC1340r0 activity = getActivity();
        AbstractC22676k.m65748h(activity, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamCreateActivity");
        ((TeamCreateActivity) activity).m19440M(null);
        super.onViewCreated(view, savedInstanceState);
        AbstractC13513p1 abstractC13513p1M19497Y = m19497Y();
        final int i13 = 0;
        abstractC13513p1M19497Y.f47532a.f47513b.f47468b.setOnClickListener(new View.OnClickListener(this) { // from class: rq0.s

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C6376c f131219x;

            {
                this.f131219x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        C6376c.m19498Z(this.f131219x, view2);
                        break;
                    default:
                        C6376c.m19500b0(this.f131219x, view2);
                        break;
                }
            }
        });
        final int i14 = 1;
        abstractC13513p1M19497Y.f47533b.f47566a.setOnClickListener(new View.OnClickListener(this) { // from class: rq0.s

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C6376c f131219x;

            {
                this.f131219x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        C6376c.m19498Z(this.f131219x, view2);
                        break;
                    default:
                        C6376c.m19500b0(this.f131219x, view2);
                        break;
                }
            }
        });
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        C31657d c31657d = new C31657d(contextRequireContext, new C31695t(this, 0));
        this.pagerAdapter = c31657d;
        abstractC13513p1M19497Y.f47532a.f47512a.setAdapter(c31657d);
        abstractC13513p1M19497Y.f47532a.f47512a.m5478c(new b());
        abstractC13513p1M19497Y.f47532a.f47513b.f47467a.setOnTouchListener(new c(requireContext()));
    }
}
