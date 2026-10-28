package x30;

import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import g40.C15426t3;
import g40.C15431u3;
import g40.C15436v3;
import g40.C15451y3;
import g40.InterfaceC15386l3;
import g40.InterfaceC15421s3;
import java.io.IOException;
import java.util.List;
import l83.C23470p;
import m83.C25271y;
import p412q3.InterfaceC29873g0;
import p479s4.AbstractC32128i;
import p636y3.EnumC39181m;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wr1.C37572f;
import yb3.AbstractC39414r;
import yb3.C39412p;

/* JADX INFO: renamed from: x30.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C37892h implements InterfaceC15386l3 {

    /* JADX INFO: renamed from: E */
    public final C13045h2 f162245E;

    /* JADX INFO: renamed from: F */
    public final C13045h2 f162246F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162247w;

    /* JADX INFO: renamed from: x */
    public final C23470p f162248x;

    /* JADX INFO: renamed from: y */
    public final C41210b f162249y;

    /* JADX INFO: renamed from: z */
    public final int f162250z;

    public C37892h(int i13) {
        this.f162247w = i13;
        switch (i13) {
            case 1:
                this.f162248x = AbstractC30060g.m92088H(new C37572f(24));
                this.f162249y = AbstractC32128i.m100064s(R.string.stripe_upi_id_label, new Object[0], C25271y.f99162w);
                this.f162250z = 6;
                this.f162245E = AbstractC13091v.m36593c(null);
                this.f162246F = AbstractC13091v.m36593c(Boolean.FALSE);
                break;
            default:
                this.f162248x = AbstractC30060g.m92088H(new C37572f(14));
                this.f162249y = AbstractC32128i.m100064s(R.string.stripe_blik_code, new Object[0], C25271y.f99162w);
                this.f162250z = 3;
                this.f162245E = AbstractC13091v.m36593c(null);
                this.f162246F = AbstractC13091v.m36593c(Boolean.FALSE);
                break;
        }
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: a */
    public final InterfaceC13037f2 mo1715a() {
        switch (this.f162247w) {
            case 0:
                break;
        }
        return this.f162245E;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: b */
    public final String mo1716b(String rawValue) {
        switch (this.f162247w) {
        }
        AbstractC22676k.m65750j(rawValue, "rawValue");
        return rawValue;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: d */
    public final InterfaceC29873g0 mo1717d() {
        switch (this.f162247w) {
        }
        return null;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: e */
    public final String mo1718e() {
        switch (this.f162247w) {
        }
        return null;
    }

    @Override // g40.InterfaceC15386l3
    public final InterfaceC41211c getLabel() {
        switch (this.f162247w) {
            case 0:
                break;
        }
        return this.f162249y;
    }

    @Override // g40.InterfaceC15386l3
    public final EnumC39181m getLayoutDirection() {
        switch (this.f162247w) {
        }
        return null;
    }

    @Override // g40.InterfaceC15386l3
    public final C13045h2 getLoading() {
        switch (this.f162247w) {
            case 0:
                break;
        }
        return this.f162246F;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: h */
    public final int mo1719h() {
        switch (this.f162247w) {
        }
        return 0;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: j */
    public final String mo1720j(String userTyped) throws IOException {
        switch (this.f162247w) {
            case 0:
                AbstractC22676k.m65750j(userTyped, "userTyped");
                StringBuilder sb4 = new StringBuilder();
                int length = userTyped.length();
                for (int i13 = 0; i13 < length; i13++) {
                    char cCharAt = userTyped.charAt(i13);
                    if (Character.isDigit(cCharAt)) {
                        sb4.append(cCharAt);
                    }
                }
                return AbstractC39414r.m125866L0(6, sb4.toString());
            default:
                AbstractC22676k.m65750j(userTyped, "userTyped");
                return AbstractC39414r.m125869O0(userTyped).toString();
        }
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15421s3 mo1721k(String input) {
        switch (this.f162247w) {
            case 0:
                AbstractC22676k.m65750j(input, "input");
                boolean zM125851e = ((C39412p) this.f162248x.getValue()).m125851e(input);
                if (input.length() == 0) {
                    return C15426t3.f57978b;
                }
                if (zM125851e) {
                    return C15451y3.f58039a;
                }
                for (int i13 = 0; i13 < input.length(); i13++) {
                    if (!Character.isDigit(input.charAt(i13))) {
                        return new C15436v3(R.string.stripe_invalid_blik_code, 6, (List) null);
                    }
                }
                return input.length() < 6 ? new C15431u3(R.string.stripe_incomplete_blik_code) : new C15436v3(R.string.stripe_invalid_blik_code, 6, (List) null);
            default:
                AbstractC22676k.m65750j(input, "input");
                boolean z4 = ((C39412p) this.f162248x.getValue()).m125851e(input) && input.length() <= 30;
                if (input.length() == 0) {
                    return C15426t3.f57978b;
                }
                return z4 ? C15451y3.f58039a : new C15431u3(R.string.stripe_invalid_upi_id);
        }
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: l */
    public final boolean mo1722l() {
        switch (this.f162247w) {
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: m */
    public final String mo1723m(String displayName) {
        switch (this.f162247w) {
        }
        AbstractC22676k.m65750j(displayName, "displayName");
        return displayName;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: n */
    public final int mo1724n() {
        switch (this.f162247w) {
            case 0:
                break;
        }
        return this.f162250z;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: o */
    public final boolean mo1725o() {
        switch (this.f162247w) {
        }
        return true;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: p */
    public final boolean mo1726p() {
        switch (this.f162247w) {
        }
        return true;
    }
}
