package com.whoop.domain.model;

import ge3.AbstractC15751g;
import live.hms.video.utils.HMSConstantsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.InterfaceC33616a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002¨\u0006\t"}, m65681d2 = {"isImperial", "", "Lcom/whoop/domain/model/UnitSystem;", "isMetric", "unitSystemFromString", "value", "", "unitSystemFromStringOrDefault", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UnitSystemExtKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ InterfaceC33616a entries$0 = AbstractC15751g.m44468u(UnitSystem.values());
    }

    public static final boolean isImperial(UnitSystem unitSystem) {
        AbstractC22676k.m65750j(unitSystem, "<this>");
        return unitSystem == UnitSystem.IMPERIAL;
    }

    public static final boolean isMetric(UnitSystem unitSystem) {
        AbstractC22676k.m65750j(unitSystem, "<this>");
        return unitSystem == UnitSystem.METRIC;
    }

    public static final UnitSystem unitSystemFromString(String str) {
        Object obj = null;
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return null;
        }
        for (Object obj2 : EntriesMappings.entries$0) {
            UnitSystem unitSystem = (UnitSystem) obj2;
            if (AbstractC39421y.m125921F(unitSystem.toName(), str, true) || AbstractC39421y.m125921F(unitSystem.name(), str, true)) {
                obj = obj2;
                break;
            }
        }
        return (UnitSystem) obj;
    }

    public static final UnitSystem unitSystemFromStringOrDefault(String str, UnitSystem unitSystem) {
        AbstractC22676k.m65750j(unitSystem, "default");
        UnitSystem unitSystemUnitSystemFromString = unitSystemFromString(str);
        return unitSystemUnitSystemFromString == null ? unitSystem : unitSystemUnitSystemFromString;
    }

    public static /* synthetic */ UnitSystem unitSystemFromStringOrDefault$default(String str, UnitSystem unitSystem, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            unitSystem = UnitSystem.IMPERIAL;
        }
        return unitSystemFromStringOrDefault(str, unitSystem);
    }
}
