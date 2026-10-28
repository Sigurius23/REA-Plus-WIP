package io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal;

import io.getstream.chat.android.client.extensions.internal.ChannelKt;
import io.getstream.chat.android.client.internal.state.plugin.QueryChannelsIdentifier;
import io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository;
import io.getstream.chat.android.client.persistance.repository.ChannelRepository;
import io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.query.QueryChannelsSpec;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelConfig;
import java.util.Collection;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0012\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0080@¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0080@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0080@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0 H\u0080@¢\u0006\u0004\b\"\u0010#J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0080@¢\u0006\u0004\b'\u0010(J\u001e\u0010-\u001a\u00020\u000f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\fH\u0080@¢\u0006\u0004\b,\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101¨\u00062"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;", "", "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;", "queryChannelsRepository", "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "channelConfigRepository", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "channelRepository", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repositoryFacade", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V", "", "Lio/getstream/chat/android/models/Channel;", "channels", "Ll83/a0;", "storeStateForChannels$stream_chat_android_client_release", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", "storeStateForChannels", "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "pagination", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "identifier", "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/CachedQueryChannels;", "fetchChannelsFromCache$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;", "fetchChannelsFromCache", "", "cid", "selectChannel$stream_chat_android_client_release", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "selectChannel", "", "cids", "selectChannels$stream_chat_android_client_release", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "selectChannels", "Lio/getstream/chat/android/client/query/QueryChannelsSpec;", "queryChannelsSpec", "insertQueryChannels$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;", "insertQueryChannels", "Lio/getstream/chat/android/models/ChannelConfig;", "configs", "insertChannelConfigs$stream_chat_android_client_release", "insertChannelConfigs", "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsDatabaseLogic {
    private final ChannelConfigRepository channelConfigRepository;
    private final ChannelRepository channelRepository;
    private final QueryChannelsRepository queryChannelsRepository;
    private final RepositoryFacade repositoryFacade;

    public QueryChannelsDatabaseLogic(QueryChannelsRepository queryChannelsRepository, ChannelConfigRepository channelConfigRepository, ChannelRepository channelRepository, RepositoryFacade repositoryFacade) {
        AbstractC22676k.m65750j(queryChannelsRepository, "queryChannelsRepository");
        AbstractC22676k.m65750j(channelConfigRepository, "channelConfigRepository");
        AbstractC22676k.m65750j(channelRepository, "channelRepository");
        AbstractC22676k.m65750j(repositoryFacade, "repositoryFacade");
        this.queryChannelsRepository = queryChannelsRepository;
        this.channelConfigRepository = channelConfigRepository;
        this.channelRepository = channelRepository;
        this.repositoryFacade = repositoryFacade;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchChannelsFromCache$stream_chat_android_client_release(AnyChannelPaginationRequest anyChannelPaginationRequest, QueryChannelsIdentifier queryChannelsIdentifier, InterfaceC30057d<? super CachedQueryChannels> interfaceC30057d) {
        QueryChannelsDatabaseLogic$fetchChannelsFromCache$1 queryChannelsDatabaseLogic$fetchChannelsFromCache$1;
        AnyChannelPaginationRequest anyChannelPaginationRequest2;
        QueryChannelsSpec queryChannelsSpec;
        if (interfaceC30057d instanceof QueryChannelsDatabaseLogic$fetchChannelsFromCache$1) {
            queryChannelsDatabaseLogic$fetchChannelsFromCache$1 = (QueryChannelsDatabaseLogic$fetchChannelsFromCache$1) interfaceC30057d;
            int i13 = queryChannelsDatabaseLogic$fetchChannelsFromCache$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                queryChannelsDatabaseLogic$fetchChannelsFromCache$1.label = i13 - Integer.MIN_VALUE;
            } else {
                queryChannelsDatabaseLogic$fetchChannelsFromCache$1 = new QueryChannelsDatabaseLogic$fetchChannelsFromCache$1(this, interfaceC30057d);
            }
        } else {
            queryChannelsDatabaseLogic$fetchChannelsFromCache$1 = new QueryChannelsDatabaseLogic$fetchChannelsFromCache$1(this, interfaceC30057d);
        }
        Object objSelectBy = queryChannelsDatabaseLogic$fetchChannelsFromCache$1.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = queryChannelsDatabaseLogic$fetchChannelsFromCache$1.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectBy);
            QueryChannelsRepository queryChannelsRepository = this.queryChannelsRepository;
            queryChannelsDatabaseLogic$fetchChannelsFromCache$1.L$0 = anyChannelPaginationRequest;
            queryChannelsDatabaseLogic$fetchChannelsFromCache$1.L$1 = null;
            queryChannelsDatabaseLogic$fetchChannelsFromCache$1.label = 1;
            objSelectBy = queryChannelsRepository.selectBy(queryChannelsIdentifier, queryChannelsDatabaseLogic$fetchChannelsFromCache$1);
            if (objSelectBy != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            anyChannelPaginationRequest = (AnyChannelPaginationRequest) queryChannelsDatabaseLogic$fetchChannelsFromCache$1.L$0;
            AbstractC34132o.m107864I(objSelectBy);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            queryChannelsSpec = (QueryChannelsSpec) queryChannelsDatabaseLogic$fetchChannelsFromCache$1.L$2;
            anyChannelPaginationRequest2 = (AnyChannelPaginationRequest) queryChannelsDatabaseLogic$fetchChannelsFromCache$1.L$0;
            AbstractC34132o.m107864I(objSelectBy);
        }
        return new CachedQueryChannels(queryChannelsSpec, ChannelKt.applyPagination((Collection) objSelectBy, anyChannelPaginationRequest2));
        QueryChannelsSpec queryChannelsSpec2 = (QueryChannelsSpec) objSelectBy;
        if (queryChannelsSpec2 == null) {
            return null;
        }
        RepositoryFacade repositoryFacade = this.repositoryFacade;
        List<String> listM74093D1 = AbstractC25265s.m74093D1(queryChannelsSpec2.getCids());
        queryChannelsDatabaseLogic$fetchChannelsFromCache$1.L$0 = anyChannelPaginationRequest;
        queryChannelsDatabaseLogic$fetchChannelsFromCache$1.L$1 = null;
        queryChannelsDatabaseLogic$fetchChannelsFromCache$1.L$2 = queryChannelsSpec2;
        queryChannelsDatabaseLogic$fetchChannelsFromCache$1.label = 2;
        objSelectBy = repositoryFacade.selectChannels(listM74093D1, anyChannelPaginationRequest, queryChannelsDatabaseLogic$fetchChannelsFromCache$1);
        if (objSelectBy != enumC31071a) {
            anyChannelPaginationRequest2 = anyChannelPaginationRequest;
            queryChannelsSpec = queryChannelsSpec2;
            return new CachedQueryChannels(queryChannelsSpec, ChannelKt.applyPagination((Collection) objSelectBy, anyChannelPaginationRequest2));
        }
        return enumC31071a;
    }

    public final Object insertChannelConfigs$stream_chat_android_client_release(Collection<ChannelConfig> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objInsertChannelConfigs = this.channelConfigRepository.insertChannelConfigs(collection, interfaceC30057d);
        return objInsertChannelConfigs == EnumC31071a.f128113w ? objInsertChannelConfigs : C23454a0.f92919a;
    }

    public final Object insertQueryChannels$stream_chat_android_client_release(QueryChannelsSpec queryChannelsSpec, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objInsertQueryChannels = this.queryChannelsRepository.insertQueryChannels(queryChannelsSpec, interfaceC30057d);
        return objInsertQueryChannels == EnumC31071a.f128113w ? objInsertQueryChannels : C23454a0.f92919a;
    }

    public final Object selectChannel$stream_chat_android_client_release(String str, InterfaceC30057d<? super Channel> interfaceC30057d) {
        return this.channelRepository.selectChannel(str, interfaceC30057d);
    }

    public final Object selectChannels$stream_chat_android_client_release(List<String> list, InterfaceC30057d<? super List<Channel>> interfaceC30057d) {
        return this.channelRepository.selectChannels(list, interfaceC30057d);
    }

    public final Object storeStateForChannels$stream_chat_android_client_release(Collection<Channel> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objStoreStateForChannels = this.repositoryFacade.storeStateForChannels(collection, interfaceC30057d);
        return objStoreStateForChannels == EnumC31071a.f128113w ? objStoreStateForChannels : C23454a0.f92919a;
    }
}
