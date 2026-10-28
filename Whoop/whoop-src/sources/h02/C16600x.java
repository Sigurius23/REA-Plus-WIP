package h02;

import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: h02.x */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lh02/x;", "Lm91/u;", "", "header", "", "Lh02/u;", "attributes", "description", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16600x implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C16597u> attributes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String description;

    public C16600x(String header, List<C16597u> attributes, String description) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(attributes, "attributes");
        AbstractC22676k.m65750j(description, "description");
        this.header = header;
        this.attributes = attributes;
        this.description = description;
    }

    /* JADX INFO: renamed from: a */
    public final List<C16597u> m47110a() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16600x)) {
            return false;
        }
        C16600x c16600x = (C16600x) other;
        return AbstractC22676k.m65745e(this.header, c16600x.header) && AbstractC22676k.m65745e(this.attributes, c16600x.attributes) && AbstractC22676k.m65745e(this.description, c16600x.description);
    }

    public int hashCode() {
        return this.description.hashCode() + AbstractC11895b.m31983b(this.header.hashCode() * 31, 31, this.attributes);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.description, ")", AbstractC30802r.m94766o("ProductDetailsSectionState(header=", this.header, ", attributes=", ", description=", this.attributes));
    }
}
