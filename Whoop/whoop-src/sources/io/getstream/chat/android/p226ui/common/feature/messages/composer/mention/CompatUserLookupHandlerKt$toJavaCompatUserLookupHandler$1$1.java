package io.getstream.chat.android.p226ui.common.feature.messages.composer.mention;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.mention.CompatUserLookupHandlerKt$toJavaCompatUserLookupHandler$1$1", m100430f = "CompatUserLookupHandler.kt", m100431l = {59}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class CompatUserLookupHandlerKt$toJavaCompatUserLookupHandler$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ Function1 $callback;
    final /* synthetic */ String $query;
    final /* synthetic */ UserLookupHandler $this_toJavaCompatUserLookupHandler;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompatUserLookupHandlerKt$toJavaCompatUserLookupHandler$1$1(UserLookupHandler userLookupHandler, String str, Function1 function1, InterfaceC30057d<? super CompatUserLookupHandlerKt$toJavaCompatUserLookupHandler$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$this_toJavaCompatUserLookupHandler = userLookupHandler;
        this.$query = str;
        this.$callback = function1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new CompatUserLookupHandlerKt$toJavaCompatUserLookupHandler$1$1(this.$this_toJavaCompatUserLookupHandler, this.$query, this.$callback, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((CompatUserLookupHandlerKt$toJavaCompatUserLookupHandler$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            UserLookupHandler userLookupHandler = this.$this_toJavaCompatUserLookupHandler;
            String str = this.$query;
            this.label = 1;
            obj = userLookupHandler.handleUserLookup(str, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        this.$callback.invoke((List) obj);
        return C23454a0.f92919a;
    }
}
