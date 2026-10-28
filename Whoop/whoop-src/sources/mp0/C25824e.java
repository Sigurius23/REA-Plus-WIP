package mp0;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gf2.C15796e;
import hj0.AbstractC17352k;
import j93.InterfaceC21493z;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mp0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010\"¨\u0006$"}, m65681d2 = {"Lmp0/e;", "Lhj0/k;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "G", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lgf2/e;", "<set-?>", "H", "Lcom/whoop/ui/b;", "I", "()Lgf2/e;", "L", "(Lgf2/e;)V", "binding", "Lmp0/f;", "Ll83/h;", "()Lmp0/f;", "alarmTurnOffTutorialViewModel", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25824e extends AbstractC17352k {

    /* JADX INFO: renamed from: J */
    static final /* synthetic */ InterfaceC21493z[] f101624J = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C25824e.class, "binding", "getBinding()Lcom/whoop/sleep/coach/databinding/SleepCoachDialogAlarmTurnOffInfoBinding;", 0))};

    /* JADX INFO: renamed from: K */
    public static final int f101625K = 8;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String logTag = "AlarmTurnOffTutorialDialog";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h alarmTurnOffTutorialViewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new b(this, null, new a(this), null));

    /* JADX INFO: renamed from: mp0.e$a */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101629w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f101629w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f101629w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f101629w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: mp0.e$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101630w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101631x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101632y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f101633z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f101630w = abstractComponentCallbacksC1320m0;
            this.f101631x = interfaceC35951a;
            this.f101632y = interfaceC4339a;
            this.f101633z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mp0.f] */
        @Override // c93.InterfaceC4339a
        public final C25826f invoke() {
            return AbstractC37056f.m118952D(this.f101630w, this.f101631x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25826f.class), this.f101632y, this.f101633z);
        }
    }

    /* JADX INFO: renamed from: H */
    private final C25826f m76157H() {
        return (C25826f) this.alarmTurnOffTutorialViewModel.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final C15796e m76158I() {
        return (C15796e) this.binding.getValue(this, f101624J[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m76159J(C25824e c25824e, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25824e.m76157H().m76173z(EnumC25834j.GOT_IT_DISMISS);
        c25824e.dismiss();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m76160K(C25824e c25824e, View it) {
        AbstractC22676k.m65750j(it, "it");
        C25826f.m76162A(c25824e.m76157H(), null, 1, null);
        c25824e.dismiss();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private final void m76161L(C15796e c15796e) {
        this.binding.setValue(this, f101624J[0], c15796e);
    }

    @Override // hj0.AbstractC17352k
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        setCancelable(false);
        C15796e c15796eM44564c = C15796e.m44564c(inflater, container, false);
        AbstractC22676k.m65749i(c15796eM44564c, "inflate(...)");
        m76161L(c15796eM44564c);
        ConstraintLayout root = m76158I().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17352k, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Window window = requireDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        C15796e c15796eM76158I = m76158I();
        StrokedPillButton alarmTurnOffGotIt = c15796eM76158I.f59556c;
        AbstractC22676k.m65749i(alarmTurnOffGotIt, "alarmTurnOffGotIt");
        final int i13 = 0;
        AbstractC1953c.m5963a(alarmTurnOffGotIt, new Function1(this) { // from class: mp0.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25824e f101623x;

            {
                this.f101623x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C25824e.m76159J(this.f101623x, (View) obj);
                    default:
                        return C25824e.m76160K(this.f101623x, (View) obj);
                }
            }
        });
        ImageView closeIcon = c15796eM76158I.f59557d;
        AbstractC22676k.m65749i(closeIcon, "closeIcon");
        final int i14 = 1;
        AbstractC1953c.m5963a(closeIcon, new Function1(this) { // from class: mp0.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25824e f101623x;

            {
                this.f101623x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C25824e.m76159J(this.f101623x, (View) obj);
                    default:
                        return C25824e.m76160K(this.f101623x, (View) obj);
                }
            }
        });
    }
}
