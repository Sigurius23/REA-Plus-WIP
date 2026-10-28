package h00;

import com.whoop.android.R;
import k00.InterfaceC22088a;
import p479s4.AbstractC32128i;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;

/* JADX INFO: renamed from: h00.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16507i0 implements InterfaceC22088a {

    /* JADX INFO: renamed from: a */
    public static final C16507i0 f63476a = new C16507i0();

    /* JADX INFO: renamed from: b */
    public static final C41210b f63477b = AbstractC32128i.m100054h(R.string.stripe_log_out);

    /* JADX INFO: renamed from: c */
    public static final String f63478c = "logout_menu_row_tag";

    /* JADX INFO: renamed from: d */
    public static final boolean f63479d = true;

    @Override // k00.InterfaceC22088a
    /* JADX INFO: renamed from: a */
    public final String mo46671a() {
        return f63478c;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C16507i0);
    }

    @Override // k00.InterfaceC22088a
    public final InterfaceC41211c getText() {
        return f63477b;
    }

    public final int hashCode() {
        return -1597127691;
    }

    @Override // k00.InterfaceC22088a
    public final boolean isDestructive() {
        return f63479d;
    }

    public final String toString() {
        return "LogoutMenuItem";
    }
}
