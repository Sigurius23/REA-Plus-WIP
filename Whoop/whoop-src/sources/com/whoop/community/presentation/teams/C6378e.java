package com.whoop.community.presentation.teams;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bh3.InterfaceC3255b;
import cn2.C4852a;
import com.whoop.community.presentation.teams.C6378e;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.ScoreContext;
import com.whoop.p069ui.views.TooltipView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eq0.AbstractC13533t1;
import j93.InterfaceC21493z;
import jo.ViewOnClickListenerC21821j;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import rq0.AbstractC31685o;
import rq0.C31707z;
import rq0.EnumC31701w;
import vu1.AbstractC36510a;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: com.whoop.community.presentation.teams.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R+\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010)\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b#\u0010%R\u001a\u0010.\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/e;", "Lrq0/o;", "<init>", "()V", "Ll83/a0;", "c0", "", "G", "()Ljava/lang/String;", "H", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lrq0/z;", "state", "N", "(Lrq0/z;)V", "Leq0/t1;", "<set-?>", "Lcom/whoop/ui/b;", "W", "()Leq0/t1;", "b0", "(Leq0/t1;)V", "fragmentTeamCreateSharingBinding", "", "I", "K", "()I", "titleRes", "J", "nextButtonRes", "layoutRes", "Lrq0/w;", "Lrq0/w;", "getStep", "()Lrq0/w;", "step", "L", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6378e extends AbstractC31685o {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C10462b fragmentTeamCreateSharingBinding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int titleRes = AbstractC38505d0.f165640Z1;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int nextButtonRes = AbstractC38505d0.f165628V1;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int layoutRes = AbstractC38501b0.f165496R;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final EnumC31701w step = EnumC31701w.SHARING;

    /* JADX INFO: renamed from: M */
    static final /* synthetic */ InterfaceC21493z[] f25127M = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C6378e.class, "fragmentTeamCreateSharingBinding", "getFragmentTeamCreateSharingBinding()Lcom/whoop/community/databinding/FragmentTeamCreateSharingBinding;", 0))};

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: N */
    public static final int f25128N = 8;

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/e$a;", "", "<init>", "()V", "Lcom/whoop/community/presentation/teams/e;", "a", "()Lcom/whoop/community/presentation/teams/e;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6378e m19530a() {
            return new C6378e();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: W */
    private final AbstractC13533t1 m19523W() {
        return (AbstractC13533t1) this.fragmentTeamCreateSharingBinding.getValue(this, f25127M[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final void m19524X(C6378e c6378e, AbstractC13533t1 abstractC13533t1, Boolean bool) {
        c6378e.m98185L().m98313b0(ScoreContext.STRAIN, abstractC13533t1.f47663f.f47642c.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m19525Y(C6378e c6378e, AbstractC13533t1 abstractC13533t1, Boolean bool) {
        c6378e.m98185L().m98313b0(ScoreContext.RECOVERY, abstractC13533t1.f47661d.f47642c.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m19526Z(C6378e c6378e, AbstractC13533t1 abstractC13533t1, Boolean bool) {
        c6378e.m98185L().m98313b0(ScoreContext.SLEEP, abstractC13533t1.f47662e.f47642c.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final void m19527a0(C6378e c6378e, View view) {
        c6378e.m19529c0();
    }

    /* JADX INFO: renamed from: b0 */
    private final void m19528b0(AbstractC13533t1 abstractC13533t1) {
        this.fragmentTeamCreateSharingBinding.setValue(this, f25127M[0], abstractC13533t1);
    }

    /* JADX INFO: renamed from: c0 */
    private final void m19529c0() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i13 = AbstractC38501b0.f165481D0;
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        AbstractC22676k.m65748h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewInflate = layoutInflaterFrom.inflate(i13, (ViewGroup) parent, false);
        AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type com.whoop.ui.views.TooltipView");
        ((TooltipView) viewInflate).m27474g(m19523W().f47660c, C4852a.m15490a(getContext(), 200), 400L);
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: G */
    public String mo19483G() {
        return "Finish";
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: H */
    public String mo19484H() {
        C31707z c31707zM98187Q = m98187Q();
        String strM8299l = (c31707zM98187Q == null || !c31707zM98187Q.getShareStrain()) ? "" : "Strain ";
        C31707z c31707zM98187Q2 = m98187Q();
        if (c31707zM98187Q2 != null && c31707zM98187Q2.getShareRecovery()) {
            strM8299l = AbstractC2875y.m8299l(strM8299l, "Recovery ");
        }
        C31707z c31707zM98187Q3 = m98187Q();
        return (c31707zM98187Q3 == null || !c31707zM98187Q3.getShareSleep()) ? strM8299l : AbstractC2875y.m8299l(strM8299l, "Sleep ");
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

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: N */
    public void mo19488N(C31707z state) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC13533t1 abstractC13533t1M19523W = m19523W();
        abstractC13533t1M19523W.f47664g.setText(state.getName());
        if (state.getShareStrain() != abstractC13533t1M19523W.f47663f.f47642c.isChecked()) {
            abstractC13533t1M19523W.f47663f.f47642c.setChecked(state.getShareStrain());
        }
        if (state.getShareRecovery() != abstractC13533t1M19523W.f47661d.f47642c.isChecked()) {
            abstractC13533t1M19523W.f47661d.f47642c.setChecked(state.getShareRecovery());
        }
        if (state.getShareSleep() != abstractC13533t1M19523W.f47662e.f47642c.isChecked()) {
            abstractC13533t1M19523W.f47662e.f47642c.setChecked(state.getShareSleep());
        }
        abstractC13533t1M19523W.f47663f.f47641b.setTextColor(getResources().getColor(state.getShareStrain() ? AbstractC36510a.f156042u : AbstractC36510a.f156030i, null));
        abstractC13533t1M19523W.f47661d.f47641b.setTextColor(getResources().getColor(state.getShareRecovery() ? AbstractC36510a.f156042u : AbstractC36510a.f156030i, null));
        abstractC13533t1M19523W.f47662e.f47641b.setTextColor(getResources().getColor(state.getShareSleep() ? AbstractC36510a.f156042u : AbstractC36510a.f156030i, null));
        m98186P(state.getShareSleep() | state.getShareStrain() | state.getShareRecovery());
    }

    @Override // rq0.AbstractC31685o, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13533t1 abstractC13533t1M38252c = AbstractC13533t1.m38252c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13533t1M38252c, "inflate(...)");
        m19528b0(abstractC13533t1M38252c);
        View root = m19523W().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final AbstractC13533t1 abstractC13533t1M19523W = m19523W();
        final int i13 = 0;
        abstractC13533t1M19523W.f47663f.f47642c.setOnCheckedChangeListener(new InterfaceC3255b(this) { // from class: rq0.v

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C6378e f131262x;

            {
                this.f131262x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i13) {
                    case 0:
                        C6378e.m19524X(this.f131262x, abstractC13533t1M19523W, (Boolean) obj);
                        break;
                    case 1:
                        C6378e.m19525Y(this.f131262x, abstractC13533t1M19523W, (Boolean) obj);
                        break;
                    default:
                        C6378e.m19526Z(this.f131262x, abstractC13533t1M19523W, (Boolean) obj);
                        break;
                }
            }
        });
        final int i14 = 1;
        abstractC13533t1M19523W.f47661d.f47642c.setOnCheckedChangeListener(new InterfaceC3255b(this) { // from class: rq0.v

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C6378e f131262x;

            {
                this.f131262x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i14) {
                    case 0:
                        C6378e.m19524X(this.f131262x, abstractC13533t1M19523W, (Boolean) obj);
                        break;
                    case 1:
                        C6378e.m19525Y(this.f131262x, abstractC13533t1M19523W, (Boolean) obj);
                        break;
                    default:
                        C6378e.m19526Z(this.f131262x, abstractC13533t1M19523W, (Boolean) obj);
                        break;
                }
            }
        });
        final int i15 = 2;
        abstractC13533t1M19523W.f47662e.f47642c.setOnCheckedChangeListener(new InterfaceC3255b(this) { // from class: rq0.v

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C6378e f131262x;

            {
                this.f131262x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i15) {
                    case 0:
                        C6378e.m19524X(this.f131262x, abstractC13533t1M19523W, (Boolean) obj);
                        break;
                    case 1:
                        C6378e.m19525Y(this.f131262x, abstractC13533t1M19523W, (Boolean) obj);
                        break;
                    default:
                        C6378e.m19526Z(this.f131262x, abstractC13533t1M19523W, (Boolean) obj);
                        break;
                }
            }
        });
        abstractC13533t1M19523W.f47660c.setOnClickListener(new ViewOnClickListenerC21821j(this, 14));
    }
}
