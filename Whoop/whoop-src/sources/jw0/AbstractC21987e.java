package jw0;

import com.whoop.core.details.network.model.sleep.SleepMetricTypeModel;
import com.whoop.design.util.TextResource;
import mc1.EnumC25417b;
import nw0.AbstractC27201h;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: jw0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Ljw0/e;", "", "<init>", "()V", "g", "d", "c", "e", "f", "a", "b", "Ljw0/e$a;", "Ljw0/e$b;", "Ljw0/e$c;", "Ljw0/e$d;", "Ljw0/e$e;", "Ljw0/e$f;", "Ljw0/e$g;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21987e {

    /* JADX INFO: renamed from: jw0.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Ljw0/e$a;", "Ljw0/e;", "Lcom/whoop/design/util/TextResource;", "valueDisplay", "unitDisplay", "timeDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21987e {

        /* JADX INFO: renamed from: d */
        public static final int f85157d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource valueDisplay;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource unitDisplay;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource timeDisplay;

        public a(TextResource textResource, TextResource textResource2, TextResource textResource3) {
            super(null);
            this.valueDisplay = textResource;
            this.unitDisplay = textResource2;
            this.timeDisplay = textResource3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getTimeDisplay() {
            return this.timeDisplay;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getUnitDisplay() {
            return this.unitDisplay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getValueDisplay() {
            return this.valueDisplay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.valueDisplay, aVar.valueDisplay) && AbstractC22676k.m65745e(this.unitDisplay, aVar.unitDisplay) && AbstractC22676k.m65745e(this.timeDisplay, aVar.timeDisplay);
        }

        public int hashCode() {
            TextResource textResource = this.valueDisplay;
            int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
            TextResource textResource2 = this.unitDisplay;
            int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
            TextResource textResource3 = this.timeDisplay;
            return iHashCode2 + (textResource3 != null ? textResource3.hashCode() : 0);
        }

        public String toString() {
            TextResource textResource = this.valueDisplay;
            TextResource textResource2 = this.unitDisplay;
            return AbstractC30007c.m91841k(AbstractC33745d.m106658q("HRGraphScrubbed(valueDisplay=", textResource, ", unitDisplay=", textResource2, ", timeDisplay="), this.timeDisplay, ")");
        }
    }

    /* JADX INFO: renamed from: jw0.e$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljw0/e$b;", "Ljw0/e;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC21987e {

        /* JADX INFO: renamed from: a */
        public static final b f85161a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jw0.e$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ljw0/e$c;", "Ljw0/e;", "Lnw0/h;", "sleepDialogType", "<init>", "(Lnw0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnw0/h;", "()Lnw0/h;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC21987e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC27201h sleepDialogType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC27201h sleepDialogType) {
            super(null);
            AbstractC22676k.m65750j(sleepDialogType, "sleepDialogType");
            this.sleepDialogType = sleepDialogType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC27201h getSleepDialogType() {
            return this.sleepDialogType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.sleepDialogType, ((c) other).sleepDialogType);
        }

        public int hashCode() {
            return this.sleepDialogType.hashCode();
        }

        public String toString() {
            return "LaunchDialog(sleepDialogType=" + this.sleepDialogType + ")";
        }
    }

    /* JADX INFO: renamed from: jw0.e$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljw0/e$d;", "Ljw0/e;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC21987e {

        /* JADX INFO: renamed from: a */
        public static final d f85163a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jw0.e$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ljw0/e$e;", "Ljw0/e;", "Lmc1/b;", "heartRateZoneType", "<init>", "(Lmc1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmc1/b;", "()Lmc1/b;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC21987e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC25417b heartRateZoneType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EnumC25417b heartRateZoneType) {
            super(null);
            AbstractC22676k.m65750j(heartRateZoneType, "heartRateZoneType");
            this.heartRateZoneType = heartRateZoneType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC25417b getHeartRateZoneType() {
            return this.heartRateZoneType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && this.heartRateZoneType == ((e) other).heartRateZoneType;
        }

        public int hashCode() {
            return this.heartRateZoneType.hashCode();
        }

        public String toString() {
            return "SelectSleepStage(heartRateZoneType=" + this.heartRateZoneType + ")";
        }
    }

    /* JADX INFO: renamed from: jw0.e$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ljw0/e$f;", "Ljw0/e;", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "sleepMetricType", "<init>", "(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC21987e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final SleepMetricTypeModel sleepMetricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SleepMetricTypeModel sleepMetricType) {
            super(null);
            AbstractC22676k.m65750j(sleepMetricType, "sleepMetricType");
            this.sleepMetricType = sleepMetricType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SleepMetricTypeModel getSleepMetricType() {
            return this.sleepMetricType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.sleepMetricType == ((f) other).sleepMetricType;
        }

        public int hashCode() {
            return this.sleepMetricType.hashCode();
        }

        public String toString() {
            return "Tooltip(sleepMetricType=" + this.sleepMetricType + ")";
        }
    }

    /* JADX INFO: renamed from: jw0.e$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Ljw0/e$g;", "Ljw0/e;", "", "sourceId", "sleepIdV2", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC21987e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String sourceId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String sleepIdV2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String sleepIdV2) {
            super(null);
            AbstractC22676k.m65750j(sleepIdV2, "sleepIdV2");
            this.sourceId = str;
            this.sleepIdV2 = sleepIdV2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSleepIdV2() {
            return this.sleepIdV2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.sourceId, gVar.sourceId) && AbstractC22676k.m65745e(this.sleepIdV2, gVar.sleepIdV2);
        }

        public int hashCode() {
            String str = this.sourceId;
            return this.sleepIdV2.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("Update(sourceId=", this.sourceId, ", sleepIdV2=", this.sleepIdV2, ")");
        }
    }

    public /* synthetic */ AbstractC21987e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21987e() {
    }
}
