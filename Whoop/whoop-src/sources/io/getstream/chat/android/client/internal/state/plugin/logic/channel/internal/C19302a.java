package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal;

import io.getstream.chat.android.models.ChannelData;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19302a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73888w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChannelData f73889x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ChannelLogicImpl f73890y;

    public /* synthetic */ C19302a(ChannelData channelData, ChannelLogicImpl channelLogicImpl, int i13) {
        this.f73888w = i13;
        this.f73889x = channelData;
        this.f73890y = channelLogicImpl;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73888w) {
            case 0:
                return ChannelLogicImpl.updateDataForChannel$lambda$6(this.f73889x, this.f73890y, (ChannelData) obj);
            default:
                return ChannelLogicImpl.onQueryChannelResult$lambda$0(this.f73889x, this.f73890y, (ChannelData) obj);
        }
    }
}
