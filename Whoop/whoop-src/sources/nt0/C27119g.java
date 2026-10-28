package nt0;

import lt0.C24725b;
import lt0.C24736m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nt0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lnt0/g;", "Lnt0/h;", "Llt0/m;", "receivedPacket", "Llt0/b;", "dataPacket", "<init>", "(Llt0/m;Llt0/b;)V", "", "v", "I", "c0", "()I", "expectedPacketLength", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27119g extends AbstractC27120h {

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int expectedPacketLength;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27119g(C24736m receivedPacket, C24725b dataPacket) {
        super(receivedPacket, dataPacket, null);
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(dataPacket, "dataPacket");
        this.expectedPacketLength = 1936;
    }

    @Override // nt0.AbstractC27120h
    /* JADX INFO: renamed from: c0, reason: from getter */
    public int getExpectedPacketLength() {
        return this.expectedPacketLength;
    }
}
