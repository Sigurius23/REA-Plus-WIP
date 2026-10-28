package io.getstream.chat.android.p226ui.feature.mentions.list.internal;

import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1759z0;
import io.getstream.chat.android.p226ui.feature.mentions.list.MentionListItem;
import io.getstream.chat.android.p226ui.feature.mentions.list.MentionListView;
import io.getstream.chat.android.p226ui.feature.messages.preview.MessagePreviewStyle;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListItem;", "Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;", "position", "getItemViewType", "(I)I", "holder", "Ll83/a0;", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemViewHolder;I)V", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;", "mentionSelectedListener", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;", "getMentionSelectedListener", "()Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;", "setMentionSelectedListener", "(Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView$MentionSelectedListener;)V", "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "previewStyle", "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "getPreviewStyle", "()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "setPreviewStyle", "(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MentionListAdapter extends AbstractC1759z0 {
    private MentionListView.MentionSelectedListener mentionSelectedListener;
    private MessagePreviewStyle previewStyle;

    public MentionListAdapter() {
        super(MentionListItemDiffCallback.INSTANCE);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemViewType(int position) {
        return !(getItem(position) instanceof MentionListItem.MessageItem) ? 1 : 0;
    }

    public final MentionListView.MentionSelectedListener getMentionSelectedListener() {
        return this.mentionSelectedListener;
    }

    public final MessagePreviewStyle getPreviewStyle() {
        return this.previewStyle;
    }

    public final void setMentionSelectedListener(MentionListView.MentionSelectedListener mentionSelectedListener) {
        this.mentionSelectedListener = mentionSelectedListener;
    }

    public final void setPreviewStyle(MessagePreviewStyle messagePreviewStyle) {
        this.previewStyle = messagePreviewStyle;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(MentionListItemViewHolder<MentionListItem> holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        Object item = getItem(position);
        AbstractC22676k.m65749i(item, "getItem(...)");
        holder.bind((MentionListItem) item);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final MentionListItemViewHolder<MentionListItem> onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        if (viewType == 0) {
            return new MentionListItemMessageViewHolder(this.previewStyle, parent, null, this.mentionSelectedListener, 4, null);
        }
        if (viewType == 1) {
            return new MentionListItemLoadingViewHolder(parent, null, 2, null);
        }
        throw new IllegalStateException(("Unknown MentionList view type: " + viewType).toString());
    }
}
