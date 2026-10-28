package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class Feature implements GeoJson {
    private static final String TYPE = "Feature";

    @JsonAdapter(BoundingBoxTypeAdapter.class)
    private final BoundingBox bbox;
    private final Geometry geometry;

    /* JADX INFO: renamed from: id */
    private final String f21943id;
    private final JsonObject properties;
    private final String type;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<Feature> {
        private volatile TypeAdapter<BoundingBox> boundingBoxTypeAdapter;
        private volatile TypeAdapter<Geometry> geometryTypeAdapter;
        private final Gson gson;
        private volatile TypeAdapter<JsonObject> jsonObjectTypeAdapter;
        private volatile TypeAdapter<String> stringTypeAdapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Feature read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            BoundingBox boundingBox = null;
            String str2 = null;
            Geometry geometry = null;
            JsonObject jsonObject = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "properties":
                            TypeAdapter<JsonObject> adapter = this.jsonObjectTypeAdapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(JsonObject.class);
                                this.jsonObjectTypeAdapter = adapter;
                            }
                            jsonObject = adapter.read2(jsonReader);
                            break;
                        case "id":
                            TypeAdapter<String> adapter2 = this.stringTypeAdapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(String.class);
                                this.stringTypeAdapter = adapter2;
                            }
                            str2 = adapter2.read2(jsonReader);
                            break;
                        case "bbox":
                            TypeAdapter<BoundingBox> adapter3 = this.boundingBoxTypeAdapter;
                            if (adapter3 == null) {
                                adapter3 = this.gson.getAdapter(BoundingBox.class);
                                this.boundingBoxTypeAdapter = adapter3;
                            }
                            boundingBox = adapter3.read2(jsonReader);
                            break;
                        case "type":
                            TypeAdapter<String> adapter4 = this.stringTypeAdapter;
                            if (adapter4 == null) {
                                adapter4 = this.gson.getAdapter(String.class);
                                this.stringTypeAdapter = adapter4;
                            }
                            str = adapter4.read2(jsonReader);
                            break;
                        case "geometry":
                            TypeAdapter<Geometry> adapter5 = this.geometryTypeAdapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(Geometry.class);
                                this.geometryTypeAdapter = adapter5;
                            }
                            geometry = adapter5.read2(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } else {
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
            return new Feature(str, boundingBox, str2, geometry, jsonObject);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Feature feature) throws IOException {
            if (feature == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            if (feature.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.stringTypeAdapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.stringTypeAdapter = adapter;
                }
                adapter.write(jsonWriter, feature.type());
            }
            jsonWriter.name("bbox");
            if (feature.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> adapter2 = this.boundingBoxTypeAdapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBoxTypeAdapter = adapter2;
                }
                adapter2.write(jsonWriter, feature.bbox());
            }
            jsonWriter.name("id");
            if (feature.m16627id() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter3 = this.stringTypeAdapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.stringTypeAdapter = adapter3;
                }
                adapter3.write(jsonWriter, feature.m16627id());
            }
            jsonWriter.name("geometry");
            if (feature.geometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Geometry> adapter4 = this.geometryTypeAdapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(Geometry.class);
                    this.geometryTypeAdapter = adapter4;
                }
                adapter4.write(jsonWriter, feature.geometry());
            }
            jsonWriter.name("properties");
            if (feature.properties() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<JsonObject> adapter5 = this.jsonObjectTypeAdapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(JsonObject.class);
                    this.jsonObjectTypeAdapter = adapter5;
                }
                adapter5.write(jsonWriter, feature.properties());
            }
            jsonWriter.endObject();
        }
    }

    public Feature(String str, BoundingBox boundingBox, String str2, Geometry geometry, JsonObject jsonObject) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        this.bbox = boundingBox;
        this.f21943id = str2;
        this.geometry = geometry;
        this.properties = jsonObject;
    }

    public static Feature fromGeometry(Geometry geometry) {
        return new Feature(TYPE, null, null, geometry, new JsonObject());
    }

    public static Feature fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        Feature feature = (Feature) gsonBuilder.create().fromJson(str, Feature.class);
        return feature.properties() != null ? feature : new Feature(TYPE, feature.bbox(), feature.m16627id(), feature.geometry(), new JsonObject());
    }

    public static TypeAdapter<Feature> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public void addBooleanProperty(String str, Boolean bool) {
        properties().addProperty(str, bool);
    }

    public void addCharacterProperty(String str, Character ch4) {
        properties().addProperty(str, ch4);
    }

    public void addNumberProperty(String str, Number number) {
        properties().addProperty(str, number);
    }

    public void addProperty(String str, JsonElement jsonElement) {
        properties().add(str, jsonElement);
    }

    public void addStringProperty(String str, String str2) {
        properties().addProperty(str, str2);
    }

    @Override // com.mapbox.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        BoundingBox boundingBox;
        String str;
        Geometry geometry;
        JsonObject jsonObject;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (this.type.equals(feature.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(feature.bbox()) : feature.bbox() == null) && ((str = this.f21943id) != null ? str.equals(feature.m16627id()) : feature.m16627id() == null) && ((geometry = this.geometry) != null ? geometry.equals(feature.geometry()) : feature.geometry() == null) && ((jsonObject = this.properties) != null ? jsonObject.equals(feature.properties()) : feature.properties() == null)) {
                return true;
            }
        }
        return false;
    }

    public Geometry geometry() {
        return this.geometry;
    }

    public Boolean getBooleanProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return Boolean.valueOf(jsonElement.getAsBoolean());
    }

    public Character getCharacterProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return Character.valueOf(jsonElement.getAsCharacter());
    }

    public Number getNumberProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsNumber();
    }

    public JsonElement getProperty(String str) {
        return properties().get(str);
    }

    public String getStringProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public boolean hasNonNullValueForProperty(String str) {
        return hasProperty(str) && !getProperty(str).isJsonNull();
    }

    public boolean hasProperty(String str) {
        return properties().has(str);
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        int iHashCode2 = (iHashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003;
        String str = this.f21943id;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Geometry geometry = this.geometry;
        int iHashCode4 = (iHashCode3 ^ (geometry == null ? 0 : geometry.hashCode())) * 1000003;
        JsonObject jsonObject = this.properties;
        return iHashCode4 ^ (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    /* JADX INFO: renamed from: id */
    public String m16627id() {
        return this.f21943id;
    }

    public JsonObject properties() {
        return this.properties;
    }

    public JsonElement removeProperty(String str) {
        return properties().remove(str);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        return new GsonBuilder().registerTypeAdapterFactory(GeoJsonAdapterFactory.create()).registerTypeAdapterFactory(GeometryAdapterFactory.create()).create().toJson(properties().size() == 0 ? new Feature(TYPE, bbox(), m16627id(), geometry(), null) : this);
    }

    public String toString() {
        return "Feature{type=" + this.type + ", bbox=" + this.bbox + ", id=" + this.f21943id + ", geometry=" + this.geometry + ", properties=" + this.properties + "}";
    }

    @Override // com.mapbox.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static Feature fromGeometry(Geometry geometry, BoundingBox boundingBox) {
        return new Feature(TYPE, boundingBox, null, geometry, new JsonObject());
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, null, null, geometry, jsonObject);
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, boundingBox, null, geometry, jsonObject);
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, String str) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, null, str, geometry, jsonObject);
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, String str, BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, boundingBox, str, geometry, jsonObject);
    }
}
