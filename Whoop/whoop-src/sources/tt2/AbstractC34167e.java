package tt2;

import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.weeklyplan.weeklyplan.domain.models.SummaryV2Model;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: tt2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Ltt2/e;", "", "<init>", "()V", "b", "a", "c", "Ltt2/e$a;", "Ltt2/e$b;", "Ltt2/e$c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34167e {

    /* JADX INFO: renamed from: tt2.e$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ltt2/e$a;", "Ltt2/e;", "", "planId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC34167e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String planId) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            this.planId = planId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.planId, ((a) other).planId);
        }

        public int hashCode() {
            return this.planId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(planId=", this.planId, ")");
        }
    }

    /* JADX INFO: renamed from: tt2.e$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltt2/e$b;", "Ltt2/e;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC34167e {

        /* JADX INFO: renamed from: a */
        public static final b f143255a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: tt2.e$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ltt2/e$c;", "Ltt2/e;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;", "result", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "aiContextMetadata", "<init>", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;", "b", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC34167e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final SummaryV2Model result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AiContextMetadata aiContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SummaryV2Model result, AiContextMetadata aiContextMetadata) {
            super(null);
            AbstractC22676k.m65750j(result, "result");
            this.result = result;
            this.aiContextMetadata = aiContextMetadata;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AiContextMetadata getAiContextMetadata() {
            return this.aiContextMetadata;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final SummaryV2Model getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.result, cVar.result) && AbstractC22676k.m65745e(this.aiContextMetadata, cVar.aiContextMetadata);
        }

        public int hashCode() {
            int iHashCode = this.result.hashCode() * 31;
            AiContextMetadata aiContextMetadata = this.aiContextMetadata;
            return iHashCode + (aiContextMetadata == null ? 0 : aiContextMetadata.hashCode());
        }

        public String toString() {
            return "Success(result=" + this.result + ", aiContextMetadata=" + this.aiContextMetadata + ")";
        }
    }

    public /* synthetic */ AbstractC34167e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC34167e() {
    }
}
