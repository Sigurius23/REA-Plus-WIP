package io.getstream.chat.android.p226ui.widgets.avatar;

import java.util.List;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarViewProvider;", "", "regular", "Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;", "singleUser", "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;", "userGroup", "", "userCount", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelAvatarViewProvider {
    AvatarImageView regular();

    UserAvatarView singleUser();

    List<AvatarImageView> userGroup(int userCount);
}
