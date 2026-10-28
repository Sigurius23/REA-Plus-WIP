package p82;

import com.whoop.domain.model.MetricsProcessedTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yh2.C39543b;

/* JADX INFO: renamed from: p82.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lp82/c;", "", "a", "b", "c", "Lp82/c$a;", "Lp82/c$b;", "Lp82/c$c;", "sensor-data-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC28974c {

    /* JADX INFO: renamed from: p82.c$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lp82/c$a;", "Lp82/c;", "Lyh2/b;", "exportedHeartData", "Lcom/whoop/domain/model/MetricsProcessedTime;", "metricsProcessedTime", "<init>", "(Lyh2/b;Lcom/whoop/domain/model/MetricsProcessedTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyh2/b;", "()Lyh2/b;", "b", "Lcom/whoop/domain/model/MetricsProcessedTime;", "()Lcom/whoop/domain/model/MetricsProcessedTime;", "sensor-data-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC28974c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C39543b exportedHeartData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final MetricsProcessedTime metricsProcessedTime;

        public a(C39543b exportedHeartData, MetricsProcessedTime metricsProcessedTime) {
            AbstractC22676k.m65750j(exportedHeartData, "exportedHeartData");
            AbstractC22676k.m65750j(metricsProcessedTime, "metricsProcessedTime");
            this.exportedHeartData = exportedHeartData;
            this.metricsProcessedTime = metricsProcessedTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39543b getExportedHeartData() {
            return this.exportedHeartData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final MetricsProcessedTime getMetricsProcessedTime() {
            return this.metricsProcessedTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.exportedHeartData, aVar.exportedHeartData) && AbstractC22676k.m65745e(this.metricsProcessedTime, aVar.metricsProcessedTime);
        }

        public int hashCode() {
            return this.metricsProcessedTime.hashCode() + (this.exportedHeartData.hashCode() * 31);
        }

        public String toString() {
            return "Complete(exportedHeartData=" + this.exportedHeartData + ", metricsProcessedTime=" + this.metricsProcessedTime + ")";
        }
    }

    /* JADX INFO: renamed from: p82.c$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lp82/c$b;", "Lp82/c;", "Lyh2/b;", "exportedHeartData", "<init>", "(Lyh2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyh2/b;", "getExportedHeartData", "()Lyh2/b;", "sensor-data-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC28974c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C39543b exportedHeartData;

        public b(C39543b c39543b) {
            this.exportedHeartData = c39543b;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.exportedHeartData, ((b) other).exportedHeartData);
        }

        public int hashCode() {
            C39543b c39543b = this.exportedHeartData;
            if (c39543b == null) {
                return 0;
            }
            return c39543b.hashCode();
        }

        public String toString() {
            return "Error(exportedHeartData=" + this.exportedHeartData + ")";
        }
    }

    /* JADX INFO: renamed from: p82.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lp82/c$c;", "Lp82/c;", "<init>", "()V", "sensor-data-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC28974c {

        /* JADX INFO: renamed from: a */
        public static final c f117210a = new c();

        private c() {
        }
    }
}
