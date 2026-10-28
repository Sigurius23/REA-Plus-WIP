package io.getstream.chat.android.client.extensions.internal;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.MessageReminder;
import io.getstream.chat.android.models.MessageReminderInfo;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m65681d2 = {"toMessageReminderInfo", "Lio/getstream/chat/android/models/MessageReminderInfo;", "Lio/getstream/chat/android/models/MessageReminder;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageReminderKt {
    @InternalStreamChatApi
    public static final MessageReminderInfo toMessageReminderInfo(MessageReminder messageReminder) {
        AbstractC22676k.m65750j(messageReminder, "<this>");
        return new MessageReminderInfo(messageReminder.getRemindAt(), messageReminder.getCreatedAt(), messageReminder.getUpdatedAt());
    }
}
