package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.plugin.listeners.QueryMembersListener;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.List;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jh\u0010\u0016\u001a\u00020\u00152\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryMembersListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V", "Ln23/h;", "", "Lio/getstream/chat/android/models/Member;", "result", "", "channelType", "channelId", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", QueryChannelRequest.KEY_MEMBERS, "Ll83/a0;", "onQueryMembersResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryMembersListenerState implements QueryMembersListener {
    private final LogicRegistry logic;

    public QueryMembersListenerState(LogicRegistry logic) {
        AbstractC22676k.m65750j(logic, "logic");
        this.logic = logic;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryMembersListener
    public final Object onQueryMembersResult(AbstractC26205h abstractC26205h, String str, String str2, int i13, int i14, FilterObject filterObject, QuerySorter<Member> querySorter, List<Member> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (abstractC26205h instanceof C26204g) {
            this.logic.channel(str, str2).upsertMembers((List) ((C26204g) abstractC26205h).f103919a);
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }
}
