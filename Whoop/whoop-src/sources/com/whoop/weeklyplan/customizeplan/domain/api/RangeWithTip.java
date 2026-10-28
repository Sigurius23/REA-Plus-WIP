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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;", "range", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;", "tooltip", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;", "progressionToolTip", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weeklyplan/customizeplan/domain/api/Range;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;", "component2", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;", "component3", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;", "copy", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;)Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;", "getRange", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;", "getTooltip", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;", "getProgressionToolTip", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RangeWithTip {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ProgressionToolTip progressionToolTip;
    private final Range range;
    private final ToolTip tooltip;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RangeWithTip$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RangeWithTip(int i13, Range range, ToolTip toolTip, ProgressionToolTip progressionToolTip, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, RangeWithTip$$serializer.INSTANCE.getDescriptor());
        }
        this.range = range;
        this.tooltip = toolTip;
        this.progressionToolTip = progressionToolTip;
    }

    public static /* synthetic */ RangeWithTip copy$default(RangeWithTip rangeWithTip, Range range, ToolTip toolTip, ProgressionToolTip progressionToolTip, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            range = rangeWithTip.range;
        }
        if ((i13 & 2) != 0) {
            toolTip = rangeWithTip.tooltip;
        }
        if ((i13 & 4) != 0) {
            progressionToolTip = rangeWithTip.progressionToolTip;
        }
        return rangeWithTip.copy(range, toolTip, progressionToolTip);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(RangeWithTip self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, Range$$serializer.INSTANCE, self.range);
        output.encodeSerializableElement(serialDesc, 1, ToolTip$$serializer.INSTANCE, self.tooltip);
        output.encodeNullableSerializableElement(serialDesc, 2, ProgressionToolTip$$serializer.INSTANCE, self.progressionToolTip);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Range getRange() {
        return this.range;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ToolTip getTooltip() {
        return this.tooltip;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProgressionToolTip getProgressionToolTip() {
        return this.progressionToolTip;
    }

    public final RangeWithTip copy(Range range, ToolTip tooltip, ProgressionToolTip progressionToolTip) {
        AbstractC22676k.m65750j(range, "range");
        AbstractC22676k.m65750j(tooltip, "tooltip");
        return new RangeWithTip(range, tooltip, progressionToolTip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeWithTip)) {
            return false;
        }
        RangeWithTip rangeWithTip = (RangeWithTip) other;
        return AbstractC22676k.m65745e(this.range, rangeWithTip.range) && AbstractC22676k.m65745e(this.tooltip, rangeWithTip.tooltip) && AbstractC22676k.m65745e(this.progressionToolTip, rangeWithTip.progressionToolTip);
    }

    public final ProgressionToolTip getProgressionToolTip() {
        return this.progressionToolTip;
    }

    public final Range getRange() {
        return this.range;
    }

    public final ToolTip getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        int iHashCode = (this.tooltip.hashCode() + (this.range.hashCode() * 31)) * 31;
        ProgressionToolTip progressionToolTip = this.progressionToolTip;
        return iHashCode + (progressionToolTip == null ? 0 : progressionToolTip.hashCode());
    }

    public String toString() {
        return "RangeWithTip(range=" + this.range + ", tooltip=" + this.tooltip + ", progressionToolTip=" + this.progressionToolTip + ")";
    }

    public RangeWithTip(Range range, ToolTip tooltip, ProgressionToolTip progressionToolTip) {
        AbstractC22676k.m65750j(range, "range");
        AbstractC22676k.m65750j(tooltip, "tooltip");
        this.range = range;
        this.tooltip = tooltip;
        this.progressionToolTip = progressionToolTip;
    }
}
