package com.whoop.core.details.network.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJT\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00062"}, m65681d2 = {"Lcom/whoop/core/details/network/model/StatRowModel;", "", "", "avgHrDisplay", "repsDisplay", "volumeDisplay", "weightDisplay", "intensityDisplay", "achievementIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/StatRowModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/StatRowModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAvgHrDisplay", "getRepsDisplay", "getVolumeDisplay", "getWeightDisplay", "getIntensityDisplay", "getAchievementIcon", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StatRowModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String achievementIcon;
    private final String avgHrDisplay;
    private final String intensityDisplay;
    private final String repsDisplay;
    private final String volumeDisplay;
    private final String weightDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/StatRowModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/StatRowModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StatRowModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StatRowModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, StatRowModel$$serializer.INSTANCE.getDescriptor());
        }
        this.avgHrDisplay = str;
        this.repsDisplay = str2;
        this.volumeDisplay = str3;
        this.weightDisplay = str4;
        if ((i13 & 16) == 0) {
            this.intensityDisplay = null;
        } else {
            this.intensityDisplay = str5;
        }
        if ((i13 & 32) == 0) {
            this.achievementIcon = null;
        } else {
            this.achievementIcon = str6;
        }
    }

    public static /* synthetic */ StatRowModel copy$default(StatRowModel statRowModel, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = statRowModel.avgHrDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = statRowModel.repsDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = statRowModel.volumeDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = statRowModel.weightDisplay;
        }
        if ((i13 & 16) != 0) {
            str5 = statRowModel.intensityDisplay;
        }
        if ((i13 & 32) != 0) {
            str6 = statRowModel.achievementIcon;
        }
        String str7 = str5;
        String str8 = str6;
        return statRowModel.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$core_details_release(StatRowModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.avgHrDisplay);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.repsDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.volumeDisplay);
        output.encodeStringElement(serialDesc, 3, self.weightDisplay);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.intensityDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.intensityDisplay);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.achievementIcon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.achievementIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvgHrDisplay() {
        return this.avgHrDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRepsDisplay() {
        return this.repsDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVolumeDisplay() {
        return this.volumeDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWeightDisplay() {
        return this.weightDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIntensityDisplay() {
        return this.intensityDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAchievementIcon() {
        return this.achievementIcon;
    }

    public final StatRowModel copy(String avgHrDisplay, String repsDisplay, String volumeDisplay, String weightDisplay, String intensityDisplay, String achievementIcon) {
        AbstractC22676k.m65750j(avgHrDisplay, "avgHrDisplay");
        AbstractC22676k.m65750j(weightDisplay, "weightDisplay");
        return new StatRowModel(avgHrDisplay, repsDisplay, volumeDisplay, weightDisplay, intensityDisplay, achievementIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatRowModel)) {
            return false;
        }
        StatRowModel statRowModel = (StatRowModel) other;
        return AbstractC22676k.m65745e(this.avgHrDisplay, statRowModel.avgHrDisplay) && AbstractC22676k.m65745e(this.repsDisplay, statRowModel.repsDisplay) && AbstractC22676k.m65745e(this.volumeDisplay, statRowModel.volumeDisplay) && AbstractC22676k.m65745e(this.weightDisplay, statRowModel.weightDisplay) && AbstractC22676k.m65745e(this.intensityDisplay, statRowModel.intensityDisplay) && AbstractC22676k.m65745e(this.achievementIcon, statRowModel.achievementIcon);
    }

    public final String getAchievementIcon() {
        return this.achievementIcon;
    }

    public final String getAvgHrDisplay() {
        return this.avgHrDisplay;
    }

    public final String getIntensityDisplay() {
        return this.intensityDisplay;
    }

    public final String getRepsDisplay() {
        return this.repsDisplay;
    }

    public final String getVolumeDisplay() {
        return this.volumeDisplay;
    }

    public final String getWeightDisplay() {
        return this.weightDisplay;
    }

    public int hashCode() {
        int iHashCode = this.avgHrDisplay.hashCode() * 31;
        String str = this.repsDisplay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.volumeDisplay;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.weightDisplay);
        String str3 = this.intensityDisplay;
        int iHashCode3 = (iM30450d + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.achievementIcon;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.avgHrDisplay;
        String str2 = this.repsDisplay;
        String str3 = this.volumeDisplay;
        String str4 = this.weightDisplay;
        String str5 = this.intensityDisplay;
        String str6 = this.achievementIcon;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StatRowModel(avgHrDisplay=", str, ", repsDisplay=", str2, ", volumeDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", weightDisplay=", str4, ", intensityDisplay=");
        return AbstractC11266d.m30464r(sbM32001t, str5, ", achievementIcon=", str6, ")");
    }

    public StatRowModel(String avgHrDisplay, String str, String str2, String weightDisplay, String str3, String str4) {
        AbstractC22676k.m65750j(avgHrDisplay, "avgHrDisplay");
        AbstractC22676k.m65750j(weightDisplay, "weightDisplay");
        this.avgHrDisplay = avgHrDisplay;
        this.repsDisplay = str;
        this.volumeDisplay = str2;
        this.weightDisplay = weightDisplay;
        this.intensityDisplay = str3;
        this.achievementIcon = str4;
    }

    public /* synthetic */ StatRowModel(String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6);
    }
}
