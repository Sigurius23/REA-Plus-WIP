package io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal;

import io.getstream.chat.android.models.SyncStatus;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19144a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73813w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChannelDao_Impl f73814x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ SyncStatus f73815y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f73816z;

    public /* synthetic */ C19144a(ChannelDao_Impl channelDao_Impl, SyncStatus syncStatus, int i13, int i14) {
        this.f73813w = i14;
        this.f73814x = channelDao_Impl;
        this.f73815y = syncStatus;
        this.f73816z = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73813w) {
            case 0:
                return ChannelDao_Impl.m54677c(this.f73814x, this.f73815y, this.f73816z, (InterfaceC33687a) obj);
            default:
                return ChannelDao_Impl.m54675a(this.f73814x, this.f73815y, this.f73816z, (InterfaceC33687a) obj);
        }
    }
}
