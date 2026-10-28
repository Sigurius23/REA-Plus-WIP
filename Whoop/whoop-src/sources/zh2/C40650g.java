package zh2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: zh2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lzh2/g;", "", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "", "revision", "", "dataSequenceNumber", "Ll83/a0;", "b", "(SJ)V", "Lzh2/b;", "a", "()Lzh2/b;", "c", "()V", "Ltr2/n;", "", "Lzh2/g$a;", "Ljava/util/Map;", "revisions", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40650g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<Short, a> revisions;

    public C40650g(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
        this.revisions = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final C40645b m131914a() {
        C23465k c23465k;
        Iterator<T> it = this.revisions.values().iterator();
        int gapCount = 0;
        while (it.hasNext()) {
            gapCount += ((a) it.next()).getGapCount();
        }
        Iterator<T> it3 = this.revisions.values().iterator();
        long missingCount = 0;
        while (it3.hasNext()) {
            missingCount += ((a) it3.next()).getMissingCount();
        }
        Iterator<T> it4 = this.revisions.values().iterator();
        int backwardCount = 0;
        while (it4.hasNext()) {
            backwardCount += ((a) it4.next()).getBackwardCount();
        }
        Map<Short, a> map = this.revisions;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        Iterator<T> it5 = map.entrySet().iterator();
        while (it5.hasNext()) {
            Map.Entry entry = (Map.Entry) it5.next();
            linkedHashMap.put(entry.getKey(), Long.valueOf(((a) entry.getValue()).getFirstSequence()));
        }
        Set<Map.Entry<Short, a>> setEntrySet = this.revisions.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it6 = setEntrySet.iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            short sShortValue = ((Number) entry2.getKey()).shortValue();
            Long lastSequence = ((a) entry2.getValue()).getLastSequence();
            if (lastSequence != null) {
                c23465k = new C23465k(Short.valueOf(sShortValue), Long.valueOf(lastSequence.longValue()));
            } else {
                c23465k = null;
            }
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        return new C40645b(gapCount, missingCount, backwardCount, linkedHashMap, AbstractC25247g0.m74000i0(arrayList));
    }

    /* JADX INFO: renamed from: b */
    public final void m131915b(short revision, long dataSequenceNumber) {
        long j7;
        Map<Short, a> map = this.revisions;
        Short shValueOf = Short.valueOf(revision);
        a aVar = map.get(shValueOf);
        if (aVar == null) {
            j7 = dataSequenceNumber;
            aVar = new a(j7, null, 0, 0L, 0, 30, null);
            map.put(shValueOf, aVar);
        } else {
            j7 = dataSequenceNumber;
        }
        a aVar2 = aVar;
        Long lastSequence = aVar2.getLastSequence();
        if (lastSequence != null) {
            if (j7 > lastSequence.longValue() + 1) {
                aVar2.m131923g(aVar2.getGapCount() + 1);
                aVar2.m131925i(((j7 - lastSequence.longValue()) - 1) + aVar2.getMissingCount());
                InterfaceC34116n interfaceC34116n = this.logger;
                long jLongValue = lastSequence.longValue() + 1;
                long jLongValue2 = (j7 - lastSequence.longValue()) - 1;
                StringBuilder sb4 = new StringBuilder("Sequence gap V");
                sb4.append((int) revision);
                sb4.append(": expected ");
                sb4.append(jLongValue);
                AbstractC2875y.m8285A(sb4, ", got ", j7, " (missing ");
                interfaceC34116n.mo85226q(AbstractC11266d.m30457k(jLongValue2, ")", sb4), new AbstractC30556a.a[0]);
            } else if (j7 <= lastSequence.longValue()) {
                aVar2.m131922f(aVar2.getBackwardCount() + 1);
                this.logger.mo85226q("Backward/duplicate V" + ((int) revision) + ": expected " + (lastSequence.longValue() + 1) + ", got " + j7, new AbstractC30556a.a[0]);
            }
        }
        if (lastSequence == null || j7 > lastSequence.longValue()) {
            aVar2.m131924h(Long.valueOf(j7));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m131916c() {
        this.revisions.clear();
    }

    public /* synthetic */ C40650g(InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SequenceGapTracker") : interfaceC34116n);
    }

    /* JADX INFO: renamed from: zh2.g$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u000f\"\u0004\b!\u0010\"R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010 \u001a\u0004\b\u0014\u0010\u000f\"\u0004\b%\u0010\"¨\u0006&"}, m65681d2 = {"Lzh2/g$a;", "", "", "firstSequence", "lastSequence", "", "gapCount", "missingCount", "backwardCount", "<init>", "(JLjava/lang/Long;IJI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "setFirstSequence", "(J)V", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/Long;)V", "c", "I", "g", "(I)V", "e", "i", "f", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long firstSequence;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private Long lastSequence;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int gapCount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private long missingCount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private int backwardCount;

        public a(long j7, Long l7, int i13, long j13, int i14) {
            this.firstSequence = j7;
            this.lastSequence = l7;
            this.gapCount = i13;
            this.missingCount = j13;
            this.backwardCount = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getBackwardCount() {
            return this.backwardCount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getFirstSequence() {
            return this.firstSequence;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getGapCount() {
            return this.gapCount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getLastSequence() {
            return this.lastSequence;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getMissingCount() {
            return this.missingCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.firstSequence == aVar.firstSequence && AbstractC22676k.m65745e(this.lastSequence, aVar.lastSequence) && this.gapCount == aVar.gapCount && this.missingCount == aVar.missingCount && this.backwardCount == aVar.backwardCount;
        }

        /* JADX INFO: renamed from: f */
        public final void m131922f(int i13) {
            this.backwardCount = i13;
        }

        /* JADX INFO: renamed from: g */
        public final void m131923g(int i13) {
            this.gapCount = i13;
        }

        /* JADX INFO: renamed from: h */
        public final void m131924h(Long l7) {
            this.lastSequence = l7;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.firstSequence) * 31;
            Long l7 = this.lastSequence;
            return Integer.hashCode(this.backwardCount) + AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.gapCount, (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31, 31), this.missingCount, 31);
        }

        /* JADX INFO: renamed from: i */
        public final void m131925i(long j7) {
            this.missingCount = j7;
        }

        public String toString() {
            return "RevisionState(firstSequence=" + this.firstSequence + ", lastSequence=" + this.lastSequence + ", gapCount=" + this.gapCount + ", missingCount=" + this.missingCount + ", backwardCount=" + this.backwardCount + ")";
        }

        public /* synthetic */ a(long j7, Long l7, int i13, long j13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(j7, (i15 & 2) != 0 ? null : l7, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0L : j13, (i15 & 16) != 0 ? 0 : i14);
        }
    }
}
