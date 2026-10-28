package io.getstream.chat.android.p226ui.common.state.messages.list;

import io.getstream.chat.android.p226ui.common.C19470R;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/EditMessage;", "Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;", "<init>", "()V", "text", "", "getText", "()I", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EditMessage extends ModeratedMessageOption {
    public static final int $stable = 0;
    public static final EditMessage INSTANCE = new EditMessage();
    private static final int text = C19470R.string.stream_ui_moderation_dialog_edit;

    private EditMessage() {
    }

    @Override // io.getstream.chat.android.p226ui.common.state.messages.list.ModeratedMessageOption
    public final int getText() {
        return text;
    }

    public final String toString() {
        return "EditMessage";
    }
}
