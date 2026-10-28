package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import androidx.recyclerview.widget.AbstractC1717o2;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.PollItem;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0011\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\u000b\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;", "T", "Landroidx/recyclerview/widget/o2;", "Lec/a;", "binding", "<init>", "(Lec/a;)V", "pollItem", "Ll83/a0;", "bindPollItem", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;)V", "bind", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AddCommentViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/CloseViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/HeaderViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/SuggestOptionViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewCommentsViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewResultsViewHolder;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
abstract class PollItemViewHolder<T extends PollItem> extends AbstractC1717o2 {
    public /* synthetic */ PollItemViewHolder(InterfaceC13008a interfaceC13008a, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC13008a);
    }

    public abstract void bind(T pollItem);

    public final void bindPollItem(PollItem pollItem) {
        AbstractC22676k.m65750j(pollItem, "pollItem");
        bind(pollItem);
    }

    private PollItemViewHolder(InterfaceC13008a interfaceC13008a) {
        super(interfaceC13008a.getRoot());
    }
}
