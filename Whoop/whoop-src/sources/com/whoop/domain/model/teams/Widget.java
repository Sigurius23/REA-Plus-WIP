package com.whoop.domain.model.teams;

import com.whoop.community.share.WidgetCollectionName;
import com.whoop.data.remote.domain.dto.community.share.WidgetDto;
import p000.AbstractC11266d;
import p093dl.C12144i;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import uq0.C35160a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012JF\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b&\u0010\u0012¨\u0006("}, m65681d2 = {"Lcom/whoop/domain/model/teams/Widget;", "", "Lcom/whoop/community/share/WidgetCollectionName;", "collection", "", "collectionDisplayIndex", "", "imageUrl", "Ldl/i;", "glideUrlWithAuthHeaders", "imageShareFilePath", "<init>", "(Lcom/whoop/community/share/WidgetCollectionName;ILjava/lang/String;Ldl/i;Ljava/lang/String;)V", "component1", "()Lcom/whoop/community/share/WidgetCollectionName;", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "()Ldl/i;", "component5", "copy", "(Lcom/whoop/community/share/WidgetCollectionName;ILjava/lang/String;Ldl/i;Ljava/lang/String;)Lcom/whoop/domain/model/teams/Widget;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/community/share/WidgetCollectionName;", "getCollection", "I", "getCollectionDisplayIndex", "Ljava/lang/String;", "getImageUrl", "Ldl/i;", "getGlideUrlWithAuthHeaders", "getImageShareFilePath", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class Widget {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final WidgetCollectionName collection;
    private final int collectionDisplayIndex;
    private final C12144i glideUrlWithAuthHeaders;
    private final String imageShareFilePath;
    private final String imageUrl;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/teams/Widget$Companion;", "", "<init>", "()V", "fromDto", "Lcom/whoop/domain/model/teams/Widget;", "dto", "Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Widget fromDto(WidgetDto dto) {
            AbstractC22676k.m65750j(dto, "dto");
            WidgetCollectionName widgetCollectionNameM111267a = C35160a.f149232a.m111267a(dto.getCollection());
            Integer collectionDisplayIndex = dto.getCollectionDisplayIndex();
            int iIntValue = collectionDisplayIndex != null ? collectionDisplayIndex.intValue() : 0;
            String imageUrl = dto.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            return new Widget(widgetCollectionNameM111267a, iIntValue, imageUrl, null, null, 24, null);
        }

        private Companion() {
        }
    }

    public Widget(WidgetCollectionName collection, int i13, String imageUrl, C12144i c12144i, String str) {
        AbstractC22676k.m65750j(collection, "collection");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        this.collection = collection;
        this.collectionDisplayIndex = i13;
        this.imageUrl = imageUrl;
        this.glideUrlWithAuthHeaders = c12144i;
        this.imageShareFilePath = str;
    }

    public static /* synthetic */ Widget copy$default(Widget widget, WidgetCollectionName widgetCollectionName, int i13, String str, C12144i c12144i, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            widgetCollectionName = widget.collection;
        }
        if ((i14 & 2) != 0) {
            i13 = widget.collectionDisplayIndex;
        }
        if ((i14 & 4) != 0) {
            str = widget.imageUrl;
        }
        if ((i14 & 8) != 0) {
            c12144i = widget.glideUrlWithAuthHeaders;
        }
        if ((i14 & 16) != 0) {
            str2 = widget.imageShareFilePath;
        }
        String str3 = str2;
        String str4 = str;
        return widget.copy(widgetCollectionName, i13, str4, c12144i, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WidgetCollectionName getCollection() {
        return this.collection;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCollectionDisplayIndex() {
        return this.collectionDisplayIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C12144i getGlideUrlWithAuthHeaders() {
        return this.glideUrlWithAuthHeaders;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageShareFilePath() {
        return this.imageShareFilePath;
    }

    public final Widget copy(WidgetCollectionName collection, int collectionDisplayIndex, String imageUrl, C12144i glideUrlWithAuthHeaders, String imageShareFilePath) {
        AbstractC22676k.m65750j(collection, "collection");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        return new Widget(collection, collectionDisplayIndex, imageUrl, glideUrlWithAuthHeaders, imageShareFilePath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Widget)) {
            return false;
        }
        Widget widget = (Widget) other;
        return this.collection == widget.collection && this.collectionDisplayIndex == widget.collectionDisplayIndex && AbstractC22676k.m65745e(this.imageUrl, widget.imageUrl) && AbstractC22676k.m65745e(this.glideUrlWithAuthHeaders, widget.glideUrlWithAuthHeaders) && AbstractC22676k.m65745e(this.imageShareFilePath, widget.imageShareFilePath);
    }

    public final WidgetCollectionName getCollection() {
        return this.collection;
    }

    public final int getCollectionDisplayIndex() {
        return this.collectionDisplayIndex;
    }

    public final C12144i getGlideUrlWithAuthHeaders() {
        return this.glideUrlWithAuthHeaders;
    }

    public final String getImageShareFilePath() {
        return this.imageShareFilePath;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.collectionDisplayIndex, this.collection.hashCode() * 31, 31), 31, this.imageUrl);
        C12144i c12144i = this.glideUrlWithAuthHeaders;
        int iHashCode = (iM30450d + (c12144i == null ? 0 : c12144i.hashCode())) * 31;
        String str = this.imageShareFilePath;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        WidgetCollectionName widgetCollectionName = this.collection;
        int i13 = this.collectionDisplayIndex;
        String str = this.imageUrl;
        C12144i c12144i = this.glideUrlWithAuthHeaders;
        String str2 = this.imageShareFilePath;
        StringBuilder sb4 = new StringBuilder("Widget(collection=");
        sb4.append(widgetCollectionName);
        sb4.append(", collectionDisplayIndex=");
        sb4.append(i13);
        sb4.append(", imageUrl=");
        sb4.append(str);
        sb4.append(", glideUrlWithAuthHeaders=");
        sb4.append(c12144i);
        sb4.append(", imageShareFilePath=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public /* synthetic */ Widget(WidgetCollectionName widgetCollectionName, int i13, String str, C12144i c12144i, String str2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(widgetCollectionName, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? null : c12144i, (i14 & 16) != 0 ? null : str2);
    }
}
