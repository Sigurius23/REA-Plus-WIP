package p699b70;

import com.whoop.analytics.AnalyticEventModel;
import java.util.List;
import m83.C25271y;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: b70.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, m65681d2 = {"Lb70/e;", "", "", "isLoading", "", "Lm91/u;", "items", "footerItems", "shouldDismiss", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(ZLjava/util/List;Ljava/util/List;ZLcom/whoop/analytics/AnalyticEventModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "e", "()Z", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2779e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> footerItems;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean shouldDismiss;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public C2779e(boolean z4, List<? extends InterfaceC25312u> items, List<? extends InterfaceC25312u> footerItems, boolean z13, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(footerItems, "footerItems");
        this.isLoading = z4;
        this.items = items;
        this.footerItems = footerItems;
        this.shouldDismiss = z13;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m7870b() {
        return this.footerItems;
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m7871c() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShouldDismiss() {
        return this.shouldDismiss;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2779e)) {
            return false;
        }
        C2779e c2779e = (C2779e) other;
        return this.isLoading == c2779e.isLoading && AbstractC22676k.m65745e(this.items, c2779e.items) && AbstractC22676k.m65745e(this.footerItems, c2779e.footerItems) && this.shouldDismiss == c2779e.shouldDismiss && AbstractC22676k.m65745e(this.analyticEvent, c2779e.analyticEvent);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(Boolean.hashCode(this.isLoading) * 31, 31, this.items), 31, this.footerItems), 31, this.shouldDismiss);
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iM8289b + (analyticEventModel == null ? 0 : analyticEventModel.hashCode());
    }

    public String toString() {
        boolean z4 = this.isLoading;
        List<InterfaceC25312u> list = this.items;
        List<InterfaceC25312u> list2 = this.footerItems;
        boolean z13 = this.shouldDismiss;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sb4 = new StringBuilder("DayZeroSplashViewState(isLoading=");
        sb4.append(z4);
        sb4.append(", items=");
        sb4.append(list);
        sb4.append(", footerItems=");
        AbstractC26725a.m79512p(", shouldDismiss=", ", analyticEvent=", sb4, list2, z13);
        return AbstractC38963t7.m124378h(sb4, analyticEventModel, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2779e(boolean z4, List list, List list2, boolean z13, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        z4 = (i13 & 1) != 0 ? true : z4;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(z4, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : analyticEventModel);
    }
}
