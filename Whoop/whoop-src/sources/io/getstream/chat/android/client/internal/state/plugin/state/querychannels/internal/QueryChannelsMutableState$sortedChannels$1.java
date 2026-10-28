package io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal;

import c93.InterfaceC4353o;
import io.getstream.chat.android.client.extensions.internal.ChannelKt;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal.QueryChannelsMutableState$sortedChannels$1", m100430f = "QueryChannelsMutableState.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\n"}, m65681d2 = {"<anonymous>", "", "Lio/getstream/chat/android/models/Channel;", "channelMap", "", "", "userMap", "Lio/getstream/chat/android/models/User;", "activeLocations", "Lio/getstream/chat/android/models/Location;", "sort", "Lio/getstream/chat/android/models/querysort/QuerySorter;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsMutableState$sortedChannels$1 extends AbstractC32275i implements InterfaceC4353o {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    public QueryChannelsMutableState$sortedChannels$1(InterfaceC30057d<? super QueryChannelsMutableState$sortedChannels$1> interfaceC30057d) {
        super(5, interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Collection collectionValues;
        Map map = (Map) this.L$0;
        Map map2 = (Map) this.L$1;
        List list = (List) this.L$2;
        QuerySorter querySorter = (QuerySorter) this.L$3;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        if (map == null || (collectionValues = map.values()) == null) {
            return null;
        }
        return AbstractC25265s.m74152u1(ChannelKt.updateLiveLocations(ChannelKt.updateUsers((Collection<Channel>) collectionValues, (Map<String, User>) map2), list), querySorter.getComparator());
    }

    @Override // c93.InterfaceC4353o
    public final Object invoke(Map<String, Channel> map, Map<String, User> map2, List<Location> list, QuerySorter<Channel> querySorter, InterfaceC30057d<? super List<Channel>> interfaceC30057d) {
        QueryChannelsMutableState$sortedChannels$1 queryChannelsMutableState$sortedChannels$1 = new QueryChannelsMutableState$sortedChannels$1(5, interfaceC30057d);
        queryChannelsMutableState$sortedChannels$1.L$0 = map;
        queryChannelsMutableState$sortedChannels$1.L$1 = map2;
        queryChannelsMutableState$sortedChannels$1.L$2 = list;
        queryChannelsMutableState$sortedChannels$1.L$3 = querySorter;
        return queryChannelsMutableState$sortedChannels$1.invokeSuspend(C23454a0.f92919a);
    }
}
