package p92;

import com.whoop.domain.model.StrainRecoveryMapping;
import gi0.AbstractC15887f;
import gi0.AbstractC15888g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: p92.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lp92/j;", "", "", "Lcom/whoop/domain/model/StrainRecoveryMapping;", "recStrainMappings", "<init>", "(Ljava/util/List;)V", "", "strain1", "strain2", "e", "(DD)D", "scaled", "f", "(D)D", "", "recoveryValue", "dayStrain", "a", "(ID)Lcom/whoop/domain/model/StrainRecoveryMapping;", "c", "", "Ljava/util/Map;", "strainRecoveryMap", "", "d", "()Z", "isEmpty", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29021j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<Integer, StrainRecoveryMapping> strainRecoveryMap;

    public C29021j(List<StrainRecoveryMapping> recStrainMappings) {
        AbstractC22676k.m65750j(recStrainMappings, "recStrainMappings");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (StrainRecoveryMapping strainRecoveryMapping : recStrainMappings) {
            linkedHashMap.put(Integer.valueOf(strainRecoveryMapping.getRecovery()), strainRecoveryMapping);
        }
        this.strainRecoveryMap = AbstractC25247g0.m74001j0(linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ StrainRecoveryMapping m88253b(C29021j c29021j, int i13, double d3, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            d3 = 0.0d;
        }
        return c29021j.m88256a(i13, d3);
    }

    /* JADX INFO: renamed from: e */
    private final double m88254e(double strain1, double strain2) {
        return AbstractC15887f.m44809j(Math.max(0.0d, m88255f(strain1) - m88255f(strain2)));
    }

    /* JADX INFO: renamed from: f */
    private final double m88255f(double scaled) {
        List<List<Double>> list = AbstractC15888g.f60009a;
        AbstractC22676k.m65747g(list);
        int iM118951C = AbstractC37056f.m118951C(list);
        double dDoubleValue = 0.0d;
        if (iM118951C >= 0) {
            int i13 = 0;
            boolean z4 = false;
            while (true) {
                Double d3 = list.get(i13).get(1);
                int i14 = i13 + 1;
                Double d14 = list.get(Math.min(i14, AbstractC37056f.m118951C(list))).get(1);
                if (!z4 && scaled >= d3.doubleValue() && scaled < d14.doubleValue()) {
                    Double d15 = list.get(i13).get(0);
                    AbstractC22676k.m65749i(d15, "get(...)");
                    dDoubleValue = d15.doubleValue();
                    z4 = true;
                }
                if (i13 == iM118951C) {
                    break;
                }
                i13 = i14;
            }
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: a */
    public final StrainRecoveryMapping m88256a(int recoveryValue, double dayStrain) {
        StrainRecoveryMapping strainRecoveryMapping = this.strainRecoveryMap.get(Integer.valueOf(recoveryValue));
        AbstractC22676k.m65748h(strainRecoveryMapping, "null cannot be cast to non-null type com.whoop.domain.model.StrainRecoveryMapping");
        StrainRecoveryMapping strainRecoveryMapping2 = strainRecoveryMapping;
        return dayStrain == 0.0d ? strainRecoveryMapping2 : new StrainRecoveryMapping(recoveryValue, m88254e(strainRecoveryMapping2.getLowerRecStrain(), dayStrain), m88254e(strainRecoveryMapping2.getRecStrain(), dayStrain), m88254e(strainRecoveryMapping2.getUpperRecStrain(), dayStrain));
    }

    /* JADX INFO: renamed from: c */
    public final StrainRecoveryMapping m88257c(int recoveryValue, double dayStrain) {
        StrainRecoveryMapping strainRecoveryMapping = this.strainRecoveryMap.get(Integer.valueOf(recoveryValue));
        AbstractC22676k.m65748h(strainRecoveryMapping, "null cannot be cast to non-null type com.whoop.domain.model.StrainRecoveryMapping");
        StrainRecoveryMapping strainRecoveryMapping2 = strainRecoveryMapping;
        return dayStrain == 0.0d ? strainRecoveryMapping2 : new StrainRecoveryMapping(recoveryValue, strainRecoveryMapping2.getLowerRecStrain(), m88254e(strainRecoveryMapping2.getRecStrain(), dayStrain), strainRecoveryMapping2.getUpperRecStrain());
    }

    /* JADX INFO: renamed from: d */
    public final boolean m88258d() {
        return this.strainRecoveryMap.isEmpty();
    }
}
