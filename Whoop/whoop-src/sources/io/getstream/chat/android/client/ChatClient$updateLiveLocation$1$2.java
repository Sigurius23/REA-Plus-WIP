package io.getstream.chat.android.client;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.plugin.Plugin;
import io.getstream.chat.android.models.Location;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import n23.AbstractC26205h;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$updateLiveLocation$1$2", m100430f = "ChatClient.kt", m100431l = {1939}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Location;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChatClient$updateLiveLocation$1$2 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ Location $location;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ ChatClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatClient$updateLiveLocation$1$2(ChatClient chatClient, Location location, InterfaceC30057d<? super ChatClient$updateLiveLocation$1$2> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = chatClient;
        this.$location = location;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        ChatClient$updateLiveLocation$1$2 chatClient$updateLiveLocation$1$2 = new ChatClient$updateLiveLocation$1$2(this.this$0, this.$location, interfaceC30057d);
        chatClient$updateLiveLocation$1$2.L$0 = obj;
        return chatClient$updateLiveLocation$1$2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Location location;
        ChatClient chatClient;
        Iterator it;
        int i13;
        C23454a0 c23454a0;
        AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = this.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            List<Plugin> plugins = this.this$0.getPlugins();
            ChatClient chatClient2 = this.this$0;
            location = this.$location;
            chatClient = chatClient2;
            it = plugins.iterator();
            i13 = 0;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = this.I$0;
            it = (Iterator) this.L$4;
            location = (Location) this.L$3;
            chatClient = (ChatClient) this.L$2;
            AbstractC34132o.m107864I(obj);
        }
        do {
            boolean zHasNext = it.hasNext();
            c23454a0 = C23454a0.f92919a;
            if (!zHasNext) {
                return c23454a0;
            }
            Plugin plugin = (Plugin) it.next();
            C2345k logger = chatClient.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[updateLiveLocation] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
            }
            this.L$0 = abstractC26205h;
            this.L$1 = null;
            this.L$2 = chatClient;
            this.L$3 = location;
            this.L$4 = it;
            this.L$5 = null;
            this.L$6 = null;
            this.I$0 = i13;
            this.I$1 = 0;
            this.label = 1;
            plugin.onUpdateLiveLocationResult(location, abstractC26205h, this);
        } while (c23454a0 != enumC31071a);
        return enumC31071a;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((ChatClient$updateLiveLocation$1$2) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
