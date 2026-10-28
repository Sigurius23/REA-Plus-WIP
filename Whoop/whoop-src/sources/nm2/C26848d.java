package nm2;

import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: nm2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, m65681d2 = {"Lnm2/d;", "", "", "Lnm2/e;", "featureFlagList", "", "overridingDefaults", "", "searchQuery", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "a", "(Ljava/util/List;ZLjava/lang/String;)Lnm2/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "d", "()Z", "Ljava/lang/String;", "e", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26848d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C26849e> featureFlagList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean overridingDefaults;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String searchQuery;

    public C26848d(List<C26849e> featureFlagList, boolean z4, String searchQuery) {
        AbstractC22676k.m65750j(featureFlagList, "featureFlagList");
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        this.featureFlagList = featureFlagList;
        this.overridingDefaults = z4;
        this.searchQuery = searchQuery;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C26848d m80153b(C26848d c26848d, List list, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c26848d.featureFlagList;
        }
        if ((i13 & 2) != 0) {
            z4 = c26848d.overridingDefaults;
        }
        if ((i13 & 4) != 0) {
            str = c26848d.searchQuery;
        }
        return c26848d.m80154a(list, z4, str);
    }

    /* JADX INFO: renamed from: a */
    public final C26848d m80154a(List<C26849e> featureFlagList, boolean overridingDefaults, String searchQuery) {
        AbstractC22676k.m65750j(featureFlagList, "featureFlagList");
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        return new C26848d(featureFlagList, overridingDefaults, searchQuery);
    }

    /* JADX INFO: renamed from: c */
    public final List<C26849e> m80155c() {
        return this.featureFlagList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getOverridingDefaults() {
        return this.overridingDefaults;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26848d)) {
            return false;
        }
        C26848d c26848d = (C26848d) other;
        return AbstractC22676k.m65745e(this.featureFlagList, c26848d.featureFlagList) && this.overridingDefaults == c26848d.overridingDefaults && AbstractC22676k.m65745e(this.searchQuery, c26848d.searchQuery);
    }

    public int hashCode() {
        return this.searchQuery.hashCode() + AbstractC2875y.m8289b(this.featureFlagList.hashCode() * 31, 31, this.overridingDefaults);
    }

    public String toString() {
        List<C26849e> list = this.featureFlagList;
        boolean z4 = this.overridingDefaults;
        String str = this.searchQuery;
        StringBuilder sb4 = new StringBuilder("DebugFeatureFlagSettingsViewState(featureFlagList=");
        sb4.append(list);
        sb4.append(", overridingDefaults=");
        sb4.append(z4);
        sb4.append(", searchQuery=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ C26848d(List list, boolean z4, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? "" : str);
    }
}
