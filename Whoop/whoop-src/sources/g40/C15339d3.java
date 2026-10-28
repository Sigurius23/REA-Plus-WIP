package g40;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import m83.AbstractC25260n;
import p412q3.C29880n;
import p412q3.InterfaceC29873g0;
import p636y3.EnumC39181m;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.d3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15339d3 implements InterfaceC15386l3 {

    /* JADX INFO: renamed from: E */
    public final boolean f57639E;

    /* JADX INFO: renamed from: F */
    public final boolean f57640F;

    /* JADX INFO: renamed from: G */
    public final C13045h2 f57641G;

    /* JADX INFO: renamed from: w */
    public final C41210b f57642w;

    /* JADX INFO: renamed from: x */
    public final int f57643x;

    /* JADX INFO: renamed from: y */
    public final int f57644y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC13075p1 f57645z;

    public C15339d3(C41210b c41210b, int i13, int i14, C13045h2 c13045h2, boolean z4, int i15) {
        i13 = (i15 & 2) != 0 ? 2 : i13;
        i14 = (i15 & 4) != 0 ? 1 : i14;
        c13045h2 = (i15 & 8) != 0 ? AbstractC13091v.m36593c(null) : c13045h2;
        z4 = (i15 & 16) != 0 ? false : z4;
        boolean z13 = (i15 & 32) != 0;
        this.f57642w = c41210b;
        this.f57643x = i13;
        this.f57644y = i14;
        this.f57645z = c13045h2;
        this.f57639E = z4;
        this.f57640F = z13;
        this.f57641G = AbstractC13091v.m36593c(Boolean.FALSE);
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: a */
    public final InterfaceC13037f2 mo1715a() {
        return this.f57645z;
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
        return this.f57642w;
    }

    @Override // g40.InterfaceC15386l3
    public final EnumC39181m getLayoutDirection() {
        return null;
    }

    @Override // g40.InterfaceC15386l3
    public final C13045h2 getLoading() {
        return this.f57641G;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: h */
    public final int mo1719h() {
        return this.f57643x;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: j */
    public final String mo1720j(String userTyped) {
        AbstractC22676k.m65750j(userTyped, "userTyped");
        if (AbstractC25260n.m74059b1(new C29880n[]{new C29880n(3), new C29880n(8)}).contains(new C29880n(this.f57644y))) {
            StringBuilder sb4 = new StringBuilder();
            int length = userTyped.length();
            for (int i13 = 0; i13 < length; i13++) {
                char cCharAt = userTyped.charAt(i13);
                if (Character.isDigit(cCharAt)) {
                    sb4.append(cCharAt);
                }
            }
            userTyped = sb4.toString();
        }
        return !this.f57640F ? AbstractC15325b1.f57583a.m125852f(userTyped, "") : userTyped;
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15421s3 mo1721k(String input) {
        AbstractC22676k.m65750j(input, "input");
        return new C15410q2(this, input, 1);
    }

    @Override // g40.InterfaceC15386l3
    /* JADX INFO: renamed from: l */
    public final boolean mo1722l() {
        return this.f57639E;
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
        return this.f57644y;
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
