package u71;

import com.whoop.design.util.TextResource;
import hy0.EnumC17775o1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import y71.C39274g;

/* JADX INFO: renamed from: u71.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lu71/e;", "", "Lhy0/o1;", "tagStyle", "Ly71/g;", "icon", "Lcom/whoop/design/util/TextResource;", "text", "<init>", "(Lhy0/o1;Ly71/g;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhy0/o1;", "b", "()Lhy0/o1;", "Ly71/g;", "()Ly71/g;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34571e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC17775o1 tagStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39274g icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource text;

    public C34571e(EnumC17775o1 tagStyle, C39274g c39274g, TextResource text) {
        AbstractC22676k.m65750j(tagStyle, "tagStyle");
        AbstractC22676k.m65750j(text, "text");
        this.tagStyle = tagStyle;
        this.icon = c39274g;
        this.text = text;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C39274g getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC17775o1 getTagStyle() {
        return this.tagStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34571e)) {
            return false;
        }
        C34571e c34571e = (C34571e) other;
        return this.tagStyle == c34571e.tagStyle && AbstractC22676k.m65745e(this.icon, c34571e.icon) && AbstractC22676k.m65745e(this.text, c34571e.text);
    }

    public int hashCode() {
        int iHashCode = this.tagStyle.hashCode() * 31;
        C39274g c39274g = this.icon;
        return this.text.hashCode() + ((iHashCode + (c39274g == null ? 0 : c39274g.hashCode())) * 31);
    }

    public String toString() {
        EnumC17775o1 enumC17775o1 = this.tagStyle;
        C39274g c39274g = this.icon;
        TextResource textResource = this.text;
        StringBuilder sb4 = new StringBuilder("JournalEntrypointActionTag(tagStyle=");
        sb4.append(enumC17775o1);
        sb4.append(", icon=");
        sb4.append(c39274g);
        sb4.append(", text=");
        return AbstractC30007c.m91841k(sb4, textResource, ")");
    }
}
