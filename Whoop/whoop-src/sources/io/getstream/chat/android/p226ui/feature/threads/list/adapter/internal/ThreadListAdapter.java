package io.getstream.chat.android.p226ui.feature.threads.list.adapter.internal;

import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1738u;
import androidx.recyclerview.widget.AbstractC1759z0;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.p226ui.feature.threads.list.ThreadListViewStyle;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.ThreadListItem;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.ThreadListItemViewHolderFactory;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.viewholder.BaseThreadListItemViewHolder;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00030\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;", "viewHolderFactory", "<init>", "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;)V", "", "position", "", "getItemId", "(I)J", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;", "holder", "Ll83/a0;", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;I)V", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "ThreadListItemDiffCallback", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadListAdapter extends AbstractC1759z0 {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final ThreadListViewStyle style;
    private final ThreadListItemViewHolderFactory viewHolderFactory;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter$ThreadListItemDiffCallback;", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)Z", "areContentsTheSame", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class ThreadListItemDiffCallback extends AbstractC1738u {
        public static final ThreadListItemDiffCallback INSTANCE = new ThreadListItemDiffCallback();

        private ThreadListItemDiffCallback() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1738u
        public final boolean areContentsTheSame(ThreadListItem oldItem, ThreadListItem newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            if ((oldItem instanceof ThreadListItem.ThreadItem) && (newItem instanceof ThreadListItem.ThreadItem)) {
                return AbstractC22676k.m65745e(((ThreadListItem.ThreadItem) oldItem).getThread(), ((ThreadListItem.ThreadItem) newItem).getThread());
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.AbstractC1738u
        public final boolean areItemsTheSame(ThreadListItem oldItem, ThreadListItem newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            return oldItem.getStableId() == newItem.getStableId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadListAdapter(ThreadListViewStyle style, ThreadListItemViewHolderFactory viewHolderFactory) {
        super(ThreadListItemDiffCallback.INSTANCE);
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(viewHolderFactory, "viewHolderFactory");
        this.style = style;
        this.viewHolderFactory = viewHolderFactory;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ThreadListAdapter");
        setHasStableIds(true);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final long getItemId(int position) {
        return ((ThreadListItem) getItem(position)).getStableId();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemViewType(int position) {
        ThreadListItemViewHolderFactory threadListItemViewHolderFactory = this.viewHolderFactory;
        Object item = getItem(position);
        AbstractC22676k.m65749i(item, "getItem(...)");
        return threadListItemViewHolderFactory.getItemViewType((ThreadListItem) item);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(BaseThreadListItemViewHolder<? extends ThreadListItem> holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        ThreadListItem threadListItem = (ThreadListItem) getItem(position);
        ThreadListItemViewHolderFactory threadListItemViewHolderFactory = this.viewHolderFactory;
        AbstractC22676k.m65747g(threadListItem);
        int itemViewType = threadListItemViewHolderFactory.getItemViewType(threadListItem);
        int itemViewType2 = this.viewHolderFactory.getItemViewType(holder);
        if (itemViewType == itemViewType2) {
            holder.bind(threadListItem);
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8294g(itemViewType, itemViewType2, "Item view type ", " does not match the holder view type "), null);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final BaseThreadListItemViewHolder<? extends ThreadListItem> onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return this.viewHolderFactory.createViewHolder(parent, viewType);
    }
}
