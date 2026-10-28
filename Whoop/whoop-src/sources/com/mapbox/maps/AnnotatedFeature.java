package com.mapbox.maps;

import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes.dex */
public class AnnotatedFeature {
    private Type type;
    private Object value;

    /* JADX INFO: loaded from: classes6.dex */
    public enum Type {
        GEOMETRY,
        ANNOTATED_LAYER_FEATURE
    }

    public AnnotatedFeature(Geometry geometry) {
        this.type = Type.GEOMETRY;
        this.value = geometry;
    }

    public static AnnotatedFeature valueOf(Geometry geometry) {
        return new AnnotatedFeature(geometry);
    }

    public AnnotatedLayerFeature getAnnotatedLayerFeature() {
        if (isAnnotatedLayerFeature()) {
            return (AnnotatedLayerFeature) this.value;
        }
        throw new IllegalStateException("The content of the variant does not have type (AnnotatedLayerFeature)");
    }

    public Geometry getGeometry() {
        if (isGeometry()) {
            return (Geometry) this.value;
        }
        throw new IllegalStateException("The content of the variant does not have type (Geometry)");
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isAnnotatedLayerFeature() {
        return this.type == Type.ANNOTATED_LAYER_FEATURE;
    }

    public boolean isGeometry() {
        return this.type == Type.GEOMETRY;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static AnnotatedFeature valueOf(AnnotatedLayerFeature annotatedLayerFeature) {
        return new AnnotatedFeature(annotatedLayerFeature);
    }

    public AnnotatedFeature(AnnotatedLayerFeature annotatedLayerFeature) {
        this.type = Type.ANNOTATED_LAYER_FEATURE;
        this.value = annotatedLayerFeature;
    }
}
