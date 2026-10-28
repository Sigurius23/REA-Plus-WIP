package g40;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import java.util.Locale;
import java.util.regex.Pattern;
import p412q3.InterfaceC29873g0;
import p636y3.EnumC39181m;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: g40.r2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15415r2 implements InterfaceC15386l3 {

    /* JADX INFO: renamed from: E */
    public final AbstractC15405p2 f57915E;

    /* JADX INFO: renamed from: F */
    public final int f57916F;

    /* JADX INFO: renamed from: G */
    public final int f57917G;

    /* JADX INFO: renamed from: H */
    public final C15337d1 f57918H;

    /* JADX INFO: renamed from: I */
    public final C13045h2 f57919I;

    /* JADX INFO: renamed from: w */
    public final C41210b f57920w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC13075p1 f57921x;

    /* JADX INFO: renamed from: y */
    public final String f57922y;

    /* JADX INFO: renamed from: z */
    public final boolean f57923z;

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    public C15415r2(C41210b c41210b, String country, boolean z4) {
        AbstractC15405p2 abstractC15405p2;
        int i13;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        AbstractC22676k.m65750j(country, "country");
        this.f57920w = c41210b;
        this.f57921x = c13045h2M36593c;
        this.f57922y = country;
        this.f57923z = z4;
        int iHashCode = country.hashCode();
        if (iHashCode != 2142) {
            if (iHashCode != 2267) {
                if (iHashCode == 2718 && country.equals("US")) {
                    abstractC15405p2 = C15400o2.f57855d;
                } else {
                    abstractC15405p2 = C15395n2.f57846d;
                }
            } else if (country.equals("GB")) {
                abstractC15405p2 = C15390m2.f57836d;
            } else {
                abstractC15405p2 = C15395n2.f57846d;
            }
        } else if (country.equals("CA")) {
            abstractC15405p2 = C15385l2.f57830d;
        } else {
            abstractC15405p2 = C15395n2.f57846d;
        }
        this.f57915E = abstractC15405p2;
        C15400o2 c15400o2 = C15400o2.f57855d;
        int i14 = 1;
        if (AbstractC22676k.m65745e(abstractC15405p2, c15400o2)) {
            i13 = 0;
        } else {
            if (!AbstractC22676k.m65745e(abstractC15405p2, C15385l2.f57830d) && !AbstractC22676k.m65745e(abstractC15405p2, C15390m2.f57836d) && !AbstractC22676k.m65745e(abstractC15405p2, C15395n2.f57846d)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 1;
        }
        this.f57916F = i13;
        if (AbstractC22676k.m65745e(abstractC15405p2, c15400o2)) {
            i14 = 8;
        } else if (!AbstractC22676k.m65745e(abstractC15405p2, C15385l2.f57830d) && !AbstractC22676k.m65745e(abstractC15405p2, C15390m2.f57836d) && !AbstractC22676k.m65745e(abstractC15405p2, C15395n2.f57846d)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f57917G = i14;
        this.f57918H = new C15337d1(abstractC15405p2);
        this.f57919I = AbstractC13091v.m36593c(Boolean.FALSE);
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: a */
    public final InterfaceC13037f2 mo1715a() {
        return this.f57921x;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: b */
    public final String mo1716b(String rawValue) {
        AbstractC22676k.m65750j(rawValue, "rawValue");
        Pattern patternCompile = Pattern.compile("\\s+");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(rawValue).replaceAll("");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: d */
    public final InterfaceC29873g0 mo1717d() {
        return this.f57918H;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: e */
    public final String mo1718e() {
        return null;
    }

    @Override // g40.InterfaceC15386l3
    public final InterfaceC41211c getLabel() {
        return this.f57920w;
    }

    @Override // g40.InterfaceC15386l3
    public final EnumC39181m getLayoutDirection() {
        return null;
    }

    @Override // g40.InterfaceC15386l3
    public final C13045h2 getLoading() {
        return this.f57919I;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: h */
    public final int mo1719h() {
        return this.f57916F;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: j */
    public final String mo1720j(String userTyped) {
        AbstractC22676k.m65750j(userTyped, "userTyped");
        C15400o2 c15400o2 = C15400o2.f57855d;
        AbstractC15405p2 abstractC15405p2 = this.f57915E;
        int i13 = 0;
        if (AbstractC22676k.m65745e(abstractC15405p2, c15400o2)) {
            StringBuilder sb4 = new StringBuilder();
            int length = userTyped.length();
            while (i13 < length) {
                char cCharAt = userTyped.charAt(i13);
                if (Character.isDigit(cCharAt)) {
                    sb4.append(cCharAt);
                }
                i13++;
            }
            userTyped = sb4.toString();
        } else if (AbstractC22676k.m65745e(abstractC15405p2, C15385l2.f57830d) || AbstractC22676k.m65745e(abstractC15405p2, C15390m2.f57836d)) {
            StringBuilder sb5 = new StringBuilder();
            int length2 = userTyped.length();
            while (i13 < length2) {
                char cCharAt2 = userTyped.charAt(i13);
                if (Character.isLetterOrDigit(cCharAt2)) {
                    sb5.append(cCharAt2);
                }
                i13++;
            }
            userTyped = sb5.toString().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(userTyped, "toUpperCase(...)");
        } else if (!AbstractC22676k.m65745e(abstractC15405p2, C15395n2.f57846d)) {
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC39414r.m125866L0(abstractC15405p2.f57868b, userTyped);
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15421s3 mo1721k(String input) {
        AbstractC22676k.m65750j(input, "input");
        return new C15410q2(this, input, 0);
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: l */
    public final boolean mo1722l() {
        return this.f57923z;
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
        return this.f57917G;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: o */
    public final boolean mo1725o() {
        return false;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: p */
    public final boolean mo1726p() {
        return true;
    }
}
