package com.whoop.bot.settings;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13096w1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import xk0.C38423a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewModel;", "Landroidx/lifecycle/w1;", "Lbc3/c0;", "coroutineScope", "Lcom/whoop/bot/settings/CoachSettingsInteractor;", "interactor", "Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;", "reducer", "Lxk0/a;", "analyticsHelper", "<init>", "(Lbc3/c0;Lcom/whoop/bot/settings/CoachSettingsInteractor;Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;Lxk0/a;)V", "Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "viewEvent", "Ll83/a0;", "sendViewEvent", "(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)V", "Lbc3/c0;", "Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;", "Lxk0/a;", "Lec3/o1;", "viewEvents", "Lec3/o1;", "Lec3/l;", "Lcom/whoop/bot/settings/CoachSettingsViewState;", "viewState", "Lec3/l;", "getViewState", "()Lec3/l;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CoachSettingsViewModel extends AbstractC1637w1 {
    public static final int $stable = 8;
    private final C38423a analyticsHelper;
    private final InterfaceC2994c0 coroutineScope;
    private final CoachSettingsViewStateReducer reducer;
    private final InterfaceC13072o1 viewEvents;
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsViewModel$sendViewEvent$1 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsViewModel$sendViewEvent$1", m100430f = "CoachSettingsViewModel.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C60691 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ CoachSettingsViewEvent $viewEvent;
        int label;
        final /* synthetic */ CoachSettingsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60691(CoachSettingsViewEvent coachSettingsViewEvent, CoachSettingsViewModel coachSettingsViewModel, InterfaceC30057d<? super C60691> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$viewEvent = coachSettingsViewEvent;
            this.this$0 = coachSettingsViewModel;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C60691(this.$viewEvent, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C60691) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.$viewEvent instanceof CoachSettingsViewEvent.Toggle) {
                    this.this$0.analyticsHelper.m123085w(((CoachSettingsViewEvent.Toggle) this.$viewEvent).getKey(), ((CoachSettingsViewEvent.Toggle) this.$viewEvent).getEnabled());
                }
                InterfaceC13072o1 interfaceC13072o1 = this.this$0.viewEvents;
                CoachSettingsViewEvent coachSettingsViewEvent = this.$viewEvent;
                this.label = 1;
                if (interfaceC13072o1.emit(coachSettingsViewEvent, this) == enumC31071a) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoachSettingsViewModel(InterfaceC2994c0 coroutineScope, CoachSettingsInteractor interactor, CoachSettingsViewStateReducer reducer, C38423a analyticsHelper) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.coroutineScope = coroutineScope;
        this.reducer = reducer;
        this.analyticsHelper = analyticsHelper;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, null, 6);
        this.viewEvents = c13096w1M36592b;
        final InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new C13015a0(new CoachSettingsViewModel$viewState$1(null), c13096w1M36592b), interactor);
        this.viewState = new InterfaceC13058l() { // from class: com.whoop.bot.settings.CoachSettingsViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsViewModel$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C60702<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ CoachSettingsViewModel this$0;

                /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsViewModel$special$$inlined$map$1$2", m100430f = "CoachSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
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
                        return C60702.this.emit(null, this);
                    }
                }

                public C60702(InterfaceC13062m interfaceC13062m, CoachSettingsViewModel coachSettingsViewModel) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.this$0 = coachSettingsViewModel;
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
                        CoachSettingsViewState coachSettingsViewStateReduce = this.this$0.reducer.reduce((CoachSettingsDomainState) obj);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(coachSettingsViewStateReduce, anonymousClass1) == enumC31071a) {
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
                Object objCollect = interfaceC13058lM83945a.collect(new C60702(interfaceC13062m, this), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    public final void sendViewEvent(CoachSettingsViewEvent viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new C60691(viewEvent, this, null), 3);
    }

    public /* synthetic */ CoachSettingsViewModel(InterfaceC2994c0 interfaceC2994c0, CoachSettingsInteractor coachSettingsInteractor, CoachSettingsViewStateReducer coachSettingsViewStateReducer, C38423a c38423a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, coachSettingsInteractor, coachSettingsViewStateReducer, c38423a);
    }
}
