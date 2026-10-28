package p627xv;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Projection;
import p127ev.C13668i;
import p127ev.InterfaceC13671l;
import p127ev.InterfaceC13678s;
import p262jv.C21964a;
import p465rm.C31559p;
import p470rv.AbstractC31834n;
import p661yv.C39797b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xv.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C38666g implements InterfaceC13678s, InterfaceC13671l {

    /* JADX INFO: renamed from: G */
    public Cancelable f166430G;

    /* JADX INFO: renamed from: x */
    public InterfaceC38661b f166432x;

    /* JADX INFO: renamed from: y */
    public MapboxMap f166433y;

    /* JADX INFO: renamed from: z */
    public MapboxMap f166434z;

    /* JADX INFO: renamed from: w */
    public final Function1 f166431w = C38664e.f166410y;

    /* JADX INFO: renamed from: E */
    public C39797b f166428E = AbstractC31834n.m98893b(C38664e.f166411z);

    /* JADX INFO: renamed from: F */
    public final C31559p f166429F = new C31559p(this, 19);

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m123999e(C38666g c38666g) {
        MapboxMap mapboxMap = c38666g.f166434z;
        if (mapboxMap != null) {
            c38666g.m124000b(mapboxMap.getCameraState());
        } else {
            AbstractC22676k.m65757q("mapCameraManagerDelegate");
            throw null;
        }
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: a */
    public final void mo38544a() {
        Cancelable cancelable = this.f166430G;
        if (cancelable != null) {
            cancelable.cancel();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m124000b(CameraState cameraState) {
        double metersPerPixelAtLatitude = Projection.getMetersPerPixelAtLatitude(cameraState.getCenter().latitude(), cameraState.getZoom());
        InterfaceC38661b interfaceC38661b = this.f166432x;
        if (interfaceC38661b == null) {
            AbstractC22676k.m65757q("scaleBar");
            throw null;
        }
        if (interfaceC38661b == null) {
            AbstractC22676k.m65757q("scaleBar");
            throw null;
        }
        ((C38665f) interfaceC38661b).setDistancePerPixel((float) (metersPerPixelAtLatitude / ((double) ((C38665f) interfaceC38661b).getPixelRatio())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p127ev.InterfaceC13678s
    /* JADX INFO: renamed from: c */
    public final void mo38580c(View view) {
        AbstractC22676k.m65750j(view, "view");
        InterfaceC38661b interfaceC38661b = view instanceof InterfaceC38661b ? (InterfaceC38661b) view : null;
        if (interfaceC38661b == null) {
            throw new IllegalArgumentException("The provided view needs to implement ScaleBarContract.ScaleBarView");
        }
        this.f166432x = interfaceC38661b;
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: f */
    public final void mo38545f(C13668i c13668i) {
        this.f166434z = (MapboxMap) c13668i.f48455b;
        this.f166433y = (MapboxMap) c13668i.f48458e;
    }

    @Override // p127ev.InterfaceC13678s
    /* JADX INFO: renamed from: g */
    public final View mo38581g(MapView mapView, AttributeSet attributeSet, float f13) {
        AbstractC22676k.m65750j(mapView, "mapView");
        Context context = mapView.getContext();
        AbstractC22676k.m65749i(context, "mapView.context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC38660a.f166405a, 0, 0);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            C39797b c39797bM98893b = AbstractC31834n.m98893b(new C21964a(typedArrayObtainStyledAttributes, f13, 3));
            typedArrayObtainStyledAttributes.recycle();
            this.f166428E = c39797bM98893b;
            Context context2 = mapView.getContext();
            AbstractC22676k.m65749i(context2, "mapView.context");
            C38665f c38665f = (C38665f) this.f166431w.invoke(context2);
            AbstractC22676k.m65748h(c38665f, "null cannot be cast to non-null type com.mapbox.maps.plugin.scalebar.ScaleBar");
            c38665f.setPixelRatio(f13);
            return c38665f;
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m124001h() {
        if (this.f166428E.f171484w) {
            Cancelable cancelable = this.f166430G;
            if (cancelable != null) {
                cancelable.cancel();
            }
            C39797b c39797b = this.f166428E;
            c39797b.getClass();
            this.f166428E = new C39797b(false, c39797b.f171485x, c39797b.f171486y, c39797b.f171487z, c39797b.f171469E, c39797b.f171470F, c39797b.f171471G, c39797b.f171472H, c39797b.f171473I, c39797b.f171474J, c39797b.f171475K, c39797b.f171476L, c39797b.f171477M, c39797b.f171478N, c39797b.f171479O, c39797b.f171480P, c39797b.f171481Q, c39797b.f171482R, c39797b.f171483S);
            InterfaceC38661b interfaceC38661b = this.f166432x;
            if (interfaceC38661b != null) {
                ((C38665f) interfaceC38661b).setEnable(false);
            } else {
                AbstractC22676k.m65757q("scaleBar");
                throw null;
            }
        }
    }

    @Override // p127ev.InterfaceC13669j
    public final void initialize() {
        InterfaceC38661b interfaceC38661b = this.f166432x;
        if (interfaceC38661b == null) {
            AbstractC22676k.m65757q("scaleBar");
            throw null;
        }
        ((C38665f) interfaceC38661b).setSettings(this.f166428E);
        m123999e(this);
        MapboxMap mapboxMap = this.f166433y;
        if (mapboxMap != null) {
            this.f166430G = mapboxMap.subscribeCameraChangedCoalesced(this.f166429F);
        } else {
            AbstractC22676k.m65757q("mapListenerDelegate");
            throw null;
        }
    }

    @Override // p127ev.InterfaceC13671l
    public final void onSizeChanged(int i13, int i14) {
        InterfaceC38661b interfaceC38661b = this.f166432x;
        if (interfaceC38661b == null) {
            AbstractC22676k.m65757q("scaleBar");
            throw null;
        }
        ((C38665f) interfaceC38661b).setMapViewWidth(i13);
        if (this.f166428E.f171484w) {
            m123999e(this);
        }
    }
}
