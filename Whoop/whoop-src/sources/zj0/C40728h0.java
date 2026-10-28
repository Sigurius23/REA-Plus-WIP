package zj0;

import ck0.C4777a;
import fk2.C14554a;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;
import wj0.EnumC37318b;

/* JADX INFO: renamed from: zj0.h0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m65681d2 = {"Lzj0/h0;", "Lck0/a;", "Lzj0/g;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "d0", "()Z", "", "toString", "()Ljava/lang/String;", "k", "Ljava/lang/String;", "K", "packetName", "", "b0", "()J", "epochSeconds", "c0", "epochSubseconds", "Lfk2/a;", "getTime", "()Lfk2/a;", "time", "l", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40728h0 extends C4777a implements InterfaceC40724g {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String packetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40728h0(ByteBuffer buffer) {
        super(buffer);
        AbstractC22676k.m65750j(buffer, "buffer");
        this.packetName = "Rev2GetClockResponsePacket";
    }

    /* JADX INFO: renamed from: d0 */
    private final boolean m132199d0() {
        return m15046X().limit() >= 39;
    }

    @Override // ck0.C4777a, zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    /* JADX INFO: renamed from: b0 */
    public final long m132200b0() {
        return C35048b.m110783d(m15046X().getInt(33));
    }

    /* JADX INFO: renamed from: c0 */
    public final long m132201c0() {
        return C35048b.f148538a.m110786e(m15046X().getShort(37));
    }

    @Override // zj0.InterfaceC40724g
    public C14554a getTime() {
        if (m15049a0() && m132199d0()) {
            return new C14554a(m132200b0(), m132201c0());
        }
        return null;
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        String packetName = getPacketName();
        EnumC37318b enumC37318bM132197V = m132197V();
        C14554a time = getTime();
        return packetName + " (Result: " + enumC37318bM132197V + " Time: " + (time != null ? time.m41582i() : null) + ")";
    }
}
