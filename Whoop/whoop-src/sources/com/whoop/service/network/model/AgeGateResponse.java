package com.whoop.service.network.model;

import com.google.gson.annotations.SerializedName;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/service/network/model/AgeGateResponse;", "", "title", "", "minAge", "", "subtitle", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMinAge", "()I", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class AgeGateResponse {

    @SerializedName("min_age")
    private final int minAge;
    private final String subtitle;
    private final String title;

    public AgeGateResponse(String title, int i13, String subtitle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.title = title;
        this.minAge = i13;
        this.subtitle = subtitle;
    }

    public static /* synthetic */ AgeGateResponse copy$default(AgeGateResponse ageGateResponse, String str, int i13, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = ageGateResponse.title;
        }
        if ((i14 & 2) != 0) {
            i13 = ageGateResponse.minAge;
        }
        if ((i14 & 4) != 0) {
            str2 = ageGateResponse.subtitle;
        }
        return ageGateResponse.copy(str, i13, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinAge() {
        return this.minAge;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final AgeGateResponse copy(String title, int minAge, String subtitle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new AgeGateResponse(title, minAge, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgeGateResponse)) {
            return false;
        }
        AgeGateResponse ageGateResponse = (AgeGateResponse) other;
        return AbstractC22676k.m65745e(this.title, ageGateResponse.title) && this.minAge == ageGateResponse.minAge && AbstractC22676k.m65745e(this.subtitle, ageGateResponse.subtitle);
    }

    public final int getMinAge() {
        return this.minAge;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.subtitle.hashCode() + AbstractC11266d.m30448b(this.minAge, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.title;
        return AbstractC25012a.m73376i(this.subtitle, ")", AbstractC11266d.m30467u(this.minAge, "AgeGateResponse(title=", str, ", minAge=", ", subtitle="));
    }
}
