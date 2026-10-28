package io.getstream.chat.android.p226ui.feature.messages.list.adapter;

import com.mapbox.common.HttpHeaders;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessagePosition;
import java.util.Date;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00102\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0006\u001a\u00020\u0007H&\u0082\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "", "<init>", "()V", "getStableId", "", "stringify", "", "DateSeparatorItem", "MessageItem", "TypingItem", "ThreadSeparatorItem", "LoadingMoreIndicatorItem", "ThreadPlaceholderItem", "UnreadSeparatorItem", "StartOfTheChannelItem", "Companion", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadPlaceholderItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class MessageListItem {
    private static final Companion Companion = new Companion();
    private static final long LOADING_MORE_INDICATOR_STABLE_ID = 3;
    private static final long START_OF_THE_CHANNEL_STABLE_ID = 6;
    private static final long THREAD_PLACEHOLDER_STABLE_ID = 4;
    private static final long THREAD_SEPARATOR_ITEM_STABLE_ID = 2;
    private static final long TYPING_ITEM_STABLE_ID = 1;
    private static final long UNREAD_SEPARATOR_STABLE_ID = 5;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$Companion;", "", "<init>", "()V", "TYPING_ITEM_STABLE_ID", "", "THREAD_SEPARATOR_ITEM_STABLE_ID", "LOADING_MORE_INDICATOR_STABLE_ID", "THREAD_PLACEHOLDER_STABLE_ID", "UNREAD_SEPARATOR_STABLE_ID", "START_OF_THE_CHANNEL_STABLE_ID", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", HttpHeaders.DATE, "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "stringify", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class DateSeparatorItem extends MessageListItem {
        private final Date date;

        public DateSeparatorItem(Date date) {
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        public static /* synthetic */ DateSeparatorItem copy$default(DateSeparatorItem dateSeparatorItem, Date date, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                date = dateSeparatorItem.date;
            }
            return dateSeparatorItem.copy(date);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        public final DateSeparatorItem copy(Date date) {
            AbstractC22676k.m65750j(date, "date");
            return new DateSeparatorItem(date);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DateSeparatorItem) && AbstractC22676k.m65745e(this.date, ((DateSeparatorItem) other).date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final int hashCode() {
            return this.date.hashCode();
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem
        public final String stringify() {
            return "DateItem(date=" + this.date + ")";
        }

        public final String toString() {
            return "DateSeparatorItem(date=" + this.date + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "<init>", "()V", "stringify", "", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class LoadingMoreIndicatorItem extends MessageListItem {
        public static final LoadingMoreIndicatorItem INSTANCE = new LoadingMoreIndicatorItem();

        private LoadingMoreIndicatorItem() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof LoadingMoreIndicatorItem);
        }

        public final int hashCode() {
            return 1168945425;
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem
        public final String stringify() {
            return "LoadingMoreIndicatorItem";
        }

        public final String toString() {
            return "LoadingMoreIndicatorItem";
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "channel", "Lio/getstream/chat/android/models/Channel;", "<init>", "(Lio/getstream/chat/android/models/Channel;)V", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "stringify", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class StartOfTheChannelItem extends MessageListItem {
        private final Channel channel;

        public StartOfTheChannelItem(Channel channel) {
            AbstractC22676k.m65750j(channel, "channel");
            this.channel = channel;
        }

        public static /* synthetic */ StartOfTheChannelItem copy$default(StartOfTheChannelItem startOfTheChannelItem, Channel channel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                channel = startOfTheChannelItem.channel;
            }
            return startOfTheChannelItem.copy(channel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Channel getChannel() {
            return this.channel;
        }

        public final StartOfTheChannelItem copy(Channel channel) {
            AbstractC22676k.m65750j(channel, "channel");
            return new StartOfTheChannelItem(channel);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartOfTheChannelItem) && AbstractC22676k.m65745e(this.channel, ((StartOfTheChannelItem) other).channel);
        }

        public final Channel getChannel() {
            return this.channel;
        }

        public final int hashCode() {
            return this.channel.hashCode();
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem
        public final String stringify() {
            return AbstractC11895b.m31996o("StartOfTheChannelItem(channel.name=", this.channel.getName(), ")");
        }

        public final String toString() {
            return "StartOfTheChannelItem(channel=" + this.channel + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadPlaceholderItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "<init>", "()V", "stringify", "", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class ThreadPlaceholderItem extends MessageListItem {
        public static final ThreadPlaceholderItem INSTANCE = new ThreadPlaceholderItem();

        private ThreadPlaceholderItem() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof ThreadPlaceholderItem);
        }

        public final int hashCode() {
            return 452020540;
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem
        public final String stringify() {
            LoadingMoreIndicatorItem.INSTANCE.getClass();
            return "LoadingMoreIndicatorItem";
        }

        public final String toString() {
            return "ThreadPlaceholderItem";
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", HttpHeaders.DATE, "Ljava/util/Date;", "messageCount", "", "<init>", "(Ljava/util/Date;I)V", "getDate", "()Ljava/util/Date;", "getMessageCount", "()I", "stringify", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class ThreadSeparatorItem extends MessageListItem {
        private final Date date;
        private final int messageCount;

        public ThreadSeparatorItem(Date date, int i13) {
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
            this.messageCount = i13;
        }

        public static /* synthetic */ ThreadSeparatorItem copy$default(ThreadSeparatorItem threadSeparatorItem, Date date, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                date = threadSeparatorItem.date;
            }
            if ((i14 & 2) != 0) {
                i13 = threadSeparatorItem.messageCount;
            }
            return threadSeparatorItem.copy(date, i13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMessageCount() {
            return this.messageCount;
        }

        public final ThreadSeparatorItem copy(Date date, int messageCount) {
            AbstractC22676k.m65750j(date, "date");
            return new ThreadSeparatorItem(date, messageCount);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThreadSeparatorItem)) {
                return false;
            }
            ThreadSeparatorItem threadSeparatorItem = (ThreadSeparatorItem) other;
            return AbstractC22676k.m65745e(this.date, threadSeparatorItem.date) && this.messageCount == threadSeparatorItem.messageCount;
        }

        public final Date getDate() {
            return this.date;
        }

        public final int getMessageCount() {
            return this.messageCount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.messageCount) + (this.date.hashCode() * 31);
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem
        public final String stringify() {
            return "ThreadSeparatorItem(messageCount=" + this.messageCount + ", date=" + this.date + ")";
        }

        public final String toString() {
            return "ThreadSeparatorItem(date=" + this.date + ", messageCount=" + this.messageCount + ")";
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "users", "", "Lio/getstream/chat/android/models/User;", "<init>", "(Ljava/util/List;)V", "getUsers", "()Ljava/util/List;", "stringify", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class TypingItem extends MessageListItem {
        private final List<User> users;

        public TypingItem(List<User> users) {
            AbstractC22676k.m65750j(users, "users");
            this.users = users;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TypingItem copy$default(TypingItem typingItem, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = typingItem.users;
            }
            return typingItem.copy(list);
        }

        public final List<User> component1() {
            return this.users;
        }

        public final TypingItem copy(List<User> users) {
            AbstractC22676k.m65750j(users, "users");
            return new TypingItem(users);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TypingItem) && AbstractC22676k.m65745e(this.users, ((TypingItem) other).users);
        }

        public final List<User> getUsers() {
            return this.users;
        }

        public final int hashCode() {
            return this.users.hashCode();
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem
        public final String stringify() {
            return AbstractC2875y.m8296i(this.users.size(), "TypingItem(users.size=", ")");
        }

        public final String toString() {
            return AbstractC33745d.m106654m("TypingItem(users=", ")", this.users);
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "unreadCount", "", "<init>", "(I)V", "getUnreadCount", "()I", "stringify", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnreadSeparatorItem extends MessageListItem {
        private final int unreadCount;

        public UnreadSeparatorItem(int i13) {
            this.unreadCount = i13;
        }

        public static UnreadSeparatorItem copy$default(UnreadSeparatorItem unreadSeparatorItem, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = unreadSeparatorItem.unreadCount;
            }
            unreadSeparatorItem.getClass();
            return new UnreadSeparatorItem(i13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getUnreadCount() {
            return this.unreadCount;
        }

        public final UnreadSeparatorItem copy(int unreadCount) {
            return new UnreadSeparatorItem(unreadCount);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnreadSeparatorItem) && this.unreadCount == ((UnreadSeparatorItem) other).unreadCount;
        }

        public final int getUnreadCount() {
            return this.unreadCount;
        }

        public final int hashCode() {
            return Integer.hashCode(this.unreadCount);
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem
        public final String stringify() {
            return AbstractC2875y.m8296i(this.unreadCount, "UnreadItem(unreadCount=", ")");
        }

        public final String toString() {
            return AbstractC2875y.m8296i(this.unreadCount, "UnreadSeparatorItem(unreadCount=", ")");
        }
    }

    private MessageListItem() {
    }

    public final long getStableId() {
        if (this instanceof TypingItem) {
            return 1L;
        }
        if (this instanceof ThreadSeparatorItem) {
            return THREAD_SEPARATOR_ITEM_STABLE_ID;
        }
        if (this instanceof MessageItem) {
            return ((MessageItem) this).uniqueIdentifier$stream_chat_android_ui_components_release();
        }
        if (this instanceof DateSeparatorItem) {
            return ((DateSeparatorItem) this).getDate().getTime();
        }
        if (this instanceof LoadingMoreIndicatorItem) {
            return LOADING_MORE_INDICATOR_STABLE_ID;
        }
        if (this instanceof ThreadPlaceholderItem) {
            return THREAD_PLACEHOLDER_STABLE_ID;
        }
        if (this instanceof UnreadSeparatorItem) {
            return UNREAD_SEPARATOR_STABLE_ID;
        }
        if (this instanceof StartOfTheChannelItem) {
            return START_OF_THE_CHANNEL_STABLE_ID;
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract String stringify();

    public MessageListItem(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020 H\u0016J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003Ji\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016¨\u00061"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "message", "Lio/getstream/chat/android/models/Message;", "position", "Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;", "isMine", "", "messageReadBy", "", "Lio/getstream/chat/android/models/ChannelUserRead;", "isThreadMode", "isMessageRead", "isMessageDelivered", "showMessageFooter", "showOriginalText", "<init>", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZ)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getPosition", "()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;", "()Z", "getMessageReadBy", "()Ljava/util/List;", "getShowMessageFooter", "getShowOriginalText", "isTheirs", "uniqueIdentifier", "", "uniqueIdentifier$stream_chat_android_ui_components_release", "stringify", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class MessageItem extends MessageListItem {
        private final boolean isMessageDelivered;
        private final boolean isMessageRead;
        private final boolean isMine;
        private final boolean isThreadMode;
        private final Message message;
        private final List<ChannelUserRead> messageReadBy;
        private final MessagePosition position;
        private final boolean showMessageFooter;
        private final boolean showOriginalText;

        public MessageItem(Message message, MessagePosition position, boolean z4, List<ChannelUserRead> messageReadBy, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(position, "position");
            AbstractC22676k.m65750j(messageReadBy, "messageReadBy");
            this.message = message;
            this.position = position;
            this.isMine = z4;
            this.messageReadBy = messageReadBy;
            this.isThreadMode = z13;
            this.isMessageRead = z14;
            this.isMessageDelivered = z15;
            this.showMessageFooter = z16;
            this.showOriginalText = z17;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MessageItem copy$default(MessageItem messageItem, Message message, MessagePosition messagePosition, boolean z4, List list, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                message = messageItem.message;
            }
            if ((i13 & 2) != 0) {
                messagePosition = messageItem.position;
            }
            if ((i13 & 4) != 0) {
                z4 = messageItem.isMine;
            }
            if ((i13 & 8) != 0) {
                list = messageItem.messageReadBy;
            }
            if ((i13 & 16) != 0) {
                z13 = messageItem.isThreadMode;
            }
            if ((i13 & 32) != 0) {
                z14 = messageItem.isMessageRead;
            }
            if ((i13 & 64) != 0) {
                z15 = messageItem.isMessageDelivered;
            }
            if ((i13 & 128) != 0) {
                z16 = messageItem.showMessageFooter;
            }
            if ((i13 & 256) != 0) {
                z17 = messageItem.showOriginalText;
            }
            boolean z18 = z16;
            boolean z19 = z17;
            boolean z24 = z14;
            boolean z25 = z15;
            boolean z26 = z13;
            boolean z27 = z4;
            return messageItem.copy(message, messagePosition, z27, list, z26, z24, z25, z18, z19);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessagePosition getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsMine() {
            return this.isMine;
        }

        public final List<ChannelUserRead> component4() {
            return this.messageReadBy;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsThreadMode() {
            return this.isThreadMode;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsMessageRead() {
            return this.isMessageRead;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsMessageDelivered() {
            return this.isMessageDelivered;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getShowMessageFooter() {
            return this.showMessageFooter;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getShowOriginalText() {
            return this.showOriginalText;
        }

        public final MessageItem copy(Message message, MessagePosition position, boolean isMine, List<ChannelUserRead> messageReadBy, boolean isThreadMode, boolean isMessageRead, boolean isMessageDelivered, boolean showMessageFooter, boolean showOriginalText) {
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(position, "position");
            AbstractC22676k.m65750j(messageReadBy, "messageReadBy");
            return new MessageItem(message, position, isMine, messageReadBy, isThreadMode, isMessageRead, isMessageDelivered, showMessageFooter, showOriginalText);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageItem)) {
                return false;
            }
            MessageItem messageItem = (MessageItem) other;
            return AbstractC22676k.m65745e(this.message, messageItem.message) && this.position == messageItem.position && this.isMine == messageItem.isMine && AbstractC22676k.m65745e(this.messageReadBy, messageItem.messageReadBy) && this.isThreadMode == messageItem.isThreadMode && this.isMessageRead == messageItem.isMessageRead && this.isMessageDelivered == messageItem.isMessageDelivered && this.showMessageFooter == messageItem.showMessageFooter && this.showOriginalText == messageItem.showOriginalText;
        }

        public final Message getMessage() {
            return this.message;
        }

        public final List<ChannelUserRead> getMessageReadBy() {
            return this.messageReadBy;
        }

        public final MessagePosition getPosition() {
            return this.position;
        }

        public final boolean getShowMessageFooter() {
            return this.showMessageFooter;
        }

        public final boolean getShowOriginalText() {
            return this.showOriginalText;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showOriginalText) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC2875y.m8289b((this.position.hashCode() + (this.message.hashCode() * 31)) * 31, 31, this.isMine), 31, this.messageReadBy), 31, this.isThreadMode), 31, this.isMessageRead), 31, this.isMessageDelivered), 31, this.showMessageFooter);
        }

        public final boolean isMessageDelivered() {
            return this.isMessageDelivered;
        }

        public final boolean isMessageRead() {
            return this.isMessageRead;
        }

        public final boolean isMine() {
            return this.isMine;
        }

        public final boolean isTheirs() {
            return !this.isMine;
        }

        public final boolean isThreadMode() {
            return this.isThreadMode;
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem
        public final String stringify() {
            return AbstractC11895b.m31996o("MessageItem(message=", this.message.getText(), ")");
        }

        public final String toString() {
            Message message = this.message;
            MessagePosition messagePosition = this.position;
            boolean z4 = this.isMine;
            List<ChannelUserRead> list = this.messageReadBy;
            boolean z13 = this.isThreadMode;
            boolean z14 = this.isMessageRead;
            boolean z15 = this.isMessageDelivered;
            boolean z16 = this.showMessageFooter;
            boolean z17 = this.showOriginalText;
            StringBuilder sb4 = new StringBuilder("MessageItem(message=");
            sb4.append(message);
            sb4.append(", position=");
            sb4.append(messagePosition);
            sb4.append(", isMine=");
            AbstractC25012a.m73391x(", messageReadBy=", ", isThreadMode=", sb4, list, z4);
            AbstractC38963t7.m124392v(sb4, z13, ", isMessageRead=", z14, ", isMessageDelivered=");
            AbstractC38963t7.m124392v(sb4, z15, ", showMessageFooter=", z16, ", showOriginalText=");
            return AbstractC18489d0.m53372m(sb4, z17, ")");
        }

        public final long uniqueIdentifier$stream_chat_android_ui_components_release() {
            return this.message.identifierHash();
        }

        public /* synthetic */ MessageItem(Message message, MessagePosition messagePosition, boolean z4, List list, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(message, (i13 & 2) != 0 ? MessagePosition.NONE : messagePosition, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? true : z14, (i13 & 64) != 0 ? false : z15, (i13 & 128) != 0 ? false : z16, (i13 & 256) != 0 ? false : z17);
        }
    }
}
