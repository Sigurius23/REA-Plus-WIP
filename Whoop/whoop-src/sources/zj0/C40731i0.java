package zj0;

import ck0.C4777a;
import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;
import wj0.EnumC37318b;

/* JADX INFO: renamed from: zj0.i0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001f"}, m65681d2 = {"Lzj0/i0;", "Lck0/a;", "Lzj0/i;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "b0", "()Z", "", "index", "", "c0", "(I)J", "", "toString", "()Ljava/lang/String;", "k", "Ljava/lang/String;", "K", "packetName", "q", "()J", "writePage", "e", "trimPage", "t", "totalPages", "l", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40731i0 extends C4777a implements InterfaceC40730i {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String packetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40731i0(ByteBuffer buffer) {
        super(buffer);
        AbstractC22676k.m65750j(buffer, "buffer");
        this.packetName = "Rev2GetDataRangeResponsePacket";
    }

    /* JADX INFO: renamed from: b0 */
    private final boolean m132206b0() {
        return m15046X().limit() >= 97;
    }

    /* JADX INFO: renamed from: c0 */
    private final long m132207c0(int index) {
        return C35048b.m110783d(m15046X().getInt((index * 4) + 33));
    }

    @Override // zj0.InterfaceC40730i
    /* JADX INFO: renamed from: D */
    public /* bridge */ long mo132202D() {
        return super.mo132202D();
    }

    @Override // ck0.C4777a, zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    @Override // zj0.InterfaceC40730i
    /* JADX INFO: renamed from: e */
    public long mo132203e() {
        return m132207c0(3);
    }

    @Override // zj0.InterfaceC40730i
    /* JADX INFO: renamed from: q */
    public long mo132204q() {
        return m132207c0(2);
    }

    @Override // zj0.InterfaceC40730i
    /* JADX INFO: renamed from: t */
    public long mo132205t() {
        return m132207c0(5);
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        if (!m132206b0()) {
            return getPacketName() + " (Result: " + m132197V() + ", no body)";
        }
        String packetName = getPacketName();
        EnumC37318b enumC37318bM132197V = m132197V();
        long jMo132202D = mo132202D();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(packetName);
        sb4.append(" (Result: ");
        sb4.append(enumC37318bM132197V);
        sb4.append(" Behind: ");
        return AbstractC11266d.m30457k(jMo132202D, " pages)", sb4);
    }
}
