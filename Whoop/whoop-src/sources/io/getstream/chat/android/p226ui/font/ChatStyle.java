package io.getstream.chat.android.p226ui.font;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/font/ChatStyle;", "", "<init>", "()V", "defaultTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "getDefaultTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "setDefaultTextStyle", "(Lio/getstream/chat/android/ui/font/TextStyle;)V", "hasDefaultFont", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatStyle {
    private TextStyle defaultTextStyle;

    public final TextStyle getDefaultTextStyle() {
        return this.defaultTextStyle;
    }

    public final boolean hasDefaultFont() {
        TextStyle textStyle = this.defaultTextStyle;
        return textStyle != null && textStyle.hasFont();
    }

    public final void setDefaultTextStyle(TextStyle textStyle) {
        this.defaultTextStyle = textStyle;
    }
}
