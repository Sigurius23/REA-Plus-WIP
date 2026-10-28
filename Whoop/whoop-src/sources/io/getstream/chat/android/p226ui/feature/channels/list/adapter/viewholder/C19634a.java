package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder;

import android.graphics.drawable.Drawable;
import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19634a implements ChannelListView.ChannelOptionIconProvider {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74481w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f74482x;

    public /* synthetic */ C19634a(InterfaceC4339a interfaceC4339a, int i13) {
        this.f74481w = i13;
        this.f74482x = interfaceC4339a;
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelOptionIconProvider
    public final Drawable invoke(Channel channel) {
        switch (this.f74481w) {
            case 0:
                return ChannelListIconProviderContainerImpl.getDeleteOptionIcon_delegate$lambda$3$lambda$2(this.f74482x, channel);
            default:
                return ChannelListIconProviderContainerImpl.getMoreOptionsIcon_delegate$lambda$1$lambda$0(this.f74482x, channel);
        }
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelOptionIconProvider, p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Channel channel = (Channel) obj;
        switch (this.f74481w) {
            case 0:
                return ChannelListIconProviderContainerImpl.getDeleteOptionIcon_delegate$lambda$3$lambda$2(this.f74482x, channel);
            default:
                return ChannelListIconProviderContainerImpl.getMoreOptionsIcon_delegate$lambda$1$lambda$0(this.f74482x, channel);
        }
    }
}
