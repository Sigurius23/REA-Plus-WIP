package pg2;

import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.mapbox.common.logger.LogPriority;
import com.whoop.addactivity.network.model.ScoreType;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gi1.AbstractC15893c;
import gi1.C15892b;
import gi1.InterfaceC15891a;
import gi1.InterfaceC15894d;
import ha0.C17051d;
import ha0.C17055h;
import ia0.C18292a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import l83.C23471q;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import ng2.C26682a;
import od1.InterfaceC27844g;
import og2.AbstractC27921b;
import og2.C27920a;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tg2.AbstractC33797k;
import y00.AbstractC38963t7;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: pg2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\"\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b(\u0010)J)\u0010+\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b+\u0010,J7\u0010-\u001a\u0004\u0018\u00010\u001e2\b\u0010*\u001a\u0004\u0018\u00010\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019H\u0002¢\u0006\u0004\b-\u0010.J7\u00102\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b2\u00103J#\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b5\u00106J3\u00109\u001a\u0004\u0018\u00010\u001e2\b\u0010*\u001a\u0004\u0018\u00010\u001e2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00192\b\u00108\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, m65681d2 = {"Lpg2/d;", "Lod1/g;", "Lpg2/b;", "Lpg2/c;", "Lia0/a;", "activityTypesRepository", "Lgi1/b;", "gpsPermissionHelper", "Lng2/a;", "preSessionGpsFineLocationPermissionStore", "Ljs0/c;", "configurationRepository", "<init>", "(Lia0/a;Lgi1/b;Lng2/a;Ljs0/c;)V", "action", "m", "(Lpg2/b;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lpg2/d$a;", "l", "()Lec3/l;", "previous", "internal", "o", "(Lpg2/c;Lpg2/d$a;Lq83/d;)Ljava/lang/Object;", "", "Lha0/d;", "allActivities", "Lha0/h;", "recentDtos", "", "mostPopularWhoopDefaults", "", "hasRequestedFineLocationBefore", "k", "(Lpg2/c;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)Lpg2/c;", "Lpg2/b$f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lpg2/c;Lpg2/b$f;)Lpg2/c;", "state", "i", "(Lpg2/c;Z)Lpg2/c;", "selectedInternalName", "j", "(Lpg2/c;Ljava/lang/String;Z)Lpg2/c;", "q", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;", "isEnabled", "shouldShowPermissionRationale", "hasFineLocationPermission", "n", "(Lpg2/c;ZZZZ)Lpg2/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "visibleRow", "currentPin", "p", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "a", "Lia0/a;", "b", "Lgi1/b;", "c", "Lng2/a;", "d", "Ljs0/c;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29169d implements InterfaceC27844g<InterfaceC29167b, C29168c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C18292a activityTypesRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C15892b gpsPermissionHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C26682a preSessionGpsFineLocationPermissionStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: pg2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lpg2/d$a;", "", "a", "b", "Lpg2/d$a$a;", "Lpg2/d$a$b;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: pg2.d$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lpg2/d$a$a;", "Lpg2/d$a;", "", "Lha0/d;", "allActivities", "Lha0/h;", "recentDtos", "", "mostPopularWhoopDefaults", "", "hasRequestedFineLocationBefore", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "d", "c", "Z", "()Z", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42165a implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final List<C17051d> allActivities;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final List<C17055h> recentDtos;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final List<String> mostPopularWhoopDefaults;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final boolean hasRequestedFineLocationBefore;

            public C42165a(List<C17051d> allActivities, List<C17055h> recentDtos, List<String> mostPopularWhoopDefaults, boolean z4) {
                AbstractC22676k.m65750j(allActivities, "allActivities");
                AbstractC22676k.m65750j(recentDtos, "recentDtos");
                AbstractC22676k.m65750j(mostPopularWhoopDefaults, "mostPopularWhoopDefaults");
                this.allActivities = allActivities;
                this.recentDtos = recentDtos;
                this.mostPopularWhoopDefaults = mostPopularWhoopDefaults;
                this.hasRequestedFineLocationBefore = z4;
            }

            /* JADX INFO: renamed from: a */
            public final List<C17051d> m88659a() {
                return this.allActivities;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getHasRequestedFineLocationBefore() {
                return this.hasRequestedFineLocationBefore;
            }

            /* JADX INFO: renamed from: c */
            public final List<String> m88661c() {
                return this.mostPopularWhoopDefaults;
            }

            /* JADX INFO: renamed from: d */
            public final List<C17055h> m88662d() {
                return this.recentDtos;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C42165a)) {
                    return false;
                }
                C42165a c42165a = (C42165a) other;
                return AbstractC22676k.m65745e(this.allActivities, c42165a.allActivities) && AbstractC22676k.m65745e(this.recentDtos, c42165a.recentDtos) && AbstractC22676k.m65745e(this.mostPopularWhoopDefaults, c42165a.mostPopularWhoopDefaults) && this.hasRequestedFineLocationBefore == c42165a.hasRequestedFineLocationBefore;
            }

            public int hashCode() {
                return Boolean.hashCode(this.hasRequestedFineLocationBefore) + AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.allActivities.hashCode() * 31, 31, this.recentDtos), 31, this.mostPopularWhoopDefaults);
            }

            public String toString() {
                List<C17051d> list = this.allActivities;
                List<C17055h> list2 = this.recentDtos;
                List<String> list3 = this.mostPopularWhoopDefaults;
                boolean z4 = this.hasRequestedFineLocationBefore;
                StringBuilder sbM124380j = AbstractC38963t7.m124380j("CatalogReady(allActivities=", ", recentDtos=", list, ", mostPopularWhoopDefaults=", list2);
                sbM124380j.append(list3);
                sbM124380j.append(", hasRequestedFineLocationBefore=");
                sbM124380j.append(z4);
                sbM124380j.append(")");
                return sbM124380j.toString();
            }
        }

        /* JADX INFO: renamed from: pg2.d$a$b */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lpg2/d$a$b;", "Lpg2/d$a;", "Lpg2/b;", "action", "<init>", "(Lpg2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpg2/b;", "()Lpg2/b;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC29167b action;

            public b(InterfaceC29167b action) {
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC29167b getAction() {
                return this.action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && AbstractC22676k.m65745e(this.action, ((b) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "UserAction(action=" + this.action + ")";
            }
        }
    }

    /* JADX INFO: renamed from: pg2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f118062w;

        /* JADX INFO: renamed from: pg2.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f118063w;

            /* JADX INFO: renamed from: pg2.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor$catalogReadyFlow$$inlined$map$1$2", m100430f = "PreSessionWidgetInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42166a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f118064E;

                /* JADX INFO: renamed from: F */
                Object f118065F;

                /* JADX INFO: renamed from: G */
                Object f118066G;

                /* JADX INFO: renamed from: H */
                int f118067H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f118068w;

                /* JADX INFO: renamed from: x */
                int f118069x;

                /* JADX INFO: renamed from: y */
                Object f118070y;

                public C42166a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f118068w = obj;
                    this.f118069x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f118063w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42166a c42166a;
                if (interfaceC30057d instanceof C42166a) {
                    c42166a = (C42166a) interfaceC30057d;
                    int i13 = c42166a.f118069x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42166a.f118069x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42166a = new C42166a(interfaceC30057d);
                    }
                } else {
                    c42166a = new C42166a(interfaceC30057d);
                }
                Object obj2 = c42166a.f118068w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42166a.f118069x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f118063w;
                    ArrayList arrayList = new ArrayList();
                    for (T t14 : (List) obj) {
                        C17055h c17055h = (C17055h) t14;
                        if (c17055h.getScoreType() != ScoreType.WEIGHTLIFTING_MSK && !AbstractC33797k.m106947a(c17055h.getInternalName())) {
                            arrayList.add(t14);
                        }
                    }
                    c42166a.f118070y = null;
                    c42166a.f118064E = null;
                    c42166a.f118065F = null;
                    c42166a.f118066G = null;
                    c42166a.f118067H = 0;
                    c42166a.f118069x = 1;
                    if (interfaceC13062m.emit(arrayList, c42166a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f118062w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f118062w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pg2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor$catalogReadyFlow$1", m100430f = "PreSessionWidgetInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m65681d2 = {"", "Lha0/d;", "all", "Lha0/h;", "recent", "", "defaults", "Ll83/q;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ll83/q;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        int f118072w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f118073x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f118074y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f118075z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(4, interfaceC30057d);
        }

        @Override // c93.InterfaceC4352n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<C17051d> list, List<C17055h> list2, List<String> list3, InterfaceC30057d<? super C23471q> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f118073x = list;
            cVar.f118074y = list2;
            cVar.f118075z = list3;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f118073x;
            List list2 = (List) this.f118074y;
            List list3 = (List) this.f118075z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f118072w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C23471q(list, list2, list3);
        }
    }

    /* JADX INFO: renamed from: pg2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor$catalogReadyFlow$2", m100430f = "PreSessionWidgetInteractor.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062*\u0010\u0005\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Ll83/q;", "", "Lha0/d;", "Lha0/h;", "", "<destruct>", "Lpg2/d$a$a;", "<anonymous>", "(Ll83/q;)Lpg2/d$a$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f118076E;

        /* JADX INFO: renamed from: F */
        Object f118077F;

        /* JADX INFO: renamed from: G */
        int f118078G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f118079H;

        /* JADX INFO: renamed from: w */
        Object f118081w;

        /* JADX INFO: renamed from: x */
        Object f118082x;

        /* JADX INFO: renamed from: y */
        Object f118083y;

        /* JADX INFO: renamed from: z */
        Object f118084z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C29169d.this.new d(interfaceC30057d);
            dVar.f118079H = obj;
            return dVar;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List list;
            List list2;
            List list3;
            C23471q c23471q = (C23471q) this.f118079H;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f118078G;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                list = (List) c23471q.f92947w;
                List list4 = (List) c23471q.f92948x;
                list2 = (List) c23471q.f92949y;
                C26682a c26682a = C29169d.this.preSessionGpsFineLocationPermissionStore;
                this.f118079H = null;
                this.f118081w = null;
                this.f118082x = null;
                this.f118083y = null;
                this.f118084z = list;
                this.f118076E = list4;
                this.f118077F = list2;
                this.f118078G = 1;
                Object objM79365b = c26682a.m79365b(this);
                if (objM79365b == enumC31071a) {
                    return enumC31071a;
                }
                list3 = list4;
                obj = objM79365b;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.f118077F;
                list3 = (List) this.f118076E;
                list = (List) this.f118084z;
                AbstractC34132o.m107864I(obj);
            }
            return new a.C42165a(list, list3, list2, ((Boolean) obj).booleanValue());
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C23471q c23471q, InterfaceC30057d<? super a.C42165a> interfaceC30057d) {
            return ((d) create(c23471q, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: pg2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor$catalogReadyFlow$allActivitiesFlow$1", m100430f = "PreSessionWidgetInteractor.kt", m100431l = {60, 60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "", "Lha0/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f118085w;

        /* JADX INFO: renamed from: x */
        int f118086x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f118087y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C29169d.this.new e(interfaceC30057d);
            eVar.f118087y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, (ec3.InterfaceC13058l) r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f118087y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f118086x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L4a
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f118085w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3b
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                pg2.d r7 = pg2.C29169d.this
                ia0.a r7 = pg2.C29169d.m88645d(r7)
                r6.f118087y = r5
                r6.f118085w = r0
                r6.f118086x = r4
                java.lang.Object r7 = r7.m52660e(r6)
                if (r7 != r1) goto L3b
                goto L49
            L3b:
                ec3.l r7 = (ec3.InterfaceC13058l) r7
                r6.f118087y = r5
                r6.f118085w = r5
                r6.f118086x = r3
                java.lang.Object r7 = ec3.AbstractC13091v.m36613w(r0, r7, r6)
                if (r7 != r1) goto L4a
            L49:
                return r1
            L4a:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: pg2.C29169d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: pg2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor$catalogReadyFlow$popularActivitiesFlow$1", m100430f = "PreSessionWidgetInteractor.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f118089w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f118090x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C29169d.this.new f(interfaceC30057d);
            fVar.f118090x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0054  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM125868N0;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f118090x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f118089w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC21909c abstractC21909c = C29169d.this.configurationRepository;
                C27920a c27920a = C27920a.f112615a;
                C21908b configurations = abstractC21909c.getConfigurations();
                String name = c27920a.getName();
                Object defaultValue = c27920a.getDefaultValue();
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    String str = (String) configurations.get(name);
                    if (str != null) {
                        objM125868N0 = AbstractC39421y.m125932Q(str);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    String str2 = (String) configurations.get(name);
                    if (str2 != null) {
                        objM125868N0 = AbstractC39421y.m125933R(str2);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    String str3 = (String) configurations.get(name);
                    if (str3 != null) {
                        objM125868N0 = AbstractC39420x.m125915y(str3);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    String str4 = (String) configurations.get(name);
                    if (str4 != null) {
                        objM125868N0 = AbstractC39420x.m125914x(str4);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                    String str5 = (String) configurations.get(name);
                    if (str5 != null) {
                        objM125868N0 = AbstractC39414r.m125868N0(str5);
                    } else {
                        objM125868N0 = null;
                    }
                } else {
                    objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
                }
                if (objM125868N0 != null) {
                    defaultValue = objM125868N0;
                }
                if (defaultValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                List<String> listM84259a = AbstractC27921b.m84259a((String) defaultValue);
                this.f118090x = null;
                this.f118089w = 1;
                if (interfaceC13062m.emit(listM84259a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pg2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor$catalogReadyFlow$recentActivitiesFlow$1", m100430f = "PreSessionWidgetInteractor.kt", m100431l = {61, 61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "", "Lha0/h;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f118092w;

        /* JADX INFO: renamed from: x */
        int f118093x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f118094y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C29169d.this.new g(interfaceC30057d);
            gVar.f118094y = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, (ec3.InterfaceC13058l) r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f118094y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f118093x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L4a
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f118092w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3b
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                pg2.d r7 = pg2.C29169d.this
                ia0.a r7 = pg2.C29169d.m88645d(r7)
                r6.f118094y = r5
                r6.f118092w = r0
                r6.f118093x = r4
                java.lang.Object r7 = r7.m52662g(r6)
                if (r7 != r1) goto L3b
                goto L49
            L3b:
                ec3.l r7 = (ec3.InterfaceC13058l) r7
                r6.f118094y = r5
                r6.f118092w = r5
                r6.f118093x = r3
                java.lang.Object r7 = ec3.AbstractC13091v.m36613w(r0, r7, r6)
                if (r7 != r1) goto L4a
            L49:
                return r1
            L4a:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: pg2.C29169d.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: pg2.d$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor", m100430f = "PreSessionWidgetInteractor.kt", m100431l = {47, 51}, m100432m = "enrichAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f118096E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f118097F;

        /* JADX INFO: renamed from: H */
        int f118099H;

        /* JADX INFO: renamed from: w */
        Object f118100w;

        /* JADX INFO: renamed from: x */
        Object f118101x;

        /* JADX INFO: renamed from: y */
        int f118102y;

        /* JADX INFO: renamed from: z */
        int f118103z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f118097F = obj;
            this.f118099H |= Integer.MIN_VALUE;
            return C29169d.this.m88654m(null, this);
        }
    }

    /* JADX INFO: renamed from: pg2.d$i */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f118104w;

        /* JADX INFO: renamed from: pg2.d$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f118105w;

            /* JADX INFO: renamed from: pg2.d$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor$interact$$inlined$map$1$2", m100430f = "PreSessionWidgetInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42167a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f118106E;

                /* JADX INFO: renamed from: F */
                Object f118107F;

                /* JADX INFO: renamed from: G */
                Object f118108G;

                /* JADX INFO: renamed from: H */
                int f118109H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f118110w;

                /* JADX INFO: renamed from: x */
                int f118111x;

                /* JADX INFO: renamed from: y */
                Object f118112y;

                public C42167a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f118110w = obj;
                    this.f118111x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f118105w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42167a c42167a;
                if (interfaceC30057d instanceof C42167a) {
                    c42167a = (C42167a) interfaceC30057d;
                    int i13 = c42167a.f118111x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42167a.f118111x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42167a = new C42167a(interfaceC30057d);
                    }
                } else {
                    c42167a = new C42167a(interfaceC30057d);
                }
                Object obj2 = c42167a.f118110w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42167a.f118111x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f118105w;
                    a.b bVar = new a.b((InterfaceC29167b) obj);
                    c42167a.f118112y = null;
                    c42167a.f118106E = null;
                    c42167a.f118107F = null;
                    c42167a.f118108G = null;
                    c42167a.f118109H = 0;
                    c42167a.f118111x = 1;
                    if (interfaceC13062m.emit(bVar, c42167a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l) {
            this.f118104w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f118104w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pg2.d$j */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class j extends C22672i implements Function3 {
        public j(Object obj) {
            super(3, 0, C29169d.class, obj, "reduceInternal", "reduceInternal(Lcom/whoop/startactivity/presession/domain/PreSessionWidgetDomainState;Lcom/whoop/startactivity/presession/domain/PreSessionWidgetInteractor$Internal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C29168c c29168c, a aVar, InterfaceC30057d<? super C29168c> interfaceC30057d) {
            return ((C29169d) this.receiver).m88656o(c29168c, aVar, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: pg2.d$k */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor$interact$userActions$1", m100430f = "PreSessionWidgetInteractor.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg2/b;", "it", "<anonymous>", "(Lpg2/b;)Lpg2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f118114w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f118115x;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k kVar = C29169d.this.new k(interfaceC30057d);
            kVar.f118115x = obj;
            return kVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC29167b interfaceC29167b, InterfaceC30057d<? super InterfaceC29167b> interfaceC30057d) {
            return ((k) create(interfaceC29167b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC29167b interfaceC29167b = (InterfaceC29167b) this.f118115x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f118114w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C29169d c29169d = C29169d.this;
            this.f118115x = null;
            this.f118114w = 1;
            Object objM88654m = c29169d.m88654m(interfaceC29167b, this);
            return objM88654m == enumC31071a ? enumC31071a : objM88654m;
        }
    }

    /* JADX INFO: renamed from: pg2.d$l */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.domain.PreSessionWidgetInteractor", m100430f = "PreSessionWidgetInteractor.kt", m100431l = {LogPriority.NONE}, m100432m = "reduceInternal", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f118117E;

        /* JADX INFO: renamed from: F */
        Object f118118F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f118119G;

        /* JADX INFO: renamed from: I */
        int f118121I;

        /* JADX INFO: renamed from: w */
        Object f118122w;

        /* JADX INFO: renamed from: x */
        Object f118123x;

        /* JADX INFO: renamed from: y */
        Object f118124y;

        /* JADX INFO: renamed from: z */
        Object f118125z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f118119G = obj;
            this.f118121I |= Integer.MIN_VALUE;
            return C29169d.this.m88656o(null, null, this);
        }
    }

    public C29169d(C18292a activityTypesRepository, C15892b gpsPermissionHelper, C26682a preSessionGpsFineLocationPermissionStore, AbstractC21909c configurationRepository) {
        AbstractC22676k.m65750j(activityTypesRepository, "activityTypesRepository");
        AbstractC22676k.m65750j(gpsPermissionHelper, "gpsPermissionHelper");
        AbstractC22676k.m65750j(preSessionGpsFineLocationPermissionStore, "preSessionGpsFineLocationPermissionStore");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        this.activityTypesRepository = activityTypesRepository;
        this.gpsPermissionHelper = gpsPermissionHelper;
        this.preSessionGpsFineLocationPermissionStore = preSessionGpsFineLocationPermissionStore;
        this.configurationRepository = configurationRepository;
    }

    /* JADX INFO: renamed from: h */
    private final C29168c m88649h(C29168c previous, InterfaceC29167b.f action) {
        if (action.getIsEnabled()) {
            return C29168c.m88630b(previous, false, null, true, true, false, null, false, null, null, null, null, null, 4083, null);
        }
        return AbstractC39414r.m125890i0(action.getBffSelectedInternalName()) ? previous : C29168c.m88630b(previous, false, null, false, true, false, null, false, null, null, null, null, null, 4083, null);
    }

    /* JADX INFO: renamed from: i */
    private final C29168c m88650i(C29168c state, boolean hasRequestedFineLocationBefore) {
        String selectedInternalName;
        C17051d c17051d;
        if (!state.getIsGpsUserResolved() && (selectedInternalName = state.getSelectedInternalName()) != null && (c17051d = state.m88632c().get(selectedInternalName)) != null && c17051d.getHasGps()) {
            return m88655n(state, true, false, this.gpsPermissionHelper.m44826b(), hasRequestedFineLocationBefore);
        }
        return state;
    }

    /* JADX INFO: renamed from: j */
    private final C29168c m88651j(C29168c previous, String selectedInternalName, boolean hasRequestedFineLocationBefore) {
        if (selectedInternalName != null) {
            String str = !AbstractC39414r.m125890i0(selectedInternalName) ? selectedInternalName : null;
            if (str != null) {
                String strM88658p = m88658p(str, previous.m88633d(), previous.getSessionPinnedInternalName());
                C29168c c29168cM88630b = C29168c.m88630b(previous, false, str, false, false, false, null, false, null, strM88658p, null, null, C29166a.f118028a.m88618a(previous.m88636g(), previous.m88635f(), strM88658p, previous.m88632c().keySet()), 1789, null);
                return c29168cM88630b.getIsLoading() ? c29168cM88630b : m88650i(c29168cM88630b, hasRequestedFineLocationBefore);
            }
        }
        return previous;
    }

    /* JADX INFO: renamed from: k */
    private final C29168c m88652k(C29168c previous, List<C17051d> allActivities, List<C17055h> recentDtos, List<String> mostPopularWhoopDefaults, boolean hasRequestedFineLocationBefore) {
        List<C17051d> list = allActivities;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : list) {
            linkedHashMap.put(((C17051d) obj).getInternalName(), obj);
        }
        C17051d c17051d = (C17051d) linkedHashMap.get(m88657q(previous.getSelectedInternalName(), recentDtos, mostPopularWhoopDefaults));
        C29166a c29166a = C29166a.f118028a;
        List<String> listM88618a = c29166a.m88618a(recentDtos, mostPopularWhoopDefaults, previous.getSessionPinnedInternalName(), linkedHashMap.keySet());
        String strM88658p = m88658p(c17051d != null ? c17051d.getInternalName() : null, listM88618a, previous.getSessionPinnedInternalName());
        if (!AbstractC22676k.m65745e(strM88658p, previous.getSessionPinnedInternalName())) {
            listM88618a = c29166a.m88618a(recentDtos, mostPopularWhoopDefaults, strM88658p, linkedHashMap.keySet());
        }
        C29168c c29168cM88630b = C29168c.m88630b(previous, false, c17051d != null ? c17051d.getInternalName() : null, false, false, false, null, false, linkedHashMap, strM88658p, recentDtos, mostPopularWhoopDefaults, listM88618a, 124, null);
        return !previous.getIsLoading() ? c29168cM88630b : m88650i(c29168cM88630b, hasRequestedFineLocationBefore);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m88653l() {
        return AbstractC13091v.m36583I(new d(null), AbstractC13091v.m36606p(new C13084s1(new e(null)), new b(new C13084s1(new g(null))), new C13084s1(new f(null)), new c(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m88654m(InterfaceC29167b interfaceC29167b, InterfaceC30057d<? super InterfaceC29167b> interfaceC30057d) {
        h hVar;
        InterfaceC29167b.g gVar;
        boolean zM44826b;
        int i13;
        int i14;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i15 = hVar.f118099H;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                hVar.f118099H = i15 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objM79365b = hVar.f118097F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = hVar.f118099H;
        if (i16 == 0) {
            AbstractC34132o.m107864I(objM79365b);
            if (!(interfaceC29167b instanceof InterfaceC29167b.g)) {
                if (interfaceC29167b instanceof InterfaceC29167b.d) {
                    C26682a c26682a = this.preSessionGpsFineLocationPermissionStore;
                    hVar.f118100w = interfaceC29167b;
                    hVar.f118099H = 2;
                    if (c26682a.m79366c(hVar) == enumC31071a) {
                    }
                }
                return interfaceC29167b;
            }
            gVar = (InterfaceC29167b.g) interfaceC29167b;
            zM44826b = this.gpsPermissionHelper.m44826b();
            C26682a c26682a2 = this.preSessionGpsFineLocationPermissionStore;
            hVar.f118100w = null;
            hVar.f118101x = gVar;
            hVar.f118102y = 0;
            hVar.f118103z = 0;
            hVar.f118096E = zM44826b;
            hVar.f118099H = 1;
            objM79365b = c26682a2.m79365b(hVar);
            if (objM79365b != enumC31071a) {
                i13 = 0;
                i14 = 0;
            }
            return enumC31071a;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC29167b interfaceC29167b2 = (InterfaceC29167b) hVar.f118100w;
            AbstractC34132o.m107864I(objM79365b);
            return interfaceC29167b2;
        }
        zM44826b = hVar.f118096E;
        i13 = hVar.f118103z;
        i14 = hVar.f118102y;
        gVar = (InterfaceC29167b.g) hVar.f118101x;
        AbstractC34132o.m107864I(objM79365b);
        return InterfaceC29167b.g.m88623b(gVar, i14 != 0, i13 != 0, zM44826b, ((Boolean) objM79365b).booleanValue(), 3, null);
    }

    /* JADX INFO: renamed from: n */
    private final C29168c m88655n(C29168c state, boolean isEnabled, boolean shouldShowPermissionRationale, boolean hasFineLocationPermission, boolean hasRequestedFineLocationBefore) {
        InterfaceC15894d interfaceC15894dM44827a = AbstractC15893c.m44827a(isEnabled, hasFineLocationPermission, hasRequestedFineLocationBefore, shouldShowPermissionRationale);
        if (AbstractC22676k.m65745e(interfaceC15894dM44827a, InterfaceC15894d.b.f60017a)) {
            return C29168c.m88630b(state, false, null, true, true, false, null, false, null, null, null, null, null, 4035, null);
        }
        if (AbstractC22676k.m65745e(interfaceC15894dM44827a, InterfaceC15894d.a.f60016a)) {
            return C29168c.m88630b(state, false, null, false, true, false, null, false, null, null, null, null, null, 4035, null);
        }
        if (AbstractC22676k.m65745e(interfaceC15894dM44827a, InterfaceC15894d.d.f60019a)) {
            return C29168c.m88630b(state, false, null, false, true, true, InterfaceC15891a.b.f60013a, false, null, null, null, null, null, 4039, null);
        }
        if (AbstractC22676k.m65745e(interfaceC15894dM44827a, InterfaceC15894d.c.f60018a)) {
            return C29168c.m88630b(state, false, null, false, true, false, null, true, null, null, null, null, null, 3971, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: o */
    public final Object m88656o(C29168c c29168c, a aVar, InterfaceC30057d<? super C29168c> interfaceC30057d) {
        l lVar;
        C29168c c29168c2;
        String selectedInternalName;
        Object objM79365b;
        C29169d c29169d;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f118121I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f118121I = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        Object obj = lVar.f118119G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = lVar.f118121I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (aVar instanceof a.C42165a) {
                a.C42165a c42165a = (a.C42165a) aVar;
                return m88652k(c29168c, c42165a.m88659a(), c42165a.m88662d(), c42165a.m88661c(), c42165a.getHasRequestedFineLocationBefore());
            }
            c29168c2 = c29168c;
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC29167b action = ((a.b) aVar).getAction();
            if (!(action instanceof InterfaceC29167b.h)) {
                if (action instanceof InterfaceC29167b.f) {
                    return m88649h(c29168c2, (InterfaceC29167b.f) action);
                }
                if (action instanceof InterfaceC29167b.g) {
                    InterfaceC29167b.g gVar = (InterfaceC29167b.g) action;
                    return m88655n(c29168c2, gVar.getIsEnabled(), gVar.getShouldShowPermissionRationale(), gVar.getHasFineLocationPermission(), gVar.getHasRequestedFineLocationBefore());
                }
                if (action instanceof InterfaceC29167b.d) {
                    return C29168c.m88630b(c29168c, false, null, false, false, false, null, false, null, null, null, null, null, 4063, null);
                }
                if (action instanceof InterfaceC29167b.e) {
                    return C29168c.m88630b(c29168c, false, null, AbstractC22676k.m65745e(AbstractC15893c.m44828b(((InterfaceC29167b.e) action).getIsGranted()), InterfaceC15894d.b.f60017a), true, false, null, false, null, null, null, null, null, 4035, null);
                }
                if (action instanceof InterfaceC29167b.c) {
                    return C29168c.m88630b(c29168c, false, null, false, false, false, null, false, null, null, null, null, null, 4063, null);
                }
                if (action instanceof InterfaceC29167b.b) {
                    return C29168c.m88630b(c29168c, false, null, false, false, true, InterfaceC15891a.a.f60012a, false, null, null, null, null, null, 3983, null);
                }
                if (action instanceof InterfaceC29167b.a) {
                    return C29168c.m88630b(c29168c, false, null, false, false, false, null, false, null, null, null, null, null, 4015, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            selectedInternalName = ((InterfaceC29167b.h) action).getSelectedInternalName();
            C26682a c26682a = this.preSessionGpsFineLocationPermissionStore;
            lVar.f118122w = null;
            lVar.f118123x = null;
            lVar.f118124y = null;
            lVar.f118125z = this;
            lVar.f118117E = c29168c2;
            lVar.f118118F = selectedInternalName;
            lVar.f118121I = 1;
            objM79365b = c26682a.m79365b(lVar);
            if (objM79365b == enumC31071a) {
                return enumC31071a;
            }
            c29169d = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            selectedInternalName = (String) lVar.f118118F;
            C29168c c29168c3 = (C29168c) lVar.f118117E;
            C29169d c29169d2 = (C29169d) lVar.f118125z;
            AbstractC34132o.m107864I(obj);
            objM79365b = obj;
            c29168c2 = c29168c3;
            c29169d = c29169d2;
        }
        return c29169d.m88651j(c29168c2, selectedInternalName, ((Boolean) objM79365b).booleanValue());
    }

    /* JADX INFO: renamed from: q */
    private final String m88657q(String selectedInternalName, List<C17055h> recentDtos, List<String> mostPopularWhoopDefaults) {
        if (selectedInternalName != null) {
            if (AbstractC39414r.m125890i0(selectedInternalName)) {
                selectedInternalName = null;
            }
            if (selectedInternalName != null) {
                return selectedInternalName;
            }
        }
        C17055h c17055h = (C17055h) AbstractC25265s.m74100H0(recentDtos);
        return c17055h != null ? c17055h.getInternalName() : (String) AbstractC25265s.m74100H0(mostPopularWhoopDefaults);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C29168c(false, null, false, false, false, null, false, null, null, null, null, null, 4095, null), AbstractC13091v.m36584J(m88653l(), new i(AbstractC13091v.m36583I(new k(null), upstream))), new j(this));
    }

    /* JADX INFO: renamed from: p */
    public final String m88658p(String selectedInternalName, List<String> visibleRow, String currentPin) {
        AbstractC22676k.m65750j(visibleRow, "visibleRow");
        if (selectedInternalName != null) {
            if (AbstractC39414r.m125890i0(selectedInternalName)) {
                selectedInternalName = null;
            }
            if (selectedInternalName != null && !visibleRow.contains(selectedInternalName)) {
                return selectedInternalName;
            }
        }
        return currentPin;
    }
}
