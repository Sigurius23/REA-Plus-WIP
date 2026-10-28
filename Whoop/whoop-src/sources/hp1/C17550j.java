package hp1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: hp1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006 "}, m65681d2 = {"Lhp1/j;", "", "Lcom/whoop/design/util/TextResource;", "navigationTitle", "navigationSubtitle", "title", "subtitle", "Lhp1/k;", "stealthModeInput", "saveButtonTitle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhp1/k;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "c", "f", "d", "e", "Lhp1/k;", "()Lhp1/k;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17550j {

    /* JADX INFO: renamed from: g */
    public static final int f67938g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource navigationTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource navigationSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17551k stealthModeInput;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource saveButtonTitle;

    public C17550j(TextResource navigationTitle, TextResource navigationSubtitle, TextResource title, TextResource subtitle, C17551k stealthModeInput, TextResource saveButtonTitle) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(navigationSubtitle, "navigationSubtitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(stealthModeInput, "stealthModeInput");
        AbstractC22676k.m65750j(saveButtonTitle, "saveButtonTitle");
        this.navigationTitle = navigationTitle;
        this.navigationSubtitle = navigationSubtitle;
        this.title = title;
        this.subtitle = subtitle;
        this.stealthModeInput = stealthModeInput;
        this.saveButtonTitle = saveButtonTitle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getNavigationSubtitle() {
        return this.navigationSubtitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSaveButtonTitle() {
        return this.saveButtonTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C17551k getStealthModeInput() {
        return this.stealthModeInput;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17550j)) {
            return false;
        }
        C17550j c17550j = (C17550j) other;
        return AbstractC22676k.m65745e(this.navigationTitle, c17550j.navigationTitle) && AbstractC22676k.m65745e(this.navigationSubtitle, c17550j.navigationSubtitle) && AbstractC22676k.m65745e(this.title, c17550j.title) && AbstractC22676k.m65745e(this.subtitle, c17550j.subtitle) && AbstractC22676k.m65745e(this.stealthModeInput, c17550j.stealthModeInput) && AbstractC22676k.m65745e(this.saveButtonTitle, c17550j.saveButtonTitle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.saveButtonTitle.hashCode() + ((this.stealthModeInput.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.navigationTitle.hashCode() * 31, this.navigationSubtitle, 31), this.title, 31), this.subtitle, 31)) * 31);
    }

    public String toString() {
        TextResource textResource = this.navigationTitle;
        TextResource textResource2 = this.navigationSubtitle;
        TextResource textResource3 = this.title;
        TextResource textResource4 = this.subtitle;
        C17551k c17551k = this.stealthModeInput;
        TextResource textResource5 = this.saveButtonTitle;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("SaveScreenState(navigationTitle=", textResource, ", navigationSubtitle=", textResource2, ", title=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", subtitle=", textResource4, ", stealthModeInput=");
        sbM106658q.append(c17551k);
        sbM106658q.append(", saveButtonTitle=");
        sbM106658q.append(textResource5);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
