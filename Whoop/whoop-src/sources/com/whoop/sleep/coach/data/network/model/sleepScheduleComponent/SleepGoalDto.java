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
import p000.AbstractC30802r;
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
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JH\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b2\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b3\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\"¨\u00068"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;", "", "", "sleepGoalTextDisplay", "", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;", "sleepGoalListDto", "sleepGoalButtonTextDisplay", "helpIconLink", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;", "nextState", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSleepGoalTextDisplay", "Ljava/util/List;", "getSleepGoalListDto", "getSleepGoalListDto$annotations", "()V", "getSleepGoalButtonTextDisplay", "getHelpIconLink", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;", "getNextState", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepGoalDto {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("help_icon_link")
    private final String helpIconLink;

    @SerializedName("next_state")
    private final NextStateDto nextState;

    @SerializedName("sleep_goal_button_text_display")
    private final String sleepGoalButtonTextDisplay;

    @SerializedName("sleep_goal_list")
    private final List<SleepGoalTypeDto> sleepGoalListDto;

    @SerializedName("sleep_goal_text_display")
    private final String sleepGoalTextDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepGoalDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C12000a(3)), null, null, AbstractC30060g.m92087G(enumC23463i, new C12000a(4))};
    }

    public /* synthetic */ SleepGoalDto(int i13, String str, List list, String str2, String str3, NextStateDto nextStateDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SleepGoalDto$$serializer.INSTANCE.getDescriptor());
        }
        this.sleepGoalTextDisplay = str;
        this.sleepGoalListDto = list;
        this.sleepGoalButtonTextDisplay = str2;
        this.helpIconLink = str3;
        this.nextState = nextStateDto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SleepGoalTypeDto$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return NextStateDto.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepGoalDto copy$default(SleepGoalDto sleepGoalDto, String str, List list, String str2, String str3, NextStateDto nextStateDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sleepGoalDto.sleepGoalTextDisplay;
        }
        if ((i13 & 2) != 0) {
            list = sleepGoalDto.sleepGoalListDto;
        }
        if ((i13 & 4) != 0) {
            str2 = sleepGoalDto.sleepGoalButtonTextDisplay;
        }
        if ((i13 & 8) != 0) {
            str3 = sleepGoalDto.helpIconLink;
        }
        if ((i13 & 16) != 0) {
            nextStateDto = sleepGoalDto.nextState;
        }
        NextStateDto nextStateDto2 = nextStateDto;
        String str4 = str2;
        return sleepGoalDto.copy(str, list, str4, str3, nextStateDto2);
    }

    @InterfaceC37143h("sleep_goal_list")
    public static /* synthetic */ void getSleepGoalListDto$annotations() {
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(SleepGoalDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.sleepGoalTextDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sleepGoalListDto);
        output.encodeStringElement(serialDesc, 2, self.sleepGoalButtonTextDisplay);
        output.encodeStringElement(serialDesc, 3, self.helpIconLink);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.nextState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSleepGoalTextDisplay() {
        return this.sleepGoalTextDisplay;
    }

    public final List<SleepGoalTypeDto> component2() {
        return this.sleepGoalListDto;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSleepGoalButtonTextDisplay() {
        return this.sleepGoalButtonTextDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NextStateDto getNextState() {
        return this.nextState;
    }

    public final SleepGoalDto copy(String sleepGoalTextDisplay, List<SleepGoalTypeDto> sleepGoalListDto, String sleepGoalButtonTextDisplay, String helpIconLink, NextStateDto nextState) {
        AbstractC22676k.m65750j(sleepGoalTextDisplay, "sleepGoalTextDisplay");
        AbstractC22676k.m65750j(sleepGoalListDto, "sleepGoalListDto");
        AbstractC22676k.m65750j(sleepGoalButtonTextDisplay, "sleepGoalButtonTextDisplay");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        AbstractC22676k.m65750j(nextState, "nextState");
        return new SleepGoalDto(sleepGoalTextDisplay, sleepGoalListDto, sleepGoalButtonTextDisplay, helpIconLink, nextState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepGoalDto)) {
            return false;
        }
        SleepGoalDto sleepGoalDto = (SleepGoalDto) other;
        return AbstractC22676k.m65745e(this.sleepGoalTextDisplay, sleepGoalDto.sleepGoalTextDisplay) && AbstractC22676k.m65745e(this.sleepGoalListDto, sleepGoalDto.sleepGoalListDto) && AbstractC22676k.m65745e(this.sleepGoalButtonTextDisplay, sleepGoalDto.sleepGoalButtonTextDisplay) && AbstractC22676k.m65745e(this.helpIconLink, sleepGoalDto.helpIconLink) && this.nextState == sleepGoalDto.nextState;
    }

    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    public final NextStateDto getNextState() {
        return this.nextState;
    }

    public final String getSleepGoalButtonTextDisplay() {
        return this.sleepGoalButtonTextDisplay;
    }

    public final List<SleepGoalTypeDto> getSleepGoalListDto() {
        return this.sleepGoalListDto;
    }

    public final String getSleepGoalTextDisplay() {
        return this.sleepGoalTextDisplay;
    }

    public int hashCode() {
        return this.nextState.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.sleepGoalTextDisplay.hashCode() * 31, 31, this.sleepGoalListDto), 31, this.sleepGoalButtonTextDisplay), 31, this.helpIconLink);
    }

    public String toString() {
        String str = this.sleepGoalTextDisplay;
        List<SleepGoalTypeDto> list = this.sleepGoalListDto;
        String str2 = this.sleepGoalButtonTextDisplay;
        String str3 = this.helpIconLink;
        NextStateDto nextStateDto = this.nextState;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("SleepGoalDto(sleepGoalTextDisplay=", str, ", sleepGoalListDto=", ", sleepGoalButtonTextDisplay=", list);
        AbstractC11266d.m30444B(sbM94766o, str2, ", helpIconLink=", str3, ", nextState=");
        sbM94766o.append(nextStateDto);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public SleepGoalDto(String sleepGoalTextDisplay, List<SleepGoalTypeDto> sleepGoalListDto, String sleepGoalButtonTextDisplay, String helpIconLink, NextStateDto nextState) {
        AbstractC22676k.m65750j(sleepGoalTextDisplay, "sleepGoalTextDisplay");
        AbstractC22676k.m65750j(sleepGoalListDto, "sleepGoalListDto");
        AbstractC22676k.m65750j(sleepGoalButtonTextDisplay, "sleepGoalButtonTextDisplay");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        AbstractC22676k.m65750j(nextState, "nextState");
        this.sleepGoalTextDisplay = sleepGoalTextDisplay;
        this.sleepGoalListDto = sleepGoalListDto;
        this.sleepGoalButtonTextDisplay = sleepGoalButtonTextDisplay;
        this.helpIconLink = helpIconLink;
        this.nextState = nextState;
    }
}
