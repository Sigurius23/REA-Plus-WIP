package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator;

import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import ge3.AbstractC15751g;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ/\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "T", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "viewHolder", "data", "Ll83/a0;", "decorate", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "getType", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "type", "Type", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface Decorator {

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "", "BuiltIn", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface Type {

        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type$BuiltIn;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "", "<init>", "(Ljava/lang/String;I)V", "AVATAR", "BACKGROUND", "FAILED_INDICATOR", "FOOTNOTE", "GAP", "MAX_POSSIBLE_WIDTH", "MESSAGE_CONTAINER_MARGIN", "PIN_INDICATOR", "REACTIONS", "REPLY", ShippingAddressField.TEXT_FIELD_TYPE, "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public enum BuiltIn implements Type {
            AVATAR,
            BACKGROUND,
            FAILED_INDICATOR,
            FOOTNOTE,
            GAP,
            MAX_POSSIBLE_WIDTH,
            MESSAGE_CONTAINER_MARGIN,
            PIN_INDICATOR,
            REACTIONS,
            REPLY,
            TEXT;

            private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

            public static InterfaceC33616a getEntries() {
                return $ENTRIES;
            }
        }
    }

    <T extends MessageListItem> void decorate(BaseMessageItemViewHolder<T> viewHolder, T data);

    Type getType();
}
