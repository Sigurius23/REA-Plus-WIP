package com.whoop.personalrecords.miniarch.domain;

import a12.C0141a;
import c93.InterfaceC4351m;
import com.whoop.personalrecords.miniarch.domain.models.PersonalRecordsExerciseDto;
import com.whoop.personalrecords.miniarch.domain.models.PersonalRecordsModel;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import n32.C26225a;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u02.AbstractC34390f;
import u02.AbstractC34391g;
import u02.C34387c;
import u02.C34389e;
import u02.C34392h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0017\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001e\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;", "Lod1/g;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;", "Lu02/c;", "apiClient", "Ln32/a;", "analytics", "<init>", "(Lu02/c;Ln32/a;)V", "La12/a;", "parsedPath", "Lec3/l;", "fetchData", "(La12/a;)Lec3/l;", "", "startDate", "endDate", "", "nextExerciseOffset", "loadMoreData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lec3/l;", "", "isValidLoadMoreParameters", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Z", "Lu02/g;", "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;", "apiResult", "path", "isLoadingMore", "handleApiResult", "(Lu02/g;Ljava/lang/String;Z)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Lu02/c;", "Ln32/a;", "accumulatedResponse", "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PersonalRecordsInteractor implements InterfaceC27844g<PersonalRecordsDomainAction, PersonalRecordsDomainState> {
    public static final int $stable = 8;
    private PersonalRecordsModel accumulatedResponse;
    private final C26225a analytics;
    private final C34387c apiClient;

    /* JADX INFO: renamed from: com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor$loadMoreData$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor$loadMoreData$1", m100430f = "PersonalRecordsInteractor.kt", m100431l = {45, 49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C96621 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $endDate;
        final /* synthetic */ Integer $nextExerciseOffset;
        final /* synthetic */ String $startDate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C96621(String str, String str2, Integer num, InterfaceC30057d<? super C96621> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$startDate = str;
            this.$endDate = str2;
            this.$nextExerciseOffset = num;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C96621 c96621 = PersonalRecordsInteractor.this.new C96621(this.$startDate, this.$endDate, this.$nextExerciseOffset, interfaceC30057d);
            c96621.L$0 = obj;
            return c96621;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C96621) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x00be, code lost:
        
            if (r4.collect(r12, r11) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = r11.L$0
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r11.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r12)
                goto Lc1
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                p505ts.AbstractC34132o.m107864I(r12)
                goto L3f
            L21:
                p505ts.AbstractC34132o.m107864I(r12)
                com.whoop.personalrecords.miniarch.domain.PersonalRecordsDomainState r5 = new com.whoop.personalrecords.miniarch.domain.PersonalRecordsDomainState
                com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor r12 = com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor.this
                com.whoop.personalrecords.miniarch.domain.models.PersonalRecordsModel r7 = com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor.access$getAccumulatedResponse$p(r12)
                r9 = 1
                r10 = 0
                r6 = 0
                r8 = 1
                r5.<init>(r6, r7, r8, r9, r10)
                r11.L$0 = r0
                r11.label = r4
                java.lang.Object r12 = r0.emit(r5, r11)
                if (r12 != r1) goto L3f
                goto Lc0
            L3f:
                com.whoop.personalrecords.miniarch.domain.GetPersonalRecordsRequest r12 = new com.whoop.personalrecords.miniarch.domain.GetPersonalRecordsRequest
                java.lang.String r2 = r11.$startDate
                p715kotlin.jvm.internal.AbstractC22676k.m65747g(r2)
                l83.k r4 = new l83.k
                java.lang.String r5 = "startDate"
                r4.<init>(r5, r2)
                java.lang.String r2 = r11.$endDate
                p715kotlin.jvm.internal.AbstractC22676k.m65747g(r2)
                l83.k r5 = new l83.k
                java.lang.String r6 = "endDate"
                r5.<init>(r6, r2)
                java.lang.Integer r2 = r11.$nextExerciseOffset
                java.lang.String r2 = java.lang.String.valueOf(r2)
                l83.k r6 = new l83.k
                java.lang.String r7 = "offset"
                r6.<init>(r7, r2)
                l83.k[] r2 = new l83.C23465k[]{r4, r5, r6}
                java.util.Map r2 = m83.AbstractC25247g0.m73990Y(r2)
                java.lang.String r4 = "personal-records"
                r12.<init>(r4, r2)
                a6.u r2 = new a6.u
                r4 = 1
                r2.<init>(r12, r4)
                com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor r12 = com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor.this
                u02.c r12 = com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor.access$getApiClient$p(r12)
                java.lang.Class<l83.a0> r4 = l83.C23454a0.class
                j93.a0 r5 = p715kotlin.jvm.internal.AbstractC22671h0.m65689b(r4)
                java.lang.reflect.Type r6 = j93.AbstractC21478l0.m60396B(r5)
                kotlin.jvm.internal.i0 r7 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                j93.d r4 = r7.getOrCreateKotlinClass(r4)
                s63.a r4 = ge3.AbstractC15751g.m44445Y(r4, r5, r6)
                java.lang.Class<com.whoop.personalrecords.miniarch.domain.models.PersonalRecordsModel> r5 = com.whoop.personalrecords.miniarch.domain.models.PersonalRecordsModel.class
                j93.a0 r6 = p715kotlin.jvm.internal.AbstractC22671h0.m65691d(r5)
                java.lang.reflect.Type r8 = j93.AbstractC21478l0.m60396B(r6)
                j93.d r5 = r7.getOrCreateKotlinClass(r5)
                s63.a r5 = ge3.AbstractC15751g.m44445Y(r5, r6, r8)
                ec3.l r12 = u02.AbstractC34390f.m108754b(r2, r12, r4, r5)
                com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor r2 = com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor.this
                com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor$loadMoreData$1$invokeSuspend$$inlined$map$1 r4 = new com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor$loadMoreData$1$invokeSuspend$$inlined$map$1
                r4.<init>()
                com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor$loadMoreData$1$2 r12 = new com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor$loadMoreData$1$2
                r12.<init>()
                r0 = 0
                r11.L$0 = r0
                r11.label = r3
                java.lang.Object r12 = r4.collect(r12, r11)
                if (r12 != r1) goto Lc1
            Lc0:
                return r1
            Lc1:
                l83.a0 r12 = l83.C23454a0.f92919a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor.C96621.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public PersonalRecordsInteractor(C34387c apiClient, C26225a analytics) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.apiClient = apiClient;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l fetchData(final C0141a parsedPath) {
        C0456u c0456u = new C0456u(new GetPersonalRecordsRequest(parsedPath.getBasePath(), parsedPath.m354b()), 1);
        C34387c c34387c = this.apiClient;
        InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
        Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
        InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(PersonalRecordsModel.class);
        final InterfaceC13058l interfaceC13058lM108754b = AbstractC34390f.m108754b(c0456u, c34387c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(PersonalRecordsModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
        return new InterfaceC13058l() { // from class: com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor$fetchData$$inlined$map$1

            /* JADX INFO: renamed from: com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor$fetchData$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C96612<T> implements InterfaceC13062m {
                final /* synthetic */ C0141a $parsedPath$inlined;
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ PersonalRecordsInteractor this$0;

                /* JADX INFO: renamed from: com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor$fetchData$$inlined$map$1$2", m100430f = "PersonalRecordsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C96612.this.emit(null, this);
                    }
                }

                public C96612(InterfaceC13062m interfaceC13062m, PersonalRecordsInteractor personalRecordsInteractor, C0141a c0141a) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.this$0 = personalRecordsInteractor;
                    this.$parsedPath$inlined = c0141a;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        PersonalRecordsDomainState personalRecordsDomainStateHandleApiResult = this.this$0.handleApiResult((AbstractC34391g) obj, this.$parsedPath$inlined.getPath(), false);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(personalRecordsDomainStateHandleApiResult, anonymousClass1) == enumC31071a) {
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

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = interfaceC13058lM108754b.collect(new C96612(interfaceC13062m, this, parsedPath), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonalRecordsDomainState handleApiResult(AbstractC34391g<PersonalRecordsModel> apiResult, String path, boolean isLoadingMore) {
        String analyticsAction;
        List<PersonalRecordsExerciseDto> tiles;
        if (apiResult instanceof C34389e) {
            return new PersonalRecordsDomainState(new PersonalRecordsDialogType.RequestFailed(path), isLoadingMore ? this.accumulatedResponse : null, false);
        }
        if (!(apiResult instanceof C34392h)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!isLoadingMore) {
            PersonalRecordsModel personalRecordsModel = (PersonalRecordsModel) ((C34392h) apiResult).m108758a();
            this.accumulatedResponse = personalRecordsModel;
            return new PersonalRecordsDomainState(null, personalRecordsModel, false);
        }
        PersonalRecordsModel personalRecordsModel2 = this.accumulatedResponse;
        List<PersonalRecordsExerciseDto> tiles2 = (personalRecordsModel2 == null || (tiles = personalRecordsModel2.getTiles()) == null) ? ((PersonalRecordsModel) ((C34392h) apiResult).m108758a()).getTiles() : AbstractC25265s.m74129g1(tiles, ((PersonalRecordsModel) ((C34392h) apiResult).m108758a()).getTiles());
        C34392h c34392h = (C34392h) apiResult;
        PersonalRecordsModel personalRecordsModel3 = (PersonalRecordsModel) c34392h.m108758a();
        if (personalRecordsModel2 == null || (analyticsAction = personalRecordsModel2.getAnalyticsAction()) == null) {
            analyticsAction = ((PersonalRecordsModel) c34392h.m108758a()).getAnalyticsAction();
        }
        PersonalRecordsModel personalRecordsModelCopy$default = PersonalRecordsModel.copy$default(personalRecordsModel3, tiles2, false, null, null, null, analyticsAction, 30, null);
        this.accumulatedResponse = personalRecordsModelCopy$default;
        return new PersonalRecordsDomainState(null, personalRecordsModelCopy$default, false);
    }

    public static /* synthetic */ PersonalRecordsDomainState handleApiResult$default(PersonalRecordsInteractor personalRecordsInteractor, AbstractC34391g abstractC34391g, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return personalRecordsInteractor.handleApiResult(abstractC34391g, str, z4);
    }

    private final boolean isValidLoadMoreParameters(String startDate, String endDate, Integer nextExerciseOffset) {
        return (startDate == null || startDate.length() == 0 || endDate == null || endDate.length() == 0 || nextExerciseOffset == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l loadMoreData(String startDate, String endDate, Integer nextExerciseOffset) {
        return isValidLoadMoreParameters(startDate, endDate, nextExerciseOffset) ? new C13084s1(new C96621(startDate, endDate, nextExerciseOffset, null)) : new C0456u(new PersonalRecordsDomainState(null, null, false, 7, null), 1);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new PersonalRecordsInteractor$interact$$inlined$flatMapLatest$1(null, this));
    }
}
