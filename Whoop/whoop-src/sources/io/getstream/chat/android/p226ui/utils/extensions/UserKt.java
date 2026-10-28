package io.getstream.chat.android.p226ui.utils.extensions;

import android.content.Context;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\b"}, m65681d2 = {"getLastSeenText", "", "Lio/getstream/chat/android/models/User;", "context", "Landroid/content/Context;", "isCurrentUser", "", "asMention", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserKt {
    public static final String asMention(User user, Context context) {
        AbstractC22676k.m65750j(user, "<this>");
        AbstractC22676k.m65750j(context, "context");
        String name = user.getName();
        if (name.length() <= 0) {
            name = null;
        }
        if (name != null) {
            return context.getString(C19469R.string.stream_ui_mention, name);
        }
        return null;
    }

    public static final String getLastSeenText(User user, Context context) {
        AbstractC22676k.m65750j(user, "<this>");
        AbstractC22676k.m65750j(context, "context");
        return io.getstream.chat.android.p226ui.common.utils.extensions.UserKt.getLastSeenText(user, context, C19469R.string.stream_ui_user_status_online, C19469R.string.stream_ui_user_status_last_seen_just_now, C19469R.string.stream_ui_user_status_last_seen);
    }

    public static final boolean isCurrentUser(User user) {
        AbstractC22676k.m65750j(user, "<this>");
        String id4 = user.getId();
        User currentUser = ChatUI.getCurrentUserProvider().getCurrentUser();
        return AbstractC22676k.m65745e(id4, currentUser != null ? currentUser.getId() : null);
    }
}
