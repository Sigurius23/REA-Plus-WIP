package ud3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p031b9.AbstractC2875y;
import p114eb.C12968k;
import p715kotlin.jvm.internal.AbstractC22676k;
import p83.C28975a;
import wb3.AbstractC37056f;
import wd3.AbstractC37172f;

/* JADX INFO: renamed from: ud3.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C34837r {

    /* JADX INFO: renamed from: e */
    public static final C34837r f146724e;

    /* JADX INFO: renamed from: f */
    public static final C34837r f146725f;

    /* JADX INFO: renamed from: a */
    public final boolean f146726a;

    /* JADX INFO: renamed from: b */
    public final boolean f146727b;

    /* JADX INFO: renamed from: c */
    public final String[] f146728c;

    /* JADX INFO: renamed from: d */
    public final String[] f146729d;

    static {
        C34831o c34831o = C34831o.f146708r;
        C34831o c34831o2 = C34831o.f146709s;
        C34831o c34831o3 = C34831o.f146710t;
        C34831o c34831o4 = C34831o.f146702l;
        C34831o c34831o5 = C34831o.f146704n;
        C34831o c34831o6 = C34831o.f146703m;
        C34831o c34831o7 = C34831o.f146705o;
        C34831o c34831o8 = C34831o.f146707q;
        C34831o c34831o9 = C34831o.f146706p;
        List listM118959K = AbstractC37056f.m118959K(c34831o, c34831o2, c34831o3, c34831o4, c34831o5, c34831o6, c34831o7, c34831o8, c34831o9);
        List listM118959K2 = AbstractC37056f.m118959K(c34831o, c34831o2, c34831o3, c34831o4, c34831o5, c34831o6, c34831o7, c34831o8, c34831o9, C34831o.f146700j, C34831o.f146701k, C34831o.f146698h, C34831o.f146699i, C34831o.f146696f, C34831o.f146697g, C34831o.f146695e);
        C12968k c12968k = new C12968k();
        C34831o[] c34831oArr = (C34831o[]) listM118959K.toArray(new C34831o[0]);
        c12968k.m36455d((C34831o[]) Arrays.copyOf(c34831oArr, c34831oArr.length));
        EnumC34805c1 enumC34805c1 = EnumC34805c1.TLS_1_3;
        EnumC34805c1 enumC34805c2 = EnumC34805c1.TLS_1_2;
        c12968k.m36458g(enumC34805c1, enumC34805c2);
        c12968k.f44790b = true;
        c12968k.m36453b();
        C12968k c12968k2 = new C12968k();
        List list = listM118959K2;
        C34831o[] c34831oArr2 = (C34831o[]) list.toArray(new C34831o[0]);
        c12968k2.m36455d((C34831o[]) Arrays.copyOf(c34831oArr2, c34831oArr2.length));
        c12968k2.m36458g(enumC34805c1, enumC34805c2);
        c12968k2.f44790b = true;
        f146724e = c12968k2.m36453b();
        C12968k c12968k3 = new C12968k();
        C34831o[] c34831oArr3 = (C34831o[]) list.toArray(new C34831o[0]);
        c12968k3.m36455d((C34831o[]) Arrays.copyOf(c34831oArr3, c34831oArr3.length));
        c12968k3.m36458g(enumC34805c1, enumC34805c2, EnumC34805c1.TLS_1_1, EnumC34805c1.TLS_1_0);
        c12968k3.f44790b = true;
        c12968k3.m36453b();
        f146725f = new C34837r(false, false, null, null);
    }

    public C34837r(boolean z4, boolean z13, String[] strArr, String[] strArr2) {
        this.f146726a = z4;
        this.f146727b = z13;
        this.f146728c = strArr;
        this.f146729d = strArr2;
    }

    /* JADX INFO: renamed from: a */
    public final void m109911a(SSLSocket sSLSocket, boolean z4) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        AbstractC22676k.m65747g(enabledCipherSuites);
        String[] strArr = this.f146728c;
        if (strArr != null) {
            enabledCipherSuites = AbstractC37172f.m119127l(strArr, enabledCipherSuites, C34831o.f146693c);
        }
        String[] strArr2 = this.f146729d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC22676k.m65749i(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = AbstractC37172f.m119127l(enabledProtocols2, strArr2, C28975a.f117211w);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC22676k.m65747g(supportedCipherSuites);
        C34829n c34829n = C34831o.f146693c;
        byte[] bArr = AbstractC37172f.f158958a;
        int length = supportedCipherSuites.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                i13 = -1;
                break;
            } else if (c34829n.compare(supportedCipherSuites[i13], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i13++;
            }
        }
        if (z4 && i13 != -1) {
            String str = supportedCipherSuites[i13];
            AbstractC22676k.m65749i(str, "get(...)");
            AbstractC22676k.m65750j(enabledCipherSuites, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C12968k c12968k = new C12968k(this);
        c12968k.m36454c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        c12968k.m36457f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C34837r c34837rM36453b = c12968k.m36453b();
        if (c34837rM36453b.m109913c() != null) {
            sSLSocket.setEnabledProtocols(c34837rM36453b.f146729d);
        }
        if (c34837rM36453b.m109912b() != null) {
            sSLSocket.setEnabledCipherSuites(c34837rM36453b.f146728c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m109912b() {
        String[] strArr = this.f146728c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C34831o.f146692b.m109918c(str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m109913c() {
        String[] strArr = this.f146729d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            EnumC34805c1.f146539x.getClass();
            arrayList.add(C34841t.m109916d(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34837r)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C34837r c34837r = (C34837r) obj;
        boolean z4 = c34837r.f146726a;
        boolean z13 = this.f146726a;
        if (z13 != z4) {
            return false;
        }
        if (z13) {
            return Arrays.equals(this.f146728c, c34837r.f146728c) && Arrays.equals(this.f146729d, c34837r.f146729d) && this.f146727b == c34837r.f146727b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f146726a) {
            return 17;
        }
        String[] strArr = this.f146728c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f146729d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f146727b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f146726a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb4 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb4.append(Objects.toString(m109912b(), "[all enabled]"));
        sb4.append(", tlsVersions=");
        sb4.append(Objects.toString(m109913c(), "[all enabled]"));
        sb4.append(", supportsTlsExtensions=");
        return AbstractC2875y.m8305r(sb4, this.f146727b, ')');
    }
}
