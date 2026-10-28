package io.getstream.chat.android.p226ui.feature.channels.list.adapter.internal;

import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1759z0;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListItem;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListPayloadDiff;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.BaseChannelListItemViewHolder;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListItemViewHolderFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;
import xb3.C38170e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001cJ\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;", "viewHolderFactory", "<init>", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;)V", "", "position", "holder", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;", "payload", "Ll83/a0;", "bind", "(ILio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)V", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;I)V", "", "", "payloads", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;ILjava/util/List;)V", "", "cid", "Lio/getstream/chat/android/models/Channel;", "getChannel$stream_chat_android_ui_components_release", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;", "getChannel", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListItemAdapter extends AbstractC1759z0 {
    private final ChannelListItemViewHolderFactory viewHolderFactory;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final ChannelListPayloadDiff FULL_CHANNEL_LIST_ITEM_PAYLOAD_DIFF = new ChannelListPayloadDiff(true, true, true, true, true, true, true, true, true);
    private static final ChannelListPayloadDiff EMPTY_CHANNEL_LIST_ITEM_PAYLOAD_DIFF = new ChannelListPayloadDiff(false, false, false, false, false, false, false, false, false);

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter$Companion;", "", "<init>", "()V", "FULL_CHANNEL_LIST_ITEM_PAYLOAD_DIFF", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;", "EMPTY_CHANNEL_LIST_ITEM_PAYLOAD_DIFF", "getEMPTY_CHANNEL_LIST_ITEM_PAYLOAD_DIFF", "()Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ChannelListPayloadDiff getEMPTY_CHANNEL_LIST_ITEM_PAYLOAD_DIFF() {
            return ChannelListItemAdapter.EMPTY_CHANNEL_LIST_ITEM_PAYLOAD_DIFF;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelListItemAdapter(ChannelListItemViewHolderFactory viewHolderFactory) {
        super(ChannelListItemDiffCallback.INSTANCE);
        AbstractC22676k.m65750j(viewHolderFactory, "viewHolderFactory");
        this.viewHolderFactory = viewHolderFactory;
    }

    private final void bind(int position, BaseChannelListItemViewHolder holder, ChannelListPayloadDiff payload) {
        ChannelListItem channelListItem = (ChannelListItem) getItem(position);
        if (channelListItem instanceof ChannelListItem.LoadingMoreItem) {
            return;
        }
        if (!(channelListItem instanceof ChannelListItem.ChannelItem)) {
            throw new NoWhenBranchMatchedException();
        }
        holder.bind((ChannelListItem.ChannelItem) channelListItem, payload);
    }

    public final Channel getChannel$stream_chat_android_ui_components_release(String cid) {
        AbstractC22676k.m65750j(cid, "cid");
        List<Object> currentList = getCurrentList();
        AbstractC22676k.m65749i(currentList, "getCurrentList(...)");
        C38170e c38170e = new C38170e(AbstractC38176k.m122282r(AbstractC25265s.m74145r0(currentList), ChannelListItemAdapter$getChannel$$inlined$filterIsInstance$1.INSTANCE));
        while (c38170e.hasNext()) {
            ChannelListItem.ChannelItem channelItem = (ChannelListItem.ChannelItem) c38170e.next();
            if (AbstractC22676k.m65745e(channelItem.getChannel().getCid(), cid)) {
                return channelItem.getChannel();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemViewType(int position) {
        ChannelListItemViewHolderFactory channelListItemViewHolderFactory = this.viewHolderFactory;
        Object item = getItem(position);
        AbstractC22676k.m65749i(item, "getItem(...)");
        return channelListItemViewHolderFactory.getItemViewType((ChannelListItem) item);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final /* bridge */ /* synthetic */ void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13, List list) {
        onBindViewHolder((BaseChannelListItemViewHolder) abstractC1717o2, i13, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final BaseChannelListItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return this.viewHolderFactory.createViewHolder(parent, viewType);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(BaseChannelListItemViewHolder holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        bind(position, holder, FULL_CHANNEL_LIST_ITEM_PAYLOAD_DIFF);
    }

    public final void onBindViewHolder(BaseChannelListItemViewHolder holder, int position, List<Object> payloads) {
        AbstractC22676k.m65750j(holder, "holder");
        AbstractC22676k.m65750j(payloads, "payloads");
        List arrayList = new ArrayList();
        for (Object obj : payloads) {
            if (obj instanceof ChannelListPayloadDiff) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = AbstractC37056f.m118958J(FULL_CHANNEL_LIST_ITEM_PAYLOAD_DIFF);
        }
        ChannelListPayloadDiff channelListPayloadDiffPlus = EMPTY_CHANNEL_LIST_ITEM_PAYLOAD_DIFF;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            channelListPayloadDiffPlus = channelListPayloadDiffPlus.plus((ChannelListPayloadDiff) it.next());
        }
        bind(position, holder, channelListPayloadDiffPlus);
    }
}
