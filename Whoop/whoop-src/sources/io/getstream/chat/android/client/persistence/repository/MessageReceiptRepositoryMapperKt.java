package io.getstream.chat.android.client.persistence.repository;

import io.getstream.chat.android.client.persistence.p225db.entity.MessageReceiptEntity;
import io.getstream.chat.android.client.receipts.MessageReceipt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, m65681d2 = {"toEntity", "Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;", "Lio/getstream/chat/android/client/receipts/MessageReceipt;", "toModel", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageReceiptRepositoryMapperKt {
    public static final MessageReceiptEntity toEntity(MessageReceipt messageReceipt) {
        AbstractC22676k.m65750j(messageReceipt, "<this>");
        return new MessageReceiptEntity(messageReceipt.getMessageId(), messageReceipt.getCid(), messageReceipt.getCreatedAt());
    }

    public static final MessageReceipt toModel(MessageReceiptEntity messageReceiptEntity) {
        AbstractC22676k.m65750j(messageReceiptEntity, "<this>");
        return new MessageReceipt(messageReceiptEntity.getMessageId(), messageReceiptEntity.getCid(), messageReceiptEntity.getCreatedAt());
    }
}
