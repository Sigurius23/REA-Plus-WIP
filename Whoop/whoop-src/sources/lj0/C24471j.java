package lj0;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lj0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Llj0/j;", "", "Llj0/k;", "type", "", "timestamp", "", "packetSize", "<init>", "(Llj0/k;JD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llj0/k;", "getType", "()Llj0/k;", "b", "J", "()J", "c", "D", "()D", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24471j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC24472k type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double packetSize;

    public C24471j(InterfaceC24472k type, long j7, double d3) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.timestamp = j7;
        this.packetSize = d3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getPacketSize() {
        return this.packetSize;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24471j)) {
            return false;
        }
        C24471j c24471j = (C24471j) other;
        return AbstractC22676k.m65745e(this.type, c24471j.type) && this.timestamp == c24471j.timestamp && Double.compare(this.packetSize, c24471j.packetSize) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.packetSize) + AbstractC11266d.m30451e(this.type.hashCode() * 31, this.timestamp, 31);
    }

    public String toString() {
        return "ThroughputUpdate(type=" + this.type + ", timestamp=" + this.timestamp + ", packetSize=" + this.packetSize + ")";
    }
}
