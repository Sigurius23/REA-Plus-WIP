package com.whoop.data.local.room.dao.persistent;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import be1.C3169c;
import cj2.C4769a;
import com.whoop.data.local.room.entity.OptimalStrainMapping;
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
public final class OptimalStrainMappingDao_Impl implements OptimalStrainMappingDao {
    private final AbstractC1848z0 __db;
    private final AbstractC1802k __insertAdapterOfOptimalStrainMapping = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao_Impl.1
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `optimal_strain_mapping_table` (`recovery`,`lower_optimal_strain`,`optimal_strain`,`upper_optimal_strain`,`cycle_id`) VALUES (?,?,?,?,?)";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, OptimalStrainMapping optimalStrainMapping) {
            interfaceC33689c.mo5356p(1, optimalStrainMapping.getRecovery());
            interfaceC33689c.mo5358t(optimalStrainMapping.getLowerOptimalStrain(), 2);
            interfaceC33689c.mo5358t(optimalStrainMapping.getOptimalStrain(), 3);
            interfaceC33689c.mo5358t(optimalStrainMapping.getUpperOptimalStrain(), 4);
            interfaceC33689c.mo5356p(5, optimalStrainMapping.getCycleId());
        }
    };

    public OptimalStrainMappingDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C23454a0 lambda$deleteAll$5(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM optimal_strain_mapping_table");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getAll$4(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM optimal_strain_mapping_table ORDER BY recovery");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "recovery");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lower_optimal_strain");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "optimal_strain");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "upper_optimal_strain");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cycle_id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new OptimalStrainMapping((int) interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getDouble(iM60658N2), interfaceC33689cMo68212g1.getDouble(iM60658N3), interfaceC33689cMo68212g1.getDouble(iM60658N4), interfaceC33689cMo68212g1.getLong(iM60658N5)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ OptimalStrainMapping lambda$getOptimalStrainForRecovery$3(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM  optimal_strain_mapping_table WHERE recovery == ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            return interfaceC33689cMo68212g1.mo5355e1() ? new OptimalStrainMapping((int) interfaceC33689cMo68212g1.getLong(AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "recovery")), interfaceC33689cMo68212g1.getDouble(AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lower_optimal_strain")), interfaceC33689cMo68212g1.getDouble(AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "optimal_strain")), interfaceC33689cMo68212g1.getDouble(AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "upper_optimal_strain")), interfaceC33689cMo68212g1.getLong(AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cycle_id"))) : null;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C23454a0 lambda$insert$0(OptimalStrainMapping optimalStrainMapping, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfOptimalStrainMapping.insert(interfaceC33687a, optimalStrainMapping);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C23454a0 lambda$insertAll$1(List list, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfOptimalStrainMapping.insert(interfaceC33687a, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$replaceAll$2(List list, InterfaceC30057d interfaceC30057d) {
        return super.replaceAll(list, interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao
    public Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C4769a(27), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao
    public Object getAll(InterfaceC30057d<? super List<OptimalStrainMapping>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C4769a(28), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao
    public Object getOptimalStrainForRecovery(int i13, InterfaceC30057d<? super OptimalStrainMapping> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C6494e(i13, 0), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao
    public Object insert(OptimalStrainMapping optimalStrainMapping, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        optimalStrainMapping.getClass();
        return AbstractC15751g.m44434N(this.__db, false, true, new C3169c(17, this, optimalStrainMapping), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao
    public Object insertAll(List<OptimalStrainMapping> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.__db, false, true, new C6495f(this, list, 1), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.OptimalStrainMappingDao
    public Object replaceAll(List<OptimalStrainMapping> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.__db, new C6495f(this, list, 0), interfaceC30057d);
    }
}
