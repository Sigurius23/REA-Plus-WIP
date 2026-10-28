package g40;

import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import m83.C25271y;
import o73.C27648a;
import p412q3.InterfaceC29873g0;
import p479s4.AbstractC32128i;
import p636y3.EnumC39181m;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: g40.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15372j0 implements InterfaceC15386l3 {

    /* JADX INFO: renamed from: w */
    public final C41210b f57783w = AbstractC32128i.m100064s(R.string.stripe_expiration_date_hint, new Object[0], C25271y.f99162w);

    /* JADX INFO: renamed from: x */
    public final int f57784x = 8;

    /* JADX INFO: renamed from: y */
    public final C15337d1 f57785y = new C15337d1(null, 0);

    /* JADX INFO: renamed from: z */
    public final C13045h2 f57786z = AbstractC13091v.m36593c(null);

    /* JADX INFO: renamed from: E */
    public final C13045h2 f57781E = AbstractC13091v.m36593c(Boolean.FALSE);

    /* JADX INFO: renamed from: F */
    public final EnumC39181m f57782F = EnumC39181m.f168423w;

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: a */
    public final InterfaceC13037f2 mo1715a() {
        return this.f57786z;
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
        return this.f57785y;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: e */
    public final String mo1718e() {
        return null;
    }

    @Override // g40.InterfaceC15386l3
    public final InterfaceC41211c getLabel() {
        return this.f57783w;
    }

    @Override // g40.InterfaceC15386l3
    public final EnumC39181m getLayoutDirection() {
        return this.f57782F;
    }

    @Override // g40.InterfaceC15386l3
    public final C13045h2 getLoading() {
        return this.f57781E;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: h */
    public final int mo1719h() {
        return 0;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: j */
    public final String mo1720j(String userTyped) throws IOException {
        AbstractC22676k.m65750j(userTyped, "userTyped");
        StringBuilder sb4 = new StringBuilder();
        int length = userTyped.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = userTyped.charAt(i13);
            if (Character.isDigit(cCharAt)) {
                sb4.append(cCharAt);
            }
        }
        return sb4.toString();
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15421s3 mo1721k(String input) {
        AbstractC22676k.m65750j(input, "input");
        if (AbstractC39414r.m125890i0(input)) {
            return C15426t3.f57978b;
        }
        String strM83599v = C27648a.m83599v(input);
        if (strM83599v.length() < 4) {
            return new C15431u3(R.string.stripe_incomplete_expiry_date);
        }
        if (strM83599v.length() > 4) {
            return new C15436v3(R.string.stripe_incomplete_expiry_date, 6, (List) null);
        }
        Integer numM125932Q = AbstractC39421y.m125932Q(AbstractC39414r.m125866L0(2, strM83599v));
        if (numM125932Q == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iIntValue = numM125932Q.intValue();
        Integer numM125932Q2 = AbstractC39421y.m125932Q(AbstractC39414r.m125867M0(2, strM83599v));
        if (numM125932Q2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iIntValue2 = numM125932Q2.intValue();
        int i13 = Calendar.getInstance().get(2) + 1;
        int i14 = iIntValue2 - (Calendar.getInstance().get(1) % 100);
        boolean z4 = i14 < 0;
        boolean z13 = i14 > 50;
        boolean z14 = i14 == 0 && i13 > iIntValue;
        boolean z15 = 1 <= iIntValue && iIntValue < 13;
        if (!z4 && !z13) {
            if (z14) {
                return new C15436v3(R.string.stripe_invalid_expiry_month, 2, (List) null);
            }
            return !z15 ? new C15431u3(R.string.stripe_invalid_expiry_month) : new C15446x3(null);
        }
        return new C15436v3(R.string.stripe_invalid_expiry_year, 2, (List) null);
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
        return this.f57784x;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: o */
    public final boolean mo1725o() {
        return false;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: p */
    public final boolean mo1726p() {
        return false;
    }
}
