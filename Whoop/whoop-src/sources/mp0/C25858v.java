package mp0;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1633v0;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gf2.C15798g;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;

/* JADX INFO: renamed from: mp0.v */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0014X\u0094D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lmp0/v;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "N", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "", "x", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lgf2/g;", "y", "Lgf2/g;", "binding", "Lmp0/w;", "z", "Ll83/h;", "J", "()Lmp0/w;", "sleepCoachAlarmSetReminderViewModel", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25858v extends AbstractC17354m {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private C15798g binding;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "SleepCoachAlarmSetReminderFragment";

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h sleepCoachAlarmSetReminderViewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new c(this, null, new b(this), null));

    /* JADX INFO: renamed from: mp0.v$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f101924w;

        public a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f101924w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f101924w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f101924w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: mp0.v$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101925w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f101925w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f101925w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: mp0.v$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101926w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101927x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101928y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f101929z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f101926w = componentCallbacks;
            this.f101927x = interfaceC35951a;
            this.f101928y = interfaceC4339a;
            this.f101929z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mp0.w] */
        @Override // c93.InterfaceC4339a
        public final C25860w invoke() {
            return AbstractC34132o.m107857B(this.f101926w, this.f101927x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25860w.class), this.f101928y, this.f101929z);
        }
    }

    /* JADX INFO: renamed from: J */
    private final C25860w m76386J() {
        return (C25860w) this.sleepCoachAlarmSetReminderViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m76387K(C25858v c25858v, C25820c it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.getExpendedStateFlow() == EnumC25817b.ALARM_SET_REMINDER_FLOW) {
            C15798g c15798g = c25858v.binding;
            if (c15798g == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            c15798g.f59578c.setVisibility(0);
            c25858v.m76386J().m76401t();
        } else {
            C15798g c15798g2 = c25858v.binding;
            if (c15798g2 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            c15798g2.f59578c.setVisibility(8);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m76388L(C25858v c25858v, C25846p it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.getOnBackPressState() == EnumC25844o.ALARM_SET_REMINDER_ON_BACK_PRESS) {
            C15798g c15798g = c25858v.binding;
            if (c15798g == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            c15798g.f59578c.setVisibility(8);
            c25858v.m76386J().m76399p();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m76389M(C25858v c25858v, boolean z4) {
        c25858v.m76386J().m76397n(z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private final void m76390N() {
        final C15798g c15798g = this.binding;
        if (c15798g == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        StrokedPillButton saveAndSetButton = c15798g.f59580e;
        AbstractC22676k.m65749i(saveAndSetButton, "saveAndSetButton");
        final int i13 = 0;
        AbstractC1953c.m5963a(saveAndSetButton, new Function1(this) { // from class: mp0.u

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25858v f101916x;

            {
                this.f101916x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C25858v.m76391O(this.f101916x, c15798g, (View) obj);
                    default:
                        return C25858v.m76392P(this.f101916x, c15798g, (View) obj);
                }
            }
        });
        TextView saveWakeTimeButton = c15798g.f59581f;
        AbstractC22676k.m65749i(saveWakeTimeButton, "saveWakeTimeButton");
        final int i14 = 1;
        AbstractC1953c.m5963a(saveWakeTimeButton, new Function1(this) { // from class: mp0.u

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25858v f101916x;

            {
                this.f101916x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C25858v.m76391O(this.f101916x, c15798g, (View) obj);
                    default:
                        return C25858v.m76392P(this.f101916x, c15798g, (View) obj);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m76391O(C25858v c25858v, C15798g c15798g, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25858v.m76386J().m76398o(true);
        c25858v.m76386J().m76400r(c15798g.f59580e.getText().toString());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m76392P(C25858v c25858v, C15798g c15798g, View it) {
        AbstractC22676k.m65750j(it, "it");
        c25858v.m76386J().m76398o(false);
        c25858v.m76386J().m76400r(c15798g.f59581f.getText().toString());
        return C23454a0.f92919a;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C15798g c15798gM44571c = C15798g.m44571c(inflater, container, false);
        AbstractC22676k.m65749i(c15798gM44571c, "inflate(...)");
        this.binding = c15798gM44571c;
        ConstraintLayout root = c15798gM44571c.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final int i13 = 0;
        observe(m76386J().getAlarmOptionFlowLiveData(), new a(new Function1(this) { // from class: mp0.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25858v f101914x;

            {
                this.f101914x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C25858v.m76387K(this.f101914x, (C25820c) obj);
                    case 1:
                        return C25858v.m76388L(this.f101914x, (C25846p) obj);
                    default:
                        return C25858v.m76389M(this.f101914x, ((Boolean) obj).booleanValue());
                }
            }
        }));
        final int i14 = 1;
        observe(m76386J().getOnBackPressHandlerLiveData(), new a(new Function1(this) { // from class: mp0.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25858v f101914x;

            {
                this.f101914x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C25858v.m76387K(this.f101914x, (C25820c) obj);
                    case 1:
                        return C25858v.m76388L(this.f101914x, (C25846p) obj);
                    default:
                        return C25858v.m76389M(this.f101914x, ((Boolean) obj).booleanValue());
                }
            }
        }));
        final int i15 = 2;
        observe(m76386J().getShouldRevertSleepEditLiveData(), new a(new Function1(this) { // from class: mp0.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C25858v f101914x;

            {
                this.f101914x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return C25858v.m76387K(this.f101914x, (C25820c) obj);
                    case 1:
                        return C25858v.m76388L(this.f101914x, (C25846p) obj);
                    default:
                        return C25858v.m76389M(this.f101914x, ((Boolean) obj).booleanValue());
                }
            }
        }));
        m76390N();
    }
}
