package io.getstream.chat.android.p226ui.common.feature.channel.info;

import c93.InterfaceC4354p;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Mute;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22656a;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class ChannelInfoMemberViewController$state$1$1$5 extends C22656a implements InterfaceC4354p {
    public static final ChannelInfoMemberViewController$state$1$1$5 INSTANCE = new ChannelInfoMemberViewController$state$1$1$5();

    public ChannelInfoMemberViewController$state$1$1$5() {
        super(6, ChannelInfoMemberData.class, "<init>", "<init>(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;)V", 4);
    }

    public final Object invoke(ChannelData channelData, Member member, Channel channel, List<Mute> list, List<String> list2, InterfaceC30057d<? super ChannelInfoMemberData> interfaceC30057d) {
        return new ChannelInfoMemberData(channelData, member, channel, list, list2);
    }

    @Override // c93.InterfaceC4354p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return new ChannelInfoMemberData((ChannelData) obj, (Member) obj2, (Channel) obj3, (List) obj4, (List) obj5);
    }
}
