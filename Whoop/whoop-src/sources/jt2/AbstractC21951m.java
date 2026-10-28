package jt2;

import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jt2.m */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m65681d2 = {"Ljt2/m;", "", "<init>", "()V", "e", "i", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "f", "b", "c", "a", "Ljt2/m$a;", "Ljt2/m$b;", "Ljt2/m$c;", "Ljt2/m$d;", "Ljt2/m$e;", "Ljt2/m$f;", "Ljt2/m$g;", "Ljt2/m$h;", "Ljt2/m$i;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21951m {

    /* JADX INFO: renamed from: jt2.m$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ljt2/m$a;", "Ljt2/m;", "", "planId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21951m {

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
            return AbstractC11895b.m31996o("CancelCurrentPlanError(planId=", this.planId, ")");
        }
    }

    /* JADX INFO: renamed from: jt2.m$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/m$b;", "Ljt2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC21951m {

        /* JADX INFO: renamed from: a */
        public static final b f84856a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.m$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/m$c;", "Ljt2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC21951m {

        /* JADX INFO: renamed from: a */
        public static final c f84857a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.m$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/m$d;", "Ljt2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC21951m {

        /* JADX INFO: renamed from: a */
        public static final d f84858a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.m$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/m$e;", "Ljt2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC21951m {

        /* JADX INFO: renamed from: a */
        public static final e f84859a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.m$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/m$f;", "Ljt2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC21951m {

        /* JADX INFO: renamed from: a */
        public static final f f84860a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.m$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/m$g;", "Ljt2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC21951m {

        /* JADX INFO: renamed from: a */
        public static final g f84861a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.m$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljt2/m$h;", "Ljt2/m;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC21951m {

        /* JADX INFO: renamed from: a */
        public static final h f84862a = new h();

        private h() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jt2.m$i */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ljt2/m$i;", "Ljt2/m;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "result", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "aiContextMetadata", "<init>", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "b", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC21951m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HubAndSpokeResponse result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AiContextMetadata aiContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HubAndSpokeResponse result, AiContextMetadata aiContextMetadata) {
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
        public final HubAndSpokeResponse getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.result, iVar.result) && AbstractC22676k.m65745e(this.aiContextMetadata, iVar.aiContextMetadata);
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

    public /* synthetic */ AbstractC21951m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21951m() {
    }
}
