package io.getstream.chat.android.p226ui.common.state.messages.poll;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/poll/PollState;", "", "selectedPoll", "Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;", "<init>", "(Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;)V", "getSelectedPoll", "()Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PollState {
    public static final int $stable = 0;
    private final SelectedPoll selectedPoll;

    /* JADX WARN: Multi-variable type inference failed */
    public PollState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static PollState copy$default(PollState pollState, SelectedPoll selectedPoll, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            selectedPoll = pollState.selectedPoll;
        }
        pollState.getClass();
        return new PollState(selectedPoll);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SelectedPoll getSelectedPoll() {
        return this.selectedPoll;
    }

    public final PollState copy(SelectedPoll selectedPoll) {
        return new PollState(selectedPoll);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PollState) && AbstractC22676k.m65745e(this.selectedPoll, ((PollState) other).selectedPoll);
    }

    public final SelectedPoll getSelectedPoll() {
        return this.selectedPoll;
    }

    public final int hashCode() {
        SelectedPoll selectedPoll = this.selectedPoll;
        if (selectedPoll == null) {
            return 0;
        }
        return selectedPoll.hashCode();
    }

    public final String toString() {
        return "PollState(selectedPoll=" + this.selectedPoll + ")";
    }

    public PollState(SelectedPoll selectedPoll) {
        this.selectedPoll = selectedPoll;
    }

    public /* synthetic */ PollState(SelectedPoll selectedPoll, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : selectedPoll);
    }
}
