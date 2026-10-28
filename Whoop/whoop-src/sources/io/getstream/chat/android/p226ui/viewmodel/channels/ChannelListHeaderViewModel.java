package io.getstream.chat.android.p226ui.viewmodel.channels;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.setup.state.ClientState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;", "Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "<init>", "(Lio/getstream/chat/android/client/setup/state/ClientState;)V", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/models/User;", "currentUser", "Landroidx/lifecycle/p0;", "getCurrentUser", "()Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/models/ConnectionState;", "connectionState", "getConnectionState", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListHeaderViewModel extends AbstractC1637w1 {
    private final AbstractC1615p0 connectionState;
    private final AbstractC1615p0 currentUser;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelListHeaderViewModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final AbstractC1615p0 getConnectionState() {
        return this.connectionState;
    }

    public final AbstractC1615p0 getCurrentUser() {
        return this.currentUser;
    }

    public /* synthetic */ ChannelListHeaderViewModel(ClientState clientState, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ChatClient.INSTANCE.instance().getClientState() : clientState);
    }

    public ChannelListHeaderViewModel(ClientState clientState) {
        AbstractC22676k.m65750j(clientState, "clientState");
        this.currentUser = AbstractC1613o1.m5012b(clientState.getUser(), null, 3);
        this.connectionState = AbstractC1613o1.m5012b(clientState.getConnectionState(), null, 3);
    }
}
