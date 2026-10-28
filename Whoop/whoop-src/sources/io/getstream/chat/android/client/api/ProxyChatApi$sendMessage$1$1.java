package io.getstream.chat.android.client.api;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.interceptor.SendMessageInterceptor;
import io.getstream.chat.android.models.Message;
import l83.C23454a0;
import n23.AbstractC26205h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.ProxyChatApi$sendMessage$1$1", m100430f = "ProxyChatApi.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ProxyChatApi$sendMessage$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ String $channelId;
    final /* synthetic */ String $channelType;
    final /* synthetic */ SendMessageInterceptor $it;
    final /* synthetic */ Message $message;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProxyChatApi$sendMessage$1$1(SendMessageInterceptor sendMessageInterceptor, String str, String str2, Message message, InterfaceC30057d<? super ProxyChatApi$sendMessage$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$it = sendMessageInterceptor;
        this.$channelType = str;
        this.$channelId = str2;
        this.$message = message;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new ProxyChatApi$sendMessage$1$1(this.$it, this.$channelType, this.$channelId, this.$message, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return ((ProxyChatApi$sendMessage$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        return this.$it.sendMessage(this.$channelType, this.$channelId, this.$message);
    }
}
