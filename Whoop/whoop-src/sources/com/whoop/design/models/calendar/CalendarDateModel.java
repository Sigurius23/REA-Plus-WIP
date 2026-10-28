package com.whoop.design.models.calendar;

import com.mapbox.common.HttpHeaders;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import s52.C32223d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UTB\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u008e\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b2\u0010-J\u0010\u00103\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bL\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bM\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\bO\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\b\u0010\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bQ\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010R\u001a\u0004\bS\u0010/¨\u0006V"}, m65681d2 = {"Lcom/whoop/design/models/calendar/CalendarDateModel;", "", "Lcom/whoop/design/util/TextResource;", "dateValueDisplay", "", "hasData", "", "cycleId", "Lcom/whoop/design/models/calendar/CalendarDayState;", "dayState", "Lcom/whoop/design/models/calendar/CalendarPhase;", "phase", "firstDayOfPhase", "lastDayOfPhase", "Lcom/whoop/design/models/calendar/CalendarDayBottomState;", "bottomState", "isHidden", "", HttpHeaders.DATE, "Lcom/whoop/design/models/calendar/CalendarOverlay;", "overlay", "<init>", "(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Z", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/whoop/design/models/calendar/CalendarDayState;", "component5", "()Lcom/whoop/design/models/calendar/CalendarPhase;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "()Lcom/whoop/design/models/calendar/CalendarDayBottomState;", "component9", "component10", "()Ljava/lang/String;", "component11", "()Lcom/whoop/design/models/calendar/CalendarOverlay;", "copy", "(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)Lcom/whoop/design/models/calendar/CalendarDateModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/calendar/CalendarDateModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getDateValueDisplay", "Z", "getHasData", "Ljava/lang/Long;", "getCycleId", "Lcom/whoop/design/models/calendar/CalendarDayState;", "getDayState", "Lcom/whoop/design/models/calendar/CalendarPhase;", "getPhase", "Ljava/lang/Boolean;", "getFirstDayOfPhase", "getLastDayOfPhase", "Lcom/whoop/design/models/calendar/CalendarDayBottomState;", "getBottomState", "Ljava/lang/String;", "getDate", "Lcom/whoop/design/models/calendar/CalendarOverlay;", "getOverlay", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CalendarDateModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final CalendarDayBottomState bottomState;
    private final Long cycleId;
    private final String date;
    private final TextResource dateValueDisplay;
    private final CalendarDayState dayState;
    private final Boolean firstDayOfPhase;
    private final boolean hasData;
    private final Boolean isHidden;
    private final Boolean lastDayOfPhase;
    private final CalendarOverlay overlay;
    private final CalendarPhase phase;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/calendar/CalendarDateModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CalendarDateModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C32223d(2)), AbstractC30060g.m92087G(enumC23463i, new C32223d(3)), null, null, AbstractC30060g.m92087G(enumC23463i, new C32223d(4)), null, null, null};
    }

    public CalendarDateModel() {
        this((TextResource) null, false, (Long) null, (CalendarDayState) null, (CalendarPhase) null, (Boolean) null, (Boolean) null, (CalendarDayBottomState) null, (Boolean) null, (String) null, (CalendarOverlay) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.calendar.CalendarDayState", CalendarDayState.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.calendar.CalendarPhase", CalendarPhase.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.calendar.CalendarDayBottomState", CalendarDayBottomState.values());
    }

    public static /* synthetic */ CalendarDateModel copy$default(CalendarDateModel calendarDateModel, TextResource textResource, boolean z4, Long l7, CalendarDayState calendarDayState, CalendarPhase calendarPhase, Boolean bool, Boolean bool2, CalendarDayBottomState calendarDayBottomState, Boolean bool3, String str, CalendarOverlay calendarOverlay, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = calendarDateModel.dateValueDisplay;
        }
        if ((i13 & 2) != 0) {
            z4 = calendarDateModel.hasData;
        }
        if ((i13 & 4) != 0) {
            l7 = calendarDateModel.cycleId;
        }
        if ((i13 & 8) != 0) {
            calendarDayState = calendarDateModel.dayState;
        }
        if ((i13 & 16) != 0) {
            calendarPhase = calendarDateModel.phase;
        }
        if ((i13 & 32) != 0) {
            bool = calendarDateModel.firstDayOfPhase;
        }
        if ((i13 & 64) != 0) {
            bool2 = calendarDateModel.lastDayOfPhase;
        }
        if ((i13 & 128) != 0) {
            calendarDayBottomState = calendarDateModel.bottomState;
        }
        if ((i13 & 256) != 0) {
            bool3 = calendarDateModel.isHidden;
        }
        if ((i13 & 512) != 0) {
            str = calendarDateModel.date;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            calendarOverlay = calendarDateModel.overlay;
        }
        String str2 = str;
        CalendarOverlay calendarOverlay2 = calendarOverlay;
        CalendarDayBottomState calendarDayBottomState2 = calendarDayBottomState;
        Boolean bool4 = bool3;
        Boolean bool5 = bool;
        Boolean bool6 = bool2;
        CalendarPhase calendarPhase2 = calendarPhase;
        Long l12 = l7;
        return calendarDateModel.copy(textResource, z4, l12, calendarDayState, calendarPhase2, bool5, bool6, calendarDayBottomState2, bool4, str2, calendarOverlay2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CalendarDateModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        Long l7;
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.dateValueDisplay, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.dateValueDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.hasData) {
            output.encodeBooleanElement(serialDesc, 1, self.hasData);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || (l7 = self.cycleId) == null || l7.longValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.cycleId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.dayState != CalendarDayState.NO_DATA) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.dayState);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.phase != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.phase);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.firstDayOfPhase != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.firstDayOfPhase);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.lastDayOfPhase != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, self.lastDayOfPhase);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.bottomState != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.bottomState);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.isHidden != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.isHidden);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.date != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.date);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.overlay == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, CalendarOverlay$$serializer.INSTANCE, self.overlay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getDateValueDisplay() {
        return this.dateValueDisplay;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final CalendarOverlay getOverlay() {
        return this.overlay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasData() {
        return this.hasData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CalendarDayState getDayState() {
        return this.dayState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CalendarPhase getPhase() {
        return this.phase;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getFirstDayOfPhase() {
        return this.firstDayOfPhase;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getLastDayOfPhase() {
        return this.lastDayOfPhase;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CalendarDayBottomState getBottomState() {
        return this.bottomState;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsHidden() {
        return this.isHidden;
    }

    public final CalendarDateModel copy(TextResource dateValueDisplay, boolean hasData, Long cycleId, CalendarDayState dayState, CalendarPhase phase, Boolean firstDayOfPhase, Boolean lastDayOfPhase, CalendarDayBottomState bottomState, Boolean isHidden, String date, CalendarOverlay overlay) {
        AbstractC22676k.m65750j(dateValueDisplay, "dateValueDisplay");
        AbstractC22676k.m65750j(dayState, "dayState");
        return new CalendarDateModel(dateValueDisplay, hasData, cycleId, dayState, phase, firstDayOfPhase, lastDayOfPhase, bottomState, isHidden, date, overlay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarDateModel)) {
            return false;
        }
        CalendarDateModel calendarDateModel = (CalendarDateModel) other;
        return AbstractC22676k.m65745e(this.dateValueDisplay, calendarDateModel.dateValueDisplay) && this.hasData == calendarDateModel.hasData && AbstractC22676k.m65745e(this.cycleId, calendarDateModel.cycleId) && this.dayState == calendarDateModel.dayState && this.phase == calendarDateModel.phase && AbstractC22676k.m65745e(this.firstDayOfPhase, calendarDateModel.firstDayOfPhase) && AbstractC22676k.m65745e(this.lastDayOfPhase, calendarDateModel.lastDayOfPhase) && this.bottomState == calendarDateModel.bottomState && AbstractC22676k.m65745e(this.isHidden, calendarDateModel.isHidden) && AbstractC22676k.m65745e(this.date, calendarDateModel.date) && AbstractC22676k.m65745e(this.overlay, calendarDateModel.overlay);
    }

    public final CalendarDayBottomState getBottomState() {
        return this.bottomState;
    }

    public final Long getCycleId() {
        return this.cycleId;
    }

    public final String getDate() {
        return this.date;
    }

    public final TextResource getDateValueDisplay() {
        return this.dateValueDisplay;
    }

    public final CalendarDayState getDayState() {
        return this.dayState;
    }

    public final Boolean getFirstDayOfPhase() {
        return this.firstDayOfPhase;
    }

    public final boolean getHasData() {
        return this.hasData;
    }

    public final Boolean getLastDayOfPhase() {
        return this.lastDayOfPhase;
    }

    public final CalendarOverlay getOverlay() {
        return this.overlay;
    }

    public final CalendarPhase getPhase() {
        return this.phase;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.dateValueDisplay.hashCode() * 31, 31, this.hasData);
        Long l7 = this.cycleId;
        int iHashCode = (this.dayState.hashCode() + ((iM8289b + (l7 == null ? 0 : l7.hashCode())) * 31)) * 31;
        CalendarPhase calendarPhase = this.phase;
        int iHashCode2 = (iHashCode + (calendarPhase == null ? 0 : calendarPhase.hashCode())) * 31;
        Boolean bool = this.firstDayOfPhase;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.lastDayOfPhase;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CalendarDayBottomState calendarDayBottomState = this.bottomState;
        int iHashCode5 = (iHashCode4 + (calendarDayBottomState == null ? 0 : calendarDayBottomState.hashCode())) * 31;
        Boolean bool3 = this.isHidden;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.date;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        CalendarOverlay calendarOverlay = this.overlay;
        return iHashCode7 + (calendarOverlay != null ? calendarOverlay.hashCode() : 0);
    }

    public final Boolean isHidden() {
        return this.isHidden;
    }

    public String toString() {
        TextResource textResource = this.dateValueDisplay;
        boolean z4 = this.hasData;
        Long l7 = this.cycleId;
        CalendarDayState calendarDayState = this.dayState;
        CalendarPhase calendarPhase = this.phase;
        Boolean bool = this.firstDayOfPhase;
        Boolean bool2 = this.lastDayOfPhase;
        CalendarDayBottomState calendarDayBottomState = this.bottomState;
        Boolean bool3 = this.isHidden;
        String str = this.date;
        CalendarOverlay calendarOverlay = this.overlay;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("CalendarDateModel(dateValueDisplay=", textResource, ", hasData=", z4, ", cycleId=");
        sbM91846p.append(l7);
        sbM91846p.append(", dayState=");
        sbM91846p.append(calendarDayState);
        sbM91846p.append(", phase=");
        sbM91846p.append(calendarPhase);
        sbM91846p.append(", firstDayOfPhase=");
        sbM91846p.append(bool);
        sbM91846p.append(", lastDayOfPhase=");
        sbM91846p.append(bool2);
        sbM91846p.append(", bottomState=");
        sbM91846p.append(calendarDayBottomState);
        sbM91846p.append(", isHidden=");
        AbstractC13673n.m38576w(bool3, ", date=", str, ", overlay=", sbM91846p);
        sbM91846p.append(calendarOverlay);
        sbM91846p.append(")");
        return sbM91846p.toString();
    }

    public /* synthetic */ CalendarDateModel(int i13, TextResource textResource, boolean z4, Long l7, CalendarDayState calendarDayState, CalendarPhase calendarPhase, Boolean bool, Boolean bool2, CalendarDayBottomState calendarDayBottomState, Boolean bool3, String str, CalendarOverlay calendarOverlay, SerializationConstructorMarker serializationConstructorMarker) {
        this.dateValueDisplay = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.hasData = false;
        } else {
            this.hasData = z4;
        }
        if ((i13 & 4) == 0) {
            this.cycleId = 0L;
        } else {
            this.cycleId = l7;
        }
        if ((i13 & 8) == 0) {
            this.dayState = CalendarDayState.NO_DATA;
        } else {
            this.dayState = calendarDayState;
        }
        if ((i13 & 16) == 0) {
            this.phase = null;
        } else {
            this.phase = calendarPhase;
        }
        if ((i13 & 32) == 0) {
            this.firstDayOfPhase = null;
        } else {
            this.firstDayOfPhase = bool;
        }
        if ((i13 & 64) == 0) {
            this.lastDayOfPhase = null;
        } else {
            this.lastDayOfPhase = bool2;
        }
        if ((i13 & 128) == 0) {
            this.bottomState = null;
        } else {
            this.bottomState = calendarDayBottomState;
        }
        if ((i13 & 256) == 0) {
            this.isHidden = null;
        } else {
            this.isHidden = bool3;
        }
        if ((i13 & 512) == 0) {
            this.date = null;
        } else {
            this.date = str;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.overlay = null;
        } else {
            this.overlay = calendarOverlay;
        }
    }

    public CalendarDateModel(TextResource dateValueDisplay, boolean z4, Long l7, CalendarDayState dayState, CalendarPhase calendarPhase, Boolean bool, Boolean bool2, CalendarDayBottomState calendarDayBottomState, Boolean bool3, String str, CalendarOverlay calendarOverlay) {
        AbstractC22676k.m65750j(dateValueDisplay, "dateValueDisplay");
        AbstractC22676k.m65750j(dayState, "dayState");
        this.dateValueDisplay = dateValueDisplay;
        this.hasData = z4;
        this.cycleId = l7;
        this.dayState = dayState;
        this.phase = calendarPhase;
        this.firstDayOfPhase = bool;
        this.lastDayOfPhase = bool2;
        this.bottomState = calendarDayBottomState;
        this.isHidden = bool3;
        this.date = str;
        this.overlay = calendarOverlay;
    }

    public /* synthetic */ CalendarDateModel(TextResource textResource, boolean z4, Long l7, CalendarDayState calendarDayState, CalendarPhase calendarPhase, Boolean bool, Boolean bool2, CalendarDayBottomState calendarDayBottomState, Boolean bool3, String str, CalendarOverlay calendarOverlay, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? 0L : l7, (i13 & 8) != 0 ? CalendarDayState.NO_DATA : calendarDayState, (i13 & 16) != 0 ? null : calendarPhase, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? null : bool2, (i13 & 128) != 0 ? null : calendarDayBottomState, (i13 & 256) != 0 ? null : bool3, (i13 & 512) != 0 ? null : str, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : calendarOverlay);
    }
}
