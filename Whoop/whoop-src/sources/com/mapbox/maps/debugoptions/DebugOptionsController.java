package com.mapbox.maps.debugoptions;

import android.content.Context;
import android.widget.FrameLayout;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import f93.AbstractC14290b;
import f93.InterfaceC14292d;
import j93.InterfaceC21493z;
import java.util.Set;
import m83.C25235a0;
import p012ab.C0680g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR+\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R6\u0010)\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Lcom/mapbox/maps/debugoptions/DebugOptionsController;", "", "Landroid/widget/FrameLayout;", "mapView", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "<init>", "(Landroid/widget/FrameLayout;Lcom/mapbox/maps/MapboxMap;)V", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/mapbox/maps/debugoptions/CameraDebugView;", "cameraDebugViewProvider", "Lcom/mapbox/maps/debugoptions/PaddingDebugView;", "paddingDebugViewProvider", "(Landroid/widget/FrameLayout;Lcom/mapbox/maps/MapboxMap;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Ll83/a0;", "updateCameraSubscriptionIfNeeded", "()V", "toggleMapViewDebugOptionsIfNeeded", "Landroid/widget/FrameLayout;", "Lcom/mapbox/maps/MapboxMap;", "Lkotlin/jvm/functions/Function1;", "cameraDebugView", "Lcom/mapbox/maps/debugoptions/CameraDebugView;", "paddingDebugView", "Lcom/mapbox/maps/debugoptions/PaddingDebugView;", "Lcom/mapbox/common/Cancelable;", "cameraSubscriptionCancelable", "Lcom/mapbox/common/Cancelable;", "", "<set-?>", "started$delegate", "Lf93/d;", "getStarted", "()Z", "setStarted", "(Z)V", "started", "", "Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;", "newValue", "options", "Ljava/util/Set;", "getOptions", "()Ljava/util/Set;", "setOptions", "(Ljava/util/Set;)V", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class DebugOptionsController {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(DebugOptionsController.class, "started", "getStarted()Z", 0))};
    private CameraDebugView cameraDebugView;
    private final Function1 cameraDebugViewProvider;
    private Cancelable cameraSubscriptionCancelable;
    private final FrameLayout mapView;
    private final MapboxMap mapboxMap;
    private Set<MapViewDebugOptions> options;
    private PaddingDebugView paddingDebugView;
    private final Function1 paddingDebugViewProvider;

    /* JADX INFO: renamed from: started$delegate, reason: from kotlin metadata */
    private final InterfaceC14292d started;

    /* JADX INFO: renamed from: com.mapbox.maps.debugoptions.DebugOptionsController$1 */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m65681d2 = {"<anonymous>", "Lcom/mapbox/maps/debugoptions/CameraDebugView;", "it", "Landroid/content/Context;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class C55231 extends AbstractC22680m implements Function1 {
        public static final C55231 INSTANCE = new C55231();

        public C55231() {
            super(1);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final CameraDebugView invoke(Context it) {
            AbstractC22676k.m65750j(it, "it");
            return new CameraDebugView(it, null, 0, 6, null);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.debugoptions.DebugOptionsController$2 */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m65681d2 = {"<anonymous>", "Lcom/mapbox/maps/debugoptions/PaddingDebugView;", "it", "Landroid/content/Context;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class C55242 extends AbstractC22680m implements Function1 {
        public static final C55242 INSTANCE = new C55242();

        public C55242() {
            super(1);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final PaddingDebugView invoke(Context it) {
            AbstractC22676k.m65750j(it, "it");
            return new PaddingDebugView(it, null, 0, 6, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DebugOptionsController(FrameLayout mapView, MapboxMap mapboxMap) {
        this(mapView, mapboxMap, C55231.INSTANCE, C55242.INSTANCE);
        AbstractC22676k.m65750j(mapView, "mapView");
        AbstractC22676k.m65750j(mapboxMap, "mapboxMap");
    }

    private final void toggleMapViewDebugOptionsIfNeeded() {
        if (!this.options.contains(MapViewDebugOptions.CAMERA)) {
            CameraDebugView cameraDebugView = this.cameraDebugView;
            if (cameraDebugView != null) {
                this.mapView.removeView(cameraDebugView);
                this.cameraDebugView = null;
            }
        } else if (this.cameraDebugView == null) {
            Function1 function1 = this.cameraDebugViewProvider;
            Context context = this.mapView.getContext();
            AbstractC22676k.m65749i(context, "mapView.context");
            CameraDebugView cameraDebugView2 = (CameraDebugView) function1.invoke(context);
            this.mapView.addView(cameraDebugView2);
            cameraDebugView2.update(this.mapboxMap.getCameraState());
            this.cameraDebugView = cameraDebugView2;
        }
        if (!this.options.contains(MapViewDebugOptions.PADDING)) {
            PaddingDebugView paddingDebugView = this.paddingDebugView;
            if (paddingDebugView != null) {
                this.mapView.removeView(paddingDebugView);
                this.paddingDebugView = null;
                return;
            }
            return;
        }
        if (this.paddingDebugView == null) {
            Function1 function2 = this.paddingDebugViewProvider;
            Context context2 = this.mapView.getContext();
            AbstractC22676k.m65749i(context2, "mapView.context");
            PaddingDebugView paddingDebugView2 = (PaddingDebugView) function2.invoke(context2);
            this.mapView.addView(paddingDebugView2);
            EdgeInsets padding = this.mapboxMap.getCameraState().getPadding();
            AbstractC22676k.m65749i(padding, "mapboxMap.cameraState.padding");
            paddingDebugView2.update(padding);
            this.paddingDebugView = paddingDebugView2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCameraSubscriptionIfNeeded() {
        boolean z4 = this.options.contains(MapViewDebugOptions.CAMERA) || this.options.contains(MapViewDebugOptions.PADDING);
        if (getStarted() && z4 && this.cameraSubscriptionCancelable == null) {
            this.cameraSubscriptionCancelable = this.mapboxMap.subscribeCameraChangedCoalesced(new C0680g0(this, 20));
            return;
        }
        Cancelable cancelable = this.cameraSubscriptionCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.cameraSubscriptionCancelable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCameraSubscriptionIfNeeded$lambda$1(DebugOptionsController this$0, CameraChangedCoalesced it) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(it, "it");
        CameraDebugView cameraDebugView = this$0.cameraDebugView;
        if (cameraDebugView != null) {
            CameraState cameraState = it.getCameraState();
            AbstractC22676k.m65749i(cameraState, "it.cameraState");
            cameraDebugView.update(cameraState);
        }
        PaddingDebugView paddingDebugView = this$0.paddingDebugView;
        if (paddingDebugView != null) {
            EdgeInsets padding = it.getCameraState().getPadding();
            AbstractC22676k.m65749i(padding, "it.cameraState.padding");
            paddingDebugView.update(padding);
        }
    }

    public final Set<MapViewDebugOptions> getOptions() {
        return this.options;
    }

    public final boolean getStarted() {
        return ((Boolean) this.started.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setOptions(Set<MapViewDebugOptions> newValue) {
        AbstractC22676k.m65750j(newValue, "newValue");
        this.options = newValue;
        this.mapboxMap.setDebugOptions$maps_sdk_release(MapViewDebugOptionsKt.getNativeDebugOptions(newValue));
        toggleMapViewDebugOptionsIfNeeded();
        updateCameraSubscriptionIfNeeded();
    }

    public final void setStarted(boolean z4) {
        this.started.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z4));
    }

    public DebugOptionsController(FrameLayout mapView, MapboxMap mapboxMap, Function1 cameraDebugViewProvider, Function1 paddingDebugViewProvider) {
        AbstractC22676k.m65750j(mapView, "mapView");
        AbstractC22676k.m65750j(mapboxMap, "mapboxMap");
        AbstractC22676k.m65750j(cameraDebugViewProvider, "cameraDebugViewProvider");
        AbstractC22676k.m65750j(paddingDebugViewProvider, "paddingDebugViewProvider");
        final Boolean bool = Boolean.FALSE;
        this.started = new AbstractC14290b(bool) { // from class: com.mapbox.maps.debugoptions.DebugOptionsController$special$$inlined$observable$1
            @Override // f93.AbstractC14290b
            public void afterChange(InterfaceC21493z property, Boolean oldValue, Boolean newValue) {
                AbstractC22676k.m65750j(property, "property");
                if (oldValue.booleanValue() != newValue.booleanValue()) {
                    this.updateCameraSubscriptionIfNeeded();
                }
            }
        };
        this.options = C25235a0.f99113w;
        this.mapView = mapView;
        this.mapboxMap = mapboxMap;
        this.cameraDebugViewProvider = cameraDebugViewProvider;
        this.paddingDebugViewProvider = paddingDebugViewProvider;
    }
}
