package h02;

import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h02.l0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, m65681d2 = {"Lh02/l0;", "", "", "key", "text", "Lkd1/o;", "image", "label", "", "hasStock", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Z)Lh02/l0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "g", "c", "Lkd1/o;", "d", "()Lkd1/o;", "f", "Z", "()Z", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16583l0 {

    /* JADX INFO: renamed from: f */
    public static final int f63837f = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean hasStock;

    public C16583l0(String key, String text, AbstractC22403o abstractC22403o, String label, boolean z4) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(label, "label");
        this.key = key;
        this.text = text;
        this.image = abstractC22403o;
        this.label = label;
        this.hasStock = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16583l0 m47042b(C16583l0 c16583l0, String str, String str2, AbstractC22403o abstractC22403o, String str3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c16583l0.key;
        }
        if ((i13 & 2) != 0) {
            str2 = c16583l0.text;
        }
        if ((i13 & 4) != 0) {
            abstractC22403o = c16583l0.image;
        }
        if ((i13 & 8) != 0) {
            str3 = c16583l0.label;
        }
        if ((i13 & 16) != 0) {
            z4 = c16583l0.hasStock;
        }
        boolean z13 = z4;
        AbstractC22403o abstractC22403o2 = abstractC22403o;
        return c16583l0.m47043a(str, str2, abstractC22403o2, str3, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C16583l0 m47043a(String key, String text, AbstractC22403o image, String label, boolean hasStock) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(label, "label");
        return new C16583l0(key, text, image, label, hasStock);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasStock() {
        return this.hasStock;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16583l0)) {
            return false;
        }
        C16583l0 c16583l0 = (C16583l0) other;
        return AbstractC22676k.m65745e(this.key, c16583l0.key) && AbstractC22676k.m65745e(this.text, c16583l0.text) && AbstractC22676k.m65745e(this.image, c16583l0.image) && AbstractC22676k.m65745e(this.label, c16583l0.label) && this.hasStock == c16583l0.hasStock;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.key.hashCode() * 31, 31, this.text);
        AbstractC22403o abstractC22403o = this.image;
        return Boolean.hashCode(this.hasStock) + AbstractC11266d.m30450d((iM30450d + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31, this.label);
    }

    public String toString() {
        String str = this.key;
        String str2 = this.text;
        AbstractC22403o abstractC22403o = this.image;
        String str3 = this.label;
        boolean z4 = this.hasStock;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("VariantOptionUiState(key=", str, ", text=", str2, ", image=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(", label=");
        sbM32001t.append(str3);
        sbM32001t.append(", hasStock=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }
}
