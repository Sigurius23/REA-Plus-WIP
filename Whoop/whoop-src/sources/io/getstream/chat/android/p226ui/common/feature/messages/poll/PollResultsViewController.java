package io.getstream.chat.android.p226ui.common.feature.messages.poll;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.extensions.internal.PollKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.p226ui.common.state.messages.poll.PollResultsViewState;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;", "", "Lio/getstream/chat/android/models/Poll;", "poll", "<init>", "(Lio/getstream/chat/android/models/Poll;)V", "Lio/getstream/chat/android/models/Poll;", "Lec3/p1;", "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;", "_state", "Lec3/p1;", "Lec3/f2;", "state", "Lec3/f2;", "getState", "()Lec3/f2;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollResultsViewController {
    public static final int $stable = 8;
    private final InterfaceC13075p1 _state;
    private final Poll poll;
    private final InterfaceC13037f2 state;

    public PollResultsViewController(Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        this.poll = poll;
        Option winner = PollKt.getWinner(poll);
        String name = poll.getName();
        List<Option> options = poll.getOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
        for (Option option : options) {
            List listM74156w1 = AbstractC25265s.m74156w1(PollKt.getVotesUnlessAnonymous(this.poll, option), 5);
            Integer num = this.poll.getVoteCountsByOption().get(option.getId());
            int iIntValue = num != null ? num.intValue() : 0;
            boolean z4 = false;
            boolean zM65745e = AbstractC22676k.m65745e(winner, option);
            if (iIntValue > 5) {
                z4 = true;
            }
            arrayList.add(new PollResultsViewState.ResultItem(option, zM65745e, iIntValue, listM74156w1, z4));
        }
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new PollResultsViewState(name, arrayList));
        this._state = c13045h2M36593c;
        this.state = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    public final InterfaceC13037f2 getState() {
        return this.state;
    }
}
