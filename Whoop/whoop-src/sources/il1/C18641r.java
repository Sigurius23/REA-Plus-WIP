package il1;

import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.home.domain.HomeGetRequest;
import com.whoop.home.domain.models.ComponentItems;
import com.whoop.home.domain.models.HomeBffFeedResponse;
import com.whoop.home.domain.models.JournalHomeTileWrapperModel;
import com.whoop.home.domain.models.Pillars;
import ct2.C11111c;
import dp0.InterfaceC12251g;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import em1.EnumC13344r;
import fm1.EnumC14603g;
import fs1.C14747d;
import ge3.AbstractC15751g;
import gl1.C15967b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jy1.C22047a;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p127ev.AbstractC13673n;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pn1.C29380c;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import wm0.C37378a;
import xl1.C38452b;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: il1.r */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002A?Bw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010'J#\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0$2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b,\u0010-J\u0018\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0082@¢\u0006\u0004\b1\u00102J#\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030$2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u0002002\b\u00106\u001a\u0004\u0018\u00010+H\u0080@¢\u0006\u0004\b7\u00108J+\u0010=\u001a\u0004\u0018\u00010+2\u0006\u0010:\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u00010+2\u0006\u0010<\u001a\u00020\u0003H\u0000¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010Y¨\u0006Z"}, m65681d2 = {"Lil1/r;", "Lod1/g;", "Lil1/u;", "Lil1/v;", "Ltr2/n;", "logger", "Lnm0/e;", "cachedApiSource", "Lxl1/b;", "journalDomainInteractor", "Lil1/l;", "actionReducer", "Lqw2/c;", "actionInteractor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltd1/b;", "whoopStrapProxy", "Lpn1/c;", "notificationsCenterRefreshHook", "Lct2/c;", "weeklyPlanHomeTileRefreshHook", "Lfs1/d;", "journalHomeTileRefreshHook", "Lwm0/a;", "scopeCoordinator", "Liy1/c;", "metricsInteractor", "Lgl1/b;", "homeAnalyticsHelper", "Ldp0/g;", "globalCoachManager", "<init>", "(Ltr2/n;Lnm0/e;Lxl1/b;Lil1/l;Lqw2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltd1/b;Lpn1/c;Lct2/c;Lfs1/d;Lwm0/a;Liy1/c;Lgl1/b;Ldp0/g;)V", "Lil1/u$a;", "action", "Lec3/l;", "", "q", "(Lil1/u$a;)Lec3/l;", "Lil1/u$c;", "domainAction", "Lpm0/a;", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "o", "(Lil1/u$c;)Lec3/l;", "", "httpStatusCode", "Ll83/a0;", "r", "(ILq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "feed", "n", "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Lq83/d;)Ljava/lang/Object;", "", "useLoadingFix", "cacheResponse", "previousResult", "p", "(ZLcom/whoop/home/domain/models/HomeBffFeedResponse;Lil1/v;)Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "a", "Ltr2/n;", "b", "Lnm0/e;", "c", "Lxl1/b;", "d", "Lil1/l;", "e", "Lqw2/c;", "f", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "g", "Ltd1/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lpn1/c;", "i", "Lct2/c;", "j", "Lfs1/d;", "k", "Lwm0/a;", "l", "Liy1/c;", "m", "Lgl1/b;", "Ldp0/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18641r implements InterfaceC27844g<AbstractC18644u, AbstractC18645v> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C38452b journalDomainInteractor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18635l actionReducer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C29380c notificationsCenterRefreshHook;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C11111c weeklyPlanHomeTileRefreshHook;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C14747d journalHomeTileRefreshHook;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC21030c metricsInteractor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C15967b homeAnalyticsHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC12251g globalCoachManager;

    /* JADX INFO: renamed from: il1.r$a */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lil1/r$a;", "", "<init>", "()V", "b", "e", "c", "a", "d", "Lil1/r$a$a;", "Lil1/r$a$b;", "Lil1/r$a$c;", "Lil1/r$a$d;", "Lil1/r$a$e;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: il1.r$a$b */
        @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lil1/r$a$b;", "Lil1/r$a;", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "cacheResponse", "Ljava/time/LocalDate;", "requestDate", "Lem1/r;", "refreshType", "<init>", "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "()Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "b", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "Lem1/r;", "()Lem1/r;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final HomeBffFeedResponse cacheResponse;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final LocalDate requestDate;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final EnumC13344r refreshType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(HomeBffFeedResponse homeBffFeedResponse, LocalDate requestDate, EnumC13344r refreshType) {
                super(null);
                AbstractC22676k.m65750j(requestDate, "requestDate");
                AbstractC22676k.m65750j(refreshType, "refreshType");
                this.cacheResponse = homeBffFeedResponse;
                this.requestDate = requestDate;
                this.refreshType = refreshType;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final HomeBffFeedResponse getCacheResponse() {
                return this.cacheResponse;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final EnumC13344r getRefreshType() {
                return this.refreshType;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final LocalDate getRequestDate() {
                return this.requestDate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return AbstractC22676k.m65745e(this.cacheResponse, bVar.cacheResponse) && AbstractC22676k.m65745e(this.requestDate, bVar.requestDate) && this.refreshType == bVar.refreshType;
            }

            public int hashCode() {
                HomeBffFeedResponse homeBffFeedResponse = this.cacheResponse;
                return this.refreshType.hashCode() + AbstractC13673n.m38558e(this.requestDate, (homeBffFeedResponse == null ? 0 : homeBffFeedResponse.hashCode()) * 31, 31);
            }

            public String toString() {
                return "FetchFeed(cacheResponse=" + this.cacheResponse + ", requestDate=" + this.requestDate + ", refreshType=" + this.refreshType + ")";
            }
        }

        /* JADX INFO: renamed from: il1.r$a$c */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/r$a$c;", "Lil1/r$a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a */
            public static final c f72994a = new c();

            private c() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: il1.r$a$d */
        /* JADX INFO: loaded from: classes9.dex */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/r$a$d;", "Lil1/r$a;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class d extends a {

            /* JADX INFO: renamed from: a */
            public static final d f72995a = new d();

            private d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: il1.r$a$e */
        @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lil1/r$a$e;", "Lil1/r$a;", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "cacheResponse", "Ljava/time/LocalDate;", "requestDate", "Lem1/r;", "refreshType", "<init>", "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "()Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "b", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "Lem1/r;", "()Lem1/r;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final HomeBffFeedResponse cacheResponse;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final LocalDate requestDate;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final EnumC13344r refreshType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(HomeBffFeedResponse homeBffFeedResponse, LocalDate requestDate, EnumC13344r refreshType) {
                super(null);
                AbstractC22676k.m65750j(requestDate, "requestDate");
                AbstractC22676k.m65750j(refreshType, "refreshType");
                this.cacheResponse = homeBffFeedResponse;
                this.requestDate = requestDate;
                this.refreshType = refreshType;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final HomeBffFeedResponse getCacheResponse() {
                return this.cacheResponse;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final EnumC13344r getRefreshType() {
                return this.refreshType;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final LocalDate getRequestDate() {
                return this.requestDate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof e)) {
                    return false;
                }
                e eVar = (e) other;
                return AbstractC22676k.m65745e(this.cacheResponse, eVar.cacheResponse) && AbstractC22676k.m65745e(this.requestDate, eVar.requestDate) && this.refreshType == eVar.refreshType;
            }

            public int hashCode() {
                HomeBffFeedResponse homeBffFeedResponse = this.cacheResponse;
                return this.refreshType.hashCode() + AbstractC13673n.m38558e(this.requestDate, (homeBffFeedResponse == null ? 0 : homeBffFeedResponse.hashCode()) * 31, 31);
            }

            public String toString() {
                return "Updating(cacheResponse=" + this.cacheResponse + ", requestDate=" + this.requestDate + ", refreshType=" + this.refreshType + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }

        /* JADX INFO: renamed from: il1.r$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"¨\u0006#"}, m65681d2 = {"Lil1/r$a$a;", "Lil1/r$a;", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "cacheResponse", "Ljava/time/LocalDate;", "requestDate", "Lem1/r;", "refreshType", "", "networkError", "<init>", "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "()Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "b", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "Lem1/r;", "getRefreshType", "()Lem1/r;", "d", "Z", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41753a extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final HomeBffFeedResponse cacheResponse;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final LocalDate requestDate;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final EnumC13344r refreshType;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final boolean networkError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41753a(HomeBffFeedResponse homeBffFeedResponse, LocalDate localDate, EnumC13344r refreshType, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(refreshType, "refreshType");
                this.cacheResponse = homeBffFeedResponse;
                this.requestDate = localDate;
                this.refreshType = refreshType;
                this.networkError = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final HomeBffFeedResponse getCacheResponse() {
                return this.cacheResponse;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getNetworkError() {
                return this.networkError;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final LocalDate getRequestDate() {
                return this.requestDate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C41753a)) {
                    return false;
                }
                C41753a c41753a = (C41753a) other;
                return AbstractC22676k.m65745e(this.cacheResponse, c41753a.cacheResponse) && AbstractC22676k.m65745e(this.requestDate, c41753a.requestDate) && this.refreshType == c41753a.refreshType && this.networkError == c41753a.networkError;
            }

            public int hashCode() {
                HomeBffFeedResponse homeBffFeedResponse = this.cacheResponse;
                int iHashCode = (homeBffFeedResponse == null ? 0 : homeBffFeedResponse.hashCode()) * 31;
                LocalDate localDate = this.requestDate;
                return Boolean.hashCode(this.networkError) + ((this.refreshType.hashCode() + ((iHashCode + (localDate != null ? localDate.hashCode() : 0)) * 31)) * 31);
            }

            public String toString() {
                return "Error(cacheResponse=" + this.cacheResponse + ", requestDate=" + this.requestDate + ", refreshType=" + this.refreshType + ", networkError=" + this.networkError + ")";
            }

            public /* synthetic */ C41753a(HomeBffFeedResponse homeBffFeedResponse, LocalDate localDate, EnumC13344r enumC13344r, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this((i13 & 1) != 0 ? null : homeBffFeedResponse, (i13 & 2) != 0 ? null : localDate, (i13 & 4) != 0 ? EnumC13344r.ERROR : enumC13344r, (i13 & 8) != 0 ? false : z4);
            }
        }
    }

    /* JADX INFO: renamed from: il1.r$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lil1/r$b;", "", "Lil1/r$a;", "internalAction", "Lfm1/g;", "selectedPillar", "<init>", "(Lil1/r$a;Lfm1/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lil1/r$a;", "()Lil1/r$a;", "b", "Lfm1/g;", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final a internalAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC14603g selectedPillar;

        public b(a internalAction, EnumC14603g selectedPillar) {
            AbstractC22676k.m65750j(internalAction, "internalAction");
            AbstractC22676k.m65750j(selectedPillar, "selectedPillar");
            this.internalAction = internalAction;
            this.selectedPillar = selectedPillar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getInternalAction() {
            return this.internalAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC14603g getSelectedPillar() {
            return this.selectedPillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.internalAction, bVar.internalAction) && this.selectedPillar == bVar.selectedPillar;
        }

        public int hashCode() {
            return this.selectedPillar.hashCode() + (this.internalAction.hashCode() * 31);
        }

        public String toString() {
            return "InternalState(internalAction=" + this.internalAction + ", selectedPillar=" + this.selectedPillar + ")";
        }

        public /* synthetic */ b(a aVar, EnumC14603g enumC14603g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i13 & 2) != 0 ? EnumC14603g.OVERVIEW : enumC14603g);
        }
    }

    /* JADX INFO: renamed from: il1.r$c */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeFeedDomainInteractor$getHomePillarFeedFromCache$$inlined$cacheAPI$1", m100430f = "HomeFeedDomainInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f73001w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f73002x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f73003y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f73004z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f73004z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f73004z);
            cVar.f73002x = interfaceC13062m;
            cVar.f73003y = c26832c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f73001w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f73002x;
                C26832c c26832c = (C26832c) this.f73003y;
                InterfaceC26834e interfaceC26834e = this.f73004z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(HomeBffFeedResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(HomeBffFeedResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f73002x = null;
                this.f73003y = null;
                this.f73001w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: il1.r$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f73005w;

        /* JADX INFO: renamed from: il1.r$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f73006w;

            /* JADX INFO: renamed from: il1.r$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeFeedDomainInteractor$interact$$inlined$filterIsInstance$1$2", m100430f = "HomeFeedDomainInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41754a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f73008F;

                /* JADX INFO: renamed from: G */
                Object f73009G;

                /* JADX INFO: renamed from: H */
                int f73010H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f73011w;

                /* JADX INFO: renamed from: x */
                int f73012x;

                /* JADX INFO: renamed from: y */
                Object f73013y;

                /* JADX INFO: renamed from: z */
                Object f73014z;

                public C41754a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f73011w = obj;
                    this.f73012x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f73006w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41754a c41754a;
                if (interfaceC30057d instanceof C41754a) {
                    c41754a = (C41754a) interfaceC30057d;
                    int i13 = c41754a.f73012x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41754a.f73012x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41754a = new C41754a(interfaceC30057d);
                    }
                } else {
                    c41754a = new C41754a(interfaceC30057d);
                }
                Object obj2 = c41754a.f73011w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41754a.f73012x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f73006w;
                    if (obj instanceof AbstractC18644u.c) {
                        c41754a.f73013y = null;
                        c41754a.f73014z = null;
                        c41754a.f73008F = null;
                        c41754a.f73009G = null;
                        c41754a.f73010H = 0;
                        c41754a.f73012x = 1;
                        if (interfaceC13062m.emit(obj, c41754a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC13058l interfaceC13058l) {
            this.f73005w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f73005w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: il1.r$e */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeFeedDomainInteractor$interact$$inlined$flatMapLatest$1", m100430f = "HomeFeedDomainInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f73015w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f73016x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f73017y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C18641r f73018z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C18641r c18641r) {
            super(3, interfaceC30057d);
            this.f73018z = c18641r;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC18644u.c cVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f73018z);
            eVar.f73016x = interfaceC13062m;
            eVar.f73017y = cVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f73015w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f73016x;
                AbstractC18644u.c cVar = (AbstractC18644u.c) this.f73017y;
                InterfaceC13058l jVar = cVar.getShouldRefresh() ? new j(this.f73018z.m53983o(cVar), cVar, this.f73018z) : new C0456u(new b(a.d.f72995a, null, 2, 0 == true ? 1 : 0), 1);
                this.f73016x = null;
                this.f73017y = null;
                this.f73015w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, jVar, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC18644u.c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: il1.r$f */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeFeedDomainInteractor$interact$$inlined$flatMapLatest$2", m100430f = "HomeFeedDomainInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f73019w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f73020x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f73021y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f73022z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC13058l interfaceC13058l) {
            super(3, interfaceC30057d);
            this.f73022z = interfaceC13058l;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, b bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f73022z);
            fVar.f73020x = interfaceC13062m;
            fVar.f73021y = bVar;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f73019w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f73020x;
                b bVar = (b) this.f73021y;
                C13015a0 c13015a0 = new C13015a0(new h(bVar, null), new l(new k(this.f73022z), bVar));
                this.f73020x = null;
                this.f73021y = null;
                this.f73019w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13015a0, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: il1.r$g */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeFeedDomainInteractor$interact$1", m100430f = "HomeFeedDomainInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "", "Lil1/u;", "action", "Ll83/a0;", "<anonymous>", "(Lec3/m;Lil1/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f73023w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f73024x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f73025y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC18644u abstractC18644u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = C18641r.this.new g(interfaceC30057d);
            gVar.f73024x = interfaceC13062m;
            gVar.f73025y = abstractC18644u;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r7, r6) == r2) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r0.emit(r1, r6) == r2) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            return r2;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f73024x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                java.lang.Object r1 = r6.f73025y
                il1.u r1 = (il1.AbstractC18644u) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r6.f73023w
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L21
                if (r3 == r5) goto L1d
                if (r3 != r4) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L4b
            L21:
                p505ts.AbstractC34132o.m107864I(r7)
                boolean r7 = r1 instanceof il1.AbstractC18644u.a
                r3 = 0
                if (r7 == 0) goto L3e
                il1.r r7 = il1.C18641r.this
                il1.u$a r1 = (il1.AbstractC18644u.a) r1
                ec3.l r7 = il1.C18641r.m53981l(r7, r1)
                r6.f73024x = r3
                r6.f73025y = r3
                r6.f73023w = r5
                java.lang.Object r7 = ec3.AbstractC13091v.m36613w(r0, r7, r6)
                if (r7 != r2) goto L4b
                goto L4a
            L3e:
                r6.f73024x = r3
                r6.f73025y = r3
                r6.f73023w = r4
                java.lang.Object r7 = r0.emit(r1, r6)
                if (r7 != r2) goto L4b
            L4a:
                return r2
            L4b:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C18641r.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: il1.r$h */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeFeedDomainInteractor$interact$3$2", m100430f = "HomeFeedDomainInteractor.kt", m100431l = {133}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lil1/r$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f73027w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f73028x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ b f73029y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f73029y = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f73029y, interfaceC30057d);
            hVar.f73028x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f73028x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f73027w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                b bVar = this.f73029y;
                this.f73028x = null;
                this.f73027w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: il1.r$i */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeFeedDomainInteractor$interact$4", m100430f = "HomeFeedDomainInteractor.kt", m100431l = {150, 151, 154, 156, 163}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lil1/v;", "result", "Lil1/r$b;", "internalState", "<anonymous>", "(Lil1/v;Lil1/r$b;)Lil1/v;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        Object f73031w;

        /* JADX INFO: renamed from: x */
        int f73032x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f73033y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f73034z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC18645v abstractC18645v, b bVar, InterfaceC30057d<? super AbstractC18645v> interfaceC30057d) {
            i iVar = C18641r.this.new i(interfaceC30057d);
            iVar.f73033y = abstractC18645v;
            iVar.f73034z = bVar;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:86:0x01a4 A[PHI: r4
          0x01a4: PHI (r4v47 xl1.c) = (r4v29 xl1.c), (r4v46 xl1.c), (r4v58 xl1.c) binds: [B:79:0x0170, B:84:0x01a0, B:14:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:89:0x01c4 A[PHI: r4
          0x01c4: PHI (r4v48 xl1.c) = (r4v47 xl1.c), (r4v60 xl1.c) binds: [B:87:0x01c1, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:92:0x01ee  */
        /* JADX WARN: Code duplicated, block: B:95:0x0201  */
        /* JADX WARN: Code duplicated, block: B:98:0x020c  */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x021a, code lost:
        
            if (r4.mo34142q(r5, r22) == r3) goto L101;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 793
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C18641r.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: il1.r$j */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f73035w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC18644u.c f73036x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C18641r f73037y;

        /* JADX INFO: renamed from: il1.r$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f73038w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC18644u.c f73039x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C18641r f73040y;

            /* JADX INFO: renamed from: il1.r$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeFeedDomainInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "HomeFeedDomainInteractor.kt", m100431l = {74, 86, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41755a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f73041E;

                /* JADX INFO: renamed from: F */
                Object f73042F;

                /* JADX INFO: renamed from: G */
                Object f73043G;

                /* JADX INFO: renamed from: H */
                Object f73044H;

                /* JADX INFO: renamed from: I */
                Object f73045I;

                /* JADX INFO: renamed from: J */
                Object f73046J;

                /* JADX INFO: renamed from: K */
                Object f73047K;

                /* JADX INFO: renamed from: L */
                Object f73048L;

                /* JADX INFO: renamed from: M */
                int f73049M;

                /* JADX INFO: renamed from: N */
                int f73050N;

                /* JADX INFO: renamed from: O */
                int f73051O;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f73052w;

                /* JADX INFO: renamed from: x */
                int f73053x;

                /* JADX INFO: renamed from: y */
                Object f73054y;

                public C41755a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f73052w = obj;
                    this.f73053x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC18644u.c cVar, C18641r c18641r) {
                this.f73038w = interfaceC13062m;
                this.f73039x = cVar;
                this.f73040y = c18641r;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0130, code lost:
            
                if (r6.m53985r(r4, r2) == r3) goto L55;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x0134, code lost:
            
                r7 = r1;
                r6 = r9;
                r4 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0192, code lost:
            
                if (r4.m53985r(r7, r2) == r3) goto L55;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x01af, code lost:
            
                if (r1.emit(r6, r2) == r3) goto L55;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r19, q83.InterfaceC30057d r20) {
                /*
                    Method dump skipped, instruction units count: 443
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: il1.C18641r.j.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public j(InterfaceC13058l interfaceC13058l, AbstractC18644u.c cVar, C18641r c18641r) {
            this.f73035w = interfaceC13058l;
            this.f73036x = cVar;
            this.f73037y = c18641r;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f73035w.collect(new a(interfaceC13062m, this.f73036x, this.f73037y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: il1.r$k */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f73056w;

        /* JADX INFO: renamed from: il1.r$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f73057w;

            /* JADX INFO: renamed from: il1.r$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeFeedDomainInteractor$interact$lambda$1$$inlined$filterIsInstance$1$2", m100430f = "HomeFeedDomainInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41756a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f73059F;

                /* JADX INFO: renamed from: G */
                Object f73060G;

                /* JADX INFO: renamed from: H */
                int f73061H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f73062w;

                /* JADX INFO: renamed from: x */
                int f73063x;

                /* JADX INFO: renamed from: y */
                Object f73064y;

                /* JADX INFO: renamed from: z */
                Object f73065z;

                public C41756a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f73062w = obj;
                    this.f73063x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f73057w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41756a c41756a;
                if (interfaceC30057d instanceof C41756a) {
                    c41756a = (C41756a) interfaceC30057d;
                    int i13 = c41756a.f73063x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41756a.f73063x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41756a = new C41756a(interfaceC30057d);
                    }
                } else {
                    c41756a = new C41756a(interfaceC30057d);
                }
                Object obj2 = c41756a.f73062w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41756a.f73063x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f73057w;
                    if (obj instanceof AbstractC18644u.b) {
                        c41756a.f73064y = null;
                        c41756a.f73065z = null;
                        c41756a.f73059F = null;
                        c41756a.f73060G = null;
                        c41756a.f73061H = 0;
                        c41756a.f73063x = 1;
                        if (interfaceC13062m.emit(obj, c41756a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public k(InterfaceC13058l interfaceC13058l) {
            this.f73056w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f73056w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: il1.r$l */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f73066w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ b f73067x;

        /* JADX INFO: renamed from: il1.r$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f73068w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ b f73069x;

            /* JADX INFO: renamed from: il1.r$l$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeFeedDomainInteractor$interact$lambda$1$$inlined$map$1$2", m100430f = "HomeFeedDomainInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41757a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f73070E;

                /* JADX INFO: renamed from: F */
                Object f73071F;

                /* JADX INFO: renamed from: G */
                Object f73072G;

                /* JADX INFO: renamed from: H */
                int f73073H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f73074w;

                /* JADX INFO: renamed from: x */
                int f73075x;

                /* JADX INFO: renamed from: y */
                Object f73076y;

                public C41757a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f73074w = obj;
                    this.f73075x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, b bVar) {
                this.f73068w = interfaceC13062m;
                this.f73069x = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41757a c41757a;
                if (interfaceC30057d instanceof C41757a) {
                    c41757a = (C41757a) interfaceC30057d;
                    int i13 = c41757a.f73075x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41757a.f73075x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41757a = new C41757a(interfaceC30057d);
                    }
                } else {
                    c41757a = new C41757a(interfaceC30057d);
                }
                Object obj2 = c41757a.f73074w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41757a.f73075x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f73068w;
                    a internalAction = this.f73069x.getInternalAction();
                    EnumC14603g pillarType = ((AbstractC18644u.b) obj).getPillarType();
                    if (pillarType == null) {
                        pillarType = EnumC14603g.OVERVIEW;
                    }
                    b bVar = new b(internalAction, pillarType);
                    c41757a.f73076y = null;
                    c41757a.f73070E = null;
                    c41757a.f73071F = null;
                    c41757a.f73072G = null;
                    c41757a.f73073H = 0;
                    c41757a.f73075x = 1;
                    if (interfaceC13062m.emit(bVar, c41757a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public l(InterfaceC13058l interfaceC13058l, b bVar) {
            this.f73066w = interfaceC13058l;
            this.f73067x = bVar;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f73066w.collect(new a(interfaceC13062m, this.f73067x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: il1.r$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeFeedDomainInteractor$performAction$1", m100430f = "HomeFeedDomainInteractor.kt", m100431l = {207}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lqw2/b;", "", "e", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f73078w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f73079x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f73080y;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            m mVar = C18641r.this.new m(interfaceC30057d);
            mVar.f73079x = interfaceC13062m;
            mVar.f73080y = th3;
            return mVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f73079x;
            Throwable th3 = (Throwable) this.f73080y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f73078w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C18641r.this.logger.mo85222m(AbstractC11266d.m30461o("Failed to perform action: ", th3.getMessage()), new AbstractC30556a.a[0]);
                String message = th3.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AbstractC30694b.a aVar = new AbstractC30694b.a(message, null, null, 6, null);
                this.f73079x = null;
                this.f73080y = null;
                this.f73078w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: il1.r$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.HomeFeedDomainInteractor$performAction$2", m100430f = "HomeFeedDomainInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lqw2/b;", "state", "Lec3/l;", "", "<anonymous>", "(Lqw2/b;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f73082w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f73083x;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            n nVar = new n(interfaceC30057d);
            nVar.f73083x = obj;
            return nVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC30694b abstractC30694b, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((n) create(abstractC30694b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC30694b abstractC30694b = (AbstractC30694b) this.f73083x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f73082w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if ((abstractC30694b instanceof AbstractC30694b.f) || (abstractC30694b instanceof AbstractC30694b.n)) {
                return new C0456u(new AbstractC18644u.c(null, null, false, EnumC13344r.OVERRIDE, 7, null), 1);
            }
            int i13 = 2;
            EnumC14603g enumC14603g = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if ((abstractC30694b instanceof AbstractC30694b.c) || (abstractC30694b instanceof AbstractC30694b.i)) {
                return new C0456u(new b(a.c.f72994a, objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0), 1);
            }
            if (!(abstractC30694b instanceof AbstractC30694b.a)) {
                return C13054k.f45116w;
            }
            return new C0456u(new b(new a.C41753a(null, null, null, AbstractC39414r.m125876U(((AbstractC30694b.a) abstractC30694b).getMessage(), "network", true), 7, null), enumC14603g, i13, objArr3 == true ? 1 : 0), 1);
        }
    }

    public C18641r(InterfaceC34116n logger, InterfaceC26834e cachedApiSource, C38452b journalDomainInteractor, C18635l actionReducer, C30695c actionInteractor, FeatureFlagChecker featureFlagChecker, InterfaceC33704b whoopStrapProxy, C29380c notificationsCenterRefreshHook, C11111c weeklyPlanHomeTileRefreshHook, C14747d journalHomeTileRefreshHook, C37378a scopeCoordinator, InterfaceC21030c metricsInteractor, C15967b homeAnalyticsHelper, InterfaceC12251g globalCoachManager) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(journalDomainInteractor, "journalDomainInteractor");
        AbstractC22676k.m65750j(actionReducer, "actionReducer");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(notificationsCenterRefreshHook, "notificationsCenterRefreshHook");
        AbstractC22676k.m65750j(weeklyPlanHomeTileRefreshHook, "weeklyPlanHomeTileRefreshHook");
        AbstractC22676k.m65750j(journalHomeTileRefreshHook, "journalHomeTileRefreshHook");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(metricsInteractor, "metricsInteractor");
        AbstractC22676k.m65750j(homeAnalyticsHelper, "homeAnalyticsHelper");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        this.logger = logger;
        this.cachedApiSource = cachedApiSource;
        this.journalDomainInteractor = journalDomainInteractor;
        this.actionReducer = actionReducer;
        this.actionInteractor = actionInteractor;
        this.featureFlagChecker = featureFlagChecker;
        this.whoopStrapProxy = whoopStrapProxy;
        this.notificationsCenterRefreshHook = notificationsCenterRefreshHook;
        this.weeklyPlanHomeTileRefreshHook = weeklyPlanHomeTileRefreshHook;
        this.journalHomeTileRefreshHook = journalHomeTileRefreshHook;
        this.scopeCoordinator = scopeCoordinator;
        this.metricsInteractor = metricsInteractor;
        this.homeAnalyticsHelper = homeAnalyticsHelper;
        this.globalCoachManager = globalCoachManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m53983o(AbstractC18644u.c domainAction) {
        return AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new HomeGetRequest(AbstractC22676k.m65745e(domainAction.getRequestDate(), LocalDate.now()) ? null : domainAction.getRequestDate(), this.whoopStrapProxy.getBatteryLevel().getUserDisplayPercent()), 1), AbstractC25260n.m74059b1(new String[]{SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE, "home"}), null, 2, null), new c(null, this.cachedApiSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC13058l m53984q(AbstractC18644u.a action) {
        return AbstractC13091v.m36578D(new n(null), new C13015a0(this.actionInteractor.interact(new C0456u(new C30698f(action.getAction()), 1)), new m(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final Object m53985r(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_SERVICE_MOBILE_METRIC);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zIsFeatureEnabled) {
            Object objMo58700a = this.metricsInteractor.mo58700a(new C22047a(0, i13 == 200 ? "whoop.home_get_request_parse_error" : "whoop.home_get_request_failure", null, C25271y.f99162w, null, 21, null), interfaceC30057d);
            if (objMo58700a == EnumC31071a.f128113w) {
                return objMo58700a;
            }
        }
        return c23454a0;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC18645v.b.f73163a, AbstractC13091v.m36590P(AbstractC13091v.m36590P(new d(AbstractC13091v.m36590P(this.actionReducer.m53927e(upstream), new g(null))), new e(null, this)), new f(null, upstream)), new i(null));
    }

    /* JADX INFO: renamed from: n */
    public final Object m53986n(HomeBffFeedResponse homeBffFeedResponse, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Pillars pillars;
        DesignSystemModel designSystemModel;
        String path;
        Object objM42283b;
        List<ComponentItems> componentSections;
        Object next;
        List<Pillars> pillars2;
        Object next2;
        if (homeBffFeedResponse == null || (pillars2 = homeBffFeedResponse.getPillars()) == null) {
            pillars = null;
        } else {
            Iterator<T> it = pillars2.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!AbstractC22676k.m65745e(((Pillars) next2).getPillarType(), "OVERVIEW"));
            pillars = (Pillars) next2;
        }
        if (pillars == null || (componentSections = pillars.getComponentSections()) == null) {
            designSystemModel = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it3 = componentSections.iterator();
            while (it3.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, ((ComponentItems) it3.next()).getItems());
            }
            Iterator it4 = arrayList.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!(((DesignSystemModel) next) instanceof JournalHomeTileWrapperModel));
            designSystemModel = (DesignSystemModel) next;
        }
        JournalHomeTileWrapperModel journalHomeTileWrapperModel = designSystemModel instanceof JournalHomeTileWrapperModel ? (JournalHomeTileWrapperModel) designSystemModel : null;
        return (journalHomeTileWrapperModel == null || (path = journalHomeTileWrapperModel.getPath()) == null || (objM42283b = this.journalHomeTileRefreshHook.m42283b(path, interfaceC30057d)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objM42283b;
    }

    /* JADX INFO: renamed from: p */
    public final HomeBffFeedResponse m53987p(boolean useLoadingFix, HomeBffFeedResponse cacheResponse, AbstractC18645v previousResult) {
        AbstractC22676k.m65750j(previousResult, "previousResult");
        if (useLoadingFix) {
            return cacheResponse;
        }
        if (previousResult instanceof AbstractC18645v.c) {
            return ((AbstractC18645v.c) previousResult).getBffFeed();
        }
        if (previousResult instanceof AbstractC18645v.d) {
            return ((AbstractC18645v.d) previousResult).getBffFeed();
        }
        return null;
    }
}
