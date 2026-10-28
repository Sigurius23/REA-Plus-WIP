package p739ui0;

import bc3.C3033m;
import bc3.InterfaceC3025k;
import com.whoop.whoopaction.domain.models.PermissionType;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import m32.C25010f;
import m32.InterfaceC25005a;
import m32.InterfaceC25007c;
import p236j.AbstractC21065d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pj1.C29298b;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ui0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010(¨\u0006*"}, m65681d2 = {"Lui0/l;", "", "Lj/d;", "", "", "healthConnectPermissionsLauncher", "Lm32/a;", "permissionChecker", "Lm32/f;", "pushPermissionValidator", "Lm32/c;", "pushPermissionHelper", "Lpj1/b;", "healthConnectRepository", "Ltr2/n;", "logger", "<init>", "(Lj/d;Lm32/a;Lm32/f;Lm32/c;Lpj1/b;Ltr2/n;)V", "Ll83/a0;", "i", "(Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/whoopaction/domain/models/PermissionType;", "permission", "g", "(Lcom/whoop/whoopaction/domain/models/PermissionType;Lq83/d;)Ljava/lang/Object;", "f", "()V", "a", "Lj/d;", "b", "Lm32/a;", "c", "Lm32/f;", "d", "Lm32/c;", "e", "Lpj1/b;", "Ltr2/n;", "Lbc3/k;", "Lbc3/k;", "healthConnectPermissionsContinuation", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35010l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC21065d healthConnectPermissionsLauncher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25005a permissionChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C25010f pushPermissionValidator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25007c pushPermissionHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C29298b healthConnectRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private InterfaceC3025k healthConnectPermissionsContinuation;

    /* JADX INFO: renamed from: ui0.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f148098a;

        static {
            int[] iArr = new int[PermissionType.values().length];
            try {
                iArr[PermissionType.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionType.HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f148098a = iArr;
        }
    }

    /* JADX INFO: renamed from: ui0.l$b */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericPermissionRequester", m100430f = "GenericPermissionRequester.kt", m100431l = {50, 66}, m100432m = "requestHealthConnectPermissionIfEligible", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f148099w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f148100x;

        /* JADX INFO: renamed from: z */
        int f148102z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148100x = obj;
            this.f148102z |= Integer.MIN_VALUE;
            return C35010l.this.m110560h(this);
        }
    }

    /* JADX INFO: renamed from: ui0.l$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {
        public c() {
        }

        /* JADX INFO: renamed from: a */
        public final void m110564a(Throwable th3) {
            C35010l.this.logger.mo85228t("Health Connect permission request cancelled", new AbstractC30556a.a[0]);
            C35010l.this.healthConnectPermissionsContinuation = null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m110564a((Throwable) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ui0.l$d */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.view.GenericPermissionRequester", m100430f = "GenericPermissionRequester.kt", m100431l = {42, 43}, m100432m = "requestPushPermissionIfEligible", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        boolean f148104w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f148105x;

        /* JADX INFO: renamed from: z */
        int f148107z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148105x = obj;
            this.f148107z |= Integer.MIN_VALUE;
            return C35010l.this.m110561i(this);
        }
    }

    public C35010l(AbstractC21065d healthConnectPermissionsLauncher, InterfaceC25005a permissionChecker, C25010f pushPermissionValidator, InterfaceC25007c pushPermissionHelper, C29298b healthConnectRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(healthConnectPermissionsLauncher, "healthConnectPermissionsLauncher");
        AbstractC22676k.m65750j(permissionChecker, "permissionChecker");
        AbstractC22676k.m65750j(pushPermissionValidator, "pushPermissionValidator");
        AbstractC22676k.m65750j(pushPermissionHelper, "pushPermissionHelper");
        AbstractC22676k.m65750j(healthConnectRepository, "healthConnectRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.healthConnectPermissionsLauncher = healthConnectPermissionsLauncher;
        this.permissionChecker = permissionChecker;
        this.pushPermissionValidator = pushPermissionValidator;
        this.pushPermissionHelper = pushPermissionHelper;
        this.healthConnectRepository = healthConnectRepository;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m110560h(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f148102z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f148102z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM88925f = bVar.f148100x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f148102z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM88925f);
            if (!this.healthConnectRepository.m88926g()) {
                C29298b c29298b = this.healthConnectRepository;
                bVar.f148102z = 1;
                objM88925f = c29298b.m88925f(bVar);
                if (objM88925f != enumC31071a) {
                }
                return enumC31071a;
            }
            return c23454a0;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM88925f);
            return c23454a0;
        }
        AbstractC34132o.m107864I(objM88925f);
        if (!((Boolean) objM88925f).booleanValue()) {
            if (this.healthConnectPermissionsContinuation != null) {
                this.logger.mo85228t("Health Connect permission request already in flight; ignoring", new AbstractC30556a.a[0]);
                return c23454a0;
            }
            bVar.f148099w = 0;
            bVar.f148102z = 2;
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(bVar));
            c3033m.m8774s();
            this.healthConnectPermissionsContinuation = c3033m;
            this.healthConnectPermissionsLauncher.mo4052a(C29298b.INSTANCE.m88936a(), null);
            c3033m.m8776u(new c());
            if (c3033m.m8773r() == enumC31071a) {
                return enumC31071a;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110561i(q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p739ui0.C35010l.d
            if (r0 == 0) goto L13
            r0 = r7
            ui0.l$d r0 = (p739ui0.C35010l.d) r0
            int r1 = r0.f148107z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f148107z = r1
            goto L18
        L13:
            ui0.l$d r0 = new ui0.l$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f148105x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f148107z
            l83.a0 r3 = l83.C23454a0.f92919a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            p505ts.AbstractC34132o.m107864I(r7)
            goto L6a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            boolean r2 = r0.f148104w
            p505ts.AbstractC34132o.m107864I(r7)
            goto L54
        L3a:
            p505ts.AbstractC34132o.m107864I(r7)
            m32.a r7 = r6.permissionChecker
            java.lang.String r2 = "android.permission.POST_NOTIFICATIONS"
            boolean r2 = r7.mo73346a(r2)
            if (r2 != 0) goto L5d
            m32.f r7 = r6.pushPermissionValidator
            r0.f148104w = r2
            r0.f148107z = r5
            java.lang.Object r7 = r7.m73363b(r0)
            if (r7 != r1) goto L54
            goto L69
        L54:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5d
            return r3
        L5d:
            m32.c r7 = r6.pushPermissionHelper
            r0.f148104w = r2
            r0.f148107z = r4
            java.lang.Object r7 = r7.mo73348x(r5, r0)
            if (r7 != r1) goto L6a
        L69:
            return r1
        L6a:
            m32.e r7 = (m32.EnumC25009e) r7
            tr2.n r0 = r6.logger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Push permission result: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r1 = 0
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
            r0.mo85228t(r7, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p739ui0.C35010l.m110561i(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    public final void m110562f() {
        InterfaceC3025k interfaceC3025k = this.healthConnectPermissionsContinuation;
        if (interfaceC3025k != null) {
            this.healthConnectPermissionsContinuation = null;
            if (interfaceC3025k.isActive()) {
                interfaceC3025k.resumeWith(C23454a0.f92919a);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final Object m110563g(PermissionType permissionType, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        int i13 = a.f148098a[permissionType.ordinal()];
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 1) {
            Object objM110561i = m110561i(interfaceC30057d);
            return objM110561i == EnumC31071a.f128113w ? objM110561i : c23454a0;
        }
        if (i13 == 2) {
            Object objM110560h = m110560h(interfaceC30057d);
            return objM110560h == EnumC31071a.f128113w ? objM110560h : c23454a0;
        }
        if (i13 == 3) {
            return c23454a0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C35010l(AbstractC21065d abstractC21065d, InterfaceC25005a interfaceC25005a, C25010f c25010f, InterfaceC25007c interfaceC25007c, C29298b c29298b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC21065d, interfaceC25005a, c25010f, interfaceC25007c, c29298b, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("GenericPermissionRequester") : interfaceC34116n);
    }
}
