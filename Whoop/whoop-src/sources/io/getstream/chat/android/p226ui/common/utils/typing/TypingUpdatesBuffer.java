package io.getstream.chat.android.p226ui.common.utils.typing;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;", "", "", "inputText", "Ll83/a0;", "onKeystroke", "(Ljava/lang/String;)V", "clear", "()V", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface TypingUpdatesBuffer {
    void clear();

    void onKeystroke(String inputText);
}
