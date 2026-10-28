package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll;

import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$special$$inlined$flatMapLatest$1", m100430f = "CreatePollViewModel.kt", m100431l = {189}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class CreatePollViewModel$special$$inlined$flatMapLatest$1 extends AbstractC32275i implements Function3 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CreatePollViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePollViewModel$special$$inlined$flatMapLatest$1(InterfaceC30057d interfaceC30057d, CreatePollViewModel createPollViewModel) {
        super(3, interfaceC30057d);
        this.this$0 = createPollViewModel;
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, C23454a0 c23454a0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        CreatePollViewModel$special$$inlined$flatMapLatest$1 createPollViewModel$special$$inlined$flatMapLatest$1 = new CreatePollViewModel$special$$inlined$flatMapLatest$1(interfaceC30057d, this.this$0);
        createPollViewModel$special$$inlined$flatMapLatest$1.L$0 = interfaceC13062m;
        createPollViewModel$special$$inlined$flatMapLatest$1.L$1 = c23454a0;
        return createPollViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            final InterfaceC13037f2 pollIsReady = this.this$0.getPollIsReady();
            InterfaceC13058l interfaceC13058l = new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$createPollParams$lambda$2$$inlined$filter$1

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$createPollParams$lambda$2$$inlined$filter$1$2 */
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class C196952<T> implements InterfaceC13062m {
                    final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$createPollParams$lambda$2$$inlined$filter$1$2$1, reason: invalid class name */
                    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$createPollParams$lambda$2$$inlined$filter$1$2", m100430f = "CreatePollViewModel.kt", m100431l = {50}, m100432m = "emit")
                    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
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
                            return C196952.this.emit(null, this);
                        }
                    }

                    public C196952(InterfaceC13062m interfaceC13062m) {
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
                            if (((Boolean) obj).booleanValue()) {
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
                public final Object collect(InterfaceC13062m interfaceC13062m2, InterfaceC30057d interfaceC30057d) {
                    Object objCollect = pollIsReady.collect(new C196952(interfaceC13062m2), interfaceC30057d);
                    return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058l, this) == enumC31071a) {
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
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC13062m) obj, (C23454a0) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
    }
}
