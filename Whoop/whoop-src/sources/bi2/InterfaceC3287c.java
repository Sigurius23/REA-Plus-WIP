package bi2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yh2.C39543b;

/* JADX INFO: renamed from: bi2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lbi2/c;", "", "a", "b", "c", "Lbi2/c$a;", "Lbi2/c$b;", "Lbi2/c$c;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC3287c {

    /* JADX INFO: renamed from: bi2.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lbi2/c$a;", "Lbi2/c;", "Lyh2/b;", "exportedHeartData", "<init>", "(Lyh2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyh2/b;", "()Lyh2/b;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC3287c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C39543b exportedHeartData;

        public a(C39543b exportedHeartData) {
            AbstractC22676k.m65750j(exportedHeartData, "exportedHeartData");
            this.exportedHeartData = exportedHeartData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39543b getExportedHeartData() {
            return this.exportedHeartData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.exportedHeartData, ((a) other).exportedHeartData);
        }

        public int hashCode() {
            return this.exportedHeartData.hashCode();
        }

        public String toString() {
            return "Complete(exportedHeartData=" + this.exportedHeartData + ")";
        }
    }

    /* JADX INFO: renamed from: bi2.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lbi2/c$b;", "Lbi2/c;", "<init>", "()V", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC3287c {

        /* JADX INFO: renamed from: a */
        public static final b f12830a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: bi2.c$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lbi2/c$c;", "Lbi2/c;", "Lyh2/b;", "exportedHeartData", "", "numberOfAttempts", "<init>", "(Lyh2/b;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyh2/b;", "()Lyh2/b;", "b", "I", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC3287c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C39543b exportedHeartData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int numberOfAttempts;

        public c(C39543b exportedHeartData, int i13) {
            AbstractC22676k.m65750j(exportedHeartData, "exportedHeartData");
            this.exportedHeartData = exportedHeartData;
            this.numberOfAttempts = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39543b getExportedHeartData() {
            return this.exportedHeartData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getNumberOfAttempts() {
            return this.numberOfAttempts;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.exportedHeartData, cVar.exportedHeartData) && this.numberOfAttempts == cVar.numberOfAttempts;
        }

        public int hashCode() {
            return Integer.hashCode(this.numberOfAttempts) + (this.exportedHeartData.hashCode() * 31);
        }

        public String toString() {
            return "HasMoreDataInDb(exportedHeartData=" + this.exportedHeartData + ", numberOfAttempts=" + this.numberOfAttempts + ")";
        }
    }
}
