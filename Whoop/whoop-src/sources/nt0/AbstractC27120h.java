package nt0;

import fk2.C14554a;
import java.nio.ByteBuffer;
import lt0.C24725b;
import lt0.C24736m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;
import tt0.C34158c;
import uk0.C35048b;

/* JADX INFO: renamed from: nt0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0007\u001e\u001f !\"#$¨\u0006%"}, m65681d2 = {"Lnt0/h;", "Llt0/b;", "Llt0/m;", "receivedPacket", "dataPacket", "<init>", "(Llt0/m;Llt0/b;)V", "", "f0", "()Z", "s", "Llt0/m;", "t", "Llt0/b;", "", "b0", "()I", "crcOffset", "c0", "expectedPacketLength", "", "e0", "()J", "timestamp", "Ljava/nio/ByteBuffer;", "d0", "()Ljava/nio/ByteBuffer;", "rawData", "u", "a", "Lnt0/a;", "Lnt0/b;", "Lnt0/c;", "Lnt0/d;", "Lnt0/e;", "Lnt0/f;", "Lnt0/g;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27120h extends C24725b {

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C24736m receivedPacket;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C24725b dataPacket;

    /* JADX INFO: renamed from: nt0.h$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lnt0/h$a;", "", "<init>", "()V", "Lst0/v;", "strapGen", "Llt0/m;", "receivedPacket", "Llt0/b;", "dataPacket", "Lnt0/h;", "a", "(Lst0/v;Llt0/m;Llt0/b;)Lnt0/h;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC27120h m81509a(EnumC32978v strapGen, C24736m receivedPacket, C24725b dataPacket) {
            AbstractC22676k.m65750j(strapGen, "strapGen");
            AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
            AbstractC22676k.m65750j(dataPacket, "dataPacket");
            short sM72392U = dataPacket.m72392U();
            if (sM72392U == 7) {
                return new C27119g(receivedPacket, dataPacket);
            }
            if (sM72392U == 10) {
                return new C27113a(strapGen, receivedPacket, dataPacket);
            }
            if (sM72392U == 11) {
                return new C27114b(strapGen, receivedPacket, dataPacket);
            }
            if (sM72392U == 20) {
                return new C27116d(receivedPacket, dataPacket);
            }
            if (sM72392U == 21) {
                return new C27117e(receivedPacket, dataPacket);
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbstractC27120h(C24736m c24736m, C24725b c24725b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c24736m, c24725b);
    }

    /* JADX INFO: renamed from: b0 */
    private final int m81505b0() {
        return mo81494c0() - 4;
    }

    /* JADX INFO: renamed from: c0 */
    public abstract int mo81494c0();

    /* JADX INFO: renamed from: d0 */
    public final ByteBuffer m81506d0() {
        return this.receivedPacket.getFramedPacket().m76710f();
    }

    /* JADX INFO: renamed from: e0 */
    public final long m81507e0() {
        C14554a c14554aM72395X = this.dataPacket.m72395X();
        if (c14554aM72395X != null) {
            return c14554aM72395X.m41583j();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m81508f0() {
        return m81506d0().limit() == mo81494c0() && C34158c.f143182a.m107938a(this.dataPacket.getPayload(), C35048b.m110783d(m81506d0().getInt(m81505b0())));
    }

    private AbstractC27120h(C24736m c24736m, C24725b c24725b) {
        super(c24725b.getPayload(), c24736m.getFramedPacket().m76710f());
        this.receivedPacket = c24736m;
        this.dataPacket = c24725b;
    }
}
