package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class CustomRasterSourceOptions implements Serializable {
    private final CustomRasterSourceClient clientCallback;
    private final byte maxZoom;
    private final byte minZoom;
    private final short tileSize;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private CustomRasterSourceClient clientCallback;
        private byte minZoom = 0;
        private byte maxZoom = 18;
        private short tileSize = 512;

        public CustomRasterSourceOptions build() {
            if (this.clientCallback != null) {
                return new CustomRasterSourceOptions(this.clientCallback, this.minZoom, this.maxZoom, this.tileSize);
            }
            throw new NullPointerException("clientCallback shouldn't be null");
        }

        public Builder clientCallback(CustomRasterSourceClient customRasterSourceClient) {
            this.clientCallback = customRasterSourceClient;
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

        public Builder tileSize(short s13) {
            this.tileSize = s13;
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
        if (obj == null || CustomRasterSourceOptions.class != obj.getClass()) {
            return false;
        }
        CustomRasterSourceOptions customRasterSourceOptions = (CustomRasterSourceOptions) obj;
        return Objects.equals(this.clientCallback, customRasterSourceOptions.clientCallback) && this.minZoom == customRasterSourceOptions.minZoom && this.maxZoom == customRasterSourceOptions.maxZoom && this.tileSize == customRasterSourceOptions.tileSize;
    }

    public CustomRasterSourceClient getClientCallback() {
        return this.clientCallback;
    }

    public byte getMaxZoom() {
        return this.maxZoom;
    }

    public byte getMinZoom() {
        return this.minZoom;
    }

    public short getTileSize() {
        return this.tileSize;
    }

    public int hashCode() {
        return Objects.hash(this.clientCallback, Byte.valueOf(this.minZoom), Byte.valueOf(this.maxZoom), Short.valueOf(this.tileSize));
    }

    public Builder toBuilder() {
        return new Builder().clientCallback(this.clientCallback).minZoom(this.minZoom).maxZoom(this.maxZoom).tileSize(this.tileSize);
    }

    public String toString() {
        return "[clientCallback: " + RecordUtils.fieldToString(this.clientCallback) + ", minZoom: " + RecordUtils.fieldToString(Byte.valueOf(this.minZoom)) + ", maxZoom: " + RecordUtils.fieldToString(Byte.valueOf(this.maxZoom)) + ", tileSize: " + RecordUtils.fieldToString(Short.valueOf(this.tileSize)) + "]";
    }

    private CustomRasterSourceOptions(CustomRasterSourceClient customRasterSourceClient, byte b, byte b6, short s13) {
        this.clientCallback = customRasterSourceClient;
        this.minZoom = b;
        this.maxZoom = b6;
        this.tileSize = s13;
    }

    private CustomRasterSourceOptions(CustomRasterSourceClient customRasterSourceClient) {
        this.clientCallback = customRasterSourceClient;
        this.minZoom = (byte) 0;
        this.maxZoom = (byte) 18;
        this.tileSize = (short) 512;
    }
}
