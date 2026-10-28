package io.getstream.chat.android.p226ui.common.state.channels.actions;

import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.common.C19470R;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channels/actions/UnarchiveChannel;", "Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;", "Lio/getstream/chat/android/models/Channel;", "channel", "", "label", "Lkotlin/Function0;", "Ll83/a0;", "onAction", "<init>", "(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lc93/a;)V", "Lio/getstream/chat/android/models/Channel;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lc93/a;", "getOnAction", "()Lc93/a;", "", "icon", "I", "getIcon", "()I", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UnarchiveChannel implements ChannelAction {
    public static final int $stable = 0;
    private final Channel channel;
    private final int icon;
    private final String label;
    private final InterfaceC4339a onAction;

    public UnarchiveChannel(Channel channel, String label, InterfaceC4339a onAction) {
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(onAction, "onAction");
        this.channel = channel;
        this.label = label;
        this.onAction = onAction;
        this.icon = C19470R.drawable.stream_design_ic_unarchive;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction
    public final Channel getChannel() {
        return this.channel;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction
    public final ConfirmationPopup getConfirmationPopup() {
        return null;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction
    public final int getIcon() {
        return this.icon;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction
    public final String getLabel() {
        return this.label;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction
    public final InterfaceC4339a getOnAction() {
        return this.onAction;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction
    /* JADX INFO: renamed from: isDestructive */
    public final boolean getIsDestructive() {
        return false;
    }
}
