package vl2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vl2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lvl2/n;", "", "Lvl2/h;", "menuSheetUserState", "<init>", "(Lvl2/h;)V", "a", "(Lvl2/h;)Lvl2/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lvl2/h;", "b", "()Lvl2/h;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36121n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC36115h menuSheetUserState;

    public C36121n(InterfaceC36115h interfaceC36115h) {
        this.menuSheetUserState = interfaceC36115h;
    }

    /* JADX INFO: renamed from: a */
    public final C36121n m114791a(InterfaceC36115h menuSheetUserState) {
        return new C36121n(menuSheetUserState);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC36115h getMenuSheetUserState() {
        return this.menuSheetUserState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C36121n) && AbstractC22676k.m65745e(this.menuSheetUserState, ((C36121n) other).menuSheetUserState);
    }

    public int hashCode() {
        InterfaceC36115h interfaceC36115h = this.menuSheetUserState;
        if (interfaceC36115h == null) {
            return 0;
        }
        return interfaceC36115h.hashCode();
    }

    public String toString() {
        return "TrendMenuSheetResult(menuSheetUserState=" + this.menuSheetUserState + ")";
    }
}
