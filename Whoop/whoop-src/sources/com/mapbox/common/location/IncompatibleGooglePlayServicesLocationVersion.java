package com.mapbox.common.location;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/mapbox/common/location/IncompatibleGooglePlayServicesLocationVersion;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class IncompatibleGooglePlayServicesLocationVersion extends Exception {
    public IncompatibleGooglePlayServicesLocationVersion() {
        super("Incompatible Google Play Services location version found. Please check https://docs.mapbox.com/android/maps/guides/user-location/ for more details.");
    }
}
