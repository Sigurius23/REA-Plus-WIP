package io.getstream.chat.android.p226ui.feature.threads.list.adapter.viewholder.internal;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemListLoadingBinding;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.ThreadListItem;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.viewholder.BaseThreadListItemViewHolder;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadListLoadingMoreViewHolder;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$LoadingMoreItem;", "Landroid/view/ViewGroup;", "parentView", "<init>", "(Landroid/view/ViewGroup;)V", "item", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$LoadingMoreItem;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadListLoadingMoreViewHolder extends BaseThreadListItemViewHolder<ThreadListItem.LoadingMoreItem> {
    /* JADX WARN: Illegal instructions before constructor call */
    public ThreadListLoadingMoreViewHolder(ViewGroup parentView) {
        AbstractC22676k.m65750j(parentView, "parentView");
        ConstraintLayout root = StreamUiItemListLoadingBinding.inflate(ViewGroupKt.getStreamThemeInflater(parentView), parentView, false).getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
    }

    @Override // io.getstream.chat.android.p226ui.feature.threads.list.adapter.viewholder.BaseThreadListItemViewHolder
    public final void bind(ThreadListItem.LoadingMoreItem item) {
        AbstractC22676k.m65750j(item, "item");
    }
}
