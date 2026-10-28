package com.mapbox.maps;

import android.graphics.Bitmap;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/mapbox/maps/SnapshotResultCallback;", "", "Landroid/graphics/Bitmap;", "snapshot", "", "errorMessage", "Ll83/a0;", "onSnapshotResult", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface SnapshotResultCallback {
    void onSnapshotResult(Bitmap snapshot, String errorMessage);
}
