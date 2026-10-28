package io.getstream.chat.android.p226ui.feature.channels.actions.internal;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Member;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.channels.actions.internal.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19626a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74475w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChannelActionsDialogFragment f74476x;

    public /* synthetic */ C19626a(ChannelActionsDialogFragment channelActionsDialogFragment, int i13) {
        this.f74475w = i13;
        this.f74476x = channelActionsDialogFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74475w) {
            case 0:
                ChannelActionsDialogFragment.membersAdapter$lambda$1(this.f74476x, (Member) obj);
                break;
            default:
                ChannelActionsDialogFragment.setupDialog$lambda$3(this.f74476x, (Channel) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
