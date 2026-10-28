package com.mapbox.maps;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/mapbox/maps/SnapshotterDestroyedException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "()V", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class SnapshotterDestroyedException extends IllegalStateException {
    public SnapshotterDestroyedException() {
        super("This snapshotter was already destroyed.");
    }
}
