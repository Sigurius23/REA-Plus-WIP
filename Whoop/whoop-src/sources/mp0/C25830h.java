package mp0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import as2.AbstractC1953c;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gf2.C15797f;
import j93.InterfaceC21493z;
import l83.C23454a0;
import np0.EnumC27008a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import qe2.AbstractC30311d;
import vu1.AbstractC36510a;

/* JADX INFO: renamed from: mp0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lmp0/h;", "Lmp0/k0;", "<init>", "()V", "Ll83/a0;", "N", "T", "S", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "z", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lgf2/f;", "<set-?>", "E", "Lcom/whoop/ui/b;", "M", "()Lgf2/f;", "R", "(Lgf2/f;)V", "binding", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25830h extends AbstractC25837k0 {

    /* JADX INFO: renamed from: F */
    static final /* synthetic */ InterfaceC21493z[] f101670F = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C25830h.class, "binding", "getBinding()Lcom/whoop/sleep/coach/databinding/SleepCoachFragmentAlarmTypeWizardBinding;", 0))};

    /* JADX INFO: renamed from: G */
    public static final int f101671G = 8;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String logTag = "AlarmTypeWizardFragment";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: M */
    private final C15797f m76184M() {
        return (C15797f) this.binding.getValue(this, f101670F[0]);
    }

    /* JADX INFO: renamed from: N */
    private final void m76185N() {
        C15797f c15797fM76184M = m76184M();
        View exactTimeBg = c15797fM76184M.f59562b;
        AbstractC22676k.m65749i(exactTimeBg, "exactTimeBg");
        final int i13 = 0;
        AbstractC1953c.m5963a(exactTimeBg, new Function1(this) { // from class: mp0.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25830h f101667x;

            {
                this.f101667x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C25830h.m76186O(this.f101667x, (View) obj);
                    case 1:
                        return C25830h.m76187P(this.f101667x, (View) obj);
                    default:
                        return C25830h.m76188Q(this.f101667x, (View) obj);
                }
            }
        });
        View sleepGoalBg = c15797fM76184M.f59572l;
        AbstractC22676k.m65749i(sleepGoalBg, "sleepGoalBg");
        final int i14 = 1;
        AbstractC1953c.m5963a(sleepGoalBg, new Function1(this) { // from class: mp0.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25830h f101667x;

            {
                this.f101667x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C25830h.m76186O(this.f101667x, (View) obj);
                    case 1:
                        return C25830h.m76187P(this.f101667x, (View) obj);
                    default:
                        return C25830h.m76188Q(this.f101667x, (View) obj);
                }
            }
        });
        View inTheGreenBg = c15797fM76184M.f59568h;
        AbstractC22676k.m65749i(inTheGreenBg, "inTheGreenBg");
        final int i15 = 2;
        AbstractC1953c.m5963a(inTheGreenBg, new Function1(this) { // from class: mp0.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25830h f101667x;

            {
                this.f101667x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return C25830h.m76186O(this.f101667x, (View) obj);
                    case 1:
                        return C25830h.m76187P(this.f101667x, (View) obj);
                    default:
                        return C25830h.m76188Q(this.f101667x, (View) obj);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m76186O(C25830h c25830h, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25830h.m76282F().m76140M(EnumC27008a.EXACT_TIME);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m76187P(C25830h c25830h, View it) {
        AbstractC22676k.m65750j(it, "it");
        if (!c25830h.m76282F().m76149Z()) {
            c25830h.m76282F().m76140M(EnumC27008a.SLEEP_GOAL);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m76188Q(C25830h c25830h, View it) {
        AbstractC22676k.m65750j(it, "it");
        if (!c25830h.m76282F().m76149Z()) {
            c25830h.m76282F().m76140M(EnumC27008a.IN_THE_GREEN);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private final void m76189R(C15797f c15797f) {
        this.binding.setValue(this, f101670F[0], c15797f);
    }

    /* JADX INFO: renamed from: S */
    private final void m76190S() {
        C15797f c15797fM76184M = m76184M();
        c15797fM76184M.f59570j.setVisibility(0);
        c15797fM76184M.f59568h.setBackground(getResources().getDrawable(AbstractC30311d.f124037h, null));
        c15797fM76184M.f59569i.setTextColor(getResources().getColor(AbstractC36510a.f156009R, null));
        c15797fM76184M.f59571k.setTextColor(getResources().getColor(AbstractC36510a.f156009R, null));
    }

    /* JADX INFO: renamed from: T */
    private final void m76191T() {
        C15797f c15797fM76184M = m76184M();
        c15797fM76184M.f59574n.setVisibility(0);
        c15797fM76184M.f59572l.setBackground(getResources().getDrawable(AbstractC30311d.f124037h, null));
        c15797fM76184M.f59573m.setTextColor(getResources().getColor(AbstractC36510a.f156009R, null));
        c15797fM76184M.f59575o.setTextColor(getResources().getColor(AbstractC36510a.f156009R, null));
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C15797f c15797fM44567c = C15797f.m44567c(inflater);
        AbstractC22676k.m65749i(c15797fM44567c, "inflate(...)");
        m76189R(c15797fM44567c);
        ConstraintLayout root = m76184M().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (m76282F().m76149Z()) {
            m76191T();
            m76190S();
        }
        m76185N();
    }
}
