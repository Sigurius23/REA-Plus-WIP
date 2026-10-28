package com.mapbox.common.location;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/mapbox/common/location/IncompatibleGooglePlayServicesActivityRecognitionVersion;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "(Ljava/lang/Exception;)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class IncompatibleGooglePlayServicesActivityRecognitionVersion extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncompatibleGooglePlayServicesActivityRecognitionVersion(Exception cause) {
        super("Incompatible Google Play Services activity recognition version found. Please check https://docs.mapbox.com/android/maps/guides/user-location/ for more details.", cause);
        AbstractC22676k.m65750j(cause, "cause");
    }
}
