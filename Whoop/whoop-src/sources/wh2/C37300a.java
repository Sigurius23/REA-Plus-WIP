package wh2;

import c93.InterfaceC4339a;
import com.whoop.metrics.domain.models.MetricPostType;
import com.whoop.straphistorysync.sync.InterfaceC10278f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import jy1.C22047a;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import st0.AbstractC32975s;
import st0.InterfaceC32974r;
import w91.C36965l;
import wb3.AbstractC37056f;
import zh2.C40645b;

/* JADX INFO: renamed from: wh2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\"\b\u0000\u0018\u0000 K2\u00020\u0001:\u0001MBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0013J\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b3\u00102J\u0015\u00104\u001a\u00020\f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b4\u00102J\u001f\u00106\u001a\u00020\f2\u0006\u00100\u001a\u00020/2\b\b\u0002\u00105\u001a\u00020\u000e¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\f2\u0006\u00100\u001a\u00020/2\b\b\u0002\u00105\u001a\u00020\u000e¢\u0006\u0004\b8\u00107J\r\u00109\u001a\u00020\f¢\u0006\u0004\b9\u0010\u0013J\u0015\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u000e¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\f¢\u0006\u0004\b=\u0010\u0013J\u0015\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\f¢\u0006\u0004\bA\u0010\u0013J\r\u0010B\u001a\u00020\u000e¢\u0006\u0004\bB\u0010\u001cJ\u0017\u0010C\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0016H\u0000¢\u0006\u0004\bC\u0010DJ-\u0010I\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u000e2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040GH\u0002¢\u0006\u0004\bI\u0010JJ\u0013\u0010K\u001a\u00020\u0004*\u00020/H\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010TR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010UR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010UR$\u0010X\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010V\u001a\u0004\bW\u0010\u001cR$\u0010[\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010\u001cR(\u0010_\u001a\u0004\u0018\u00010\u000e2\b\u0010F\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bB\u0010\\\u001a\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010VR$\u0010b\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\ba\u0010\u001cR$\u0010d\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010V\u001a\u0004\bc\u0010\u001cR$\u0010f\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010V\u001a\u0004\be\u0010\u001cR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00040G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010g¨\u0006i"}, m65681d2 = {"Lwh2/a;", "", "Liy1/c;", "metricWriter", "", "deviceCodeName", "firmwareVersion", "Lst0/r;", "strapLockStateTracker", "", "isRawDataInBacklog", "Lkotlin/Function0;", "Ll83/a0;", "onTerminal", "", "timeProvider", "<init>", "(Liy1/c;Ljava/lang/String;Ljava/lang/String;Lst0/r;ZLc93/a;Lc93/a;)V", "n", "()V", "l", "m", "", "size", "e", "(I)V", "k", "f", "()J", "isSuccess", "consecutiveFailures", "t", "(ZI)V", "durationMs", "q", "(ZJ)V", "expectedCount", "actualCount", "s", "(ZJJ)V", "success", "u", "(JZ)V", "Lzh2/b;", "sequenceInfo", "r", "(ZLzh2/b;)V", "Lcom/whoop/straphistorysync/sync/f$b;", "terminalState", "z", "(Lcom/whoop/straphistorysync/sync/f$b;)V", "x", "y", "terminalTimestamp", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/straphistorysync/sync/f$b;J)V", "B", "C", "pagesBehind", "p", "(J)V", "A", "packetType", "v", "(Ljava/lang/String;)V", "D", "j", "g", "(I)Ljava/lang/String;", "name", "value", "", "tags", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;JLjava/util/List;)V", "o", "(Lcom/whoop/straphistorysync/sync/f$b;)Ljava/lang/String;", "a", "Liy1/c;", "b", "Ljava/lang/String;", "c", "d", "Lst0/r;", "Z", "Lc93/a;", "J", "getSubmitTimestamp", "submitTimestamp", "i", "getDoWorkStartTimestamp", "doWorkStartTimestamp", "Ljava/lang/Long;", "getFirstHistoryStartTimestamp", "()Ljava/lang/Long;", "firstHistoryStartTimestamp", "burstStartTimestamp", "getTotalFlushTimeMs", "totalFlushTimeMs", "getTotalMissingPackets", "totalMissingPackets", "getTotalBytes", "totalBytes", "()Ljava/util/List;", "commonTags", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37300a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String deviceCodeName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String firmwareVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC32974r strapLockStateTracker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isRawDataInBacklog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC4339a onTerminal;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC4339a timeProvider;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long submitTimestamp;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long doWorkStartTimestamp;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Long firstHistoryStartTimestamp;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long burstStartTimestamp;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long totalFlushTimeMs;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private long totalMissingPackets;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private long totalBytes;

    public C37300a(InterfaceC21030c metricWriter, String deviceCodeName, String firmwareVersion, InterfaceC32974r strapLockStateTracker, boolean z4, InterfaceC4339a onTerminal, InterfaceC4339a timeProvider) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(deviceCodeName, "deviceCodeName");
        AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
        AbstractC22676k.m65750j(strapLockStateTracker, "strapLockStateTracker");
        AbstractC22676k.m65750j(onTerminal, "onTerminal");
        AbstractC22676k.m65750j(timeProvider, "timeProvider");
        this.metricWriter = metricWriter;
        this.deviceCodeName = deviceCodeName;
        this.firmwareVersion = firmwareVersion;
        this.strapLockStateTracker = strapLockStateTracker;
        this.isRawDataInBacklog = z4;
        this.onTerminal = onTerminal;
        this.timeProvider = timeProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m119445c() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final long m119446d() {
        return Clock.systemUTC().millis();
    }

    /* JADX INFO: renamed from: h */
    private final void m119447h(String name, long value, List<String> tags) {
        this.metricWriter.mo58701b(new C22047a(0, name, Double.valueOf(value), tags, MetricPostType.DISTRIBUTION, 1, null));
    }

    /* JADX INFO: renamed from: i */
    private final List<String> m119448i() {
        return AbstractC37056f.m118959K(AbstractC11266d.m30461o("whoop_device:", this.deviceCodeName), AbstractC11266d.m30461o("firmware_version:", this.firmwareVersion), AbstractC11266d.m30462p("is_raw_data_in_strap_or_app_backlog:", this.isRawDataInBacklog), AbstractC11266d.m30461o("strap_lock_state:", AbstractC32975s.m104081a(this.strapLockStateTracker)));
    }

    /* JADX INFO: renamed from: o */
    private final String m119449o(InterfaceC10278f.b bVar) {
        if (bVar instanceof InterfaceC10278f.b.d) {
            return "success";
        }
        if (bVar instanceof InterfaceC10278f.b.e) {
            return "timeout";
        }
        if (bVar instanceof InterfaceC10278f.b.a) {
            return "disconnect";
        }
        if (bVar instanceof InterfaceC10278f.b.C41422b) {
            return "error";
        }
        if (bVar instanceof InterfaceC10278f.b.c) {
            return "metadata_while_not_syncing";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: A */
    public final void m119450A() {
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.stuck_detected", null, m119448i(), MetricPostType.COUNT, 1, null));
    }

    /* JADX INFO: renamed from: B */
    public final void m119451B(InterfaceC10278f.b terminalState, long terminalTimestamp) {
        Long l7;
        AbstractC22676k.m65750j(terminalState, "terminalState");
        if ((terminalState instanceof InterfaceC10278f.b.d) && (l7 = this.firstHistoryStartTimestamp) != null) {
            long jLongValue = (terminalTimestamp - l7.longValue()) - this.totalFlushTimeMs;
            if (jLongValue <= 0) {
                return;
            }
            this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.throughput_bytes_per_sec", Double.valueOf(this.totalBytes / (jLongValue / 1000.0d)), m119448i(), MetricPostType.DISTRIBUTION, 1, null));
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m119452C() {
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.unknown_packet_revisions", null, m119448i(), MetricPostType.COUNT, 1, null));
    }

    /* JADX INFO: renamed from: D */
    public final void m119453D() {
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.zero_burst_session", null, m119448i(), MetricPostType.COUNT, 1, null));
    }

    /* JADX INFO: renamed from: e */
    public final void m119454e(int size) {
        this.totalBytes += (long) size;
    }

    /* JADX INFO: renamed from: f */
    public final long m119455f() {
        long jLongValue = ((Number) this.timeProvider.invoke()).longValue() - this.burstStartTimestamp;
        if (jLongValue < 0) {
            return 0L;
        }
        return jLongValue;
    }

    /* JADX INFO: renamed from: g */
    public final String m119456g(int consecutiveFailures) {
        if (consecutiveFailures < 10) {
            return "0-9";
        }
        return consecutiveFailures < 15 ? "10-14" : "15+";
    }

    /* JADX INFO: renamed from: j */
    public final long m119457j() {
        return ((Number) this.timeProvider.invoke()).longValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m119458k() {
        this.burstStartTimestamp = ((Number) this.timeProvider.invoke()).longValue();
    }

    /* JADX INFO: renamed from: l */
    public final void m119459l() {
        this.doWorkStartTimestamp = ((Number) this.timeProvider.invoke()).longValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m119460m() {
        if (this.firstHistoryStartTimestamp == null) {
            this.firstHistoryStartTimestamp = (Long) this.timeProvider.invoke();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m119461n() {
        this.submitTimestamp = ((Number) this.timeProvider.invoke()).longValue();
    }

    /* JADX INFO: renamed from: p */
    public final void m119462p(long pagesBehind) {
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.backlog_pages_behind", Double.valueOf(pagesBehind), m119448i(), MetricPostType.DISTRIBUTION, 1, null));
    }

    /* JADX INFO: renamed from: q */
    public final void m119463q(boolean isSuccess, long durationMs) {
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.burst_duration_ms", Double.valueOf(durationMs), AbstractC25265s.m74129g1(m119448i(), AbstractC37056f.m118958J("status:".concat(isSuccess ? "success" : "failure"))), MetricPostType.DISTRIBUTION, 1, null));
    }

    /* JADX INFO: renamed from: r */
    public final void m119464r(boolean isSuccess, C40645b sequenceInfo) {
        AbstractC22676k.m65750j(sequenceInfo, "sequenceInfo");
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(m119448i(), AbstractC37056f.m118958J("status:".concat(isSuccess ? "success" : "failure")));
        InterfaceC21030c interfaceC21030c = this.metricWriter;
        Double dValueOf = Double.valueOf(sequenceInfo.getGapCount());
        MetricPostType metricPostType = MetricPostType.DISTRIBUTION;
        int i13 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        interfaceC21030c.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.burst_sequence_gaps", dValueOf, arrayListM74129g1, metricPostType, i13, defaultConstructorMarker));
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.burst_missing_packets", Double.valueOf(sequenceInfo.getEstimatedMissingPackets()), arrayListM74129g1, metricPostType, i13, defaultConstructorMarker));
        this.totalMissingPackets = sequenceInfo.getEstimatedMissingPackets() + this.totalMissingPackets;
    }

    /* JADX INFO: renamed from: s */
    public final void m119465s(boolean isSuccess, long expectedCount, long actualCount) {
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.burst_packet_delta", Double.valueOf(expectedCount - actualCount), AbstractC25265s.m74129g1(m119448i(), AbstractC37056f.m118958J("status:".concat(isSuccess ? "success" : "failure"))), MetricPostType.DISTRIBUTION, 1, null));
    }

    /* JADX INFO: renamed from: t */
    public final void m119466t(boolean isSuccess, int consecutiveFailures) {
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.burst_status", null, AbstractC25265s.m74129g1(m119448i(), AbstractC37056f.m118959K("status:".concat(isSuccess ? "success" : "failure"), AbstractC11266d.m30461o("consecutive_failures_bucket:", m119456g(consecutiveFailures)))), MetricPostType.COUNT, 1, null));
    }

    /* JADX INFO: renamed from: u */
    public final void m119467u(long durationMs, boolean success) {
        this.totalFlushTimeMs += durationMs;
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.flush_duration_ms", Double.valueOf(durationMs), AbstractC25265s.m74129g1(m119448i(), AbstractC37056f.m118958J("flush_success:" + success)), MetricPostType.DISTRIBUTION, 1, null));
    }

    /* JADX INFO: renamed from: v */
    public final void m119468v(String packetType) {
        AbstractC22676k.m65750j(packetType, "packetType");
        int i13 = 0;
        String str = "connectivity.strap.app.sensor_hps.metadata_while_not_syncing";
        Double d3 = null;
        this.metricWriter.mo58701b(new C22047a(i13, str, d3, AbstractC25265s.m74128f1("packet_type:".concat(packetType), m119448i()), MetricPostType.COUNT, 1, null));
    }

    /* JADX INFO: renamed from: w */
    public final void m119469w(InterfaceC10278f.b terminalState, long terminalTimestamp) {
        AbstractC22676k.m65750j(terminalState, "terminalState");
        ArrayList arrayListM74128f1 = AbstractC25265s.m74128f1("outcome:" + m119449o(terminalState), m119448i());
        long j7 = terminalTimestamp - this.submitTimestamp;
        if (j7 < 0) {
            j7 = 0;
        }
        m119447h("connectivity.strap.app.sensor_hps.session_duration_ms", j7, arrayListM74128f1);
        long j13 = this.doWorkStartTimestamp - this.submitTimestamp;
        if (j13 < 0) {
            j13 = 0;
        }
        m119447h("connectivity.strap.app.sensor_hps.phase.queue_wait_ms", j13, arrayListM74128f1);
        Long l7 = this.firstHistoryStartTimestamp;
        long jLongValue = (l7 != null ? l7.longValue() : terminalTimestamp) - this.doWorkStartTimestamp;
        if (jLongValue < 0) {
            jLongValue = 0;
        }
        m119447h("connectivity.strap.app.sensor_hps.phase.command_send_ms", jLongValue, arrayListM74128f1);
        if (l7 != null) {
            long jLongValue2 = (terminalTimestamp - l7.longValue()) - this.totalFlushTimeMs;
            m119447h("connectivity.strap.app.sensor_hps.phase.ble_receive_ms", jLongValue2 >= 0 ? jLongValue2 : 0L, arrayListM74128f1);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m119470x(InterfaceC10278f.b terminalState) {
        AbstractC22676k.m65750j(terminalState, "terminalState");
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.phase.flush_ms", Double.valueOf(this.totalFlushTimeMs), AbstractC25265s.m74129g1(m119448i(), AbstractC31061c.m95644t("outcome:", m119449o(terminalState))), MetricPostType.DISTRIBUTION, 1, null));
    }

    /* JADX INFO: renamed from: y */
    public final void m119471y(InterfaceC10278f.b terminalState) {
        AbstractC22676k.m65750j(terminalState, "terminalState");
        this.onTerminal.invoke();
        List listM118959K = AbstractC37056f.m118959K(AbstractC11266d.m30461o("outcome:", m119449o(terminalState)), AbstractC11266d.m30462p("has_bursts:", terminalState.getSuccessfulBurstCount() > 0));
        InterfaceC10278f.b.C41422b c41422b = terminalState instanceof InterfaceC10278f.b.C41422b ? (InterfaceC10278f.b.C41422b) terminalState : null;
        List listM95644t = c41422b != null ? AbstractC31061c.m95644t("reason:", c41422b.getReason().getTag()) : null;
        if (listM95644t == null) {
            listM95644t = C25271y.f99162w;
        }
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.session_outcome", null, AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(m119448i(), listM118959K), listM95644t), MetricPostType.COUNT, 1, null));
    }

    /* JADX INFO: renamed from: z */
    public final void m119472z(InterfaceC10278f.b terminalState) {
        AbstractC22676k.m65750j(terminalState, "terminalState");
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.session_total_missing_packets", Double.valueOf(this.totalMissingPackets), AbstractC25265s.m74129g1(m119448i(), AbstractC31061c.m95644t("outcome:", m119449o(terminalState))), MetricPostType.DISTRIBUTION, 1, null));
    }

    public /* synthetic */ C37300a(InterfaceC21030c interfaceC21030c, String str, String str2, InterfaceC32974r interfaceC32974r, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21030c, str, str2, interfaceC32974r, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? new C36965l(28) : interfaceC4339a, (i13 & 64) != 0 ? new C36965l(29) : interfaceC4339a2);
    }
}
