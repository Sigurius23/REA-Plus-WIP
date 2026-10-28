package qh2;

import dk0.AbstractC12109i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qh2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lqh2/a;", "", "", "a", "()J", "historyCycleStartTime", "d", "c", "b", "Lqh2/a$a;", "Lqh2/a$b;", "Lqh2/a$c;", "Lqh2/a$d;", "strap-pipeline-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
interface InterfaceC30369a {

    /* JADX INFO: renamed from: qh2.a$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lqh2/a$a;", "Lqh2/a;", "", "historyCycleStartTime", "Ldk0/i;", "metadataPacket", "<init>", "(JLdk0/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ldk0/i;", "getMetadataPacket", "()Ldk0/i;", "strap-pipeline-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC30369a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long historyCycleStartTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC12109i metadataPacket;

        public a(long j7, AbstractC12109i abstractC12109i) {
            this.historyCycleStartTime = j7;
            this.metadataPacket = abstractC12109i;
        }

        @Override // qh2.InterfaceC30369a
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getHistoryCycleStartTime() {
            return this.historyCycleStartTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.historyCycleStartTime == aVar.historyCycleStartTime && AbstractC22676k.m65745e(this.metadataPacket, aVar.metadataPacket);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.historyCycleStartTime) * 31;
            AbstractC12109i abstractC12109i = this.metadataPacket;
            return iHashCode + (abstractC12109i == null ? 0 : abstractC12109i.hashCode());
        }

        public String toString() {
            return "HistoryComplete(historyCycleStartTime=" + this.historyCycleStartTime + ", metadataPacket=" + this.metadataPacket + ")";
        }
    }

    /* JADX INFO: renamed from: qh2.a$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lqh2/a$b;", "Lqh2/a;", "", "historyCycleStartTime", "Ldk0/i;", "metadataPacket", "<init>", "(JLdk0/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ldk0/i;", "getMetadataPacket", "()Ldk0/i;", "strap-pipeline-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC30369a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long historyCycleStartTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC12109i metadataPacket;

        public b(long j7, AbstractC12109i abstractC12109i) {
            this.historyCycleStartTime = j7;
            this.metadataPacket = abstractC12109i;
        }

        @Override // qh2.InterfaceC30369a
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getHistoryCycleStartTime() {
            return this.historyCycleStartTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.historyCycleStartTime == bVar.historyCycleStartTime && AbstractC22676k.m65745e(this.metadataPacket, bVar.metadataPacket);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.historyCycleStartTime) * 31;
            AbstractC12109i abstractC12109i = this.metadataPacket;
            return iHashCode + (abstractC12109i == null ? 0 : abstractC12109i.hashCode());
        }

        public String toString() {
            return "HistoryEnd(historyCycleStartTime=" + this.historyCycleStartTime + ", metadataPacket=" + this.metadataPacket + ")";
        }
    }

    /* JADX INFO: renamed from: qh2.a$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lqh2/a$c;", "Lqh2/a;", "", "historyCycleStartTime", "Ldk0/i;", "metadataPacket", "<init>", "(JLdk0/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ldk0/i;", "getMetadataPacket", "()Ldk0/i;", "strap-pipeline-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC30369a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long historyCycleStartTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC12109i metadataPacket;

        public c(long j7, AbstractC12109i abstractC12109i) {
            this.historyCycleStartTime = j7;
            this.metadataPacket = abstractC12109i;
        }

        @Override // qh2.InterfaceC30369a
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getHistoryCycleStartTime() {
            return this.historyCycleStartTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.historyCycleStartTime == cVar.historyCycleStartTime && AbstractC22676k.m65745e(this.metadataPacket, cVar.metadataPacket);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.historyCycleStartTime) * 31;
            AbstractC12109i abstractC12109i = this.metadataPacket;
            return iHashCode + (abstractC12109i == null ? 0 : abstractC12109i.hashCode());
        }

        public String toString() {
            return "HistoryStart(historyCycleStartTime=" + this.historyCycleStartTime + ", metadataPacket=" + this.metadataPacket + ")";
        }
    }

    /* JADX INFO: renamed from: qh2.a$d */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lqh2/a$d;", "Lqh2/a;", "<init>", "()V", "", "b", "J", "a", "()J", "historyCycleStartTime", "strap-pipeline-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC30369a {

        /* JADX INFO: renamed from: a */
        public static final d f124581a = new d();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final long historyCycleStartTime = -1;

        private d() {
        }

        @Override // qh2.InterfaceC30369a
        /* JADX INFO: renamed from: a */
        public long getHistoryCycleStartTime() {
            return historyCycleStartTime;
        }
    }

    /* JADX INFO: renamed from: a */
    long getHistoryCycleStartTime();
}
