package io.getstream.android.video.generated.models;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/android/video/generated/models/LocationResponse;", "", "continentCode", "", "countryIsoCode", "subdivisionIsoCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContinentCode", "()Ljava/lang/String;", "getCountryIsoCode", "getSubdivisionIsoCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class LocationResponse {
    private final String continentCode;
    private final String countryIsoCode;
    private final String subdivisionIsoCode;

    public LocationResponse(@InterfaceC30731q(name = "continent_code") String continentCode, @InterfaceC30731q(name = "country_iso_code") String countryIsoCode, @InterfaceC30731q(name = "subdivision_iso_code") String subdivisionIsoCode) {
        AbstractC22676k.m65750j(continentCode, "continentCode");
        AbstractC22676k.m65750j(countryIsoCode, "countryIsoCode");
        AbstractC22676k.m65750j(subdivisionIsoCode, "subdivisionIsoCode");
        this.continentCode = continentCode;
        this.countryIsoCode = countryIsoCode;
        this.subdivisionIsoCode = subdivisionIsoCode;
    }

    public static /* synthetic */ LocationResponse copy$default(LocationResponse locationResponse, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = locationResponse.continentCode;
        }
        if ((i13 & 2) != 0) {
            str2 = locationResponse.countryIsoCode;
        }
        if ((i13 & 4) != 0) {
            str3 = locationResponse.subdivisionIsoCode;
        }
        return locationResponse.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContinentCode() {
        return this.continentCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryIsoCode() {
        return this.countryIsoCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubdivisionIsoCode() {
        return this.subdivisionIsoCode;
    }

    public final LocationResponse copy(@InterfaceC30731q(name = "continent_code") String continentCode, @InterfaceC30731q(name = "country_iso_code") String countryIsoCode, @InterfaceC30731q(name = "subdivision_iso_code") String subdivisionIsoCode) {
        AbstractC22676k.m65750j(continentCode, "continentCode");
        AbstractC22676k.m65750j(countryIsoCode, "countryIsoCode");
        AbstractC22676k.m65750j(subdivisionIsoCode, "subdivisionIsoCode");
        return new LocationResponse(continentCode, countryIsoCode, subdivisionIsoCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationResponse)) {
            return false;
        }
        LocationResponse locationResponse = (LocationResponse) other;
        return AbstractC22676k.m65745e(this.continentCode, locationResponse.continentCode) && AbstractC22676k.m65745e(this.countryIsoCode, locationResponse.countryIsoCode) && AbstractC22676k.m65745e(this.subdivisionIsoCode, locationResponse.subdivisionIsoCode);
    }

    public final String getContinentCode() {
        return this.continentCode;
    }

    public final String getCountryIsoCode() {
        return this.countryIsoCode;
    }

    public final String getSubdivisionIsoCode() {
        return this.subdivisionIsoCode;
    }

    public int hashCode() {
        return this.subdivisionIsoCode.hashCode() + AbstractC11266d.m30450d(this.continentCode.hashCode() * 31, 31, this.countryIsoCode);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.subdivisionIsoCode, ")", AbstractC11895b.m32001t("LocationResponse(continentCode=", this.continentCode, ", countryIsoCode=", this.countryIsoCode, ", subdivisionIsoCode="));
    }
}
