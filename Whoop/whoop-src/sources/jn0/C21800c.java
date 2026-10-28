package jn0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.challengedetails.domain.ChallengeDetailsApi;
import com.whoop.challengedetails.domain.models.ChallengeDetailsResponse;
import com.whoop.challengedetails.domain.models.JoinChallengeRequest;
import com.whoop.challengedetails.domain.models.JoinChallengeResponse;
import com.whoop.challengedetails.domain.models.JoinChallengeResponseStatus;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hn0.C17514a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.AbstractC28190p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: jn0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0001$B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0016\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Ljn0/c;", "", "Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;", "api", "Ltr2/n;", "logger", "Lhn0/a;", "analyticsHelper", "<init>", "(Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;Ltr2/n;Lhn0/a;)V", "Ljn0/c$a;", "challengeAcc", "Ljn0/b;", "prevDomainResult", "i", "(Ljn0/c$a;Ljn0/b;Lq83/d;)Ljava/lang/Object;", "m", "(Ljn0/b;)Ljn0/b;", "Lec3/m;", "Ljn0/a$b;", "action", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/m;Ljn0/a$b;Lq83/d;)Ljava/lang/Object;", "", "name", "l", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "k", "(Ljava/lang/String;Ljn0/b;Lq83/d;)Ljava/lang/Object;", "g", "Lec3/l;", "Ljn0/a;", "upstream", "j", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;", "b", "Ltr2/n;", "c", "Lhn0/a;", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21800c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ChallengeDetailsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17514a analyticsHelper;

    /* JADX INFO: renamed from: jn0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.challengedetails.domain.ChallengeDetailsInteractor", m100430f = "ChallengeDetailsInteractor.kt", m100431l = {79, 80}, m100432m = "emitJoinChallengeActions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f83965E;

        /* JADX INFO: renamed from: w */
        Object f83966w;

        /* JADX INFO: renamed from: x */
        Object f83967x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83968y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83968y = obj;
            this.f83965E |= Integer.MIN_VALUE;
            return C21800c.this.m61691h(null, null, this);
        }
    }

    /* JADX INFO: renamed from: jn0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.challengedetails.domain.ChallengeDetailsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ChallengeDetailsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f83970w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f83971x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83972y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21800c f83973z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C21800c c21800c) {
            super(3, interfaceC30057d);
            this.f83973z = c21800c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21798a interfaceC21798a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f83973z);
            cVar.f83971x = interfaceC13062m;
            cVar.f83972y = interfaceC21798a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83970w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f83971x;
                C13084s1 c13084s1 = new C13084s1(new d((InterfaceC21798a) this.f83972y, this.f83973z, null));
                this.f83971x = null;
                this.f83972y = null;
                this.f83970w = 1;
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
            return invoke((InterfaceC13062m) obj, (InterfaceC21798a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: jn0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.challengedetails.domain.ChallengeDetailsInteractor$interact$1$1", m100430f = "ChallengeDetailsInteractor.kt", m100431l = {27, 28}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ljn0/c$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83974w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f83975x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC21798a f83976y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21800c f83977z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC21798a interfaceC21798a, C21800c c21800c, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83976y = interfaceC21798a;
            this.f83977z = c21800c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f83976y, this.f83977z, interfaceC30057d);
            dVar.f83975x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (r6.f83977z.m61691h(r0, (jn0.InterfaceC21798a.b) r7, r6) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r0.emit(r2, r6) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            return r1;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f83975x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f83974w
                r3 = 1
                r4 = 2
                if (r2 == 0) goto L1d
                if (r2 == r3) goto L19
                if (r2 != r4) goto L11
                goto L19
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L47
            L1d:
                p505ts.AbstractC34132o.m107864I(r7)
                jn0.a r7 = r6.f83976y
                boolean r2 = r7 instanceof jn0.InterfaceC21798a.b
                r5 = 0
                if (r2 == 0) goto L36
                jn0.c r2 = r6.f83977z
                jn0.a$b r7 = (jn0.InterfaceC21798a.b) r7
                r6.f83975x = r5
                r6.f83974w = r3
                java.lang.Object r7 = jn0.C21800c.m61684a(r2, r0, r7, r6)
                if (r7 != r1) goto L47
                goto L46
            L36:
                jn0.c$a r2 = new jn0.c$a
                r3 = 0
                r2.<init>(r7, r3, r4, r5)
                r6.f83975x = r5
                r6.f83974w = r4
                java.lang.Object r7 = r0.emit(r2, r6)
                if (r7 != r1) goto L47
            L46:
                return r1
            L47:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: jn0.C21800c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: jn0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.challengedetails.domain.ChallengeDetailsInteractor$interact$2", m100430f = "ChallengeDetailsInteractor.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ljn0/b;", "prevDomainResult", "Ljn0/c$a;", "challengeAcc", "<anonymous>", "(Ljn0/b;Ljn0/c$a;)Ljn0/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f83978w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f83979x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83980y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC21799b interfaceC21799b, a aVar, InterfaceC30057d<? super InterfaceC21799b> interfaceC30057d) {
            e eVar = C21800c.this.new e(interfaceC30057d);
            eVar.f83979x = interfaceC21799b;
            eVar.f83980y = aVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC21799b interfaceC21799b = (InterfaceC21799b) this.f83979x;
            a aVar = (a) this.f83980y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83978w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (aVar.getEmitJoinChallengeLoading()) {
                    return C21800c.this.m61695m(interfaceC21799b);
                }
                C21800c c21800c = C21800c.this;
                this.f83979x = null;
                this.f83980y = null;
                this.f83978w = 1;
                obj = c21800c.m61692i(aVar, interfaceC21799b, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (InterfaceC21799b) obj;
        }
    }

    /* JADX INFO: renamed from: jn0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.challengedetails.domain.ChallengeDetailsInteractor$joinChallenge$2", m100430f = "ChallengeDetailsInteractor.kt", m100431l = {104}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ljn0/b;", "<anonymous>", "(Lbc3/c0;)Ljn0/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83982w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC21799b f83983x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21800c f83984y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f83985z;

        /* JADX INFO: renamed from: jn0.c$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.challengedetails.domain.ChallengeDetailsInteractor$joinChallenge$2$response$1", m100430f = "ChallengeDetailsInteractor.kt", m100431l = {105}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f83986w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21800c f83987x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f83988y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21800c c21800c, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f83987x = c21800c;
                this.f83988y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f83987x, this.f83988y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f83986w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                ChallengeDetailsApi challengeDetailsApi = this.f83987x.api;
                JoinChallengeRequest joinChallengeRequest = new JoinChallengeRequest(this.f83988y);
                this.f83986w = 1;
                Object objJoinChallenge = challengeDetailsApi.joinChallenge(joinChallengeRequest, this);
                return objJoinChallenge == enumC31071a ? enumC31071a : objJoinChallenge;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super JoinChallengeResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC21799b interfaceC21799b, C21800c c21800c, String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83983x = interfaceC21799b;
            this.f83984y = c21800c;
            this.f83985z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f83983x, this.f83984y, this.f83985z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC21799b> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM108729b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83982w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21799b interfaceC21799b = this.f83983x;
                if (!(interfaceC21799b instanceof InterfaceC21799b.c)) {
                    return interfaceC21799b;
                }
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.f83984y.logger;
                a aVar = new a(this.f83984y, this.f83985z, null);
                this.f83982w = 1;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to join challenge", aVar, this, 2, null);
                if (objM108729b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM108729b = obj;
            }
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
                return InterfaceC21799b.c.m61680b((InterfaceC21799b.c) this.f83983x, null, new C21801d(((JoinChallengeResponse) cVar.m108735a()).getText(), ((JoinChallengeResponse) cVar.m108735a()).getSubText(), ((JoinChallengeResponse) cVar.m108735a()).getCtaText(), ((JoinChallengeResponse) cVar.m108735a()).getCtaClose(), ((JoinChallengeResponse) cVar.m108735a()).getStatus()), 1, null);
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return InterfaceC21799b.a.f83956a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: jn0.c$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.challengedetails.domain.ChallengeDetailsInteractor", m100430f = "ChallengeDetailsInteractor.kt", m100431l = {84}, m100432m = "loadBffData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f83989w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f83990x;

        /* JADX INFO: renamed from: z */
        int f83992z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83990x = obj;
            this.f83992z |= Integer.MIN_VALUE;
            return C21800c.this.m61694l(null, this);
        }
    }

    /* JADX INFO: renamed from: jn0.c$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.challengedetails.domain.ChallengeDetailsInteractor$loadBffData$response$1", m100430f = "ChallengeDetailsInteractor.kt", m100431l = {85}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f83993w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f83995y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f83995y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C21800c.this.new h(this.f83995y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83993w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ChallengeDetailsApi challengeDetailsApi = C21800c.this.api;
            String str = this.f83995y;
            this.f83993w = 1;
            Object challengeDetails = challengeDetailsApi.getChallengeDetails(str, this);
            return challengeDetails == enumC31071a ? enumC31071a : challengeDetails;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ChallengeDetailsResponse> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C21800c(ChallengeDetailsApi api, InterfaceC34116n logger, C17514a analyticsHelper) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.api = api;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC21799b m61690g(InterfaceC21799b prevDomainResult) {
        return prevDomainResult instanceof InterfaceC21799b.c ? InterfaceC21799b.c.m61680b((InterfaceC21799b.c) prevDomainResult, null, null, 1, null) : prevDomainResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r6.emit(r8, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m61691h(ec3.InterfaceC13062m r6, jn0.InterfaceC21798a.b r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof jn0.C21800c.b
            if (r0 == 0) goto L13
            r0 = r8
            jn0.c$b r0 = (jn0.C21800c.b) r0
            int r1 = r0.f83965E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83965E = r1
            goto L18
        L13:
            jn0.c$b r0 = new jn0.c$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f83968y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f83965E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f83967x
            jn0.a$b r6 = (jn0.InterfaceC21798a.b) r6
            java.lang.Object r6 = r0.f83966w
            ec3.m r6 = (ec3.InterfaceC13062m) r6
            p505ts.AbstractC34132o.m107864I(r8)
            goto L70
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.f83967x
            r7 = r6
            jn0.a$b r7 = (jn0.InterfaceC21798a.b) r7
            java.lang.Object r6 = r0.f83966w
            ec3.m r6 = (ec3.InterfaceC13062m) r6
            p505ts.AbstractC34132o.m107864I(r8)
            goto L5c
        L47:
            p505ts.AbstractC34132o.m107864I(r8)
            jn0.c$a r8 = new jn0.c$a
            r8.<init>(r7, r4)
            r0.f83966w = r6
            r0.f83967x = r7
            r0.f83965E = r4
            java.lang.Object r8 = r6.emit(r8, r0)
            if (r8 != r1) goto L5c
            goto L6f
        L5c:
            jn0.c$a r8 = new jn0.c$a
            r2 = 0
            r8.<init>(r7, r2)
            r7 = 0
            r0.f83966w = r7
            r0.f83967x = r7
            r0.f83965E = r3
            java.lang.Object r6 = r6.emit(r8, r0)
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jn0.C21800c.m61691h(ec3.m, jn0.a$b, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final Object m61692i(a aVar, InterfaceC21799b interfaceC21799b, InterfaceC30057d<? super InterfaceC21799b> interfaceC30057d) {
        InterfaceC21798a action = aVar.getAction();
        if (action instanceof InterfaceC21798a.c) {
            return m61694l(((InterfaceC21798a.c) aVar.getAction()).getName(), interfaceC30057d);
        }
        if (action instanceof InterfaceC21798a.b) {
            this.analyticsHelper.m49759a(((InterfaceC21798a.b) aVar.getAction()).getName());
            return m61693k(((InterfaceC21798a.b) aVar.getAction()).getName(), interfaceC21799b, interfaceC30057d);
        }
        if (action instanceof InterfaceC21798a.a) {
            return m61690g(interfaceC21799b);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    private final Object m61693k(String str, InterfaceC21799b interfaceC21799b, InterfaceC30057d<? super InterfaceC21799b> interfaceC30057d) {
        return AbstractC28190p0.m85321a(1000L, new f(interfaceC21799b, this, str, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: l */
    public final Object m61694l(String str, InterfaceC30057d<? super InterfaceC21799b> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f83992z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f83992z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object objM108729b = gVar2.f83990x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f83992z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            h hVar = new h(str, null);
            gVar2.f83989w = null;
            gVar2.f83992z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to load challenge details", hVar, gVar2, 2, null);
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
            return new InterfaceC21799b.c((ChallengeDetailsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), null, 2, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC21799b.a.f83956a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC21799b m61695m(InterfaceC21799b prevDomainResult) {
        if (!(prevDomainResult instanceof InterfaceC21799b.c)) {
            return prevDomainResult;
        }
        InterfaceC21799b.c cVar = (InterfaceC21799b.c) prevDomainResult;
        return InterfaceC21799b.c.m61680b(cVar, null, new C21801d(cVar.getBffData().getSavingText(), cVar.getBffData().getSavingSubText(), null, null, JoinChallengeResponseStatus.LOADING, 12, null), 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m61696j(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(InterfaceC21799b.b.f83957a, AbstractC13091v.m36590P(upstream, new c(null, this)), new e(null));
    }

    /* JADX INFO: renamed from: jn0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ljn0/c$a;", "", "Ljn0/a;", "action", "", "emitJoinChallengeLoading", "<init>", "(Ljn0/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljn0/a;", "()Ljn0/a;", "b", "Z", "()Z", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC21798a action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean emitJoinChallengeLoading;

        public a(InterfaceC21798a action, boolean z4) {
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
            this.emitJoinChallengeLoading = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC21798a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getEmitJoinChallengeLoading() {
            return this.emitJoinChallengeLoading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.action, aVar.action) && this.emitJoinChallengeLoading == aVar.emitJoinChallengeLoading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.emitJoinChallengeLoading) + (this.action.hashCode() * 31);
        }

        public String toString() {
            return "ChallengeAccumulator(action=" + this.action + ", emitJoinChallengeLoading=" + this.emitJoinChallengeLoading + ")";
        }

        public /* synthetic */ a(InterfaceC21798a interfaceC21798a, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC21798a, (i13 & 2) != 0 ? false : z4);
        }
    }

    public /* synthetic */ C21800c(ChallengeDetailsApi challengeDetailsApi, InterfaceC34116n interfaceC34116n, C17514a c17514a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(challengeDetailsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ChallengeDetailsInteractor") : interfaceC34116n, c17514a);
    }
}
