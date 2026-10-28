package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.design.models.items.DailyTickMarkPlotModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010!¨\u00064"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;", "", "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE, "", "icon", "", "hidden", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;", "bottomSheet", "<init>", "(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Ljava/lang/String;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/DailyTickMarkPlotModel;Ljava/lang/String;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;", "copy", "(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Ljava/lang/String;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "getCycle", "Ljava/lang/String;", "getIcon", "Z", "getHidden", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;", "getBottomSheet", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Cycle {
    private final EditCycleBottomSheet bottomSheet;
    private final DailyTickMarkPlotModel cycle;
    private final boolean hidden;
    private final String icon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Cycle$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Cycle(int i13, DailyTickMarkPlotModel dailyTickMarkPlotModel, String str, boolean z4, EditCycleBottomSheet editCycleBottomSheet, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, Cycle$$serializer.INSTANCE.getDescriptor());
        }
        this.cycle = dailyTickMarkPlotModel;
        this.icon = str;
        this.hidden = z4;
        this.bottomSheet = editCycleBottomSheet;
    }

    public static /* synthetic */ Cycle copy$default(Cycle cycle, DailyTickMarkPlotModel dailyTickMarkPlotModel, String str, boolean z4, EditCycleBottomSheet editCycleBottomSheet, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dailyTickMarkPlotModel = cycle.cycle;
        }
        if ((i13 & 2) != 0) {
            str = cycle.icon;
        }
        if ((i13 & 4) != 0) {
            z4 = cycle.hidden;
        }
        if ((i13 & 8) != 0) {
            editCycleBottomSheet = cycle.bottomSheet;
        }
        return cycle.copy(dailyTickMarkPlotModel, str, z4, editCycleBottomSheet);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(Cycle self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, DailyTickMarkPlotModel$$serializer.INSTANCE, self.cycle);
        output.encodeStringElement(serialDesc, 1, self.icon);
        output.encodeBooleanElement(serialDesc, 2, self.hidden);
        output.encodeSerializableElement(serialDesc, 3, EditCycleBottomSheet$$serializer.INSTANCE, self.bottomSheet);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DailyTickMarkPlotModel getCycle() {
        return this.cycle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHidden() {
        return this.hidden;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EditCycleBottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    public final Cycle copy(DailyTickMarkPlotModel cycle, String icon, boolean hidden, EditCycleBottomSheet bottomSheet) {
        AbstractC22676k.m65750j(cycle, "cycle");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        return new Cycle(cycle, icon, hidden, bottomSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cycle)) {
            return false;
        }
        Cycle cycle = (Cycle) other;
        return AbstractC22676k.m65745e(this.cycle, cycle.cycle) && AbstractC22676k.m65745e(this.icon, cycle.icon) && this.hidden == cycle.hidden && AbstractC22676k.m65745e(this.bottomSheet, cycle.bottomSheet);
    }

    public final EditCycleBottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    public final DailyTickMarkPlotModel getCycle() {
        return this.cycle;
    }

    public final boolean getHidden() {
        return this.hidden;
    }

    public final String getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return this.bottomSheet.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.cycle.hashCode() * 31, 31, this.icon), 31, this.hidden);
    }

    public String toString() {
        return "Cycle(cycle=" + this.cycle + ", icon=" + this.icon + ", hidden=" + this.hidden + ", bottomSheet=" + this.bottomSheet + ")";
    }

    public Cycle(DailyTickMarkPlotModel cycle, String icon, boolean z4, EditCycleBottomSheet bottomSheet) {
        AbstractC22676k.m65750j(cycle, "cycle");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        this.cycle = cycle;
        this.icon = icon;
        this.hidden = z4;
        this.bottomSheet = bottomSheet;
    }
}
