package bm0;

import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: bm0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lbm0/m;", "Lm91/u;", "", "title", "", "recommendations", "actionTitle", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3410m implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> recommendations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String actionTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public C3410m(String str, List<? extends InterfaceC25312u> recommendations, String actionTitle) {
        AbstractC22676k.m65750j(recommendations, "recommendations");
        AbstractC22676k.m65750j(actionTitle, "actionTitle");
        this.title = str;
        this.recommendations = recommendations;
        this.actionTitle = actionTitle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m9819b() {
        return this.recommendations;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3410m)) {
            return false;
        }
        C3410m c3410m = (C3410m) other;
        return AbstractC22676k.m65745e(this.title, c3410m.title) && AbstractC22676k.m65745e(this.recommendations, c3410m.recommendations) && AbstractC22676k.m65745e(this.actionTitle, c3410m.actionTitle);
    }

    public int hashCode() {
        String str = this.title;
        return this.actionTitle.hashCode() + AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.recommendations);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.actionTitle, ")", AbstractC30802r.m94766o("WorkoutRecommendationCarouselViewState(title=", this.title, ", recommendations=", ", actionTitle=", this.recommendations));
    }
}
