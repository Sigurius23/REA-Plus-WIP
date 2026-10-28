package p128ew;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import l83.C23470p;
import ne3.AbstractC26604b;
import ne3.C26615g0;
import ne3.C26617h0;
import p021av.C2088b;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: ew.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C13717d {

    /* JADX INFO: renamed from: a */
    public final ArrayList f48692a;

    /* JADX INFO: renamed from: b */
    public final String f48693b;

    /* JADX INFO: renamed from: c */
    public final C23470p f48694c;

    public C13717d(ArrayList arrayList) {
        String strM31995n = AbstractC11895b.m31995n("randomUUID().toString()");
        this.f48692a = arrayList;
        this.f48693b = strM31995n;
        this.f48694c = AbstractC30060g.m92088H(new C2088b(this, 13));
    }

    /* JADX INFO: renamed from: a */
    public final void m38859a(OutputStream outputStream) {
        C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(AbstractC26604b.m79164i(outputStream));
        Iterator it = this.f48692a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = this.f48693b;
            if (!zHasNext) {
                c26617h0M79157b.mo79193S("--");
                c26617h0M79157b.mo79193S(str);
                c26617h0M79157b.mo79193S("--");
                c26617h0M79157b.mo79193S("\r\n");
                c26617h0M79157b.flush();
                return;
            }
            C13718e c13718e = (C13718e) it.next();
            c26617h0M79157b.mo79193S("--");
            c26617h0M79157b.mo79193S(str);
            c26617h0M79157b.mo79193S("\r\n");
            byte[] bArr = c13718e.f48695a.f48684a;
            c26617h0M79157b.mo79193S("Content-Length: ");
            c26617h0M79157b.mo79209h0(bArr.length);
            c26617h0M79157b.mo79193S("\r\n");
            c26617h0M79157b.mo79193S("\r\n");
            c26617h0M79157b.flush();
            C26617h0 c26617h0M79157b2 = AbstractC26604b.m79157b(AbstractC26604b.m79164i(new C26615g0(c26617h0M79157b)));
            c26617h0M79157b2.write(bArr);
            c26617h0M79157b2.flush();
            c26617h0M79157b.mo79193S("\r\n");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13717d)) {
            return false;
        }
        C13717d c13717d = (C13717d) obj;
        return AbstractC22676k.m65745e(this.f48692a, c13717d.f48692a) && AbstractC22676k.m65745e(this.f48693b, c13717d.f48693b);
    }

    public final int hashCode() {
        return this.f48693b.hashCode() + (this.f48692a.hashCode() * 31);
    }

    public final String toString() {
        return "MixedMultipartBody(parts=" + this.f48692a + ", boundary=" + this.f48693b + ")";
    }
}
