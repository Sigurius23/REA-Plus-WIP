package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.g */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19218g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73853w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f73854x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ MessageDao_Impl f73855y;

    public /* synthetic */ C19218g(String str, MessageDao_Impl messageDao_Impl, int i13) {
        this.f73853w = i13;
        this.f73854x = str;
        this.f73855y = messageDao_Impl;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73853w) {
            case 0:
                return MessageDao_Impl.selectDraftMessageByCid$lambda$8("SELECT * FROM stream_chat_draft_message_entity WHERE cid = ? AND parentId IS NULL", this.f73854x, this.f73855y, (InterfaceC33687a) obj);
            case 1:
                return MessageDao_Impl.m54717h(this.f73854x, this.f73855y, (InterfaceC33687a) obj);
            case 2:
                return MessageDao_Impl.select$lambda$16("SELECT * FROM stream_chat_message WHERE id IN (?)", this.f73854x, this.f73855y, (InterfaceC33687a) obj);
            case 3:
                return MessageDao_Impl.m54713d(this.f73854x, this.f73855y, (InterfaceC33687a) obj);
            default:
                return MessageDao_Impl.selectDraftMessageByParentId$lambda$9("SELECT * FROM stream_chat_draft_message_entity WHERE parentId = ?", this.f73854x, this.f73855y, (InterfaceC33687a) obj);
        }
    }
}
