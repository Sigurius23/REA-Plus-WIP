package com.whoop.profile.domain.edit;

import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$interact$$inlined$flatMapLatest$2", m100430f = "EditProfileInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class EditProfileInteractor$interact$$inlined$flatMapLatest$2 extends AbstractC32275i implements Function3 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EditProfileInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileInteractor$interact$$inlined$flatMapLatest$2(InterfaceC30057d interfaceC30057d, EditProfileInteractor editProfileInteractor) {
        super(3, interfaceC30057d);
        this.this$0 = editProfileInteractor;
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, EditProfileInteractor.InternalState internalState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        EditProfileInteractor$interact$$inlined$flatMapLatest$2 editProfileInteractor$interact$$inlined$flatMapLatest$2 = new EditProfileInteractor$interact$$inlined$flatMapLatest$2(interfaceC30057d, this.this$0);
        editProfileInteractor$interact$$inlined$flatMapLatest$2.L$0 = interfaceC13062m;
        editProfileInteractor$interact$$inlined$flatMapLatest$2.L$1 = internalState;
        return editProfileInteractor$interact$$inlined$flatMapLatest$2.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        InterfaceC13058l c0456u;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            EditProfileInteractor.InternalState internalState = (EditProfileInteractor.InternalState) this.L$1;
            if (internalState.getPendingSaveRequest() != null) {
                obj2 = null;
                final C13060l1 c13060l1 = new C13060l1(EditProfileInteractor.InternalState.copy$default(internalState, null, false, true, false, null, null, null, null, false, false, null, null, false, false, null, null, false, null, null, 524179, null), this.this$0.handleSave(this.this$0.createUpdateRequestFromFormState(internalState.getPendingSaveRequest(), internalState.getResponse()), internalState.getResponse()), new EditProfileInteractor$interact$3$1(null));
                c0456u = new InterfaceC13058l() { // from class: com.whoop.profile.domain.edit.EditProfileInteractor$interact$lambda$1$$inlined$map$1

                    /* JADX INFO: renamed from: com.whoop.profile.domain.edit.EditProfileInteractor$interact$lambda$1$$inlined$map$1$2 */
                    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                    public static final class C97062<T> implements InterfaceC13062m {
                        final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.whoop.profile.domain.edit.EditProfileInteractor$interact$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                        @InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$interact$lambda$1$$inlined$map$1$2", m100430f = "EditProfileInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
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
                                return C97062.this.emit(null, this);
                            }
                        }

                        public C97062(InterfaceC13062m interfaceC13062m) {
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
                                EditProfileDomainState domainState = ((EditProfileInteractor.InternalState) obj).toDomainState();
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC13062m.emit(domainState, anonymousClass1) == enumC31071a) {
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
                    public Object collect(InterfaceC13062m interfaceC13062m2, InterfaceC30057d interfaceC30057d) {
                        Object objCollect = c13060l1.collect(new C97062(interfaceC13062m2), interfaceC30057d);
                        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                    }
                };
            } else {
                obj2 = null;
                if (internalState.getAvatarRefreshNeeded()) {
                    final C13060l1 c13060l2 = new C13060l1(EditProfileInteractor.InternalState.copy$default(internalState, null, false, false, false, null, null, null, null, false, false, null, null, false, false, null, null, false, null, null, 520191, null), this.this$0.handleRefresh(true), new EditProfileInteractor$interact$3$3(null));
                    c0456u = new InterfaceC13058l() { // from class: com.whoop.profile.domain.edit.EditProfileInteractor$interact$lambda$1$$inlined$map$2

                        /* JADX INFO: renamed from: com.whoop.profile.domain.edit.EditProfileInteractor$interact$lambda$1$$inlined$map$2$2 */
                        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                        public static final class C97072<T> implements InterfaceC13062m {
                            final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                            /* JADX INFO: renamed from: com.whoop.profile.domain.edit.EditProfileInteractor$interact$lambda$1$$inlined$map$2$2$1, reason: invalid class name */
                            @InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$interact$lambda$1$$inlined$map$2$2", m100430f = "EditProfileInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
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
                                    return C97072.this.emit(null, this);
                                }
                            }

                            public C97072(InterfaceC13062m interfaceC13062m) {
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
                                    EditProfileDomainState domainState = ((EditProfileInteractor.InternalState) obj).toDomainState();
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if (interfaceC13062m.emit(domainState, anonymousClass1) == enumC31071a) {
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
                        public Object collect(InterfaceC13062m interfaceC13062m2, InterfaceC30057d interfaceC30057d) {
                            Object objCollect = c13060l2.collect(new C97072(interfaceC13062m2), interfaceC30057d);
                            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                        }
                    };
                } else {
                    c0456u = new C0456u(internalState.toDomainState(), 1);
                }
            }
            this.L$0 = obj2;
            this.L$1 = obj2;
            this.label = 1;
            if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
        return invoke((InterfaceC13062m) obj, (EditProfileInteractor.InternalState) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
    }
}
