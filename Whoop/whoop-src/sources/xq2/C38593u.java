package xq2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: xq2.u */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, m65681d2 = {"Lxq2/u;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "value", "valueSuffix", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "getValueSuffix", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38593u implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f166053e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource valueSuffix;

    public C38593u(TextResource title, TextResource subtitle, TextResource value, TextResource valueSuffix) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(valueSuffix, "valueSuffix");
        this.title = title;
        this.subtitle = subtitle;
        this.value = value;
        this.valueSuffix = valueSuffix;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38593u)) {
            return false;
        }
        C38593u c38593u = (C38593u) other;
        return AbstractC22676k.m65745e(this.title, c38593u.title) && AbstractC22676k.m65745e(this.subtitle, c38593u.subtitle) && AbstractC22676k.m65745e(this.value, c38593u.value) && AbstractC22676k.m65745e(this.valueSuffix, c38593u.valueSuffix);
    }

    public int hashCode() {
        return this.valueSuffix.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), this.value, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        return AbstractC33745d.m106655n(AbstractC33745d.m106658q("NumberValueState(title=", textResource, ", subtitle=", textResource2, ", value="), this.value, ", valueSuffix=", this.valueSuffix, ")");
    }
}
