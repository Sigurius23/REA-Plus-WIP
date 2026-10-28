package ug1;

import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.InterfaceC4733b;
import com.mapbox.common.logger.LogPriority;
import com.mapbox.maps.MapboxMap;
import com.whoop.connectivityCore.firmware.models.ChipDetails;
import com.whoop.connectivityCore.firmware.models.WhoopDeviceName;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import com.whoop.data.repositories.FeatureFlagChecker;
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
import java.time.Clock;
import java.util.Iterator;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import mg1.C25529b;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg1.InterfaceC32449a;
import sj2.InterfaceC32564a;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import vk0.AbstractC36080f;
import vk0.InterfaceC36079e;
import vk0.InterfaceC36083i;
import vk0.InterfaceC36084j;
import vk0.InterfaceC36085k;
import wb3.AbstractC37056f;
import xj0.AbstractC38334b;
import xj0.C38336b1;
import xj0.C38339c1;
import xj0.C38341d0;
import xj0.C38344e0;
import xj0.C38393y;
import xj0.C38395z;
import zj0.C40727h;

/* JADX INFO: renamed from: ug1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u008b\u00012\u00020\u00012\u00020\u0002:\u0001LBS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b(\u0010)J%\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00172\u0006\u0010'\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0013H\u0002¢\u0006\u0004\b,\u0010-J$\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020.002\u0006\u0010/\u001a\u00020.H\u0082@¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020+2\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b3\u0010)J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u001f\u0010;\u001a\u0002042\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u000204H\u0002¢\u0006\u0004\b=\u00106J\u0010\u0010>\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b@\u0010?J\u0010\u0010A\u001a\u00020\u001fH\u0082@¢\u0006\u0004\bA\u0010?J\u001f\u0010D\u001a\u00020.2\u0006\u0010B\u001a\u00020.2\u0006\u0010C\u001a\u00020.H\u0002¢\u0006\u0004\bD\u0010EJ(\u0010G\u001a\u00020#2\u0006\u0010'\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00132\u0006\u0010F\u001a\u00020\u001aH\u0082@¢\u0006\u0004\bG\u0010HJ\u0010\u0010J\u001a\u00020IH\u0082@¢\u0006\u0004\bJ\u0010?J\u0010\u0010K\u001a\u00020#H\u0082@¢\u0006\u0004\bK\u0010?R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010PR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bY\u0010[R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010f\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR \u0010m\u001a\b\u0012\u0004\u0012\u00020h0g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\"\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010j\u001a\u0004\bi\u0010lR\u0018\u0010r\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010s\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010]R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010JR\u0016\u0010v\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010JR\u0016\u0010z\u001a\u0004\u0018\u00010w8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010_R\u0017\u0010\u0083\u0001\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0086\u0001\u001a\u00020.8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008c\u0001"}, m65681d2 = {"Lug1/b;", "Lug1/e;", "Lvk0/j;", "Lci2/b;", "whoopStrapProvider", "Lmg1/b;", "firmwareFilesHelper", "Lug1/g;", "fwImage", "Lsg1/a;", "firmwareRepo", "Lgt0/d;", "firmwareAnalyticsHelper", "Ljava/time/Clock;", "clock", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "", "taskName", "<init>", "(Lci2/b;Lmg1/b;Lug1/g;Lsg1/a;Lgt0/d;Ljava/time/Clock;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Ljava/lang/String;)V", "Lec3/l;", "Lug1/i;", "upstream", "Lgt0/h;", "interact", "(Lec3/l;)Lec3/l;", "Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;", "deviceName", "", "k0", "(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;)Z", "userAcceptanceRequired", "Ll83/a0;", "S", "(Z)V", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "U", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;", "firmwareVersion", "Lug1/j;", "j0", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;)Lec3/l;", "", MapboxMap.QFE_OFFSET, "Ll83/k;", "i0", "(ILq83/d;)Ljava/lang/Object;", "l0", "Lxj0/b;", "Y", "()Lxj0/b;", "", "index", "", "data", "a0", "(J[B)Lxj0/b;", "b0", "m0", "(Lq83/d;)Ljava/lang/Object;", "g0", "c", "imageOffset", "imageLength", "T", "(II)I", "updateResult", "h0", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lgt0/h;Lq83/d;)Ljava/lang/Object;", "Lvk0/i;", "Z", "V", "a", "Lci2/b;", "b", "Lmg1/b;", "Lug1/g;", "d", "Lsg1/a;", "e", "Lgt0/d;", "f", "Ljava/time/Clock;", "g", "Lcom/whoop/data/repositories/FeatureFlagChecker;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ltr2/n;", "()Ltr2/n;", "i", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "Ljava/nio/ByteBuffer;", "j", "Ljava/nio/ByteBuffer;", "fwPayload", "k", "I", "savedOffset", "Lec3/p1;", "Lvk0/k;", "l", "Lec3/p1;", "o", "()Lec3/p1;", "serviceFlow", "m", "iGattService", "n", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "whoopFwDevice", "targetFwVersion", "p", "q", "isForcedFwUpdate", "Ljk0/d;", "e0", "()Ljk0/d;", "whoopStrap", "Lst0/v;", "c0", "()Lst0/v;", "strapGen", "d0", "whoopFwDeviceName", "f0", "()Z", "isNewForcedFwUpdateEnabled", "W", "()I", "byteCount", "Lht0/a;", "X", "()Lht0/a;", "chipName", "r", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34938b implements InterfaceC34941e, InterfaceC36084j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25529b firmwareFilesHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34943g fwImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC32449a firmwareRepo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC16182d firmwareAnalyticsHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String taskName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ByteBuffer fwPayload;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int savedOffset;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC13075p1 serviceFlow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC13075p1 iGattService;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private WhoopFwDevice whoopFwDevice;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String targetFwVersion;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean userAcceptanceRequired;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean isForcedFwUpdate;

    /* JADX INFO: renamed from: ug1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f147573a;

        static {
            int[] iArr = new int[WhoopDeviceName.values().length];
            try {
                iArr[WhoopDeviceName.MONUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WhoopDeviceName.SYMPHONY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WhoopDeviceName.GOOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WhoopDeviceName.MAVERICK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f147573a = iArr;
        }
    }

    /* JADX INFO: renamed from: ug1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy", m100430f = "DefaultUpdateStrategy.kt", m100431l = {485, 527}, m100432m = "abortRealtimeStreamsAndHistorySync", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147574E;

        /* JADX INFO: renamed from: F */
        Object f147575F;

        /* JADX INFO: renamed from: G */
        int f147576G;

        /* JADX INFO: renamed from: H */
        int f147577H;

        /* JADX INFO: renamed from: I */
        int f147578I;

        /* JADX INFO: renamed from: J */
        int f147579J;

        /* JADX INFO: renamed from: K */
        int f147580K;

        /* JADX INFO: renamed from: L */
        int f147581L;

        /* JADX INFO: renamed from: M */
        /* synthetic */ Object f147582M;

        /* JADX INFO: renamed from: O */
        int f147584O;

        /* JADX INFO: renamed from: w */
        Object f147585w;

        /* JADX INFO: renamed from: x */
        Object f147586x;

        /* JADX INFO: renamed from: y */
        Object f147587y;

        /* JADX INFO: renamed from: z */
        Object f147588z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147582M = obj;
            this.f147584O |= Integer.MIN_VALUE;
            return C34938b.this.m110323c(this);
        }
    }

    /* JADX INFO: renamed from: ug1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy$abortRealtimeStreamsAndHistorySync$2$1", m100430f = "DefaultUpdateStrategy.kt", m100431l = {488, 489, 490}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lzj0/h;", "<anonymous>", "()Lzj0/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f147589w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC36083i f147590x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34938b f147591y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC36083i interfaceC36083i, C34938b c34938b, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f147590x = interfaceC36083i;
            this.f147591y = c34938b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f147590x, this.f147591y, interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
        
            if (r14 == r0) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r13.f147589w
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                p505ts.AbstractC34132o.m107864I(r14)
                l83.n r14 = (l83.C23468n) r14
                java.lang.Object r14 = r14.f92940w
                goto L89
            L19:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L21:
                p505ts.AbstractC34132o.m107864I(r14)
                l83.n r14 = (l83.C23468n) r14
                java.lang.Object r14 = r14.f92940w
                r10 = r13
                goto L6e
            L2a:
                p505ts.AbstractC34132o.m107864I(r14)
                l83.n r14 = (l83.C23468n) r14
                java.lang.Object r14 = r14.f92940w
                r10 = r13
                goto L53
            L33:
                p505ts.AbstractC34132o.m107864I(r14)
                r14 = r5
                vk0.i r5 = r13.f147590x
                xj0.l1 r6 = new xj0.l1
                ug1.b r1 = r13.f147591y
                st0.v r1 = ug1.C34938b.m110346t(r1)
                r6.<init>(r2, r1)
                r13.f147589w = r14
                r7 = 0
                r9 = 0
                r11 = 6
                r12 = 0
                r10 = r13
                java.lang.Object r14 = vk0.InterfaceC36083i.m114608r0(r5, r6, r7, r9, r10, r11, r12)
                if (r14 != r0) goto L53
                goto L88
            L53:
                vk0.i r5 = r10.f147590x
                xj0.h1 r6 = new xj0.h1
                ug1.b r14 = r10.f147591y
                st0.v r14 = ug1.C34938b.m110346t(r14)
                r6.<init>(r2, r14)
                r10.f147589w = r4
                r7 = 0
                r9 = 0
                r11 = 6
                r12 = 0
                java.lang.Object r14 = vk0.InterfaceC36083i.m114608r0(r5, r6, r7, r9, r10, r11, r12)
                if (r14 != r0) goto L6e
                goto L88
            L6e:
                vk0.i r5 = r10.f147590x
                xj0.s r6 = new xj0.s
                ug1.b r14 = r10.f147591y
                st0.v r14 = ug1.C34938b.m110346t(r14)
                r6.<init>(r14)
                r10.f147589w = r3
                r7 = 0
                r9 = 0
                r11 = 6
                r12 = 0
                java.lang.Object r14 = vk0.InterfaceC36083i.m114608r0(r5, r6, r7, r9, r10, r11, r12)
                if (r14 != r0) goto L89
            L88:
                return r0
            L89:
                boolean r0 = r14 instanceof l83.C23467m
                if (r0 == 0) goto L8e
                r14 = 0
            L8e:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ug1.C34938b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C40727h> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ug1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy", m100430f = "DefaultUpdateStrategy.kt", m100431l = {142}, m100432m = "checkIfFwAlreadyUpToDate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f147592w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f147593x;

        /* JADX INFO: renamed from: z */
        int f147595z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147593x = obj;
            this.f147595z |= Integer.MIN_VALUE;
            return C34938b.this.m110315U(null, this);
        }
    }

    /* JADX INFO: renamed from: ug1.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy$interact$$inlined$flatMapLatest$1", m100430f = "DefaultUpdateStrategy.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f147596w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f147597x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f147598y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34938b f147599z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, C34938b c34938b) {
            super(3, interfaceC30057d);
            this.f147599z = c34938b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC34946j abstractC34946j, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f147599z);
            fVar.f147597x = interfaceC13062m;
            fVar.f147598y = abstractC34946j;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147596w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f147597x;
                AbstractC34946j abstractC34946j = (AbstractC34946j) this.f147598y;
                if (abstractC34946j instanceof AbstractC34946j.h) {
                    this.f147599z.getLogger().mo85216g("Started sending FW packets", new AbstractC30556a.a[0]);
                    AbstractC34946j.h hVar = (AbstractC34946j.h) abstractC34946j;
                    this.f147599z.targetFwVersion = hVar.getFirmwareVersion();
                    InterfaceC16182d.m45716a(this.f147599z.firmwareAnalyticsHelper, EnumC16180b.BINARY_TRANSFER, EnumC16181c.TRIGGERED, null, this.f147599z.m110326d0(), this.f147599z.targetFwVersion, null, 32, null);
                    c0456u = this.f147599z.m110337j0(hVar.getDevice(), hVar.getFirmwareVersion());
                } else {
                    if (!(abstractC34946j instanceof AbstractC34946j.b) && !AbstractC22676k.m65745e(abstractC34946j, AbstractC34946j.a.f147855b) && !AbstractC22676k.m65745e(abstractC34946j, AbstractC34946j.e.f147861b) && !AbstractC22676k.m65745e(abstractC34946j, AbstractC34946j.i.f147868b) && !AbstractC22676k.m65745e(abstractC34946j, AbstractC34946j.c.f147859b)) {
                        throw new IllegalStateException("Invalid state " + abstractC34946j);
                    }
                    c0456u = new C0456u(abstractC34946j, 1);
                }
                this.f147597x = null;
                this.f147598y = null;
                this.f147596w = 1;
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

    /* JADX INFO: renamed from: ug1.b$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f147600w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34938b f147601x;

        /* JADX INFO: renamed from: ug1.b$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f147602w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34938b f147603x;

            /* JADX INFO: renamed from: ug1.b$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy$interact$$inlined$map$1$2", m100430f = "DefaultUpdateStrategy.kt", m100431l = {74, 80, 82, 96, LogPriority.NONE, 102, 112, 113, 114, 129, 137, 138, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42473a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f147604E;

                /* JADX INFO: renamed from: F */
                Object f147605F;

                /* JADX INFO: renamed from: G */
                Object f147606G;

                /* JADX INFO: renamed from: H */
                Object f147607H;

                /* JADX INFO: renamed from: I */
                Object f147608I;

                /* JADX INFO: renamed from: J */
                Object f147609J;

                /* JADX INFO: renamed from: K */
                Object f147610K;

                /* JADX INFO: renamed from: L */
                int f147611L;

                /* JADX INFO: renamed from: M */
                int f147612M;

                /* JADX INFO: renamed from: N */
                int f147613N;

                /* JADX INFO: renamed from: O */
                long f147614O;

                /* JADX INFO: renamed from: P */
                long f147615P;

                /* JADX INFO: renamed from: Q */
                long f147616Q;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f147617w;

                /* JADX INFO: renamed from: x */
                int f147618x;

                /* JADX INFO: renamed from: y */
                Object f147619y;

                public C42473a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f147617w = obj;
                    this.f147618x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34938b c34938b) {
                this.f147602w = interfaceC13062m;
                this.f147603x = c34938b;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x00c5 A[PHI: r4 r5 r6 r7 r9
              0x00c5: PHI (r4v26 ??) = (r4v43 ??), (r4v44 ??) binds: [B:88:0x04fe, B:18:0x00a4] A[DONT_GENERATE, DONT_INLINE]
              0x00c5: PHI (r5v37 int) = (r5v35 int), (r5v39 int) binds: [B:88:0x04fe, B:18:0x00a4] A[DONT_GENERATE, DONT_INLINE]
              0x00c5: PHI (r6v33 int) = (r6v31 int), (r6v35 int) binds: [B:88:0x04fe, B:18:0x00a4] A[DONT_GENERATE, DONT_INLINE]
              0x00c5: PHI (r7v42 gt0.h) = (r7v39 gt0.h), (r7v45 gt0.h) binds: [B:88:0x04fe, B:18:0x00a4] A[DONT_GENERATE, DONT_INLINE]
              0x00c5: PHI (r9v42 ec3.m) = (r9v35 ec3.m), (r9v48 ec3.m) binds: [B:88:0x04fe, B:18:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:42:0x0256  */
            /* JADX WARN: Code duplicated, block: B:47:0x0268  */
            /* JADX WARN: Code duplicated, block: B:58:0x0330  */
            /* JADX WARN: Code duplicated, block: B:61:0x0376  */
            /* JADX WARN: Code duplicated, block: B:64:0x03de  */
            /* JADX WARN: Code duplicated, block: B:66:0x03ee  */
            /* JADX WARN: Code duplicated, block: B:71:0x044a  */
            /* JADX WARN: Code duplicated, block: B:74:0x046c  */
            /* JADX WARN: Code duplicated, block: B:77:0x0477  */
            /* JADX WARN: Code duplicated, block: B:79:0x0487  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code duplicated, block: B:81:0x048c  */
            /* JADX WARN: Code duplicated, block: B:86:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:94:0x052a  */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x05fd, code lost:
            
                if (r4.m110316V(r2) == r3) goto L124;
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x0672, code lost:
            
                if (r4.emit(r5, r2) == r3) goto L124;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x0434, code lost:
            
                if (r1 == r3) goto L124;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x0523, code lost:
            
                if (r8.m110316V(r2) == r3) goto L124;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v30 */
            /* JADX WARN: Type inference failed for: r1v31, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r1v36 */
            /* JADX WARN: Type inference failed for: r4v11, types: [int] */
            /* JADX WARN: Type inference failed for: r4v22, types: [int] */
            /* JADX WARN: Type inference failed for: r4v24, types: [int] */
            /* JADX WARN: Type inference failed for: r4v26, types: [int] */
            /* JADX WARN: Type inference failed for: r4v43 */
            /* JADX WARN: Type inference failed for: r4v44 */
            /* JADX WARN: Type inference failed for: r4v45 */
            /* JADX WARN: Type inference failed for: r4v46 */
            /* JADX WARN: Type inference failed for: r4v47 */
            /* JADX WARN: Type inference failed for: r4v48 */
            /* JADX WARN: Type inference failed for: r4v8 */
            /* JADX WARN: Type inference failed for: r4v9 */
            /* JADX WARN: Type inference failed for: r6v10 */
            /* JADX WARN: Type inference failed for: r6v12, types: [int] */
            /* JADX WARN: Type inference failed for: r6v16 */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r31, q83.InterfaceC30057d r32) {
                /*
                    Method dump skipped, instruction units count: 1688
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ug1.C34938b.g.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public g(InterfaceC13058l interfaceC13058l, C34938b c34938b) {
            this.f147600w = interfaceC13058l;
            this.f147601x = c34938b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f147600w.collect(new a(interfaceC13062m, this.f147601x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug1.b$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy$interact$1", m100430f = "DefaultUpdateStrategy.kt", m100431l = {154, 161}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lvk0/k;", "serviceState", "Lug1/i;", "action", "Lug1/j;", "<anonymous>", "(Lvk0/k;Lug1/i;)Lug1/j;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f147621w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f147622x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f147623y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC36085k interfaceC36085k, AbstractC34945i abstractC34945i, InterfaceC30057d<? super AbstractC34946j> interfaceC30057d) {
            h hVar = C34938b.this.new h(interfaceC30057d);
            hVar.f147622x = interfaceC36085k;
            hVar.f147623y = abstractC34945i;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        
            if (r8 == r2) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f147622x
                vk0.k r0 = (vk0.InterfaceC36085k) r0
                java.lang.Object r1 = r7.f147623y
                ug1.i r1 = (ug1.AbstractC34945i) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r7.f147621w
                r4 = 2
                r5 = 1
                r6 = 0
                if (r3 == 0) goto L25
                if (r3 == r5) goto L21
                if (r3 != r4) goto L19
                p505ts.AbstractC34132o.m107864I(r8)
                goto L78
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L46
            L25:
                p505ts.AbstractC34132o.m107864I(r8)
                vk0.k$c r8 = vk0.InterfaceC36085k.c.f154180a
                boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r0, r8)
                if (r8 == 0) goto L33
                ug1.j$i r8 = ug1.AbstractC34946j.i.f147868b
                return r8
            L33:
                ug1.b r8 = ug1.C34938b.this
                com.whoop.connectivityCore.firmware.models.WhoopFwDevice r0 = r1.getDevice()
                r7.f147622x = r6
                r7.f147623y = r1
                r7.f147621w = r5
                java.lang.Object r8 = ug1.C34938b.m110331g(r8, r0, r7)
                if (r8 != r2) goto L46
                goto L77
            L46:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L5f
                ug1.b r8 = ug1.C34938b.this
                tr2.n r8 = r8.getLogger()
                r0 = 0
                qr2.a$a[] r0 = new qr2.AbstractC30556a.a[r0]
                java.lang.String r1 = "Firmware already up to date"
                r8.mo85216g(r1, r0)
                ug1.j$c r8 = ug1.AbstractC34946j.c.f147859b
                return r8
            L5f:
                boolean r8 = r1 instanceof ug1.AbstractC34945i.a
                if (r8 == 0) goto L7b
                ug1.b r8 = ug1.C34938b.this
                ug1.i$a r1 = (ug1.AbstractC34945i.a) r1
                com.whoop.connectivityCore.firmware.models.WhoopFwDevice r0 = r1.getDevice()
                r7.f147622x = r6
                r7.f147623y = r6
                r7.f147621w = r4
                java.lang.Object r8 = ug1.C34938b.m110311Q(r8, r0, r7)
                if (r8 != r2) goto L78
            L77:
                return r2
            L78:
                ug1.j r8 = (ug1.AbstractC34946j) r8
                return r8
            L7b:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ug1.C34938b.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ug1.b$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy$interact$2", m100430f = "DefaultUpdateStrategy.kt", m100431l = {166, 169}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lug1/j;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C34938b f147625E;

        /* JADX INFO: renamed from: w */
        Object f147626w;

        /* JADX INFO: renamed from: x */
        Object f147627x;

        /* JADX INFO: renamed from: y */
        int f147628y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f147629z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC13058l interfaceC13058l, C34938b c34938b, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147629z = interfaceC13058l;
            this.f147625E = c34938b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f147629z, this.f147625E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C34938b c34938b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147628y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058l = this.f147629z;
                this.f147628y = 1;
                obj = AbstractC13091v.m36575A(interfaceC13058l, this);
                if (obj != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c34938b = (C34938b) this.f147627x;
                AbstractC34132o.m107864I(obj);
            }
            c34938b.isForcedFwUpdate = ((Boolean) obj).booleanValue();
            this.f147625E.getLogger().mo85226q(AbstractC11266d.m30462p("isForcedFwUpdate from onStart is ", this.f147625E.isForcedFwUpdate), new AbstractC30556a.a[0]);
            C34938b c34938b2 = this.f147625E;
            c34938b2.m110313S(c34938b2.userAcceptanceRequired);
            return C23454a0.f92919a;
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.whoop.firmwareUpdateService.strategy.StrategyAction.Start");
            AbstractC34945i.a aVar = (AbstractC34945i.a) obj;
            this.f147625E.userAcceptanceRequired = aVar.getUserAcceptanceRequired();
            this.f147625E.whoopFwDevice = aVar.getDevice();
            C34938b c34938b3 = this.f147625E;
            InterfaceC32449a interfaceC32449a = c34938b3.firmwareRepo;
            WhoopFwDevice whoopFwDevice = this.f147625E.whoopFwDevice;
            String serial = whoopFwDevice != null ? whoopFwDevice.getSerial() : null;
            if (serial == null) {
                serial = "";
            }
            this.f147626w = null;
            this.f147627x = c34938b3;
            this.f147628y = 2;
            Object objMo84253j = interfaceC32449a.mo84253j(serial, this);
            if (objMo84253j != enumC31071a) {
                c34938b = c34938b3;
                obj = objMo84253j;
                c34938b.isForcedFwUpdate = ((Boolean) obj).booleanValue();
                this.f147625E.getLogger().mo85226q(AbstractC11266d.m30462p("isForcedFwUpdate from onStart is ", this.f147625E.isForcedFwUpdate), new AbstractC30556a.a[0]);
                C34938b c34938b4 = this.f147625E;
                c34938b4.m110313S(c34938b4.userAcceptanceRequired);
                return C23454a0.f92919a;
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: ug1.b$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy$interact$5", m100430f = "DefaultUpdateStrategy.kt", m100431l = {310}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lgt0/h;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f147630w;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return C34938b.this.new j(interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147630w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C34938b c34938b = C34938b.this;
                this.f147630w = 1;
                if (c34938b.m110316V(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ug1.b$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy", m100430f = "DefaultUpdateStrategy.kt", m100431l = {468, 468}, m100432m = "processFw", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f147632w;

        /* JADX INFO: renamed from: y */
        int f147634y;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147632w = obj;
            this.f147634y |= Integer.MIN_VALUE;
            return C34938b.this.m110332g0(this);
        }
    }

    /* JADX INFO: renamed from: ug1.b$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy", m100430f = "DefaultUpdateStrategy.kt", m100431l = {514}, m100432m = "reportUpdateResult", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f147635E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f147636F;

        /* JADX INFO: renamed from: H */
        int f147638H;

        /* JADX INFO: renamed from: w */
        Object f147639w;

        /* JADX INFO: renamed from: x */
        Object f147640x;

        /* JADX INFO: renamed from: y */
        Object f147641y;

        /* JADX INFO: renamed from: z */
        Object f147642z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147636F = obj;
            this.f147638H |= Integer.MIN_VALUE;
            return C34938b.this.m110333h0(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug1.b$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy", m100430f = "DefaultUpdateStrategy.kt", m100431l = {377, 383, 383, 387}, m100432m = "sendFwChunks", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f147644F;

        /* JADX INFO: renamed from: w */
        int f147645w;

        /* JADX INFO: renamed from: x */
        int f147646x;

        /* JADX INFO: renamed from: y */
        int f147647y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f147648z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147648z = obj;
            this.f147644F |= Integer.MIN_VALUE;
            return C34938b.this.m110335i0(0, this);
        }
    }

    /* JADX INFO: renamed from: ug1.b$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy$sendFwPackets$1", m100430f = "DefaultUpdateStrategy.kt", m100431l = {318, 321, 330, 334, 336, 338, 348, 353, 357, 371}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lug1/j;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f147649E;

        /* JADX INFO: renamed from: F */
        int f147650F;

        /* JADX INFO: renamed from: G */
        private /* synthetic */ Object f147651G;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ WhoopFwDevice f147653I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ String f147654J;

        /* JADX INFO: renamed from: w */
        Object f147655w;

        /* JADX INFO: renamed from: x */
        Object f147656x;

        /* JADX INFO: renamed from: y */
        int f147657y;

        /* JADX INFO: renamed from: z */
        int f147658z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(WhoopFwDevice whoopFwDevice, String str, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147653I = whoopFwDevice;
            this.f147654J = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            n nVar = C34938b.this.new n(this.f147653I, this.f147654J, interfaceC30057d);
            nVar.f147651G = obj;
            return nVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0108 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:14:0x0047, B:68:0x020e, B:17:0x005a, B:44:0x0108, B:46:0x012e, B:49:0x0147, B:51:0x0155, B:53:0x015f, B:56:0x0181, B:59:0x01a6, B:64:0x01ca, B:65:0x01ec, B:20:0x006d, B:23:0x007c, B:26:0x0087, B:42:0x00f4, B:29:0x008f, B:37:0x00d1, B:39:0x00d9, B:32:0x0096, B:34:0x00b0, B:71:0x022c), top: B:82:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:46:0x012e A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:14:0x0047, B:68:0x020e, B:17:0x005a, B:44:0x0108, B:46:0x012e, B:49:0x0147, B:51:0x0155, B:53:0x015f, B:56:0x0181, B:59:0x01a6, B:64:0x01ca, B:65:0x01ec, B:20:0x006d, B:23:0x007c, B:26:0x0087, B:42:0x00f4, B:29:0x008f, B:37:0x00d1, B:39:0x00d9, B:32:0x0096, B:34:0x00b0, B:71:0x022c), top: B:82:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0145  */
        /* JADX WARN: Code duplicated, block: B:49:0x0147 A[Catch: Exception -> 0x002b, PHI: r0 r7 r8 r9
          0x0147: PHI (r0v31 int) = (r0v27 int), (r0v33 int) binds: [B:24:0x007f, B:47:0x0143] A[DONT_GENERATE, DONT_INLINE]
          0x0147: PHI (r7v20 int) = (r7v15 int), (r7v21 int) binds: [B:24:0x007f, B:47:0x0143] A[DONT_GENERATE, DONT_INLINE]
          0x0147: PHI (r8v12 int) = (r8v8 int), (r8v14 int) binds: [B:24:0x007f, B:47:0x0143] A[DONT_GENERATE, DONT_INLINE]
          0x0147: PHI (r9v15 java.lang.Object) = (r9v7 java.lang.Object), (r9v29 java.lang.Object) binds: [B:24:0x007f, B:47:0x0143] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:14:0x0047, B:68:0x020e, B:17:0x005a, B:44:0x0108, B:46:0x012e, B:49:0x0147, B:51:0x0155, B:53:0x015f, B:56:0x0181, B:59:0x01a6, B:64:0x01ca, B:65:0x01ec, B:20:0x006d, B:23:0x007c, B:26:0x0087, B:42:0x00f4, B:29:0x008f, B:37:0x00d1, B:39:0x00d9, B:32:0x0096, B:34:0x00b0, B:71:0x022c), top: B:82:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:64:0x01ca A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:8:0x0026, B:14:0x0047, B:68:0x020e, B:17:0x005a, B:44:0x0108, B:46:0x012e, B:49:0x0147, B:51:0x0155, B:53:0x015f, B:56:0x0181, B:59:0x01a6, B:64:0x01ca, B:65:0x01ec, B:20:0x006d, B:23:0x007c, B:26:0x0087, B:42:0x00f4, B:29:0x008f, B:37:0x00d1, B:39:0x00d9, B:32:0x0096, B:34:0x00b0, B:71:0x022c), top: B:82:0x000e }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01a2 -> B:43:0x0106). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01ca -> B:43:0x0106). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 716
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ug1.C34938b.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ug1.b$o */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy", m100430f = "DefaultUpdateStrategy.kt", m100431l = {394, 395, 400, 401, 406, 407}, m100432m = "startFwLoad", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f147659E;

        /* JADX INFO: renamed from: G */
        int f147661G;

        /* JADX INFO: renamed from: w */
        Object f147662w;

        /* JADX INFO: renamed from: x */
        Object f147663x;

        /* JADX INFO: renamed from: y */
        Object f147664y;

        /* JADX INFO: renamed from: z */
        int f147665z;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147659E = obj;
            this.f147661G |= Integer.MIN_VALUE;
            return C34938b.this.m110340l0(null, this);
        }
    }

    /* JADX INFO: renamed from: ug1.b$p */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy", m100430f = "DefaultUpdateStrategy.kt", m100431l = {464, 464}, m100432m = "verifyFw", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f147666w;

        /* JADX INFO: renamed from: y */
        int f147668y;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147666w = obj;
            this.f147668y |= Integer.MIN_VALUE;
            return C34938b.this.m110342m0(this);
        }
    }

    public C34938b(InterfaceC4733b whoopStrapProvider, C25529b firmwareFilesHelper, InterfaceC34943g fwImage, InterfaceC32449a firmwareRepo, InterfaceC16182d firmwareAnalyticsHelper, Clock clock, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger, String taskName) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(firmwareFilesHelper, "firmwareFilesHelper");
        AbstractC22676k.m65750j(fwImage, "fwImage");
        AbstractC22676k.m65750j(firmwareRepo, "firmwareRepo");
        AbstractC22676k.m65750j(firmwareAnalyticsHelper, "firmwareAnalyticsHelper");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(taskName, "taskName");
        this.whoopStrapProvider = whoopStrapProvider;
        this.firmwareFilesHelper = firmwareFilesHelper;
        this.fwImage = fwImage;
        this.firmwareRepo = firmwareRepo;
        this.firmwareAnalyticsHelper = firmwareAnalyticsHelper;
        this.clock = clock;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
        this.taskName = taskName;
        this.serviceFlow = AbstractC13091v.m36593c(InterfaceC36085k.a.f154178a);
        this.iGattService = AbstractC13091v.m36593c(null);
        this.targetFwVersion = "";
        this.userAcceptanceRequired = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final void m110313S(boolean userAcceptanceRequired) {
        InterfaceC32564a interfaceC32564a;
        getLogger().mo85216g("Enqueueing DefaultUpdateStrategy on CRP", new AbstractC30556a.a[0]);
        if (this.isForcedFwUpdate) {
            interfaceC32564a = m110330f0() ? InterfaceC32564a.a.f134904a : InterfaceC32564a.b.f134906a;
        } else {
            interfaceC32564a = userAcceptanceRequired ? InterfaceC32564a.b.f134906a : InterfaceC32564a.c.f134908a;
        }
        InterfaceC21750d interfaceC21750dM110328e0 = m110328e0();
        if (interfaceC21750dM110328e0 != null) {
            interfaceC21750dM110328e0.mo24749u(this, interfaceC32564a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public final int m110314T(int imageOffset, int imageLength) {
        return (int) ((imageOffset / imageLength) * 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: U */
    public final Object m110315U(WhoopFwDevice whoopFwDevice, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        e eVar;
        Object next;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f147595z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f147595z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objMo84244a = eVar.f147593x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f147595z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo84244a);
            InterfaceC32449a interfaceC32449a = this.firmwareRepo;
            String serial = whoopFwDevice.getSerial();
            EnumC17623a enumC17623aM110318X = m110318X();
            eVar.f147592w = whoopFwDevice;
            eVar.f147595z = 1;
            objMo84244a = interfaceC32449a.mo84244a(serial, enumC17623aM110318X, eVar);
            if (objMo84244a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            whoopFwDevice = (WhoopFwDevice) eVar.f147592w;
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
        } while (((ChipDetails) next).getWhoopChip() != m110318X());
        ChipDetails chipDetails = (ChipDetails) next;
        return Boolean.valueOf(version.equals(chipDetails != null ? chipDetails.getFirmwareVersion() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public final Object m110316V(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM110328e0 = m110328e0();
        if (interfaceC21750dM110328e0 != null) {
            interfaceC21750dM110328e0.mo24702P0();
        }
        ((C13045h2) getServiceFlow()).emit(InterfaceC36085k.b.f154179a, interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    private final int m110317W() {
        WhoopFwDevice whoopFwDevice = this.whoopFwDevice;
        WhoopDeviceName deviceName = whoopFwDevice != null ? whoopFwDevice.getDeviceName() : null;
        int i13 = deviceName == null ? -1 : b.f147573a[deviceName.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return 200;
        }
        return (i13 == 3 || i13 == 4) ? 220 : 224;
    }

    /* JADX INFO: renamed from: X */
    private final EnumC17623a m110318X() {
        WhoopFwDevice whoopFwDevice = this.whoopFwDevice;
        WhoopDeviceName deviceName = whoopFwDevice != null ? whoopFwDevice.getDeviceName() : null;
        int i13 = deviceName == null ? -1 : b.f147573a[deviceName.ordinal()];
        return (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? EnumC17623a.AMBIQ : EnumC17623a.MAXIM;
    }

    /* JADX INFO: renamed from: Y */
    private final AbstractC38334b m110319Y() {
        WhoopFwDevice whoopFwDevice = this.whoopFwDevice;
        WhoopDeviceName deviceName = whoopFwDevice != null ? whoopFwDevice.getDeviceName() : null;
        int i13 = deviceName == null ? -1 : b.f147573a[deviceName.ordinal()];
        return (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? new C38339c1(m110324c0()) : new C38336b1();
    }

    /* JADX INFO: renamed from: Z */
    private final Object m110320Z(InterfaceC30057d<? super InterfaceC36083i> interfaceC30057d) {
        return AbstractC13091v.m36575A(new C4588i(getIGattService(), 2), interfaceC30057d);
    }

    /* JADX INFO: renamed from: a0 */
    private final AbstractC38334b m110321a0(long index, byte[] data) {
        WhoopFwDevice whoopFwDevice = this.whoopFwDevice;
        WhoopDeviceName deviceName = whoopFwDevice != null ? whoopFwDevice.getDeviceName() : null;
        int i13 = deviceName == null ? -1 : b.f147573a[deviceName.ordinal()];
        return (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? new C38395z(index, data, m110324c0()) : new C38393y(index, data);
    }

    /* JADX INFO: renamed from: b0 */
    private final AbstractC38334b m110322b0() {
        WhoopFwDevice whoopFwDevice = this.whoopFwDevice;
        WhoopDeviceName deviceName = whoopFwDevice != null ? whoopFwDevice.getDeviceName() : null;
        int i13 = deviceName == null ? -1 : b.f147573a[deviceName.ordinal()];
        return (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? new C38344e0(m110324c0()) : new C38341d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0099 -> B:24:0x009c). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110323c(q83.InterfaceC30057d<? super java.lang.Boolean> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof ug1.C34938b.c
            if (r0 == 0) goto L13
            r0 = r14
            ug1.b$c r0 = (ug1.C34938b.c) r0
            int r1 = r0.f147584O
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147584O = r1
            goto L18
        L13:
            ug1.b$c r0 = new ug1.b$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f147582M
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f147584O
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L5a
            if (r2 == r4) goto L56
            if (r2 != r3) goto L4e
            int r2 = r0.f147580K
            int r7 = r0.f147579J
            int r8 = r0.f147578I
            int r9 = r0.f147577H
            int r10 = r0.f147576G
            java.lang.Object r11 = r0.f147575F
            kotlin.jvm.functions.Function1 r11 = (p715kotlin.jvm.functions.Function1) r11
            java.lang.Object r11 = r0.f147574E
            kotlin.jvm.functions.Function1 r11 = (p715kotlin.jvm.functions.Function1) r11
            java.lang.Object r11 = r0.f147588z
            kotlin.jvm.functions.Function1[] r11 = (p715kotlin.jvm.functions.Function1[]) r11
            java.lang.Object r12 = r0.f147587y
            ug1.b$c r12 = (ug1.C34938b.c) r12
            java.lang.Object r12 = r0.f147586x
            kotlin.jvm.functions.Function1[] r12 = (p715kotlin.jvm.functions.Function1[]) r12
            java.lang.Object r12 = r0.f147585w
            vk0.i r12 = (vk0.InterfaceC36083i) r12
            p505ts.AbstractC34132o.m107864I(r14)
            goto L9c
        L4e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L56:
            p505ts.AbstractC34132o.m107864I(r14)
            goto L66
        L5a:
            p505ts.AbstractC34132o.m107864I(r14)
            r0.f147584O = r4
            java.lang.Object r14 = r13.m110320Z(r0)
            if (r14 != r1) goto L66
            goto L9b
        L66:
            vk0.i r14 = (vk0.InterfaceC36083i) r14
            kotlin.jvm.functions.Function1[] r2 = new p715kotlin.jvm.functions.Function1[r4]
            ug1.b$d r7 = new ug1.b$d
            r7.<init>(r14, r13, r5)
            r2[r6] = r7
            r11 = r2
            r2 = r4
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L77:
            if (r7 >= r2) goto Laa
            r14 = r11[r7]
            r0.f147585w = r5
            r0.f147586x = r5
            r0.f147587y = r5
            r0.f147588z = r11
            r0.f147574E = r5
            r0.f147575F = r5
            r0.f147576G = r10
            r0.f147577H = r9
            r0.f147578I = r8
            r0.f147579J = r7
            r0.f147580K = r2
            r0.f147581L = r6
            r0.f147584O = r3
            java.lang.Object r14 = r14.invoke(r0)
            if (r14 != r1) goto L9c
        L9b:
            return r1
        L9c:
            zj0.h r14 = (zj0.C40727h) r14
            if (r14 == 0) goto La9
            boolean r14 = r14.m132198W()
            if (r14 != 0) goto La7
            goto La9
        La7:
            int r7 = r7 + r4
            goto L77
        La9:
            r4 = r6
        Laa:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ug1.C34938b.m110323c(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public final EnumC32978v m110324c0() {
        EnumC32978v enumC32978vMo24752w0;
        InterfaceC21750d interfaceC21750dM110328e0 = m110328e0();
        return (interfaceC21750dM110328e0 == null || (enumC32978vMo24752w0 = interfaceC21750dM110328e0.mo24752w0()) == null) ? EnumC32978v.MAVERICK : enumC32978vMo24752w0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public final String m110326d0() {
        WhoopDeviceName deviceName;
        WhoopFwDevice whoopFwDevice = this.whoopFwDevice;
        String strName = (whoopFwDevice == null || (deviceName = whoopFwDevice.getDeviceName()) == null) ? null : deviceName.name();
        return strName == null ? "" : strName;
    }

    /* JADX INFO: renamed from: e0 */
    private final InterfaceC21750d m110328e0() {
        return (InterfaceC21750d) this.whoopStrapProvider.mo14817a().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final boolean m110330f0() {
        return this.featureFlagChecker.isFeatureEnabled("silent-forced-fw-update");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r1 == r2) goto L22;
     */
    /* JADX INFO: renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110332g0(q83.InterfaceC30057d<? super gt0.InterfaceC16186h> r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r1 instanceof ug1.C34938b.k
            if (r2 == 0) goto L18
            r2 = r1
            ug1.b$k r2 = (ug1.C34938b.k) r2
            int r3 = r2.f147634y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f147634y = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            ug1.b$k r2 = new ug1.b$k
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f147632w
            r83.a r2 = r83.EnumC31071a.f128113w
            int r3 = r8.f147634y
            r11 = 2
            r12 = 1
            if (r3 == 0) goto L40
            if (r3 == r12) goto L3c
            if (r3 != r11) goto L34
            p505ts.AbstractC34132o.m107864I(r1)
            l83.n r1 = (l83.C23468n) r1
            java.lang.Object r1 = r1.f92940w
            goto L61
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            p505ts.AbstractC34132o.m107864I(r1)
            goto L4c
        L40:
            p505ts.AbstractC34132o.m107864I(r1)
            r8.f147634y = r12
            java.lang.Object r1 = r0.m110320Z(r8)
            if (r1 != r2) goto L4c
            goto L60
        L4c:
            r3 = r1
            vk0.i r3 = (vk0.InterfaceC36083i) r3
            xj0.b r4 = r0.m110322b0()
            r8.f147634y = r11
            r5 = 0
            r7 = 0
            r9 = 6
            r10 = 0
            java.lang.Object r1 = vk0.InterfaceC36083i.m114608r0(r3, r4, r5, r7, r8, r9, r10)
            if (r1 != r2) goto L61
        L60:
            return r2
        L61:
            boolean r2 = r1 instanceof l83.C23467m
            r3 = 0
            if (r2 == 0) goto L67
            r1 = r3
        L67:
            zj0.h r1 = (zj0.C40727h) r1
            if (r1 == 0) goto L74
            boolean r1 = r1.m132198W()
            if (r1 != r12) goto L74
            gt0.h$e r1 = gt0.InterfaceC16186h.e.f61486b
            return r1
        L74:
            gt0.d r12 = r0.firmwareAnalyticsHelper
            gt0.b r13 = gt0.EnumC16180b.REBOOT
            gt0.c r14 = gt0.EnumC16181c.FAILURE
            gt0.a r15 = gt0.EnumC16179a.RETRY
            java.lang.String r16 = r0.m110326d0()
            java.lang.String r1 = r0.targetFwVersion
            r19 = 32
            r20 = 0
            r18 = 0
            r17 = r1
            gt0.InterfaceC16182d.m45716a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            gt0.h$b r1 = new gt0.h$b
            gt0.f$e r2 = gt0.AbstractC16184f.e.f61473b
            r4 = 0
            r1.<init>(r2, r4, r11, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ug1.C34938b.m110332g0(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
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
    /* JADX INFO: renamed from: h0 */
    public final Object m110333h0(WhoopFwDevice whoopFwDevice, String str, InterfaceC16186h interfaceC16186h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        l lVar;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f147638H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f147638H = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        Object obj = lVar.f147636F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = lVar.f147638H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            boolean z4 = interfaceC16186h instanceof InterfaceC16186h.e;
            if (z4) {
                getLogger().mo85216g(whoopFwDevice.getDeviceName() + " successfully updated to " + str, new AbstractC30556a.a[0]);
                InterfaceC16182d.m45716a(this.firmwareAnalyticsHelper, EnumC16180b.PROMPT, EnumC16181c.UPDATE_SUCCESS, null, m110326d0(), this.targetFwVersion, null, 32, null);
            } else {
                getLogger().mo85216g(str + " installation failed for " + whoopFwDevice.getDeviceName(), new AbstractC30556a.a[0]);
            }
            ChipDetails chipDetails = whoopFwDevice.getChips().get(0);
            InterfaceC32449a interfaceC32449a = this.firmwareRepo;
            WhoopFwDevice whoopFwDeviceCopy$default = WhoopFwDevice.copy$default(whoopFwDevice, null, null, AbstractC37056f.m118958J(new ChipDetails(chipDetails.getWhoopChip(), str)), 3, null);
            lVar.f147639w = null;
            lVar.f147640x = null;
            lVar.f147641y = null;
            lVar.f147642z = null;
            lVar.f147635E = z4 ? 1 : 0;
            lVar.f147638H = 1;
            if (interfaceC32449a.mo84251h(whoopFwDeviceCopy$default, z4, lVar) == enumC31071a) {
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
    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ug1.b] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX INFO: renamed from: i0 */
    public final Object m110335i0(int i13, InterfaceC30057d<? super C23465k> interfaceC30057d) {
        m mVar;
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
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i24 = mVar.f147644F;
            if ((i24 & Integer.MIN_VALUE) != 0) {
                mVar.f147644F = i24 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        m mVar2 = mVar;
        Object objMo110377e = mVar2.f147648z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i25 = mVar2.f147644F;
        boolean z13 = true;
        if (i25 == 0) {
            AbstractC34132o.m107864I(objMo110377e);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m110317W());
            this.fwPayload = byteBufferAllocate;
            InterfaceC34943g interfaceC34943g2 = this.fwImage;
            AbstractC22676k.m65747g(byteBufferAllocate);
            int iM110317W = m110317W();
            mVar2.f147645w = i13;
            mVar2.f147644F = 1;
            objMo110377e = interfaceC34943g2.mo110377e(byteBufferAllocate, 0, iM110317W, mVar2);
            if (objMo110377e != enumC31071a) {
            }
            z4 = zM132198W;
            return enumC31071a;
        }
        if (i25 == 1) {
            i13 = mVar2.f147645w;
            AbstractC34132o.m107864I(objMo110377e);
        } else {
            if (i25 == 2) {
                i15 = mVar2.f147646x;
                int i26 = mVar2.f147645w;
                AbstractC34132o.m107864I(objMo110377e);
                i14 = i26;
                InterfaceC36083i interfaceC36083i = (InterfaceC36083i) objMo110377e;
                ByteBuffer byteBuffer = this.fwPayload;
                AbstractC22676k.m65747g(byteBuffer);
                byte[] bArrArray = byteBuffer.array();
                AbstractC22676k.m65749i(bArrArray, "array(...)");
                AbstractC38334b abstractC38334bM110321a0 = m110321a0(i14, bArrArray);
                mVar2.f147645w = i14;
                mVar2.f147646x = i15;
                mVar2.f147644F = 3;
                objM114608r0 = InterfaceC36083i.m114608r0(interfaceC36083i, abstractC38334bM110321a0, 0L, false, mVar2, 6, null);
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
                        mVar2.f147645w = i16;
                        mVar2.f147646x = i15;
                        mVar2.f147647y = z4 ? 1 : 0;
                        mVar2.f147644F = 4;
                        if (interfaceC34943g.mo110373a(mVar2) != enumC31071a) {
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
                i15 = mVar2.f147646x;
                i16 = mVar2.f147645w;
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
                    mVar2.f147645w = i16;
                    mVar2.f147646x = i15;
                    mVar2.f147647y = z4 ? 1 : 0;
                    mVar2.f147644F = 4;
                    if (interfaceC34943g.mo110373a(mVar2) != enumC31071a) {
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
            i17 = mVar2.f147647y;
            i18 = mVar2.f147645w;
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
        ByteBuffer byteBuffer2 = this.fwPayload;
        AbstractC22676k.m65747g(byteBuffer2);
        byteBuffer2.position(0);
        mVar2.f147645w = i13;
        mVar2.f147646x = iIntValue;
        mVar2.f147644F = 2;
        Object objM110320Z = m110320Z(mVar2);
        if (objM110320Z != enumC31071a) {
            i14 = i13;
            i15 = iIntValue;
            objMo110377e = objM110320Z;
            InterfaceC36083i interfaceC36083i2 = (InterfaceC36083i) objMo110377e;
            ByteBuffer byteBuffer3 = this.fwPayload;
            AbstractC22676k.m65747g(byteBuffer3);
            byte[] bArrArray2 = byteBuffer3.array();
            AbstractC22676k.m65749i(bArrArray2, "array(...)");
            AbstractC38334b abstractC38334bM110321a1 = m110321a0(i14, bArrArray2);
            mVar2.f147645w = i14;
            mVar2.f147646x = i15;
            mVar2.f147644F = 3;
            objM114608r0 = InterfaceC36083i.m114608r0(interfaceC36083i2, abstractC38334bM110321a1, 0L, false, mVar2, 6, null);
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
                    mVar2.f147645w = i16;
                    mVar2.f147646x = i15;
                    mVar2.f147647y = z4 ? 1 : 0;
                    mVar2.f147644F = 4;
                    if (interfaceC34943g.mo110373a(mVar2) != enumC31071a) {
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
    /* JADX INFO: renamed from: j0 */
    public final InterfaceC13058l m110337j0(WhoopFwDevice device, String firmwareVersion) {
        return new C13084s1(new n(device, firmwareVersion, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final boolean m110339k0(WhoopDeviceName deviceName) {
        int i13 = b.f147573a[deviceName.ordinal()];
        return i13 == 1 || i13 == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x0109  */
    /* JADX WARN: Code duplicated, block: B:53:0x010a A[Catch: Exception -> 0x0068, PHI: r0 r5 r6
      0x010a: PHI (r0v25 java.lang.Object) = (r0v24 java.lang.Object), (r0v1 java.lang.Object) binds: [B:51:0x0107, B:22:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r5v16 java.lang.String) = (r5v13 java.lang.String), (r5v18 java.lang.String) binds: [B:51:0x0107, B:22:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r6v13 com.whoop.connectivityCore.firmware.models.WhoopFwDevice) = 
      (r6v10 com.whoop.connectivityCore.firmware.models.WhoopFwDevice)
      (r6v15 com.whoop.connectivityCore.firmware.models.WhoopFwDevice)
     binds: [B:51:0x0107, B:22:0x0063] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0068, blocks: (B:22:0x0063, B:53:0x010a, B:55:0x0112, B:57:0x0118, B:58:0x011b, B:60:0x011f, B:79:0x0184, B:81:0x01ad, B:82:0x01b4, B:27:0x0075, B:50:0x00fc), top: B:87:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[Catch: Exception -> 0x0068, TryCatch #1 {Exception -> 0x0068, blocks: (B:22:0x0063, B:53:0x010a, B:55:0x0112, B:57:0x0118, B:58:0x011b, B:60:0x011f, B:79:0x0184, B:81:0x01ad, B:82:0x01b4, B:27:0x0075, B:50:0x00fc), top: B:87:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0118 A[Catch: Exception -> 0x0068, TryCatch #1 {Exception -> 0x0068, blocks: (B:22:0x0063, B:53:0x010a, B:55:0x0112, B:57:0x0118, B:58:0x011b, B:60:0x011f, B:79:0x0184, B:81:0x01ad, B:82:0x01b4, B:27:0x0075, B:50:0x00fc), top: B:87:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:60:0x011f A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #1 {Exception -> 0x0068, blocks: (B:22:0x0063, B:53:0x010a, B:55:0x0112, B:57:0x0118, B:58:0x011b, B:60:0x011f, B:79:0x0184, B:81:0x01ad, B:82:0x01b4, B:27:0x0075, B:50:0x00fc), top: B:87:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0146  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184 A[Catch: Exception -> 0x0068, TRY_ENTER, TryCatch #1 {Exception -> 0x0068, blocks: (B:22:0x0063, B:53:0x010a, B:55:0x0112, B:57:0x0118, B:58:0x011b, B:60:0x011f, B:79:0x0184, B:81:0x01ad, B:82:0x01b4, B:27:0x0075, B:50:0x00fc), top: B:87:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01ad A[Catch: Exception -> 0x0068, TryCatch #1 {Exception -> 0x0068, blocks: (B:22:0x0063, B:53:0x010a, B:55:0x0112, B:57:0x0118, B:58:0x011b, B:60:0x011f, B:79:0x0184, B:81:0x01ad, B:82:0x01b4, B:27:0x0075, B:50:0x00fc), top: B:87:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0163, code lost:
    
        if (r0 == r4) goto L66;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x011f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0184, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX INFO: renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110340l0(com.whoop.connectivityCore.firmware.models.WhoopFwDevice r18, q83.InterfaceC30057d<? super ug1.AbstractC34946j> r19) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug1.C34938b.m110340l0(com.whoop.connectivityCore.firmware.models.WhoopFwDevice, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r11 == r0) goto L22;
     */
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110342m0(q83.InterfaceC30057d<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ug1.C34938b.p
            if (r0 == 0) goto L14
            r0 = r11
            ug1.b$p r0 = (ug1.C34938b.p) r0
            int r1 = r0.f147668y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f147668y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ug1.b$p r0 = new ug1.b$p
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f147666w
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f147668y
            r2 = 2
            r9 = 1
            if (r1 == 0) goto L3c
            if (r1 == r9) goto L38
            if (r1 != r2) goto L30
            p505ts.AbstractC34132o.m107864I(r11)
            l83.n r11 = (l83.C23468n) r11
            java.lang.Object r11 = r11.f92940w
            goto L63
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L38:
            p505ts.AbstractC34132o.m107864I(r11)
            goto L48
        L3c:
            p505ts.AbstractC34132o.m107864I(r11)
            r6.f147668y = r9
            java.lang.Object r11 = r10.m110320Z(r6)
            if (r11 != r0) goto L48
            goto L62
        L48:
            r1 = r11
            vk0.i r1 = (vk0.InterfaceC36083i) r1
            r11 = r2
            xj0.n1 r2 = new xj0.n1
            st0.v r3 = r10.m110324c0()
            r2.<init>(r3)
            r6.f147668y = r11
            r3 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r11 = vk0.InterfaceC36083i.m114608r0(r1, r2, r3, r5, r6, r7, r8)
            if (r11 != r0) goto L63
        L62:
            return r0
        L63:
            boolean r0 = r11 instanceof l83.C23467m
            if (r0 == 0) goto L68
            r11 = 0
        L68:
            zj0.h r11 = (zj0.C40727h) r11
            r0 = 0
            if (r11 == 0) goto L74
            boolean r11 = r11.m132198W()
            if (r11 != r9) goto L74
            goto L75
        L74:
            r9 = r0
        L75:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ug1.C34938b.m110342m0(q83.d):java.lang.Object");
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
        return new C13100y(new g(AbstractC13091v.m36590P(AbstractC13091v.m36610t(new C13015a0(new i(upstream, this, null), new C13060l1(AbstractC36080f.m114589b(getServiceFlow()), upstream, new h(null), 1))), new f(null, this)), this), new j(null));
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

    public /* synthetic */ C34938b(InterfaceC4733b interfaceC4733b, C25529b c25529b, InterfaceC34943g interfaceC34943g, InterfaceC32449a interfaceC32449a, InterfaceC16182d interfaceC16182d, Clock clock, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4733b, c25529b, interfaceC34943g, interfaceC32449a, interfaceC16182d, clock, featureFlagChecker, (i13 & 128) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DefaultUpdateStrategy") : interfaceC34116n, (i13 & 256) != 0 ? "DefaultUpdateStrategy" : str);
    }
}
