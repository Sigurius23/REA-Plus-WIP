package com.whoop.data.local.room.dao.wipeable;

import com.whoop.data.local.room.entity.ConfigurationDto;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao;", "", "Lcom/whoop/data/local/room/entity/ConfigurationDto;", "configuration", "Ll83/a0;", "insert", "(Lcom/whoop/data/local/room/entity/ConfigurationDto;Lq83/d;)Ljava/lang/Object;", "", "getAllConfigurations", "(Lq83/d;)Ljava/lang/Object;", "deleteAll", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ConfigurationsDao {
    Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object getAllConfigurations(InterfaceC30057d<? super List<ConfigurationDto>> interfaceC30057d);

    Object insert(ConfigurationDto configurationDto, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
