package hj0;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.InterfaceC1633v0;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p314m.AbstractActivityC24852m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import tr2.InterfaceC34116n;
import vf3.InterfaceC35951a;

/* JADX INFO: renamed from: hj0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J+\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8$X¤\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m65681d2 = {"Lhj0/i;", "Lm/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroy", "T", "Landroidx/lifecycle/p0;", "Landroidx/lifecycle/v0;", "observer", "y", "(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Z", "u", "()Z", "logLifecycle", "Ltr2/n;", "x", "Ll83/h;", "t", "()Ltr2/n;", "log", "Lhj0/r;", "s", "()Lhj0/r;", "lifecycleLogger", "Lhj0/e;", "z", "r", "()Lhj0/e;", "applicationLifecycleListener", "", "v", "()Ljava/lang/String;", "logTag", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public abstract class AbstractActivityC17350i extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final boolean logLifecycle = true;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h log;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h lifecycleLogger;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h applicationLifecycleListener;

    /* JADX INFO: renamed from: hj0.i$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f67246w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f67247x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f67248y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f67246w = componentCallbacks;
            this.f67247x = interfaceC35951a;
            this.f67248y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hj0.e, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC17346e invoke() {
            ComponentCallbacks componentCallbacks = this.f67246w;
            InterfaceC35951a interfaceC35951a = this.f67247x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f67248y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC17346e.class), interfaceC35951a);
        }
    }

    public AbstractActivityC17350i() {
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        final int i13 = 0;
        this.log = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: hj0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractActivityC17350i f67241x;

            {
                this.f67241x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return AbstractActivityC17350i.m49115x(this.f67241x);
                    default:
                        return AbstractActivityC17350i.m49114w(this.f67241x);
                }
            }
        });
        final int i14 = 1;
        this.lifecycleLogger = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: hj0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractActivityC17350i f67241x;

            {
                this.f67241x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return AbstractActivityC17350i.m49115x(this.f67241x);
                    default:
                        return AbstractActivityC17350i.m49114w(this.f67241x);
                }
            }
        });
        this.applicationLifecycleListener = AbstractC30060g.m92087G(EnumC23463i.f92933w, new a(this, null, null));
    }

    /* JADX INFO: renamed from: r */
    private final InterfaceC17346e m49112r() {
        return (InterfaceC17346e) this.applicationLifecycleListener.getValue();
    }

    /* JADX INFO: renamed from: s */
    private final C17359r m49113s() {
        return (C17359r) this.lifecycleLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C17359r m49114w(AbstractActivityC17350i abstractActivityC17350i) {
        return new C17359r(abstractActivityC17350i.m49116t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final InterfaceC34116n m49115x(AbstractActivityC17350i abstractActivityC17350i) {
        return InterfaceC34116n.INSTANCE.m107848a(abstractActivityC17350i.getLogTag());
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        if (getLogLifecycle()) {
            getLifecycle().mo4986a(m49113s());
        }
        super.onCreate(savedInstanceState);
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (getLogLifecycle()) {
            getLifecycle().mo4988d(m49113s());
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onPause() {
        super.onPause();
        m49112r().onActivityPaused(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onResume() {
        super.onResume();
        m49112r().onActivityResumed(this);
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC34116n m49116t() {
        return (InterfaceC34116n) this.log.getValue();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public boolean getLogLifecycle() {
        return this.logLifecycle;
    }

    /* JADX INFO: renamed from: v */
    public abstract String getLogTag();

    /* JADX INFO: renamed from: y */
    public final <T> void m49118y(AbstractC1615p0 abstractC1615p0, InterfaceC1633v0 observer) {
        AbstractC22676k.m65750j(abstractC1615p0, "<this>");
        AbstractC22676k.m65750j(observer, "observer");
        abstractC1615p0.observe(this, observer);
    }
}
