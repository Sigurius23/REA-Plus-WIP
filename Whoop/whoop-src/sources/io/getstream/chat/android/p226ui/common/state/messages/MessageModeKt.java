package io.getstream.chat.android.p226ui.common.state.messages;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m65681d2 = {"stringify", "", "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageModeKt {
    public static final String stringify(MessageMode messageMode) {
        AbstractC22676k.m65750j(messageMode, "<this>");
        if (messageMode.equals(MessageMode.Normal.INSTANCE)) {
            return "Normal";
        }
        if (messageMode instanceof MessageMode.MessageThread) {
            return AbstractC11895b.m31996o("MessageThread(parentMessage.id=", ((MessageMode.MessageThread) messageMode).getParentMessage().getId(), ")");
        }
        throw new NoWhenBranchMatchedException();
    }
}
