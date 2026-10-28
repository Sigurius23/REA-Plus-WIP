package io.getstream.chat.android.p226ui.common.feature.channel.info;

import io.getstream.chat.android.models.Channel;
import l83.C23454a0;
import n23.AbstractC26202e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19497a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74443w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChannelInfoViewController f74444x;

    public /* synthetic */ C19497a(ChannelInfoViewController channelInfoViewController, int i13) {
        this.f74443w = i13;
        this.f74444x = channelInfoViewController;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74443w) {
            case 0:
                ChannelInfoViewController.removeMember$lambda$37(this.f74444x, (AbstractC26202e) obj);
                break;
            case 1:
                ChannelInfoViewController.leaveChannel$lambda$25(this.f74444x, (AbstractC26202e) obj);
                break;
            default:
                ChannelInfoViewController.leaveChannel$lambda$29$lambda$28(this.f74444x, (Channel) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
