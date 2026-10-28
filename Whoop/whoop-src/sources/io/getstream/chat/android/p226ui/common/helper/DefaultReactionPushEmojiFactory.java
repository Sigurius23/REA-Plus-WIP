package io.getstream.chat.android.p226ui.common.helper;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/DefaultReactionPushEmojiFactory;", "Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;", "<init>", "()V", "emojiCode", "", "type", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class DefaultReactionPushEmojiFactory implements ReactionPushEmojiFactory {
    @Override // io.getstream.chat.android.p226ui.common.helper.ReactionPushEmojiFactory
    public final String emojiCode(String type) {
        AbstractC22676k.m65750j(type, "type");
        switch (type) {
            case "sad":
                return "👎";
            case "wow":
                return "😮";
            case "haha":
                return "😂";
            case "like":
                return "👍";
            case "love":
                return "❤️";
            default:
                return null;
        }
    }
}
