package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy;

import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Member;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19318c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73895w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Member f73896x;

    public /* synthetic */ C19318c(Member member, int i13) {
        this.f73895w = i13;
        this.f73896x = member;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73895w) {
            case 0:
                return ChannelStateLogic.addMembership$lambda$6(this.f73896x, (ChannelData) obj);
            default:
                return ChannelStateImpl.setMembership$lambda$128(this.f73896x, (ChannelData) obj);
        }
    }
}
