package il1;

import c93.InterfaceC4351m;
import com.whoop.home.domain.HomeApi;
import com.whoop.home.domain.models.DismissAlertTileRequestBody;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import l83.C23454a0;
import m83.AbstractC25265s;
import od1.InterfaceC27844g;
import p007a6.InterfaceC0422g;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ql1.C30472c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wm0.C37378a;

/* JADX INFO: renamed from: il1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lil1/e;", "Lod1/g;", "Lil1/d;", "Lil1/f;", "Lcom/whoop/home/domain/HomeApi;", "homeApi", "Lwm0/a;", "scopeCoordinator", "La6/g;", "Lf6/f;", "dataStore", "Lql1/c;", "dismissHelper", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/home/domain/HomeApi;Lwm0/a;La6/g;Lql1/c;Ljava/time/Clock;Ltr2/n;)V", "prevDomainState", "", "id", "g", "(Lil1/f;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lil1/f;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/home/domain/HomeApi;", "b", "Lwm0/a;", "c", "La6/g;", "d", "Lql1/c;", "e", "Ljava/time/Clock;", "f", "Ltr2/n;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18628e implements InterfaceC27844g<AbstractC18627d, C18629f> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    public static final int f72834h = 8;

    /* JADX INFO: renamed from: i */
    private static final C14132d f72835i = AbstractC15751g.m44441U("lowBatteryDismissId");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HomeApi homeApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C30472c dismissHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: il1.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lil1/e$a;", "", "<init>", "()V", "Lf6/d;", "", "PREF_KEY_LOW_BATTERY_DISMISS", "Lf6/d;", "a", "()Lf6/d;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C14132d m53915a() {
            return C18628e.f72835i;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: il1.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.DismissAlertInteractor", m100430f = "DismissAlertInteractor.kt", m100431l = {42, 45}, m100432m = "dismissAlertTile", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f72842E;

        /* JADX INFO: renamed from: w */
        Object f72843w;

        /* JADX INFO: renamed from: x */
        Object f72844x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f72845y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f72845y = obj;
            this.f72842E |= Integer.MIN_VALUE;
            return C18628e.this.m53913g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: il1.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.DismissAlertInteractor$dismissAlertTile$2", m100430f = "DismissAlertInteractor.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f72847w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f72849y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f72849y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C18628e.this.new c(this.f72849y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f72847w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HomeApi homeApi = C18628e.this.homeApi;
            DismissAlertTileRequestBody dismissAlertTileRequestBody = new DismissAlertTileRequestBody(this.f72849y);
            this.f72847w = 1;
            Object objDismissAlert = homeApi.dismissAlert(dismissAlertTileRequestBody, this);
            return objDismissAlert == enumC31071a ? enumC31071a : objDismissAlert;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: il1.e$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.DismissAlertInteractor", m100430f = "DismissAlertInteractor.kt", m100431l = {52}, m100432m = "dismissLowBatteryTile", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f72851F;

        /* JADX INFO: renamed from: w */
        Object f72852w;

        /* JADX INFO: renamed from: x */
        Object f72853x;

        /* JADX INFO: renamed from: y */
        Object f72854y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f72855z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f72855z = obj;
            this.f72851F |= Integer.MIN_VALUE;
            return C18628e.this.m53914h(null, this);
        }
    }

    /* JADX INFO: renamed from: il1.e$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.DismissAlertInteractor$dismissLowBatteryTile$2", m100430f = "DismissAlertInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f72856w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f72857x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f72858y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f72858y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f72858y, interfaceC30057d);
            eVar.f72857x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f72857x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f72856w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(C18628e.INSTANCE.m53915a(), this.f72858y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: il1.e$f */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.DismissAlertInteractor$interact$1", m100430f = "DismissAlertInteractor.kt", m100431l = {35, 37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lil1/f;", "state", "Lil1/d;", "action", "<anonymous>", "(Lil1/f;Lil1/d;)Lil1/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f72859w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f72860x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f72861y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C18629f c18629f, AbstractC18627d abstractC18627d, InterfaceC30057d<? super C18629f> interfaceC30057d) {
            f fVar = C18628e.this.new f(interfaceC30057d);
            fVar.f72860x = c18629f;
            fVar.f72861y = abstractC18627d;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            if (r7 == r2) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r7 == r2) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f72860x
                il1.f r0 = (il1.C18629f) r0
                java.lang.Object r1 = r6.f72861y
                il1.d r1 = (il1.AbstractC18627d) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r6.f72859w
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L24
                if (r3 == r5) goto L20
                if (r3 != r4) goto L18
                p505ts.AbstractC34132o.m107864I(r7)
                goto L69
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L41
            L24:
                p505ts.AbstractC34132o.m107864I(r7)
                boolean r7 = r1 instanceof il1.AbstractC18627d.a
                r3 = 0
                if (r7 == 0) goto L44
                il1.e r7 = il1.C18628e.this
                il1.d$a r1 = (il1.AbstractC18627d.a) r1
                java.lang.String r1 = r1.getId()
                r6.f72860x = r3
                r6.f72861y = r3
                r6.f72859w = r5
                java.lang.Object r7 = il1.C18628e.m53909c(r7, r0, r1, r6)
                if (r7 != r2) goto L41
                goto L68
            L41:
                il1.f r7 = (il1.C18629f) r7
                return r7
            L44:
                il1.d$b r7 = il1.AbstractC18627d.b.f72831a
                boolean r7 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r1, r7)
                if (r7 == 0) goto L52
                il1.f r7 = new il1.f
                r7.<init>(r3, r5, r3)
                return r7
            L52:
                il1.d$c r7 = il1.AbstractC18627d.c.f72832a
                boolean r7 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r1, r7)
                if (r7 == 0) goto L6c
                il1.e r7 = il1.C18628e.this
                r6.f72860x = r3
                r6.f72861y = r3
                r6.f72859w = r4
                java.lang.Object r7 = il1.C18628e.m53910d(r7, r0, r6)
                if (r7 != r2) goto L69
            L68:
                return r2
            L69:
                il1.f r7 = (il1.C18629f) r7
                return r7
            L6c:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C18628e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C18628e(HomeApi homeApi, C37378a scopeCoordinator, InterfaceC0422g dataStore, C30472c dismissHelper, Clock clock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(homeApi, "homeApi");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(dismissHelper, "dismissHelper");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.homeApi = homeApi;
        this.scopeCoordinator = scopeCoordinator;
        this.dataStore = dataStore;
        this.dismissHelper = dismissHelper;
        this.clock = clock;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m53913g(C18629f c18629f, String str, InterfaceC30057d<? super C18629f> interfaceC30057d) {
        b bVar;
        C18629f c18629f2;
        String str2;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f72842E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f72842E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f72845y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f72842E;
        if (i14 != 0) {
            if (i14 == 1) {
                str = (String) bVar2.f72844x;
                c18629f = (C18629f) bVar2.f72843w;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) bVar2.f72844x;
                c18629f2 = (C18629f) bVar2.f72843w;
                AbstractC34132o.m107864I(obj);
            }
            return new C18629f(AbstractC25265s.m74128f1(str2, c18629f2.m53917a()));
        }
        AbstractC34132o.m107864I(obj);
        if (str.length() == 0) {
            return c18629f;
        }
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        String strConcat = "failed to dismiss alert tile with id: ".concat(str);
        c cVar = new c(str, null);
        bVar2.f72843w = c18629f;
        bVar2.f72844x = str;
        bVar2.f72842E = 1;
        if (InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strConcat, cVar, bVar2, 2, null) != enumC31071a) {
        }
        return enumC31071a;
        C37378a c37378a = this.scopeCoordinator;
        bVar2.f72843w = c18629f;
        bVar2.f72844x = str;
        bVar2.f72842E = 2;
        if (c37378a.m119657b("home", bVar2) != enumC31071a) {
            String str3 = str;
            c18629f2 = c18629f;
            str2 = str3;
            return new C18629f(AbstractC25265s.m74128f1(str2, c18629f2.m53917a()));
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m53914h(C18629f c18629f, InterfaceC30057d<? super C18629f> interfaceC30057d) {
        d dVar;
        C18629f c18629f2;
        String str;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f72851F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f72851F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f72855z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f72851F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            String str2 = LocalDate.now(this.clock).format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
            InterfaceC0422g interfaceC0422g = this.dataStore;
            e eVar = new e(str2, null);
            dVar.f72852w = c18629f;
            dVar.f72853x = null;
            dVar.f72854y = str2;
            dVar.f72851F = 1;
            if (AbstractC17269i.m48861G(interfaceC0422g, eVar, dVar) == enumC31071a) {
                return enumC31071a;
            }
            c18629f2 = c18629f;
            str = str2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) dVar.f72854y;
            c18629f2 = (C18629f) dVar.f72852w;
            AbstractC34132o.m107864I(obj);
        }
        C30472c c30472c = this.dismissHelper;
        AbstractC22676k.m65747g(str);
        c30472c.m93245a(str);
        return c18629f2;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C18629f(null, 1, null), upstream, new f(null));
    }

    public /* synthetic */ C18628e(HomeApi homeApi, C37378a c37378a, InterfaceC0422g interfaceC0422g, C30472c c30472c, Clock clock, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(homeApi, c37378a, interfaceC0422g, c30472c, clock, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DismissAlertInteractor") : interfaceC34116n);
    }
}
