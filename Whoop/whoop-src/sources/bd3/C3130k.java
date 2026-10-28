package bd3;

import android.os.Handler;
import android.os.Looper;
import androidx.room.C1832u;
import cg.C4566u;
import cg.C4567v;
import hg3.AbstractC17269i;
import java.util.ArrayList;
import java.util.Iterator;
import p684zk.C40777c0;
import p684zk.InterfaceC40801z;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import tg.C33775g;
import tg.InterfaceC33773e;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: bd3.k */
/* JADX INFO: loaded from: classes5.dex */
public class C3130k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12275a;

    /* JADX INFO: renamed from: b */
    public boolean f12276b;

    /* JADX INFO: renamed from: c */
    public final Object f12277c;

    public C3130k() {
        this.f12275a = 4;
        this.f12277c = new Handler(Looper.getMainLooper(), new C40777c0());
    }

    /* JADX INFO: renamed from: a */
    public void mo8990a() {
        this.f12276b = true;
    }

    /* JADX INFO: renamed from: b */
    public void mo8991b() {
        this.f12276b = false;
    }

    /* JADX INFO: renamed from: c */
    public void mo8992c() {
        this.f12276b = false;
    }

    /* JADX INFO: renamed from: d */
    public void m8993d(String str, Function1 function1) {
        ArrayList arrayList = (ArrayList) this.f12277c;
        arrayList.clear();
        if (AbstractC22676k.m65745e(str, "")) {
            this.f12276b = false;
            return;
        }
        if (AbstractC22676k.m65745e(str, "/")) {
            this.f12276b = true;
            return;
        }
        String strM125898q0 = AbstractC39414r.m125898q0(str, "/");
        boolean zM125881Z = AbstractC39414r.m125881Z(strM125898q0, '/');
        this.f12276b = zM125881Z;
        if (zM125881Z) {
            strM125898q0 = AbstractC39414r.m125900s0(strM125898q0, "/");
        }
        Iterator it = AbstractC39414r.m125905x0(strM125898q0, new char[]{'/'}, 0, 6).iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m8994e(String encoded) {
        AbstractC22676k.m65750j(encoded, "encoded");
        m8993d(encoded, new C1832u(1, C33775g.f141359i, InterfaceC33773e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 8));
    }

    /* JADX INFO: renamed from: f */
    public void mo8995f(byte b) {
        ((C3143v) this.f12277c).m9047p(String.valueOf(b));
    }

    /* JADX INFO: renamed from: g */
    public void m8996g(char c3) {
        C3143v c3143v = (C3143v) this.f12277c;
        c3143v.m9037f(c3143v.f12310x, 1);
        char[] cArr = (char[]) c3143v.f12311y;
        int i13 = c3143v.f12310x;
        c3143v.f12310x = i13 + 1;
        cArr[i13] = c3;
    }

    /* JADX INFO: renamed from: h */
    public void mo8997h(int i13) {
        ((C3143v) this.f12277c).m9047p(String.valueOf(i13));
    }

    /* JADX INFO: renamed from: i */
    public void mo8998i(long j7) {
        ((C3143v) this.f12277c).m9047p(String.valueOf(j7));
    }

    /* JADX INFO: renamed from: j */
    public void m8999j(String v13) {
        AbstractC22676k.m65750j(v13, "v");
        ((C3143v) this.f12277c).m9047p(v13);
    }

    /* JADX INFO: renamed from: k */
    public void mo9000k(short s13) {
        ((C3143v) this.f12277c).m9047p(String.valueOf(s13));
    }

    /* JADX INFO: renamed from: l */
    public void mo9001l(String value) {
        byte b;
        AbstractC22676k.m65750j(value, "value");
        C3143v c3143v = (C3143v) this.f12277c;
        c3143v.m9037f(c3143v.f12310x, value.length() + 2);
        char[] cArr = (char[]) c3143v.f12311y;
        int i13 = c3143v.f12310x;
        int i14 = i13 + 1;
        cArr[i13] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i14);
        int i15 = length + i14;
        int i16 = i14;
        while (i16 < i15) {
            char c3 = cArr[i16];
            byte[] bArr = AbstractC3129j0.f12274b;
            if (c3 < bArr.length && bArr[c3] != 0) {
                int length2 = value.length();
                for (int i17 = i16 - i14; i17 < length2; i17++) {
                    c3143v.m9037f(i16, 2);
                    char cCharAt = value.charAt(i17);
                    byte[] bArr2 = AbstractC3129j0.f12274b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i18 = i16 + 1;
                        ((char[]) c3143v.f12311y)[i16] = cCharAt;
                        i16 = i18;
                    } else if (b == 1) {
                        String str = AbstractC3129j0.f12273a[cCharAt];
                        AbstractC22676k.m65747g(str);
                        c3143v.m9037f(i16, str.length());
                        str.getChars(0, str.length(), (char[]) c3143v.f12311y, i16);
                        int length3 = str.length() + i16;
                        c3143v.f12310x = length3;
                        i16 = length3;
                    } else {
                        char[] cArr2 = (char[]) c3143v.f12311y;
                        cArr2[i16] = '\\';
                        cArr2[i16 + 1] = (char) b;
                        i16 += 2;
                        c3143v.f12310x = i16;
                    }
                }
                c3143v.m9037f(i16, 1);
                ((char[]) c3143v.f12311y)[i16] = '\"';
                c3143v.f12310x = i16 + 1;
                return;
            }
            i16++;
        }
        cArr[i15] = '\"';
        c3143v.f12310x = i15 + 1;
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m9002m(InterfaceC40801z interfaceC40801z, boolean z4) {
        try {
            if (this.f12276b || z4) {
                ((Handler) this.f12277c).obtainMessage(1, interfaceC40801z).sendToTarget();
            } else {
                this.f12276b = true;
                interfaceC40801z.mo44996a();
                this.f12276b = false;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo9003n() {
    }

    /* JADX INFO: renamed from: o */
    public void mo9004o() {
    }

    public String toString() {
        switch (this.f12275a) {
            case 3:
                return this.f12276b ? "FALL_THROUGH" : String.valueOf(this.f12277c);
            default:
                return super.toString();
        }
    }

    public C3130k(C3143v c3143v) {
        this.f12275a = 0;
        this.f12277c = c3143v;
        this.f12276b = true;
    }

    public C3130k(boolean z4, String[] strArr) {
        this.f12275a = 2;
        this.f12276b = z4;
        this.f12277c = strArr;
    }

    public C3130k(int i13) {
        this.f12275a = 1;
        ArrayList arrayList = new ArrayList();
        this.f12277c = arrayList;
        C4566u c4566u = C4566u.f18382w;
        C33775g c33775g = C33775g.f141359i;
        AbstractC17269i.m48914s(arrayList, c4566u, new C1832u(1, c33775g, InterfaceC33773e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 6));
        AbstractC17269i.m48914s(arrayList, C4567v.f18383w, new C1832u(1, c33775g, InterfaceC33773e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 7));
        this.f12276b = false;
    }

    public C3130k(Object obj, boolean z4) {
        this.f12275a = 3;
        this.f12277c = obj;
        this.f12276b = z4;
    }
}
