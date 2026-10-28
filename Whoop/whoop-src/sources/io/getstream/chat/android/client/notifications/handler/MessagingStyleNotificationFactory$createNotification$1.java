package io.getstream.chat.android.client.notifications.handler;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.notifications.handler.MessagingStyleNotificationFactory", m100430f = "MessagingStyleNotificationFactory.kt", m100431l = {108, 111, 119, 122}, m100432m = "createNotification$stream_chat_android_client_release")
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessagingStyleNotificationFactory$createNotification$1 extends AbstractC32269c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessagingStyleNotificationFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagingStyleNotificationFactory$createNotification$1(MessagingStyleNotificationFactory messagingStyleNotificationFactory, InterfaceC30057d<? super MessagingStyleNotificationFactory$createNotification$1> interfaceC30057d) {
        super(interfaceC30057d);
        this.this$0 = messagingStyleNotificationFactory;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createNotification$stream_chat_android_client_release(null, this);
    }
}
