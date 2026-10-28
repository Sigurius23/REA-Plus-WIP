package zh2;

import c13.AbstractC3855a;
import java.util.Map;
import lt0.InterfaceC24730g;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zh2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b#\u0010\u0014R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010&¨\u0006'"}, m65681d2 = {"Lzh2/a;", "", "", "success", "", "totalPacketCount", "", "Llt0/g;", "dataPacketCountsByRevision", "firmwareEventPacketCount", "consoleLogPacketCount", "unknownRevisionCount", "Lzh2/b;", "sequenceInfo", "<init>", "(ZILjava/util/Map;IIILzh2/b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "e", "()Z", "b", "I", "getTotalPacketCount", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "d", "f", "g", "Lzh2/b;", "()Lzh2/b;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40644a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean success;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int totalPacketCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<InterfaceC24730g, Integer> dataPacketCountsByRevision;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int firmwareEventPacketCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int consoleLogPacketCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int unknownRevisionCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C40645b sequenceInfo;

    public C40644a(boolean z4, int i13, Map<InterfaceC24730g, Integer> dataPacketCountsByRevision, int i14, int i15, int i16, C40645b sequenceInfo) {
        AbstractC22676k.m65750j(dataPacketCountsByRevision, "dataPacketCountsByRevision");
        AbstractC22676k.m65750j(sequenceInfo, "sequenceInfo");
        this.success = z4;
        this.totalPacketCount = i13;
        this.dataPacketCountsByRevision = dataPacketCountsByRevision;
        this.firmwareEventPacketCount = i14;
        this.consoleLogPacketCount = i15;
        this.unknownRevisionCount = i16;
        this.sequenceInfo = sequenceInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getConsoleLogPacketCount() {
        return this.consoleLogPacketCount;
    }

    /* JADX INFO: renamed from: b */
    public final Map<InterfaceC24730g, Integer> m131888b() {
        return this.dataPacketCountsByRevision;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFirmwareEventPacketCount() {
        return this.firmwareEventPacketCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C40645b getSequenceInfo() {
        return this.sequenceInfo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40644a)) {
            return false;
        }
        C40644a c40644a = (C40644a) other;
        return this.success == c40644a.success && this.totalPacketCount == c40644a.totalPacketCount && AbstractC22676k.m65745e(this.dataPacketCountsByRevision, c40644a.dataPacketCountsByRevision) && this.firmwareEventPacketCount == c40644a.firmwareEventPacketCount && this.consoleLogPacketCount == c40644a.consoleLogPacketCount && this.unknownRevisionCount == c40644a.unknownRevisionCount && AbstractC22676k.m65745e(this.sequenceInfo, c40644a.sequenceInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getUnknownRevisionCount() {
        return this.unknownRevisionCount;
    }

    public int hashCode() {
        return this.sequenceInfo.hashCode() + AbstractC11266d.m30448b(this.unknownRevisionCount, AbstractC11266d.m30448b(this.consoleLogPacketCount, AbstractC11266d.m30448b(this.firmwareEventPacketCount, AbstractC3855a.m11821e(this.dataPacketCountsByRevision, AbstractC11266d.m30448b(this.totalPacketCount, Boolean.hashCode(this.success) * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        boolean z4 = this.success;
        int i13 = this.totalPacketCount;
        Map<InterfaceC24730g, Integer> map = this.dataPacketCountsByRevision;
        int i14 = this.firmwareEventPacketCount;
        int i15 = this.consoleLogPacketCount;
        int i16 = this.unknownRevisionCount;
        C40645b c40645b = this.sequenceInfo;
        StringBuilder sb4 = new StringBuilder("BurstFlushResult(success=");
        sb4.append(z4);
        sb4.append(", totalPacketCount=");
        sb4.append(i13);
        sb4.append(", dataPacketCountsByRevision=");
        sb4.append(map);
        sb4.append(", firmwareEventPacketCount=");
        sb4.append(i14);
        sb4.append(", consoleLogPacketCount=");
        AbstractC30802r.m94773v(sb4, i15, ", unknownRevisionCount=", i16, ", sequenceInfo=");
        sb4.append(c40645b);
        sb4.append(")");
        return sb4.toString();
    }
}
