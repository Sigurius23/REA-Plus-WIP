package xk2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xk2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxk2/b;", "", "<init>", "()V", "", "Lxk2/j;", "segment", "c", "(Ljava/util/List;)Ljava/util/List;", "", "values", "percentile", "a", "(Ljava/util/List;D)D", "buffer", "", "lastProcessedTimestampMillis", "Lxk2/b$a;", "b", "(Ljava/util/List;Ljava/lang/Long;)Lxk2/b$a;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38436b {

    /* JADX INFO: renamed from: a */
    public static final C38436b f164610a = new C38436b();

    /* JADX INFO: renamed from: xk2.b$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, m65681d2 = {"Lxk2/b$a;", "", "", "Lxk2/j;", "finalizedPoints", "", "nextTimestampMillis", "lastProcessedTimestampMillis", "trimmedBuffer", "<init>", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "d", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C38444j> finalizedPoints;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Long nextTimestampMillis;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Long lastProcessedTimestampMillis;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C38444j> trimmedBuffer;

        public a(List<C38444j> finalizedPoints, Long l7, Long l12, List<C38444j> trimmedBuffer) {
            AbstractC22676k.m65750j(finalizedPoints, "finalizedPoints");
            AbstractC22676k.m65750j(trimmedBuffer, "trimmedBuffer");
            this.finalizedPoints = finalizedPoints;
            this.nextTimestampMillis = l7;
            this.lastProcessedTimestampMillis = l12;
            this.trimmedBuffer = trimmedBuffer;
        }

        /* JADX INFO: renamed from: a */
        public final List<C38444j> m123133a() {
            return this.finalizedPoints;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getLastProcessedTimestampMillis() {
            return this.lastProcessedTimestampMillis;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getNextTimestampMillis() {
            return this.nextTimestampMillis;
        }

        /* JADX INFO: renamed from: d */
        public final List<C38444j> m123136d() {
            return this.trimmedBuffer;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.finalizedPoints, aVar.finalizedPoints) && AbstractC22676k.m65745e(this.nextTimestampMillis, aVar.nextTimestampMillis) && AbstractC22676k.m65745e(this.lastProcessedTimestampMillis, aVar.lastProcessedTimestampMillis) && AbstractC22676k.m65745e(this.trimmedBuffer, aVar.trimmedBuffer);
        }

        public int hashCode() {
            int iHashCode = this.finalizedPoints.hashCode() * 31;
            Long l7 = this.nextTimestampMillis;
            int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
            Long l12 = this.lastProcessedTimestampMillis;
            return this.trimmedBuffer.hashCode() + ((iHashCode2 + (l12 != null ? l12.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Result(finalizedPoints=" + this.finalizedPoints + ", nextTimestampMillis=" + this.nextTimestampMillis + ", lastProcessedTimestampMillis=" + this.lastProcessedTimestampMillis + ", trimmedBuffer=" + this.trimmedBuffer + ")";
        }
    }

    private C38436b() {
    }

    /* JADX INFO: renamed from: a */
    private final double m123130a(List<Double> values, double percentile) {
        if (values.isEmpty()) {
            return 0.0d;
        }
        if (values.size() == 1) {
            return values.get(0).doubleValue();
        }
        List listM74150t1 = AbstractC25265s.m74150t1(values);
        if (percentile <= 0.0d) {
            return ((Number) AbstractC25265s.m74096F0(listM74150t1)).doubleValue();
        }
        if (percentile >= 1.0d) {
            return ((Number) AbstractC25265s.m74112P0(listM74150t1)).doubleValue();
        }
        double size = (((double) listM74150t1.size()) - 1.0d) * percentile;
        int iFloor = (int) Math.floor(size);
        double d3 = size - ((double) iFloor);
        double dDoubleValue = ((Number) listM74150t1.get(iFloor)).doubleValue();
        return ((((Number) listM74150t1.get(iFloor + 1)).doubleValue() - dDoubleValue) * d3) + dDoubleValue;
    }

    /* JADX INFO: renamed from: c */
    private final List<C38444j> m123131c(List<C38444j> segment) {
        List list;
        Iterator<T> it = segment.iterator();
        if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                arrayList.add(Double.valueOf((((C38444j) next2).getTimestampMillis() - ((C38444j) next).getTimestampMillis()) / 1000.0d));
                next = next2;
            }
            list = arrayList;
        } else {
            list = C25271y.f99162w;
        }
        Double dM74116T0 = AbstractC25265s.m74116T0(list);
        if (dM74116T0 == null || dM74116T0.doubleValue() < 30.0d) {
            return segment;
        }
        Iterator it3 = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i13 = -1;
                break;
            }
            if (((Number) it3.next()).doubleValue() >= 30.0d) {
                break;
            }
            i13++;
        }
        return i13 > 30 ? segment.subList(0, i13 + 1) : segment.subList(i13 + 1, segment.size());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX INFO: renamed from: b */
    public final a m123132b(List<C38444j> buffer, Long lastProcessedTimestampMillis) {
        int iIntValue;
        AbstractC22676k.m65750j(buffer, "buffer");
        if (lastProcessedTimestampMillis != null) {
            long jLongValue = lastProcessedTimestampMillis.longValue();
            Iterator<C38444j> it = buffer.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                if (it.next().getTimestampMillis() == jLongValue) {
                    break;
                }
                i13++;
            }
            Integer numValueOf = Integer.valueOf(i13);
            if (i13 < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue() + 1;
            } else {
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        ArrayList arrayList = new ArrayList();
        Long lValueOf = null;
        while (iIntValue < buffer.size()) {
            if (iIntValue < buffer.size() - 30) {
                long timestampMillis = buffer.get(iIntValue).getTimestampMillis();
                List<C38444j> listM123131c = m123131c(buffer.subList(Math.max(0, iIntValue - 30), Math.min(buffer.size(), iIntValue + 30)));
                if (!listM123131c.isEmpty()) {
                    List<C38444j> list = listM123131c;
                    ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(Double.valueOf(((C38444j) it3.next()).getHeartRate()));
                    }
                    arrayList.add(new C38444j(timestampMillis, m123130a(arrayList2, 0.25d)));
                }
                lastProcessedTimestampMillis = Long.valueOf(timestampMillis);
                C38444j c38444j = (C38444j) AbstractC25265s.m74102I0(iIntValue + 1, buffer);
                lValueOf = c38444j != null ? Long.valueOf(c38444j.getTimestampMillis()) : null;
            }
            iIntValue++;
        }
        return new a(arrayList, lValueOf, lastProcessedTimestampMillis, buffer.subList(Math.max(0, iIntValue - 60), buffer.size()));
    }
}
