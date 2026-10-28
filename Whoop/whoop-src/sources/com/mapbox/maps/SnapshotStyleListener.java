package com.mapbox.maps;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lcom/mapbox/maps/SnapshotStyleListener;", "", "Lcom/mapbox/maps/Style;", "style", "Ll83/a0;", "onDidFinishLoadingStyle", "(Lcom/mapbox/maps/Style;)V", "onDidFullyLoadStyle", "", "message", "onDidFailLoadingStyle", "(Ljava/lang/String;)V", "imageId", "onStyleImageMissing", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface SnapshotStyleListener {

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class DefaultImpls {
        public static void onDidFailLoadingStyle(SnapshotStyleListener snapshotStyleListener, String message) {
            AbstractC22676k.m65750j(message, "message");
        }

        public static void onDidFullyLoadStyle(SnapshotStyleListener snapshotStyleListener, Style style) {
            AbstractC22676k.m65750j(style, "style");
        }

        public static void onStyleImageMissing(SnapshotStyleListener snapshotStyleListener, String imageId) {
            AbstractC22676k.m65750j(imageId, "imageId");
        }
    }

    void onDidFailLoadingStyle(String message);

    void onDidFinishLoadingStyle(Style style);

    void onDidFullyLoadStyle(Style style);

    void onStyleImageMissing(String imageId);
}
