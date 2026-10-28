package com.mapbox.maps;

import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13676q;
import p127ev.C13675p;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b=\b\u0086\b\u0018\u0000 M2\u00020\u0001:\u0001MBm\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010!Jv\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b*\u0010%J\u001a\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u00103R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u00107R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\u001d\"\u0004\b:\u0010;R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010?R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010#\"\u0004\bD\u0010ER\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u0010%\"\u0004\bH\u0010IR\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010@\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010L¨\u0006N"}, m65681d2 = {"Lcom/mapbox/maps/MapInitOptions;", "", "Landroid/content/Context;", "context", "Lcom/mapbox/maps/MapOptions;", "mapOptions", "", "Lev/q;", "plugins", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "", "textureView", "", "styleUri", "Landroid/util/AttributeSet;", "attrs", "", "antialiasingSampleCount", "mapName", "<init>", "(Landroid/content/Context;Lcom/mapbox/maps/MapOptions;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;ZLjava/lang/String;Landroid/util/AttributeSet;ILjava/lang/String;)V", "component1", "()Landroid/content/Context;", "component2", "()Lcom/mapbox/maps/MapOptions;", "component3", "()Ljava/util/List;", "component4", "()Lcom/mapbox/maps/CameraOptions;", "component5", "()Z", "component6", "()Ljava/lang/String;", "component7", "()Landroid/util/AttributeSet;", "component8", "()I", "component9", "copy", "(Landroid/content/Context;Lcom/mapbox/maps/MapOptions;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;ZLjava/lang/String;Landroid/util/AttributeSet;ILjava/lang/String;)Lcom/mapbox/maps/MapInitOptions;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "getContext", "Lcom/mapbox/maps/MapOptions;", "getMapOptions", "setMapOptions", "(Lcom/mapbox/maps/MapOptions;)V", "Ljava/util/List;", "getPlugins", "setPlugins", "(Ljava/util/List;)V", "Lcom/mapbox/maps/CameraOptions;", "getCameraOptions", "setCameraOptions", "(Lcom/mapbox/maps/CameraOptions;)V", "Z", "getTextureView", "setTextureView", "(Z)V", "Ljava/lang/String;", "getStyleUri", "Landroid/util/AttributeSet;", "getAttrs", "setAttrs", "(Landroid/util/AttributeSet;)V", "I", "getAntialiasingSampleCount", "setAntialiasingSampleCount", "(I)V", "getMapName", "setMapName", "(Ljava/lang/String;)V", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final /* data */ class MapInitOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<AbstractC13676q> defaultPluginList = AbstractC37056f.m118959K(new C13675p("MAPBOX_CAMERA_PLUGIN_ID", null), new C13675p("MAPBOX_GESTURES_PLUGIN_ID", null), new C13675p("MAPBOX_COMPASS_PLUGIN_ID", null), new C13675p("MAPBOX_LOGO_PLUGIN_ID", null), new C13675p("MAPBOX_ATTRIBUTION_PLUGIN_ID", null), new C13675p("MAPBOX_LOCATION_COMPONENT_PLUGIN_ID", null), new C13675p("MAPBOX_SCALEBAR_PLUGIN_ID", null), new C13675p("MAPBOX_ANNOTATION_PLUGIN_ID", null), new C13675p("MAPBOX_LIFECYCLE_PLUGIN_ID", null), new C13675p("MAPBOX_MAP_OVERLAY_PLUGIN_ID", null), new C13675p("MAPBOX_VIEWPORT_PLUGIN_ID", null));
    private int antialiasingSampleCount;
    private AttributeSet attrs;
    private CameraOptions cameraOptions;
    private final Context context;
    private String mapName;
    private MapOptions mapOptions;
    private List<? extends AbstractC13676q> plugins;
    private final String styleUri;
    private boolean textureView;

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/mapbox/maps/MapInitOptions$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/mapbox/maps/MapOptions;", "getDefaultMapOptions", "(Landroid/content/Context;)Lcom/mapbox/maps/MapOptions;", "", "Lev/q;", "defaultPluginList", "Ljava/util/List;", "getDefaultPluginList", "()Ljava/util/List;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MapOptions getDefaultMapOptions(Context context) {
            AbstractC22676k.m65750j(context, "context");
            MapOptions mapOptionsBuild = MapInitOptionsKt.applyDefaultParams(new MapOptions.Builder(), context).build();
            AbstractC22676k.m65749i(mapOptionsBuild, "Builder().applyDefaultParams(context).build()");
            return mapOptionsBuild;
        }

        public final List<AbstractC13676q> getDefaultPluginList() {
            return MapInitOptions.defaultPluginList;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context) {
        this(context, null, null, null, false, null, null, 0, null, 510, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MapInitOptions copy$default(MapInitOptions mapInitOptions, Context context, MapOptions mapOptions, List list, CameraOptions cameraOptions, boolean z4, String str, AttributeSet attributeSet, int i13, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            context = mapInitOptions.context;
        }
        if ((i14 & 2) != 0) {
            mapOptions = mapInitOptions.mapOptions;
        }
        if ((i14 & 4) != 0) {
            list = mapInitOptions.plugins;
        }
        if ((i14 & 8) != 0) {
            cameraOptions = mapInitOptions.cameraOptions;
        }
        if ((i14 & 16) != 0) {
            z4 = mapInitOptions.textureView;
        }
        if ((i14 & 32) != 0) {
            str = mapInitOptions.styleUri;
        }
        if ((i14 & 64) != 0) {
            attributeSet = mapInitOptions.attrs;
        }
        if ((i14 & 128) != 0) {
            i13 = mapInitOptions.antialiasingSampleCount;
        }
        if ((i14 & 256) != 0) {
            str2 = mapInitOptions.mapName;
        }
        int i15 = i13;
        String str3 = str2;
        String str4 = str;
        AttributeSet attributeSet2 = attributeSet;
        boolean z13 = z4;
        List list2 = list;
        return mapInitOptions.copy(context, mapOptions, list2, cameraOptions, z13, str4, attributeSet2, i15, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MapOptions getMapOptions() {
        return this.mapOptions;
    }

    public final List<AbstractC13676q> component3() {
        return this.plugins;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CameraOptions getCameraOptions() {
        return this.cameraOptions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getTextureView() {
        return this.textureView;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStyleUri() {
        return this.styleUri;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getAntialiasingSampleCount() {
        return this.antialiasingSampleCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMapName() {
        return this.mapName;
    }

    public final MapInitOptions copy(Context context, MapOptions mapOptions, List<? extends AbstractC13676q> plugins, CameraOptions cameraOptions, boolean textureView, String styleUri, AttributeSet attrs, int antialiasingSampleCount, String mapName) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mapOptions, "mapOptions");
        AbstractC22676k.m65750j(plugins, "plugins");
        AbstractC22676k.m65750j(mapName, "mapName");
        return new MapInitOptions(context, mapOptions, plugins, cameraOptions, textureView, styleUri, attrs, antialiasingSampleCount, mapName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapInitOptions)) {
            return false;
        }
        MapInitOptions mapInitOptions = (MapInitOptions) other;
        return AbstractC22676k.m65745e(this.context, mapInitOptions.context) && AbstractC22676k.m65745e(this.mapOptions, mapInitOptions.mapOptions) && AbstractC22676k.m65745e(this.plugins, mapInitOptions.plugins) && AbstractC22676k.m65745e(this.cameraOptions, mapInitOptions.cameraOptions) && this.textureView == mapInitOptions.textureView && AbstractC22676k.m65745e(this.styleUri, mapInitOptions.styleUri) && AbstractC22676k.m65745e(this.attrs, mapInitOptions.attrs) && this.antialiasingSampleCount == mapInitOptions.antialiasingSampleCount && AbstractC22676k.m65745e(this.mapName, mapInitOptions.mapName);
    }

    public final int getAntialiasingSampleCount() {
        return this.antialiasingSampleCount;
    }

    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    public final CameraOptions getCameraOptions() {
        return this.cameraOptions;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getMapName() {
        return this.mapName;
    }

    public final MapOptions getMapOptions() {
        return this.mapOptions;
    }

    public final List<AbstractC13676q> getPlugins() {
        return this.plugins;
    }

    public final String getStyleUri() {
        return this.styleUri;
    }

    public final boolean getTextureView() {
        return this.textureView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.mapOptions.hashCode() + (this.context.hashCode() * 31)) * 31, 31, this.plugins);
        CameraOptions cameraOptions = this.cameraOptions;
        int iHashCode = (iM31983b + (cameraOptions == null ? 0 : cameraOptions.hashCode())) * 31;
        boolean z4 = this.textureView;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        int i13 = (iHashCode + r10) * 31;
        String str = this.styleUri;
        int iHashCode2 = (i13 + (str == null ? 0 : str.hashCode())) * 31;
        AttributeSet attributeSet = this.attrs;
        return this.mapName.hashCode() + AbstractC11266d.m30448b(this.antialiasingSampleCount, (iHashCode2 + (attributeSet != null ? attributeSet.hashCode() : 0)) * 31, 31);
    }

    public final void setAntialiasingSampleCount(int i13) {
        this.antialiasingSampleCount = i13;
    }

    public final void setAttrs(AttributeSet attributeSet) {
        this.attrs = attributeSet;
    }

    public final void setCameraOptions(CameraOptions cameraOptions) {
        this.cameraOptions = cameraOptions;
    }

    public final void setMapName(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.mapName = str;
    }

    public final void setMapOptions(MapOptions mapOptions) {
        AbstractC22676k.m65750j(mapOptions, "<set-?>");
        this.mapOptions = mapOptions;
    }

    public final void setPlugins(List<? extends AbstractC13676q> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.plugins = list;
    }

    public final void setTextureView(boolean z4) {
        this.textureView = z4;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("MapInitOptions(context=");
        sb4.append(this.context);
        sb4.append(", mapOptions=");
        sb4.append(this.mapOptions);
        sb4.append(", plugins=");
        sb4.append(this.plugins);
        sb4.append(", cameraOptions=");
        sb4.append(this.cameraOptions);
        sb4.append(", textureView=");
        sb4.append(this.textureView);
        sb4.append(", styleUri=");
        sb4.append(this.styleUri);
        sb4.append(", attrs=");
        sb4.append(this.attrs);
        sb4.append(", antialiasingSampleCount=");
        sb4.append(this.antialiasingSampleCount);
        sb4.append(", mapName=");
        return AbstractC25012a.m73377j(sb4, this.mapName, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions) {
        this(context, mapOptions, null, null, false, null, null, 0, null, 508, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mapOptions, "mapOptions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends AbstractC13676q> plugins) {
        this(context, mapOptions, plugins, null, false, null, null, 0, null, 504, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mapOptions, "mapOptions");
        AbstractC22676k.m65750j(plugins, "plugins");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends AbstractC13676q> plugins, CameraOptions cameraOptions) {
        this(context, mapOptions, plugins, cameraOptions, false, null, null, 0, null, 496, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mapOptions, "mapOptions");
        AbstractC22676k.m65750j(plugins, "plugins");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends AbstractC13676q> plugins, CameraOptions cameraOptions, boolean z4) {
        this(context, mapOptions, plugins, cameraOptions, z4, null, null, 0, null, 480, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mapOptions, "mapOptions");
        AbstractC22676k.m65750j(plugins, "plugins");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends AbstractC13676q> plugins, CameraOptions cameraOptions, boolean z4, String str) {
        this(context, mapOptions, plugins, cameraOptions, z4, str, null, 0, null, 448, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mapOptions, "mapOptions");
        AbstractC22676k.m65750j(plugins, "plugins");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends AbstractC13676q> plugins, CameraOptions cameraOptions, boolean z4, String str, AttributeSet attributeSet) {
        this(context, mapOptions, plugins, cameraOptions, z4, str, attributeSet, 0, null, 384, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mapOptions, "mapOptions");
        AbstractC22676k.m65750j(plugins, "plugins");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends AbstractC13676q> plugins, CameraOptions cameraOptions, boolean z4, String str, AttributeSet attributeSet, int i13) {
        this(context, mapOptions, plugins, cameraOptions, z4, str, attributeSet, i13, null, 256, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mapOptions, "mapOptions");
        AbstractC22676k.m65750j(plugins, "plugins");
    }

    public MapInitOptions(Context context, MapOptions mapOptions, List<? extends AbstractC13676q> plugins, CameraOptions cameraOptions, boolean z4, String str, AttributeSet attributeSet, int i13, String mapName) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mapOptions, "mapOptions");
        AbstractC22676k.m65750j(plugins, "plugins");
        AbstractC22676k.m65750j(mapName, "mapName");
        this.context = context;
        this.mapOptions = mapOptions;
        this.plugins = plugins;
        this.cameraOptions = cameraOptions;
        this.textureView = z4;
        this.styleUri = str;
        this.attrs = attributeSet;
        this.antialiasingSampleCount = i13;
        this.mapName = mapName;
    }

    public /* synthetic */ MapInitOptions(Context context, MapOptions mapOptions, List list, CameraOptions cameraOptions, boolean z4, String str, AttributeSet attributeSet, int i13, String str2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? INSTANCE.getDefaultMapOptions(context) : mapOptions, (i14 & 4) != 0 ? defaultPluginList : list, (i14 & 8) != 0 ? null : cameraOptions, (i14 & 16) != 0 ? false : z4, (i14 & 32) != 0 ? Style.STANDARD : str, (i14 & 64) == 0 ? attributeSet : null, (i14 & 128) != 0 ? 1 : i13, (i14 & 256) != 0 ? "" : str2);
    }
}
