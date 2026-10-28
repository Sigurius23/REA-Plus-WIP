package com.mapbox.maps;

import android.util.CloseGuard;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.window.SplashScreenView;
import bh3.InterfaceC3260g;
import bh3.InterfaceC3261h;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.EventsServiceResponseCallback;
import com.mapbox.common.TelemetryUtilsResponseCallback;
import com.mapbox.maps.module.telemetry.MapTelemetryImpl;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.whoop.p069ui.C10540h;
import p077d0.InterfaceC11419z;
import p094dn.C12197q;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p188ha.InterfaceC17038g;
import p324m9.C25279g;
import p543v4.C35643b;
import p658yr.InterfaceC39718e;
import p690zr.AbstractC41023g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.mapbox.maps.l */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5538l implements SourceRemovedCallback, StyleDataLoadedCallback, CameraChangedCallback, RenderFrameStartedCallback, StyleLoadedCallback, SourceAddedCallback, SourceDataLoadedCallback, MapLoadingErrorDelegate, Expected.Transformer, EventsServiceResponseCallback, TelemetryUtilsResponseCallback, InterfaceC3261h, InterfaceC3260g, InterfaceC11419z, InterfaceC16915u, InterfaceC39718e, InterfaceC17038g {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f22053w;

    public /* synthetic */ C5538l(int i13) {
        this.f22053w = i13;
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ CloseGuard m16704d(Object obj) {
        return (CloseGuard) obj;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m16705e(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ SplashScreenView m16706f(Object obj) {
        return (SplashScreenView) obj;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ boolean m16707g(Object obj) {
        return obj instanceof SplashScreenView;
    }

    @Override // p188ha.InterfaceC17038g
    /* JADX INFO: renamed from: a */
    public boolean mo16708a(int i13, int i14, int i15, int i16, int i17) {
        return false;
    }

    @Override // p658yr.InterfaceC39718e
    public Object apply(Object obj) {
        switch (this.f22053w) {
            case 20:
                return (C12197q) obj;
            default:
                return AbstractC41023g0.m133256r(Integer.valueOf(((C25279g) obj).f99220w));
        }
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        return C10540h.m27204R((Boolean) obj);
    }

    @Override // bh3.InterfaceC3261h
    /* JADX INFO: renamed from: c */
    public Object mo9474c(Object obj, Object obj2) {
        return C10540h.m27203Q(obj, (Boolean) obj2);
    }

    @Override // p077d0.InterfaceC11419z
    /* JADX INFO: renamed from: i */
    public float mo7226i(float f13) {
        if (f13 < 0.36363637f) {
            return 7.5625f * f13 * f13;
        }
        if (f13 < 0.72727275f) {
            float f14 = f13 - 0.54545456f;
            return (7.5625f * f14 * f14) + 0.75f;
        }
        if (f13 < 0.90909094f) {
            float f15 = f13 - 0.8181818f;
            return (7.5625f * f15 * f15) + 0.9375f;
        }
        float f16 = f13 - 0.95454544f;
        return (7.5625f * f16 * f16) + 0.984375f;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        return Snapshotter.cameraForCoordinates$lambda$20((String) obj);
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        int i13 = Stripe3ds2TransactionActivity.f22356z;
        AbstractC22676k.m65750j(view, "view");
        C35643b c35643bMo47530g = c16905q1.f64864a.mo47530g(7);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        view.setPaddingRelative(c35643bMo47530g.f151452d, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        return C16905q1.f64863b;
    }

    @Override // com.mapbox.common.EventsServiceResponseCallback
    public void run(Expected expected) {
        switch (this.f22053w) {
            case 10:
                MapTelemetryImpl.onAppUserTurnstileEvent$lambda$0(expected);
                break;
            case 11:
                MapTelemetryImpl.sendEvent$lambda$2(expected);
                break;
            default:
                MapTelemetryImpl.enableTelemetryCollection$lambda$3(expected);
                break;
        }
    }

    @Override // com.mapbox.maps.MapLoadingErrorDelegate
    public void sendMapLoadingError(MapLoadingError mapLoadingError) {
        switch (this.f22053w) {
            case 7:
                AbstractC22676k.m65750j(mapLoadingError, "it");
                break;
            default:
                AbstractC22676k.m65750j(mapLoadingError, "it");
                break;
        }
    }

    @Override // com.mapbox.maps.CameraChangedCallback
    public void run(CameraChanged cameraChanged) {
        NativeObserver.addOnCameraChangeListener$lambda$2(null, cameraChanged);
    }

    @Override // com.mapbox.maps.RenderFrameStartedCallback
    public void run(RenderFrameStarted renderFrameStarted) {
        NativeObserver.addOnRenderFrameStartedListener$lambda$13(null, renderFrameStarted);
    }

    @Override // com.mapbox.maps.SourceAddedCallback
    public void run(SourceAdded sourceAdded) {
        NativeObserver.addOnSourceAddedListener$lambda$9(null, sourceAdded);
    }

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public void run(SourceDataLoaded sourceDataLoaded) {
        NativeObserver.addOnSourceDataLoadedListener$lambda$8(null, sourceDataLoaded);
    }

    @Override // com.mapbox.maps.SourceRemovedCallback
    public void run(SourceRemoved sourceRemoved) {
        NativeObserver.addOnSourceRemovedListener$lambda$10(null, sourceRemoved);
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        NativeObserver.addOnStyleDataLoadedListener$lambda$7(null, styleDataLoaded);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        NativeObserver.addOnStyleLoadedListener$lambda$6(null, styleLoaded);
    }
}
