package io.getstream.chat.android.client.internal.state.plugin.logic.internal;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry$thread$1$1$1", m100430f = "LogicRegistry.kt", m100431l = {232, 234}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class LogicRegistry$thread$1$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ String $messageId;
    final /* synthetic */ ThreadLogic $threadLogic;
    Object L$0;
    int label;
    final /* synthetic */ LogicRegistry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogicRegistry$thread$1$1$1(LogicRegistry logicRegistry, String str, ThreadLogic threadLogic, InterfaceC30057d<? super LogicRegistry$thread$1$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = logicRegistry;
        this.$messageId = str;
        this.$threadLogic = threadLogic;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new LogicRegistry$thread$1$1$1(this.this$0, this.$messageId, this.$threadLogic, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((LogicRegistry$thread$1$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r5 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r5 == r0) goto L20;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r4.L$0
            io.getstream.chat.android.models.Message r0 = (io.getstream.chat.android.models.Message) r0
            p505ts.AbstractC34132o.m107864I(r5)
            goto L5d
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1c:
            p505ts.AbstractC34132o.m107864I(r5)
            goto L3e
        L20:
            p505ts.AbstractC34132o.m107864I(r5)
            io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry r5 = r4.this$0
            java.lang.String r1 = r4.$messageId
            io.getstream.chat.android.models.Message r5 = r5.getMessageById(r1)
            if (r5 != 0) goto L40
            io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry r5 = r4.this$0
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade r5 = io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry.access$getRepos$p(r5)
            java.lang.String r1 = r4.$messageId
            r4.label = r3
            java.lang.Object r5 = r5.selectMessage(r1, r4)
            if (r5 != r0) goto L3e
            goto L5c
        L3e:
            io.getstream.chat.android.models.Message r5 = (io.getstream.chat.android.models.Message) r5
        L40:
            if (r5 == 0) goto L47
            io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic r1 = r4.$threadLogic
            r1.upsertMessage$stream_chat_android_client_release(r5)
        L47:
            io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry r5 = r4.this$0
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade r5 = io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry.access$getRepos$p(r5)
            java.lang.String r1 = r4.$messageId
            r3 = 0
            r4.L$0 = r3
            r4.label = r2
            r2 = 30
            java.lang.Object r5 = r5.selectMessagesForThread(r1, r2, r4)
            if (r5 != r0) goto L5d
        L5c:
            return r0
        L5d:
            io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic r0 = r4.$threadLogic
            java.util.List r5 = (java.util.List) r5
            r0.upsertMessages$stream_chat_android_client_release(r5)
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry$thread$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
