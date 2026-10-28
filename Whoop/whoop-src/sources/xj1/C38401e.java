package xj1;

import c93.InterfaceC4351m;
import com.whoop.data.remote.api.FileDownloaderApi;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.healthmonitor.domain.ComposableHealthMonitorApi;
import com.whoop.healthmonitor.domain.models.ComposableHealthMonitorResponse;
import com.whoop.service.network.HealthMonitorUsersApiMigrations;
import com.whoop.service.network.UsersApi;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.AbstractC34799a1;
import yg2.AbstractC39529d;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: xj1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b!\u0010 J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020%2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001eH\u0002¢\u0006\u0004\b0\u00101J!\u00106\u001a\b\u0012\u0004\u0012\u000205022\f\u00104\u001a\b\u0012\u0004\u0012\u00020302¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010CR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010DR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010E¨\u0006F"}, m65681d2 = {"Lxj1/e;", "", "Lcom/whoop/healthmonitor/domain/ComposableHealthMonitorApi;", "api", "Lcom/whoop/service/network/UsersApi;", "usersApi", "Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;", "healthMonitorUsersApiMigrations", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "fileDownloaderApi", "Lrr2/c;", "crashReporter", "Lxj1/h;", "pdfHandler", "Lz82/b;", "analyticsManager", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/healthmonitor/domain/ComposableHealthMonitorApi;Lcom/whoop/service/network/UsersApi;Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/data/remote/api/FileDownloaderApi;Lrr2/c;Lxj1/h;Lz82/b;Ltr2/n;)V", "", "n", "()Z", "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;", "response", "Lxj1/b$i;", "f", "(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;)Lxj1/b$i;", "Lxj1/b;", "i", "(Lq83/d;)Ljava/lang/Object;", "k", "", "amountOfTries", "Lcom/whoop/data/remote/commons/Resource;", "Lud3/a1;", "l", "(ILq83/d;)Ljava/lang/Object;", "", QueryParams.URL, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ljava/io/File;", "file", "g", "(Ljava/io/File;)Lxj1/b;", "j", "()Lxj1/b;", "Lec3/l;", "Lxj1/a;", "upstream", "Lxj1/c;", "m", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/healthmonitor/domain/ComposableHealthMonitorApi;", "b", "Lcom/whoop/service/network/UsersApi;", "c", "Lcom/whoop/service/network/HealthMonitorUsersApiMigrations;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "Lrr2/c;", "Lxj1/h;", "Lz82/b;", "Ltr2/n;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38401e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ComposableHealthMonitorApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final UsersApi usersApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final HealthMonitorUsersApiMigrations healthMonitorUsersApiMigrations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FileDownloaderApi fileDownloaderApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C38404h pdfHandler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: xj1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.domain.ComposableHealthMonitorInteractor", m100430f = "ComposableHealthMonitorInteractor.kt", m100431l = {117}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f164345w;

        /* JADX INFO: renamed from: y */
        int f164347y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f164345w = obj;
            this.f164347y |= Integer.MIN_VALUE;
            return C38401e.this.m122992i(this);
        }
    }

    /* JADX INFO: renamed from: xj1.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.domain.ComposableHealthMonitorInteractor$fetchData$response$1", m100430f = "ComposableHealthMonitorInteractor.kt", m100431l = {118}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f164348w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C38401e.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164348w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ComposableHealthMonitorApi composableHealthMonitorApi = C38401e.this.api;
            this.f164348w = 1;
            Object healthMonitor = composableHealthMonitorApi.getHealthMonitor(this);
            return healthMonitor == enumC31071a ? enumC31071a : healthMonitor;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ComposableHealthMonitorResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: xj1.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.domain.ComposableHealthMonitorInteractor", m100430f = "ComposableHealthMonitorInteractor.kt", m100431l = {135, 139}, m100432m = "getHealthReport", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f164351F;

        /* JADX INFO: renamed from: w */
        Object f164352w;

        /* JADX INFO: renamed from: x */
        Object f164353x;

        /* JADX INFO: renamed from: y */
        int f164354y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f164355z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f164355z = obj;
            this.f164351F |= Integer.MIN_VALUE;
            return C38401e.this.m122994k(this);
        }
    }

    /* JADX INFO: renamed from: xj1.e$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.domain.ComposableHealthMonitorInteractor", m100430f = "ComposableHealthMonitorInteractor.kt", m100431l = {170, 172, 175, 177, 180, 191}, m100432m = "getHealthReportWithRetry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f164356E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f164357F;

        /* JADX INFO: renamed from: H */
        int f164359H;

        /* JADX INFO: renamed from: w */
        int f164360w;

        /* JADX INFO: renamed from: x */
        int f164361x;

        /* JADX INFO: renamed from: y */
        Object f164362y;

        /* JADX INFO: renamed from: z */
        Object f164363z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f164357F = obj;
            this.f164359H |= Integer.MIN_VALUE;
            return C38401e.this.m122995l(0, this);
        }
    }

    /* JADX INFO: renamed from: xj1.e$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.domain.ComposableHealthMonitorInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ComposableHealthMonitorInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f164364w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f164365x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f164366y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C38401e f164367z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C38401e c38401e) {
            super(3, interfaceC30057d);
            this.f164367z = c38401e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC38397a abstractC38397a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f164367z);
            eVar.f164365x = interfaceC13062m;
            eVar.f164366y = abstractC38397a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            C0456u c0456u2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164364w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f164365x;
                AbstractC38397a abstractC38397a = (AbstractC38397a) this.f164366y;
                if (abstractC38397a instanceof AbstractC38397a.f) {
                    c0456u = new C13084s1(this.f164367z.new f(null));
                } else {
                    if (abstractC38397a instanceof AbstractC38397a.e) {
                        c0456u2 = new C0456u(new AbstractC38398b.h(((AbstractC38397a.e) abstractC38397a).getTileState()), 1);
                    } else if (abstractC38397a instanceof AbstractC38397a.a) {
                        c0456u = new C0456u(AbstractC38398b.a.f164316a, 1);
                    } else if (abstractC38397a instanceof AbstractC38397a.d) {
                        c0456u2 = new C0456u(new AbstractC38398b.g(((AbstractC38397a.d) abstractC38397a).getInitialHr()), 1);
                    } else if (abstractC38397a instanceof AbstractC38397a.c) {
                        c0456u = new C13084s1(this.f164367z.new g(null));
                    } else {
                        if (!(abstractC38397a instanceof AbstractC38397a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0456u = new C0456u(this.f164367z.m122990g(((AbstractC38397a.b) abstractC38397a).getFile()), 1);
                    }
                    c0456u = c0456u2;
                }
                this.f164365x = null;
                this.f164366y = null;
                this.f164364w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC38397a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: xj1.e$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.domain.ComposableHealthMonitorInteractor$interact$1$1", m100430f = "ComposableHealthMonitorInteractor.kt", m100431l = {48, 48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lxj1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f164368w;

        /* JADX INFO: renamed from: x */
        int f164369x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f164370y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C38401e.this.new f(interfaceC30057d);
            fVar.f164370y = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f164370y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f164369x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L44
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f164368w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                xj1.e r7 = xj1.C38401e.this
                r6.f164370y = r5
                r6.f164368w = r0
                r6.f164369x = r4
                java.lang.Object r7 = xj1.C38401e.m122985b(r7, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.f164370y = r5
                r6.f164368w = r5
                r6.f164369x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L44
            L43:
                return r1
            L44:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: xj1.C38401e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: xj1.e$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.domain.ComposableHealthMonitorInteractor$interact$1$2", m100430f = "ComposableHealthMonitorInteractor.kt", m100431l = {62, 63, 63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lxj1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f164372w;

        /* JADX INFO: renamed from: x */
        int f164373x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f164374y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C38401e.this.new g(interfaceC30057d);
            gVar.f164374y = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f164374y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f164373x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r8)
                goto L58
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r0 = r7.f164372w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L4b
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L3c
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                xj1.b$e r8 = xj1.AbstractC38398b.e.f164320a
                r7.f164374y = r0
                r7.f164373x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L3c
                goto L57
            L3c:
                xj1.e r8 = xj1.C38401e.this
                r7.f164374y = r6
                r7.f164372w = r0
                r7.f164373x = r4
                java.lang.Object r8 = xj1.C38401e.m122987d(r8, r7)
                if (r8 != r1) goto L4b
                goto L57
            L4b:
                r7.f164374y = r6
                r7.f164372w = r6
                r7.f164373x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L58
            L57:
                return r1
            L58:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xj1.C38401e.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: xj1.e$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.domain.ComposableHealthMonitorInteractor$interact$2", m100430f = "ComposableHealthMonitorInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lxj1/c;", "accumulator", "Lxj1/b;", "value", "<anonymous>", "(Lxj1/c;Lxj1/b;)Lxj1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f164376w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f164377x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f164378y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C38399c c38399c, AbstractC38398b abstractC38398b, InterfaceC30057d<? super C38399c> interfaceC30057d) {
            h hVar = new h(interfaceC30057d);
            hVar.f164377x = c38399c;
            hVar.f164378y = abstractC38398b;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C38399c c38399c = (C38399c) this.f164377x;
            AbstractC38398b abstractC38398b = (AbstractC38398b) this.f164378y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f164376w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC38398b instanceof AbstractC38398b.g) {
                AbstractC39529d initialHr = ((AbstractC38398b.g) abstractC38398b).getInitialHr();
                return C38399c.m122974b(c38399c, null, null, null, null, initialHr != null ? new C38400d(initialHr, true) : new C38400d(AbstractC39529d.b.f169991b, false), null, 47, null);
            }
            if (abstractC38398b instanceof AbstractC38398b.b) {
                return C38399c.m122974b(c38399c, null, null, EnumC38402f.NETWORK_ERROR, null, null, null, 59, null);
            }
            if (abstractC38398b instanceof AbstractC38398b.h) {
                return C38399c.m122974b(c38399c, null, ((AbstractC38398b.h) abstractC38398b).getTileState(), null, null, null, null, 61, null);
            }
            if (abstractC38398b instanceof AbstractC38398b.i) {
                return new C38399c(((AbstractC38398b.i) abstractC38398b).getResponse(), null, null, null, c38399c.getLiveHrState(), null, 46, null);
            }
            if (abstractC38398b instanceof AbstractC38398b.a) {
                return C38399c.m122974b(c38399c, null, null, null, null, null, null, 61, null);
            }
            if (abstractC38398b instanceof AbstractC38398b.e) {
                return C38399c.m122974b(c38399c, null, null, null, null, null, AbstractC38403g.b.f164380a, 31, null);
            }
            if (abstractC38398b instanceof AbstractC38398b.f) {
                return C38399c.m122974b(c38399c, null, null, null, null, null, new AbstractC38403g.c(((AbstractC38398b.f) abstractC38398b).getFile()), 31, null);
            }
            if (abstractC38398b instanceof AbstractC38398b.d) {
                return C38399c.m122974b(c38399c, null, null, null, null, null, new AbstractC38403g.a(((AbstractC38398b.d) abstractC38398b).getMessage()), 31, null);
            }
            if (abstractC38398b instanceof AbstractC38398b.c) {
                return C38399c.m122974b(c38399c, null, null, null, null, null, null, 31, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C38401e(ComposableHealthMonitorApi api, UsersApi usersApi, HealthMonitorUsersApiMigrations healthMonitorUsersApiMigrations, FeatureFlagChecker featureFlagChecker, FileDownloaderApi fileDownloaderApi, InterfaceC31766c crashReporter, C38404h pdfHandler, InterfaceC40188b analyticsManager, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(usersApi, "usersApi");
        AbstractC22676k.m65750j(healthMonitorUsersApiMigrations, "healthMonitorUsersApiMigrations");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(fileDownloaderApi, "fileDownloaderApi");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(pdfHandler, "pdfHandler");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.usersApi = usersApi;
        this.healthMonitorUsersApiMigrations = healthMonitorUsersApiMigrations;
        this.featureFlagChecker = featureFlagChecker;
        this.fileDownloaderApi = fileDownloaderApi;
        this.crashReporter = crashReporter;
        this.pdfHandler = pdfHandler;
        this.analyticsManager = analyticsManager;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC38398b.i m122989f(ComposableHealthMonitorResponse response) {
        return new AbstractC38398b.i(response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final AbstractC38398b m122990g(File file) {
        this.pdfHandler.m123005d(file);
        return AbstractC38398b.c.f164318a;
    }

    /* JADX INFO: renamed from: h */
    private final Object m122991h(String str, InterfaceC30057d<? super AbstractC34799a1> interfaceC30057d) {
        return this.fileDownloaderApi.downloadFile(str, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m122992i(InterfaceC30057d<? super AbstractC38398b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f164347y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f164347y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f164345w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f164347y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM108729b);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                b bVar = new b(null);
                aVar2.f164347y = 1;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
                if (objM108729b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM108729b);
            }
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                return m122989f((ComposableHealthMonitorResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return AbstractC38398b.b.f164317a;
            }
            throw new NoWhenBranchMatchedException();
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e13) {
            this.logger.mo85230v("Unexpected error in fetchData", e13, new AbstractC30556a.a[0]);
            return AbstractC38398b.b.f164317a;
        }
    }

    /* JADX INFO: renamed from: j */
    private final AbstractC38398b m122993j() {
        this.analyticsManager.mo41424f("Reviewing Data", "Fail", "", "Health Report");
        return new AbstractC38398b.d(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m122994k(q83.InterfaceC30057d<? super xj1.AbstractC38398b> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof xj1.C38401e.c
            if (r0 == 0) goto L13
            r0 = r7
            xj1.e$c r0 = (xj1.C38401e.c) r0
            int r1 = r0.f164351F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f164351F = r1
            goto L18
        L13:
            xj1.e$c r0 = new xj1.e$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f164355z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f164351F
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r1 = r0.f164353x
            ud3.a1 r1 = (ud3.AbstractC34799a1) r1
            java.lang.Object r0 = r0.f164352w
            com.whoop.data.remote.commons.Resource r0 = (com.whoop.data.remote.commons.Resource) r0
            p505ts.AbstractC34132o.m107864I(r7)     // Catch: java.lang.Exception -> L33
            goto L73
        L33:
            r7 = move-exception
            goto L8f
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3d:
            p505ts.AbstractC34132o.m107864I(r7)     // Catch: java.lang.Exception -> L33
            goto L4f
        L41:
            p505ts.AbstractC34132o.m107864I(r7)
            r0.f164351F = r5     // Catch: java.lang.Exception -> L33
            r7 = 10
            java.lang.Object r7 = r6.m122995l(r7, r0)     // Catch: java.lang.Exception -> L33
            if (r7 != r1) goto L4f
            goto L72
        L4f:
            com.whoop.data.remote.commons.Resource r7 = (com.whoop.data.remote.commons.Resource) r7     // Catch: java.lang.Exception -> L33
            com.whoop.data.remote.commons.Status r2 = r7.getStatus()     // Catch: java.lang.Exception -> L33
            com.whoop.data.remote.commons.Status r5 = com.whoop.data.remote.commons.Status.SUCCESS     // Catch: java.lang.Exception -> L33
            if (r2 != r5) goto L8a
            java.lang.Object r7 = r7.getData()     // Catch: java.lang.Exception -> L33
            ud3.a1 r7 = (ud3.AbstractC34799a1) r7     // Catch: java.lang.Exception -> L33
            if (r7 == 0) goto L85
            xj1.h r2 = r6.pdfHandler     // Catch: java.lang.Exception -> L33
            r5 = 0
            r0.f164352w = r5     // Catch: java.lang.Exception -> L33
            r0.f164353x = r5     // Catch: java.lang.Exception -> L33
            r0.f164354y = r3     // Catch: java.lang.Exception -> L33
            r0.f164351F = r4     // Catch: java.lang.Exception -> L33
            java.lang.Object r7 = r2.m123006f(r7, r0)     // Catch: java.lang.Exception -> L33
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Exception -> L33
            if (r7 == 0) goto L7d
            xj1.b$f r0 = new xj1.b$f     // Catch: java.lang.Exception -> L33
            r0.<init>(r7)     // Catch: java.lang.Exception -> L33
            goto L81
        L7d:
            xj1.b r0 = r6.m122993j()     // Catch: java.lang.Exception -> L33
        L81:
            if (r0 != 0) goto L84
            goto L85
        L84:
            return r0
        L85:
            xj1.b r7 = r6.m122993j()     // Catch: java.lang.Exception -> L33
            return r7
        L8a:
            xj1.b r7 = r6.m122993j()     // Catch: java.lang.Exception -> L33
            return r7
        L8f:
            tr2.n r0 = r6.logger
            java.lang.String r1 = "Failed to get health report"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r3]
            r0.mo85230v(r1, r7, r2)
            xj1.b r7 = r6.m122993j()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xj1.C38401e.m122994k(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0197 -> B:13:0x003c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    /* JADX INFO: renamed from: l */
    public final java.lang.Object m122995l(
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: renamed from: n */
    private final boolean m122996n() {
        return this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.KT_SERIALIZATION_HEALTH_MONITOR_USERS_API);
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m122997m(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C38399c(null, null, EnumC38402f.LOADING, null, null, null, 59, null), AbstractC13091v.m36590P(upstream, new e(null, this)), new h(null));
    }

    public /* synthetic */ C38401e(ComposableHealthMonitorApi composableHealthMonitorApi, UsersApi usersApi, HealthMonitorUsersApiMigrations healthMonitorUsersApiMigrations, FeatureFlagChecker featureFlagChecker, FileDownloaderApi fileDownloaderApi, InterfaceC31766c interfaceC31766c, C38404h c38404h, InterfaceC40188b interfaceC40188b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(composableHealthMonitorApi, usersApi, healthMonitorUsersApiMigrations, featureFlagChecker, fileDownloaderApi, interfaceC31766c, c38404h, interfaceC40188b, (i13 & 256) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HealthMonitorInteractor") : interfaceC34116n);
    }
}
