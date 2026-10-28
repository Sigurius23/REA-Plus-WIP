package p185h6;

import java.nio.ByteBuffer;
import p212i6.C18148a;
import p212i6.C18149b;
import p692zt.C41113q;

/* JADX INFO: renamed from: h6.x */
/* JADX INFO: loaded from: classes.dex */
public final class C16969x {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f65123d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f65124a;

    /* JADX INFO: renamed from: b */
    public final C41113q f65125b;

    /* JADX INFO: renamed from: c */
    public volatile int f65126c = 0;

    public C16969x(C41113q c41113q, int i13) {
        this.f65125b = c41113q;
        this.f65124a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m47731a(int i13) {
        C18148a c18148aM47732b = m47732b();
        int iM52082a = c18148aM47732b.m52082a(16);
        if (iM52082a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c18148aM47732b.f70446z;
        int i14 = iM52082a + c18148aM47732b.f70443w;
        return byteBuffer.getInt((i13 * 4) + byteBuffer.getInt(i14) + i14 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final C18148a m47732b() {
        ThreadLocal threadLocal = f65123d;
        C18148a c18148a = (C18148a) threadLocal.get();
        if (c18148a == null) {
            c18148a = new C18148a();
            threadLocal.set(c18148a);
        }
        C18149b c18149b = (C18149b) this.f65125b.f177224x;
        int iM52082a = c18149b.m52082a(6);
        if (iM52082a != 0) {
            int i13 = iM52082a + c18149b.f70443w;
            int i14 = (this.f65124a * 4) + ((ByteBuffer) c18149b.f70446z).getInt(i13) + i13 + 4;
            int i15 = ((ByteBuffer) c18149b.f70446z).getInt(i14) + i14;
            ByteBuffer byteBuffer = (ByteBuffer) c18149b.f70446z;
            c18148a.f70446z = byteBuffer;
            if (byteBuffer != null) {
                c18148a.f70443w = i15;
                int i16 = i15 - byteBuffer.getInt(i15);
                c18148a.f70444x = i16;
                c18148a.f70445y = ((ByteBuffer) c18148a.f70446z).getShort(i16);
                return c18148a;
            }
            c18148a.f70443w = 0;
            c18148a.f70444x = 0;
            c18148a.f70445y = 0;
        }
        return c18148a;
    }

    public final String toString() {
        int i13;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.toString());
        sb4.append(", id:");
        C18148a c18148aM47732b = m47732b();
        int iM52082a = c18148aM47732b.m52082a(4);
        sb4.append(Integer.toHexString(iM52082a != 0 ? ((ByteBuffer) c18148aM47732b.f70446z).getInt(iM52082a + c18148aM47732b.f70443w) : 0));
        sb4.append(", codepoints:");
        C18148a c18148aM47732b2 = m47732b();
        int iM52082a2 = c18148aM47732b2.m52082a(16);
        if (iM52082a2 != 0) {
            int i14 = iM52082a2 + c18148aM47732b2.f70443w;
            i13 = ((ByteBuffer) c18148aM47732b2.f70446z).getInt(((ByteBuffer) c18148aM47732b2.f70446z).getInt(i14) + i14);
        } else {
            i13 = 0;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            sb4.append(Integer.toHexString(m47731a(i15)));
            sb4.append(" ");
        }
        return sb4.toString();
    }
}
