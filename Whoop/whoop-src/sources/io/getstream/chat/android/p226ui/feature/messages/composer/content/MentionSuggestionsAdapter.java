package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import io.getstream.chat.android.models.User;
import java.util.List;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionSuggestionsAdapter;", "", "", "Lio/getstream/chat/android/models/User;", "items", "Ll83/a0;", "setItems", "(Ljava/util/List;)V", "", "getItemCount", "()I", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MentionSuggestionsAdapter {
    int getItemCount();

    void setItems(List<User> items);
}
