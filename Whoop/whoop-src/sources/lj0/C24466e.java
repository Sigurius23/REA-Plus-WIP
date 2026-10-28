package lj0;

import ci2.InterfaceC4733b;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.metrics.domain.models.MetricPostType;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jk0.InterfaceC21750d;
import jy1.C22047a;
import oh2.InterfaceC27939b;
import or2.C28162g;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import st0.AbstractC32975s;
import st0.EnumC32978v;
import st0.InterfaceC32974r;
import tr2.InterfaceC34116n;
import us0.InterfaceC35211g;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lj0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 42\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010(R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020'0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00102R\u0014\u00105\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00102¨\u00066"}, m65681d2 = {"Llj0/e;", "Lus0/g;", "Liy1/c;", "metricWriter", "Ltr2/n;", "logger", "Lci2/b;", "whoopStrapProvider", "Lst0/r;", "strapLockStateTracker", "Lor2/g;", "buildConfigProvider", "<init>", "(Liy1/c;Ltr2/n;Lci2/b;Lst0/r;Lor2/g;)V", "Ll83/a0;", "j", "()V", "", "source", "k", "(Ljava/lang/String;)V", "", "e", "()Ljava/util/List;", "f", "(Ljava/lang/String;)Ljava/util/List;", "", "heartRate", "d", "(I)V", "a", "(ILjava/lang/String;)V", "c", "b", "Liy1/c;", "Ltr2/n;", "Lci2/b;", "Lst0/r;", "Lor2/g;", "", "Z", "sdkInZeroEpisode", "", "g", "Ljava/util/Map;", "displayedInZeroEpisode", "Lcom/whoop/domain/model/WhoopStrapInfo;", "i", "()Lcom/whoop/domain/model/WhoopStrapInfo;", "strapInfo", "()Ljava/lang/String;", "appVersion", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "firmwareVersion", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24466e implements InterfaceC35211g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC32974r strapLockStateTracker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C28162g buildConfigProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean sdkInZeroEpisode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Map<String, Boolean> displayedInZeroEpisode;

    public C24466e(InterfaceC21030c metricWriter, InterfaceC34116n logger, InterfaceC4733b whoopStrapProvider, InterfaceC32974r strapLockStateTracker, C28162g buildConfigProvider) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(strapLockStateTracker, "strapLockStateTracker");
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        this.metricWriter = metricWriter;
        this.logger = logger;
        this.whoopStrapProvider = whoopStrapProvider;
        this.strapLockStateTracker = strapLockStateTracker;
        this.buildConfigProvider = buildConfigProvider;
        this.displayedInZeroEpisode = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: e */
    private final List<String> m71187e() {
        String codeName;
        EnumC32978v whoopDeviceType;
        WhoopStrapInfo whoopStrapInfoM71191i = m71191i();
        if (whoopStrapInfoM71191i == null || (whoopDeviceType = whoopStrapInfoM71191i.getWhoopDeviceType()) == null || (codeName = whoopDeviceType.getCodeName()) == null) {
            codeName = "unknown";
        }
        return AbstractC37056f.m118959K("strap_device:".concat(codeName), AbstractC11266d.m30461o("firmware_version:", m71190h()), AbstractC11266d.m30461o("app_version:", m71189g()), AbstractC11266d.m30461o("strap_lock_state:", AbstractC32975s.m104081a(this.strapLockStateTracker)));
    }

    /* JADX INFO: renamed from: f */
    private final List<String> m71188f(String source) {
        String codeName;
        EnumC32978v whoopDeviceType;
        String strM30461o = AbstractC11266d.m30461o("source:", source);
        WhoopStrapInfo whoopStrapInfoM71191i = m71191i();
        if (whoopStrapInfoM71191i == null || (whoopDeviceType = whoopStrapInfoM71191i.getWhoopDeviceType()) == null || (codeName = whoopDeviceType.getCodeName()) == null) {
            codeName = "unknown";
        }
        return AbstractC37056f.m118959K(strM30461o, "strap_device:".concat(codeName), AbstractC11266d.m30461o("firmware_version:", m71190h()), AbstractC11266d.m30461o("app_version:", m71189g()), AbstractC11266d.m30461o("strap_lock_state:", AbstractC32975s.m104081a(this.strapLockStateTracker)));
    }

    /* JADX INFO: renamed from: g */
    private final String m71189g() {
        String versionName = this.buildConfigProvider.getVersionName();
        if (AbstractC39414r.m125890i0(versionName)) {
            versionName = null;
        }
        return versionName == null ? "unknown" : versionName;
    }

    /* JADX INFO: renamed from: h */
    private final String m71190h() {
        InterfaceC27939b maximVersion;
        String strMo84319a;
        WhoopStrapInfo whoopStrapInfoM71191i = m71191i();
        return (whoopStrapInfoM71191i == null || (maximVersion = whoopStrapInfoM71191i.getMaximVersion()) == null || (strMo84319a = maximVersion.mo84319a()) == null) ? "unknown" : strMo84319a;
    }

    /* JADX INFO: renamed from: i */
    private final WhoopStrapInfo m71191i() {
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        if (interfaceC21750d != null) {
            return interfaceC21750d.get_strapInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    private final void m71192j() {
        this.logger.mo85226q("Live HR zero observed from SDK", new AbstractC30556a.a[0]);
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.live_hr.zero_observed", null, m71187e(), MetricPostType.COUNT, 5, null));
    }

    /* JADX INFO: renamed from: k */
    private final void m71193k(String source) {
        this.logger.mo85226q(AbstractC11266d.m30461o("Live HR zero shown on surface source=", source), new AbstractC30556a.a[0]);
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.live_hr.zero_shown", null, m71188f(source), MetricPostType.COUNT, 5, null));
    }

    @Override // us0.InterfaceC35211g
    /* JADX INFO: renamed from: a */
    public void mo71194a(int heartRate, String source) {
        AbstractC22676k.m65750j(source, "source");
        if (heartRate != 0) {
            this.displayedInZeroEpisode.put(source, Boolean.FALSE);
            return;
        }
        Boolean bool = this.displayedInZeroEpisode.get(source);
        Boolean bool2 = Boolean.TRUE;
        if (AbstractC22676k.m65745e(bool, bool2)) {
            return;
        }
        this.displayedInZeroEpisode.put(source, bool2);
        m71193k(source);
    }

    @Override // us0.InterfaceC35211g
    /* JADX INFO: renamed from: b */
    public void mo71195b(String source) {
        AbstractC22676k.m65750j(source, "source");
        this.displayedInZeroEpisode.put(source, Boolean.FALSE);
    }

    @Override // us0.InterfaceC35211g
    /* JADX INFO: renamed from: c */
    public void mo71196c() {
        this.sdkInZeroEpisode = false;
    }

    @Override // us0.InterfaceC35211g
    /* JADX INFO: renamed from: d */
    public void mo71197d(int heartRate) {
        if (heartRate != 0) {
            this.sdkInZeroEpisode = false;
        } else {
            if (this.sdkInZeroEpisode) {
                return;
            }
            this.sdkInZeroEpisode = true;
            m71192j();
        }
    }
}
