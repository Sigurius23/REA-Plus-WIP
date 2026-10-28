package com.whoop.sleep.coach.data.network.model.sleepScheduleComponent;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import df2.C12000a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;", "", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;", "selectionState", "", "dayLabelDisplay", "dayOfWeekValue", "", "displayIndex", "<init>", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;", "component2", "()Ljava/lang/String;", "component3", "component4", "()I", "copy", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;", "getSelectionState", "Ljava/lang/String;", "getDayLabelDisplay", "getDayOfWeekValue", "I", "getDisplayIndex", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ScheduleDayDto {
    public static final int $stable = 0;

    @SerializedName("day_label_display")
    private final String dayLabelDisplay;

    @SerializedName("day_of_week_value")
    private final String dayOfWeekValue;

    @SerializedName("display_index")
    private final int displayIndex;

    @SerializedName("selection_state")
    private final DaySelectionStateDTO selectionState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12000a(2)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ScheduleDayDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScheduleDayDto(int i13, DaySelectionStateDTO daySelectionStateDTO, String str, String str2, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ScheduleDayDto$$serializer.INSTANCE.getDescriptor());
        }
        this.selectionState = daySelectionStateDTO;
        this.dayLabelDisplay = str;
        this.dayOfWeekValue = str2;
        this.displayIndex = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return DaySelectionStateDTO.INSTANCE.serializer();
    }

    public static /* synthetic */ ScheduleDayDto copy$default(ScheduleDayDto scheduleDayDto, DaySelectionStateDTO daySelectionStateDTO, String str, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            daySelectionStateDTO = scheduleDayDto.selectionState;
        }
        if ((i14 & 2) != 0) {
            str = scheduleDayDto.dayLabelDisplay;
        }
        if ((i14 & 4) != 0) {
            str2 = scheduleDayDto.dayOfWeekValue;
        }
        if ((i14 & 8) != 0) {
            i13 = scheduleDayDto.displayIndex;
        }
        return scheduleDayDto.copy(daySelectionStateDTO, str, str2, i13);
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(ScheduleDayDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.selectionState);
        output.encodeStringElement(serialDesc, 1, self.dayLabelDisplay);
        output.encodeStringElement(serialDesc, 2, self.dayOfWeekValue);
        output.encodeIntElement(serialDesc, 3, self.displayIndex);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DaySelectionStateDTO getSelectionState() {
        return this.selectionState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDayLabelDisplay() {
        return this.dayLabelDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDayOfWeekValue() {
        return this.dayOfWeekValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDisplayIndex() {
        return this.displayIndex;
    }

    public final ScheduleDayDto copy(DaySelectionStateDTO selectionState, String dayLabelDisplay, String dayOfWeekValue, int displayIndex) {
        AbstractC22676k.m65750j(selectionState, "selectionState");
        AbstractC22676k.m65750j(dayLabelDisplay, "dayLabelDisplay");
        AbstractC22676k.m65750j(dayOfWeekValue, "dayOfWeekValue");
        return new ScheduleDayDto(selectionState, dayLabelDisplay, dayOfWeekValue, displayIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleDayDto)) {
            return false;
        }
        ScheduleDayDto scheduleDayDto = (ScheduleDayDto) other;
        return this.selectionState == scheduleDayDto.selectionState && AbstractC22676k.m65745e(this.dayLabelDisplay, scheduleDayDto.dayLabelDisplay) && AbstractC22676k.m65745e(this.dayOfWeekValue, scheduleDayDto.dayOfWeekValue) && this.displayIndex == scheduleDayDto.displayIndex;
    }

    public final String getDayLabelDisplay() {
        return this.dayLabelDisplay;
    }

    public final String getDayOfWeekValue() {
        return this.dayOfWeekValue;
    }

    public final int getDisplayIndex() {
        return this.displayIndex;
    }

    public final DaySelectionStateDTO getSelectionState() {
        return this.selectionState;
    }

    public int hashCode() {
        return Integer.hashCode(this.displayIndex) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.selectionState.hashCode() * 31, 31, this.dayLabelDisplay), 31, this.dayOfWeekValue);
    }

    public String toString() {
        return "ScheduleDayDto(selectionState=" + this.selectionState + ", dayLabelDisplay=" + this.dayLabelDisplay + ", dayOfWeekValue=" + this.dayOfWeekValue + ", displayIndex=" + this.displayIndex + ")";
    }

    public ScheduleDayDto(DaySelectionStateDTO selectionState, String dayLabelDisplay, String dayOfWeekValue, int i13) {
        AbstractC22676k.m65750j(selectionState, "selectionState");
        AbstractC22676k.m65750j(dayLabelDisplay, "dayLabelDisplay");
        AbstractC22676k.m65750j(dayOfWeekValue, "dayOfWeekValue");
        this.selectionState = selectionState;
        this.dayLabelDisplay = dayLabelDisplay;
        this.dayOfWeekValue = dayOfWeekValue;
        this.displayIndex = i13;
    }
}
