package gl1;

import android.os.LocaleList;
import androidx.core.app.NotificationCompat;
import b11.C2281h;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ca2.C4361a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import em1.AbstractC13341o;
import fi0.InterfaceC14515a;
import fm1.C14605i;
import fm1.EnumC14603g;
import fm1.EnumC14604h;
import fm1.EnumC14606j;
import hf1.InterfaceC17235b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import n83.C26463f;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import q92.C30076h;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sl1.AbstractC32703b;
import sl1.C32702a;
import tr2.InterfaceC34116n;
import xl1.EnumC38451a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: gl1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 32\u00020\u0001:\u0002\u008c\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u008f\u0001\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00142\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b&\u0010'J;\u0010-\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010*\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010,\u001a\u00020\u0014¢\u0006\u0004\b-\u0010.J)\u0010/\u001a\u00020\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010*\u001a\u00020\u00142\b\b\u0002\u0010,\u001a\u00020\u0014¢\u0006\u0004\b/\u00100J\u001d\u00103\u001a\u00020\"2\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\"¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\"¢\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\"2\u0006\u0010:\u001a\u00020\u0014¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u0014¢\u0006\u0004\b=\u0010<J\r\u0010>\u001a\u00020\"¢\u0006\u0004\b>\u00106J\r\u0010?\u001a\u00020\"¢\u0006\u0004\b?\u00106J!\u0010B\u001a\u00020\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bD\u00109J!\u0010G\u001a\u00020\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HJ\u0015\u0010K\u001a\u00020\"2\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\u0015\u0010O\u001a\u00020\"2\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ\u0015\u0010S\u001a\u00020\"2\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bU\u00109J\u0017\u0010V\u001a\u00020\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bV\u00109J)\u0010W\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010,\u001a\u00020\u0014¢\u0006\u0004\bW\u0010XJ\u0015\u0010[\u001a\u00020\"2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b[\u0010\\J\u001d\u0010^\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u00182\u0006\u0010]\u001a\u00020\u0018¢\u0006\u0004\b^\u00104J\u0015\u0010`\u001a\u00020\"2\u0006\u0010_\u001a\u00020\u0018¢\u0006\u0004\b`\u0010aJ\u0015\u0010c\u001a\u00020\"2\u0006\u0010b\u001a\u00020\u0018¢\u0006\u0004\bc\u0010aJ\u0015\u0010d\u001a\u00020\"2\u0006\u0010b\u001a\u00020\u0018¢\u0006\u0004\bd\u0010aJ\u001d\u0010g\u001a\u00020\"2\u0006\u0010f\u001a\u00020e2\u0006\u0010)\u001a\u00020\u0018¢\u0006\u0004\bg\u0010hJ\u0015\u0010i\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0018¢\u0006\u0004\bi\u0010aJ\u0015\u0010k\u001a\u00020\"2\u0006\u0010j\u001a\u00020\u0014¢\u0006\u0004\bk\u0010<J\r\u0010l\u001a\u00020\"¢\u0006\u0004\bl\u00106J\r\u0010m\u001a\u00020\"¢\u0006\u0004\bm\u00106J\u0015\u0010o\u001a\u00020\"2\u0006\u0010n\u001a\u00020\u0014¢\u0006\u0004\bo\u0010<J\r\u0010p\u001a\u00020\"¢\u0006\u0004\bp\u00106J\r\u0010q\u001a\u00020\"¢\u0006\u0004\bq\u00106J\r\u0010r\u001a\u00020\"¢\u0006\u0004\br\u00106J\r\u0010s\u001a\u00020\"¢\u0006\u0004\bs\u00106J\r\u0010t\u001a\u00020\"¢\u0006\u0004\bt\u00106J\r\u0010u\u001a\u00020\"¢\u0006\u0004\bu\u00106J\u0015\u0010v\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0018¢\u0006\u0004\bv\u0010aJ\r\u0010w\u001a\u00020\"¢\u0006\u0004\bw\u00106J\r\u0010x\u001a\u00020\"¢\u0006\u0004\bx\u00106J\r\u0010y\u001a\u00020\"¢\u0006\u0004\by\u00106J\r\u0010z\u001a\u00020\"¢\u0006\u0004\bz\u00106J\u0017\u0010{\u001a\u00020\"2\b\b\u0002\u0010,\u001a\u00020\u0014¢\u0006\u0004\b{\u0010<J\u0017\u0010|\u001a\u00020\"2\b\b\u0002\u0010,\u001a\u00020\u0014¢\u0006\u0004\b|\u0010<Jd\u0010\u0082\u0001\u001a\u00020\"2\u0006\u0010}\u001a\u00020\u00182\n\b\u0002\u0010~\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u007f\u001a\u0004\u0018\u00010\u00182\u001a\b\u0002\u0010\u0081\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0080\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0085\u0001\u001a\u00020\"2\u0007\u0010Z\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u000f\u0010\u0087\u0001\u001a\u00020\"¢\u0006\u0005\b\u0087\u0001\u00106J\u001c\u0010\u008a\u0001\u001a\u00020\"2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010\u0090\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bi\u0010\u0091\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010\u0092\u0001R\u001f\u0010\u0095\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0093\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010\u0094\u0001R\u0017\u0010\u0098\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bc\u0010\u0097\u0001¨\u0006\u0099\u0001"}, m65681d2 = {"Lgl1/b;", "", "Lfi0/a;", "analytics", "Lq92/h;", "whoopStrapSharedPrefs", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lhf1/b;", "experimentsChecker", "Lbc3/c0;", "coroutineScope", "<init>", "(Lfi0/a;Lq92/h;Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;Lbc3/c0;)V", "Lfm1/g;", "sourcePillar", "", "textScale", "Landroid/os/LocaleList;", "locales", "", "isMultiDayCycle", "isGDCFlow", "", "", "notificationAnalytics", "sleepState", "hideRecovery", "Lxl1/a;", "displayCycleState", "revampedHome", "Lfm1/i;", "streaksHomeViewState", "ltoOfferVisible", "Ll83/a0;", "B", "(Lfm1/g;FLandroid/os/LocaleList;ZZLjava/util/List;Ljava/lang/String;ZLxl1/a;ZLfm1/i;Ljava/lang/Boolean;)V", "opened", "r", "(ZLfm1/g;)V", "isStart", "source", "fromFab", "isGdcFlow", "fromMyDay", "c", "(ZLjava/lang/String;ZLjava/lang/Boolean;Z)V", "Y", "(Lfm1/g;ZZ)V", "screenName", "autoPopId", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;)V", "S", "()V", "o", "T", "(Lfm1/g;)V", "gdcFlow", "e", "(Z)V", "i", "V", "P", "Ljava/time/LocalDate;", "selectedDate", "D", "(Lfm1/g;Ljava/time/LocalDate;)V", "R", "Lb11/h;", "connectivityIndicatorState", "j", "(Lfm1/g;Lb11/h;)V", "Lsl1/a;", "indicatorResult", "k", "(Lsl1/a;)V", "Lca2/a;", "dataCatchingUpResult", "G", "(Lca2/a;)V", "Lsl1/b;", "tileType", "l", "(Lsl1/b;)V", "O", "C", "A", "(ZLfm1/g;Z)V", "Lfm1/j;", NotificationCompat.CATEGORY_EVENT, "n", "(Lfm1/j;)V", "action", "Z", "pillarType", "s", "(Ljava/lang/String;)V", "label", "g", "f", "", "cycleId", "Q", "(JLjava/lang/String;)V", "d", "isOnboarding", "m", "W", "U", "isInPlan", "X", "z", "N", "J", "M", "I", "L", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "y", "x", "K", "F", "p", "q", "eventName", "category", "value", "", "otherProperties", "t", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lem1/o;", "v", "(Lem1/o;)V", "E", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "H", "(Lcom/whoop/analytics/AnalyticEventModel;)V", "a", "Lfi0/a;", "b", "Lq92/h;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lhf1/b;", "Lbc3/c0;", "Lec3/p1;", "Lec3/p1;", "connectivityIndicatorEventFlow", "Ltr2/n;", "Ltr2/n;", "logger", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15967b {

    /* JADX INFO: renamed from: i */
    public static final int f60441i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30076h whoopStrapSharedPrefs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13075p1 connectivityIndicatorEventFlow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: gl1.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60449a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f60450b;

        static {
            int[] iArr = new int[EnumC38451a.values().length];
            try {
                iArr[EnumC38451a.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38451a.PROCESS_NOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC38451a.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC38451a.ADD_SLEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f60449a = iArr;
            int[] iArr2 = new int[EnumC14604h.values().length];
            try {
                iArr2[EnumC14604h.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC14604h.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC14604h.BROKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC14604h.FROZEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f60450b = iArr2;
        }
    }

    /* JADX INFO: renamed from: gl1.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.home.analytics.HomeAnalyticsHelper$pillarNavigationEvent$4", m100430f = "HomeAnalyticsHelper.kt", m100431l = {138}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f60451w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Map<String, Object> f60453y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22669g0 f60454z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map<String, Object> map, C22669g0 c22669g0, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f60453y = map;
            this.f60454z = c22669g0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C15967b.this.new c(this.f60453y, this.f60454z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60451w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC17235b interfaceC17235b = C15967b.this.experimentsChecker;
                this.f60451w = 1;
                obj = interfaceC17235b.mo48744c(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f60453y.put("experiment_properties", (Map) obj);
            C15967b.this.analytics.mo41423e((String) this.f60454z.f89336w, this.f60453y);
            return C23454a0.f92919a;
        }
    }

    public C15967b(InterfaceC14515a analytics, C30076h whoopStrapSharedPrefs, FeatureFlagChecker featureFlagChecker, InterfaceC17235b experimentsChecker, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.analytics = analytics;
        this.whoopStrapSharedPrefs = whoopStrapSharedPrefs;
        this.featureFlagChecker = featureFlagChecker;
        this.experimentsChecker = experimentsChecker;
        this.coroutineScope = coroutineScope;
        this.connectivityIndicatorEventFlow = AbstractC13091v.m36593c(null);
        this.logger = InterfaceC34116n.INSTANCE.m107848a("HomeAnalyticsHelper");
    }

    /* JADX INFO: renamed from: H */
    private final void m45046H(AnalyticEventModel analyticEvent) {
        String name = analyticEvent.getName();
        String category = analyticEvent.getCategory();
        String action = analyticEvent.getAction();
        String label = analyticEvent.getLabel();
        String value = analyticEvent.getValue();
        C26463f c26463f = new C26463f();
        String source = analyticEvent.getSource();
        if (source != null) {
        }
        for (Map.Entry<String, JsonElement> entry : analyticEvent.getProperties().entrySet()) {
            String key = entry.getKey();
            JsonElement value2 = entry.getValue();
            if (value2 != null) {
                c26463f.put(key, value2.toString());
            }
        }
        C26463f c26463fM78380b = c26463f.m78380b();
        if (c26463fM78380b.isEmpty()) {
            c26463fM78380b = null;
        }
        m45092t(name, category, action, label, value, c26463fM78380b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m45049u(C15967b c15967b, String str, String str2, String str3, String str4, String str5, Map map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 8) != 0) {
            str4 = null;
        }
        if ((i13 & 16) != 0) {
            str5 = null;
        }
        if ((i13 & 32) != 0) {
            map = null;
        }
        c15967b.m45092t(str, str2, str3, str4, str5, map);
    }

    /* JADX INFO: renamed from: A */
    public final void m45050A(boolean fromFab, EnumC14603g sourcePillar, boolean fromMyDay) {
        String str;
        Map mapM95645u;
        if (fromMyDay) {
            str = "my_day";
        } else {
            str = fromFab ? "FAB" : "Feed";
        }
        if (fromMyDay) {
            mapM95645u = AbstractC31061c.m95645u("source", "my_day");
        } else {
            mapM95645u = sourcePillar != null ? AbstractC31061c.m95645u("source", AbstractC15968c.m45104g(sourcePillar)) : null;
        }
        m45049u(this, "Workout Builder", null, "Open", str, null, mapM95645u, 18, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m45051B(EnumC14603g sourcePillar, float textScale, LocaleList locales, boolean isMultiDayCycle, boolean isGDCFlow, List<String> notificationAnalytics, String sleepState, boolean hideRecovery, EnumC38451a displayCycleState, boolean revampedHome, C14605i streaksHomeViewState, Boolean ltoOfferVisible) {
        List listM125906y0;
        String streakValue;
        EnumC14604h streakState;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(sourcePillar, "sourcePillar");
        AbstractC22676k.m65750j(locales, "locales");
        AbstractC22676k.m65750j(notificationAnalytics, "notificationAnalytics");
        AbstractC22676k.m65750j(displayCycleState, "displayCycleState");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("new_home", Boolean.TRUE));
        C22669g0 c22669g0 = new C22669g0();
        String strM45104g = AbstractC15968c.m45104g(sourcePillar);
        c22669g0.f89336w = strM45104g;
        if (sourcePillar != EnumC14603g.OVERVIEW) {
            this.analytics.mo41423e(strM45104g, linkedHashMapM73993b0);
            return;
        }
        if (locales.isEmpty()) {
            listM125906y0 = null;
        } else {
            String languageTags = locales.toLanguageTags();
            AbstractC22676k.m65749i(languageTags, "toLanguageTags(...)");
            listM125906y0 = AbstractC39414r.m125906y0(languageTags, new String[]{","}, 6);
        }
        linkedHashMapM73993b0.put("text_scaled", Float.valueOf(textScale));
        if (listM125906y0 != null && (str4 = (String) AbstractC25265s.m74100H0(listM125906y0)) != null) {
            linkedHashMapM73993b0.put("first_language_preference", str4);
        }
        if (listM125906y0 != null && (str3 = (String) AbstractC25265s.m74102I0(1, listM125906y0)) != null) {
            linkedHashMapM73993b0.put("second_language_preference", str3);
        }
        if (listM125906y0 != null && (str2 = (String) AbstractC25265s.m74102I0(2, listM125906y0)) != null) {
            linkedHashMapM73993b0.put("third_language_preference", str2);
        }
        linkedHashMapM73993b0.put("isMultiDayCycle", Boolean.valueOf(isMultiDayCycle));
        linkedHashMapM73993b0.put("GDCMDC", Boolean.valueOf(isGDCFlow));
        String str5 = "null";
        if (displayCycleState == EnumC38451a.PROCESS_NOW) {
            linkedHashMapM73993b0.put("sleepState", "detected");
        } else {
            linkedHashMapM73993b0.put("sleepState", sleepState == null ? "null" : sleepState);
        }
        int i13 = b.f60449a[displayCycleState.ordinal()];
        if (i13 == 1) {
            str5 = "normal";
        } else if (i13 == 2) {
            str5 = "detected";
        } else if (i13 == 3) {
            str5 = "pending";
        } else if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        linkedHashMapM73993b0.put("cycleState", str5);
        linkedHashMapM73993b0.put("hide_recovery", Boolean.valueOf(hideRecovery));
        linkedHashMapM73993b0.put("notifications", notificationAnalytics);
        linkedHashMapM73993b0.put("revamped_home_2024", Boolean.valueOf(revampedHome));
        c22669g0.f89336w = "Overview";
        linkedHashMapM73993b0.put("streak_visible", Boolean.valueOf(streaksHomeViewState != null && streaksHomeViewState.getShouldShowStreaks()));
        String str6 = "";
        if (streaksHomeViewState == null || (streakValue = streaksHomeViewState.getStreakValue()) == null) {
            streakValue = "";
        }
        linkedHashMapM73993b0.put("streak_value", streakValue);
        if (streaksHomeViewState != null && (streakState = streaksHomeViewState.getStreakState()) != null) {
            int i14 = b.f60450b[streakState.ordinal()];
            if (i14 == 1) {
                str = "healthy";
            } else if (i14 == 2) {
                str = "at risk";
            } else if (i14 == 3) {
                str = "broken";
            } else {
                if (i14 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "frozen";
            }
            str6 = str;
        }
        linkedHashMapM73993b0.put("streak_state", str6);
        linkedHashMapM73993b0.put("lto_offer_visible", Boolean.valueOf(ltoOfferVisible != null ? ltoOfferVisible.booleanValue() : false));
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(linkedHashMapM73993b0, c22669g0, null), 3);
    }

    /* JADX INFO: renamed from: C */
    public final void m45052C(EnumC14603g sourcePillar) {
        m45049u(this, "Pull to Refresh", "Reviewing Data", "Pull", null, null, sourcePillar != null ? AbstractC31061c.m95645u("source", AbstractC15968c.m45104g(sourcePillar)) : null, 24, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m45053D(EnumC14603g sourcePillar, LocalDate selectedDate) {
        m45049u(this, "Navigation - Select Calendar Date", "Navigation", "Select", selectedDate != null ? selectedDate.toString() : null, null, sourcePillar != null ? AbstractC31061c.m95645u("source", AbstractC15968c.m45104g(sourcePillar)) : null, 16, null);
    }

    /* JADX INFO: renamed from: E */
    public final void m45054E() {
        m45049u(this, "Medicare ACCESS", "personalize_care_plan", "program_setup_start", null, null, null, 56, null);
    }

    /* JADX INFO: renamed from: F */
    public final void m45055F() {
        m45049u(this, "Daily Outlook Discoverability Enabled", "Experiment", null, null, String.valueOf(this.featureFlagChecker.isFeatureEnabled("daily-outlook-discoverability")), null, 44, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m45056G(C4361a dataCatchingUpResult) {
        AbstractC22676k.m65750j(dataCatchingUpResult, "dataCatchingUpResult");
        m45049u(this, "Data - Catching Up", "Home", null, String.valueOf(dataCatchingUpResult.getMinutesBehind()), null, new LinkedHashMap(), 20, null);
    }

    /* JADX INFO: renamed from: I */
    public final void m45057I() {
        this.analytics.mo41421c("Tombstone Prompt", "Connectivity", this.whoopStrapSharedPrefs.m92198d(), this.whoopStrapSharedPrefs.m92199e(), this.whoopStrapSharedPrefs.m92200f(), "Accept", "Hard", null, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m45058J() {
        this.analytics.mo41421c("Tombstone dialog displayed", "Connectivity", this.whoopStrapSharedPrefs.m92198d(), this.whoopStrapSharedPrefs.m92199e(), this.whoopStrapSharedPrefs.m92200f(), null, "Hard", null, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m45059K() {
        m45049u(this, "Day 0-1 Transition", "Onboarding", "Completed", null, null, null, 56, null);
    }

    /* JADX INFO: renamed from: L */
    public final void m45060L() {
        this.analytics.mo41421c("Tombstone Prompt", "Connectivity", this.whoopStrapSharedPrefs.m92198d(), this.whoopStrapSharedPrefs.m92199e(), this.whoopStrapSharedPrefs.m92200f(), "Accept", "Soft", null, null);
    }

    /* JADX INFO: renamed from: M */
    public final void m45061M() {
        this.analytics.mo41421c("Tombstone Prompt", "Connectivity", this.whoopStrapSharedPrefs.m92198d(), this.whoopStrapSharedPrefs.m92199e(), this.whoopStrapSharedPrefs.m92200f(), "Dismiss", "Soft", null, null);
    }

    /* JADX INFO: renamed from: N */
    public final void m45062N() {
        this.analytics.mo41421c("Tombstone dialog displayed", "Connectivity", this.whoopStrapSharedPrefs.m92198d(), this.whoopStrapSharedPrefs.m92199e(), this.whoopStrapSharedPrefs.m92200f(), null, "Soft", null, null);
    }

    /* JADX INFO: renamed from: O */
    public final void m45063O(EnumC14603g sourcePillar) {
        String strM45104g;
        if (sourcePillar == EnumC14603g.OVERVIEW) {
            strM45104g = "Overview";
        } else {
            strM45104g = sourcePillar != null ? AbstractC15968c.m45104g(sourcePillar) : null;
        }
        m45049u(this, "Share Data - View Data", "Community", "Open", strM45104g, null, null, 48, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m45064P() {
        m45049u(this, "Review Sleep - Sleep Needed", "Reviewing Data", "Click Learn More", null, null, AbstractC31061c.m95645u("source", "Sleep Pillar"), 24, null);
    }

    /* JADX INFO: renamed from: Q */
    public final void m45065Q(long cycleId, String source) {
        String str;
        AbstractC22676k.m65750j(source, "source");
        if (source.equals("Sleep Process Card")) {
            str = "home screen card";
        } else {
            str = source.equals("Sleep Process Button") ? "home screen button" : source;
        }
        m45049u(this, "Process Now Requested", "Sleep", "Click", null, null, AbstractC25247g0.m73990Y(new C23465k("source", str), new C23465k("cycleId", Long.valueOf(cycleId))), 24, null);
        m45049u(this, "Process Now", "Recording Data", "Process Now", null, null, AbstractC25247g0.m73990Y(new C23465k("source", "Overview Pillar"), new C23465k("cycleId", Long.valueOf(cycleId)), new C23465k("Feature Name", source)), 24, null);
    }

    /* JADX INFO: renamed from: R */
    public final void m45066R(EnumC14603g sourcePillar) {
        m45049u(this, "Navigation - View Calendar Date Selector", "Navigation", "View", null, null, sourcePillar != null ? AbstractC31061c.m95645u("source", AbstractC15968c.m45104g(sourcePillar)) : null, 24, null);
    }

    /* JADX INFO: renamed from: S */
    public final void m45067S() {
        m45049u(this, "Home Error", "Home", "View", null, null, null, 56, null);
    }

    /* JADX INFO: renamed from: T */
    public final void m45068T(EnumC14603g sourcePillar) {
        m45049u(this, "Viewed Onboarding Tasklist", "Onboarding", null, null, null, sourcePillar != null ? AbstractC31061c.m95645u("source", AbstractC15968c.m45104g(sourcePillar)) : null, 28, null);
    }

    /* JADX INFO: renamed from: U */
    public final void m45069U() {
        m45049u(this, "MCI", "MCI", "view_overview", null, null, AbstractC31061c.m95645u("source", "overview"), 24, null);
    }

    /* JADX INFO: renamed from: V */
    public final void m45070V() {
        m45049u(this, "Sleep Needed - Open", "Reviewing Data", "Open", null, null, AbstractC31061c.m95645u("source", "Sleep Pillar"), 24, null);
    }

    /* JADX INFO: renamed from: W */
    public final void m45071W() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Source", "Notification Deeplink");
        m45049u(this, "Weekly Plan", "Plan Summary", "View", null, null, linkedHashMap, 24, null);
    }

    /* JADX INFO: renamed from: X */
    public final void m45072X(boolean isInPlan) {
        if (isInPlan) {
            m45049u(this, "Overview Tile", "Plans", "Click", "view_my_plan", null, null, 48, null);
        } else {
            m45049u(this, "Overview Tile", "Plans", "Click", "explore_plans", null, null, 48, null);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m45073Y(EnumC14603g sourcePillar, boolean fromFab, boolean fromMyDay) {
        String str;
        Map mapM95645u;
        if (fromMyDay) {
            str = "my_day";
        } else {
            str = fromFab ? "FAB" : "Feed";
        }
        if (fromMyDay) {
            mapM95645u = AbstractC31061c.m95645u("source", "my_day");
        } else {
            mapM95645u = sourcePillar != null ? AbstractC31061c.m95645u("source", AbstractC15968c.m45104g(sourcePillar)) : null;
        }
        m45049u(this, "WHOOP Live - Open", "Recording Data", "Open", str, null, mapM95645u, 16, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m45074Z(String source, String action) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(action, "action");
        m45049u(this, "Server Alert", null, action, "Maintenance", null, AbstractC31061c.m95645u("source", source), 18, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m45075c(boolean isStart, String source, boolean fromFab, Boolean isGdcFlow, boolean fromMyDay) {
        String str;
        String str2 = isStart ? "Start Activity - Open" : "Add Activity - Open";
        if (fromMyDay) {
            source = "my_day";
        } else if (fromFab) {
            source = "FAB";
        }
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA) || this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
            str = null;
        } else if (fromMyDay) {
            str = "my_day";
        } else {
            str = fromFab ? "FAB" : "Feed";
        }
        m45049u(this, str2, "Recording Data", "Open", str, null, source != null ? AbstractC25247g0.m73990Y(new C23465k("source", source), new C23465k("GDCflow", isGdcFlow)) : null, 16, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m45076d(String source) {
        AbstractC22676k.m65750j(source, "source");
        m45049u(this, "Process Now", "Recording Data", "Process Now", null, null, AbstractC25247g0.m73990Y(new C23465k("source", "Overview Pillar"), new C23465k("Feature Name", source)), 24, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m45077e(boolean gdcFlow) {
        m45049u(this, "Add Sleep - Open", "Recording Data", "Open", null, null, AbstractC36095b.m114688p(Boolean.valueOf(gdcFlow), "GDCflow"), 24, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m45078f(String label) {
        AbstractC22676k.m65750j(label, "label");
        m45049u(this, "Homepage Alert", "Overview Screen", "Banner Clicked", label, null, null, 48, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m45079g(String label) {
        AbstractC22676k.m65750j(label, "label");
        m45049u(this, "Homepage Alert", "Overview Screen", "Banner Viewable", label, null, null, 48, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m45080h(String screenName, String autoPopId) {
        AbstractC22676k.m65750j(screenName, "screenName");
        AbstractC22676k.m65750j(autoPopId, "autoPopId");
        m45049u(this, "Autopop - Presented", "Home", "View", null, null, AbstractC25247g0.m73990Y(new C23465k("screen_name", screenName), new C23465k("autopop_id", autoPopId)), 24, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m45081i(boolean isGdcFlow) {
        m45049u(this, "Add Sleep - Cancel", "Recording Data", null, null, null, AbstractC36095b.m114688p(Boolean.valueOf(isGdcFlow), "GDCflow"), 28, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m45082j(EnumC14603g sourcePillar, C2281h connectivityIndicatorState) {
        TextResource chargeLabel;
        m45092t("Settings - Device Settings", "Navigation", "Press", connectivityIndicatorState != null ? AbstractC15968c.m45102e(connectivityIndicatorState.getConnectivityIndicatorStatusType()) : null, (connectivityIndicatorState == null || (chargeLabel = connectivityIndicatorState.getChargeLabel()) == null) ? null : AbstractC8693b.m21268b(chargeLabel), sourcePillar != null ? AbstractC31061c.m95645u("source", AbstractC15968c.m45104g(sourcePillar)) : null);
    }

    /* JADX INFO: renamed from: k */
    public final void m45083k(C32702a indicatorResult) {
        AbstractC22676k.m65750j(indicatorResult, "indicatorResult");
        String strM45101d = AbstractC15968c.m45101d(indicatorResult);
        if (strM45101d == null || strM45101d.equals(((C13045h2) this.connectivityIndicatorEventFlow).getValue())) {
            return;
        }
        m45049u(this, "Home Screen - Connectivity Indicator", "Homepage", "Viewed", strM45101d, null, null, 48, null);
        C13045h2 c13045h2 = (C13045h2) this.connectivityIndicatorEventFlow;
        c13045h2.getClass();
        c13045h2.m36571k(null, strM45101d);
    }

    /* JADX INFO: renamed from: l */
    public final void m45084l(AbstractC32703b tileType) {
        AbstractC22676k.m65750j(tileType, "tileType");
        String strM45103f = AbstractC15968c.m45103f(tileType);
        if (strM45103f != null) {
            m45049u(this, "Home Screen - Connectivity Tile", "Homepage", "Viewed", strM45103f, null, null, 48, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m45085m(boolean isOnboarding) {
        m45049u(this, "Customize Overview", "Home", "Open", null, null, AbstractC36095b.m114688p(Boolean.valueOf(isOnboarding), "onboarding"), 24, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m45086n(EnumC14606j event) {
        AbstractC22676k.m65750j(event, "event");
        EnumC14606j enumC14606j = EnumC14606j.NEXT_CYCLE;
        m45049u(this, event == enumC14606j ? "Navigation - Press Next Date" : "Navigation - Press Previous Date", "Navigation", "Press", event == enumC14606j ? "Next Date" : "Previous Date", null, null, 48, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m45087o() {
        m45049u(this, "Home Error", "Home", "Try Again", null, null, null, 56, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m45088p(boolean fromMyDay) {
        String str = fromMyDay ? "my_day" : null;
        m45049u(this, "FAB", "Navigation", "Click", null, null, str != null ? AbstractC31061c.m95645u("source", str) : null, 24, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m45089q(boolean fromMyDay) {
        String str = fromMyDay ? "my_day" : null;
        m45049u(this, "FAB", "Navigation", "Click", null, null, str != null ? AbstractC31061c.m95645u("source", str) : null, 24, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m45090r(boolean opened, EnumC14603g sourcePillar) {
        m45049u(this, "FAB", "Navigation", opened ? "Open" : "Close", null, null, sourcePillar != null ? AbstractC31061c.m95645u("source", AbstractC15968c.m45104g(sourcePillar)) : null, 24, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m45091s(String pillarType) {
        AbstractC22676k.m65750j(pillarType, "pillarType");
        m45049u(this, "Home Pillar Bottom", "Navigation", null, null, null, AbstractC25247g0.m73989X(new C23465k("source", pillarType)), 28, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m45092t(String eventName, String category, String action, String label, String value, Map<String, ? extends Object> otherProperties) {
        AbstractC22676k.m65750j(eventName, "eventName");
        this.analytics.mo41422d(category, action, label, eventName, value, otherProperties);
    }

    /* JADX INFO: renamed from: v */
    public final void m45093v(AbstractC13341o event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC13341o.a) {
            m45079g(((AbstractC13341o.a) event).getNavType());
            return;
        }
        if (event instanceof AbstractC13341o.d) {
            m45046H(((AbstractC13341o.d) event).getAnalyticEvent());
        } else if (event instanceof AbstractC13341o.b) {
            m45046H(((AbstractC13341o.b) event).getAnalyticEvent());
        } else {
            if (!(event instanceof AbstractC13341o.c)) {
                throw new NoWhenBranchMatchedException();
            }
            m45046H(((AbstractC13341o.c) event).getAnalyticEvent());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m45094w(String source) {
        AbstractC22676k.m65750j(source, "source");
        if (source.equals("ARRHYTHMIA_DETECTED")) {
            m45049u(this, "Push notifications", "Notifications", "Click", "ARRHYTHMIA_DETECTED", null, null, 48, null);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m45095x() {
        m45049u(this, "Day 1 Overlay", "Onboarding", "CTA", null, null, null, 56, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m45096y() {
        m45049u(this, "Day 1 Overlay", "Onboarding", "View", null, null, null, 56, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m45097z() {
        m45049u(this, "Overview Tile", "Plans", "Expand", null, null, null, 56, null);
    }
}
