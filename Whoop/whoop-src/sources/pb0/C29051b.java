package pb0;

import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pb0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lpb0/b;", "", "", "text", "", "isChecked", "<init>", "(Ljava/lang/String;Z)V", "a", "(Ljava/lang/String;Z)Lpb0/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Z", "d", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29051b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isChecked;

    public C29051b(String text, boolean z4) {
        AbstractC22676k.m65750j(text, "text");
        this.text = text;
        this.isChecked = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29051b m88298b(C29051b c29051b, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c29051b.text;
        }
        if ((i13 & 2) != 0) {
            z4 = c29051b.isChecked;
        }
        return c29051b.m88299a(str, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C29051b m88299a(String text, boolean isChecked) {
        AbstractC22676k.m65750j(text, "text");
        return new C29051b(text, isChecked);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29051b)) {
            return false;
        }
        C29051b c29051b = (C29051b) other;
        return AbstractC22676k.m65745e(this.text, c29051b.text) && this.isChecked == c29051b.isChecked;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isChecked) + (this.text.hashCode() * 31);
    }

    public String toString() {
        return AbstractC26725a.m79503g("CheckboxViewState(text=", this.text, ", isChecked=", ")", this.isChecked);
    }
}
