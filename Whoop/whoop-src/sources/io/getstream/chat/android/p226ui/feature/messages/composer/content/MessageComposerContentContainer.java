package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.view.View;
import d93.InterfaceC11820a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0010\u001a\u00020\u0011H&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0014H&R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0015À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;", "", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;", "center", "getCenter", "()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;", "centerOverlap", "getCenterOverlap", "leading", "getLeading", "trailing", "getTrailing", "header", "getHeader", "footer", "getFooter", "asView", "Landroid/view/View;", "findViewByKey", "key", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessageComposerContentContainer extends Iterable<MessageComposerContent>, InterfaceC11820a {
    View asView();

    View findViewByKey(String key);

    MessageComposerContent getCenter();

    MessageComposerContent getCenterOverlap();

    MessageComposerContent getFooter();

    MessageComposerContent getHeader();

    MessageComposerContent getLeading();

    MessageComposerContent getTrailing();
}
