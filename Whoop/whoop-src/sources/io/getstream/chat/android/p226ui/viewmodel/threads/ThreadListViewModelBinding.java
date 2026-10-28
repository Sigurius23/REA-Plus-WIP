package io.getstream.chat.android.p226ui.viewmodel.threads;

import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.p226ui.common.state.threads.ThreadListState;
import io.getstream.chat.android.p226ui.feature.threads.list.ThreadListView;
import l83.C23454a0;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;", ProfileAnalyticsKt.VIEW, "Landroidx/lifecycle/g0;", "lifecycleOwner", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;Landroidx/lifecycle/g0;)V", "bindView", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadListViewModelBinding {
    public static final void bind(ThreadListViewModel threadListViewModel, ThreadListView view, InterfaceC1585g0 lifecycleOwner) {
        AbstractC22676k.m65750j(threadListViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        threadListViewModel.getState().observe(lifecycleOwner, new ThreadListViewModelBinding$sam$androidx_lifecycle_Observer$0(new C17095c(view, 29)));
        view.setUnreadThreadsBannerClickListener(new ThreadListViewModelBinding$bindView$2(threadListViewModel));
        view.setLoadMoreListener(new ThreadListViewModelBinding$bindView$3(threadListViewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$0(ThreadListView threadListView, ThreadListState threadListState) {
        if (threadListState.getThreads().isEmpty() && threadListState.isLoading()) {
            threadListView.showLoading();
        } else {
            threadListView.showThreads(threadListState.getThreads(), threadListState.isLoadingMore());
        }
        threadListView.showUnreadThreadsBanner(threadListState.getUnseenThreadsCount());
        return C23454a0.f92919a;
    }
}
