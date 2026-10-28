package bw0;

import com.whoop.core.details.network.model.DetailsEditComponent;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import mc1.EnumC25417b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bw0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lbw0/a;", "", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "g", "d", "c", "b", "i", "e", "Lbw0/a$a;", "Lbw0/a$b;", "Lbw0/a$c;", "Lbw0/a$d;", "Lbw0/a$e;", "Lbw0/a$f;", "Lbw0/a$g;", "Lbw0/a$h;", "Lbw0/a$i;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC3678a {

    /* JADX INFO: renamed from: bw0.a$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lbw0/a$a;", "Lbw0/a;", "", "activityId", "activityType", "entryPoint", "activityName", "", "newHome", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC3678a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String activityName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean newHome;

        public a(String activityId, String activityType, String entryPoint, String activityName, boolean z4) {
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(activityType, "activityType");
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            AbstractC22676k.m65750j(activityName, "activityName");
            this.activityId = activityId;
            this.activityType = activityType;
            this.entryPoint = entryPoint;
            this.activityName = activityName;
            this.newHome = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityName() {
            return this.activityName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getNewHome() {
            return this.newHome;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.activityId, aVar.activityId) && AbstractC22676k.m65745e(this.activityType, aVar.activityType) && AbstractC22676k.m65745e(this.entryPoint, aVar.entryPoint) && AbstractC22676k.m65745e(this.activityName, aVar.activityName) && this.newHome == aVar.newHome;
        }

        public int hashCode() {
            return Boolean.hashCode(this.newHome) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.activityId.hashCode() * 31, 31, this.activityType), 31, this.entryPoint), 31, this.activityName);
        }

        public String toString() {
            String str = this.activityId;
            String str2 = this.activityType;
            String str3 = this.entryPoint;
            String str4 = this.activityName;
            boolean z4 = this.newHome;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivityOpen(activityId=", str, ", activityType=", str2, ", entryPoint=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", activityName=", str4, ", newHome=");
            return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
        }
    }

    /* JADX INFO: renamed from: bw0.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lbw0/a$b;", "Lbw0/a;", "", "activityId", "activityType", "activityName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getActivityType", "c", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC3678a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityName;

        public b(String activityId, String activityType, String activityName) {
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(activityType, "activityType");
            AbstractC22676k.m65750j(activityName, "activityName");
            this.activityId = activityId;
            this.activityType = activityType;
            this.activityName = activityName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityName() {
            return this.activityName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.activityId, bVar.activityId) && AbstractC22676k.m65745e(this.activityType, bVar.activityType) && AbstractC22676k.m65745e(this.activityName, bVar.activityName);
        }

        public int hashCode() {
            return this.activityName.hashCode() + AbstractC11266d.m30450d(this.activityId.hashCode() * 31, 31, this.activityType);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.activityName, ")", AbstractC11895b.m32001t("CancelDeleteActivity(activityId=", this.activityId, ", activityType=", this.activityType, ", activityName="));
        }
    }

    /* JADX INFO: renamed from: bw0.a$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lbw0/a$c;", "Lbw0/a;", "", "activityId", "activityType", "Lcom/whoop/core/details/network/model/DetailsEditComponent;", "previousActivityDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/DetailsEditComponent;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/whoop/core/details/network/model/DetailsEditComponent;", "()Lcom/whoop/core/details/network/model/DetailsEditComponent;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC3678a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final DetailsEditComponent previousActivityDetails;

        public c(String activityId, String activityType, DetailsEditComponent detailsEditComponent) {
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(activityType, "activityType");
            this.activityId = activityId;
            this.activityType = activityType;
            this.previousActivityDetails = detailsEditComponent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DetailsEditComponent getPreviousActivityDetails() {
            return this.previousActivityDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.activityId, cVar.activityId) && AbstractC22676k.m65745e(this.activityType, cVar.activityType) && AbstractC22676k.m65745e(this.previousActivityDetails, cVar.previousActivityDetails);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.activityId.hashCode() * 31, 31, this.activityType);
            DetailsEditComponent detailsEditComponent = this.previousActivityDetails;
            return iM30450d + (detailsEditComponent == null ? 0 : detailsEditComponent.hashCode());
        }

        public String toString() {
            String str = this.activityId;
            String str2 = this.activityType;
            DetailsEditComponent detailsEditComponent = this.previousActivityDetails;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ConfirmDeleteActivity(activityId=", str, ", activityType=", str2, ", previousActivityDetails=");
            sbM32001t.append(detailsEditComponent);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: bw0.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lbw0/a$d;", "Lbw0/a;", "", "activityId", "activityType", "activityName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC3678a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityName;

        public d(String activityId, String activityType, String activityName) {
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(activityType, "activityType");
            AbstractC22676k.m65750j(activityName, "activityName");
            this.activityId = activityId;
            this.activityType = activityType;
            this.activityName = activityName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityName() {
            return this.activityName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getActivityType() {
            return this.activityType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.activityId, dVar.activityId) && AbstractC22676k.m65745e(this.activityType, dVar.activityType) && AbstractC22676k.m65745e(this.activityName, dVar.activityName);
        }

        public int hashCode() {
            return this.activityName.hashCode() + AbstractC11266d.m30450d(this.activityId.hashCode() * 31, 31, this.activityType);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.activityName, ")", AbstractC11895b.m32001t("DeleteActivity(activityId=", this.activityId, ", activityType=", this.activityType, ", activityName="));
        }
    }

    /* JADX INFO: renamed from: bw0.a$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lbw0/a$e;", "Lbw0/a;", "", "activityId", "activityType", "activityName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getActivityType", "c", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC3678a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityName;

        public e(String activityId, String activityType, String activityName) {
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(activityType, "activityType");
            AbstractC22676k.m65750j(activityName, "activityName");
            this.activityId = activityId;
            this.activityType = activityType;
            this.activityName = activityName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityName() {
            return this.activityName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.activityId, eVar.activityId) && AbstractC22676k.m65745e(this.activityType, eVar.activityType) && AbstractC22676k.m65745e(this.activityName, eVar.activityName);
        }

        public int hashCode() {
            return this.activityName.hashCode() + AbstractC11266d.m30450d(this.activityId.hashCode() * 31, 31, this.activityType);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.activityName, ")", AbstractC11895b.m32001t("DismissLinkingWorkoutCta(activityId=", this.activityId, ", activityType=", this.activityType, ", activityName="));
        }
    }

    /* JADX INFO: renamed from: bw0.a$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lbw0/a$f;", "Lbw0/a;", "", "activityId", "activityType", "Lmc1/b;", "selectedHrZone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmc1/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lmc1/b;", "()Lmc1/b;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC3678a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC25417b selectedHrZone;

        public f(String activityId, String activityType, EnumC25417b selectedHrZone) {
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(activityType, "activityType");
            AbstractC22676k.m65750j(selectedHrZone, "selectedHrZone");
            this.activityId = activityId;
            this.activityType = activityType;
            this.selectedHrZone = selectedHrZone;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC25417b getSelectedHrZone() {
            return this.selectedHrZone;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.activityId, fVar.activityId) && AbstractC22676k.m65745e(this.activityType, fVar.activityType) && this.selectedHrZone == fVar.selectedHrZone;
        }

        public int hashCode() {
            return this.selectedHrZone.hashCode() + AbstractC11266d.m30450d(this.activityId.hashCode() * 31, 31, this.activityType);
        }

        public String toString() {
            String str = this.activityId;
            String str2 = this.activityType;
            EnumC25417b enumC25417b = this.selectedHrZone;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("HRBarGraphSelected(activityId=", str, ", activityType=", str2, ", selectedHrZone=");
            sbM32001t.append(enumC25417b);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: bw0.a$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lbw0/a$g;", "Lbw0/a;", "", "activityId", "activityType", "activityName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getActivityId", "b", "c", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC3678a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityName;

        public g(String activityId, String activityType, String activityName) {
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(activityType, "activityType");
            AbstractC22676k.m65750j(activityName, "activityName");
            this.activityId = activityId;
            this.activityType = activityType;
            this.activityName = activityName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityName() {
            return this.activityName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getActivityType() {
            return this.activityType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.activityId, gVar.activityId) && AbstractC22676k.m65745e(this.activityType, gVar.activityType) && AbstractC22676k.m65745e(this.activityName, gVar.activityName);
        }

        public int hashCode() {
            return this.activityName.hashCode() + AbstractC11266d.m30450d(this.activityId.hashCode() * 31, 31, this.activityType);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.activityName, ")", AbstractC11895b.m32001t("HRGraphScrubbed(activityId=", this.activityId, ", activityType=", this.activityType, ", activityName="));
        }
    }

    /* JADX INFO: renamed from: bw0.a$h */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lbw0/a$h;", "Lbw0/a;", "", "activityId", "activityType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC3678a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityType;

        public h(String activityId, String activityType) {
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(activityType, "activityType");
            this.activityId = activityId;
            this.activityType = activityType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getActivityType() {
            return this.activityType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.activityId, hVar.activityId) && AbstractC22676k.m65745e(this.activityType, hVar.activityType);
        }

        public int hashCode() {
            return this.activityType.hashCode() + (this.activityId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("MoreActivityOptionSelected(activityId=", this.activityId, ", activityType=", this.activityType, ")");
        }
    }

    /* JADX INFO: renamed from: bw0.a$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lbw0/a$i;", "Lbw0/a;", "", "activityId", "activityType", "segmentedControlId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getActivityId", "b", "getActivityType", "c", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements InterfaceC3678a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String segmentedControlId;

        public i(String activityId, String activityType, String segmentedControlId) {
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(activityType, "activityType");
            AbstractC22676k.m65750j(segmentedControlId, "segmentedControlId");
            this.activityId = activityId;
            this.activityType = activityType;
            this.segmentedControlId = segmentedControlId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSegmentedControlId() {
            return this.segmentedControlId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.activityId, iVar.activityId) && AbstractC22676k.m65745e(this.activityType, iVar.activityType) && AbstractC22676k.m65745e(this.segmentedControlId, iVar.segmentedControlId);
        }

        public int hashCode() {
            return this.segmentedControlId.hashCode() + AbstractC11266d.m30450d(this.activityId.hashCode() * 31, 31, this.activityType);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.segmentedControlId, ")", AbstractC11895b.m32001t("SegmentedControlSelected(activityId=", this.activityId, ", activityType=", this.activityType, ", segmentedControlId="));
        }
    }
}
