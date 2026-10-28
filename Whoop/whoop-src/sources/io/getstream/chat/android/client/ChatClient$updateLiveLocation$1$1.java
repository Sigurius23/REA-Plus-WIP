package io.getstream.chat.android.client;

import c93.InterfaceC4351m;
import io.getstream.chat.android.client.plugin.Plugin;
import io.getstream.chat.android.models.Location;
import l83.C23454a0;
import n23.AbstractC26205h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$updateLiveLocation$1$1", m100430f = "ChatClient.kt", m100431l = {1935}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChatClient$updateLiveLocation$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ Location $location;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatClient$updateLiveLocation$1$1(Location location, InterfaceC30057d<? super ChatClient$updateLiveLocation$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$location = location;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        ChatClient$updateLiveLocation$1$1 chatClient$updateLiveLocation$1$1 = new ChatClient$updateLiveLocation$1$1(this.$location, interfaceC30057d);
        chatClient$updateLiveLocation$1$1.L$0 = obj;
        return chatClient$updateLiveLocation$1$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return ((ChatClient$updateLiveLocation$1$1) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Plugin plugin = (Plugin) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        Location location = this.$location;
        this.L$0 = null;
        this.label = 1;
        Object objOnUpdateLiveLocationPrecondition = plugin.onUpdateLiveLocationPrecondition(location, this);
        return objOnUpdateLiveLocationPrecondition == enumC31071a ? enumC31071a : objOnUpdateLiveLocationPrecondition;
    }
}
