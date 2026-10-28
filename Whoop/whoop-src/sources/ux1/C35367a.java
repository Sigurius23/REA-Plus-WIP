package ux1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ux1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lux1/a;", "", "Lcom/whoop/design/util/TextResource;", "value", "title", "tracking", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "c", "getTracking", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35367a {

    /* JADX INFO: renamed from: d */
    public static final int f150641d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource tracking;

    public C35367a(TextResource value, TextResource title, TextResource textResource) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(title, "title");
        this.value = value;
        this.title = title;
        this.tracking = textResource;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35367a)) {
            return false;
        }
        C35367a c35367a = (C35367a) other;
        return AbstractC22676k.m65745e(this.value, c35367a.value) && AbstractC22676k.m65745e(this.title, c35367a.title) && AbstractC22676k.m65745e(this.tracking, c35367a.tracking);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.value.hashCode() * 31, this.title, 31);
        TextResource textResource = this.tracking;
        return iM95625a + (textResource == null ? 0 : textResource.hashCode());
    }

    public String toString() {
        TextResource textResource = this.value;
        TextResource textResource2 = this.title;
        return AbstractC30007c.m91841k(AbstractC33745d.m106658q("MemberStatisticsState(value=", textResource, ", title=", textResource2, ", tracking="), this.tracking, ")");
    }

    public /* synthetic */ C35367a(TextResource textResource, TextResource textResource2, TextResource textResource3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, (i13 & 4) != 0 ? null : textResource3);
    }
}
