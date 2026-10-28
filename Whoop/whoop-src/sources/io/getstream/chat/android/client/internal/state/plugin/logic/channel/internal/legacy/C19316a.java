package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy;

import io.getstream.chat.android.client.events.HasChannel;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.models.ChannelData;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19316a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73891w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ HasChannel f73892x;

    public /* synthetic */ C19316a(HasChannel hasChannel, int i13) {
        this.f73891w = i13;
        this.f73892x = hasChannel;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73891w) {
            case 0:
                return ChannelStateLogic.updateChannelData$lambda$9(this.f73892x, (ChannelData) obj);
            default:
                return ChannelStateImpl.updateChannelData$lambda$145(this.f73892x, (ChannelData) obj);
        }
    }
}
