package b30;

import com.stripe.android.uicore.elements.IdentifierSpec;
import g40.C15372j0;
import g40.C15426t3;
import g40.InterfaceC15421s3;
import l40.C23328a;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p470rv.AbstractC31834n;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: b30.k1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2556k1 {

    /* JADX INFO: renamed from: a */
    public final String f9928a;

    /* JADX INFO: renamed from: b */
    public final boolean f9929b;

    /* JADX INFO: renamed from: c */
    public final boolean f9930c;

    /* JADX INFO: renamed from: d */
    public final C15372j0 f9931d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC15421s3 f9932e;

    /* JADX INFO: renamed from: f */
    public final Object f9933f;

    public C2556k1(String text, boolean z4, boolean z13, C15372j0 c15372j0) {
        AbstractC22676k.m65750j(text, "text");
        this.f9928a = text;
        this.f9929b = z4;
        this.f9930c = z13;
        this.f9931d = c15372j0;
        InterfaceC15421s3 interfaceC15421s3Mo1721k = text.equals("•• / ••") ? C15426t3.f57978b : c15372j0.mo1721k(text);
        this.f9932e = interfaceC15421s3Mo1721k;
        this.f9933f = interfaceC15421s3Mo1721k.isValid() ? AbstractC31834n.m98901j(new C23328a(text, false)) : null;
    }

    /* JADX INFO: renamed from: a */
    public static C2556k1 m7469a(C2556k1 c2556k1, String text, int i13) {
        if ((i13 & 1) != 0) {
            text = c2556k1.f9928a;
        }
        boolean z4 = c2556k1.f9929b;
        boolean z13 = (i13 & 4) != 0 ? c2556k1.f9930c : true;
        C15372j0 c15372j0 = c2556k1.f9931d;
        AbstractC22676k.m65750j(text, "text");
        return new C2556k1(text, z4, z13, c15372j0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final Integer m7470b() {
        String str;
        Integer numM125932Q;
        int iIntValue;
        ?? r10 = this.f9933f;
        if (r10 != 0) {
            IdentifierSpec.Companion.getClass();
            C23328a c23328a = (C23328a) r10.get(IdentifierSpec.CardExpMonth);
            if (c23328a != null && (str = c23328a.f92491a) != null && (numM125932Q = AbstractC39421y.m125932Q(str)) != null && 1 <= (iIntValue = numM125932Q.intValue()) && iIntValue <= 12) {
                return numM125932Q;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public final Integer m7471c() {
        String str;
        Integer numM125932Q;
        int iIntValue;
        ?? r10 = this.f9933f;
        if (r10 != 0) {
            IdentifierSpec.Companion.getClass();
            C23328a c23328a = (C23328a) r10.get(IdentifierSpec.CardExpYear);
            if (c23328a != null && (str = c23328a.f92491a) != null && (numM125932Q = AbstractC39421y.m125932Q(str)) != null && 2000 <= (iIntValue = numM125932Q.intValue()) && iIntValue <= 2100) {
                return numM125932Q;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2556k1)) {
            return false;
        }
        C2556k1 c2556k1 = (C2556k1) obj;
        return AbstractC22676k.m65745e(this.f9928a, c2556k1.f9928a) && this.f9929b == c2556k1.f9929b && this.f9930c == c2556k1.f9930c && AbstractC22676k.m65745e(this.f9931d, c2556k1.f9931d);
    }

    public final int hashCode() {
        return this.f9931d.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.f9928a.hashCode() * 31, 31, this.f9929b), 31, this.f9930c);
    }

    public final String toString() {
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ExpiryDateState(text=", this.f9928a, ", enabled=", ", validating=", this.f9929b);
        sbM73379l.append(this.f9930c);
        sbM73379l.append(", dateConfig=");
        sbM73379l.append(this.f9931d);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
