package com.whoop.p069ui.teams;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJR\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b7\u0010\u001b¨\u0006;"}, m65681d2 = {"Lcom/whoop/ui/teams/LeaderActivityDto;", "", "", "name", "", "activityId", "sportId", "", "strain", "avgStrain", "cycleDay", "<init>", "(Ljava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/ui/teams/LeaderActivityDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()D", "component5", "()Ljava/lang/Double;", "component6", "copy", "(Ljava/lang/String;IIDLjava/lang/Double;Ljava/lang/String;)Lcom/whoop/ui/teams/LeaderActivityDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "I", "getActivityId", "getSportId", "D", "getStrain", "Ljava/lang/Double;", "getAvgStrain", "getCycleDay", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LeaderActivityDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("activity_id")
    private final int activityId;

    @SerializedName("avg_strain")
    private final Double avgStrain;

    @SerializedName("cycle_day")
    private final String cycleDay;

    @SerializedName("sport_name")
    private final String name;

    @SerializedName("sport_id")
    private final int sportId;

    @SerializedName("strain")
    private final double strain;

    /* JADX INFO: renamed from: com.whoop.ui.teams.LeaderActivityDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ui/teams/LeaderActivityDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ui/teams/LeaderActivityDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LeaderActivityDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LeaderActivityDto(int i13, String str, int i14, int i15, double d3, Double d14, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i13 & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 14, LeaderActivityDto$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        this.activityId = i14;
        this.sportId = i15;
        this.strain = d3;
        if ((i13 & 16) == 0) {
            this.avgStrain = null;
        } else {
            this.avgStrain = d14;
        }
        if ((i13 & 32) == 0) {
            this.cycleDay = null;
        } else {
            this.cycleDay = str2;
        }
    }

    public static /* synthetic */ LeaderActivityDto copy$default(LeaderActivityDto leaderActivityDto, String str, int i13, int i14, double d3, Double d14, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = leaderActivityDto.name;
        }
        if ((i15 & 2) != 0) {
            i13 = leaderActivityDto.activityId;
        }
        if ((i15 & 4) != 0) {
            i14 = leaderActivityDto.sportId;
        }
        if ((i15 & 8) != 0) {
            d3 = leaderActivityDto.strain;
        }
        if ((i15 & 16) != 0) {
            d14 = leaderActivityDto.avgStrain;
        }
        if ((i15 & 32) != 0) {
            str2 = leaderActivityDto.cycleDay;
        }
        double d15 = d3;
        int i16 = i14;
        return leaderActivityDto.copy(str, i13, i16, d15, d14, str2);
    }

    @InterfaceC37143h("sport_name")
    public static /* synthetic */ void getName$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(LeaderActivityDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.name);
        }
        output.encodeIntElement(serialDesc, 1, self.activityId);
        output.encodeIntElement(serialDesc, 2, self.sportId);
        output.encodeDoubleElement(serialDesc, 3, self.strain);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.avgStrain != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, DoubleSerializer.INSTANCE, self.avgStrain);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.cycleDay == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.cycleDay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getStrain() {
        return this.strain;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getAvgStrain() {
        return this.avgStrain;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCycleDay() {
        return this.cycleDay;
    }

    public final LeaderActivityDto copy(String name, int activityId, int sportId, double strain, Double avgStrain, String cycleDay) {
        return new LeaderActivityDto(name, activityId, sportId, strain, avgStrain, cycleDay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaderActivityDto)) {
            return false;
        }
        LeaderActivityDto leaderActivityDto = (LeaderActivityDto) other;
        return AbstractC22676k.m65745e(this.name, leaderActivityDto.name) && this.activityId == leaderActivityDto.activityId && this.sportId == leaderActivityDto.sportId && Double.compare(this.strain, leaderActivityDto.strain) == 0 && AbstractC22676k.m65745e(this.avgStrain, leaderActivityDto.avgStrain) && AbstractC22676k.m65745e(this.cycleDay, leaderActivityDto.cycleDay);
    }

    public final int getActivityId() {
        return this.activityId;
    }

    public final Double getAvgStrain() {
        return this.avgStrain;
    }

    public final String getCycleDay() {
        return this.cycleDay;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSportId() {
        return this.sportId;
    }

    public final double getStrain() {
        return this.strain;
    }

    public int hashCode() {
        String str = this.name;
        int iM48499a = AbstractC17176i.m48499a(AbstractC11266d.m30448b(this.sportId, AbstractC11266d.m30448b(this.activityId, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31, this.strain);
        Double d3 = this.avgStrain;
        int iHashCode = (iM48499a + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str2 = this.cycleDay;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        int i13 = this.activityId;
        int i14 = this.sportId;
        double d3 = this.strain;
        Double d14 = this.avgStrain;
        String str2 = this.cycleDay;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "LeaderActivityDto(name=", str, ", activityId=", ", sportId=");
        sbM30467u.append(i14);
        sbM30467u.append(", strain=");
        sbM30467u.append(d3);
        sbM30467u.append(", avgStrain=");
        sbM30467u.append(d14);
        sbM30467u.append(", cycleDay=");
        sbM30467u.append(str2);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public LeaderActivityDto(String str, int i13, int i14, double d3, Double d14, String str2) {
        this.name = str;
        this.activityId = i13;
        this.sportId = i14;
        this.strain = d3;
        this.avgStrain = d14;
        this.cycleDay = str2;
    }

    public /* synthetic */ LeaderActivityDto(String str, int i13, int i14, double d3, Double d14, String str2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? null : str, i13, i14, d3, (i15 & 16) != 0 ? null : d14, (i15 & 32) != 0 ? null : str2);
    }
}
