package g40;

import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import java.io.IOException;
import m83.C25271y;
import p412q3.InterfaceC29873g0;
import p479s4.AbstractC32128i;
import p636y3.EnumC39181m;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: g40.l1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15384l1 implements InterfaceC15386l3 {

    /* JADX INFO: renamed from: w */
    public final C41210b f57826w = AbstractC32128i.m100064s(R.string.stripe_address_label_full_name, new Object[0], C25271y.f99162w);

    /* JADX INFO: renamed from: x */
    public final int f57827x = 2;

    /* JADX INFO: renamed from: y */
    public final int f57828y = 1;

    /* JADX INFO: renamed from: z */
    public final C13045h2 f57829z = AbstractC13091v.m36593c(null);

    /* JADX INFO: renamed from: E */
    public final C13045h2 f57825E = AbstractC13091v.m36593c(Boolean.FALSE);

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: a */
    public final InterfaceC13037f2 mo1715a() {
        return this.f57829z;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: b */
    public final String mo1716b(String rawValue) {
        AbstractC22676k.m65750j(rawValue, "rawValue");
        return rawValue;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: d */
    public final InterfaceC29873g0 mo1717d() {
        return null;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: e */
    public final String mo1718e() {
        return null;
    }

    @Override // g40.InterfaceC15386l3
    public final InterfaceC41211c getLabel() {
        return this.f57826w;
    }

    @Override // g40.InterfaceC15386l3
    public final EnumC39181m getLayoutDirection() {
        return null;
    }

    @Override // g40.InterfaceC15386l3
    public final C13045h2 getLoading() {
        return this.f57825E;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: h */
    public final int mo1719h() {
        return this.f57827x;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: j */
    public final String mo1720j(String userTyped) throws IOException {
        AbstractC22676k.m65750j(userTyped, "userTyped");
        StringBuilder sb4 = new StringBuilder();
        int length = userTyped.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = userTyped.charAt(i13);
            if (Character.isLetter(cCharAt) || cCharAt == ' ') {
                sb4.append(cCharAt);
            }
        }
        return sb4.toString();
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15421s3 mo1721k(String input) {
        AbstractC22676k.m65750j(input, "input");
        return AbstractC39414r.m125890i0(input) ? C15426t3.f57978b : C15451y3.f58039a;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: l */
    public final boolean mo1722l() {
        return false;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: m */
    public final String mo1723m(String displayName) {
        AbstractC22676k.m65750j(displayName, "displayName");
        return displayName;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: n */
    public final int mo1724n() {
        return this.f57828y;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: o */
    public final boolean mo1725o() {
        return true;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: p */
    public final boolean mo1726p() {
        return true;
    }
}
