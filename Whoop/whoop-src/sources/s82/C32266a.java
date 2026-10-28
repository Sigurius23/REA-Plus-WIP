package s82;

import android.content.Context;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3025k;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import i92.C18258c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.hints.C20363j;
import io.seon.androidsdk.exception.BehaviouralMonitoringException;
import io.seon.androidsdk.service.C20652c;
import io.seon.androidsdk.service.C20661f;
import io.seon.androidsdk.service.InterfaceC20649b;
import io.seon.androidsdk.service.InterfaceC20655d;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s52.C32223d;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: s82.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0087@¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Ls82/a;", "", "Landroid/content/Context;", "context", "Li92/c;", "installationUuidProvider", "Ltr2/n;", "logger", "Lkotlin/Function0;", "Lio/seon/androidsdk/service/c;", "seonBuilderFactory", "<init>", "(Landroid/content/Context;Li92/c;Ltr2/n;Lc93/a;)V", "", "sessionId", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "i", "j", "(Lq83/d;)Ljava/lang/Object;", "l", "Ll83/a0;", "m", "k", "a", "Landroid/content/Context;", "b", "Li92/c;", "c", "Ltr2/n;", "d", "Lc93/a;", "Lio/seon/androidsdk/service/b;", "e", "Lio/seon/androidsdk/service/b;", "seon", "seon_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32266a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C18258c installationUuidProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4339a seonBuilderFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC20649b seon;

    /* JADX INFO: renamed from: s82.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC20655d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC3025k f133545a;

        public a(InterfaceC3025k interfaceC3025k) {
            this.f133545a = interfaceC3025k;
        }

        @Override // io.seon.androidsdk.service.InterfaceC20655d
        /* JADX INFO: renamed from: a */
        public final void mo56785a(String str) {
            this.f133545a.resumeWith(str);
        }
    }

    /* JADX INFO: renamed from: s82.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC20655d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC3025k f133546a;

        public b(InterfaceC3025k interfaceC3025k) {
            this.f133546a = interfaceC3025k;
        }

        @Override // io.seon.androidsdk.service.InterfaceC20655d
        /* JADX INFO: renamed from: a */
        public final void mo56785a(String str) {
            this.f133546a.resumeWith(str);
        }
    }

    /* JADX INFO: renamed from: s82.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.seon.SeonManager", m100430f = "SeonManager.kt", m100431l = {31, 32}, m100432m = "getFingerprint", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f133547w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f133548x;

        /* JADX INFO: renamed from: z */
        int f133550z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f133548x = obj;
            this.f133550z |= Integer.MIN_VALUE;
            return C32266a.this.m100425j(this);
        }
    }

    /* JADX INFO: renamed from: s82.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.seon.SeonManager$getFingerprint$fingerprint$1", m100430f = "SeonManager.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f133551w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f133553y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f133553y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32266a.this.new d(this.f133553y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f133551w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C32266a c32266a = C32266a.this;
            String str = this.f133553y;
            this.f133551w = 1;
            Object objM100423h = c32266a.m100423h(str, this);
            return objM100423h == enumC31071a ? enumC31071a : objM100423h;
        }
    }

    /* JADX INFO: renamed from: s82.a$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.seon.SeonManager", m100430f = "SeonManager.kt", m100431l = {121}, m100432m = "getSeonFingerprintWithMonitoring", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f133554w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f133555x;

        /* JADX INFO: renamed from: z */
        int f133557z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f133555x = obj;
            this.f133557z |= Integer.MIN_VALUE;
            return C32266a.this.m100426k(this);
        }
    }

    /* JADX INFO: renamed from: s82.a$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC20655d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC3025k f133558a;

        public f(InterfaceC3025k interfaceC3025k) {
            this.f133558a = interfaceC3025k;
        }

        @Override // io.seon.androidsdk.service.InterfaceC20655d
        /* JADX INFO: renamed from: a */
        public final void mo56785a(String str) {
            this.f133558a.resumeWith(str);
        }
    }

    /* JADX INFO: renamed from: s82.a$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.seon.SeonManager", m100430f = "SeonManager.kt", m100431l = {50, 51}, m100432m = "getSeonFingerprintWithoutMonitoring", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f133559w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f133560x;

        /* JADX INFO: renamed from: z */
        int f133562z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f133560x = obj;
            this.f133562z |= Integer.MIN_VALUE;
            return C32266a.this.m100427l(this);
        }
    }

    /* JADX INFO: renamed from: s82.a$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.seon.SeonManager$getSeonFingerprintWithoutMonitoring$fingerprint$1", m100430f = "SeonManager.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f133563w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f133565y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f133565y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32266a.this.new h(this.f133565y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f133563w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C32266a c32266a = C32266a.this;
            String str = this.f133565y;
            this.f133563w = 1;
            Object objM100424i = c32266a.m100424i(str, this);
            return objM100424i == enumC31071a ? enumC31071a : objM100424i;
        }
    }

    /* JADX INFO: renamed from: s82.a$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.seon.SeonManager", m100430f = "SeonManager.kt", m100431l = {70}, m100432m = "startMonitoring", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f133566w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f133567x;

        /* JADX INFO: renamed from: z */
        int f133569z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f133567x = obj;
            this.f133569z |= Integer.MIN_VALUE;
            return C32266a.this.m100428m(this);
        }
    }

    public C32266a(Context context, C18258c installationUuidProvider, InterfaceC34116n logger, InterfaceC4339a seonBuilderFactory) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(installationUuidProvider, "installationUuidProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(seonBuilderFactory, "seonBuilderFactory");
        this.context = context;
        this.installationUuidProvider = installationUuidProvider;
        this.logger = logger;
        this.seonBuilderFactory = seonBuilderFactory;
        C20652c c20652c = (C20652c) seonBuilderFactory.invoke();
        c20652c.f77245a = context;
        this.seon = c20652c.m56780a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C20652c m100417b() {
        C20652c c20652c = new C20652c();
        c20652c.f77246b = new C20363j(27);
        return c20652c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final Object m100423h(String str, InterfaceC30057d<? super String> interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        C20652c c20652c = (C20652c) this.seonBuilderFactory.invoke();
        c20652c.f77245a = this.context;
        c20652c.f77247c = str;
        C20661f c20661fM56780a = c20652c.m56780a();
        c20661fM56780a.f77292a.m56821e(c20661fM56780a.f77295d, new a(c3033m), Boolean.FALSE);
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final Object m100424i(String str, InterfaceC30057d<? super String> interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        C20661f c20661f = (C20661f) this.seon;
        c20661f.getClass();
        c20661f.f77295d = str.replaceAll("[^a-zA-Z0-9-._~]", "");
        InterfaceC20649b interfaceC20649b = this.seon;
        C20661f c20661f2 = (C20661f) interfaceC20649b;
        c20661f2.f77292a.m56821e(c20661f2.f77295d, new b(c3033m), Boolean.FALSE);
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r8 == r1) goto L31;
     */
    @l83.InterfaceC23457c
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m100425j(q83.InterfaceC30057d<? super java.lang.String> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof s82.C32266a.c
            if (r0 == 0) goto L13
            r0 = r8
            s82.a$c r0 = (s82.C32266a.c) r0
            int r1 = r0.f133550z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133550z = r1
            goto L18
        L13:
            s82.a$c r0 = new s82.a$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f133548x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f133550z
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r0 = r0.f133547w
            java.lang.String r0 = (java.lang.String) r0
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            goto L64
        L30:
            r8 = move-exception
            goto L72
        L32:
            r8 = move-exception
            goto L7c
        L34:
            r8 = move-exception
            goto L7d
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3e:
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            goto L50
        L42:
            p505ts.AbstractC34132o.m107864I(r8)
            i92.c r8 = r7.installationUuidProvider     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            r0.f133550z = r4     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            java.lang.Object r8 = r8.m52601f(r0)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            if (r8 != r1) goto L50
            goto L63
        L50:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            s82.a$d r2 = new s82.a$d     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            r2.<init>(r8, r6)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            r0.f133547w = r6     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            r0.f133550z = r3     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            r3 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r8 = bc3.AbstractC3028k2.m8748b(r3, r2, r0)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            if (r8 != 0) goto L71
            tr2.n r0 = r7.logger     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            java.lang.String r1 = "Seon fingerprint generation returned null"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r5]     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            r0.mo85222m(r1, r2)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
        L71:
            return r8
        L72:
            tr2.n r0 = r7.logger
            java.lang.String r1 = "Failed to generate Seon fingerprint"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r5]
            r0.mo85230v(r1, r8, r2)
            goto L86
        L7c:
            throw r8
        L7d:
            tr2.n r0 = r7.logger
            java.lang.String r1 = "Seon fingerprint generation timed out"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r5]
            r0.mo85230v(r1, r8, r2)
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s82.C32266a.m100425j(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m100426k(InterfaceC30057d<? super String> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f133557z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f133557z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM8773r = eVar.f133555x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f133557z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8773r);
                eVar.f133554w = 0;
                eVar.f133557z = 1;
                C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(eVar));
                c3033m.m8774s();
                ((C20661f) this.seon).m56799d(new f(c3033m));
                objM8773r = c3033m.m8773r();
                if (objM8773r == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8773r);
            }
            return (String) objM8773r;
        } catch (BehaviouralMonitoringException e5) {
            this.logger.mo85230v("Failed to stop Seon behaviour monitoring", e5, new AbstractC30556a.a[0]);
            return null;
        } catch (CancellationException e13) {
            this.logger.mo85230v("Seon getSeonFingerprintWithMonitoring cancelled", e13, new AbstractC30556a.a[0]);
            throw e13;
        } catch (Exception e14) {
            this.logger.mo85230v("Unexpected error stopping Seon behaviour monitoring", e14, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m100427l(q83.InterfaceC30057d<? super java.lang.String> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof s82.C32266a.g
            if (r0 == 0) goto L13
            r0 = r8
            s82.a$g r0 = (s82.C32266a.g) r0
            int r1 = r0.f133562z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133562z = r1
            goto L18
        L13:
            s82.a$g r0 = new s82.a$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f133560x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f133562z
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r0 = r0.f133559w
            java.lang.String r0 = (java.lang.String) r0
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            goto L64
        L30:
            r8 = move-exception
            goto L72
        L32:
            r8 = move-exception
            goto L7c
        L34:
            r8 = move-exception
            goto L7d
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3e:
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            goto L50
        L42:
            p505ts.AbstractC34132o.m107864I(r8)
            i92.c r8 = r7.installationUuidProvider     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            r0.f133562z = r4     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            java.lang.Object r8 = r8.m52601f(r0)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            if (r8 != r1) goto L50
            goto L63
        L50:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            s82.a$h r2 = new s82.a$h     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            r2.<init>(r8, r6)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            r0.f133559w = r6     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            r0.f133562z = r3     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            r3 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r8 = bc3.AbstractC3028k2.m8748b(r3, r2, r0)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            if (r8 != 0) goto L71
            tr2.n r0 = r7.logger     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            java.lang.String r1 = "Seon fingerprint generation returned null"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r5]     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
            r0.mo85222m(r1, r2)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L32 kotlinx.coroutines.TimeoutCancellationException -> L34
        L71:
            return r8
        L72:
            tr2.n r0 = r7.logger
            java.lang.String r1 = "Failed to generate Seon fingerprint"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r5]
            r0.mo85230v(r1, r8, r2)
            goto L86
        L7c:
            throw r8
        L7d:
            tr2.n r0 = r7.logger
            java.lang.String r1 = "Seon fingerprint generation timed out"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r5]
            r0.mo85230v(r1, r8, r2)
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s82.C32266a.m100427l(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m100428m(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        i iVar;
        InterfaceC20649b interfaceC20649b;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f133569z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f133569z = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object obj = iVar.f133567x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f133569z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC20649b interfaceC20649b2 = this.seon;
                C18258c c18258c = this.installationUuidProvider;
                iVar.f133566w = interfaceC20649b2;
                iVar.f133569z = 1;
                Object objM52601f = c18258c.m52601f(iVar);
                if (objM52601f == enumC31071a) {
                    return enumC31071a;
                }
                interfaceC20649b = interfaceC20649b2;
                obj = objM52601f;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC20649b = (InterfaceC20649b) iVar.f133566w;
                AbstractC34132o.m107864I(obj);
            }
            C20661f c20661f = (C20661f) interfaceC20649b;
            c20661f.getClass();
            c20661f.f77295d = ((String) obj).replaceAll("[^a-zA-Z0-9-._~]", "");
            ((C20661f) this.seon).m56798c();
        } catch (BehaviouralMonitoringException e5) {
            this.logger.mo85230v("Failed to start Seon behaviour monitoring", e5, new AbstractC30556a.a[0]);
        } catch (CancellationException e13) {
            this.logger.mo85230v("Seon startMonitoring cancelled", e13, new AbstractC30556a.a[0]);
            throw e13;
        } catch (Exception e14) {
            this.logger.mo85230v("Unexpected error starting Seon behaviour monitoring", e14, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C32266a(Context context, C18258c c18258c, InterfaceC34116n interfaceC34116n, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, c18258c, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SeonManager") : interfaceC34116n, (i13 & 8) != 0 ? new C32223d(1) : interfaceC4339a);
    }
}
