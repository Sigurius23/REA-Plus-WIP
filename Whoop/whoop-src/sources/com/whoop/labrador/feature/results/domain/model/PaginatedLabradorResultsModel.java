package com.whoop.labrador.feature.results.domain.model;

import com.whoop.navigation.C9598e;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006!"}, m65681d2 = {"Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "", "Lcom/whoop/navigation/e;", "learnMoreDestination", "", "Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;", "records", "", "nextToken", "<init>", "(Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Lcom/whoop/navigation/e;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/e;", "getLearnMoreDestination", "Ljava/util/List;", "getRecords", "Ljava/lang/String;", "getNextToken", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class PaginatedLabradorResultsModel {
    public static final int $stable = 8;
    private final C9598e learnMoreDestination;
    private final String nextToken;
    private final List<LabradorPaginatedGroupModel> records;

    public PaginatedLabradorResultsModel() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaginatedLabradorResultsModel copy$default(PaginatedLabradorResultsModel paginatedLabradorResultsModel, C9598e c9598e, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c9598e = paginatedLabradorResultsModel.learnMoreDestination;
        }
        if ((i13 & 2) != 0) {
            list = paginatedLabradorResultsModel.records;
        }
        if ((i13 & 4) != 0) {
            str = paginatedLabradorResultsModel.nextToken;
        }
        return paginatedLabradorResultsModel.copy(c9598e, list, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C9598e getLearnMoreDestination() {
        return this.learnMoreDestination;
    }

    public final List<LabradorPaginatedGroupModel> component2() {
        return this.records;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNextToken() {
        return this.nextToken;
    }

    public final PaginatedLabradorResultsModel copy(C9598e learnMoreDestination, List<LabradorPaginatedGroupModel> records, String nextToken) {
        AbstractC22676k.m65750j(records, "records");
        return new PaginatedLabradorResultsModel(learnMoreDestination, records, nextToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginatedLabradorResultsModel)) {
            return false;
        }
        PaginatedLabradorResultsModel paginatedLabradorResultsModel = (PaginatedLabradorResultsModel) other;
        return AbstractC22676k.m65745e(this.learnMoreDestination, paginatedLabradorResultsModel.learnMoreDestination) && AbstractC22676k.m65745e(this.records, paginatedLabradorResultsModel.records) && AbstractC22676k.m65745e(this.nextToken, paginatedLabradorResultsModel.nextToken);
    }

    public final C9598e getLearnMoreDestination() {
        return this.learnMoreDestination;
    }

    public final String getNextToken() {
        return this.nextToken;
    }

    public final List<LabradorPaginatedGroupModel> getRecords() {
        return this.records;
    }

    public int hashCode() {
        C9598e c9598e = this.learnMoreDestination;
        int iM31983b = AbstractC11895b.m31983b((c9598e == null ? 0 : c9598e.hashCode()) * 31, 31, this.records);
        String str = this.nextToken;
        return iM31983b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        C9598e c9598e = this.learnMoreDestination;
        List<LabradorPaginatedGroupModel> list = this.records;
        String str = this.nextToken;
        StringBuilder sb4 = new StringBuilder("PaginatedLabradorResultsModel(learnMoreDestination=");
        sb4.append(c9598e);
        sb4.append(", records=");
        sb4.append(list);
        sb4.append(", nextToken=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public PaginatedLabradorResultsModel(C9598e c9598e, List<LabradorPaginatedGroupModel> records, String str) {
        AbstractC22676k.m65750j(records, "records");
        this.learnMoreDestination = c9598e;
        this.records = records;
        this.nextToken = str;
    }

    public /* synthetic */ PaginatedLabradorResultsModel(C9598e c9598e, List list, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c9598e, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : str);
    }
}
