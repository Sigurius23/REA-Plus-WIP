package hp1;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: hp1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, m65681d2 = {"Lhp1/i;", "", "Lcom/whoop/design/util/TextResource;", "navigationTitle", "navigationSubtitle", "", "currentName", "saveButton", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "d", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17549i {

    /* JADX INFO: renamed from: e */
    public static final int f67933e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource navigationTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource navigationSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String currentName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource saveButton;

    public C17549i(TextResource navigationTitle, TextResource navigationSubtitle, String currentName, TextResource saveButton) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(navigationSubtitle, "navigationSubtitle");
        AbstractC22676k.m65750j(currentName, "currentName");
        AbstractC22676k.m65750j(saveButton, "saveButton");
        this.navigationTitle = navigationTitle;
        this.navigationSubtitle = navigationSubtitle;
        this.currentName = currentName;
        this.saveButton = saveButton;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrentName() {
        return this.currentName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getNavigationSubtitle() {
        return this.navigationSubtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSaveButton() {
        return this.saveButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17549i)) {
            return false;
        }
        C17549i c17549i = (C17549i) other;
        return AbstractC22676k.m65745e(this.navigationTitle, c17549i.navigationTitle) && AbstractC22676k.m65745e(this.navigationSubtitle, c17549i.navigationSubtitle) && AbstractC22676k.m65745e(this.currentName, c17549i.currentName) && AbstractC22676k.m65745e(this.saveButton, c17549i.saveButton);
    }

    public int hashCode() {
        return this.saveButton.hashCode() + AbstractC11266d.m30450d(AbstractC31061c.m95625a(this.navigationTitle.hashCode() * 31, this.navigationSubtitle, 31), 31, this.currentName);
    }

    public String toString() {
        TextResource textResource = this.navigationTitle;
        TextResource textResource2 = this.navigationSubtitle;
        String str = this.currentName;
        TextResource textResource3 = this.saveButton;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("PregnancyNameState(navigationTitle=", textResource, ", navigationSubtitle=", textResource2, ", currentName=");
        sbM106658q.append(str);
        sbM106658q.append(", saveButton=");
        sbM106658q.append(textResource3);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
