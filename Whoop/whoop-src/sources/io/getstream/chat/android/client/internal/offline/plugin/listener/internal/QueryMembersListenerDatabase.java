package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.extensions.internal.PairKt;
import io.getstream.chat.android.client.persistance.repository.ChannelRepository;
import io.getstream.chat.android.client.persistance.repository.UserRepository;
import io.getstream.chat.android.client.plugin.listeners.QueryMembersListener;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25267u;
import n23.AbstractC26205h;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Jh\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "userRepository", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "channelRepository", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;)V", "Ln23/h;", "", "Lio/getstream/chat/android/models/Member;", "result", "", "channelType", "channelId", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", QueryChannelRequest.KEY_MEMBERS, "Ll83/a0;", "onQueryMembersResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryMembersListenerDatabase implements QueryMembersListener {
    private final ChannelRepository channelRepository;
    private final UserRepository userRepository;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.QueryMembersListenerDatabase$onQueryMembersResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.QueryMembersListenerDatabase", m100430f = "QueryMembersListenerDatabase.kt", m100431l = {53, 54}, m100432m = "onQueryMembersResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191191 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C191191(InterfaceC30057d<? super C191191> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QueryMembersListenerDatabase.this.onQueryMembersResult(null, null, null, 0, 0, null, null, null, this);
        }
    }

    public QueryMembersListenerDatabase(UserRepository userRepository, ChannelRepository channelRepository) {
        AbstractC22676k.m65750j(userRepository, "userRepository");
        AbstractC22676k.m65750j(channelRepository, "channelRepository");
        this.userRepository = userRepository;
        this.channelRepository = channelRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.plugin.listeners.QueryMembersListener
    public final Object onQueryMembersResult(AbstractC26205h abstractC26205h, String str, String str2, int i13, int i14, FilterObject filterObject, QuerySorter<Member> querySorter, List<Member> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C191191 c191191;
        List<Member> list2;
        if (interfaceC30057d instanceof C191191) {
            c191191 = (C191191) interfaceC30057d;
            int i15 = c191191.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c191191.label = i15 - Integer.MIN_VALUE;
            } else {
                c191191 = new C191191(interfaceC30057d);
            }
        } else {
            c191191 = new C191191(interfaceC30057d);
        }
        Object obj = c191191.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = c191191.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i16 == 0) {
            AbstractC34132o.m107864I(obj);
            if (abstractC26205h instanceof C26204g) {
                list2 = (List) ((C26204g) abstractC26205h).f103919a;
                UserRepository userRepository = this.userRepository;
                List<Member> list3 = list2;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Member) it.next()).getUser());
                }
                c191191.L$0 = null;
                c191191.L$1 = str;
                c191191.L$2 = str2;
                c191191.L$3 = null;
                c191191.L$4 = null;
                c191191.L$5 = null;
                c191191.L$6 = list2;
                c191191.I$0 = i13;
                c191191.I$1 = i14;
                c191191.label = 1;
                if (userRepository.insertUsers(arrayList, c191191) != enumC31071a) {
                }
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        i14 = c191191.I$1;
        i13 = c191191.I$0;
        list2 = (List) c191191.L$6;
        str2 = (String) c191191.L$2;
        str = (String) c191191.L$1;
        AbstractC34132o.m107864I(obj);
        ChannelRepository channelRepository = this.channelRepository;
        String cid = PairKt.toCid(new C23465k(str, str2));
        c191191.L$0 = null;
        c191191.L$1 = null;
        c191191.L$2 = null;
        c191191.L$3 = null;
        c191191.L$4 = null;
        c191191.L$5 = null;
        c191191.L$6 = null;
        c191191.I$0 = i13;
        c191191.I$1 = i14;
        c191191.label = 2;
        return channelRepository.updateMembersForChannel(cid, list2, c191191) == enumC31071a ? enumC31071a : c23454a0;
    }
}
