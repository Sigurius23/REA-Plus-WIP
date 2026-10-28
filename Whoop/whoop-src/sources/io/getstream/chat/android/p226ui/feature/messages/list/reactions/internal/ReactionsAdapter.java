package io.getstream.chat.android.p226ui.feature.messages.list.reactions.internal;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1759z0;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessageReactionBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.ReactionClickListener;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import jo.ViewOnClickListenerC21821j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0019\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;", "", "itemSize", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;", "reactionClickListener", "<init>", "(ILio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;", "holder", "position", "Ll83/a0;", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;I)V", "I", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;", "ReactionViewHolder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ReactionsAdapter extends AbstractC1759z0 {
    private final int itemSize;
    private final ReactionClickListener reactionClickListener;

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;", "binding", "", "itemSize", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;", "reactionClickListener", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;ILio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;", "reactionItem", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;", "I", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class ReactionViewHolder extends AbstractC1717o2 {
        private final StreamUiItemMessageReactionBinding binding;
        private final int itemSize;
        private final ReactionClickListener reactionClickListener;
        private ReactionItem reactionItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReactionViewHolder(StreamUiItemMessageReactionBinding binding, int i13, ReactionClickListener reactionClickListener) {
            super(binding.getRoot());
            AbstractC22676k.m65750j(binding, "binding");
            AbstractC22676k.m65750j(reactionClickListener, "reactionClickListener");
            this.binding = binding;
            this.itemSize = i13;
            this.reactionClickListener = reactionClickListener;
            ImageView root = binding.getRoot();
            AbstractC22676k.m65749i(root, "getRoot(...)");
            ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = i13;
            marginLayoutParams.height = i13;
            root.setLayoutParams(marginLayoutParams);
            binding.getRoot().setOnClickListener(new ViewOnClickListenerC21821j(this, 19));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(ReactionViewHolder reactionViewHolder, View view) {
            ReactionClickListener reactionClickListener = reactionViewHolder.reactionClickListener;
            ReactionItem reactionItem = reactionViewHolder.reactionItem;
            if (reactionItem != null) {
                reactionClickListener.onReactionClick(reactionItem.getType());
            } else {
                AbstractC22676k.m65757q("reactionItem");
                throw null;
            }
        }

        public final void bind(ReactionItem reactionItem) {
            AbstractC22676k.m65750j(reactionItem, "reactionItem");
            this.reactionItem = reactionItem;
            this.binding.reactionIcon.setImageDrawable(reactionItem.getDrawable());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionsAdapter(int i13, ReactionClickListener reactionClickListener) {
        super(new ReactionItemDiffCallback());
        AbstractC22676k.m65750j(reactionClickListener, "reactionClickListener");
        this.itemSize = i13;
        this.reactionClickListener = reactionClickListener;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(ReactionViewHolder holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        Object item = getItem(position);
        AbstractC22676k.m65749i(item, "getItem(...)");
        holder.bind((ReactionItem) item);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final ReactionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return new ReactionViewHolder(StreamUiItemMessageReactionBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false), this.itemSize, this.reactionClickListener);
    }
}
