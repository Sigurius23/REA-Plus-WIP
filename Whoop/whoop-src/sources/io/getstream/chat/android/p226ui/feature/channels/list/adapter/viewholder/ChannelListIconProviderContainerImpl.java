package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder;

import android.graphics.drawable.Drawable;
import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Channel;
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
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainerImpl;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListIconProviderContainer;", "getMoreOptionsIcon", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;", "getDeleteOptionIcon", "<init>", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V", "<set-?>", "getGetMoreOptionsIcon", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;", "setGetMoreOptionsIcon", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;)V", "getMoreOptionsIcon$delegate", "Lio/getstream/chat/android/ui/utils/ListenerDelegate;", "getGetDeleteOptionIcon", "setGetDeleteOptionIcon", "getDeleteOptionIcon$delegate", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListIconProviderContainerImpl implements ChannelListIconProviderContainer {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties;

    /* JADX INFO: renamed from: getDeleteOptionIcon$delegate, reason: from kotlin metadata */
    private final ListenerDelegate getDeleteOptionIcon;

    /* JADX INFO: renamed from: getMoreOptionsIcon$delegate, reason: from kotlin metadata */
    private final ListenerDelegate getMoreOptionsIcon;

    static {
        C22686q c22686q = new C22686q(ChannelListIconProviderContainerImpl.class, "getMoreOptionsIcon", "getGetMoreOptionsIcon()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        $$delegatedProperties = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(ChannelListIconProviderContainerImpl.class, "getDeleteOptionIcon", "getGetDeleteOptionIcon()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;", 0, c22673i0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelListIconProviderContainerImpl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C19634a m55115c(InterfaceC4339a interfaceC4339a) {
        return (C19634a) getMoreOptionsIcon_delegate$lambda$1(interfaceC4339a);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C19634a m55116d(InterfaceC4339a interfaceC4339a) {
        return (C19634a) getDeleteOptionIcon_delegate$lambda$3(interfaceC4339a);
    }

    private static final ChannelListView.ChannelOptionIconProvider getDeleteOptionIcon_delegate$lambda$3(InterfaceC4339a realPredicate) {
        AbstractC22676k.m65750j(realPredicate, "realPredicate");
        return new C19634a(realPredicate, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable getDeleteOptionIcon_delegate$lambda$3$lambda$2(InterfaceC4339a interfaceC4339a, Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        return ((ChannelListView.ChannelOptionIconProvider) interfaceC4339a.invoke()).invoke(channel);
    }

    private static final ChannelListView.ChannelOptionIconProvider getMoreOptionsIcon_delegate$lambda$1(InterfaceC4339a realPredicate) {
        AbstractC22676k.m65750j(realPredicate, "realPredicate");
        return new C19634a(realPredicate, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable getMoreOptionsIcon_delegate$lambda$1$lambda$0(InterfaceC4339a interfaceC4339a, Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        return ((ChannelListView.ChannelOptionIconProvider) interfaceC4339a.invoke()).invoke(channel);
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListIconProviderContainer
    public final ChannelListView.ChannelOptionIconProvider getGetDeleteOptionIcon() {
        return (ChannelListView.ChannelOptionIconProvider) this.getDeleteOptionIcon.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListIconProviderContainer
    public final ChannelListView.ChannelOptionIconProvider getGetMoreOptionsIcon() {
        return (ChannelListView.ChannelOptionIconProvider) this.getMoreOptionsIcon.getValue(this, $$delegatedProperties[0]);
    }

    public final void setGetDeleteOptionIcon(ChannelListView.ChannelOptionIconProvider channelOptionIconProvider) {
        AbstractC22676k.m65750j(channelOptionIconProvider, "<set-?>");
        this.getDeleteOptionIcon.setValue(this, $$delegatedProperties[1], channelOptionIconProvider);
    }

    public final void setGetMoreOptionsIcon(ChannelListView.ChannelOptionIconProvider channelOptionIconProvider) {
        AbstractC22676k.m65750j(channelOptionIconProvider, "<set-?>");
        this.getMoreOptionsIcon.setValue(this, $$delegatedProperties[0], channelOptionIconProvider);
    }

    public ChannelListIconProviderContainerImpl(ChannelListView.ChannelOptionIconProvider getMoreOptionsIcon, ChannelListView.ChannelOptionIconProvider getDeleteOptionIcon) {
        AbstractC22676k.m65750j(getMoreOptionsIcon, "getMoreOptionsIcon");
        AbstractC22676k.m65750j(getDeleteOptionIcon, "getDeleteOptionIcon");
        this.getMoreOptionsIcon = new ListenerDelegate(getMoreOptionsIcon, new C19616a(1));
        this.getDeleteOptionIcon = new ListenerDelegate(getDeleteOptionIcon, new C19616a(2));
    }

    public /* synthetic */ ChannelListIconProviderContainerImpl(ChannelListView.ChannelOptionIconProvider channelOptionIconProvider, ChannelListView.ChannelOptionIconProvider channelOptionIconProvider2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ChannelListView.ChannelOptionIconProvider.DEFAULT : channelOptionIconProvider, (i13 & 2) != 0 ? ChannelListView.ChannelOptionIconProvider.DEFAULT : channelOptionIconProvider2);
    }
}
