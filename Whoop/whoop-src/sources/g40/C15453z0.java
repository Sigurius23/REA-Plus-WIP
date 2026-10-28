package g40;

import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import m83.C25271y;
import p412q3.InterfaceC29873g0;
import p479s4.AbstractC32128i;
import p636y3.EnumC39181m;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: g40.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15453z0 implements InterfaceC15386l3 {

    /* JADX INFO: renamed from: F */
    public static final Pattern f58040F;

    /* JADX INFO: renamed from: E */
    public final C13045h2 f58041E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC41211c f58042w;

    /* JADX INFO: renamed from: x */
    public final boolean f58043x;

    /* JADX INFO: renamed from: y */
    public final int f58044y;

    /* JADX INFO: renamed from: z */
    public final C13045h2 f58045z;

    static {
        Pattern patternCompile = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        f58040F = patternCompile;
    }

    public C15453z0(boolean z4, int i13) {
        C41210b c41210bM100064s = AbstractC32128i.m100064s(R.string.stripe_email, new Object[0], C25271y.f99162w);
        z4 = (i13 & 2) != 0 ? false : z4;
        this.f58042w = c41210bM100064s;
        this.f58043x = z4;
        this.f58044y = 6;
        this.f58045z = AbstractC13091v.m36593c(null);
        this.f58041E = AbstractC13091v.m36593c(Boolean.FALSE);
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: a */
    public final InterfaceC13037f2 mo1715a() {
        return this.f58045z;
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
        return this.f58042w;
    }

    @Override // g40.InterfaceC15386l3
    public final EnumC39181m getLayoutDirection() {
        return null;
    }

    @Override // g40.InterfaceC15386l3
    public final C13045h2 getLoading() {
        return this.f58041E;
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
        for (int i13 = 0; i13 < userTyped.length(); i13++) {
            char cCharAt = userTyped.charAt(i13);
            if (!AbstractC35846d.m113784i(cCharAt)) {
                sb4.append(cCharAt);
            }
        }
        return sb4.toString();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061 A[SYNTHETIC] */
    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15421s3 mo1721k(String input) {
        int i13;
        AbstractC22676k.m65750j(input, "input");
        boolean z4 = input.length() == 0;
        if (!this.f58043x || !z4) {
            if (AbstractC39414r.m125890i0(input)) {
                return C15426t3.f57978b;
            }
            if (!f58040F.matcher(input).matches()) {
                if (AbstractC39414r.m125876U(input, "@", false)) {
                    Pattern patternCompile = Pattern.compile(".*@.*\\..+");
                    AbstractC22676k.m65749i(patternCompile, "compile(...)");
                    if (!patternCompile.matcher(input).matches()) {
                        i13 = 0;
                        for (int i14 = 0; i14 < input.length(); i14++) {
                            if (input.charAt(i14) == '@') {
                                i13++;
                            }
                        }
                        if (i13 <= 1) {
                            return new C15431u3(R.string.stripe_email_is_invalid);
                        }
                    }
                } else {
                    i13 = 0;
                    while (i14 < input.length()) {
                        if (input.charAt(i14) == '@') {
                            i13++;
                        }
                    }
                    if (i13 <= 1) {
                        return new C15431u3(R.string.stripe_email_is_invalid);
                    }
                }
                return new C15436v3(R.string.stripe_email_is_invalid, 6, (List) null);
            }
        }
        return C15451y3.f58039a;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: l */
    public final boolean mo1722l() {
        return this.f58043x;
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
        return this.f58044y;
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
