package com.whoop.community.presentation.teams;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.AbstractActivityC1340r0;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.ViewOnFocusChangeListenerC10607q;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eq0.AbstractC13523r1;
import j93.InterfaceC21493z;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import rq0.AbstractC31685o;
import rq0.C31705y;
import rq0.C31707z;
import rq0.EnumC31701w;
import vq0.AbstractC36281e;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: com.whoop.community.presentation.teams.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R+\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\"\u001a\u0004\b&\u0010$R\u001a\u0010(\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b\"\u0010$R\u001a\u0010-\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/d;", "Lrq0/o;", "<init>", "()V", "", "G", "()Ljava/lang/String;", "H", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lrq0/z;", "state", "N", "(Lrq0/z;)V", "Leq0/r1;", "<set-?>", "Lcom/whoop/ui/b;", "T", "()Leq0/r1;", "V", "(Leq0/r1;)V", "fragmentTeamCreateNameBinding", "", "I", "K", "()I", "titleRes", "J", "nextButtonRes", "layoutRes", "Lrq0/w;", "Lrq0/w;", "getStep", "()Lrq0/w;", "step", "L", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6377d extends AbstractC31685o {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C10462b fragmentTeamCreateNameBinding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int titleRes = AbstractC38505d0.f165637Y1;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int nextButtonRes = AbstractC38505d0.f165705q;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int layoutRes = AbstractC38501b0.f165495Q;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final EnumC31701w step = EnumC31701w.NAME;

    /* JADX INFO: renamed from: M */
    static final /* synthetic */ InterfaceC21493z[] f25118M = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C6377d.class, "fragmentTeamCreateNameBinding", "getFragmentTeamCreateNameBinding()Lcom/whoop/community/databinding/FragmentTeamCreateNameBinding;", 0))};

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: N */
    public static final int f25119N = 8;

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.d$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/d$a;", "", "<init>", "()V", "Lcom/whoop/community/presentation/teams/d;", "a", "()Lcom/whoop/community/presentation/teams/d;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6377d m19518a() {
            return new C6377d();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.d$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/community/presentation/teams/d$b", "Lvq0/e;", "Landroid/text/Editable;", "editable", "Ll83/a0;", "afterTextChanged", "(Landroid/text/Editable;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC36281e {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C31705y c31705yM98185L = C6377d.this.m98185L();
            String upperCase = String.valueOf(editable).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            c31705yM98185L.m98312Z(AbstractC39421y.m125926K(upperCase, "\n", "", false));
        }
    }

    /* JADX INFO: renamed from: T */
    private final AbstractC13523r1 m19515T() {
        return (AbstractC13523r1) this.fragmentTeamCreateNameBinding.getValue(this, f25118M[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final void m19516U(AbstractC13523r1 abstractC13523r1, C6377d c6377d, View view, boolean z4) {
        abstractC13523r1.f47615a.setHint(z4 ? "" : c6377d.getString(AbstractC38505d0.f165619S1));
        if (z4) {
            AbstractActivityC1340r0 activity = c6377d.getActivity();
            Object systemService = activity != null ? activity.getSystemService("input_method") : null;
            AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(view, 1);
        }
    }

    /* JADX INFO: renamed from: V */
    private final void m19517V(AbstractC13523r1 abstractC13523r1) {
        this.fragmentTeamCreateNameBinding.setValue(this, f25118M[0], abstractC13523r1);
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: G */
    public String mo19483G() {
        return "Confirm Team Name";
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: H */
    public String mo19484H() {
        return "";
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
        m98186P(!AbstractC22676k.m65745e(state.getName(), ""));
        AbstractC13523r1 abstractC13523r1M19515T = m19515T();
        if (AbstractC22676k.m65745e(state.getName(), abstractC13523r1M19515T.f47615a.getText().toString())) {
            return;
        }
        abstractC13523r1M19515T.f47615a.setText(state.getName());
    }

    @Override // rq0.AbstractC31685o, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13523r1 abstractC13523r1M38243c = AbstractC13523r1.m38243c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13523r1M38243c, "inflate(...)");
        m19517V(abstractC13523r1M38243c);
        View root = m19515T().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC13523r1 abstractC13523r1M19515T = m19515T();
        abstractC13523r1M19515T.f47615a.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        abstractC13523r1M19515T.f47615a.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10607q(1, abstractC13523r1M19515T, this));
        abstractC13523r1M19515T.f47615a.addTextChangedListener(new b());
        abstractC13523r1M19515T.f47615a.setInputType(135169);
        abstractC13523r1M19515T.f47615a.setImeOptions(6);
        abstractC13523r1M19515T.f47615a.setRawInputType(1);
        abstractC13523r1M19515T.f47615a.requestFocus();
    }
}
