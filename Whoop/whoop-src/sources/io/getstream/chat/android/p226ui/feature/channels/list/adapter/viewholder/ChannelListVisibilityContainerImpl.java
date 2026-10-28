package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder;

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
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0002\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u0004\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainer;", "isMoreOptionsVisible", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", "isDeleteOptionVisible", "<init>", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;)V", "<set-?>", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", "setMoreOptionsVisible", "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;)V", "isMoreOptionsVisible$delegate", "Lio/getstream/chat/android/ui/utils/ListenerDelegate;", "setDeleteOptionVisible", "isDeleteOptionVisible$delegate", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListVisibilityContainerImpl implements ChannelListVisibilityContainer {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties;
    private static final Companion Companion;
    private static final ChannelListView.ChannelOptionVisibilityPredicate deleteOptionDefault;
    private static final ChannelListView.ChannelOptionVisibilityPredicate moreOptionsDefault;

    /* JADX INFO: renamed from: isDeleteOptionVisible$delegate, reason: from kotlin metadata */
    private final ListenerDelegate isDeleteOptionVisible;

    /* JADX INFO: renamed from: isMoreOptionsVisible$delegate, reason: from kotlin metadata */
    private final ListenerDelegate isMoreOptionsVisible;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl$Companion;", "", "<init>", "()V", "moreOptionsDefault", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", "getMoreOptionsDefault", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", "deleteOptionDefault", "getDeleteOptionDefault", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ChannelListView.ChannelOptionVisibilityPredicate getDeleteOptionDefault() {
            return ChannelListVisibilityContainerImpl.deleteOptionDefault;
        }

        public final ChannelListView.ChannelOptionVisibilityPredicate getMoreOptionsDefault() {
            return ChannelListVisibilityContainerImpl.moreOptionsDefault;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        C22686q c22686q = new C22686q(ChannelListVisibilityContainerImpl.class, "isMoreOptionsVisible", "isMoreOptionsVisible()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        $$delegatedProperties = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(ChannelListVisibilityContainerImpl.class, "isDeleteOptionVisible", "isDeleteOptionVisible()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", 0, c22673i0)};
        Companion = new Companion();
        moreOptionsDefault = C19633x636d4233.INSTANCE;
        deleteOptionDefault = C19632x86e43300.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelListVisibilityContainerImpl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelListView.ChannelOptionVisibilityPredicate isDeleteOptionVisible_delegate$lambda$1(final InterfaceC4339a realPredicate) {
        AbstractC22676k.m65750j(realPredicate, "realPredicate");
        return new ChannelListView.ChannelOptionVisibilityPredicate() { // from class: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.ChannelListVisibilityContainerImpl$isDeleteOptionVisible$2$1
            @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelOptionVisibilityPredicate, p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Channel channel) {
                AbstractC22676k.m65750j(channel, "channel");
                return ((ChannelListView.ChannelOptionVisibilityPredicate) realPredicate.invoke()).invoke(channel);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelListView.ChannelOptionVisibilityPredicate isMoreOptionsVisible_delegate$lambda$0(final InterfaceC4339a realPredicate) {
        AbstractC22676k.m65750j(realPredicate, "realPredicate");
        return new ChannelListView.ChannelOptionVisibilityPredicate() { // from class: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.ChannelListVisibilityContainerImpl$isMoreOptionsVisible$2$1
            @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelOptionVisibilityPredicate, p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Channel channel) {
                AbstractC22676k.m65750j(channel, "channel");
                return ((ChannelListView.ChannelOptionVisibilityPredicate) realPredicate.invoke()).invoke(channel);
            }
        };
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListVisibilityContainer
    public final ChannelListView.ChannelOptionVisibilityPredicate isDeleteOptionVisible() {
        return (ChannelListView.ChannelOptionVisibilityPredicate) this.isDeleteOptionVisible.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.ChannelListVisibilityContainer
    public final ChannelListView.ChannelOptionVisibilityPredicate isMoreOptionsVisible() {
        return (ChannelListView.ChannelOptionVisibilityPredicate) this.isMoreOptionsVisible.getValue(this, $$delegatedProperties[0]);
    }

    public final void setDeleteOptionVisible(ChannelListView.ChannelOptionVisibilityPredicate channelOptionVisibilityPredicate) {
        AbstractC22676k.m65750j(channelOptionVisibilityPredicate, "<set-?>");
        this.isDeleteOptionVisible.setValue(this, $$delegatedProperties[1], channelOptionVisibilityPredicate);
    }

    public final void setMoreOptionsVisible(ChannelListView.ChannelOptionVisibilityPredicate channelOptionVisibilityPredicate) {
        AbstractC22676k.m65750j(channelOptionVisibilityPredicate, "<set-?>");
        this.isMoreOptionsVisible.setValue(this, $$delegatedProperties[0], channelOptionVisibilityPredicate);
    }

    public ChannelListVisibilityContainerImpl(ChannelListView.ChannelOptionVisibilityPredicate isMoreOptionsVisible, ChannelListView.ChannelOptionVisibilityPredicate isDeleteOptionVisible) {
        AbstractC22676k.m65750j(isMoreOptionsVisible, "isMoreOptionsVisible");
        AbstractC22676k.m65750j(isDeleteOptionVisible, "isDeleteOptionVisible");
        this.isMoreOptionsVisible = new ListenerDelegate(isMoreOptionsVisible, new C19616a(9));
        this.isDeleteOptionVisible = new ListenerDelegate(isDeleteOptionVisible, new C19616a(10));
    }

    public /* synthetic */ ChannelListVisibilityContainerImpl(ChannelListView.ChannelOptionVisibilityPredicate channelOptionVisibilityPredicate, ChannelListView.ChannelOptionVisibilityPredicate channelOptionVisibilityPredicate2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? moreOptionsDefault : channelOptionVisibilityPredicate, (i13 & 2) != 0 ? deleteOptionDefault : channelOptionVisibilityPredicate2);
    }
}
