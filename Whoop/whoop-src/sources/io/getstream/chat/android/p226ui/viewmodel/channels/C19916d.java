package io.getstream.chat.android.p226ui.viewmodel.channels;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.channels.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19916d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74849w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f74850x;

    public /* synthetic */ C19916d(boolean z4, int i13) {
        this.f74849w = i13;
        this.f74850x = z4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74849w) {
            case 0:
                return ChannelListViewModel.C199111.AnonymousClass1.invokeSuspend$lambda$3$lambda$2(this.f74850x, (ChannelListViewModel.PaginationState) obj);
            default:
                return ChannelListViewModel.C199111.AnonymousClass1.invokeSuspend$lambda$5$lambda$4(this.f74850x, (ChannelListViewModel.PaginationState) obj);
        }
    }
}
