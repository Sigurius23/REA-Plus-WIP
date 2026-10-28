package com.mapbox.common.movement;

import c93.InterfaceC4339a;
import com.mapbox.common.location.GoogleDeviceLocationProviderKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ProxyGoogleActivityRecognitionClient$Companion$available$2 extends AbstractC22680m implements InterfaceC4339a {
    public static final ProxyGoogleActivityRecognitionClient$Companion$available$2 INSTANCE = new ProxyGoogleActivityRecognitionClient$Companion$available$2();

    public ProxyGoogleActivityRecognitionClient$Companion$available$2() {
        super(0);
    }

    @Override // c93.InterfaceC4339a
    public final Boolean invoke() {
        return Boolean.valueOf(GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayActivityRecognitionAvailable());
    }
}
