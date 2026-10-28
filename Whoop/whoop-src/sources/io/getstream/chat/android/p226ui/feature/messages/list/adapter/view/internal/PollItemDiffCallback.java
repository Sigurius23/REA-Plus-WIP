package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import androidx.recyclerview.widget.AbstractC1738u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemDiffCallback;", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;)Z", "areContentsTheSame", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class PollItemDiffCallback extends AbstractC1738u {
    public static final PollItemDiffCallback INSTANCE = new PollItemDiffCallback();

    private PollItemDiffCallback() {
    }

    @Override // androidx.recyclerview.widget.AbstractC1738u
    public final boolean areContentsTheSame(PollItem oldItem, PollItem newItem) {
        AbstractC22676k.m65750j(oldItem, "oldItem");
        AbstractC22676k.m65750j(newItem, "newItem");
        return oldItem.equals(newItem);
    }

    @Override // androidx.recyclerview.widget.AbstractC1738u
    public final boolean areItemsTheSame(PollItem oldItem, PollItem newItem) {
        AbstractC22676k.m65750j(oldItem, "oldItem");
        AbstractC22676k.m65750j(newItem, "newItem");
        return oldItem.equals(newItem);
    }
}
