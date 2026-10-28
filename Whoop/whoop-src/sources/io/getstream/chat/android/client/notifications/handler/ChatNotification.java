package io.getstream.chat.android.client.notifications.handler;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import java.util.Map;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "", "<init>", "()V", "MessageNew", "MessageUpdated", "ReactionNew", "NotificationReminderDue", "Companion", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class ChatNotification {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String TYPE_MESSAGE_NEW = "message.new";
    public static final String TYPE_MESSAGE_UPDATED = "message.updated";
    public static final String TYPE_NOTIFICATION_REMINDER_DUE = "notification.reminder_due";
    public static final String TYPE_REACTION_NEW = "reaction.new";

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J0\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/ChatNotification$Companion;", "", "<init>", "()V", "TYPE_MESSAGE_NEW", "", "TYPE_MESSAGE_UPDATED", "TYPE_REACTION_NEW", "TYPE_NOTIFICATION_REMINDER_DUE", "create", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "type", "payload", "", "channel", "Lio/getstream/chat/android/models/Channel;", "message", "Lio/getstream/chat/android/models/Message;", "create$stream_chat_android_client_release", "createReactionNewNotification", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final ReactionNew createReactionNewNotification(Map<String, ? extends Object> payload, Channel channel, Message message) {
            Object obj = payload.get("title");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return null;
            }
            Object obj2 = payload.get("body");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null) {
                return null;
            }
            Object obj3 = payload.get("reaction_type");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            if (str3 == null) {
                return null;
            }
            Object obj4 = payload.get("reaction_user_id");
            String str4 = obj4 instanceof String ? (String) obj4 : null;
            if (str4 == null) {
                return null;
            }
            Object obj5 = payload.get("reaction_user_image");
            return new ReactionNew(str, str2, str3, str4, obj5 instanceof String ? (String) obj5 : null, channel, message);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ChatNotification create$stream_chat_android_client_release(String type, Map<String, ? extends Object> payload, Channel channel, Message message) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(payload, "payload");
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(message, "message");
            switch (type.hashCode()) {
                case -1717161893:
                    if (type.equals("reaction.new")) {
                        return createReactionNewNotification(payload, channel, message);
                    }
                    return null;
                case -934872620:
                    if (type.equals("message.updated")) {
                        return new MessageUpdated(channel, message);
                    }
                    return null;
                case -874236103:
                    if (type.equals("message.new")) {
                        return new MessageNew(channel, message);
                    }
                    return null;
                case -701520694:
                    if (type.equals("notification.reminder_due")) {
                        return new NotificationReminderDue(channel, message);
                    }
                    return null;
                default:
                    return null;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "channel", "Lio/getstream/chat/android/models/Channel;", "message", "Lio/getstream/chat/android/models/Message;", "<init>", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)V", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MessageNew extends ChatNotification {
        private final Channel channel;
        private final Message message;

        public MessageNew(Channel channel, Message message) {
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(message, "message");
            this.channel = channel;
            this.message = message;
        }

        public static /* synthetic */ MessageNew copy$default(MessageNew messageNew, Channel channel, Message message, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                channel = messageNew.channel;
            }
            if ((i13 & 2) != 0) {
                message = messageNew.message;
            }
            return messageNew.copy(channel, message);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Channel getChannel() {
            return this.channel;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        public final MessageNew copy(Channel channel, Message message) {
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(message, "message");
            return new MessageNew(channel, message);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageNew)) {
                return false;
            }
            MessageNew messageNew = (MessageNew) other;
            return AbstractC22676k.m65745e(this.channel, messageNew.channel) && AbstractC22676k.m65745e(this.message, messageNew.message);
        }

        public final Channel getChannel() {
            return this.channel;
        }

        public final Message getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.channel.hashCode() * 31);
        }

        public final String toString() {
            return "MessageNew(channel=" + this.channel + ", message=" + this.message + ")";
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "channel", "Lio/getstream/chat/android/models/Channel;", "message", "Lio/getstream/chat/android/models/Message;", "<init>", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)V", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MessageUpdated extends ChatNotification {
        private final Channel channel;
        private final Message message;

        public MessageUpdated(Channel channel, Message message) {
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(message, "message");
            this.channel = channel;
            this.message = message;
        }

        public static /* synthetic */ MessageUpdated copy$default(MessageUpdated messageUpdated, Channel channel, Message message, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                channel = messageUpdated.channel;
            }
            if ((i13 & 2) != 0) {
                message = messageUpdated.message;
            }
            return messageUpdated.copy(channel, message);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Channel getChannel() {
            return this.channel;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        public final MessageUpdated copy(Channel channel, Message message) {
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(message, "message");
            return new MessageUpdated(channel, message);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageUpdated)) {
                return false;
            }
            MessageUpdated messageUpdated = (MessageUpdated) other;
            return AbstractC22676k.m65745e(this.channel, messageUpdated.channel) && AbstractC22676k.m65745e(this.message, messageUpdated.message);
        }

        public final Channel getChannel() {
            return this.channel;
        }

        public final Message getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.channel.hashCode() * 31);
        }

        public final String toString() {
            return "MessageUpdated(channel=" + this.channel + ", message=" + this.message + ")";
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "channel", "Lio/getstream/chat/android/models/Channel;", "message", "Lio/getstream/chat/android/models/Message;", "<init>", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)V", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class NotificationReminderDue extends ChatNotification {
        private final Channel channel;
        private final Message message;

        public NotificationReminderDue(Channel channel, Message message) {
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(message, "message");
            this.channel = channel;
            this.message = message;
        }

        public static /* synthetic */ NotificationReminderDue copy$default(NotificationReminderDue notificationReminderDue, Channel channel, Message message, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                channel = notificationReminderDue.channel;
            }
            if ((i13 & 2) != 0) {
                message = notificationReminderDue.message;
            }
            return notificationReminderDue.copy(channel, message);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Channel getChannel() {
            return this.channel;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        public final NotificationReminderDue copy(Channel channel, Message message) {
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(message, "message");
            return new NotificationReminderDue(channel, message);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationReminderDue)) {
                return false;
            }
            NotificationReminderDue notificationReminderDue = (NotificationReminderDue) other;
            return AbstractC22676k.m65745e(this.channel, notificationReminderDue.channel) && AbstractC22676k.m65745e(this.message, notificationReminderDue.message);
        }

        public final Channel getChannel() {
            return this.channel;
        }

        public final Message getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.channel.hashCode() * 31);
        }

        public final String toString() {
            return "NotificationReminderDue(channel=" + this.channel + ", message=" + this.message + ")";
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "title", "", "body", "type", "reactionUserId", "reactionUserImageUrl", "channel", "Lio/getstream/chat/android/models/Channel;", "message", "Lio/getstream/chat/android/models/Message;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getType", "getReactionUserId", "getReactionUserImageUrl", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class ReactionNew extends ChatNotification {
        private final String body;
        private final Channel channel;
        private final Message message;
        private final String reactionUserId;
        private final String reactionUserImageUrl;
        private final String title;
        private final String type;

        public ReactionNew(String title, String body, String type, String reactionUserId, String str, Channel channel, Message message) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(body, "body");
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(reactionUserId, "reactionUserId");
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(message, "message");
            this.title = title;
            this.body = body;
            this.type = type;
            this.reactionUserId = reactionUserId;
            this.reactionUserImageUrl = str;
            this.channel = channel;
            this.message = message;
        }

        public static /* synthetic */ ReactionNew copy$default(ReactionNew reactionNew, String str, String str2, String str3, String str4, String str5, Channel channel, Message message, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = reactionNew.title;
            }
            if ((i13 & 2) != 0) {
                str2 = reactionNew.body;
            }
            if ((i13 & 4) != 0) {
                str3 = reactionNew.type;
            }
            if ((i13 & 8) != 0) {
                str4 = reactionNew.reactionUserId;
            }
            if ((i13 & 16) != 0) {
                str5 = reactionNew.reactionUserImageUrl;
            }
            if ((i13 & 32) != 0) {
                channel = reactionNew.channel;
            }
            if ((i13 & 64) != 0) {
                message = reactionNew.message;
            }
            Channel channel2 = channel;
            Message message2 = message;
            String str6 = str5;
            String str7 = str3;
            return reactionNew.copy(str, str2, str7, str4, str6, channel2, message2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getReactionUserId() {
            return this.reactionUserId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getReactionUserImageUrl() {
            return this.reactionUserImageUrl;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Channel getChannel() {
            return this.channel;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        public final ReactionNew copy(String title, String body, String type, String reactionUserId, String reactionUserImageUrl, Channel channel, Message message) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(body, "body");
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(reactionUserId, "reactionUserId");
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(message, "message");
            return new ReactionNew(title, body, type, reactionUserId, reactionUserImageUrl, channel, message);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReactionNew)) {
                return false;
            }
            ReactionNew reactionNew = (ReactionNew) other;
            return AbstractC22676k.m65745e(this.title, reactionNew.title) && AbstractC22676k.m65745e(this.body, reactionNew.body) && AbstractC22676k.m65745e(this.type, reactionNew.type) && AbstractC22676k.m65745e(this.reactionUserId, reactionNew.reactionUserId) && AbstractC22676k.m65745e(this.reactionUserImageUrl, reactionNew.reactionUserImageUrl) && AbstractC22676k.m65745e(this.channel, reactionNew.channel) && AbstractC22676k.m65745e(this.message, reactionNew.message);
        }

        public final String getBody() {
            return this.body;
        }

        public final Channel getChannel() {
            return this.channel;
        }

        public final Message getMessage() {
            return this.message;
        }

        public final String getReactionUserId() {
            return this.reactionUserId;
        }

        public final String getReactionUserImageUrl() {
            return this.reactionUserImageUrl;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.body), 31, this.type), 31, this.reactionUserId);
            String str = this.reactionUserImageUrl;
            return this.message.hashCode() + ((this.channel.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            String str = this.title;
            String str2 = this.body;
            String str3 = this.type;
            String str4 = this.reactionUserId;
            String str5 = this.reactionUserImageUrl;
            Channel channel = this.channel;
            Message message = this.message;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ReactionNew(title=", str, ", body=", str2, ", type=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", reactionUserId=", str4, ", reactionUserImageUrl=");
            sbM32001t.append(str5);
            sbM32001t.append(", channel=");
            sbM32001t.append(channel);
            sbM32001t.append(", message=");
            sbM32001t.append(message);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    private ChatNotification() {
    }

    public ChatNotification(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
