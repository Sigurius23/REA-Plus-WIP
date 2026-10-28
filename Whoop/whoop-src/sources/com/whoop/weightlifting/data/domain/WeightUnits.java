package com.whoop.weightlifting.data.domain;

import androidx.annotation.Keep;
import com.whoop.domain.model.UnitSystem;
import cu2.AbstractC11128h;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WeightUnits;", "", "nameResourceId", "", "unit", "Lcom/whoop/domain/model/UnitSystem;", "<init>", "(Ljava/lang/String;IILcom/whoop/domain/model/UnitSystem;)V", "getNameResourceId", "()I", "getUnit", "()Lcom/whoop/domain/model/UnitSystem;", "LBS", "KG", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum WeightUnits {
    LBS(AbstractC11128h.f35452b, UnitSystem.IMPERIAL),
    KG(AbstractC11128h.f35448a, UnitSystem.METRIC);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final int nameResourceId;
    private final UnitSystem unit;

    WeightUnits(int i13, UnitSystem unitSystem) {
        this.nameResourceId = i13;
        this.unit = unitSystem;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getNameResourceId() {
        return this.nameResourceId;
    }

    public final UnitSystem getUnit() {
        return this.unit;
    }
}
