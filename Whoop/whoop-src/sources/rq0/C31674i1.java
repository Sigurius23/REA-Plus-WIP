package rq0;

import c13.AbstractC3855a;
import com.whoop.community.domain.model.teams.TimePeriod;
import com.whoop.domain.model.teams.LeadersEntry;
import com.whoop.domain.model.teams.Team;
import com.whoop.p069ui.ScoreContext;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rq0.i1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\f\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\f\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0&¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b*\u0010!J\r\u0010+\u001a\u00020\u0000¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u0017¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\r2\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\r2\b\u00109\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b<\u0010=J \u0002\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\f2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\f2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\bC\u0010DJ\u001a\u0010G\u001a\u00020\u00072\b\u0010F\u001a\u0004\u0018\u00010EHÖ\u0003¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bJ\u0010KR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010O\u001a\u0004\bR\u0010QR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bV\u0010S\u001a\u0004\bW\u0010UR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\b`\u0010]\u001a\u0004\ba\u0010_R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\f8\u0006¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bc\u0010_R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f8\u0006¢\u0006\f\n\u0004\bd\u0010]\u001a\u0004\be\u0010_R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f8\u0006¢\u0006\f\n\u0004\bf\u0010]\u001a\u0004\bg\u0010_R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\bh\u0010]\u001a\u0004\bi\u0010_R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\f8\u0006¢\u0006\f\n\u0004\bj\u0010]\u001a\u0004\bk\u0010_R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\bl\u0010]\u001a\u0004\bm\u0010_R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\br\u0010o\u001a\u0004\bs\u0010q¨\u0006t"}, m65681d2 = {"Lrq0/i1;", "Lrq0/a1$c;", "Lcom/whoop/domain/model/teams/Team;", "team", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "isConnected", "requestFail", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "timePeriod", "", "Lcom/whoop/ui/ScoreContext;", "Lorg/joda/time/LocalDateTime;", "lastUpdatedAt", "loading", "Lrq0/v0;", "sortOptions", "Lcom/whoop/domain/model/teams/LeadersEntry;", "userRanks", "averages", "bannerLoaded", "", "resultSizes", "refreshDataStore", "totalCount", "totalNonCompliant", "<init>", "(Lcom/whoop/domain/model/teams/Team;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ZZLcom/whoop/community/domain/model/teams/TimePeriod;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;)V", "scoreContext", "value", "t", "(Lcom/whoop/ui/ScoreContext;Z)Lrq0/i1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/ui/ScoreContext;Lcom/whoop/domain/model/teams/LeadersEntry;)Lrq0/i1;", "x", "(Lcom/whoop/ui/ScoreContext;)Lrq0/i1;", "", "contexts", "A", "(Ljava/util/List;)Lrq0/i1;", "v", "r", "()Lrq0/i1;", "size", "y", "(Lcom/whoop/ui/ScoreContext;I)Lrq0/i1;", "option", "z", "(Lcom/whoop/ui/ScoreContext;Lrq0/v0;)Lrq0/i1;", "", "average", "s", "(Lcom/whoop/ui/ScoreContext;Ljava/lang/Double;)Lrq0/i1;", "B", "(Lcom/whoop/community/domain/model/teams/TimePeriod;)Lrq0/i1;", "localDate", "u", "(Lcom/whoop/ui/ScoreContext;Lorg/joda/time/LocalDateTime;)Lrq0/i1;", "C", "(Ljava/lang/Integer;)Lrq0/i1;", "a", "(Lcom/whoop/domain/model/teams/Team;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ZZLcom/whoop/community/domain/model/teams/TimePeriod;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;)Lrq0/i1;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ll83/a0;", "p", "()V", "Lcom/whoop/domain/model/teams/Team;", "b", "()Lcom/whoop/domain/model/teams/Team;", "Lorg/joda/time/LocalDate;", "m", "()Lorg/joda/time/LocalDate;", "f", "Z", "q", "()Z", "E", "j", "F", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "n", "()Lcom/whoop/community/domain/model/teams/TimePeriod;", "G", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "H", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "l", "J", "o", "K", "d", "L", "e", "M", "k", "N", "i", "O", "Ljava/lang/Integer;", "getTotalCount", "()Ljava/lang/Integer;", "P", "getTotalNonCompliant", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31674i1 implements C31650a1.c {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final boolean requestFail;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final TimePeriod timePeriod;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Map<ScoreContext, LocalDateTime> lastUpdatedAt;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final Map<ScoreContext, Boolean> loading;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Map<ScoreContext, C31700v0> sortOptions;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final Map<ScoreContext, LeadersEntry> userRanks;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final Map<ScoreContext, LeadersEntry> averages;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final Map<ScoreContext, Boolean> bannerLoaded;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final Map<ScoreContext, Integer> resultSizes;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final Map<ScoreContext, Boolean> refreshDataStore;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final Integer totalCount;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final Integer totalNonCompliant;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Team team;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final LocalDate startDate;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final LocalDate endDate;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final boolean isConnected;

    public C31674i1(Team team, LocalDate localDate, LocalDate localDate2, boolean z4, boolean z13, TimePeriod timePeriod, Map<ScoreContext, LocalDateTime> lastUpdatedAt, Map<ScoreContext, Boolean> loading, Map<ScoreContext, C31700v0> sortOptions, Map<ScoreContext, LeadersEntry> userRanks, Map<ScoreContext, LeadersEntry> averages, Map<ScoreContext, Boolean> bannerLoaded, Map<ScoreContext, Integer> resultSizes, Map<ScoreContext, Boolean> refreshDataStore, Integer num, Integer num2) {
        AbstractC22676k.m65750j(timePeriod, "timePeriod");
        AbstractC22676k.m65750j(lastUpdatedAt, "lastUpdatedAt");
        AbstractC22676k.m65750j(loading, "loading");
        AbstractC22676k.m65750j(sortOptions, "sortOptions");
        AbstractC22676k.m65750j(userRanks, "userRanks");
        AbstractC22676k.m65750j(averages, "averages");
        AbstractC22676k.m65750j(bannerLoaded, "bannerLoaded");
        AbstractC22676k.m65750j(resultSizes, "resultSizes");
        AbstractC22676k.m65750j(refreshDataStore, "refreshDataStore");
        this.team = team;
        this.startDate = localDate;
        this.endDate = localDate2;
        this.isConnected = z4;
        this.requestFail = z13;
        this.timePeriod = timePeriod;
        this.lastUpdatedAt = lastUpdatedAt;
        this.loading = loading;
        this.sortOptions = sortOptions;
        this.userRanks = userRanks;
        this.averages = averages;
        this.bannerLoaded = bannerLoaded;
        this.resultSizes = resultSizes;
        this.refreshDataStore = refreshDataStore;
        this.totalCount = num;
        this.totalNonCompliant = num2;
        m98091p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C31674i1 m98090c(C31674i1 c31674i1, Team team, LocalDate localDate, LocalDate localDate2, boolean z4, boolean z13, TimePeriod timePeriod, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, Integer num, Integer num2, int i13, Object obj) {
        return c31674i1.m98095a((i13 & 1) != 0 ? c31674i1.team : team, (i13 & 2) != 0 ? c31674i1.startDate : localDate, (i13 & 4) != 0 ? c31674i1.endDate : localDate2, (i13 & 8) != 0 ? c31674i1.isConnected : z4, (i13 & 16) != 0 ? c31674i1.requestFail : z13, (i13 & 32) != 0 ? c31674i1.timePeriod : timePeriod, (i13 & 64) != 0 ? c31674i1.lastUpdatedAt : map, (i13 & 128) != 0 ? c31674i1.loading : map2, (i13 & 256) != 0 ? c31674i1.sortOptions : map3, (i13 & 512) != 0 ? c31674i1.userRanks : map4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31674i1.averages : map5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31674i1.bannerLoaded : map6, (i13 & 4096) != 0 ? c31674i1.resultSizes : map7, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31674i1.refreshDataStore : map8, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31674i1.totalCount : num, (i13 & 32768) != 0 ? c31674i1.totalNonCompliant : num2);
    }

    /* JADX INFO: renamed from: p */
    private final void m98091p() {
        Map<ScoreContext, C31700v0> map = this.sortOptions;
        ScoreContext scoreContext = ScoreContext.STRAIN;
        if (!map.containsKey(scoreContext)) {
            this.sortOptions.put(scoreContext, new C31700v0("", 0, "", 0));
        }
        Map<ScoreContext, C31700v0> map2 = this.sortOptions;
        ScoreContext scoreContext2 = ScoreContext.RECOVERY;
        if (!map2.containsKey(scoreContext2)) {
            this.sortOptions.put(scoreContext2, new C31700v0("", 3, "", 0));
        }
        Map<ScoreContext, C31700v0> map3 = this.sortOptions;
        ScoreContext scoreContext3 = ScoreContext.SLEEP;
        if (!map3.containsKey(scoreContext3)) {
            this.sortOptions.put(scoreContext3, new C31700v0("", 6, "", 0));
        }
        if (!this.loading.containsKey(scoreContext)) {
            this.loading.put(scoreContext, Boolean.TRUE);
        }
        if (!this.loading.containsKey(scoreContext2)) {
            this.loading.put(scoreContext2, Boolean.TRUE);
        }
        if (this.loading.containsKey(scoreContext3)) {
            return;
        }
        this.loading.put(scoreContext3, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: A */
    public final C31674i1 m98092A(List<? extends ScoreContext> contexts) {
        AbstractC22676k.m65750j(contexts, "contexts");
        for (ScoreContext scoreContext : contexts) {
            Map<ScoreContext, Boolean> map = this.refreshDataStore;
            Boolean bool = Boolean.TRUE;
            map.put(scoreContext, bool);
            this.loading.put(scoreContext, bool);
        }
        return this;
    }

    /* JADX INFO: renamed from: B */
    public final C31674i1 m98093B(TimePeriod timePeriod) {
        AbstractC22676k.m65750j(timePeriod, "timePeriod");
        return m98090c(this, null, null, null, false, false, timePeriod, null, null, null, null, null, null, null, null, null, null, 65503, null);
    }

    /* JADX INFO: renamed from: C */
    public final C31674i1 m98094C(Integer totalCount) {
        return m98090c(this, null, null, null, false, false, null, null, null, null, null, null, null, null, null, totalCount, null, 49151, null);
    }

    /* JADX INFO: renamed from: a */
    public final C31674i1 m98095a(Team team, LocalDate startDate, LocalDate endDate, boolean isConnected, boolean requestFail, TimePeriod timePeriod, Map<ScoreContext, LocalDateTime> lastUpdatedAt, Map<ScoreContext, Boolean> loading, Map<ScoreContext, C31700v0> sortOptions, Map<ScoreContext, LeadersEntry> userRanks, Map<ScoreContext, LeadersEntry> averages, Map<ScoreContext, Boolean> bannerLoaded, Map<ScoreContext, Integer> resultSizes, Map<ScoreContext, Boolean> refreshDataStore, Integer totalCount, Integer totalNonCompliant) {
        AbstractC22676k.m65750j(timePeriod, "timePeriod");
        AbstractC22676k.m65750j(lastUpdatedAt, "lastUpdatedAt");
        AbstractC22676k.m65750j(loading, "loading");
        AbstractC22676k.m65750j(sortOptions, "sortOptions");
        AbstractC22676k.m65750j(userRanks, "userRanks");
        AbstractC22676k.m65750j(averages, "averages");
        AbstractC22676k.m65750j(bannerLoaded, "bannerLoaded");
        AbstractC22676k.m65750j(resultSizes, "resultSizes");
        AbstractC22676k.m65750j(refreshDataStore, "refreshDataStore");
        return new C31674i1(team, startDate, endDate, isConnected, requestFail, timePeriod, lastUpdatedAt, loading, sortOptions, userRanks, averages, bannerLoaded, resultSizes, refreshDataStore, totalCount, totalNonCompliant);
    }

    @Override // rq0.C31650a1.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public Team getTeam() {
        return this.team;
    }

    /* JADX INFO: renamed from: d */
    public final Map<ScoreContext, LeadersEntry> m98096d() {
        return this.averages;
    }

    /* JADX INFO: renamed from: e */
    public final Map<ScoreContext, Boolean> m98097e() {
        return this.bannerLoaded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31674i1)) {
            return false;
        }
        C31674i1 c31674i1 = (C31674i1) other;
        return AbstractC22676k.m65745e(this.team, c31674i1.team) && AbstractC22676k.m65745e(this.startDate, c31674i1.startDate) && AbstractC22676k.m65745e(this.endDate, c31674i1.endDate) && this.isConnected == c31674i1.isConnected && this.requestFail == c31674i1.requestFail && this.timePeriod == c31674i1.timePeriod && AbstractC22676k.m65745e(this.lastUpdatedAt, c31674i1.lastUpdatedAt) && AbstractC22676k.m65745e(this.loading, c31674i1.loading) && AbstractC22676k.m65745e(this.sortOptions, c31674i1.sortOptions) && AbstractC22676k.m65745e(this.userRanks, c31674i1.userRanks) && AbstractC22676k.m65745e(this.averages, c31674i1.averages) && AbstractC22676k.m65745e(this.bannerLoaded, c31674i1.bannerLoaded) && AbstractC22676k.m65745e(this.resultSizes, c31674i1.resultSizes) && AbstractC22676k.m65745e(this.refreshDataStore, c31674i1.refreshDataStore) && AbstractC22676k.m65745e(this.totalCount, c31674i1.totalCount) && AbstractC22676k.m65745e(this.totalNonCompliant, c31674i1.totalNonCompliant);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: g */
    public final Map<ScoreContext, LocalDateTime> m98099g() {
        return this.lastUpdatedAt;
    }

    /* JADX INFO: renamed from: h */
    public final Map<ScoreContext, Boolean> m98100h() {
        return this.loading;
    }

    public int hashCode() {
        Team team = this.team;
        int iHashCode = (team == null ? 0 : team.hashCode()) * 31;
        LocalDate localDate = this.startDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.endDate;
        int iM11821e = AbstractC3855a.m11821e(this.refreshDataStore, AbstractC3855a.m11821e(this.resultSizes, AbstractC3855a.m11821e(this.bannerLoaded, AbstractC3855a.m11821e(this.averages, AbstractC3855a.m11821e(this.userRanks, AbstractC3855a.m11821e(this.sortOptions, AbstractC3855a.m11821e(this.loading, AbstractC3855a.m11821e(this.lastUpdatedAt, (this.timePeriod.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31, 31, this.isConnected), 31, this.requestFail)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.totalCount;
        int iHashCode3 = (iM11821e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalNonCompliant;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final Map<ScoreContext, Boolean> m98101i() {
        return this.refreshDataStore;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getRequestFail() {
        return this.requestFail;
    }

    /* JADX INFO: renamed from: k */
    public final Map<ScoreContext, Integer> m98103k() {
        return this.resultSizes;
    }

    /* JADX INFO: renamed from: l */
    public final Map<ScoreContext, C31700v0> m98104l() {
        return this.sortOptions;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    /* JADX INFO: renamed from: o */
    public final Map<ScoreContext, LeadersEntry> m98107o() {
        return this.userRanks;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: r */
    public final C31674i1 m98109r() {
        List<ScoreContext> enabledTabs;
        this.loading.put(ScoreContext.OVERVIEW, Boolean.TRUE);
        Team team = getTeam();
        if (team != null && (enabledTabs = team.getEnabledTabs()) != null) {
            Iterator<T> it = enabledTabs.iterator();
            while (it.hasNext()) {
                this.loading.put((ScoreContext) it.next(), Boolean.TRUE);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final C31674i1 m98110s(ScoreContext scoreContext, Double average) {
        LeadersEntry leadersEntry;
        LeadersEntry leadersEntry2;
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        Map<ScoreContext, LeadersEntry> map = this.averages;
        C31700v0 c31700v0 = this.sortOptions.get(scoreContext);
        Integer numValueOf = c31700v0 != null ? Integer.valueOf(c31700v0.getSortType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            leadersEntry = new LeadersEntry(null, 0, null, 0, average, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194287, null);
        } else {
            if (numValueOf != null && numValueOf.intValue() == 1) {
                leadersEntry2 = new LeadersEntry(null, 0, null, 0, null, average, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194271, null);
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                leadersEntry2 = new LeadersEntry(null, 0, null, 0, null, null, average, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194239, null);
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                leadersEntry2 = new LeadersEntry(null, 0, null, 0, null, null, null, average, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194175, null);
            } else if (numValueOf != null && numValueOf.intValue() == 4) {
                leadersEntry2 = new LeadersEntry(null, 0, null, 0, null, null, null, null, average, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194047, null);
            } else if (numValueOf != null && numValueOf.intValue() == 5) {
                leadersEntry2 = new LeadersEntry(null, 0, null, 0, null, null, null, null, null, average, null, null, null, null, null, null, null, null, null, null, null, null, 4193791, null);
            } else if (numValueOf != null && numValueOf.intValue() == 6) {
                leadersEntry2 = new LeadersEntry(null, 0, null, 0, null, null, null, null, null, null, null, average, null, null, null, null, null, null, null, null, null, null, 4192255, null);
            } else if (numValueOf != null && numValueOf.intValue() == 7) {
                leadersEntry2 = new LeadersEntry(null, 0, null, 0, null, null, null, null, null, null, average, null, null, null, null, null, null, null, null, null, null, null, 4193279, null);
            } else {
                leadersEntry = new LeadersEntry(null, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
            }
            leadersEntry = leadersEntry2;
        }
        map.put(scoreContext, leadersEntry);
        return this;
    }

    /* JADX INFO: renamed from: t */
    public final C31674i1 m98111t(ScoreContext scoreContext, boolean value) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        this.bannerLoaded.put(scoreContext, Boolean.valueOf(value));
        return this;
    }

    public String toString() {
        Team team = this.team;
        LocalDate localDate = this.startDate;
        LocalDate localDate2 = this.endDate;
        boolean z4 = this.isConnected;
        boolean z13 = this.requestFail;
        TimePeriod timePeriod = this.timePeriod;
        Map<ScoreContext, LocalDateTime> map = this.lastUpdatedAt;
        Map<ScoreContext, Boolean> map2 = this.loading;
        Map<ScoreContext, C31700v0> map3 = this.sortOptions;
        Map<ScoreContext, LeadersEntry> map4 = this.userRanks;
        Map<ScoreContext, LeadersEntry> map5 = this.averages;
        Map<ScoreContext, Boolean> map6 = this.bannerLoaded;
        Map<ScoreContext, Integer> map7 = this.resultSizes;
        Map<ScoreContext, Boolean> map8 = this.refreshDataStore;
        Integer num = this.totalCount;
        Integer num2 = this.totalNonCompliant;
        StringBuilder sb4 = new StringBuilder("TeamsViewState(team=");
        sb4.append(team);
        sb4.append(", startDate=");
        sb4.append(localDate);
        sb4.append(", endDate=");
        sb4.append(localDate2);
        sb4.append(", isConnected=");
        sb4.append(z4);
        sb4.append(", requestFail=");
        sb4.append(z13);
        sb4.append(", timePeriod=");
        sb4.append(timePeriod);
        sb4.append(", lastUpdatedAt=");
        AbstractC3855a.m11840x(sb4, map, ", loading=", map2, ", sortOptions=");
        AbstractC3855a.m11840x(sb4, map3, ", userRanks=", map4, ", averages=");
        AbstractC3855a.m11840x(sb4, map5, ", bannerLoaded=", map6, ", resultSizes=");
        AbstractC3855a.m11840x(sb4, map7, ", refreshDataStore=", map8, ", totalCount=");
        sb4.append(num);
        sb4.append(", totalNonCompliant=");
        sb4.append(num2);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: u */
    public final C31674i1 m98112u(ScoreContext scoreContext, LocalDateTime localDate) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        this.lastUpdatedAt.put(scoreContext, localDate);
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final C31674i1 m98113v(ScoreContext scoreContext, boolean value) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        this.loading.put(scoreContext, Boolean.valueOf(value));
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final C31674i1 m98114w(ScoreContext scoreContext, LeadersEntry value) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        this.userRanks.put(scoreContext, value);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final C31674i1 m98115x(ScoreContext scoreContext) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        this.refreshDataStore.put(scoreContext, Boolean.FALSE);
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final C31674i1 m98116y(ScoreContext scoreContext, int size) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        this.resultSizes.put(scoreContext, Integer.valueOf(size));
        return this;
    }

    /* JADX INFO: renamed from: z */
    public final C31674i1 m98117z(ScoreContext scoreContext, C31700v0 option) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        AbstractC22676k.m65750j(option, "option");
        this.sortOptions.put(scoreContext, option);
        return this;
    }

    public /* synthetic */ C31674i1(Team team, LocalDate localDate, LocalDate localDate2, boolean z4, boolean z13, TimePeriod timePeriod, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, Integer num, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : team, (i13 & 2) != 0 ? LocalDate.now() : localDate, (i13 & 4) != 0 ? null : localDate2, (i13 & 8) != 0 ? true : z4, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? TimePeriod.DAILY : timePeriod, (i13 & 64) != 0 ? new LinkedHashMap() : map, (i13 & 128) != 0 ? new LinkedHashMap() : map2, (i13 & 256) != 0 ? new LinkedHashMap() : map3, (i13 & 512) != 0 ? new LinkedHashMap() : map4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new LinkedHashMap() : map5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? new LinkedHashMap() : map6, (i13 & 4096) != 0 ? new LinkedHashMap() : map7, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? new LinkedHashMap() : map8, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : num, (i13 & 32768) != 0 ? null : num2);
    }
}
