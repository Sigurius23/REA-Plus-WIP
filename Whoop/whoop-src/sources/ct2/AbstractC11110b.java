package ct2;

import com.mapbox.common.HttpHeaders;
import com.whoop.weeklyplan.hometile.domain.api.WeeklyPlanHometileResponse;
import java.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ct2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lct2/b;", "", "<init>", "()V", "b", "a", "c", "Lct2/b$a;", "Lct2/b$b;", "Lct2/b$c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11110b {

    /* JADX INFO: renamed from: ct2.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lct2/b$a;", "Lct2/b;", "Ljava/time/LocalDate;", HttpHeaders.DATE, "<init>", "(Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC11110b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDate date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LocalDate date) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.date, ((a) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return "Error(date=" + this.date + ")";
        }
    }

    /* JADX INFO: renamed from: ct2.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lct2/b$b;", "Lct2/b;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC11110b {

        /* JADX INFO: renamed from: a */
        public static final b f35314a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ct2.b$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lct2/b$c;", "Lct2/b;", "Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometileResponse;", "result", "<init>", "(Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometileResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometileResponse;", "()Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometileResponse;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC11110b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final WeeklyPlanHometileResponse result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(WeeklyPlanHometileResponse result) {
            super(null);
            AbstractC22676k.m65750j(result, "result");
            this.result = result;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final WeeklyPlanHometileResponse getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.result, ((c) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Success(result=" + this.result + ")";
        }
    }

    public /* synthetic */ AbstractC11110b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC11110b() {
    }
}
