package com.google.android.material.datepicker;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ed3.C13117a;
import io.sentry.android.core.internal.threaddump.C20096a;
import io.sentry.internal.debugmeta.C20378c;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import na.InterfaceC26489b;
import p094dn.C12182b;
import p094dn.InterfaceC12184d;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p284ko.C22637u;
import p284ko.InterfaceC22626k;
import p284ko.InterfaceC22628l;
import p309lo.AbstractC24567y;
import p390p1.AbstractC28659r;
import p390p1.InterfaceC28599c;
import p412q3.InterfaceC29884r;
import p465rm.C31521c0;
import p510u0.AbstractC34361u1;
import p516u8.C34610p;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p641y8.C39309d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.google.android.material.datepicker.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C5020n implements InterfaceC16915u, InterfaceC12184d, InterfaceC22626k, InterfaceC26489b, InterfaceC28599c, InterfaceC29884r {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f20930w;

    /* JADX INFO: renamed from: x */
    public final int f20931x;

    /* JADX INFO: renamed from: y */
    public int f20932y;

    /* JADX INFO: renamed from: z */
    public final Object f20933z;

    public C5020n(int i13, int i14) {
        this.f20930w = 4;
        this.f20933z = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i14, i13);
        this.f20931x = i13;
        this.f20932y = i14;
    }

    /* JADX INFO: renamed from: u */
    public static C5020n m15738u(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return new C5020n(arrayList);
            }
            C20096a c20096a = new C20096a();
            c20096a.f75483a = line;
            arrayList.add(c20096a);
        }
    }

    @Override // p094dn.InterfaceC12184d, na.InterfaceC26489b
    /* JADX INFO: renamed from: a */
    public int mo15739a() {
        switch (this.f20930w) {
            case 1:
                int i13 = this.f20931x;
                return i13 == -1 ? ((C13117a) this.f20933z).m36680B() : i13;
            default:
                int i14 = this.f20931x;
                return i14 == -1 ? ((C38059n) this.f20933z).m121871x() : i14;
        }
    }

    @Override // p094dn.InterfaceC12184d, na.InterfaceC26489b
    /* JADX INFO: renamed from: b */
    public int mo15740b() {
        switch (this.f20930w) {
            case 1:
                break;
        }
        return this.f20931x;
    }

    @Override // p094dn.InterfaceC12184d, na.InterfaceC26489b
    /* JADX INFO: renamed from: c */
    public int mo15741c() {
        switch (this.f20930w) {
            case 1:
                break;
        }
        return this.f20932y;
    }

    @Override // p284ko.InterfaceC22626k
    public InterfaceC22628l createDataSource() {
        return new C22637u(this.f20931x, this.f20932y, (C20378c) this.f20933z);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: d */
    public void mo699d(Object obj, InterfaceC4351m interfaceC4351m) {
        ((InterfaceC28599c) this.f20933z).mo699d(obj, interfaceC4351m);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: e */
    public void mo700e(int i13, int i14, int i15) {
        int i16 = this.f20932y == 0 ? this.f20931x : 0;
        ((InterfaceC28599c) this.f20933z).mo700e(i13 + i16, i14 + i16, i15);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: f */
    public void mo701f(int i13, int i14) {
        ((InterfaceC28599c) this.f20933z).mo701f(i13 + (this.f20932y == 0 ? this.f20931x : 0), i14);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: g */
    public void mo702g(int i13, Object obj) {
        ((InterfaceC28599c) this.f20933z).mo702g(i13 + (this.f20932y == 0 ? this.f20931x : 0), obj);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: i */
    public Object mo703i() {
        return ((InterfaceC28599c) this.f20933z).mo703i();
    }

    /* JADX INFO: renamed from: j */
    public byte m15742j(int i13, int i14) {
        return ((byte[][]) this.f20933z)[i14][i13];
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: k */
    public void mo705k(int i13, Object obj) {
        ((InterfaceC28599c) this.f20933z).mo705k(i13 + (this.f20932y == 0 ? this.f20931x : 0), obj);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: l */
    public void mo706l(Object obj) {
        this.f20932y++;
        ((InterfaceC28599c) this.f20933z).mo706l(obj);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: m */
    public void mo707m() {
        ((InterfaceC28599c) this.f20933z).mo707m();
    }

    @Override // p412q3.InterfaceC29884r
    /* JADX INFO: renamed from: n */
    public int mo15743n(int i13) {
        int iMo15743n = ((InterfaceC29884r) this.f20933z).mo15743n(i13);
        if (i13 >= 0 && i13 <= this.f20932y) {
            AbstractC34361u1.m108669c(iMo15743n, this.f20931x, i13);
        }
        return iMo15743n;
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        View view2 = (View) this.f20933z;
        int i13 = c16905q1.f64864a.mo47530g(7).f151450b;
        int i14 = this.f20931x;
        if (i14 >= 0) {
            view2.getLayoutParams().height = i14 + i13;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f20932y + i13, view2.getPaddingRight(), view2.getPaddingBottom());
        return c16905q1;
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: p */
    public void mo710p() {
        if (!(this.f20932y > 0)) {
            AbstractC28659r.m87192c("OffsetApplier up called with no corresponding down");
        }
        this.f20932y--;
        ((InterfaceC28599c) this.f20933z).mo710p();
    }

    /* JADX INFO: renamed from: q */
    public int m15744q() {
        return this.f20932y;
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC4339a m15745r() {
        return (InterfaceC4339a) this.f20933z;
    }

    /* JADX INFO: renamed from: s */
    public int m15746s() {
        return this.f20931x;
    }

    /* JADX INFO: renamed from: t */
    public C20096a m15747t() {
        int i13 = this.f20932y;
        if (i13 < 0 || i13 >= this.f20931x) {
            return null;
        }
        ArrayList arrayList = (ArrayList) this.f20933z;
        this.f20932y = i13 + 1;
        return (C20096a) arrayList.get(i13);
    }

    public String toString() {
        switch (this.f20930w) {
            case 4:
                int i13 = this.f20931x;
                int i14 = this.f20932y;
                StringBuilder sb4 = new StringBuilder((i13 * 2 * i14) + 2);
                for (int i15 = 0; i15 < i14; i15++) {
                    byte[] bArr = ((byte[][]) this.f20933z)[i15];
                    for (int i16 = 0; i16 < i13; i16++) {
                        byte b = bArr[i16];
                        if (b == 0) {
                            sb4.append(" 0");
                        } else if (b != 1) {
                            sb4.append("  ");
                        } else {
                            sb4.append(" 1");
                        }
                    }
                    sb4.append('\n');
                }
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m15748v(int i13, int i14, int i15) {
        ((byte[][]) this.f20933z)[i14][i13] = (byte) i15;
    }

    @Override // p412q3.InterfaceC29884r
    /* JADX INFO: renamed from: x */
    public int mo15749x(int i13) {
        int iMo15749x = ((InterfaceC29884r) this.f20933z).mo15749x(i13);
        if (i13 >= 0 && i13 <= this.f20931x) {
            AbstractC34361u1.m108668b(iMo15749x, this.f20932y, i13);
        }
        return iMo15749x;
    }

    public C5020n(Bitmap bitmap, int i13, int i14) {
        this.f20930w = 3;
        AbstractC22676k.m65750j(bitmap, "bitmap");
        this.f20933z = bitmap;
        this.f20931x = i13;
        this.f20932y = i14;
    }

    public C5020n(ArrayList arrayList) {
        this.f20930w = 2;
        this.f20933z = arrayList;
        this.f20931x = arrayList.size();
    }

    public C5020n() {
        this.f20930w = 5;
        this.f20933z = new C20378c(23, (byte) 0);
        this.f20931x = 8000;
        this.f20932y = 8000;
    }

    public C5020n(InterfaceC29884r interfaceC29884r, int i13, int i14) {
        this.f20930w = 9;
        this.f20933z = interfaceC29884r;
        this.f20931x = i13;
        this.f20932y = i14;
    }

    public C5020n(InterfaceC28599c interfaceC28599c, int i13) {
        this.f20930w = 7;
        this.f20933z = interfaceC28599c;
        this.f20931x = i13;
    }

    public C5020n(int i13, int i14, InterfaceC4339a interfaceC4339a) {
        this.f20930w = 8;
        this.f20931x = i13;
        this.f20932y = i14;
        this.f20933z = interfaceC4339a;
    }

    public C5020n(View view, int i13, int i14) {
        this.f20930w = 0;
        this.f20931x = i13;
        this.f20933z = view;
        this.f20932y = i14;
    }

    public C5020n(C12182b c12182b, C31521c0 c31521c0) {
        this.f20930w = 1;
        C13117a c13117a = c12182b.f40610y;
        this.f20933z = c13117a;
        c13117a.m36689K(12);
        int iM36680B = c13117a.m36680B();
        if ("audio/raw".equals(c31521c0.f130077L)) {
            int iM71687r = AbstractC24567y.m71687r(c31521c0.f130092a0, c31521c0.f130090Y);
            if (iM36680B == 0 || iM36680B % iM71687r != 0) {
                StringBuilder sb4 = new StringBuilder(88);
                sb4.append("Audio sample size mismatch. stsd sample size: ");
                sb4.append(iM71687r);
                sb4.append(", stsz sample size: ");
                sb4.append(iM36680B);
                Log.w("AtomParsers", sb4.toString());
                iM36680B = iM71687r;
            }
        }
        this.f20931x = iM36680B == 0 ? -1 : iM36680B;
        this.f20932y = c13117a.m36680B();
    }

    public C5020n(C39309d c39309d, C34610p c34610p) {
        this.f20930w = 6;
        C38059n c38059n = c39309d.f169113y;
        this.f20933z = c38059n;
        c38059n.m121846F(12);
        int iM121871x = c38059n.m121871x();
        if ("audio/raw".equals(c34610p.f145783n)) {
            int iM121925r = AbstractC38065t.m121925r(c34610p.f145761F) * c34610p.f145759D;
            if (iM121871x == 0 || iM121871x % iM121925r != 0) {
                AbstractC38046a.m121826u("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iM121925r + ", stsz sample size: " + iM121871x);
                iM121871x = iM121925r;
            }
        }
        this.f20931x = iM121871x == 0 ? -1 : iM121871x;
        this.f20932y = c38059n.m121871x();
    }
}
