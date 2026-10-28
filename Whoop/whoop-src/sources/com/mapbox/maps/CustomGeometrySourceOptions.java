package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class CustomGeometrySourceOptions implements Serializable {
    private final TileFunctionCallback cancelTileFunction;
    private final TileFunctionCallback fetchTileFunction;
    private final byte maxZoom;
    private final byte minZoom;
    private final TileOptions tileOptions;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private TileFunctionCallback cancelTileFunction;
        private TileFunctionCallback fetchTileFunction;
        private TileOptions tileOptions;
        private byte minZoom = 0;
        private byte maxZoom = 18;

        public CustomGeometrySourceOptions build() {
            if (this.fetchTileFunction == null) {
                throw new NullPointerException("fetchTileFunction shouldn't be null");
            }
            if (this.cancelTileFunction == null) {
                throw new NullPointerException("cancelTileFunction shouldn't be null");
            }
            if (this.tileOptions != null) {
                return new CustomGeometrySourceOptions(this.fetchTileFunction, this.cancelTileFunction, this.minZoom, this.maxZoom, this.tileOptions);
            }
            throw new NullPointerException("tileOptions shouldn't be null");
        }

        public Builder cancelTileFunction(TileFunctionCallback tileFunctionCallback) {
            this.cancelTileFunction = tileFunctionCallback;
            return this;
        }

        public Builder fetchTileFunction(TileFunctionCallback tileFunctionCallback) {
            this.fetchTileFunction = tileFunctionCallback;
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

        public Builder tileOptions(TileOptions tileOptions) {
            this.tileOptions = tileOptions;
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
        if (obj == null || CustomGeometrySourceOptions.class != obj.getClass()) {
            return false;
        }
        CustomGeometrySourceOptions customGeometrySourceOptions = (CustomGeometrySourceOptions) obj;
        return Objects.equals(this.fetchTileFunction, customGeometrySourceOptions.fetchTileFunction) && Objects.equals(this.cancelTileFunction, customGeometrySourceOptions.cancelTileFunction) && this.minZoom == customGeometrySourceOptions.minZoom && this.maxZoom == customGeometrySourceOptions.maxZoom && Objects.equals(this.tileOptions, customGeometrySourceOptions.tileOptions);
    }

    public TileFunctionCallback getCancelTileFunction() {
        return this.cancelTileFunction;
    }

    public TileFunctionCallback getFetchTileFunction() {
        return this.fetchTileFunction;
    }

    public byte getMaxZoom() {
        return this.maxZoom;
    }

    public byte getMinZoom() {
        return this.minZoom;
    }

    public TileOptions getTileOptions() {
        return this.tileOptions;
    }

    public int hashCode() {
        return Objects.hash(this.fetchTileFunction, this.cancelTileFunction, Byte.valueOf(this.minZoom), Byte.valueOf(this.maxZoom), this.tileOptions);
    }

    public Builder toBuilder() {
        return new Builder().fetchTileFunction(this.fetchTileFunction).cancelTileFunction(this.cancelTileFunction).minZoom(this.minZoom).maxZoom(this.maxZoom).tileOptions(this.tileOptions);
    }

    public String toString() {
        return "[fetchTileFunction: " + RecordUtils.fieldToString(this.fetchTileFunction) + ", cancelTileFunction: " + RecordUtils.fieldToString(this.cancelTileFunction) + ", minZoom: " + RecordUtils.fieldToString(Byte.valueOf(this.minZoom)) + ", maxZoom: " + RecordUtils.fieldToString(Byte.valueOf(this.maxZoom)) + ", tileOptions: " + RecordUtils.fieldToString(this.tileOptions) + "]";
    }

    private CustomGeometrySourceOptions(TileFunctionCallback tileFunctionCallback, TileFunctionCallback tileFunctionCallback2, byte b, byte b6, TileOptions tileOptions) {
        this.fetchTileFunction = tileFunctionCallback;
        this.cancelTileFunction = tileFunctionCallback2;
        this.minZoom = b;
        this.maxZoom = b6;
        this.tileOptions = tileOptions;
    }

    private CustomGeometrySourceOptions(TileFunctionCallback tileFunctionCallback, TileFunctionCallback tileFunctionCallback2, TileOptions tileOptions) {
        this.fetchTileFunction = tileFunctionCallback;
        this.cancelTileFunction = tileFunctionCallback2;
        this.tileOptions = tileOptions;
        this.minZoom = (byte) 0;
        this.maxZoom = (byte) 18;
    }
}
