package io.getstream.chat.android.client.internal.state.plugin.state.channel.internal;

import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class ChannelStateLegacyImpl$messagesTransformation$2$3 extends C22672i implements Function1 {
    public ChannelStateLegacyImpl$messagesTransformation$2$3(Object obj) {
        super(1, 0, ChannelStateLegacyImpl.class, obj, "isMessageVisible", "isMessageVisible(Lio/getstream/chat/android/models/Message;)Z");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Boolean invoke(Message p13) {
        AbstractC22676k.m65750j(p13, "p0");
        return Boolean.valueOf(((ChannelStateLegacyImpl) this.receiver).isMessageVisible(p13));
    }
}
