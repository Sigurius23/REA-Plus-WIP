package vh2;

import com.whoop.metrics.domain.models.MetricPostType;
import com.whoop.service.network.model.UserSessionDto;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.util.ArrayList;
import java.util.List;
import jy1.C22047a;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sh2.AbstractC32512c;
import st0.InterfaceC32972p;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: vh2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0004*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u0004*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ]\u0010(\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u000e2\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J)\u0010*\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\u001a¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020,2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00103¨\u00064"}, m65681d2 = {"Lvh2/c;", "", "Liy1/c;", "metricWriter", "", "os", "<init>", "(Liy1/c;Ljava/lang/String;)V", "name", "", "tags", "Ll83/a0;", "c", "(Ljava/lang/String;Ljava/util/List;)V", "", "valueMs", "d", "(Ljava/lang/String;JLjava/util/List;)V", "deviceCodeName", "firmwareVersion", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "", "index", "a", "(I)Ljava/lang/String;", "Lsh2/c;", "f", "(Lsh2/c;)Ljava/lang/String;", "Lvh2/h;", "e", "(Lvh2/h;)Ljava/lang/String;", "Lvh2/i;", "trigger", "attemptIndex", "result", "backendFetchMs", "queueWaitMs", "certTransferMs", "totalMs", "g", "(Ljava/lang/String;Ljava/lang/String;Lvh2/i;ILvh2/h;JLjava/lang/Long;Ljava/lang/Long;J)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;Lsh2/c;)V", "Lst0/p;", "lockInfo", "j", "(Lst0/p;Ljava/lang/String;)V", "i", "(Ljava/lang/String;)V", "Liy1/c;", "Ljava/lang/String;", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36048c {

    /* JADX INFO: renamed from: c */
    private static final a f153806c = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String os;

    /* JADX INFO: renamed from: vh2.c$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lvh2/c$a;", "", "<init>", "()V", "", "PREFIX", "Ljava/lang/String;", "STUCK_LOCKED_NAME", "UNKNOWN", "", "SECONDS_PER_DAY", "D", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: vh2.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f153809a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f153810b;

        static {
            int[] iArr = new int[AbstractC32512c.b.values().length];
            try {
                iArr[AbstractC32512c.b.START_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC32512c.b.LOAD_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC32512c.b.VERIFY_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC32512c.b.PROCESS_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC32512c.b.TRANSFER_INCOMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC32512c.b.INTERRUPTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC32512c.b.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f153809a = iArr;
            int[] iArr2 = new int[InterfaceC36053h.b.values().length];
            try {
                iArr2[InterfaceC36053h.b.FORBIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InterfaceC36053h.b.BACKEND_FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InterfaceC36053h.b.NO_NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InterfaceC36053h.b.STRAP_REJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[InterfaceC36053h.b.TRANSFER_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[InterfaceC36053h.b.INTERRUPTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[InterfaceC36053h.b.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            f153810b = iArr2;
        }
    }

    public C36048c(InterfaceC21030c metricWriter, String os2) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(os2, "os");
        this.metricWriter = metricWriter;
        this.os = os2;
    }

    /* JADX INFO: renamed from: a */
    private final String m114438a(int index) {
        if (index <= 1) {
            return UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE;
        }
        return index <= 3 ? "2-3" : "4+";
    }

    /* JADX INFO: renamed from: b */
    private final List<String> m114439b(String deviceCodeName, String firmwareVersion) {
        String strM30461o = AbstractC11266d.m30461o("os:", this.os);
        if (deviceCodeName == null) {
            deviceCodeName = "unknown";
        }
        String strConcat = "whoop_device:".concat(deviceCodeName);
        if (firmwareVersion == null) {
            firmwareVersion = "unknown";
        }
        return AbstractC37056f.m118959K(strM30461o, strConcat, "firmware_version:".concat(firmwareVersion));
    }

    /* JADX INFO: renamed from: c */
    private final void m114440c(String name, List<String> tags) {
        this.metricWriter.mo58701b(new C22047a(0, name, null, tags, MetricPostType.COUNT, 1, null));
    }

    /* JADX INFO: renamed from: d */
    private final void m114441d(String name, long valueMs, List<String> tags) {
        InterfaceC21030c interfaceC21030c = this.metricWriter;
        if (valueMs < 0) {
            valueMs = 0;
        }
        interfaceC21030c.mo58701b(new C22047a(0, name, Double.valueOf(valueMs), tags, MetricPostType.DISTRIBUTION, 1, null));
    }

    /* JADX INFO: renamed from: e */
    private final String m114442e(InterfaceC36053h interfaceC36053h) {
        if (AbstractC22676k.m65745e(interfaceC36053h, InterfaceC36053h.c.f153919a)) {
            return "unlocked";
        }
        if (!(interfaceC36053h instanceof InterfaceC36053h.a)) {
            throw new NoWhenBranchMatchedException();
        }
        switch (b.f153810b[((InterfaceC36053h.a) interfaceC36053h).getReason().ordinal()]) {
            case 1:
                return "forbidden";
            case 2:
                return "backend_fail";
            case 3:
                return "network_fail";
            case 4:
                return "strap_reject";
            case 5:
                return "transfer_failed";
            case 6:
                return "interrupted";
            case 7:
                return "unknown";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: f */
    private final String m114443f(AbstractC32512c abstractC32512c) {
        if (AbstractC22676k.m65745e(abstractC32512c, AbstractC32512c.d.f134656a)) {
            return "success";
        }
        if (AbstractC22676k.m65745e(abstractC32512c, AbstractC32512c.c.f134655a)) {
            return "verify_rejected";
        }
        if (!(abstractC32512c instanceof AbstractC32512c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        switch (b.f153809a[((AbstractC32512c.a) abstractC32512c).getReason().ordinal()]) {
            case 1:
                return "start_fail";
            case 2:
                return "load_fail";
            case 3:
                return "verify_fail";
            case 4:
                return "process_fail";
            case 5:
                return "verify_incomplete";
            case 6:
                return "interrupted";
            case 7:
                return "unknown";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m114444g(String deviceCodeName, String firmwareVersion, EnumC36054i trigger, int attemptIndex, InterfaceC36053h result, long backendFetchMs, Long queueWaitMs, Long certTransferMs, long totalMs) {
        AbstractC22676k.m65750j(trigger, "trigger");
        AbstractC22676k.m65750j(result, "result");
        ArrayList arrayListM74128f1 = AbstractC25265s.m74128f1("outcome:" + m114442e(result), AbstractC25265s.m74128f1("trigger:" + trigger.getTag(), m114439b(deviceCodeName, firmwareVersion)));
        m114440c("connectivity.strap.app.strap_unlock.attempt", AbstractC25265s.m74128f1("attempt_index:" + m114438a(attemptIndex), arrayListM74128f1));
        m114441d("connectivity.strap.app.strap_unlock.phase.backend_fetch_ms", backendFetchMs, arrayListM74128f1);
        if (queueWaitMs != null) {
            m114441d("connectivity.strap.app.strap_unlock.phase.queue_wait_ms", queueWaitMs.longValue(), arrayListM74128f1);
        }
        if (certTransferMs != null) {
            m114441d("connectivity.strap.app.strap_unlock.phase.cert_transfer_ms", certTransferMs.longValue(), arrayListM74128f1);
        }
        if (trigger == EnumC36054i.UNLOCK) {
            m114441d("connectivity.strap.app.strap_unlock.duration_ms", totalMs, arrayListM74128f1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m114445h(String deviceCodeName, String firmwareVersion, AbstractC32512c result) {
        AbstractC22676k.m65750j(result, "result");
        m114440c("connectivity.strap.app.strap_unlock.cert_transfer", AbstractC25265s.m74128f1("result:" + m114443f(result), m114439b(deviceCodeName, firmwareVersion)));
    }

    /* JADX INFO: renamed from: i */
    public final void m114446i(String firmwareVersion) {
        if (firmwareVersion == null) {
            firmwareVersion = "unknown";
        }
        m114440c("connectivity.strap.app.stuck_locked", AbstractC37056f.m118958J("firmware_version:".concat(firmwareVersion)));
    }

    /* JADX INFO: renamed from: j */
    public final void m114447j(InterfaceC32972p lockInfo, String firmwareVersion) {
        AbstractC22676k.m65750j(lockInfo, "lockInfo");
        InterfaceC32972p.b bVar = lockInfo instanceof InterfaceC32972p.b ? (InterfaceC32972p.b) lockInfo : null;
        if (bVar == null) {
            return;
        }
        InterfaceC21030c interfaceC21030c = this.metricWriter;
        double counterSeconds = bVar.getCounterSeconds() / 86400.0d;
        if (counterSeconds < 0.0d) {
            counterSeconds = 0.0d;
        }
        Double dValueOf = Double.valueOf(counterSeconds);
        if (firmwareVersion == null) {
            firmwareVersion = "unknown";
        }
        interfaceC21030c.mo58701b(new C22047a(0, "connectivity.strap.app.strap_unlock.validity_remaining_days", dValueOf, AbstractC37056f.m118958J("firmware_version:".concat(firmwareVersion)), MetricPostType.DISTRIBUTION, 1, null));
    }
}
