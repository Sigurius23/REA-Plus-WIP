package le1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.education.domain.EducationApi;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: le1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lle1/c;", "", "Ltr2/n;", "logger", "Lcom/whoop/education/domain/EducationApi;", "api", "", "timeZone", "<init>", "(Ltr2/n;Lcom/whoop/education/domain/EducationApi;Ljava/lang/String;)V", "Lle1/b;", "d", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lle1/a;", "upstream", "e", "(Lec3/l;)Lec3/l;", "a", "Ltr2/n;", "b", "Lcom/whoop/education/domain/EducationApi;", "c", "Ljava/lang/String;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23876c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EducationApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String timeZone;

    /* JADX INFO: renamed from: le1.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.education.domain.community.CommunityEducationCarouselInteractor", m100430f = "CommunityEducationCarouselInteractor.kt", m100431l = {29}, m100432m = "getCommunityEducationCarousel", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f94401w;

        /* JADX INFO: renamed from: y */
        int f94403y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f94401w = obj;
            this.f94403y |= Integer.MIN_VALUE;
            return C23876c.this.m70150d(this);
        }
    }

    /* JADX INFO: renamed from: le1.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.education.domain.community.CommunityEducationCarouselInteractor$getCommunityEducationCarousel$2", m100430f = "CommunityEducationCarouselInteractor.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f94404w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C23876c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f94404w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            EducationApi educationApi = C23876c.this.api;
            String str = C23876c.this.timeZone;
            this.f94404w = 1;
            Object objM21354a = EducationApi.m21354a(educationApi, str, null, this, 2, null);
            return objM21354a == enumC31071a ? enumC31071a : objM21354a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ArticleTileCarouselModel> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: le1.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.education.domain.community.CommunityEducationCarouselInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CommunityEducationCarouselInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f94406w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f94407x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f94408y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C23876c f94409z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C23876c c23876c) {
            super(3, interfaceC30057d);
            this.f94409z = c23876c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC23874a interfaceC23874a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f94409z);
            cVar.f94407x = interfaceC13062m;
            cVar.f94408y = interfaceC23874a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f94406w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f94407x;
                C13084s1 c13084s1 = new C13084s1(new d((InterfaceC23874a) this.f94408y, this.f94409z, null));
                this.f94407x = null;
                this.f94408y = null;
                this.f94406w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC23874a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: le1.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.education.domain.community.CommunityEducationCarouselInteractor$interact$1$1", m100430f = "CommunityEducationCarouselInteractor.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER, C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lle1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C23876c f94410E;

        /* JADX INFO: renamed from: w */
        Object f94411w;

        /* JADX INFO: renamed from: x */
        int f94412x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f94413y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23874a f94414z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC23874a interfaceC23874a, C23876c c23876c, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f94414z = interfaceC23874a;
            this.f94410E = c23876c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f94414z, this.f94410E, interfaceC30057d);
            dVar.f94413y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f94413y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f94412x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L4a
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f94411w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3d
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                le1.a r7 = r6.f94414z
                boolean r7 = r7 instanceof le1.InterfaceC23874a.a
                if (r7 == 0) goto L4d
                le1.c r7 = r6.f94410E
                r6.f94413y = r5
                r6.f94411w = r0
                r6.f94412x = r4
                java.lang.Object r7 = le1.C23876c.m70148b(r7, r6)
                if (r7 != r1) goto L3d
                goto L49
            L3d:
                r6.f94413y = r5
                r6.f94411w = r5
                r6.f94412x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L4a
            L49:
                return r1
            L4a:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            L4d:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: le1.C23876c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C23876c(InterfaceC34116n logger, EducationApi api, String timeZone) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(timeZone, "timeZone");
        this.logger = logger;
        this.api = api;
        this.timeZone = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public final Object m70150d(InterfaceC30057d<? super InterfaceC23875b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f94403y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f94403y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f94401w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f94403y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f94403y = 1;
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
            return new InterfaceC23875b.b((ArticleTileCarouselModel) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC23875b.a.f94395a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m70151e(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }
}
