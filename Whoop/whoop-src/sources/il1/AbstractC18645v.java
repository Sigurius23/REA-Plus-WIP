package il1;

import com.whoop.home.domain.models.HomeBffFeedResponse;
import em1.EnumC13344r;
import ih0.AbstractC18489d0;
import java.time.LocalDate;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xl1.C38453c;

/* JADX INFO: renamed from: il1.v */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lil1/v;", "", "<init>", "()V", "b", "d", "a", "c", "Lil1/v$a;", "Lil1/v$b;", "Lil1/v$c;", "Lil1/v$d;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18645v {

    /* JADX INFO: renamed from: il1.v$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/v$b;", "Lil1/v;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC18645v {

        /* JADX INFO: renamed from: a */
        public static final b f73163a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.v$c */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lil1/v$c;", "Lil1/v;", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "bffFeed", "Ljava/time/LocalDate;", "currentDateTime", "", "currentPillarIndex", "Lxl1/c;", "journalDomainResult", "<init>", "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILxl1/c;)V", "a", "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILxl1/c;)Lil1/v$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "c", "()Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "b", "Ljava/time/LocalDate;", "d", "()Ljava/time/LocalDate;", "I", "e", "Lxl1/c;", "f", "()Lxl1/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC18645v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HomeBffFeedResponse bffFeed;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LocalDate currentDateTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int currentPillarIndex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C38453c journalDomainResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HomeBffFeedResponse homeBffFeedResponse, LocalDate currentDateTime, int i13, C38453c journalDomainResult) {
            super(null);
            AbstractC22676k.m65750j(currentDateTime, "currentDateTime");
            AbstractC22676k.m65750j(journalDomainResult, "journalDomainResult");
            this.bffFeed = homeBffFeedResponse;
            this.currentDateTime = currentDateTime;
            this.currentPillarIndex = i13;
            this.journalDomainResult = journalDomainResult;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m54064b(c cVar, HomeBffFeedResponse homeBffFeedResponse, LocalDate localDate, int i13, C38453c c38453c, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                homeBffFeedResponse = cVar.bffFeed;
            }
            if ((i14 & 2) != 0) {
                localDate = cVar.currentDateTime;
            }
            if ((i14 & 4) != 0) {
                i13 = cVar.currentPillarIndex;
            }
            if ((i14 & 8) != 0) {
                c38453c = cVar.journalDomainResult;
            }
            return cVar.m54065a(homeBffFeedResponse, localDate, i13, c38453c);
        }

        /* JADX INFO: renamed from: a */
        public final c m54065a(HomeBffFeedResponse bffFeed, LocalDate currentDateTime, int currentPillarIndex, C38453c journalDomainResult) {
            AbstractC22676k.m65750j(currentDateTime, "currentDateTime");
            AbstractC22676k.m65750j(journalDomainResult, "journalDomainResult");
            return new c(bffFeed, currentDateTime, currentPillarIndex, journalDomainResult);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final HomeBffFeedResponse getBffFeed() {
            return this.bffFeed;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDate getCurrentDateTime() {
            return this.currentDateTime;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getCurrentPillarIndex() {
            return this.currentPillarIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.bffFeed, cVar.bffFeed) && AbstractC22676k.m65745e(this.currentDateTime, cVar.currentDateTime) && this.currentPillarIndex == cVar.currentPillarIndex && AbstractC22676k.m65745e(this.journalDomainResult, cVar.journalDomainResult);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C38453c getJournalDomainResult() {
            return this.journalDomainResult;
        }

        public int hashCode() {
            HomeBffFeedResponse homeBffFeedResponse = this.bffFeed;
            return this.journalDomainResult.hashCode() + AbstractC11266d.m30448b(this.currentPillarIndex, AbstractC13673n.m38558e(this.currentDateTime, (homeBffFeedResponse == null ? 0 : homeBffFeedResponse.hashCode()) * 31, 31), 31);
        }

        public String toString() {
            return "Result(bffFeed=" + this.bffFeed + ", currentDateTime=" + this.currentDateTime + ", currentPillarIndex=" + this.currentPillarIndex + ", journalDomainResult=" + this.journalDomainResult + ")";
        }
    }

    public /* synthetic */ AbstractC18645v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18645v() {
    }

    /* JADX INFO: renamed from: il1.v$a */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, m65681d2 = {"Lil1/v$a;", "Lil1/v;", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "bffFeed", "Ljava/time/LocalDate;", "currentDateTime", "", "currentPillarIndex", "Lxl1/c;", "journalDomainResult", "", "networkError", "<init>", "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILxl1/c;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "()Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "c", "I", "d", "Lxl1/c;", "()Lxl1/c;", "e", "Z", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC18645v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HomeBffFeedResponse bffFeed;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LocalDate currentDateTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int currentPillarIndex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C38453c journalDomainResult;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean networkError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HomeBffFeedResponse homeBffFeedResponse, LocalDate localDate, int i13, C38453c journalDomainResult, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(journalDomainResult, "journalDomainResult");
            this.bffFeed = homeBffFeedResponse;
            this.currentDateTime = localDate;
            this.currentPillarIndex = i13;
            this.journalDomainResult = journalDomainResult;
            this.networkError = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final HomeBffFeedResponse getBffFeed() {
            return this.bffFeed;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getCurrentDateTime() {
            return this.currentDateTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCurrentPillarIndex() {
            return this.currentPillarIndex;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C38453c getJournalDomainResult() {
            return this.journalDomainResult;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getNetworkError() {
            return this.networkError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.bffFeed, aVar.bffFeed) && AbstractC22676k.m65745e(this.currentDateTime, aVar.currentDateTime) && this.currentPillarIndex == aVar.currentPillarIndex && AbstractC22676k.m65745e(this.journalDomainResult, aVar.journalDomainResult) && this.networkError == aVar.networkError;
        }

        public int hashCode() {
            HomeBffFeedResponse homeBffFeedResponse = this.bffFeed;
            int iHashCode = (homeBffFeedResponse == null ? 0 : homeBffFeedResponse.hashCode()) * 31;
            LocalDate localDate = this.currentDateTime;
            return Boolean.hashCode(this.networkError) + ((this.journalDomainResult.hashCode() + AbstractC11266d.m30448b(this.currentPillarIndex, (iHashCode + (localDate != null ? localDate.hashCode() : 0)) * 31, 31)) * 31);
        }

        public String toString() {
            HomeBffFeedResponse homeBffFeedResponse = this.bffFeed;
            LocalDate localDate = this.currentDateTime;
            int i13 = this.currentPillarIndex;
            C38453c c38453c = this.journalDomainResult;
            boolean z4 = this.networkError;
            StringBuilder sb4 = new StringBuilder("Error(bffFeed=");
            sb4.append(homeBffFeedResponse);
            sb4.append(", currentDateTime=");
            sb4.append(localDate);
            sb4.append(", currentPillarIndex=");
            sb4.append(i13);
            sb4.append(", journalDomainResult=");
            sb4.append(c38453c);
            sb4.append(", networkError=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }

        public /* synthetic */ a(HomeBffFeedResponse homeBffFeedResponse, LocalDate localDate, int i13, C38453c c38453c, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? null : homeBffFeedResponse, (i14 & 2) != 0 ? null : localDate, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? new C38453c(false, false, 3, null) : c38453c, (i14 & 16) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: il1.v$d */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010%¨\u0006&"}, m65681d2 = {"Lil1/v$d;", "Lil1/v;", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "bffFeed", "Ljava/time/LocalDate;", "currentDateTime", "", "currentPillarIndex", "Lem1/r;", "refreshType", "Lxl1/c;", "journalDomainResult", "<init>", "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILem1/r;Lxl1/c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "()Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "c", "I", "d", "Lem1/r;", "e", "()Lem1/r;", "Lxl1/c;", "()Lxl1/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC18645v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HomeBffFeedResponse bffFeed;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LocalDate currentDateTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int currentPillarIndex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC13344r refreshType;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C38453c journalDomainResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HomeBffFeedResponse homeBffFeedResponse, LocalDate currentDateTime, int i13, EnumC13344r refreshType, C38453c journalDomainResult) {
            super(null);
            AbstractC22676k.m65750j(currentDateTime, "currentDateTime");
            AbstractC22676k.m65750j(refreshType, "refreshType");
            AbstractC22676k.m65750j(journalDomainResult, "journalDomainResult");
            this.bffFeed = homeBffFeedResponse;
            this.currentDateTime = currentDateTime;
            this.currentPillarIndex = i13;
            this.refreshType = refreshType;
            this.journalDomainResult = journalDomainResult;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final HomeBffFeedResponse getBffFeed() {
            return this.bffFeed;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getCurrentDateTime() {
            return this.currentDateTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCurrentPillarIndex() {
            return this.currentPillarIndex;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C38453c getJournalDomainResult() {
            return this.journalDomainResult;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC13344r getRefreshType() {
            return this.refreshType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.bffFeed, dVar.bffFeed) && AbstractC22676k.m65745e(this.currentDateTime, dVar.currentDateTime) && this.currentPillarIndex == dVar.currentPillarIndex && this.refreshType == dVar.refreshType && AbstractC22676k.m65745e(this.journalDomainResult, dVar.journalDomainResult);
        }

        public int hashCode() {
            HomeBffFeedResponse homeBffFeedResponse = this.bffFeed;
            return this.journalDomainResult.hashCode() + ((this.refreshType.hashCode() + AbstractC11266d.m30448b(this.currentPillarIndex, AbstractC13673n.m38558e(this.currentDateTime, (homeBffFeedResponse == null ? 0 : homeBffFeedResponse.hashCode()) * 31, 31), 31)) * 31);
        }

        public String toString() {
            return "Updating(bffFeed=" + this.bffFeed + ", currentDateTime=" + this.currentDateTime + ", currentPillarIndex=" + this.currentPillarIndex + ", refreshType=" + this.refreshType + ", journalDomainResult=" + this.journalDomainResult + ")";
        }

        public /* synthetic */ d(HomeBffFeedResponse homeBffFeedResponse, LocalDate localDate, int i13, EnumC13344r enumC13344r, C38453c c38453c, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? null : homeBffFeedResponse, localDate, (i14 & 4) != 0 ? 0 : i13, enumC13344r, (i14 & 16) != 0 ? new C38453c(false, false, 3, null) : c38453c);
        }
    }
}
