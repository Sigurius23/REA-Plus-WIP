package com.whoop.universalcheckout.features.buynow.navigation;

import com.whoop.navigation.AppScreen;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/navigation/UnusableCheckoutDestinationException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", HMSTrackSource.SCREEN, "Lcom/whoop/navigation/AppScreen;", "<init>", "(Lcom/whoop/navigation/AppScreen;)V", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UnusableCheckoutDestinationException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnusableCheckoutDestinationException(AppScreen screen) {
        super("checkout_destination is not a usable CHECKOUT_WITH_CART: " + screen);
        AbstractC22676k.m65750j(screen, "screen");
    }
}
