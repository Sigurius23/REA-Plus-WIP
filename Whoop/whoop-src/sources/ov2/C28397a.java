package ov2;

import java.util.List;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ov2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001c\u0010\r¨\u0006 "}, m65681d2 = {"Lov2/a;", "Lm91/u;", "", "items", "", "isShowMoreEnabled", "isLoadingMore", "", "nextStartDate", "path", "<init>", "(Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "f", "()Z", "c", "e", "d", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28397a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isShowMoreEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isLoadingMore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String nextStartDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String path;

    /* JADX WARN: Multi-variable type inference failed */
    public C28397a(List<? extends InterfaceC25312u> items, boolean z4, boolean z13, String str, String path) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(path, "path");
        this.items = items;
        this.isShowMoreEnabled = z4;
        this.isLoadingMore = z13;
        this.nextStartDate = str;
        this.path = path;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m86090a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextStartDate() {
        return this.nextStartDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28397a)) {
            return false;
        }
        C28397a c28397a = (C28397a) other;
        return AbstractC22676k.m65745e(this.items, c28397a.items) && this.isShowMoreEnabled == c28397a.isShowMoreEnabled && this.isLoadingMore == c28397a.isLoadingMore && AbstractC22676k.m65745e(this.nextStartDate, c28397a.nextStartDate) && AbstractC22676k.m65745e(this.path, c28397a.path);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsShowMoreEnabled() {
        return this.isShowMoreEnabled;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.items.hashCode() * 31, 31, this.isShowMoreEnabled), 31, this.isLoadingMore);
        String str = this.nextStartDate;
        return this.path.hashCode() + ((iM8289b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        List<InterfaceC25312u> list = this.items;
        boolean z4 = this.isShowMoreEnabled;
        boolean z13 = this.isLoadingMore;
        String str = this.nextStartDate;
        String str2 = this.path;
        StringBuilder sb4 = new StringBuilder("ExerciseRecordsListViewState(items=");
        sb4.append(list);
        sb4.append(", isShowMoreEnabled=");
        sb4.append(z4);
        sb4.append(", isLoadingMore=");
        AbstractC38963t7.m124391u(sb4, z13, ", nextStartDate=", str, ", path=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
