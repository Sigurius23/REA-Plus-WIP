package io.getstream.chat.android.client;

import c93.InterfaceC4351m;
import io.getstream.chat.android.models.DraftMessage;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$createDraftMessage$1$1", m100430f = "ChatClient.kt", m100431l = {2603}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/DraftMessage;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChatClient$createDraftMessage$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ String $channelId;
    final /* synthetic */ String $channelType;
    final /* synthetic */ DraftMessage $processedDraftMessage;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ ChatClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatClient$createDraftMessage$1$1(ChatClient chatClient, String str, String str2, DraftMessage draftMessage, InterfaceC30057d<? super ChatClient$createDraftMessage$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = chatClient;
        this.$channelType = str;
        this.$channelId = str2;
        this.$processedDraftMessage = draftMessage;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        ChatClient$createDraftMessage$1$1 chatClient$createDraftMessage$1$1 = new ChatClient$createDraftMessage$1$1(this.this$0, this.$channelType, this.$channelId, this.$processedDraftMessage, interfaceC30057d);
        chatClient$createDraftMessage$1$1.L$0 = obj;
        return chatClient$createDraftMessage$1$1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00be  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f7 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f5 -> B:28:0x00f8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient$createDraftMessage$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((ChatClient$createDraftMessage$1$1) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
