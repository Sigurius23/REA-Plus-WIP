package ug1;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import bt0.AbstractC3619c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.InterfaceC4733b;
import com.whoop.connectivityCore.firmware.models.ChipDetails;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import com.whoop.firmwareUpdateService.data.models.ChipFirmwareVersion;
import com.whoop.firmwareUpdateService.strategy.NewDfuService;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import gt0.AbstractC16184f;
import gt0.InterfaceC16182d;
import gt0.InterfaceC16186h;
import ht0.EnumC17623a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.util.Iterator;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import m32.InterfaceC25005a;
import mg1.C25529b;
import no.nordicsemi.android.dfu.DfuBaseService;
import no.nordicsemi.android.dfu.DfuProgressListener;
import or2.C28217y0;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg1.AbstractC29164b;
import pg1.C29163a;
import pg1.C29165c;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qt0.InterfaceC30585a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg1.InterfaceC32449a;
import sj2.InterfaceC32564a;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import tt0.AbstractC34156a;
import vk0.AbstractC36080f;
import vk0.InterfaceC36079e;
import vk0.InterfaceC36083i;
import vk0.InterfaceC36084j;
import vk0.InterfaceC36085k;
import wb3.AbstractC37056f;
import xj0.AbstractC38334b;
import xj0.C38343e;
import xj0.C38354h1;
import xj0.C38366l1;
import xj0.C38381s;
import zj0.C40727h;

