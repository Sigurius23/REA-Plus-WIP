package cp0;

import c93.InterfaceC4351m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cp0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lcp0/h;", "", "Lkotlin/Function0;", "Ll83/a0;", "leadingIcon", "trailingIcon", "<init>", "(Lc93/m;Lc93/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc93/m;", "()Lc93/m;", "b", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C10962h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4351m leadingIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4351m trailingIcon;

    public C10962h(InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2) {
        this.leadingIcon = interfaceC4351m;
        this.trailingIcon = interfaceC4351m2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC4351m getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC4351m getTrailingIcon() {
        return this.trailingIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C10962h)) {
            return false;
        }
        C10962h c10962h = (C10962h) other;
        return AbstractC22676k.m65745e(this.leadingIcon, c10962h.leadingIcon) && AbstractC22676k.m65745e(this.trailingIcon, c10962h.trailingIcon);
    }

    public int hashCode() {
        InterfaceC4351m interfaceC4351m = this.leadingIcon;
        int iHashCode = (interfaceC4351m == null ? 0 : interfaceC4351m.hashCode()) * 31;
        InterfaceC4351m interfaceC4351m2 = this.trailingIcon;
        return iHashCode + (interfaceC4351m2 != null ? interfaceC4351m2.hashCode() : 0);
    }

    public String toString() {
        return "BottomSheetToolbarContent(leadingIcon=" + this.leadingIcon + ", trailingIcon=" + this.trailingIcon + ")";
    }

    public /* synthetic */ C10962h(InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC4351m, (i13 & 2) != 0 ? null : interfaceC4351m2);
    }
}
