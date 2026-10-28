package y00;

import l83.C23467m;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.d2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38806d2 extends AbstractC38833g {

    /* JADX INFO: renamed from: f */
    public static final C38806d2 f166997f = new C38806d2("", "");

    /* JADX INFO: renamed from: a */
    public final String f166998a;

    /* JADX INFO: renamed from: b */
    public final String f166999b;

    /* JADX INFO: renamed from: c */
    public final boolean f167000c;

    /* JADX INFO: renamed from: d */
    public final boolean f167001d;

    /* JADX INFO: renamed from: e */
    public final boolean f167002e;

    public C38806d2(String str, String str2) {
        Object objM107888l;
        this.f166998a = str;
        this.f166999b = str2;
        boolean z4 = false;
        try {
            int i13 = Integer.parseInt(str);
            objM107888l = Boolean.valueOf(1 <= i13 && i13 < 13);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        this.f167000c = ((Boolean) (objM107888l instanceof C23467m ? Boolean.FALSE : objM107888l)).booleanValue();
        boolean z13 = this.f166999b.length() + this.f166998a.length() == 4;
        this.f167001d = z13;
        if (!z13) {
            if (this.f166999b.length() + this.f166998a.length() > 0) {
                z4 = true;
            }
        }
        this.f167002e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38806d2)) {
            return false;
        }
        C38806d2 c38806d2 = (C38806d2) obj;
        return AbstractC22676k.m65745e(this.f166998a, c38806d2.f166998a) && AbstractC22676k.m65745e(this.f166999b, c38806d2.f166999b);
    }

    public final int hashCode() {
        return this.f166999b.hashCode() + (this.f166998a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("Unvalidated(month=", this.f166998a, ", year=", this.f166999b, ")");
    }
}
