package io.getstream.chat.android.p226ui.feature.messages.composer;

import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContentContainer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "content", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;)V", "getStyle", "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "getContent", "()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageComposerContext {
    private final MessageComposerContentContainer content;
    private final MessageComposerViewStyle style;

    public MessageComposerContext(MessageComposerViewStyle style, MessageComposerContentContainer content) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(content, "content");
        this.style = style;
        this.content = content;
    }

    public static /* synthetic */ MessageComposerContext copy$default(MessageComposerContext messageComposerContext, MessageComposerViewStyle messageComposerViewStyle, MessageComposerContentContainer messageComposerContentContainer, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            messageComposerViewStyle = messageComposerContext.style;
        }
        if ((i13 & 2) != 0) {
            messageComposerContentContainer = messageComposerContext.content;
        }
        return messageComposerContext.copy(messageComposerViewStyle, messageComposerContentContainer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageComposerViewStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageComposerContentContainer getContent() {
        return this.content;
    }

    public final MessageComposerContext copy(MessageComposerViewStyle style, MessageComposerContentContainer content) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(content, "content");
        return new MessageComposerContext(style, content);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageComposerContext)) {
            return false;
        }
        MessageComposerContext messageComposerContext = (MessageComposerContext) other;
        return AbstractC22676k.m65745e(this.style, messageComposerContext.style) && AbstractC22676k.m65745e(this.content, messageComposerContext.content);
    }

    public final MessageComposerContentContainer getContent() {
        return this.content;
    }

    public final MessageComposerViewStyle getStyle() {
        return this.style;
    }

    public final int hashCode() {
        return this.content.hashCode() + (this.style.hashCode() * 31);
    }

    public final String toString() {
        return "MessageComposerContext(style=" + this.style + ", content=" + this.content + ")";
    }
}
