package io.getstream.chat.android.client.internal.state.plugin.state.channel.internal;

import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19339f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73912w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ User f73913x;

    public /* synthetic */ C19339f(User user, int i13) {
        this.f73912w = i13;
        this.f73913x = user;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zMessagesTransformation$lambda$15$lambda$13;
        switch (this.f73912w) {
            case 0:
                zMessagesTransformation$lambda$15$lambda$13 = ChannelStateLegacyImpl.messagesTransformation$lambda$15$lambda$13(this.f73913x, (Message) obj);
                break;
            default:
                zMessagesTransformation$lambda$15$lambda$13 = ChannelKt.getPreviewMessage$lambda$2(this.f73913x, (Message) obj);
                break;
        }
        return Boolean.valueOf(zMessagesTransformation$lambda$15$lambda$13);
    }
}
