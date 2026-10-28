package io.getstream.chat.android.p226ui.viewmodel.channels;

import io.getstream.chat.android.models.Channel;
import l83.C23454a0;
import n23.AbstractC26202e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.channels.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19914b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74844w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChannelListViewModel f74845x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Channel f74846y;

    public /* synthetic */ C19914b(ChannelListViewModel channelListViewModel, Channel channel, int i13) {
        this.f74844w = i13;
        this.f74845x = channelListViewModel;
        this.f74846y = channel;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74844w) {
            case 0:
                ChannelListViewModel.deleteChannel$lambda$11(this.f74845x, this.f74846y, (AbstractC26202e) obj);
                break;
            default:
                ChannelListViewModel.leaveChannel$lambda$9$lambda$8(this.f74845x, this.f74846y, (AbstractC26202e) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
