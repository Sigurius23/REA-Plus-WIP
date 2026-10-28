package x72;

import c13.AbstractC3855a;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: x72.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lx72/a;", "Lm91/u;", "", "headerText", "bodyText", "", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38043a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String headerText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String bodyText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> content;

    /* JADX WARN: Multi-variable type inference failed */
    public C38043a(String str, String str2, List<? extends InterfaceC25312u> content) {
        AbstractC22676k.m65750j(content, "content");
        this.headerText = str;
        this.bodyText = str2;
        this.content = content;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m121804b() {
        return this.content;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38043a)) {
            return false;
        }
        C38043a c38043a = (C38043a) other;
        return AbstractC22676k.m65745e(this.headerText, c38043a.headerText) && AbstractC22676k.m65745e(this.bodyText, c38043a.bodyText) && AbstractC22676k.m65745e(this.content, c38043a.content);
    }

    public int hashCode() {
        String str = this.headerText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bodyText;
        return this.content.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.headerText;
        String str2 = this.bodyText;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("SanguineWaitlistSectionViewState(headerText=", str, ", bodyText=", str2, ", content="), this.content, ")");
    }
}
