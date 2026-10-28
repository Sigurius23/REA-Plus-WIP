package com.whoop.advancedlabs.feature.hormonalcontext.domain.models;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m65681d2 = {"toHormonalContextScreenId", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;", "", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HormonalContextScreenSerializerKt {
    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    public static final HormonalContextScreenId toHormonalContextScreenId(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        HormonalContextScreenId hormonalContextScreenId = HormonalContextScreenId.UNKNOWN;
        for (HormonalContextScreenId hormonalContextScreenId2 : HormonalContextScreenId.values()) {
            if (AbstractC22676k.m65745e(hormonalContextScreenId2.name(), str)) {
                if (hormonalContextScreenId2 == null) {
                    return hormonalContextScreenId;
                }
                return hormonalContextScreenId2;
            }
        }
        hormonalContextScreenId2 = null;
        if (hormonalContextScreenId2 == null) {
            return hormonalContextScreenId;
        }
        return hormonalContextScreenId2;
    }
}
