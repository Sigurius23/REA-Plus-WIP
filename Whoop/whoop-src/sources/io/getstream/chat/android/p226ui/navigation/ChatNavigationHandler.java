package io.getstream.chat.android.p226ui.navigation;

import io.getstream.chat.android.p226ui.navigation.destinations.ChatDestination;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@FunctionalInterface
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;", "", "navigate", "", "destination", "Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChatNavigationHandler {
    boolean navigate(ChatDestination destination);
}
