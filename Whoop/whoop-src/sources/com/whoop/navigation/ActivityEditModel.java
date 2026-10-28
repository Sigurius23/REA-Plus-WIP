package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB_\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b\n\u0010#¨\u00068"}, m65681d2 = {"Lcom/whoop/navigation/ActivityEditModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "activityId", "startTime", "endTime", "internalName", "activityScoreType", "flow", "", "isDeletable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/ActivityEditModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/navigation/ActivityEditModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivityId", "getStartTime", "getEndTime", "getInternalName", "getActivityScoreType", "getFlow", "Z", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivityEditModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String activityId;
    private final String activityScoreType;
    private final String endTime;
    private final String flow;
    private final String internalName;
    private final boolean isDeletable;
    private final String startTime;

    /* JADX INFO: renamed from: com.whoop.navigation.ActivityEditModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/ActivityEditModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/ActivityEditModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivityEditModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivityEditModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, ActivityEditModel$$serializer.INSTANCE.getDescriptor());
        }
        this.activityId = str;
        this.startTime = str2;
        this.endTime = str3;
        this.internalName = str4;
        this.activityScoreType = str5;
        this.flow = str6;
        this.isDeletable = z4;
    }

    public static /* synthetic */ ActivityEditModel copy$default(ActivityEditModel activityEditModel, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activityEditModel.activityId;
        }
        if ((i13 & 2) != 0) {
            str2 = activityEditModel.startTime;
        }
        if ((i13 & 4) != 0) {
            str3 = activityEditModel.endTime;
        }
        if ((i13 & 8) != 0) {
            str4 = activityEditModel.internalName;
        }
        if ((i13 & 16) != 0) {
            str5 = activityEditModel.activityScoreType;
        }
        if ((i13 & 32) != 0) {
            str6 = activityEditModel.flow;
        }
        if ((i13 & 64) != 0) {
            z4 = activityEditModel.isDeletable;
        }
        String str7 = str6;
        boolean z13 = z4;
        String str8 = str5;
        String str9 = str3;
        return activityEditModel.copy(str, str2, str9, str4, str8, str7, z13);
    }

    public static final /* synthetic */ void write$Self$navigation_release(ActivityEditModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.activityId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.startTime);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.endTime);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.internalName);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.activityScoreType);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.flow);
        output.encodeBooleanElement(serialDesc, 6, self.isDeletable);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInternalName() {
        return this.internalName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getActivityScoreType() {
        return this.activityScoreType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsDeletable() {
        return this.isDeletable;
    }

    public final ActivityEditModel copy(String activityId, String startTime, String endTime, String internalName, String activityScoreType, String flow, boolean isDeletable) {
        AbstractC22676k.m65750j(activityId, "activityId");
        return new ActivityEditModel(activityId, startTime, endTime, internalName, activityScoreType, flow, isDeletable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityEditModel)) {
            return false;
        }
        ActivityEditModel activityEditModel = (ActivityEditModel) other;
        return AbstractC22676k.m65745e(this.activityId, activityEditModel.activityId) && AbstractC22676k.m65745e(this.startTime, activityEditModel.startTime) && AbstractC22676k.m65745e(this.endTime, activityEditModel.endTime) && AbstractC22676k.m65745e(this.internalName, activityEditModel.internalName) && AbstractC22676k.m65745e(this.activityScoreType, activityEditModel.activityScoreType) && AbstractC22676k.m65745e(this.flow, activityEditModel.flow) && this.isDeletable == activityEditModel.isDeletable;
    }

    public final String getActivityId() {
        return this.activityId;
    }

    public final String getActivityScoreType() {
        return this.activityScoreType;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getFlow() {
        return this.flow;
    }

    public final String getInternalName() {
        return this.internalName;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iHashCode = this.activityId.hashCode() * 31;
        String str = this.startTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endTime;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.internalName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.activityScoreType;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.flow;
        return Boolean.hashCode(this.isDeletable) + ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final boolean isDeletable() {
        return this.isDeletable;
    }

    public String toString() {
        String str = this.activityId;
        String str2 = this.startTime;
        String str3 = this.endTime;
        String str4 = this.internalName;
        String str5 = this.activityScoreType;
        String str6 = this.flow;
        boolean z4 = this.isDeletable;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivityEditModel(activityId=", str, ", startTime=", str2, ", endTime=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", internalName=", str4, ", activityScoreType=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", flow=", str6, ", isDeletable=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public ActivityEditModel(String activityId, String str, String str2, String str3, String str4, String str5, boolean z4) {
        AbstractC22676k.m65750j(activityId, "activityId");
        this.activityId = activityId;
        this.startTime = str;
        this.endTime = str2;
        this.internalName = str3;
        this.activityScoreType = str4;
        this.flow = str5;
        this.isDeletable = z4;
    }
}
