package io.getstream.chat.android.p226ui.widgets.avatar;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;", "", "Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;", "style", "Lio/getstream/chat/android/models/Channel;", "channel", "Lio/getstream/chat/android/models/User;", "currentUser", "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarViewProvider;", "targetProvider", "Ll83/a0;", "render", "(Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarViewProvider;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelAvatarRenderer {
    void render(AvatarStyle style, Channel channel, User currentUser, ChannelAvatarViewProvider targetProvider);
}
