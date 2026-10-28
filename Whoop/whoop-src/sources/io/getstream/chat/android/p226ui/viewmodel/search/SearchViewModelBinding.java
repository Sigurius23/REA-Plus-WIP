package io.getstream.chat.android.p226ui.viewmodel.search;

import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.api.state.EventObserver;
import io.getstream.chat.android.p226ui.feature.search.list.SearchResultListView;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;", ProfileAnalyticsKt.VIEW, "Landroidx/lifecycle/g0;", "lifecycleOwner", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;Landroidx/lifecycle/g0;)V", "bindView", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SearchViewModelBinding {
    public static final void bind(SearchViewModel searchViewModel, final SearchResultListView view, InterfaceC1585g0 lifecycleOwner) {
        AbstractC22676k.m65750j(searchViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        final int i13 = 0;
        searchViewModel.getState().observe(lifecycleOwner, new SearchViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.search.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        SearchViewModelBinding.bindView$lambda$0(view, (SearchViewModel.State) obj);
                        break;
                    default:
                        SearchViewModelBinding.bindView$lambda$1(view, (C23454a0) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        final int i14 = 1;
        searchViewModel.getErrorEvents().observe(lifecycleOwner, new EventObserver(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.search.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        SearchViewModelBinding.bindView$lambda$0(view, (SearchViewModel.State) obj);
                        break;
                    default:
                        SearchViewModelBinding.bindView$lambda$1(view, (C23454a0) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        view.setLoadMoreListener(new SearchViewModelBinding$bindView$3(searchViewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$0(SearchResultListView searchResultListView, SearchViewModel.State state) {
        if (state.isLoading()) {
            searchResultListView.showLoading();
        } else {
            searchResultListView.showMessages(state.getQuery(), state.getResults());
            searchResultListView.setPaginationEnabled((state.isLoadingMore() || state.getResults().isEmpty()) ? false : true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$1(SearchResultListView searchResultListView, C23454a0 it) {
        AbstractC22676k.m65750j(it, "it");
        searchResultListView.showError();
        return C23454a0.f92919a;
    }
}
