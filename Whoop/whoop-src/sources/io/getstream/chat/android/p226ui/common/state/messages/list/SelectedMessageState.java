package io.getstream.chat.android.p226ui.common.state.messages.list;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;", "", "<init>", "()V", "message", "Lio/getstream/chat/android/models/Message;", "getMessage", "()Lio/getstream/chat/android/models/Message;", "channel", "Lio/getstream/chat/android/models/Channel;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "ownCapabilities", "", "", "getOwnCapabilities", "()Ljava/util/Set;", "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageFailedModerationState;", "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageOptionsState;", "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageReactionsPickerState;", "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageReactionsState;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class SelectedMessageState {
    public static final int $stable = 0;

    private SelectedMessageState() {
    }

    public abstract Channel getChannel();

    public abstract Message getMessage();

    public final Set<String> getOwnCapabilities() {
        return getChannel().getOwnCapabilities();
    }

    public SelectedMessageState(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
