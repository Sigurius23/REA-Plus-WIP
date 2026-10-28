package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import i93.C18279e;
import i93.InterfaceC18280f;
import io.getstream.chat.android.client.extensions.ChannelExtensionKt;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.extensions.internal.ViewHolderKt;
import io.getstream.chat.android.p226ui.common.utils.ChannelNameFormatter;
import io.getstream.chat.android.p226ui.databinding.StreamUiChannelListItemBackgroundViewBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiChannelListItemForegroundViewBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiChannelListItemViewBinding;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListViewStyle;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListItem;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListPayloadDiff;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.SwipeViewHolder;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.helper.MessagePreviewFormatter;
import io.getstream.chat.android.p226ui.utils.extensions.ChannelKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.avatar.ChannelAvatarView;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p184h5.ViewTreeObserverOnPreDrawListenerC16921w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 ^2\u00020\u0001:\u0001^Bs\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020$*\u00020\u001e2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J%\u0010+\u001a\u00020\u001a*\u00020(2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020\u001a*\u00020(H\u0002¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020\u001a*\u00020(2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\u001a*\u00020(H\u0002¢\u0006\u0004\b3\u0010.J\u001d\u00104\u001a\u00020\u001a*\u00020(2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b4\u00105J\u001b\u00107\u001a\u00020\u001a*\u0002062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u00108J\u001b\u00107\u001a\u00020\u001a*\u00020(2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u00109J\u001f\u0010:\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020?H\u0016¢\u0006\u0004\bB\u0010AJ\u000f\u0010C\u001a\u00020$H\u0016¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00020?0EH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020$H\u0016¢\u0006\u0004\bH\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010IR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010JR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010IR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010LR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010MR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010NR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010NR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010OR\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010OR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010PR\u0016\u0010R\u001a\u0004\u0018\u00010Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010A¨\u0006_"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;", "Landroid/view/ViewGroup;", "parent", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", "channelClickListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;", "channelLongClickListener", "channelDeleteListener", "channelMoreOptionsListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;", "userClickListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "swipeListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", "isMoreOptionsVisible", "isDeleteOptionVisible", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;", "getMoreOptionsIcon", "getDeleteOptionIcon", "Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;)V", "Ll83/a0;", "configureBackground", "()V", "configureBackgroundButtons", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;", "diff", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;", "channelItem", "configureForeground", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)V", "", "isAnonymousChannel", "channelNameLabelChanged", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;Z)Z", "Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;", "Lio/getstream/chat/android/models/Message;", "lastMessage", "configureChannelNameLabel", "(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)V", "configureAvatarView", "(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;)V", "Lio/getstream/chat/android/models/DraftMessage;", "draftMessage", "configureLastMessageLabelAndTimestamp", "(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/DraftMessage;)V", "configureUnreadCountBadge", "configureCurrentUserLastMessageStatus", "(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/models/Message;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;", "applyStyle", "(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V", "(Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V", "bind", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)V", "Landroid/view/View;", "getSwipeView", "()Landroid/view/View;", "", "getOpenedX", "()F", "getClosedX", "isSwiped", "()Z", "Li93/f;", "getSwipeDeltaRange", "()Li93/f;", "isSwipeEnabled", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;", "Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;", "Lio/getstream/chat/android/models/User;", "currentUser", "Lio/getstream/chat/android/models/User;", "", "optionsCount", "I", "menuItemWidth", "F", "Lio/getstream/chat/android/models/Channel;", "channel", "Lio/getstream/chat/android/models/Channel;", "getOptionsMenuWidth", "optionsMenuWidth", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelViewHolder extends SwipeViewHolder {
    private static final Companion Companion = new Companion();
    private final StreamUiChannelListItemViewBinding binding;
    private Channel channel;
    private final ChannelListView.ChannelClickListener channelClickListener;
    private final ChannelListView.ChannelClickListener channelDeleteListener;
    private final ChannelListView.ChannelLongClickListener channelLongClickListener;
    private final ChannelListView.ChannelClickListener channelMoreOptionsListener;
    private final User currentUser;
    private final ChannelListView.ChannelOptionIconProvider getDeleteOptionIcon;
    private final ChannelListView.ChannelOptionIconProvider getMoreOptionsIcon;
    private final ChannelListView.ChannelOptionVisibilityPredicate isDeleteOptionVisible;
    private final ChannelListView.ChannelOptionVisibilityPredicate isMoreOptionsVisible;
    private final float menuItemWidth;
    private int optionsCount;
    private final ChannelListViewStyle style;
    private final ChannelListView.SwipeListener swipeListener;
    private final ChannelListView.UserClickListener userClickListener;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;", "", "<init>", "()V", "yDiffBetweenCenters", "", "view1", "Landroid/view/View;", "view2", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float yDiffBetweenCenters(View view1, View view2) {
            return Math.abs(((view2.getHeight() / 2.0f) + (view2.getTop() + view2.getPaddingTop())) - ((view1.getHeight() / 2.0f) + (view1.getTop() + view1.getPaddingTop())));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewHolder(ViewGroup parent, ChannelListView.ChannelClickListener channelClickListener, ChannelListView.ChannelLongClickListener channelLongClickListener, ChannelListView.ChannelClickListener channelDeleteListener, ChannelListView.ChannelClickListener channelMoreOptionsListener, ChannelListView.UserClickListener userClickListener, ChannelListView.SwipeListener swipeListener, ChannelListViewStyle style, ChannelListView.ChannelOptionVisibilityPredicate isMoreOptionsVisible, ChannelListView.ChannelOptionVisibilityPredicate isDeleteOptionVisible, ChannelListView.ChannelOptionIconProvider getMoreOptionsIcon, ChannelListView.ChannelOptionIconProvider getDeleteOptionIcon) {
        this(parent, channelClickListener, channelLongClickListener, channelDeleteListener, channelMoreOptionsListener, userClickListener, swipeListener, style, isMoreOptionsVisible, isDeleteOptionVisible, getMoreOptionsIcon, getDeleteOptionIcon, null, 4096, null);
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(channelClickListener, "channelClickListener");
        AbstractC22676k.m65750j(channelLongClickListener, "channelLongClickListener");
        AbstractC22676k.m65750j(channelDeleteListener, "channelDeleteListener");
        AbstractC22676k.m65750j(channelMoreOptionsListener, "channelMoreOptionsListener");
        AbstractC22676k.m65750j(userClickListener, "userClickListener");
        AbstractC22676k.m65750j(swipeListener, "swipeListener");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(isMoreOptionsVisible, "isMoreOptionsVisible");
        AbstractC22676k.m65750j(isDeleteOptionVisible, "isDeleteOptionVisible");
        AbstractC22676k.m65750j(getMoreOptionsIcon, "getMoreOptionsIcon");
        AbstractC22676k.m65750j(getDeleteOptionIcon, "getDeleteOptionIcon");
    }

    private final void applyStyle(StreamUiChannelListItemBackgroundViewBinding streamUiChannelListItemBackgroundViewBinding, ChannelListViewStyle channelListViewStyle) {
        streamUiChannelListItemBackgroundViewBinding.getRoot().setBackgroundColor(channelListViewStyle.getBackgroundLayoutColor());
        streamUiChannelListItemBackgroundViewBinding.backgroundView.setBackgroundColor(channelListViewStyle.getBackgroundLayoutColor());
        ConstraintLayout backgroundView = streamUiChannelListItemBackgroundViewBinding.backgroundView;
        AbstractC22676k.m65749i(backgroundView, "backgroundView");
        ViewGroup.LayoutParams layoutParams = backgroundView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = channelListViewStyle.getItemHeight();
        backgroundView.setLayoutParams(layoutParams);
        streamUiChannelListItemBackgroundViewBinding.deleteImageView.setImageDrawable(channelListViewStyle.getDeleteIcon());
        streamUiChannelListItemBackgroundViewBinding.moreOptionsImageView.setImageDrawable(channelListViewStyle.getOptionsIcon());
    }

    private final boolean channelNameLabelChanged(ChannelListPayloadDiff channelListPayloadDiff, boolean z4) {
        return channelListPayloadDiff.getDraftMessageChanged() | (z4 & channelListPayloadDiff.getUsersChanged()) | channelListPayloadDiff.getNameChanged() | channelListPayloadDiff.getTypingUsersChanged() | channelListPayloadDiff.getLastMessageChanged();
    }

    private final void configureAvatarView(StreamUiChannelListItemForegroundViewBinding streamUiChannelListItemForegroundViewBinding) {
        ChannelAvatarView channelAvatarView = streamUiChannelListItemForegroundViewBinding.channelAvatarView;
        Channel channel = this.channel;
        if (channel != null) {
            ChannelAvatarView.setChannel$default(channelAvatarView, channel, null, 2, null);
        } else {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
    }

    private final void configureBackground() {
        configureBackgroundButtons();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    private final void configureBackgroundButtons() {
        int i13;
        ImageView imageView = this.binding.itemBackgroundView.moreOptionsImageView;
        if (this.style.getOptionsEnabled()) {
            ChannelListView.ChannelOptionVisibilityPredicate channelOptionVisibilityPredicate = this.isMoreOptionsVisible;
            Channel channel = this.channel;
            if (channel == null) {
                AbstractC22676k.m65757q("channel");
                throw null;
            }
            if (channelOptionVisibilityPredicate.invoke(channel).booleanValue()) {
                AbstractC22676k.m65747g(imageView);
                imageView.setVisibility(0);
                ChannelListView.ChannelOptionIconProvider channelOptionIconProvider = this.getMoreOptionsIcon;
                Channel channel2 = this.channel;
                if (channel2 == null) {
                    AbstractC22676k.m65757q("channel");
                    throw null;
                }
                Drawable drawableInvoke = channelOptionIconProvider.invoke(channel2);
                if (drawableInvoke != null) {
                    imageView.setImageDrawable(drawableInvoke);
                }
                i13 = 1;
            } else {
                AbstractC22676k.m65747g(imageView);
                imageView.setVisibility(8);
                i13 = 0;
            }
        } else {
            AbstractC22676k.m65747g(imageView);
            imageView.setVisibility(8);
            i13 = 0;
        }
        ImageView imageView2 = this.binding.itemBackgroundView.deleteImageView;
        if (this.style.getDeleteEnabled()) {
            ChannelListView.ChannelOptionVisibilityPredicate channelOptionVisibilityPredicate2 = this.isDeleteOptionVisible;
            Channel channel3 = this.channel;
            if (channel3 == null) {
                AbstractC22676k.m65757q("channel");
                throw null;
            }
            if (channelOptionVisibilityPredicate2.invoke(channel3).booleanValue()) {
                AbstractC22676k.m65747g(imageView2);
                imageView2.setVisibility(0);
                ChannelListView.ChannelOptionIconProvider channelOptionIconProvider2 = this.getDeleteOptionIcon;
                Channel channel4 = this.channel;
                if (channel4 == null) {
                    AbstractC22676k.m65757q("channel");
                    throw null;
                }
                Drawable drawableInvoke2 = channelOptionIconProvider2.invoke(channel4);
                if (drawableInvoke2 != null) {
                    imageView2.setImageDrawable(drawableInvoke2);
                }
                i13++;
            } else {
                AbstractC22676k.m65747g(imageView2);
                imageView2.setVisibility(8);
            }
        } else {
            AbstractC22676k.m65747g(imageView2);
            imageView2.setVisibility(8);
        }
        this.optionsCount = i13;
    }

    private final void configureChannelNameLabel(final StreamUiChannelListItemForegroundViewBinding streamUiChannelListItemForegroundViewBinding, Message message, ChannelListItem.ChannelItem channelItem) {
        TextView textView = streamUiChannelListItemForegroundViewBinding.channelNameLabel;
        ChannelNameFormatter channelNameFormatter = ChatUI.getChannelNameFormatter();
        Channel channel = this.channel;
        if (channel == null) {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
        textView.setText(channelNameFormatter.formatChannelName(channel, ChatUI.getCurrentUserProvider().getCurrentUser()));
        if (message != null || !channelItem.getTypingUsers().isEmpty() || channelItem.getDraftMessage() != null) {
            streamUiChannelListItemForegroundViewBinding.channelNameLabel.setTranslationY(0.0f);
            return;
        }
        if (streamUiChannelListItemForegroundViewBinding.channelNameLabel.getHeight() <= 0) {
            final TextView channelNameLabel = streamUiChannelListItemForegroundViewBinding.channelNameLabel;
            AbstractC22676k.m65749i(channelNameLabel, "channelNameLabel");
            ViewTreeObserverOnPreDrawListenerC16921w.m47614a(channelNameLabel, new Runnable() { // from class: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.internal.ChannelViewHolder$configureChannelNameLabel$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    TextView textView2 = streamUiChannelListItemForegroundViewBinding.channelNameLabel;
                    ChannelViewHolder.Companion companion = ChannelViewHolder.Companion;
                    TextView channelNameLabel2 = streamUiChannelListItemForegroundViewBinding.channelNameLabel;
                    AbstractC22676k.m65749i(channelNameLabel2, "channelNameLabel");
                    ConstraintLayout foregroundView = streamUiChannelListItemForegroundViewBinding.foregroundView;
                    AbstractC22676k.m65749i(foregroundView, "foregroundView");
                    textView2.setTranslationY(companion.yDiffBetweenCenters(channelNameLabel2, foregroundView));
                }
            });
        } else {
            TextView channelNameLabel2 = streamUiChannelListItemForegroundViewBinding.channelNameLabel;
            Companion companion = Companion;
            AbstractC22676k.m65749i(channelNameLabel2, "channelNameLabel");
            ConstraintLayout foregroundView = streamUiChannelListItemForegroundViewBinding.foregroundView;
            AbstractC22676k.m65749i(foregroundView, "foregroundView");
            channelNameLabel2.setTranslationY(companion.yDiffBetweenCenters(channelNameLabel2, foregroundView));
        }
    }

    private final void configureCurrentUserLastMessageStatus(StreamUiChannelListItemForegroundViewBinding streamUiChannelListItemForegroundViewBinding, Message message) {
        Drawable indicatorDeliveredIcon;
        ImageView messageStatusImageView = streamUiChannelListItemForegroundViewBinding.messageStatusImageView;
        AbstractC22676k.m65749i(messageStatusImageView, "messageStatusImageView");
        messageStatusImageView.setVisibility(message != null && this.style.getShowChannelDeliveryStatusIndicator() ? 0 : 8);
        if (message == null || !this.style.getShowChannelDeliveryStatusIndicator()) {
            return;
        }
        String id4 = message.getUser().getId();
        User user = this.currentUser;
        if (!AbstractC22676k.m65745e(id4, user != null ? user.getId() : null)) {
            streamUiChannelListItemForegroundViewBinding.messageStatusImageView.setImageDrawable(null);
            return;
        }
        boolean zContains = AbstractC25260n.m74059b1(new SyncStatus[]{SyncStatus.IN_PROGRESS, SyncStatus.SYNC_NEEDED, SyncStatus.AWAITING_ATTACHMENTS}).contains(message.getSyncStatus());
        Channel channel = this.channel;
        if (channel == null) {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
        int count = ChannelKt.readCount(channel, message);
        if (zContains) {
            indicatorDeliveredIcon = this.style.getIndicatorPendingSyncIcon();
        } else {
            boolean z4 = count > 0;
            Channel channel2 = this.channel;
            if (channel2 == null) {
                AbstractC22676k.m65757q("channel");
                throw null;
            }
            boolean zIsEmpty = ChannelExtensionKt.deliveredReadsOf(channel2, message).isEmpty();
            if (z4) {
                indicatorDeliveredIcon = this.style.getIndicatorReadIcon();
            } else {
                indicatorDeliveredIcon = !zIsEmpty ? this.style.getIndicatorDeliveredIcon() : this.style.getIndicatorSentIcon();
            }
        }
        if (count <= 1 || !this.style.getReadCountEnabled()) {
            TextView readCountView = streamUiChannelListItemForegroundViewBinding.readCountView;
            AbstractC22676k.m65749i(readCountView, "readCountView");
            readCountView.setVisibility(8);
        } else {
            TextView readCountView2 = streamUiChannelListItemForegroundViewBinding.readCountView;
            AbstractC22676k.m65749i(readCountView2, "readCountView");
            readCountView2.setVisibility(0);
            streamUiChannelListItemForegroundViewBinding.readCountView.setText(String.valueOf(count));
        }
        streamUiChannelListItemForegroundViewBinding.messageStatusImageView.setImageDrawable(indicatorDeliveredIcon);
    }

    private final void configureForeground(ChannelListPayloadDiff diff, ChannelListItem.ChannelItem channelItem) {
        StreamUiChannelListItemForegroundViewBinding streamUiChannelListItemForegroundViewBinding = this.binding.itemForegroundView;
        Message lastMessage = ChannelKt.getLastMessage(channelItem.getChannel());
        if (channelNameLabelChanged(diff, ChannelExtensionKt.isAnonymousChannel(channelItem.getChannel()))) {
            AbstractC22676k.m65747g(streamUiChannelListItemForegroundViewBinding);
            configureChannelNameLabel(streamUiChannelListItemForegroundViewBinding, lastMessage, channelItem);
        }
        if (diff.getAvatarViewChanged()) {
            AbstractC22676k.m65747g(streamUiChannelListItemForegroundViewBinding);
            configureAvatarView(streamUiChannelListItemForegroundViewBinding);
        }
        if (diff.getLastMessageChanged() || diff.getTypingUsersChanged() || diff.getDraftMessageChanged()) {
            TextView lastMessageLabel = streamUiChannelListItemForegroundViewBinding.lastMessageLabel;
            AbstractC22676k.m65749i(lastMessageLabel, "lastMessageLabel");
            lastMessageLabel.setVisibility(channelItem.getTypingUsers().isEmpty() & ((lastMessage != null) | (channelItem.getDraftMessage() != null)) ? 0 : 8);
            TextView draftMessageLabel = streamUiChannelListItemForegroundViewBinding.draftMessageLabel;
            AbstractC22676k.m65749i(draftMessageLabel, "draftMessageLabel");
            draftMessageLabel.setVisibility(channelItem.getTypingUsers().isEmpty() & (channelItem.getDraftMessage() != null) ? 0 : 8);
            configureLastMessageLabelAndTimestamp(streamUiChannelListItemForegroundViewBinding, lastMessage, channelItem.getDraftMessage());
            streamUiChannelListItemForegroundViewBinding.typingIndicatorView.setTypingUsers(channelItem.getTypingUsers());
        }
        if (diff.getReadStateChanged() || diff.getLastMessageChanged()) {
            AbstractC22676k.m65747g(streamUiChannelListItemForegroundViewBinding);
            configureCurrentUserLastMessageStatus(streamUiChannelListItemForegroundViewBinding, lastMessage);
        }
        if (diff.getUnreadCountChanged()) {
            AbstractC22676k.m65747g(streamUiChannelListItemForegroundViewBinding);
            configureUnreadCountBadge(streamUiChannelListItemForegroundViewBinding);
        }
        ImageView muteIcon = streamUiChannelListItemForegroundViewBinding.muteIcon;
        AbstractC22676k.m65749i(muteIcon, "muteIcon");
        muteIcon.setVisibility(ChannelKt.isMuted(channelItem.getChannel()) ? 0 : 8);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    private final void configureLastMessageLabelAndTimestamp(StreamUiChannelListItemForegroundViewBinding streamUiChannelListItemForegroundViewBinding, Message message, DraftMessage draftMessage) {
        String date;
        String text;
        TextView lastMessageTimeLabel = streamUiChannelListItemForegroundViewBinding.lastMessageTimeLabel;
        AbstractC22676k.m65749i(lastMessageTimeLabel, "lastMessageTimeLabel");
        lastMessageTimeLabel.setVisibility(((draftMessage == null) && (message != null)) ? 0 : 8);
        TextView textView = streamUiChannelListItemForegroundViewBinding.lastMessageTimeLabel;
        CharSequence messagePreview = "";
        if (message == null) {
            date = "";
        } else {
            if ((draftMessage != null ? null : message) == null || (date = ChatUI.getDateFormatter().formatDate(MessageExtensionsKt.getCreatedAtOrNull(message))) == null) {
                date = "";
            }
        }
        textView.setText(date);
        TextView textView2 = streamUiChannelListItemForegroundViewBinding.lastMessageLabel;
        if (draftMessage != null && (text = draftMessage.getText()) != null) {
            messagePreview = text;
        } else if (message != null) {
            MessagePreviewFormatter messagePreviewFormatter = ChatUI.getMessagePreviewFormatter();
            Channel channel = this.channel;
            if (channel == null) {
                AbstractC22676k.m65757q("channel");
                throw null;
            }
            messagePreview = messagePreviewFormatter.formatMessagePreview(channel, message, ChatUI.getCurrentUserProvider().getCurrentUser());
        }
        textView2.setText(messagePreview);
    }

    private final void configureUnreadCountBadge(StreamUiChannelListItemForegroundViewBinding streamUiChannelListItemForegroundViewBinding) {
        Channel channel = this.channel;
        if (channel == null) {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
        int iCurrentUserUnreadCount$default = ChannelExtensionKt.currentUserUnreadCount$default(channel, null, 1, null);
        boolean z4 = iCurrentUserUnreadCount$default > 0;
        TextView unreadCountBadge = streamUiChannelListItemForegroundViewBinding.unreadCountBadge;
        AbstractC22676k.m65749i(unreadCountBadge, "unreadCountBadge");
        unreadCountBadge.setVisibility(z4 ? 0 : 8);
        if (z4) {
            streamUiChannelListItemForegroundViewBinding.unreadCountBadge.setText(iCurrentUserUnreadCount$default > 99 ? "99+" : String.valueOf(iCurrentUserUnreadCount$default));
        }
    }

    private final float getOptionsMenuWidth() {
        return this.menuItemWidth * this.optionsCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$11$lambda$10$lambda$5(ChannelViewHolder channelViewHolder, View view) {
        User user;
        Channel channel = channelViewHolder.channel;
        if (channel == null) {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
        if (!io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt.isDirectMessaging(channel)) {
            ChannelListView.ChannelClickListener channelClickListener = channelViewHolder.channelClickListener;
            Channel channel2 = channelViewHolder.channel;
            if (channel2 != null) {
                channelClickListener.onClick(channel2);
                return;
            } else {
                AbstractC22676k.m65757q("channel");
                throw null;
            }
        }
        Channel channel3 = channelViewHolder.channel;
        if (channel3 == null) {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
        List<Member> members = channel3.getMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : members) {
            Member member = (Member) obj;
            User user2 = channelViewHolder.currentUser;
            if (!AbstractC22676k.m65745e(user2 != null ? user2.getId() : null, member.getUser().getId())) {
                arrayList.add(obj);
            }
        }
        Member member2 = (Member) AbstractC25265s.m74100H0(arrayList);
        if (member2 == null || (user = member2.getUser()) == null) {
            return;
        }
        channelViewHolder.userClickListener.onClick(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$11$lambda$10$lambda$9$lambda$6(ChannelViewHolder channelViewHolder, View view) {
        if (channelViewHolder.getSwiping()) {
            return;
        }
        ChannelListView.ChannelClickListener channelClickListener = channelViewHolder.channelClickListener;
        Channel channel = channelViewHolder.channel;
        if (channel != null) {
            channelClickListener.onClick(channel);
        } else {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$11$lambda$10$lambda$9$lambda$7(ChannelViewHolder channelViewHolder, View view) {
        if (channelViewHolder.getSwiping()) {
            return true;
        }
        ChannelListView.ChannelLongClickListener channelLongClickListener = channelViewHolder.channelLongClickListener;
        Channel channel = channelViewHolder.channel;
        if (channel != null) {
            return channelLongClickListener.onLongClick(channel);
        }
        AbstractC22676k.m65757q("channel");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$11$lambda$3$lambda$1(ChannelViewHolder channelViewHolder, View view) {
        ChannelListView.ChannelClickListener channelClickListener = channelViewHolder.channelMoreOptionsListener;
        Channel channel = channelViewHolder.channel;
        if (channel == null) {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
        channelClickListener.onClick(channel);
        ChannelListView.SwipeListener.onSwipeCanceled$default(channelViewHolder.swipeListener, channelViewHolder, channelViewHolder.getAbsoluteAdapterPosition(), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$11$lambda$3$lambda$2(ChannelViewHolder channelViewHolder, View view) {
        ChannelListView.ChannelClickListener channelClickListener = channelViewHolder.channelDeleteListener;
        Channel channel = channelViewHolder.channel;
        if (channel != null) {
            channelClickListener.onClick(channel);
        } else {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.BaseChannelListItemViewHolder
    public final void bind(ChannelListItem.ChannelItem channelItem, ChannelListPayloadDiff diff) {
        AbstractC22676k.m65750j(channelItem, "channelItem");
        AbstractC22676k.m65750j(diff, "diff");
        this.channel = channelItem.getChannel();
        configureForeground(diff, channelItem);
        configureBackgroundButtons();
        ChannelListView.SwipeListener listener = getListener();
        if (listener != null) {
            listener.onRestoreSwipePosition(this, getAbsoluteAdapterPosition());
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.SwipeViewHolder
    public final float getClosedX() {
        return 0.0f;
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.SwipeViewHolder
    public final float getOpenedX() {
        return ContextKt.isRtlLayout(ViewHolderKt.getContext(this)) ? getOptionsMenuWidth() : -getOptionsMenuWidth();
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.SwipeViewHolder
    public final InterfaceC18280f getSwipeDeltaRange() {
        return ContextKt.isRtlLayout(ViewHolderKt.getContext(this)) ? new C18279e(0.0f, getOpenedX()) : new C18279e(getOpenedX(), 0.0f);
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.SwipeViewHolder
    public final View getSwipeView() {
        ConstraintLayout root = this.binding.itemForegroundView.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.SwipeViewHolder
    public final boolean isSwipeEnabled() {
        return this.optionsCount > 0 && this.style.getSwipeEnabled();
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.SwipeViewHolder
    public final boolean isSwiped() {
        return Math.abs(getSwipeView().getX()) >= Math.abs(getOpenedX()) / ((float) 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChannelViewHolder(ViewGroup viewGroup, ChannelListView.ChannelClickListener channelClickListener, ChannelListView.ChannelLongClickListener channelLongClickListener, ChannelListView.ChannelClickListener channelClickListener2, ChannelListView.ChannelClickListener channelClickListener3, ChannelListView.UserClickListener userClickListener, ChannelListView.SwipeListener swipeListener, ChannelListViewStyle channelListViewStyle, ChannelListView.ChannelOptionVisibilityPredicate channelOptionVisibilityPredicate, ChannelListView.ChannelOptionVisibilityPredicate channelOptionVisibilityPredicate2, ChannelListView.ChannelOptionIconProvider channelOptionIconProvider, ChannelListView.ChannelOptionIconProvider channelOptionIconProvider2, StreamUiChannelListItemViewBinding streamUiChannelListItemViewBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        ViewGroup viewGroup2;
        StreamUiChannelListItemViewBinding streamUiChannelListItemViewBindingInflate;
        if ((i13 & 4096) != 0) {
            viewGroup2 = viewGroup;
            streamUiChannelListItemViewBindingInflate = StreamUiChannelListItemViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup2, false);
        } else {
            viewGroup2 = viewGroup;
            streamUiChannelListItemViewBindingInflate = streamUiChannelListItemViewBinding;
        }
        this(viewGroup2, channelClickListener, channelLongClickListener, channelClickListener2, channelClickListener3, userClickListener, swipeListener, channelListViewStyle, channelOptionVisibilityPredicate, channelOptionVisibilityPredicate2, channelOptionIconProvider, channelOptionIconProvider2, streamUiChannelListItemViewBindingInflate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChannelViewHolder(ViewGroup parent, ChannelListView.ChannelClickListener channelClickListener, ChannelListView.ChannelLongClickListener channelLongClickListener, ChannelListView.ChannelClickListener channelDeleteListener, ChannelListView.ChannelClickListener channelMoreOptionsListener, ChannelListView.UserClickListener userClickListener, ChannelListView.SwipeListener swipeListener, ChannelListViewStyle style, ChannelListView.ChannelOptionVisibilityPredicate isMoreOptionsVisible, ChannelListView.ChannelOptionVisibilityPredicate isDeleteOptionVisible, ChannelListView.ChannelOptionIconProvider getMoreOptionsIcon, ChannelListView.ChannelOptionIconProvider getDeleteOptionIcon, StreamUiChannelListItemViewBinding binding) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(channelClickListener, "channelClickListener");
        AbstractC22676k.m65750j(channelLongClickListener, "channelLongClickListener");
        AbstractC22676k.m65750j(channelDeleteListener, "channelDeleteListener");
        AbstractC22676k.m65750j(channelMoreOptionsListener, "channelMoreOptionsListener");
        AbstractC22676k.m65750j(userClickListener, "userClickListener");
        AbstractC22676k.m65750j(swipeListener, "swipeListener");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(isMoreOptionsVisible, "isMoreOptionsVisible");
        AbstractC22676k.m65750j(isDeleteOptionVisible, "isDeleteOptionVisible");
        AbstractC22676k.m65750j(getMoreOptionsIcon, "getMoreOptionsIcon");
        AbstractC22676k.m65750j(getDeleteOptionIcon, "getDeleteOptionIcon");
        AbstractC22676k.m65750j(binding, "binding");
        FrameLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
        this.channelClickListener = channelClickListener;
        this.channelLongClickListener = channelLongClickListener;
        this.channelDeleteListener = channelDeleteListener;
        this.channelMoreOptionsListener = channelMoreOptionsListener;
        this.userClickListener = userClickListener;
        this.swipeListener = swipeListener;
        this.style = style;
        this.isMoreOptionsVisible = isMoreOptionsVisible;
        this.isDeleteOptionVisible = isDeleteOptionVisible;
        this.getMoreOptionsIcon = getMoreOptionsIcon;
        this.getDeleteOptionIcon = getDeleteOptionIcon;
        this.binding = binding;
        this.currentUser = ChatUI.getCurrentUserProvider().getCurrentUser();
        this.optionsCount = 1;
        this.menuItemWidth = ContextKt.getDimension(ViewHolderKt.getContext(this), C19469R.dimen.stream_ui_channel_list_item_option_icon_width);
        FrameLayout channelItemView = binding.channelItemView;
        AbstractC22676k.m65749i(channelItemView, "channelItemView");
        ViewGroup.LayoutParams layoutParams = channelItemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = style.getItemHeight();
            channelItemView.setLayoutParams(layoutParams);
            StreamUiChannelListItemBackgroundViewBinding streamUiChannelListItemBackgroundViewBinding = binding.itemBackgroundView;
            final int i13 = 0;
            streamUiChannelListItemBackgroundViewBinding.moreOptionsImageView.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.internal.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ ChannelViewHolder f74494x;

                {
                    this.f74494x = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            ChannelViewHolder.lambda$11$lambda$3$lambda$1(this.f74494x, view);
                            break;
                        case 1:
                            ChannelViewHolder.lambda$11$lambda$3$lambda$2(this.f74494x, view);
                            break;
                        case 2:
                            ChannelViewHolder.lambda$11$lambda$10$lambda$5(this.f74494x, view);
                            break;
                        default:
                            ChannelViewHolder.lambda$11$lambda$10$lambda$9$lambda$6(this.f74494x, view);
                            break;
                    }
                }
            });
            final int i14 = 1;
            streamUiChannelListItemBackgroundViewBinding.deleteImageView.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.internal.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ ChannelViewHolder f74494x;

                {
                    this.f74494x = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            ChannelViewHolder.lambda$11$lambda$3$lambda$1(this.f74494x, view);
                            break;
                        case 1:
                            ChannelViewHolder.lambda$11$lambda$3$lambda$2(this.f74494x, view);
                            break;
                        case 2:
                            ChannelViewHolder.lambda$11$lambda$10$lambda$5(this.f74494x, view);
                            break;
                        default:
                            ChannelViewHolder.lambda$11$lambda$10$lambda$9$lambda$6(this.f74494x, view);
                            break;
                    }
                }
            });
            applyStyle(streamUiChannelListItemBackgroundViewBinding, style);
            final StreamUiChannelListItemForegroundViewBinding streamUiChannelListItemForegroundViewBinding = binding.itemForegroundView;
            final int i15 = 2;
            streamUiChannelListItemForegroundViewBinding.channelAvatarView.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.internal.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ ChannelViewHolder f74494x;

                {
                    this.f74494x = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            ChannelViewHolder.lambda$11$lambda$3$lambda$1(this.f74494x, view);
                            break;
                        case 1:
                            ChannelViewHolder.lambda$11$lambda$3$lambda$2(this.f74494x, view);
                            break;
                        case 2:
                            ChannelViewHolder.lambda$11$lambda$10$lambda$5(this.f74494x, view);
                            break;
                        default:
                            ChannelViewHolder.lambda$11$lambda$10$lambda$9$lambda$6(this.f74494x, view);
                            break;
                    }
                }
            });
            ConstraintLayout root2 = streamUiChannelListItemForegroundViewBinding.getRoot();
            final int i16 = 3;
            root2.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.internal.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ ChannelViewHolder f74494x;

                {
                    this.f74494x = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            ChannelViewHolder.lambda$11$lambda$3$lambda$1(this.f74494x, view);
                            break;
                        case 1:
                            ChannelViewHolder.lambda$11$lambda$3$lambda$2(this.f74494x, view);
                            break;
                        case 2:
                            ChannelViewHolder.lambda$11$lambda$10$lambda$5(this.f74494x, view);
                            break;
                        default:
                            ChannelViewHolder.lambda$11$lambda$10$lambda$9$lambda$6(this.f74494x, view);
                            break;
                    }
                }
            });
            root2.setOnLongClickListener(new ViewOnLongClickListenerC19642b(this, 0));
            root2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.internal.ChannelViewHolder$lambda$11$lambda$10$lambda$9$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ChannelViewHolder channelViewHolder = this.this$0;
                    ConstraintLayout root3 = streamUiChannelListItemForegroundViewBinding.getRoot();
                    AbstractC22676k.m65749i(root3, "getRoot(...)");
                    channelViewHolder.setSwipeListener(root3, this.this$0.swipeListener);
                }
            });
            applyStyle(streamUiChannelListItemForegroundViewBinding, style);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final void applyStyle(StreamUiChannelListItemForegroundViewBinding streamUiChannelListItemForegroundViewBinding, ChannelListViewStyle channelListViewStyle) {
        streamUiChannelListItemForegroundViewBinding.foregroundView.setBackgroundTintList(ColorStateList.valueOf(channelListViewStyle.getForegroundLayoutColor()));
        ConstraintLayout foregroundView = streamUiChannelListItemForegroundViewBinding.foregroundView;
        AbstractC22676k.m65749i(foregroundView, "foregroundView");
        ViewGroup.LayoutParams layoutParams = foregroundView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = channelListViewStyle.getItemHeight();
            foregroundView.setLayoutParams(layoutParams);
            TextView channelNameLabel = streamUiChannelListItemForegroundViewBinding.channelNameLabel;
            AbstractC22676k.m65749i(channelNameLabel, "channelNameLabel");
            TextStyleKt.setTextStyle(channelNameLabel, channelListViewStyle.getChannelTitleText());
            TextView draftMessageLabel = streamUiChannelListItemForegroundViewBinding.draftMessageLabel;
            AbstractC22676k.m65749i(draftMessageLabel, "draftMessageLabel");
            TextStyleKt.setTextStyle(draftMessageLabel, channelListViewStyle.getDraftMessageLabel());
            TextView lastMessageLabel = streamUiChannelListItemForegroundViewBinding.lastMessageLabel;
            AbstractC22676k.m65749i(lastMessageLabel, "lastMessageLabel");
            TextStyleKt.setTextStyle(lastMessageLabel, channelListViewStyle.getLastMessageText());
            TextView lastMessageTimeLabel = streamUiChannelListItemForegroundViewBinding.lastMessageTimeLabel;
            AbstractC22676k.m65749i(lastMessageTimeLabel, "lastMessageTimeLabel");
            TextStyleKt.setTextStyle(lastMessageTimeLabel, channelListViewStyle.getLastMessageDateText());
            TextView unreadCountBadge = streamUiChannelListItemForegroundViewBinding.unreadCountBadge;
            AbstractC22676k.m65749i(unreadCountBadge, "unreadCountBadge");
            TextStyleKt.setTextStyle(unreadCountBadge, channelListViewStyle.getUnreadMessageCounterText());
            streamUiChannelListItemForegroundViewBinding.unreadCountBadge.setBackgroundTintList(ColorStateList.valueOf(channelListViewStyle.getUnreadMessageCounterBackgroundColor()));
            streamUiChannelListItemForegroundViewBinding.muteIcon.setImageDrawable(channelListViewStyle.getMutedChannelIcon());
            ChannelAvatarView channelAvatarView = streamUiChannelListItemForegroundViewBinding.channelAvatarView;
            AbstractC22676k.m65749i(channelAvatarView, "channelAvatarView");
            ViewGroup.LayoutParams layoutParams2 = channelAvatarView.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.setMarginStart(channelListViewStyle.getItemMarginStart());
                channelAvatarView.setLayoutParams(marginLayoutParams);
                TextView lastMessageTimeLabel2 = streamUiChannelListItemForegroundViewBinding.lastMessageTimeLabel;
                AbstractC22676k.m65749i(lastMessageTimeLabel2, "lastMessageTimeLabel");
                ViewGroup.LayoutParams layoutParams3 = lastMessageTimeLabel2.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams2.setMarginEnd(channelListViewStyle.getItemMarginEnd());
                    lastMessageTimeLabel2.setLayoutParams(marginLayoutParams2);
                    TextView unreadCountBadge2 = streamUiChannelListItemForegroundViewBinding.unreadCountBadge;
                    AbstractC22676k.m65749i(unreadCountBadge2, "unreadCountBadge");
                    ViewGroup.LayoutParams layoutParams4 = unreadCountBadge2.getLayoutParams();
                    if (layoutParams4 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams3.setMarginEnd(channelListViewStyle.getItemMarginEnd());
                        unreadCountBadge2.setLayoutParams(marginLayoutParams3);
                        TextView channelNameLabel2 = streamUiChannelListItemForegroundViewBinding.channelNameLabel;
                        AbstractC22676k.m65749i(channelNameLabel2, "channelNameLabel");
                        ViewGroup.LayoutParams layoutParams5 = channelNameLabel2.getLayoutParams();
                        if (layoutParams5 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
                            marginLayoutParams4.setMarginStart(channelListViewStyle.getItemTitleMarginStart());
                            channelNameLabel2.setLayoutParams(marginLayoutParams4);
                            View spacer = streamUiChannelListItemForegroundViewBinding.spacer;
                            AbstractC22676k.m65749i(spacer, "spacer");
                            ViewGroup.LayoutParams layoutParams6 = spacer.getLayoutParams();
                            if (layoutParams6 != null) {
                                layoutParams6.height = channelListViewStyle.getItemVerticalSpacerHeight();
                                spacer.setLayoutParams(layoutParams6);
                                streamUiChannelListItemForegroundViewBinding.guideline.setGuidelinePercent(channelListViewStyle.getItemVerticalSpacerPosition());
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
