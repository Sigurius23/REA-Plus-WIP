package io.getstream.chat.android.p226ui.viewmodel.channels;

import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.models.ConnectionState;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.feature.channels.header.ChannelListHeaderView;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;", "Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;", ProfileAnalyticsKt.VIEW, "Landroidx/lifecycle/g0;", "lifecycleOwner", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;Landroidx/lifecycle/g0;)V", "bindView", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListHeaderViewModelBinding {
    public static final void bind(ChannelListHeaderViewModel channelListHeaderViewModel, final ChannelListHeaderView view, InterfaceC1585g0 lifecycleOwner) {
        AbstractC22676k.m65750j(channelListHeaderViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        final int i13 = 0;
        channelListHeaderViewModel.getCurrentUser().observe(lifecycleOwner, new C19908xe14e9fb3(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.channels.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        ChannelListHeaderViewModelBinding.bindView$lambda$2$lambda$0(view, (User) obj);
                        break;
                    default:
                        ChannelListHeaderViewModelBinding.bindView$lambda$2$lambda$1(view, (ConnectionState) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        final int i14 = 1;
        channelListHeaderViewModel.getConnectionState().observe(lifecycleOwner, new C19908xe14e9fb3(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.channels.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        ChannelListHeaderViewModelBinding.bindView$lambda$2$lambda$0(view, (User) obj);
                        break;
                    default:
                        ChannelListHeaderViewModelBinding.bindView$lambda$2$lambda$1(view, (ConnectionState) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$2$lambda$0(ChannelListHeaderView channelListHeaderView, User user) {
        if (user != null) {
            channelListHeaderView.setUser(user);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$2$lambda$1(ChannelListHeaderView channelListHeaderView, ConnectionState connectionState) {
        if (connectionState instanceof ConnectionState.Connected) {
            channelListHeaderView.showOnlineTitle();
        } else if (connectionState instanceof ConnectionState.Connecting) {
            channelListHeaderView.showConnectingTitle();
        } else {
            if (!(connectionState instanceof ConnectionState.Offline)) {
                throw new NoWhenBranchMatchedException();
            }
            channelListHeaderView.showOfflineTitle();
        }
        return C23454a0.f92919a;
    }
}
