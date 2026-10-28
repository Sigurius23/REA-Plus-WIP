package bi2;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import lt0.InterfaceC24730g;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import zh2.C40644a;

/* JADX INFO: renamed from: bi2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010!\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\"\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013¨\u0006#"}, m65681d2 = {"Lbi2/l;", "", "", "Llt0/g;", "", "dataPacketCountsByRevision", "firmwareEventPacketCount", "consoleLogPacketCount", "unknownRevisionCount", "<init>", "(Ljava/util/Map;III)V", "Lzh2/a;", "burst", "d", "(Lzh2/a;)Lbi2/l;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "getDataPacketCountsByRevision", "()Ljava/util/Map;", "b", "I", "getFirmwareEventPacketCount", "c", "getConsoleLogPacketCount", "totalDataPacketCount", "totalPacketCount", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3296l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<InterfaceC24730g, Integer> dataPacketCountsByRevision;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int firmwareEventPacketCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int consoleLogPacketCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int unknownRevisionCount;

    public C3296l(Map<InterfaceC24730g, Integer> dataPacketCountsByRevision, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(dataPacketCountsByRevision, "dataPacketCountsByRevision");
        this.dataPacketCountsByRevision = dataPacketCountsByRevision;
        this.firmwareEventPacketCount = i13;
        this.consoleLogPacketCount = i14;
        this.unknownRevisionCount = i15;
    }

    /* JADX INFO: renamed from: a */
    public final int m9595a() {
        return AbstractC25265s.m74154v1(this.dataPacketCountsByRevision.values());
    }

    /* JADX INFO: renamed from: b */
    public final int m9596b() {
        return m9595a() + this.firmwareEventPacketCount + this.consoleLogPacketCount + this.unknownRevisionCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getUnknownRevisionCount() {
        return this.unknownRevisionCount;
    }

    /* JADX INFO: renamed from: d */
    public final C3296l m9598d(C40644a burst) {
        AbstractC22676k.m65750j(burst, "burst");
        LinkedHashSet linkedHashSetM34556E = AbstractC12350b.m34556E(this.dataPacketCountsByRevision.keySet(), burst.m131888b().keySet());
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(linkedHashSetM34556E, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : linkedHashSetM34556E) {
            InterfaceC24730g interfaceC24730g = (InterfaceC24730g) obj;
            Integer num = this.dataPacketCountsByRevision.get(interfaceC24730g);
            int iIntValue = 0;
            int iIntValue2 = num != null ? num.intValue() : 0;
            Integer num2 = burst.m131888b().get(interfaceC24730g);
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            linkedHashMap.put(obj, Integer.valueOf(iIntValue2 + iIntValue));
        }
        return new C3296l(linkedHashMap, burst.getFirmwareEventPacketCount() + this.firmwareEventPacketCount, burst.getConsoleLogPacketCount() + this.consoleLogPacketCount, burst.getUnknownRevisionCount() + this.unknownRevisionCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3296l)) {
            return false;
        }
        C3296l c3296l = (C3296l) other;
        return AbstractC22676k.m65745e(this.dataPacketCountsByRevision, c3296l.dataPacketCountsByRevision) && this.firmwareEventPacketCount == c3296l.firmwareEventPacketCount && this.consoleLogPacketCount == c3296l.consoleLogPacketCount && this.unknownRevisionCount == c3296l.unknownRevisionCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.unknownRevisionCount) + AbstractC11266d.m30448b(this.consoleLogPacketCount, AbstractC11266d.m30448b(this.firmwareEventPacketCount, this.dataPacketCountsByRevision.hashCode() * 31, 31), 31);
    }

    public String toString() {
        Map<InterfaceC24730g, Integer> map = this.dataPacketCountsByRevision;
        int i13 = this.firmwareEventPacketCount;
        int i14 = this.consoleLogPacketCount;
        int i15 = this.unknownRevisionCount;
        StringBuilder sb4 = new StringBuilder("SessionPacketCounts(dataPacketCountsByRevision=");
        sb4.append(map);
        sb4.append(", firmwareEventPacketCount=");
        sb4.append(i13);
        sb4.append(", consoleLogPacketCount=");
        return AbstractC26725a.m79505i(sb4, i14, ", unknownRevisionCount=", i15, ")");
    }

    public /* synthetic */ C3296l(Map map, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? C25272z.f99163w : map, (i16 & 2) != 0 ? 0 : i13, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }
}
