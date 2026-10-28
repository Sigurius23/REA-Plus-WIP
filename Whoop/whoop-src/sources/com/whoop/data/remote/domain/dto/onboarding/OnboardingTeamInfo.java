package com.whoop.data.remote.domain.dto.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;", "Landroid/os/Parcelable;", "", "name", "avatarUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getAvatarUrl", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class OnboardingTeamInfo implements Parcelable {
    public static final Parcelable.Creator<OnboardingTeamInfo> CREATOR = new Creator();
    private final String avatarUrl;
    private final String name;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<OnboardingTeamInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingTeamInfo createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new OnboardingTeamInfo(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingTeamInfo[] newArray(int i13) {
            return new OnboardingTeamInfo[i13];
        }
    }

    public OnboardingTeamInfo(String name, String avatarUrl) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(avatarUrl, "avatarUrl");
        this.name = name;
        this.avatarUrl = avatarUrl;
    }

    public static /* synthetic */ OnboardingTeamInfo copy$default(OnboardingTeamInfo onboardingTeamInfo, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = onboardingTeamInfo.name;
        }
        if ((i13 & 2) != 0) {
            str2 = onboardingTeamInfo.avatarUrl;
        }
        return onboardingTeamInfo.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final OnboardingTeamInfo copy(String name, String avatarUrl) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(avatarUrl, "avatarUrl");
        return new OnboardingTeamInfo(name, avatarUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingTeamInfo)) {
            return false;
        }
        OnboardingTeamInfo onboardingTeamInfo = (OnboardingTeamInfo) other;
        return AbstractC22676k.m65745e(this.name, onboardingTeamInfo.name) && AbstractC22676k.m65745e(this.avatarUrl, onboardingTeamInfo.avatarUrl);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.avatarUrl.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("OnboardingTeamInfo(name=", this.name, ", avatarUrl=", this.avatarUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.avatarUrl);
    }
}
