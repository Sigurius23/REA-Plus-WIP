package vg0;

import c93.InterfaceC4351m;
import com.whoop.p057ai.chat.api.AiChatApi;
import com.whoop.p057ai.chat.api.CommitRecommendationRequestBody;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: vg0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lvg0/j;", "Lod1/g;", "Lvg0/i;", "Lvg0/k;", "Lcom/whoop/ai/chat/api/AiChatApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/ai/chat/api/AiChatApi;", "b", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35994j implements InterfaceC27844g<C35992i, AbstractC35996k> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiChatApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vg0.j$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.CommitRecommendationInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CommitRecommendationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f153420w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153421x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153422y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35994j f153423z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C35994j c35994j) {
            super(3, interfaceC30057d);
            this.f153423z = c35994j;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C35992i c35992i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f153423z);
            aVar.f153421x = interfaceC13062m;
            aVar.f153422y = c35992i;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153420w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153421x;
                C13084s1 c13084s1 = new C13084s1(new b((C35992i) this.f153422y, this.f153423z, null));
                this.f153421x = null;
                this.f153422y = null;
                this.f153420w = 1;
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
            return invoke((InterfaceC13062m) obj, (C35992i) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vg0.j$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.CommitRecommendationInteractor$interact$1$1", m100430f = "CommitRecommendationInteractor.kt", m100431l = {45, 50, 54, 61, 71, 74}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvg0/k;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C35992i f153424E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C35994j f153425F;

        /* JADX INFO: renamed from: w */
        Object f153426w;

        /* JADX INFO: renamed from: x */
        Object f153427x;

        /* JADX INFO: renamed from: y */
        int f153428y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f153429z;

        /* JADX INFO: renamed from: vg0.j$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.CommitRecommendationInteractor$interact$1$1$response$1", m100430f = "CommitRecommendationInteractor.kt", m100431l = {62}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f153430w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35994j f153431x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C35992i f153432y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ CommitRecommendationRequestBody f153433z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C35994j c35994j, C35992i c35992i, CommitRecommendationRequestBody commitRecommendationRequestBody, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f153431x = c35994j;
                this.f153432y = c35992i;
                this.f153433z = commitRecommendationRequestBody;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f153431x, this.f153432y, this.f153433z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f153430w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiChatApi aiChatApi = this.f153431x.api;
                String fingerprint = this.f153432y.getFingerprint();
                String recommendationId = this.f153432y.getRecommendationId();
                CommitRecommendationRequestBody commitRecommendationRequestBody = this.f153433z;
                this.f153430w = 1;
                Object objCommitRecommendation = aiChatApi.commitRecommendation(fingerprint, recommendationId, commitRecommendationRequestBody, this);
                return objCommitRecommendation == enumC31071a ? enumC31071a : objCommitRecommendation;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C35992i c35992i, C35994j c35994j, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153424E = c35992i;
            this.f153425F = c35994j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f153424E, this.f153425F, interfaceC30057d);
            bVar.f153429z = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[PHI: r11 r15
          0x00c2: PHI (r11v2 vg0.j$b) = (r11v1 vg0.j$b), (r11v3 vg0.j$b) binds: [B:27:0x00bf, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x00c2: PHI (r15v16 java.lang.Object) = (r15v15 java.lang.Object), (r15v0 java.lang.Object) binds: [B:27:0x00bf, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:34:0x00da  */
        /* JADX WARN: Code duplicated, block: B:36:0x00de  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00f9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        
            if (r0.emit(r15, r14) == r1) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
        
            if (r0.emit(r15, r14) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vg0.C35994j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C35994j(AiChatApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C35994j(AiChatApi aiChatApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiChatApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CommitRecommendationInteractor") : interfaceC34116n);
    }
}
