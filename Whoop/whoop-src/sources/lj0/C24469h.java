package lj0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ca2.InterfaceC4368h;
import ci2.InterfaceC4733b;
import com.whoop.domain.model.WhoopStrapInfo;
import ih0.AbstractC18489d0;
import iy1.InterfaceC21030c;
import java.util.List;
import jk0.InterfaceC21750d;
import jy1.C22047a;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import oh2.InterfaceC27939b;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import us0.C35213i;
import us0.C35214j;
import us0.C35215k;
import us0.C35216l;
import us0.C35217m;
import us0.InterfaceC35212h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lj0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001 B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0014\u0010+\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Llj0/h;", "Lus0/h;", "Liy1/c;", "metricWriter", "Lbc3/c0;", "coroutineScope", "Lci2/b;", "whoopStrapProvider", "Lca2/h;", "rawDataTrackingService", "<init>", "(Liy1/c;Lbc3/c0;Lci2/b;Lca2/h;)V", "", "suffix", "Lst0/v;", "deviceType", "", "extraTags", "Ll83/a0;", "j", "(Ljava/lang/String;Lst0/v;Ljava/util/List;)V", "Lus0/j;", "metric", "e", "(Lus0/j;)V", "Lus0/i;", "c", "(Lus0/i;)V", "Lus0/k;", "d", "(Lus0/k;)V", "Lus0/l;", "a", "(Lus0/l;)V", "Lus0/m;", "b", "(Lus0/m;)V", "Liy1/c;", "Lbc3/c0;", "Lci2/b;", "Lca2/h;", "i", "()Ljava/lang/String;", "firmwareVersion", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24469h implements InterfaceC35212h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4368h rawDataTrackingService;

    /* JADX INFO: renamed from: lj0.h$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ble.analytics.PacketParsingAnalyticsHelper$insertMetric$1", m100430f = "PacketParsingAnalyticsHelper.kt", m100431l = {48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ List<String> f95412E;

        /* JADX INFO: renamed from: w */
        int f95413w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f95415y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ EnumC32978v f95416z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, EnumC32978v enumC32978v, List<String> list, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95415y = str;
            this.f95416z = enumC32978v;
            this.f95412E = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C24469h.this.new b(this.f95415y, this.f95416z, this.f95412E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95413w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21030c interfaceC21030c = C24469h.this.metricWriter;
                C22047a c22047a = new C22047a(0, AbstractC11266d.m30461o("connectivity.ble.packet_parsing.", this.f95415y), null, AbstractC25265s.m74129g1(AbstractC37056f.m118959K(AbstractC11266d.m30461o("whoop_device:", this.f95416z.getCodeName()), AbstractC11266d.m30461o("firmware_version:", C24469h.this.m71208i()), AbstractC11266d.m30462p("is_raw_data_in_strap_or_app_backlog:", C24469h.this.rawDataTrackingService.mo13761c())), this.f95412E), null, 21, null);
                this.f95413w = 1;
                if (interfaceC21030c.mo58700a(c22047a, this) == enumC31071a) {
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

    public C24469h(InterfaceC21030c metricWriter, InterfaceC2994c0 coroutineScope, InterfaceC4733b whoopStrapProvider, InterfaceC4368h rawDataTrackingService) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(rawDataTrackingService, "rawDataTrackingService");
        this.metricWriter = metricWriter;
        this.coroutineScope = coroutineScope;
        this.whoopStrapProvider = whoopStrapProvider;
        this.rawDataTrackingService = rawDataTrackingService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final String m71208i() {
        WhoopStrapInfo whoopStrapInfo;
        InterfaceC27939b maximVersion;
        String strMo84319a;
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        return (interfaceC21750d == null || (whoopStrapInfo = interfaceC21750d.get_strapInfo()) == null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null || (strMo84319a = maximVersion.mo84319a()) == null) ? "unknown" : strMo84319a;
    }

    /* JADX INFO: renamed from: j */
    private final void m71209j(String suffix, EnumC32978v deviceType, List<String> extraTags) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(suffix, deviceType, extraTags, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m71210k(C24469h c24469h, String str, EnumC32978v enumC32978v, List list, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            list = C25271y.f99162w;
        }
        c24469h.m71209j(str, enumC32978v, list);
    }

    @Override // us0.InterfaceC35212h
    /* JADX INFO: renamed from: a */
    public void mo71211a(C35216l metric) {
        AbstractC22676k.m65750j(metric, "metric");
        m71210k(this, "rev2_unknown_category", metric.getDeviceType(), null, 4, null);
    }

    @Override // us0.InterfaceC35212h
    /* JADX INFO: renamed from: b */
    public void mo71212b(C35217m metric) {
        AbstractC22676k.m65750j(metric, "metric");
        m71209j("rev2_unknown_type", metric.getDeviceType(), AbstractC31061c.m95644t("category:", metric.getCategoryName()));
    }

    @Override // us0.InterfaceC35212h
    /* JADX INFO: renamed from: c */
    public void mo71213c(C35213i metric) {
        AbstractC22676k.m65750j(metric, "metric");
        m71210k(this, "crc_16_failure", metric.getDeviceType(), null, 4, null);
    }

    @Override // us0.InterfaceC35212h
    /* JADX INFO: renamed from: d */
    public void mo71214d(C35215k metric) {
        AbstractC22676k.m65750j(metric, "metric");
        m71209j("frame_malformed", metric.getDeviceType(), AbstractC31061c.m95644t("reason:", metric.getReason().getTag()));
    }

    @Override // us0.InterfaceC35212h
    /* JADX INFO: renamed from: e */
    public void mo71215e(C35214j metric) {
        AbstractC22676k.m65750j(metric, "metric");
        m71210k(this, "crc_32_failure", metric.getDeviceType(), null, 4, null);
    }
}
