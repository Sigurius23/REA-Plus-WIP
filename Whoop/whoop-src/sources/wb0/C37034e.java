package wb0;

import ny0.C27238a0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wb0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lwb0/e;", "", "", "title", "description", "Lny0/a0;", "button", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lny0/a0;Lny0/a0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Lny0/a0;", "()Lny0/a0;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37034e {

    /* JADX INFO: renamed from: e */
    public static final int f158432e = C27238a0.f109008k;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27238a0 button;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27238a0 secondaryButton;

    public C37034e(String title, String description, C27238a0 button, C27238a0 secondaryButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        this.title = title;
        this.description = description;
        this.button = button;
        this.secondaryButton = secondaryButton;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27238a0 getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27238a0 getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37034e)) {
            return false;
        }
        C37034e c37034e = (C37034e) other;
        return AbstractC22676k.m65745e(this.title, c37034e.title) && AbstractC22676k.m65745e(this.description, c37034e.description) && AbstractC22676k.m65745e(this.button, c37034e.button) && AbstractC22676k.m65745e(this.secondaryButton, c37034e.secondaryButton);
    }

    public int hashCode() {
        return this.secondaryButton.hashCode() + ((this.button.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        C27238a0 c27238a0 = this.button;
        C27238a0 c27238a1 = this.secondaryButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("EditBiomarkerDialogState(title=", str, ", description=", str2, ", button=");
        sbM32001t.append(c27238a0);
        sbM32001t.append(", secondaryButton=");
        sbM32001t.append(c27238a1);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
