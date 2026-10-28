package com.whoop.archv2.feature.domain;

import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/a;", "", "", "Lcom/whoop/design/models/DesignSystemModel;", "loadingTopItems", "errorTopItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C5993a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<DesignSystemModel> loadingTopItems;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<DesignSystemModel> errorTopItems;

    /* JADX WARN: Multi-variable type inference failed */
    public C5993a(List<? extends DesignSystemModel> list, List<? extends DesignSystemModel> list2) {
        this.loadingTopItems = list;
        this.errorTopItems = list2;
    }

    /* JADX INFO: renamed from: a */
    public final List<DesignSystemModel> m17878a() {
        return this.errorTopItems;
    }

    /* JADX INFO: renamed from: b */
    public final List<DesignSystemModel> m17879b() {
        return this.loadingTopItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C5993a)) {
            return false;
        }
        C5993a c5993a = (C5993a) other;
        return AbstractC22676k.m65745e(this.loadingTopItems, c5993a.loadingTopItems) && AbstractC22676k.m65745e(this.errorTopItems, c5993a.errorTopItems);
    }

    public int hashCode() {
        List<DesignSystemModel> list = this.loadingTopItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DesignSystemModel> list2 = this.errorTopItems;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC13673n.m38562i("FullScreenTopItems(loadingTopItems=", ", errorTopItems=", this.loadingTopItems, ")", this.errorTopItems);
    }
}
