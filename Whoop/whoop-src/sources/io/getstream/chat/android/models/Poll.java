package io.getstream.chat.android.models;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0010\u000f\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0013¢\u0006\u0004\b\"\u0010#J\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010B\u001a\u00020\bJ\u0016\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010D2\u0006\u0010E\u001a\u00020\u0003H\u0016J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010J\u001a\u00020\nHÆ\u0003J\t\u0010K\u001a\u00020\fHÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010/J\t\u0010M\u001a\u00020\fHÆ\u0003J\t\u0010N\u001a\u00020\fHÆ\u0003J\t\u0010O\u001a\u00020\u000eHÆ\u0003J\u0015\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007HÆ\u0003J\t\u0010S\u001a\u00020\u0018HÆ\u0003J\t\u0010T\u001a\u00020\u0018HÆ\u0003J\t\u0010U\u001a\u00020\fHÆ\u0003J\t\u0010V\u001a\u00020\u000eHÆ\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u0015\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0013HÆ\u0003J\u008a\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0013HÆ\u0001¢\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020\f2\b\u0010]\u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010^\u001a\u00020\u000eHÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0019\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0011\u0010\u001a\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010-R\u0011\u0010\u001b\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0013¢\u0006\b\n\u0000\u001a\u0004\bA\u00106¨\u0006`"}, m65681d2 = {"Lio/getstream/chat/android/models/Poll;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "id", "", "name", "description", "options", "", "Lio/getstream/chat/android/models/Option;", "votingVisibility", "Lio/getstream/chat/android/models/VotingVisibility;", "enforceUniqueVote", "", "maxVotesAllowed", "", "allowUserSuggestedOptions", "allowAnswers", "voteCount", "voteCountsByOption", "", "votes", "Lio/getstream/chat/android/models/Vote;", "ownVotes", "createdAt", "Ljava/util/Date;", "updatedAt", "closed", "answersCount", "answers", "Lio/getstream/chat/android/models/Answer;", "createdBy", "Lio/getstream/chat/android/models/User;", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "getOptions", "()Ljava/util/List;", "getVotingVisibility", "()Lio/getstream/chat/android/models/VotingVisibility;", "getEnforceUniqueVote", "()Z", "getMaxVotesAllowed", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAllowUserSuggestedOptions", "getAllowAnswers", "getVoteCount", "()I", "getVoteCountsByOption", "()Ljava/util/Map;", "getVotes", "getOwnVotes", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getClosed", "getAnswersCount", "getAnswers", "getCreatedBy", "()Lio/getstream/chat/android/models/User;", "getExtraData", "option", "getComparableField", "", "fieldName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)Lio/getstream/chat/android/models/Poll;", "equals", "other", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Poll implements ComparableFieldProvider {
    private final boolean allowAnswers;
    private final boolean allowUserSuggestedOptions;
    private final List<Answer> answers;
    private final int answersCount;
    private final boolean closed;
    private final Date createdAt;
    private final User createdBy;
    private final String description;
    private final boolean enforceUniqueVote;
    private final Map<String, Object> extraData;
    private final String id;
    private final Integer maxVotesAllowed;
    private final String name;
    private final List<Option> options;
    private final List<Vote> ownVotes;
    private final Date updatedAt;
    private final int voteCount;
    private final Map<String, Integer> voteCountsByOption;
    private final List<Vote> votes;
    private final VotingVisibility votingVisibility;

    public Poll(String id4, String name, String description, List<Option> options, VotingVisibility votingVisibility, boolean z4, Integer num, boolean z13, boolean z14, int i13, Map<String, Integer> voteCountsByOption, List<Vote> votes, List<Vote> ownVotes, Date createdAt, Date updatedAt, boolean z15, int i14, List<Answer> answers, User user, Map<String, ? extends Object> extraData) {
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
        this.createdBy = user;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Poll copy$default(Poll poll, String str, String str2, String str3, List list, VotingVisibility votingVisibility, boolean z4, Integer num, boolean z13, boolean z14, int i13, Map map, List list2, List list3, Date date, Date date2, boolean z15, int i14, List list4, User user, Map map2, int i15, Object obj) {
        Map map3;
        User user2;
        String str4 = (i15 & 1) != 0 ? poll.id : str;
        String str5 = (i15 & 2) != 0 ? poll.name : str2;
        String str6 = (i15 & 4) != 0 ? poll.description : str3;
        List list5 = (i15 & 8) != 0 ? poll.options : list;
        VotingVisibility votingVisibility2 = (i15 & 16) != 0 ? poll.votingVisibility : votingVisibility;
        boolean z16 = (i15 & 32) != 0 ? poll.enforceUniqueVote : z4;
        Integer num2 = (i15 & 64) != 0 ? poll.maxVotesAllowed : num;
        boolean z17 = (i15 & 128) != 0 ? poll.allowUserSuggestedOptions : z13;
        boolean z18 = (i15 & 256) != 0 ? poll.allowAnswers : z14;
        int i16 = (i15 & 512) != 0 ? poll.voteCount : i13;
        Map map4 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? poll.voteCountsByOption : map;
        List list6 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? poll.votes : list2;
        List list7 = (i15 & 4096) != 0 ? poll.ownVotes : list3;
        Date date3 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? poll.createdAt : date;
        String str7 = str4;
        Date date4 = (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? poll.updatedAt : date2;
        boolean z19 = (i15 & 32768) != 0 ? poll.closed : z15;
        int i17 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? poll.answersCount : i14;
        List list8 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? poll.answers : list4;
        User user3 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? poll.createdBy : user;
        if ((i15 & 524288) != 0) {
            user2 = user3;
            map3 = poll.extraData;
        } else {
            map3 = map2;
            user2 = user3;
        }
        return poll.copy(str7, str5, str6, list5, votingVisibility2, z16, num2, z17, z18, i16, map4, list6, list7, date3, date4, z19, i17, list8, user2, map3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getVoteCount() {
        return this.voteCount;
    }

    public final Map<String, Integer> component11() {
        return this.voteCountsByOption;
    }

    public final List<Vote> component12() {
        return this.votes;
    }

    public final List<Vote> component13() {
        return this.ownVotes;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getAnswersCount() {
        return this.answersCount;
    }

    public final List<Answer> component18() {
        return this.answers;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final User getCreatedBy() {
        return this.createdBy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> component20() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<Option> component4() {
        return this.options;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final VotingVisibility getVotingVisibility() {
        return this.votingVisibility;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getEnforceUniqueVote() {
        return this.enforceUniqueVote;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getMaxVotesAllowed() {
        return this.maxVotesAllowed;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getAllowUserSuggestedOptions() {
        return this.allowUserSuggestedOptions;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getAllowAnswers() {
        return this.allowAnswers;
    }

    public final Poll copy(String id4, String name, String description, List<Option> options, VotingVisibility votingVisibility, boolean enforceUniqueVote, Integer maxVotesAllowed, boolean allowUserSuggestedOptions, boolean allowAnswers, int voteCount, Map<String, Integer> voteCountsByOption, List<Vote> votes, List<Vote> ownVotes, Date createdAt, Date updatedAt, boolean closed, int answersCount, List<Answer> answers, User createdBy, Map<String, ? extends Object> extraData) {
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
        return new Poll(id4, name, description, options, votingVisibility, enforceUniqueVote, maxVotesAllowed, allowUserSuggestedOptions, allowAnswers, voteCount, voteCountsByOption, votes, ownVotes, createdAt, updatedAt, closed, answersCount, answers, createdBy, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Poll)) {
            return false;
        }
        Poll poll = (Poll) other;
        return AbstractC22676k.m65745e(this.id, poll.id) && AbstractC22676k.m65745e(this.name, poll.name) && AbstractC22676k.m65745e(this.description, poll.description) && AbstractC22676k.m65745e(this.options, poll.options) && this.votingVisibility == poll.votingVisibility && this.enforceUniqueVote == poll.enforceUniqueVote && AbstractC22676k.m65745e(this.maxVotesAllowed, poll.maxVotesAllowed) && this.allowUserSuggestedOptions == poll.allowUserSuggestedOptions && this.allowAnswers == poll.allowAnswers && this.voteCount == poll.voteCount && AbstractC22676k.m65745e(this.voteCountsByOption, poll.voteCountsByOption) && AbstractC22676k.m65745e(this.votes, poll.votes) && AbstractC22676k.m65745e(this.ownVotes, poll.ownVotes) && AbstractC22676k.m65745e(this.createdAt, poll.createdAt) && AbstractC22676k.m65745e(this.updatedAt, poll.updatedAt) && this.closed == poll.closed && this.answersCount == poll.answersCount && AbstractC22676k.m65745e(this.answers, poll.answers) && AbstractC22676k.m65745e(this.createdBy, poll.createdBy) && AbstractC22676k.m65745e(this.extraData, poll.extraData);
    }

    public final boolean getAllowAnswers() {
        return this.allowAnswers;
    }

    public final boolean getAllowUserSuggestedOptions() {
        return this.allowUserSuggestedOptions;
    }

    public final List<Answer> getAnswers() {
        return this.answers;
    }

    public final int getAnswersCount() {
        return this.answersCount;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    public Comparable<?> getComparableField(String fieldName) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        switch (fieldName.hashCode()) {
            case -1949194674:
                if (!fieldName.equals("updatedAt")) {
                    return null;
                }
                return this.updatedAt;
            case -893481439:
                if (!fieldName.equals("is_closed")) {
                    return null;
                }
                return Boolean.valueOf(this.closed);
            case -683486410:
                if (!fieldName.equals("isClosed")) {
                    return null;
                }
                return Boolean.valueOf(this.closed);
            case -295464393:
                if (!fieldName.equals("updated_at")) {
                    return null;
                }
                return this.updatedAt;
            case 3355:
                if (fieldName.equals("id")) {
                    return this.id;
                }
                return null;
            case 3373707:
                if (fieldName.equals("name")) {
                    return this.name;
                }
                return null;
            case 598371643:
                if (!fieldName.equals("createdAt")) {
                    return null;
                }
                return this.createdAt;
            case 1369680106:
                if (!fieldName.equals("created_at")) {
                    return null;
                }
                return this.createdAt;
            default:
                return null;
        }
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final User getCreatedBy() {
        return this.createdBy;
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

    public final List<Option> getOptions() {
        return this.options;
    }

    public final List<Vote> getOwnVotes() {
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

    public final List<Vote> getVotes() {
        return this.votes;
    }

    public final VotingVisibility getVotingVisibility() {
        return this.votingVisibility;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.votingVisibility.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.name), 31, this.description), 31, this.options)) * 31, 31, this.enforceUniqueVote);
        Integer num = this.maxVotesAllowed;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.answersCount, AbstractC2875y.m8289b(AbstractC38963t7.m124373c(this.updatedAt, AbstractC38963t7.m124373c(this.createdAt, AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC3855a.m11821e(this.voteCountsByOption, AbstractC11266d.m30448b(this.voteCount, AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (num == null ? 0 : num.hashCode())) * 31, 31, this.allowUserSuggestedOptions), 31, this.allowAnswers), 31), 31), 31, this.votes), 31, this.ownVotes), 31), 31), 31, this.closed), 31), 31, this.answers);
        User user = this.createdBy;
        return this.extraData.hashCode() + ((iM31983b + (user != null ? user.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.description;
        List<Option> list = this.options;
        VotingVisibility votingVisibility = this.votingVisibility;
        boolean z4 = this.enforceUniqueVote;
        Integer num = this.maxVotesAllowed;
        boolean z13 = this.allowUserSuggestedOptions;
        boolean z14 = this.allowAnswers;
        int i13 = this.voteCount;
        Map<String, Integer> map = this.voteCountsByOption;
        List<Vote> list2 = this.votes;
        List<Vote> list3 = this.ownVotes;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        boolean z15 = this.closed;
        int i14 = this.answersCount;
        List<Answer> list4 = this.answers;
        User user = this.createdBy;
        Map<String, Object> map2 = this.extraData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Poll(id=", str, ", name=", str2, ", description=");
        AbstractC36095b.m114694v(str3, ", options=", ", votingVisibility=", sbM32001t, list);
        sbM32001t.append(votingVisibility);
        sbM32001t.append(", enforceUniqueVote=");
        sbM32001t.append(z4);
        sbM32001t.append(", maxVotesAllowed=");
        sbM32001t.append(num);
        sbM32001t.append(", allowUserSuggestedOptions=");
        sbM32001t.append(z13);
        sbM32001t.append(", allowAnswers=");
        AbstractC30802r.m94769r(i13, ", voteCount=", ", voteCountsByOption=", sbM32001t, z14);
        sbM32001t.append(map);
        sbM32001t.append(", votes=");
        sbM32001t.append(list2);
        sbM32001t.append(", ownVotes=");
        sbM32001t.append(list3);
        sbM32001t.append(", createdAt=");
        sbM32001t.append(date);
        sbM32001t.append(", updatedAt=");
        sbM32001t.append(date2);
        sbM32001t.append(", closed=");
        sbM32001t.append(z15);
        sbM32001t.append(", answersCount=");
        sbM32001t.append(i14);
        sbM32001t.append(", answers=");
        sbM32001t.append(list4);
        sbM32001t.append(", createdBy=");
        sbM32001t.append(user);
        sbM32001t.append(", extraData=");
        sbM32001t.append(map2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public final List<Vote> getVotes(Option option) {
        AbstractC22676k.m65750j(option, "option");
        List<Vote> list = this.votes;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (AbstractC22676k.m65745e(((Vote) obj).getOptionId(), option.getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public /* synthetic */ Poll(String str, String str2, String str3, List list, VotingVisibility votingVisibility, boolean z4, Integer num, boolean z13, boolean z14, int i13, Map map, List list2, List list3, Date date, Date date2, boolean z15, int i14, List list4, User user, Map map2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, votingVisibility, z4, num, z13, z14, i13, map, list2, list3, date, date2, z15, i14, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? C25271y.f99162w : list4, user, (i15 & 524288) != 0 ? C25272z.f99163w : map2);
    }
}
