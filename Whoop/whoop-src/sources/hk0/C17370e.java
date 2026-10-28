package hk0;

import java.nio.ByteBuffer;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;

/* JADX INFO: renamed from: hk0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, m65681d2 = {"Lhk0/e;", "Lhk0/d;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "a0", "()Z", "", "toString", "()Ljava/lang/String;", "e", "Ljava/lang/String;", "K", "packetName", "", "Y", "()I", "subtype", "Z", "subtypeRevision", "f", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17370e extends AbstractC17369d {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String packetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17370e(ByteBuffer buffer) {
        super(buffer);
        AbstractC22676k.m65750j(buffer, "buffer");
        this.packetName = "Rev2DataSettingsPacket";
    }

    @Override // lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    /* JADX INFO: renamed from: Y */
    public final int m49182Y() {
        return C35048b.f148538a.m110786e(getBuffer().getShort(20));
    }

    /* JADX INFO: renamed from: Z */
    public final int m49183Z() {
        return getBuffer().get(22) & 255;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m49184a0() {
        return getBuffer().limit() >= 24;
    }

    @Override // hk0.C17367b, lt0.AbstractC24726c
    public String toString() {
        if (!m49184a0()) {
            return getPacketName() + "[truncated, " + getBuffer().limit() + " bytes] - " + m72401O();
        }
        String packetName = getPacketName();
        int iM49182Y = m49182Y();
        int iM49183Z = m49183Z();
        String strM72401O = m72401O();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(packetName);
        sb4.append("[subtype=");
        sb4.append(iM49182Y);
        sb4.append(", subtypeRev=");
        sb4.append(iM49183Z);
        return AbstractC25012a.m73376i("] - ", strM72401O, sb4);
    }
}
