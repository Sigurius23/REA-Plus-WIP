package com.whoop.labrador.feature.details.domain.model;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;", "", "title", "", "trendType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getTrendType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ShepherdReading {
    public static final int $stable = 0;
    private final String title;
    private final String trendType;

    /* JADX WARN: Multi-variable type inference failed */
    public ShepherdReading() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShepherdReading copy$default(ShepherdReading shepherdReading, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shepherdReading.title;
        }
        if ((i13 & 2) != 0) {
            str2 = shepherdReading.trendType;
        }
        return shepherdReading.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrendType() {
        return this.trendType;
    }

    public final ShepherdReading copy(String title, String trendType) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trendType, "trendType");
        return new ShepherdReading(title, trendType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdReading)) {
            return false;
        }
        ShepherdReading shepherdReading = (ShepherdReading) other;
        return AbstractC22676k.m65745e(this.title, shepherdReading.title) && AbstractC22676k.m65745e(this.trendType, shepherdReading.trendType);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrendType() {
        return this.trendType;
    }

    public int hashCode() {
        return this.trendType.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("ShepherdReading(title=", this.title, ", trendType=", this.trendType, ")");
    }

    public ShepherdReading(String title, String trendType) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trendType, "trendType");
        this.title = title;
        this.trendType = trendType;
    }

    public /* synthetic */ ShepherdReading(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2);
    }
}
