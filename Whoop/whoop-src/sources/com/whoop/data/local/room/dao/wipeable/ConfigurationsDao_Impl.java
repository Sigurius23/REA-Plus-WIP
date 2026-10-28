package com.whoop.data.local.room.dao.wipeable;

import a11.C0129g;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import bp0.C3526n;
import com.whoop.data.local.room.entity.ConfigurationDto;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigurationsDao_Impl implements ConfigurationsDao {
    private final AbstractC1848z0 __db;
    private final AbstractC1802k __insertAdapterOfConfigurationDto = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.wipeable.ConfigurationsDao_Impl.1
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_configurations` (`configuration_key`,`configuration_value`) VALUES (?,?)";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, ConfigurationDto configurationDto) {
            if (configurationDto.getKey() == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, configurationDto.getKey());
            }
            if (configurationDto.getValue() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, configurationDto.getValue());
            }
        }
    };

    public ConfigurationsDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C23454a0 lambda$deleteAll$2(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_configurations");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getAllConfigurations$1(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_configurations");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "configuration_key");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "configuration_value");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = null;
                String strMo5353J1 = interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!interfaceC33689cMo68212g1.isNull(iM60658N2)) {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                }
                arrayList.add(new ConfigurationDto(strMo5353J1, strMo5353J0));
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C23454a0 lambda$insert$0(ConfigurationDto configurationDto, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfConfigurationDto.insert(interfaceC33687a, configurationDto);
        return C23454a0.f92919a;
    }

    @Override // com.whoop.data.local.room.dao.wipeable.ConfigurationsDao
    public Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C0129g(24), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.ConfigurationsDao
    public Object getAllConfigurations(InterfaceC30057d<? super List<ConfigurationDto>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C0129g(25), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.ConfigurationsDao
    public Object insert(ConfigurationDto configurationDto, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        configurationDto.getClass();
        return AbstractC15751g.m44434N(this.__db, false, true, new C3526n(5, this, configurationDto), interfaceC30057d);
    }
}
