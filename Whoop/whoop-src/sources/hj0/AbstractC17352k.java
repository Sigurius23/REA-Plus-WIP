package hj0;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.InterfaceC1633v0;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
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

/* JADX INFO: renamed from: hj0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J/\u0010\u0014\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0012H\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0014X\u0094D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010 ¨\u0006:"}, m65681d2 = {"Lhj0/k;", "Landroidx/fragment/app/y;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onDestroyView", "onDestroy", "T", "Landroidx/lifecycle/p0;", "Landroidx/lifecycle/v0;", "observer", "observe", "(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Z", "getLogLifecycle", "()Z", "logLifecycle", "", "x", "Ljava/lang/String;", "getScreenName", "()Ljava/lang/String;", "screenName", "Lz82/e;", "y", "Lz82/e;", "getEventDispatcher", "()Lz82/e;", "eventDispatcher", "Ltr2/n;", "z", "Ll83/h;", "getLog", "()Ltr2/n;", "log", "Lrr2/c;", "E", "B", "()Lrr2/c;", "crashReporter", "Lhj0/r;", "F", "C", "()Lhj0/r;", "lifecycleLogger", "getLogTag", "logTag", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17352k extends DialogInterfaceOnCancelListenerC1361y {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h crashReporter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h lifecycleLogger;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final boolean logLifecycle = true;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String screenName = "";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h log;

    /* JADX INFO: renamed from: hj0.k$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f67257w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f67258x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f67259y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f67257w = componentCallbacks;
            this.f67258x = interfaceC35951a;
            this.f67259y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rr2.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31766c invoke() {
            ComponentCallbacks componentCallbacks = this.f67257w;
            InterfaceC35951a interfaceC35951a = this.f67258x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f67259y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), interfaceC35951a);
        }
    }

    public AbstractC17352k() {
        C40191e dispatcher = ((InterfaceC40188b) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null)).getDispatcher();
        AbstractC22676k.m65749i(dispatcher, "getEventDispatcher(...)");
        this.eventDispatcher = dispatcher;
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        final int i13 = 0;
        this.log = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: hj0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractC17352k f67250x;

            {
                this.f67250x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return AbstractC17352k.m49123E(this.f67250x);
                    default:
                        return AbstractC17352k.m49122D(this.f67250x);
                }
            }
        });
        this.crashReporter = AbstractC30060g.m92087G(EnumC23463i.f92933w, new a(this, null, null));
        final int i14 = 1;
        this.lifecycleLogger = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: hj0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractC17352k f67250x;

            {
                this.f67250x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return AbstractC17352k.m49123E(this.f67250x);
                    default:
                        return AbstractC17352k.m49122D(this.f67250x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: B */
    private final InterfaceC31766c m49120B() {
        return (InterfaceC31766c) this.crashReporter.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final C17359r m49121C() {
        return (C17359r) this.lifecycleLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C17359r m49122D(AbstractC17352k abstractC17352k) {
        return new C17359r(abstractC17352k.getLog());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final InterfaceC34116n m49123E(AbstractC17352k abstractC17352k) {
        return InterfaceC34116n.INSTANCE.m107848a(abstractC17352k.getLogTag());
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

    public final <T> void observe(AbstractC1615p0 abstractC1615p0, InterfaceC1633v0 observer) {
        AbstractC22676k.m65750j(abstractC1615p0, "<this>");
        AbstractC22676k.m65750j(observer, "observer");
        abstractC1615p0.observe(getViewLifecycleOwner(), observer);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        if (getLogLifecycle()) {
            getLifecycle().mo4986a(m49121C());
        }
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroy() {
        super.onDestroy();
        if (getLogLifecycle()) {
            getLifecycle().mo4988d(m49121C());
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        if (getLogLifecycle()) {
            getLog().mo85219j("onDestroyView", new AbstractC30556a.a[0]);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        InterfaceC31766c.m98635q(m49120B(), AbstractC2875y.m8299l(getLogTag(), "#onStart"), null, 2, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        if (getLogLifecycle()) {
            getLog().mo85219j("onViewCreated", new AbstractC30556a.a[0]);
        }
        if (AbstractC39414r.m125890i0(getScreenName())) {
            return;
        }
        this.eventDispatcher.m129035g0(getScreenName());
    }
}
