package e90;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e90.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Le90/a;", "", "", "text", "type", "", "selected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "getSelected", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12878a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean selected;

    public C12878a(String text, String type, boolean z4) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(type, "type");
        this.text = text;
        this.type = type;
        this.selected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12878a)) {
            return false;
        }
        C12878a c12878a = (C12878a) other;
        return AbstractC22676k.m65745e(this.text, c12878a.text) && AbstractC22676k.m65745e(this.type, c12878a.type) && this.selected == c12878a.selected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.selected) + AbstractC11266d.m30450d(this.text.hashCode() * 31, 31, this.type);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.type;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("BaselineOptions(text=", str, ", type=", str2, ", selected="), this.selected, ")");
    }

    public /* synthetic */ C12878a(String str, String str2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? false : z4);
    }
}
