package zj0;

import ck0.C4777a;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zj0.n0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m65681d2 = {"Lzj0/n0;", "Lck0/a;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "k", "Ljava/lang/String;", "K", "packetName", "", "c0", "()Ljava/lang/Integer;", "flashStatusValue", "Lzj0/g0;", "b0", "()Lzj0/g0;", "flashStatus", "l", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40745n0 extends C4777a {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String packetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40745n0(ByteBuffer buffer) {
        super(buffer);
        AbstractC22676k.m65750j(buffer, "buffer");
        this.packetName = "Rev2HistorySendResponsePacket";
    }

    @Override // ck0.C4777a, zj0.C40727h, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }

    /* JADX INFO: renamed from: b0 */
    public final EnumC40725g0 m132231b0() {
        EnumC40725g0 enumC40725g0M132191a;
        Integer numM132232c0 = m132232c0();
        return (numM132232c0 == null || (enumC40725g0M132191a = EnumC40725g0.INSTANCE.m132191a(numM132232c0.intValue())) == null) ? EnumC40725g0.UNKNOWN : enumC40725g0M132191a;
    }

    /* JADX INFO: renamed from: c0 */
    public final Integer m132232c0() {
        if (m15046X().limit() > 32) {
            return Integer.valueOf(m15046X().get(32));
        }
        return null;
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        return getPacketName() + " (Result: " + m132197V() + " FlashStatus: " + m132231b0() + ")";
    }
}
