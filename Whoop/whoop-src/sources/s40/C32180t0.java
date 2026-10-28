package s40;

import android.net.Uri;
import androidx.lifecycle.AbstractC1637w1;
import b10.C2222b;
import com.stripe.android.core.exception.StripeException;
import l83.C23470p;
import m30.C24991g;
import p663yx.C39838b;
import p664yy.C39865j;
import q80.C30036h;
import q83.AbstractC30060g;
import v10.C35526b;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: s40.t0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32180t0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f133269E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C32178s0 f133270F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String f133271G;

    /* JADX INFO: renamed from: w */
    public final C39838b f133272w;

    /* JADX INFO: renamed from: x */
    public final C39865j f133273x;

    /* JADX INFO: renamed from: y */
    public final C2222b f133274y;

    /* JADX INFO: renamed from: z */
    public final C23470p f133275z = AbstractC30060g.m92088H(new C30036h(this, 28));

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    public C32180t0(C39838b c39838b, C39865j c39865j, C2222b c2222b) {
        C32178s0 c32178s0;
        String str;
        this.f133272w = c39838b;
        this.f133273x = c39865j;
        this.f133274y = c2222b;
        C24991g c24991g = c39838b.f172017G;
        this.f133269E = (c24991g == null || (str = c24991g.f97796G) == null || AbstractC39414r.m125890i0(str)) ? null : str;
        if (c24991g == null) {
            c32178s0 = null;
        } else {
            String str2 = c24991g.f97795F;
            str2 = (str2 == null || AbstractC39414r.m125890i0(str2)) ? null : str2;
            if (str2 != null) {
                c32178s0 = new C32178s0(str2, c24991g);
            } else {
                c32178s0 = null;
            }
        }
        this.f133270F = c32178s0;
        this.f133271G = c24991g != null ? c24991g.f97797z : null;
    }

    /* JADX INFO: renamed from: g */
    public final C35526b m100108g() {
        C39838b c39838b = this.f133272w;
        String str = c39838b.f172028y;
        String lastPathSegment = Uri.parse(c39838b.f172029z).getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new C35526b(str, 0, (StripeException) null, false, lastPathSegment, c39838b.f172018H, 46);
    }
}
