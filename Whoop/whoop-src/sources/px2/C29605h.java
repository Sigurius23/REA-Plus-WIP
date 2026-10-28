package px2;

import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: px2.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lpx2/h;", "", "", "key", "Lcom/whoop/design/util/TextResource;", "value", "", "requiresAdditionalText", "isSelected", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "Z", "getRequiresAdditionalText", "()Z", "d", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29605h {

    /* JADX INFO: renamed from: e */
    public static final int f120920e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean requiresAdditionalText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isSelected;

    public C29605h(String key, TextResource value, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        this.key = key;
        this.value = value;
        this.requiresAdditionalText = z4;
        this.isSelected = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29605h)) {
            return false;
        }
        C29605h c29605h = (C29605h) other;
        return AbstractC22676k.m65745e(this.key, c29605h.key) && AbstractC22676k.m65745e(this.value, c29605h.value) && this.requiresAdditionalText == c29605h.requiresAdditionalText && this.isSelected == c29605h.isSelected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + AbstractC2875y.m8289b(AbstractC31061c.m95625a(this.key.hashCode() * 31, this.value, 31), 31, this.requiresAdditionalText);
    }

    public String toString() {
        String str = this.key;
        TextResource textResource = this.value;
        return AbstractC36095b.m114682j(AbstractC30007c.m91847q("CancelScreenOptionViewState(key=", str, ", value=", textResource, ", requiresAdditionalText="), this.requiresAdditionalText, ", isSelected=", this.isSelected, ")");
    }
}
