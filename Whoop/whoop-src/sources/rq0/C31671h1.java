package rq0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.MapboxMap;
import com.whoop.community.domain.model.teams.TimePeriod;
import com.whoop.domain.model.RecordsDto;
import com.whoop.domain.model.User;
import com.whoop.domain.model.teams.LeadersEntry;
import com.whoop.domain.model.teams.PrivacyType;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamPrivacyProfile;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.domain.model.teams.TeamUser;
import com.whoop.p069ui.ScoreContext;
import com.whoop.profile.domain.ProfileApiKt;
import cq0.C11059g;
import e50.C12724c;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f93.InterfaceC14292d;
import hj0.AbstractC17356o;
import hq0.C17561a;
import i92.AbstractC18263h;
import i92.InterfaceC18260e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh3.C22488a;
import l83.C23454a0;
import m83.AbstractC25260n;
import o52.C27566m0;
import or2.AbstractC28220z0;
import or2.C28180m;
import or2.C28204u;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.ISODateTimeFormat;
import p031b9.AbstractC2875y;
import p217ib.C18316m;
import p465rm.C31559p;
import p505ts.AbstractC34132o;
import p619xl.C38445a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import xg3.C38280g;
import z92.InterfaceC40205a;
import zg3.C40634a;

/* JADX INFO: renamed from: rq0.h1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\bA\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J+\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020+\u0018\u00010*0)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&¢\u0006\u0004\b,\u0010-J5\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000)2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020&¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00103\u001a\u00020&¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000206H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u0002062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b@\u0010AJ#\u0010E\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C\u0018\u00010B2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\"¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u0004\u0018\u00010D2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u000206H\u0086@¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020&H\u0086@¢\u0006\u0004\bQ\u0010PJ\u0015\u0010S\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\u001c¢\u0006\u0004\bS\u0010HJ\r\u0010T\u001a\u00020\u0019¢\u0006\u0004\bT\u0010UJ\u001d\u0010X\u001a\u00020\u00192\u0006\u0010V\u001a\u00020&2\u0006\u0010W\u001a\u000206¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\u00192\u0006\u0010Z\u001a\u000206H\u0002¢\u0006\u0004\b[\u0010\\J!\u0010]\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b]\u0010^J!\u0010_\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b_\u0010^J\u000f\u0010`\u001a\u000206H\u0002¢\u0006\u0004\b`\u0010;J\u0017\u0010a\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\ba\u0010?J\u0019\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\bc\u0010dJ+\u0010f\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"2\u0012\u0010R\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0e\"\u00020\u001cH\u0002¢\u0006\u0004\bf\u0010gJ$\u0010h\u001a\u00020\u00192\u0012\u0010R\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0e\"\u00020\u001cH\u0082@¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u0019H\u0002¢\u0006\u0004\bj\u0010UR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001d\u0010w\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR+\u0010~\u001a\u00020\u000f2\u0006\u0010x\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010\u0011\"\u0004\b|\u0010}R6\u0010\u0085\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0C\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R7\u0010\u0089\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0080\u0001\u001a\u0006\b\u0087\u0001\u0010\u0082\u0001\"\u0006\b\u0088\u0001\u0010\u0084\u0001R6\u0010\u008c\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bf\u0010\u0080\u0001\u001a\u0006\b\u008a\u0001\u0010\u0082\u0001\"\u0006\b\u008b\u0001\u0010\u0084\u0001R6\u0010\u008f\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bE\u0010\u0080\u0001\u001a\u0006\b\u008d\u0001\u0010\u0082\u0001\"\u0006\b\u008e\u0001\u0010\u0084\u0001R)\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bc\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0005\b\u0093\u0001\u0010\u001bR'\u0010\u0099\u0001\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b_\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u0010L\"\u0006\b\u0097\u0001\u0010\u0098\u0001R'\u0010\u009e\u0001\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b1\u0010s\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R(\u0010¢\u0001\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u009f\u0001\u0010s\u001a\u0006\b \u0001\u0010\u009b\u0001\"\u0006\b¡\u0001\u0010\u009d\u0001R(\u0010¦\u0001\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b£\u0001\u0010s\u001a\u0006\b¤\u0001\u0010\u009b\u0001\"\u0006\b¥\u0001\u0010\u009d\u0001R6\u0010®\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020&0§\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R \u0010³\u0001\u001a\u00030¯\u00018\u0016X\u0096D¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001¨\u0006´\u0001"}, m65681d2 = {"Lrq0/h1;", "Lhj0/o;", "Lrq0/a1$b;", "Lcq0/g;", "teamsRepository", "Li92/e;", "networkMonitor", "Ltr2/n;", "logger", "Lz92/a;", "userInfoAccessor", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcq0/g;Li92/e;Ltr2/n;Lz92/a;Lbc3/c0;)V", "Lrq0/i1;", "y0", "()Lrq0/i1;", "Lcom/whoop/domain/model/teams/Team;", "newTeam", "Le50/c;", "n0", "(Lcom/whoop/domain/model/teams/Team;)Le50/c;", "Lorg/joda/time/LocalDate;", HttpHeaders.DATE, "Ll83/a0;", "m0", "(Lorg/joda/time/LocalDate;)V", "Lcom/whoop/ui/ScoreContext;", "scoreContext", "Lrq0/v0;", "sortOption", "C0", "(Lcom/whoop/ui/ScoreContext;Lrq0/v0;)V", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "timePeriod", "D0", "(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;)V", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lxg3/g;", "Lcom/whoop/domain/model/RecordsDto;", "Lcom/whoop/domain/model/teams/TeamUser;", "h0", "(II)Lxg3/g;", "position", "size", "Lhq0/a;", "Q", "(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;II)Lxg3/g;", "newSize", "B0", "(Lcom/whoop/ui/ScoreContext;I)V", "", "loaded", "z0", "(Lcom/whoop/ui/ScoreContext;Z)V", "b", "()Z", "a", "(Lcom/whoop/ui/ScoreContext;)Z", "c", "(Lcom/whoop/ui/ScoreContext;)I", "c0", "()Lcom/whoop/domain/model/teams/Team;", "Landroidx/lifecycle/p0;", "Lib/n;", "Lcom/whoop/domain/model/teams/LeadersEntry;", "N", "(Lcom/whoop/ui/ScoreContext;)Landroidx/lifecycle/p0;", "o0", "(Lcom/whoop/ui/ScoreContext;)V", "Z", "(Lcom/whoop/ui/ScoreContext;)Lrq0/v0;", "d0", "()Lcom/whoop/community/domain/model/teams/TimePeriod;", "G0", "(Lcom/whoop/ui/ScoreContext;)Lcom/whoop/domain/model/teams/LeadersEntry;", "l0", "(Lq83/d;)Ljava/lang/Object;", "F0", "scoreContexts", "w0", "p0", "()V", ProfileApiKt.COMMUNITY_ID_PARAM, "online", "E0", "(IZ)V", "isConnected", "A0", "(Z)V", "b0", "(Lorg/joda/time/LocalDate;Lcom/whoop/community/domain/model/teams/TimePeriod;)Lorg/joda/time/LocalDate;", "P", "k0", "Y", "", "O", "(Lcom/whoop/ui/ScoreContext;)Ljava/lang/Double;", "", "M", "(Lcom/whoop/community/domain/model/teams/TimePeriod;[Lcom/whoop/ui/ScoreContext;)V", "q0", "([Lcom/whoop/ui/ScoreContext;Lq83/d;)Ljava/lang/Object;", "t0", "E", "Lcq0/g;", "F", "Li92/e;", "G", "Ltr2/n;", "H", "Lz92/a;", "I", "Le50/c;", "j0", "()Le50/c;", "viewStateLiveData", "<set-?>", "J", "Lf93/d;", "i0", "x0", "(Lrq0/i1;)V", "viewState", "K", "Landroidx/lifecycle/p0;", "U", "()Landroidx/lifecycle/p0;", "setOverviewDataSource", "(Landroidx/lifecycle/p0;)V", "overviewDataSource", "L", "getStrainDataSource", "setStrainDataSource", "strainDataSource", "getRecoveryDataSource", "setRecoveryDataSource", "recoveryDataSource", "getSleepDataSource", "setSleepDataSource", "sleepDataSource", "Lorg/joda/time/LocalDate;", "W", "()Lorg/joda/time/LocalDate;", "u0", "selectedDate", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "X", "v0", "(Lcom/whoop/community/domain/model/teams/TimePeriod;)V", "selectedTimePeriod", "e0", "()I", "setTotalListCount", "(I)V", "totalListCount", "R", "f0", "setTotalNonCompliant", "totalNonCompliant", "S", "g0", "setTotalOriginalCompliant", "totalOriginalCompliant", "", "T", "Ljava/util/Map;", "V", "()Ljava/util/Map;", "setScoreContextCompliantMap", "(Ljava/util/Map;)V", "scoreContextCompliantMap", "", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31671h1 extends AbstractC17356o implements C31650a1.b {

    /* JADX INFO: renamed from: V */
    static final /* synthetic */ InterfaceC21493z[] f131007V = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C31671h1.class, "viewState", "getViewState()Lcom/whoop/community/presentation/teams/TeamsViewState;", 0))};

    /* JADX INFO: renamed from: W */
    public static final int f131008W = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C12724c<C31674i1> viewStateLiveData;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private AbstractC1615p0 overviewDataSource;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private AbstractC1615p0 strainDataSource;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private AbstractC1615p0 recoveryDataSource;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private AbstractC1615p0 sleepDataSource;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private LocalDate selectedDate;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private TimePeriod selectedTimePeriod;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private int totalListCount;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private int totalNonCompliant;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private int totalOriginalCompliant;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private Map<ScoreContext, Integer> scoreContextCompliantMap;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: rq0.h1$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f131026a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f131027b;

        static {
            int[] iArr = new int[TimePeriod.values().length];
            try {
                iArr[TimePeriod.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimePeriod.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimePeriod.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f131026a = iArr;
            int[] iArr2 = new int[ScoreContext.values().length];
            try {
                iArr2[ScoreContext.STRAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ScoreContext.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ScoreContext.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ScoreContext.OVERVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f131027b = iArr2;
        }
    }

    /* JADX INFO: renamed from: rq0.h1$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamsViewModel$getUsers$1", m100430f = "TeamsViewModel.kt", m100431l = {162}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Lxg3/g;", "Lcom/whoop/domain/model/RecordsDto;", "Lcom/whoop/domain/model/teams/TeamUser;", "<anonymous>", "(Lbc3/c0;)Lxg3/g;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f131028E;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ int f131030G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ int f131031H;

        /* JADX INFO: renamed from: w */
        Object f131032w;

        /* JADX INFO: renamed from: x */
        int f131033x;

        /* JADX INFO: renamed from: y */
        int f131034y;

        /* JADX INFO: renamed from: z */
        int f131035z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i13, int i14, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131030G = i13;
            this.f131031H = i14;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31671h1.this.new b(this.f131030G, this.f131031H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C38280g<RecordsDto<TeamUser>>> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13;
            int i14;
            C11059g c11059g;
            int i15;
            TeamType teamType;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i16 = this.f131028E;
            if (i16 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g2 = C31671h1.this.teamsRepository;
                Team team = C31671h1.this.m98010i0().getTeam();
                int id4 = team != null ? team.getId() : 0;
                int i17 = this.f131030G;
                int i18 = this.f131031H;
                C31671h1 c31671h1 = C31671h1.this;
                this.f131032w = c11059g2;
                this.f131033x = id4;
                this.f131034y = i17;
                this.f131035z = i18;
                this.f131028E = 1;
                Object objM98024F0 = c31671h1.m98024F0(this);
                if (objM98024F0 == enumC31071a) {
                    return enumC31071a;
                }
                i13 = id4;
                obj = objM98024F0;
                i14 = i17;
                c11059g = c11059g2;
                i15 = i18;
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i19 = this.f131035z;
                int i24 = this.f131034y;
                int i25 = this.f131033x;
                C11059g c11059g3 = (C11059g) this.f131032w;
                AbstractC34132o.m107864I(obj);
                i15 = i19;
                c11059g = c11059g3;
                i14 = i24;
                i13 = i25;
            }
            int iIntValue = ((Number) obj).intValue();
            Team team2 = C31671h1.this.m98010i0().getTeam();
            if (team2 == null || (teamType = team2.getTeamType()) == null) {
                teamType = TeamType.COMMUNITY;
            }
            return c11059g.m29794U(i13, i14, i15, iIntValue, teamType);
        }
    }

    /* JADX INFO: renamed from: rq0.h1$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamsViewModel$isTeamEditableByCurrentUser$1", m100430f = "TeamsViewModel.kt", m100431l = {212}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131036w;

        /* JADX INFO: renamed from: x */
        int f131037x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31671h1.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x004a  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Team team;
            int i13;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f131037x;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                if (C31671h1.this.m98011k0() && (team = C31671h1.this.m98010i0().getTeam()) != null) {
                    int adminId = team.getAdminId();
                    C31671h1 c31671h1 = C31671h1.this;
                    this.f131036w = adminId;
                    this.f131037x = 1;
                    Object objM98024F0 = c31671h1.m98024F0(this);
                    if (objM98024F0 == enumC31071a) {
                        return enumC31071a;
                    }
                    i13 = adminId;
                    obj = objM98024F0;
                }
                return Boolean.valueOf(z);
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = this.f131036w;
            AbstractC34132o.m107864I(obj);
            boolean z4 = i13 == ((Number) obj).intValue();
            return Boolean.valueOf(z4);
        }
    }

    /* JADX INFO: renamed from: rq0.h1$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamsViewModel", m100430f = "TeamsViewModel.kt", m100431l = {266, 266}, m100432m = "leaveTeam", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f131039E;

        /* JADX INFO: renamed from: w */
        Object f131040w;

        /* JADX INFO: renamed from: x */
        int f131041x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f131042y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131042y = obj;
            this.f131039E |= Integer.MIN_VALUE;
            return C31671h1.this.m98040l0(this);
        }
    }

    /* JADX INFO: renamed from: rq0.h1$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamsViewModel$loadDate$1$1", m100430f = "TeamsViewModel.kt", m100431l = {114}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131044w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ScoreContext[] f131046y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ScoreContext[] scoreContextArr, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131046y = scoreContextArr;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31671h1.this.new e(this.f131046y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131044w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31671h1 c31671h1 = C31671h1.this;
                ScoreContext[] scoreContextArr = this.f131046y;
                ScoreContext[] scoreContextArr2 = (ScoreContext[]) Arrays.copyOf(scoreContextArr, scoreContextArr.length);
                this.f131044w = 1;
                if (c31671h1.m98012q0(scoreContextArr2, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.h1$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamsViewModel$loadTeam$1", m100430f = "TeamsViewModel.kt", m100431l = {79, 79, 92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f131047E;

        /* JADX INFO: renamed from: F */
        int f131048F;

        /* JADX INFO: renamed from: G */
        int f131049G;

        /* JADX INFO: renamed from: H */
        int f131050H;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ Team f131052J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ C12724c<Team> f131053K;

        /* JADX INFO: renamed from: w */
        Object f131054w;

        /* JADX INFO: renamed from: x */
        Object f131055x;

        /* JADX INFO: renamed from: y */
        Object f131056y;

        /* JADX INFO: renamed from: z */
        Object f131057z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Team team, C12724c<Team> c12724c, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131052J = team;
            this.f131053K = c12724c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31671h1.this.new f(this.f131052J, this.f131053K, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0087  */
        /* JADX WARN: Code duplicated, block: B:24:0x00b6 A[LOOP:0: B:22:0x00b0->B:24:0x00b6, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:27:0x00f7  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0124, code lost:
        
            if (r4.m98012q0(r2, r27) == r1) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                Method dump skipped, instruction units count: 298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rq0.C31671h1.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: rq0.h1$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamsViewModel$observerNetworkChanges$1", m100430f = "TeamsViewModel.kt", m100431l = {333}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131058w;

        /* JADX INFO: renamed from: rq0.h1$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C31671h1 f131060w;

            public a(C31671h1 c31671h1) {
                this.f131060w = c31671h1;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC18263h abstractC18263h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f131060w.m97992A0(abstractC18263h.m52614a());
                return C23454a0.f92919a;
            }
        }

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31671h1.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131058w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lMo52604a = C31671h1.this.networkMonitor.mo52604a();
                a aVar = new a(C31671h1.this);
                this.f131058w = 1;
                if (interfaceC13058lMo52604a.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.h1$h */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"rq0/h1$h", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C31674i1 value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31671h1 f131062x;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Object obj, C31671h1 c31671h1) {
            this.f131062x = c31671h1;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C31674i1 getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C31674i1 value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f131062x.m98039j0().postValue(this.f131062x.m98010i0());
        }
    }

    /* JADX INFO: renamed from: rq0.h1$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamsViewModel$updateSortOption$1", m100430f = "TeamsViewModel.kt", m100431l = {125}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131063w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ScoreContext f131065y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ScoreContext scoreContext, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131065y = scoreContext;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31671h1.this.new i(this.f131065y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131063w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31671h1 c31671h1 = C31671h1.this;
                ScoreContext[] scoreContextArr = {this.f131065y};
                this.f131063w = 1;
                if (c31671h1.m98012q0(scoreContextArr, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.h1$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamsViewModel$updateTimePeriod$2", m100430f = "TeamsViewModel.kt", m100431l = {141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131066w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ScoreContext f131068y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ScoreContext scoreContext, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131068y = scoreContext;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31671h1.this.new j(this.f131068y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131066w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31671h1 c31671h1 = C31671h1.this;
                ScoreContext[] scoreContextArr = {this.f131068y};
                this.f131066w = 1;
                if (c31671h1.m98012q0(scoreContextArr, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.h1$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamsViewModel$updateUserOnlineStatus$1", m100430f = "TeamsViewModel.kt", m100431l = {341}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131069w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f131071y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f131072z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i13, boolean z4, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131071y = i13;
            this.f131072z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31671h1.this.new k(this.f131071y, this.f131072z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131069w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11059g c11059g = C31671h1.this.teamsRepository;
                int i14 = this.f131071y;
                boolean z4 = this.f131072z;
                this.f131069w = 1;
                obj = c11059g.m29815t0(i14, z4, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                C31671h1.this.logger.mo85216g(AbstractC2875y.m8295h(this.f131071y, "Updating the user online status failed for the community id "), new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rq0.h1$l */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamsViewModel", m100430f = "TeamsViewModel.kt", m100431l = {318}, m100432m = "userId", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f131073w;

        /* JADX INFO: renamed from: y */
        int f131075y;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131073w = obj;
            this.f131075y |= Integer.MIN_VALUE;
            return C31671h1.this.m98024F0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31671h1(C11059g teamsRepository, InterfaceC18260e networkMonitor, InterfaceC34116n logger, InterfaceC40205a userInfoAccessor, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.teamsRepository = teamsRepository;
        this.networkMonitor = networkMonitor;
        this.logger = logger;
        this.userInfoAccessor = userInfoAccessor;
        this.viewStateLiveData = new C12724c<>();
        this.viewState = new h(new C31674i1(null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null), this);
        this.selectedTimePeriod = TimePeriod.DAILY;
        this.scoreContextCompliantMap = new LinkedHashMap();
        this.logTag = "TeamsViewModel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public final void m97992A0(boolean isConnected) {
        if (isConnected != m98010i0().getIsConnected()) {
            m98017x0(C31674i1.m98090c(m98010i0(), null, null, null, isConnected, false, null, null, null, null, null, null, null, null, null, null, null, 65527, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final void m98003M(TimePeriod timePeriod, ScoreContext... scoreContexts) {
        C18316m c18316m = new C18316m();
        c18316m.m52725d();
        c18316m.m52724c();
        c18316m.m52723b();
        C18316m c18316mM52722a = c18316m.m52722a();
        for (ScoreContext scoreContext : scoreContexts) {
            int i13 = a.f131027b[scoreContext.ordinal()];
            if (i13 == 1) {
                this.strainDataSource = new C38445a(new C31680l0(ScoreContext.STRAIN, timePeriod, this), c18316mM52722a).m123174i();
            } else if (i13 == 2) {
                this.recoveryDataSource = new C38445a(new C31680l0(ScoreContext.RECOVERY, timePeriod, this), c18316mM52722a).m123174i();
            } else if (i13 == 3) {
                this.sleepDataSource = new C38445a(new C31680l0(ScoreContext.SLEEP, timePeriod, this), c18316mM52722a).m123174i();
            } else if (i13 == 4) {
                this.overviewDataSource = new C38445a(new C31704x0(this), c18316mM52722a).m123174i();
            }
        }
        m98017x0(C31674i1.m98090c(m98010i0(), null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null).m98092A(AbstractC25260n.m74049W0(scoreContexts)));
    }

    /* JADX INFO: renamed from: O */
    private final Double m98004O(ScoreContext scoreContext) {
        LeadersEntry leadersEntry;
        C31700v0 c31700v0 = m98010i0().m98104l().get(scoreContext);
        Integer numValueOf = c31700v0 != null ? Integer.valueOf(c31700v0.getSortType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            LeadersEntry leadersEntry2 = m98010i0().m98096d().get(scoreContext);
            if (leadersEntry2 != null) {
                return leadersEntry2.getDayStrain();
            }
            return null;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            LeadersEntry leadersEntry3 = m98010i0().m98096d().get(scoreContext);
            if (leadersEntry3 != null) {
                return leadersEntry3.getActivityStrain();
            }
            return null;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            LeadersEntry leadersEntry4 = m98010i0().m98096d().get(scoreContext);
            if (leadersEntry4 != null) {
                return leadersEntry4.getCalories();
            }
            return null;
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            LeadersEntry leadersEntry5 = m98010i0().m98096d().get(scoreContext);
            if (leadersEntry5 != null) {
                return leadersEntry5.getRecoveryScore();
            }
            return null;
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            LeadersEntry leadersEntry6 = m98010i0().m98096d().get(scoreContext);
            if (leadersEntry6 != null) {
                return leadersEntry6.getHrv();
            }
            return null;
        }
        if (numValueOf != null && numValueOf.intValue() == 5) {
            LeadersEntry leadersEntry7 = m98010i0().m98096d().get(scoreContext);
            if (leadersEntry7 != null) {
                return leadersEntry7.getRhr();
            }
            return null;
        }
        if (numValueOf != null && numValueOf.intValue() == 6) {
            LeadersEntry leadersEntry8 = m98010i0().m98096d().get(scoreContext);
            if (leadersEntry8 != null) {
                return leadersEntry8.getSleepPerformance();
            }
            return null;
        }
        if (numValueOf == null || numValueOf.intValue() != 7 || (leadersEntry = m98010i0().m98096d().get(scoreContext)) == null) {
            return null;
        }
        return leadersEntry.getSleepDuration();
    }

    /* JADX INFO: renamed from: P */
    private final LocalDate m98005P(LocalDate date, TimePeriod timePeriod) {
        int i13 = a.f131026a[timePeriod.ordinal()];
        if (i13 == 1) {
            return null;
        }
        if (i13 == 2) {
            return date.withDayOfWeek(7);
        }
        if (i13 == 3) {
            return date.dayOfMonth().withMaximumValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C17561a m98006R(C31671h1 c31671h1, ScoreContext scoreContext, C17561a c17561a) {
        String lastUpdated;
        if (!AbstractC28220z0.INSTANCE.m85449a(c31671h1.m98004O(scoreContext), c17561a != null ? c17561a.getAverage() : null, 0.01d)) {
            c31671h1.m98017x0(c31671h1.m98010i0().m98110s(scoreContext, c17561a != null ? c17561a.getAverage() : null));
        }
        if (c17561a != null && (lastUpdated = c17561a.getLastUpdated()) != null) {
            LocalDateTime localDateTime = new LocalDateTime(ISODateTimeFormat.dateTimeParser().parseDateTime(lastUpdated));
            if (!C28204u.INSTANCE.m85359b(c31671h1.m98010i0().m98099g().get(scoreContext), localDateTime)) {
                c31671h1.m98017x0(c31671h1.m98010i0().m98112u(scoreContext, localDateTime));
            }
        }
        Integer totalCount = c17561a != null ? c17561a.getTotalCount() : null;
        c31671h1.m98017x0(c31671h1.m98010i0().m98094C(totalCount));
        c31671h1.totalListCount = totalCount != null ? totalCount.intValue() : 0;
        Integer totalNonCompliantCount = c17561a != null ? c17561a.getTotalNonCompliantCount() : null;
        c31671h1.totalNonCompliant = totalNonCompliantCount != null ? totalNonCompliantCount.intValue() : 0;
        Integer totalCompliant = c17561a != null ? c17561a.getTotalCompliant() : null;
        c31671h1.totalOriginalCompliant = totalCompliant != null ? totalCompliant.intValue() : 0;
        Integer totalCompliant2 = c17561a != null ? c17561a.getTotalCompliant() : null;
        c31671h1.scoreContextCompliantMap.put(scoreContext, Integer.valueOf(totalCompliant2 != null ? totalCompliant2.intValue() : 0));
        return c17561a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C17561a m98007S(Function1 function1, Object obj) {
        return (C17561a) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y */
    private final int m98008Y(ScoreContext scoreContext) {
        C31700v0 c31700v0 = m98010i0().m98104l().get(scoreContext);
        if (c31700v0 != null) {
            return c31700v0.getSortType();
        }
        int i13 = a.f131027b[scoreContext.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 3;
        }
        if (i13 == 3) {
            return 6;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: b0 */
    private final LocalDate m98009b0(LocalDate date, TimePeriod timePeriod) {
        int i13 = a.f131026a[timePeriod.ordinal()];
        if (i13 == 1) {
            return date;
        }
        if (i13 == 2) {
            return date.withDayOfWeek(1);
        }
        if (i13 == 3) {
            return date.withDayOfMonth(1);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public final C31674i1 m98010i0() {
        return (C31674i1) this.viewState.getValue(this, f131007V[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final boolean m98011k0() {
        Team team = m98010i0().getTeam();
        return (team != null ? team.getTeamType() : null) == TeamType.COMMUNITY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public final Object m98012q0(ScoreContext[] scoreContextArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Team team = m98010i0().getTeam();
        if (team != null) {
            for (ScoreContext scoreContext : scoreContextArr) {
                if (scoreContext != ScoreContext.OVERVIEW) {
                    this.teamsRepository.m29796a0(team.getId(), m98010i0().getStartDate(), m98010i0().getEndDate(), m98010i0().getTimePeriod(), m98032Z(scoreContext).getSortType(), team.getTeamType()).m122665P(C22488a.m64989a().f88182b).m122652B(C40634a.m131874a()).m122661K(new C27566m0(new C31668g1(this, scoreContext, 0), 25));
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m98013r0(C31671h1 c31671h1, ScoreContext scoreContext, LeadersEntry leadersEntry) {
        c31671h1.m98017x0(C31674i1.m98090c(c31671h1.m98010i0().m98114w(scoreContext, leadersEntry), null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m98014s0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public final void m98015t0() {
        this.totalListCount = 0;
        this.totalNonCompliant = 0;
        this.totalOriginalCompliant = 0;
        this.scoreContextCompliantMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public final void m98017x0(C31674i1 c31674i1) {
        this.viewState.setValue(this, f131007V[0], c31674i1);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m98020B0(ScoreContext scoreContext, int newSize) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        m98017x0(C31674i1.m98090c(m98010i0(), null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null).m98113v(scoreContext, false).m98116y(scoreContext, newSize));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m98021C0(ScoreContext scoreContext, C31700v0 sortOption) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        AbstractC22676k.m65750j(sortOption, "sortOption");
        C31700v0 c31700v0 = m98010i0().m98104l().get(scoreContext);
        if (c31700v0 == null || c31700v0.getSortType() != sortOption.getSortType()) {
            m98017x0(C31674i1.m98090c(m98010i0().m98117z(scoreContext, sortOption), null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null));
            m98003M(m98010i0().getTimePeriod(), scoreContext);
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new i(scoreContext, null), 3);
        } else {
            C31700v0 c31700v1 = m98010i0().m98104l().get(scoreContext);
            if (AbstractC22676k.m65745e(c31700v1 != null ? c31700v1.getName() : null, sortOption.getName())) {
                return;
            }
            m98017x0(C31674i1.m98090c(m98010i0().m98117z(scoreContext, sortOption), null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null));
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m98022D0(ScoreContext scoreContext, TimePeriod timePeriod) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        AbstractC22676k.m65750j(timePeriod, "timePeriod");
        this.selectedTimePeriod = timePeriod;
        m98017x0(m98010i0().m98093B(timePeriod));
        LocalDate localDate = this.selectedDate;
        if (localDate != null) {
            m98017x0(C31674i1.m98090c(m98010i0(), null, m98009b0(localDate, timePeriod), null, false, false, null, null, null, null, null, null, null, null, null, null, null, 65533, null));
            m98017x0(C31674i1.m98090c(m98010i0(), null, null, m98005P(localDate, timePeriod), false, false, null, null, null, null, null, null, null, null, null, null, null, 65531, null));
        }
        m98003M(timePeriod, scoreContext);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new j(scoreContext, null), 3);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m98023E0(int communityId, boolean online) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new k(communityId, online, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F0 */
    public final Object m98024F0(InterfaceC30057d<? super Integer> interfaceC30057d) {
        l lVar;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f131075y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f131075y = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        Object objMo129089c = lVar.f131073w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = lVar.f131075y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            lVar.f131075y = 1;
            objMo129089c = interfaceC40205a.mo129089c(lVar);
            if (objMo129089c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo129089c);
        }
        User user = (User) objMo129089c;
        return new Integer(user != null ? user.getId() : 0);
    }

    /* JADX INFO: renamed from: G0 */
    public final LeadersEntry m98025G0(ScoreContext scoreContext) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        return m98010i0().m98107o().get(scoreContext);
    }

    /* JADX INFO: renamed from: N */
    public final AbstractC1615p0 m98026N(ScoreContext scoreContext) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        int i13 = a.f131027b[scoreContext.ordinal()];
        if (i13 == 1) {
            return this.strainDataSource;
        }
        if (i13 == 2) {
            return this.recoveryDataSource;
        }
        if (i13 == 3) {
            return this.sleepDataSource;
        }
        throw new IllegalArgumentException("Invalid score context");
    }

    /* JADX INFO: renamed from: Q */
    public final C38280g<C17561a> m98027Q(ScoreContext scoreContext, TimePeriod timePeriod, int position, int size) {
        TeamType teamType;
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        AbstractC22676k.m65750j(timePeriod, "timePeriod");
        C11059g c11059g = this.teamsRepository;
        Team team = m98010i0().getTeam();
        int id4 = team != null ? team.getId() : 0;
        LocalDate startDate = m98010i0().getStartDate();
        LocalDate endDate = m98010i0().getEndDate();
        int iM98008Y = m98008Y(scoreContext);
        Team team2 = m98010i0().getTeam();
        if (team2 == null || (teamType = team2.getTeamType()) == null) {
            teamType = TeamType.COMMUNITY;
        }
        C38280g c38280gM122682x = c11059g.m29795X(id4, startDate, endDate, timePeriod, iM98008Y, position, size, teamType).m122682x(new C31559p(new C31668g1(this, scoreContext, 1), 6));
        AbstractC22676k.m65749i(c38280gM122682x, "map(...)");
        return c38280gM122682x;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final AbstractC1615p0 getOverviewDataSource() {
        return this.overviewDataSource;
    }

    /* JADX INFO: renamed from: V */
    public final Map<ScoreContext, Integer> m98029V() {
        return this.scoreContextCompliantMap;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final TimePeriod getSelectedTimePeriod() {
        return this.selectedTimePeriod;
    }

    /* JADX INFO: renamed from: Z */
    public final C31700v0 m98032Z(ScoreContext scoreContext) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        C31700v0 c31700v0 = m98010i0().m98104l().get(scoreContext);
        if (c31700v0 != null) {
            return c31700v0;
        }
        int i13 = a.f131027b[scoreContext.ordinal()];
        if (i13 == 1) {
            return new C31700v0("", 0, "", 0);
        }
        if (i13 == 2) {
            return new C31700v0("", 3, "", 0);
        }
        if (i13 == 3) {
            return new C31700v0("", 6, "", 0);
        }
        throw new IllegalArgumentException("Invalid score context");
    }

    @Override // rq0.C31650a1.b
    /* JADX INFO: renamed from: a */
    public boolean mo97828a(ScoreContext scoreContext) {
        TeamPrivacyProfile privacyProfile;
        PrivacyType privacyTypeForContext;
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        Team team = m98010i0().getTeam();
        if (team == null || (privacyProfile = team.getPrivacyProfile()) == null || (privacyTypeForContext = privacyProfile.forContext(scoreContext)) == null) {
            return false;
        }
        return privacyTypeForContext.isAtLeast(PrivacyType.SUMMARY);
    }

    @Override // rq0.C31650a1.b
    /* JADX INFO: renamed from: b */
    public boolean mo97829b() {
        return ((Boolean) AbstractC3006f0.m8699E(C30064k.f122676w, new c(null))).booleanValue();
    }

    @Override // rq0.C31650a1.b
    /* JADX INFO: renamed from: c */
    public int mo97830c(ScoreContext scoreContext) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        Integer num = m98010i0().m98103k().get(scoreContext);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final Team m98033c0() {
        return m98010i0().getTeam();
    }

    /* JADX INFO: renamed from: d0 */
    public final TimePeriod m98034d0() {
        return m98010i0().getTimePeriod();
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final int getTotalListCount() {
        return this.totalListCount;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final int getTotalNonCompliant() {
        return this.totalNonCompliant;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final int getTotalOriginalCompliant() {
        return this.totalOriginalCompliant;
    }

    /* JADX INFO: renamed from: h0 */
    public final C38280g<RecordsDto<TeamUser>> m98038h0(int offset, int limit) {
        return (C38280g) AbstractC3006f0.m8699E(C30064k.f122676w, new b(offset, limit, null));
    }

    /* JADX INFO: renamed from: j0 */
    public final C12724c<C31674i1> m98039j0() {
        return this.viewStateLiveData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l0 */
    public final Object m98040l0(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        d dVar;
        int id4;
        C11059g c11059g;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f131039E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f131039E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f131042y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = dVar.f131039E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C11059g c11059g2 = this.teamsRepository;
            Team team = m98010i0().getTeam();
            id4 = team != null ? team.getId() : 0;
            dVar.f131040w = c11059g2;
            dVar.f131041x = id4;
            dVar.f131039E = 1;
            Object objM98024F0 = m98024F0(dVar);
            if (objM98024F0 != obj2) {
                c11059g = c11059g2;
                obj = objM98024F0;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        id4 = dVar.f131041x;
        c11059g = (C11059g) dVar.f131040w;
        AbstractC34132o.m107864I(obj);
        int iIntValue = ((Number) obj).intValue();
        dVar.f131040w = null;
        dVar.f131039E = 2;
        Object objM29793T = c11059g.m29793T(id4, iIntValue, dVar);
        return objM29793T == obj2 ? obj2 : objM29793T;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m98041m0(LocalDate date) {
        List<ScoreContext> enabledTabs;
        ScoreContext[] scoreContextArr;
        AbstractC22676k.m65750j(date, "date");
        LocalDate localDateM98009b0 = m98009b0(date, m98010i0().getTimePeriod());
        LocalDate localDateM98005P = m98005P(date, m98010i0().getTimePeriod());
        if (AbstractC22676k.m65745e(localDateM98009b0, m98010i0().getStartDate()) && AbstractC22676k.m65745e(localDateM98005P, m98010i0().getEndDate())) {
            return;
        }
        m98017x0(C31674i1.m98090c(m98010i0(), null, localDateM98009b0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, 65533, null));
        m98017x0(C31674i1.m98090c(m98010i0(), null, null, localDateM98005P, false, false, null, null, null, null, null, null, null, null, null, null, null, 65531, null));
        Team team = m98010i0().getTeam();
        if (team == null || (enabledTabs = team.getEnabledTabs()) == null || (scoreContextArr = (ScoreContext[]) enabledTabs.toArray(new ScoreContext[0])) == null) {
            return;
        }
        m98003M(m98010i0().getTimePeriod(), (ScoreContext[]) Arrays.copyOf(scoreContextArr, scoreContextArr.length));
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new e(scoreContextArr, null), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C12724c<Team> m98042n0(Team newTeam) {
        AbstractC22676k.m65750j(newTeam, "newTeam");
        C12724c<Team> c12724c = new C12724c<>();
        m98017x0(new C31674i1(null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null).m98109r());
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new f(newTeam, c12724c, null), 3);
        return c12724c;
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m98043o0(ScoreContext scoreContext) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        m98017x0(C31674i1.m98090c(m98010i0().m98115x(scoreContext), null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m98044p0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new g(null), 3);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m98045u0(LocalDate localDate) {
        this.selectedDate = localDate;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m98046v0(TimePeriod timePeriod) {
        AbstractC22676k.m65750j(timePeriod, "<set-?>");
        this.selectedTimePeriod = timePeriod;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m98047w0(ScoreContext scoreContexts) {
        AbstractC22676k.m65750j(scoreContexts, "scoreContexts");
        this.scoreContextCompliantMap.put(scoreContexts, Integer.valueOf(this.totalListCount));
    }

    @Override // rq0.C31650a1.b
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public C31674i1 state() {
        return m98010i0();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m98049z0(ScoreContext scoreContext, boolean loaded) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        m98017x0(C31674i1.m98090c(m98010i0(), null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null).m98111t(scoreContext, loaded));
    }

    public /* synthetic */ C31671h1(C11059g c11059g, InterfaceC18260e interfaceC18260e, InterfaceC34116n interfaceC34116n, InterfaceC40205a interfaceC40205a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11059g, interfaceC18260e, interfaceC34116n, interfaceC40205a, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
