package com.mapbox.geojson;

import androidx.annotation.Keep;
import c13.AbstractC3855a;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class MultiPoint implements CoordinateContainer<List<Point>> {
    private static final String TYPE = "MultiPoint";
    private final BoundingBox bbox;
    private final List<Point> coordinates;
    private final String type;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiPoint, List<Point>> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfPointCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<Point>> createCoordinateContainer(String str, BoundingBox boundingBox, List<Point> list) {
            if (str == null) {
                str = MultiPoint.TYPE;
            }
            return new MultiPoint(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public MultiPoint read2(JsonReader jsonReader) throws IOException {
            return (MultiPoint) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MultiPoint multiPoint) throws IOException {
            writeCoordinateContainer(jsonWriter, multiPoint);
        }
    }

    public MultiPoint(String str, BoundingBox boundingBox, List<Point> list) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list == null) {
            throw new NullPointerException("Null coordinates");
        }
        this.coordinates = list;
    }

    public static MultiPoint fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (MultiPoint) gsonBuilder.create().fromJson(str, MultiPoint.class);
    }

    public static MultiPoint fromLngLats(List<Point> list) {
        return new MultiPoint(TYPE, null, list);
    }

    public static TypeAdapter<MultiPoint> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    @Override // com.mapbox.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        BoundingBox boundingBox;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MultiPoint) {
            MultiPoint multiPoint = (MultiPoint) obj;
            if (this.type.equals(multiPoint.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(multiPoint.bbox()) : multiPoint.bbox() == null) && this.coordinates.equals(multiPoint.coordinates())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((iHashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.coordinates.hashCode();
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("MultiPoint{type=");
        sb4.append(this.type);
        sb4.append(", bbox=");
        sb4.append(this.bbox);
        sb4.append(", coordinates=");
        return AbstractC3855a.m11829m(sb4, this.coordinates, "}");
    }

    @Override // com.mapbox.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static MultiPoint fromLngLats(List<Point> list, BoundingBox boundingBox) {
        return new MultiPoint(TYPE, boundingBox, list);
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    public List<Point> coordinates() {
        return this.coordinates;
    }

    public static MultiPoint fromLngLats(double[][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[] dArr2 : dArr) {
            arrayList.add(Point.fromLngLat(dArr2));
        }
        return new MultiPoint(TYPE, null, arrayList);
    }
}
