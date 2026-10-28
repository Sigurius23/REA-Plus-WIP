package la2;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.settings.accountheader.api.NativeAccountHeaderApi;
import com.whoop.settings.accountheader.model.MyAccountHeaderModel;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ha2.C17057a;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: la2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lla2/b;", "Lod1/g;", "Lla2/a;", "Lla2/c;", "Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;", "api", "Lha2/a;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;Lha2/a;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;", "b", "Lha2/a;", "c", "Ltr2/n;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23554b implements InterfaceC27844g<AbstractC23553a, AbstractC23555c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final NativeAccountHeaderApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17057a analyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: la2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f93407w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23554b f93408x;

        /* JADX INFO: renamed from: la2.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41941a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f93409w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C23554b f93410x;

            /* JADX INFO: renamed from: la2.b$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.accountheader.domain.myaccountheader.MyAccountHeaderInteractor$interact$$inlined$map$1$2", m100430f = "MyAccountHeaderInteractor.kt", m100431l = {52, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41942a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f93411E;

                /* JADX INFO: renamed from: F */
                Object f93412F;

                /* JADX INFO: renamed from: G */
                Object f93413G;

                /* JADX INFO: renamed from: H */
                Object f93414H;

                /* JADX INFO: renamed from: I */
                Object f93415I;

                /* JADX INFO: renamed from: J */
                Object f93416J;

                /* JADX INFO: renamed from: K */
                int f93417K;

                /* JADX INFO: renamed from: L */
                int f93418L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f93419w;

                /* JADX INFO: renamed from: x */
                int f93420x;

                /* JADX INFO: renamed from: y */
                Object f93421y;

                public C41942a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f93419w = obj;
                    this.f93420x |= Integer.MIN_VALUE;
                    return C41941a.this.emit(null, this);
                }
            }

            public C41941a(InterfaceC13062m interfaceC13062m, C23554b c23554b) {
                this.f93409w = interfaceC13062m;
                this.f93410x = c23554b;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
            
                if (r1.emit(r14, r6) == r0) goto L35;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                /*
                    Method dump skipped, instruction units count: 244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: la2.C23554b.a.C41941a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public a(InterfaceC13058l interfaceC13058l, C23554b c23554b) {
            this.f93407w = interfaceC13058l;
            this.f93408x = c23554b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f93407w.collect(new C41941a(interfaceC13062m, this.f93408x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: la2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.accountheader.domain.myaccountheader.MyAccountHeaderInteractor$interact$1$1", m100430f = "MyAccountHeaderInteractor.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f93423w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C23554b.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f93423w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            NativeAccountHeaderApi nativeAccountHeaderApi = C23554b.this.api;
            this.f93423w = 1;
            Object objFetchHeader = nativeAccountHeaderApi.fetchHeader(this);
            return objFetchHeader == enumC31071a ? enumC31071a : objFetchHeader;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MyAccountHeaderModel> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C23554b(NativeAccountHeaderApi api, C17057a analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }

    public /* synthetic */ C23554b(NativeAccountHeaderApi nativeAccountHeaderApi, C17057a c17057a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeAccountHeaderApi, c17057a, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MyAccountHeaderInteractor") : interfaceC34116n);
    }
}
