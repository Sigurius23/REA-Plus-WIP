package io.getstream.chat.android.client.extensions.internal;

import io.getstream.chat.android.client.events.AnswerCastedEvent;
import io.getstream.chat.android.client.events.PollClosedEvent;
import io.getstream.chat.android.client.events.PollUpdatedEvent;
import io.getstream.chat.android.client.events.VoteCastedEvent;
import io.getstream.chat.android.client.events.VoteChangedEvent;
import io.getstream.chat.android.client.events.VoteRemovedEvent;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Answer;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.models.VotingVisibility;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\b2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\t2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007\u001a\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0001H\u0007¨\u0006\u0012"}, m65681d2 = {"processPoll", "Lio/getstream/chat/android/models/Poll;", "Lio/getstream/chat/android/client/events/VoteChangedEvent;", "currentUserId", "", "getOldPoll", "Lkotlin/Function1;", "Lio/getstream/chat/android/client/events/VoteCastedEvent;", "Lio/getstream/chat/android/client/events/VoteRemovedEvent;", "Lio/getstream/chat/android/client/events/AnswerCastedEvent;", "Lio/getstream/chat/android/client/events/PollClosedEvent;", "Lio/getstream/chat/android/client/events/PollUpdatedEvent;", "getVotesUnlessAnonymous", "", "Lio/getstream/chat/android/models/Vote;", "option", "Lio/getstream/chat/android/models/Option;", "getWinner", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollKt {
    @InternalStreamChatApi
    public static final List<Vote> getVotesUnlessAnonymous(Poll poll, Option option) {
        AbstractC22676k.m65750j(poll, "<this>");
        AbstractC22676k.m65750j(option, "option");
        List<Vote> votes = poll.getVotes(option);
        if (poll.getVotingVisibility() == VotingVisibility.ANONYMOUS) {
            votes = null;
        }
        return votes == null ? C25271y.f99162w : votes;
    }

    @InternalStreamChatApi
    public static final Option getWinner(Poll poll) {
        Object next;
        int i13;
        AbstractC22676k.m65750j(poll, "<this>");
        Iterator<T> it = poll.getOptions().iterator();
        boolean z4 = false;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Integer num = poll.getVoteCountsByOption().get(((Option) next).getId());
                int iIntValue = num != null ? num.intValue() : 0;
                do {
                    Object next2 = it.next();
                    Integer num2 = poll.getVoteCountsByOption().get(((Option) next2).getId());
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Option option = (Option) next;
        if (option != null) {
            Integer num3 = poll.getVoteCountsByOption().get(option.getId());
            int iIntValue3 = num3 != null ? num3.intValue() : 0;
            if (iIntValue3 > 0) {
                List<Option> options = poll.getOptions();
                if ((options instanceof Collection) && options.isEmpty()) {
                    i13 = 0;
                } else {
                    Iterator<T> it3 = options.iterator();
                    i13 = 0;
                    while (it3.hasNext()) {
                        Integer num4 = poll.getVoteCountsByOption().get(((Option) it3.next()).getId());
                        if ((num4 != null ? num4.intValue() : 0) == iIntValue3 && (i13 = i13 + 1) < 0) {
                            AbstractC37056f.m118976c0();
                            throw null;
                        }
                    }
                }
                if (i13 == 1) {
                    z4 = true;
                }
            }
            if (z4) {
                return option;
            }
        }
        return null;
    }

    @InternalStreamChatApi
    public static final Poll processPoll(VoteChangedEvent voteChangedEvent, String str, Function1 getOldPoll) {
        List<Answer> answers;
        AbstractC22676k.m65750j(voteChangedEvent, "<this>");
        AbstractC22676k.m65750j(getOldPoll, "getOldPoll");
        Poll poll = (Poll) getOldPoll.invoke(voteChangedEvent.getPoll().getId());
        Vote newVote = voteChangedEvent.getNewVote();
        User user = newVote.getUser();
        List<Vote> ownVotes = null;
        if (!AbstractC22676k.m65745e(user != null ? user.getId() : null, str)) {
            newVote = null;
        }
        if (newVote != null) {
            ownVotes = AbstractC37056f.m118958J(newVote);
        } else if (poll != null) {
            ownVotes = poll.getOwnVotes();
        }
        Poll poll2 = voteChangedEvent.getPoll();
        if (ownVotes == null) {
            ownVotes = C25271y.f99162w;
        }
        List<Vote> list = ownVotes;
        if (poll == null || (answers = poll.getAnswers()) == null) {
            answers = voteChangedEvent.getPoll().getAnswers();
        }
        return Poll.copy$default(poll2, null, null, null, null, null, false, null, false, false, 0, null, null, list, null, null, false, 0, answers, null, null, 913407, null);
    }

    @InternalStreamChatApi
    public static final Poll processPoll(VoteCastedEvent voteCastedEvent, String str, Function1 getOldPoll) {
        Map linkedHashMap;
        List<Answer> answers;
        List<Vote> ownVotes;
        AbstractC22676k.m65750j(voteCastedEvent, "<this>");
        AbstractC22676k.m65750j(getOldPoll, "getOldPoll");
        Poll poll = (Poll) getOldPoll.invoke(voteCastedEvent.getPoll().getId());
        if (poll != null && (ownVotes = poll.getOwnVotes()) != null) {
            List<Vote> list = ownVotes;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : list) {
                linkedHashMap.put(((Vote) obj).getId(), obj);
            }
        } else {
            linkedHashMap = C25272z.f99163w;
        }
        Vote newVote = voteCastedEvent.getNewVote();
        User user = newVote.getUser();
        if (!AbstractC22676k.m65745e(user != null ? user.getId() : null, str)) {
            newVote = null;
        }
        List listM118960L = AbstractC37056f.m118960L(newVote);
        int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM118960L, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
        for (Object obj2 : listM118960L) {
            linkedHashMap2.put(((Vote) obj2).getId(), obj2);
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(linkedHashMap, linkedHashMap2);
        Poll poll2 = voteCastedEvent.getPoll();
        List listM74093D1 = AbstractC25265s.m74093D1(linkedHashMapM73995d0.values());
        if (poll == null || (answers = poll.getAnswers()) == null) {
            answers = voteCastedEvent.getPoll().getAnswers();
        }
        return Poll.copy$default(poll2, null, null, null, null, null, false, null, false, false, 0, null, null, listM74093D1, null, null, false, 0, answers, null, null, 913407, null);
    }

    @InternalStreamChatApi
    public static final Poll processPoll(VoteRemovedEvent voteRemovedEvent, Function1 getOldPoll) {
        Map linkedHashMap;
        List<Answer> answers;
        List<Vote> ownVotes;
        AbstractC22676k.m65750j(voteRemovedEvent, "<this>");
        AbstractC22676k.m65750j(getOldPoll, "getOldPoll");
        Poll poll = (Poll) getOldPoll.invoke(voteRemovedEvent.getPoll().getId());
        if (poll != null && (ownVotes = poll.getOwnVotes()) != null) {
            List<Vote> list = ownVotes;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : list) {
                linkedHashMap.put(((Vote) obj).getId(), obj);
            }
        } else {
            linkedHashMap = C25272z.f99163w;
        }
        Map mapM73991Z = AbstractC25247g0.m73991Z(voteRemovedEvent.getRemovedVote().getId(), linkedHashMap);
        Poll poll2 = voteRemovedEvent.getPoll();
        List listM74093D1 = AbstractC25265s.m74093D1(mapM73991Z.values());
        if (poll == null || (answers = poll.getAnswers()) == null) {
            answers = voteRemovedEvent.getPoll().getAnswers();
        }
        return Poll.copy$default(poll2, null, null, null, null, null, false, null, false, false, 0, null, null, listM74093D1, null, null, false, 0, answers, null, null, 913407, null);
    }

    @InternalStreamChatApi
    public static final Poll processPoll(AnswerCastedEvent answerCastedEvent, Function1 getOldPoll) {
        Map linkedHashMap;
        List<Vote> ownVotes;
        List<Answer> answers;
        AbstractC22676k.m65750j(answerCastedEvent, "<this>");
        AbstractC22676k.m65750j(getOldPoll, "getOldPoll");
        Poll poll = (Poll) getOldPoll.invoke(answerCastedEvent.getPoll().getId());
        if (poll != null && (answers = poll.getAnswers()) != null) {
            List<Answer> list = answers;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : list) {
                linkedHashMap.put(((Answer) obj).getId(), obj);
            }
        } else {
            linkedHashMap = C25272z.f99163w;
        }
        Map mapM73996e0 = AbstractC25247g0.m73996e0(linkedHashMap, new C23465k(answerCastedEvent.getNewAnswer().getId(), answerCastedEvent.getNewAnswer()));
        Poll poll2 = answerCastedEvent.getPoll();
        List listM74093D1 = AbstractC25265s.m74093D1(mapM73996e0.values());
        if (poll == null || (ownVotes = poll.getOwnVotes()) == null) {
            ownVotes = answerCastedEvent.getPoll().getOwnVotes();
        }
        return Poll.copy$default(poll2, null, null, null, null, null, false, null, false, false, 0, null, null, ownVotes, null, null, false, 0, listM74093D1, null, null, 913407, null);
    }

    @InternalStreamChatApi
    public static final Poll processPoll(PollClosedEvent pollClosedEvent, Function1 getOldPoll) {
        Poll pollCopy$default;
        AbstractC22676k.m65750j(pollClosedEvent, "<this>");
        AbstractC22676k.m65750j(getOldPoll, "getOldPoll");
        Poll poll = (Poll) getOldPoll.invoke(pollClosedEvent.getPoll().getId());
        return (poll == null || (pollCopy$default = Poll.copy$default(poll, null, null, null, null, null, false, null, false, false, 0, null, null, null, null, null, true, 0, null, null, null, 1015807, null)) == null) ? pollClosedEvent.getPoll() : pollCopy$default;
    }

    @InternalStreamChatApi
    public static final Poll processPoll(PollUpdatedEvent pollUpdatedEvent, Function1 getOldPoll) {
        List<Vote> ownVotes;
        List<Answer> answers;
        AbstractC22676k.m65750j(pollUpdatedEvent, "<this>");
        AbstractC22676k.m65750j(getOldPoll, "getOldPoll");
        Poll poll = (Poll) getOldPoll.invoke(pollUpdatedEvent.getPoll().getId());
        Poll poll2 = pollUpdatedEvent.getPoll();
        if (poll == null || (ownVotes = poll.getOwnVotes()) == null) {
            ownVotes = pollUpdatedEvent.getPoll().getOwnVotes();
        }
        List<Vote> list = ownVotes;
        if (poll == null || (answers = poll.getAnswers()) == null) {
            answers = pollUpdatedEvent.getPoll().getAnswers();
        }
        return Poll.copy$default(poll2, null, null, null, null, null, false, null, false, false, 0, null, null, list, null, null, false, 0, answers, null, null, 913407, null);
    }
}
