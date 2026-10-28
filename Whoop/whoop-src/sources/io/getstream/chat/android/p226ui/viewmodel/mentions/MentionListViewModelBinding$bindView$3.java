package io.getstream.chat.android.p226ui.viewmodel.mentions;

import io.getstream.chat.android.p226ui.feature.mentions.list.MentionListView;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class MentionListViewModelBinding$bindView$3 implements MentionListView.LoadMoreListener, InterfaceC22666f {
    final /* synthetic */ MentionListViewModel $tmp0;

    public MentionListViewModelBinding$bindView$3(MentionListViewModel mentionListViewModel) {
        this.$tmp0 = mentionListViewModel;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof MentionListView.LoadMoreListener) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return new C22672i(0, 0, MentionListViewModel.class, this.$tmp0, "loadMore", "loadMore()V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // io.getstream.chat.android.ui.feature.mentions.list.MentionListView.LoadMoreListener
    public final void onLoadMoreRequested() {
        this.$tmp0.loadMore();
    }
}
