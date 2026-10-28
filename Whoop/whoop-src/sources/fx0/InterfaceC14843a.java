package fx0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fx0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\u0003\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lfx0/a;", "", "", "a", "()Ljava/lang/String;", "triggerSource", "b", "c", "d", "Lfx0/a$a;", "Lfx0/a$b;", "Lfx0/a$c;", "Lfx0/a$d;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14843a {

    /* JADX INFO: renamed from: fx0.a$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, m65681d2 = {"Lfx0/a$b;", "Lfx0/a;", "", "triggerSource", "", "triggerTimestamp", "resultTimestamp", "", "totalUploadRecordCount", "<init>", "(Ljava/lang/String;JJI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "d", "()J", "c", "I", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC14843a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String triggerSource;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long triggerTimestamp;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long resultTimestamp;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int totalUploadRecordCount;

        public b(String triggerSource, long j7, long j13, int i13) {
            AbstractC22676k.m65750j(triggerSource, "triggerSource");
            this.triggerSource = triggerSource;
            this.triggerTimestamp = j7;
            this.resultTimestamp = j13;
            this.totalUploadRecordCount = i13;
        }

        @Override // fx0.InterfaceC14843a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public long getResultTimestamp() {
            return this.resultTimestamp;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTotalUploadRecordCount() {
            return this.totalUploadRecordCount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public long getTriggerTimestamp() {
            return this.triggerTimestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.triggerSource, bVar.triggerSource) && this.triggerTimestamp == bVar.triggerTimestamp && this.resultTimestamp == bVar.resultTimestamp && this.totalUploadRecordCount == bVar.totalUploadRecordCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.totalUploadRecordCount) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(this.triggerSource.hashCode() * 31, this.triggerTimestamp, 31), this.resultTimestamp, 31);
        }

        public String toString() {
            String str = this.triggerSource;
            long j7 = this.triggerTimestamp;
            long j13 = this.resultTimestamp;
            int i13 = this.totalUploadRecordCount;
            StringBuilder sbM32000s = AbstractC11895b.m32000s("Complete(triggerSource=", str, j7, ", triggerTimestamp=");
            AbstractC2875y.m8285A(sbM32000s, ", resultTimestamp=", j13, ", totalUploadRecordCount=");
            return AbstractC18489d0.m53371l(sbM32000s, i13, ")");
        }
    }

    /* JADX INFO: renamed from: fx0.a$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lfx0/a$c;", "Lfx0/a;", "", "triggerSource", "", "triggerTimestamp", "resultTimestamp", "<init>", "(Ljava/lang/String;JJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "c", "()J", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC14843a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String triggerSource;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long triggerTimestamp;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long resultTimestamp;

        public c(String triggerSource, long j7, long j13) {
            AbstractC22676k.m65750j(triggerSource, "triggerSource");
            this.triggerSource = triggerSource;
            this.triggerTimestamp = j7;
            this.resultTimestamp = j13;
        }

        @Override // fx0.InterfaceC14843a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public long getResultTimestamp() {
            return this.resultTimestamp;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public long getTriggerTimestamp() {
            return this.triggerTimestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.triggerSource, cVar.triggerSource) && this.triggerTimestamp == cVar.triggerTimestamp && this.resultTimestamp == cVar.resultTimestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.resultTimestamp) + AbstractC11266d.m30451e(this.triggerSource.hashCode() * 31, this.triggerTimestamp, 31);
        }

        public String toString() {
            String str = this.triggerSource;
            long j7 = this.triggerTimestamp;
            long j13 = this.resultTimestamp;
            StringBuilder sbM32000s = AbstractC11895b.m32000s("Fail(triggerSource=", str, j7, ", triggerTimestamp=");
            sbM32000s.append(", resultTimestamp=");
            sbM32000s.append(j13);
            sbM32000s.append(")");
            return sbM32000s.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    String getTriggerSource();

    /* JADX INFO: renamed from: fx0.a$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, m65681d2 = {"Lfx0/a$a;", "Lfx0/a;", "", "triggerSource", "", "triggerTimestamp", "resultTimestamp", "<init>", "(Ljava/lang/String;JJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "c", "getResultTimestamp", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC14843a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String triggerSource;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long triggerTimestamp;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long resultTimestamp;

        public a(String triggerSource, long j7, long j13) {
            AbstractC22676k.m65750j(triggerSource, "triggerSource");
            this.triggerSource = triggerSource;
            this.triggerTimestamp = j7;
            this.resultTimestamp = j13;
        }

        @Override // fx0.InterfaceC14843a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public long getTriggerTimestamp() {
            return this.triggerTimestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.triggerSource, aVar.triggerSource) && this.triggerTimestamp == aVar.triggerTimestamp && this.resultTimestamp == aVar.resultTimestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.resultTimestamp) + AbstractC11266d.m30451e(this.triggerSource.hashCode() * 31, this.triggerTimestamp, 31);
        }

        public String toString() {
            String str = this.triggerSource;
            long j7 = this.triggerTimestamp;
            long j13 = this.resultTimestamp;
            StringBuilder sbM32000s = AbstractC11895b.m32000s("Cancelled(triggerSource=", str, j7, ", triggerTimestamp=");
            sbM32000s.append(", resultTimestamp=");
            sbM32000s.append(j13);
            sbM32000s.append(")");
            return sbM32000s.toString();
        }

        public /* synthetic */ a(String str, long j7, long j13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j7, (i13 & 4) != 0 ? -1L : j13);
        }
    }

    /* JADX INFO: renamed from: fx0.a$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, m65681d2 = {"Lfx0/a$d;", "Lfx0/a;", "", "triggerSource", "", "triggerTimestamp", "resultTimestamp", "<init>", "(Ljava/lang/String;JJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "c", "getResultTimestamp", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC14843a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String triggerSource;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long triggerTimestamp;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long resultTimestamp;

        public d(String triggerSource, long j7, long j13) {
            AbstractC22676k.m65750j(triggerSource, "triggerSource");
            this.triggerSource = triggerSource;
            this.triggerTimestamp = j7;
            this.resultTimestamp = j13;
        }

        @Override // fx0.InterfaceC14843a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public long getTriggerTimestamp() {
            return this.triggerTimestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.triggerSource, dVar.triggerSource) && this.triggerTimestamp == dVar.triggerTimestamp && this.resultTimestamp == dVar.resultTimestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.resultTimestamp) + AbstractC11266d.m30451e(this.triggerSource.hashCode() * 31, this.triggerTimestamp, 31);
        }

        public String toString() {
            String str = this.triggerSource;
            long j7 = this.triggerTimestamp;
            long j13 = this.resultTimestamp;
            StringBuilder sbM32000s = AbstractC11895b.m32000s("Skip(triggerSource=", str, j7, ", triggerTimestamp=");
            sbM32000s.append(", resultTimestamp=");
            sbM32000s.append(j13);
            sbM32000s.append(")");
            return sbM32000s.toString();
        }

        public /* synthetic */ d(String str, long j7, long j13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j7, (i13 & 4) != 0 ? -1L : j13);
        }
    }
}
