package io.getstream.chat.android.p226ui.widgets.avatar;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;", "", "Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;", "style", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;", "target", "Ll83/a0;", "render", "(Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface UserAvatarRenderer {
    void render(AvatarStyle style, User user, UserAvatarView target);
}
