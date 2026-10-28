package io.getstream.chat.android.p226ui.common.state.messages.poll;

import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Poll;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;", "", "poll", "Lio/getstream/chat/android/models/Poll;", "message", "Lio/getstream/chat/android/models/Message;", "pollSelectionType", "Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;", "<init>", "(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;)V", "getPoll", "()Lio/getstream/chat/android/models/Poll;", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getPollSelectionType", "()Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SelectedPoll {
    public static final int $stable = 0;
    private final Message message;
    private final Poll poll;
    private final PollSelectionType pollSelectionType;

    public SelectedPoll(Poll poll, Message message, PollSelectionType pollSelectionType) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(pollSelectionType, "pollSelectionType");
        this.poll = poll;
        this.message = message;
        this.pollSelectionType = pollSelectionType;
    }

    public static /* synthetic */ SelectedPoll copy$default(SelectedPoll selectedPoll, Poll poll, Message message, PollSelectionType pollSelectionType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            poll = selectedPoll.poll;
        }
        if ((i13 & 2) != 0) {
            message = selectedPoll.message;
        }
        if ((i13 & 4) != 0) {
            pollSelectionType = selectedPoll.pollSelectionType;
        }
        return selectedPoll.copy(poll, message, pollSelectionType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Poll getPoll() {
        return this.poll;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PollSelectionType getPollSelectionType() {
        return this.pollSelectionType;
    }

    public final SelectedPoll copy(Poll poll, Message message, PollSelectionType pollSelectionType) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(pollSelectionType, "pollSelectionType");
        return new SelectedPoll(poll, message, pollSelectionType);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedPoll)) {
            return false;
        }
        SelectedPoll selectedPoll = (SelectedPoll) other;
        return AbstractC22676k.m65745e(this.poll, selectedPoll.poll) && AbstractC22676k.m65745e(this.message, selectedPoll.message) && AbstractC22676k.m65745e(this.pollSelectionType, selectedPoll.pollSelectionType);
    }

    public final Message getMessage() {
        return this.message;
    }

    public final Poll getPoll() {
        return this.poll;
    }

    public final PollSelectionType getPollSelectionType() {
        return this.pollSelectionType;
    }

    public final int hashCode() {
        return this.pollSelectionType.hashCode() + ((this.message.hashCode() + (this.poll.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SelectedPoll(poll=" + this.poll + ", message=" + this.message + ", pollSelectionType=" + this.pollSelectionType + ")";
    }
}
