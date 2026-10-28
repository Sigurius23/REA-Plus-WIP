package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.widget.TextView;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollHeaderBinding;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/HeaderViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Header;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollHeaderBinding;", "binding", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollHeaderBinding;)V", "pollItem", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Header;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollHeaderBinding;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class HeaderViewHolder extends PollItemViewHolder<PollItem.Header> {
    private final StreamUiItemPollHeaderBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderViewHolder(StreamUiItemPollHeaderBinding binding) {
        super(binding, null);
        AbstractC22676k.m65750j(binding, "binding");
        this.binding = binding;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.PollItemViewHolder
    public final void bind(PollItem.Header pollItem) {
        AbstractC22676k.m65750j(pollItem, "pollItem");
        this.binding.title.setText(pollItem.getTitle());
        this.binding.subtitle.setText(pollItem.getSubtitle());
        TextView subtitle = this.binding.subtitle;
        AbstractC22676k.m65749i(subtitle, "subtitle");
        subtitle.setVisibility(!AbstractC39414r.m125890i0(pollItem.getSubtitle()) ? 0 : 8);
    }
}
