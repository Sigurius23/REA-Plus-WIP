package q00;

import p696zy.C41210b;
import p696zy.InterfaceC41211c;

/* JADX INFO: renamed from: q00.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C29737s extends AbstractC29740v {

    /* JADX INFO: renamed from: d */
    public final C41210b f121624d;

    public C29737s(C41210b c41210b) {
        super(c41210b, "WALLET_MENU_REMOVE_ITEM_TAG", true);
        this.f121624d = c41210b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29737s) && this.f121624d.equals(((C29737s) obj).f121624d);
    }

    @Override // q00.AbstractC29740v, k00.InterfaceC22088a
    public final InterfaceC41211c getText() {
        return this.f121624d;
    }

    public final int hashCode() {
        return this.f121624d.hashCode();
    }

    public final String toString() {
        return "RemoveItem(text=" + this.f121624d + ")";
    }
}
