package hj0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: hj0.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lhj0/r;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Ltr2/n;", "log", "<init>", "(Ltr2/n;)V", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17359r implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    public C17359r(InterfaceC34116n log) {
        AbstractC22676k.m65750j(log, "log");
        this.log = log;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.log.mo85219j("onCreate", new AbstractC30556a.a[0]);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.log.mo85219j("onDestroy", new AbstractC30556a.a[0]);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.log.mo85219j("onPause", new AbstractC30556a.a[0]);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.log.mo85219j("onResume", new AbstractC30556a.a[0]);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.log.mo85219j("onStart", new AbstractC30556a.a[0]);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.log.mo85219j("onStop", new AbstractC30556a.a[0]);
    }
}
