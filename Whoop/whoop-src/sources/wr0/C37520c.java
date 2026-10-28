package wr0;

import com.whoop.analytics.AnalyticEventModel;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;

/* JADX INFO: renamed from: wr0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lwr0/c;", "", "", "isLoading", "isError", "Lcom/whoop/analytics/AnalyticEventModel;", "sectionViewAnalyticEvent", "", "Lm91/o;", "items", "<init>", "(ZZLcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "c", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "Ljava/util/List;", "()Ljava/util/List;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37520c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AnalyticEventModel sectionViewAnalyticEvent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C25306o> items;

    public C37520c(boolean z4, boolean z13, AnalyticEventModel analyticEventModel, List<C25306o> items) {
        AbstractC22676k.m65750j(items, "items");
        this.isLoading = z4;
        this.isError = z13;
        this.sectionViewAnalyticEvent = analyticEventModel;
        this.items = items;
    }

    /* JADX INFO: renamed from: a */
    public final List<C25306o> m120310a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AnalyticEventModel getSectionViewAnalyticEvent() {
        return this.sectionViewAnalyticEvent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37520c)) {
            return false;
        }
        C37520c c37520c = (C37520c) other;
        return this.isLoading == c37520c.isLoading && this.isError == c37520c.isError && AbstractC22676k.m65745e(this.sectionViewAnalyticEvent, c37520c.sectionViewAnalyticEvent) && AbstractC22676k.m65745e(this.items, c37520c.items);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        AnalyticEventModel analyticEventModel = this.sectionViewAnalyticEvent;
        return this.items.hashCode() + ((iM8289b + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        AnalyticEventModel analyticEventModel = this.sectionViewAnalyticEvent;
        List<C25306o> list = this.items;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("CommunityMomentsContainerViewState(isLoading=", ", isError=", ", sectionViewAnalyticEvent=", z4, z13);
        sbM32002u.append(analyticEventModel);
        sbM32002u.append(", items=");
        sbM32002u.append(list);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C37520c(boolean z4, boolean z13, AnalyticEventModel analyticEventModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : analyticEventModel, (i13 & 8) != 0 ? C25271y.f99162w : list);
    }
}
