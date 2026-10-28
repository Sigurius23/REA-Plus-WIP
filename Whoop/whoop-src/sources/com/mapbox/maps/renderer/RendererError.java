package com.mapbox.maps.renderer;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m65681d2 = {"Lcom/mapbox/maps/renderer/RendererError;", "", "eglErrorCode", "", "(I)V", "getEglErrorCode", "()I", "equals", "", "other", "hashCode", "toString", "", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class RendererError {
    public static final RendererError NO_VALID_EGL_CONFIG_FOUND = new RendererError(0);
    public static final RendererError OUT_OF_MEMORY = new RendererError(12291);
    private final int eglErrorCode;

    public RendererError(int i13) {
        this.eglErrorCode = i13;
    }

    public boolean equals(Object other) {
        return (other instanceof RendererError) && this.eglErrorCode == ((RendererError) other).eglErrorCode;
    }

    public final int getEglErrorCode() {
        return this.eglErrorCode;
    }

    public int hashCode() {
        return Integer.hashCode(this.eglErrorCode);
    }

    public String toString() {
        return this.eglErrorCode == 0 ? "RendererError(NO_VALID_EGL_CONFIG_FOUND)" : AbstractC11895b.m31999r(new StringBuilder("RendererError(EGL_ERROR_CODE="), this.eglErrorCode, ')');
    }
}
