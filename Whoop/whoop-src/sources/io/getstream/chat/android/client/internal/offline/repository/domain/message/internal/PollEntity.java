package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import java.util.Date;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\b\u0001\u0018\u00002\u00020\u0001BÛ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0011\u0010\u001a\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b9\u00100R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b<\u00102¨\u0006="}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;", "", "id", "", "name", "description", "options", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;", "votingVisibility", "enforceUniqueVote", "", "maxVotesAllowed", "", "allowUserSuggestedOptions", "allowAnswers", "voteCount", "voteCountsByOption", "", "votes", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;", "ownVotes", "createdAt", "Ljava/util/Date;", "updatedAt", "closed", "answersCount", "answers", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;", "createdById", "extraData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "getOptions", "()Ljava/util/List;", "getVotingVisibility", "getEnforceUniqueVote", "()Z", "getMaxVotesAllowed", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAllowUserSuggestedOptions", "getAllowAnswers", "getVoteCount", "()I", "getVoteCountsByOption", "()Ljava/util/Map;", "getVotes", "getOwnVotes", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getClosed", "getAnswersCount", "getAnswers", "getCreatedById", "getExtraData", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollEntity {
    private final boolean allowAnswers;
    private final boolean allowUserSuggestedOptions;
    private final List<AnswerEntity> answers;
    private final int answersCount;
    private final boolean closed;
    private final Date createdAt;
    private final String createdById;
    private final String description;
    private final boolean enforceUniqueVote;
    private final Map<String, Object> extraData;
    private final String id;
    private final Integer maxVotesAllowed;
    private final String name;
    private final List<OptionEntity> options;
    private final List<VoteEntity> ownVotes;
    private final Date updatedAt;
    private final int voteCount;
    private final Map<String, Integer> voteCountsByOption;
    private final List<VoteEntity> votes;
    private final String votingVisibility;

    public PollEntity(String id4, String name, String description, List<OptionEntity> options, String votingVisibility, boolean z4, Integer num, boolean z13, boolean z14, int i13, Map<String, Integer> voteCountsByOption, List<VoteEntity> votes, List<VoteEntity> ownVotes, Date createdAt, Date updatedAt, boolean z15, int i14, List<AnswerEntity> answers, String str, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(votingVisibility, "votingVisibility");
        AbstractC22676k.m65750j(voteCountsByOption, "voteCountsByOption");
        AbstractC22676k.m65750j(votes, "votes");
        AbstractC22676k.m65750j(ownVotes, "ownVotes");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(answers, "answers");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.id = id4;
        this.name = name;
        this.description = description;
        this.options = options;
        this.votingVisibility = votingVisibility;
        this.enforceUniqueVote = z4;
        this.maxVotesAllowed = num;
        this.allowUserSuggestedOptions = z13;
        this.allowAnswers = z14;
        this.voteCount = i13;
        this.voteCountsByOption = voteCountsByOption;
        this.votes = votes;
        this.ownVotes = ownVotes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closed = z15;
        this.answersCount = i14;
        this.answers = answers;
        this.createdById = str;
        this.extraData = extraData;
    }

    public final boolean getAllowAnswers() {
        return this.allowAnswers;
    }

    public final boolean getAllowUserSuggestedOptions() {
        return this.allowUserSuggestedOptions;
    }

    public final List<AnswerEntity> getAnswers() {
        return this.answers;
    }

    public final int getAnswersCount() {
        return this.answersCount;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreatedById() {
        return this.createdById;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnforceUniqueVote() {
        return this.enforceUniqueVote;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getMaxVotesAllowed() {
        return this.maxVotesAllowed;
    }

    public final String getName() {
        return this.name;
    }

    public final List<OptionEntity> getOptions() {
        return this.options;
    }

    public final List<VoteEntity> getOwnVotes() {
        return this.ownVotes;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getVoteCount() {
        return this.voteCount;
    }

    public final Map<String, Integer> getVoteCountsByOption() {
        return this.voteCountsByOption;
    }

    public final List<VoteEntity> getVotes() {
        return this.votes;
    }

    public final String getVotingVisibility() {
        return this.votingVisibility;
    }
}
