package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder;

import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.utils.extensions.C19616a;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import io.getstream.chat.android.p226ui.utils.ListenerDelegate;
import j93.InterfaceC21493z;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R+\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R+\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0014\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0014\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainer;", "channelClickListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", "channelLongClickListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;", "deleteClickListener", "moreOptionsClickListener", "userClickListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;", "swipeListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "<init>", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V", "<set-?>", "getChannelClickListener", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", "setChannelClickListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V", "channelClickListener$delegate", "Lio/getstream/chat/android/ui/utils/ListenerDelegate;", "getChannelLongClickListener", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;", "setChannelLongClickListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;)V", "channelLongClickListener$delegate", "getDeleteClickListener", "setDeleteClickListener", "deleteClickListener$delegate", "getMoreOptionsClickListener", "setMoreOptionsClickListener", "moreOptionsClickListener$delegate", "getUserClickListener", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;", "setUserClickListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;)V", "userClickListener$delegate", "getSwipeListener", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "setSwipeListener", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V", "swipeListener$delegate", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListListenerContainerImpl implements ChannelListListenerContainer {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties;

    /* JADX INFO: renamed from: channelClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate channelClickListener;

    /* JADX INFO: renamed from: channelLongClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate channelLongClickListener;

    /* JADX INFO: renamed from: deleteClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate deleteClickListener;

    /* JADX INFO: renamed from: moreOptionsClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate moreOptionsClickListener;

    /* JADX INFO: renamed from: swipeListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate swipeListener;

    /* JADX INFO: renamed from: userClickListener$delegate, reason: from kotlin metadata */
    private final ListenerDelegate userClickListener;

    static {
        C22686q c22686q = new C22686q(ChannelListListenerContainerImpl.class, "channelClickListener", "getChannelClickListener()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        $$delegatedProperties = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(ChannelListListenerContainerImpl.class, "channelLongClickListener", "getChannelLongClickListener()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;", 0, c22673i0), AbstractC11895b.m31990i(ChannelListListenerContainerImpl.class, "deleteClickListener", "getDeleteClickListener()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", 0, c22673i0), AbstractC11895b.m31990i(ChannelListListenerContainerImpl.class, "moreOptionsClickListener", "getMoreOptionsClickListener()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", 0, c22673i0), AbstractC11895b.m31990i(ChannelListListenerContainerImpl.class, "userClickListener", "getUserClickListener()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;", 0, c22673i0), AbstractC11895b.m31990i(ChannelListListenerContainerImpl.class, "swipeListener", "getSwipeListener()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", 0, c22673i0)};
    }

    public ChannelListListenerContainerImpl() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C19636c m55119b(InterfaceC4339a interfaceC4339a) {
        return (C19636c) channelLongClickListener_delegate$lambda$3(interfaceC4339a);
    }

    private static final ChannelListView.ChannelClickListener channelClickListener_delegate$lambda$1(InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new C19635b(realListener, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void channelClickListener_delegate$lambda$1$lambda$0(InterfaceC4339a interfaceC4339a, Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        ((ChannelListView.ChannelClickListener) interfaceC4339a.invoke()).onClick(channel);
    }

    private static final ChannelListView.ChannelLongClickListener channelLongClickListener_delegate$lambda$3(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new ChannelListView.ChannelLongClickListener() { // from class: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.c
            @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelLongClickListener
            public final boolean onLongClick(Channel channel) {
                return ChannelListListenerContainerImpl.channelLongClickListener_delegate$lambda$3$lambda$2(realListener, channel);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean channelLongClickListener_delegate$lambda$3$lambda$2(InterfaceC4339a interfaceC4339a, Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        return ((ChannelListView.ChannelLongClickListener) interfaceC4339a.invoke()).onLongClick(channel);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C19635b m55121d(InterfaceC4339a interfaceC4339a) {
        return (C19635b) moreOptionsClickListener_delegate$lambda$7(interfaceC4339a);
    }

    private static final ChannelListView.ChannelClickListener deleteClickListener_delegate$lambda$5(InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new C19635b(realListener, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteClickListener_delegate$lambda$5$lambda$4(InterfaceC4339a interfaceC4339a, Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        ((ChannelListView.ChannelClickListener) interfaceC4339a.invoke()).onClick(channel);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ ChannelListListenerContainerImpl$swipeListener$2$1 m55122e(InterfaceC4339a interfaceC4339a) {
        return (ChannelListListenerContainerImpl$swipeListener$2$1) swipeListener_delegate$lambda$10(interfaceC4339a);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C19637d m55124g(InterfaceC4339a interfaceC4339a) {
        return (C19637d) userClickListener_delegate$lambda$9(interfaceC4339a);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C19635b m55125h(InterfaceC4339a interfaceC4339a) {
        return (C19635b) deleteClickListener_delegate$lambda$5(interfaceC4339a);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C19635b m55128k(InterfaceC4339a interfaceC4339a) {
        return (C19635b) channelClickListener_delegate$lambda$1(interfaceC4339a);
    }

    private static final ChannelListView.ChannelClickListener moreOptionsClickListener_delegate$lambda$7(InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new C19635b(realListener, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moreOptionsClickListener_delegate$lambda$7$lambda$6(InterfaceC4339a interfaceC4339a, Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        ((ChannelListView.ChannelClickListener) interfaceC4339a.invoke()).onClick(channel);
    }

    private static final ChannelListView.SwipeListener swipeListener_delegate$lambda$10(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new ChannelListView.SwipeListener() { // from class: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.ChannelListListenerContainerImpl$swipeListener$2$1
            @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.SwipeListener
            public final void onRestoreSwipePosition(SwipeViewHolder viewHolder, int adapterPosition) {
                AbstractC22676k.m65750j(viewHolder, "viewHolder");
                ((ChannelListView.SwipeListener) realListener.invoke()).onRestoreSwipePosition(viewHolder, adapterPosition);
            }

            @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.SwipeListener
            public final void onSwipeCanceled(SwipeViewHolder viewHolder, int adapterPosition, Float x3, Float y13) {
                AbstractC22676k.m65750j(viewHolder, "viewHolder");
                ((ChannelListView.SwipeListener) realListener.invoke()).onSwipeCanceled(viewHolder, adapterPosition, x3, y13);
            }

            @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.SwipeListener
            public final void onSwipeChanged(SwipeViewHolder viewHolder, int adapterPosition, float dX, float totalDeltaX) {
                AbstractC22676k.m65750j(viewHolder, "viewHolder");
                ((ChannelListView.SwipeListener) realListener.invoke()).onSwipeChanged(viewHolder, adapterPosition, dX, totalDeltaX);
            }

            @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.SwipeListener
            public final void onSwipeCompleted(SwipeViewHolder viewHolder, int adapterPosition, Float x3, Float y13) {
                AbstractC22676k.m65750j(viewHolder, "viewHolder");
                ((ChannelListView.SwipeListener) realListener.invoke()).onSwipeCompleted(viewHolder, adapterPosition, x3, y13);
            }

            @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.SwipeListener
            public final void onSwipeStarted(SwipeViewHolder viewHolder, int adapterPosition, Float x3, Float y13) {
                AbstractC22676k.m65750j(viewHolder, "viewHolder");
                ((ChannelListView.SwipeListener) realListener.invoke()).onSwipeStarted(viewHolder, adapterPosition, x3, y13);
            }
        };
    }

    private static final ChannelListView.UserClickListener userClickListener_delegate$lambda$9(final InterfaceC4339a realListener) {
        AbstractC22676k.m65750j(realListener, "realListener");
        return new ChannelListView.UserClickListener() { // from class: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.d
            @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.UserClickListener
            public final void onClick(User user) {
                ChannelListListenerContainerImpl.userClickListener_delegate$lambda$9$lambda$8(realListener, user);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void userClickListener_delegate$lambda$9$lambda$8(InterfaceC4339a interfaceC4339a, User user) {
        AbstractC22676k.m65750j(user, "user");
        ((ChannelListView.UserClickListener) interfaceC4339a.invoke()).onClick(user);
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListListenerContainer
    public final ChannelListView.ChannelClickListener getChannelClickListener() {
        return (ChannelListView.ChannelClickListener) this.channelClickListener.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListListenerContainer
    public final ChannelListView.ChannelLongClickListener getChannelLongClickListener() {
        return (ChannelListView.ChannelLongClickListener) this.channelLongClickListener.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListListenerContainer
    public final ChannelListView.ChannelClickListener getDeleteClickListener() {
        return (ChannelListView.ChannelClickListener) this.deleteClickListener.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListListenerContainer
    public final ChannelListView.ChannelClickListener getMoreOptionsClickListener() {
        return (ChannelListView.ChannelClickListener) this.moreOptionsClickListener.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListListenerContainer
    public final ChannelListView.SwipeListener getSwipeListener() {
        return (ChannelListView.SwipeListener) this.swipeListener.getValue(this, $$delegatedProperties[5]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListListenerContainer
    public final ChannelListView.UserClickListener getUserClickListener() {
        return (ChannelListView.UserClickListener) this.userClickListener.getValue(this, $$delegatedProperties[4]);
    }

    public final void setChannelClickListener(ChannelListView.ChannelClickListener channelClickListener) {
        AbstractC22676k.m65750j(channelClickListener, "<set-?>");
        this.channelClickListener.setValue(this, $$delegatedProperties[0], channelClickListener);
    }

    public final void setChannelLongClickListener(ChannelListView.ChannelLongClickListener channelLongClickListener) {
        AbstractC22676k.m65750j(channelLongClickListener, "<set-?>");
        this.channelLongClickListener.setValue(this, $$delegatedProperties[1], channelLongClickListener);
    }

    public final void setDeleteClickListener(ChannelListView.ChannelClickListener channelClickListener) {
        AbstractC22676k.m65750j(channelClickListener, "<set-?>");
        this.deleteClickListener.setValue(this, $$delegatedProperties[2], channelClickListener);
    }

    public final void setMoreOptionsClickListener(ChannelListView.ChannelClickListener channelClickListener) {
        AbstractC22676k.m65750j(channelClickListener, "<set-?>");
        this.moreOptionsClickListener.setValue(this, $$delegatedProperties[3], channelClickListener);
    }

    public final void setSwipeListener(ChannelListView.SwipeListener swipeListener) {
        AbstractC22676k.m65750j(swipeListener, "<set-?>");
        this.swipeListener.setValue(this, $$delegatedProperties[5], swipeListener);
    }

    public final void setUserClickListener(ChannelListView.UserClickListener userClickListener) {
        AbstractC22676k.m65750j(userClickListener, "<set-?>");
        this.userClickListener.setValue(this, $$delegatedProperties[4], userClickListener);
    }

    public ChannelListListenerContainerImpl(ChannelListView.ChannelClickListener channelClickListener, ChannelListView.ChannelLongClickListener channelLongClickListener, ChannelListView.ChannelClickListener deleteClickListener, ChannelListView.ChannelClickListener moreOptionsClickListener, ChannelListView.UserClickListener userClickListener, ChannelListView.SwipeListener swipeListener) {
        AbstractC22676k.m65750j(channelClickListener, "channelClickListener");
        AbstractC22676k.m65750j(channelLongClickListener, "channelLongClickListener");
        AbstractC22676k.m65750j(deleteClickListener, "deleteClickListener");
        AbstractC22676k.m65750j(moreOptionsClickListener, "moreOptionsClickListener");
        AbstractC22676k.m65750j(userClickListener, "userClickListener");
        AbstractC22676k.m65750j(swipeListener, "swipeListener");
        this.channelClickListener = new ListenerDelegate(channelClickListener, new C19616a(3));
        this.channelLongClickListener = new ListenerDelegate(channelLongClickListener, new C19616a(4));
        this.deleteClickListener = new ListenerDelegate(deleteClickListener, new C19616a(5));
        this.moreOptionsClickListener = new ListenerDelegate(moreOptionsClickListener, new C19616a(6));
        this.userClickListener = new ListenerDelegate(userClickListener, new C19616a(7));
        this.swipeListener = new ListenerDelegate(swipeListener, new C19616a(8));
    }

    public /* synthetic */ ChannelListListenerContainerImpl(ChannelListView.ChannelClickListener channelClickListener, ChannelListView.ChannelLongClickListener channelLongClickListener, ChannelListView.ChannelClickListener channelClickListener2, ChannelListView.ChannelClickListener channelClickListener3, ChannelListView.UserClickListener userClickListener, ChannelListView.SwipeListener swipeListener, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ChannelListView.ChannelClickListener.DEFAULT : channelClickListener, (i13 & 2) != 0 ? ChannelListView.ChannelLongClickListener.DEFAULT : channelLongClickListener, (i13 & 4) != 0 ? ChannelListView.ChannelClickListener.DEFAULT : channelClickListener2, (i13 & 8) != 0 ? ChannelListView.ChannelClickListener.DEFAULT : channelClickListener3, (i13 & 16) != 0 ? ChannelListView.UserClickListener.DEFAULT : userClickListener, (i13 & 32) != 0 ? ChannelListView.SwipeListener.DEFAULT : swipeListener);
    }
}
