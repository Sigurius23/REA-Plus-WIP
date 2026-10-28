package uk;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: uk.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C35045d {

    /* JADX INFO: renamed from: b */
    public ByteBuffer f148514b;

    /* JADX INFO: renamed from: c */
    public C35044c f148515c;

    /* JADX INFO: renamed from: a */
    public final byte[] f148513a = new byte[256];

    /* JADX INFO: renamed from: d */
    public int f148516d = 0;

    /* JADX INFO: renamed from: a */
    public final void m110768a() {
        this.f148514b = null;
        this.f148515c = null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m110769b() {
        return this.f148515c.f148503b != 0;
    }

    /* JADX INFO: renamed from: c */
    public final C35044c m110770c() {
        byte[] bArr;
        if (this.f148514b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m110769b()) {
            return this.f148515c;
        }
        StringBuilder sb4 = new StringBuilder();
        for (int i13 = 0; i13 < 6; i13++) {
            sb4.append((char) m110771d());
        }
        if (sb4.toString().startsWith("GIF")) {
            this.f148515c.f148507f = this.f148514b.getShort();
            this.f148515c.f148508g = this.f148514b.getShort();
            int iM110771d = m110771d();
            C35044c c35044c = this.f148515c;
            c35044c.f148509h = (iM110771d & 128) != 0;
            c35044c.f148510i = (int) Math.pow(2.0d, (iM110771d & 7) + 1);
            this.f148515c.f148511j = m110771d();
            C35044c c35044c2 = this.f148515c;
            m110771d();
            c35044c2.getClass();
            if (this.f148515c.f148509h && !m110769b()) {
                C35044c c35044c3 = this.f148515c;
                c35044c3.f148502a = m110773f(c35044c3.f148510i);
                C35044c c35044c4 = this.f148515c;
                c35044c4.f148512k = c35044c4.f148502a[c35044c4.f148511j];
            }
        } else {
            this.f148515c.f148503b = 1;
        }
        if (!m110769b()) {
            boolean z4 = false;
            while (!z4 && !m110769b() && this.f148515c.f148504c <= Integer.MAX_VALUE) {
                int iM110771d2 = m110771d();
                if (iM110771d2 == 33) {
                    int iM110771d3 = m110771d();
                    if (iM110771d3 == 1) {
                        m110775h();
                    } else if (iM110771d3 == 249) {
                        this.f148515c.f148505d = new C35043b();
                        m110771d();
                        int iM110771d4 = m110771d();
                        C35043b c35043b = this.f148515c.f148505d;
                        int i14 = (iM110771d4 & 28) >> 2;
                        c35043b.f148497g = i14;
                        if (i14 == 0) {
                            c35043b.f148497g = 1;
                        }
                        c35043b.f148496f = (iM110771d4 & 1) != 0;
                        short s13 = this.f148514b.getShort();
                        if (s13 < 2) {
                            s13 = 10;
                        }
                        C35043b c35043b2 = this.f148515c.f148505d;
                        c35043b2.f148499i = s13 * 10;
                        c35043b2.f148498h = m110771d();
                        m110771d();
                    } else if (iM110771d3 == 254) {
                        m110775h();
                    } else if (iM110771d3 != 255) {
                        m110775h();
                    } else {
                        m110772e();
                        StringBuilder sb5 = new StringBuilder();
                        int i15 = 0;
                        while (true) {
                            bArr = this.f148513a;
                            if (i15 >= 11) {
                                break;
                            }
                            sb5.append((char) bArr[i15]);
                            i15++;
                        }
                        if (sb5.toString().equals("NETSCAPE2.0")) {
                            do {
                                m110772e();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b6 = bArr[2];
                                    this.f148515c.getClass();
                                }
                                if (this.f148516d <= 0) {
                                    break;
                                }
                            } while (!m110769b());
                        } else {
                            m110775h();
                        }
                    }
                } else if (iM110771d2 == 44) {
                    C35044c c35044c5 = this.f148515c;
                    if (c35044c5.f148505d == null) {
                        c35044c5.f148505d = new C35043b();
                    }
                    c35044c5.f148505d.f148491a = this.f148514b.getShort();
                    this.f148515c.f148505d.f148492b = this.f148514b.getShort();
                    this.f148515c.f148505d.f148493c = this.f148514b.getShort();
                    this.f148515c.f148505d.f148494d = this.f148514b.getShort();
                    int iM110771d5 = m110771d();
                    boolean z13 = (iM110771d5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM110771d5 & 7) + 1);
                    C35043b c35043b3 = this.f148515c.f148505d;
                    c35043b3.f148495e = (iM110771d5 & 64) != 0;
                    if (z13) {
                        c35043b3.f148501k = m110773f(iPow);
                    } else {
                        c35043b3.f148501k = null;
                    }
                    this.f148515c.f148505d.f148500j = this.f148514b.position();
                    m110771d();
                    m110775h();
                    if (!m110769b()) {
                        C35044c c35044c6 = this.f148515c;
                        c35044c6.f148504c++;
                        c35044c6.f148506e.add(c35044c6.f148505d);
                    }
                } else if (iM110771d2 != 59) {
                    this.f148515c.f148503b = 1;
                } else {
                    z4 = true;
                }
            }
            C35044c c35044c7 = this.f148515c;
            if (c35044c7.f148504c < 0) {
                c35044c7.f148503b = 1;
            }
        }
        return this.f148515c;
    }

    /* JADX INFO: renamed from: d */
    public final int m110771d() {
        try {
            return this.f148514b.get() & 255;
        } catch (Exception unused) {
            this.f148515c.f148503b = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m110772e() {
        int iM110771d = m110771d();
        this.f148516d = iM110771d;
        if (iM110771d <= 0) {
            return;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            try {
                int i15 = this.f148516d;
                if (i13 >= i15) {
                    return;
                }
                i14 = i15 - i13;
                this.f148514b.get(this.f148513a, i13, i14);
                i13 += i14;
            } catch (Exception e5) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "Error Reading Block n: ", " count: ", " blockSize: ");
                    sbM30465s.append(this.f148516d);
                    Log.d("GifHeaderParser", sbM30465s.toString(), e5);
                }
                this.f148515c.f148503b = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final int[] m110773f(int i13) {
        byte[] bArr = new byte[i13 * 3];
        int[] iArr = null;
        try {
            this.f148514b.get(bArr);
            iArr = new int[256];
            int i14 = 0;
            int i15 = 0;
            while (i14 < i13) {
                int i16 = bArr[i15] & 255;
                int i17 = i15 + 2;
                int i18 = bArr[i15 + 1] & 255;
                i15 += 3;
                int i19 = i14 + 1;
                iArr[i14] = (i18 << 8) | (i16 << 16) | (-16777216) | (bArr[i17] & 255);
                i14 = i19;
            }
            return iArr;
        } catch (BufferUnderflowException e5) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e5);
            }
            this.f148515c.f148503b = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m110774g(ByteBuffer byteBuffer) {
        this.f148514b = null;
        Arrays.fill(this.f148513a, (byte) 0);
        this.f148515c = new C35044c();
        this.f148516d = 0;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f148514b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f148514b.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX INFO: renamed from: h */
    public final void m110775h() {
        int iM110771d;
        do {
            iM110771d = m110771d();
            this.f148514b.position(Math.min(this.f148514b.position() + iM110771d, this.f148514b.limit()));
        } while (iM110771d > 0);
    }
}
