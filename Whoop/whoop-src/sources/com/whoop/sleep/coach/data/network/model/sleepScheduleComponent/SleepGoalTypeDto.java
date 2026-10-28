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
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;", "", "", "sleepGoalLabelToggledDisplay", "sleepGoalLabelNotToggledDisplay", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;", "sleepGoalValue", "", "toggleSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;Z)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSleepGoalLabelToggledDisplay", "getSleepGoalLabelNotToggledDisplay", "getSleepGoalLabelNotToggledDisplay$annotations", "()V", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;", "getSleepGoalValue", "Z", "getToggleSelected", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepGoalTypeDto {
    public static final int $stable = 0;

    @SerializedName("sleep_goal_label_non_toggled_display")
    private final String sleepGoalLabelNotToggledDisplay;

    @SerializedName("sleep_goal_label_toggled_display")
    private final String sleepGoalLabelToggledDisplay;

    @SerializedName("sleep_goal_value")
    private final SleepGoalValueDto sleepGoalValue;

    @SerializedName("toggle_selected")
    private final boolean toggleSelected;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12000a(5)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepGoalTypeDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SleepGoalTypeDto(int i13, String str, String str2, SleepGoalValueDto sleepGoalValueDto, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SleepGoalTypeDto$$serializer.INSTANCE.getDescriptor());
        }
        this.sleepGoalLabelToggledDisplay = str;
        this.sleepGoalLabelNotToggledDisplay = str2;
        this.sleepGoalValue = sleepGoalValueDto;
        this.toggleSelected = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return SleepGoalValueDto.INSTANCE.serializer();
    }

    public static /* synthetic */ SleepGoalTypeDto copy$default(SleepGoalTypeDto sleepGoalTypeDto, String str, String str2, SleepGoalValueDto sleepGoalValueDto, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sleepGoalTypeDto.sleepGoalLabelToggledDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = sleepGoalTypeDto.sleepGoalLabelNotToggledDisplay;
        }
        if ((i13 & 4) != 0) {
            sleepGoalValueDto = sleepGoalTypeDto.sleepGoalValue;
        }
        if ((i13 & 8) != 0) {
            z4 = sleepGoalTypeDto.toggleSelected;
        }
        return sleepGoalTypeDto.copy(str, str2, sleepGoalValueDto, z4);
    }

    @InterfaceC37143h("sleep_goal_label_non_toggled_display")
    public static /* synthetic */ void getSleepGoalLabelNotToggledDisplay$annotations() {
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(SleepGoalTypeDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.sleepGoalLabelToggledDisplay);
        output.encodeStringElement(serialDesc, 1, self.sleepGoalLabelNotToggledDisplay);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sleepGoalValue);
        output.encodeBooleanElement(serialDesc, 3, self.toggleSelected);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSleepGoalLabelToggledDisplay() {
        return this.sleepGoalLabelToggledDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSleepGoalLabelNotToggledDisplay() {
        return this.sleepGoalLabelNotToggledDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SleepGoalValueDto getSleepGoalValue() {
        return this.sleepGoalValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getToggleSelected() {
        return this.toggleSelected;
    }

    public final SleepGoalTypeDto copy(String sleepGoalLabelToggledDisplay, String sleepGoalLabelNotToggledDisplay, SleepGoalValueDto sleepGoalValue, boolean toggleSelected) {
        AbstractC22676k.m65750j(sleepGoalLabelToggledDisplay, "sleepGoalLabelToggledDisplay");
        AbstractC22676k.m65750j(sleepGoalLabelNotToggledDisplay, "sleepGoalLabelNotToggledDisplay");
        AbstractC22676k.m65750j(sleepGoalValue, "sleepGoalValue");
        return new SleepGoalTypeDto(sleepGoalLabelToggledDisplay, sleepGoalLabelNotToggledDisplay, sleepGoalValue, toggleSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepGoalTypeDto)) {
            return false;
        }
        SleepGoalTypeDto sleepGoalTypeDto = (SleepGoalTypeDto) other;
        return AbstractC22676k.m65745e(this.sleepGoalLabelToggledDisplay, sleepGoalTypeDto.sleepGoalLabelToggledDisplay) && AbstractC22676k.m65745e(this.sleepGoalLabelNotToggledDisplay, sleepGoalTypeDto.sleepGoalLabelNotToggledDisplay) && this.sleepGoalValue == sleepGoalTypeDto.sleepGoalValue && this.toggleSelected == sleepGoalTypeDto.toggleSelected;
    }

    public final String getSleepGoalLabelNotToggledDisplay() {
        return this.sleepGoalLabelNotToggledDisplay;
    }

    public final String getSleepGoalLabelToggledDisplay() {
        return this.sleepGoalLabelToggledDisplay;
    }

    public final SleepGoalValueDto getSleepGoalValue() {
        return this.sleepGoalValue;
    }

    public final boolean getToggleSelected() {
        return this.toggleSelected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.toggleSelected) + ((this.sleepGoalValue.hashCode() + AbstractC11266d.m30450d(this.sleepGoalLabelToggledDisplay.hashCode() * 31, 31, this.sleepGoalLabelNotToggledDisplay)) * 31);
    }

    public String toString() {
        String str = this.sleepGoalLabelToggledDisplay;
        String str2 = this.sleepGoalLabelNotToggledDisplay;
        SleepGoalValueDto sleepGoalValueDto = this.sleepGoalValue;
        boolean z4 = this.toggleSelected;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SleepGoalTypeDto(sleepGoalLabelToggledDisplay=", str, ", sleepGoalLabelNotToggledDisplay=", str2, ", sleepGoalValue=");
        sbM32001t.append(sleepGoalValueDto);
        sbM32001t.append(", toggleSelected=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SleepGoalTypeDto(String sleepGoalLabelToggledDisplay, String sleepGoalLabelNotToggledDisplay, SleepGoalValueDto sleepGoalValue, boolean z4) {
        AbstractC22676k.m65750j(sleepGoalLabelToggledDisplay, "sleepGoalLabelToggledDisplay");
        AbstractC22676k.m65750j(sleepGoalLabelNotToggledDisplay, "sleepGoalLabelNotToggledDisplay");
        AbstractC22676k.m65750j(sleepGoalValue, "sleepGoalValue");
        this.sleepGoalLabelToggledDisplay = sleepGoalLabelToggledDisplay;
        this.sleepGoalLabelNotToggledDisplay = sleepGoalLabelNotToggledDisplay;
        this.sleepGoalValue = sleepGoalValue;
        this.toggleSelected = z4;
    }
}
