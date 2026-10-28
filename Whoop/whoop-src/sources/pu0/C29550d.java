package pu0;

import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pu0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0018\u0010\"R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%¨\u0006&"}, m65681d2 = {"Lpu0/d;", "Lpu0/e;", "", "id", "", "bootCount", "secondsSinceBoot", "sequenceNumber", "Ljava/nio/ByteBuffer;", "packetData", "Lpu0/a;", "metaData", "<init>", "(JIIILjava/nio/ByteBuffer;Lpu0/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "()J", "b", "I", "c", "d", "e", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "f", "Lpu0/a;", "()Lpu0/a;", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29550d implements InterfaceC29551e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int bootCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int secondsSinceBoot;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int sequenceNumber;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ByteBuffer packetData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C29547a metaData;

    public C29550d(long j7, int i13, int i14, int i15, ByteBuffer packetData, C29547a metaData) {
        AbstractC22676k.m65750j(packetData, "packetData");
        AbstractC22676k.m65750j(metaData, "metaData");
        this.id = j7;
        this.bootCount = i13;
        this.secondsSinceBoot = i14;
        this.sequenceNumber = i15;
        this.packetData = packetData;
        this.metaData = metaData;
    }

    @Override // pu0.InterfaceC29551e
    /* JADX INFO: renamed from: a, reason: from getter */
    public ByteBuffer getPacketData() {
        return this.packetData;
    }

    @Override // pu0.InterfaceC29551e
    /* JADX INFO: renamed from: b, reason: from getter */
    public C29547a getMetaData() {
        return this.metaData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBootCount() {
        return this.bootCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSecondsSinceBoot() {
        return this.secondsSinceBoot;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29550d)) {
            return false;
        }
        C29550d c29550d = (C29550d) other;
        return this.id == c29550d.id && this.bootCount == c29550d.bootCount && this.secondsSinceBoot == c29550d.secondsSinceBoot && this.sequenceNumber == c29550d.sequenceNumber && AbstractC22676k.m65745e(this.packetData, c29550d.packetData) && AbstractC22676k.m65745e(this.metaData, c29550d.metaData);
    }

    @Override // pu0.InterfaceC29551e
    public long getId() {
        return this.id;
    }

    public int hashCode() {
        return this.metaData.hashCode() + ((this.packetData.hashCode() + AbstractC11266d.m30448b(this.sequenceNumber, AbstractC11266d.m30448b(this.secondsSinceBoot, AbstractC11266d.m30448b(this.bootCount, Long.hashCode(this.id) * 31, 31), 31), 31)) * 31);
    }

    public String toString() {
        return "BatteryPackRelativeFirmwareEventPacketEntity(id=" + this.id + ", bootCount=" + this.bootCount + ", secondsSinceBoot=" + this.secondsSinceBoot + ", sequenceNumber=" + this.sequenceNumber + ", packetData=" + this.packetData + ", metaData=" + this.metaData + ")";
    }

    public /* synthetic */ C29550d(long j7, int i13, int i14, int i15, ByteBuffer byteBuffer, C29547a c29547a, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0L : j7, i13, i14, i15, byteBuffer, c29547a);
    }
}
