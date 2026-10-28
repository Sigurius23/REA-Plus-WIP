package io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal;

import io.getstream.chat.android.client.api.state.ChannelsStateData;
import io.getstream.chat.android.models.Channel;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal.QueryChannelsMutableState$channelsStateData$1", m100430f = "QueryChannelsMutableState.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/client/api/state/ChannelsStateData;", "loading", "", "channels", "", "Lio/getstream/chat/android/models/Channel;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsMutableState$channelsStateData$1 extends AbstractC32275i implements Function3 {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public QueryChannelsMutableState$channelsStateData$1(InterfaceC30057d<? super QueryChannelsMutableState$channelsStateData$1> interfaceC30057d) {
        super(3, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), (List<Channel>) obj2, (InterfaceC30057d<? super ChannelsStateData>) obj3);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        boolean z4 = this.Z$0;
        List list = (List) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        if (z4 || list == null) {
            return ChannelsStateData.Loading.INSTANCE;
        }
        return list.isEmpty() ? ChannelsStateData.OfflineNoResults.INSTANCE : new ChannelsStateData.Result(list);
    }

    public final Object invoke(boolean z4, List<Channel> list, InterfaceC30057d<? super ChannelsStateData> interfaceC30057d) {
        QueryChannelsMutableState$channelsStateData$1 queryChannelsMutableState$channelsStateData$1 = new QueryChannelsMutableState$channelsStateData$1(3, interfaceC30057d);
        queryChannelsMutableState$channelsStateData$1.Z$0 = z4;
        queryChannelsMutableState$channelsStateData$1.L$0 = list;
        return queryChannelsMutableState$channelsStateData$1.invokeSuspend(C23454a0.f92919a);
    }
}
