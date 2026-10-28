package io.getstream.chat.android.p226ui.feature.channels.actions.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1738u;
import androidx.recyclerview.widget.AbstractC1759z0;
import b30.ViewOnClickListenerC2558k3;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemChannelMemberBinding;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0015B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/models/Member;", "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;", "Lkotlin/Function1;", "Ll83/a0;", "onMemberClicked", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;", "holder", "position", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "ChannelMembersDiffCallback", "ChannelMemberViewHolder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelMembersAdapter extends AbstractC1759z0 {
    private final Function1 onMemberClicked;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\f¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;", "binding", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Member;", "Ll83/a0;", "onMemberClicked", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;Lkotlin/jvm/functions/Function1;)V", "member", "bind", "(Lio/getstream/chat/android/models/Member;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemChannelMemberBinding;", "Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/models/Member;", "getMember", "()Lio/getstream/chat/android/models/Member;", "setMember", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class ChannelMemberViewHolder extends AbstractC1717o2 {
        private final StreamUiItemChannelMemberBinding binding;
        public Member member;
        private final Function1 onMemberClicked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChannelMemberViewHolder(StreamUiItemChannelMemberBinding binding, Function1 onMemberClicked) {
            super(binding.getRoot());
            AbstractC22676k.m65750j(binding, "binding");
            AbstractC22676k.m65750j(onMemberClicked, "onMemberClicked");
            this.binding = binding;
            this.onMemberClicked = onMemberClicked;
            binding.getRoot().setOnClickListener(new ViewOnClickListenerC2558k3(this, 8));
        }

        /* JADX INFO: renamed from: a */
        public static void m55098a(ChannelMemberViewHolder channelMemberViewHolder, View view) {
            channelMemberViewHolder.onMemberClicked.invoke(channelMemberViewHolder.getMember());
        }

        public final void bind(Member member) {
            AbstractC22676k.m65750j(member, "member");
            this.member = member;
            User user = member.getUser();
            StreamUiItemChannelMemberBinding streamUiItemChannelMemberBinding = this.binding;
            UserAvatarView.setUser$default(streamUiItemChannelMemberBinding.userAvatarView, user, false, 2, null);
            streamUiItemChannelMemberBinding.userNameTextView.setText(user.getName());
        }

        public final Member getMember() {
            Member member = this.member;
            if (member != null) {
                return member;
            }
            AbstractC22676k.m65757q("member");
            throw null;
        }

        public final void setMember(Member member) {
            AbstractC22676k.m65750j(member, "<set-?>");
            this.member = member;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMembersDiffCallback;", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/models/Member;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Member;)Z", "areContentsTheSame", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class ChannelMembersDiffCallback extends AbstractC1738u {
        public static final ChannelMembersDiffCallback INSTANCE = new ChannelMembersDiffCallback();

        private ChannelMembersDiffCallback() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1738u
        public final boolean areContentsTheSame(Member oldItem, Member newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.AbstractC1738u
        public final boolean areItemsTheSame(Member oldItem, Member newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            return AbstractC22676k.m65745e(oldItem.getUser().getId(), newItem.getUser().getId());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelMembersAdapter(Function1 onMemberClicked) {
        super(ChannelMembersDiffCallback.INSTANCE);
        AbstractC22676k.m65750j(onMemberClicked, "onMemberClicked");
        this.onMemberClicked = onMemberClicked;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(ChannelMemberViewHolder holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        Object item = getItem(position);
        AbstractC22676k.m65749i(item, "getItem(...)");
        holder.bind((Member) item);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final ChannelMemberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return new ChannelMemberViewHolder(StreamUiItemChannelMemberBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false), this.onMemberClicked);
    }
}
