package tf1;

import c93.InterfaceC4351m;
import com.whoop.feedbacksurvey.domain.CancelSubscriptionRequest;
import com.whoop.feedbacksurvey.domain.GetFeedbackSurveyRequest;
import com.whoop.feedbacksurvey.domain.models.CancelSubscriptionRequestBody;
import com.whoop.feedbacksurvey.domain.models.FeedbackSurveyModels;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u02.InterfaceC34385a;
import wf1.InterfaceC37243a;

/* JADX INFO: renamed from: tf1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u0003*\u00020\u0003H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Ltf1/d;", "Lod1/g;", "Ltf1/b;", "Ltf1/c;", "Lnm0/e;", "cachedApiSource", "Lu02/c;", "apiClient", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lu02/c;Ltr2/n;)V", "previousState", "action", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ltf1/c;Ltf1/b;Lq83/d;)Ljava/lang/Object;", "g", "(Ltf1/c;Lq83/d;)Ljava/lang/Object;", "", "manualRefresh", "Lec3/l;", "j", "(Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;", "cacheResult", "i", "(Lpm0/a$c;)Ltf1/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lu02/c;", "c", "Ltr2/n;", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33765d implements InterfaceC27844g<AbstractC33763b, C33764c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: tf1.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.domain.FeedbackSurveyInteractor", m100430f = "FeedbackSurveyInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "cancelSubscription", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f141294E;

        /* JADX INFO: renamed from: w */
        Object f141295w;

        /* JADX INFO: renamed from: x */
        Object f141296x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f141297y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f141297y = obj;
            this.f141294E |= Integer.MIN_VALUE;
            return C33765d.this.m106761g(null, this);
        }
    }

    /* JADX INFO: renamed from: tf1.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.domain.FeedbackSurveyInteractor$cancelSubscription$result$1", m100430f = "FeedbackSurveyInteractor.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f141299w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ CancelSubscriptionRequest f141301y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CancelSubscriptionRequest cancelSubscriptionRequest, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f141301y = cancelSubscriptionRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C33765d.this.new b(this.f141301y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141299w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C34387c c34387c = C33765d.this.apiClient;
            CancelSubscriptionRequest cancelSubscriptionRequest = this.f141301y;
            InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(CancelSubscriptionRequest.class);
            C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CancelSubscriptionRequest.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
            this.f141299w = 1;
            Object objM108748d = c34387c.m108748d(cancelSubscriptionRequest, c32236aM44445Y, this);
            return objM108748d == enumC31071a ? enumC31071a : objM108748d;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: tf1.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.domain.FeedbackSurveyInteractor$interact$$inlined$flatMapLatest$1", m100430f = "FeedbackSurveyInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f141302w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f141303x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f141304y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C33765d f141305z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C33765d c33765d) {
            super(3, interfaceC30057d);
            this.f141305z = c33765d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC33763b abstractC33763b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f141305z);
            cVar.f141303x = interfaceC13062m;
            cVar.f141304y = abstractC33763b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141302w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f141303x;
                AbstractC33763b abstractC33763b = (AbstractC33763b) this.f141304y;
                if (abstractC33763b instanceof AbstractC33763b.b) {
                    c13084s1 = AbstractC13091v.m36590P(C33765d.m106765k(this.f141305z, false, 1, null), new h(null));
                } else {
                    c13084s1 = abstractC33763b instanceof AbstractC33763b.a ? new C13084s1(new e(abstractC33763b, null)) : new C13084s1(new f(abstractC33763b, null));
                }
                this.f141303x = null;
                this.f141304y = null;
                this.f141302w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC33763b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: tf1.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.domain.FeedbackSurveyInteractor$interact$1$1$1", m100430f = "FeedbackSurveyInteractor.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ltf1/e$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141306w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f141307x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C33764c f141308y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C33764c c33764c, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141308y = c33764c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f141308y, interfaceC30057d);
            dVar.f141307x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f141307x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141306w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC33766e.a aVar = new AbstractC33766e.a(this.f141308y);
                this.f141307x = null;
                this.f141306w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: tf1.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.domain.FeedbackSurveyInteractor$interact$1$2", m100430f = "FeedbackSurveyInteractor.kt", m100431l = {45, 46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ltf1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141309w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f141310x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC33763b f141311y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC33763b abstractC33763b, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141311y = abstractC33763b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f141311y, interfaceC30057d);
            eVar.f141310x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f141310x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f141309w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L43
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                tf1.e$c r6 = tf1.AbstractC33766e.c.f141342a
                r5.f141310x = r0
                r5.f141309w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L30
                goto L42
            L30:
                tf1.e$b r6 = new tf1.e$b
                tf1.b r2 = r5.f141311y
                r6.<init>(r2)
                r2 = 0
                r5.f141310x = r2
                r5.f141309w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L43
            L42:
                return r1
            L43:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tf1.C33765d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: tf1.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.domain.FeedbackSurveyInteractor$interact$1$3", m100430f = "FeedbackSurveyInteractor.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ltf1/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141312w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f141313x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC33763b f141314y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC33763b abstractC33763b, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141314y = abstractC33763b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f141314y, interfaceC30057d);
            fVar.f141313x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f141313x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141312w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC33766e.b bVar = new AbstractC33766e.b(this.f141314y);
                this.f141313x = null;
                this.f141312w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: tf1.d$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.domain.FeedbackSurveyInteractor$interact$2", m100430f = "FeedbackSurveyInteractor.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ltf1/c;", "previousState", "Ltf1/e;", "action", "<anonymous>", "(Ltf1/c;Ltf1/e;)Ltf1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f141315w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f141316x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f141317y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C33764c c33764c, AbstractC33766e abstractC33766e, InterfaceC30057d<? super C33764c> interfaceC30057d) {
            g gVar = C33765d.this.new g(interfaceC30057d);
            gVar.f141316x = c33764c;
            gVar.f141317y = abstractC33766e;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C33764c c33764c = (C33764c) this.f141316x;
            AbstractC33766e abstractC33766e = (AbstractC33766e) this.f141317y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141315w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(abstractC33766e instanceof AbstractC33766e.b)) {
                    if (abstractC33766e instanceof AbstractC33766e.a) {
                        return ((AbstractC33766e.a) abstractC33766e).getDomainState();
                    }
                    if (abstractC33766e instanceof AbstractC33766e.c) {
                        return C33764c.m106749b(c33764c, null, null, InterfaceC33762a.c.f141278a, null, false, false, 59, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C33765d c33765d = C33765d.this;
                AbstractC33763b domainAction = ((AbstractC33766e.b) abstractC33766e).getDomainAction();
                this.f141316x = null;
                this.f141317y = null;
                this.f141315w = 1;
                obj = c33765d.m106762h(c33764c, domainAction, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (C33764c) obj;
        }
    }

    /* JADX INFO: renamed from: tf1.d$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.domain.FeedbackSurveyInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "FeedbackSurveyInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f141319w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f141320x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f141321y;

        public h(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C33764c c33764c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d);
            hVar.f141320x = interfaceC13062m;
            hVar.f141321y = c33764c;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141319w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f141320x;
                C13084s1 c13084s1 = new C13084s1(new d((C33764c) this.f141321y, null));
                this.f141320x = null;
                this.f141321y = null;
                this.f141319w = 1;
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
            return invoke((InterfaceC13062m) obj, (C33764c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: tf1.d$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.domain.FeedbackSurveyInteractor$loadFeedbackSurveyCache$$inlined$cacheAPI$1", m100430f = "FeedbackSurveyInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f141322w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f141323x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f141324y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f141325z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f141325z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            i iVar = new i(interfaceC30057d, this.f141325z);
            iVar.f141323x = interfaceC13062m;
            iVar.f141324y = c26832c;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141322w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f141323x;
                C26832c c26832c = (C26832c) this.f141324y;
                InterfaceC26834e interfaceC26834e = this.f141325z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(FeedbackSurveyModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(FeedbackSurveyModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f141323x = null;
                this.f141324y = null;
                this.f141322w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: tf1.d$j */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f141326w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f141327x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C33765d f141328y;

        /* JADX INFO: renamed from: tf1.d$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141329w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f141330x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C33765d f141331y;

            /* JADX INFO: renamed from: tf1.d$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.domain.FeedbackSurveyInteractor$loadFeedbackSurveyCache$$inlined$map$1$2", m100430f = "FeedbackSurveyInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42386a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f141332E;

                /* JADX INFO: renamed from: F */
                Object f141333F;

                /* JADX INFO: renamed from: G */
                Object f141334G;

                /* JADX INFO: renamed from: H */
                int f141335H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f141336w;

                /* JADX INFO: renamed from: x */
                int f141337x;

                /* JADX INFO: renamed from: y */
                Object f141338y;

                public C42386a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f141336w = obj;
                    this.f141337x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4, C33765d c33765d) {
                this.f141329w = interfaceC13062m;
                this.f141330x = z4;
                this.f141331y = c33765d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42386a c42386a;
                C33764c c33764cM106763i;
                if (interfaceC30057d instanceof C42386a) {
                    c42386a = (C42386a) interfaceC30057d;
                    int i13 = c42386a.f141337x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42386a.f141337x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42386a = new C42386a(interfaceC30057d);
                    }
                } else {
                    c42386a = new C42386a(interfaceC30057d);
                }
                Object obj2 = c42386a.f141336w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42386a.f141337x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f141329w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c33764cM106763i = new C33764c(null, null, InterfaceC33762a.c.f141278a, null, false, false, 59, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        c33764cM106763i = new C33764c(null, null, null, (FeedbackSurveyModels) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), this.f141330x, true, 7, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        c33764cM106763i = new C33764c(null, null, null, (FeedbackSurveyModels) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), false, false, 55, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c33764cM106763i = new C33764c(null, null, null, (FeedbackSurveyModels) ((InterfaceC29354a.d) interfaceC29354a).getData(), false, false, 55, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c33764cM106763i = this.f141331y.m106763i((InterfaceC29354a.c) interfaceC29354a);
                    }
                    c42386a.f141338y = null;
                    c42386a.f141332E = null;
                    c42386a.f141333F = null;
                    c42386a.f141334G = null;
                    c42386a.f141335H = 0;
                    c42386a.f141337x = 1;
                    if (interfaceC13062m.emit(c33764cM106763i, c42386a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public j(InterfaceC13058l interfaceC13058l, boolean z4, C33765d c33765d) {
            this.f141326w = interfaceC13058l;
            this.f141327x = z4;
            this.f141328y = c33765d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f141326w.collect(new a(interfaceC13062m, this.f141327x, this.f141328y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C33765d(InterfaceC26834e cachedApiSource, C34387c apiClient, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.apiClient = apiClient;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m106761g(C33764c c33764c, InterfaceC30057d<? super C33764c> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f141294E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f141294E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f141297y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f141294E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            CancelSubscriptionRequest cancelSubscriptionRequest = new CancelSubscriptionRequest(new CancelSubscriptionRequestBody(c33764c.getReason(), c33764c.getDetails()));
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(cancelSubscriptionRequest, null);
            aVar2.f141295w = c33764c;
            aVar2.f141296x = null;
            aVar2.f141294E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to cancel subscription", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33764c = (C33764c) aVar2.f141295w;
            AbstractC34132o.m107864I(objM108729b);
        }
        C33764c c33764c2 = c33764c;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return C33764c.m106749b(c33764c2, null, null, InterfaceC33762a.a.f141277a, null, false, false, 59, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
            return C33764c.m106749b(c33764c2, null, null, new InterfaceC33762a.e(InterfaceC37243a.d.f159302a), null, false, false, 59, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            return C33764c.m106749b(c33764c2, null, null, new InterfaceC33762a.d(InterfaceC37243a.d.f159302a), null, false, false, 59, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final Object m106762h(C33764c c33764c, AbstractC33763b abstractC33763b, InterfaceC30057d<? super C33764c> interfaceC30057d) {
        if (abstractC33763b instanceof AbstractC33763b.b) {
            return c33764c;
        }
        if (abstractC33763b instanceof AbstractC33763b.a) {
            return m106761g(c33764c, interfaceC30057d);
        }
        if (abstractC33763b instanceof AbstractC33763b.c) {
            return C33764c.m106749b(c33764c, null, ((AbstractC33763b.c) abstractC33763b).getDetails(), null, null, false, false, 61, null);
        }
        return abstractC33763b instanceof AbstractC33763b.d ? C33764c.m106749b(c33764c, ((AbstractC33763b.d) abstractC33763b).getReason(), null, null, null, false, false, 62, null) : c33764c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final C33764c m106763i(InterfaceC29354a.c<FeedbackSurveyModels> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C33764c(null, null, new InterfaceC33762a.e(InterfaceC37243a.i.f159307a), null, false, false, 59, null) : new C33764c(null, null, new InterfaceC33762a.d(InterfaceC37243a.i.f159307a), null, false, false, 59, null);
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC13058l m106764j(boolean manualRefresh) {
        return new j(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetFeedbackSurveyRequest(), 1), AbstractC12350b.m34570S("FEEDBACK_SURVEY_SCOPE"), null, 2, null), new i(null, this.cachedApiSource)), manualRefresh, this);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ InterfaceC13058l m106765k(C33765d c33765d, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return c33765d.m106764j(z4);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C33764c(null, null, InterfaceC33762a.c.f141278a, null, false, false, 59, null), AbstractC13091v.m36590P(upstream, new c(null, this)), new g(null));
    }

    public /* synthetic */ C33765d(InterfaceC26834e interfaceC26834e, C34387c c34387c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, c34387c, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("FeedbackSurveyInteractor") : interfaceC34116n);
    }
}
