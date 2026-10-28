package cp0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p181h2.C16617b;
import p492t2.InterfaceC33313a;
import p636y3.C39185q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: cp0.z0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lcp0/z0;", "Lt2/a;", "Lcp0/y0;", "handler", "<init>", "(Lcp0/y0;)V", "Lh2/b;", "consumed", "available", "", "source", "J", "(JJI)J", "Ly3/q;", "p0", "(JLq83/d;)Ljava/lang/Object;", "Ll83/a0;", "a", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcp0/y0;", "", "x", "Z", "dragging", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11013z0 implements InterfaceC33313a {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C11011y0 handler;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean dragging;

    public C11013z0(C11011y0 handler) {
        AbstractC22676k.m65750j(handler, "handler");
        this.handler = handler;
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: J */
    public long mo9761J(long consumed, long available, int source) {
        if (source != 1) {
            return 0L;
        }
        int i13 = (int) (4294967295L & available);
        if (Float.intBitsToFloat(i13) == 0.0f) {
            return 0L;
        }
        if (!this.dragging) {
            this.handler.m29560k();
            this.dragging = true;
        }
        this.handler.m29557h(Float.intBitsToFloat(i13));
        return C16617b.m47185a(0.0f, 0.0f, available, 2);
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: V */
    public Object mo9762V(long j7, long j13, InterfaceC30057d<? super C39185q> interfaceC30057d) {
        return new C39185q(0L);
    }

    /* JADX INFO: renamed from: a */
    public final void m29561a() {
        if (this.dragging) {
            this.handler.m29558i();
            this.dragging = false;
        }
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: l0 */
    public /* bridge */ long mo29341l0(long j7, int i13) {
        return 0L;
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: p0 */
    public Object mo29342p0(long j7, InterfaceC30057d<? super C39185q> interfaceC30057d) {
        if (this.dragging) {
            this.handler.m29559j();
            this.dragging = false;
        }
        return new C39185q(0L);
    }
}
