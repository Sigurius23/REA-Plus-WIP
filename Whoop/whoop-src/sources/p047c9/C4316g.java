package p047c9;

import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import com.amplitude.quickjs.wrapper.MapCreator;
import com.google.android.material.textfield.InterfaceC5045f0;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.FlushOperationResultCallback;
import com.mapbox.common.location.GoogleDeviceLocationProvider;
import com.mapbox.common.module.MapboxHttpClient;
import com.mapbox.common.module.cronet.LazyEngine;
import com.mapbox.common.module.okhttp.NetworkUsageListener;
import com.mapbox.maps.FeatureStateOperationCallback;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapIdleCallback;
import com.mapbox.maps.MapLoaded;
import com.mapbox.maps.MapLoadedCallback;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapLoadingErrorDelegate;
import com.mapbox.maps.MapProvider;
import com.mapbox.maps.NativeObserver;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.StyleImageMissing;
import com.mapbox.maps.StyleImageMissingCallback;
import com.mapbox.maps.StyleImageRemoveUnused;
import com.mapbox.maps.StyleImageRemoveUnusedCallback;
import java.util.HashMap;
import java.util.Map;
import p073cq.InterfaceC11036e;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p345nn.InterfaceC26856g;
import p543v4.C35643b;
import p607x8.InterfaceC38051f;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34798a0;
import ud3.InterfaceC34853z;
import zd3.C40571o;

/* JADX INFO: renamed from: c9.g */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C4316g implements InterfaceC38051f, InterfaceC26856g, MapCreator, InterfaceC5045f0, InterfaceC16915u, InterfaceC11036e, Expected.Transformer, InterfaceC34853z, FlushOperationResultCallback, FeatureStateOperationCallback, MapLoadingErrorDelegate, MapIdleCallback, StyleImageMissingCallback, MapLoadedCallback, StyleImageRemoveUnusedCallback, RenderFrameFinishedCallback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17514w;

    public /* synthetic */ C4316g(int i13) {
        this.f17514w = i13;
    }

    @Override // p345nn.InterfaceC26856g
    /* JADX INFO: renamed from: a */
    public boolean mo13596a(int i13, int i14, int i15, int i16, int i17) {
        if (i14 == 67 && i15 == 79 && i16 == 77 && (i17 == 77 || i13 == 2)) {
            return true;
        }
        if (i14 == 77 && i15 == 76 && i16 == 76) {
            return i17 == 84 || i13 == 2;
        }
        return false;
    }

    @Override // ud3.InterfaceC34853z
    /* JADX INFO: renamed from: b */
    public AbstractC34798a0 mo8619b(C40571o c40571o) {
        return NetworkUsageListener.lambda$static$0(c40571o);
    }

    @Override // com.amplitude.quickjs.wrapper.MapCreator
    public Map get() {
        switch (this.f17514w) {
            case 7:
                break;
        }
        return new HashMap();
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        return MapboxHttpClient.getLifeCycleStateCallback$lambda$4$lambda$3((String) obj);
    }

    @Override // p073cq.InterfaceC11036e
    /* JADX INFO: renamed from: n */
    public void mo1681n(Exception exc) {
        switch (this.f17514w) {
            case 12:
                GoogleDeviceLocationProvider.removeLocationUpdates$lambda$10(exc);
                break;
            case 13:
                GoogleDeviceLocationProvider.requestLocationUpdates$lambda$8(exc);
                break;
            default:
                LazyEngine.tryInstallFromGooglePlay$lambda$2(exc);
                break;
        }
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        C35643b c35643bMo47530g = c16905q1.f64864a.mo47530g(7);
        view.setPadding(0, c35643bMo47530g.f151450b, 0, c35643bMo47530g.f151452d);
        return c16905q1;
    }

    @Override // com.mapbox.common.FlushOperationResultCallback, com.mapbox.maps.FeatureStateOperationCallback
    public void run(Expected expected) {
        switch (this.f17514w) {
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                MapProvider.flushPendingEvents$lambda$1(expected);
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                MapProvider.flushPendingEvents$lambda$3(expected);
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j(expected, "it");
                break;
            case 20:
            default:
                AbstractC22676k.m65750j(expected, "it");
                break;
            case 21:
                AbstractC22676k.m65750j(expected, "it");
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC22676k.m65750j(expected, "it");
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j(expected, "it");
                break;
        }
    }

    @Override // com.mapbox.maps.MapLoadingErrorDelegate
    public void sendMapLoadingError(MapLoadingError mapLoadingError) {
        AbstractC22676k.m65750j(mapLoadingError, "it");
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke */
    public void mo134038invoke(Object obj) {
        InterfaceC4311b interfaceC4311b = (InterfaceC4311b) obj;
        switch (this.f17514w) {
            case 0:
                interfaceC4311b.getClass();
                break;
            case 1:
                interfaceC4311b.getClass();
                break;
            case 2:
                interfaceC4311b.getClass();
                break;
            default:
                interfaceC4311b.getClass();
                break;
        }
    }

    @Override // com.mapbox.maps.MapIdleCallback
    public void run(MapIdle mapIdle) {
        NativeObserver.addOnMapIdleListener$lambda$4(null, mapIdle);
    }

    @Override // com.mapbox.maps.MapLoadedCallback
    public void run(MapLoaded mapLoaded) {
        NativeObserver.addOnMapLoadedListener$lambda$3(null, mapLoaded);
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        NativeObserver.addOnRenderFrameFinishedListener$lambda$14(null, renderFrameFinished);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        NativeObserver.addOnStyleImageMissingListener$lambda$11(null, styleImageMissing);
    }

    @Override // com.mapbox.maps.StyleImageRemoveUnusedCallback
    public void run(StyleImageRemoveUnused styleImageRemoveUnused) {
        NativeObserver.addOnStyleImageUnusedListener$lambda$12(null, styleImageRemoveUnused);
    }
}
