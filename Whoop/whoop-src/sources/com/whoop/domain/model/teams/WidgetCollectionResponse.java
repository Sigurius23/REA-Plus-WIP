package com.whoop.domain.model.teams;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/domain/model/teams/WidgetCollectionResponse;", "", "hasData", "", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "records", "", "Lcom/whoop/domain/model/teams/Widget;", "<init>", "(ZIILjava/util/List;)V", "getHasData", "()Z", "getOffset", "()I", "getLimit", "getRecords", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class WidgetCollectionResponse {
    private final boolean hasData;
    private final int limit;
    private final int offset;
    private final List<Widget> records;

    public WidgetCollectionResponse(boolean z4, int i13, int i14, List<Widget> records) {
        AbstractC22676k.m65750j(records, "records");
        this.hasData = z4;
        this.offset = i13;
        this.limit = i14;
        this.records = records;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WidgetCollectionResponse copy$default(WidgetCollectionResponse widgetCollectionResponse, boolean z4, int i13, int i14, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z4 = widgetCollectionResponse.hasData;
        }
        if ((i15 & 2) != 0) {
            i13 = widgetCollectionResponse.offset;
        }
        if ((i15 & 4) != 0) {
            i14 = widgetCollectionResponse.limit;
        }
        if ((i15 & 8) != 0) {
            list = widgetCollectionResponse.records;
        }
        return widgetCollectionResponse.copy(z4, i13, i14, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasData() {
        return this.hasData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final List<Widget> component4() {
        return this.records;
    }

    public final WidgetCollectionResponse copy(boolean hasData, int offset, int limit, List<Widget> records) {
        AbstractC22676k.m65750j(records, "records");
        return new WidgetCollectionResponse(hasData, offset, limit, records);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetCollectionResponse)) {
            return false;
        }
        WidgetCollectionResponse widgetCollectionResponse = (WidgetCollectionResponse) other;
        return this.hasData == widgetCollectionResponse.hasData && this.offset == widgetCollectionResponse.offset && this.limit == widgetCollectionResponse.limit && AbstractC22676k.m65745e(this.records, widgetCollectionResponse.records);
    }

    public final boolean getHasData() {
        return this.hasData;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<Widget> getRecords() {
        return this.records;
    }

    public int hashCode() {
        return this.records.hashCode() + AbstractC11266d.m30448b(this.limit, AbstractC11266d.m30448b(this.offset, Boolean.hashCode(this.hasData) * 31, 31), 31);
    }

    public String toString() {
        return "WidgetCollectionResponse(hasData=" + this.hasData + ", offset=" + this.offset + ", limit=" + this.limit + ", records=" + this.records + ")";
    }
}
