package io.getstream.chat.android.p226ui.common.state.messages.list;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.List;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¨\u0006\u0003"}, m65681d2 = {"defaultMessageModerationOptions", "", "Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ModeratedMessageOptionKt {
    @InternalStreamChatApi
    public static final List<ModeratedMessageOption> defaultMessageModerationOptions() {
        return AbstractC37056f.m118959K(SendAnyway.INSTANCE, EditMessage.INSTANCE, DeleteMessage.INSTANCE);
    }
}
