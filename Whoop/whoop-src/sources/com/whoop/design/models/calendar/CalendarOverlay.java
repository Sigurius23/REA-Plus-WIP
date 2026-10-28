package com.whoop.design.models.calendar;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import s51.C32219p;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006-"}, m65681d2 = {"Lcom/whoop/design/models/calendar/CalendarOverlay;", "", "Lcom/whoop/design/models/calendar/CalendarOverlayType;", "type", "", "firstDayOfOverlay", "lastDayOfOverlay", "<init>", "(Lcom/whoop/design/models/calendar/CalendarOverlayType;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/calendar/CalendarOverlayType;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/calendar/CalendarOverlay;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/calendar/CalendarOverlayType;", "component2", "()Z", "component3", "copy", "(Lcom/whoop/design/models/calendar/CalendarOverlayType;ZZ)Lcom/whoop/design/models/calendar/CalendarOverlay;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/calendar/CalendarOverlayType;", "getType", "Z", "getFirstDayOfOverlay", "getLastDayOfOverlay", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CalendarOverlay {
    public static final int $stable = 0;
    private final boolean firstDayOfOverlay;
    private final boolean lastDayOfOverlay;
    private final CalendarOverlayType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32219p(14)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/calendar/CalendarOverlay$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/calendar/CalendarOverlay;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CalendarOverlay$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CalendarOverlay(int i13, CalendarOverlayType calendarOverlayType, boolean z4, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, CalendarOverlay$$serializer.INSTANCE.getDescriptor());
        }
        this.type = calendarOverlayType;
        this.firstDayOfOverlay = z4;
        this.lastDayOfOverlay = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.calendar.CalendarOverlayType", CalendarOverlayType.values());
    }

    public static /* synthetic */ CalendarOverlay copy$default(CalendarOverlay calendarOverlay, CalendarOverlayType calendarOverlayType, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            calendarOverlayType = calendarOverlay.type;
        }
        if ((i13 & 2) != 0) {
            z4 = calendarOverlay.firstDayOfOverlay;
        }
        if ((i13 & 4) != 0) {
            z13 = calendarOverlay.lastDayOfOverlay;
        }
        return calendarOverlay.copy(calendarOverlayType, z4, z13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CalendarOverlay self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.type);
        output.encodeBooleanElement(serialDesc, 1, self.firstDayOfOverlay);
        output.encodeBooleanElement(serialDesc, 2, self.lastDayOfOverlay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CalendarOverlayType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFirstDayOfOverlay() {
        return this.firstDayOfOverlay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getLastDayOfOverlay() {
        return this.lastDayOfOverlay;
    }

    public final CalendarOverlay copy(CalendarOverlayType type, boolean firstDayOfOverlay, boolean lastDayOfOverlay) {
        AbstractC22676k.m65750j(type, "type");
        return new CalendarOverlay(type, firstDayOfOverlay, lastDayOfOverlay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarOverlay)) {
            return false;
        }
        CalendarOverlay calendarOverlay = (CalendarOverlay) other;
        return this.type == calendarOverlay.type && this.firstDayOfOverlay == calendarOverlay.firstDayOfOverlay && this.lastDayOfOverlay == calendarOverlay.lastDayOfOverlay;
    }

    public final boolean getFirstDayOfOverlay() {
        return this.firstDayOfOverlay;
    }

    public final boolean getLastDayOfOverlay() {
        return this.lastDayOfOverlay;
    }

    public final CalendarOverlayType getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.lastDayOfOverlay) + AbstractC2875y.m8289b(this.type.hashCode() * 31, 31, this.firstDayOfOverlay);
    }

    public String toString() {
        CalendarOverlayType calendarOverlayType = this.type;
        boolean z4 = this.firstDayOfOverlay;
        boolean z13 = this.lastDayOfOverlay;
        StringBuilder sb4 = new StringBuilder("CalendarOverlay(type=");
        sb4.append(calendarOverlayType);
        sb4.append(", firstDayOfOverlay=");
        sb4.append(z4);
        sb4.append(", lastDayOfOverlay=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public CalendarOverlay(CalendarOverlayType type, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.firstDayOfOverlay = z4;
        this.lastDayOfOverlay = z13;
    }
}