/* JADX INFO: renamed from: ug1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b(\u0010)J&\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\"H\u0082@¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b2\u00101J#\u00105\u001a\b\u0012\u0004\u0012\u00020-0,2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030,H\u0016¢\u0006\u0004\b5\u00106J%\u0010:\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u001bH\u0007¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010@R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bI\u0010SR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR \u0010]\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010Z\u001a\u0004\b[\u0010\\R\"\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010Z\u001a\u0004\bQ\u0010\\R\u0016\u0010c\u001a\u0004\u0018\u00010`8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006d"}, m65681d2 = {"Lug1/c;", "Lug1/e;", "Lvk0/j;", "Lci2/b;", "whoopStrapProvider", "Lmg1/b;", "firmwareFilesHelper", "Lug1/g;", "fwImage", "Lsg1/a;", "firmwareRepo", "Lgt0/d;", "fwUpdateAnalytics", "Lor2/y0;", "locationServicesHelper", "Lqt0/a;", "bleScanner", "Lpg1/a;", "dfuHelper", "Landroid/content/Context;", "context", "Lpg1/c;", "logListener", "Lm32/a;", "permissionChecker", "Ltr2/n;", "logger", "", "taskName", "<init>", "(Lci2/b;Lmg1/b;Lug1/g;Lsg1/a;Lgt0/d;Lor2/y0;Lqt0/a;Lpg1/a;Landroid/content/Context;Lpg1/c;Lm32/a;Ltr2/n;Ljava/lang/String;)V", "Ll83/a0;", "n", "()V", "", "q", "()Z", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "Lug1/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;", "fwDevice", "firmwareVersion", "Lec3/l;", "Lgt0/h;", "y", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "c", "(Lq83/d;)Ljava/lang/Object;", "r", "Lug1/i;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "firmwareFilePath", "t", "(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)Lec3/l;", "a", "Lci2/b;", "b", "Lmg1/b;", "Lug1/g;", "d", "Lsg1/a;", "e", "Lgt0/d;", "f", "Lor2/y0;", "g", "Lqt0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lpg1/a;", "i", "Landroid/content/Context;", "j", "Lpg1/c;", "k", "Lm32/a;", "l", "Ltr2/n;", "()Ltr2/n;", "m", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "Lec3/p1;", "Lvk0/k;", "Lec3/p1;", "o", "()Lec3/p1;", "serviceFlow", "Lvk0/i;", "iGattService", "Ljk0/d;", "v", "()Ljk0/d;", "whoopStrap", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34939c implements InterfaceC34941e, InterfaceC36084j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25529b firmwareFilesHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34943g fwImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC32449a firmwareRepo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC16182d fwUpdateAnalytics;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C28217y0 locationServicesHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC30585a bleScanner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C29163a dfuHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C29165c logListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC25005a permissionChecker;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String taskName;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC13075p1 serviceFlow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC13075p1 iGattService;

    /* JADX INFO: renamed from: ug1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy", m100430f = "DfuUpdateStrategy.kt", m100431l = {275}, m100432m = "abortRealtimeStreamsAndHistorySync", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147684E;

        /* JADX INFO: renamed from: F */
        int f147685F;

        /* JADX INFO: renamed from: G */
        int f147686G;

        /* JADX INFO: renamed from: H */
        int f147687H;

        /* JADX INFO: renamed from: I */
        int f147688I;

        /* JADX INFO: renamed from: J */
        int f147689J;

        /* JADX INFO: renamed from: K */
        /* synthetic */ Object f147690K;

        /* JADX INFO: renamed from: M */
        int f147692M;

        /* JADX INFO: renamed from: w */
        Object f147693w;

        /* JADX INFO: renamed from: x */
        Object f147694x;

        /* JADX INFO: renamed from: y */
        Object f147695y;

        /* JADX INFO: renamed from: z */
        Object f147696z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147690K = obj;
            this.f147692M |= Integer.MIN_VALUE;
            return C34939c.this.m110352c(this);
        }
    }

    /* JADX INFO: renamed from: ug1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$abortRealtimeStreamsAndHistorySync$2", m100430f = "DfuUpdateStrategy.kt", m100431l = {282, 292, 302}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lzj0/h;", "<anonymous>", "()Lzj0/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ EnumC32978v f147698F;

        /* JADX INFO: renamed from: w */
        Object f147699w;

        /* JADX INFO: renamed from: x */
        Object f147700x;

        /* JADX INFO: renamed from: y */
        int f147701y;

        /* JADX INFO: renamed from: z */
        int f147702z;

        /* JADX INFO: renamed from: ug1.c$b$a */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f147703w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC38334b f147704x;

            /* JADX INFO: renamed from: ug1.c$b$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42474a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f147705w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ AbstractC38334b f147706x;

                /* JADX INFO: renamed from: ug1.c$b$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$abortRealtimeStreamsAndHistorySync$2$invokeSuspend$$inlined$sendCommandViaCrp$default$1$2", m100430f = "DfuUpdateStrategy.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42475a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f147707E;

                    /* JADX INFO: renamed from: F */
                    Object f147708F;

                    /* JADX INFO: renamed from: G */
                    Object f147709G;

                    /* JADX INFO: renamed from: H */
                    Object f147710H;

                    /* JADX INFO: renamed from: I */
                    Object f147711I;

                    /* JADX INFO: renamed from: J */
                    int f147712J;

                    /* JADX INFO: renamed from: K */
                    int f147713K;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f147715w;

                    /* JADX INFO: renamed from: x */
                    int f147716x;

                    /* JADX INFO: renamed from: y */
                    Object f147717y;

                    /* JADX INFO: renamed from: z */
                    Object f147718z;

                    public C42475a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f147715w = obj;
                        this.f147716x |= Integer.MIN_VALUE;
                        return C42474a.this.emit(null, this);
                    }
                }

                public C42474a(InterfaceC13062m interfaceC13062m, AbstractC38334b abstractC38334b) {
                    this.f147705w = interfaceC13062m;
                    this.f147706x = abstractC38334b;
                }

                /* JADX WARN: Code duplicated, block: B:8:0x0014  */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
                
                    if (r1.emit((zj0.C40727h) r14, r6) == r0) goto L29;
                 */
                @Override // ec3.InterfaceC13062m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof ug1.C34939c.b.a.C42474a.C42475a
                        if (r0 == 0) goto L14
                        r0 = r14
                        ug1.c$b$a$a$a r0 = (ug1.C34939c.b.a.C42474a.C42475a) r0
                        int r1 = r0.f147716x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L14
                        int r1 = r1 - r2
                        r0.f147716x = r1
                    L12:
                        r6 = r0
                        goto L1a
                    L14:
                        ug1.c$b$a$a$a r0 = new ug1.c$b$a$a$a
                        r0.<init>(r14)
                        goto L12
                    L1a:
                        java.lang.Object r14 = r6.f147715w
                        r83.a r0 = r83.EnumC31071a.f128113w
                        int r1 = r6.f147716x
                        r9 = 2
                        r2 = 1
                        r10 = 0
                        if (r1 == 0) goto L5c
                        if (r1 == r2) goto L3e
                        if (r1 != r9) goto L36
                        java.lang.Object r13 = r6.f147708F
                        ec3.m r13 = (ec3.InterfaceC13062m) r13
                        java.lang.Object r13 = r6.f147718z
                        ug1.c$b$a$a$a r13 = (ug1.C34939c.b.a.C42474a.C42475a) r13
                        p505ts.AbstractC34132o.m107864I(r14)
                        goto Lb0
                    L36:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L3e:
                        int r13 = r6.f147712J
                        java.lang.Object r1 = r6.f147711I
                        vk0.i r1 = (vk0.InterfaceC36083i) r1
                        java.lang.Object r1 = r6.f147710H
                        q83.d r1 = (q83.InterfaceC30057d) r1
                        java.lang.Object r1 = r6.f147709G
                        ec3.m r1 = (ec3.InterfaceC13062m) r1
                        java.lang.Object r2 = r6.f147708F
                        ec3.m r2 = (ec3.InterfaceC13062m) r2
                        java.lang.Object r2 = r6.f147718z
                        ug1.c$b$a$a$a r2 = (ug1.C34939c.b.a.C42474a.C42475a) r2
                        p505ts.AbstractC34132o.m107864I(r14)
                        l83.n r14 = (l83.C23468n) r14
                        java.lang.Object r14 = r14.f92940w
                        goto L8b
                    L5c:
                        p505ts.AbstractC34132o.m107864I(r14)
                        ec3.m r14 = r12.f147705w
                        r1 = r13
                        vk0.i r1 = (vk0.InterfaceC36083i) r1
                        r13 = r2
                        xj0.b r2 = r12.f147706x
                        r6.f147717y = r10
                        r6.f147718z = r10
                        r6.f147707E = r10
                        r6.f147708F = r10
                        r6.f147709G = r14
                        r6.f147710H = r10
                        r6.f147711I = r10
                        r11 = 0
                        r6.f147712J = r11
                        r6.f147713K = r11
                        r6.f147716x = r13
                        r3 = 0
                        r5 = 0
                        r7 = 6
                        r8 = 0
                        java.lang.Object r13 = vk0.InterfaceC36083i.m114608r0(r1, r2, r3, r5, r6, r7, r8)
                        if (r13 != r0) goto L88
                        goto Laf
                    L88:
                        r1 = r14
                        r14 = r13
                        r13 = r11
                    L8b:
                        boolean r2 = r14 instanceof l83.C23467m
                        if (r2 == 0) goto L90
                        r14 = r10
                    L90:
                        boolean r2 = r14 instanceof zj0.C40727h
                        if (r2 != 0) goto L95
                        r14 = r10
                    L95:
                        zj0.h r14 = (zj0.C40727h) r14
                        r6.f147717y = r10
                        r6.f147718z = r10
                        r6.f147707E = r10
                        r6.f147708F = r10
                        r6.f147709G = r10
                        r6.f147710H = r10
                        r6.f147711I = r10
                        r6.f147712J = r13
                        r6.f147716x = r9
                        java.lang.Object r13 = r1.emit(r14, r6)
                        if (r13 != r0) goto Lb0
                    Laf:
                        return r0
                    Lb0:
                        l83.a0 r13 = l83.C23454a0.f92919a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ug1.C34939c.b.a.C42474a.emit(java.lang.Object, q83.d):java.lang.Object");
                }
            }

            public a(InterfaceC13058l interfaceC13058l, AbstractC38334b abstractC38334b) {
                this.f147703w = interfaceC13058l;
                this.f147704x = abstractC38334b;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f147703w.collect(new C42474a(interfaceC13062m, this.f147704x), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: ug1.c$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42476b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f147719w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC38334b f147720x;

            /* JADX INFO: renamed from: ug1.c$b$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f147721w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ AbstractC38334b f147722x;

                /* JADX INFO: renamed from: ug1.c$b$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$abortRealtimeStreamsAndHistorySync$2$invokeSuspend$$inlined$sendCommandViaCrp$default$2$2", m100430f = "DfuUpdateStrategy.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42477a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f147723E;

                    /* JADX INFO: renamed from: F */
                    Object f147724F;

                    /* JADX INFO: renamed from: G */
                    Object f147725G;

                    /* JADX INFO: renamed from: H */
                    Object f147726H;

                    /* JADX INFO: renamed from: I */
                    Object f147727I;

                    /* JADX INFO: renamed from: J */
                    int f147728J;

                    /* JADX INFO: renamed from: K */
                    int f147729K;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f147731w;

                    /* JADX INFO: renamed from: x */
                    int f147732x;

                    /* JADX INFO: renamed from: y */
                    Object f147733y;

                    /* JADX INFO: renamed from: z */
                    Object f147734z;

                    public C42477a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f147731w = obj;
                        this.f147732x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m, AbstractC38334b abstractC38334b) {
                    this.f147721w = interfaceC13062m;
                    this.f147722x = abstractC38334b;
                }

                /* JADX WARN: Code duplicated, block: B:8:0x0014  */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
                
                    if (r1.emit((zj0.C40727h) r14, r6) == r0) goto L29;
                 */
                @Override // ec3.InterfaceC13062m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof ug1.C34939c.b.C42476b.a.C42477a
                        if (r0 == 0) goto L14
                        r0 = r14
                        ug1.c$b$b$a$a r0 = (ug1.C34939c.b.C42476b.a.C42477a) r0
                        int r1 = r0.f147732x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L14
                        int r1 = r1 - r2
                        r0.f147732x = r1
                    L12:
                        r6 = r0
                        goto L1a
                    L14:
                        ug1.c$b$b$a$a r0 = new ug1.c$b$b$a$a
                        r0.<init>(r14)
                        goto L12
                    L1a:
                        java.lang.Object r14 = r6.f147731w
                        r83.a r0 = r83.EnumC31071a.f128113w
                        int r1 = r6.f147732x
                        r9 = 2
                        r2 = 1
                        r10 = 0
                        if (r1 == 0) goto L5c
                        if (r1 == r2) goto L3e
                        if (r1 != r9) goto L36
                        java.lang.Object r13 = r6.f147724F
                        ec3.m r13 = (ec3.InterfaceC13062m) r13
                        java.lang.Object r13 = r6.f147734z
                        ug1.c$b$b$a$a r13 = (ug1.C34939c.b.C42476b.a.C42477a) r13
                        p505ts.AbstractC34132o.m107864I(r14)
                        goto Lb0
                    L36:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L3e:
                        int r13 = r6.f147728J
                        java.lang.Object r1 = r6.f147727I
                        vk0.i r1 = (vk0.InterfaceC36083i) r1
                        java.lang.Object r1 = r6.f147726H
                        q83.d r1 = (q83.InterfaceC30057d) r1
                        java.lang.Object r1 = r6.f147725G
                        ec3.m r1 = (ec3.InterfaceC13062m) r1
                        java.lang.Object r2 = r6.f147724F
                        ec3.m r2 = (ec3.InterfaceC13062m) r2
                        java.lang.Object r2 = r6.f147734z
                        ug1.c$b$b$a$a r2 = (ug1.C34939c.b.C42476b.a.C42477a) r2
                        p505ts.AbstractC34132o.m107864I(r14)
                        l83.n r14 = (l83.C23468n) r14
                        java.lang.Object r14 = r14.f92940w
                        goto L8b
                    L5c:
                        p505ts.AbstractC34132o.m107864I(r14)
                        ec3.m r14 = r12.f147721w
                        r1 = r13
                        vk0.i r1 = (vk0.InterfaceC36083i) r1
                        r13 = r2
                        xj0.b r2 = r12.f147722x
                        r6.f147733y = r10
                        r6.f147734z = r10
                        r6.f147723E = r10
                        r6.f147724F = r10
                        r6.f147725G = r14
                        r6.f147726H = r10
                        r6.f147727I = r10
                        r11 = 0
                        r6.f147728J = r11
                        r6.f147729K = r11
                        r6.f147732x = r13
                        r3 = 0
                        r5 = 0
                        r7 = 6
                        r8 = 0
                        java.lang.Object r13 = vk0.InterfaceC36083i.m114608r0(r1, r2, r3, r5, r6, r7, r8)
                        if (r13 != r0) goto L88
                        goto Laf
                    L88:
                        r1 = r14
                        r14 = r13
                        r13 = r11
                    L8b:
                        boolean r2 = r14 instanceof l83.C23467m
                        if (r2 == 0) goto L90
                        r14 = r10
                    L90:
                        boolean r2 = r14 instanceof zj0.C40727h
                        if (r2 != 0) goto L95
                        r14 = r10
                    L95:
                        zj0.h r14 = (zj0.C40727h) r14
                        r6.f147733y = r10
                        r6.f147734z = r10
                        r6.f147723E = r10
                        r6.f147724F = r10
                        r6.f147725G = r10
                        r6.f147726H = r10
                        r6.f147727I = r10
                        r6.f147728J = r13
                        r6.f147732x = r9
                        java.lang.Object r13 = r1.emit(r14, r6)
                        if (r13 != r0) goto Lb0
                    Laf:
                        return r0
                    Lb0:
                        l83.a0 r13 = l83.C23454a0.f92919a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ug1.C34939c.b.C42476b.a.emit(java.lang.Object, q83.d):java.lang.Object");
                }
            }

            public C42476b(InterfaceC13058l interfaceC13058l, AbstractC38334b abstractC38334b) {
                this.f147719w = interfaceC13058l;
                this.f147720x = abstractC38334b;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f147719w.collect(new a(interfaceC13062m, this.f147720x), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: ug1.c$b$c */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f147735w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC38334b f147736x;

            /* JADX INFO: renamed from: ug1.c$b$c$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f147737w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ AbstractC38334b f147738x;

                /* JADX INFO: renamed from: ug1.c$b$c$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$abortRealtimeStreamsAndHistorySync$2$invokeSuspend$$inlined$sendCommandViaCrp$default$3$2", m100430f = "DfuUpdateStrategy.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42478a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f147739E;

                    /* JADX INFO: renamed from: F */
                    Object f147740F;

                    /* JADX INFO: renamed from: G */
                    Object f147741G;

                    /* JADX INFO: renamed from: H */
                    Object f147742H;

                    /* JADX INFO: renamed from: I */
                    Object f147743I;

                    /* JADX INFO: renamed from: J */
                    int f147744J;

                    /* JADX INFO: renamed from: K */
                    int f147745K;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f147747w;

                    /* JADX INFO: renamed from: x */
                    int f147748x;

                    /* JADX INFO: renamed from: y */
                    Object f147749y;

                    /* JADX INFO: renamed from: z */
                    Object f147750z;

                    public C42478a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f147747w = obj;
                        this.f147748x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m, AbstractC38334b abstractC38334b) {
                    this.f147737w = interfaceC13062m;
                    this.f147738x = abstractC38334b;
                }

                /* JADX WARN: Code duplicated, block: B:8:0x0014  */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
                
                    if (r1.emit((zj0.C40727h) r14, r6) == r0) goto L29;
                 */
                @Override // ec3.InterfaceC13062m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof ug1.C34939c.b.c.a.C42478a
                        if (r0 == 0) goto L14
                        r0 = r14
                        ug1.c$b$c$a$a r0 = (ug1.C34939c.b.c.a.C42478a) r0
                        int r1 = r0.f147748x
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L14
                        int r1 = r1 - r2
                        r0.f147748x = r1
                    L12:
                        r6 = r0
                        goto L1a
                    L14:
                        ug1.c$b$c$a$a r0 = new ug1.c$b$c$a$a
                        r0.<init>(r14)
                        goto L12
                    L1a:
                        java.lang.Object r14 = r6.f147747w
                        r83.a r0 = r83.EnumC31071a.f128113w
                        int r1 = r6.f147748x
                        r9 = 2
                        r2 = 1
                        r10 = 0
                        if (r1 == 0) goto L5c
                        if (r1 == r2) goto L3e
                        if (r1 != r9) goto L36
                        java.lang.Object r13 = r6.f147740F
                        ec3.m r13 = (ec3.InterfaceC13062m) r13
                        java.lang.Object r13 = r6.f147750z
                        ug1.c$b$c$a$a r13 = (ug1.C34939c.b.c.a.C42478a) r13
                        p505ts.AbstractC34132o.m107864I(r14)
                        goto Lb0
                    L36:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L3e:
                        int r13 = r6.f147744J
                        java.lang.Object r1 = r6.f147743I
                        vk0.i r1 = (vk0.InterfaceC36083i) r1
                        java.lang.Object r1 = r6.f147742H
                        q83.d r1 = (q83.InterfaceC30057d) r1
                        java.lang.Object r1 = r6.f147741G
                        ec3.m r1 = (ec3.InterfaceC13062m) r1
                        java.lang.Object r2 = r6.f147740F
                        ec3.m r2 = (ec3.InterfaceC13062m) r2
                        java.lang.Object r2 = r6.f147750z
                        ug1.c$b$c$a$a r2 = (ug1.C34939c.b.c.a.C42478a) r2
                        p505ts.AbstractC34132o.m107864I(r14)
                        l83.n r14 = (l83.C23468n) r14
                        java.lang.Object r14 = r14.f92940w
                        goto L8b
                    L5c:
                        p505ts.AbstractC34132o.m107864I(r14)
                        ec3.m r14 = r12.f147737w
                        r1 = r13
                        vk0.i r1 = (vk0.InterfaceC36083i) r1
                        r13 = r2
                        xj0.b r2 = r12.f147738x
                        r6.f147749y = r10
                        r6.f147750z = r10
                        r6.f147739E = r10
                        r6.f147740F = r10
                        r6.f147741G = r14
                        r6.f147742H = r10
                        r6.f147743I = r10
                        r11 = 0
                        r6.f147744J = r11
                        r6.f147745K = r11
                        r6.f147748x = r13
                        r3 = 0
                        r5 = 0
                        r7 = 6
                        r8 = 0
                        java.lang.Object r13 = vk0.InterfaceC36083i.m114608r0(r1, r2, r3, r5, r6, r7, r8)
                        if (r13 != r0) goto L88
                        goto Laf
                    L88:
                        r1 = r14
                        r14 = r13
                        r13 = r11
                    L8b:
                        boolean r2 = r14 instanceof l83.C23467m
                        if (r2 == 0) goto L90
                        r14 = r10
                    L90:
                        boolean r2 = r14 instanceof zj0.C40727h
                        if (r2 != 0) goto L95
                        r14 = r10
                    L95:
                        zj0.h r14 = (zj0.C40727h) r14
                        r6.f147749y = r10
                        r6.f147750z = r10
                        r6.f147739E = r10
                        r6.f147740F = r10
                        r6.f147741G = r10
                        r6.f147742H = r10
                        r6.f147743I = r10
                        r6.f147744J = r13
                        r6.f147748x = r9
                        java.lang.Object r13 = r1.emit(r14, r6)
                        if (r13 != r0) goto Lb0
                    Laf:
                        return r0
                    Lb0:
                        l83.a0 r13 = l83.C23454a0.f92919a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ug1.C34939c.b.c.a.emit(java.lang.Object, q83.d):java.lang.Object");
                }
            }

            public c(InterfaceC13058l interfaceC13058l, AbstractC38334b abstractC38334b) {
                this.f147735w = interfaceC13058l;
                this.f147736x = abstractC38334b;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f147735w.collect(new a(interfaceC13062m, this.f147736x), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC32978v enumC32978v, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f147698F = enumC32978v;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C34939c.this.new b(this.f147698F, interfaceC30057d);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00b1 A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM36575A;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147702z;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 iGattService = C34939c.this.getIGattService();
                a aVar = new a(new C4588i(iGattService, 2), new C38366l1(false, null, 2, null));
                this.f147699w = null;
                this.f147700x = null;
                this.f147701y = 0;
                this.f147702z = 1;
                if (AbstractC13091v.m36575A(aVar, this) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
            } else {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
            }
            InterfaceC13075p1 iGattService2 = C34939c.this.getIGattService();
            c cVar = new c(new C4588i(iGattService2, 2), new C38381s(this.f147698F));
            this.f147699w = null;
            this.f147700x = null;
            this.f147701y = 0;
            this.f147702z = 3;
            objM36575A = AbstractC13091v.m36575A(cVar, this);
            if (objM36575A != enumC31071a) {
                return enumC31071a;
            }
            return objM36575A;
            InterfaceC13075p1 iGattService3 = C34939c.this.getIGattService();
            C42476b c42476b = new C42476b(new C4588i(iGattService3, 2), new C38354h1(false, null, 2, null));
            this.f147699w = null;
            this.f147700x = null;
            this.f147701y = 0;
            this.f147702z = 2;
            if (AbstractC13091v.m36575A(c42476b, this) != enumC31071a) {
                InterfaceC13075p1 iGattService4 = C34939c.this.getIGattService();
                c cVar2 = new c(new C4588i(iGattService4, 2), new C38381s(this.f147698F));
                this.f147699w = null;
                this.f147700x = null;
                this.f147701y = 0;
                this.f147702z = 3;
                objM36575A = AbstractC13091v.m36575A(cVar2, this);
                if (objM36575A != enumC31071a) {
                    return objM36575A;
                }
            }
            return enumC31071a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C40727h> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ug1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$getDfuProgress$1", m100430f = "DfuUpdateStrategy.kt", m100431l = {233}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Lgt0/h;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ BluetoothDevice f147751E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f147752F;

        /* JADX INFO: renamed from: w */
        Object f147753w;

        /* JADX INFO: renamed from: x */
        int f147754x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f147755y;

        /* JADX INFO: renamed from: ug1.c$c$a */
        @Metadata(m65680d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\bJ1\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"ug1/c$c$a", "Lno/nordicsemi/android/dfu/DfuProgressListener;", "Ll83/a0;", "a", "()V", "", "deviceAddress", "onDeviceConnecting", "(Ljava/lang/String;)V", "", "percent", "", "speed", "avgSpeed", "currentPart", "totalParts", "onProgressChanged", "(Ljava/lang/String;IFFII)V", "onDeviceDisconnecting", "onDeviceDisconnected", "onDeviceConnected", "onDfuProcessStarting", "onDfuAborted", "onEnablingDfuMode", "onDfuCompleted", "onFirmwareValidating", "onDfuProcessStarted", "error", "errorType", "message", "onError", "(Ljava/lang/String;IILjava/lang/String;)V", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements DfuProgressListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC11936u f147757a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C34939c f147758b;

            public a(InterfaceC11936u interfaceC11936u, C34939c c34939c) {
                this.f147757a = interfaceC11936u;
                this.f147758b = c34939c;
            }

            /* JADX INFO: renamed from: a */
            private final void m110370a() {
                this.f147758b.dfuHelper.m88613f(this.f147758b.context, this);
                this.f147758b.dfuHelper.m88612e(this.f147758b.context, this.f147758b.logListener);
            }

            @Override // no.nordicsemi.android.dfu.DfuProgressListener
            public void onDeviceConnected(String deviceAddress) {
                AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
            }

            @Override // no.nordicsemi.android.dfu.DfuProgressListener
            public void onDeviceConnecting(String deviceAddress) {
                AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
            }

            @Override // no.nordicsemi.android.dfu.DfuProgressListener
            public void onDeviceDisconnected(String deviceAddress) {
                AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
            }

            @Override // no.nordicsemi.android.dfu.DfuProgressListener
            public void onDeviceDisconnecting(String deviceAddress) {
            }

            @Override // no.nordicsemi.android.dfu.DfuProgressListener
            public void onDfuAborted(String deviceAddress) {
                AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
                m110370a();
            }

            @Override // no.nordicsemi.android.dfu.DfuProgressListener
            public void onDfuCompleted(String deviceAddress) {
                AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
                m110370a();
                ((C11935t) this.f147757a).mo32218s(InterfaceC16186h.e.f61486b);
            }

            @Override // no.nordicsemi.android.dfu.DfuProgressListener
            public void onDfuProcessStarted(String deviceAddress) {
                AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
            }

            @Override // no.nordicsemi.android.dfu.DfuProgressListener
            public void onDfuProcessStarting(String deviceAddress) {
                AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
            }

            @Override // no.nordicsemi.android.dfu.DfuProgressListener
            public void onEnablingDfuMode(String deviceAddress) {
                AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
            }

            @Override // no.nordicsemi.android.dfu.DfuProgressListener
            public void onError(String deviceAddress, int error, int errorType, String message) {
                AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
                String strM88614a = AbstractC29164b.m88614a(errorType);
                StringBuilder sbM30467u = AbstractC11266d.m30467u(error, "DFU service error: ", message, ", error is ", ", errorType ");
                sbM30467u.append(strM88614a);
                this.f147758b.getLogger().mo85230v("Error while performing DFU", new Exception(sbM30467u.toString()), new AbstractC30556a.a[0]);
                m110370a();
                ((C11935t) this.f147757a).mo32218s(new InterfaceC16186h.b(AbstractC16184f.a.f61469b, false, 2, null));
            }

            @Override // no.nordicsemi.android.dfu.DfuProgressListener
            public void onFirmwareValidating(String deviceAddress) {
                AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
            }

            @Override // no.nordicsemi.android.dfu.DfuProgressListener
            public void onProgressChanged(String deviceAddress, int percent, float speed, float avgSpeed, int currentPart, int totalParts) {
                AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
                ((C11935t) this.f147757a).mo32218s(new InterfaceC16186h.g(AbstractC3619c.m10981a(percent), false, 2, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BluetoothDevice bluetoothDevice, String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147751E = bluetoothDevice;
            this.f147752F = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m110369h(C34939c c34939c, a aVar) {
            c34939c.dfuHelper.m88613f(c34939c.context, aVar);
            c34939c.dfuHelper.m88612e(c34939c.context, c34939c.logListener);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C34939c.this.new c(this.f147751E, this.f147752F, interfaceC30057d);
            cVar.f147755y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f147755y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147754x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                final a aVar = new a(interfaceC11936u, C34939c.this);
                C34939c.this.dfuHelper.m88608a();
                C34939c.this.dfuHelper.m88610c(C34939c.this.context, aVar);
                C34939c.this.dfuHelper.m88609b(C34939c.this.context, C34939c.this.logListener);
                C34939c.this.getLogger().mo85228t(AbstractC31061c.m95640p("starting service for device ", this.f147751E.getAddress(), ", ", this.f147751E.getName()), new AbstractC30556a.a[0]);
                C29163a c29163a = C34939c.this.dfuHelper;
                String address = this.f147751E.getAddress();
                AbstractC22676k.m65749i(address, "getAddress(...)");
                c29163a.m88611d(address, AbstractC34156a.m107933a(this.f147751E), false, false, this.f147752F, false, 12, true, NewDfuService.class);
                final C34939c c34939c = C34939c.this;
                InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: ug1.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return C34939c.c.m110369h(c34939c, aVar);
                    }
                };
                this.f147755y = null;
                this.f147753w = null;
                this.f147754x = 1;
                if (AbstractC37056f.m118984h(interfaceC11936u, interfaceC4339a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ug1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$interact$$inlined$flatMapLatest$1", m100430f = "DfuUpdateStrategy.kt", m100431l = {193, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f147759E;

        /* JADX INFO: renamed from: F */
        Object f147760F;

        /* JADX INFO: renamed from: G */
        Object f147761G;

        /* JADX INFO: renamed from: H */
        int f147762H;

        /* JADX INFO: renamed from: w */
        int f147763w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f147764x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f147765y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34939c f147766z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C34939c c34939c) {
            super(3, interfaceC30057d);
            this.f147766z = c34939c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC34946j abstractC34946j, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f147766z);
            dVar.f147764x = interfaceC13062m;
            dVar.f147765y = abstractC34946j;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r9, r8) == r0) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.f147763w
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L32
                if (r1 == r2) goto L1e
                if (r1 != r3) goto L16
                java.lang.Object r0 = r8.f147764x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto La2
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r1 = r8.f147761G
                ug1.j r1 = (ug1.AbstractC34946j) r1
                java.lang.Object r1 = r8.f147760F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r8.f147759E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r2 = r8.f147764x
                ec3.m r2 = (ec3.InterfaceC13062m) r2
                p505ts.AbstractC34132o.m107864I(r9)
                goto L8d
            L32:
                p505ts.AbstractC34132o.m107864I(r9)
                java.lang.Object r9 = r8.f147764x
                r1 = r9
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r9 = r8.f147765y
                ug1.j r9 = (ug1.AbstractC34946j) r9
                boolean r5 = r9 instanceof ug1.AbstractC34946j.h
                r6 = 0
                if (r5 == 0) goto L64
                ug1.c r5 = r8.f147766z
                ug1.j$h r9 = (ug1.AbstractC34946j.h) r9
                com.whoop.connectivityCore.firmware.models.WhoopFwDevice r7 = r9.getDevice()
                java.lang.String r9 = r9.getFirmwareVersion()
                r8.f147764x = r4
                r8.f147765y = r4
                r8.f147759E = r1
                r8.f147760F = r4
                r8.f147761G = r4
                r8.f147762H = r6
                r8.f147763w = r2
                java.lang.Object r9 = ug1.C34939c.m110360m(r5, r7, r9, r8)
                if (r9 != r0) goto L8d
                goto La1
            L64:
                boolean r2 = r9 instanceof ug1.AbstractC34946j.g
                if (r2 == 0) goto L72
                gt0.h$e r9 = gt0.InterfaceC16186h.e.f61486b
                a6.u r2 = new a6.u
                r5 = 1
                r2.<init>(r9, r5)
            L70:
                r9 = r2
                goto L8d
            L72:
                boolean r9 = r9 instanceof ug1.AbstractC34946j.d
                if (r9 == 0) goto L7f
                gt0.h$c r9 = gt0.InterfaceC16186h.c.f61483b
                a6.u r2 = new a6.u
                r5 = 1
                r2.<init>(r9, r5)
                goto L70
            L7f:
                gt0.h$b r9 = new gt0.h$b
                gt0.f$g r2 = gt0.AbstractC16184f.g.f61475b
                r9.<init>(r2, r6, r3, r4)
                a6.u r2 = new a6.u
                r5 = 1
                r2.<init>(r9, r5)
                goto L70
            L8d:
                ec3.l r9 = (ec3.InterfaceC13058l) r9
                r8.f147764x = r4
                r8.f147765y = r4
                r8.f147759E = r4
                r8.f147760F = r4
                r8.f147761G = r4
                r8.f147763w = r3
                java.lang.Object r9 = ec3.AbstractC13091v.m36613w(r1, r9, r8)
                if (r9 != r0) goto La2
            La1:
                return r0
            La2:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ug1.C34939c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC34946j) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ug1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f147767w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34939c f147768x;

        /* JADX INFO: renamed from: ug1.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f147769w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34939c f147770x;

            /* JADX INFO: renamed from: ug1.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$interact$$inlined$map$1$2", m100430f = "DfuUpdateStrategy.kt", m100431l = {53, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42479a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f147771E;

                /* JADX INFO: renamed from: F */
                Object f147772F;

                /* JADX INFO: renamed from: G */
                Object f147773G;

                /* JADX INFO: renamed from: H */
                Object f147774H;

                /* JADX INFO: renamed from: I */
                Object f147775I;

                /* JADX INFO: renamed from: J */
                Object f147776J;

                /* JADX INFO: renamed from: K */
                int f147777K;

                /* JADX INFO: renamed from: L */
                int f147778L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f147779w;

                /* JADX INFO: renamed from: x */
                int f147780x;

                /* JADX INFO: renamed from: y */
                Object f147781y;

                public C42479a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f147779w = obj;
                    this.f147780x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34939c c34939c) {
                this.f147769w = interfaceC13062m;
                this.f147770x = c34939c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
            
                if (r9.emit(r2, r0) == r1) goto L29;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof ug1.C34939c.e.a.C42479a
                    if (r0 == 0) goto L13
                    r0 = r9
                    ug1.c$e$a$a r0 = (ug1.C34939c.e.a.C42479a) r0
                    int r1 = r0.f147780x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f147780x = r1
                    goto L18
                L13:
                    ug1.c$e$a$a r0 = new ug1.c$e$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f147779w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f147780x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L56
                    if (r2 == r4) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r8 = r0.f147773G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f147771E
                    ug1.c$e$a$a r8 = (ug1.C34939c.e.a.C42479a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto La9
                L34:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3c:
                    int r8 = r0.f147777K
                    java.lang.Object r2 = r0.f147776J
                    gt0.h r2 = (gt0.InterfaceC16186h) r2
                    java.lang.Object r4 = r0.f147775I
                    q83.d r4 = (q83.InterfaceC30057d) r4
                    java.lang.Object r4 = r0.f147774H
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r6 = r0.f147773G
                    ec3.m r6 = (ec3.InterfaceC13062m) r6
                    java.lang.Object r6 = r0.f147771E
                    ug1.c$e$a$a r6 = (ug1.C34939c.e.a.C42479a) r6
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L8e
                L56:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r9 = r7.f147769w
                    r2 = r8
                    gt0.h r2 = (gt0.InterfaceC16186h) r2
                    boolean r8 = r2 instanceof gt0.InterfaceC16186h.e
                    r6 = 0
                    if (r8 != 0) goto L6f
                    boolean r8 = r2 instanceof gt0.InterfaceC16186h.b
                    if (r8 != 0) goto L6f
                    gt0.h$c r8 = gt0.InterfaceC16186h.c.f61483b
                    boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r2, r8)
                    if (r8 == 0) goto L90
                L6f:
                    ug1.c r8 = r7.f147770x
                    r0.f147781y = r5
                    r0.f147771E = r5
                    r0.f147772F = r5
                    r0.f147773G = r5
                    r0.f147774H = r9
                    r0.f147775I = r5
                    r0.f147776J = r2
                    r0.f147777K = r6
                    r0.f147778L = r6
                    r0.f147780x = r4
                    java.lang.Object r8 = ug1.C34939c.m110354e(r8, r0)
                    if (r8 != r1) goto L8c
                    goto La8
                L8c:
                    r4 = r9
                    r8 = r6
                L8e:
                    r6 = r8
                    r9 = r4
                L90:
                    r0.f147781y = r5
                    r0.f147771E = r5
                    r0.f147772F = r5
                    r0.f147773G = r5
                    r0.f147774H = r5
                    r0.f147775I = r5
                    r0.f147776J = r5
                    r0.f147777K = r6
                    r0.f147780x = r3
                    java.lang.Object r8 = r9.emit(r2, r0)
                    if (r8 != r1) goto La9
                La8:
                    return r1
                La9:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ug1.C34939c.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public e(InterfaceC13058l interfaceC13058l, C34939c c34939c) {
            this.f147767w = interfaceC13058l;
            this.f147768x = c34939c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f147767w.collect(new a(interfaceC13062m, this.f147768x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug1.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$interact$1", m100430f = "DfuUpdateStrategy.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lvk0/k;", "serviceState", "Lug1/i;", "action", "Lug1/j;", "<anonymous>", "(Lvk0/k;Lug1/i;)Lug1/j;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f147783w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f147784x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f147785y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC36085k interfaceC36085k, AbstractC34945i abstractC34945i, InterfaceC30057d<? super AbstractC34946j> interfaceC30057d) {
            f fVar = C34939c.this.new f(interfaceC30057d);
            fVar.f147784x = interfaceC36085k;
            fVar.f147785y = abstractC34945i;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC36085k interfaceC36085k = (InterfaceC36085k) this.f147784x;
            AbstractC34945i abstractC34945i = (AbstractC34945i) this.f147785y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147783w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AbstractC22676k.m65745e(interfaceC36085k, InterfaceC36085k.c.f154180a)) {
                    return AbstractC34946j.i.f147868b;
                }
                if (!(abstractC34945i instanceof AbstractC34945i.a)) {
                    throw new IllegalStateException("Invalid action " + abstractC34945i + " only Start is allowed");
                }
                C34939c c34939c = C34939c.this;
                WhoopFwDevice device = ((AbstractC34945i.a) abstractC34945i).getDevice();
                this.f147784x = null;
                this.f147785y = null;
                this.f147783w = 1;
                obj = c34939c.m110365w(device, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (AbstractC34946j) obj;
        }
    }

    /* JADX INFO: renamed from: ug1.c$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$interact$4", m100430f = "DfuUpdateStrategy.kt", m100431l = {120, 121}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lgt0/h;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f147787w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f147788x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f147789y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = C34939c.this.new g(interfaceC30057d);
            gVar.f147788x = interfaceC13062m;
            gVar.f147789y = th3;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        
            if (r0.emit(r10, r9) == r2) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f147788x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                java.lang.Object r1 = r9.f147789y
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r9.f147787w
                r4 = 0
                r5 = 1
                r6 = 2
                r7 = 0
                if (r3 == 0) goto L26
                if (r3 == r5) goto L22
                if (r3 != r6) goto L1a
                p505ts.AbstractC34132o.m107864I(r10)
                goto L59
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                p505ts.AbstractC34132o.m107864I(r10)
                goto L45
            L26:
                p505ts.AbstractC34132o.m107864I(r10)
                ug1.c r10 = ug1.C34939c.this
                tr2.n r10 = r10.getLogger()
                java.lang.String r3 = "Error while performing DFU"
                qr2.a$a[] r8 = new qr2.AbstractC30556a.a[r4]
                r10.mo85230v(r3, r1, r8)
                ug1.c r10 = ug1.C34939c.this
                r9.f147788x = r0
                r9.f147789y = r7
                r9.f147787w = r5
                java.lang.Object r10 = ug1.C34939c.m110354e(r10, r9)
                if (r10 != r2) goto L45
                goto L58
            L45:
                gt0.h$b r10 = new gt0.h$b
                gt0.f$g r1 = gt0.AbstractC16184f.g.f61475b
                r10.<init>(r1, r4, r6, r7)
                r9.f147788x = r7
                r9.f147789y = r7
                r9.f147787w = r6
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r2) goto L59
            L58:
                return r2
            L59:
                l83.a0 r10 = l83.C23454a0.f92919a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ug1.C34939c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ug1.c$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f147791w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC38334b f147792x;

        /* JADX INFO: renamed from: ug1.c$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f147793w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC38334b f147794x;

            /* JADX INFO: renamed from: ug1.c$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$startDfuMode$$inlined$sendCommandViaCrp$default$1$2", m100430f = "DfuUpdateStrategy.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42480a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f147795E;

                /* JADX INFO: renamed from: F */
                Object f147796F;

                /* JADX INFO: renamed from: G */
                Object f147797G;

                /* JADX INFO: renamed from: H */
                Object f147798H;

                /* JADX INFO: renamed from: I */
                Object f147799I;

                /* JADX INFO: renamed from: J */
                int f147800J;

                /* JADX INFO: renamed from: K */
                int f147801K;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f147803w;

                /* JADX INFO: renamed from: x */
                int f147804x;

                /* JADX INFO: renamed from: y */
                Object f147805y;

                /* JADX INFO: renamed from: z */
                Object f147806z;

                public C42480a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f147803w = obj;
                    this.f147804x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC38334b abstractC38334b) {
                this.f147793w = interfaceC13062m;
                this.f147794x = abstractC38334b;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
            
                if (r1.emit((zj0.C40727h) r14, r6) == r0) goto L29;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof ug1.C34939c.h.a.C42480a
                    if (r0 == 0) goto L14
                    r0 = r14
                    ug1.c$h$a$a r0 = (ug1.C34939c.h.a.C42480a) r0
                    int r1 = r0.f147804x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L14
                    int r1 = r1 - r2
                    r0.f147804x = r1
                L12:
                    r6 = r0
                    goto L1a
                L14:
                    ug1.c$h$a$a r0 = new ug1.c$h$a$a
                    r0.<init>(r14)
                    goto L12
                L1a:
                    java.lang.Object r14 = r6.f147803w
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r6.f147804x
                    r9 = 2
                    r2 = 1
                    r10 = 0
                    if (r1 == 0) goto L5c
                    if (r1 == r2) goto L3e
                    if (r1 != r9) goto L36
                    java.lang.Object r13 = r6.f147796F
                    ec3.m r13 = (ec3.InterfaceC13062m) r13
                    java.lang.Object r13 = r6.f147806z
                    ug1.c$h$a$a r13 = (ug1.C34939c.h.a.C42480a) r13
                    p505ts.AbstractC34132o.m107864I(r14)
                    goto Lb0
                L36:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L3e:
                    int r13 = r6.f147800J
                    java.lang.Object r1 = r6.f147799I
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    java.lang.Object r1 = r6.f147798H
                    q83.d r1 = (q83.InterfaceC30057d) r1
                    java.lang.Object r1 = r6.f147797G
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    java.lang.Object r2 = r6.f147796F
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r2 = r6.f147806z
                    ug1.c$h$a$a r2 = (ug1.C34939c.h.a.C42480a) r2
                    p505ts.AbstractC34132o.m107864I(r14)
                    l83.n r14 = (l83.C23468n) r14
                    java.lang.Object r14 = r14.f92940w
                    goto L8b
                L5c:
                    p505ts.AbstractC34132o.m107864I(r14)
                    ec3.m r14 = r12.f147793w
                    r1 = r13
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    r13 = r2
                    xj0.b r2 = r12.f147794x
                    r6.f147805y = r10
                    r6.f147806z = r10
                    r6.f147795E = r10
                    r6.f147796F = r10
                    r6.f147797G = r14
                    r6.f147798H = r10
                    r6.f147799I = r10
                    r11 = 0
                    r6.f147800J = r11
                    r6.f147801K = r11
                    r6.f147804x = r13
                    r3 = 0
                    r5 = 0
                    r7 = 6
                    r8 = 0
                    java.lang.Object r13 = vk0.InterfaceC36083i.m114608r0(r1, r2, r3, r5, r6, r7, r8)
                    if (r13 != r0) goto L88
                    goto Laf
                L88:
                    r1 = r14
                    r14 = r13
                    r13 = r11
                L8b:
                    boolean r2 = r14 instanceof l83.C23467m
                    if (r2 == 0) goto L90
                    r14 = r10
                L90:
                    boolean r2 = r14 instanceof zj0.C40727h
                    if (r2 != 0) goto L95
                    r14 = r10
                L95:
                    zj0.h r14 = (zj0.C40727h) r14
                    r6.f147805y = r10
                    r6.f147806z = r10
                    r6.f147795E = r10
                    r6.f147796F = r10
                    r6.f147797G = r10
                    r6.f147798H = r10
                    r6.f147799I = r10
                    r6.f147800J = r13
                    r6.f147804x = r9
                    java.lang.Object r13 = r1.emit(r14, r6)
                    if (r13 != r0) goto Lb0
                Laf:
                    return r0
                Lb0:
                    l83.a0 r13 = l83.C23454a0.f92919a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: ug1.C34939c.h.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public h(InterfaceC13058l interfaceC13058l, AbstractC38334b abstractC38334b) {
            this.f147791w = interfaceC13058l;
            this.f147792x = abstractC38334b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f147791w.collect(new a(interfaceC13062m, this.f147792x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug1.c$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy", m100430f = "DfuUpdateStrategy.kt", m100431l = {127, 137, DfuBaseService.NOTIFICATION_ID}, m100432m = "startDfuMode", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f147807E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f147808F;

        /* JADX INFO: renamed from: H */
        int f147810H;

        /* JADX INFO: renamed from: w */
        Object f147811w;

        /* JADX INFO: renamed from: x */
        Object f147812x;

        /* JADX INFO: renamed from: y */
        Object f147813y;

        /* JADX INFO: renamed from: z */
        Object f147814z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147808F = obj;
            this.f147810H |= Integer.MIN_VALUE;
            return C34939c.this.m110365w(null, this);
        }
    }

    /* JADX INFO: renamed from: ug1.c$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy", m100430f = "DfuUpdateStrategy.kt", m100431l = {243}, m100432m = "startNordicUpdate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f147816F;

        /* JADX INFO: renamed from: w */
        Object f147817w;

        /* JADX INFO: renamed from: x */
        Object f147818x;

        /* JADX INFO: renamed from: y */
        Object f147819y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f147820z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147820z = obj;
            this.f147816F |= Integer.MIN_VALUE;
            return C34939c.this.m110366y(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug1.c$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$startNordicUpdate$2", m100430f = "DfuUpdateStrategy.kt", m100431l = {244}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f147821w;

        /* JADX INFO: renamed from: x */
        int f147822x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22669g0 f147823y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34939c f147824z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C22669g0 c22669g0, C34939c c34939c, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147823y = c22669g0;
            this.f147824z = c34939c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new k(this.f147823y, this.f147824z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22669g0 c22669g0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147822x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22669g0 c22669g1 = this.f147823y;
                InterfaceC30585a interfaceC30585a = this.f147824z.bleScanner;
                this.f147821w = c22669g1;
                this.f147822x = 1;
                Object objMo1484a = interfaceC30585a.mo1484a("Whoop_Boot", this);
                if (objMo1484a == enumC31071a) {
                    return enumC31071a;
                }
                c22669g0 = c22669g1;
                obj = objMo1484a;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22669g0 = (C22669g0) this.f147821w;
                AbstractC34132o.m107864I(obj);
            }
            c22669g0.f89336w = obj;
            return C23454a0.f92919a;
        }
    }

    public C34939c(InterfaceC4733b whoopStrapProvider, C25529b firmwareFilesHelper, InterfaceC34943g fwImage, InterfaceC32449a firmwareRepo, InterfaceC16182d fwUpdateAnalytics, C28217y0 locationServicesHelper, InterfaceC30585a bleScanner, C29163a dfuHelper, Context context, C29165c logListener, InterfaceC25005a permissionChecker, InterfaceC34116n logger, String taskName) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(firmwareFilesHelper, "firmwareFilesHelper");
        AbstractC22676k.m65750j(fwImage, "fwImage");
        AbstractC22676k.m65750j(firmwareRepo, "firmwareRepo");
        AbstractC22676k.m65750j(fwUpdateAnalytics, "fwUpdateAnalytics");
        AbstractC22676k.m65750j(locationServicesHelper, "locationServicesHelper");
        AbstractC22676k.m65750j(bleScanner, "bleScanner");
        AbstractC22676k.m65750j(dfuHelper, "dfuHelper");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logListener, "logListener");
        AbstractC22676k.m65750j(permissionChecker, "permissionChecker");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(taskName, "taskName");
        this.whoopStrapProvider = whoopStrapProvider;
        this.firmwareFilesHelper = firmwareFilesHelper;
        this.fwImage = fwImage;
        this.firmwareRepo = firmwareRepo;
        this.fwUpdateAnalytics = fwUpdateAnalytics;
        this.locationServicesHelper = locationServicesHelper;
        this.bleScanner = bleScanner;
        this.dfuHelper = dfuHelper;
        this.context = context;
        this.logListener = logListener;
        this.permissionChecker = permissionChecker;
        this.logger = logger;
        this.taskName = taskName;
        this.serviceFlow = AbstractC13091v.m36593c(InterfaceC36085k.a.f154178a);
        this.iGattService = AbstractC13091v.m36593c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008a -> B:24:0x008d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    public final Object m110352c(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        EnumC32978v enumC32978vMo24752w0;
        Function1[] function1Arr;
        int i13;
        int i14;
        int i15;
        int i16;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i17 = aVar.f147692M;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                aVar.f147692M = i17 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objInvoke = aVar.f147690K;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i18 = aVar.f147692M;
        if (i18 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            InterfaceC21750d interfaceC21750dM110364v = m110364v();
            if (interfaceC21750dM110364v == null || (enumC32978vMo24752w0 = interfaceC21750dM110364v.mo24752w0()) == null) {
                enumC32978vMo24752w0 = EnumC32978v.MAVERICK;
            }
            function1Arr = new Function1[]{new b(enumC32978vMo24752w0, null)};
            i13 = 1;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            if (i14 < i13) {
                return Boolean.TRUE;
            }
            Function1 function1 = function1Arr[i14];
            aVar.f147693w = null;
            aVar.f147694x = null;
            aVar.f147695y = function1Arr;
            aVar.f147696z = null;
            aVar.f147684E = null;
            aVar.f147685F = i16;
            aVar.f147686G = i15;
            aVar.f147687H = i14;
            aVar.f147688I = i13;
            aVar.f147689J = 0;
            aVar.f147692M = 1;
            objInvoke = function1.invoke(aVar);
            if (objInvoke == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i18 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = aVar.f147688I;
            i14 = aVar.f147687H;
            i15 = aVar.f147686G;
            i16 = aVar.f147685F;
            function1Arr = (Function1[]) aVar.f147695y;
            AbstractC34132o.m107864I(objInvoke);
        }
        C40727h c40727h = (C40727h) objInvoke;
        if (c40727h != null || !c40727h.m132198W()) {
            return Boolean.FALSE;
        }
        i14++;
        if (i14 < i13) {
            return Boolean.TRUE;
        }
        Function1 function2 = function1Arr[i14];
        aVar.f147693w = null;
        aVar.f147694x = null;
        aVar.f147695y = function1Arr;
        aVar.f147696z = null;
        aVar.f147684E = null;
        aVar.f147685F = i16;
        aVar.f147686G = i15;
        aVar.f147687H = i14;
        aVar.f147688I = i13;
        aVar.f147689J = 0;
        aVar.f147692M = 1;
        objInvoke = function2.invoke(aVar);
        if (objInvoke == enumC31071a) {
            return enumC31071a;
        }
        C40727h c40727h2 = (C40727h) objInvoke;
        if (c40727h2 != null) {
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: n */
    private final void m110361n() {
        getLogger().mo85216g("Enqueueing DfuUpdateStrategy on CRP", new AbstractC30556a.a[0]);
        InterfaceC21750d interfaceC21750dM110364v = m110364v();
        if (interfaceC21750dM110364v != null) {
            interfaceC21750dM110364v.mo24749u(this, InterfaceC32564a.c.f134908a);
        }
    }

    /* JADX INFO: renamed from: q */
    private final boolean m110362q() {
        return this.permissionChecker.mo73346a("android.permission.ACCESS_COARSE_LOCATION") || this.permissionChecker.mo73346a("android.permission.ACCESS_FINE_LOCATION");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final Object m110363r(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM110364v = m110364v();
        if (interfaceC21750dM110364v != null) {
            interfaceC21750dM110364v.mo24702P0();
        }
        ((C13045h2) getServiceFlow()).emit(InterfaceC36085k.b.f154179a, interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private final InterfaceC21750d m110364v() {
        return (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public final Object m110365w(WhoopFwDevice whoopFwDevice, InterfaceC30057d<? super AbstractC34946j> interfaceC30057d) {
        i iVar;
        Object next;
        WhoopFwDevice whoopFwDevice2;
        String str;
        InterfaceC21750d interfaceC21750dM110364v;
        WhoopFwDevice whoopFwDevice3;
        C40727h c40727h;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f147810H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f147810H = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objMo84244a = iVar.f147808F;
        Object obj = EnumC31071a.f128113w;
        int i14 = iVar.f147810H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo84244a);
            InterfaceC32449a interfaceC32449a = this.firmwareRepo;
            String serial = whoopFwDevice.getSerial();
            EnumC17623a enumC17623a = EnumC17623a.NORDIC;
            iVar.f147811w = whoopFwDevice;
            iVar.f147810H = 1;
            objMo84244a = interfaceC32449a.mo84244a(serial, enumC17623a, iVar);
            if (objMo84244a != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            whoopFwDevice = (WhoopFwDevice) iVar.f147811w;
            AbstractC34132o.m107864I(objMo84244a);
        } else {
            if (i14 == 2) {
                str = (String) iVar.f147812x;
                whoopFwDevice2 = (WhoopFwDevice) iVar.f147811w;
                AbstractC34132o.m107864I(objMo84244a);
                if (((Boolean) objMo84244a).booleanValue()) {
                    getLogger().mo85222m("Failed to abort realtime streams and history sync", new AbstractC30556a.a[0]);
                    return new AbstractC34946j.b(whoopFwDevice2, str, AbstractC16184f.f.f61474b);
                }
                interfaceC21750dM110364v = m110364v();
                if (interfaceC21750dM110364v != null) {
                    interfaceC21750dM110364v.mo24739n0();
                }
                h hVar = new h(new C4588i(getIGattService(), 2), new C38343e());
                iVar.f147811w = whoopFwDevice2;
                iVar.f147812x = str;
                iVar.f147813y = null;
                iVar.f147814z = null;
                iVar.f147807E = 0;
                iVar.f147810H = 3;
                objMo84244a = AbstractC13091v.m36575A(hVar, iVar);
                if (objMo84244a != obj) {
                    whoopFwDevice3 = whoopFwDevice2;
                }
                return obj;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) iVar.f147812x;
            whoopFwDevice3 = (WhoopFwDevice) iVar.f147811w;
            AbstractC34132o.m107864I(objMo84244a);
        }
        c40727h = (C40727h) objMo84244a;
        if (c40727h == null && c40727h.m132198W()) {
            getLogger().mo85216g("Successfully sent EnterBleDfuPacket", new AbstractC30556a.a[0]);
            return new AbstractC34946j.h(whoopFwDevice3, str);
        }
        getLogger().mo85222m("Failed to send EnterBleDfuPacket", new AbstractC30556a.a[0]);
        return new AbstractC34946j.b(whoopFwDevice3, str, AbstractC16184f.f.f61474b);
        ChipFirmwareVersion chipFirmwareVersion = (ChipFirmwareVersion) objMo84244a;
        String version = chipFirmwareVersion != null ? chipFirmwareVersion.getVersion() : null;
        if (version == null) {
            version = "";
        }
        Iterator<T> it = whoopFwDevice.getChips().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ChipDetails) next).getWhoopChip() != EnumC17623a.NORDIC);
        ChipDetails chipDetails = (ChipDetails) next;
        if (version.equals(chipDetails != null ? chipDetails.getFirmwareVersion() : null)) {
            getLogger().mo85216g("Firmware version is already up to date", new AbstractC30556a.a[0]);
            return new AbstractC34946j.g(whoopFwDevice, version);
        }
        if (!this.locationServicesHelper.m85444e() || !m110362q()) {
            getLogger().mo85222m("Location services are not enabled or required permissions are not granted", new AbstractC30556a.a[0]);
            return AbstractC34946j.d.f147860b;
        }
        iVar.f147811w = whoopFwDevice;
        iVar.f147812x = version;
        iVar.f147810H = 2;
        Object objM110352c = m110352c(iVar);
        if (objM110352c != obj) {
            whoopFwDevice2 = whoopFwDevice;
            str = version;
            objMo84244a = objM110352c;
            if (((Boolean) objMo84244a).booleanValue()) {
                getLogger().mo85222m("Failed to abort realtime streams and history sync", new AbstractC30556a.a[0]);
                return new AbstractC34946j.b(whoopFwDevice2, str, AbstractC16184f.f.f61474b);
            }
            interfaceC21750dM110364v = m110364v();
            if (interfaceC21750dM110364v != null) {
                interfaceC21750dM110364v.mo24739n0();
            }
            h hVar2 = new h(new C4588i(getIGattService(), 2), new C38343e());
            iVar.f147811w = whoopFwDevice2;
            iVar.f147812x = str;
            iVar.f147813y = null;
            iVar.f147814z = null;
            iVar.f147807E = 0;
            iVar.f147810H = 3;
            objMo84244a = AbstractC13091v.m36575A(hVar2, iVar);
            if (objMo84244a != obj) {
                whoopFwDevice3 = whoopFwDevice2;
                c40727h = (C40727h) objMo84244a;
                if (c40727h == null) {
                }
                getLogger().mo85222m("Failed to send EnterBleDfuPacket", new AbstractC30556a.a[0]);
                return new AbstractC34946j.b(whoopFwDevice3, str, AbstractC16184f.f.f61474b);
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m110366y(WhoopFwDevice whoopFwDevice, String str, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        j jVar;
        WhoopFwDevice whoopFwDevice2;
        C22669g0 c22669g0;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f147816F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f147816F = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object obj = jVar.f147820z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar.f147816F;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            getLogger().mo85228t("starting device scan", new AbstractC30556a.a[0]);
            k kVar = new k(c22669g0M32004w, this, null);
            jVar.f147817w = whoopFwDevice;
            jVar.f147818x = str;
            jVar.f147819y = c22669g0M32004w;
            jVar.f147816F = 1;
            if (AbstractC3028k2.m8748b(5000L, kVar, jVar) == enumC31071a) {
                return enumC31071a;
            }
            whoopFwDevice2 = whoopFwDevice;
            c22669g0 = c22669g0M32004w;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = (C22669g0) jVar.f147819y;
            str = (String) jVar.f147818x;
            whoopFwDevice2 = (WhoopFwDevice) jVar.f147817w;
            AbstractC34132o.m107864I(obj);
        }
        InterfaceC34116n logger = getLogger();
        Object obj2 = c22669g0.f89336w;
        if (obj2 == null) {
            AbstractC22676k.m65757q("bluetoothDevice");
            throw null;
        }
        logger.mo85228t("finished device scan, found " + ((BluetoothDevice) obj2), new AbstractC30556a.a[0]);
        File fileM75088i = this.firmwareFilesHelper.m75088i(whoopFwDevice2.getSerial(), "boylston", str);
        String path = fileM75088i != null ? fileM75088i.getPath() : null;
        if (path == null) {
            getLogger().mo85222m("Firmware file not found for " + whoopFwDevice2, new AbstractC30556a.a[0]);
            return new C0456u(new InterfaceC16186h.b(AbstractC16184f.b.f61470b, false, 2, null), 1);
        }
        Object obj3 = c22669g0.f89336w;
        if (obj3 != null) {
            return m110367t((BluetoothDevice) obj3, path);
        }
        AbstractC22676k.m65757q("bluetoothDevice");
        throw null;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: F, reason: from getter */
    public String getTaskName() {
        return this.taskName;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: H */
    public /* bridge */ Object mo23651H(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return super.mo23651H(interfaceC36083i, interfaceC30057d);
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: h, reason: from getter */
    public InterfaceC34116n getLogger() {
        return this.logger;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        m110361n();
        return new C13015a0(new e(AbstractC13091v.m36590P(new C13060l1(AbstractC36080f.m114589b(getServiceFlow()), upstream, new f(null), 1), new d(null, this)), this), new g(null));
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: l, reason: from getter */
    public InterfaceC13075p1 getIGattService() {
        return this.iGattService;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: o, reason: from getter */
    public InterfaceC13075p1 getServiceFlow() {
        return this.serviceFlow;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: t */
    public final InterfaceC13058l m110367t(BluetoothDevice bluetoothDevice, String firmwareFilePath) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        AbstractC22676k.m65750j(firmwareFilePath, "firmwareFilePath");
        return AbstractC13091v.m36600j(new c(bluetoothDevice, firmwareFilePath, null));
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: x */
    public /* bridge */ Object mo23655x(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super InterfaceC36079e> interfaceC30057d) {
        return super.mo23655x(interfaceC36083i, interfaceC30057d);
    }

    public /* synthetic */ C34939c(InterfaceC4733b interfaceC4733b, C25529b c25529b, InterfaceC34943g interfaceC34943g, InterfaceC32449a interfaceC32449a, InterfaceC16182d interfaceC16182d, C28217y0 c28217y0, InterfaceC30585a interfaceC30585a, C29163a c29163a, Context context, C29165c c29165c, InterfaceC25005a interfaceC25005a, InterfaceC34116n interfaceC34116n, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4733b, c25529b, interfaceC34943g, interfaceC32449a, interfaceC16182d, c28217y0, interfaceC30585a, c29163a, context, c29165c, interfaceC25005a, interfaceC34116n, (i13 & 4096) != 0 ? "DfuUpdateStrategy" : str);
    }
}
