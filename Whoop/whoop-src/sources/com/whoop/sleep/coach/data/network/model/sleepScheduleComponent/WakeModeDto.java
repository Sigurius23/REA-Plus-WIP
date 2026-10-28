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
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
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
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b*\u0010\u0019¨\u0006-"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;", "", "", "alarmModeLabelDisplay", "", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeTypeDto;", "alarmModeTypeList", "helpIconLink", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAlarmModeLabelDisplay", "Ljava/util/List;", "getAlarmModeTypeList", "getHelpIconLink", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WakeModeDto {

    @SerializedName("alarm_mode_label_display")
    private final String alarmModeLabelDisplay;

    @SerializedName("alarm_mode_type_list")
    private final List<AlarmModeTypeDto> alarmModeTypeList;

    @SerializedName("help_icon_link")
    private final String helpIconLink;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12000a(7)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WakeModeDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WakeModeDto(int i13, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, WakeModeDto$$serializer.INSTANCE.getDescriptor());
        }
        this.alarmModeLabelDisplay = str;
        this.alarmModeTypeList = list;
        this.helpIconLink = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AlarmModeTypeDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WakeModeDto copy$default(WakeModeDto wakeModeDto, String str, List list, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = wakeModeDto.alarmModeLabelDisplay;
        }
        if ((i13 & 2) != 0) {
            list = wakeModeDto.alarmModeTypeList;
        }
        if ((i13 & 4) != 0) {
            str2 = wakeModeDto.helpIconLink;
        }
        return wakeModeDto.copy(str, list, str2);
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(WakeModeDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.alarmModeLabelDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.alarmModeTypeList);
        output.encodeStringElement(serialDesc, 2, self.helpIconLink);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlarmModeLabelDisplay() {
        return this.alarmModeLabelDisplay;
    }

    public final List<AlarmModeTypeDto> component2() {
        return this.alarmModeTypeList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    public final WakeModeDto copy(String alarmModeLabelDisplay, List<AlarmModeTypeDto> alarmModeTypeList, String helpIconLink) {
        AbstractC22676k.m65750j(alarmModeLabelDisplay, "alarmModeLabelDisplay");
        AbstractC22676k.m65750j(alarmModeTypeList, "alarmModeTypeList");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        return new WakeModeDto(alarmModeLabelDisplay, alarmModeTypeList, helpIconLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WakeModeDto)) {
            return false;
        }
        WakeModeDto wakeModeDto = (WakeModeDto) other;
        return AbstractC22676k.m65745e(this.alarmModeLabelDisplay, wakeModeDto.alarmModeLabelDisplay) && AbstractC22676k.m65745e(this.alarmModeTypeList, wakeModeDto.alarmModeTypeList) && AbstractC22676k.m65745e(this.helpIconLink, wakeModeDto.helpIconLink);
    }

    public final String getAlarmModeLabelDisplay() {
        return this.alarmModeLabelDisplay;
    }

    public final List<AlarmModeTypeDto> getAlarmModeTypeList() {
        return this.alarmModeTypeList;
    }

    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    public int hashCode() {
        return this.helpIconLink.hashCode() + AbstractC11895b.m31983b(this.alarmModeLabelDisplay.hashCode() * 31, 31, this.alarmModeTypeList);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.helpIconLink, ")", AbstractC30802r.m94766o("WakeModeDto(alarmModeLabelDisplay=", this.alarmModeLabelDisplay, ", alarmModeTypeList=", ", helpIconLink=", this.alarmModeTypeList));
    }

    public WakeModeDto(String alarmModeLabelDisplay, List<AlarmModeTypeDto> alarmModeTypeList, String helpIconLink) {
        AbstractC22676k.m65750j(alarmModeLabelDisplay, "alarmModeLabelDisplay");
        AbstractC22676k.m65750j(alarmModeTypeList, "alarmModeTypeList");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        this.alarmModeLabelDisplay = alarmModeLabelDisplay;
        this.alarmModeTypeList = alarmModeTypeList;
        this.helpIconLink = helpIconLink;
    }
}
