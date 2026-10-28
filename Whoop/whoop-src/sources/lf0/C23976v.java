package lf0;

import ny0.C27256h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lf0.v */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Llf0/v;", "", "", "title", "description", "Lny0/h;", "primaryBtn", "secondaryBtn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lny0/h;Lny0/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Lny0/h;", "()Lny0/h;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23976v {

    /* JADX INFO: renamed from: e */
    public static final int f94676e = C27256h.f109055z;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27256h primaryBtn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27256h secondaryBtn;

    public C23976v(String title, String description, C27256h primaryBtn, C27256h secondaryBtn) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(primaryBtn, "primaryBtn");
        AbstractC22676k.m65750j(secondaryBtn, "secondaryBtn");
        this.title = title;
        this.description = description;
        this.primaryBtn = primaryBtn;
        this.secondaryBtn = secondaryBtn;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27256h getPrimaryBtn() {
        return this.primaryBtn;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27256h getSecondaryBtn() {
        return this.secondaryBtn;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23976v)) {
            return false;
        }
        C23976v c23976v = (C23976v) other;
        return AbstractC22676k.m65745e(this.title, c23976v.title) && AbstractC22676k.m65745e(this.description, c23976v.description) && AbstractC22676k.m65745e(this.primaryBtn, c23976v.primaryBtn) && AbstractC22676k.m65745e(this.secondaryBtn, c23976v.secondaryBtn);
    }

    public int hashCode() {
        return this.secondaryBtn.hashCode() + ((this.primaryBtn.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        C27256h c27256h = this.primaryBtn;
        C27256h c27256h2 = this.secondaryBtn;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CancelRescheduleDialogState(title=", str, ", description=", str2, ", primaryBtn=");
        sbM32001t.append(c27256h);
        sbM32001t.append(", secondaryBtn=");
        sbM32001t.append(c27256h2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
