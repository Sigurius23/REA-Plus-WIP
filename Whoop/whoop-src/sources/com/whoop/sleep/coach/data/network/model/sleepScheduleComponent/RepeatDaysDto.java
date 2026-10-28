package com.whoop.sleep.coach.data.network.model.sleepScheduleComponent;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import df2.C12000a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$JR\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u001dR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010!R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b8\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010$¨\u0006="}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;", "", "", "daysToScheduleDescriptionText", "daysToScheduleTitleDisplay", "daysToScheduleButtonLabelDisplay", "", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;", "scheduleDayList", "helpIconLink", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;", "nextState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDaysToScheduleDescriptionText", "getDaysToScheduleDescriptionText$annotations", "()V", "getDaysToScheduleTitleDisplay", "getDaysToScheduleTitleDisplay$annotations", "getDaysToScheduleButtonLabelDisplay", "getDaysToScheduleButtonLabelDisplay$annotations", "Ljava/util/List;", "getScheduleDayList", "getHelpIconLink", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;", "getNextState", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RepeatDaysDto {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("days_to_schedule_button_text_display")
    private final String daysToScheduleButtonLabelDisplay;

    @SerializedName("days_to_schedule_body_text_display")
    private final String daysToScheduleDescriptionText;

    @SerializedName("days_to_schedule_header_text_display")
    private final String daysToScheduleTitleDisplay;

    @SerializedName("help_icon_link")
    private final String helpIconLink;

    @SerializedName("next_state")
    private final NextStateDto nextState;

    @SerializedName("schedule_day_list")
    private final List<ScheduleDayDto> scheduleDayList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RepeatDaysDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C12000a(0)), null, AbstractC30060g.m92087G(enumC23463i, new C12000a(1))};
    }

    public /* synthetic */ RepeatDaysDto(int i13, String str, String str2, String str3, List list, String str4, NextStateDto nextStateDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, RepeatDaysDto$$serializer.INSTANCE.getDescriptor());
        }
        this.daysToScheduleDescriptionText = str;
        this.daysToScheduleTitleDisplay = str2;
        this.daysToScheduleButtonLabelDisplay = str3;
        this.scheduleDayList = list;
        this.helpIconLink = str4;
        this.nextState = nextStateDto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ScheduleDayDto$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return NextStateDto.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RepeatDaysDto copy$default(RepeatDaysDto repeatDaysDto, String str, String str2, String str3, List list, String str4, NextStateDto nextStateDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = repeatDaysDto.daysToScheduleDescriptionText;
        }
        if ((i13 & 2) != 0) {
            str2 = repeatDaysDto.daysToScheduleTitleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = repeatDaysDto.daysToScheduleButtonLabelDisplay;
        }
        if ((i13 & 8) != 0) {
            list = repeatDaysDto.scheduleDayList;
        }
        if ((i13 & 16) != 0) {
            str4 = repeatDaysDto.helpIconLink;
        }
        if ((i13 & 32) != 0) {
            nextStateDto = repeatDaysDto.nextState;
        }
        String str5 = str4;
        NextStateDto nextStateDto2 = nextStateDto;
        return repeatDaysDto.copy(str, str2, str3, list, str5, nextStateDto2);
    }

    @InterfaceC37143h("days_to_schedule_button_text_display")
    public static /* synthetic */ void getDaysToScheduleButtonLabelDisplay$annotations() {
    }

    @InterfaceC37143h("days_to_schedule_body_text_display")
    public static /* synthetic */ void getDaysToScheduleDescriptionText$annotations() {
    }

    @InterfaceC37143h("days_to_schedule_header_text_display")
    public static /* synthetic */ void getDaysToScheduleTitleDisplay$annotations() {
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(RepeatDaysDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.daysToScheduleDescriptionText);
        output.encodeStringElement(serialDesc, 1, self.daysToScheduleTitleDisplay);
        output.encodeStringElement(serialDesc, 2, self.daysToScheduleButtonLabelDisplay);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.scheduleDayList);
        output.encodeStringElement(serialDesc, 4, self.helpIconLink);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.nextState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDaysToScheduleDescriptionText() {
        return this.daysToScheduleDescriptionText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDaysToScheduleTitleDisplay() {
        return this.daysToScheduleTitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDaysToScheduleButtonLabelDisplay() {
        return this.daysToScheduleButtonLabelDisplay;
    }

    public final List<ScheduleDayDto> component4() {
        return this.scheduleDayList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final NextStateDto getNextState() {
        return this.nextState;
    }

    public final RepeatDaysDto copy(String daysToScheduleDescriptionText, String daysToScheduleTitleDisplay, String daysToScheduleButtonLabelDisplay, List<ScheduleDayDto> scheduleDayList, String helpIconLink, NextStateDto nextState) {
        AbstractC22676k.m65750j(daysToScheduleDescriptionText, "daysToScheduleDescriptionText");
        AbstractC22676k.m65750j(daysToScheduleTitleDisplay, "daysToScheduleTitleDisplay");
        AbstractC22676k.m65750j(daysToScheduleButtonLabelDisplay, "daysToScheduleButtonLabelDisplay");
        AbstractC22676k.m65750j(scheduleDayList, "scheduleDayList");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        AbstractC22676k.m65750j(nextState, "nextState");
        return new RepeatDaysDto(daysToScheduleDescriptionText, daysToScheduleTitleDisplay, daysToScheduleButtonLabelDisplay, scheduleDayList, helpIconLink, nextState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepeatDaysDto)) {
            return false;
        }
        RepeatDaysDto repeatDaysDto = (RepeatDaysDto) other;
        return AbstractC22676k.m65745e(this.daysToScheduleDescriptionText, repeatDaysDto.daysToScheduleDescriptionText) && AbstractC22676k.m65745e(this.daysToScheduleTitleDisplay, repeatDaysDto.daysToScheduleTitleDisplay) && AbstractC22676k.m65745e(this.daysToScheduleButtonLabelDisplay, repeatDaysDto.daysToScheduleButtonLabelDisplay) && AbstractC22676k.m65745e(this.scheduleDayList, repeatDaysDto.scheduleDayList) && AbstractC22676k.m65745e(this.helpIconLink, repeatDaysDto.helpIconLink) && this.nextState == repeatDaysDto.nextState;
    }

    public final String getDaysToScheduleButtonLabelDisplay() {
        return this.daysToScheduleButtonLabelDisplay;
    }

    public final String getDaysToScheduleDescriptionText() {
        return this.daysToScheduleDescriptionText;
    }

    public final String getDaysToScheduleTitleDisplay() {
        return this.daysToScheduleTitleDisplay;
    }

    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    public final NextStateDto getNextState() {
        return this.nextState;
    }

    public final List<ScheduleDayDto> getScheduleDayList() {
        return this.scheduleDayList;
    }

    public int hashCode() {
        return this.nextState.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.daysToScheduleDescriptionText.hashCode() * 31, 31, this.daysToScheduleTitleDisplay), 31, this.daysToScheduleButtonLabelDisplay), 31, this.scheduleDayList), 31, this.helpIconLink);
    }

    public String toString() {
        String str = this.daysToScheduleDescriptionText;
        String str2 = this.daysToScheduleTitleDisplay;
        String str3 = this.daysToScheduleButtonLabelDisplay;
        List<ScheduleDayDto> list = this.scheduleDayList;
        String str4 = this.helpIconLink;
        NextStateDto nextStateDto = this.nextState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RepeatDaysDto(daysToScheduleDescriptionText=", str, ", daysToScheduleTitleDisplay=", str2, ", daysToScheduleButtonLabelDisplay=");
        AbstractC36095b.m114694v(str3, ", scheduleDayList=", ", helpIconLink=", sbM32001t, list);
        sbM32001t.append(str4);
        sbM32001t.append(", nextState=");
        sbM32001t.append(nextStateDto);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public RepeatDaysDto(String daysToScheduleDescriptionText, String daysToScheduleTitleDisplay, String daysToScheduleButtonLabelDisplay, List<ScheduleDayDto> scheduleDayList, String helpIconLink, NextStateDto nextState) {
        AbstractC22676k.m65750j(daysToScheduleDescriptionText, "daysToScheduleDescriptionText");
        AbstractC22676k.m65750j(daysToScheduleTitleDisplay, "daysToScheduleTitleDisplay");
        AbstractC22676k.m65750j(daysToScheduleButtonLabelDisplay, "daysToScheduleButtonLabelDisplay");
        AbstractC22676k.m65750j(scheduleDayList, "scheduleDayList");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        AbstractC22676k.m65750j(nextState, "nextState");
        this.daysToScheduleDescriptionText = daysToScheduleDescriptionText;
        this.daysToScheduleTitleDisplay = daysToScheduleTitleDisplay;
        this.daysToScheduleButtonLabelDisplay = daysToScheduleButtonLabelDisplay;
        this.scheduleDayList = scheduleDayList;
        this.helpIconLink = helpIconLink;
        this.nextState = nextState;
    }
}
