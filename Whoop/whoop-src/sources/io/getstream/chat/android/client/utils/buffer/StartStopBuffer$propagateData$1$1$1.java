package io.getstream.chat.android.client.utils.buffer;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.utils.buffer.StartStopBuffer$propagateData$1$1$1", m100430f = "StartStopBuffer.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class StartStopBuffer$propagateData$1$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ T $it;
    int label;
    final /* synthetic */ StartStopBuffer<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartStopBuffer$propagateData$1$1$1(StartStopBuffer<T> startStopBuffer, T t14, InterfaceC30057d<? super StartStopBuffer$propagateData$1$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = startStopBuffer;
        this.$it = t14;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new StartStopBuffer$propagateData$1$1$1(this.this$0, this.$it, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((StartStopBuffer$propagateData$1$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        Function1 function1 = ((StartStopBuffer) this.this$0).func;
        if (function1 == null) {
            return null;
        }
        function1.invoke(this.$it);
        return C23454a0.f92919a;
    }
}
