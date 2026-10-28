package io.getstream.chat.android.p226ui.viewmodel.mentions;

import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.api.state.EventObserver;
import io.getstream.chat.android.p226ui.common.state.mentions.MentionListState;
import io.getstream.chat.android.p226ui.feature.mentions.list.MentionListView;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView;", ProfileAnalyticsKt.VIEW, "Landroidx/lifecycle/g0;", "lifecycleOwner", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;Lio/getstream/chat/android/ui/feature/mentions/list/MentionListView;Landroidx/lifecycle/g0;)V", "bindView", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MentionListViewModelBinding {
    public static final void bind(MentionListViewModel mentionListViewModel, final MentionListView view, InterfaceC1585g0 lifecycleOwner) {
        AbstractC22676k.m65750j(mentionListViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        final int i13 = 0;
        mentionListViewModel.getState().observe(lifecycleOwner, new MentionListViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.mentions.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        MentionListViewModelBinding.bindView$lambda$0(view, (MentionListState) obj);
                        break;
                    default:
                        MentionListViewModelBinding.bindView$lambda$1(view, (C23454a0) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        final int i14 = 1;
        mentionListViewModel.getErrorEvents().observe(lifecycleOwner, new EventObserver(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.mentions.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        MentionListViewModelBinding.bindView$lambda$0(view, (MentionListState) obj);
                        break;
                    default:
                        MentionListViewModelBinding.bindView$lambda$1(view, (C23454a0) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        view.setLoadMoreListener(new MentionListViewModelBinding$bindView$3(mentionListViewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$0(MentionListView mentionListView, MentionListState mentionListState) {
        if (mentionListState.isLoading()) {
            mentionListView.showLoading();
        } else {
            mentionListView.showMessages(mentionListState.getResults(), mentionListState.isLoadingMore());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$1(MentionListView mentionListView, C23454a0 it) {
        AbstractC22676k.m65750j(it, "it");
        mentionListView.showError();
        return C23454a0.f92919a;
    }
}
