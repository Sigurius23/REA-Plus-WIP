package io.getstream.chat.android.p226ui.common.feature.channel.info;

import c93.InterfaceC4352n;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Member;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22656a;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class ChannelInfoViewController$2$1$7 extends C22656a implements InterfaceC4352n {
    public static final ChannelInfoViewController$2$1$7 INSTANCE = new ChannelInfoViewController$2$1$7();

    public ChannelInfoViewController$2$1$7() {
        super(4, ChannelBaseData.class, "<init>", "<init>(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;Z)V", 4);
    }

    public final Object invoke(ChannelData channelData, List<Member> list, boolean z4, InterfaceC30057d<? super ChannelBaseData> interfaceC30057d) {
        return new ChannelBaseData(channelData, list, z4);
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return new ChannelBaseData((ChannelData) obj, (List) obj2, ((Boolean) obj3).booleanValue());
    }
}
