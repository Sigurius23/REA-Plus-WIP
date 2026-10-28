package lf0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lf0.j0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, m65681d2 = {"Llf0/j0;", "Lm91/u;", "", "id", "title", "Llf0/f0;", "header", "Llf0/c0;", "body", "", "isExpanded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llf0/f0;Llf0/c0;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "Llf0/f0;", "()Llf0/f0;", "d", "Llf0/c0;", "()Llf0/c0;", "e", "Z", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23931j0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C23915f0 header;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C23903c0 body;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isExpanded;

    public C23931j0(String id4, String title, C23915f0 header, C23903c0 body, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        this.id = id4;
        this.title = title;
        this.header = header;
        this.body = body;
        this.isExpanded = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C23903c0 getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C23915f0 getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23931j0)) {
            return false;
        }
        C23931j0 c23931j0 = (C23931j0) other;
        return AbstractC22676k.m65745e(this.id, c23931j0.id) && AbstractC22676k.m65745e(this.title, c23931j0.title) && AbstractC22676k.m65745e(this.header, c23931j0.header) && AbstractC22676k.m65745e(this.body, c23931j0.body) && this.isExpanded == c23931j0.isExpanded;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isExpanded) + ((this.body.hashCode() + ((this.header.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title)) * 31)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        C23915f0 c23915f0 = this.header;
        C23903c0 c23903c0 = this.body;
        boolean z4 = this.isExpanded;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ClinicalReportCardViewState(id=", str, ", title=", str2, ", header=");
        sbM32001t.append(c23915f0);
        sbM32001t.append(", body=");
        sbM32001t.append(c23903c0);
        sbM32001t.append(", isExpanded=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public /* synthetic */ C23931j0(String str, String str2, C23915f0 c23915f0, C23903c0 c23903c0, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, c23915f0, c23903c0, (i13 & 16) != 0 ? true : z4);
    }
}
