package com.whoop.service.network.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.p069ui.activities.realtime.SportCategory;
import ih0.AbstractC18489d0;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJb\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0011J\u001a\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b\u000b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b\f\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b4\u0010\u001a¨\u00065"}, m65681d2 = {"Lcom/whoop/service/network/model/Sport;", "Landroid/os/Parcelable;", "", "id", "", "name", "", "hasGps", "iconUrl", "Lcom/whoop/ui/activities/realtime/SportCategory;", "category", "isCurrent", "isHasSurvey", "activityTypeInternalName", "<init>", "(ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "()Lcom/whoop/ui/activities/realtime/SportCategory;", "component6", "component7", "component8", "copy", "(ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;)Lcom/whoop/service/network/model/Sport;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "Z", "getHasGps", "getIconUrl", "Lcom/whoop/ui/activities/realtime/SportCategory;", "getCategory", "getActivityTypeInternalName", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class Sport implements Parcelable {
    public static final Parcelable.Creator<Sport> CREATOR = new Creator();
    private final String activityTypeInternalName;
    private final SportCategory category;
    private final boolean hasGps;
    private final String iconUrl;
    private final int id;
    private final boolean isCurrent;
    private final boolean isHasSurvey;
    private final String name;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<Sport> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Sport createFromParcel(Parcel parcel) {
            boolean z4;
            boolean z13;
            boolean z14;
            AbstractC22676k.m65750j(parcel, "parcel");
            int i13 = parcel.readInt();
            String string = parcel.readString();
            boolean z15 = false;
            if (parcel.readInt() != 0) {
                z15 = true;
                z4 = true;
            } else {
                z4 = true;
            }
            String string2 = parcel.readString();
            SportCategory sportCategoryValueOf = SportCategory.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z13 = z4;
                z14 = z13;
            } else {
                z13 = z4;
                z14 = z15;
            }
            if (parcel.readInt() == 0) {
                z13 = false;
            }
            return new Sport(i13, string, z15, string2, sportCategoryValueOf, z14, z13, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Sport[] newArray(int i13) {
            return new Sport[i13];
        }
    }

    public Sport(int i13, String name, boolean z4, String iconUrl, SportCategory category, boolean z13, boolean z14, String str) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(category, "category");
        this.id = i13;
        this.name = name;
        this.hasGps = z4;
        this.iconUrl = iconUrl;
        this.category = category;
        this.isCurrent = z13;
        this.isHasSurvey = z14;
        this.activityTypeInternalName = str;
    }

    public static /* synthetic */ Sport copy$default(Sport sport, int i13, String str, boolean z4, String str2, SportCategory sportCategory, boolean z13, boolean z14, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = sport.id;
        }
        if ((i14 & 2) != 0) {
            str = sport.name;
        }
        if ((i14 & 4) != 0) {
            z4 = sport.hasGps;
        }
        if ((i14 & 8) != 0) {
            str2 = sport.iconUrl;
        }
        if ((i14 & 16) != 0) {
            sportCategory = sport.category;
        }
        if ((i14 & 32) != 0) {
            z13 = sport.isCurrent;
        }
        if ((i14 & 64) != 0) {
            z14 = sport.isHasSurvey;
        }
        if ((i14 & 128) != 0) {
            str3 = sport.activityTypeInternalName;
        }
        boolean z15 = z14;
        String str4 = str3;
        SportCategory sportCategory2 = sportCategory;
        boolean z16 = z13;
        return sport.copy(i13, str, z4, str2, sportCategory2, z16, z15, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasGps() {
        return this.hasGps;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SportCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsHasSurvey() {
        return this.isHasSurvey;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getActivityTypeInternalName() {
        return this.activityTypeInternalName;
    }

    public final Sport copy(int id4, String name, boolean hasGps, String iconUrl, SportCategory category, boolean isCurrent, boolean isHasSurvey, String activityTypeInternalName) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(category, "category");
        return new Sport(id4, name, hasGps, iconUrl, category, isCurrent, isHasSurvey, activityTypeInternalName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sport)) {
            return false;
        }
        Sport sport = (Sport) other;
        return this.id == sport.id && AbstractC22676k.m65745e(this.name, sport.name) && this.hasGps == sport.hasGps && AbstractC22676k.m65745e(this.iconUrl, sport.iconUrl) && this.category == sport.category && this.isCurrent == sport.isCurrent && this.isHasSurvey == sport.isHasSurvey && AbstractC22676k.m65745e(this.activityTypeInternalName, sport.activityTypeInternalName);
    }

    public final String getActivityTypeInternalName() {
        return this.activityTypeInternalName;
    }

    public final SportCategory getCategory() {
        return this.category;
    }

    public final boolean getHasGps() {
        return this.hasGps;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.category.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.hasGps), 31, this.iconUrl)) * 31, 31, this.isCurrent), 31, this.isHasSurvey);
        String str = this.activityTypeInternalName;
        return iM8289b + (str == null ? 0 : str.hashCode());
    }

    public final boolean isCurrent() {
        return this.isCurrent;
    }

    public final boolean isHasSurvey() {
        return this.isHasSurvey;
    }

    public String toString() {
        int i13 = this.id;
        String str = this.name;
        boolean z4 = this.hasGps;
        String str2 = this.iconUrl;
        SportCategory sportCategory = this.category;
        boolean z13 = this.isCurrent;
        boolean z14 = this.isHasSurvey;
        String str3 = this.activityTypeInternalName;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "Sport(id=", ", name=", str, ", hasGps=");
        AbstractC38963t7.m124391u(sbM53373n, z4, ", iconUrl=", str2, ", category=");
        sbM53373n.append(sportCategory);
        sbM53373n.append(", isCurrent=");
        sbM53373n.append(z13);
        sbM53373n.append(", isHasSurvey=");
        return AbstractC21702c.m61139j(sbM53373n, z14, ", activityTypeInternalName=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.hasGps ? 1 : 0);
        dest.writeString(this.iconUrl);
        dest.writeString(this.category.name());
        dest.writeInt(this.isCurrent ? 1 : 0);
        dest.writeInt(this.isHasSurvey ? 1 : 0);
        dest.writeString(this.activityTypeInternalName);
    }

    public /* synthetic */ Sport(int i13, String str, boolean z4, String str2, SportCategory sportCategory, boolean z13, boolean z14, String str3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, z4, str2, sportCategory, z13, z14, (i14 & 128) != 0 ? null : str3);
    }
}
