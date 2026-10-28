package lj0;

import ci2.InterfaceC4733b;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.metrics.domain.models.MetricPostType;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.time.Clock;
import java.util.List;
import java.util.Locale;
import jk0.InterfaceC21750d;
import jy1.C22047a;
import n83.C26460c;
import oh2.InterfaceC27939b;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import st0.AbstractC32962f;
import st0.C32959c;
import st0.C32961e;
import st0.C32963g;
import st0.C32964h;
import st0.C32965i;
import st0.C32967k;
import st0.C32970n;
import st0.EnumC32978v;
import t83.InterfaceC33616a;
import tr2.InterfaceC34116n;
import us0.InterfaceC35207c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lj0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002!(B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u000e*\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u001b*\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00105R\u0016\u00109\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00108R\u0016\u0010:\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00108R\u0014\u0010<\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010;R\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010=R\u0014\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010=R\u0016\u0010@\u001a\u0004\u0018\u00010>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010?¨\u0006A"}, m65681d2 = {"Llj0/a;", "Lus0/c;", "Liy1/c;", "metricWriter", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lci2/b;", "whoopStrapProvider", "Ljava/time/Clock;", "clock", "<init>", "(Liy1/c;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Lci2/b;Ljava/time/Clock;)V", "", "success", "Lst0/f;", "terminalPhase", "", "now", "Ll83/a0;", "j", "(ZLst0/f;J)V", "from", "terminal", "k", "(Lst0/f;Lst0/f;J)V", "", "c", "(Lst0/f;Lst0/f;)Ljava/lang/String;", "protocol", "firmwareVersion", "", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lst0/f;)Z", "i", "(Lst0/f;)Ljava/lang/String;", "to", "a", "(Lst0/f;Lst0/f;)V", "Liy1/c;", "Ltr2/n;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Lci2/b;", "e", "Ljava/time/Clock;", "f", "Z", "sawBonding", "g", "Ljava/lang/Long;", "attemptStartedAtMillis", "readyAtMillis", "Ljava/lang/String;", "sessionProtocol", "sessionFirmwareVersion", "()Z", "isEnabled", "()Ljava/lang/String;", "Lcom/whoop/domain/model/WhoopStrapInfo;", "()Lcom/whoop/domain/model/WhoopStrapInfo;", "strapInfo", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24462a implements InterfaceC35207c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean sawBonding;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Long attemptStartedAtMillis;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Long readyAtMillis;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String sessionProtocol;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String sessionFirmwareVersion;

    /* JADX INFO: renamed from: lj0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Llj0/a$b;", "", "", "tag", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "USER_INITIATED", "FAULTY", "ERROR", "UNKNOWN", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        USER_INITIATED("user_initiated"),
        FAULTY("faulty"),
        ERROR("error"),
        UNKNOWN("unknown");

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final String tag;

        b(String str) {
            this.tag = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getTag() {
            return this.tag;
        }
    }

    public C24462a(InterfaceC21030c metricWriter, InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker, InterfaceC4733b whoopStrapProvider, Clock clock) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(clock, "clock");
        this.metricWriter = metricWriter;
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
        this.whoopStrapProvider = whoopStrapProvider;
        this.clock = clock;
        this.sessionProtocol = "unknown";
        this.sessionFirmwareVersion = "unknown";
    }

    /* JADX INFO: renamed from: b */
    private final List<String> m71164b(String protocol, String firmwareVersion) {
        return AbstractC37056f.m118959K(AbstractC11266d.m30461o("protocol:", protocol), "device_class:primary_sensor", AbstractC11266d.m30461o("firmware_version:", firmwareVersion), "pipeline_version:legacy");
    }

    /* JADX INFO: renamed from: c */
    private final String m71165c(AbstractC32962f from, AbstractC32962f terminal) {
        if (terminal instanceof C32965i) {
            return AbstractC25012a.m73373f(((C32965i) terminal).getCode(), b.ERROR.getTag(), "_");
        }
        if (AbstractC22676k.m65745e(terminal, C32967k.f137296a)) {
            return b.FAULTY.getTag();
        }
        return AbstractC22676k.m65745e(from, C32964h.f137292a) ? b.USER_INITIATED.getTag() : b.UNKNOWN.getTag();
    }

    /* JADX INFO: renamed from: d */
    private final String m71166d() {
        WhoopStrapInfo whoopStrapInfo;
        InterfaceC27939b maximVersion;
        String strMo84319a;
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        return (interfaceC21750d == null || (whoopStrapInfo = interfaceC21750d.get_strapInfo()) == null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null || (strMo84319a = maximVersion.mo84319a()) == null) ? "unknown" : strMo84319a;
    }

    /* JADX INFO: renamed from: e */
    private final String m71167e() {
        String codeName;
        EnumC32978v whoopDeviceType;
        WhoopStrapInfo whoopStrapInfoM71168f = m71168f();
        if (whoopStrapInfoM71168f == null || (whoopDeviceType = whoopStrapInfoM71168f.getWhoopDeviceType()) == null || (codeName = whoopDeviceType.getCodeName()) == null) {
            codeName = "unknown";
        }
        String lowerCase = codeName.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: f */
    private final WhoopStrapInfo m71168f() {
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        if (interfaceC21750d != null) {
            return interfaceC21750d.get_strapInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private final boolean m71169g() {
        return this.featureFlagChecker.isFeatureEnabled(ConnectivityFeatureFlagsKt.DROID_BLE_PIPELINE_LEGACY_OBS);
    }

    /* JADX INFO: renamed from: h */
    private final boolean m71170h(AbstractC32962f abstractC32962f) {
        return AbstractC22676k.m65745e(abstractC32962f, C32963g.f137291a) || AbstractC22676k.m65745e(abstractC32962f, C32967k.f137296a) || (abstractC32962f instanceof C32965i);
    }

    /* JADX INFO: renamed from: i */
    private final String m71171i(AbstractC32962f abstractC32962f) {
        if (abstractC32962f instanceof C32965i) {
            return "Error";
        }
        String string = abstractC32962f.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: j */
    private final void m71172j(boolean success, AbstractC32962f terminalPhase, long now) {
        Long l7 = this.attemptStartedAtMillis;
        if (l7 != null) {
            long jLongValue = l7.longValue();
            this.attemptStartedAtMillis = null;
            long j7 = now - jLongValue;
            String str = success ? "success" : "failure";
            String strM71167e = m71167e();
            String strM71166d = m71166d();
            InterfaceC34116n interfaceC34116n = this.logger;
            StringBuilder sbM73379l = AbstractC25012a.m73379l("Legacy pair completed: status=", str, " is_pair=", " duration_ms=", this.sawBonding);
            sbM73379l.append(j7);
            sbM73379l.append(" protocol=");
            sbM73379l.append(strM71167e);
            interfaceC34116n.mo85216g(sbM73379l.toString(), new AbstractC30556a.a[0]);
            InterfaceC21030c interfaceC21030c = this.metricWriter;
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            c26460cM119000x.add("terminal_status:".concat(str));
            c26460cM119000x.add("is_pair:" + this.sawBonding);
            if (terminalPhase != null) {
                c26460cM119000x.add("phase:" + m71171i(terminalPhase));
            }
            c26460cM119000x.addAll(m71164b(strM71167e, strM71166d));
            interfaceC21030c.mo58701b(new C22047a(0, "connectivity.ble_pipeline.pair.completed", null, AbstractC37056f.m118988k(c26460cM119000x), MetricPostType.COUNT, 5, null));
            InterfaceC21030c interfaceC21030c2 = this.metricWriter;
            Double dValueOf = Double.valueOf(j7);
            C26460c c26460cM119000x2 = AbstractC37056f.m119000x();
            c26460cM119000x2.add("terminal_status:".concat(str));
            c26460cM119000x2.add("is_pair:" + this.sawBonding);
            c26460cM119000x2.addAll(m71164b(strM71167e, strM71166d));
            interfaceC21030c2.mo58701b(new C22047a(0, "connectivity.ble_pipeline.connection.attempt_duration_ms", dValueOf, AbstractC37056f.m118988k(c26460cM119000x2), MetricPostType.DISTRIBUTION, 1, null));
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m71173k(AbstractC32962f from, AbstractC32962f terminal, long now) {
        Long l7 = this.readyAtMillis;
        if (l7 != null) {
            long jLongValue = l7.longValue();
            this.readyAtMillis = null;
            long j7 = now - jLongValue;
            String strM71165c = m71165c(from, terminal);
            this.logger.mo85216g(AbstractC25012a.m73376i(" protocol=", this.sessionProtocol, AbstractC36095b.m114685m("Legacy session ended: duration_ms=", " cause=", j7, strM71165c)), new AbstractC30556a.a[0]);
            InterfaceC21030c interfaceC21030c = this.metricWriter;
            Double dValueOf = Double.valueOf(j7);
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            c26460cM119000x.add("disconnect_cause:" + strM71165c);
            c26460cM119000x.addAll(m71164b(this.sessionProtocol, this.sessionFirmwareVersion));
            interfaceC21030c.mo58701b(new C22047a(0, "connectivity.ble_pipeline.connection.session_duration_ms", dValueOf, AbstractC37056f.m118988k(c26460cM119000x), MetricPostType.DISTRIBUTION, 1, null));
        }
    }

    @Override // us0.InterfaceC35207c
    /* JADX INFO: renamed from: a */
    public void mo71174a(AbstractC32962f from, AbstractC32962f to3) {
        AbstractC22676k.m65750j(from, "from");
        AbstractC22676k.m65750j(to3, "to");
        if (m71169g()) {
            if (from.equals(C32963g.f137291a) && to3.equals(C32961e.f137290a)) {
                this.sawBonding = false;
                this.attemptStartedAtMillis = Long.valueOf(this.clock.millis());
                return;
            }
            if (to3.equals(C32959c.f137288a)) {
                this.sawBonding = true;
                return;
            }
            if (to3.equals(C32970n.f137298a)) {
                long jMillis = this.clock.millis();
                m71172j(true, null, jMillis);
                this.readyAtMillis = Long.valueOf(jMillis);
                this.sessionProtocol = m71167e();
                this.sessionFirmwareVersion = m71166d();
                return;
            }
            if (m71170h(to3)) {
                long jMillis2 = this.clock.millis();
                m71172j(false, from, jMillis2);
                m71173k(from, to3, jMillis2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C24462a(InterfaceC21030c interfaceC21030c, InterfaceC34116n interfaceC34116n, FeatureFlagChecker featureFlagChecker, InterfaceC4733b interfaceC4733b, Clock clock, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 16) != 0) {
            clock = Clock.systemUTC();
            AbstractC22676k.m65749i(clock, "systemUTC(...)");
        }
        this(interfaceC21030c, interfaceC34116n, featureFlagChecker, interfaceC4733b, clock);
    }
}
