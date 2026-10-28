package io.getstream.chat.android.p226ui.feature.threads.list.adapter;

import android.view.ViewGroup;
import io.getstream.chat.android.p226ui.feature.threads.list.ThreadListView;
import io.getstream.chat.android.p226ui.feature.threads.list.ThreadListViewStyle;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.viewholder.BaseThreadListItemViewHolder;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.viewholder.internal.ThreadItemViewHolder;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.viewholder.internal.ThreadListLoadingMoreViewHolder;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ'\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010 \u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00168\u0004@BX\u0084.¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u001c8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;", "", "<init>", "()V", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;", "item", "", "getItemViewType", "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)I", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;", "viewHolder", "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;)I", "Landroid/view/ViewGroup;", "parentView", "viewType", "createViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;", "createThreadItemViewHolder", "(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$LoadingMoreItem;", "createLoadingMoreViewHolder", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;", "style", "Ll83/a0;", "setStyle$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V", "setStyle", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;", "clickListener", "setThreadClickListener$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;)V", "setThreadClickListener", "value", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;", "getClickListener", "()Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class ThreadListItemViewHolderFactory {
    private ThreadListView.ThreadClickListener clickListener;
    private ThreadListViewStyle style;

    public final BaseThreadListItemViewHolder<ThreadListItem.LoadingMoreItem> createLoadingMoreViewHolder(ViewGroup parentView) {
        AbstractC22676k.m65750j(parentView, "parentView");
        return new ThreadListLoadingMoreViewHolder(parentView);
    }

    public final BaseThreadListItemViewHolder<ThreadListItem.ThreadItem> createThreadItemViewHolder(ViewGroup parentView) {
        AbstractC22676k.m65750j(parentView, "parentView");
        return new ThreadItemViewHolder(parentView, getStyle(), this.clickListener, null, 8, null);
    }

    public final BaseThreadListItemViewHolder<? extends ThreadListItem> createViewHolder(ViewGroup parentView, int viewType) {
        AbstractC22676k.m65750j(parentView, "parentView");
        if (viewType == 0) {
            return createThreadItemViewHolder(parentView);
        }
        if (viewType == 1) {
            return createLoadingMoreViewHolder(parentView);
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(viewType, "Unhandled ThreadList view type: "));
    }

    public final ThreadListView.ThreadClickListener getClickListener() {
        return this.clickListener;
    }

    public final int getItemViewType(ThreadListItem item) {
        AbstractC22676k.m65750j(item, "item");
        if (item instanceof ThreadListItem.ThreadItem) {
            return 0;
        }
        if (item instanceof ThreadListItem.LoadingMoreItem) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ThreadListViewStyle getStyle() {
        ThreadListViewStyle threadListViewStyle = this.style;
        if (threadListViewStyle != null) {
            return threadListViewStyle;
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    public final void setStyle$stream_chat_android_ui_components_release(ThreadListViewStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
    }

    public final void setThreadClickListener$stream_chat_android_ui_components_release(ThreadListView.ThreadClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public final int getItemViewType(BaseThreadListItemViewHolder<? extends ThreadListItem> viewHolder) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        if (viewHolder instanceof ThreadItemViewHolder) {
            return 0;
        }
        if (viewHolder instanceof ThreadListLoadingMoreViewHolder) {
            return 1;
        }
        throw new IllegalArgumentException("Unhandled ThreadList view holder: " + viewHolder);
    }
}
