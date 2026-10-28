package com.whoop.profile.presentation;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.profile.domain.ProfileDomainAction;
import com.whoop.profile.domain.ProfileDomainState;
import com.whoop.profile.domain.ProfileInteractor;
import com.whoop.profile.presentation.reducers.ProfileViewStateReducer;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewModel;", "Landroidx/lifecycle/w1;", "Lcom/whoop/profile/domain/ProfileInteractor;", "interactor", "Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/profile/domain/ProfileInteractor;Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;Lbc3/c0;)V", "Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;", "Lcom/whoop/profile/domain/ProfileDomainAction;", "toDomainAction", "(Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;)Lcom/whoop/profile/domain/ProfileDomainAction;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "sendViewEvent", "(Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;)V", "Lcom/whoop/profile/domain/ProfileInteractor;", "Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;", "Lbc3/c0;", "Lec3/o1;", "eventFlow", "Lec3/o1;", "Lec3/t1;", "Lcom/whoop/profile/domain/ProfileDomainState;", "domainStateFlow", "Lec3/t1;", "Lec3/l;", "Lcom/whoop/profile/presentation/ProfileViewState;", "viewState", "Lec3/l;", "getViewState", "()Lec3/l;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileViewModel extends AbstractC1637w1 {
    public static final int $stable = 8;
    private final InterfaceC2994c0 coroutineScope;
    private final InterfaceC13087t1 domainStateFlow;
    private final InterfaceC13072o1 eventFlow;
    private final ProfileInteractor interactor;
    private final ProfileViewStateReducer reducer;
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: com.whoop.profile.presentation.ProfileViewModel$sendViewEvent$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.presentation.ProfileViewModel$sendViewEvent$1", m100430f = "ProfileViewModel.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C97111 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ ProfileEvent.ViewEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97111(ProfileEvent.ViewEvent viewEvent, InterfaceC30057d<? super C97111> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$event = viewEvent;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ProfileViewModel.this.new C97111(this.$event, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C97111) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = ProfileViewModel.this.eventFlow;
                ProfileEvent.ViewEvent viewEvent = this.$event;
                this.label = 1;
                if (interfaceC13072o1.emit(viewEvent, this) == enumC31071a) {
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
    public ProfileViewModel(ProfileInteractor interactor, ProfileViewStateReducer reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        final C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, null, 6);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lProfileStateFlow = interactor.profileStateFlow(new InterfaceC13058l() { // from class: com.whoop.profile.presentation.ProfileViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: com.whoop.profile.presentation.ProfileViewModel$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C97122<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ ProfileViewModel this$0;

                /* JADX INFO: renamed from: com.whoop.profile.presentation.ProfileViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.profile.presentation.ProfileViewModel$special$$inlined$map$1$2", m100430f = "ProfileViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
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
                        return C97122.this.emit(null, this);
                    }
                }

                public C97122(InterfaceC13062m interfaceC13062m, ProfileViewModel profileViewModel) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.this$0 = profileViewModel;
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
                        ProfileDomainAction domainAction = this.this$0.toDomainAction((ProfileEvent.ViewEvent) obj);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(domainAction, anonymousClass1) == enumC31071a) {
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
                Object objCollect = c13096w1M36592b.collect(new C97122(interfaceC13062m, this), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        });
        C13021b2 c13021b2 = C13105z1.f45288a;
        final C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lProfileStateFlow, coroutineScope, c13021b2, 1);
        this.domainStateFlow = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new InterfaceC13058l() { // from class: com.whoop.profile.presentation.ProfileViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: com.whoop.profile.presentation.ProfileViewModel$special$$inlined$map$2$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C97132<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ ProfileViewModel this$0;

                /* JADX INFO: renamed from: com.whoop.profile.presentation.ProfileViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.profile.presentation.ProfileViewModel$special$$inlined$map$2$2", m100430f = "ProfileViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
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
                        return C97132.this.emit(null, this);
                    }
                }

                public C97132(InterfaceC13062m interfaceC13062m, ProfileViewModel profileViewModel) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.this$0 = profileViewModel;
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
                        ProfileViewState profileViewStateReduce = this.this$0.reducer.reduce((ProfileDomainState) obj);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(profileViewStateReduce, anonymousClass1) == enumC31071a) {
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
                Object objCollect = c13078q1M36586L.collect(new C97132(interfaceC13062m, this), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, coroutineScope, c13021b2, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfileDomainAction toDomainAction(ProfileEvent.ViewEvent viewEvent) {
        if (viewEvent instanceof ProfileEvent.Refresh) {
            return ProfileDomainAction.Refresh.INSTANCE;
        }
        if (viewEvent instanceof ProfileEvent.Report) {
            return ProfileDomainAction.Report.INSTANCE;
        }
        if (viewEvent instanceof ProfileEvent.DismissReportDialog) {
            return ProfileDomainAction.DismissReportDialog.INSTANCE;
        }
        if (viewEvent instanceof ProfileEvent.PresentDesignModal) {
            return new ProfileDomainAction.PresentModal(((ProfileEvent.PresentDesignModal) viewEvent).getModal());
        }
        if (viewEvent instanceof ProfileEvent.DismissDesignModal) {
            return ProfileDomainAction.DismissModal.INSTANCE;
        }
        if (viewEvent instanceof ProfileEvent.ExecuteWhoopAction) {
            ProfileEvent.ExecuteWhoopAction executeWhoopAction = (ProfileEvent.ExecuteWhoopAction) viewEvent;
            return new ProfileDomainAction.PerformAction(executeWhoopAction.getAction(), executeWhoopAction.getCardButtonId());
        }
        if (viewEvent instanceof ProfileEvent.ConsumeSideEffects) {
            return ProfileDomainAction.ConsumeSideEffects.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    public final void sendViewEvent(ProfileEvent.ViewEvent event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new C97111(event, null), 3);
    }

    public /* synthetic */ ProfileViewModel(ProfileInteractor profileInteractor, ProfileViewStateReducer profileViewStateReducer, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(profileInteractor, profileViewStateReducer, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
