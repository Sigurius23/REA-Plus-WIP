package com.whoop.domain.model.teams;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import c13.AbstractC3855a;
import com.whoop.p069ui.ScoreContext;
import com.whoop.service.network.model.UserState;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010$J|\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010 J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0016J\u001a\u00100\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u00105R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010 \"\u0004\b8\u00109R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\"\"\u0004\b<\u0010=R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010$\"\u0004\b@\u0010AR$\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010>\u001a\u0004\bB\u0010$\"\u0004\bC\u0010AR$\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010>\u001a\u0004\bD\u0010$\"\u0004\bE\u0010AR$\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010>\u001a\u0004\bF\u0010$\"\u0004\bG\u0010AR$\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010>\u001a\u0004\bH\u0010$\"\u0004\bI\u0010AR$\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010>\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010A¨\u0006L"}, m65681d2 = {"Lcom/whoop/domain/model/teams/TeamPrivacyProfile;", "Landroid/os/Parcelable;", "", "id", "", "name", "", "basic", "Lcom/whoop/domain/model/teams/PrivacyType;", "stats", "comps", "overview", "intensity", "recovery", UserState.States.SLEEP, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;)V", "Lcom/whoop/ui/ScoreContext;", "scoreContext", "forContext", "(Lcom/whoop/ui/ScoreContext;)Lcom/whoop/domain/model/teams/PrivacyType;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/whoop/domain/model/teams/PrivacyType;", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;)Lcom/whoop/domain/model/teams/TeamPrivacyProfile;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getBasic", "setBasic", "(Ljava/lang/Boolean;)V", "Lcom/whoop/domain/model/teams/PrivacyType;", "getStats", "setStats", "(Lcom/whoop/domain/model/teams/PrivacyType;)V", "getComps", "setComps", "getOverview", "setOverview", "getIntensity", "setIntensity", "getRecovery", "setRecovery", "getSleep", "setSleep", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class TeamPrivacyProfile implements Parcelable {
    public static final Parcelable.Creator<TeamPrivacyProfile> CREATOR = new Creator();
    private Boolean basic;
    private PrivacyType comps;
    private Integer id;
    private PrivacyType intensity;
    private String name;
    private PrivacyType overview;
    private PrivacyType recovery;
    private PrivacyType sleep;
    private PrivacyType stats;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<TeamPrivacyProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeamPrivacyProfile createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            AbstractC22676k.m65750j(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TeamPrivacyProfile(numValueOf, string, boolValueOf, parcel.readInt() == 0 ? null : PrivacyType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PrivacyType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PrivacyType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PrivacyType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PrivacyType.valueOf(parcel.readString()), parcel.readInt() != 0 ? PrivacyType.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeamPrivacyProfile[] newArray(int i13) {
            return new TeamPrivacyProfile[i13];
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScoreContext.values().length];
            try {
                iArr[ScoreContext.STRAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScoreContext.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScoreContext.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TeamPrivacyProfile() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public static /* synthetic */ TeamPrivacyProfile copy$default(TeamPrivacyProfile teamPrivacyProfile, Integer num, String str, Boolean bool, PrivacyType privacyType, PrivacyType privacyType2, PrivacyType privacyType3, PrivacyType privacyType4, PrivacyType privacyType5, PrivacyType privacyType6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = teamPrivacyProfile.id;
        }
        if ((i13 & 2) != 0) {
            str = teamPrivacyProfile.name;
        }
        if ((i13 & 4) != 0) {
            bool = teamPrivacyProfile.basic;
        }
        if ((i13 & 8) != 0) {
            privacyType = teamPrivacyProfile.stats;
        }
        if ((i13 & 16) != 0) {
            privacyType2 = teamPrivacyProfile.comps;
        }
        if ((i13 & 32) != 0) {
            privacyType3 = teamPrivacyProfile.overview;
        }
        if ((i13 & 64) != 0) {
            privacyType4 = teamPrivacyProfile.intensity;
        }
        if ((i13 & 128) != 0) {
            privacyType5 = teamPrivacyProfile.recovery;
        }
        if ((i13 & 256) != 0) {
            privacyType6 = teamPrivacyProfile.sleep;
        }
        PrivacyType privacyType7 = privacyType5;
        PrivacyType privacyType8 = privacyType6;
        PrivacyType privacyType9 = privacyType3;
        PrivacyType privacyType10 = privacyType4;
        PrivacyType privacyType11 = privacyType2;
        Boolean bool2 = bool;
        return teamPrivacyProfile.copy(num, str, bool2, privacyType, privacyType11, privacyType9, privacyType10, privacyType7, privacyType8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getBasic() {
        return this.basic;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PrivacyType getStats() {
        return this.stats;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PrivacyType getComps() {
        return this.comps;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PrivacyType getOverview() {
        return this.overview;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PrivacyType getIntensity() {
        return this.intensity;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PrivacyType getRecovery() {
        return this.recovery;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final PrivacyType getSleep() {
        return this.sleep;
    }

    public final TeamPrivacyProfile copy(Integer id4, String name, Boolean basic, PrivacyType stats, PrivacyType comps, PrivacyType overview, PrivacyType intensity, PrivacyType recovery, PrivacyType sleep) {
        return new TeamPrivacyProfile(id4, name, basic, stats, comps, overview, intensity, recovery, sleep);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamPrivacyProfile)) {
            return false;
        }
        TeamPrivacyProfile teamPrivacyProfile = (TeamPrivacyProfile) other;
        return AbstractC22676k.m65745e(this.id, teamPrivacyProfile.id) && AbstractC22676k.m65745e(this.name, teamPrivacyProfile.name) && AbstractC22676k.m65745e(this.basic, teamPrivacyProfile.basic) && this.stats == teamPrivacyProfile.stats && this.comps == teamPrivacyProfile.comps && this.overview == teamPrivacyProfile.overview && this.intensity == teamPrivacyProfile.intensity && this.recovery == teamPrivacyProfile.recovery && this.sleep == teamPrivacyProfile.sleep;
    }

    public final PrivacyType forContext(ScoreContext scoreContext) {
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        int i13 = WhenMappings.$EnumSwitchMapping$0[scoreContext.ordinal()];
        if (i13 == 1) {
            PrivacyType privacyType = this.intensity;
            return privacyType == null ? PrivacyType.DETAIL : privacyType;
        }
        if (i13 == 2) {
            PrivacyType privacyType2 = this.recovery;
            return privacyType2 == null ? PrivacyType.DETAIL : privacyType2;
        }
        if (i13 != 3) {
            throw new IllegalArgumentException();
        }
        PrivacyType privacyType3 = this.sleep;
        return privacyType3 == null ? PrivacyType.DETAIL : privacyType3;
    }

    public final Boolean getBasic() {
        return this.basic;
    }

    public final PrivacyType getComps() {
        return this.comps;
    }

    public final Integer getId() {
        return this.id;
    }

    public final PrivacyType getIntensity() {
        return this.intensity;
    }

    public final String getName() {
        return this.name;
    }

    public final PrivacyType getOverview() {
        return this.overview;
    }

    public final PrivacyType getRecovery() {
        return this.recovery;
    }

    public final PrivacyType getSleep() {
        return this.sleep;
    }

    public final PrivacyType getStats() {
        return this.stats;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.basic;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        PrivacyType privacyType = this.stats;
        int iHashCode4 = (iHashCode3 + (privacyType == null ? 0 : privacyType.hashCode())) * 31;
        PrivacyType privacyType2 = this.comps;
        int iHashCode5 = (iHashCode4 + (privacyType2 == null ? 0 : privacyType2.hashCode())) * 31;
        PrivacyType privacyType3 = this.overview;
        int iHashCode6 = (iHashCode5 + (privacyType3 == null ? 0 : privacyType3.hashCode())) * 31;
        PrivacyType privacyType4 = this.intensity;
        int iHashCode7 = (iHashCode6 + (privacyType4 == null ? 0 : privacyType4.hashCode())) * 31;
        PrivacyType privacyType5 = this.recovery;
        int iHashCode8 = (iHashCode7 + (privacyType5 == null ? 0 : privacyType5.hashCode())) * 31;
        PrivacyType privacyType6 = this.sleep;
        return iHashCode8 + (privacyType6 != null ? privacyType6.hashCode() : 0);
    }

    public final void setBasic(Boolean bool) {
        this.basic = bool;
    }

    public final void setComps(PrivacyType privacyType) {
        this.comps = privacyType;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final void setIntensity(PrivacyType privacyType) {
        this.intensity = privacyType;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOverview(PrivacyType privacyType) {
        this.overview = privacyType;
    }

    public final void setRecovery(PrivacyType privacyType) {
        this.recovery = privacyType;
    }

    public final void setSleep(PrivacyType privacyType) {
        this.sleep = privacyType;
    }

    public final void setStats(PrivacyType privacyType) {
        this.stats = privacyType;
    }

    public String toString() {
        Integer num = this.id;
        String str = this.name;
        Boolean bool = this.basic;
        PrivacyType privacyType = this.stats;
        PrivacyType privacyType2 = this.comps;
        PrivacyType privacyType3 = this.overview;
        PrivacyType privacyType4 = this.intensity;
        PrivacyType privacyType5 = this.recovery;
        PrivacyType privacyType6 = this.sleep;
        StringBuilder sbM95643s = AbstractC31061c.m95643s("TeamPrivacyProfile(id=", ", name=", num, str, ", basic=");
        sbM95643s.append(bool);
        sbM95643s.append(", stats=");
        sbM95643s.append(privacyType);
        sbM95643s.append(", comps=");
        sbM95643s.append(privacyType2);
        sbM95643s.append(", overview=");
        sbM95643s.append(privacyType3);
        sbM95643s.append(", intensity=");
        sbM95643s.append(privacyType4);
        sbM95643s.append(", recovery=");
        sbM95643s.append(privacyType5);
        sbM95643s.append(", sleep=");
        sbM95643s.append(privacyType6);
        sbM95643s.append(")");
        return sbM95643s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.name);
        Boolean bool = this.basic;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
        PrivacyType privacyType = this.stats;
        if (privacyType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(privacyType.name());
        }
        PrivacyType privacyType2 = this.comps;
        if (privacyType2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(privacyType2.name());
        }
        PrivacyType privacyType3 = this.overview;
        if (privacyType3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(privacyType3.name());
        }
        PrivacyType privacyType4 = this.intensity;
        if (privacyType4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(privacyType4.name());
        }
        PrivacyType privacyType5 = this.recovery;
        if (privacyType5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(privacyType5.name());
        }
        PrivacyType privacyType6 = this.sleep;
        if (privacyType6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(privacyType6.name());
        }
    }

    public TeamPrivacyProfile(Integer num, String str, Boolean bool, PrivacyType privacyType, PrivacyType privacyType2, PrivacyType privacyType3, PrivacyType privacyType4, PrivacyType privacyType5, PrivacyType privacyType6) {
        this.id = num;
        this.name = str;
        this.basic = bool;
        this.stats = privacyType;
        this.comps = privacyType2;
        this.overview = privacyType3;
        this.intensity = privacyType4;
        this.recovery = privacyType5;
        this.sleep = privacyType6;
    }

    public /* synthetic */ TeamPrivacyProfile(Integer num, String str, Boolean bool, PrivacyType privacyType, PrivacyType privacyType2, PrivacyType privacyType3, PrivacyType privacyType4, PrivacyType privacyType5, PrivacyType privacyType6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : bool, (i13 & 8) != 0 ? PrivacyType.DETAIL : privacyType, (i13 & 16) != 0 ? PrivacyType.DETAIL : privacyType2, (i13 & 32) != 0 ? PrivacyType.DETAIL : privacyType3, (i13 & 64) != 0 ? PrivacyType.DETAIL : privacyType4, (i13 & 128) != 0 ? PrivacyType.DETAIL : privacyType5, (i13 & 256) != 0 ? PrivacyType.DETAIL : privacyType6);
    }
}
