package lq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import eq0.AbstractC13440a3;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lq0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Llq0/a;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "Landroid/view/ViewGroup;", "parentView", "Leq0/a3;", "binding", "<init>", "(Landroid/view/ViewGroup;Leq0/a3;)V", "data", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "Ll83/a0;", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "a", "Leq0/a3;", "getBinding", "()Leq0/a3;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24653a extends BaseMessageItemViewHolder<MessageListItem> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC13440a3 binding;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C24653a(ViewGroup viewGroup, AbstractC13440a3 abstractC13440a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            abstractC13440a3 = AbstractC13440a3.m38171c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            AbstractC22676k.m65749i(abstractC13440a3, "inflate(...)");
        }
        this(viewGroup, abstractC13440a3);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public void bindData(MessageListItem data, MessageListItemPayloadDiff diff) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
        this.binding.getRoot().setVisibility(8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C24653a(ViewGroup parentView, AbstractC13440a3 binding) {
        AbstractC22676k.m65750j(parentView, "parentView");
        AbstractC22676k.m65750j(binding, "binding");
        View root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
        this.binding = binding;
    }
}
