package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class CustomLayerRenderParameters implements Serializable {
    private final double bearing;
    private final ElevationData elevationData;
    private final double fieldOfView;
    private final double height;
    private final double latitude;
    private final double longitude;
    private final double pitch;
    private final CustomLayerMapProjection projection;
    private final List<Double> projectionMatrix;
    private final List<CanonicalTileID> renderToTilesIDs;
    private final double width;
    private final double zoom;

    private CustomLayerRenderParameters(double d3, double d14, double d15, double d16, double d17, double d18, double d19, double d24, List<Double> list, ElevationData elevationData, List<CanonicalTileID> list2, CustomLayerMapProjection customLayerMapProjection) {
        this.width = d3;
        this.height = d14;
        this.latitude = d15;
        this.longitude = d16;
        this.zoom = d17;
        this.bearing = d18;
        this.pitch = d19;
        this.fieldOfView = d24;
        this.projectionMatrix = list;
        this.elevationData = elevationData;
        this.renderToTilesIDs = list2;
        this.projection = customLayerMapProjection;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomLayerRenderParameters.class != obj.getClass()) {
            return false;
        }
        CustomLayerRenderParameters customLayerRenderParameters = (CustomLayerRenderParameters) obj;
        return Double.compare(this.width, customLayerRenderParameters.width) == 0 && Double.compare(this.height, customLayerRenderParameters.height) == 0 && Double.compare(this.latitude, customLayerRenderParameters.latitude) == 0 && Double.compare(this.longitude, customLayerRenderParameters.longitude) == 0 && Double.compare(this.zoom, customLayerRenderParameters.zoom) == 0 && Double.compare(this.bearing, customLayerRenderParameters.bearing) == 0 && Double.compare(this.pitch, customLayerRenderParameters.pitch) == 0 && Double.compare(this.fieldOfView, customLayerRenderParameters.fieldOfView) == 0 && Objects.equals(this.projectionMatrix, customLayerRenderParameters.projectionMatrix) && Objects.equals(this.elevationData, customLayerRenderParameters.elevationData) && Objects.equals(this.renderToTilesIDs, customLayerRenderParameters.renderToTilesIDs) && Objects.equals(this.projection, customLayerRenderParameters.projection);
    }

    public double getBearing() {
        return this.bearing;
    }

    public ElevationData getElevationData() {
        return this.elevationData;
    }

    public double getFieldOfView() {
        return this.fieldOfView;
    }

    public double getHeight() {
        return this.height;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getPitch() {
        return this.pitch;
    }

    public CustomLayerMapProjection getProjection() {
        return this.projection;
    }

    public List<Double> getProjectionMatrix() {
        return this.projectionMatrix;
    }

    public List<CanonicalTileID> getRenderToTilesIDs() {
        return this.renderToTilesIDs;
    }

    public double getWidth() {
        return this.width;
    }

    public double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.width), Double.valueOf(this.height), Double.valueOf(this.latitude), Double.valueOf(this.longitude), Double.valueOf(this.zoom), Double.valueOf(this.bearing), Double.valueOf(this.pitch), Double.valueOf(this.fieldOfView), this.projectionMatrix, this.elevationData, this.renderToTilesIDs, this.projection);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[width: ");
        AbstractC3855a.m11835s(this.width, ", height: ", sb4);
        AbstractC3855a.m11835s(this.height, ", latitude: ", sb4);
        AbstractC3855a.m11835s(this.latitude, ", longitude: ", sb4);
        AbstractC3855a.m11835s(this.longitude, ", zoom: ", sb4);
        AbstractC3855a.m11835s(this.zoom, ", bearing: ", sb4);
        AbstractC3855a.m11835s(this.bearing, ", pitch: ", sb4);
        AbstractC3855a.m11835s(this.pitch, ", fieldOfView: ", sb4);
        AbstractC3855a.m11835s(this.fieldOfView, ", projectionMatrix: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.projectionMatrix));
        sb4.append(", elevationData: ");
        sb4.append(RecordUtils.fieldToString(this.elevationData));
        sb4.append(", renderToTilesIDs: ");
        sb4.append(RecordUtils.fieldToString(this.renderToTilesIDs));
        sb4.append(", projection: ");
        sb4.append(RecordUtils.fieldToString(this.projection));
        sb4.append("]");
        return sb4.toString();
    }

    @Deprecated
    public CustomLayerRenderParameters(double d3, double d14, double d15, double d16, double d17, double d18, double d19, double d24, List<Double> list, ElevationData elevationData, CustomLayerMapProjection customLayerMapProjection) {
        this.width = d3;
        this.height = d14;
        this.latitude = d15;
        this.longitude = d16;
        this.zoom = d17;
        this.bearing = d18;
        this.pitch = d19;
        this.fieldOfView = d24;
        this.projectionMatrix = list;
        this.elevationData = elevationData;
        this.renderToTilesIDs = null;
        this.projection = customLayerMapProjection;
    }
}
