package e90;

import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: e90.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0013\u0010\f¨\u0006\u001c"}, m65681d2 = {"Le90/c;", "", "Lcom/whoop/design/util/TextResource;", "text", "", "type", "", "selected", "baseline", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "d", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12880c {

    /* JADX INFO: renamed from: e */
    public static final int f44343e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean selected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String baseline;

    public C12880c(TextResource text, String type, boolean z4, String str) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(type, "type");
        this.text = text;
        this.type = type;
        this.selected = z4;
        this.baseline = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBaseline() {
        return this.baseline;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12880c)) {
            return false;
        }
        C12880c c12880c = (C12880c) other;
        return AbstractC22676k.m65745e(this.text, c12880c.text) && AbstractC22676k.m65745e(this.type, c12880c.type) && this.selected == c12880c.selected && AbstractC22676k.m65745e(this.baseline, c12880c.baseline);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.text.hashCode() * 31, 31, this.type), 31, this.selected);
        String str = this.baseline;
        return iM8289b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        TextResource textResource = this.text;
        String str = this.type;
        return AbstractC21702c.m61139j(AbstractC30007c.m91845o("GenderOptions(text=", textResource, ", type=", str, ", selected="), this.selected, ", baseline=", this.baseline, ")");
    }

    public /* synthetic */ C12880c(TextResource textResource, String str, boolean z4, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? null : str2);
    }
}
