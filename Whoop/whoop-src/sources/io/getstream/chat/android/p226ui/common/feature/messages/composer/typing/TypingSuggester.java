package io.getstream.chat.android.p226ui.common.feature.messages.composer.typing;

import e93.AbstractC12889b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;", "", "options", "Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;", "<init>", "(Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;)V", "typingSuggestion", "Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestion;", "text", "", "caretLocation", "", "typingSuggestion$stream_chat_android_ui_common_release", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TypingSuggester {
    public static final int $stable = 0;
    private final TypingSuggestionOptions options;

    public TypingSuggester(TypingSuggestionOptions options) {
        AbstractC22676k.m65750j(options, "options");
        this.options = options;
    }

    public static /* synthetic */ TypingSuggestion typingSuggestion$stream_chat_android_ui_common_release$default(TypingSuggester typingSuggester, CharSequence charSequence, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = charSequence.length();
        }
        return typingSuggester.typingSuggestion$stream_chat_android_ui_common_release(charSequence, i13);
    }

    public final TypingSuggestion typingSuggestion$stream_chat_android_ui_common_release(CharSequence text, int caretLocation) {
        int length;
        AbstractC22676k.m65750j(text, "text");
        int iM125893l0 = AbstractC39414r.m125893l0(text, this.options.getSymbol(), caretLocation - 1, 4);
        if (iM125893l0 == -1) {
            return null;
        }
        if (iM125893l0 != 0 && !AbstractC35846d.m113784i(text.charAt(iM125893l0 - 1))) {
            return null;
        }
        if ((this.options.getShouldTriggerOnlyAtStart() && iM125893l0 != 0) || caretLocation < (length = this.options.getSymbol().length() + iM125893l0)) {
            return null;
        }
        String string = text.subSequence(length, caretLocation).toString();
        if (string.length() < this.options.getMinimumRequiredCharacters()) {
            return null;
        }
        return new TypingSuggestion(string, AbstractC12889b.m36278i0(length, caretLocation));
    }
}
