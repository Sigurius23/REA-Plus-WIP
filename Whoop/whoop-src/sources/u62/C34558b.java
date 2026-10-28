package u62;

import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import ch.C4588i;
import ci2.InterfaceC4733b;
import com.whoop.removeDeviceConfig.domain.RemoteDeviceConfigApi;
import com.whoop.removeDeviceConfig.domain.dto.PropertyValuesInfo;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import fc3.C14380k;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import jk0.InterfaceC21750d;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sj2.InterfaceC32564a;
import st0.AbstractC32962f;
import st0.C32970n;
import tr2.InterfaceC34116n;
import v62.C35742a;
import vk0.AbstractC36080f;
import vk0.InterfaceC36079e;
import vk0.InterfaceC36083i;
import vk0.InterfaceC36084j;
import vk0.InterfaceC36085k;
import xj0.AbstractC38334b;
import xj0.C38396z0;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import zj0.C40767y0;

/* JADX INFO: renamed from: u62.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001BBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b!\u0010\u001fJ\u0018\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b*\u0010+J\u001e\u0010.\u001a\u00020-2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(H\u0082@¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020 2\u0006\u00103\u001a\u00020 H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020 H\u0086@¢\u0006\u0004\b;\u0010\u001fJ\u001f\u0010>\u001a\u0002082\u0006\u0010<\u001a\u00020-2\u0006\u0010=\u001a\u00020-H\u0000¢\u0006\u0004\b>\u0010?J \u0010@\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020-2\u0006\u0010=\u001a\u00020-H\u0080@¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010LR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010MR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010P\u001a\u0004\bN\u0010QR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010R\u001a\u0004\bS\u0010TR\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010U\u001a\u0004\bV\u0010WR\u0016\u0010Y\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010XR \u0010]\u001a\b\u0012\u0004\u0012\u00020Z0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010U\u001a\u0004\b\\\u0010WR\u0016\u0010`\u001a\u0004\u0018\u00010^8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010_¨\u0006a"}, m65681d2 = {"Lu62/b;", "Lvk0/j;", "Lcom/whoop/removeDeviceConfig/domain/RemoteDeviceConfigApi;", "deviceConfigApi", "Lv62/a;", "propertiesForUserRepository", "Lu62/c;", "remoteDeviceConfigTrigger", "Lci2/b;", "whoopStrapProvider", "Ljs0/c;", "configurationRepository", "Landroid/content/SharedPreferences;", "sharedPreferences", "Liy1/c;", "metricsInteractor", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "", "taskName", "Lec3/p1;", "Lvk0/i;", "iGattService", "<init>", "(Lcom/whoop/removeDeviceConfig/domain/RemoteDeviceConfigApi;Lv62/a;Lu62/c;Lci2/b;Ljs0/c;Landroid/content/SharedPreferences;Liy1/c;Ljava/time/Clock;Ltr2/n;Ljava/lang/String;Lec3/p1;)V", "Ll83/a0;", "f", "()V", "k", "(Lq83/d;)Ljava/lang/Object;", "Lu62/a;", "j", "", "currentTimestamp", "r", "(JLq83/d;)Ljava/lang/Object;", "Lzj0/y0;", "startDCExchange", "", "Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;", "n", "(Lzj0/y0;Lq83/d;)Ljava/lang/Object;", "strapProperties", "", "t", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "v", "(J)Z", NotificationCompat.CATEGORY_STATUS, "y", "(Lu62/a;)Lu62/a;", "Ljava/time/Instant;", "instant", "", "g", "(Ljava/time/Instant;)D", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "numberOfPropertiesInStrap", "succeededCommands", "i", "(II)D", "q", "(IILq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/removeDeviceConfig/domain/RemoteDeviceConfigApi;", "b", "Lv62/a;", "c", "Lu62/c;", "d", "Lci2/b;", "e", "Ljs0/c;", "Landroid/content/SharedPreferences;", "Liy1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/time/Clock;", "Ltr2/n;", "()Ltr2/n;", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "Lec3/p1;", "l", "()Lec3/p1;", "Lu62/a;", "fetchRemoteStatus", "Lvk0/k;", "m", "o", "serviceFlow", "Ljk0/d;", "()Ljk0/d;", "whoopStrap", "remote-device-config_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34558b implements InterfaceC36084j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final RemoteDeviceConfigApi deviceConfigApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35742a propertiesForUserRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C34559c remoteDeviceConfigTrigger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC21030c metricsInteractor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String taskName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC13075p1 iGattService;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private EnumC34557a fetchRemoteStatus;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC13075p1 serviceFlow;

    /* JADX INFO: renamed from: u62.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor", m100430f = "RemoteDeviceConfigInteractor.kt", m100431l = {111, 116}, m100432m = "fetchProperties", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f145443E;

        /* JADX INFO: renamed from: w */
        Object f145444w;

        /* JADX INFO: renamed from: x */
        int f145445x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f145446y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f145446y = obj;
            this.f145443E |= Integer.MIN_VALUE;
            return C34558b.this.m109260j(this);
        }
    }

    /* JADX INFO: renamed from: u62.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor$fetchProperties$2", m100430f = "RemoteDeviceConfigInteractor.kt", m100431l = {112}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lpg3/v0;", "", "Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f145448w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C34558b.this.new c(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f145448w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            RemoteDeviceConfigApi remoteDeviceConfigApi = C34558b.this.deviceConfigApi;
            this.f145448w = 1;
            Object propertyValuesForUser = remoteDeviceConfigApi.getPropertyValuesForUser("FIRMWARE", this);
            return propertyValuesForUser == enumC31071a ? enumC31071a : propertyValuesForUser;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<List<PropertyValuesInfo>>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: u62.b$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f145450w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC38334b f145451x;

        /* JADX INFO: renamed from: u62.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f145452w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC38334b f145453x;

            /* JADX INFO: renamed from: u62.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor$retrieveStrapPropertiesCrp$$inlined$sendCommandViaCrp$default$1$2", m100430f = "RemoteDeviceConfigInteractor.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42452a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f145454E;

                /* JADX INFO: renamed from: F */
                Object f145455F;

                /* JADX INFO: renamed from: G */
                Object f145456G;

                /* JADX INFO: renamed from: H */
                Object f145457H;

                /* JADX INFO: renamed from: I */
                Object f145458I;

                /* JADX INFO: renamed from: J */
                int f145459J;

                /* JADX INFO: renamed from: K */
                int f145460K;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f145462w;

                /* JADX INFO: renamed from: x */
                int f145463x;

                /* JADX INFO: renamed from: y */
                Object f145464y;

                /* JADX INFO: renamed from: z */
                Object f145465z;

                public C42452a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f145462w = obj;
                    this.f145463x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC38334b abstractC38334b) {
                this.f145452w = interfaceC13062m;
                this.f145453x = abstractC38334b;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
            
                if (r1.emit((zj0.C40755s0) r14, r6) == r0) goto L29;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof u62.C34558b.d.a.C42452a
                    if (r0 == 0) goto L14
                    r0 = r14
                    u62.b$d$a$a r0 = (u62.C34558b.d.a.C42452a) r0
                    int r1 = r0.f145463x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L14
                    int r1 = r1 - r2
                    r0.f145463x = r1
                L12:
                    r6 = r0
                    goto L1a
                L14:
                    u62.b$d$a$a r0 = new u62.b$d$a$a
                    r0.<init>(r14)
                    goto L12
                L1a:
                    java.lang.Object r14 = r6.f145462w
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r6.f145463x
                    r9 = 2
                    r2 = 1
                    r10 = 0
                    if (r1 == 0) goto L5c
                    if (r1 == r2) goto L3e
                    if (r1 != r9) goto L36
                    java.lang.Object r13 = r6.f145455F
                    ec3.m r13 = (ec3.InterfaceC13062m) r13
                    java.lang.Object r13 = r6.f145465z
                    u62.b$d$a$a r13 = (u62.C34558b.d.a.C42452a) r13
                    p505ts.AbstractC34132o.m107864I(r14)
                    goto Lb0
                L36:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L3e:
                    int r13 = r6.f145459J
                    java.lang.Object r1 = r6.f145458I
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    java.lang.Object r1 = r6.f145457H
                    q83.d r1 = (q83.InterfaceC30057d) r1
                    java.lang.Object r1 = r6.f145456G
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    java.lang.Object r2 = r6.f145455F
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r2 = r6.f145465z
                    u62.b$d$a$a r2 = (u62.C34558b.d.a.C42452a) r2
                    p505ts.AbstractC34132o.m107864I(r14)
                    l83.n r14 = (l83.C23468n) r14
                    java.lang.Object r14 = r14.f92940w
                    goto L8b
                L5c:
                    p505ts.AbstractC34132o.m107864I(r14)
                    ec3.m r14 = r12.f145452w
                    r1 = r13
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    r13 = r2
                    xj0.b r2 = r12.f145453x
                    r6.f145464y = r10
                    r6.f145465z = r10
                    r6.f145454E = r10
                    r6.f145455F = r10
                    r6.f145456G = r14
                    r6.f145457H = r10
                    r6.f145458I = r10
                    r11 = 0
                    r6.f145459J = r11
                    r6.f145460K = r11
                    r6.f145463x = r13
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
                    boolean r2 = r14 instanceof zj0.C40755s0
                    if (r2 != 0) goto L95
                    r14 = r10
                L95:
                    zj0.s0 r14 = (zj0.C40755s0) r14
                    r6.f145464y = r10
                    r6.f145465z = r10
                    r6.f145454E = r10
                    r6.f145455F = r10
                    r6.f145456G = r10
                    r6.f145457H = r10
                    r6.f145458I = r10
                    r6.f145459J = r13
                    r6.f145463x = r9
                    java.lang.Object r13 = r1.emit(r14, r6)
                    if (r13 != r0) goto Lb0
                Laf:
                    return r0
                Lb0:
                    l83.a0 r13 = l83.C23454a0.f92919a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: u62.C34558b.d.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public d(InterfaceC13058l interfaceC13058l, AbstractC38334b abstractC38334b) {
            this.f145450w = interfaceC13058l;
            this.f145451x = abstractC38334b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f145450w.collect(new a(interfaceC13062m, this.f145451x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u62.b$e */
    @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor", m100430f = "RemoteDeviceConfigInteractor.kt", m100431l = {243}, m100432m = "retrieveStrapPropertiesCrp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f145466E;

        /* JADX INFO: renamed from: F */
        int f145467F;

        /* JADX INFO: renamed from: G */
        int f145468G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f145469H;

        /* JADX INFO: renamed from: J */
        int f145471J;

        /* JADX INFO: renamed from: w */
        Object f145472w;

        /* JADX INFO: renamed from: x */
        Object f145473x;

        /* JADX INFO: renamed from: y */
        Object f145474y;

        /* JADX INFO: renamed from: z */
        Object f145475z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f145469H = obj;
            this.f145471J |= Integer.MIN_VALUE;
            return C34558b.this.m109263n(null, this);
        }
    }

    /* JADX INFO: renamed from: u62.b$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor", m100430f = "RemoteDeviceConfigInteractor.kt", m100431l = {214, 224}, m100432m = "sendDataDogMetric$remote_device_config_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f145476E;

        /* JADX INFO: renamed from: G */
        int f145478G;

        /* JADX INFO: renamed from: w */
        int f145479w;

        /* JADX INFO: renamed from: x */
        int f145480x;

        /* JADX INFO: renamed from: y */
        double f145481y;

        /* JADX INFO: renamed from: z */
        double f145482z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f145476E = obj;
            this.f145478G |= Integer.MIN_VALUE;
            return C34558b.this.m109269q(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: u62.b$g */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f145483w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC38334b f145484x;

        /* JADX INFO: renamed from: u62.b$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f145485w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC38334b f145486x;

            /* JADX INFO: renamed from: u62.b$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor$sendProperties$$inlined$sendCommandViaCrp$default$1$2", m100430f = "RemoteDeviceConfigInteractor.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42453a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f145487E;

                /* JADX INFO: renamed from: F */
                Object f145488F;

                /* JADX INFO: renamed from: G */
                Object f145489G;

                /* JADX INFO: renamed from: H */
                Object f145490H;

                /* JADX INFO: renamed from: I */
                Object f145491I;

                /* JADX INFO: renamed from: J */
                int f145492J;

                /* JADX INFO: renamed from: K */
                int f145493K;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f145495w;

                /* JADX INFO: renamed from: x */
                int f145496x;

                /* JADX INFO: renamed from: y */
                Object f145497y;

                /* JADX INFO: renamed from: z */
                Object f145498z;

                public C42453a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f145495w = obj;
                    this.f145496x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC38334b abstractC38334b) {
                this.f145485w = interfaceC13062m;
                this.f145486x = abstractC38334b;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
            
                if (r1.emit((zj0.C40767y0) r14, r6) == r0) goto L29;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof u62.C34558b.g.a.C42453a
                    if (r0 == 0) goto L14
                    r0 = r14
                    u62.b$g$a$a r0 = (u62.C34558b.g.a.C42453a) r0
                    int r1 = r0.f145496x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L14
                    int r1 = r1 - r2
                    r0.f145496x = r1
                L12:
                    r6 = r0
                    goto L1a
                L14:
                    u62.b$g$a$a r0 = new u62.b$g$a$a
                    r0.<init>(r14)
                    goto L12
                L1a:
                    java.lang.Object r14 = r6.f145495w
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r6.f145496x
                    r9 = 2
                    r2 = 1
                    r10 = 0
                    if (r1 == 0) goto L5c
                    if (r1 == r2) goto L3e
                    if (r1 != r9) goto L36
                    java.lang.Object r13 = r6.f145488F
                    ec3.m r13 = (ec3.InterfaceC13062m) r13
                    java.lang.Object r13 = r6.f145498z
                    u62.b$g$a$a r13 = (u62.C34558b.g.a.C42453a) r13
                    p505ts.AbstractC34132o.m107864I(r14)
                    goto Lb0
                L36:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L3e:
                    int r13 = r6.f145492J
                    java.lang.Object r1 = r6.f145491I
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    java.lang.Object r1 = r6.f145490H
                    q83.d r1 = (q83.InterfaceC30057d) r1
                    java.lang.Object r1 = r6.f145489G
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    java.lang.Object r2 = r6.f145488F
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r2 = r6.f145498z
                    u62.b$g$a$a r2 = (u62.C34558b.g.a.C42453a) r2
                    p505ts.AbstractC34132o.m107864I(r14)
                    l83.n r14 = (l83.C23468n) r14
                    java.lang.Object r14 = r14.f92940w
                    goto L8b
                L5c:
                    p505ts.AbstractC34132o.m107864I(r14)
                    ec3.m r14 = r12.f145485w
                    r1 = r13
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    r13 = r2
                    xj0.b r2 = r12.f145486x
                    r6.f145497y = r10
                    r6.f145498z = r10
                    r6.f145487E = r10
                    r6.f145488F = r10
                    r6.f145489G = r14
                    r6.f145490H = r10
                    r6.f145491I = r10
                    r11 = 0
                    r6.f145492J = r11
                    r6.f145493K = r11
                    r6.f145496x = r13
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
                    boolean r2 = r14 instanceof zj0.C40767y0
                    if (r2 != 0) goto L95
                    r14 = r10
                L95:
                    zj0.y0 r14 = (zj0.C40767y0) r14
                    r6.f145497y = r10
                    r6.f145498z = r10
                    r6.f145487E = r10
                    r6.f145488F = r10
                    r6.f145489G = r10
                    r6.f145490H = r10
                    r6.f145491I = r10
                    r6.f145492J = r13
                    r6.f145496x = r9
                    java.lang.Object r13 = r1.emit(r14, r6)
                    if (r13 != r0) goto Lb0
                Laf:
                    return r0
                Lb0:
                    l83.a0 r13 = l83.C23454a0.f92919a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: u62.C34558b.g.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public g(InterfaceC13058l interfaceC13058l, AbstractC38334b abstractC38334b) {
            this.f145483w = interfaceC13058l;
            this.f145484x = abstractC38334b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f145483w.collect(new a(interfaceC13062m, this.f145484x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u62.b$h */
    @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor", m100430f = "RemoteDeviceConfigInteractor.kt", m100431l = {243, 140, 143, 144}, m100432m = "sendProperties", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f145499E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f145500F;

        /* JADX INFO: renamed from: H */
        int f145502H;

        /* JADX INFO: renamed from: w */
        long f145503w;

        /* JADX INFO: renamed from: x */
        Object f145504x;

        /* JADX INFO: renamed from: y */
        Object f145505y;

        /* JADX INFO: renamed from: z */
        int f145506z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f145500F = obj;
            this.f145502H |= Integer.MIN_VALUE;
            return C34558b.this.m109264r(0L, this);
        }
    }

    /* JADX INFO: renamed from: u62.b$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor", m100430f = "RemoteDeviceConfigInteractor.kt", m100431l = {171, 244}, m100432m = "sendStrapPropertiesCrp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f145507E;

        /* JADX INFO: renamed from: F */
        Object f145508F;

        /* JADX INFO: renamed from: G */
        Object f145509G;

        /* JADX INFO: renamed from: H */
        Object f145510H;

        /* JADX INFO: renamed from: I */
        Object f145511I;

        /* JADX INFO: renamed from: J */
        Object f145512J;

        /* JADX INFO: renamed from: K */
        int f145513K;

        /* JADX INFO: renamed from: L */
        int f145514L;

        /* JADX INFO: renamed from: M */
        int f145515M;

        /* JADX INFO: renamed from: N */
        /* synthetic */ Object f145516N;

        /* JADX INFO: renamed from: P */
        int f145518P;

        /* JADX INFO: renamed from: w */
        Object f145519w;

        /* JADX INFO: renamed from: x */
        Object f145520x;

        /* JADX INFO: renamed from: y */
        Object f145521y;

        /* JADX INFO: renamed from: z */
        Object f145522z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f145516N = obj;
            this.f145518P |= Integer.MIN_VALUE;
            return C34558b.this.m109265t(null, this);
        }
    }

    /* JADX INFO: renamed from: u62.b$j */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f145523w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC38334b f145524x;

        /* JADX INFO: renamed from: u62.b$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f145525w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC38334b f145526x;

            /* JADX INFO: renamed from: u62.b$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor$sendStrapPropertiesCrp$lambda$0$$inlined$sendCommandViaCrp$default$1$2", m100430f = "RemoteDeviceConfigInteractor.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42454a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f145527E;

                /* JADX INFO: renamed from: F */
                Object f145528F;

                /* JADX INFO: renamed from: G */
                Object f145529G;

                /* JADX INFO: renamed from: H */
                Object f145530H;

                /* JADX INFO: renamed from: I */
                Object f145531I;

                /* JADX INFO: renamed from: J */
                int f145532J;

                /* JADX INFO: renamed from: K */
                int f145533K;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f145535w;

                /* JADX INFO: renamed from: x */
                int f145536x;

                /* JADX INFO: renamed from: y */
                Object f145537y;

                /* JADX INFO: renamed from: z */
                Object f145538z;

                public C42454a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f145535w = obj;
                    this.f145536x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC38334b abstractC38334b) {
                this.f145525w = interfaceC13062m;
                this.f145526x = abstractC38334b;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
            
                if (r1.emit((zj0.C40763w0) r14, r6) == r0) goto L29;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof u62.C34558b.j.a.C42454a
                    if (r0 == 0) goto L14
                    r0 = r14
                    u62.b$j$a$a r0 = (u62.C34558b.j.a.C42454a) r0
                    int r1 = r0.f145536x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L14
                    int r1 = r1 - r2
                    r0.f145536x = r1
                L12:
                    r6 = r0
                    goto L1a
                L14:
                    u62.b$j$a$a r0 = new u62.b$j$a$a
                    r0.<init>(r14)
                    goto L12
                L1a:
                    java.lang.Object r14 = r6.f145535w
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r6.f145536x
                    r9 = 2
                    r2 = 1
                    r10 = 0
                    if (r1 == 0) goto L5c
                    if (r1 == r2) goto L3e
                    if (r1 != r9) goto L36
                    java.lang.Object r13 = r6.f145528F
                    ec3.m r13 = (ec3.InterfaceC13062m) r13
                    java.lang.Object r13 = r6.f145538z
                    u62.b$j$a$a r13 = (u62.C34558b.j.a.C42454a) r13
                    p505ts.AbstractC34132o.m107864I(r14)
                    goto Lb0
                L36:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L3e:
                    int r13 = r6.f145532J
                    java.lang.Object r1 = r6.f145531I
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    java.lang.Object r1 = r6.f145530H
                    q83.d r1 = (q83.InterfaceC30057d) r1
                    java.lang.Object r1 = r6.f145529G
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    java.lang.Object r2 = r6.f145528F
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r2 = r6.f145538z
                    u62.b$j$a$a r2 = (u62.C34558b.j.a.C42454a) r2
                    p505ts.AbstractC34132o.m107864I(r14)
                    l83.n r14 = (l83.C23468n) r14
                    java.lang.Object r14 = r14.f92940w
                    goto L8b
                L5c:
                    p505ts.AbstractC34132o.m107864I(r14)
                    ec3.m r14 = r12.f145525w
                    r1 = r13
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    r13 = r2
                    xj0.b r2 = r12.f145526x
                    r6.f145537y = r10
                    r6.f145538z = r10
                    r6.f145527E = r10
                    r6.f145528F = r10
                    r6.f145529G = r14
                    r6.f145530H = r10
                    r6.f145531I = r10
                    r11 = 0
                    r6.f145532J = r11
                    r6.f145533K = r11
                    r6.f145536x = r13
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
                    boolean r2 = r14 instanceof zj0.C40763w0
                    if (r2 != 0) goto L95
                    r14 = r10
                L95:
                    zj0.w0 r14 = (zj0.C40763w0) r14
                    r6.f145537y = r10
                    r6.f145538z = r10
                    r6.f145527E = r10
                    r6.f145528F = r10
                    r6.f145529G = r10
                    r6.f145530H = r10
                    r6.f145531I = r10
                    r6.f145532J = r13
                    r6.f145536x = r9
                    java.lang.Object r13 = r1.emit(r14, r6)
                    if (r13 != r0) goto Lb0
                Laf:
                    return r0
                Lb0:
                    l83.a0 r13 = l83.C23454a0.f92919a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: u62.C34558b.j.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public j(InterfaceC13058l interfaceC13058l, AbstractC38334b abstractC38334b) {
            this.f145523w = interfaceC13058l;
            this.f145524x = abstractC38334b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f145523w.collect(new a(interfaceC13062m, this.f145524x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u62.b$k */
    @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor$startFetchRemoteDeviceConfigs$$inlined$flatMapLatest$1", m100430f = "RemoteDeviceConfigInteractor.kt", m100431l = {194, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ long f145539E;

        /* JADX INFO: renamed from: F */
        Object f145540F;

        /* JADX INFO: renamed from: G */
        Object f145541G;

        /* JADX INFO: renamed from: H */
        Object f145542H;

        /* JADX INFO: renamed from: I */
        int f145543I;

        /* JADX INFO: renamed from: w */
        int f145544w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f145545x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f145546y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34558b f145547z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC30057d interfaceC30057d, C34558b c34558b, long j7) {
            super(3, interfaceC30057d);
            this.f145547z = c34558b;
            this.f145539E = j7;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC36085k interfaceC36085k, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            k kVar = new k(interfaceC30057d, this.f145547z, this.f145539E);
            kVar.f145545x = interfaceC13062m;
            kVar.f145546y = interfaceC36085k;
            return kVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
        
            if (r10 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, r3, r9) == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r9.f145544w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L32
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r9.f145545x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r10)
                goto L99
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                java.lang.Object r1 = r9.f145542H
                vk0.k r1 = (vk0.InterfaceC36085k) r1
                java.lang.Object r1 = r9.f145541G
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r9.f145540F
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r9.f145545x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r10)
                goto L80
            L32:
                p505ts.AbstractC34132o.m107864I(r10)
                java.lang.Object r10 = r9.f145545x
                r1 = r10
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r10 = r9.f145546y
                vk0.k r10 = (vk0.InterfaceC36085k) r10
                boolean r5 = vk0.AbstractC36080f.m114590c(r10)
                r6 = 0
                if (r5 == 0) goto L67
                u62.b r3 = r9.f145547z
                tr2.n r3 = r3.getLogger()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r7 = "Task was "
                r5.<init>(r7)
                r5.append(r10)
                java.lang.String r10 = r5.toString()
                qr2.a$a[] r5 = new qr2.AbstractC30556a.a[r6]
                r3.mo85222m(r10, r5)
                u62.a r10 = u62.EnumC34557a.FAIL
                a6.u r3 = new a6.u
                r5 = 1
                r3.<init>(r10, r5)
                goto L86
            L67:
                u62.b r10 = r9.f145547z
                long r7 = r9.f145539E
                r9.f145545x = r4
                r9.f145546y = r4
                r9.f145540F = r1
                r9.f145541G = r4
                r9.f145542H = r4
                r9.f145543I = r6
                r9.f145544w = r3
                java.lang.Object r10 = u62.C34558b.m109256d(r10, r7, r9)
                if (r10 != r0) goto L80
                goto L98
            L80:
                a6.u r3 = new a6.u
                r5 = 1
                r3.<init>(r10, r5)
            L86:
                r9.f145545x = r4
                r9.f145546y = r4
                r9.f145540F = r4
                r9.f145541G = r4
                r9.f145542H = r4
                r9.f145544w = r2
                java.lang.Object r10 = ec3.AbstractC13091v.m36613w(r1, r3, r9)
                if (r10 != r0) goto L99
            L98:
                return r0
            L99:
                l83.a0 r10 = l83.C23454a0.f92919a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: u62.C34558b.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC36085k) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: u62.b$l */
    @InterfaceC32271e(m100429c = "com.whoop.removeDeviceConfig.interactor.RemoteDeviceConfigInteractor", m100430f = "RemoteDeviceConfigInteractor.kt", m100431l = {97, 74, 76, 87, 97, 97, 97}, m100432m = "startFetchRemoteDeviceConfigs", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f145549F;

        /* JADX INFO: renamed from: w */
        long f145550w;

        /* JADX INFO: renamed from: x */
        Object f145551x;

        /* JADX INFO: renamed from: y */
        Object f145552y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f145553z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f145553z = obj;
            this.f145549F |= Integer.MIN_VALUE;
            return C34558b.this.m109270w(this);
        }
    }

    public C34558b(RemoteDeviceConfigApi deviceConfigApi, C35742a propertiesForUserRepository, C34559c remoteDeviceConfigTrigger, InterfaceC4733b whoopStrapProvider, AbstractC21909c configurationRepository, SharedPreferences sharedPreferences, InterfaceC21030c metricsInteractor, Clock clock, InterfaceC34116n logger, String taskName, InterfaceC13075p1 iGattService) {
        AbstractC22676k.m65750j(deviceConfigApi, "deviceConfigApi");
        AbstractC22676k.m65750j(propertiesForUserRepository, "propertiesForUserRepository");
        AbstractC22676k.m65750j(remoteDeviceConfigTrigger, "remoteDeviceConfigTrigger");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(metricsInteractor, "metricsInteractor");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(taskName, "taskName");
        AbstractC22676k.m65750j(iGattService, "iGattService");
        this.deviceConfigApi = deviceConfigApi;
        this.propertiesForUserRepository = propertiesForUserRepository;
        this.remoteDeviceConfigTrigger = remoteDeviceConfigTrigger;
        this.whoopStrapProvider = whoopStrapProvider;
        this.configurationRepository = configurationRepository;
        this.sharedPreferences = sharedPreferences;
        this.metricsInteractor = metricsInteractor;
        this.clock = clock;
        this.logger = logger;
        this.taskName = taskName;
        this.iGattService = iGattService;
        this.fetchRemoteStatus = EnumC34557a.NONE;
        this.serviceFlow = AbstractC13091v.m36593c(InterfaceC36085k.a.f154178a);
    }

    /* JADX INFO: renamed from: f */
    private final void m109258f() {
        getLogger().mo85216g("Adding service to CRP", new AbstractC30556a.a[0]);
        InterfaceC21750d interfaceC21750dM109262m = m109262m();
        if (interfaceC21750dM109262m != null) {
            interfaceC21750dM109262m.mo24749u(this, InterfaceC32564a.b.f134906a);
        }
    }

    /* JADX INFO: renamed from: g */
    private final double m109259g(Instant instant) {
        Long lValueOf = Long.valueOf(this.sharedPreferences.getLong("remote-device-config-last-sync", 0L));
        if (lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return instant.minus(lValueOf.longValue(), (TemporalUnit) ChronoUnit.MILLIS).toEpochMilli();
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r1.m113226c((java.util.List) r12, r6) == r0) goto L24;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m109260j(q83.InterfaceC30057d<? super u62.EnumC34557a> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof u62.C34558b.b
            if (r0 == 0) goto L14
            r0 = r12
            u62.b$b r0 = (u62.C34558b.b) r0
            int r1 = r0.f145443E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f145443E = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            u62.b$b r0 = new u62.b$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f145446y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f145443E
            r9 = 0
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L39
            if (r1 != r10) goto L31
            java.lang.Object r0 = r6.f145444w
            u02.a r0 = (u02.InterfaceC34385a) r0
            p505ts.AbstractC34132o.m107864I(r12)
            goto L7f
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L39:
            p505ts.AbstractC34132o.m107864I(r12)
            goto L5a
        L3d:
            p505ts.AbstractC34132o.m107864I(r12)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r12 = r2
            tr2.n r2 = r11.getLogger()
            u62.b$c r5 = new u62.b$c
            r5.<init>(r9)
            r6.f145443E = r12
            r3 = 0
            java.lang.String r4 = "Fetching values"
            r7 = 2
            r8 = 0
            java.lang.Object r12 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L5a
            goto L7e
        L5a:
            u02.a r12 = (u02.InterfaceC34385a) r12
            boolean r1 = r12 instanceof u02.InterfaceC34385a.c
            r2 = 0
            if (r1 == 0) goto L86
            v62.a r1 = r11.propertiesForUserRepository
            u02.a$c r12 = (u02.InterfaceC34385a.c) r12
            java.lang.Object r12 = r12.m108735a()
            pg3.v0 r12 = (pg3.C29218v0) r12
            java.lang.Object r12 = r12.f118270b
            p715kotlin.jvm.internal.AbstractC22676k.m65747g(r12)
            java.util.List r12 = (java.util.List) r12
            r6.f145444w = r9
            r6.f145445x = r2
            r6.f145443E = r10
            java.lang.Object r12 = r1.m113226c(r12, r6)
            if (r12 != r0) goto L7f
        L7e:
            return r0
        L7f:
            u62.a r12 = u62.EnumC34557a.FETCHED
            u62.a r12 = r11.m109267y(r12)
            return r12
        L86:
            boolean r12 = r12 instanceof u02.InterfaceC34385a.b
            if (r12 == 0) goto Lb1
            tr2.n r12 = r11.getLogger()
            java.lang.String r0 = "Failed to fetch device config values trying with cached ones"
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r2]
            r12.mo85222m(r0, r1)
            v62.a r12 = r11.propertiesForUserRepository
            java.util.List r12 = r12.m113224a()
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto Laa
            u62.a r12 = u62.EnumC34557a.CACHED
            u62.a r12 = r11.m109267y(r12)
            return r12
        Laa:
            u62.a r12 = u62.EnumC34557a.FAIL
            u62.a r12 = r11.m109267y(r12)
            return r12
        Lb1:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u62.C34558b.m109260j(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: k */
    private final Object m109261k(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ((C13045h2) getServiceFlow()).emit(InterfaceC36085k.b.f154179a, interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC21750d m109262m() {
        return (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007d -> B:20:0x0080). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: n */
    public final java.lang.Object m109263n(zj0.C40767y0 r9, q83.InterfaceC30057d<? super java.util.List<com.whoop.removeDeviceConfig.domain.dto.PropertyValuesInfo>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof u62.C34558b.e
            if (r0 == 0) goto L13
            r0 = r10
            u62.b$e r0 = (u62.C34558b.e) r0
            int r1 = r0.f145471J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145471J = r1
            goto L18
        L13:
            u62.b$e r0 = new u62.b$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f145469H
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f145471J
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r9 = r0.f145467F
            int r2 = r0.f145466E
            java.lang.Object r4 = r0.f145475z
            xj0.b r4 = (xj0.AbstractC38334b) r4
            java.lang.Object r4 = r0.f145474y
            ec3.p1 r4 = (ec3.InterfaceC13075p1) r4
            java.lang.Object r4 = r0.f145473x
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f145472w
            zj0.y0 r5 = (zj0.C40767y0) r5
            p505ts.AbstractC34132o.m107864I(r10)
            goto L80
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            p505ts.AbstractC34132o.m107864I(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r9 = r9.getNumberOfDeviceConfigs()
            if (r3 > r9) goto La4
            r4 = r10
            r2 = r3
        L53:
            ec3.p1 r10 = r8.getIGattService()
            xj0.n0 r5 = new xj0.n0
            r5.<init>()
            ch.i r6 = new ch.i
            r7 = 2
            r6.<init>(r10, r7)
            u62.b$d r10 = new u62.b$d
            r10.<init>(r6, r5)
            r5 = 0
            r0.f145472w = r5
            r0.f145473x = r4
            r0.f145474y = r5
            r0.f145475z = r5
            r0.f145466E = r2
            r0.f145467F = r9
            r5 = 0
            r0.f145468G = r5
            r0.f145471J = r3
            java.lang.Object r10 = ec3.AbstractC13091v.m36575A(r10, r0)
            if (r10 != r1) goto L80
            return r1
        L80:
            zj0.s0 r10 = (zj0.C40755s0) r10
            if (r10 == 0) goto L9e
            boolean r5 = r10.m132198W()
            if (r5 == 0) goto L9e
            boolean r5 = r10.getIsValidKey()
            if (r5 == 0) goto L9e
            com.whoop.removeDeviceConfig.domain.dto.PropertyValuesInfo r5 = new com.whoop.removeDeviceConfig.domain.dto.PropertyValuesInfo
            java.lang.String r10 = r10.m132244X()
            java.lang.String r6 = ""
            r5.<init>(r10, r6, r6)
            r4.add(r5)
        L9e:
            if (r2 == r9) goto La3
            int r2 = r2 + 1
            goto L53
        La3:
            return r4
        La4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: u62.C34558b.m109263n(zj0.y0, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x010c  */
    /* JADX WARN: Code duplicated, block: B:47:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m109264r(long j7, InterfaceC30057d<? super EnumC34557a> interfaceC30057d) {
        h hVar;
        C40767y0 c40767y0;
        List<PropertyValuesInfo> list;
        int numberOfDeviceConfigs;
        long j13;
        int i13;
        int iIntValue;
        long j14;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i14 = hVar.f145502H;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f145502H = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objM36575A = hVar.f145500F;
        Object obj = EnumC31071a.f128113w;
        int i15 = hVar.f145502H;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            getLogger().mo85216g("Locking history requests", new AbstractC30556a.a[0]);
            InterfaceC21750d interfaceC21750dM109262m = m109262m();
            if (interfaceC21750dM109262m != null) {
                interfaceC21750dM109262m.mo24739n0();
            }
            g gVar = new g(new C4588i(getIGattService(), 2), new C38396z0());
            hVar.f145504x = null;
            hVar.f145505y = null;
            hVar.f145503w = j7;
            hVar.f145506z = 0;
            hVar.f145502H = 1;
            objM36575A = AbstractC13091v.m36575A(gVar, hVar);
            if (objM36575A != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            j7 = hVar.f145503w;
            AbstractC34132o.m107864I(objM36575A);
        } else {
            if (i15 == 2) {
                j7 = hVar.f145503w;
                c40767y0 = (C40767y0) hVar.f145504x;
                AbstractC34132o.m107864I(objM36575A);
                list = (List) objM36575A;
                numberOfDeviceConfigs = c40767y0.getNumberOfDeviceConfigs();
                if (!list.isEmpty()) {
                    return EnumC34557a.NONE;
                }
                hVar.f145504x = null;
                hVar.f145505y = null;
                hVar.f145503w = j7;
                hVar.f145506z = numberOfDeviceConfigs;
                hVar.f145502H = 3;
                objM36575A = m109265t(list, hVar);
                if (objM36575A != obj) {
                    j13 = j7;
                    i13 = numberOfDeviceConfigs;
                    iIntValue = ((Number) objM36575A).intValue();
                    hVar.f145504x = null;
                    hVar.f145505y = null;
                    hVar.f145503w = j13;
                    hVar.f145506z = i13;
                    hVar.f145499E = iIntValue;
                    hVar.f145502H = 4;
                    if (m109269q(i13, iIntValue, hVar) != obj) {
                        j14 = j13;
                    }
                }
                return obj;
            }
            if (i15 == 3) {
                i13 = hVar.f145506z;
                j13 = hVar.f145503w;
                AbstractC34132o.m107864I(objM36575A);
                iIntValue = ((Number) objM36575A).intValue();
                hVar.f145504x = null;
                hVar.f145505y = null;
                hVar.f145503w = j13;
                hVar.f145506z = i13;
                hVar.f145499E = iIntValue;
                hVar.f145502H = 4;
                if (m109269q(i13, iIntValue, hVar) != obj) {
                    j14 = j13;
                }
                return obj;
            }
            if (i15 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j14 = hVar.f145503w;
            AbstractC34132o.m107864I(objM36575A);
        }
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putLong("remote-device-config-last-sync", j14);
        editorEdit.apply();
        return EnumC34557a.SUCCESS;
        c40767y0 = (C40767y0) objM36575A;
        if (!AbstractC22676k.m65745e(c40767y0 != null ? Boolean.valueOf(c40767y0.m132198W()) : null, Boolean.TRUE)) {
            return EnumC34557a.FAIL;
        }
        hVar.f145504x = c40767y0;
        hVar.f145505y = null;
        hVar.f145503w = j7;
        hVar.f145502H = 2;
        objM36575A = m109263n(c40767y0, hVar);
        if (objM36575A != obj) {
            list = (List) objM36575A;
            numberOfDeviceConfigs = c40767y0.getNumberOfDeviceConfigs();
            if (!list.isEmpty()) {
                return EnumC34557a.NONE;
            }
            hVar.f145504x = null;
            hVar.f145505y = null;
            hVar.f145503w = j7;
            hVar.f145506z = numberOfDeviceConfigs;
            hVar.f145502H = 3;
            objM36575A = m109265t(list, hVar);
            if (objM36575A != obj) {
                j13 = j7;
                i13 = numberOfDeviceConfigs;
                iIntValue = ((Number) objM36575A).intValue();
                hVar.f145504x = null;
                hVar.f145505y = null;
                hVar.f145503w = j13;
                hVar.f145506z = i13;
                hVar.f145499E = iIntValue;
                hVar.f145502H = 4;
                if (m109269q(i13, iIntValue, hVar) != obj) {
                    j14 = j13;
                    SharedPreferences.Editor editorEdit2 = this.sharedPreferences.edit();
                    editorEdit2.putLong("remote-device-config-last-sync", j14);
                    editorEdit2.apply();
                    return EnumC34557a.SUCCESS;
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (r13.m113227d(r12, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
    
        return r1;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x008e, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00e7 -> B:25:0x00ea). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m109265t(java.util.List<com.whoop.removeDeviceConfig.domain.dto.PropertyValuesInfo> r12, q83.InterfaceC30057d<? super java.lang.Integer> r13) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u62.C34558b.m109265t(java.util.List, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: v */
    private final boolean m109266v(long currentTimestamp) {
        long j7 = currentTimestamp - this.sharedPreferences.getLong("remote-device-config-last-sync", 0L);
        AbstractC21909c abstractC21909c = this.configurationRepository;
        Companion.C42451a c42451a = Companion.C42451a.f145442a;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = c42451a.getName();
        Object defaultValue = c42451a.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
        Object objM125868N0 = null;
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue != null) {
            return j7 >= ((Long) defaultValue).longValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    /* JADX INFO: renamed from: y */
    private final EnumC34557a m109267y(EnumC34557a status) {
        this.fetchRemoteStatus = status;
        return status;
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

    /* JADX INFO: renamed from: i */
    public final double m109268i(int numberOfPropertiesInStrap, int succeededCommands) {
        return (((double) succeededCommands) / ((double) numberOfPropertiesInStrap)) * ((double) 100);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b2, code lost:
    
        if (r15.mo58700a(r7, r2) == r3) goto L22;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m109269q(int r21, int r22, q83.InterfaceC30057d<? super l83.C23454a0> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            boolean r2 = r1 instanceof u62.C34558b.f
            if (r2 == 0) goto L17
            r2 = r1
            u62.b$f r2 = (u62.C34558b.f) r2
            int r3 = r2.f145478G
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f145478G = r3
            goto L1c
        L17:
            u62.b$f r2 = new u62.b$f
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f145476E
            r83.a r3 = r83.EnumC31071a.f128113w
            int r4 = r2.f145478G
            m83.y r9 = m83.C25271y.f99162w
            r13 = 2
            r14 = 1
            if (r4 == 0) goto L46
            if (r4 == r14) goto L39
            if (r4 != r13) goto L31
            p505ts.AbstractC34132o.m107864I(r1)
            goto Lb5
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            double r4 = r2.f145481y
            int r6 = r2.f145480x
            int r7 = r2.f145479w
            p505ts.AbstractC34132o.m107864I(r1)
            r13 = r4
            r4 = r6
            r1 = r7
            goto L85
        L46:
            p505ts.AbstractC34132o.m107864I(r1)
            java.time.Clock r1 = r0.clock
            java.time.Instant r1 = java.time.Instant.now(r1)
            java.lang.String r4 = "now(...)"
            p715kotlin.jvm.internal.AbstractC22676k.m65749i(r1, r4)
            double r4 = r0.m109259g(r1)
            iy1.c r1 = r0.metricsInteractor
            jy1.a r6 = new jy1.a
            java.lang.Double r8 = new java.lang.Double
            r8.<init>(r4)
            r11 = 17
            r12 = 0
            r15 = r4
            r5 = r6
            r6 = 0
            java.lang.String r7 = "connectivity.remote_device_config.frequency"
            r10 = 0
            r13 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r6 = r5
            r5 = r21
            r2.f145479w = r5
            r7 = r22
            r2.f145480x = r7
            r2.f145481y = r13
            r4 = 1
            r2.f145478G = r4
            java.lang.Object r1 = r1.mo58700a(r6, r2)
            if (r1 != r3) goto L83
            goto Lb4
        L83:
            r1 = r5
            r4 = r7
        L85:
            double r5 = r0.m109268i(r1, r4)
            iy1.c r15 = r0.metricsInteractor
            jy1.a r7 = new jy1.a
            java.lang.Double r8 = new java.lang.Double
            r8.<init>(r5)
            r11 = 17
            r12 = 0
            r16 = r5
            r6 = 0
            r5 = r7
            java.lang.String r7 = "connectivity.remote_device_config.command_success_rate"
            r10 = 0
            r18 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r2.f145479w = r1
            r2.f145480x = r4
            r2.f145481y = r13
            r6 = r18
            r2.f145482z = r6
            r1 = 2
            r2.f145478G = r1
            java.lang.Object r1 = r15.mo58700a(r5, r2)
            if (r1 != r3) goto Lb5
        Lb4:
            return r3
        Lb5:
            l83.a0 r1 = l83.C23454a0.f92919a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u62.C34558b.m109269q(int, int, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4 A[Catch: all -> 0x0050, Exception -> 0x0053, PHI: r2 r6 r11
      0x00d4: PHI (r2v10 u62.a) = (r2v9 u62.a), (r2v14 u62.a) binds: [B:47:0x00d0, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r6v3 long) = (r6v1 long), (r6v4 long) binds: [B:47:0x00d0, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r11v14 java.lang.Object) = (r11v13 java.lang.Object), (r11v1 java.lang.Object) binds: [B:47:0x00d0, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0053, blocks: (B:18:0x004b, B:25:0x005c, B:49:0x00d4, B:51:0x00dc, B:53:0x00e2, B:55:0x00e8, B:57:0x00f0, B:67:0x0135, B:28:0x0063, B:46:0x00be, B:33:0x0072, B:35:0x0082, B:43:0x00b1), top: B:84:0x0022, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc A[Catch: all -> 0x0050, Exception -> 0x0053, TryCatch #1 {Exception -> 0x0053, blocks: (B:18:0x004b, B:25:0x005c, B:49:0x00d4, B:51:0x00dc, B:53:0x00e2, B:55:0x00e8, B:57:0x00f0, B:67:0x0135, B:28:0x0063, B:46:0x00be, B:33:0x0072, B:35:0x0082, B:43:0x00b1), top: B:84:0x0022, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2 A[Catch: all -> 0x0050, Exception -> 0x0053, TryCatch #1 {Exception -> 0x0053, blocks: (B:18:0x004b, B:25:0x005c, B:49:0x00d4, B:51:0x00dc, B:53:0x00e2, B:55:0x00e8, B:57:0x00f0, B:67:0x0135, B:28:0x0063, B:46:0x00be, B:33:0x0072, B:35:0x0082, B:43:0x00b1), top: B:84:0x0022, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[Catch: all -> 0x0050, Exception -> 0x0053, TRY_LEAVE, TryCatch #1 {Exception -> 0x0053, blocks: (B:18:0x004b, B:25:0x005c, B:49:0x00d4, B:51:0x00dc, B:53:0x00e2, B:55:0x00e8, B:57:0x00f0, B:67:0x0135, B:28:0x0063, B:46:0x00be, B:33:0x0072, B:35:0x0082, B:43:0x00b1), top: B:84:0x0022, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0112 A[PHI: r6 r11
      0x0112: PHI (r6v5 long) = (r6v3 long), (r6v6 long) binds: [B:58:0x010f, B:18:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r11v31 java.lang.Object) = (r11v29 java.lang.Object), (r11v1 java.lang.Object) binds: [B:58:0x010f, B:18:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0121  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x0135 A[Catch: all -> 0x0050, Exception -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0053, blocks: (B:18:0x004b, B:25:0x005c, B:49:0x00d4, B:51:0x00dc, B:53:0x00e2, B:55:0x00e8, B:57:0x00f0, B:67:0x0135, B:28:0x0063, B:46:0x00be, B:33:0x0072, B:35:0x0082, B:43:0x00b1), top: B:84:0x0022, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x014f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0162 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public final Object m109270w(InterfaceC30057d<? super EnumC34557a> interfaceC30057d) throws Throwable {
        l lVar;
        long epochMilli;
        EnumC34557a enumC34557a;
        InterfaceC21750d interfaceC21750dM109262m;
        InterfaceC21750d interfaceC21750dM109262m2;
        AbstractC32962f connectionState;
        InterfaceC21750d interfaceC21750dM109262m3;
        Object obj;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f145549F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f145549F = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        Object objM109260j = lVar.f145553z;
        Object obj2 = EnumC31071a.f128113w;
        try {
            try {
                switch (lVar.f145549F) {
                    case 0:
                        AbstractC34132o.m107864I(objM109260j);
                        epochMilli = Instant.now(this.clock).toEpochMilli();
                        if (m109266v(epochMilli)) {
                            lVar.f145550w = epochMilli;
                            lVar.f145549F = 2;
                            objM109260j = m109260j(lVar);
                            if (objM109260j != obj2) {
                                enumC34557a = (EnumC34557a) objM109260j;
                                C34559c c34559c = this.remoteDeviceConfigTrigger;
                                EnumC34557a enumC34557a2 = this.fetchRemoteStatus;
                                lVar.f145551x = enumC34557a;
                                lVar.f145550w = epochMilli;
                                lVar.f145549F = 3;
                                objM109260j = c34559c.m109272a(enumC34557a2, lVar);
                                if (objM109260j == obj2) {
                                    if (((Boolean) objM109260j).booleanValue()) {
                                        interfaceC21750dM109262m2 = m109262m();
                                        if (interfaceC21750dM109262m2 != null) {
                                            connectionState = interfaceC21750dM109262m2.getConnectionState();
                                        } else {
                                            connectionState = null;
                                        }
                                        if (AbstractC22676k.m65745e(connectionState, C32970n.f137298a)) {
                                            m109258f();
                                            C14380k c14380kM36590P = AbstractC13091v.m36590P(AbstractC36080f.m114589b(getServiceFlow()), new k(null, this, epochMilli));
                                            lVar.f145551x = null;
                                            lVar.f145550w = epochMilli;
                                            lVar.f145549F = 4;
                                            objM109260j = AbstractC13091v.m36575A(c14380kM36590P, lVar);
                                            if (objM109260j != obj2) {
                                                getLogger().mo85216g("Unlocking history requests", new AbstractC30556a.a[0]);
                                                interfaceC21750dM109262m3 = m109262m();
                                                if (interfaceC21750dM109262m3 != null) {
                                                    interfaceC21750dM109262m3.mo24702P0();
                                                }
                                                lVar.f145551x = null;
                                                lVar.f145552y = objM109260j;
                                                lVar.f145550w = epochMilli;
                                                lVar.f145549F = 5;
                                                if (m109261k(lVar) != obj2) {
                                                    return objM109260j;
                                                }
                                            }
                                        } else {
                                            getLogger().mo85216g("Right now the exchange can't be triggered", new AbstractC30556a.a[0]);
                                            getLogger().mo85216g("Unlocking history requests", new AbstractC30556a.a[0]);
                                            interfaceC21750dM109262m = m109262m();
                                            if (interfaceC21750dM109262m != null) {
                                                interfaceC21750dM109262m.mo24702P0();
                                            }
                                            lVar.f145551x = null;
                                            lVar.f145552y = enumC34557a;
                                            lVar.f145550w = epochMilli;
                                            lVar.f145549F = 6;
                                            if (m109261k(lVar) == obj2) {
                                                return enumC34557a;
                                            }
                                        }
                                    } else {
                                        getLogger().mo85216g("Right now the exchange can't be triggered", new AbstractC30556a.a[0]);
                                        getLogger().mo85216g("Unlocking history requests", new AbstractC30556a.a[0]);
                                        interfaceC21750dM109262m = m109262m();
                                        if (interfaceC21750dM109262m != null) {
                                            interfaceC21750dM109262m.mo24702P0();
                                        }
                                        lVar.f145551x = null;
                                        lVar.f145552y = enumC34557a;
                                        lVar.f145550w = epochMilli;
                                        lVar.f145549F = 6;
                                        if (m109261k(lVar) == obj2) {
                                            return enumC34557a;
                                        }
                                    }
                                }
                            }
                        } else {
                            getLogger().mo85216g("Exchange of remote device config values can't happen so often", new AbstractC30556a.a[0]);
                            EnumC34557a enumC34557a3 = EnumC34557a.NONE;
                            getLogger().mo85216g("Unlocking history requests", new AbstractC30556a.a[0]);
                            InterfaceC21750d interfaceC21750dM109262m4 = m109262m();
                            if (interfaceC21750dM109262m4 != null) {
                                interfaceC21750dM109262m4.mo24702P0();
                            }
                            lVar.f145551x = enumC34557a3;
                            lVar.f145550w = epochMilli;
                            lVar.f145549F = 1;
                            if (m109261k(lVar) != obj2) {
                                return enumC34557a3;
                            }
                        }
                        return obj2;
                    case 1:
                        EnumC34557a enumC34557a4 = (EnumC34557a) lVar.f145551x;
                        AbstractC34132o.m107864I(objM109260j);
                        return enumC34557a4;
                    case 2:
                        epochMilli = lVar.f145550w;
                        AbstractC34132o.m107864I(objM109260j);
                        enumC34557a = (EnumC34557a) objM109260j;
                        C34559c c34559c2 = this.remoteDeviceConfigTrigger;
                        EnumC34557a enumC34557a5 = this.fetchRemoteStatus;
                        lVar.f145551x = enumC34557a;
                        lVar.f145550w = epochMilli;
                        lVar.f145549F = 3;
                        objM109260j = c34559c2.m109272a(enumC34557a5, lVar);
                        if (objM109260j == obj2) {
                            if (((Boolean) objM109260j).booleanValue()) {
                                getLogger().mo85216g("Right now the exchange can't be triggered", new AbstractC30556a.a[0]);
                                getLogger().mo85216g("Unlocking history requests", new AbstractC30556a.a[0]);
                                interfaceC21750dM109262m = m109262m();
                                if (interfaceC21750dM109262m != null) {
                                    interfaceC21750dM109262m.mo24702P0();
                                }
                                lVar.f145551x = null;
                                lVar.f145552y = enumC34557a;
                                lVar.f145550w = epochMilli;
                                lVar.f145549F = 6;
                                if (m109261k(lVar) == obj2) {
                                    return enumC34557a;
                                }
                            } else {
                                interfaceC21750dM109262m2 = m109262m();
                                if (interfaceC21750dM109262m2 != null) {
                                    connectionState = interfaceC21750dM109262m2.getConnectionState();
                                } else {
                                    connectionState = null;
                                }
                                if (AbstractC22676k.m65745e(connectionState, C32970n.f137298a)) {
                                    m109258f();
                                    C14380k c14380kM36590P2 = AbstractC13091v.m36590P(AbstractC36080f.m114589b(getServiceFlow()), new k(null, this, epochMilli));
                                    lVar.f145551x = null;
                                    lVar.f145550w = epochMilli;
                                    lVar.f145549F = 4;
                                    objM109260j = AbstractC13091v.m36575A(c14380kM36590P2, lVar);
                                    if (objM109260j != obj2) {
                                        getLogger().mo85216g("Unlocking history requests", new AbstractC30556a.a[0]);
                                        interfaceC21750dM109262m3 = m109262m();
                                        if (interfaceC21750dM109262m3 != null) {
                                            interfaceC21750dM109262m3.mo24702P0();
                                        }
                                        lVar.f145551x = null;
                                        lVar.f145552y = objM109260j;
                                        lVar.f145550w = epochMilli;
                                        lVar.f145549F = 5;
                                        if (m109261k(lVar) != obj2) {
                                            return objM109260j;
                                        }
                                    }
                                } else {
                                    getLogger().mo85216g("Right now the exchange can't be triggered", new AbstractC30556a.a[0]);
                                    getLogger().mo85216g("Unlocking history requests", new AbstractC30556a.a[0]);
                                    interfaceC21750dM109262m = m109262m();
                                    if (interfaceC21750dM109262m != null) {
                                        interfaceC21750dM109262m.mo24702P0();
                                    }
                                    lVar.f145551x = null;
                                    lVar.f145552y = enumC34557a;
                                    lVar.f145550w = epochMilli;
                                    lVar.f145549F = 6;
                                    if (m109261k(lVar) == obj2) {
                                        return enumC34557a;
                                    }
                                }
                            }
                        }
                        return obj2;
                    case 3:
                        epochMilli = lVar.f145550w;
                        enumC34557a = (EnumC34557a) lVar.f145551x;
                        AbstractC34132o.m107864I(objM109260j);
                        if (((Boolean) objM109260j).booleanValue()) {
                            getLogger().mo85216g("Right now the exchange can't be triggered", new AbstractC30556a.a[0]);
                            getLogger().mo85216g("Unlocking history requests", new AbstractC30556a.a[0]);
                            interfaceC21750dM109262m = m109262m();
                            if (interfaceC21750dM109262m != null) {
                                interfaceC21750dM109262m.mo24702P0();
                            }
                            lVar.f145551x = null;
                            lVar.f145552y = enumC34557a;
                            lVar.f145550w = epochMilli;
                            lVar.f145549F = 6;
                            if (m109261k(lVar) == obj2) {
                                return enumC34557a;
                            }
                        } else {
                            interfaceC21750dM109262m2 = m109262m();
                            if (interfaceC21750dM109262m2 != null) {
                                connectionState = interfaceC21750dM109262m2.getConnectionState();
                            } else {
                                connectionState = null;
                            }
                            if (AbstractC22676k.m65745e(connectionState, C32970n.f137298a)) {
                                m109258f();
                                C14380k c14380kM36590P3 = AbstractC13091v.m36590P(AbstractC36080f.m114589b(getServiceFlow()), new k(null, this, epochMilli));
                                lVar.f145551x = null;
                                lVar.f145550w = epochMilli;
                                lVar.f145549F = 4;
                                objM109260j = AbstractC13091v.m36575A(c14380kM36590P3, lVar);
                                if (objM109260j != obj2) {
                                    getLogger().mo85216g("Unlocking history requests", new AbstractC30556a.a[0]);
                                    interfaceC21750dM109262m3 = m109262m();
                                    if (interfaceC21750dM109262m3 != null) {
                                        interfaceC21750dM109262m3.mo24702P0();
                                    }
                                    lVar.f145551x = null;
                                    lVar.f145552y = objM109260j;
                                    lVar.f145550w = epochMilli;
                                    lVar.f145549F = 5;
                                    if (m109261k(lVar) != obj2) {
                                        return objM109260j;
                                    }
                                }
                            } else {
                                getLogger().mo85216g("Right now the exchange can't be triggered", new AbstractC30556a.a[0]);
                                getLogger().mo85216g("Unlocking history requests", new AbstractC30556a.a[0]);
                                interfaceC21750dM109262m = m109262m();
                                if (interfaceC21750dM109262m != null) {
                                    interfaceC21750dM109262m.mo24702P0();
                                }
                                lVar.f145551x = null;
                                lVar.f145552y = enumC34557a;
                                lVar.f145550w = epochMilli;
                                lVar.f145549F = 6;
                                if (m109261k(lVar) == obj2) {
                                    return enumC34557a;
                                }
                            }
                        }
                        return obj2;
                    case 4:
                        epochMilli = lVar.f145550w;
                        AbstractC34132o.m107864I(objM109260j);
                        getLogger().mo85216g("Unlocking history requests", new AbstractC30556a.a[0]);
                        interfaceC21750dM109262m3 = m109262m();
                        if (interfaceC21750dM109262m3 != null) {
                            interfaceC21750dM109262m3.mo24702P0();
                        }
                        lVar.f145551x = null;
                        lVar.f145552y = objM109260j;
                        lVar.f145550w = epochMilli;
                        lVar.f145549F = 5;
                        if (m109261k(lVar) != obj2) {
                            return obj2;
                        }
                        return objM109260j;
                    case 5:
                        obj = lVar.f145552y;
                        AbstractC34132o.m107864I(objM109260j);
                        return obj;
                    case 6:
                        obj = (EnumC34557a) lVar.f145552y;
                        AbstractC34132o.m107864I(objM109260j);
                        return obj;
                    case 7:
                        Throwable th3 = (Throwable) lVar.f145551x;
                        AbstractC34132o.m107864I(objM109260j);
                        throw th3;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e5) {
                throw e5;
            }
        } catch (Throwable th4) {
            getLogger().mo85216g("Unlocking history requests", new AbstractC30556a.a[0]);
            InterfaceC21750d interfaceC21750dM109262m5 = m109262m();
            if (interfaceC21750dM109262m5 != null) {
                interfaceC21750dM109262m5.mo24702P0();
            }
            lVar.f145551x = th4;
            lVar.f145549F = 7;
            if (m109261k(lVar) != obj2) {
                throw th4;
            }
        }
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: x */
    public /* bridge */ Object mo23655x(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super InterfaceC36079e> interfaceC30057d) {
        return super.mo23655x(interfaceC36083i, interfaceC30057d);
    }

    public /* synthetic */ C34558b(RemoteDeviceConfigApi remoteDeviceConfigApi, C35742a c35742a, C34559c c34559c, InterfaceC4733b interfaceC4733b, AbstractC21909c abstractC21909c, SharedPreferences sharedPreferences, InterfaceC21030c interfaceC21030c, Clock clock, InterfaceC34116n interfaceC34116n, String str, InterfaceC13075p1 interfaceC13075p1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(remoteDeviceConfigApi, c35742a, c34559c, interfaceC4733b, abstractC21909c, sharedPreferences, interfaceC21030c, clock, interfaceC34116n, (i13 & 512) != 0 ? "RemoteDeviceConfigInteractor" : str, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? AbstractC13091v.m36593c(null) : interfaceC13075p1);
    }
}
