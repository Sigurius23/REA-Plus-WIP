package p736sz0;

import com.whoop.design.util.AbstractC8693b;
import gy0.AbstractC16277f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: sz0.o0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\f\u0010\u0007¨\u0006\u0016"}, m65681d2 = {"Lsz0/o0;", "", "<init>", "()V", "Lsz0/q0;", "b", "Lsz0/q0;", "()Lsz0/q0;", "loadingModalState", "c", "g", "successLoadingModalState", "d", "a", "canceledLoadingModalState", "e", "f", "subscriptionUpdatedModalState", "networkErrorModalState", "serverErrorModalState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "notFoundErrorModalState", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33205o0 {

    /* JADX INFO: renamed from: a */
    public static final C33205o0 f138451a = new C33205o0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C33211q0 loadingModalState = new C33211q0(null, AbstractC33208p0.c.f138471e, null, null, null, false, false, null, false, false, 1021, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C33211q0 successLoadingModalState = new C33211q0(null, new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC16277f.f62321e2), 0, null, 6, null), null, null, null, false, false, null, false, false, 1021, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C33211q0 canceledLoadingModalState = new C33211q0(null, new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC16277f.f62251J1), 0, null, 6, null), null, null, null, false, false, null, false, false, 1021, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C33211q0 subscriptionUpdatedModalState = new C33211q0(null, new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC16277f.f62317d2), 0, null, 6, null), null, null, null, false, false, null, false, false, 1021, null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C33211q0 networkErrorModalState = new C33211q0(null, Function0.m105280v(), AbstractC8693b.m21277k(AbstractC16277f.f62283T1), null, AbstractC8693b.m21277k(AbstractC16277f.f62292W1), false, false, null, false, false, 1001, null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C33211q0 serverErrorModalState = new C33211q0(null, Function0.m105278t(), AbstractC8693b.m21277k(AbstractC16277f.f62259L1), null, AbstractC8693b.m21277k(AbstractC16277f.f62292W1), false, false, AbstractC8693b.m21277k(AbstractC16277f.f62255K1), false, false, 873, null);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final C33211q0 notFoundErrorModalState = new C33211q0(null, Function0.m105279u(), AbstractC8693b.m21277k(AbstractC16277f.f62277R1), null, AbstractC8693b.m21277k(AbstractC16277f.f62218B0), false, false, null, false, false, 1001, null);

    private C33205o0() {
    }

    /* JADX INFO: renamed from: a */
    public final C33211q0 m105287a() {
        return canceledLoadingModalState;
    }

    /* JADX INFO: renamed from: b */
    public final C33211q0 m105288b() {
        return loadingModalState;
    }

    /* JADX INFO: renamed from: c */
    public final C33211q0 m105289c() {
        return networkErrorModalState;
    }

    /* JADX INFO: renamed from: d */
    public final C33211q0 m105290d() {
        return notFoundErrorModalState;
    }

    /* JADX INFO: renamed from: e */
    public final C33211q0 m105291e() {
        return serverErrorModalState;
    }

    /* JADX INFO: renamed from: f */
    public final C33211q0 m105292f() {
        return subscriptionUpdatedModalState;
    }

    /* JADX INFO: renamed from: g */
    public final C33211q0 m105293g() {
        return successLoadingModalState;
    }
}
