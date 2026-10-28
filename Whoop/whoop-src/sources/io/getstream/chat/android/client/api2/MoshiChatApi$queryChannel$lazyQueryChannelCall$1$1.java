package io.getstream.chat.android.client.api2;

import io.getstream.chat.android.client.api2.model.response.ChannelResponse;
import io.getstream.chat.android.models.Channel;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class MoshiChatApi$queryChannel$lazyQueryChannelCall$1$1 extends C22672i implements Function1 {
    public MoshiChatApi$queryChannel$lazyQueryChannelCall$1$1(Object obj) {
        super(1, 0, MoshiChatApi.class, obj, "flattenChannel", "flattenChannel(Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)Lio/getstream/chat/android/models/Channel;");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Channel invoke(ChannelResponse p13) {
        AbstractC22676k.m65750j(p13, "p0");
        return ((MoshiChatApi) this.receiver).flattenChannel(p13);
    }
}
