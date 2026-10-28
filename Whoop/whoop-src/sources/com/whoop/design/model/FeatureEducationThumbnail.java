package com.whoop.design.model;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m65681d2 = {"Lcom/whoop/design/model/FeatureEducationThumbnail;", "", "id", "", "createdAt", "", "updatedAt", QueryParams.URL, "scrim", "alignment", "backgroundImage", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()I", "getCreatedAt", "()Ljava/lang/String;", "getUpdatedAt", "getUrl", "getScrim", "getAlignment", "getBackgroundImage", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class FeatureEducationThumbnail {
    public static final int $stable = 0;
    private final String alignment;
    private final boolean backgroundImage;
    private final String createdAt;
    private final int id;
    private final String scrim;
    private final String updatedAt;
    private final String url;

    public FeatureEducationThumbnail(int i13, String createdAt, String updatedAt, String url, String str, String alignment, boolean z4) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(alignment, "alignment");
        this.id = i13;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.url = url;
        this.scrim = str;
        this.alignment = alignment;
        this.backgroundImage = z4;
    }

    public static /* synthetic */ FeatureEducationThumbnail copy$default(FeatureEducationThumbnail featureEducationThumbnail, int i13, String str, String str2, String str3, String str4, String str5, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = featureEducationThumbnail.id;
        }
        if ((i14 & 2) != 0) {
            str = featureEducationThumbnail.createdAt;
        }
        if ((i14 & 4) != 0) {
            str2 = featureEducationThumbnail.updatedAt;
        }
        if ((i14 & 8) != 0) {
            str3 = featureEducationThumbnail.url;
        }
        if ((i14 & 16) != 0) {
            str4 = featureEducationThumbnail.scrim;
        }
        if ((i14 & 32) != 0) {
            str5 = featureEducationThumbnail.alignment;
        }
        if ((i14 & 64) != 0) {
            z4 = featureEducationThumbnail.backgroundImage;
        }
        String str6 = str5;
        boolean z13 = z4;
        String str7 = str4;
        String str8 = str2;
        return featureEducationThumbnail.copy(i13, str, str8, str3, str7, str6, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getScrim() {
        return this.scrim;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getBackgroundImage() {
        return this.backgroundImage;
    }

    public final FeatureEducationThumbnail copy(int id4, String createdAt, String updatedAt, String url, String scrim, String alignment, boolean backgroundImage) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(alignment, "alignment");
        return new FeatureEducationThumbnail(id4, createdAt, updatedAt, url, scrim, alignment, backgroundImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEducationThumbnail)) {
            return false;
        }
        FeatureEducationThumbnail featureEducationThumbnail = (FeatureEducationThumbnail) other;
        return this.id == featureEducationThumbnail.id && AbstractC22676k.m65745e(this.createdAt, featureEducationThumbnail.createdAt) && AbstractC22676k.m65745e(this.updatedAt, featureEducationThumbnail.updatedAt) && AbstractC22676k.m65745e(this.url, featureEducationThumbnail.url) && AbstractC22676k.m65745e(this.scrim, featureEducationThumbnail.scrim) && AbstractC22676k.m65745e(this.alignment, featureEducationThumbnail.alignment) && this.backgroundImage == featureEducationThumbnail.backgroundImage;
    }

    public final String getAlignment() {
        return this.alignment;
    }

    public final boolean getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.id;
    }

    public final String getScrim() {
        return this.scrim;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.createdAt), 31, this.updatedAt), 31, this.url);
        String str = this.scrim;
        return Boolean.hashCode(this.backgroundImage) + AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.alignment);
    }

    public String toString() {
        int i13 = this.id;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        String str3 = this.url;
        String str4 = this.scrim;
        String str5 = this.alignment;
        boolean z4 = this.backgroundImage;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "FeatureEducationThumbnail(id=", ", createdAt=", str, ", updatedAt=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", url=", str3, ", scrim=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", alignment=", str5, ", backgroundImage=");
        return AbstractC18489d0.m53372m(sbM53373n, z4, ")");
    }
}
