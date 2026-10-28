package com.whoop.bot.settings;

import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13043h0;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.C14380k;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.time.Clock;
import java.time.Instant;
import l83.C23454a0;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u02.AbstractC34390f;
import u02.C34387c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsInteractor;", "Lod1/g;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "Lcom/whoop/bot/settings/CoachSettingsDomainState;", "Lnm0/e;", "cachedApiSource", "Lu02/c;", "apiClient", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lu02/c;Ljava/time/Clock;Ltr2/n;)V", "Lec3/l;", "Lcom/whoop/bot/settings/InternalEvent;", "loadScreenDetails", "()Lec3/l;", "", "key", "", "enabled", "togglesSetting", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Lnm0/e;", "Lu02/c;", "Ljava/time/Clock;", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CoachSettingsInteractor implements InterfaceC27844g<CoachSettingsViewEvent, CoachSettingsDomainState> {
    public static final int $stable = 8;
    private final C34387c apiClient;
    private final InterfaceC26834e cachedApiSource;
    private final Clock clock;
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsInteractor$interact$1 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsInteractor$interact$1", m100430f = "CoachSettingsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "previousEvent", "latestEvent"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C60591 extends AbstractC32275i implements Function3 {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C60591(InterfaceC30057d<? super C60591> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(CoachSettingsViewEvent coachSettingsViewEvent, CoachSettingsViewEvent coachSettingsViewEvent2, InterfaceC30057d<? super CoachSettingsViewEvent> interfaceC30057d) {
            C60591 c60591 = CoachSettingsInteractor.this.new C60591(interfaceC30057d);
            c60591.L$0 = coachSettingsViewEvent;
            c60591.L$1 = coachSettingsViewEvent2;
            return c60591.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            CoachSettingsViewEvent coachSettingsViewEvent = (CoachSettingsViewEvent) this.L$0;
            CoachSettingsViewEvent coachSettingsViewEvent2 = (CoachSettingsViewEvent) this.L$1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC22676k.m65745e(coachSettingsViewEvent2, CoachSettingsViewEvent.Retry.INSTANCE)) {
                return coachSettingsViewEvent2;
            }
            if (coachSettingsViewEvent instanceof CoachSettingsViewEvent.Toggle) {
                CoachSettingsViewEvent.Toggle toggle = (CoachSettingsViewEvent.Toggle) coachSettingsViewEvent;
                return new CoachSettingsViewEvent.Toggle(toggle.getKey(), toggle.getEnabled());
            }
            CoachSettingsInteractor.this.logger.mo85222m("impossible state: got retry event but previous event wasn't toggle", new AbstractC30556a.a[0]);
            return CoachSettingsViewEvent.None.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsInteractor$interact$4 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsInteractor$interact$4", m100430f = "CoachSettingsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/bot/settings/CoachSettingsInternalState;", "internalState", "action", "Lcom/whoop/bot/settings/InternalEvent;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C60604 extends AbstractC32275i implements Function3 {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C60604(InterfaceC30057d<? super C60604> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(CoachSettingsInternalState coachSettingsInternalState, InternalEvent internalEvent, InterfaceC30057d<? super CoachSettingsInternalState> interfaceC30057d) {
            C60604 c60604 = new C60604(interfaceC30057d);
            c60604.L$0 = coachSettingsInternalState;
            c60604.L$1 = internalEvent;
            return c60604.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            CoachSettingsInternalState coachSettingsInternalState = (CoachSettingsInternalState) this.L$0;
            InternalEvent internalEvent = (InternalEvent) this.L$1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(internalEvent, InternalEvent.DismissError.INSTANCE)) {
                return CoachSettingsInternalState.copy$default(coachSettingsInternalState, new CoachSettingsDomainState.Success(coachSettingsInternalState.getResponse()), null, null, 6, null);
            }
            if (AbstractC22676k.m65745e(internalEvent, InternalEvent.LoadSettingsError.INSTANCE)) {
                return CoachSettingsInternalState.copy$default(coachSettingsInternalState, CoachSettingsDomainState.Error.INSTANCE, null, null, 6, null);
            }
            if (AbstractC22676k.m65745e(internalEvent, InternalEvent.Loading.INSTANCE)) {
                return CoachSettingsInternalState.copy$default(coachSettingsInternalState, CoachSettingsDomainState.Loading.INSTANCE, null, null, 6, null);
            }
            if (AbstractC22676k.m65745e(internalEvent, InternalEvent.Saving.INSTANCE)) {
                return CoachSettingsInternalState.copy$default(coachSettingsInternalState, CoachSettingsDomainState.Saving.INSTANCE, null, null, 6, null);
            }
            if (internalEvent instanceof InternalEvent.Success) {
                InternalEvent.Success success = (InternalEvent.Success) internalEvent;
                return CoachSettingsInternalState.copy$default(coachSettingsInternalState, new CoachSettingsDomainState.Success(success.getResponse()), success.getResponse(), null, 4, null);
            }
            if (internalEvent instanceof InternalEvent.Toggle) {
                return CoachSettingsInternalState.copy$default(coachSettingsInternalState, CoachSettingsDomainState.Saving.INSTANCE, null, (InternalEvent.Toggle) internalEvent, 2, null);
            }
            if (AbstractC22676k.m65745e(internalEvent, InternalEvent.ToggleError.INSTANCE)) {
                return CoachSettingsInternalState.copy$default(coachSettingsInternalState, CoachSettingsDomainState.Error.INSTANCE, null, null, 6, null);
            }
            if (AbstractC22676k.m65745e(internalEvent, InternalEvent.SavingSuccess.INSTANCE)) {
                return CoachSettingsInternalState.copy$default(coachSettingsInternalState, CoachSettingsDomainState.Saved.INSTANCE, null, null, 2, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsInteractor$togglesSetting$3 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsInteractor$togglesSetting$3", m100430f = "CoachSettingsInteractor.kt", m100431l = {112}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/bot/settings/InternalEvent;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C60633 extends AbstractC32275i implements InterfaceC4351m {
        private /* synthetic */ Object L$0;
        int label;

        public C60633(InterfaceC30057d<? super C60633> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C60633 c60633 = new C60633(interfaceC30057d);
            c60633.L$0 = obj;
            return c60633;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C60633) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InternalEvent.Saving saving = InternalEvent.Saving.INSTANCE;
                this.L$0 = null;
                this.label = 1;
                if (interfaceC13062m.emit(saving, this) == enumC31071a) {
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

    public CoachSettingsInteractor(InterfaceC26834e cachedApiSource, C34387c apiClient, Clock clock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.apiClient = apiClient;
        this.clock = clock;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l loadScreenDetails() {
        final C14380k c14380kM36590P = AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetCoachSettingsRequest(), 1), null, null, 3, null), new CoachSettingsInteractor$loadScreenDetails$$inlined$cacheAPI$1(null, this.cachedApiSource));
        return new InterfaceC13058l() { // from class: com.whoop.bot.settings.CoachSettingsInteractor$loadScreenDetails$$inlined$map$1

            /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsInteractor$loadScreenDetails$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C60612<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsInteractor$loadScreenDetails$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsInteractor$loadScreenDetails$$inlined$map$1$2", m100430f = "CoachSettingsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
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
                        return C60612.this.emit(null, this);
                    }
                }

                public C60612(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    Object success;
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
                        InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                        if (interfaceC29354a instanceof InterfaceC29354a.a) {
                            success = new InternalEvent.Success((CoachSettingsResponse) ((InterfaceC29354a.a) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            success = new InternalEvent.Success((CoachSettingsResponse) ((InterfaceC29354a.d) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.e) {
                            success = InternalEvent.Loading.INSTANCE;
                        } else {
                            if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            success = InternalEvent.LoadSettingsError.INSTANCE;
                        }
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(success, anonymousClass1) == enumC31071a) {
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
                Object objCollect = c14380kM36590P.collect(new C60612(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object togglesSetting(String str, boolean z4, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        PutCoachSettingsRequest putCoachSettingsRequest = new PutCoachSettingsRequest(new CoachSettingsRequest(str, z4));
        Instant instant = this.clock.instant();
        C0456u c0456u = new C0456u(putCoachSettingsRequest, 1);
        C34387c c34387c = this.apiClient;
        InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(CoachSettingsRequest.class);
        Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65691d);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(CoachSettingsRequest.class), interfaceC21456a0M65691d, typeM60396B);
        InterfaceC21456a0 interfaceC21456a0M65691d2 = AbstractC22671h0.m65691d(CoachSettingsResponse.class);
        return new C13015a0(new C60633(null), new C13084s1(new CoachSettingsInteractor$togglesSetting$$inlined$transform$1(AbstractC34390f.m108754b(c0456u, c34387c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(CoachSettingsResponse.class), interfaceC21456a0M65691d2, AbstractC21478l0.m60396B(interfaceC21456a0M65691d2))), null, instant, this)));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        final C13060l1 c13060l1 = new C13060l1(CoachSettingsViewEvent.None.INSTANCE, upstream, new C60591(null));
        final C13043h0 c13043h0M36612v = AbstractC13091v.m36612v(new C13060l1(new CoachSettingsInternalState(CoachSettingsDomainState.Loading.INSTANCE, new CoachSettingsResponse(null, null, null, 7, null), null), AbstractC13091v.m36590P(new InterfaceC13058l() { // from class: com.whoop.bot.settings.CoachSettingsInteractor$interact$$inlined$filterNot$1

            /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsInteractor$interact$$inlined$filterNot$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C60572<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsInteractor$interact$$inlined$filterNot$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsInteractor$interact$$inlined$filterNot$1$2", m100430f = "CoachSettingsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
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
                        return C60572.this.emit(null, this);
                    }
                }

                public C60572(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
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
                        if (!(((CoachSettingsViewEvent) obj) instanceof CoachSettingsViewEvent.None)) {
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC13062m.emit(obj, anonymousClass1) == enumC31071a) {
                                return enumC31071a;
                            }
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
                Object objCollect = c13060l1.collect(new C60572(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, new CoachSettingsInteractor$interact$$inlined$flatMapLatest$1(null, this)), new C60604(null)), 1);
        return new InterfaceC13058l() { // from class: com.whoop.bot.settings.CoachSettingsInteractor$interact$$inlined$map$1

            /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsInteractor$interact$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C60582<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsInteractor$interact$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsInteractor$interact$$inlined$map$1$2", m100430f = "CoachSettingsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
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
                        return C60582.this.emit(null, this);
                    }
                }

                public C60582(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
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
                        CoachSettingsDomainState state = ((CoachSettingsInternalState) obj).getState();
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(state, anonymousClass1) == enumC31071a) {
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
                Object objCollect = c13043h0M36612v.collect(new C60582(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CoachSettingsInteractor(InterfaceC26834e interfaceC26834e, C34387c c34387c, Clock clock, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        this(interfaceC26834e, c34387c, clock, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CoachSettingsInteractor") : interfaceC34116n);
    }
}
