package or2;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import e93.AbstractC12889b;
import hc3.AbstractC17182o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.Closeable;
import kc3.C22365e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: or2.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lor2/m;", "Ljava/io/Closeable;", "Lbc3/c0;", "Lq83/j;", "coroutineContext", "<init>", "(Lq83/j;)V", "Ll83/a0;", "close", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28180m implements Closeable, InterfaceC2994c0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC30063j coroutineContext;

    public C28180m(InterfaceC30063j coroutineContext) {
        AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC3006f0.m8715i(getCoroutineContext(), null);
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C28180m(InterfaceC30063j interfaceC30063j, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j = AbstractC12889b.m36254T(c3004e2M8710d, AbstractC17182o.f65999a.mo8825s());
        }
        this(interfaceC30063j);
    }
}
