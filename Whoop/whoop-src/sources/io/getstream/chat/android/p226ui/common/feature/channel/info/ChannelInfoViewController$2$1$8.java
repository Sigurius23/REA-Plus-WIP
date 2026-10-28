package io.getstream.chat.android.p226ui.common.feature.channel.info;

import c93.InterfaceC4352n;
import io.getstream.chat.android.models.Mute;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$2$1$8", m100430f = "ChannelInfoViewController.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;", "data3", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;", "mutedUsers", "", "Lio/getstream/chat/android/models/Mute;", "blockedUserIds", ""}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelInfoViewController$2$1$8 extends AbstractC32275i implements InterfaceC4352n {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    public ChannelInfoViewController$2$1$8(InterfaceC30057d<? super ChannelInfoViewController$2$1$8> interfaceC30057d) {
        super(4, interfaceC30057d);
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(ChannelBaseData channelBaseData, List<Mute> list, List<String> list2, InterfaceC30057d<? super ChannelInfoData> interfaceC30057d) {
        ChannelInfoViewController$2$1$8 channelInfoViewController$2$1$8 = new ChannelInfoViewController$2$1$8(4, interfaceC30057d);
        channelInfoViewController$2$1$8.L$0 = channelBaseData;
        channelInfoViewController$2$1$8.L$1 = list;
        channelInfoViewController$2$1$8.L$2 = list2;
        return channelInfoViewController$2$1$8.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        ChannelBaseData channelBaseData = (ChannelBaseData) this.L$0;
        List list = (List) this.L$1;
        List list2 = (List) this.L$2;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        return new ChannelInfoData(channelBaseData.getChannelData(), channelBaseData.getMembers(), channelBaseData.isMuted(), list, list2);
    }
}
