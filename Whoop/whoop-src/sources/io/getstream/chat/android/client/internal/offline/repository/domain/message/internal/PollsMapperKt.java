package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import c93.InterfaceC4351m;
import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import io.getstream.chat.android.models.Answer;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.models.VotingVisibility;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a8\u0010\n\u001a\u00020\u0000*\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u0002\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u0002\u0010\u000e\u001a\u0013\u0010\n\u001a\u00020\f*\u00020\rH\u0000¢\u0006\u0004\b\n\u0010\u000f\u001a\u0013\u0010\u0002\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0002\u0010\u0012\u001a8\u0010\n\u001a\u00020\u0010*\u00020\u00112\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0080@¢\u0006\u0004\b\n\u0010\u0013\u001a\u0013\u0010\u0002\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0002\u0010\u0016\u001a8\u0010\n\u001a\u00020\u0014*\u00020\u00152\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0080@¢\u0006\u0004\b\n\u0010\u0017\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0018H\u0000¢\u0006\u0004\b\u0002\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0018*\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/models/Poll;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;", "toEntity", "(Lio/getstream/chat/android/models/Poll;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "", "getUser", "toModel", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Option;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;", "(Lio/getstream/chat/android/models/Option;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;)Lio/getstream/chat/android/models/Option;", "Lio/getstream/chat/android/models/Vote;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;", "(Lio/getstream/chat/android/models/Vote;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Answer;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;", "(Lio/getstream/chat/android/models/Answer;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/VotingVisibility;", "(Lio/getstream/chat/android/models/VotingVisibility;)Ljava/lang/String;", "toVotingVisibility", "(Ljava/lang/String;)Lio/getstream/chat/android/models/VotingVisibility;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollsMapperKt {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VotingVisibility.values().length];
            try {
                iArr[VotingVisibility.ANONYMOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VotingVisibility.PUBLIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollsMapperKt$toModel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollsMapperKt", m100430f = "PollsMapper.kt", m100431l = {67, 77, 80, 81}, m100432m = "toModel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192041 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
        Object L$17;
        Object L$18;
        Object L$19;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        boolean Z$3;
        int label;
        /* synthetic */ Object result;

        public C192041(InterfaceC30057d<? super C192041> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PollsMapperKt.toModel((PollEntity) null, (InterfaceC4351m) null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollsMapperKt$toModel$7 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollsMapperKt", m100430f = "PollsMapper.kt", m100431l = {135}, m100432m = "toModel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192057 extends AbstractC32269c {
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

        public C192057(InterfaceC30057d<? super C192057> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PollsMapperKt.toModel((VoteEntity) null, (InterfaceC4351m) null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollsMapperKt$toModel$9 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollsMapperKt", m100430f = "PollsMapper.kt", m100431l = {166}, m100432m = "toModel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192069 extends AbstractC32269c {
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

        public C192069(InterfaceC30057d<? super C192069> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PollsMapperKt.toModel((AnswerEntity) null, (InterfaceC4351m) null, this);
        }
    }

    public static final PollEntity toEntity(Poll poll) {
        AbstractC22676k.m65750j(poll, "<this>");
        String id4 = poll.getId();
        String name = poll.getName();
        String description = poll.getDescription();
        List<Option> options = poll.getOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(toEntity((Option) it.next()));
        }
        List<Vote> votes = poll.getVotes();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(votes, 10));
        Iterator<T> it3 = votes.iterator();
        while (it3.hasNext()) {
            arrayList2.add(toEntity((Vote) it3.next()));
        }
        Date createdAt = poll.getCreatedAt();
        Date updatedAt = poll.getUpdatedAt();
        String entity = toEntity(poll.getVotingVisibility());
        boolean enforceUniqueVote = poll.getEnforceUniqueVote();
        Integer maxVotesAllowed = poll.getMaxVotesAllowed();
        boolean allowUserSuggestedOptions = poll.getAllowUserSuggestedOptions();
        boolean allowAnswers = poll.getAllowAnswers();
        int voteCount = poll.getVoteCount();
        Map<String, Integer> voteCountsByOption = poll.getVoteCountsByOption();
        List<Vote> ownVotes = poll.getOwnVotes();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(ownVotes, 10));
        Iterator<T> it4 = ownVotes.iterator();
        while (it4.hasNext()) {
            arrayList3.add(toEntity((Vote) it4.next()));
        }
        boolean closed = poll.getClosed();
        int answersCount = poll.getAnswersCount();
        List<Answer> answers = poll.getAnswers();
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(answers, 10));
        Iterator<T> it5 = answers.iterator();
        while (it5.hasNext()) {
            arrayList4.add(toEntity((Answer) it5.next()));
        }
        User createdBy = poll.getCreatedBy();
        return new PollEntity(id4, name, description, arrayList, entity, enforceUniqueVote, maxVotesAllowed, allowUserSuggestedOptions, allowAnswers, voteCount, voteCountsByOption, arrayList2, arrayList3, createdAt, updatedAt, closed, answersCount, arrayList4, createdBy != null ? createdBy.getId() : null, poll.getExtraData());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object toModel(AnswerEntity answerEntity, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super Answer> interfaceC30057d) {
        C192069 c192069;
        String id4;
        String pollId;
        Date createdAt;
        User user;
        String str;
        Date date;
        String str2;
        Date date2;
        if (interfaceC30057d instanceof C192069) {
            c192069 = (C192069) interfaceC30057d;
            int i13 = c192069.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192069.label = i13 - Integer.MIN_VALUE;
            } else {
                c192069 = new C192069(interfaceC30057d);
            }
        } else {
            c192069 = new C192069(interfaceC30057d);
        }
        Object obj = c192069.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c192069.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            id4 = answerEntity.getId();
            pollId = answerEntity.getPollId();
            String text = answerEntity.getText();
            createdAt = answerEntity.getCreatedAt();
            Date updatedAt = answerEntity.getUpdatedAt();
            Object userId = answerEntity.getUserId();
            user = null;
            if (userId != null) {
                c192069.L$0 = null;
                c192069.L$1 = null;
                c192069.L$2 = null;
                c192069.L$3 = id4;
                c192069.L$4 = pollId;
                c192069.L$5 = text;
                c192069.L$6 = createdAt;
                c192069.L$7 = updatedAt;
                c192069.I$0 = 0;
                c192069.label = 1;
                Object objInvoke = interfaceC4351m.invoke(userId, c192069);
                if (objInvoke == obj2) {
                    return obj2;
                }
                str2 = text;
                obj = objInvoke;
                date2 = updatedAt;
            } else {
                str = text;
                date = updatedAt;
            }
            return new Answer(id4, pollId, str, createdAt, date, user);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        date2 = (Date) c192069.L$7;
        createdAt = (Date) c192069.L$6;
        str2 = (String) c192069.L$5;
        pollId = (String) c192069.L$4;
        id4 = (String) c192069.L$3;
        AbstractC34132o.m107864I(obj);
        user = (User) obj;
        date = date2;
        str = str2;
        return new Answer(id4, pollId, str, createdAt, date, user);
    }

    public static final VotingVisibility toVotingVisibility(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (str.equals(CreatePollRequest.VOTING_VISIBILITY_PUBLIC)) {
            return VotingVisibility.PUBLIC;
        }
        if (str.equals(CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS)) {
            return VotingVisibility.ANONYMOUS;
        }
        throw new IllegalArgumentException("Unknown voting visibility: ".concat(str));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x041d  */
    /* JADX WARN: Code duplicated, block: B:46:0x048a  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x02ae -> B:31:0x02b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0394 -> B:39:0x03a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x048a -> B:47:0x04ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object toModel(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollEntity r50, c93.InterfaceC4351m r51, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Poll> r52) {
        /*
            Method dump skipped, instruction units count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollsMapperKt.toModel(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollEntity, c93.m, q83.d):java.lang.Object");
    }

    public static final OptionEntity toEntity(Option option) {
        AbstractC22676k.m65750j(option, "<this>");
        return new OptionEntity(option.getId(), option.getText(), option.getExtraData());
    }

    public static final VoteEntity toEntity(Vote vote) {
        AbstractC22676k.m65750j(vote, "<this>");
        String id4 = vote.getId();
        String optionId = vote.getOptionId();
        String pollId = vote.getPollId();
        Date createdAt = vote.getCreatedAt();
        Date updatedAt = vote.getUpdatedAt();
        User user = vote.getUser();
        return new VoteEntity(id4, pollId, optionId, createdAt, updatedAt, user != null ? user.getId() : null);
    }

    public static final AnswerEntity toEntity(Answer answer) {
        AbstractC22676k.m65750j(answer, "<this>");
        String id4 = answer.getId();
        String pollId = answer.getPollId();
        String text = answer.getText();
        Date createdAt = answer.getCreatedAt();
        Date updatedAt = answer.getUpdatedAt();
        User user = answer.getUser();
        return new AnswerEntity(id4, pollId, text, createdAt, updatedAt, user != null ? user.getId() : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object toModel(VoteEntity voteEntity, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super Vote> interfaceC30057d) {
        C192057 c192057;
        String id4;
        String optionId;
        Date createdAt;
        User user;
        String str;
        Date date;
        String str2;
        Date date2;
        if (interfaceC30057d instanceof C192057) {
            c192057 = (C192057) interfaceC30057d;
            int i13 = c192057.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192057.label = i13 - Integer.MIN_VALUE;
            } else {
                c192057 = new C192057(interfaceC30057d);
            }
        } else {
            c192057 = new C192057(interfaceC30057d);
        }
        Object obj = c192057.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c192057.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            id4 = voteEntity.getId();
            optionId = voteEntity.getOptionId();
            String pollId = voteEntity.getPollId();
            createdAt = voteEntity.getCreatedAt();
            Date updatedAt = voteEntity.getUpdatedAt();
            Object userId = voteEntity.getUserId();
            user = null;
            if (userId != null) {
                c192057.L$0 = null;
                c192057.L$1 = null;
                c192057.L$2 = id4;
                c192057.L$3 = optionId;
                c192057.L$4 = pollId;
                c192057.L$5 = createdAt;
                c192057.L$6 = updatedAt;
                c192057.L$7 = null;
                c192057.I$0 = 0;
                c192057.label = 1;
                Object objInvoke = interfaceC4351m.invoke(userId, c192057);
                if (objInvoke == obj2) {
                    return obj2;
                }
                str2 = pollId;
                obj = objInvoke;
                date2 = updatedAt;
            } else {
                str = pollId;
                date = updatedAt;
            }
            return new Vote(id4, str, optionId, createdAt, date, user);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        date2 = (Date) c192057.L$6;
        createdAt = (Date) c192057.L$5;
        str2 = (String) c192057.L$4;
        optionId = (String) c192057.L$3;
        id4 = (String) c192057.L$2;
        AbstractC34132o.m107864I(obj);
        user = (User) obj;
        date = date2;
        str = str2;
        return new Vote(id4, str, optionId, createdAt, date, user);
    }

    public static final String toEntity(VotingVisibility votingVisibility) {
        AbstractC22676k.m65750j(votingVisibility, "<this>");
        int i13 = WhenMappings.$EnumSwitchMapping$0[votingVisibility.ordinal()];
        if (i13 == 1) {
            return CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS;
        }
        if (i13 == 2) {
            return CreatePollRequest.VOTING_VISIBILITY_PUBLIC;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Option toModel(OptionEntity optionEntity) {
        AbstractC22676k.m65750j(optionEntity, "<this>");
        return new Option(optionEntity.getId(), optionEntity.getText(), optionEntity.getExtraData());
    }
}
