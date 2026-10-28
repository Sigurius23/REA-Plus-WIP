package io.getstream.chat.android.p226ui.viewmodel.search;

import io.getstream.chat.android.p226ui.feature.search.list.SearchResultListView;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class SearchViewModelBinding$bindView$3 implements SearchResultListView.LoadMoreListener, InterfaceC22666f {
    final /* synthetic */ SearchViewModel $tmp0;

    public SearchViewModelBinding$bindView$3(SearchViewModel searchViewModel) {
        this.$tmp0 = searchViewModel;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SearchResultListView.LoadMoreListener) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return new C22672i(0, 0, SearchViewModel.class, this.$tmp0, "loadMore", "loadMore()V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // io.getstream.chat.android.ui.feature.search.list.SearchResultListView.LoadMoreListener
    public final void onLoadMoreRequested() {
        this.$tmp0.loadMore();
    }
}
