package hk0;

import fk2.C14554a;
import java.nio.ByteBuffer;
import lt0.AbstractC24726c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;

/* JADX INFO: renamed from: hk0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, m65681d2 = {"Lhk0/b;", "Llt0/c;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "c", "Ljava/nio/ByteBuffer;", "Q", "()Ljava/nio/ByteBuffer;", "", "T", "()I", "rawPacketCategory", "Lhk0/o;", "S", "()Lhk0/o;", "packetCategory", "R", "flags", "Lfk2/a;", "X", "()Lfk2/a;", "timeStamp", "", "W", "()J", "sequence", "U", "rawPacketType", "Lhk0/p;", "V", "()Lhk0/p;", "rev2PacketType", "d", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class C17367b extends AbstractC24726c {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ByteBuffer buffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17367b(ByteBuffer buffer) {
        super(buffer);
        AbstractC22676k.m65750j(buffer, "buffer");
        this.buffer = buffer;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: renamed from: R */
    public final int m49174R() {
        return this.buffer.get(2) & 255;
    }

    /* JADX INFO: renamed from: S */
    public final EnumC17380o m49175S() {
        return EnumC17380o.INSTANCE.m49209a(m49176T());
    }

    /* JADX INFO: renamed from: T */
    public final int m49176T() {
        return this.buffer.get(1) & 255;
    }

    /* JADX INFO: renamed from: U */
    public final int m49177U() {
        return C35048b.f148538a.m110786e(this.buffer.getShort(17));
    }

    /* JADX INFO: renamed from: V */
    public final EnumC17381p m49178V() {
        return EnumC17381p.INSTANCE.m49210a(m49177U());
    }

    /* JADX INFO: renamed from: W */
    public final long m49179W() {
        return C35048b.m110783d(this.buffer.getInt(9));
    }

    /* JADX INFO: renamed from: X */
    public final C14554a m49180X() {
        return new C14554a(C35048b.m110783d(this.buffer.getInt(3)), C35048b.f148538a.m110786e(this.buffer.getShort(7)));
    }

    @Override // lt0.AbstractC24726c
    public String toString() {
        return "Rev2[category=" + m49175S() + ", type=" + m49178V() + "] - " + m72401O();
    }
}
