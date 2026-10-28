package io.getstream.chat.android.p226ui.common.feature.messages.list;

import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.models.Message;
import java.util.Calendar;
import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;", "", "shouldAddDateSeparator", "", "previousMessage", "Lio/getstream/chat/android/models/Message;", "message", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface DateSeparatorHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0014\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;", "", "<init>", "()V", "defaultDateSeparatorHandler", "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;", "getDefaultDateSeparatorHandler", "getDefaultThreadDateSeparatorHandler", "isInTheSameDay", "", "Ljava/util/Date;", "that", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final DateSeparatorHandler defaultDateSeparatorHandler = new C19585a(0);

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean defaultDateSeparatorHandler$lambda$0(Message message, Message message2) {
            Date never;
            AbstractC22676k.m65750j(message2, "message");
            Companion companion = $$INSTANCE;
            Date createdAtOrDefault = MessageExtensionsKt.getCreatedAtOrDefault(message2, MessageKt.getNEVER());
            if (message == null || (never = MessageExtensionsKt.getCreatedAtOrNull(message)) == null) {
                never = MessageKt.getNEVER();
            }
            return !companion.isInTheSameDay(createdAtOrDefault, never);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean getDefaultThreadDateSeparatorHandler$lambda$2(Message message, Message message2) {
            AbstractC22676k.m65750j(message2, "message");
            if (message != null) {
                return defaultDateSeparatorHandler.shouldAddDateSeparator(message, message2);
            }
            return false;
        }

        private final boolean isInTheSameDay(Date date, Date date2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date2);
            return calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1);
        }

        public final DateSeparatorHandler getDefaultDateSeparatorHandler() {
            return defaultDateSeparatorHandler;
        }

        public final DateSeparatorHandler getDefaultThreadDateSeparatorHandler() {
            return new C19585a(1);
        }
    }

    boolean shouldAddDateSeparator(Message previousMessage, Message message);
}
