package com.whoop.profile.presentation.edit;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.profile.analytics.ProfileAnalyticsHelper;
import com.whoop.profile.domain.edit.EditProfileDomainAction;
import com.whoop.profile.domain.edit.EditProfileDomainState;
import com.whoop.profile.domain.edit.EditProfileInteractor;
import com.whoop.profile.presentation.ProfileEvent;
import com.whoop.profile.presentation.edit.reducers.EditProfileViewStateReducer;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13042h;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
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
import tr2.InterfaceC34116n;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\r*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020%0\f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewModel;", "Landroidx/lifecycle/w1;", "Lcom/whoop/profile/domain/edit/EditProfileInteractor;", "interactor", "Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;", "reducer", "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;", "analyticsHelper", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lbc3/c0;)V", "Lec3/l;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", "Lcom/whoop/profile/domain/edit/EditProfileDomainState;", "interact", "(Lec3/l;)Lec3/l;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;", "toDomainAction", "(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)Lcom/whoop/profile/domain/edit/EditProfileDomainAction;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "sendViewEvent", "(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)V", "Lcom/whoop/profile/domain/edit/EditProfileInteractor;", "Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;", "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;", "Lbc3/c0;", "Ltr2/n;", "logger", "Ltr2/n;", "Lec3/o1;", "eventFlow", "Lec3/o1;", "Lec3/t1;", "domainActionFlow", "Lec3/t1;", "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateUsernameField;", "usernameValidationActionFlow", "Lec3/l;", "getUsernameValidationActionFlow$annotations", "()V", "otherActionFlow", "mergedDomainActionFlow", "Lec3/f2;", "Lcom/whoop/profile/presentation/edit/EditProfileViewState;", "viewState", "Lec3/f2;", "getViewState", "()Lec3/f2;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileViewModel extends AbstractC1637w1 {
    public static final int $stable = 8;
    private final ProfileAnalyticsHelper analyticsHelper;
    private final InterfaceC2994c0 coroutineScope;
    private final InterfaceC13087t1 domainActionFlow;
    private final InterfaceC13072o1 eventFlow;
    private final EditProfileInteractor interactor;
    private final InterfaceC34116n logger;
    private final InterfaceC13058l mergedDomainActionFlow;
    private final InterfaceC13058l otherActionFlow;
    private final EditProfileViewStateReducer reducer;
    private final InterfaceC13058l usernameValidationActionFlow;
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: com.whoop.profile.presentation.edit.EditProfileViewModel$sendViewEvent$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.presentation.edit.EditProfileViewModel$sendViewEvent$1", m100430f = "EditProfileViewModel.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C97171 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ EditProfileEvent.ViewEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97171(EditProfileEvent.ViewEvent viewEvent, InterfaceC30057d<? super C97171> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$event = viewEvent;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return EditProfileViewModel.this.new C97171(this.$event, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C97171) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = EditProfileViewModel.this.eventFlow;
                EditProfileEvent.ViewEvent viewEvent = this.$event;
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
    public EditProfileViewModel(EditProfileInteractor interactor, EditProfileViewStateReducer reducer, ProfileAnalyticsHelper analyticsHelper, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.analyticsHelper = analyticsHelper;
        this.coroutineScope = coroutineScope;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("EditProfileViewModel");
        final C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058l = new InterfaceC13058l() { // from class: com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C97182<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ EditProfileViewModel this$0;

                /* JADX INFO: renamed from: com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$map$1$2", m100430f = "EditProfileViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
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
                        return C97182.this.emit(null, this);
                    }
                }

                public C97182(InterfaceC13062m interfaceC13062m, EditProfileViewModel editProfileViewModel) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.this$0 = editProfileViewModel;
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
                        EditProfileDomainAction domainAction = this.this$0.toDomainAction((EditProfileEvent.ViewEvent) obj);
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
                Object objCollect = c13096w1M36592b.collect(new C97182(interfaceC13062m, this), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
        C13021b2 c13021b2 = C13105z1.f45288a;
        final C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058l, coroutineScope, c13021b2, 0);
        this.domainActionFlow = c13078q1M36586L;
        InterfaceC13058l interfaceC13058lM36608r = AbstractC13091v.m36608r(new InterfaceC13058l() { // from class: com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$mapNotNull$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C97202<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$mapNotNull$1$2", m100430f = "EditProfileViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C97202.this.emit(null, this);
                    }
                }

                public C97202(InterfaceC13062m interfaceC13062m) {
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
                        EditProfileDomainAction editProfileDomainAction = (EditProfileDomainAction) obj;
                        EditProfileDomainAction.ValidateUsernameField validateUsernameField = editProfileDomainAction instanceof EditProfileDomainAction.ValidateUsernameField ? (EditProfileDomainAction.ValidateUsernameField) editProfileDomainAction : null;
                        if (validateUsernameField != null) {
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC13062m.emit(validateUsernameField, anonymousClass1) == enumC31071a) {
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
                Object objCollect = c13078q1M36586L.collect(new C97202(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, 1000L);
        this.usernameValidationActionFlow = interfaceC13058lM36608r;
        InterfaceC13058l interfaceC13058l2 = new InterfaceC13058l() { // from class: com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$mapNotNull$2

            /* JADX INFO: renamed from: com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$mapNotNull$2$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C97212<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$mapNotNull$2$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$mapNotNull$2$2", m100430f = "EditProfileViewModel.kt", m100431l = {53}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C97212.this.emit(null, this);
                    }
                }

                public C97212(InterfaceC13062m interfaceC13062m) {
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
                        EditProfileDomainAction editProfileDomainAction = (EditProfileDomainAction) obj;
                        if (editProfileDomainAction instanceof EditProfileDomainAction.ValidateUsernameField) {
                            editProfileDomainAction = null;
                        }
                        if (editProfileDomainAction != null) {
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC13062m.emit(editProfileDomainAction, anonymousClass1) == enumC31071a) {
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
                Object objCollect = c13078q1M36586L.collect(new C97212(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
        this.otherActionFlow = interfaceC13058l2;
        C13042h c13042hM36584J = AbstractC13091v.m36584J(interfaceC13058lM36608r, interfaceC13058l2);
        this.mergedDomainActionFlow = c13042hM36584J;
        final InterfaceC13058l interfaceC13058lInteract = interact(c13042hM36584J);
        this.viewState = AbstractC13091v.m36587M(new InterfaceC13058l() { // from class: com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$map$2$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C97192<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ EditProfileViewModel this$0;

                /* JADX INFO: renamed from: com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.profile.presentation.edit.EditProfileViewModel$special$$inlined$map$2$2", m100430f = "EditProfileViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
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
                        return C97192.this.emit(null, this);
                    }
                }

                public C97192(InterfaceC13062m interfaceC13062m, EditProfileViewModel editProfileViewModel) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.this$0 = editProfileViewModel;
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
                        EditProfileViewState editProfileViewStateReduce = this.this$0.reducer.reduce((EditProfileDomainState) obj);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(editProfileViewStateReduce, anonymousClass1) == enumC31071a) {
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
                Object objCollect = interfaceC13058lInteract.collect(new C97192(interfaceC13062m, this), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, coroutineScope, c13021b2, new EditProfileViewState(null, null, null, null, null, null, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null));
    }

    private static /* synthetic */ void getUsernameValidationActionFlow$annotations() {
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditProfileDomainAction toDomainAction(EditProfileEvent.ViewEvent viewEvent) {
        if (viewEvent instanceof EditProfileEvent.Refresh) {
            return EditProfileDomainAction.Refresh.INSTANCE;
        }
        if (viewEvent instanceof EditProfileEvent.SaveProfile) {
            return new EditProfileDomainAction.SaveProfile(((EditProfileEvent.SaveProfile) viewEvent).getFormState());
        }
        if (viewEvent instanceof EditProfileEvent.ValidateEmailField) {
            return new EditProfileDomainAction.ValidateEmailField(((EditProfileEvent.ValidateEmailField) viewEvent).getEmail());
        }
        if (viewEvent instanceof EditProfileEvent.ValidateUsernameField) {
            return new EditProfileDomainAction.ValidateUsernameField(((EditProfileEvent.ValidateUsernameField) viewEvent).getUsername());
        }
        if (viewEvent instanceof EditProfileEvent.ClearUsernameValidation) {
            return EditProfileDomainAction.ClearUsernameValidation.INSTANCE;
        }
        if (viewEvent instanceof EditProfileEvent.HelpIconClicked) {
            return EditProfileDomainAction.Refresh.INSTANCE;
        }
        if (viewEvent instanceof EditProfileEvent.UploadAvatar) {
            return new EditProfileDomainAction.UploadAvatar(((EditProfileEvent.UploadAvatar) viewEvent).getImageData());
        }
        if (viewEvent instanceof EditProfileEvent.DeleteAvatar) {
            return EditProfileDomainAction.DeleteAvatar.INSTANCE;
        }
        if (viewEvent instanceof EditProfileEvent.AvatarUploadRetry) {
            return EditProfileDomainAction.RetryAvatarUpload.INSTANCE;
        }
        if (viewEvent instanceof EditProfileEvent.CloseAvatarModal) {
            return EditProfileDomainAction.RefreshAfterAvatarUpload.INSTANCE;
        }
        if (viewEvent instanceof EditProfileEvent.UsernameFieldTapped) {
            return EditProfileDomainAction.NoOp.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public final void sendViewEvent(EditProfileEvent.ViewEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof EditProfileEvent.SaveProfile) {
            EditProfileViewState editProfileViewState = (EditProfileViewState) this.viewState.getValue();
            EditProfileFormState formState = ((EditProfileEvent.SaveProfile) event).getFormState();
            if (editProfileViewState.getShowUsernameField() && editProfileViewState.isUsernameFieldEditable() && formState != null && !AbstractC22676k.m65745e(formState.getUsername().getValue(), editProfileViewState.getEditableFields().getUsername().getValue())) {
                this.analyticsHelper.sendAnalytics(ProfileEvent.UsernameSaveAttemptedAnalyticEvent.INSTANCE);
            }
            this.analyticsHelper.sendAnalytics(ProfileEvent.ProfileSaveTappedAnalyticEvent.INSTANCE);
        } else if (event instanceof EditProfileEvent.UsernameFieldTapped) {
            this.analyticsHelper.sendAnalytics(ProfileEvent.UsernameFieldTappedAnalyticEvent.INSTANCE);
        }
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new C97171(event, null), 3);
    }

    public /* synthetic */ EditProfileViewModel(EditProfileInteractor editProfileInteractor, EditProfileViewStateReducer editProfileViewStateReducer, ProfileAnalyticsHelper profileAnalyticsHelper, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(editProfileInteractor, editProfileViewStateReducer, profileAnalyticsHelper, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
