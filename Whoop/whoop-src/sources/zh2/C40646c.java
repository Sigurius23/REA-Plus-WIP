package zh2;

import java.util.ArrayList;
import java.util.Map;
import lt0.InterfaceC24730g;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p748zc1.C40349h7;
import q83.AbstractC30060g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: zh2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, m65681d2 = {"Lzh2/c;", "", "", "Llt0/g;", "", "dataPacketCountsByRevision", "firmwareEventPacketCount", "consoleLogPacketCount", "unknownRevisionCount", "<init>", "(Ljava/util/Map;III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "getDataPacketCountsByRevision", "()Ljava/util/Map;", "b", "I", "getFirmwareEventPacketCount", "c", "getConsoleLogPacketCount", "d", "getUnknownRevisionCount", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40646c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<InterfaceC24730g, Integer> dataPacketCountsByRevision;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int firmwareEventPacketCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int consoleLogPacketCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int unknownRevisionCount;

    public C40646c(Map<InterfaceC24730g, Integer> dataPacketCountsByRevision, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(dataPacketCountsByRevision, "dataPacketCountsByRevision");
        this.dataPacketCountsByRevision = dataPacketCountsByRevision;
        this.firmwareEventPacketCount = i13;
        this.consoleLogPacketCount = i14;
        this.unknownRevisionCount = i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final Comparable m131901c(Map.Entry it) {
        AbstractC22676k.m65750j(it, "it");
        return Integer.valueOf(((InterfaceC24730g) it.getKey()).mo72407b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Comparable m131902d(Map.Entry it) {
        AbstractC22676k.m65750j(it, "it");
        return Integer.valueOf(((InterfaceC24730g) it.getKey()).mo72406a());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40646c)) {
            return false;
        }
        C40646c c40646c = (C40646c) other;
        return AbstractC22676k.m65745e(this.dataPacketCountsByRevision, c40646c.dataPacketCountsByRevision) && this.firmwareEventPacketCount == c40646c.firmwareEventPacketCount && this.consoleLogPacketCount == c40646c.consoleLogPacketCount && this.unknownRevisionCount == c40646c.unknownRevisionCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.unknownRevisionCount) + AbstractC11266d.m30448b(this.consoleLogPacketCount, AbstractC11266d.m30448b(this.firmwareEventPacketCount, this.dataPacketCountsByRevision.hashCode() * 31, 31), 31);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : AbstractC25265s.m74152u1(this.dataPacketCountsByRevision.entrySet(), AbstractC30060g.m92126p(new C40349h7(16), new C40349h7(17)))) {
            arrayList.add(((InterfaceC24730g) entry.getKey()) + "=" + ((Number) entry.getValue()).intValue());
        }
        int i13 = this.firmwareEventPacketCount;
        if (i13 > 0) {
            AbstractC38963t7.m124389s(i13, "events=", arrayList);
        }
        int i14 = this.consoleLogPacketCount;
        if (i14 > 0) {
            AbstractC38963t7.m124389s(i14, "console=", arrayList);
        }
        int i15 = this.unknownRevisionCount;
        if (i15 > 0) {
            AbstractC38963t7.m124389s(i15, "unknown=", arrayList);
        }
        return AbstractC11895b.m31996o("{", AbstractC25265s.m74110N0(arrayList, ", ", null, null, null, 62), "}");
    }
}
