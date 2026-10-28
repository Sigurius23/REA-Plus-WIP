package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.client.persistance.repository.ChannelRepository;
import io.getstream.chat.android.client.persistance.repository.UserRepository;
import io.getstream.chat.android.client.plugin.listeners.CreateChannelListener;
import io.getstream.chat.android.client.query.CreateChannelParams;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.client.utils.channel.ChannelUtilsKt;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.MemberData;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "channelRepository", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "userRepository", "<init>", "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V", "Lio/getstream/chat/android/client/query/CreateChannelParams;", "params", "", "Lio/getstream/chat/android/models/Member;", "getMembers", "(Lio/getstream/chat/android/client/query/CreateChannelParams;Lq83/d;)Ljava/lang/Object;", "", "channelType", "channelId", "Lio/getstream/chat/android/models/User;", "currentUser", "Ll83/a0;", "onCreateChannelRequest", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "memberIds", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "onCreateChannelResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onCreateChannelPrecondition", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/List;)Ln23/h;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CreateChannelListenerDatabase implements CreateChannelListener {
    private final ChannelRepository channelRepository;
    private final ClientState clientState;
    private final UserRepository userRepository;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.CreateChannelListenerDatabase$getMembers$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.CreateChannelListenerDatabase", m100430f = "CreateChannelListenerDatabase.kt", m100431l = {91}, m100432m = "getMembers")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191021 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C191021(InterfaceC30057d<? super C191021> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreateChannelListenerDatabase.this.getMembers(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.CreateChannelListenerDatabase$onCreateChannelRequest$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.CreateChannelListenerDatabase", m100430f = "CreateChannelListenerDatabase.kt", m100431l = {70, 79}, m100432m = "onCreateChannelRequest")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191031 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C191031(InterfaceC30057d<? super C191031> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreateChannelListenerDatabase.this.onCreateChannelRequest(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.CreateChannelListenerDatabase$onCreateChannelResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.CreateChannelListenerDatabase", m100430f = "CreateChannelListenerDatabase.kt", m100431l = {124, 126, 129, 130}, m100432m = "onCreateChannelResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191041 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C191041(InterfaceC30057d<? super C191041> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreateChannelListenerDatabase.this.onCreateChannelResult(null, null, null, null, this);
        }
    }

    public CreateChannelListenerDatabase(ClientState clientState, ChannelRepository channelRepository, UserRepository userRepository) {
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(channelRepository, "channelRepository");
        AbstractC22676k.m65750j(userRepository, "userRepository");
        this.clientState = clientState;
        this.channelRepository = channelRepository;
        this.userRepository = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object getMembers(CreateChannelParams createChannelParams, InterfaceC30057d<? super List<Member>> interfaceC30057d) {
        C191021 c191021;
        Map map;
        C25272z c25272z;
        Map<String, Object> extraData;
        Map<String, Object> extraData2;
        if (interfaceC30057d instanceof C191021) {
            c191021 = (C191021) interfaceC30057d;
            int i13 = c191021.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191021.label = i13 - Integer.MIN_VALUE;
            } else {
                c191021 = new C191021(interfaceC30057d);
            }
        } else {
            c191021 = new C191021(interfaceC30057d);
        }
        Object objSelectUsers = c191021.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191021.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectUsers);
            List<MemberData> members = createChannelParams.getMembers();
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(members, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : members) {
                linkedHashMap.put(((MemberData) obj).getUserId(), obj);
            }
            UserRepository userRepository = this.userRepository;
            List<String> listM74093D1 = AbstractC25265s.m74093D1(linkedHashMap.keySet());
            c191021.L$0 = null;
            c191021.L$1 = linkedHashMap;
            c191021.label = 1;
            objSelectUsers = userRepository.selectUsers(listM74093D1, c191021);
            if (objSelectUsers == enumC31071a) {
                return enumC31071a;
            }
            map = linkedHashMap;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c191021.L$1;
            AbstractC34132o.m107864I(objSelectUsers);
        }
        Set setKeySet = map.keySet();
        List list = (List) objSelectUsers;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((User) it.next()).getId());
        }
        Set setM34605z = AbstractC12350b.m34605z(setKeySet, AbstractC25265s.m74103I1(arrayList));
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it3 = list.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            c25272z = C25272z.f99163w;
            if (!zHasNext) {
                break;
            }
            User user = (User) it3.next();
            MemberData memberData = (MemberData) map.get(user.getId());
            arrayList2.add(new Member(user, null, null, null, null, null, false, false, null, null, null, null, null, null, (memberData == null || (extraData2 = memberData.getExtraData()) == null) ? c25272z : extraData2, 16382, null));
        }
        Set<String> set = setM34605z;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(set, 10));
        for (String str : set) {
            User user2 = new User(str, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554430, null);
            MemberData memberData2 = (MemberData) map.get(str);
            arrayList3.add(new Member(user2, null, null, null, null, null, false, false, null, null, null, null, null, null, (memberData2 == null || (extraData = memberData2.getExtraData()) == null) ? c25272z : extraData, 16382, null));
        }
        return AbstractC25265s.m74129g1(arrayList2, arrayList3);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.CreateChannelListener
    public final AbstractC26205h onCreateChannelPrecondition(User currentUser, String channelId, List<String> memberIds) {
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(memberIds, "memberIds");
        if (AbstractC39414r.m125890i0(channelId) && memberIds.isEmpty()) {
            return new C26203f(new C26198a("Either channelId or memberIds cannot be empty!"));
        }
        return currentUser == null ? new C26203f(new C26198a("Current user is null!")) : new C26204g(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013c, code lost:
    
        if (r1.insertChannel(r9, r3) == r4) goto L42;
     */
    @Override // io.getstream.chat.android.client.plugin.listeners.CreateChannelListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onCreateChannelRequest(java.lang.String r49, java.lang.String r50, io.getstream.chat.android.client.query.CreateChannelParams r51, io.getstream.chat.android.models.User r52, q83.InterfaceC30057d<? super l83.C23454a0> r53) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.CreateChannelListenerDatabase.onCreateChannelRequest(java.lang.String, java.lang.String, io.getstream.chat.android.client.query.CreateChannelParams, io.getstream.chat.android.models.User, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0118 A[PHI: r1
      0x0118: PHI (r1v5 io.getstream.chat.android.models.Channel) = 
      (r1v4 io.getstream.chat.android.models.Channel)
      (r1v4 io.getstream.chat.android.models.Channel)
      (r1v17 io.getstream.chat.android.models.Channel)
     binds: [B:23:0x00fe, B:25:0x0114, B:19:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0159  */
    /* JADX WARN: Code duplicated, block: B:39:0x0165  */
    /* JADX WARN: Code duplicated, block: B:41:0x016a  */
    /* JADX WARN: Code duplicated, block: B:45:0x01d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // io.getstream.chat.android.client.plugin.listeners.CreateChannelListener
    public final Object onCreateChannelResult(String str, String str2, List<String> list, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C191041 c191041;
        Channel channelCopy$default;
        ChannelRepository channelRepository;
        Channel channel;
        ChannelRepository channelRepository2;
        SyncStatus syncStatus;
        Channel channelCopy$default2;
        AbstractC26205h abstractC26205h2 = abstractC26205h;
        if (interfaceC30057d instanceof C191041) {
            c191041 = (C191041) interfaceC30057d;
            int i13 = c191041.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191041.label = i13 - Integer.MIN_VALUE;
            } else {
                c191041 = new C191041(interfaceC30057d);
            }
        } else {
            c191041 = new C191041(interfaceC30057d);
        }
        Object objSelectChannels = c191041.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191041.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectChannels);
            String strM53370k = AbstractC18489d0.m53370k(str, ":", ChannelUtilsKt.generateChannelIdIfNeeded(str2, list));
            if (abstractC26205h2 instanceof C26204g) {
                channelCopy$default = Channel.copy$default((Channel) ((C26204g) abstractC26205h2).f103919a, null, null, null, null, 0, false, null, null, null, SyncStatus.COMPLETED, 0, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -513, 7, null);
                if (AbstractC22676k.m65745e(channelCopy$default.getCid(), strM53370k)) {
                    channelRepository = this.channelRepository;
                    c191041.L$0 = null;
                    c191041.L$1 = null;
                    c191041.L$2 = null;
                    c191041.L$3 = null;
                    c191041.L$4 = null;
                    c191041.L$5 = null;
                    c191041.label = 2;
                    if (channelRepository.insertChannel(channelCopy$default, c191041) != enumC31071a) {
                        return c23454a0;
                    }
                } else {
                    ChannelRepository channelRepository3 = this.channelRepository;
                    c191041.L$0 = null;
                    c191041.L$1 = null;
                    c191041.L$2 = null;
                    c191041.L$3 = null;
                    c191041.L$4 = null;
                    c191041.L$5 = channelCopy$default;
                    c191041.label = 1;
                    if (channelRepository3.deleteChannel(strM53370k, c191041) != enumC31071a) {
                        channelRepository = this.channelRepository;
                        c191041.L$0 = null;
                        c191041.L$1 = null;
                        c191041.L$2 = null;
                        c191041.L$3 = null;
                        c191041.L$4 = null;
                        c191041.L$5 = null;
                        c191041.label = 2;
                        if (channelRepository.insertChannel(channelCopy$default, c191041) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                }
            } else {
                if (!(abstractC26205h2 instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChannelRepository channelRepository4 = this.channelRepository;
                List<String> listM118958J = AbstractC37056f.m118958J(strM53370k);
                c191041.L$0 = null;
                c191041.L$1 = null;
                c191041.L$2 = null;
                c191041.L$3 = abstractC26205h2;
                c191041.L$4 = null;
                c191041.label = 3;
                objSelectChannels = channelRepository4.selectChannels(listM118958J, c191041);
                if (objSelectChannels != enumC31071a) {
                    channel = (Channel) AbstractC25265s.m74100H0((List) objSelectChannels);
                    if (channel != null) {
                        channelRepository2 = this.channelRepository;
                        if (ChatErrorKt.isPermanent(((C26203f) abstractC26205h2).f103918a)) {
                            syncStatus = SyncStatus.FAILED_PERMANENTLY;
                        } else {
                            syncStatus = SyncStatus.SYNC_NEEDED;
                        }
                        channelCopy$default2 = Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, syncStatus, 0, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -513, 7, null);
                        c191041.L$0 = null;
                        c191041.L$1 = null;
                        c191041.L$2 = null;
                        c191041.L$3 = null;
                        c191041.L$4 = null;
                        c191041.L$5 = null;
                        c191041.I$0 = 0;
                        c191041.label = 4;
                        if (channelRepository2.insertChannel(channelCopy$default2, c191041) == enumC31071a) {
                        }
                    }
                    return c23454a0;
                }
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        abstractC26205h2 = (AbstractC26205h) c191041.L$3;
                        AbstractC34132o.m107864I(objSelectChannels);
                        channel = (Channel) AbstractC25265s.m74100H0((List) objSelectChannels);
                        if (channel != null) {
                            channelRepository2 = this.channelRepository;
                            if (ChatErrorKt.isPermanent(((C26203f) abstractC26205h2).f103918a)) {
                                syncStatus = SyncStatus.FAILED_PERMANENTLY;
                            } else {
                                syncStatus = SyncStatus.SYNC_NEEDED;
                            }
                            channelCopy$default2 = Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, syncStatus, 0, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -513, 7, null);
                            c191041.L$0 = null;
                            c191041.L$1 = null;
                            c191041.L$2 = null;
                            c191041.L$3 = null;
                            c191041.L$4 = null;
                            c191041.L$5 = null;
                            c191041.I$0 = 0;
                            c191041.label = 4;
                            if (channelRepository2.insertChannel(channelCopy$default2, c191041) == enumC31071a) {
                            }
                        }
                        return c23454a0;
                    }
                    if (i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC34132o.m107864I(objSelectChannels);
                return c23454a0;
            }
            channelCopy$default = (Channel) c191041.L$5;
            AbstractC34132o.m107864I(objSelectChannels);
            channelRepository = this.channelRepository;
            c191041.L$0 = null;
            c191041.L$1 = null;
            c191041.L$2 = null;
            c191041.L$3 = null;
            c191041.L$4 = null;
            c191041.L$5 = null;
            c191041.label = 2;
            if (channelRepository.insertChannel(channelCopy$default, c191041) != enumC31071a) {
                return c23454a0;
            }
        }
        return enumC31071a;
    }
}
