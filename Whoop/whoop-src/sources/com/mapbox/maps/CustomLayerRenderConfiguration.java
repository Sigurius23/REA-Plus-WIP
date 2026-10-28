package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class CustomLayerRenderConfiguration implements Serializable {
    private final boolean isRenderToTileSupported;
    private final boolean shouldRerenderTiles;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private boolean isRenderToTileSupported = false;
        private boolean shouldRerenderTiles = false;

        public CustomLayerRenderConfiguration build() {
            return new CustomLayerRenderConfiguration(this.isRenderToTileSupported, this.shouldRerenderTiles);
        }

        public Builder isRenderToTileSupported(boolean z4) {
            this.isRenderToTileSupported = z4;
            return this;
        }

        public Builder shouldRerenderTiles(boolean z4) {
            this.shouldRerenderTiles = z4;
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
        if (obj == null || CustomLayerRenderConfiguration.class != obj.getClass()) {
            return false;
        }
        CustomLayerRenderConfiguration customLayerRenderConfiguration = (CustomLayerRenderConfiguration) obj;
        return this.isRenderToTileSupported == customLayerRenderConfiguration.isRenderToTileSupported && this.shouldRerenderTiles == customLayerRenderConfiguration.shouldRerenderTiles;
    }

    public boolean getIsRenderToTileSupported() {
        return this.isRenderToTileSupported;
    }

    public boolean getShouldRerenderTiles() {
        return this.shouldRerenderTiles;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isRenderToTileSupported), Boolean.valueOf(this.shouldRerenderTiles));
    }

    public Builder toBuilder() {
        return new Builder().isRenderToTileSupported(this.isRenderToTileSupported).shouldRerenderTiles(this.shouldRerenderTiles);
    }

    public String toString() {
        return "[isRenderToTileSupported: " + RecordUtils.fieldToString(Boolean.valueOf(this.isRenderToTileSupported)) + ", shouldRerenderTiles: " + RecordUtils.fieldToString(Boolean.valueOf(this.shouldRerenderTiles)) + "]";
    }

    private CustomLayerRenderConfiguration(boolean z4, boolean z13) {
        this.isRenderToTileSupported = z4;
        this.shouldRerenderTiles = z13;
    }

    private CustomLayerRenderConfiguration() {
        this.isRenderToTileSupported = false;
        this.shouldRerenderTiles = false;
    }
}
