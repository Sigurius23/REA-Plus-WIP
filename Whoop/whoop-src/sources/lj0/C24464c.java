package lj0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.domain.model.WhoopStrapInfo;
import ih0.AbstractC18489d0;
import iy1.InterfaceC21030c;
import jk0.InterfaceC21750d;
import jy1.C22047a;
import l83.C23454a0;
import nh2.InterfaceC26724a;
import oh2.InterfaceC27939b;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lj0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Llj0/c;", "Lnh2/a;", "Liy1/c;", "metricWriter", "Lbc3/c0;", "coroutineScope", "Lci2/b;", "whoopStrapProvider", "Ltr2/n;", "logger", "<init>", "(Liy1/c;Lbc3/c0;Lci2/b;Ltr2/n;)V", "Loh2/b$c;", "reason", "Ll83/a0;", "a", "(Loh2/b$c;)V", "Liy1/c;", "b", "Lbc3/c0;", "c", "Lci2/b;", "d", "Ltr2/n;", "", "()Ljava/lang/String;", "deviceCodeName", "e", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24464c implements InterfaceC26724a {

    /* JADX INFO: renamed from: e */
    private static final a f95356e = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: lj0.c$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Llj0/c$a;", "", "<init>", "()V", "", "UNKNOWN", "Ljava/lang/String;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: lj0.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.ble.analytics.FirmwareVersionAnalyticsHelper$trackParseFailed$1", m100430f = "FirmwareVersionAnalyticsHelper.kt", m100431l = {28}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f95361w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC27939b.c f95363y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC27939b.c cVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95363y = cVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C24464c.this.new b(this.f95363y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95361w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21030c interfaceC21030c = C24464c.this.metricWriter;
                C22047a c22047a = new C22047a(0, "connectivity.fw_version.parse_failed", null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("whoop_device:", C24464c.this.m71181d()), AbstractC11266d.m30461o("reason:", this.f95363y.getTag())), null, 21, null);
                this.f95361w = 1;
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

    public C24464c(InterfaceC21030c metricWriter, InterfaceC2994c0 coroutineScope, InterfaceC4733b whoopStrapProvider, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(logger, "logger");
        this.metricWriter = metricWriter;
        this.coroutineScope = coroutineScope;
        this.whoopStrapProvider = whoopStrapProvider;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final String m71181d() {
        WhoopStrapInfo whoopStrapInfo;
        EnumC32978v whoopDeviceType;
        String codeName;
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        return (interfaceC21750d == null || (whoopStrapInfo = interfaceC21750d.get_strapInfo()) == null || (whoopDeviceType = whoopStrapInfo.getWhoopDeviceType()) == null || (codeName = whoopDeviceType.getCodeName()) == null) ? "unknown" : codeName;
    }

    @Override // nh2.InterfaceC26724a
    /* JADX INFO: renamed from: a */
    public void mo71182a(InterfaceC27939b.c reason) {
        AbstractC22676k.m65750j(reason, "reason");
        this.logger.mo85222m(AbstractC31061c.m95640p("Device firmware version could not be read: reason=", reason.getTag(), ", whoop_device=", m71181d()), new AbstractC30556a.a[0]);
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(reason, null), 3);
    }
}
