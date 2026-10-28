package com.whoop.labrador.feature.results.domain.model;

import c13.AbstractC3855a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;", "", "title", "Lcom/whoop/design/util/TextResource;", "id", "", "items", "", "Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Lcom/whoop/design/util/TextResource;", "getId", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LabradorPaginatedGroupModel {
    public static final int $stable = 8;
    private final String id;
    private final List<LabradorPaginatedResultModel> items;
    private final TextResource title;

    public LabradorPaginatedGroupModel() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabradorPaginatedGroupModel copy$default(LabradorPaginatedGroupModel labradorPaginatedGroupModel, TextResource textResource, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = labradorPaginatedGroupModel.title;
        }
        if ((i13 & 2) != 0) {
            str = labradorPaginatedGroupModel.id;
        }
        if ((i13 & 4) != 0) {
            list = labradorPaginatedGroupModel.items;
        }
        return labradorPaginatedGroupModel.copy(textResource, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<LabradorPaginatedResultModel> component3() {
        return this.items;
    }

    public final LabradorPaginatedGroupModel copy(TextResource title, String id4, List<LabradorPaginatedResultModel> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        return new LabradorPaginatedGroupModel(title, id4, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabradorPaginatedGroupModel)) {
            return false;
        }
        LabradorPaginatedGroupModel labradorPaginatedGroupModel = (LabradorPaginatedGroupModel) other;
        return AbstractC22676k.m65745e(this.title, labradorPaginatedGroupModel.title) && AbstractC22676k.m65745e(this.id, labradorPaginatedGroupModel.id) && AbstractC22676k.m65745e(this.items, labradorPaginatedGroupModel.items);
    }

    public final String getId() {
        return this.id;
    }

    public final List<LabradorPaginatedResultModel> getItems() {
        return this.items;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.items.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.id);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.id;
        return AbstractC3855a.m11829m(AbstractC30007c.m91845o("LabradorPaginatedGroupModel(title=", textResource, ", id=", str, ", items="), this.items, ")");
    }

    public LabradorPaginatedGroupModel(TextResource title, String id4, List<LabradorPaginatedResultModel> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.id = id4;
        this.items = items;
    }

    public /* synthetic */ LabradorPaginatedGroupModel(TextResource textResource, String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
