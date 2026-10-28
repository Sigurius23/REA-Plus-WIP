package io.getstream.chat.android.p226ui.common.state.channel.attachments;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;", "", "Loading", "Content", "Error", "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;", "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Error;", "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Loading;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelAttachmentsViewState {

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\r¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content;", "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;", "items", "", "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content$Item;", "canLoadMore", "", "isLoadingMore", "<init>", "(Ljava/util/List;ZZ)V", "getItems", "()Ljava/util/List;", "getCanLoadMore", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Item", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Content implements ChannelAttachmentsViewState {
        public static final int $stable = 8;
        private final boolean canLoadMore;
        private final boolean isLoadingMore;
        private final List<Item> items;

        @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Content$Item;", "", "message", "Lio/getstream/chat/android/models/Message;", "attachment", "Lio/getstream/chat/android/models/Attachment;", "<init>", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getAttachment", "()Lio/getstream/chat/android/models/Attachment;", "id", "", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class Item {
            public static final int $stable = 0;
            private final Attachment attachment;
            private final String id;
            private final Message message;

            public Item(Message message, Attachment attachment) {
                AbstractC22676k.m65750j(message, "message");
                AbstractC22676k.m65750j(attachment, "attachment");
                this.message = message;
                this.attachment = attachment;
                this.id = message.identifierHash() + "-" + attachment.hashCode();
            }

            public static /* synthetic */ Item copy$default(Item item, Message message, Attachment attachment, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    message = item.message;
                }
                if ((i13 & 2) != 0) {
                    attachment = item.attachment;
                }
                return item.copy(message, attachment);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Message getMessage() {
                return this.message;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Attachment getAttachment() {
                return this.attachment;
            }

            public final Item copy(Message message, Attachment attachment) {
                AbstractC22676k.m65750j(message, "message");
                AbstractC22676k.m65750j(attachment, "attachment");
                return new Item(message, attachment);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Item)) {
                    return false;
                }
                Item item = (Item) other;
                return AbstractC22676k.m65745e(this.message, item.message) && AbstractC22676k.m65745e(this.attachment, item.attachment);
            }

            public final Attachment getAttachment() {
                return this.attachment;
            }

            public final String getId() {
                return this.id;
            }

            public final Message getMessage() {
                return this.message;
            }

            public final int hashCode() {
                return this.attachment.hashCode() + (this.message.hashCode() * 31);
            }

            public final String toString() {
                return "Item(message=" + this.message + ", attachment=" + this.attachment + ")";
            }
        }

        public Content() {
            this(null, false, false, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, boolean z4, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = content.items;
            }
            if ((i13 & 2) != 0) {
                z4 = content.canLoadMore;
            }
            if ((i13 & 4) != 0) {
                z13 = content.isLoadingMore;
            }
            return content.copy(list, z4, z13);
        }

        public final List<Item> component1() {
            return this.items;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getCanLoadMore() {
            return this.canLoadMore;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsLoadingMore() {
            return this.isLoadingMore;
        }

        public final Content copy(List<Item> items, boolean canLoadMore, boolean isLoadingMore) {
            AbstractC22676k.m65750j(items, "items");
            return new Content(items, canLoadMore, isLoadingMore);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return AbstractC22676k.m65745e(this.items, content.items) && this.canLoadMore == content.canLoadMore && this.isLoadingMore == content.isLoadingMore;
        }

        public final boolean getCanLoadMore() {
            return this.canLoadMore;
        }

        public final List<Item> getItems() {
            return this.items;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isLoadingMore) + AbstractC2875y.m8289b(this.items.hashCode() * 31, 31, this.canLoadMore);
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        public final String toString() {
            List<Item> list = this.items;
            boolean z4 = this.canLoadMore;
            boolean z13 = this.isLoadingMore;
            StringBuilder sb4 = new StringBuilder("Content(items=");
            sb4.append(list);
            sb4.append(", canLoadMore=");
            sb4.append(z4);
            sb4.append(", isLoadingMore=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }

        public Content(List<Item> items, boolean z4, boolean z13) {
            AbstractC22676k.m65750j(items, "items");
            this.items = items;
            this.canLoadMore = z4;
            this.isLoadingMore = z13;
        }

        public /* synthetic */ Content(List list, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? true : z4, (i13 & 4) != 0 ? false : z13);
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Error;", "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Error implements ChannelAttachmentsViewState {
        public static final int $stable = 0;
        private final String message;

        public Error(String message) {
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Error copy(String message) {
            AbstractC22676k.m65750j(message, "message");
            return new Error(message);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && AbstractC22676k.m65745e(this.message, ((Error) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return AbstractC11895b.m31996o("Error(message=", this.message, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState$Loading;", "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Loading implements ChannelAttachmentsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public final int hashCode() {
            return -965167127;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
