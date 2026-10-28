package com.whoop.sleep.coach.data.network.model.sleepSchedule;

import androidx.annotation.Keep;
import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
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

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0019¨\u0006("}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;", "", "", "shouldShowAddScheduleButton", "", "addScheduleButtonLabelDisplay", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldShowAddScheduleButton", "Ljava/lang/String;", "getAddScheduleButtonLabelDisplay", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ScheduleButtonComponentDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("add_schedule_button_label_display")
    private final String addScheduleButtonLabelDisplay;

    @SerializedName("should_show_add_schedule_button")
    private final boolean shouldShowAddScheduleButton;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ScheduleButtonComponentDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScheduleButtonComponentDto(int i13, boolean z4, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ScheduleButtonComponentDto$$serializer.INSTANCE.getDescriptor());
        }
        this.shouldShowAddScheduleButton = z4;
        this.addScheduleButtonLabelDisplay = str;
    }

    public static /* synthetic */ ScheduleButtonComponentDto copy$default(ScheduleButtonComponentDto scheduleButtonComponentDto, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = scheduleButtonComponentDto.shouldShowAddScheduleButton;
        }
        if ((i13 & 2) != 0) {
            str = scheduleButtonComponentDto.addScheduleButtonLabelDisplay;
        }
        return scheduleButtonComponentDto.copy(z4, str);
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(ScheduleButtonComponentDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.shouldShowAddScheduleButton);
        output.encodeStringElement(serialDesc, 1, self.addScheduleButtonLabelDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShouldShowAddScheduleButton() {
        return this.shouldShowAddScheduleButton;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddScheduleButtonLabelDisplay() {
        return this.addScheduleButtonLabelDisplay;
    }

    public final ScheduleButtonComponentDto copy(boolean shouldShowAddScheduleButton, String addScheduleButtonLabelDisplay) {
        AbstractC22676k.m65750j(addScheduleButtonLabelDisplay, "addScheduleButtonLabelDisplay");
        return new ScheduleButtonComponentDto(shouldShowAddScheduleButton, addScheduleButtonLabelDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleButtonComponentDto)) {
            return false;
        }
        ScheduleButtonComponentDto scheduleButtonComponentDto = (ScheduleButtonComponentDto) other;
        return this.shouldShowAddScheduleButton == scheduleButtonComponentDto.shouldShowAddScheduleButton && AbstractC22676k.m65745e(this.addScheduleButtonLabelDisplay, scheduleButtonComponentDto.addScheduleButtonLabelDisplay);
    }

    public final String getAddScheduleButtonLabelDisplay() {
        return this.addScheduleButtonLabelDisplay;
    }

    public final boolean getShouldShowAddScheduleButton() {
        return this.shouldShowAddScheduleButton;
    }

    public int hashCode() {
        return this.addScheduleButtonLabelDisplay.hashCode() + (Boolean.hashCode(this.shouldShowAddScheduleButton) * 31);
    }

    public String toString() {
        return AbstractC3855a.m11825i("ScheduleButtonComponentDto(shouldShowAddScheduleButton=", ", addScheduleButtonLabelDisplay=", this.addScheduleButtonLabelDisplay, ")", this.shouldShowAddScheduleButton);
    }

    public ScheduleButtonComponentDto(boolean z4, String addScheduleButtonLabelDisplay) {
        AbstractC22676k.m65750j(addScheduleButtonLabelDisplay, "addScheduleButtonLabelDisplay");
        this.shouldShowAddScheduleButton = z4;
        this.addScheduleButtonLabelDisplay = addScheduleButtonLabelDisplay;
    }
}
