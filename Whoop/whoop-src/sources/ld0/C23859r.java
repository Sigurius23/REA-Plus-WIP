package ld0;

import a01.C0088h;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ld0.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001e\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u0019\u0010\u0010¨\u0006%"}, m65681d2 = {"Lld0/r;", "Lm91/u;", "", "La01/h;", "biomarkers", "Lld0/e;", "statuses", "", "searchPlaceholder", "searchQuery", "Lld0/g;", "bottomSheet", "allBiomarkersTitle", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lld0/g;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "g", "c", "Ljava/lang/String;", "e", "d", "f", "Lld0/g;", "()Lld0/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23859r implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C0088h> biomarkers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C23846e> statuses;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String searchPlaceholder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String searchQuery;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C23848g bottomSheet;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String allBiomarkersTitle;

    public C23859r(List<C0088h> biomarkers, List<C23846e> statuses, String str, String str2, C23848g c23848g, String str3) {
        AbstractC22676k.m65750j(biomarkers, "biomarkers");
        AbstractC22676k.m65750j(statuses, "statuses");
        this.biomarkers = biomarkers;
        this.statuses = statuses;
        this.searchPlaceholder = str;
        this.searchQuery = str2;
        this.bottomSheet = c23848g;
        this.allBiomarkersTitle = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAllBiomarkersTitle() {
        return this.allBiomarkersTitle;
    }

    /* JADX INFO: renamed from: b */
    public final List<C0088h> m70105b() {
        return this.biomarkers;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C23848g getBottomSheet() {
        return this.bottomSheet;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23859r)) {
            return false;
        }
        C23859r c23859r = (C23859r) other;
        return AbstractC22676k.m65745e(this.biomarkers, c23859r.biomarkers) && AbstractC22676k.m65745e(this.statuses, c23859r.statuses) && AbstractC22676k.m65745e(this.searchPlaceholder, c23859r.searchPlaceholder) && AbstractC22676k.m65745e(this.searchQuery, c23859r.searchQuery) && AbstractC22676k.m65745e(this.bottomSheet, c23859r.bottomSheet) && AbstractC22676k.m65745e(this.allBiomarkersTitle, c23859r.allBiomarkersTitle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    /* JADX INFO: renamed from: g */
    public final List<C23846e> m70109g() {
        return this.statuses;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.biomarkers.hashCode() * 31, 31, this.statuses);
        String str = this.searchPlaceholder;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.searchQuery;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C23848g c23848g = this.bottomSheet;
        int iHashCode3 = (iHashCode2 + (c23848g == null ? 0 : c23848g.hashCode())) * 31;
        String str3 = this.allBiomarkersTitle;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        List<C0088h> list = this.biomarkers;
        List<C23846e> list2 = this.statuses;
        String str = this.searchPlaceholder;
        String str2 = this.searchQuery;
        C23848g c23848g = this.bottomSheet;
        String str3 = this.allBiomarkersTitle;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("SearchableBiomarkersListViewState(biomarkers=", ", statuses=", list, ", searchPlaceholder=", list2);
        AbstractC11266d.m30444B(sbM124380j, str, ", searchQuery=", str2, ", bottomSheet=");
        sbM124380j.append(c23848g);
        sbM124380j.append(", allBiomarkersTitle=");
        sbM124380j.append(str3);
        sbM124380j.append(")");
        return sbM124380j.toString();
    }

    public /* synthetic */ C23859r(List list, List list2, String str, String str2, C23848g c23848g, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, c23848g, str3);
    }
}
