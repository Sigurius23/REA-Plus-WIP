package io.getstream.chat.android.p226ui.viewmodel.messages;

import android.content.Context;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ConnectionState;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.utils.ChannelNameFormatter;
import io.getstream.chat.android.p226ui.feature.messages.header.ChannelHeaderView;
import io.getstream.chat.android.p226ui.utils.extensions.ChannelKt;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;", "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;", ProfileAnalyticsKt.VIEW, "Landroidx/lifecycle/g0;", "lifecycle", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Landroidx/lifecycle/g0;)V", "bindView", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelHeaderViewModelBinding {
    public static final void bind(ChannelHeaderViewModel channelHeaderViewModel, final ChannelHeaderView view, InterfaceC1585g0 lifecycle) {
        AbstractC22676k.m65750j(channelHeaderViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        final int i13 = 0;
        channelHeaderViewModel.getChannel().observe(lifecycle, new ChannelHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.messages.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        ChannelHeaderViewModelBinding.bindView$lambda$0(view, (Channel) obj);
                        break;
                    case 1:
                        ChannelHeaderViewModelBinding.bindView$lambda$1(view, (ConnectionState) obj);
                        break;
                    default:
                        ChannelHeaderViewModelBinding.bindView$lambda$2(view, (Message) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        final int i14 = 1;
        channelHeaderViewModel.getOnline().observe(lifecycle, new ChannelHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.messages.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        ChannelHeaderViewModelBinding.bindView$lambda$0(view, (Channel) obj);
                        break;
                    case 1:
                        ChannelHeaderViewModelBinding.bindView$lambda$1(view, (ConnectionState) obj);
                        break;
                    default:
                        ChannelHeaderViewModelBinding.bindView$lambda$2(view, (Message) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        channelHeaderViewModel.getTypingUsers().observe(lifecycle, new ChannelHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0(new ChannelHeaderViewModelBinding$bindView$3(view)));
        final int i15 = 2;
        channelHeaderViewModel.getActiveThread().observe(lifecycle, new ChannelHeaderViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.messages.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        ChannelHeaderViewModelBinding.bindView$lambda$0(view, (Channel) obj);
                        break;
                    case 1:
                        ChannelHeaderViewModelBinding.bindView$lambda$1(view, (ConnectionState) obj);
                        break;
                    default:
                        ChannelHeaderViewModelBinding.bindView$lambda$2(view, (Message) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$0(ChannelHeaderView channelHeaderView, Channel channel) {
        ChannelNameFormatter channelNameFormatter = ChatUI.getChannelNameFormatter();
        AbstractC22676k.m65747g(channel);
        channelHeaderView.setTitle(channelNameFormatter.formatChannelName(channel, ChatUI.getCurrentUserProvider().getCurrentUser()));
        channelHeaderView.setAvatar(channel);
        Context context = channelHeaderView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        channelHeaderView.setOnlineStateSubtitle(ChannelKt.getMembersStatusText$default(channel, context, null, 2, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$1(ChannelHeaderView channelHeaderView, ConnectionState connectionState) {
        if (connectionState instanceof ConnectionState.Connected) {
            channelHeaderView.showOnlineStateSubtitle();
        } else if (connectionState instanceof ConnectionState.Connecting) {
            channelHeaderView.showSearchingForNetworkLabel();
        } else {
            if (!(connectionState instanceof ConnectionState.Offline)) {
                throw new NoWhenBranchMatchedException();
            }
            channelHeaderView.showOfflineStateLabel();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$2(ChannelHeaderView channelHeaderView, Message message) {
        if (message != null) {
            channelHeaderView.setThreadMode();
        } else {
            channelHeaderView.setNormalMode();
        }
        return C23454a0.f92919a;
    }
}
