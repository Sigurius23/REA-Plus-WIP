package io.getstream.chat.android.p226ui.navigation;

import io.getstream.chat.android.p226ui.navigation.destinations.ChatDestination;
import p624xs.C38632a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/navigation/ChatNavigator;", "", "Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;", "handler", "<init>", "(Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;)V", "Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;", "destination", "Ll83/a0;", "performDefaultNavigation", "(Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;)V", "navigate", "Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatNavigator {
    public static final ChatNavigationHandler EMPTY_HANDLER = new C38632a(26);
    private final ChatNavigationHandler handler;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatNavigator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EMPTY_HANDLER$lambda$0(ChatDestination it) {
        AbstractC22676k.m65750j(it, "it");
        return false;
    }

    private final void performDefaultNavigation(ChatDestination destination) {
        destination.navigate();
    }

    public final void navigate(ChatDestination destination) {
        AbstractC22676k.m65750j(destination, "destination");
        this.handler.navigate(destination);
        destination.navigate();
    }

    public ChatNavigator(ChatNavigationHandler handler) {
        AbstractC22676k.m65750j(handler, "handler");
        this.handler = handler;
    }

    public /* synthetic */ ChatNavigator(ChatNavigationHandler chatNavigationHandler, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EMPTY_HANDLER : chatNavigationHandler);
    }
}
