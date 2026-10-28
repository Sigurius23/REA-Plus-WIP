package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy;

import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.PushPreference;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19317b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73893w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PushPreference f73894x;

    public /* synthetic */ C19317b(PushPreference pushPreference, int i13) {
        this.f73893w = i13;
        this.f73894x = pushPreference;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73893w) {
            case 0:
                return ChannelStateLogic.setPushPreference$lambda$33(this.f73894x, (ChannelData) obj);
            default:
                return ChannelStateImpl.setPushPreference$lambda$146(this.f73894x, (ChannelData) obj);
        }
    }
}
