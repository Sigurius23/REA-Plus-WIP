package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;", "", "messageInnerEntity", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;", "attachments", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;", "ownReactions", "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;", "latestReactions", "<init>", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMessageInnerEntity", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;", "getAttachments", "()Ljava/util/List;", "getOwnReactions", "getLatestReactions", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageEntity {
    private final List<AttachmentEntity> attachments;
    private final List<ReactionEntity> latestReactions;
    private final MessageInnerEntity messageInnerEntity;
    private final List<ReactionEntity> ownReactions;

    public MessageEntity(MessageInnerEntity messageInnerEntity, List<AttachmentEntity> attachments, List<ReactionEntity> ownReactions, List<ReactionEntity> latestReactions) {
        AbstractC22676k.m65750j(messageInnerEntity, "messageInnerEntity");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(ownReactions, "ownReactions");
        AbstractC22676k.m65750j(latestReactions, "latestReactions");
        this.messageInnerEntity = messageInnerEntity;
        this.attachments = attachments;
        this.ownReactions = ownReactions;
        this.latestReactions = latestReactions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageEntity copy$default(MessageEntity messageEntity, MessageInnerEntity messageInnerEntity, List list, List list2, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            messageInnerEntity = messageEntity.messageInnerEntity;
        }
        if ((i13 & 2) != 0) {
            list = messageEntity.attachments;
        }
        if ((i13 & 4) != 0) {
            list2 = messageEntity.ownReactions;
        }
        if ((i13 & 8) != 0) {
            list3 = messageEntity.latestReactions;
        }
        return messageEntity.copy(messageInnerEntity, list, list2, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageInnerEntity getMessageInnerEntity() {
        return this.messageInnerEntity;
    }

    public final List<AttachmentEntity> component2() {
        return this.attachments;
    }

    public final List<ReactionEntity> component3() {
        return this.ownReactions;
    }

    public final List<ReactionEntity> component4() {
        return this.latestReactions;
    }

    public final MessageEntity copy(MessageInnerEntity messageInnerEntity, List<AttachmentEntity> attachments, List<ReactionEntity> ownReactions, List<ReactionEntity> latestReactions) {
        AbstractC22676k.m65750j(messageInnerEntity, "messageInnerEntity");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(ownReactions, "ownReactions");
        AbstractC22676k.m65750j(latestReactions, "latestReactions");
        return new MessageEntity(messageInnerEntity, attachments, ownReactions, latestReactions);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageEntity)) {
            return false;
        }
        MessageEntity messageEntity = (MessageEntity) other;
        return AbstractC22676k.m65745e(this.messageInnerEntity, messageEntity.messageInnerEntity) && AbstractC22676k.m65745e(this.attachments, messageEntity.attachments) && AbstractC22676k.m65745e(this.ownReactions, messageEntity.ownReactions) && AbstractC22676k.m65745e(this.latestReactions, messageEntity.latestReactions);
    }

    public final List<AttachmentEntity> getAttachments() {
        return this.attachments;
    }

    public final List<ReactionEntity> getLatestReactions() {
        return this.latestReactions;
    }

    public final MessageInnerEntity getMessageInnerEntity() {
        return this.messageInnerEntity;
    }

    public final List<ReactionEntity> getOwnReactions() {
        return this.ownReactions;
    }

    public final int hashCode() {
        return this.latestReactions.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.messageInnerEntity.hashCode() * 31, 31, this.attachments), 31, this.ownReactions);
    }

    public final String toString() {
        MessageInnerEntity messageInnerEntity = this.messageInnerEntity;
        List<AttachmentEntity> list = this.attachments;
        List<ReactionEntity> list2 = this.ownReactions;
        List<ReactionEntity> list3 = this.latestReactions;
        StringBuilder sb4 = new StringBuilder("MessageEntity(messageInnerEntity=");
        sb4.append(messageInnerEntity);
        sb4.append(", attachments=");
        sb4.append(list);
        sb4.append(", ownReactions=");
        return AbstractC30007c.m91843m(sb4, list2, ", latestReactions=", list3, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MessageEntity(MessageInnerEntity messageInnerEntity, List list, List list2, List list3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 4;
        C25271y c25271y = C25271y.f99162w;
        this(messageInnerEntity, list, i14 != 0 ? c25271y : list2, (i13 & 8) != 0 ? c25271y : list3);
    }
}
