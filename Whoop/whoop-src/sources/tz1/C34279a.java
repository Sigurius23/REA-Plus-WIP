package tz1;

import java.util.List;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33169c0;

/* JADX INFO: renamed from: tz1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ltz1/a;", "", "", "Lny0/h;", "buttons", "Lsz0/c0;", "headerText", "<init>", "(Ljava/util/List;Lsz0/c0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lsz0/c0;", "()Lsz0/c0;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34279a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C27256h> buttons;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C33169c0 headerText;

    public C34279a(List<C27256h> buttons, C33169c0 c33169c0) {
        AbstractC22676k.m65750j(buttons, "buttons");
        this.buttons = buttons;
        this.headerText = c33169c0;
    }

    /* JADX INFO: renamed from: a */
    public final List<C27256h> m108557a() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C33169c0 getHeaderText() {
        return this.headerText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34279a)) {
            return false;
        }
        C34279a c34279a = (C34279a) other;
        return AbstractC22676k.m65745e(this.buttons, c34279a.buttons) && AbstractC22676k.m65745e(this.headerText, c34279a.headerText);
    }

    public int hashCode() {
        int iHashCode = this.buttons.hashCode() * 31;
        C33169c0 c33169c0 = this.headerText;
        return iHashCode + (c33169c0 == null ? 0 : c33169c0.hashCode());
    }

    public String toString() {
        return "CheckoutFooterState(buttons=" + this.buttons + ", headerText=" + this.headerText + ")";
    }
}
