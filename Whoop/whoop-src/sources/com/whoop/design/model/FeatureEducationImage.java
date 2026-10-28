package com.whoop.design.model;

import io.getstream.chat.android.client.api.QueryParams;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/design/model/FeatureEducationImage;", "", QueryParams.URL, "", "mediaType", "Lcom/whoop/design/model/MediaType;", "<init>", "(Ljava/lang/String;Lcom/whoop/design/model/MediaType;)V", "getUrl", "()Ljava/lang/String;", "getMediaType", "()Lcom/whoop/design/model/MediaType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class FeatureEducationImage {
    public static final int $stable = 0;
    private final MediaType mediaType;
    private final String url;

    public FeatureEducationImage(String url, MediaType mediaType) {
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(mediaType, "mediaType");
        this.url = url;
        this.mediaType = mediaType;
    }

    public static /* synthetic */ FeatureEducationImage copy$default(FeatureEducationImage featureEducationImage, String str, MediaType mediaType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = featureEducationImage.url;
        }
        if ((i13 & 2) != 0) {
            mediaType = featureEducationImage.mediaType;
        }
        return featureEducationImage.copy(str, mediaType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MediaType getMediaType() {
        return this.mediaType;
    }

    public final FeatureEducationImage copy(String url, MediaType mediaType) {
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(mediaType, "mediaType");
        return new FeatureEducationImage(url, mediaType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEducationImage)) {
            return false;
        }
        FeatureEducationImage featureEducationImage = (FeatureEducationImage) other;
        return AbstractC22676k.m65745e(this.url, featureEducationImage.url) && this.mediaType == featureEducationImage.mediaType;
    }

    public final MediaType getMediaType() {
        return this.mediaType;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.mediaType.hashCode() + (this.url.hashCode() * 31);
    }

    public String toString() {
        return "FeatureEducationImage(url=" + this.url + ", mediaType=" + this.mediaType + ")";
    }
}
