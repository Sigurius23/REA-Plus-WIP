package io.getstream.chat.android.p226ui.common.utils;

import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.AbstractC38176k;
import yb3.AbstractC39414r;
import yb3.C39412p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/utils/EmojiUtil;", "", "<init>", "()V", "Lio/getstream/chat/android/models/Message;", "message", "", "isEmojiOnly", "(Lio/getstream/chat/android/models/Message;)Z", "isSingleEmoji", "", "getEmojiCount", "(Lio/getstream/chat/android/models/Message;)I", "Lyb3/p;", "EMOJI_REGEX", "Lyb3/p;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EmojiUtil {
    public static final EmojiUtil INSTANCE = new EmojiUtil();
    private static final C39412p EMOJI_REGEX = new C39412p("(?:[\\u2700-\\u27bf]|(?:[\\ud83c\\udde6-\\ud83c\\uddff]){2}|[\\ud800\\udc00-\\uDBFF\\uDFFF]|[\\u2600-\\u26FF])[\\ufe0e\\ufe0f]?(?:[\\u0300-\\u036f\\ufe20-\\ufe23\\u20d0-\\u20f0]|[\\ud83c\\udffb-\\ud83c\\udfff])?(?:\\u200d(?:[^\\ud800-\\udfff]|(?:[\\ud83c\\udde6-\\ud83c\\uddff]){2}|[\\ud800\\udc00-\\uDBFF\\uDFFF]|[\\u2600-\\u26FF])[\\ufe0e\\ufe0f]?(?:[\\u0300-\\u036f\\ufe20-\\ufe23\\u20d0-\\u20f0]|[\\ud83c\\udffb-\\ud83c\\udfff])?)*|[\\u0023-\\u0039]\\ufe0f?\\u20e3|\\u3299|\\u3297|\\u303d|\\u3030|\\u24c2|[\\ud83c\\udd70-\\ud83c\\udd71]|[\\ud83c\\udd7e-\\ud83c\\udd7f]|\\ud83c\\udd8e|[\\ud83c\\udd91-\\ud83c\\udd9a]|[\\ud83c\\udde6-\\ud83c\\uddff]|[\\ud83c\\ude01-\\ud83c\\ude02]|\\ud83c\\ude1a|\\ud83c\\ude2f|[\\ud83c\\ude32-\\ud83c\\ude3a]|[\\ud83c\\ude50-\\ud83c\\ude51]|\\u203c|\\u2049|[\\u25aa-\\u25ab]|\\u25b6|\\u25c0|[\\u25fb-\\u25fe]|\\u00a9|\\u00ae|\\u2122|\\u2139|\\ud83c\\udc04|[\\u2600-\\u26FF]|\\u2b05|\\u2b06|\\u2b07|\\u2b1b|\\u2b1c|\\u2b50|\\u2b55|\\u231a|\\u231b|\\u2328|\\u23cf|[\\u23e9-\\u23f3]|[\\u23f8-\\u23fa]|\\ud83c\\udccf|\\u2934|\\u2935|[\\u2190-\\u21ff]");
    public static final int $stable = 8;

    private EmojiUtil() {
    }

    public final int getEmojiCount(Message message) {
        AbstractC22676k.m65750j(message, "message");
        return AbstractC38176k.m122280p(C39412p.m125847b(message.getText(), EMOJI_REGEX));
    }

    public final boolean isEmojiOnly(Message message) {
        AbstractC22676k.m65750j(message, "message");
        if (AbstractC39414r.m125890i0(message.getText())) {
            return false;
        }
        return EMOJI_REGEX.m125852f(message.getText(), "").length() == 0 && message.getDeletedAt() == null;
    }

    public final boolean isSingleEmoji(Message message) {
        AbstractC22676k.m65750j(message, "message");
        if (!isEmojiOnly(message)) {
            return false;
        }
        String input = message.getText();
        C39412p c39412p = EMOJI_REGEX;
        c39412p.getClass();
        AbstractC22676k.m65750j(input, "input");
        String strReplaceFirst = c39412p.f169588w.matcher(input).replaceFirst("");
        AbstractC22676k.m65749i(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst.length() == 0;
    }
}
