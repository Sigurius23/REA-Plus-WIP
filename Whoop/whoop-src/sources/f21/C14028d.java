package f21;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: f21.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lf21/d;", "Lm91/u;", "", "id", "", "icon", "bodyText", "Lf21/a;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lf21/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "d", "Lf21/a;", "()Lf21/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14028d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String bodyText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC14025a style;

    public C14028d(String id4, Integer num, String bodyText, EnumC14025a style) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(bodyText, "bodyText");
        AbstractC22676k.m65750j(style, "style");
        this.id = id4;
        this.icon = num;
        this.bodyText = bodyText;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC14025a getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14028d)) {
            return false;
        }
        C14028d c14028d = (C14028d) other;
        return AbstractC22676k.m65745e(this.id, c14028d.id) && AbstractC22676k.m65745e(this.icon, c14028d.icon) && AbstractC22676k.m65745e(this.bodyText, c14028d.bodyText) && this.style == c14028d.style;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Integer num = this.icon;
        return this.style.hashCode() + AbstractC11266d.m30450d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.bodyText);
    }

    public String toString() {
        return "IconMarkdownCalloutViewState(id=" + this.id + ", icon=" + this.icon + ", bodyText=" + this.bodyText + ", style=" + this.style + ")";
    }
}
