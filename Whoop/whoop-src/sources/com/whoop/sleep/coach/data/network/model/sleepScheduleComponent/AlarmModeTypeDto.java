package com.whoop.sleep.coach.data.network.model.sleepScheduleComponent;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import db2.C11888a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
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
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeTypeDto;", "", "", "alarmModeTypeLabelDisplay", "alarmModeTypeDescriptionTextDisplay", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;", "nextState", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;", "alarmModeValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeTypeDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;", "component4", "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeTypeDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAlarmModeTypeLabelDisplay", "getAlarmModeTypeDescriptionTextDisplay", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;", "getNextState", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;", "getAlarmModeValue", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AlarmModeTypeDto {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("alarm_mode_type_description_text_display")
    private final String alarmModeTypeDescriptionTextDisplay;

    @SerializedName("alarm_mode_type_label_display")
    private final String alarmModeTypeLabelDisplay;

    @SerializedName("alarm_mode_value")
    private final AlarmModeValue alarmModeValue;

    @SerializedName("next_state")
    private final NextStateDto nextState;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeTypeDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeTypeDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AlarmModeTypeDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C11888a(24)), AbstractC30060g.m92087G(enumC23463i, new C11888a(25))};
    }

    public /* synthetic */ AlarmModeTypeDto(int i13, String str, String str2, NextStateDto nextStateDto, AlarmModeValue alarmModeValue, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, AlarmModeTypeDto$$serializer.INSTANCE.getDescriptor());
        }
        this.alarmModeTypeLabelDisplay = str;
        this.alarmModeTypeDescriptionTextDisplay = str2;
        this.nextState = nextStateDto;
        this.alarmModeValue = alarmModeValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return NextStateDto.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return AlarmModeValue.INSTANCE.serializer();
    }

    public static /* synthetic */ AlarmModeTypeDto copy$default(AlarmModeTypeDto alarmModeTypeDto, String str, String str2, NextStateDto nextStateDto, AlarmModeValue alarmModeValue, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = alarmModeTypeDto.alarmModeTypeLabelDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = alarmModeTypeDto.alarmModeTypeDescriptionTextDisplay;
        }
        if ((i13 & 4) != 0) {
            nextStateDto = alarmModeTypeDto.nextState;
        }
        if ((i13 & 8) != 0) {
            alarmModeValue = alarmModeTypeDto.alarmModeValue;
        }
        return alarmModeTypeDto.copy(str, str2, nextStateDto, alarmModeValue);
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(AlarmModeTypeDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.alarmModeTypeLabelDisplay);
        output.encodeStringElement(serialDesc, 1, self.alarmModeTypeDescriptionTextDisplay);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.nextState);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.alarmModeValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlarmModeTypeLabelDisplay() {
        return this.alarmModeTypeLabelDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlarmModeTypeDescriptionTextDisplay() {
        return this.alarmModeTypeDescriptionTextDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NextStateDto getNextState() {
        return this.nextState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AlarmModeValue getAlarmModeValue() {
        return this.alarmModeValue;
    }

    public final AlarmModeTypeDto copy(String alarmModeTypeLabelDisplay, String alarmModeTypeDescriptionTextDisplay, NextStateDto nextState, AlarmModeValue alarmModeValue) {
        AbstractC22676k.m65750j(alarmModeTypeLabelDisplay, "alarmModeTypeLabelDisplay");
        AbstractC22676k.m65750j(alarmModeTypeDescriptionTextDisplay, "alarmModeTypeDescriptionTextDisplay");
        AbstractC22676k.m65750j(nextState, "nextState");
        AbstractC22676k.m65750j(alarmModeValue, "alarmModeValue");
        return new AlarmModeTypeDto(alarmModeTypeLabelDisplay, alarmModeTypeDescriptionTextDisplay, nextState, alarmModeValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlarmModeTypeDto)) {
            return false;
        }
        AlarmModeTypeDto alarmModeTypeDto = (AlarmModeTypeDto) other;
        return AbstractC22676k.m65745e(this.alarmModeTypeLabelDisplay, alarmModeTypeDto.alarmModeTypeLabelDisplay) && AbstractC22676k.m65745e(this.alarmModeTypeDescriptionTextDisplay, alarmModeTypeDto.alarmModeTypeDescriptionTextDisplay) && this.nextState == alarmModeTypeDto.nextState && this.alarmModeValue == alarmModeTypeDto.alarmModeValue;
    }

    public final String getAlarmModeTypeDescriptionTextDisplay() {
        return this.alarmModeTypeDescriptionTextDisplay;
    }

    public final String getAlarmModeTypeLabelDisplay() {
        return this.alarmModeTypeLabelDisplay;
    }

    public final AlarmModeValue getAlarmModeValue() {
        return this.alarmModeValue;
    }

    public final NextStateDto getNextState() {
        return this.nextState;
    }

    public int hashCode() {
        return this.alarmModeValue.hashCode() + ((this.nextState.hashCode() + AbstractC11266d.m30450d(this.alarmModeTypeLabelDisplay.hashCode() * 31, 31, this.alarmModeTypeDescriptionTextDisplay)) * 31);
    }

    public String toString() {
        String str = this.alarmModeTypeLabelDisplay;
        String str2 = this.alarmModeTypeDescriptionTextDisplay;
        NextStateDto nextStateDto = this.nextState;
        AlarmModeValue alarmModeValue = this.alarmModeValue;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AlarmModeTypeDto(alarmModeTypeLabelDisplay=", str, ", alarmModeTypeDescriptionTextDisplay=", str2, ", nextState=");
        sbM32001t.append(nextStateDto);
        sbM32001t.append(", alarmModeValue=");
        sbM32001t.append(alarmModeValue);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public AlarmModeTypeDto(String alarmModeTypeLabelDisplay, String alarmModeTypeDescriptionTextDisplay, NextStateDto nextState, AlarmModeValue alarmModeValue) {
        AbstractC22676k.m65750j(alarmModeTypeLabelDisplay, "alarmModeTypeLabelDisplay");
        AbstractC22676k.m65750j(alarmModeTypeDescriptionTextDisplay, "alarmModeTypeDescriptionTextDisplay");
        AbstractC22676k.m65750j(nextState, "nextState");
        AbstractC22676k.m65750j(alarmModeValue, "alarmModeValue");
        this.alarmModeTypeLabelDisplay = alarmModeTypeLabelDisplay;
        this.alarmModeTypeDescriptionTextDisplay = alarmModeTypeDescriptionTextDisplay;
        this.nextState = nextState;
        this.alarmModeValue = alarmModeValue;
    }
}
