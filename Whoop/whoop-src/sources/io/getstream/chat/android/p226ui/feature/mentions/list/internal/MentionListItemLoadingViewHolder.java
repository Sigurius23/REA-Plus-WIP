package io.getstream.chat.android.p226ui.feature.mentions.list.internal;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemListLoadingBinding;
import io.getstream.chat.android.p226ui.feature.mentions.list.MentionListItem;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemLoadingViewHolder;", "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$LoadingItem;", "Landroid/view/ViewGroup;", "parentView", "Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;)V", "item", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem$LoadingItem;)V", "Landroid/view/ViewGroup;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MentionListItemLoadingViewHolder extends MentionListItemViewHolder<MentionListItem.LoadingItem> {
    private final ViewGroup parentView;

    public /* synthetic */ MentionListItemLoadingViewHolder(ViewGroup viewGroup, StreamUiItemListLoadingBinding streamUiItemListLoadingBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, (i13 & 2) != 0 ? StreamUiItemListLoadingBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemListLoadingBinding);
    }

    @Override // io.getstream.chat.android.p226ui.feature.mentions.list.internal.MentionListItemViewHolder
    public final void bind(MentionListItem.LoadingItem item) {
        AbstractC22676k.m65750j(item, "item");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MentionListItemLoadingViewHolder(ViewGroup parentView, StreamUiItemListLoadingBinding binding) {
        AbstractC22676k.m65750j(parentView, "parentView");
        AbstractC22676k.m65750j(binding, "binding");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
        this.parentView = parentView;
    }
}
