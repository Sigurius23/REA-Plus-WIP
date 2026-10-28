package nv0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.contentsearch.domain.ContentSearchApi;
import com.whoop.contentsearch.domain.models.ContentSearchResponse;
import com.whoop.contentsearch.domain.models.ContentSearchScreen;
import com.whoop.design.models.items.ListItemTileModel;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.HashSet;
import l83.C23454a0;
import m83.AbstractC25265s;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: nv0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0012\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001a\u001a\u0004\u0018\u00010\b*\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#J!\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lnv0/c;", "", "Lcom/whoop/contentsearch/domain/ContentSearchApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/contentsearch/domain/ContentSearchApi;Ltr2/n;)V", "", "searchQuery", "Lnv0/b$c;", "existingDomainState", "type", "selectedFilter", "Lnv0/b;", "l", "(Ljava/lang/String;Lnv0/b$c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "nextToken", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "newText", "domainState", "p", "(Ljava/lang/String;Lnv0/b;)Lnv0/b;", "filter", "i", "m", "(Lnv0/b;)Ljava/lang/String;", "Lnv0/c$a;", "domainStateAcc", "o", "(Lnv0/c$a;Ljava/lang/String;)Lnv0/c$a;", "Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;", "response", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;Lnv0/b$c;)Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;", "Lec3/l;", "Lnv0/a;", "upstream", "n", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/contentsearch/domain/ContentSearchApi;", "b", "Ltr2/n;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27165c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ContentSearchApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: nv0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.contentsearch.domain.ContentSearchInteractor", m100430f = "ContentSearchInteractor.kt", m100431l = {90}, m100432m = "getContent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f108685F;

        /* JADX INFO: renamed from: w */
        Object f108686w;

        /* JADX INFO: renamed from: x */
        Object f108687x;

        /* JADX INFO: renamed from: y */
        Object f108688y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f108689z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f108689z = obj;
            this.f108685F |= Integer.MIN_VALUE;
            return C27165c.this.m81675j(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: nv0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.contentsearch.domain.ContentSearchInteractor$getContent$2", m100430f = "ContentSearchInteractor.kt", m100431l = {91}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f108690E;

        /* JADX INFO: renamed from: w */
        int f108691w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f108693y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f108694z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f108693y = str;
            this.f108694z = str2;
            this.f108690E = str3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C27165c.this.new c(this.f108693y, this.f108694z, this.f108690E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108691w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ContentSearchApi contentSearchApi = C27165c.this.api;
            String str = this.f108693y;
            String str2 = this.f108694z;
            String str3 = this.f108690E;
            this.f108691w = 1;
            Object objM19647a = ContentSearchApi.m19647a(contentSearchApi, str, str2, 0, str3, this, 4, null);
            return objM19647a == enumC31071a ? enumC31071a : objM19647a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ContentSearchResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: nv0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.contentsearch.domain.ContentSearchInteractor", m100430f = "ContentSearchInteractor.kt", m100431l = {73}, m100432m = "getNextPage", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f108695E;

        /* JADX INFO: renamed from: G */
        int f108697G;

        /* JADX INFO: renamed from: w */
        Object f108698w;

        /* JADX INFO: renamed from: x */
        Object f108699x;

        /* JADX INFO: renamed from: y */
        Object f108700y;

        /* JADX INFO: renamed from: z */
        Object f108701z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f108695E = obj;
            this.f108697G |= Integer.MIN_VALUE;
            return C27165c.this.m81677l(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: nv0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.contentsearch.domain.ContentSearchInteractor$getNextPage$2", m100430f = "ContentSearchInteractor.kt", m100431l = {74}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f108702E;

        /* JADX INFO: renamed from: w */
        int f108703w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f108705y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC27164b.c f108706z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, AbstractC27164b.c cVar, String str2, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f108705y = str;
            this.f108706z = cVar;
            this.f108702E = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C27165c.this.new e(this.f108705y, this.f108706z, this.f108702E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108703w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ContentSearchApi contentSearchApi = C27165c.this.api;
            String str = this.f108705y;
            String strM81678m = C27165c.this.m81678m(this.f108706z);
            String str2 = this.f108702E;
            this.f108703w = 1;
            Object objM19647a = ContentSearchApi.m19647a(contentSearchApi, str, strM81678m, 0, str2, this, 4, null);
            return objM19647a == enumC31071a ? enumC31071a : objM19647a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ContentSearchResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: nv0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.contentsearch.domain.ContentSearchInteractor$interact$1", m100430f = "ContentSearchInteractor.kt", m100431l = {16, C1533u.MAX_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnv0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C27165c f108707E;

        /* JADX INFO: renamed from: w */
        Object f108708w;

        /* JADX INFO: renamed from: x */
        int f108709x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f108710y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f108711z;

        /* JADX INFO: renamed from: nv0.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f108712w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27165c f108713x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f108714y;

            /* JADX INFO: renamed from: nv0.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.contentsearch.domain.ContentSearchInteractor$interact$1$1", m100430f = "ContentSearchInteractor.kt", m100431l = {21, 37, 40, 64}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42100a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                int f108715E;

                /* JADX INFO: renamed from: F */
                /* synthetic */ Object f108716F;

                /* JADX INFO: renamed from: G */
                final /* synthetic */ a<T> f108717G;

                /* JADX INFO: renamed from: H */
                int f108718H;

                /* JADX INFO: renamed from: w */
                Object f108719w;

                /* JADX INFO: renamed from: x */
                Object f108720x;

                /* JADX INFO: renamed from: y */
                Object f108721y;

                /* JADX INFO: renamed from: z */
                Object f108722z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C42100a(a<? super T> aVar, InterfaceC30057d<? super C42100a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f108717G = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108716F = obj;
                    this.f108718H |= Integer.MIN_VALUE;
                    return this.f108717G.emit(null, this);
                }
            }

            public a(C22669g0 c22669g0, C27165c c27165c, InterfaceC13062m interfaceC13062m) {
                this.f108712w = c22669g0;
                this.f108713x = c27165c;
                this.f108714y = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:42:0x013d  */
            /* JADX WARN: Code duplicated, block: B:43:0x0141  */
            /* JADX WARN: Code duplicated, block: B:45:0x0144  */
            /* JADX WARN: Code duplicated, block: B:48:0x017a  */
            /* JADX WARN: Code duplicated, block: B:51:0x018b A[PHI: r1 r8
              0x018b: PHI (r1v33 kotlin.jvm.internal.g0) = (r1v29 kotlin.jvm.internal.g0), (r1v37 kotlin.jvm.internal.g0) binds: [B:44:0x0142, B:50:0x0189] A[DONT_GENERATE, DONT_INLINE]
              0x018b: PHI (r8v4 nv0.c$f$a$a) = (r8v0 nv0.c$f$a$a), (r8v5 nv0.c$f$a$a) binds: [B:44:0x0142, B:50:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:52:0x018d  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0207, code lost:
            
                if (r1.emit(r2, r8) == r3) goto L62;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(nv0.AbstractC27163a r22, q83.InterfaceC30057d<? super l83.C23454a0> r23) {
                /*
                    Method dump skipped, instruction units count: 531
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: nv0.C27165c.f.a.emit(nv0.a, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC13058l interfaceC13058l, C27165c c27165c, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108711z = interfaceC13058l;
            this.f108707E = c27165c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f108711z, this.f108707E, interfaceC30057d);
            fVar.f108710y = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        
            if (r12.collect(r4, r11) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f108710y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r11.f108709x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                java.lang.Object r0 = r11.f108708w
                kotlin.jvm.internal.g0 r0 = (p715kotlin.jvm.internal.C22669g0) r0
                p505ts.AbstractC34132o.m107864I(r12)
                goto L60
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L20:
                java.lang.Object r2 = r11.f108708w
                kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
                p505ts.AbstractC34132o.m107864I(r12)
                goto L49
            L28:
                kotlin.jvm.internal.g0 r2 = p088dc.AbstractC11895b.m32004w(r12)
                nv0.c$a r5 = new nv0.c$a
                r9 = 7
                r10 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r2.f89336w = r5
                nv0.b r12 = r5.getDomainState()
                r11.f108710y = r0
                r11.f108708w = r2
                r11.f108709x = r4
                java.lang.Object r12 = r0.emit(r12, r11)
                if (r12 != r1) goto L49
                goto L5f
            L49:
                ec3.l r12 = r11.f108711z
                nv0.c$f$a r4 = new nv0.c$f$a
                nv0.c r5 = r11.f108707E
                r4.<init>(r2, r5, r0)
                r0 = 0
                r11.f108710y = r0
                r11.f108708w = r0
                r11.f108709x = r3
                java.lang.Object r12 = r12.collect(r4, r11)
                if (r12 != r1) goto L60
            L5f:
                return r1
            L60:
                l83.a0 r12 = l83.C23454a0.f92919a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: nv0.C27165c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C27165c(ContentSearchApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: h */
    private final ContentSearchResponse m81673h(ContentSearchResponse response, AbstractC27164b.c existingDomainState) {
        ContentSearchScreen contentSearchScreen = (ContentSearchScreen) AbstractC25265s.m74096F0(response.getRecords());
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(((ContentSearchScreen) AbstractC25265s.m74096F0(existingDomainState.getData().getRecords())).getTiles(), ((ContentSearchScreen) AbstractC25265s.m74096F0(response.getRecords())).getTiles());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM74129g1) {
            if (hashSet.add(((ListItemTileModel) obj).getTileTitle())) {
                arrayList.add(obj);
            }
        }
        return ContentSearchResponse.copy$default(response, AbstractC37056f.m118958J(ContentSearchScreen.copy$default(contentSearchScreen, null, null, null, null, null, arrayList, 31, null)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final AbstractC27164b m81674i(String filter, AbstractC27164b domainState) {
        return domainState instanceof AbstractC27164b.c ? AbstractC27164b.c.m81659b((AbstractC27164b.c) domainState, null, filter, null, null, true, 13, null) : domainState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: j */
    public final Object m81675j(String str, String str2, String str3, InterfaceC30057d<? super AbstractC27164b> interfaceC30057d) {
        b bVar;
        String str4;
        String str5;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f108685F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f108685F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f108689z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f108685F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(str, str2, str3, null);
            bVar2.f108686w = str;
            bVar2.f108687x = null;
            bVar2.f108688y = str3;
            bVar2.f108685F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch Content Search data", cVar, bVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            str4 = str;
            str5 = str3;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str6 = (String) bVar2.f108688y;
            String str7 = (String) bVar2.f108686w;
            AbstractC34132o.m107864I(objM108729b);
            str4 = str7;
            str5 = str6;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC27164b.c((ContentSearchResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), str5, EnumC27166d.IDLE, str4, false);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC27164b.a.f108672a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m81676k(C27165c c27165c, String str, String str2, String str3, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        return c27165c.m81675j(str, str2, str3, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: l */
    public final Object m81677l(String str, AbstractC27164b.c cVar, String str2, String str3, InterfaceC30057d<? super AbstractC27164b> interfaceC30057d) {
        d dVar;
        String str4;
        AbstractC27164b.c cVar2;
        String str5;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f108697G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f108697G = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f108695E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f108697G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(str, cVar, str2, null);
            dVar2.f108698w = str;
            dVar2.f108699x = cVar;
            dVar2.f108700y = null;
            dVar2.f108701z = str3;
            dVar2.f108697G = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to get next page of Content Search data", eVar, dVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            str4 = str;
            cVar2 = cVar;
            str5 = str3;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str6 = (String) dVar2.f108701z;
            AbstractC27164b.c cVar3 = (AbstractC27164b.c) dVar2.f108699x;
            String str7 = (String) dVar2.f108698w;
            AbstractC34132o.m107864I(objM108729b);
            cVar2 = cVar3;
            str4 = str7;
            str5 = str6;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC27164b.c(m81673h((ContentSearchResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), cVar2), str5, EnumC27166d.IDLE, str4, false, 16, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC27164b.c.m81659b(cVar2, null, null, EnumC27166d.FETCH_NEXT_PAGE_ERROR, null, false, 27, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final String m81678m(AbstractC27164b abstractC27164b) {
        ContentSearchResponse data;
        AbstractC27164b.c cVar = abstractC27164b instanceof AbstractC27164b.c ? (AbstractC27164b.c) abstractC27164b : null;
        if (cVar == null || (data = cVar.getData()) == null) {
            return null;
        }
        return data.getNextToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final a m81679o(a domainStateAcc, String searchQuery) {
        return domainStateAcc.getDomainState() instanceof AbstractC27164b.c ? a.m81682b(domainStateAcc, AbstractC27164b.c.m81659b((AbstractC27164b.c) domainStateAcc.getDomainState(), null, null, EnumC27166d.FETCHING_NEXT_PAGE, searchQuery, false, 19, null), searchQuery, null, 4, null) : domainStateAcc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC27164b m81680p(String newText, AbstractC27164b domainState) {
        return domainState instanceof AbstractC27164b.c ? AbstractC27164b.c.m81659b((AbstractC27164b.c) domainState, null, null, null, newText, false, 23, null) : domainState;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m81681n(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new f(upstream, this, null));
    }

    /* JADX INFO: renamed from: nv0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, m65681d2 = {"Lnv0/c$a;", "", "Lnv0/b;", "domainState", "", "searchQuery", "type", "<init>", "(Lnv0/b;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Lnv0/b;Ljava/lang/String;Ljava/lang/String;)Lnv0/c$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnv0/b;", "c", "()Lnv0/b;", "b", "Ljava/lang/String;", "d", "e", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC27164b domainState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String searchQuery;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String type;

        public a(AbstractC27164b domainState, String str, String type) {
            AbstractC22676k.m65750j(domainState, "domainState");
            AbstractC22676k.m65750j(type, "type");
            this.domainState = domainState;
            this.searchQuery = str;
            this.type = type;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m81682b(a aVar, AbstractC27164b abstractC27164b, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC27164b = aVar.domainState;
            }
            if ((i13 & 2) != 0) {
                str = aVar.searchQuery;
            }
            if ((i13 & 4) != 0) {
                str2 = aVar.type;
            }
            return aVar.m81683a(abstractC27164b, str, str2);
        }

        /* JADX INFO: renamed from: a */
        public final a m81683a(AbstractC27164b domainState, String searchQuery, String type) {
            AbstractC22676k.m65750j(domainState, "domainState");
            AbstractC22676k.m65750j(type, "type");
            return new a(domainState, searchQuery, type);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC27164b getDomainState() {
            return this.domainState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSearchQuery() {
            return this.searchQuery;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.domainState, aVar.domainState) && AbstractC22676k.m65745e(this.searchQuery, aVar.searchQuery) && AbstractC22676k.m65745e(this.type, aVar.type);
        }

        public int hashCode() {
            int iHashCode = this.domainState.hashCode() * 31;
            String str = this.searchQuery;
            return this.type.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            AbstractC27164b abstractC27164b = this.domainState;
            String str = this.searchQuery;
            String str2 = this.type;
            StringBuilder sb4 = new StringBuilder("DomainStateAccumulator(domainState=");
            sb4.append(abstractC27164b);
            sb4.append(", searchQuery=");
            sb4.append(str);
            sb4.append(", type=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }

        public /* synthetic */ a(AbstractC27164b abstractC27164b, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC27164b.b.f108673a : abstractC27164b, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "ALL" : str2);
        }
    }
}
