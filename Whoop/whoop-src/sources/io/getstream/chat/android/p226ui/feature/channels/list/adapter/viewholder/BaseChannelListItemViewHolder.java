package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1717o2;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListItem;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListPayloadDiff;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;", "channelItem", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;", "diff", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class BaseChannelListItemViewHolder extends AbstractC1717o2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChannelListItemViewHolder(View itemView) {
        super(itemView);
        AbstractC22676k.m65750j(itemView, "itemView");
    }

    public abstract void bind(ChannelListItem.ChannelItem channelItem, ChannelListPayloadDiff diff);
}
