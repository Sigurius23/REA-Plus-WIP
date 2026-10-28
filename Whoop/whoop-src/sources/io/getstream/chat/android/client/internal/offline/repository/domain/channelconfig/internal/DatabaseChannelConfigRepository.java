package io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal;

import io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository;
import io.getstream.chat.android.models.ChannelConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0015\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/DatabaseChannelConfigRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;", "channelConfigDao", "<init>", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;)V", "Ll83/a0;", "cacheChannelConfigs", "(Lq83/d;)Ljava/lang/Object;", "", "channelType", "Lio/getstream/chat/android/models/ChannelConfig;", "selectChannelConfig", "(Ljava/lang/String;)Lio/getstream/chat/android/models/ChannelConfig;", "", "configs", "insertChannelConfigs", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", "config", "insertChannelConfig", "(Lio/getstream/chat/android/models/ChannelConfig;Lq83/d;)Ljava/lang/Object;", "clear", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;", "", "channelConfigs", "Ljava/util/Map;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DatabaseChannelConfigRepository implements ChannelConfigRepository {
    private final ChannelConfigDao channelConfigDao;
    private final Map<String, ChannelConfig> channelConfigs;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.DatabaseChannelConfigRepository$cacheChannelConfigs$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.DatabaseChannelConfigRepository", m100430f = "DatabaseChannelConfigRepository.kt", m100431l = {36}, m100432m = "cacheChannelConfigs")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191531 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191531(InterfaceC30057d<? super C191531> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseChannelConfigRepository.this.cacheChannelConfigs(this);
        }
    }

    public DatabaseChannelConfigRepository(ChannelConfigDao channelConfigDao) {
        AbstractC22676k.m65750j(channelConfigDao, "channelConfigDao");
        this.channelConfigDao = channelConfigDao;
        Map<String, ChannelConfig> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        AbstractC22676k.m65749i(mapSynchronizedMap, "synchronizedMap(...)");
        this.channelConfigs = mapSynchronizedMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final Object cacheChannelConfigs(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C191531 c191531;
        Map<String, ChannelConfig> map;
        if (interfaceC30057d instanceof C191531) {
            c191531 = (C191531) interfaceC30057d;
            int i13 = c191531.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191531.label = i13 - Integer.MIN_VALUE;
            } else {
                c191531 = new C191531(interfaceC30057d);
            }
        } else {
            c191531 = new C191531(interfaceC30057d);
        }
        Object obj = c191531.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191531.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Map<String, ChannelConfig> map2 = this.channelConfigs;
            ChannelConfigDao channelConfigDao = this.channelConfigDao;
            c191531.L$0 = map2;
            c191531.label = 1;
            Object objSelectAll = channelConfigDao.selectAll(c191531);
            if (objSelectAll == enumC31071a) {
                return enumC31071a;
            }
            map = map2;
            obj = objSelectAll;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c191531.L$0;
            AbstractC34132o.m107864I(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(ChannelConfigMapperKt.toModel((ChannelConfigEntity) it.next()));
        }
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((ChannelConfig) obj2).getType(), obj2);
        }
        map.putAll(linkedHashMap);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDeleteAll = this.channelConfigDao.deleteAll(interfaceC30057d);
        return objDeleteAll == EnumC31071a.f128113w ? objDeleteAll : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final Object insertChannelConfig(ChannelConfig channelConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.channelConfigs.put(channelConfig.getType(), channelConfig);
        Object objInsert = this.channelConfigDao.insert(ChannelConfigMapperKt.toEntity(channelConfig), interfaceC30057d);
        return objInsert == EnumC31071a.f128113w ? objInsert : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final Object insertChannelConfigs(Collection<ChannelConfig> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Map<String, ChannelConfig> map = this.channelConfigs;
        Collection<ChannelConfig> collection2 = collection;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(collection2, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : collection2) {
            linkedHashMap.put(((ChannelConfig) obj).getType(), obj);
        }
        map.putAll(linkedHashMap);
        ChannelConfigDao channelConfigDao = this.channelConfigDao;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(ChannelConfigMapperKt.toEntity((ChannelConfig) it.next()));
        }
        Object objInsert = channelConfigDao.insert(arrayList, interfaceC30057d);
        return objInsert == EnumC31071a.f128113w ? objInsert : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final ChannelConfig selectChannelConfig(String channelType) {
        AbstractC22676k.m65750j(channelType, "channelType");
        return this.channelConfigs.get(channelType);
    }
}
