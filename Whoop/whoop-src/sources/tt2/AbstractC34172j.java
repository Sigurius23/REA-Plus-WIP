package tt2;

import com.mapbox.common.HttpHeaders;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.weeklyplan.weeklyplan.domain.models.WeeklyPlanResponse;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: tt2.j */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Ltt2/j;", "", "<init>", "()V", "c", "b", "d", "e", "a", "Ltt2/j$a;", "Ltt2/j$b;", "Ltt2/j$c;", "Ltt2/j$d;", "Ltt2/j$e;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34172j {

    /* JADX INFO: renamed from: tt2.j$a */
    @Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Ltt2/j$a;", "Ltt2/j;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC34172j {
    }

    /* JADX INFO: renamed from: tt2.j$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0015"}, m65681d2 = {"Ltt2/j$b;", "Ltt2/j;", "", "error", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getError", "b", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC34172j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String error;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String error, String str) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
            this.date = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.error, bVar.error) && AbstractC22676k.m65745e(this.date, bVar.date);
        }

        public int hashCode() {
            int iHashCode = this.error.hashCode() * 31;
            String str = this.date;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("Error(error=", this.error, ", date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: tt2.j$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltt2/j$c;", "Ltt2/j;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC34172j {

        /* JADX INFO: renamed from: a */
        public static final c f143293a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: tt2.j$d */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ltt2/j$d;", "Ltt2/j;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;", "result", "", HttpHeaders.DATE, "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "aiContextMetadata", "<init>", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;", "c", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;", "b", "Ljava/lang/String;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC34172j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final WeeklyPlanResponse result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AiContextMetadata aiContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WeeklyPlanResponse result, String str, AiContextMetadata aiContextMetadata) {
            super(null);
            AbstractC22676k.m65750j(result, "result");
            this.result = result;
            this.date = str;
            this.aiContextMetadata = aiContextMetadata;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AiContextMetadata getAiContextMetadata() {
            return this.aiContextMetadata;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final WeeklyPlanResponse getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.result, dVar.result) && AbstractC22676k.m65745e(this.date, dVar.date) && AbstractC22676k.m65745e(this.aiContextMetadata, dVar.aiContextMetadata);
        }

        public int hashCode() {
            int iHashCode = this.result.hashCode() * 31;
            String str = this.date;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AiContextMetadata aiContextMetadata = this.aiContextMetadata;
            return iHashCode2 + (aiContextMetadata != null ? aiContextMetadata.hashCode() : 0);
        }

        public String toString() {
            return "Success(result=" + this.result + ", date=" + this.date + ", aiContextMetadata=" + this.aiContextMetadata + ")";
        }
    }

    /* JADX INFO: renamed from: tt2.j$e */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ltt2/j$e;", "Ltt2/j;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;", "result", "", HttpHeaders.DATE, "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "aiContextMetadata", "<init>", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;", "c", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;", "b", "Ljava/lang/String;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC34172j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final WeeklyPlanResponse result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AiContextMetadata aiContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WeeklyPlanResponse result, String str, AiContextMetadata aiContextMetadata) {
            super(null);
            AbstractC22676k.m65750j(result, "result");
            this.result = result;
            this.date = str;
            this.aiContextMetadata = aiContextMetadata;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AiContextMetadata getAiContextMetadata() {
            return this.aiContextMetadata;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final WeeklyPlanResponse getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.result, eVar.result) && AbstractC22676k.m65745e(this.date, eVar.date) && AbstractC22676k.m65745e(this.aiContextMetadata, eVar.aiContextMetadata);
        }

        public int hashCode() {
            int iHashCode = this.result.hashCode() * 31;
            String str = this.date;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AiContextMetadata aiContextMetadata = this.aiContextMetadata;
            return iHashCode2 + (aiContextMetadata != null ? aiContextMetadata.hashCode() : 0);
        }

        public String toString() {
            return "Updating(result=" + this.result + ", date=" + this.date + ", aiContextMetadata=" + this.aiContextMetadata + ")";
        }
    }

    public /* synthetic */ AbstractC34172j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC34172j() {
    }
}
