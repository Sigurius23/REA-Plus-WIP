package sl1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ca2.C4361a;
import ca2.C4362b;
import ca2.EnumC4363c;
import com.whoop.design.util.AbstractC8693b;
import dt0.InterfaceC12361d;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.AbstractC14371b;
import gt0.InterfaceC16186h;
import i92.AbstractC18263h;
import i92.InterfaceC18260e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jk0.EnumC21747a;
import l83.C23454a0;
import lm0.C24506a;
import lm0.EnumC24508c;
import nl1.C26813a;
import od1.C27858u;
import od1.InterfaceC27844g;
import or2.C28149b1;
import org.joda.time.DateTime;
import os0.InterfaceC28306b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import ql1.C30470a;
import ql1.C30473d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.C33709g;
import td1.EnumC33707e;
import td1.EnumC33708f;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import wu0.InterfaceC37639b;

/* JADX INFO: renamed from: sl1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 G2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%Bo\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 *\b\u0012\u0004\u0012\u00020\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016¢\u0006\u0004\b$\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010;R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020B0 8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b9\u0010E¨\u0006H"}, m65681d2 = {"Lsl1/d;", "Lod1/g;", "Los0/b;", "Lsl1/b;", "Ltr2/n;", "logger", "Lor2/b1;", "metricsDateTimeReducer", "Ltd1/b;", "whoopStrapProxy", "Lca2/b;", "dataCatchingUpHelper", "Llm0/a;", "bleStateChangeReceiver", "Li92/e;", "networkMonitor", "Ltd1/g;", "whoopStrapStatusFlowWrapper", "Lod1/u;", "userContext", "Lwu0/b;", "strapBodyStatusNotifier", "Lnl1/a;", "newFirmwareUpdateMonitor", "Lql1/a;", "lowBatteryAlertHelper", "Ldt0/d;", "dataSyncService", "Lbc3/c0;", "coroutineScope", "<init>", "(Ltr2/n;Lor2/b1;Ltd1/b;Lca2/b;Llm0/a;Li92/e;Ltd1/g;Lod1/u;Lwu0/b;Lnl1/a;Lql1/a;Ldt0/d;Lbc3/c0;)V", "Lec3/l;", "l", "(Lec3/l;)Lec3/l;", "upstream", "interact", "a", "Ltr2/n;", "b", "Lor2/b1;", "c", "Ltd1/b;", "d", "Lca2/b;", "e", "Llm0/a;", "f", "Li92/e;", "g", "Ltd1/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lod1/u;", "i", "Lwu0/b;", "j", "Lnl1/a;", "k", "Lql1/a;", "Ldt0/d;", "m", "Lbc3/c0;", "", "n", "J", "lastHighWatermarkFetchTime", "Lsl1/a;", "o", "Lec3/l;", "()Lec3/l;", "connectivityIndicatorDomainResultFlow", "p", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32705d implements InterfaceC27844g<InterfaceC28306b, AbstractC32703b> {

    /* JADX INFO: renamed from: q */
    public static final int f135892q = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28149b1 metricsDateTimeReducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C4362b dataCatchingUpHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C24506a bleStateChangeReceiver;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C33709g whoopStrapStatusFlowWrapper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC37639b strapBodyStatusNotifier;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C26813a newFirmwareUpdateMonitor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C30470a lowBatteryAlertHelper;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC12361d dataSyncService;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private long lastHighWatermarkFetchTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC13058l connectivityIndicatorDomainResultFlow;

    /* JADX INFO: renamed from: sl1.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$connectivityIndicatorDomainResultFlow$2", m100430f = "StrapDomainInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lsl1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135908w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f135909x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f135909x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f135909x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135908w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C32702a c32702a = new C32702a(false, false, false, 0, false, EnumC33708f.NA, new C4361a(false, new DateTime(), null, 0, 4, null), false, false, 256, null);
                this.f135909x = null;
                this.f135908w = 1;
                if (interfaceC13062m.emit(c32702a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sl1.d$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l[] f135910w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32705d f135911x;

        /* JADX INFO: renamed from: sl1.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l[] f135912w;

            public a(InterfaceC13058l[] interfaceC13058lArr) {
                this.f135912w = interfaceC13058lArr;
            }

            @Override // c93.InterfaceC4339a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Object[this.f135912w.length];
            }
        }

        /* JADX INFO: renamed from: sl1.d$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$interact$$inlined$combine$1$3", m100430f = "StrapDomainInteractor.kt", m100431l = {234}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"R", "T", "Lec3/m;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Lkotlin/Array;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f135913w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f135914x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f135915y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C32705d f135916z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC30057d interfaceC30057d, C32705d c32705d) {
                super(3, interfaceC30057d);
                this.f135916z = c32705d;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC13062m interfaceC13062m, Object[] objArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                b bVar = new b(interfaceC30057d, this.f135916z);
                bVar.f135914x = interfaceC13062m;
                bVar.f135915y = objArr;
                return bVar.invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0197  */
            /* JADX WARN: Code duplicated, block: B:101:0x01a1  */
            /* JADX WARN: Code duplicated, block: B:104:0x01b1 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:64:0x0119  */
            /* JADX WARN: Code duplicated, block: B:65:0x011d A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:66:0x011f  */
            /* JADX WARN: Code duplicated, block: B:67:0x0123 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:68:0x0125  */
            /* JADX WARN: Code duplicated, block: B:69:0x0129 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:70:0x012b  */
            /* JADX WARN: Code duplicated, block: B:71:0x012f A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:72:0x0131  */
            /* JADX WARN: Code duplicated, block: B:73:0x0135 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:74:0x0137  */
            /* JADX WARN: Code duplicated, block: B:75:0x013b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:76:0x013d  */
            /* JADX WARN: Code duplicated, block: B:77:0x0141 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:78:0x0143  */
            /* JADX WARN: Code duplicated, block: B:79:0x0146 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:80:0x0148  */
            /* JADX WARN: Code duplicated, block: B:81:0x014b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:82:0x014d  */
            /* JADX WARN: Code duplicated, block: B:83:0x0150 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:84:0x0152  */
            /* JADX WARN: Code duplicated, block: B:85:0x0155 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:86:0x0157  */
            /* JADX WARN: Code duplicated, block: B:88:0x0165  */
            /* JADX WARN: Code duplicated, block: B:90:0x016b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:91:0x016d  */
            /* JADX WARN: Code duplicated, block: B:92:0x0170 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:93:0x0172  */
            /* JADX WARN: Code duplicated, block: B:94:0x0175 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:95:0x0177  */
            /* JADX WARN: Code duplicated, block: B:96:0x0185 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:97:0x0187  */
            /* JADX WARN: Code duplicated, block: B:98:0x0191  */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                boolean z4;
                boolean z13;
                boolean zM45724b;
                Object oVar;
                String strMo106508y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f135913w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f135914x;
                    Object[] objArr = (Object[]) this.f135915y;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    Object obj7 = objArr[5];
                    Object obj8 = objArr[6];
                    C30473d c30473d = (C30473d) objArr[7];
                    InterfaceC16186h interfaceC16186h = (InterfaceC16186h) obj8;
                    EnumC21747a enumC21747a = (EnumC21747a) obj7;
                    InterfaceC28306b interfaceC28306b = (InterfaceC28306b) obj6;
                    C4361a c4361a = (C4361a) obj5;
                    AbstractC18263h abstractC18263h = (AbstractC18263h) obj4;
                    EnumC33708f enumC33708f = (EnumC33708f) obj2;
                    boolean z14 = ((EnumC24508c) obj3) == EnumC24508c.OFF;
                    boolean z15 = enumC33708f == EnumC33708f.PAIR_DEVICE;
                    boolean zM65745e = AbstractC22676k.m65745e(abstractC18263h, AbstractC18263h.b.f71096a);
                    boolean z16 = enumC33708f == EnumC33708f.CONNECTING;
                    boolean z17 = enumC33708f == EnumC33708f.CONNECTED;
                    boolean z18 = enumC33708f == EnumC33708f.CONNECTION_FAILED;
                    boolean z19 = c4361a.getState() == EnumC4363c.CATCHING_UP;
                    boolean z24 = c4361a.getState() == EnumC4363c.CAUGHT_UP || c4361a.getState() == EnumC4363c.STANDBY;
                    String strM85177a = this.f135916z.metricsDateTimeReducer.m85177a(c4361a.getLastSyncTimeStamp());
                    boolean zM65745e2 = AbstractC22676k.m65745e(interfaceC28306b, InterfaceC28306b.c.f114125a);
                    boolean z25 = z19 && zM65745e2;
                    boolean z26 = z24 && zM65745e2;
                    boolean z27 = enumC21747a == EnumC21747a.STRAP_OFF_BODY;
                    InterfaceC16186h.Companion companion = InterfaceC16186h.INSTANCE;
                    boolean zM45726d = companion.m45726d(interfaceC16186h);
                    boolean zM45727e = companion.m45727e(interfaceC16186h);
                    boolean zM45723a = companion.m45723a(interfaceC16186h);
                    boolean zM45725c = companion.m45725c(interfaceC16186h);
                    if (companion.m45728f(interfaceC16186h)) {
                        z4 = z27;
                        if (!this.f135916z.whoopStrapProxy.getBatteryLevel().m65139h() && this.f135916z.whoopStrapProxy.mo106484A().isReady()) {
                            z13 = true;
                        }
                        zM45724b = companion.m45724b(interfaceC16186h);
                        if (!this.f135916z.userContext.m84054e()) {
                            oVar = AbstractC32703b.f.f135864o;
                        } else if (z14) {
                            oVar = AbstractC32703b.a.f135853o;
                        } else if (z15) {
                            oVar = AbstractC32703b.q.f135886o;
                        } else if (zM65745e) {
                            oVar = AbstractC32703b.p.f135884o;
                        } else if (zM45726d) {
                            oVar = AbstractC32703b.m.f135878o;
                        } else if (zM45727e) {
                            oVar = AbstractC32703b.l.f135876o;
                        } else if (zM45723a) {
                            oVar = AbstractC32703b.j.f135872o;
                        } else if (zM45725c) {
                            oVar = AbstractC32703b.i.f135870o;
                        } else if (z13) {
                            oVar = AbstractC32703b.h.f135868o;
                        } else if (zM45724b) {
                            oVar = AbstractC32703b.n.f135880o;
                        } else if (z16) {
                            oVar = AbstractC32703b.b.f135855o;
                        } else if (z17) {
                            strMo106508y = this.f135916z.whoopStrapProxy.mo106508y();
                            if (strMo106508y == null) {
                                strMo106508y = "";
                            }
                            oVar = new AbstractC32703b.g(strMo106508y);
                        } else if (z18) {
                            oVar = AbstractC32703b.c.f135857o;
                        } else if (z4) {
                            oVar = AbstractC32703b.r.f135888o;
                        } else if (z25) {
                            oVar = new AbstractC32703b.d(AbstractC8693b.m21278l(strM85177a), c4361a.getMinutesBehind());
                        } else if (z26) {
                            oVar = new AbstractC32703b.e(AbstractC8693b.m21278l(strM85177a));
                        } else if (c30473d.getShowTile()) {
                            oVar = new AbstractC32703b.o(c30473d.getBatteryPercentage());
                        } else {
                            oVar = AbstractC32703b.f.f135864o;
                        }
                        this.f135914x = null;
                        this.f135915y = null;
                        this.f135913w = 1;
                        if (interfaceC13062m.emit(oVar, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        z4 = z27;
                    }
                    z13 = false;
                    zM45724b = companion.m45724b(interfaceC16186h);
                    if (!this.f135916z.userContext.m84054e()) {
                        oVar = AbstractC32703b.f.f135864o;
                    } else if (z14) {
                        oVar = AbstractC32703b.a.f135853o;
                    } else if (z15) {
                        oVar = AbstractC32703b.q.f135886o;
                    } else if (zM65745e) {
                        oVar = AbstractC32703b.p.f135884o;
                    } else if (zM45726d) {
                        oVar = AbstractC32703b.m.f135878o;
                    } else if (zM45727e) {
                        oVar = AbstractC32703b.l.f135876o;
                    } else if (zM45723a) {
                        oVar = AbstractC32703b.j.f135872o;
                    } else if (zM45725c) {
                        oVar = AbstractC32703b.i.f135870o;
                    } else if (z13) {
                        oVar = AbstractC32703b.h.f135868o;
                    } else if (zM45724b) {
                        oVar = AbstractC32703b.n.f135880o;
                    } else if (z16) {
                        oVar = AbstractC32703b.b.f135855o;
                    } else if (z17) {
                        strMo106508y = this.f135916z.whoopStrapProxy.mo106508y();
                        if (strMo106508y == null) {
                            strMo106508y = "";
                        }
                        oVar = new AbstractC32703b.g(strMo106508y);
                    } else if (z18) {
                        oVar = AbstractC32703b.c.f135857o;
                    } else if (z4) {
                        oVar = AbstractC32703b.r.f135888o;
                    } else if (z25) {
                        oVar = new AbstractC32703b.d(AbstractC8693b.m21278l(strM85177a), c4361a.getMinutesBehind());
                    } else if (z26) {
                        oVar = new AbstractC32703b.e(AbstractC8693b.m21278l(strM85177a));
                    } else if (c30473d.getShowTile()) {
                        oVar = new AbstractC32703b.o(c30473d.getBatteryPercentage());
                    } else {
                        oVar = AbstractC32703b.f.f135864o;
                    }
                    this.f135914x = null;
                    this.f135915y = null;
                    this.f135913w = 1;
                    if (interfaceC13062m.emit(oVar, this) == enumC31071a) {
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

        public c(InterfaceC13058l[] interfaceC13058lArr, C32705d c32705d) {
            this.f135910w = interfaceC13058lArr;
            this.f135911x = c32705d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            InterfaceC13058l[] interfaceC13058lArr = this.f135910w;
            Object objM41038a = AbstractC14371b.m41038a(new a(interfaceC13058lArr), interfaceC13062m, new b(null, this.f135911x), interfaceC30057d, interfaceC13058lArr);
            return objM41038a == EnumC31071a.f128113w ? objM41038a : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl1.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$interact$$inlined$flatMapLatest$1", m100430f = "StrapDomainInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f135917w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f135918x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f135919y;

        public d(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC32703b abstractC32703b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f135918x = interfaceC13062m;
            dVar.f135919y = abstractC32703b;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135917w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f135918x;
                C13084s1 c13084s1 = new C13084s1(new f((AbstractC32703b) this.f135919y, null));
                this.f135918x = null;
                this.f135919y = null;
                this.f135917w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC32703b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: sl1.d$e */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$interact$2", m100430f = "StrapDomainInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lsl1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135920w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f135920w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC32703b.f fVar = AbstractC32703b.f.f135864o;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl1.d$f */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$interact$3$1", m100430f = "StrapDomainInteractor.kt", m100431l = {146, 147, 148, 151}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lsl1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135921w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f135922x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC32703b f135923y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC32703b abstractC32703b, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135923y = abstractC32703b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f135923y, interfaceC30057d);
            fVar.f135922x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0064  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L33;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f135922x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f135921w
                r3 = 0
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r2 == 0) goto L2b
                if (r2 == r7) goto L27
                if (r2 == r6) goto L23
                if (r2 == r5) goto L17
                if (r2 != r4) goto L1b
            L17:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L71
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L64
            L27:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L57
            L2b:
                p505ts.AbstractC34132o.m107864I(r9)
                sl1.b r9 = r8.f135923y
                boolean r2 = r9 instanceof sl1.AbstractC32703b.c
                if (r2 != 0) goto L4c
                boolean r2 = r9 instanceof sl1.AbstractC32703b.d
                if (r2 != 0) goto L4c
                boolean r2 = r9 instanceof sl1.AbstractC32703b.e
                if (r2 != 0) goto L4c
                boolean r2 = r9 instanceof sl1.AbstractC32703b.g
                if (r2 == 0) goto L41
                goto L4c
            L41:
                r8.f135922x = r3
                r8.f135921w = r4
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L71
                goto L70
            L4c:
                r8.f135922x = r0
                r8.f135921w = r7
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L57
                goto L70
            L57:
                r8.f135922x = r0
                r8.f135921w = r6
                r6 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r9 = bc3.AbstractC3034m0.m8782b(r6, r8)
                if (r9 != r1) goto L64
                goto L70
            L64:
                sl1.b$f r9 = sl1.AbstractC32703b.f.f135864o
                r8.f135922x = r3
                r8.f135921w = r5
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L71
            L70:
                return r1
            L71:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: sl1.C32705d.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: sl1.d$g */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l[] f135924w;

        /* JADX INFO: renamed from: sl1.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l[] f135925w;

            public a(InterfaceC13058l[] interfaceC13058lArr) {
                this.f135925w = interfaceC13058lArr;
            }

            @Override // c93.InterfaceC4339a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Object[this.f135925w.length];
            }
        }

        /* JADX INFO: renamed from: sl1.d$g$b */
        @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$special$$inlined$combine$1$3", m100430f = "StrapDomainInteractor.kt", m100431l = {234}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"R", "T", "Lec3/m;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Lkotlin/Array;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f135926w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f135927x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f135928y;

            public b(InterfaceC30057d interfaceC30057d) {
                super(3, interfaceC30057d);
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC13062m interfaceC13062m, Object[] objArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                b bVar = new b(interfaceC30057d);
                bVar.f135927x = interfaceC13062m;
                bVar.f135928y = objArr;
                return bVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f135926w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f135927x;
                    Object[] objArr = (Object[]) this.f135928y;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    Object obj7 = objArr[5];
                    Object obj8 = objArr[6];
                    EnumC21747a enumC21747a = (EnumC21747a) objArr[7];
                    C4361a c4361a = (C4361a) obj8;
                    boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                    C32702a c32702a = new C32702a(((EnumC24508c) obj3) == EnumC24508c.OFF, AbstractC22676k.m65745e((AbstractC18263h) obj4, AbstractC18263h.b.f71096a), ((EnumC33707e) obj5).isReady(), ((Number) obj6).byteValue(), zBooleanValue, (EnumC33708f) obj2, c4361a, enumC21747a == EnumC21747a.STRAP_OFF_BODY, false, 256, null);
                    this.f135927x = null;
                    this.f135928y = null;
                    this.f135926w = 1;
                    if (interfaceC13062m.emit(c32702a, this) == enumC31071a) {
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

        public g(InterfaceC13058l[] interfaceC13058lArr) {
            this.f135924w = interfaceC13058lArr;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            InterfaceC13058l[] interfaceC13058lArr = this.f135924w;
            Object objM41038a = AbstractC14371b.m41038a(new a(interfaceC13058lArr), interfaceC13062m, new b(null), interfaceC30057d, interfaceC13058lArr);
            return objM41038a == EnumC31071a.f128113w ? objM41038a : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl1.d$h */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$strapDomainActionHandler$$inlined$flatMapLatest$1", m100430f = "StrapDomainInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f135929w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f135930x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f135931y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32705d f135932z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30057d interfaceC30057d, C32705d c32705d) {
            super(3, interfaceC30057d);
            this.f135932z = c32705d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC28306b interfaceC28306b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d, this.f135932z);
            hVar.f135930x = interfaceC13062m;
            hVar.f135931y = interfaceC28306b;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13084s1 c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135929w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f135930x;
                InterfaceC28306b interfaceC28306b = (InterfaceC28306b) this.f135931y;
                if (AbstractC22676k.m65745e(interfaceC28306b, InterfaceC28306b.b.f114124a)) {
                    c13084s1 = new C13084s1(this.f135932z.new i(null));
                } else if (AbstractC22676k.m65745e(interfaceC28306b, InterfaceC28306b.c.f114125a)) {
                    c13084s1 = new C13084s1(new j(null));
                } else {
                    if (!AbstractC22676k.m65745e(interfaceC28306b, InterfaceC28306b.a.f114123a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(new k(null));
                }
                this.f135930x = null;
                this.f135931y = null;
                this.f135929w = 1;
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
            return invoke((InterfaceC13062m) obj, (InterfaceC28306b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: sl1.d$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$strapDomainActionHandler$1$1", m100430f = "StrapDomainInteractor.kt", m100431l = {220, 221, 223, 224, 225}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Los0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        long f135933w;

        /* JADX INFO: renamed from: x */
        int f135934x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f135935y;

        /* JADX INFO: renamed from: sl1.d$i$a */
        @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$strapDomainActionHandler$1$1$1", m100430f = "StrapDomainInteractor.kt", m100431l = {215}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f135937w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32705d f135938x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C32705d c32705d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f135938x = c32705d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f135938x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f135937w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC12361d interfaceC12361d = this.f135938x.dataSyncService;
                    this.f135937w = 1;
                    if (interfaceC12361d.mo34624b(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.f135938x.logger.mo85216g("High watermark fetched from server after pull to refresh", new AbstractC30556a.a[0]);
                return C23454a0.f92919a;
            }
        }

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = C32705d.this.new i(interfaceC30057d);
            iVar.f135935y = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
        
            if (r1.emit(r3, r16) == r2) goto L36;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = r0.f135935y
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r0.f135934x
                r4 = 0
                r5 = 5
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                r10 = 3000(0xbb8, double:1.482E-320)
                if (r3 == 0) goto L45
                if (r3 == r9) goto L3f
                if (r3 == r8) goto L39
                if (r3 == r7) goto L32
                if (r3 == r6) goto L2b
                if (r3 != r5) goto L23
                p505ts.AbstractC34132o.m107864I(r17)
                goto Lc5
            L23:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L2b:
                long r6 = r0.f135933w
                p505ts.AbstractC34132o.m107864I(r17)
                goto Lb6
            L32:
                long r7 = r0.f135933w
                p505ts.AbstractC34132o.m107864I(r17)
                goto La8
            L39:
                long r8 = r0.f135933w
                p505ts.AbstractC34132o.m107864I(r17)
                goto L8a
            L3f:
                long r12 = r0.f135933w
                p505ts.AbstractC34132o.m107864I(r17)
                goto L7c
            L45:
                p505ts.AbstractC34132o.m107864I(r17)
                long r12 = java.lang.System.currentTimeMillis()
                sl1.d r3 = sl1.C32705d.this
                long r14 = sl1.C32705d.m102651e(r3)
                long r14 = r12 - r14
                int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r3 < 0) goto L6d
                sl1.d r3 = sl1.C32705d.this
                bc3.c0 r3 = sl1.C32705d.m102649c(r3)
                sl1.d$i$a r14 = new sl1.d$i$a
                sl1.d r15 = sl1.C32705d.this
                r14.<init>(r15, r4)
                bc3.AbstractC3006f0.m8732z(r3, r4, r4, r14, r7)
                sl1.d r3 = sl1.C32705d.this
                sl1.C32705d.m102656j(r3, r12)
            L6d:
                os0.b$b r3 = os0.InterfaceC28306b.b.f114124a
                r0.f135935y = r1
                r0.f135933w = r12
                r0.f135934x = r9
                java.lang.Object r3 = r1.emit(r3, r0)
                if (r3 != r2) goto L7c
                goto Lc4
            L7c:
                r0.f135935y = r1
                r0.f135933w = r12
                r0.f135934x = r8
                java.lang.Object r3 = bc3.AbstractC3034m0.m8782b(r10, r0)
                if (r3 != r2) goto L89
                goto Lc4
            L89:
                r8 = r12
            L8a:
                sl1.d r3 = sl1.C32705d.this
                tr2.n r3 = sl1.C32705d.m102652f(r3)
                r12 = 0
                qr2.a$a[] r12 = new qr2.AbstractC30556a.a[r12]
                java.lang.String r13 = "Emitting RefreshShowDataTiles after pull to refresh delay"
                r3.mo85216g(r13, r12)
                os0.b$c r3 = os0.InterfaceC28306b.c.f114125a
                r0.f135935y = r1
                r0.f135933w = r8
                r0.f135934x = r7
                java.lang.Object r3 = r1.emit(r3, r0)
                if (r3 != r2) goto La7
                goto Lc4
            La7:
                r7 = r8
            La8:
                r0.f135935y = r1
                r0.f135933w = r7
                r0.f135934x = r6
                java.lang.Object r3 = bc3.AbstractC3034m0.m8782b(r10, r0)
                if (r3 != r2) goto Lb5
                goto Lc4
            Lb5:
                r6 = r7
            Lb6:
                os0.b$a r3 = os0.InterfaceC28306b.a.f114123a
                r0.f135935y = r4
                r0.f135933w = r6
                r0.f135934x = r5
                java.lang.Object r1 = r1.emit(r3, r0)
                if (r1 != r2) goto Lc5
            Lc4:
                return r2
            Lc5:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: sl1.C32705d.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: sl1.d$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$strapDomainActionHandler$1$2", m100430f = "StrapDomainInteractor.kt", m100431l = {230}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Los0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135939w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f135940x;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(interfaceC30057d);
            jVar.f135940x = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f135940x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135939w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC28306b.c cVar = InterfaceC28306b.c.f114125a;
                this.f135940x = null;
                this.f135939w = 1;
                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sl1.d$k */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$strapDomainActionHandler$1$3", m100430f = "StrapDomainInteractor.kt", m100431l = {235}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Los0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135941w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f135942x;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k kVar = new k(interfaceC30057d);
            kVar.f135942x = obj;
            return kVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f135942x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135941w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC28306b.a aVar = InterfaceC28306b.a.f114123a;
                this.f135942x = null;
                this.f135941w = 1;
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

    public C32705d(InterfaceC34116n logger, C28149b1 metricsDateTimeReducer, InterfaceC33704b whoopStrapProxy, C4362b dataCatchingUpHelper, C24506a bleStateChangeReceiver, InterfaceC18260e networkMonitor, C33709g whoopStrapStatusFlowWrapper, C27858u userContext, InterfaceC37639b strapBodyStatusNotifier, C26813a newFirmwareUpdateMonitor, C30470a lowBatteryAlertHelper, InterfaceC12361d dataSyncService, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(metricsDateTimeReducer, "metricsDateTimeReducer");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(dataCatchingUpHelper, "dataCatchingUpHelper");
        AbstractC22676k.m65750j(bleStateChangeReceiver, "bleStateChangeReceiver");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(whoopStrapStatusFlowWrapper, "whoopStrapStatusFlowWrapper");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(strapBodyStatusNotifier, "strapBodyStatusNotifier");
        AbstractC22676k.m65750j(newFirmwareUpdateMonitor, "newFirmwareUpdateMonitor");
        AbstractC22676k.m65750j(lowBatteryAlertHelper, "lowBatteryAlertHelper");
        AbstractC22676k.m65750j(dataSyncService, "dataSyncService");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.logger = logger;
        this.metricsDateTimeReducer = metricsDateTimeReducer;
        this.whoopStrapProxy = whoopStrapProxy;
        this.dataCatchingUpHelper = dataCatchingUpHelper;
        this.bleStateChangeReceiver = bleStateChangeReceiver;
        this.networkMonitor = networkMonitor;
        this.whoopStrapStatusFlowWrapper = whoopStrapStatusFlowWrapper;
        this.userContext = userContext;
        this.strapBodyStatusNotifier = strapBodyStatusNotifier;
        this.newFirmwareUpdateMonitor = newFirmwareUpdateMonitor;
        this.lowBatteryAlertHelper = lowBatteryAlertHelper;
        this.dataSyncService = dataSyncService;
        this.coroutineScope = coroutineScope;
        this.connectivityIndicatorDomainResultFlow = new C13015a0(new b(null), new g(new InterfaceC13058l[]{whoopStrapStatusFlowWrapper.getWhoopStrapStatusFlow(), bleStateChangeReceiver.getBluetoothStateFlow(), networkMonitor.getNetworkFlow(), whoopStrapProxy.mo106503r(), whoopStrapProxy.getBatteryLevel().m65136e(), whoopStrapProxy.getChargeStatus().m65150e(), dataCatchingUpHelper.getDataCatchingUpDomainResultFlow(), InterfaceC37639b.m120962a(strapBodyStatusNotifier, false, 1, null)}));
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m102657l(InterfaceC13058l interfaceC13058l) {
        return AbstractC13091v.m36590P(interfaceC13058l, new h(null, this));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(new C13015a0(new e(null), new c(new InterfaceC13058l[]{this.whoopStrapStatusFlowWrapper.getWhoopStrapStatusFlow(), this.bleStateChangeReceiver.getBluetoothStateFlow(), this.networkMonitor.getNetworkFlow(), this.dataCatchingUpHelper.getDataCatchingUpDomainResultFlow(), m102657l(upstream), InterfaceC37639b.m120962a(this.strapBodyStatusNotifier, false, 1, null), this.newFirmwareUpdateMonitor.getStrapFwUpdateMonitorFlow(), this.lowBatteryAlertHelper.getShowLowBatteryStateFlow()}, this)), new d(null));
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC13058l getConnectivityIndicatorDomainResultFlow() {
        return this.connectivityIndicatorDomainResultFlow;
    }
}
