package gg2;

import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1581f0;
import androidx.lifecycle.InterfaceC1585g0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gg2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lgg2/a;", "Landroidx/lifecycle/x;", "Landroidx/lifecycle/w;", "state", "", "simulateObserver", "<init>", "(Landroidx/lifecycle/w;Z)V", "Landroidx/lifecycle/f0;", "observer", "Ll83/a0;", "a", "(Landroidx/lifecycle/f0;)V", "d", "b", "Z", "c", "Landroidx/lifecycle/w;", "()Landroidx/lifecycle/w;", "currentState", "Landroidx/lifecycle/g0;", "Landroidx/lifecycle/g0;", "e", "()Landroidx/lifecycle/g0;", "lifecycleOwner", "snapshot-compose-host_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15826a extends AbstractC1638x {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean simulateObserver;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC1635w currentState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC1585g0 lifecycleOwner;

    /* JADX INFO: renamed from: gg2.a$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"gg2/a$a", "Landroidx/lifecycle/g0;", "Lgg2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lgg2/a;", "a", "()Lgg2/a;", "lifecycle", "snapshot-compose-host_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1585g0 {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final C15826a lifecycle;

        public a(C15826a c15826a) {
            this.lifecycle = c15826a;
        }

        @Override // androidx.lifecycle.InterfaceC1585g0
        /* JADX INFO: renamed from: a, reason: from getter */
        public C15826a getLifecycle() {
            return this.lifecycle;
        }
    }

    public C15826a(EnumC1635w state, boolean z4) {
        AbstractC22676k.m65750j(state, "state");
        this.simulateObserver = z4;
        this.currentState = state;
        this.lifecycleOwner = new a(this);
    }

    @Override // androidx.lifecycle.AbstractC1638x
    /* JADX INFO: renamed from: a */
    public void mo4986a(InterfaceC1581f0 observer) {
        AbstractC22676k.m65750j(observer, "observer");
        if (this.simulateObserver) {
            InterfaceC1577e0 interfaceC1577e0 = observer instanceof InterfaceC1577e0 ? (InterfaceC1577e0) observer : null;
            if (interfaceC1577e0 != null) {
                interfaceC1577e0.mo4080h(this.lifecycleOwner, EnumC1632v.ON_CREATE);
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC1638x
    /* JADX INFO: renamed from: b, reason: from getter */
    public EnumC1635w getCurrentState() {
        return this.currentState;
    }

    @Override // androidx.lifecycle.AbstractC1638x
    /* JADX INFO: renamed from: d */
    public void mo4988d(InterfaceC1581f0 observer) {
        AbstractC22676k.m65750j(observer, "observer");
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC1585g0 getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public /* synthetic */ C15826a(EnumC1635w enumC1635w, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC1635w.f6326x : enumC1635w, (i13 & 2) != 0 ? false : z4);
    }
}
