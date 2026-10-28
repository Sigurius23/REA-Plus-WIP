package io.getstream.chat.android.p226ui.common.state.messages.poll;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m65681d2 = {"stringify", "", "Lio/getstream/chat/android/ui/common/state/messages/poll/PollState;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollStateKt {
    public static final String stringify(PollState pollState) {
        AbstractC22676k.m65750j(pollState, "<this>");
        return "PollState(selectedPoll: " + pollState.getSelectedPoll() + ")";
    }
}
