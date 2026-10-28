package hy0;

import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: hy0.p0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lhy0/p0;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "label", "", "isChecked", "Lhy0/o0;", "style", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLhy0/o0;)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLhy0/o0;)Lhy0/p0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "Z", "f", "()Z", "d", "Lhy0/o0;", "e", "()Lhy0/o0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17777p0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f69130e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isChecked;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC17774o0 style;

    public C17777p0(String id4, TextResource label, boolean z4, EnumC17774o0 style) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(style, "style");
        this.id = id4;
        this.label = label;
        this.isChecked = z4;
        this.style = style;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17777p0 m51068b(C17777p0 c17777p0, String str, TextResource textResource, boolean z4, EnumC17774o0 enumC17774o0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c17777p0.id;
        }
        if ((i13 & 2) != 0) {
            textResource = c17777p0.label;
        }
        if ((i13 & 4) != 0) {
            z4 = c17777p0.isChecked;
        }
        if ((i13 & 8) != 0) {
            enumC17774o0 = c17777p0.style;
        }
        return c17777p0.m51069a(str, textResource, z4, enumC17774o0);
    }

    /* JADX INFO: renamed from: a */
    public final C17777p0 m51069a(String id4, TextResource label, boolean isChecked, EnumC17774o0 style) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(style, "style");
        return new C17777p0(id4, label, isChecked, style);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC17774o0 getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17777p0)) {
            return false;
        }
        C17777p0 c17777p0 = (C17777p0) other;
        return AbstractC22676k.m65745e(this.id, c17777p0.id) && AbstractC22676k.m65745e(this.label, c17777p0.label) && this.isChecked == c17777p0.isChecked && this.style == c17777p0.style;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC2875y.m8289b(AbstractC31061c.m95625a(this.id.hashCode() * 31, this.label, 31), 31, this.isChecked);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.label;
        boolean z4 = this.isChecked;
        EnumC17774o0 enumC17774o0 = this.style;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("OptionInfoViewState(id=", str, ", label=", textResource, ", isChecked=");
        sbM91847q.append(z4);
        sbM91847q.append(", style=");
        sbM91847q.append(enumC17774o0);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }
}
