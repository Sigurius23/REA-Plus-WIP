package com.whoop.design.models.calendar.archmini;

import c13.AbstractC3855a;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.calendar.CalendarOverlay;
import com.whoop.design.models.calendar.CalendarOverlay$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QPBw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001bJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0098\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001bJ\u0010\u0010/\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b@\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bC\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\bG\u0010#R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bH\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bI\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010J\u001a\u0004\bL\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bM\u0010\u001bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bO\u0010+¨\u0006R"}, m65681d2 = {"Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;", "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;", "", HttpHeaders.DATE, "dateValueDisplay", "", "hasData", "hidden", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "", "cycleId", "dayState", "phase", "firstDayOfPhase", "lastDayOfPhase", "bottomState", "Lcom/whoop/design/models/calendar/CalendarOverlay;", "overlay", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()Lcom/whoop/navigation/models/GenericInteraction;", "component6", "()Ljava/lang/Long;", "component7", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "component12", "()Lcom/whoop/design/models/calendar/CalendarOverlay;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getDate", "getDateValueDisplay", "Z", "getHasData", "getHidden", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Ljava/lang/Long;", "getCycleId", "getDayState", "getPhase", "Ljava/lang/Boolean;", "getFirstDayOfPhase", "getLastDayOfPhase", "getBottomState", "Lcom/whoop/design/models/calendar/CalendarOverlay;", "getOverlay", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HormonalInsightsCalendarDayModel implements CalendarDayModel {
    private final String bottomState;
    private final Long cycleId;
    private final String date;
    private final String dateValueDisplay;
    private final String dayState;
    private final Boolean firstDayOfPhase;
    private final boolean hasData;
    private final boolean hidden;
    private final GenericInteraction interaction;
    private final Boolean lastDayOfPhase;
    private final CalendarOverlay overlay;
    private final String phase;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalInsightsCalendarDayModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HormonalInsightsCalendarDayModel(int i13, String str, String str2, boolean z4, boolean z13, GenericInteraction genericInteraction, Long l7, String str3, String str4, Boolean bool, Boolean bool2, String str5, CalendarOverlay calendarOverlay, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i13 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4095, HormonalInsightsCalendarDayModel$$serializer.INSTANCE.getDescriptor());
        }
        this.date = str;
        this.dateValueDisplay = str2;
        this.hasData = z4;
        this.hidden = z13;
        this.interaction = genericInteraction;
        this.cycleId = l7;
        this.dayState = str3;
        this.phase = str4;
        this.firstDayOfPhase = bool;
        this.lastDayOfPhase = bool2;
        this.bottomState = str5;
        this.overlay = calendarOverlay;
    }

    public static /* synthetic */ HormonalInsightsCalendarDayModel copy$default(HormonalInsightsCalendarDayModel hormonalInsightsCalendarDayModel, String str, String str2, boolean z4, boolean z13, GenericInteraction genericInteraction, Long l7, String str3, String str4, Boolean bool, Boolean bool2, String str5, CalendarOverlay calendarOverlay, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hormonalInsightsCalendarDayModel.date;
        }
        if ((i13 & 2) != 0) {
            str2 = hormonalInsightsCalendarDayModel.dateValueDisplay;
        }
        if ((i13 & 4) != 0) {
            z4 = hormonalInsightsCalendarDayModel.hasData;
        }
        if ((i13 & 8) != 0) {
            z13 = hormonalInsightsCalendarDayModel.hidden;
        }
        if ((i13 & 16) != 0) {
            genericInteraction = hormonalInsightsCalendarDayModel.interaction;
        }
        if ((i13 & 32) != 0) {
            l7 = hormonalInsightsCalendarDayModel.cycleId;
        }
        if ((i13 & 64) != 0) {
            str3 = hormonalInsightsCalendarDayModel.dayState;
        }
        if ((i13 & 128) != 0) {
            str4 = hormonalInsightsCalendarDayModel.phase;
        }
        if ((i13 & 256) != 0) {
            bool = hormonalInsightsCalendarDayModel.firstDayOfPhase;
        }
        if ((i13 & 512) != 0) {
            bool2 = hormonalInsightsCalendarDayModel.lastDayOfPhase;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str5 = hormonalInsightsCalendarDayModel.bottomState;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            calendarOverlay = hormonalInsightsCalendarDayModel.overlay;
        }
        String str6 = str5;
        CalendarOverlay calendarOverlay2 = calendarOverlay;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str7 = str3;
        String str8 = str4;
        GenericInteraction genericInteraction2 = genericInteraction;
        Long l12 = l7;
        return hormonalInsightsCalendarDayModel.copy(str, str2, z4, z13, genericInteraction2, l12, str7, str8, bool3, bool4, str6, calendarOverlay2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(HormonalInsightsCalendarDayModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.getDate());
        output.encodeStringElement(serialDesc, 1, self.getDateValueDisplay());
        output.encodeBooleanElement(serialDesc, 2, self.getHasData());
        output.encodeBooleanElement(serialDesc, 3, self.getHidden());
        output.encodeNullableSerializableElement(serialDesc, 4, GenericInteraction$$serializer.INSTANCE, self.getInteraction());
        output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.cycleId);
        output.encodeStringElement(serialDesc, 6, self.dayState);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.phase);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 8, booleanSerializer, self.firstDayOfPhase);
        output.encodeNullableSerializableElement(serialDesc, 9, booleanSerializer, self.lastDayOfPhase);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.bottomState);
        output.encodeNullableSerializableElement(serialDesc, 11, CalendarOverlay$$serializer.INSTANCE, self.overlay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getLastDayOfPhase() {
        return this.lastDayOfPhase;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBottomState() {
        return this.bottomState;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final CalendarOverlay getOverlay() {
        return this.overlay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDateValueDisplay() {
        return this.dateValueDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasData() {
        return this.hasData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHidden() {
        return this.hidden;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDayState() {
        return this.dayState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPhase() {
        return this.phase;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getFirstDayOfPhase() {
        return this.firstDayOfPhase;
    }

    public final HormonalInsightsCalendarDayModel copy(String date, String dateValueDisplay, boolean hasData, boolean hidden, GenericInteraction interaction, Long cycleId, String dayState, String phase, Boolean firstDayOfPhase, Boolean lastDayOfPhase, String bottomState, CalendarOverlay overlay) {
        AbstractC22676k.m65750j(dateValueDisplay, "dateValueDisplay");
        AbstractC22676k.m65750j(dayState, "dayState");
        return new HormonalInsightsCalendarDayModel(date, dateValueDisplay, hasData, hidden, interaction, cycleId, dayState, phase, firstDayOfPhase, lastDayOfPhase, bottomState, overlay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalInsightsCalendarDayModel)) {
            return false;
        }
        HormonalInsightsCalendarDayModel hormonalInsightsCalendarDayModel = (HormonalInsightsCalendarDayModel) other;
        return AbstractC22676k.m65745e(this.date, hormonalInsightsCalendarDayModel.date) && AbstractC22676k.m65745e(this.dateValueDisplay, hormonalInsightsCalendarDayModel.dateValueDisplay) && this.hasData == hormonalInsightsCalendarDayModel.hasData && this.hidden == hormonalInsightsCalendarDayModel.hidden && AbstractC22676k.m65745e(this.interaction, hormonalInsightsCalendarDayModel.interaction) && AbstractC22676k.m65745e(this.cycleId, hormonalInsightsCalendarDayModel.cycleId) && AbstractC22676k.m65745e(this.dayState, hormonalInsightsCalendarDayModel.dayState) && AbstractC22676k.m65745e(this.phase, hormonalInsightsCalendarDayModel.phase) && AbstractC22676k.m65745e(this.firstDayOfPhase, hormonalInsightsCalendarDayModel.firstDayOfPhase) && AbstractC22676k.m65745e(this.lastDayOfPhase, hormonalInsightsCalendarDayModel.lastDayOfPhase) && AbstractC22676k.m65745e(this.bottomState, hormonalInsightsCalendarDayModel.bottomState) && AbstractC22676k.m65745e(this.overlay, hormonalInsightsCalendarDayModel.overlay);
    }

    public final String getBottomState() {
        return this.bottomState;
    }

    public final Long getCycleId() {
        return this.cycleId;
    }

    @Override // com.whoop.design.models.calendar.archmini.CalendarDayModel
    public String getDate() {
        return this.date;
    }

    @Override // com.whoop.design.models.calendar.archmini.CalendarDayModel
    public String getDateValueDisplay() {
        return this.dateValueDisplay;
    }

    public final String getDayState() {
        return this.dayState;
    }

    public final Boolean getFirstDayOfPhase() {
        return this.firstDayOfPhase;
    }

    @Override // com.whoop.design.models.calendar.archmini.CalendarDayModel
    public boolean getHasData() {
        return this.hasData;
    }

    @Override // com.whoop.design.models.calendar.archmini.CalendarDayModel
    public boolean getHidden() {
        return this.hidden;
    }

    @Override // com.whoop.design.models.calendar.archmini.CalendarDayModel
    public GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final Boolean getLastDayOfPhase() {
        return this.lastDayOfPhase;
    }

    public final CalendarOverlay getOverlay() {
        return this.overlay;
    }

    public final String getPhase() {
        return this.phase;
    }

    public int hashCode() {
        String str = this.date;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.dateValueDisplay), 31, this.hasData), 31, this.hidden);
        GenericInteraction genericInteraction = this.interaction;
        int iHashCode = (iM8289b + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        Long l7 = this.cycleId;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31, 31, this.dayState);
        String str2 = this.phase;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.firstDayOfPhase;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.lastDayOfPhase;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.bottomState;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CalendarOverlay calendarOverlay = this.overlay;
        return iHashCode5 + (calendarOverlay != null ? calendarOverlay.hashCode() : 0);
    }

    public String toString() {
        String str = this.date;
        String str2 = this.dateValueDisplay;
        boolean z4 = this.hasData;
        boolean z13 = this.hidden;
        GenericInteraction genericInteraction = this.interaction;
        Long l7 = this.cycleId;
        String str3 = this.dayState;
        String str4 = this.phase;
        Boolean bool = this.firstDayOfPhase;
        Boolean bool2 = this.lastDayOfPhase;
        String str5 = this.bottomState;
        CalendarOverlay calendarOverlay = this.overlay;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HormonalInsightsCalendarDayModel(date=", str, ", dateValueDisplay=", str2, ", hasData=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", hidden=", z13, ", interaction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", cycleId=");
        sbM32001t.append(l7);
        sbM32001t.append(", dayState=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", phase=", str4, ", firstDayOfPhase=");
        AbstractC3855a.m11839w(sbM32001t, bool, ", lastDayOfPhase=", bool2, ", bottomState=");
        sbM32001t.append(str5);
        sbM32001t.append(", overlay=");
        sbM32001t.append(calendarOverlay);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HormonalInsightsCalendarDayModel(String str, String dateValueDisplay, boolean z4, boolean z13, GenericInteraction genericInteraction, Long l7, String dayState, String str2, Boolean bool, Boolean bool2, String str3, CalendarOverlay calendarOverlay) {
        AbstractC22676k.m65750j(dateValueDisplay, "dateValueDisplay");
        AbstractC22676k.m65750j(dayState, "dayState");
        this.date = str;
        this.dateValueDisplay = dateValueDisplay;
        this.hasData = z4;
        this.hidden = z13;
        this.interaction = genericInteraction;
        this.cycleId = l7;
        this.dayState = dayState;
        this.phase = str2;
        this.firstDayOfPhase = bool;
        this.lastDayOfPhase = bool2;
        this.bottomState = str3;
        this.overlay = calendarOverlay;
    }
}
