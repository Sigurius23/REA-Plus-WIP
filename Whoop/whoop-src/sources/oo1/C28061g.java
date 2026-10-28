package oo1;

import ad3.AbstractC0757c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.hormonalinsights.api.DismissBody;
import com.whoop.hormonalinsights.api.HormonalInsightsApi;
import com.whoop.hormonalinsights.api.MenstrualCycleInsightsGetRequest;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CalendarTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogPeriodRequest;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MenstrualCycleInsightsResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.SymptomsScreenResponse;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.C13034f;
import ec3.C13052j1;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13026d;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import h91.C17027b;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import js0.AbstractC21909c;
import l83.C23454a0;
import m83.AbstractC25267u;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import org.joda.time.LocalDate;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wm0.C37378a;
import xm0.C38458b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: oo1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 h2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004QWUSB[\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a*\b\u0012\u0004\u0012\u00020\u001e0\u001aH\u0002¢\u0006\u0004\b \u0010\u001dJ9\u0010*\u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020%H\u0002¢\u0006\u0004\b*\u0010+J1\u00100\u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002020\u001a2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002020\u001a2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b5\u00104J#\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#060\u001a2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b7\u00104J+\u00108\u001a\u000202*\b\u0012\u0004\u0012\u00020#062\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020%H\u0002¢\u0006\u0004\b8\u00109J1\u0010;\u001a\b\u0012\u0004\u0012\u0002020\u001a2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010(\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b;\u0010<J\u0018\u0010?\u001a\u0002022\u0006\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u000202H\u0082@¢\u0006\u0004\bA\u0010BJ\u0010\u0010D\u001a\u00020CH\u0082@¢\u0006\u0004\bD\u0010BJ\u001f\u0010G\u001a\u00020,2\u0006\u0010:\u001a\u00020E2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0002¢\u0006\u0004\bI\u0010\u001dJ\u0013\u0010K\u001a\u00020'*\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ\u0013\u0010N\u001a\u00020\u0002*\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a*\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0002¢\u0006\u0004\bP\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006i"}, m65681d2 = {"Loo1/g;", "Lod1/g;", "Loo1/e;", "Loo1/f;", "Lqw2/c;", "actionInteractor", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "api", "Lnm0/e;", "cachedApiSource", "Lxm0/b;", "cacheUpdater", "Lzr2/a;", "dateAndTimeProvider", "Ltr2/n;", "logger", "Ljava/util/Locale;", "locale", "Ljs0/c;", "configurationRepository", "Lwm0/a;", "scopeCoordinator", "Lad3/c;", "json", "<init>", "(Lqw2/c;Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Lnm0/e;Lxm0/b;Lzr2/a;Ltr2/n;Ljava/util/Locale;Ljs0/c;Lwm0/a;Lad3/c;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Lqw2/a;", "Lqw2/b;", "x", "Loo1/g$c;", "accumulator", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "domainModel", "", "isLoading", "", HttpHeaders.DATE, "isPollingActive", "s", "(Loo1/g$c;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;ZLjava/lang/String;Z)Loo1/g$c;", "", "id", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;", "model", "I", "(Loo1/g$c;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;Ljava/lang/String;)Loo1/g$c;", "Loo1/g$d;", "B", "(Ljava/lang/String;)Lec3/l;", "v", "Lpm0/a;", "u", "F", "(Lpm0/a;Ljava/lang/String;Z)Loo1/g$d;", "selectedDate", "y", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "Lso1/r;", "data", "A", "(Lso1/r;Lq83/d;)Ljava/lang/Object;", "z", "(Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "t", "Ljava/time/LocalDate;", "latestMonthDate", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/time/LocalDate;Ljava/time/LocalDate;)I", "C", "Loo1/e$e;", "D", "(Loo1/e$e;)Ljava/lang/String;", "Lcom/whoop/navigation/models/GenericInteraction;", "E", "(Lcom/whoop/navigation/models/GenericInteraction;)Loo1/e;", "H", "a", "Lqw2/c;", "b", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "c", "Lnm0/e;", "d", "Lxm0/b;", "e", "Lzr2/a;", "f", "Ltr2/n;", "g", "Ljava/util/Locale;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljs0/c;", "i", "Lwm0/a;", "j", "Lad3/c;", "k", "Lec3/l;", "scopeEventsFlow", "l", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28061g implements InterfaceC27844g<AbstractC28059e, AbstractC28060f> {

    /* JADX INFO: renamed from: m */
    public static final int f113313m = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HormonalInsightsApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC13058l scopeEventsFlow;

    /* JADX INFO: renamed from: oo1.g$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, m65681d2 = {"Loo1/g$a;", "", "Loo1/e;", "action", "", "selectedDate", "<init>", "(Loo1/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loo1/e;", "()Loo1/e;", "b", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC28059e action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String selectedDate;

        public a(AbstractC28059e action, String str) {
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
            this.selectedDate = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC28059e getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSelectedDate() {
            return this.selectedDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.action, aVar.action) && AbstractC22676k.m65745e(this.selectedDate, aVar.selectedDate);
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            String str = this.selectedDate;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ActionWithDate(action=" + this.action + ", selectedDate=" + this.selectedDate + ")";
        }
    }

    /* JADX INFO: renamed from: oo1.g$a0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f113327w;

        /* JADX INFO: renamed from: oo1.g$a0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f113328w;

            /* JADX INFO: renamed from: oo1.g$a0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$saveDateForRefresh$$inlined$map$1$2", m100430f = "MciOverviewInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42128a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f113329E;

                /* JADX INFO: renamed from: F */
                Object f113330F;

                /* JADX INFO: renamed from: G */
                Object f113331G;

                /* JADX INFO: renamed from: H */
                int f113332H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f113333w;

                /* JADX INFO: renamed from: x */
                int f113334x;

                /* JADX INFO: renamed from: y */
                Object f113335y;

                public C42128a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f113333w = obj;
                    this.f113334x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f113328w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42128a c42128a;
                if (interfaceC30057d instanceof C42128a) {
                    c42128a = (C42128a) interfaceC30057d;
                    int i13 = c42128a.f113334x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42128a.f113334x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42128a = new C42128a(interfaceC30057d);
                    }
                } else {
                    c42128a = new C42128a(interfaceC30057d);
                }
                Object obj2 = c42128a.f113333w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42128a.f113334x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f113328w;
                    AbstractC28059e action = ((a) obj).getAction();
                    c42128a.f113335y = null;
                    c42128a.f113329E = null;
                    c42128a.f113330F = null;
                    c42128a.f113331G = null;
                    c42128a.f113332H = 0;
                    c42128a.f113334x = 1;
                    if (interfaceC13062m.emit(action, c42128a) == enumC31071a) {
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

        public a0(InterfaceC13058l interfaceC13058l) {
            this.f113327w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f113327w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oo1.g$b0 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$saveDateForRefresh$1", m100430f = "MciOverviewInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Loo1/g$a;", "accumulator", "Loo1/e;", "domainAction", "<anonymous>", "(Loo1/g$a;Loo1/e;)Loo1/g$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b0 extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f113337w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113338x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113339y;

        public b0(InterfaceC30057d<? super b0> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, AbstractC28059e abstractC28059e, InterfaceC30057d<? super a> interfaceC30057d) {
            b0 b0Var = C28061g.this.new b0(interfaceC30057d);
            b0Var.f113338x = aVar;
            b0Var.f113339y = abstractC28059e;
            return b0Var.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC28059e abstractC28059eM84747b;
            a aVar = (a) this.f113338x;
            AbstractC28059e abstractC28059e = (AbstractC28059e) this.f113339y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f113337w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC28059e instanceof AbstractC28059e.k) {
                abstractC28059eM84747b = new AbstractC28059e.e(aVar.getSelectedDate(), Boolean.valueOf(((AbstractC28059e.k) abstractC28059e).getDoPoll()));
            } else {
                abstractC28059eM84747b = abstractC28059e instanceof AbstractC28059e.d ? AbstractC28059e.d.m84747b((AbstractC28059e.d) abstractC28059e, null, null, aVar.getSelectedDate(), 3, null) : abstractC28059e;
            }
            return new a(abstractC28059eM84747b, abstractC28059e instanceof AbstractC28059e.e ? C28061g.this.m84777D((AbstractC28059e.e) abstractC28059e) : aVar.getSelectedDate());
        }
    }

    /* JADX INFO: renamed from: oo1.g$c0 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$scopeEventsFlow$1", m100430f = "MciOverviewInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Ljava/lang/String;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113344w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113345x;

        public c0(InterfaceC30057d<? super c0> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c0 c0Var = C28061g.this.new c0(interfaceC30057d);
            c0Var.f113345x = obj;
            return c0Var;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.f113345x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f113344w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C28061g.this.logger.mo85228t(AbstractC11266d.m30461o("MCI refresh Scope event received: ", str), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c0) create(str, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: oo1.g$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Loo1/g$d;", "", "<init>", "()V", "a", "b", "c", "e", "d", "Loo1/g$d$a;", "Loo1/g$d$b;", "Loo1/g$d$c;", "Loo1/g$d$d;", "Loo1/g$d$e;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class d {

        /* JADX INFO: renamed from: oo1.g$d$a */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Loo1/g$d$a;", "Loo1/g$d;", "Loo1/f;", "domainState", "<init>", "(Loo1/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loo1/f;", "()Loo1/f;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC28060f domainState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC28060f domainState) {
                super(null);
                AbstractC22676k.m65750j(domainState, "domainState");
                this.domainState = domainState;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC28060f getDomainState() {
                return this.domainState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.domainState, ((a) other).domainState);
            }

            public int hashCode() {
                return this.domainState.hashCode();
            }

            public String toString() {
                return "SetDomainState(domainState=" + this.domainState + ")";
            }
        }

        /* JADX INFO: renamed from: oo1.g$d$c */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Loo1/g$d$c;", "Loo1/g$d;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "symptomsResponse", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final SymptomsScreenResponse symptomsResponse;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SymptomsScreenResponse symptomsResponse) {
                super(null);
                AbstractC22676k.m65750j(symptomsResponse, "symptomsResponse");
                this.symptomsResponse = symptomsResponse;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final SymptomsScreenResponse getSymptomsResponse() {
                return this.symptomsResponse;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && AbstractC22676k.m65745e(this.symptomsResponse, ((c) other).symptomsResponse);
            }

            public int hashCode() {
                return this.symptomsResponse.hashCode();
            }

            public String toString() {
                return "SetSymptoms(symptomsResponse=" + this.symptomsResponse + ")";
            }
        }

        /* JADX INFO: renamed from: oo1.g$d$d, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Loo1/g$d$d;", "Loo1/g$d;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42129d extends d {

            /* JADX INFO: renamed from: a */
            public static final C42129d f113353a = new C42129d();

            private C42129d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: oo1.g$d$e */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Loo1/g$d$e;", "Loo1/g$d;", "", "id", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;", "model", "", HttpHeaders.DATE, "<init>", "(Ljava/lang/Integer;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;", "c", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e extends d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final Integer id;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final CalendarTileModel model;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String date;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Integer num, CalendarTileModel model, String date) {
                super(null);
                AbstractC22676k.m65750j(model, "model");
                AbstractC22676k.m65750j(date, "date");
                this.id = num;
                this.model = model;
                this.date = date;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDate() {
                return this.date;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Integer getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CalendarTileModel getModel() {
                return this.model;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof e)) {
                    return false;
                }
                e eVar = (e) other;
                return AbstractC22676k.m65745e(this.id, eVar.id) && AbstractC22676k.m65745e(this.model, eVar.model) && AbstractC22676k.m65745e(this.date, eVar.date);
            }

            public int hashCode() {
                Integer num = this.id;
                return this.date.hashCode() + ((this.model.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31);
            }

            public String toString() {
                Integer num = this.id;
                CalendarTileModel calendarTileModel = this.model;
                String str = this.date;
                StringBuilder sb4 = new StringBuilder("UpdateCalendar(id=");
                sb4.append(num);
                sb4.append(", model=");
                sb4.append(calendarTileModel);
                sb4.append(", date=");
                return AbstractC25012a.m73376i(str, ")", sb4);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }

        /* JADX INFO: renamed from: oo1.g$d$b */
        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Loo1/g$d$b;", "Loo1/g$d;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "response", "", "selectedDate", "", "isLoading", "isPollingActive", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "d", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final MenstrualCycleInsightsResponse response;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String selectedDate;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final boolean isLoading;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final boolean isPollingActive;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MenstrualCycleInsightsResponse response, String selectedDate, boolean z4, boolean z13) {
                super(null);
                AbstractC22676k.m65750j(response, "response");
                AbstractC22676k.m65750j(selectedDate, "selectedDate");
                this.response = response;
                this.selectedDate = selectedDate;
                this.isLoading = z4;
                this.isPollingActive = z13;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final MenstrualCycleInsightsResponse getResponse() {
                return this.response;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getSelectedDate() {
                return this.selectedDate;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getIsLoading() {
                return this.isLoading;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getIsPollingActive() {
                return this.isPollingActive;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return AbstractC22676k.m65745e(this.response, bVar.response) && AbstractC22676k.m65745e(this.selectedDate, bVar.selectedDate) && this.isLoading == bVar.isLoading && this.isPollingActive == bVar.isPollingActive;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isPollingActive) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.response.hashCode() * 31, 31, this.selectedDate), 31, this.isLoading);
            }

            public String toString() {
                MenstrualCycleInsightsResponse menstrualCycleInsightsResponse = this.response;
                String str = this.selectedDate;
                boolean z4 = this.isLoading;
                boolean z13 = this.isPollingActive;
                StringBuilder sb4 = new StringBuilder("SetResponse(response=");
                sb4.append(menstrualCycleInsightsResponse);
                sb4.append(", selectedDate=");
                sb4.append(str);
                sb4.append(", isLoading=");
                return AbstractC36095b.m114682j(sb4, z4, ", isPollingActive=", z13, ")");
            }

            public /* synthetic */ b(MenstrualCycleInsightsResponse menstrualCycleInsightsResponse, String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(menstrualCycleInsightsResponse, str, z4, (i13 & 8) != 0 ? false : z13);
            }
        }
    }

    /* JADX INFO: renamed from: oo1.g$d0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f113357w;

        /* JADX INFO: renamed from: oo1.g$d0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f113358w;

            /* JADX INFO: renamed from: oo1.g$d0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$special$$inlined$filter$1$2", m100430f = "MciOverviewInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42130a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f113360F;

                /* JADX INFO: renamed from: G */
                Object f113361G;

                /* JADX INFO: renamed from: H */
                int f113362H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f113363w;

                /* JADX INFO: renamed from: x */
                int f113364x;

                /* JADX INFO: renamed from: y */
                Object f113365y;

                /* JADX INFO: renamed from: z */
                Object f113366z;

                public C42130a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f113363w = obj;
                    this.f113364x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f113358w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42130a c42130a;
                if (interfaceC30057d instanceof C42130a) {
                    c42130a = (C42130a) interfaceC30057d;
                    int i13 = c42130a.f113364x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42130a.f113364x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42130a = new C42130a(interfaceC30057d);
                    }
                } else {
                    c42130a = new C42130a(interfaceC30057d);
                }
                Object obj2 = c42130a.f113363w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42130a.f113364x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f113358w;
                    if (AbstractC22676k.m65745e((String) obj, "MciOverviewRefreshScope")) {
                        c42130a.f113365y = null;
                        c42130a.f113366z = null;
                        c42130a.f113360F = null;
                        c42130a.f113361G = null;
                        c42130a.f113362H = 0;
                        c42130a.f113364x = 1;
                        if (interfaceC13062m.emit(obj, c42130a) == enumC31071a) {
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

        public d0(InterfaceC13058l interfaceC13058l) {
            this.f113357w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f113357w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oo1.g$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$dismissNaturalCyclesConfirmationDialog$2", m100430f = "MciOverviewInteractor.kt", m100431l = {448}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f113367w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C28061g.this.new e(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113367w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C28061g.this.api;
            DismissBody dismissBody = new DismissBody("NATURAL_CYCLES_CONFIRMATION_DIALOG");
            this.f113367w = 1;
            Object objDismissRequest = hormonalInsightsApi.dismissRequest(dismissBody, this);
            return objDismissRequest == enumC31071a ? enumC31071a : objDismissRequest;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: oo1.g$e0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f113369w;

        /* JADX INFO: renamed from: oo1.g$e0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f113370w;

            /* JADX INFO: renamed from: oo1.g$e0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$special$$inlined$map$1$2", m100430f = "MciOverviewInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42131a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f113371E;

                /* JADX INFO: renamed from: F */
                Object f113372F;

                /* JADX INFO: renamed from: G */
                Object f113373G;

                /* JADX INFO: renamed from: H */
                int f113374H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f113375w;

                /* JADX INFO: renamed from: x */
                int f113376x;

                /* JADX INFO: renamed from: y */
                Object f113377y;

                public C42131a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f113375w = obj;
                    this.f113376x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f113370w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42131a c42131a;
                if (interfaceC30057d instanceof C42131a) {
                    c42131a = (C42131a) interfaceC30057d;
                    int i13 = c42131a.f113376x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42131a.f113376x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42131a = new C42131a(interfaceC30057d);
                    }
                } else {
                    c42131a = new C42131a(interfaceC30057d);
                }
                Object obj2 = c42131a.f113375w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42131a.f113376x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f113370w;
                    AbstractC28059e.k kVar = new AbstractC28059e.k(true);
                    c42131a.f113377y = null;
                    c42131a.f113371E = null;
                    c42131a.f113372F = null;
                    c42131a.f113373G = null;
                    c42131a.f113374H = 0;
                    c42131a.f113376x = 1;
                    if (interfaceC13062m.emit(kVar, c42131a) == enumC31071a) {
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

        public e0(InterfaceC13058l interfaceC13058l) {
            this.f113369w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f113369w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oo1.g$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$getCacheSourceResult$$inlined$cacheAPI$1", m100430f = "MciOverviewInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f113379w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113380x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113381y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f113382z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f113382z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f113382z);
            fVar.f113380x = interfaceC13062m;
            fVar.f113381y = c26832c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113379w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f113380x;
                C26832c c26832c = (C26832c) this.f113381y;
                InterfaceC26834e interfaceC26834e = this.f113382z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(MenstrualCycleInsightsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(MenstrualCycleInsightsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f113380x = null;
                this.f113381y = null;
                this.f113379w = 1;
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

    /* JADX INFO: renamed from: oo1.g$f0 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f113383w;

        /* JADX INFO: renamed from: oo1.g$f0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f113384w;

            /* JADX INFO: renamed from: oo1.g$f0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$toMciOverviewDomainAction$$inlined$mapNotNull$1$2", m100430f = "MciOverviewInteractor.kt", m100431l = {69}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42132a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f113385E;

                /* JADX INFO: renamed from: F */
                Object f113386F;

                /* JADX INFO: renamed from: G */
                Object f113387G;

                /* JADX INFO: renamed from: H */
                Object f113388H;

                /* JADX INFO: renamed from: I */
                int f113389I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f113390w;

                /* JADX INFO: renamed from: x */
                int f113391x;

                /* JADX INFO: renamed from: y */
                Object f113392y;

                public C42132a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f113390w = obj;
                    this.f113391x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f113384w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42132a c42132a;
                Object lVar;
                if (interfaceC30057d instanceof C42132a) {
                    c42132a = (C42132a) interfaceC30057d;
                    int i13 = c42132a.f113391x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42132a.f113391x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42132a = new C42132a(interfaceC30057d);
                    }
                } else {
                    c42132a = new C42132a(interfaceC30057d);
                }
                Object obj2 = c42132a.f113390w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42132a.f113391x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f113384w;
                    AbstractC30694b abstractC30694b = (AbstractC30694b) obj;
                    if (abstractC30694b instanceof AbstractC30694b.i) {
                        lVar = new AbstractC28059e.l(AbstractC28060f.f.f113300a);
                    } else if (abstractC30694b instanceof AbstractC30694b.a) {
                        lVar = new AbstractC28059e.l(AbstractC28060f.d.f113298a);
                    } else if (abstractC30694b instanceof AbstractC30694b.f) {
                        lVar = new AbstractC28059e.k(true);
                    } else {
                        lVar = abstractC30694b instanceof AbstractC30694b.d ? new AbstractC28059e.l(new AbstractC28060f.c(((AbstractC30694b.d) abstractC30694b).getDestination())) : null;
                    }
                    if (lVar != null) {
                        c42132a.f113392y = null;
                        c42132a.f113385E = null;
                        c42132a.f113386F = null;
                        c42132a.f113387G = null;
                        c42132a.f113388H = null;
                        c42132a.f113389I = 0;
                        c42132a.f113391x = 1;
                        if (interfaceC13062m.emit(lVar, c42132a) == enumC31071a) {
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

        public f0(InterfaceC13058l interfaceC13058l) {
            this.f113383w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f113383w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oo1.g$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f113394w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C28061g f113395x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f113396y;

        /* JADX INFO: renamed from: oo1.g$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f113397w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28061g f113398x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f113399y;

            /* JADX INFO: renamed from: oo1.g$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$getDataFromCache$$inlined$map$1$2", m100430f = "MciOverviewInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42133a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f113400E;

                /* JADX INFO: renamed from: F */
                Object f113401F;

                /* JADX INFO: renamed from: G */
                Object f113402G;

                /* JADX INFO: renamed from: H */
                int f113403H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f113404w;

                /* JADX INFO: renamed from: x */
                int f113405x;

                /* JADX INFO: renamed from: y */
                Object f113406y;

                public C42133a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f113404w = obj;
                    this.f113405x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C28061g c28061g, String str) {
                this.f113397w = interfaceC13062m;
                this.f113398x = c28061g;
                this.f113399y = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42133a c42133a;
                if (interfaceC30057d instanceof C42133a) {
                    c42133a = (C42133a) interfaceC30057d;
                    int i13 = c42133a.f113405x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42133a.f113405x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42133a = new C42133a(interfaceC30057d);
                    }
                } else {
                    c42133a = new C42133a(interfaceC30057d);
                }
                Object obj2 = c42133a.f113404w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42133a.f113405x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f113397w;
                    d dVarM84780G = C28061g.m84780G(this.f113398x, (InterfaceC29354a) obj, this.f113399y, false, 2, null);
                    c42133a.f113406y = null;
                    c42133a.f113400E = null;
                    c42133a.f113401F = null;
                    c42133a.f113402G = null;
                    c42133a.f113403H = 0;
                    c42133a.f113405x = 1;
                    if (interfaceC13062m.emit(dVarM84780G, c42133a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, C28061g c28061g, String str) {
            this.f113394w = interfaceC13058l;
            this.f113395x = c28061g;
            this.f113396y = str;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f113394w.collect(new a(interfaceC13062m, this.f113395x, this.f113396y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oo1.g$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f113408w;

        /* JADX INFO: renamed from: oo1.g$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f113409w;

            /* JADX INFO: renamed from: oo1.g$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$$inlined$filterIsInstance$1$2", m100430f = "MciOverviewInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42134a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f113411F;

                /* JADX INFO: renamed from: G */
                Object f113412G;

                /* JADX INFO: renamed from: H */
                int f113413H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f113414w;

                /* JADX INFO: renamed from: x */
                int f113415x;

                /* JADX INFO: renamed from: y */
                Object f113416y;

                /* JADX INFO: renamed from: z */
                Object f113417z;

                public C42134a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f113414w = obj;
                    this.f113415x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f113409w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42134a c42134a;
                if (interfaceC30057d instanceof C42134a) {
                    c42134a = (C42134a) interfaceC30057d;
                    int i13 = c42134a.f113415x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42134a.f113415x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42134a = new C42134a(interfaceC30057d);
                    }
                } else {
                    c42134a = new C42134a(interfaceC30057d);
                }
                Object obj2 = c42134a.f113414w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42134a.f113415x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f113409w;
                    if (obj instanceof AbstractC28059e.a) {
                        c42134a.f113416y = null;
                        c42134a.f113417z = null;
                        c42134a.f113411F = null;
                        c42134a.f113412G = null;
                        c42134a.f113413H = 0;
                        c42134a.f113415x = 1;
                        if (interfaceC13062m.emit(obj, c42134a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l) {
            this.f113408w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f113408w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oo1.g$i */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f113418w;

        /* JADX INFO: renamed from: oo1.g$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f113419w;

            /* JADX INFO: renamed from: oo1.g$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$$inlined$filterNot$1$2", m100430f = "MciOverviewInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42135a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f113421F;

                /* JADX INFO: renamed from: G */
                Object f113422G;

                /* JADX INFO: renamed from: H */
                int f113423H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f113424w;

                /* JADX INFO: renamed from: x */
                int f113425x;

                /* JADX INFO: renamed from: y */
                Object f113426y;

                /* JADX INFO: renamed from: z */
                Object f113427z;

                public C42135a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f113424w = obj;
                    this.f113425x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f113419w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42135a c42135a;
                if (interfaceC30057d instanceof C42135a) {
                    c42135a = (C42135a) interfaceC30057d;
                    int i13 = c42135a.f113425x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42135a.f113425x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42135a = new C42135a(interfaceC30057d);
                    }
                } else {
                    c42135a = new C42135a(interfaceC30057d);
                }
                Object obj2 = c42135a.f113424w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42135a.f113425x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f113419w;
                    if (!(((AbstractC28059e) obj) instanceof AbstractC28059e.a)) {
                        c42135a.f113426y = null;
                        c42135a.f113427z = null;
                        c42135a.f113421F = null;
                        c42135a.f113422G = null;
                        c42135a.f113423H = 0;
                        c42135a.f113425x = 1;
                        if (interfaceC13062m.emit(obj, c42135a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l) {
            this.f113418w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f113418w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oo1.g$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$$inlined$flatMapLatest$1", m100430f = "MciOverviewInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f113428w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113429x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113430y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C28061g f113431z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC30057d interfaceC30057d, C28061g c28061g) {
            super(3, interfaceC30057d);
            this.f113431z = c28061g;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC28059e abstractC28059e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            j jVar = new j(interfaceC30057d, this.f113431z);
            jVar.f113429x = interfaceC13062m;
            jVar.f113430y = abstractC28059e;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            InterfaceC13058l c13084s2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113428w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f113429x;
                AbstractC28059e abstractC28059e = (AbstractC28059e) this.f113430y;
                if (abstractC28059e instanceof AbstractC28059e.d) {
                    AbstractC28059e.d dVar = (AbstractC28059e.d) abstractC28059e;
                    String date = dVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                    if (date == null) {
                        date = this.f113431z.dateAndTimeProvider.mo133365d().toString("yyyy-MM-dd");
                    }
                    C28061g c28061g = this.f113431z;
                    Integer id4 = dVar.getId();
                    AbstractC22676k.m65747g(date);
                    c13084s1 = c28061g.m84805y(id4, date, dVar.getSelectedDate());
                } else if (abstractC28059e instanceof AbstractC28059e.e) {
                    AbstractC28059e.e eVar = (AbstractC28059e.e) abstractC28059e;
                    String strM84777D = this.f113431z.m84777D(eVar);
                    c13084s1 = !AbstractC22676k.m65745e(eVar.getDoPoll(), Boolean.TRUE) ? this.f113431z.m84802v(strM84777D) : this.f113431z.m84775B(strM84777D);
                } else {
                    if (AbstractC22676k.m65745e(abstractC28059e, AbstractC28059e.m.f113292a)) {
                        c13084s2 = new C13084s1(new o(null));
                    } else if (abstractC28059e instanceof AbstractC28059e.g) {
                        c13084s1 = new C13084s1(this.f113431z.new p(abstractC28059e, null));
                    } else if (AbstractC22676k.m65745e(abstractC28059e, AbstractC28059e.f.f113284a)) {
                        c13084s2 = new C13084s1(this.f113431z.new q(null));
                    } else {
                        boolean z4 = abstractC28059e instanceof AbstractC28059e.h;
                        C13054k c13054k = C13054k.f45116w;
                        if (z4) {
                            DecodedGenericInteraction interaction = ((AbstractC28059e.h) abstractC28059e).getInteraction();
                            C9598e navigation = interaction.getNavigation();
                            if (interaction.getModal() != null || navigation == null) {
                                c13084s1 = c13054k;
                            } else {
                                c13084s2 = new C0456u(new d.a(new AbstractC28060f.c(navigation)), 1);
                            }
                        } else if (AbstractC22676k.m65745e(abstractC28059e, AbstractC28059e.i.f113288a)) {
                            c13084s2 = new C13084s1(this.f113431z.new r(null));
                        } else if (abstractC28059e instanceof AbstractC28059e.l) {
                            c13084s1 = new C13084s1(new s(abstractC28059e, null));
                        } else {
                            if (!AbstractC22676k.m65745e(abstractC28059e, AbstractC28059e.j.f113289a) && !(abstractC28059e instanceof AbstractC28059e.c) && !(abstractC28059e instanceof AbstractC28059e.k) && !(abstractC28059e instanceof AbstractC28059e.a) && !(abstractC28059e instanceof AbstractC28059e.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c13084s1 = c13054k;
                        }
                    }
                    c13084s1 = c13084s2;
                }
                this.f113429x = null;
                this.f113430y = null;
                this.f113428w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC28059e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: oo1.g$k */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f113432w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C28061g f113433x;

        /* JADX INFO: renamed from: oo1.g$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f113434w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28061g f113435x;

            /* JADX INFO: renamed from: oo1.g$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$$inlined$map$1$2", m100430f = "MciOverviewInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42136a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f113436E;

                /* JADX INFO: renamed from: F */
                Object f113437F;

                /* JADX INFO: renamed from: G */
                Object f113438G;

                /* JADX INFO: renamed from: H */
                int f113439H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f113440w;

                /* JADX INFO: renamed from: x */
                int f113441x;

                /* JADX INFO: renamed from: y */
                Object f113442y;

                public C42136a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f113440w = obj;
                    this.f113441x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C28061g c28061g) {
                this.f113434w = interfaceC13062m;
                this.f113435x = c28061g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42136a c42136a;
                if (interfaceC30057d instanceof C42136a) {
                    c42136a = (C42136a) interfaceC30057d;
                    int i13 = c42136a.f113441x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42136a.f113441x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42136a = new C42136a(interfaceC30057d);
                    }
                } else {
                    c42136a = new C42136a(interfaceC30057d);
                }
                Object obj2 = c42136a.f113440w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42136a.f113441x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f113434w;
                    AbstractC28059e abstractC28059eM84778E = (AbstractC28059e) obj;
                    if (abstractC28059eM84778E instanceof AbstractC28059e.b) {
                        abstractC28059eM84778E = this.f113435x.m84778E(((AbstractC28059e.b) abstractC28059eM84778E).getInteraction());
                    }
                    c42136a.f113442y = null;
                    c42136a.f113436E = null;
                    c42136a.f113437F = null;
                    c42136a.f113438G = null;
                    c42136a.f113439H = 0;
                    c42136a.f113441x = 1;
                    if (interfaceC13062m.emit(abstractC28059eM84778E, c42136a) == enumC31071a) {
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

        public k(InterfaceC13058l interfaceC13058l, C28061g c28061g) {
            this.f113432w = interfaceC13058l;
            this.f113433x = c28061g;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f113432w.collect(new a(interfaceC13062m, this.f113433x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oo1.g$l */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f113444w;

        /* JADX INFO: renamed from: oo1.g$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f113445w;

            /* JADX INFO: renamed from: oo1.g$l$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$$inlined$map$2$2", m100430f = "MciOverviewInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42137a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f113446E;

                /* JADX INFO: renamed from: F */
                Object f113447F;

                /* JADX INFO: renamed from: G */
                Object f113448G;

                /* JADX INFO: renamed from: H */
                int f113449H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f113450w;

                /* JADX INFO: renamed from: x */
                int f113451x;

                /* JADX INFO: renamed from: y */
                Object f113452y;

                public C42137a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f113450w = obj;
                    this.f113451x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f113445w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42137a c42137a;
                if (interfaceC30057d instanceof C42137a) {
                    c42137a = (C42137a) interfaceC30057d;
                    int i13 = c42137a.f113451x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42137a.f113451x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42137a = new C42137a(interfaceC30057d);
                    }
                } else {
                    c42137a = new C42137a(interfaceC30057d);
                }
                Object obj2 = c42137a.f113450w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42137a.f113451x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f113445w;
                    AbstractC28060f domainResult = ((c) obj).getDomainResult();
                    c42137a.f113452y = null;
                    c42137a.f113446E = null;
                    c42137a.f113447F = null;
                    c42137a.f113448G = null;
                    c42137a.f113449H = 0;
                    c42137a.f113451x = 1;
                    if (interfaceC13062m.emit(domainResult, c42137a) == enumC31071a) {
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

        public l(InterfaceC13058l interfaceC13058l) {
            this.f113444w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f113444w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oo1.g$m */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f113454w;

        /* JADX INFO: renamed from: oo1.g$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f113455w;

            /* JADX INFO: renamed from: oo1.g$m$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$$inlined$mapNotNull$1$2", m100430f = "MciOverviewInteractor.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42138a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f113456E;

                /* JADX INFO: renamed from: F */
                Object f113457F;

                /* JADX INFO: renamed from: G */
                Object f113458G;

                /* JADX INFO: renamed from: H */
                Object f113459H;

                /* JADX INFO: renamed from: I */
                int f113460I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f113461w;

                /* JADX INFO: renamed from: x */
                int f113462x;

                /* JADX INFO: renamed from: y */
                Object f113463y;

                public C42138a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f113461w = obj;
                    this.f113462x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f113455w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42138a c42138a;
                if (interfaceC30057d instanceof C42138a) {
                    c42138a = (C42138a) interfaceC30057d;
                    int i13 = c42138a.f113462x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42138a.f113462x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42138a = new C42138a(interfaceC30057d);
                    }
                } else {
                    c42138a = new C42138a(interfaceC30057d);
                }
                Object obj2 = c42138a.f113461w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42138a.f113462x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f113455w;
                    InterfaceC30693a actionDomainAction = ((AbstractC28059e.a) obj).getActionDomainAction();
                    if (actionDomainAction != null) {
                        c42138a.f113463y = null;
                        c42138a.f113456E = null;
                        c42138a.f113457F = null;
                        c42138a.f113458G = null;
                        c42138a.f113459H = null;
                        c42138a.f113460I = 0;
                        c42138a.f113462x = 1;
                        if (interfaceC13062m.emit(actionDomainAction, c42138a) == enumC31071a) {
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

        public m(InterfaceC13058l interfaceC13058l) {
            this.f113454w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f113454w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oo1.g$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$1", m100430f = "MciOverviewInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Loo1/e;", "lastDomainAction", "nextDomainAction", "<anonymous>", "(Loo1/e;Loo1/e;)Loo1/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f113465w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113466x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113467y;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC28059e abstractC28059e, AbstractC28059e abstractC28059e2, InterfaceC30057d<? super AbstractC28059e> interfaceC30057d) {
            n nVar = new n(interfaceC30057d);
            nVar.f113466x = abstractC28059e;
            nVar.f113467y = abstractC28059e2;
            return nVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC28059e abstractC28059e = (AbstractC28059e) this.f113466x;
            AbstractC28059e abstractC28059e2 = (AbstractC28059e) this.f113467y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f113465w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((abstractC28059e instanceof AbstractC28059e.c) && (abstractC28059e2 instanceof AbstractC28059e.e)) ? new AbstractC28059e.e(((AbstractC28059e.e) abstractC28059e2).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), Boolean.TRUE) : abstractC28059e2;
        }
    }

    /* JADX INFO: renamed from: oo1.g$o */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$2$1", m100430f = "MciOverviewInteractor.kt", m100431l = {129}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loo1/g$d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113468w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113469x;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            o oVar = new o(interfaceC30057d);
            oVar.f113469x = obj;
            return oVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f113469x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113468w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                d.C42129d c42129d = d.C42129d.f113353a;
                this.f113469x = null;
                this.f113468w = 1;
                if (interfaceC13062m.emit(c42129d, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: oo1.g$p */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$2$2", m100430f = "MciOverviewInteractor.kt", m100431l = {132, 133, 133}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loo1/g$d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC28059e f113470E;

        /* JADX INFO: renamed from: w */
        Object f113471w;

        /* JADX INFO: renamed from: x */
        int f113472x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f113473y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(AbstractC28059e abstractC28059e, InterfaceC30057d<? super p> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113470E = abstractC28059e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            p pVar = C28061g.this.new p(this.f113470E, interfaceC30057d);
            pVar.f113473y = obj;
            return pVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((p) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f113473y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f113472x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r8)
                goto L65
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r0 = r7.f113471w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L58
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L41
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                oo1.g$d$a r8 = new oo1.g$d$a
                oo1.f$f r2 = oo1.AbstractC28060f.f.f113300a
                r8.<init>(r2)
                r7.f113473y = r0
                r7.f113472x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L41
                goto L64
            L41:
                oo1.g r8 = oo1.C28061g.this
                oo1.e r2 = r7.f113470E
                oo1.e$g r2 = (oo1.AbstractC28059e.g) r2
                so1.r r2 = r2.getData()
                r7.f113473y = r6
                r7.f113471w = r0
                r7.f113472x = r4
                java.lang.Object r8 = oo1.C28061g.m84793m(r8, r2, r7)
                if (r8 != r1) goto L58
                goto L64
            L58:
                r7.f113473y = r6
                r7.f113471w = r6
                r7.f113472x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L65
            L64:
                return r1
            L65:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: oo1.C28061g.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oo1.g$q */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$2$3", m100430f = "MciOverviewInteractor.kt", m100431l = {136, 136}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loo1/g$d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f113475w;

        /* JADX INFO: renamed from: x */
        int f113476x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f113477y;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            q qVar = C28061g.this.new q(interfaceC30057d);
            qVar.f113477y = obj;
            return qVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((q) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f113477y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f113476x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L44
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f113475w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                oo1.g r7 = oo1.C28061g.this
                r6.f113477y = r5
                r6.f113475w = r0
                r6.f113476x = r4
                java.lang.Object r7 = oo1.C28061g.m84792l(r7, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.f113477y = r5
                r6.f113475w = r5
                r6.f113476x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L44
            L43:
                return r1
            L44:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: oo1.C28061g.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oo1.g$r */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$2$4", m100430f = "MciOverviewInteractor.kt", m100431l = {148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loo1/g$d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113479w;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28061g.this.new r(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((r) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113479w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C28061g c28061g = C28061g.this;
                this.f113479w = 1;
                if (c28061g.m84800t(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: oo1.g$s */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$2$5", m100430f = "MciOverviewInteractor.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loo1/g$d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113481w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113482x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC28059e f113483y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(AbstractC28059e abstractC28059e, InterfaceC30057d<? super s> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113483y = abstractC28059e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            s sVar = new s(this.f113483y, interfaceC30057d);
            sVar.f113482x = obj;
            return sVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((s) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f113482x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113481w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                d.a aVar = new d.a(((AbstractC28059e.l) this.f113483y).getDomainState());
                this.f113482x = null;
                this.f113481w = 1;
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

    /* JADX INFO: renamed from: oo1.g$t */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$3", m100430f = "MciOverviewInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Loo1/g$c;", "accumulator", "Loo1/g$d;", "action", "<anonymous>", "(Loo1/g$c;Loo1/g$d;)Loo1/g$c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f113484w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113485x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113486y;

        public t(InterfaceC30057d<? super t> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c cVar, d dVar, InterfaceC30057d<? super c> interfaceC30057d) {
            t tVar = C28061g.this.new t(interfaceC30057d);
            tVar.f113485x = cVar;
            tVar.f113486y = dVar;
            return tVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            c cVar = (c) this.f113485x;
            d dVar = (d) this.f113486y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f113484w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (dVar instanceof d.a) {
                return new c(cVar.m84814e(), ((d.a) dVar).getDomainState(), cVar.getCurrentPage());
            }
            if (dVar instanceof d.b) {
                d.b bVar = (d.b) dVar;
                return C28061g.this.m84799s(cVar, bVar.getResponse(), bVar.getIsLoading(), bVar.getSelectedDate(), bVar.getIsPollingActive());
            }
            if (dVar instanceof d.e) {
                d.e eVar = (d.e) dVar;
                Integer id4 = eVar.getId();
                String date = eVar.getDate();
                return C28061g.this.m84782I(cVar, id4, eVar.getModel(), date);
            }
            if (dVar instanceof d.c) {
                if (cVar.getDomainResult() instanceof AbstractC28060f.g) {
                    return c.m84810b(cVar, null, AbstractC28060f.g.m84761b((AbstractC28060f.g) cVar.getDomainResult(), null, null, null, 0, ((d.c) dVar).getSymptomsResponse(), false, 47, null), 0, 5, null);
                }
            } else {
                if (!(dVar instanceof d.C42129d)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (cVar.getDomainResult() instanceof AbstractC28060f.g) {
                    return c.m84810b(cVar, null, AbstractC28060f.g.m84761b((AbstractC28060f.g) cVar.getDomainResult(), null, null, null, 0, null, false, 31, null), 0, 5, null);
                }
            }
            return cVar;
        }
    }

    /* JADX INFO: renamed from: oo1.g$u */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$loadCalendar$1", m100430f = "MciOverviewInteractor.kt", m100431l = {395, 399, 400}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loo1/g$d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Integer f113488E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f113489F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f113490G;

        /* JADX INFO: renamed from: w */
        Object f113491w;

        /* JADX INFO: renamed from: x */
        int f113492x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f113493y;

        /* JADX INFO: renamed from: oo1.g$u$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$loadCalendar$1$response$1", m100430f = "MciOverviewInteractor.kt", m100431l = {396}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f113495w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28061g f113496x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f113497y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f113498z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C28061g c28061g, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f113496x = c28061g;
                this.f113497y = str;
                this.f113498z = str2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f113496x, this.f113497y, this.f113498z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f113495w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                HormonalInsightsApi hormonalInsightsApi = this.f113496x.api;
                String str = this.f113497y;
                String str2 = this.f113498z;
                this.f113495w = 1;
                Object mciOverviewCalendar = hormonalInsightsApi.getMciOverviewCalendar(str, str2, this);
                return mciOverviewCalendar == enumC31071a ? enumC31071a : mciOverviewCalendar;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super CalendarTileModel> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Integer num, String str, String str2, InterfaceC30057d<? super u> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113488E = num;
            this.f113489F = str;
            this.f113490G = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            u uVar = C28061g.this.new u(this.f113488E, this.f113489F, this.f113490G, interfaceC30057d);
            uVar.f113493y = obj;
            return uVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((u) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f113493y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f113492x
                r10 = 3
                r11 = 2
                r1 = 1
                r12 = 0
                if (r0 == 0) goto L2c
                if (r0 == r1) goto L27
                if (r0 == r11) goto L1e
                if (r0 != r10) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1e:
                java.lang.Object r0 = r13.f113491w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto L96
            L27:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L53
            L2c:
                p505ts.AbstractC34132o.m107864I(r14)
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                oo1.g r2 = oo1.C28061g.this
                tr2.n r2 = oo1.C28061g.m84790j(r2)
                oo1.g$u$a r4 = new oo1.g$u$a
                oo1.g r3 = oo1.C28061g.this
                java.lang.String r6 = r13.f113489F
                java.lang.String r7 = r13.f113490G
                r4.<init>(r3, r6, r7, r12)
                r13.f113493y = r8
                r13.f113492x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L53
                goto L95
            L53:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L77
                oo1.g$d$e r1 = new oo1.g$d$e
                java.lang.Integer r2 = r13.f113488E
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CalendarTileModel r0 = (com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CalendarTileModel) r0
                java.lang.String r3 = r13.f113489F
                r1.<init>(r2, r0, r3)
                r13.f113493y = r12
                r13.f113491w = r12
                r13.f113492x = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto L96
                goto L95
            L77:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L99
                oo1.g$d$a r0 = new oo1.g$d$a
                oo1.f$a r1 = new oo1.f$a
                java.lang.String r2 = "Fetching menstrual cycle insights calendar failed with unknown error"
                java.lang.String r3 = r13.f113489F
                r1.<init>(r2, r3)
                r0.<init>(r1)
                r13.f113493y = r12
                r13.f113491w = r12
                r13.f113492x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L96
            L95:
                return r9
            L96:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L99:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: oo1.C28061g.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oo1.g$v */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor", m100430f = "MciOverviewInteractor.kt", m100431l = {436}, m100432m = "loadSymptoms", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f113499w;

        /* JADX INFO: renamed from: y */
        int f113501y;

        public v(InterfaceC30057d<? super v> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113499w = obj;
            this.f113501y |= Integer.MIN_VALUE;
            return C28061g.this.m84806z(this);
        }
    }

    /* JADX INFO: renamed from: oo1.g$w */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$loadSymptoms$response$1", m100430f = "MciOverviewInteractor.kt", m100431l = {437}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f113502w;

        public w(InterfaceC30057d<? super w> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C28061g.this.new w(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113502w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C28061g.this.api;
            this.f113502w = 1;
            Object symptomsScreen = hormonalInsightsApi.getSymptomsScreen(this);
            return symptomsScreen == enumC31071a ? enumC31071a : symptomsScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SymptomsScreenResponse> interfaceC30057d) {
            return ((w) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: oo1.g$x */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor", m100430f = "MciOverviewInteractor.kt", m100431l = {422, 428}, m100432m = "logPeriod", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f113504E;

        /* JADX INFO: renamed from: G */
        int f113506G;

        /* JADX INFO: renamed from: w */
        Object f113507w;

        /* JADX INFO: renamed from: x */
        Object f113508x;

        /* JADX INFO: renamed from: y */
        Object f113509y;

        /* JADX INFO: renamed from: z */
        Object f113510z;

        public x(InterfaceC30057d<? super x> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113504E = obj;
            this.f113506G |= Integer.MIN_VALUE;
            return C28061g.this.m84774A(null, this);
        }
    }

    /* JADX INFO: renamed from: oo1.g$y */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$logPeriod$response$1", m100430f = "MciOverviewInteractor.kt", m100431l = {423}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class y extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f113511w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ LogPeriodRequest f113513y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(LogPeriodRequest logPeriodRequest, InterfaceC30057d<? super y> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f113513y = logPeriodRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C28061g.this.new y(this.f113513y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113511w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C28061g.this.api;
            LogPeriodRequest logPeriodRequest = this.f113513y;
            this.f113511w = 1;
            Object objLogPeriod = hormonalInsightsApi.logPeriod(logPeriodRequest, this);
            return objLogPeriod == enumC31071a ? enumC31071a : objLogPeriod;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((y) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: oo1.g$z */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$pollDataFromCache$1", m100430f = "MciOverviewInteractor.kt", m100431l = {333, 341}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Loo1/g$d;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class z extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        long f113514E;

        /* JADX INFO: renamed from: F */
        long f113515F;

        /* JADX INFO: renamed from: G */
        long f113516G;

        /* JADX INFO: renamed from: H */
        int f113517H;

        /* JADX INFO: renamed from: I */
        private /* synthetic */ Object f113518I;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ String f113520K;

        /* JADX INFO: renamed from: w */
        Object f113521w;

        /* JADX INFO: renamed from: x */
        int f113522x;

        /* JADX INFO: renamed from: y */
        int f113523y;

        /* JADX INFO: renamed from: z */
        int f113524z;

        /* JADX INFO: renamed from: oo1.g$z$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$pollDataFromCache$1$job$1", m100430f = "MciOverviewInteractor.kt", m100431l = {321}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC11936u f113525E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ boolean f113526F;

            /* JADX INFO: renamed from: w */
            int f113527w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f113528x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C28061g f113529y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f113530z;

            /* JADX INFO: renamed from: oo1.g$z$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42139a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: E */
                final /* synthetic */ InterfaceC2994c0 f113531E;

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC11936u f113532w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C28061g f113533x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ String f113534y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ boolean f113535z;

                /* JADX INFO: renamed from: oo1.g$z$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$pollDataFromCache$1$job$1$1", m100430f = "MciOverviewInteractor.kt", m100431l = {323}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42140a extends AbstractC32269c {

                    /* JADX INFO: renamed from: w */
                    Object f113536w;

                    /* JADX INFO: renamed from: x */
                    /* synthetic */ Object f113537x;

                    /* JADX INFO: renamed from: y */
                    final /* synthetic */ C42139a<T> f113538y;

                    /* JADX INFO: renamed from: z */
                    int f113539z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C42140a(C42139a<? super T> c42139a, InterfaceC30057d<? super C42140a> interfaceC30057d) {
                        super(interfaceC30057d);
                        this.f113538y = c42139a;
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f113537x = obj;
                        this.f113539z |= Integer.MIN_VALUE;
                        return this.f113538y.emit(null, this);
                    }
                }

                public C42139a(InterfaceC11936u interfaceC11936u, C28061g c28061g, String str, boolean z4, InterfaceC2994c0 interfaceC2994c0) {
                    this.f113532w = interfaceC11936u;
                    this.f113533x = c28061g;
                    this.f113534y = str;
                    this.f113535z = z4;
                    this.f113531E = interfaceC2994c0;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC29354a<MenstrualCycleInsightsResponse> interfaceC29354a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    C42140a c42140a;
                    if (interfaceC30057d instanceof C42140a) {
                        c42140a = (C42140a) interfaceC30057d;
                        int i13 = c42140a.f113539z;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42140a.f113539z = i13 - Integer.MIN_VALUE;
                        } else {
                            c42140a = new C42140a(this, interfaceC30057d);
                        }
                    } else {
                        c42140a = new C42140a(this, interfaceC30057d);
                    }
                    Object obj = c42140a.f113537x;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42140a.f113539z;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC11936u interfaceC11936u = this.f113532w;
                        d dVarM84779F = this.f113533x.m84779F(interfaceC29354a, this.f113534y, !this.f113535z);
                        c42140a.f113536w = interfaceC29354a;
                        c42140a.f113539z = 1;
                        if (((C11935t) interfaceC11936u).f39041z.mo32219t(dVarM84779F, c42140a) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC29354a = (InterfaceC29354a) c42140a.f113536w;
                        AbstractC34132o.m107864I(obj);
                    }
                    if ((interfaceC29354a instanceof InterfaceC29354a.a.C42173a) || (interfaceC29354a instanceof InterfaceC29354a.b)) {
                        AbstractC3006f0.m8714h(this.f113531E, null);
                    }
                    return C23454a0.f92919a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C28061g c28061g, String str, InterfaceC11936u interfaceC11936u, boolean z4, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f113529y = c28061g;
                this.f113530z = str;
                this.f113525E = interfaceC11936u;
                this.f113526F = z4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f113529y, this.f113530z, this.f113525E, this.f113526F, interfaceC30057d);
                aVar.f113528x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f113528x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f113527w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13058l interfaceC13058lM84801u = this.f113529y.m84801u(this.f113530z);
                    if (!(interfaceC13058lM84801u instanceof InterfaceC13026d)) {
                        interfaceC13058lM84801u = new C13034f(interfaceC13058lM84801u);
                    }
                    C42139a c42139a = new C42139a(this.f113525E, this.f113529y, this.f113530z, this.f113526F, interfaceC2994c0);
                    this.f113528x = null;
                    this.f113527w = 1;
                    if (interfaceC13058lM84801u.collect(c42139a, this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str, InterfaceC30057d<? super z> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113520K = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            z zVar = C28061g.this.new z(this.f113520K, interfaceC30057d);
            zVar.f113518I = obj;
            return zVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((z) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0086  */
        /* JADX WARN: Code duplicated, block: B:49:0x0137  */
        /* JADX WARN: Code duplicated, block: B:83:0x01bd  */
        /* JADX WARN: Code duplicated, block: B:84:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:88:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:91:0x01ef  */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0218, code lost:
        
            if (bc3.AbstractC3034m0.m8782b(r9, r18) == r1) goto L93;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v27, types: [int] */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v5, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0218 -> B:94:0x021b). Please report as a decompilation issue!!! */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 566
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oo1.C28061g.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C28061g(C30695c actionInteractor, HormonalInsightsApi api, InterfaceC26834e cachedApiSource, C38458b cacheUpdater, InterfaceC41070a dateAndTimeProvider, InterfaceC34116n logger, Locale locale, AbstractC21909c configurationRepository, C37378a scopeCoordinator, AbstractC0757c json) {
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(json, "json");
        this.actionInteractor = actionInteractor;
        this.api = api;
        this.cachedApiSource = cachedApiSource;
        this.cacheUpdater = cacheUpdater;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.logger = logger;
        this.locale = locale;
        this.configurationRepository = configurationRepository;
        this.scopeCoordinator = scopeCoordinator;
        this.json = json;
        this.scopeEventsFlow = new e0(new d0(new C13052j1(scopeCoordinator.getScopeUpdateEvents(), new c0(null), 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        if (r14.m123247a("MciOverviewRefreshScope", r6) == r0) goto L35;
     */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m84774A(so1.C32834r r13, q83.InterfaceC30057d<? super oo1.C28061g.d> r14) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo1.C28061g.m84774A(so1.r, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final InterfaceC13058l m84775B(String date) {
        return AbstractC13091v.m36602l(new z(date, null));
    }

    /* JADX INFO: renamed from: C */
    private final InterfaceC13058l m84776C(InterfaceC13058l interfaceC13058l) {
        return new a0(AbstractC13091v.m36612v(new C13060l1(new a(AbstractC28059e.j.f113289a, null), interfaceC13058l, new b0(null)), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final String m84777D(AbstractC28059e.e eVar) {
        String date = eVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
        if (date != null) {
            return date;
        }
        String string = this.dateAndTimeProvider.mo133365d().toString("yyyy-MM-dd");
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final AbstractC28059e m84778E(GenericInteraction genericInteraction) {
        DecodedGenericInteraction decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(genericInteraction, this.json);
        Action action = decodedGenericInteraction != null ? decodedGenericInteraction.getAction() : null;
        C9598e navigation = decodedGenericInteraction != null ? decodedGenericInteraction.getNavigation() : null;
        if (action != null) {
            return new AbstractC28059e.a(new C30698f(action));
        }
        return navigation != null ? new AbstractC28059e.l(new AbstractC28060f.c(navigation)) : AbstractC28059e.j.f113289a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final d m84779F(InterfaceC29354a<MenstrualCycleInsightsResponse> interfaceC29354a, String str, boolean z4) {
        if (interfaceC29354a instanceof InterfaceC29354a.e) {
            return new d.a(AbstractC28060f.b.f113295a);
        }
        if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
            return new d.b((MenstrualCycleInsightsResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), str, false, z4);
        }
        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
            return new d.b((MenstrualCycleInsightsResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), str, true, z4);
        }
        if (interfaceC29354a instanceof InterfaceC29354a.c) {
            InterfaceC29354a.c cVar = (InterfaceC29354a.c) interfaceC29354a;
            this.logger.mo85222m(AbstractC11266d.m30461o("Fetching menstrual cycle insights failed ", cVar.getErrorMessage()), new AbstractC30556a.a[0]);
            return new d.a(new AbstractC28060f.a(cVar.getErrorMessage(), str));
        }
        if (!(interfaceC29354a instanceof InterfaceC29354a.d)) {
            this.logger.mo85222m("Fetching menstrual cycle insights failed with unknown error", new AbstractC30556a.a[0]);
            return new d.a(new AbstractC28060f.a("Fetching menstrual cycle insights failed with unknown error", str));
        }
        InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
        this.logger.mo85222m(AbstractC11266d.m30461o("Fetching menstrual cycle insights failed ", dVar.getErrorMessage()), new AbstractC30556a.a[0]);
        return new d.b((MenstrualCycleInsightsResponse) dVar.getData(), str, false, false, 8, null);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ d m84780G(C28061g c28061g, InterfaceC29354a interfaceC29354a, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return c28061g.m84779F(interfaceC29354a, str, z4);
    }

    /* JADX INFO: renamed from: H */
    private final InterfaceC13058l m84781H(InterfaceC13058l interfaceC13058l) {
        return new f0(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final c m84782I(c accumulator, Integer id4, CalendarTileModel model, String date) {
        int iM84803w;
        AbstractC28060f domainResult;
        LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        java.time.LocalDate localDateOf = java.time.LocalDate.of(localDateMo133365d.getYear(), localDateMo133365d.getMonthOfYear(), localDateMo133365d.getDayOfMonth());
        java.time.LocalDate localDate = java.time.LocalDate.parse(date);
        if (id4 != null) {
            iM84803w = id4.intValue();
        } else {
            AbstractC22676k.m65747g(localDate);
            AbstractC22676k.m65747g(localDateOf);
            iM84803w = m84803w(localDate, localDateOf) + accumulator.getCurrentPage();
        }
        int i13 = iM84803w;
        accumulator.m84814e().put(Integer.valueOf(i13), model.getCalendar().getDaysOfMonth());
        if (accumulator.getDomainResult() instanceof AbstractC28060f.g) {
            List<DesignSystemModel> tiles = ((AbstractC28060f.g) accumulator.getDomainResult()).getResponse().getTiles();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tiles, 10));
            for (DesignSystemModel designSystemModel : tiles) {
                if (designSystemModel instanceof CalendarTileModel) {
                    designSystemModel = model;
                }
                arrayList.add(designSystemModel);
            }
            domainResult = new AbstractC28060f.g(MenstrualCycleInsightsResponse.copy$default(((AbstractC28060f.g) accumulator.getDomainResult()).getResponse(), null, null, arrayList, null, null, null, 59, null), C17027b.Companion.m48086b(C17027b.INSTANCE, this.locale, ((AbstractC28060f.g) accumulator.getDomainResult()).m84763c().getCurrentDate(), ((AbstractC28060f.g) accumulator.getDomainResult()).m84763c().getSelectedDate(), ((AbstractC28060f.g) accumulator.getDomainResult()).m84763c().getLatestMonthDate(), accumulator.m84814e(), false, null, 3, 96, null), ((AbstractC28060f.g) accumulator.getDomainResult()).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), i13, null, false, 48, null);
        } else {
            domainResult = accumulator.getDomainResult();
        }
        return c.m84810b(accumulator, null, domainResult, 0, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final c m84799s(c accumulator, MenstrualCycleInsightsResponse domainModel, boolean isLoading, String date, boolean isPollingActive) {
        Object next;
        LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        java.time.LocalDate localDateOf = java.time.LocalDate.of(localDateMo133365d.getYear(), localDateMo133365d.getMonthOfYear(), localDateMo133365d.getDayOfMonth());
        java.time.LocalDate localDate = java.time.LocalDate.parse(date);
        AbstractC22676k.m65747g(localDate);
        AbstractC22676k.m65747g(localDateOf);
        int iM84803w = m84803w(localDate, localDateOf) + 3;
        Iterator<T> it = domainModel.getTiles().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((DesignSystemModel) next) instanceof CalendarTileModel));
        CalendarTileModel calendarTileModel = next instanceof CalendarTileModel ? (CalendarTileModel) next : null;
        if (calendarTileModel != null) {
            accumulator.m84814e().put(Integer.valueOf(iM84803w), calendarTileModel.getCalendar().getDaysOfMonth());
        }
        C17027b c17027bM48086b = C17027b.Companion.m48086b(C17027b.INSTANCE, this.locale, localDateOf, localDate, localDateOf, accumulator.m84814e(), false, null, 3, 96, null);
        return c.m84810b(accumulator, null, isLoading ? new AbstractC28060f.h(domainModel, c17027bM48086b, date, iM84803w, isPollingActive) : new AbstractC28060f.g(domainModel, c17027bM48086b, date, iM84803w, null, isPollingActive, 16, null), 0, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final Object m84800t(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM108729b = InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, null, new e(null), interfaceC30057d, 6, null);
        return objM108729b == EnumC31071a.f128113w ? objM108729b : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final InterfaceC13058l m84801u(String date) {
        return AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new MenstrualCycleInsightsGetRequest(date), 1), AbstractC12350b.m34570S("MciOverviewRefreshScope"), null, 2, null), new f(null, this.cachedApiSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final InterfaceC13058l m84802v(String date) {
        return new g(m84801u(date), this, date);
    }

    /* JADX INFO: renamed from: w */
    private final int m84803w(java.time.LocalDate selectedDate, java.time.LocalDate latestMonthDate) {
        return (int) ChronoUnit.MONTHS.between(selectedDate.withDayOfMonth(1), latestMonthDate.withDayOfMonth(1));
    }

    /* JADX INFO: renamed from: x */
    private final InterfaceC13058l m84804x(InterfaceC13058l interfaceC13058l) {
        return this.actionInteractor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final InterfaceC13058l m84805y(Integer id4, String date, String selectedDate) {
        return new C13084s1(new u(id4, date, selectedDate, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: z */
    public final Object m84806z(InterfaceC30057d<? super d> interfaceC30057d) {
        v vVar;
        if (interfaceC30057d instanceof v) {
            vVar = (v) interfaceC30057d;
            int i13 = vVar.f113501y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                vVar.f113501y = i13 - Integer.MIN_VALUE;
            } else {
                vVar = new v(interfaceC30057d);
            }
        } else {
            vVar = new v(interfaceC30057d);
        }
        v vVar2 = vVar;
        Object objM108729b = vVar2.f113499w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = vVar2.f113501y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            w wVar = new w(null);
            vVar2.f113501y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, wVar, vVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new d.c((SymptomsScreenResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new d.a(new AbstractC28060f.a("Fetching menstrual cycle insights symptoms failed with unknown error", ""));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        k kVar = new k(upstream, this);
        return new l(new C13060l1(new c(null, null, 0, 7, null), AbstractC13091v.m36590P(new C13060l1(AbstractC28059e.j.f113289a, m84776C(AbstractC13091v.m36584J(m84781H(m84804x(new m(new h(kVar)))), new i(kVar), this.scopeEventsFlow)), new n(null)), new j(null, this)), new t(null)));
    }

    /* JADX INFO: renamed from: oo1.g$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0012¨\u0006 "}, m65681d2 = {"Loo1/g$c;", "", "", "", "", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "mapOfExistingMonths", "Loo1/f;", "domainResult", "currentPage", "<init>", "(Ljava/util/Map;Loo1/f;I)V", "a", "(Ljava/util/Map;Loo1/f;I)Loo1/g$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "b", "Loo1/f;", "d", "()Loo1/f;", "c", "I", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<Integer, List<CalendarDateModel>> mapOfExistingMonths;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC28060f domainResult;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int currentPage;

        public c(Map<Integer, List<CalendarDateModel>> mapOfExistingMonths, AbstractC28060f domainResult, int i13) {
            AbstractC22676k.m65750j(mapOfExistingMonths, "mapOfExistingMonths");
            AbstractC22676k.m65750j(domainResult, "domainResult");
            this.mapOfExistingMonths = mapOfExistingMonths;
            this.domainResult = domainResult;
            this.currentPage = i13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m84810b(c cVar, Map map, AbstractC28060f abstractC28060f, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                map = cVar.mapOfExistingMonths;
            }
            if ((i14 & 2) != 0) {
                abstractC28060f = cVar.domainResult;
            }
            if ((i14 & 4) != 0) {
                i13 = cVar.currentPage;
            }
            return cVar.m84811a(map, abstractC28060f, i13);
        }

        /* JADX INFO: renamed from: a */
        public final c m84811a(Map<Integer, List<CalendarDateModel>> mapOfExistingMonths, AbstractC28060f domainResult, int currentPage) {
            AbstractC22676k.m65750j(mapOfExistingMonths, "mapOfExistingMonths");
            AbstractC22676k.m65750j(domainResult, "domainResult");
            return new c(mapOfExistingMonths, domainResult, currentPage);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCurrentPage() {
            return this.currentPage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AbstractC28060f getDomainResult() {
            return this.domainResult;
        }

        /* JADX INFO: renamed from: e */
        public final Map<Integer, List<CalendarDateModel>> m84814e() {
            return this.mapOfExistingMonths;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.mapOfExistingMonths, cVar.mapOfExistingMonths) && AbstractC22676k.m65745e(this.domainResult, cVar.domainResult) && this.currentPage == cVar.currentPage;
        }

        public int hashCode() {
            return Integer.hashCode(this.currentPage) + ((this.domainResult.hashCode() + (this.mapOfExistingMonths.hashCode() * 31)) * 31);
        }

        public String toString() {
            Map<Integer, List<CalendarDateModel>> map = this.mapOfExistingMonths;
            AbstractC28060f abstractC28060f = this.domainResult;
            int i13 = this.currentPage;
            StringBuilder sb4 = new StringBuilder("DomainDataAccumulator(mapOfExistingMonths=");
            sb4.append(map);
            sb4.append(", domainResult=");
            sb4.append(abstractC28060f);
            sb4.append(", currentPage=");
            return AbstractC18489d0.m53371l(sb4, i13, ")");
        }

        public /* synthetic */ c(Map map, AbstractC28060f abstractC28060f, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? new LinkedHashMap() : map, (i14 & 2) != 0 ? AbstractC28060f.b.f113295a : abstractC28060f, (i14 & 4) != 0 ? 3 : i13);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C28061g(C30695c c30695c, HormonalInsightsApi hormonalInsightsApi, InterfaceC26834e interfaceC26834e, C38458b c38458b, InterfaceC41070a interfaceC41070a, InterfaceC34116n interfaceC34116n, Locale locale, AbstractC21909c abstractC21909c, C37378a c37378a, AbstractC0757c abstractC0757c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Locale locale2;
        InterfaceC34116n interfaceC34116nM107848a = (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MenstrualCycleInsightsInteractor") : interfaceC34116n;
        if ((i13 & 64) != 0) {
            Locale locale3 = Locale.getDefault();
            AbstractC22676k.m65749i(locale3, "getDefault(...)");
            locale2 = locale3;
        } else {
            locale2 = locale;
        }
        this(c30695c, hormonalInsightsApi, interfaceC26834e, c38458b, interfaceC41070a, interfaceC34116nM107848a, locale2, abstractC21909c, c37378a, abstractC0757c);
    }
}
