package ug1;

import a52.C0398e;
import a52.C0399f;
import a52.C0400g;
import c93.InterfaceC4351m;
import ch.C4588i;
import com.mapbox.maps.MapboxMap;
import com.whoop.connectivityCore.firmware.models.ChipDetails;
import com.whoop.connectivityCore.firmware.models.WhoopDeviceName;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import com.whoop.firmwareUpdateService.data.models.ChipFirmwareVersion;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.C13100y;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import gt0.EnumC16180b;
import gt0.EnumC16181c;
import gt0.InterfaceC16182d;
import gt0.InterfaceC16186h;
import ht0.EnumC17623a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import java.util.Iterator;
import l83.C23454a0;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25265s;
import mg1.C25529b;
import p007a6.C0456u;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg1.InterfaceC32449a;
import sj2.InterfaceC32564a;
import tr2.InterfaceC34116n;
import vk0.AbstractC36080f;
import vk0.InterfaceC36079e;
import vk0.InterfaceC36083i;
import vk0.InterfaceC36084j;
import vk0.InterfaceC36085k;
import wb3.AbstractC37056f;
import xj0.AbstractC38334b;
import y42.C39228j;
import y42.InterfaceC39219a;
import zj0.C40727h;

/* JADX INFO: renamed from: ug1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0001EBC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0016H\u0087@¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010&J$\u0010*\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'0)2\u0006\u0010(\u001a\u00020'H\u0082@¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b,\u0010\"J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00104\u001a\u00020-2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020-H\u0002¢\u0006\u0004\b6\u0010/J#\u00109\u001a\u00020\u001b2\u0006\u00107\u001a\u00020 2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020'2\u0006\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020'H\u0002¢\u0006\u0004\b=\u0010>J(\u0010@\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BH\u0082@¢\u0006\u0004\bC\u0010\u001aJ\u0010\u0010D\u001a\u00020\u001bH\u0082@¢\u0006\u0004\bD\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0016\u0010X\u001a\u0004\u0018\u00010U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010ZR\u0016\u0010^\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010e\u001a\b\u0012\u0004\u0012\u00020`0_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\"\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010b\u001a\u0004\bg\u0010dR\u0018\u0010j\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010iR\u0014\u0010l\u001a\u00020'8\u0002X\u0082D¢\u0006\u0006\n\u0004\bk\u0010]R\u0016\u0010n\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010RR\u0014\u0010p\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010TR\u0014\u0010t\u001a\u00020q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006u"}, m65681d2 = {"Lug1/a;", "Lug1/e;", "Lvk0/j;", "Lmg1/b;", "firmwareFilesHelper", "Lug1/g;", "fwImage", "Lsg1/a;", "firmwareRepo", "Lgt0/d;", "firmwareAnalyticsHelper", "Ly42/j;", "puffinManager", "Ltr2/n;", "logger", "", "taskName", "<init>", "(Lmg1/b;Lug1/g;Lsg1/a;Lgt0/d;Ly42/j;Ltr2/n;Ljava/lang/String;)V", "Lec3/l;", "Lug1/i;", "upstream", "Lgt0/h;", "interact", "(Lec3/l;)Lec3/l;", "P", "(Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "A", "()V", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "", "D", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;", "firmwareVersion", "Lug1/j;", "U", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;)Lec3/l;", "", MapboxMap.QFE_OFFSET, "Ll83/k;", "T", "(ILq83/d;)Ljava/lang/Object;", "V", "Lxj0/b;", "K", "()Lxj0/b;", "", "index", "", "data", "M", "(J[B)Lxj0/b;", "N", "hasFailed", "errorCause", "Q", "(ZLjava/lang/String;)V", "imageOffset", "imageLength", "C", "(II)I", "updateResult", "S", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lgt0/h;Lq83/d;)Ljava/lang/Object;", "Lvk0/i;", "L", "G", "a", "Lmg1/b;", "b", "Lug1/g;", "c", "Lsg1/a;", "d", "Lgt0/d;", "e", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ltr2/n;", "f", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "Ly42/a;", "g", "Ly42/a;", "puffin", "Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "fwPayload", "i", "I", "savedOffset", "Lec3/p1;", "Lvk0/k;", "j", "Lec3/p1;", "o", "()Lec3/p1;", "serviceFlow", "k", "l", "iGattService", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "whoopFwDevice", "m", "byteCount", "n", "targetFwVersion", "O", "whoopFwDeviceName", "Lht0/a;", "J", "()Lht0/a;", "chipName", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34937a implements InterfaceC34941e, InterfaceC36084j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C25529b firmwareFilesHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34943g fwImage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC32449a firmwareRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC16182d firmwareAnalyticsHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String taskName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC39219a puffin;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ByteBuffer fwPayload;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int savedOffset;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC13075p1 serviceFlow;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC13075p1 iGattService;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private WhoopFwDevice whoopFwDevice;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int byteCount;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String targetFwVersion;

    /* JADX INFO: renamed from: ug1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f147487a;

        static {
            int[] iArr = new int[WhoopDeviceName.values().length];
            try {
                iArr[WhoopDeviceName.PUFFIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f147487a = iArr;
        }
    }

    /* JADX INFO: renamed from: ug1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy", m100430f = "BatteryPackUpdateStrategy.kt", m100431l = {96}, m100432m = "checkIfFwAlreadyUpToDate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f147488w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f147489x;

        /* JADX INFO: renamed from: z */
        int f147491z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147489x = obj;
            this.f147491z |= Integer.MIN_VALUE;
            return C34937a.this.m110267D(null, this);
        }
    }

    /* JADX INFO: renamed from: ug1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy$interact$$inlined$flatMapLatest$1", m100430f = "BatteryPackUpdateStrategy.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f147492w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f147493x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f147494y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34937a f147495z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C34937a c34937a) {
            super(3, interfaceC30057d);
            this.f147495z = c34937a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC34946j abstractC34946j, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f147495z);
            dVar.f147493x = interfaceC13062m;
            dVar.f147494y = abstractC34946j;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147492w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f147493x;
                AbstractC34946j abstractC34946j = (AbstractC34946j) this.f147494y;
                if (abstractC34946j instanceof AbstractC34946j.h) {
                    this.f147495z.getLogger().mo85216g("Started sending FW packets", new AbstractC30556a.a[0]);
                    AbstractC34946j.h hVar = (AbstractC34946j.h) abstractC34946j;
                    this.f147495z.targetFwVersion = hVar.getFirmwareVersion();
                    InterfaceC16182d.m45716a(this.f147495z.firmwareAnalyticsHelper, EnumC16180b.BINARY_TRANSFER, EnumC16181c.TRIGGERED, null, this.f147495z.m110274O(), hVar.getFirmwareVersion(), null, 32, null);
                    c0456u = this.f147495z.m110279U(hVar.getDevice(), hVar.getFirmwareVersion());
                } else {
                    if (!(abstractC34946j instanceof AbstractC34946j.b) && !AbstractC22676k.m65745e(abstractC34946j, AbstractC34946j.a.f147855b) && !AbstractC22676k.m65745e(abstractC34946j, AbstractC34946j.e.f147861b) && !AbstractC22676k.m65745e(abstractC34946j, AbstractC34946j.i.f147868b) && !AbstractC22676k.m65745e(abstractC34946j, AbstractC34946j.c.f147859b)) {
                        throw new IllegalStateException("Invalid state " + abstractC34946j);
                    }
                    c0456u = new C0456u(abstractC34946j, 1);
                }
                this.f147493x = null;
                this.f147494y = null;
                this.f147492w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC34946j) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ug1.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f147496w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34937a f147497x;

        /* JADX INFO: renamed from: ug1.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f147498w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34937a f147499x;

            /* JADX INFO: renamed from: ug1.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy$interact$$inlined$map$1$2", m100430f = "BatteryPackUpdateStrategy.kt", m100431l = {66, 67, 68, 69, 74, 83, 84, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42472a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f147500E;

                /* JADX INFO: renamed from: F */
                Object f147501F;

                /* JADX INFO: renamed from: G */
                Object f147502G;

                /* JADX INFO: renamed from: H */
                Object f147503H;

                /* JADX INFO: renamed from: I */
                Object f147504I;

                /* JADX INFO: renamed from: J */
                Object f147505J;

                /* JADX INFO: renamed from: K */
                Object f147506K;

                /* JADX INFO: renamed from: L */
                int f147507L;

                /* JADX INFO: renamed from: M */
                int f147508M;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f147509w;

                /* JADX INFO: renamed from: x */
                int f147510x;

                /* JADX INFO: renamed from: y */
                Object f147511y;

                public C42472a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f147509w = obj;
                    this.f147510x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34937a c34937a) {
                this.f147498w = interfaceC13062m;
                this.f147499x = c34937a;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x00c2 A[PHI: r4 r5 r7 r8
              0x00c2: PHI (r4v38 int) = (r4v36 int), (r4v40 int) binds: [B:36:0x01d7, B:18:0x00a3] A[DONT_GENERATE, DONT_INLINE]
              0x00c2: PHI (r5v10 int) = (r5v8 int), (r5v12 int) binds: [B:36:0x01d7, B:18:0x00a3] A[DONT_GENERATE, DONT_INLINE]
              0x00c2: PHI (r7v7 gt0.h) = (r7v4 gt0.h), (r7v10 gt0.h) binds: [B:36:0x01d7, B:18:0x00a3] A[DONT_GENERATE, DONT_INLINE]
              0x00c2: PHI (r8v27 ec3.m) = (r8v20 ec3.m), (r8v34 ec3.m) binds: [B:36:0x01d7, B:18:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:34:0x01af  */
            /* JADX WARN: Code duplicated, block: B:58:0x02ae  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x01f8, code lost:
            
                if (r8.m110268G(r2) == r3) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x0333, code lost:
            
                if (r1.emit(r4, r2) == r3) goto L68;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r20, q83.InterfaceC30057d r21) throws java.lang.IllegalAccessException {
                /*
                    Method dump skipped, instruction units count: 848
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ug1.C34937a.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public e(InterfaceC13058l interfaceC13058l, C34937a c34937a) {
            this.f147496w = interfaceC13058l;
            this.f147497x = c34937a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f147496w.collect(new a(interfaceC13062m, this.f147497x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug1.a$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy$interact$1", m100430f = "BatteryPackUpdateStrategy.kt", m100431l = {109, 116}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lvk0/k;", "serviceState", "Lug1/i;", "action", "Lug1/j;", "<anonymous>", "(Lvk0/k;Lug1/i;)Lug1/j;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f147513w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f147514x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f147515y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC36085k interfaceC36085k, AbstractC34945i abstractC34945i, InterfaceC30057d<? super AbstractC34946j> interfaceC30057d) {
            f fVar = C34937a.this.new f(interfaceC30057d);
            fVar.f147514x = interfaceC36085k;
            fVar.f147515y = abstractC34945i;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
        
            if (r8 == r2) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.IllegalAccessException {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f147514x
                vk0.k r0 = (vk0.InterfaceC36085k) r0
                java.lang.Object r1 = r7.f147515y
                ug1.i r1 = (ug1.AbstractC34945i) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r7.f147513w
                r4 = 2
                r5 = 1
                r6 = 0
                if (r3 == 0) goto L25
                if (r3 == r5) goto L21
                if (r3 != r4) goto L19
                p505ts.AbstractC34132o.m107864I(r8)
                goto L81
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L4f
            L25:
                p505ts.AbstractC34132o.m107864I(r8)
                ug1.a r8 = ug1.C34937a.this
                com.whoop.connectivityCore.firmware.models.WhoopFwDevice r3 = r1.getDevice()
                ug1.C34937a.m110296y(r8, r3)
                vk0.k$c r8 = vk0.InterfaceC36085k.c.f154180a
                boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r0, r8)
                if (r8 == 0) goto L3c
                ug1.j$i r8 = ug1.AbstractC34946j.i.f147868b
                return r8
            L3c:
                ug1.a r8 = ug1.C34937a.this
                com.whoop.connectivityCore.firmware.models.WhoopFwDevice r0 = r1.getDevice()
                r7.f147514x = r6
                r7.f147515y = r1
                r7.f147513w = r5
                java.lang.Object r8 = ug1.C34937a.m110283e(r8, r0, r7)
                if (r8 != r2) goto L4f
                goto L80
            L4f:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L68
                ug1.a r8 = ug1.C34937a.this
                tr2.n r8 = r8.getLogger()
                r0 = 0
                qr2.a$a[] r0 = new qr2.AbstractC30556a.a[r0]
                java.lang.String r1 = "Firmware already up to date"
                r8.mo85216g(r1, r0)
                ug1.j$c r8 = ug1.AbstractC34946j.c.f147859b
                return r8
            L68:
                boolean r8 = r1 instanceof ug1.AbstractC34945i.a
                if (r8 == 0) goto L84
                ug1.a r8 = ug1.C34937a.this
                ug1.i$a r1 = (ug1.AbstractC34945i.a) r1
                com.whoop.connectivityCore.firmware.models.WhoopFwDevice r0 = r1.getDevice()
                r7.f147514x = r6
                r7.f147515y = r6
                r7.f147513w = r4
                java.lang.Object r8 = ug1.C34937a.m110297z(r8, r0, r7)
                if (r8 != r2) goto L81
            L80:
                return r2
            L81:
                ug1.j r8 = (ug1.AbstractC34946j) r8
                return r8
            L84:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ug1.C34937a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ug1.a$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy$interact$2", m100430f = "BatteryPackUpdateStrategy.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lug1/j;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f147517w;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34937a.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f147517w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C34937a.this.m110265A();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug1.a$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy$interact$5", m100430f = "BatteryPackUpdateStrategy.kt", m100431l = {207}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lgt0/h;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f147519w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return C34937a.this.new h(interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147519w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C34937a c34937a = C34937a.this;
                this.f147519w = 1;
                if (c34937a.m110268G(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ug1.a$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy", m100430f = "BatteryPackUpdateStrategy.kt", m100431l = {355, 355}, m100432m = "processFw", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f147521w;

        /* JADX INFO: renamed from: y */
        int f147523y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147521w = obj;
            this.f147523y |= Integer.MIN_VALUE;
            return C34937a.this.m110298P(this);
        }
    }

    /* JADX INFO: renamed from: ug1.a$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy", m100430f = "BatteryPackUpdateStrategy.kt", m100431l = {377}, m100432m = "reportUpdateResult", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f147524E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f147525F;

        /* JADX INFO: renamed from: H */
        int f147527H;

        /* JADX INFO: renamed from: w */
        Object f147528w;

        /* JADX INFO: renamed from: x */
        Object f147529x;

        /* JADX INFO: renamed from: y */
        Object f147530y;

        /* JADX INFO: renamed from: z */
        Object f147531z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147525F = obj;
            this.f147527H |= Integer.MIN_VALUE;
            return C34937a.this.m110277S(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug1.a$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy", m100430f = "BatteryPackUpdateStrategy.kt", m100431l = {273, 280, 280, 285}, m100432m = "sendFwChunks", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f147533F;

        /* JADX INFO: renamed from: w */
        int f147534w;

        /* JADX INFO: renamed from: x */
        int f147535x;

        /* JADX INFO: renamed from: y */
        int f147536y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f147537z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147537z = obj;
            this.f147533F |= Integer.MIN_VALUE;
            return C34937a.this.m110278T(0, this);
        }
    }

    /* JADX INFO: renamed from: ug1.a$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy$sendFwPackets$1", m100430f = "BatteryPackUpdateStrategy.kt", m100431l = {215, 218, 226, 230, 232, 234, 244, 249, 253, 267}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lug1/j;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f147538E;

        /* JADX INFO: renamed from: F */
        int f147539F;

        /* JADX INFO: renamed from: G */
        private /* synthetic */ Object f147540G;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ WhoopFwDevice f147542I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ String f147543J;

        /* JADX INFO: renamed from: w */
        Object f147544w;

        /* JADX INFO: renamed from: x */
        Object f147545x;

        /* JADX INFO: renamed from: y */
        int f147546y;

        /* JADX INFO: renamed from: z */
        int f147547z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(WhoopFwDevice whoopFwDevice, String str, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147542I = whoopFwDevice;
            this.f147543J = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            l lVar = C34937a.this.new l(this.f147542I, this.f147543J, interfaceC30057d);
            lVar.f147540G = obj;
            return lVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00fc A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:45:0x00fe A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:14:0x0047, B:67:0x01de, B:17:0x005a, B:45:0x00fe, B:48:0x0117, B:50:0x0125, B:52:0x012f, B:55:0x0151, B:58:0x0176, B:63:0x019a, B:64:0x01bc, B:20:0x006d, B:23:0x007c, B:26:0x0087, B:42:0x00e8, B:29:0x008f, B:37:0x00c5, B:39:0x00cd, B:32:0x0096, B:34:0x00b0, B:70:0x01fc), top: B:81:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0115  */
        /* JADX WARN: Code duplicated, block: B:48:0x0117 A[Catch: Exception -> 0x002b, PHI: r0 r7 r8 r9
          0x0117: PHI (r0v31 int) = (r0v27 int), (r0v33 int) binds: [B:24:0x007f, B:46:0x0113] A[DONT_GENERATE, DONT_INLINE]
          0x0117: PHI (r7v20 int) = (r7v15 int), (r7v21 int) binds: [B:24:0x007f, B:46:0x0113] A[DONT_GENERATE, DONT_INLINE]
          0x0117: PHI (r8v11 int) = (r8v7 int), (r8v13 int) binds: [B:24:0x007f, B:46:0x0113] A[DONT_GENERATE, DONT_INLINE]
          0x0117: PHI (r9v12 java.lang.Object) = (r9v4 java.lang.Object), (r9v24 java.lang.Object) binds: [B:24:0x007f, B:46:0x0113] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:14:0x0047, B:67:0x01de, B:17:0x005a, B:45:0x00fe, B:48:0x0117, B:50:0x0125, B:52:0x012f, B:55:0x0151, B:58:0x0176, B:63:0x019a, B:64:0x01bc, B:20:0x006d, B:23:0x007c, B:26:0x0087, B:42:0x00e8, B:29:0x008f, B:37:0x00c5, B:39:0x00cd, B:32:0x0096, B:34:0x00b0, B:70:0x01fc), top: B:81:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:63:0x019a A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:14:0x0047, B:67:0x01de, B:17:0x005a, B:45:0x00fe, B:48:0x0117, B:50:0x0125, B:52:0x012f, B:55:0x0151, B:58:0x0176, B:63:0x019a, B:64:0x01bc, B:20:0x006d, B:23:0x007c, B:26:0x0087, B:42:0x00e8, B:29:0x008f, B:37:0x00c5, B:39:0x00cd, B:32:0x0096, B:34:0x00b0, B:70:0x01fc), top: B:81:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:67:0x01de A[Catch: Exception -> 0x002b, PHI: r0 r7 r8
          0x01de: PHI (r0v36 int) = (r0v33 int), (r0v39 int) binds: [B:43:0x00fa, B:62:0x0197] A[DONT_GENERATE, DONT_INLINE]
          0x01de: PHI (r7v24 int) = (r7v21 int), (r7v26 int) binds: [B:43:0x00fa, B:62:0x0197] A[DONT_GENERATE, DONT_INLINE]
          0x01de: PHI (r8v19 int) = (r8v13 int), (r8v20 int) binds: [B:43:0x00fa, B:62:0x0197] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:14:0x0047, B:67:0x01de, B:17:0x005a, B:45:0x00fe, B:48:0x0117, B:50:0x0125, B:52:0x012f, B:55:0x0151, B:58:0x0176, B:63:0x019a, B:64:0x01bc, B:20:0x006d, B:23:0x007c, B:26:0x0087, B:42:0x00e8, B:29:0x008f, B:37:0x00c5, B:39:0x00cd, B:32:0x0096, B:34:0x00b0, B:70:0x01fc), top: B:81:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:69:0x01fa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0172 -> B:43:0x00fa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x019a -> B:43:0x00fa). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 664
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ug1.C34937a.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ug1.a$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy", m100430f = "BatteryPackUpdateStrategy.kt", m100431l = {292, 300, 301}, m100432m = "startFwLoad", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f147548E;

        /* JADX INFO: renamed from: G */
        int f147550G;

        /* JADX INFO: renamed from: w */
        Object f147551w;

        /* JADX INFO: renamed from: x */
        Object f147552x;

        /* JADX INFO: renamed from: y */
        Object f147553y;

        /* JADX INFO: renamed from: z */
        int f147554z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147548E = obj;
            this.f147550G |= Integer.MIN_VALUE;
            return C34937a.this.m110280V(null, this);
        }
    }

    public C34937a(C25529b firmwareFilesHelper, InterfaceC34943g fwImage, InterfaceC32449a firmwareRepo, InterfaceC16182d firmwareAnalyticsHelper, C39228j puffinManager, InterfaceC34116n logger, String taskName) {
        AbstractC22676k.m65750j(firmwareFilesHelper, "firmwareFilesHelper");
        AbstractC22676k.m65750j(fwImage, "fwImage");
        AbstractC22676k.m65750j(firmwareRepo, "firmwareRepo");
        AbstractC22676k.m65750j(firmwareAnalyticsHelper, "firmwareAnalyticsHelper");
        AbstractC22676k.m65750j(puffinManager, "puffinManager");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(taskName, "taskName");
        this.firmwareFilesHelper = firmwareFilesHelper;
        this.fwImage = fwImage;
        this.firmwareRepo = firmwareRepo;
        this.firmwareAnalyticsHelper = firmwareAnalyticsHelper;
        this.logger = logger;
        this.taskName = taskName;
        this.puffin = (InterfaceC39219a) AbstractC25265s.m74100H0(puffinManager.m124993d());
        this.serviceFlow = AbstractC13091v.m36593c(InterfaceC36085k.a.f154178a);
        this.iGattService = AbstractC13091v.m36593c(null);
        this.byteCount = 220;
        this.targetFwVersion = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final void m110265A() {
        getLogger().mo85216g(AbstractC11895b.m31996o("Enqueueing ", getTaskName(), " on CRP"), new AbstractC30556a.a[0]);
        InterfaceC39219a interfaceC39219a = this.puffin;
        if (interfaceC39219a != null) {
            interfaceC39219a.mo124936a(this, InterfaceC32564a.c.f134908a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final int m110266C(int imageOffset, int imageLength) {
        return (int) ((imageOffset / imageLength) * 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D */
    public final Object m110267D(WhoopFwDevice whoopFwDevice, InterfaceC30057d<? super Boolean> interfaceC30057d) throws IllegalAccessException {
        c cVar;
        Object next;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f147491z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f147491z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objMo84244a = cVar.f147489x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f147491z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo84244a);
            InterfaceC32449a interfaceC32449a = this.firmwareRepo;
            String serial = whoopFwDevice.getSerial();
            EnumC17623a enumC17623aM110269J = m110269J();
            cVar.f147488w = whoopFwDevice;
            cVar.f147491z = 1;
            objMo84244a = interfaceC32449a.mo84244a(serial, enumC17623aM110269J, cVar);
            if (objMo84244a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            whoopFwDevice = (WhoopFwDevice) cVar.f147488w;
            AbstractC34132o.m107864I(objMo84244a);
        }
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
        } while (((ChipDetails) next).getWhoopChip() != m110269J());
        ChipDetails chipDetails = (ChipDetails) next;
        return Boolean.valueOf(version.equals(chipDetails != null ? chipDetails.getFirmwareVersion() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final Object m110268G(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ((C13045h2) getServiceFlow()).emit(InterfaceC36085k.b.f154179a, interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private final EnumC17623a m110269J() throws IllegalAccessException {
        WhoopFwDevice whoopFwDevice = this.whoopFwDevice;
        WhoopDeviceName deviceName = whoopFwDevice != null ? whoopFwDevice.getDeviceName() : null;
        if ((deviceName == null ? -1 : b.f147487a[deviceName.ordinal()]) == 1) {
            return EnumC17623a.NORDIC;
        }
        throw new IllegalAccessException("Unsupported device");
    }

    /* JADX INFO: renamed from: K */
    private final AbstractC38334b m110270K() throws IllegalAccessException {
        WhoopFwDevice whoopFwDevice = this.whoopFwDevice;
        WhoopDeviceName deviceName = whoopFwDevice != null ? whoopFwDevice.getDeviceName() : null;
        if ((deviceName == null ? -1 : b.f147487a[deviceName.ordinal()]) == 1) {
            return new C0400g();
        }
        throw new IllegalAccessException("Unsupported device");
    }

    /* JADX INFO: renamed from: L */
    private final Object m110271L(InterfaceC30057d<? super InterfaceC36083i> interfaceC30057d) {
        return AbstractC13091v.m36575A(new C4588i(getIGattService(), 2), interfaceC30057d);
    }

    /* JADX INFO: renamed from: M */
    private final AbstractC38334b m110272M(long index, byte[] data) throws IllegalAccessException {
        WhoopFwDevice whoopFwDevice = this.whoopFwDevice;
        WhoopDeviceName deviceName = whoopFwDevice != null ? whoopFwDevice.getDeviceName() : null;
        if ((deviceName == null ? -1 : b.f147487a[deviceName.ordinal()]) == 1) {
            return new C0398e(index, data);
        }
        throw new IllegalAccessException("Unsupported device");
    }

    /* JADX INFO: renamed from: N */
    private final AbstractC38334b m110273N() throws IllegalAccessException {
        WhoopFwDevice whoopFwDevice = this.whoopFwDevice;
        WhoopDeviceName deviceName = whoopFwDevice != null ? whoopFwDevice.getDeviceName() : null;
        if ((deviceName == null ? -1 : b.f147487a[deviceName.ordinal()]) == 1) {
            return new C0399f();
        }
        throw new IllegalAccessException("Unsupported device");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final String m110274O() {
        WhoopDeviceName deviceName;
        WhoopFwDevice whoopFwDevice = this.whoopFwDevice;
        String strName = (whoopFwDevice == null || (deviceName = whoopFwDevice.getDeviceName()) == null) ? null : deviceName.name();
        return strName == null ? "" : strName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final void m110275Q(boolean hasFailed, String errorCause) {
        this.firmwareAnalyticsHelper.mo45717b(EnumC16180b.NOTIFICATION, hasFailed ? EnumC16181c.FAILURE : EnumC16181c.SUCCESS, null, m110274O(), this.targetFwVersion, errorCause);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m110276R(C34937a c34937a, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        c34937a.m110275Q(z4, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: S */
    public final Object m110277S(WhoopFwDevice whoopFwDevice, String str, InterfaceC16186h interfaceC16186h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        j jVar;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f147527H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f147527H = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object obj = jVar.f147525F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar.f147527H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            boolean z4 = interfaceC16186h instanceof InterfaceC16186h.e;
            if (z4) {
                getLogger().mo85216g(whoopFwDevice.getDeviceName() + " successfully updated to " + str, new AbstractC30556a.a[0]);
            } else {
                getLogger().mo85216g(str + " installation failed for " + whoopFwDevice.getDeviceName(), new AbstractC30556a.a[0]);
            }
            ChipDetails chipDetails = whoopFwDevice.getChips().get(0);
            InterfaceC32449a interfaceC32449a = this.firmwareRepo;
            WhoopFwDevice whoopFwDeviceCopy$default = WhoopFwDevice.copy$default(whoopFwDevice, null, null, AbstractC37056f.m118958J(new ChipDetails(chipDetails.getWhoopChip(), str)), 3, null);
            jVar.f147528w = null;
            jVar.f147529x = null;
            jVar.f147530y = null;
            jVar.f147531z = null;
            jVar.f147524E = z4 ? 1 : 0;
            jVar.f147527H = 1;
            if (interfaceC32449a.mo84251h(whoopFwDeviceCopy$default, z4, jVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ((C23468n) obj).getClass();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ug1.a] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX INFO: renamed from: T */
    public final Object m110278T(int i13, InterfaceC30057d<? super C23465k> interfaceC30057d) throws IllegalAccessException {
        k kVar;
        int i14;
        int i15;
        Object objM114608r0;
        int i16;
        C40727h c40727h;
        boolean z4;
        InterfaceC34943g interfaceC34943g;
        int i17;
        int i18;
        int i19;
        boolean zM132198W;
        ?? r15;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i24 = kVar.f147533F;
            if ((i24 & Integer.MIN_VALUE) != 0) {
                kVar.f147533F = i24 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        k kVar2 = kVar;
        Object objMo110377e = kVar2.f147537z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i25 = kVar2.f147533F;
        boolean z13 = true;
        if (i25 == 0) {
            AbstractC34132o.m107864I(objMo110377e);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.byteCount);
            this.fwPayload = byteBufferAllocate;
            InterfaceC34943g interfaceC34943g2 = this.fwImage;
            AbstractC22676k.m65747g(byteBufferAllocate);
            int i26 = this.byteCount;
            kVar2.f147534w = i13;
            kVar2.f147533F = 1;
            objMo110377e = interfaceC34943g2.mo110377e(byteBufferAllocate, 0, i26, kVar2);
            if (objMo110377e != enumC31071a) {
            }
            z4 = zM132198W;
            return enumC31071a;
        }
        if (i25 == 1) {
            i13 = kVar2.f147534w;
            AbstractC34132o.m107864I(objMo110377e);
        } else {
            if (i25 == 2) {
                i15 = kVar2.f147535x;
                int i27 = kVar2.f147534w;
                AbstractC34132o.m107864I(objMo110377e);
                i14 = i27;
                InterfaceC36083i interfaceC36083i = (InterfaceC36083i) objMo110377e;
                ByteBuffer byteBuffer = this.fwPayload;
                AbstractC22676k.m65747g(byteBuffer);
                byte[] bArrArray = byteBuffer.array();
                AbstractC22676k.m65749i(bArrArray, "array(...)");
                AbstractC38334b abstractC38334bM110272M = m110272M(i14, bArrArray);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(20, DurationUnit.SECONDS);
                kVar2.f147534w = i14;
                kVar2.f147535x = i15;
                kVar2.f147533F = 3;
                objM114608r0 = InterfaceC36083i.m114608r0(interfaceC36083i, abstractC38334bM110272M, duration, false, kVar2, 4, null);
                if (objM114608r0 != enumC31071a) {
                    i16 = i14;
                    if (objM114608r0 instanceof C23467m) {
                        objM114608r0 = null;
                    }
                    c40727h = (C40727h) objM114608r0;
                    if (c40727h != null) {
                        zM132198W = c40727h.m132198W();
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        i19 = i16 + i15;
                    } else {
                        interfaceC34943g = this.fwImage;
                        kVar2.f147534w = i16;
                        kVar2.f147535x = i15;
                        kVar2.f147536y = z4 ? 1 : 0;
                        kVar2.f147533F = 4;
                        if (interfaceC34943g.mo110373a(kVar2) != enumC31071a) {
                            z4 = zM132198W;
                            i17 = z4 ? 1 : 0;
                            i18 = i16;
                        }
                    }
                    if (r15 == 0) {
                        z4 = zM132198W;
                        r15 = z4;
                        z13 = false;
                    }
                    z4 = zM132198W;
                    r15 = z4;
                    return new C23465k(Boolean.valueOf(z13), new Integer(i19));
                }
                z4 = zM132198W;
                return enumC31071a;
            }
            if (i25 == 3) {
                i15 = kVar2.f147535x;
                i16 = kVar2.f147534w;
                AbstractC34132o.m107864I(objMo110377e);
                objM114608r0 = ((C23468n) objMo110377e).f92940w;
                if (objM114608r0 instanceof C23467m) {
                    objM114608r0 = null;
                }
                c40727h = (C40727h) objM114608r0;
                if (c40727h != null) {
                    zM132198W = c40727h.m132198W();
                } else {
                    z4 = false;
                }
                if (!z4) {
                    interfaceC34943g = this.fwImage;
                    kVar2.f147534w = i16;
                    kVar2.f147535x = i15;
                    kVar2.f147536y = z4 ? 1 : 0;
                    kVar2.f147533F = 4;
                    if (interfaceC34943g.mo110373a(kVar2) != enumC31071a) {
                        z4 = zM132198W;
                        i17 = z4 ? 1 : 0;
                        i18 = i16;
                    }
                    z4 = zM132198W;
                    return enumC31071a;
                }
                i19 = i16 + i15;
                if (r15 == 0) {
                    z4 = zM132198W;
                    r15 = z4;
                    z13 = false;
                }
                z4 = zM132198W;
                r15 = z4;
                return new C23465k(Boolean.valueOf(z13), new Integer(i19));
            }
            if (i25 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = kVar2.f147536y;
            i18 = kVar2.f147534w;
            AbstractC34132o.m107864I(objMo110377e);
        }
        r15 = i17;
        i19 = i18;
        if (r15 == 0) {
            z4 = zM132198W;
            r15 = z4;
            z13 = false;
        }
        z4 = zM132198W;
        r15 = z4;
        return new C23465k(Boolean.valueOf(z13), new Integer(i19));
        int iIntValue = ((Number) objMo110377e).intValue();
        if (iIntValue == -1) {
            return new C23465k(Boolean.TRUE, new Integer(iIntValue));
        }
        getLogger().mo85216g(AbstractC2875y.m8294g(iIntValue, i13, "Sending ", " bytes from offset "), new AbstractC30556a.a[0]);
        ByteBuffer byteBuffer2 = this.fwPayload;
        AbstractC22676k.m65747g(byteBuffer2);
        byteBuffer2.position(0);
        kVar2.f147534w = i13;
        kVar2.f147535x = iIntValue;
        kVar2.f147533F = 2;
        Object objM110271L = m110271L(kVar2);
        if (objM110271L != enumC31071a) {
            i14 = i13;
            i15 = iIntValue;
            objMo110377e = objM110271L;
            InterfaceC36083i interfaceC36083i2 = (InterfaceC36083i) objMo110377e;
            ByteBuffer byteBuffer3 = this.fwPayload;
            AbstractC22676k.m65747g(byteBuffer3);
            byte[] bArrArray2 = byteBuffer3.array();
            AbstractC22676k.m65749i(bArrArray2, "array(...)");
            AbstractC38334b abstractC38334bM110272M2 = m110272M(i14, bArrArray2);
            Duration.Companion companion2 = Duration.INSTANCE;
            long duration2 = DurationKt.toDuration(20, DurationUnit.SECONDS);
            kVar2.f147534w = i14;
            kVar2.f147535x = i15;
            kVar2.f147533F = 3;
            objM114608r0 = InterfaceC36083i.m114608r0(interfaceC36083i2, abstractC38334bM110272M2, duration2, false, kVar2, 4, null);
            if (objM114608r0 != enumC31071a) {
                i16 = i14;
                if (objM114608r0 instanceof C23467m) {
                    objM114608r0 = null;
                }
                c40727h = (C40727h) objM114608r0;
                if (c40727h != null) {
                    zM132198W = c40727h.m132198W();
                } else {
                    z4 = false;
                }
                if (!z4) {
                    i19 = i16 + i15;
                } else {
                    interfaceC34943g = this.fwImage;
                    kVar2.f147534w = i16;
                    kVar2.f147535x = i15;
                    kVar2.f147536y = z4 ? 1 : 0;
                    kVar2.f147533F = 4;
                    if (interfaceC34943g.mo110373a(kVar2) != enumC31071a) {
                        z4 = zM132198W;
                        i17 = z4 ? 1 : 0;
                        i18 = i16;
                        r15 = i17;
                        i19 = i18;
                    }
                }
                if (r15 == 0) {
                    z4 = zM132198W;
                    r15 = z4;
                    z13 = false;
                }
                z4 = zM132198W;
                r15 = z4;
                return new C23465k(Boolean.valueOf(z13), new Integer(i19));
            }
        }
        z4 = zM132198W;
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final InterfaceC13058l m110279U(WhoopFwDevice device, String firmwareVersion) {
        return new C13084s1(new l(device, firmwareVersion, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (r0 == r4) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX INFO: renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110280V(com.whoop.connectivityCore.firmware.models.WhoopFwDevice r17, q83.InterfaceC30057d<? super ug1.AbstractC34946j> r18) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug1.C34937a.m110280V(com.whoop.connectivityCore.firmware.models.WhoopFwDevice, q83.d):java.lang.Object");
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110298P(q83.InterfaceC30057d<? super gt0.InterfaceC16186h> r12) throws java.lang.IllegalAccessException {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ug1.C34937a.i
            if (r0 == 0) goto L14
            r0 = r12
            ug1.a$i r0 = (ug1.C34937a.i) r0
            int r1 = r0.f147523y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f147523y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ug1.a$i r0 = new ug1.a$i
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f147521w
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f147523y
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L3c
            if (r1 == r10) goto L38
            if (r1 != r9) goto L30
            p505ts.AbstractC34132o.m107864I(r12)
            l83.n r12 = (l83.C23468n) r12
            java.lang.Object r12 = r12.f92940w
            goto L65
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L38:
            p505ts.AbstractC34132o.m107864I(r12)
            goto L48
        L3c:
            p505ts.AbstractC34132o.m107864I(r12)
            r6.f147523y = r10
            java.lang.Object r12 = r11.m110271L(r6)
            if (r12 != r0) goto L48
            goto L64
        L48:
            r1 = r12
            vk0.i r1 = (vk0.InterfaceC36083i) r1
            xj0.b r2 = r11.m110273N()
            kotlin.time.Duration$Companion r12 = p715kotlin.time.Duration.INSTANCE
            r12 = 20
            kotlin.time.DurationUnit r3 = p715kotlin.time.DurationUnit.SECONDS
            long r3 = p715kotlin.time.DurationKt.toDuration(r12, r3)
            r6.f147523y = r9
            r5 = 0
            r7 = 4
            r8 = 0
            java.lang.Object r12 = vk0.InterfaceC36083i.m114608r0(r1, r2, r3, r5, r6, r7, r8)
            if (r12 != r0) goto L65
        L64:
            return r0
        L65:
            boolean r0 = r12 instanceof l83.C23467m
            r1 = 0
            if (r0 == 0) goto L6b
            r12 = r1
        L6b:
            zj0.h r12 = (zj0.C40727h) r12
            r0 = 0
            if (r12 == 0) goto L7c
            boolean r12 = r12.m132198W()
            if (r12 != r10) goto L7c
            m110276R(r11, r0, r1, r9, r1)
            gt0.h$e r12 = gt0.InterfaceC16186h.e.f61486b
            return r12
        L7c:
            gt0.f$e r12 = gt0.AbstractC16184f.e.f61473b
            java.lang.String r2 = r12.getErrorMessage()
            r11.m110275Q(r10, r2)
            gt0.h$b r2 = new gt0.h$b
            r2.<init>(r12, r0, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ug1.C34937a.m110298P(q83.d):java.lang.Object");
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: h, reason: from getter */
    public InterfaceC34116n getLogger() {
        return this.logger;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13100y(new e(AbstractC13091v.m36590P(AbstractC13091v.m36610t(new C13015a0(new g(null), new C13060l1(AbstractC36080f.m114589b(getServiceFlow()), upstream, new f(null), 1))), new d(null, this)), this), new h(null));
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

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: x */
    public /* bridge */ Object mo23655x(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super InterfaceC36079e> interfaceC30057d) {
        return super.mo23655x(interfaceC36083i, interfaceC30057d);
    }

    public /* synthetic */ C34937a(C25529b c25529b, InterfaceC34943g interfaceC34943g, InterfaceC32449a interfaceC32449a, InterfaceC16182d interfaceC16182d, C39228j c39228j, InterfaceC34116n interfaceC34116n, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c25529b, interfaceC34943g, interfaceC32449a, interfaceC16182d, c39228j, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BatteryPackUpdateStrategy") : interfaceC34116n, (i13 & 64) != 0 ? "BatteryPackUpdateStrategy" : str);
    }
}
