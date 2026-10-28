package bi2;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import l83.C23465k;
import lt0.C24736m;
import lt0.InterfaceC24730g;
import oh2.C27938a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: bi2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00190\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001e\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0013\u0010.\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010-R)\u00101\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u00190/8F¢\u0006\u0006\u001a\u0004\b(\u00100¨\u00062"}, m65681d2 = {"Lbi2/f;", "", "Loh2/a;", "acquisitionInfo", "<init>", "(Loh2/a;)V", "Llt0/m;", "receivedPacket", "", "timestampMillis", "sequence", "", ProfileAnalyticsKt.SAVE, "Llt0/g;", "formatRevision", "Ll83/a0;", "a", "(Llt0/m;JJZLlt0/g;)V", "", "toString", "()Ljava/lang/String;", "Loh2/a;", "b", "()Loh2/a;", "", "Ll83/k;", "Ljava/nio/ByteBuffer;", "Ljava/util/Map;", "savePacketMap", "Ljava/util/LinkedList;", "c", "Ljava/util/LinkedList;", "sequenceGaps", "", "value", "d", "I", "()I", "count", "Lbi2/f$a;", "e", "Lbi2/f$a;", "first", "f", "last", "()Ljava/lang/Long;", "highWatermark", "", "()Ljava/util/Map;", "savePackets", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3290f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27938a acquisitionInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<Long, C23465k> savePacketMap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LinkedList<C23465k> sequenceGaps;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int count;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private a first;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private a last;

    /* JADX INFO: renamed from: bi2.f$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lbi2/f$a;", "", "", "timestampMillis", "sequence", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long timestampMillis;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long sequence;

        public a(long j7, long j13) {
            this.timestampMillis = j7;
            this.sequence = j13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getSequence() {
            return this.sequence;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTimestampMillis() {
            return this.timestampMillis;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.timestampMillis == aVar.timestampMillis && this.sequence == aVar.sequence;
        }

        public int hashCode() {
            return Long.hashCode(this.sequence) + (Long.hashCode(this.timestampMillis) * 31);
        }

        public String toString() {
            return AbstractC11266d.m30457k(this.sequence, ")", AbstractC39383f.m125596b(this.timestampMillis, "Entry(timestampMillis=", ", sequence="));
        }
    }

    public C3290f(C27938a acquisitionInfo) {
        AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
        this.acquisitionInfo = acquisitionInfo;
        this.savePacketMap = new HashMap();
        this.sequenceGaps = new LinkedList<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m9574a(C24736m receivedPacket, long timestampMillis, long sequence, boolean save, InterfaceC24730g formatRevision) {
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(formatRevision, "formatRevision");
        a aVar = this.last;
        if (aVar != null && sequence != aVar.getSequence() + 1) {
            this.sequenceGaps.add(new C23465k(Long.valueOf(aVar.getSequence()), Long.valueOf(sequence)));
        }
        a aVar2 = new a(timestampMillis, sequence);
        if (this.first == null) {
            this.first = aVar2;
        }
        this.last = aVar2;
        this.count++;
        if (save) {
            this.savePacketMap.put(Long.valueOf(timestampMillis), new C23465k(receivedPacket.getFramedPacket().m76710f(), formatRevision));
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27938a getAcquisitionInfo() {
        return this.acquisitionInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: d */
    public final Long m9577d() {
        a aVar = this.last;
        if (aVar != null) {
            return Long.valueOf(aVar.getTimestampMillis());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final Map<Long, C23465k> m9578e() {
        return this.savePacketMap;
    }

    public String toString() {
        String str;
        int i13 = this.count;
        a aVar = this.first;
        Long lValueOf = aVar != null ? Long.valueOf(aVar.getTimestampMillis()) : null;
        a aVar2 = this.last;
        Long lValueOf2 = aVar2 != null ? Long.valueOf(aVar2.getTimestampMillis()) : null;
        a aVar3 = this.first;
        Long lValueOf3 = aVar3 != null ? Long.valueOf(aVar3.getSequence()) : null;
        a aVar4 = this.last;
        Long lValueOf4 = aVar4 != null ? Long.valueOf(aVar4.getSequence()) : null;
        Long lM9577d = m9577d();
        if (this.sequenceGaps.isEmpty()) {
            str = "";
        } else {
            str = " | SequenceGaps: " + this.sequenceGaps;
        }
        return i13 + " metrics packets | Time: " + lValueOf + " - " + lValueOf2 + " | Sequence: " + lValueOf3 + " - " + lValueOf4 + " | Watermark: " + lM9577d + str;
    }
}
