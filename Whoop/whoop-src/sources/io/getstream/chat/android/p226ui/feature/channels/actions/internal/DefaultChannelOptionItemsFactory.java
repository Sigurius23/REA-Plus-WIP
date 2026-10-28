package io.getstream.chat.android.p226ui.feature.channels.actions.internal;

import android.content.Context;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelCapabilities;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction;
import io.getstream.chat.android.p226ui.common.state.channels.actions.DeleteConversation;
import io.getstream.chat.android.p226ui.common.state.channels.actions.LeaveGroup;
import io.getstream.chat.android.p226ui.common.state.channels.actions.ViewInfo;
import io.getstream.chat.android.p226ui.feature.channels.actions.ChannelActionsDialogViewStyle;
import java.util.List;
import java.util.Set;
import m83.AbstractC25260n;
import ou1.C28376a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/actions/internal/DefaultChannelOptionItemsFactory;", "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "createChannelOptionItems", "", "Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;", "selectedChannel", "Lio/getstream/chat/android/models/Channel;", "ownCapabilities", "", "", "style", "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class DefaultChannelOptionItemsFactory implements ChannelOptionItemsFactory {
    private final Context context;

    public DefaultChannelOptionItemsFactory(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.actions.internal.ChannelOptionItemsFactory
    public final List<ChannelAction> createChannelOptionItems(Channel selectedChannel, Set<String> ownCapabilities, ChannelActionsDialogViewStyle style) {
        ViewInfo viewInfo;
        LeaveGroup leaveGroup;
        AbstractC22676k.m65750j(selectedChannel, "selectedChannel");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(style, "style");
        boolean zContains = ownCapabilities.contains(ChannelCapabilities.LEAVE_CHANNEL);
        boolean zContains2 = ownCapabilities.contains(ChannelCapabilities.DELETE_CHANNEL);
        DeleteConversation deleteConversation = null;
        if (style.getViewInfoEnabled()) {
            String string = this.context.getString(C19469R.string.stream_ui_channel_list_view_info);
            AbstractC22676k.m65749i(string, "getString(...)");
            viewInfo = new ViewInfo(selectedChannel, string, new C28376a(7));
        } else {
            viewInfo = null;
        }
        if (style.getLeaveGroupEnabled() && zContains) {
            String string2 = this.context.getString(C19469R.string.stream_ui_channel_list_leave_channel);
            AbstractC22676k.m65749i(string2, "getString(...)");
            leaveGroup = new LeaveGroup(selectedChannel, string2, new C28376a(7), null, 8, null);
        } else {
            leaveGroup = null;
        }
        if (style.getDeleteConversationEnabled() && zContains2) {
            String string3 = this.context.getString(C19469R.string.stream_ui_channel_list_delete_channel);
            AbstractC22676k.m65749i(string3, "getString(...)");
            deleteConversation = new DeleteConversation(selectedChannel, string3, new C28376a(7), null, 8, null);
        }
        return AbstractC25260n.m74077r0(new ChannelAction[]{viewInfo, leaveGroup, deleteConversation});
    }
}
