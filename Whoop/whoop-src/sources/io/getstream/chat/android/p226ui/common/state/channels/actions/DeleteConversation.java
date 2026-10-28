package io.getstream.chat.android.p226ui.common.state.channels.actions;

import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.common.C19470R;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channels/actions/DeleteConversation;", "Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;", "Lio/getstream/chat/android/models/Channel;", "channel", "", "label", "Lkotlin/Function0;", "Ll83/a0;", "onAction", "Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;", "confirmationPopup", "<init>", "(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lc93/a;Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;)V", "Lio/getstream/chat/android/models/Channel;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lc93/a;", "getOnAction", "()Lc93/a;", "Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;", "getConfirmationPopup", "()Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;", "", "icon", "I", "getIcon", "()I", "", "isDestructive", "Z", "()Z", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DeleteConversation implements ChannelAction {
    public static final int $stable = 0;
    private final Channel channel;
    private final ConfirmationPopup confirmationPopup;
    private final int icon;
    private final boolean isDestructive;
    private final String label;
    private final InterfaceC4339a onAction;

    public DeleteConversation(Channel channel, String label, InterfaceC4339a onAction, ConfirmationPopup confirmationPopup) {
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(onAction, "onAction");
        this.channel = channel;
        this.label = label;
        this.onAction = onAction;
        this.confirmationPopup = confirmationPopup;
        this.icon = C19470R.drawable.stream_design_ic_delete;
        this.isDestructive = true;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction
    public final Channel getChannel() {
        return this.channel;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction
    public final ConfirmationPopup getConfirmationPopup() {
        return this.confirmationPopup;
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
    /* JADX INFO: renamed from: isDestructive, reason: from getter */
    public final boolean getIsDestructive() {
        return this.isDestructive;
    }

    public /* synthetic */ DeleteConversation(Channel channel, String str, InterfaceC4339a interfaceC4339a, ConfirmationPopup confirmationPopup, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(channel, str, interfaceC4339a, (i13 & 8) != 0 ? null : confirmationPopup);
    }
}
