package hj0;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.C28196r0;
import or2.C28199s0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;
import z82.C40191e;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: hj0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0016\u001a\u00020\u0006*\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019H\u0004¢\u0006\u0004\b\u0016\u0010\u001aJ3\u0010\u0016\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u001cH\u0004¢\u0006\u0004\b\u0016\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u001eH\u0004¢\u0006\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020'8\u0014X\u0094D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\"8\u0014X\u0094D¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&R\u001a\u0010/\u001a\u00020.8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002038DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010+¨\u0006E"}, m65681d2 = {"Lhj0/m;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onDestroyView", "onDestroy", "obtainArguments", "()Landroid/os/Bundle;", "T", "Landroidx/lifecycle/p0;", "Landroidx/lifecycle/v0;", "observer", "observe", "(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V", "Lor2/r0;", "Lkotlin/Function0;", "(Lor2/r0;Lc93/a;)V", "Lor2/s0;", "Lkotlin/Function1;", "(Lor2/s0;Lkotlin/jvm/functions/Function1;)V", "", "color", "setStatusBarColor", "(I)V", "", "logLifecycle", "Z", "getLogLifecycle", "()Z", "", "screenName", "Ljava/lang/String;", "getScreenName", "()Ljava/lang/String;", "showBottomNavigationBar", "getShowBottomNavigationBar", "Lz82/e;", "eventDispatcher", "Lz82/e;", "getEventDispatcher", "()Lz82/e;", "Ltr2/n;", "log$delegate", "Ll83/h;", "getLog", "()Ltr2/n;", "log", "Lrr2/c;", "crashReporter$delegate", "A", "()Lrr2/c;", "crashReporter", "Lhj0/r;", "lifecycleLogger$delegate", "B", "()Lhj0/r;", "lifecycleLogger", "getLogTag", "logTag", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17354m extends AbstractComponentCallbacksC1320m0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: crashReporter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h crashReporter;
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: lifecycleLogger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h lifecycleLogger;

    /* JADX INFO: renamed from: log$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h log;
    private final boolean logLifecycle = true;
    private final String screenName = "";
    private final boolean showBottomNavigationBar = true;

    /* JADX INFO: renamed from: hj0.m$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f67262w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f67263x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f67264y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f67262w = componentCallbacks;
            this.f67263x = interfaceC35951a;
            this.f67264y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rr2.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31766c invoke() {
            ComponentCallbacks componentCallbacks = this.f67262w;
            InterfaceC35951a interfaceC35951a = this.f67263x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f67264y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), interfaceC35951a);
        }
    }

    public AbstractC17354m() {
        C40191e c40191eMo128972l = ((InterfaceC40188b) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null)).mo128972l();
        AbstractC22676k.m65749i(c40191eMo128972l, "getEventDispatcher(...)");
        this.eventDispatcher = c40191eMo128972l;
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        final int i13 = 0;
        this.log = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: hj0.l

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractC17354m f67261x;

            {
                this.f67261x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return AbstractC17354m.m49128D(this.f67261x);
                    default:
                        return AbstractC17354m.m49127C(this.f67261x);
                }
            }
        });
        this.crashReporter = AbstractC30060g.m92087G(EnumC23463i.f92933w, new a(this, null, null));
        final int i14 = 1;
        this.lifecycleLogger = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: hj0.l

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractC17354m f67261x;

            {
                this.f67261x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return AbstractC17354m.m49128D(this.f67261x);
                    default:
                        return AbstractC17354m.m49127C(this.f67261x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: A */
    private final InterfaceC31766c m49125A() {
        return (InterfaceC31766c) this.crashReporter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C17359r m49126B() {
        return (C17359r) this.lifecycleLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C17359r m49127C(AbstractC17354m abstractC17354m) {
        return new C17359r(abstractC17354m.getLog());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final InterfaceC34116n m49128D(AbstractC17354m abstractC17354m) {
        return InterfaceC34116n.INSTANCE.m107848a(abstractC17354m.getLogTag());
    }

    public final C40191e getEventDispatcher() {
        return this.eventDispatcher;
    }

    public final InterfaceC34116n getLog() {
        return (InterfaceC34116n) this.log.getValue();
    }

    public boolean getLogLifecycle() {
        return this.logLifecycle;
    }

    public abstract String getLogTag();

    public String getScreenName() {
        return this.screenName;
    }

    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    public final <T> void observe(AbstractC1615p0 abstractC1615p0, InterfaceC1633v0 observer) {
        AbstractC22676k.m65750j(abstractC1615p0, "<this>");
        AbstractC22676k.m65750j(observer, "observer");
        abstractC1615p0.observe(getViewLifecycleOwner(), observer);
    }

    public final Bundle obtainArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        setArguments(new Bundle());
        Bundle bundleRequireArguments = requireArguments();
        AbstractC22676k.m65749i(bundleRequireArguments, "requireArguments(...)");
        return bundleRequireArguments;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        if (getLogLifecycle()) {
            getLifecycle().mo4986a(m49126B());
        }
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroy() {
        super.onDestroy();
        if (getLogLifecycle()) {
            getLifecycle().mo4988d(m49126B());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        if (getLogLifecycle()) {
            getLog().mo85219j("onDestroyView", new AbstractC30556a.a[0]);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        InterfaceC31766c.m98635q(m49125A(), AbstractC2875y.m8299l(getLogTag(), "#onStart"), null, 2, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        if (getLogLifecycle()) {
            getLog().mo85219j("onViewCreated", new AbstractC30556a.a[0]);
        }
        if (getShowBottomNavigationBar()) {
            AbstractC17357p.m49141a(this);
            getActivity();
        } else {
            AbstractC17357p.m49141a(this);
            getActivity();
        }
        if (AbstractC39414r.m125890i0(getScreenName())) {
            return;
        }
        this.eventDispatcher.m129035g0(getScreenName());
    }

    public final void setStatusBarColor(int color) {
        requireActivity().getWindow().setStatusBarColor(AbstractC17357p.m49142b(this, color));
    }

    public final void observe(C28196r0 c28196r0, InterfaceC4339a observer) {
        AbstractC22676k.m65750j(c28196r0, "<this>");
        AbstractC22676k.m65750j(observer, "observer");
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        c28196r0.m85329c(viewLifecycleOwner, observer);
    }

    public final <T> void observe(C28199s0<T> c28199s0, Function1 observer) {
        AbstractC22676k.m65750j(c28199s0, "<this>");
        AbstractC22676k.m65750j(observer, "observer");
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        c28199s0.m85346c(viewLifecycleOwner, observer);
    }
}
