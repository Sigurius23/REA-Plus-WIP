package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class CameraAnimationHintStage implements Serializable {
    private final CameraOptions camera;
    private final long progress;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private CameraOptions camera;
        private long progress;

        public CameraAnimationHintStage build() {
            if (this.camera != null) {
                return new CameraAnimationHintStage(this.progress, this.camera);
            }
            throw new NullPointerException("camera shouldn't be null");
        }

        public Builder camera(CameraOptions cameraOptions) {
            this.camera = cameraOptions;
            return this;
        }

        public Builder progress(long j7) {
            this.progress = j7;
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
        if (obj == null || CameraAnimationHintStage.class != obj.getClass()) {
            return false;
        }
        CameraAnimationHintStage cameraAnimationHintStage = (CameraAnimationHintStage) obj;
        return this.progress == cameraAnimationHintStage.progress && Objects.equals(this.camera, cameraAnimationHintStage.camera);
    }

    public CameraOptions getCamera() {
        return this.camera;
    }

    public long getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.progress), this.camera);
    }

    public Builder toBuilder() {
        return new Builder().progress(this.progress).camera(this.camera);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[progress: ");
        AbstractC3855a.m11836t(this.progress, ", camera: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.camera));
        sb4.append("]");
        return sb4.toString();
    }

    private CameraAnimationHintStage(long j7, CameraOptions cameraOptions) {
        this.progress = j7;
        this.camera = cameraOptions;
    }
}
