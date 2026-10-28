package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.view.View;
import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemPollResultsBinding;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewResultsViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewResults;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollResultsBinding;", "binding", "Lkotlin/Function0;", "Ll83/a0;", "onViewPollResultsClick", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollResultsBinding;Lc93/a;)V", "pollItem", "bind", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewResults;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollResultsBinding;", "Lc93/a;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class ViewResultsViewHolder extends PollItemViewHolder<PollItem.ViewResults> {
    private final StreamUiItemPollResultsBinding binding;
    private final InterfaceC4339a onViewPollResultsClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewResultsViewHolder(StreamUiItemPollResultsBinding binding, InterfaceC4339a onViewPollResultsClick) {
        super(binding, null);
        AbstractC22676k.m65750j(binding, "binding");
        AbstractC22676k.m65750j(onViewPollResultsClick, "onViewPollResultsClick");
        this.binding = binding;
        this.onViewPollResultsClick = onViewPollResultsClick;
    }

    /* JADX INFO: renamed from: a */
    public static void m55536a(ViewResultsViewHolder viewResultsViewHolder, View view) {
        viewResultsViewHolder.onViewPollResultsClick.invoke();
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.PollItemViewHolder
    public final void bind(PollItem.ViewResults pollItem) {
        AbstractC22676k.m65750j(pollItem, "pollItem");
        this.binding.getRoot().setOnClickListener(new ViewOnClickListenerC19770a(this, 5));
    }
}
