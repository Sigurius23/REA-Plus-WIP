package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;", "", "id", "", "pollId", "optionId", "createdAt", "Ljava/util/Date;", "updatedAt", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPollId", "getOptionId", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getUserId", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class VoteEntity {
    private final Date createdAt;
    private final String id;
    private final String optionId;
    private final String pollId;
    private final Date updatedAt;
    private final String userId;

    public VoteEntity(String id4, String pollId, String optionId, Date createdAt, Date updatedAt, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(optionId, "optionId");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.id = id4;
        this.pollId = pollId;
        this.optionId = optionId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.userId = str;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOptionId() {
        return this.optionId;
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }
}
