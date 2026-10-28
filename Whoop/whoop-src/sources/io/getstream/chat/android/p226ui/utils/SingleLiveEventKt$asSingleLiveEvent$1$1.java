package io.getstream.chat.android.p226ui.utils;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.utils.SingleLiveEventKt$asSingleLiveEvent$1$1", m100430f = "SingleLiveEvent.kt", m100431l = {59}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class SingleLiveEventKt$asSingleLiveEvent$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ SingleLiveEvent<T> $this_apply;
    final /* synthetic */ InterfaceC13058l $this_asSingleLiveEvent;
    int label;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.utils.SingleLiveEventKt$asSingleLiveEvent$1$1$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C199011 implements InterfaceC13062m, InterfaceC22666f {
        final /* synthetic */ SingleLiveEvent<T> $tmp0;

        public C199011(SingleLiveEvent<T> singleLiveEvent) {
            this.$tmp0 = singleLiveEvent;
        }

        @Override // ec3.InterfaceC13062m
        public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            SingleLiveEventKt$asSingleLiveEvent$1$1.access$invokeSuspend$postValue(this.$tmp0, t14, interfaceC30057d);
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            return C23454a0.f92919a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC13062m) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return new C22656a(2, 4, SingleLiveEvent.class, this.$tmp0, "postValue", "postValue(Ljava/lang/Object;)V");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleLiveEventKt$asSingleLiveEvent$1$1(InterfaceC13058l interfaceC13058l, SingleLiveEvent<T> singleLiveEvent, InterfaceC30057d<? super SingleLiveEventKt$asSingleLiveEvent$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$this_asSingleLiveEvent = interfaceC13058l;
        this.$this_apply = singleLiveEvent;
    }

    public static final /* synthetic */ Object access$invokeSuspend$postValue(SingleLiveEvent singleLiveEvent, Object obj, InterfaceC30057d interfaceC30057d) {
        invokeSuspend$postValue(singleLiveEvent, obj, interfaceC30057d);
        return C23454a0.f92919a;
    }

    private static final /* synthetic */ Object invokeSuspend$postValue(SingleLiveEvent singleLiveEvent, Object obj, InterfaceC30057d interfaceC30057d) {
        singleLiveEvent.postValue(obj);
        return C23454a0.f92919a;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new SingleLiveEventKt$asSingleLiveEvent$1$1(this.$this_asSingleLiveEvent, this.$this_apply, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((SingleLiveEventKt$asSingleLiveEvent$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13058l interfaceC13058l = this.$this_asSingleLiveEvent;
            C199011 c199011 = new C199011(this.$this_apply);
            this.label = 1;
            if (interfaceC13058l.collect(c199011, this) == enumC31071a) {
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
