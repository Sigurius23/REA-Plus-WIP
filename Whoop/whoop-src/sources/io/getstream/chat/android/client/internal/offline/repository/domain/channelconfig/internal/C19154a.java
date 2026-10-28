package io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal;

import java.util.List;
import l83.C23454a0;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19154a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73818w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChannelConfigDao_Impl f73819x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f73820y;

    public /* synthetic */ C19154a(ChannelConfigDao_Impl channelConfigDao_Impl, List list, int i13) {
        this.f73818w = i13;
        this.f73819x = channelConfigDao_Impl;
        this.f73820y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73818w) {
            case 0:
                ChannelConfigDao_Impl.insertConfigs$lambda$1(this.f73819x, this.f73820y, (InterfaceC33687a) obj);
                break;
            default:
                ChannelConfigDao_Impl.insertCommands$lambda$2(this.f73819x, this.f73820y, (InterfaceC33687a) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
