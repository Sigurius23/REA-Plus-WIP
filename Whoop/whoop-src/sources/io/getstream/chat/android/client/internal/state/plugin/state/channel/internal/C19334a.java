package io.getstream.chat.android.client.internal.state.plugin.state.channel.internal;

import io.getstream.chat.android.models.Message;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19334a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73902w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChannelStateImpl f73903x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Message f73904y;

    public /* synthetic */ C19334a(ChannelStateImpl channelStateImpl, Message message, int i13) {
        this.f73902w = i13;
        this.f73903x = channelStateImpl;
        this.f73904y = message;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73902w) {
            case 0:
                return ChannelStateImpl.addPinnedMessages$lambda$115$lambda$114(this.f73903x, this.f73904y, (Message) obj);
            case 1:
                return ChannelStateImpl.upsertMessage$lambda$32$lambda$31(this.f73903x, this.f73904y, (Message) obj);
            case 2:
                return ChannelStateImpl.upsertMessage$lambda$34$lambda$33(this.f73903x, this.f73904y, (Message) obj);
            case 3:
                return ChannelStateImpl.updateMessage$lambda$45(this.f73903x, this.f73904y, (Message) obj);
            default:
                return ChannelStateImpl.upsertCachedMessage$lambda$44$lambda$43(this.f73903x, this.f73904y, (Message) obj);
        }
    }
}
