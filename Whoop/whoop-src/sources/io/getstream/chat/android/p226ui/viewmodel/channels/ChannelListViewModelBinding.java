package io.getstream.chat.android.p226ui.viewmodel.channels;

import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1627t0;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.api.state.EventObserver;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.TypingEvent;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.channels.list.C19643b;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListItem;
import io.getstream.chat.android.p226ui.utils.DialogInterfaceOnClickListenerC19904c;
import io.getstream.chat.android.p226ui.viewmodel.channels.internal.ChannelListBindingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;", ProfileAnalyticsKt.VIEW, "Landroidx/lifecycle/g0;", "lifecycleOwner", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Landroidx/lifecycle/g0;)V", "bindView", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListViewModelBinding {
    public static final void bind(final ChannelListViewModel channelListViewModel, final ChannelListView view, InterfaceC1585g0 lifecycleOwner) {
        AbstractC22676k.m65750j(channelListViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        final C1627t0 c1627t0 = new C1627t0(new ChannelListBindingData(null, null, null, null, 15, null));
        final int i13 = 0;
        c1627t0.m5035b(channelListViewModel.getState(), new ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.channels.g
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        ChannelListViewModelBinding.bindView$lambda$0(c1627t0, (ChannelListViewModel.State) obj);
                        break;
                    case 1:
                        ChannelListViewModelBinding.bindView$lambda$1(c1627t0, (ChannelListViewModel.PaginationState) obj);
                        break;
                    case 2:
                        ChannelListViewModelBinding.bindView$lambda$2(c1627t0, (Map) obj);
                        break;
                    default:
                        ChannelListViewModelBinding.bindView$lambda$3(c1627t0, (Map) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        final int i14 = 1;
        c1627t0.m5035b(channelListViewModel.getPaginationState(), new ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.channels.g
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        ChannelListViewModelBinding.bindView$lambda$0(c1627t0, (ChannelListViewModel.State) obj);
                        break;
                    case 1:
                        ChannelListViewModelBinding.bindView$lambda$1(c1627t0, (ChannelListViewModel.PaginationState) obj);
                        break;
                    case 2:
                        ChannelListViewModelBinding.bindView$lambda$2(c1627t0, (Map) obj);
                        break;
                    default:
                        ChannelListViewModelBinding.bindView$lambda$3(c1627t0, (Map) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        final int i15 = 2;
        c1627t0.m5035b(channelListViewModel.getTypingEvents(), new ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.channels.g
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        ChannelListViewModelBinding.bindView$lambda$0(c1627t0, (ChannelListViewModel.State) obj);
                        break;
                    case 1:
                        ChannelListViewModelBinding.bindView$lambda$1(c1627t0, (ChannelListViewModel.PaginationState) obj);
                        break;
                    case 2:
                        ChannelListViewModelBinding.bindView$lambda$2(c1627t0, (Map) obj);
                        break;
                    default:
                        ChannelListViewModelBinding.bindView$lambda$3(c1627t0, (Map) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        final int i16 = 3;
        c1627t0.m5035b(channelListViewModel.getDraftMessages(), new ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.channels.g
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        ChannelListViewModelBinding.bindView$lambda$0(c1627t0, (ChannelListViewModel.State) obj);
                        break;
                    case 1:
                        ChannelListViewModelBinding.bindView$lambda$1(c1627t0, (ChannelListViewModel.PaginationState) obj);
                        break;
                    case 2:
                        ChannelListViewModelBinding.bindView$lambda$2(c1627t0, (Map) obj);
                        break;
                    default:
                        ChannelListViewModelBinding.bindView$lambda$3(c1627t0, (Map) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        final int i17 = 1;
        AbstractC1640x1.m5042a(c1627t0).observe(lifecycleOwner, new ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.channels.f
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        ChannelListViewModelBinding.bindView$lambda$13(view, (ChannelListViewModel.ErrorEvent) obj);
                        break;
                    default:
                        ChannelListViewModelBinding.bindView$lambda$7(view, (ChannelListBindingData) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        view.setOnEndReachedListener(new ChannelListView.EndReachedListener() { // from class: io.getstream.chat.android.ui.viewmodel.channels.h
            @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.EndReachedListener
            public final void onEndReached() {
                channelListViewModel.onAction(ChannelListViewModel.Action.ReachedEndOfList.INSTANCE);
            }
        });
        view.setChannelDeleteClickListener(new C19643b(view, channelListViewModel));
        view.setChannelLeaveClickListener(new ChannelListView.ChannelClickListener() { // from class: io.getstream.chat.android.ui.viewmodel.channels.i
            @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelClickListener
            public final void onClick(Channel channel) {
                ChannelListViewModelBinding.bindView$lambda$12(channelListViewModel, channel);
            }
        });
        final int i18 = 0;
        channelListViewModel.getErrorEvents().observe(lifecycleOwner, new EventObserver(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.channels.f
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i18) {
                    case 0:
                        ChannelListViewModelBinding.bindView$lambda$13(view, (ChannelListViewModel.ErrorEvent) obj);
                        break;
                    default:
                        ChannelListViewModelBinding.bindView$lambda$7(view, (ChannelListBindingData) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$0(C1627t0 c1627t0, ChannelListViewModel.State state) {
        ChannelListBindingData channelListBindingDataCopy$default;
        ChannelListBindingData channelListBindingData = (ChannelListBindingData) c1627t0.getValue();
        if (channelListBindingData != null) {
            AbstractC22676k.m65747g(state);
            channelListBindingDataCopy$default = ChannelListBindingData.copy$default(channelListBindingData, state, null, null, null, 14, null);
        } else {
            channelListBindingDataCopy$default = null;
        }
        c1627t0.setValue(channelListBindingDataCopy$default);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$1(C1627t0 c1627t0, ChannelListViewModel.PaginationState paginationState) {
        ChannelListBindingData channelListBindingDataCopy$default;
        ChannelListBindingData channelListBindingData = (ChannelListBindingData) c1627t0.getValue();
        if (channelListBindingData != null) {
            AbstractC22676k.m65747g(paginationState);
            channelListBindingDataCopy$default = ChannelListBindingData.copy$default(channelListBindingData, null, paginationState, null, null, 13, null);
        } else {
            channelListBindingDataCopy$default = null;
        }
        c1627t0.setValue(channelListBindingDataCopy$default);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$11(ChannelListView channelListView, ChannelListViewModel channelListViewModel, Channel it) {
        AbstractC22676k.m65750j(it, "it");
        new AlertDialog.Builder(channelListView.getContext()).setTitle(C19469R.string.stream_ui_channel_list_delete_confirmation_title).setMessage(C19469R.string.stream_ui_channel_list_delete_confirmation_message).setPositiveButton(C19469R.string.stream_ui_channel_list_delete_confirmation_positive_button, new DialogInterfaceOnClickListenerC19917e(0, channelListViewModel, it)).setNegativeButton(C19469R.string.stream_ui_channel_list_delete_confirmation_negative_button, new DialogInterfaceOnClickListenerC19904c(1)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$11$lambda$9(ChannelListViewModel channelListViewModel, Channel channel, DialogInterface dialogInterface, int i13) {
        dialogInterface.dismiss();
        channelListViewModel.deleteChannel(channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$12(ChannelListViewModel channelListViewModel, Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        channelListViewModel.leaveChannel(channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$13(ChannelListView channelListView, ChannelListViewModel.ErrorEvent it) {
        AbstractC22676k.m65750j(it, "it");
        channelListView.showError(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$2(C1627t0 c1627t0, Map map) {
        ChannelListBindingData channelListBindingDataCopy$default;
        ChannelListBindingData channelListBindingData = (ChannelListBindingData) c1627t0.getValue();
        if (channelListBindingData != null) {
            AbstractC22676k.m65747g(map);
            channelListBindingDataCopy$default = ChannelListBindingData.copy$default(channelListBindingData, null, null, map, null, 11, null);
        } else {
            channelListBindingDataCopy$default = null;
        }
        c1627t0.setValue(channelListBindingDataCopy$default);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$3(C1627t0 c1627t0, Map map) {
        ChannelListBindingData channelListBindingDataCopy$default;
        ChannelListBindingData channelListBindingData = (ChannelListBindingData) c1627t0.getValue();
        if (channelListBindingData != null) {
            AbstractC22676k.m65747g(map);
            channelListBindingDataCopy$default = ChannelListBindingData.copy$default(channelListBindingData, null, null, null, map, 7, null);
        } else {
            channelListBindingDataCopy$default = null;
        }
        c1627t0.setValue(channelListBindingDataCopy$default);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$7(ChannelListView channelListView, ChannelListBindingData channelListBindingData) {
        List<? extends ChannelListItem> list;
        List<? extends ChannelListItem> users;
        channelListView.setPaginationEnabled((channelListBindingData.getPaginationState().getEndOfChannels() || channelListBindingData.getPaginationState().getLoadingMore()) ? false : true);
        List<Channel> channels = channelListBindingData.getState().getChannels();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(channels, 10));
        Iterator<T> it = channels.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            list = C25271y.f99162w;
            if (!zHasNext) {
                break;
            }
            Channel channel = (Channel) it.next();
            TypingEvent typingEvent = channelListBindingData.getTypingEvents().get(channel.getCid());
            if (typingEvent != null && (users = typingEvent.getUsers()) != null) {
                list = users;
            }
            arrayList.add(new ChannelListItem.ChannelItem(channel, list, channelListBindingData.getDraftMessages().get(channel.getCid())));
        }
        ChannelListItem.LoadingMoreItem loadingMoreItem = ChannelListItem.LoadingMoreItem.INSTANCE;
        if (!channelListBindingData.getPaginationState().getLoadingMore()) {
            loadingMoreItem = null;
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList, AbstractC37056f.m118960L(loadingMoreItem));
        if (channelListBindingData.getState().isLoading() && arrayListM74129g1.isEmpty()) {
            channelListView.showLoadingView();
        } else if (arrayListM74129g1.isEmpty()) {
            channelListView.hideLoadingView();
            channelListView.setChannels(list);
        } else {
            channelListView.hideLoadingView();
            channelListView.setChannels(arrayListM74129g1);
        }
        return C23454a0.f92919a;
    }
}
