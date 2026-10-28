package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class TilesetDescriptorOptions implements Serializable {
    private final Value extraOptions;
    private final byte maxZoom;
    private final byte minZoom;
    private final float pixelRatio;
    private final StylePackLoadOptions stylePackOptions;
    private final String styleURI;
    private final List<String> tilesets;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private Value extraOptions;
        private byte maxZoom;
        private byte minZoom;
        private float pixelRatio = 1.0f;
        private StylePackLoadOptions stylePackOptions;
        private String styleURI;
        private List<String> tilesets;

        public TilesetDescriptorOptions build() {
            if (this.styleURI != null) {
                return new TilesetDescriptorOptions(this.styleURI, this.minZoom, this.maxZoom, this.pixelRatio, this.tilesets, this.stylePackOptions, this.extraOptions);
            }
            throw new NullPointerException("styleURI shouldn't be null");
        }

        public Builder extraOptions(Value value) {
            this.extraOptions = value;
            return this;
        }

        public Builder maxZoom(byte b) {
            this.maxZoom = b;
            return this;
        }

        public Builder minZoom(byte b) {
            this.minZoom = b;
            return this;
        }

        public Builder pixelRatio(float f13) {
            this.pixelRatio = f13;
            return this;
        }

        public Builder stylePackOptions(StylePackLoadOptions stylePackLoadOptions) {
            this.stylePackOptions = stylePackLoadOptions;
            return this;
        }

        public Builder styleURI(String str) {
            this.styleURI = str;
            return this;
        }

        public Builder tilesets(List<String> list) {
            this.tilesets = list;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TilesetDescriptorOptions.class != obj.getClass()) {
            return false;
        }
        TilesetDescriptorOptions tilesetDescriptorOptions = (TilesetDescriptorOptions) obj;
        return Objects.equals(this.styleURI, tilesetDescriptorOptions.styleURI) && this.minZoom == tilesetDescriptorOptions.minZoom && this.maxZoom == tilesetDescriptorOptions.maxZoom && PartialEq.compare(this.pixelRatio, tilesetDescriptorOptions.pixelRatio) && Objects.equals(this.tilesets, tilesetDescriptorOptions.tilesets) && Objects.equals(this.stylePackOptions, tilesetDescriptorOptions.stylePackOptions) && Objects.equals(this.extraOptions, tilesetDescriptorOptions.extraOptions);
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public byte getMaxZoom() {
        return this.maxZoom;
    }

    public byte getMinZoom() {
        return this.minZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public StylePackLoadOptions getStylePackOptions() {
        return this.stylePackOptions;
    }

    public String getStyleURI() {
        return this.styleURI;
    }

    public List<String> getTilesets() {
        return this.tilesets;
    }

    public int hashCode() {
        return Objects.hash(this.styleURI, Byte.valueOf(this.minZoom), Byte.valueOf(this.maxZoom), Float.valueOf(this.pixelRatio), this.tilesets, this.stylePackOptions, this.extraOptions);
    }

    public Builder toBuilder() {
        return new Builder().styleURI(this.styleURI).minZoom(this.minZoom).maxZoom(this.maxZoom).pixelRatio(this.pixelRatio).tilesets(this.tilesets).stylePackOptions(this.stylePackOptions).extraOptions(this.extraOptions);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[styleURI: ");
        AbstractC3855a.m11838v(this.styleURI, ", minZoom: ", sb4);
        sb4.append(RecordUtils.fieldToString(Byte.valueOf(this.minZoom)));
        sb4.append(", maxZoom: ");
        sb4.append(RecordUtils.fieldToString(Byte.valueOf(this.maxZoom)));
        sb4.append(", pixelRatio: ");
        sb4.append(RecordUtils.fieldToString(Float.valueOf(this.pixelRatio)));
        sb4.append(", tilesets: ");
        sb4.append(RecordUtils.fieldToString(this.tilesets));
        sb4.append(", stylePackOptions: ");
        sb4.append(RecordUtils.fieldToString(this.stylePackOptions));
        sb4.append(", extraOptions: ");
        sb4.append(RecordUtils.fieldToString(this.extraOptions));
        sb4.append("]");
        return sb4.toString();
    }

    private TilesetDescriptorOptions(String str, byte b, byte b6, float f13, List<String> list, StylePackLoadOptions stylePackLoadOptions, Value value) {
        this.styleURI = str;
        this.minZoom = b;
        this.maxZoom = b6;
        this.pixelRatio = f13;
        this.tilesets = list;
        this.stylePackOptions = stylePackLoadOptions;
        this.extraOptions = value;
    }

    private TilesetDescriptorOptions(String str, byte b, byte b6, List<String> list, StylePackLoadOptions stylePackLoadOptions, Value value) {
        this.styleURI = str;
        this.minZoom = b;
        this.maxZoom = b6;
        this.tilesets = list;
        this.stylePackOptions = stylePackLoadOptions;
        this.extraOptions = value;
        this.pixelRatio = 1.0f;
    }
}
