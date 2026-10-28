package io.getstream.chat.android.p226ui.common.utils;

import i93.C18284j;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/utils/PollsConstants;", "", "<init>", "()V", "", "MIN_NUMBER_OF_MULTIPLE_ANSWERS", "I", "MAX_NUMBER_OF_MULTIPLE_ANSWERS", "Li93/j;", "MULTIPLE_ANSWERS_RANGE", "Li93/j;", "getMULTIPLE_ANSWERS_RANGE", "()Li93/j;", "MAX_NUMBER_OF_VISIBLE_OPTIONS", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollsConstants {
    public static final int MAX_NUMBER_OF_MULTIPLE_ANSWERS = 10;
    public static final int MAX_NUMBER_OF_VISIBLE_OPTIONS = 5;
    public static final int MIN_NUMBER_OF_MULTIPLE_ANSWERS = 2;
    public static final PollsConstants INSTANCE = new PollsConstants();
    private static final C18284j MULTIPLE_ANSWERS_RANGE = new C18284j(2, 10, 1);
    public static final int $stable = 8;

    private PollsConstants() {
    }

    public final C18284j getMULTIPLE_ANSWERS_RANGE() {
        return MULTIPLE_ANSWERS_RANGE;
    }
}
