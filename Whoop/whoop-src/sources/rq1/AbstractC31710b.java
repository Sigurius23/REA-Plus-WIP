package rq1;

import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rq1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lrq1/b;", "", "<init>", "()V", "b", "a", "c", "Lrq1/b$a;", "Lrq1/b$b;", "Lrq1/b$c;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31710b {

    /* JADX INFO: renamed from: rq1.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lrq1/b$a;", "Lrq1/b;", "", "error", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getError", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC31710b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String error) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.error, ((a) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(error=", this.error, ")");
        }
    }

    /* JADX INFO: renamed from: rq1.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lrq1/b$b;", "Lrq1/b;", "<init>", "()V", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC31710b {

        /* JADX INFO: renamed from: a */
        public static final b f131344a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: rq1.b$c */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001d\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b\u0019\u0010'¨\u0006("}, m65681d2 = {"Lrq1/b$c;", "Lrq1/b;", "Lrq1/d;", "header", "", "Lcom/whoop/design/models/DesignSystemModel;", "tiles", "", "journalEnabled", "", "cycleId", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "aiContextMetadata", "<init>", "(Lrq1/d;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq1/d;", "c", "()Lrq1/d;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "Z", "d", "()Z", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC31710b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C31712d header;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<DesignSystemModel> tiles;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean journalEnabled;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Long cycleId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final AiContextMetadata aiContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(C31712d header, List<? extends DesignSystemModel> tiles, boolean z4, Long l7, AiContextMetadata aiContextMetadata) {
            super(null);
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(tiles, "tiles");
            this.header = header;
            this.tiles = tiles;
            this.journalEnabled = z4;
            this.cycleId = l7;
            this.aiContextMetadata = aiContextMetadata;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AiContextMetadata getAiContextMetadata() {
            return this.aiContextMetadata;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C31712d getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getJournalEnabled() {
            return this.journalEnabled;
        }

        /* JADX INFO: renamed from: e */
        public final List<DesignSystemModel> m98365e() {
            return this.tiles;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.header, cVar.header) && AbstractC22676k.m65745e(this.tiles, cVar.tiles) && this.journalEnabled == cVar.journalEnabled && AbstractC22676k.m65745e(this.cycleId, cVar.cycleId) && AbstractC22676k.m65745e(this.aiContextMetadata, cVar.aiContextMetadata);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.header.hashCode() * 31, 31, this.tiles), 31, this.journalEnabled);
            Long l7 = this.cycleId;
            int iHashCode = (iM8289b + (l7 == null ? 0 : l7.hashCode())) * 31;
            AiContextMetadata aiContextMetadata = this.aiContextMetadata;
            return iHashCode + (aiContextMetadata != null ? aiContextMetadata.hashCode() : 0);
        }

        public String toString() {
            return "Result(header=" + this.header + ", tiles=" + this.tiles + ", journalEnabled=" + this.journalEnabled + ", cycleId=" + this.cycleId + ", aiContextMetadata=" + this.aiContextMetadata + ")";
        }
    }

    public /* synthetic */ AbstractC31710b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC31710b() {
    }
}
