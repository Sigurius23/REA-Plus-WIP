package ld0;

import hy0.C17736e;
import java.util.List;
import ny0.C27273p0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ld0.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u0018\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lld0/p;", "Lm91/u;", "", "title", "description", "Lhy0/e;", "divider", "", "pills", "Lny0/p0;", "button", "", "isExpanded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhy0/e;Ljava/util/List;Lny0/p0;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "Lhy0/e;", "()Lhy0/e;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lny0/p0;", "()Lny0/p0;", "Z", "g", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23857p implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17736e divider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<String> pills;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27273p0 button;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isExpanded;

    public C23857p(String title, String description, C17736e divider, List<String> pills, C27273p0 c27273p0, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(divider, "divider");
        AbstractC22676k.m65750j(pills, "pills");
        this.title = title;
        this.description = description;
        this.divider = divider;
        this.pills = pills;
        this.button = c27273p0;
        this.isExpanded = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27273p0 getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17736e getDivider() {
        return this.divider;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m70096e() {
        return this.pills;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23857p)) {
            return false;
        }
        C23857p c23857p = (C23857p) other;
        return AbstractC22676k.m65745e(this.title, c23857p.title) && AbstractC22676k.m65745e(this.description, c23857p.description) && AbstractC22676k.m65745e(this.divider, c23857p.divider) && AbstractC22676k.m65745e(this.pills, c23857p.pills) && AbstractC22676k.m65745e(this.button, c23857p.button) && this.isExpanded == c23857p.isExpanded;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.divider.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description)) * 31, 31, this.pills);
        C27273p0 c27273p0 = this.button;
        return Boolean.hashCode(this.isExpanded) + ((iM31983b + (c27273p0 == null ? 0 : c27273p0.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        C17736e c17736e = this.divider;
        List<String> list = this.pills;
        C27273p0 c27273p0 = this.button;
        boolean z4 = this.isExpanded;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HealthspanImpactCardViewState(title=", str, ", description=", str2, ", divider=");
        sbM32001t.append(c17736e);
        sbM32001t.append(", pills=");
        sbM32001t.append(list);
        sbM32001t.append(", button=");
        sbM32001t.append(c27273p0);
        sbM32001t.append(", isExpanded=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C23857p(String str, String str2, C17736e c17736e, List list, C27273p0 c27273p0, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, c17736e, list, c27273p0, (i13 & 32) != 0 ? true : z4);
    }
}
