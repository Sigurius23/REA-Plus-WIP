package io.getstream.chat.android.p226ui.viewmodel.pinned;

import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hn.C17508p;
import io.getstream.chat.android.client.api.state.EventObserver;
import io.getstream.chat.android.p226ui.common.model.MessageResult;
import io.getstream.chat.android.p226ui.common.state.pinned.PinnedMessageListState;
import io.getstream.chat.android.p226ui.feature.pinned.list.PinnedMessageListView;
import l83.C23454a0;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;", "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;", ProfileAnalyticsKt.VIEW, "Landroidx/lifecycle/g0;", "lifecycleOwner", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;Landroidx/lifecycle/g0;)V", "bindView", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PinnedMessageListViewModelBinding {
    public static final void bind(PinnedMessageListViewModel pinnedMessageListViewModel, final PinnedMessageListView view, InterfaceC1585g0 lifecycleOwner) {
        AbstractC22676k.m65750j(pinnedMessageListViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        final int i13 = 0;
        pinnedMessageListViewModel.getState().observe(lifecycleOwner, new C19955xee64fe12(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.pinned.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        PinnedMessageListViewModelBinding.bindView$lambda$0(view, (PinnedMessageListState) obj);
                        break;
                    default:
                        PinnedMessageListViewModelBinding.bindView$lambda$1(view, (C23454a0) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        final int i14 = 1;
        pinnedMessageListViewModel.getErrorEvents().observe(lifecycleOwner, new EventObserver(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.pinned.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        PinnedMessageListViewModelBinding.bindView$lambda$0(view, (PinnedMessageListState) obj);
                        break;
                    default:
                        PinnedMessageListViewModelBinding.bindView$lambda$1(view, (C23454a0) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        view.setLoadMoreListener(new C17508p(pinnedMessageListViewModel, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$0(PinnedMessageListView pinnedMessageListView, PinnedMessageListState pinnedMessageListState) {
        if (!pinnedMessageListState.getResults().isEmpty() && AbstractC22676k.m65745e(((MessageResult) AbstractC25265s.m74112P0(pinnedMessageListState.getResults())).getMessage().getId(), "")) {
            pinnedMessageListView.showLoading();
            pinnedMessageListView.showMessages(pinnedMessageListState.getResults());
        } else if (pinnedMessageListState.isLoading()) {
            pinnedMessageListView.showLoading();
        } else {
            pinnedMessageListView.showMessages(pinnedMessageListState.getResults());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$1(PinnedMessageListView pinnedMessageListView, C23454a0 it) {
        AbstractC22676k.m65750j(it, "it");
        pinnedMessageListView.showError();
        return C23454a0.f92919a;
    }
}
