package io.getstream.chat.android.p226ui.feature.messages.preview;

import io.getstream.chat.android.p226ui.font.TextStyle;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "", "messageSenderTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "messageTextStyle", "messageTimeTextStyle", "<init>", "(Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V", "getMessageSenderTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getMessageTextStyle", "getMessageTimeTextStyle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessagePreviewStyle {
    private final TextStyle messageSenderTextStyle;
    private final TextStyle messageTextStyle;
    private final TextStyle messageTimeTextStyle;

    public MessagePreviewStyle(TextStyle messageSenderTextStyle, TextStyle messageTextStyle, TextStyle messageTimeTextStyle) {
        AbstractC22676k.m65750j(messageSenderTextStyle, "messageSenderTextStyle");
        AbstractC22676k.m65750j(messageTextStyle, "messageTextStyle");
        AbstractC22676k.m65750j(messageTimeTextStyle, "messageTimeTextStyle");
        this.messageSenderTextStyle = messageSenderTextStyle;
        this.messageTextStyle = messageTextStyle;
        this.messageTimeTextStyle = messageTimeTextStyle;
    }

    public static /* synthetic */ MessagePreviewStyle copy$default(MessagePreviewStyle messagePreviewStyle, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textStyle = messagePreviewStyle.messageSenderTextStyle;
        }
        if ((i13 & 2) != 0) {
            textStyle2 = messagePreviewStyle.messageTextStyle;
        }
        if ((i13 & 4) != 0) {
            textStyle3 = messagePreviewStyle.messageTimeTextStyle;
        }
        return messagePreviewStyle.copy(textStyle, textStyle2, textStyle3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextStyle getMessageSenderTextStyle() {
        return this.messageSenderTextStyle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextStyle getMessageTextStyle() {
        return this.messageTextStyle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextStyle getMessageTimeTextStyle() {
        return this.messageTimeTextStyle;
    }

    public final MessagePreviewStyle copy(TextStyle messageSenderTextStyle, TextStyle messageTextStyle, TextStyle messageTimeTextStyle) {
        AbstractC22676k.m65750j(messageSenderTextStyle, "messageSenderTextStyle");
        AbstractC22676k.m65750j(messageTextStyle, "messageTextStyle");
        AbstractC22676k.m65750j(messageTimeTextStyle, "messageTimeTextStyle");
        return new MessagePreviewStyle(messageSenderTextStyle, messageTextStyle, messageTimeTextStyle);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessagePreviewStyle)) {
            return false;
        }
        MessagePreviewStyle messagePreviewStyle = (MessagePreviewStyle) other;
        return AbstractC22676k.m65745e(this.messageSenderTextStyle, messagePreviewStyle.messageSenderTextStyle) && AbstractC22676k.m65745e(this.messageTextStyle, messagePreviewStyle.messageTextStyle) && AbstractC22676k.m65745e(this.messageTimeTextStyle, messagePreviewStyle.messageTimeTextStyle);
    }

    public final TextStyle getMessageSenderTextStyle() {
        return this.messageSenderTextStyle;
    }

    public final TextStyle getMessageTextStyle() {
        return this.messageTextStyle;
    }

    public final TextStyle getMessageTimeTextStyle() {
        return this.messageTimeTextStyle;
    }

    public final int hashCode() {
        return this.messageTimeTextStyle.hashCode() + AbstractC26725a.m79499c(this.messageTextStyle, this.messageSenderTextStyle.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MessagePreviewStyle(messageSenderTextStyle=" + this.messageSenderTextStyle + ", messageTextStyle=" + this.messageTextStyle + ", messageTimeTextStyle=" + this.messageTimeTextStyle + ")";
    }
}
