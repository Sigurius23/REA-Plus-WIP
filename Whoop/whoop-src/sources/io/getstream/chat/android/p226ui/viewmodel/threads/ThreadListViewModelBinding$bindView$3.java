package io.getstream.chat.android.p226ui.viewmodel.threads;

import io.getstream.chat.android.p226ui.feature.threads.list.ThreadListView;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class ThreadListViewModelBinding$bindView$3 implements ThreadListView.LoadMoreListener, InterfaceC22666f {
    final /* synthetic */ ThreadListViewModel $tmp0;

    public ThreadListViewModelBinding$bindView$3(ThreadListViewModel threadListViewModel) {
        this.$tmp0 = threadListViewModel;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ThreadListView.LoadMoreListener) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return new C22672i(0, 0, ThreadListViewModel.class, this.$tmp0, "loadNextPage", "loadNextPage()V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // io.getstream.chat.android.ui.feature.threads.list.ThreadListView.LoadMoreListener
    public final void onLoadMore() {
        this.$tmp0.loadNextPage();
    }
}
