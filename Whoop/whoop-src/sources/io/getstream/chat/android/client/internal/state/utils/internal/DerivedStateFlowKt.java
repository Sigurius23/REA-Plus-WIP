package io.getstream.chat.android.client.internal.state.utils.internal;

import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a]\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aw\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00030\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u00022\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000fH\u0000¢\u0006\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"T1", "R", "Lec3/f2;", "Lkotlin/Function1;", "transform", "mapState", "(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;", "T2", "flow", "flow2", "Lkotlin/Function2;", "combineStates", "(Lec3/f2;Lec3/f2;Lc93/m;)Lec3/f2;", "T3", "flow3", "Lkotlin/Function3;", "(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Lec3/f2;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DerivedStateFlowKt {

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlowKt$combineStates$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlowKt$combineStates$2", m100430f = "DerivedStateFlow.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n"}, m65681d2 = {"<anonymous>", "R", "T1", "T2", "a", "b"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193752 extends AbstractC32275i implements Function3 {
        final /* synthetic */ InterfaceC4351m $transform;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193752(InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super C193752> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.$transform = interfaceC4351m;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return this.$transform.invoke(obj2, obj3);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(T1 t14, T2 t15, InterfaceC30057d<? super R> interfaceC30057d) {
            C193752 c193752 = new C193752(this.$transform, interfaceC30057d);
            c193752.L$0 = t14;
            c193752.L$1 = t15;
            return c193752.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlowKt$combineStates$4 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlowKt$combineStates$4", m100430f = "DerivedStateFlow.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0004\n\u0002\b\b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0004\b\u0003\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u00032\u0006\u0010\u0007\u001a\u0002H\u0004H\n"}, m65681d2 = {"<anonymous>", "R", "T1", "T2", "T3", "a", "b", "c"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193764 extends AbstractC32275i implements InterfaceC4352n {
        final /* synthetic */ Function3 $transform;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193764(Function3 function3, InterfaceC30057d<? super C193764> interfaceC30057d) {
            super(4, interfaceC30057d);
            this.$transform = function3;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            Object obj4 = this.L$2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return this.$transform.invoke(obj2, obj3, obj4);
        }

        @Override // c93.InterfaceC4352n
        public final Object invoke(T1 t14, T2 t15, T3 t16, InterfaceC30057d<? super R> interfaceC30057d) {
            C193764 c193764 = new C193764(this.$transform, interfaceC30057d);
            c193764.L$0 = t14;
            c193764.L$1 = t15;
            c193764.L$2 = t16;
            return c193764.invokeSuspend(C23454a0.f92919a);
        }
    }

    public static final <T1, T2, R> InterfaceC13037f2 combineStates(InterfaceC13037f2 flow, InterfaceC13037f2 flow2, InterfaceC4351m transform) {
        AbstractC22676k.m65750j(flow, "flow");
        AbstractC22676k.m65750j(flow2, "flow2");
        AbstractC22676k.m65750j(transform, "transform");
        return new DerivedStateFlow(new C19380c(transform, flow, flow2, 0), new C13060l1(flow, flow2, new C193752(transform, null), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object combineStates$lambda$3(Function3 function3, InterfaceC13037f2 interfaceC13037f2, InterfaceC13037f2 interfaceC13037f3, InterfaceC13037f2 interfaceC13037f4) {
        return function3.invoke(interfaceC13037f2.getValue(), interfaceC13037f3.getValue(), interfaceC13037f4.getValue());
    }

    public static final <T1, R> InterfaceC13037f2 mapState(final InterfaceC13037f2 interfaceC13037f2, final Function1 transform) {
        AbstractC22676k.m65750j(interfaceC13037f2, "<this>");
        AbstractC22676k.m65750j(transform, "transform");
        return new DerivedStateFlow(new C19379b(0, interfaceC13037f2, transform), new InterfaceC13058l() { // from class: io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlowKt$mapState$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlowKt$mapState$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C193772<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ Function1 $transform$inlined$1;

                /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlowKt$mapState$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlowKt$mapState$$inlined$map$1$2", m100430f = "DerivedStateFlow.kt", m100431l = {50}, m100432m = "emit")
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
                        return C193772.this.emit(null, this);
                    }
                }

                public C193772(InterfaceC13062m interfaceC13062m, Function1 function1) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.$transform$inlined$1 = function1;
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
                        Object objInvoke = this.$transform$inlined$1.invoke(obj);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(objInvoke, anonymousClass1) == enumC31071a) {
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
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = interfaceC13037f2.collect(new C193772(interfaceC13062m, transform), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        });
    }

    public static final <T1, T2, T3, R> InterfaceC13037f2 combineStates(InterfaceC13037f2 flow, InterfaceC13037f2 flow2, InterfaceC13037f2 flow3, Function3 transform) {
        AbstractC22676k.m65750j(flow, "flow");
        AbstractC22676k.m65750j(flow2, "flow2");
        AbstractC22676k.m65750j(flow3, "flow3");
        AbstractC22676k.m65750j(transform, "transform");
        return new DerivedStateFlow(new C19378a(transform, flow, flow2, flow3, 0), AbstractC13091v.m36606p(flow, flow2, flow3, new C193764(transform, null)));
    }
}
