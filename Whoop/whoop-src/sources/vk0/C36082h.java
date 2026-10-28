package vk0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ca2.InterfaceC4368h;
import ci2.InterfaceC4733b;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.WhoopStrapInfo;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.util.List;
import jk0.InterfaceC21750d;
import jy1.C22047a;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import oh2.InterfaceC27939b;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.AbstractC32975s;
import st0.EnumC32978v;
import st0.InterfaceC32974r;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: vk0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u0000 #2\u00020\u0001:\u00011BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001cJ5\u0010#\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b%\u0010\u001cJ%\u0010)\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b)\u0010*J%\u0010-\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b-\u0010.J-\u0010/\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010<R\u0014\u0010>\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010=R\u0014\u0010?\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010=¨\u0006@"}, m65681d2 = {"Lvk0/h;", "", "Ltr2/n;", "logger", "Liy1/c;", "metricsInteractor", "Lbc3/c0;", "scope", "Lca2/h;", "rawDataTrackingService", "Lst0/r;", "strapLockStateTracker", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lci2/b;", "whoopStrapProvider", "<init>", "(Ltr2/n;Liy1/c;Lbc3/c0;Lca2/h;Lst0/r;Lcom/whoop/data/repositories/FeatureFlagChecker;Lci2/b;)V", "", "", "list", "Lst0/v;", "whoopDeviceType", "d", "(Ljava/util/List;Lst0/v;)Ljava/util/List;", "commandName", "Ll83/a0;", "g", "(Ljava/lang/String;Lst0/v;)V", "i", "", "isSuccess", "", "startTime", "endTime", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;ZJJLst0/v;)V", "j", "", "itemsCount", "executionPriority", "k", "(ILjava/lang/String;Lst0/v;)V", "serviceName", "hasBlockedQueue", "l", "(Ljava/lang/String;ZLst0/v;)V", "m", "(Ljava/lang/String;JJLst0/v;)V", "a", "Ltr2/n;", "b", "Liy1/c;", "c", "Lbc3/c0;", "Lca2/h;", "e", "Lst0/r;", "f", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lci2/b;", "()Ljava/lang/String;", "pipelineVersion", "firmwareVersion", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36082h {

    /* JADX INFO: renamed from: h */
    private static final a f154119h = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricsInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4368h rawDataTrackingService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC32974r strapLockStateTracker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: vk0.h$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, m65681d2 = {"Lvk0/h$a;", "", "<init>", "()V", "", "commandNameKey", "Ljava/lang/String;", "commandResponseKey", "queueTypeKey", "serviceNameKey", "whoopDeviceTypeKey", "firmwareVersionKey", "UNKNOWN", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: vk0.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.CrpDataDogMetrics$trackCommandAddedToQueue$1", m100430f = "CrpDataDogMetrics.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ EnumC32978v f154127E;

        /* JADX INFO: renamed from: w */
        Object f154128w;

        /* JADX INFO: renamed from: x */
        int f154129x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f154131z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, EnumC32978v enumC32978v, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154131z = str;
            this.f154127E = enumC32978v;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36082h.this.new b(this.f154131z, this.f154127E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154129x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22047a c22047a = new C22047a(0, "connectivity.crp.command_added_to_queue", null, C36082h.this.m114598d(AbstractC31061c.m95644t("command_name:", this.f154131z), this.f154127E), null, 17, null);
                InterfaceC21030c interfaceC21030c = C36082h.this.metricsInteractor;
                this.f154128w = null;
                this.f154129x = 1;
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

    /* JADX INFO: renamed from: vk0.h$c */
    @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.CrpDataDogMetrics$trackCommandResponseFromStrap$1", m100430f = "CrpDataDogMetrics.kt", m100431l = {84, 91}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f154132E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C36082h f154133F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f154134G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ EnumC32978v f154135H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ long f154136I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ long f154137J;

        /* JADX INFO: renamed from: w */
        Object f154138w;

        /* JADX INFO: renamed from: x */
        Object f154139x;

        /* JADX INFO: renamed from: y */
        Object f154140y;

        /* JADX INFO: renamed from: z */
        int f154141z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z4, C36082h c36082h, String str, EnumC32978v enumC32978v, long j7, long j13, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154132E = z4;
            this.f154133F = c36082h;
            this.f154134G = str;
            this.f154135H = enumC32978v;
            this.f154136I = j7;
            this.f154137J = j13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f154132E, this.f154133F, this.f154134G, this.f154135H, this.f154136I, this.f154137J, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
        
            if (r15.mo58700a(r6, r14) == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r14.f154141z
                java.lang.String r2 = "command_name:"
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L34
                if (r1 == r4) goto L28
                if (r1 != r3) goto L20
                java.lang.Object r0 = r14.f154140y
                jy1.a r0 = (jy1.C22047a) r0
                java.lang.Object r0 = r14.f154139x
                jy1.a r0 = (jy1.C22047a) r0
                java.lang.Object r0 = r14.f154138w
                java.lang.String r0 = (java.lang.String) r0
                p505ts.AbstractC34132o.m107864I(r15)
                goto Lb6
            L20:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L28:
                java.lang.Object r1 = r14.f154139x
                jy1.a r1 = (jy1.C22047a) r1
                java.lang.Object r1 = r14.f154138w
                java.lang.String r1 = (java.lang.String) r1
                p505ts.AbstractC34132o.m107864I(r15)
                goto L7c
            L34:
                p505ts.AbstractC34132o.m107864I(r15)
                boolean r15 = r14.f154132E
                if (r15 == 0) goto L3e
                java.lang.String r15 = "success"
                goto L40
            L3e:
                java.lang.String r15 = "fail"
            L40:
                jy1.a r6 = new jy1.a
                vk0.h r1 = r14.f154133F
                java.lang.String r7 = r14.f154134G
                java.lang.String r7 = p000.AbstractC11266d.m30461o(r2, r7)
                java.lang.String r8 = "response:"
                java.lang.String r15 = r8.concat(r15)
                java.lang.String[] r15 = new java.lang.String[]{r7, r15}
                java.util.List r15 = wb3.AbstractC37056f.m118959K(r15)
                st0.v r7 = r14.f154135H
                java.util.List r10 = vk0.C36082h.m114595a(r1, r15, r7)
                r12 = 17
                r13 = 0
                r7 = 0
                java.lang.String r8 = "connectivity.crp.command_executed"
                r9 = 0
                r11 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                vk0.h r15 = r14.f154133F
                iy1.c r15 = vk0.C36082h.m114597c(r15)
                r14.f154138w = r5
                r14.f154139x = r5
                r14.f154141z = r4
                java.lang.Object r15 = r15.mo58700a(r6, r14)
                if (r15 != r0) goto L7c
                goto Lb5
            L7c:
                jy1.a r6 = new jy1.a
                long r7 = r14.f154136I
                long r9 = r14.f154137J
                long r7 = r7 - r9
                double r7 = (double) r7
                java.lang.Double r9 = new java.lang.Double
                r9.<init>(r7)
                vk0.h r15 = r14.f154133F
                java.lang.String r1 = r14.f154134G
                java.util.List r1 = r80.AbstractC31061c.m95644t(r2, r1)
                st0.v r2 = r14.f154135H
                java.util.List r10 = vk0.C36082h.m114595a(r15, r1, r2)
                r12 = 17
                r13 = 0
                r7 = 0
                java.lang.String r8 = "connectivity.crp.strap_execution_time"
                r11 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                vk0.h r15 = r14.f154133F
                iy1.c r15 = vk0.C36082h.m114597c(r15)
                r14.f154138w = r5
                r14.f154139x = r5
                r14.f154140y = r5
                r14.f154141z = r3
                java.lang.Object r15 = r15.mo58700a(r6, r14)
                if (r15 != r0) goto Lb6
            Lb5:
                return r0
            Lb6:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: vk0.C36082h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vk0.h$d */
    @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.CrpDataDogMetrics$trackCommandSentToStrap$1", m100430f = "CrpDataDogMetrics.kt", m100431l = {72}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ EnumC32978v f154142E;

        /* JADX INFO: renamed from: w */
        Object f154143w;

        /* JADX INFO: renamed from: x */
        int f154144x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f154146z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, EnumC32978v enumC32978v, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154146z = str;
            this.f154142E = enumC32978v;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36082h.this.new d(this.f154146z, this.f154142E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154144x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22047a c22047a = new C22047a(0, "connectivity.crp.command_sent", null, C36082h.this.m114598d(AbstractC31061c.m95644t("command_name:", this.f154146z), this.f154142E), null, 17, null);
                InterfaceC21030c interfaceC21030c = C36082h.this.metricsInteractor;
                this.f154143w = null;
                this.f154144x = 1;
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

    /* JADX INFO: renamed from: vk0.h$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.CrpDataDogMetrics$trackCommandTimeout$1", m100430f = "CrpDataDogMetrics.kt", m100431l = {102}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ EnumC32978v f154147E;

        /* JADX INFO: renamed from: w */
        Object f154148w;

        /* JADX INFO: renamed from: x */
        int f154149x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f154151z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, EnumC32978v enumC32978v, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154151z = str;
            this.f154147E = enumC32978v;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36082h.this.new e(this.f154151z, this.f154147E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154149x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22047a c22047a = new C22047a(0, "connectivity.crp.command_timeout", null, C36082h.this.m114598d(AbstractC31061c.m95644t("command_name:", this.f154151z), this.f154147E), null, 17, null);
                InterfaceC21030c interfaceC21030c = C36082h.this.metricsInteractor;
                this.f154148w = null;
                this.f154149x = 1;
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

    /* JADX INFO: renamed from: vk0.h$f */
    @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.CrpDataDogMetrics$trackItemsInQueue$1", m100430f = "CrpDataDogMetrics.kt", m100431l = {113}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f154152E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ EnumC32978v f154153F;

        /* JADX INFO: renamed from: w */
        Object f154154w;

        /* JADX INFO: renamed from: x */
        int f154155x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f154156y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36082h f154157z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i13, C36082h c36082h, String str, EnumC32978v enumC32978v, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154156y = i13;
            this.f154157z = c36082h;
            this.f154152E = str;
            this.f154153F = enumC32978v;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f154156y, this.f154157z, this.f154152E, this.f154153F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154155x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22047a c22047a = new C22047a(0, "connectivity.crp.tasks_remaining_in_queue", new Double(this.f154156y), this.f154157z.m114598d(AbstractC31061c.m95644t("queue_type:", this.f154152E), this.f154153F), null, 17, null);
                InterfaceC21030c interfaceC21030c = this.f154157z.metricsInteractor;
                this.f154154w = null;
                this.f154155x = 1;
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

    /* JADX INFO: renamed from: vk0.h$g */
    @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.CrpDataDogMetrics$trackService$1", m100430f = "CrpDataDogMetrics.kt", m100431l = {132}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f154158E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ EnumC32978v f154159F;

        /* JADX INFO: renamed from: w */
        Object f154160w;

        /* JADX INFO: renamed from: x */
        int f154161x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f154162y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36082h f154163z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z4, C36082h c36082h, String str, EnumC32978v enumC32978v, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154162y = z4;
            this.f154163z = c36082h;
            this.f154158E = str;
            this.f154159F = enumC32978v;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f154162y, this.f154163z, this.f154158E, this.f154159F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154161x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22047a c22047a = this.f154162y ? new C22047a(0, "connectivity.crp.service_block", null, this.f154163z.m114598d(AbstractC31061c.m95644t("service_name:", this.f154158E), this.f154159F), null, 17, null) : new C22047a(0, "connectivity.crp.service_unblock", null, this.f154163z.m114598d(AbstractC31061c.m95644t("service_name:", this.f154158E), this.f154159F), null, 17, null);
                InterfaceC21030c interfaceC21030c = this.f154163z.metricsInteractor;
                this.f154160w = null;
                this.f154161x = 1;
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

    /* JADX INFO: renamed from: vk0.h$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.CrpDataDogMetrics$trackServiceExecutionTime$1", m100430f = "CrpDataDogMetrics.kt", m100431l = {144}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ long f154164E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C36082h f154165F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f154166G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ EnumC32978v f154167H;

        /* JADX INFO: renamed from: w */
        long f154168w;

        /* JADX INFO: renamed from: x */
        Object f154169x;

        /* JADX INFO: renamed from: y */
        int f154170y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f154171z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j7, long j13, C36082h c36082h, String str, EnumC32978v enumC32978v, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154171z = j7;
            this.f154164E = j13;
            this.f154165F = c36082h;
            this.f154166G = str;
            this.f154167H = enumC32978v;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f154171z, this.f154164E, this.f154165F, this.f154166G, this.f154167H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            long j7;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154170y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                long j13 = this.f154171z - this.f154164E;
                C22047a c22047a = new C22047a(0, "connectivity.crp.service_execution_time", new Double(j13), this.f154165F.m114598d(AbstractC31061c.m95644t("service_name:", this.f154166G), this.f154167H), null, 17, null);
                InterfaceC21030c interfaceC21030c = this.f154165F.metricsInteractor;
                this.f154169x = null;
                this.f154168w = j13;
                this.f154170y = 1;
                if (interfaceC21030c.mo58700a(c22047a, this) == enumC31071a) {
                    return enumC31071a;
                }
                j7 = j13;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = this.f154168w;
                AbstractC34132o.m107864I(obj);
            }
            Duration.Companion companion = Duration.INSTANCE;
            if (j7 > Duration.m134273getInWholeMillisecondsimpl(DurationKt.toDuration(10, DurationUnit.MINUTES))) {
                InterfaceC34116n interfaceC34116n = this.f154165F.logger;
                StringBuilder sbM32000s = AbstractC11895b.m32000s("Service ", this.f154166G, j7, " took more than 10 minutes to complete: ");
                sbM32000s.append("ms");
                interfaceC34116n.mo85226q(sbM32000s.toString(), new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    public C36082h(InterfaceC34116n logger, InterfaceC21030c metricsInteractor, InterfaceC2994c0 scope, InterfaceC4368h rawDataTrackingService, InterfaceC32974r strapLockStateTracker, FeatureFlagChecker featureFlagChecker, InterfaceC4733b whoopStrapProvider) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(metricsInteractor, "metricsInteractor");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(rawDataTrackingService, "rawDataTrackingService");
        AbstractC22676k.m65750j(strapLockStateTracker, "strapLockStateTracker");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        this.logger = logger;
        this.metricsInteractor = metricsInteractor;
        this.scope = scope;
        this.rawDataTrackingService = rawDataTrackingService;
        this.strapLockStateTracker = strapLockStateTracker;
        this.featureFlagChecker = featureFlagChecker;
        this.whoopStrapProvider = whoopStrapProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final List<String> m114598d(List<String> list, EnumC32978v whoopDeviceType) {
        Iterable iterableM95644t = whoopDeviceType.isMaverickOrGoose() ? AbstractC31061c.m95644t("strap_lock_state:", AbstractC32975s.m104081a(this.strapLockStateTracker)) : C25271y.f99162w;
        return AbstractC25265s.m74128f1("pipeline_version:" + m114600f(), AbstractC25265s.m74128f1("firmware_version:" + m114599e(), AbstractC25265s.m74129g1(AbstractC25265s.m74128f1("is_raw_data_in_strap_or_app_backlog:" + this.rawDataTrackingService.mo13761c(), AbstractC25265s.m74128f1("whoop_device_type:" + whoopDeviceType, list)), iterableM95644t)));
    }

    /* JADX INFO: renamed from: e */
    private final String m114599e() {
        WhoopStrapInfo whoopStrapInfo;
        InterfaceC27939b maximVersion;
        String strMo84319a;
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        return (interfaceC21750d == null || (whoopStrapInfo = interfaceC21750d.get_strapInfo()) == null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null || (strMo84319a = maximVersion.mo84319a()) == null) ? "unknown" : strMo84319a;
    }

    /* JADX INFO: renamed from: f */
    private final String m114600f() {
        return this.featureFlagChecker.isFeatureEnabled(ConnectivityFeatureFlagsKt.DROID_BLE_PIPELINE_V2) ? "v2" : "legacy";
    }

    /* JADX INFO: renamed from: g */
    public final void m114601g(String commandName, EnumC32978v whoopDeviceType) {
        AbstractC22676k.m65750j(commandName, "commandName");
        AbstractC22676k.m65750j(whoopDeviceType, "whoopDeviceType");
        AbstractC3006f0.m8732z(this.scope, null, null, new b(commandName, whoopDeviceType, null), 3);
    }

    /* JADX INFO: renamed from: h */
    public final void m114602h(String commandName, boolean isSuccess, long startTime, long endTime, EnumC32978v whoopDeviceType) {
        AbstractC22676k.m65750j(commandName, "commandName");
        AbstractC22676k.m65750j(whoopDeviceType, "whoopDeviceType");
        AbstractC3006f0.m8732z(this.scope, null, null, new c(isSuccess, this, commandName, whoopDeviceType, endTime, startTime, null), 3);
    }

    /* JADX INFO: renamed from: i */
    public final void m114603i(String commandName, EnumC32978v whoopDeviceType) {
        AbstractC22676k.m65750j(commandName, "commandName");
        AbstractC22676k.m65750j(whoopDeviceType, "whoopDeviceType");
        AbstractC3006f0.m8732z(this.scope, null, null, new d(commandName, whoopDeviceType, null), 3);
    }

    /* JADX INFO: renamed from: j */
    public final void m114604j(String commandName, EnumC32978v whoopDeviceType) {
        AbstractC22676k.m65750j(commandName, "commandName");
        AbstractC22676k.m65750j(whoopDeviceType, "whoopDeviceType");
        AbstractC3006f0.m8732z(this.scope, null, null, new e(commandName, whoopDeviceType, null), 3);
    }

    /* JADX INFO: renamed from: k */
    public final void m114605k(int itemsCount, String executionPriority, EnumC32978v whoopDeviceType) {
        AbstractC22676k.m65750j(executionPriority, "executionPriority");
        AbstractC22676k.m65750j(whoopDeviceType, "whoopDeviceType");
        AbstractC3006f0.m8732z(this.scope, null, null, new f(itemsCount, this, executionPriority, whoopDeviceType, null), 3);
    }

    /* JADX INFO: renamed from: l */
    public final void m114606l(String serviceName, boolean hasBlockedQueue, EnumC32978v whoopDeviceType) {
        AbstractC22676k.m65750j(serviceName, "serviceName");
        AbstractC22676k.m65750j(whoopDeviceType, "whoopDeviceType");
        AbstractC3006f0.m8732z(this.scope, null, null, new g(hasBlockedQueue, this, serviceName, whoopDeviceType, null), 3);
    }

    /* JADX INFO: renamed from: m */
    public final void m114607m(String serviceName, long startTime, long endTime, EnumC32978v whoopDeviceType) {
        AbstractC22676k.m65750j(serviceName, "serviceName");
        AbstractC22676k.m65750j(whoopDeviceType, "whoopDeviceType");
        AbstractC3006f0.m8732z(this.scope, null, null, new h(endTime, startTime, this, serviceName, whoopDeviceType, null), 3);
    }

    public /* synthetic */ C36082h(InterfaceC34116n interfaceC34116n, InterfaceC21030c interfaceC21030c, InterfaceC2994c0 interfaceC2994c0, InterfaceC4368h interfaceC4368h, InterfaceC32974r interfaceC32974r, FeatureFlagChecker featureFlagChecker, InterfaceC4733b interfaceC4733b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CrpDataDogMetrics") : interfaceC34116n, interfaceC21030c, interfaceC2994c0, interfaceC4368h, interfaceC32974r, featureFlagChecker, interfaceC4733b);
    }
}
