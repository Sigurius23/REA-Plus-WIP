package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy;

import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Message;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19319d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73897w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Message f73898x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f73899y;

    public /* synthetic */ C19319d(Message message, boolean z4, int i13) {
        this.f73897w = i13;
        this.f73898x = message;
        this.f73899y = z4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73897w) {
            case 0:
                return ChannelStateLogic.updateLastMessageAt$lambda$56(this.f73898x, this.f73899y, (ChannelData) obj);
            default:
                return ChannelStateImpl.updateLastMessageAt$lambda$148(this.f73898x, this.f73899y, (ChannelData) obj);
        }
    }
}
