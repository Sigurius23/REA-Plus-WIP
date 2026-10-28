package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTipV2;", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "range", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTipV2;", "tooltip", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;", "progressionToolTip", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTipV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTipV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTipV2;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "component2", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTipV2;", "component3", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;", "copy", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTipV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;)Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTipV2;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "getRange", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTipV2;", "getTooltip", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;", "getProgressionToolTip", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RangeWithTipV2 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ProgressionToolTipV2 progressionToolTip;
    private final RangeV2 range;
    private final ToolTipV2 tooltip;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTipV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTipV2;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RangeWithTipV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RangeWithTipV2(int i13, RangeV2 rangeV2, ToolTipV2 toolTipV2, ProgressionToolTipV2 progressionToolTipV2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, RangeWithTipV2$$serializer.INSTANCE.getDescriptor());
        }
        this.range = rangeV2;
        this.tooltip = toolTipV2;
        this.progressionToolTip = progressionToolTipV2;
    }

    public static /* synthetic */ RangeWithTipV2 copy$default(RangeWithTipV2 rangeWithTipV2, RangeV2 rangeV2, ToolTipV2 toolTipV2, ProgressionToolTipV2 progressionToolTipV2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            rangeV2 = rangeWithTipV2.range;
        }
        if ((i13 & 2) != 0) {
            toolTipV2 = rangeWithTipV2.tooltip;
        }
        if ((i13 & 4) != 0) {
            progressionToolTipV2 = rangeWithTipV2.progressionToolTip;
        }
        return rangeWithTipV2.copy(rangeV2, toolTipV2, progressionToolTipV2);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(RangeWithTipV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, RangeV2$$serializer.INSTANCE, self.range);
        output.encodeSerializableElement(serialDesc, 1, ToolTipV2$$serializer.INSTANCE, self.tooltip);
        output.encodeNullableSerializableElement(serialDesc, 2, ProgressionToolTipV2$$serializer.INSTANCE, self.progressionToolTip);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RangeV2 getRange() {
        return this.range;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ToolTipV2 getTooltip() {
        return this.tooltip;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProgressionToolTipV2 getProgressionToolTip() {
        return this.progressionToolTip;
    }

    public final RangeWithTipV2 copy(RangeV2 range, ToolTipV2 tooltip, ProgressionToolTipV2 progressionToolTip) {
        AbstractC22676k.m65750j(range, "range");
        AbstractC22676k.m65750j(tooltip, "tooltip");
        return new RangeWithTipV2(range, tooltip, progressionToolTip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeWithTipV2)) {
            return false;
        }
        RangeWithTipV2 rangeWithTipV2 = (RangeWithTipV2) other;
        return AbstractC22676k.m65745e(this.range, rangeWithTipV2.range) && AbstractC22676k.m65745e(this.tooltip, rangeWithTipV2.tooltip) && AbstractC22676k.m65745e(this.progressionToolTip, rangeWithTipV2.progressionToolTip);
    }

    public final ProgressionToolTipV2 getProgressionToolTip() {
        return this.progressionToolTip;
    }

    public final RangeV2 getRange() {
        return this.range;
    }

    public final ToolTipV2 getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        int iHashCode = (this.tooltip.hashCode() + (this.range.hashCode() * 31)) * 31;
        ProgressionToolTipV2 progressionToolTipV2 = this.progressionToolTip;
        return iHashCode + (progressionToolTipV2 == null ? 0 : progressionToolTipV2.hashCode());
    }

    public String toString() {
        return "RangeWithTipV2(range=" + this.range + ", tooltip=" + this.tooltip + ", progressionToolTip=" + this.progressionToolTip + ")";
    }

    public RangeWithTipV2(RangeV2 range, ToolTipV2 tooltip, ProgressionToolTipV2 progressionToolTipV2) {
        AbstractC22676k.m65750j(range, "range");
        AbstractC22676k.m65750j(tooltip, "tooltip");
        this.range = range;
        this.tooltip = tooltip;
        this.progressionToolTip = progressionToolTipV2;
    }
}
