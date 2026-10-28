package x30;

import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import g40.C15362h2;
import g40.C15411q3;
import g40.C15426t3;
import g40.C15431u3;
import g40.C15436v3;
import g40.C15446x3;
import g40.C15451y3;
import g40.InterfaceC15386l3;
import g40.InterfaceC15421s3;
import h02.C16587n0;
import i93.C18277c;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import p412q3.InterfaceC29873g0;
import p479s4.AbstractC32128i;
import p599wz.C37722h1;
import p636y3.EnumC39181m;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.C39412p;

/* JADX INFO: renamed from: x30.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37941z0 implements InterfaceC15386l3 {

    /* JADX INFO: renamed from: F */
    public static final ArrayList f162421F = AbstractC25265s.m74129g1(AbstractC25265s.m74126d1(new C18277c('0', '9'), new C18277c('a', 'z')), new C18277c('A', 'Z'));

    /* JADX INFO: renamed from: w */
    public final C41210b f162423w = AbstractC32128i.m100064s(R.string.stripe_iban, new Object[0], C25271y.f99162w);

    /* JADX INFO: renamed from: x */
    public final int f162424x = 2;

    /* JADX INFO: renamed from: y */
    public final C13045h2 f162425y = AbstractC13091v.m36593c(new C15411q3(R.drawable.stripe_ic_bank_generic, true, (C16587n0) null, 10));

    /* JADX INFO: renamed from: z */
    public final C13045h2 f162426z = AbstractC13091v.m36593c(Boolean.FALSE);

    /* JADX INFO: renamed from: E */
    public final C15362h2 f162422E = new C15362h2(4);

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: a */
    public final InterfaceC13037f2 mo1715a() {
        return this.f162425y;
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
        return this.f162422E;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: e */
    public final String mo1718e() {
        return null;
    }

    @Override // g40.InterfaceC15386l3
    public final InterfaceC41211c getLabel() {
        return this.f162423w;
    }

    @Override // g40.InterfaceC15386l3
    public final EnumC39181m getLayoutDirection() {
        return null;
    }

    @Override // g40.InterfaceC15386l3
    public final C13045h2 getLoading() {
        return this.f162426z;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: h */
    public final int mo1719h() {
        return 1;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: j */
    public final String mo1720j(String userTyped) {
        AbstractC22676k.m65750j(userTyped, "userTyped");
        StringBuilder sb4 = new StringBuilder();
        int length = userTyped.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = userTyped.charAt(i13);
            if (f162421F.contains(Character.valueOf(cCharAt))) {
                sb4.append(cCharAt);
            }
        }
        String upperCase = AbstractC39414r.m125866L0(34, sb4.toString()).toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15421s3 mo1721k(String input) {
        AbstractC22676k.m65750j(input, "input");
        if (AbstractC39414r.m125890i0(input)) {
            return C15426t3.f57978b;
        }
        String upperCase = AbstractC39414r.m125866L0(2, input).toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        for (int i13 = 0; i13 < upperCase.length(); i13++) {
            if (Character.isDigit(upperCase.charAt(i13))) {
                return new C15436v3(R.string.stripe_iban_invalid_start, 6, (List) null);
            }
        }
        if (upperCase.length() < 2) {
            return new C15431u3(R.string.stripe_iban_incomplete);
        }
        String[] iSOCountries = Locale.getISOCountries();
        AbstractC22676k.m65749i(iSOCountries, "getISOCountries(...)");
        if (!AbstractC25260n.m74056a0(iSOCountries, upperCase)) {
            return new C15436v3(R.string.stripe_iban_invalid_country, 4, AbstractC37056f.m118958J(upperCase));
        }
        if (input.length() < 8) {
            return new C15431u3(R.string.stripe_iban_incomplete);
        }
        String upperCase2 = AbstractC39414r.m125867M0(input.length() - 4, input).concat(AbstractC39414r.m125866L0(4, input)).toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
        if (new BigInteger(new C39412p("[A-Z]").m125853g(upperCase2, new C37722h1(17))).mod(new BigInteger("97")).equals(BigInteger.ONE)) {
            return input.length() == 34 ? new C15446x3(null) : C15451y3.f58039a;
        }
        return new C15431u3(R.string.stripe_invalid_bank_account_iban);
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
        return this.f162424x;
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
