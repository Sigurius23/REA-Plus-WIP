package wb0;

import ny0.C27238a0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wb0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lwb0/j;", "", "", "title", "description", "Lny0/a0;", "primaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lny0/a0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lny0/a0;", "()Lny0/a0;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37039j {

    /* JADX INFO: renamed from: d */
    public static final int f158506d = C27238a0.f109008k;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27238a0 primaryButton;

    public C37039j(String title, String description, C27238a0 c27238a0) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        this.title = title;
        this.description = description;
        this.primaryButton = c27238a0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27238a0 getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37039j)) {
            return false;
        }
        C37039j c37039j = (C37039j) other;
        return AbstractC22676k.m65745e(this.title, c37039j.title) && AbstractC22676k.m65745e(this.description, c37039j.description) && AbstractC22676k.m65745e(this.primaryButton, c37039j.primaryButton);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description);
        C27238a0 c27238a0 = this.primaryButton;
        return iM30450d + (c27238a0 == null ? 0 : c27238a0.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        C27238a0 c27238a0 = this.primaryButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TestDeletedModalState(title=", str, ", description=", str2, ", primaryButton=");
        sbM32001t.append(c27238a0);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
