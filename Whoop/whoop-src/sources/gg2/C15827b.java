package gg2;

import androidx.lifecycle.AbstractC1638x;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import m83.C25262p;
import p399pb.C29047d;
import p399pb.C29048e;
import p399pb.InterfaceC29049f;
import p456rb.C31183a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gg2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lgg2/b;", "Lpb/f;", "Landroidx/lifecycle/x;", "lifecycle", "<init>", "(Landroidx/lifecycle/x;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroidx/lifecycle/x;", "getLifecycle", "()Landroidx/lifecycle/x;", "Lpb/d;", "x", "Lpb/d;", "getSavedStateRegistry", "()Lpb/d;", "savedStateRegistry", "snapshot-compose-host_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15827b implements InterfaceC29049f {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final AbstractC1638x lifecycle;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C29047d savedStateRegistry;

    public C15827b(AbstractC1638x lifecycle) {
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        this.lifecycle = lifecycle;
        C29048e c29048e = new C29048e(new C31183a(this, new C25262p(this, 10)));
        c29048e.m88295a(null);
        this.savedStateRegistry = c29048e.f117551b;
    }

    @Override // androidx.lifecycle.InterfaceC1585g0
    public AbstractC1638x getLifecycle() {
        return this.lifecycle;
    }

    @Override // p399pb.InterfaceC29049f
    public C29047d getSavedStateRegistry() {
        return this.savedStateRegistry;
    }
}
