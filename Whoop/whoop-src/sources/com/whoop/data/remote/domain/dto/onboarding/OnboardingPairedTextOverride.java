package com.whoop.data.remote.domain.dto.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;", "Landroid/os/Parcelable;", "", "title", "description", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "getCta", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class OnboardingPairedTextOverride implements Parcelable {
    public static final Parcelable.Creator<OnboardingPairedTextOverride> CREATOR = new Creator();
    private final String cta;
    private final String description;
    private final String title;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<OnboardingPairedTextOverride> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingPairedTextOverride createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new OnboardingPairedTextOverride(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingPairedTextOverride[] newArray(int i13) {
            return new OnboardingPairedTextOverride[i13];
        }
    }

    public OnboardingPairedTextOverride(String title, String description, String cta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(cta, "cta");
        this.title = title;
        this.description = description;
        this.cta = cta;
    }

    public static /* synthetic */ OnboardingPairedTextOverride copy$default(OnboardingPairedTextOverride onboardingPairedTextOverride, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = onboardingPairedTextOverride.title;
        }
        if ((i13 & 2) != 0) {
            str2 = onboardingPairedTextOverride.description;
        }
        if ((i13 & 4) != 0) {
            str3 = onboardingPairedTextOverride.cta;
        }
        return onboardingPairedTextOverride.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    public final OnboardingPairedTextOverride copy(String title, String description, String cta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(cta, "cta");
        return new OnboardingPairedTextOverride(title, description, cta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingPairedTextOverride)) {
            return false;
        }
        OnboardingPairedTextOverride onboardingPairedTextOverride = (OnboardingPairedTextOverride) other;
        return AbstractC22676k.m65745e(this.title, onboardingPairedTextOverride.title) && AbstractC22676k.m65745e(this.description, onboardingPairedTextOverride.description) && AbstractC22676k.m65745e(this.cta, onboardingPairedTextOverride.cta);
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.cta.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.cta, ")", AbstractC11895b.m32001t("OnboardingPairedTextOverride(title=", this.title, ", description=", this.description, ", cta="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.cta);
    }
}
