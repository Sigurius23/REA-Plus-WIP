package ys2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ys2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, m65681d2 = {"Lys2/c;", "", "Lcom/whoop/design/util/TextResource;", "title", "description", "buttonConfirmTitle", "buttonRejectTitle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39756c {

    /* JADX INFO: renamed from: e */
    public static final int f171155e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource buttonConfirmTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource buttonRejectTitle;

    public C39756c(TextResource title, TextResource description, TextResource buttonConfirmTitle, TextResource buttonRejectTitle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(buttonConfirmTitle, "buttonConfirmTitle");
        AbstractC22676k.m65750j(buttonRejectTitle, "buttonRejectTitle");
        this.title = title;
        this.description = description;
        this.buttonConfirmTitle = buttonConfirmTitle;
        this.buttonRejectTitle = buttonRejectTitle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonConfirmTitle() {
        return this.buttonConfirmTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getButtonRejectTitle() {
        return this.buttonRejectTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39756c)) {
            return false;
        }
        C39756c c39756c = (C39756c) other;
        return AbstractC22676k.m65745e(this.title, c39756c.title) && AbstractC22676k.m65745e(this.description, c39756c.description) && AbstractC22676k.m65745e(this.buttonConfirmTitle, c39756c.buttonConfirmTitle) && AbstractC22676k.m65745e(this.buttonRejectTitle, c39756c.buttonRejectTitle);
    }

    public int hashCode() {
        return this.buttonRejectTitle.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31), this.buttonConfirmTitle, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        return AbstractC33745d.m106655n(AbstractC33745d.m106658q("CustomizePlanDialogViewState(title=", textResource, ", description=", textResource2, ", buttonConfirmTitle="), this.buttonConfirmTitle, ", buttonRejectTitle=", this.buttonRejectTitle, ")");
    }
}
