package io.getstream.chat.android.p226ui.viewmodel.channels;

import io.getstream.chat.android.client.api.state.ChannelsStateData;
import io.getstream.chat.android.models.FilterObject;
import java.util.List;
import l83.C23454a0;
import n23.AbstractC26202e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.channels.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19915c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74847w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChannelListViewModel f74848x;

    public /* synthetic */ C19915c(ChannelListViewModel channelListViewModel, int i13) {
        this.f74847w = i13;
        this.f74848x = channelListViewModel;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74847w) {
            case 0:
                ChannelListViewModel.C199111.AnonymousClass1.invokeSuspend$lambda$0(this.f74848x, (ChannelsStateData) obj);
                break;
            case 1:
                ChannelListViewModel.C199111.AnonymousClass1.invokeSuspend$lambda$1(this.f74848x, (List) obj);
                break;
            case 2:
                ChannelListViewModel.C199111.AnonymousClass1.invokeSuspend$lambda$3(this.f74848x, ((Boolean) obj).booleanValue());
                break;
            case 3:
                ChannelListViewModel.C199111.AnonymousClass1.invokeSuspend$lambda$5(this.f74848x, ((Boolean) obj).booleanValue());
                break;
            case 4:
                ChannelListViewModel.C199121.invokeSuspend$lambda$1(this.f74848x, (AbstractC26202e) obj);
                break;
            case 5:
                ChannelListViewModel._init_$lambda$3(this.f74848x, (FilterObject) obj);
                break;
            default:
                ChannelListViewModel.markAllRead$lambda$13(this.f74848x, (AbstractC26202e) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
