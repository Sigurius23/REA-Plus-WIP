package com.whoop.whooplabs.data.domain;

import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/DwlImpactSection;", "", "title", "", "items", "", "Lcom/whoop/design/models/DesignSystemModel;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class DwlImpactSection {
    public static final int $stable = 8;
    private final List<DesignSystemModel> items;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DwlImpactSection(String str, List<? extends DesignSystemModel> list) {
        this.title = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DwlImpactSection copy$default(DwlImpactSection dwlImpactSection, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dwlImpactSection.title;
        }
        if ((i13 & 2) != 0) {
            list = dwlImpactSection.items;
        }
        return dwlImpactSection.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<DesignSystemModel> component2() {
        return this.items;
    }

    public final DwlImpactSection copy(String title, List<? extends DesignSystemModel> items) {
        return new DwlImpactSection(title, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DwlImpactSection)) {
            return false;
        }
        DwlImpactSection dwlImpactSection = (DwlImpactSection) other;
        return AbstractC22676k.m65745e(this.title, dwlImpactSection.title) && AbstractC22676k.m65745e(this.items, dwlImpactSection.items);
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<DesignSystemModel> list = this.items;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return AbstractC36095b.m114679g("DwlImpactSection(title=", this.title, ", items=", ")", this.items);
    }
}
