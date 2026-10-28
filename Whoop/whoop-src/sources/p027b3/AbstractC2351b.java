package p027b3;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.MenuItem;
import androidx.glance.appwidget.protobuf.AbstractC1400l;
import b50.RunnableC2736d;
import c93.InterfaceC4339a;
import co.nstant.p050in.cbor.CborException;
import fr.C14692c;
import fr.C14703n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import javax.crypto.AEADBadTagException;
import la.C23548b;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p002a0.C0021f1;
import p085d9.C11787e;
import p108e4.AbstractC12682p;
import p127ev.C13668i;
import p314m.LayoutInflaterFactory2C24829a0;
import p444r.MenuItemC30825s;
import p478s3.AbstractC32098d;
import p581we.C37187g;
import p581we.EnumC37183e;
import p581we.InterfaceC37194j0;
import p604x4.InterfaceMenuItemC37950a;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32410a;
import se.AbstractC32417h;
import tg.AbstractC33774f;
import ug.EnumC34931t;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: b3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2351b implements InterfaceC37194j0 {

    /* JADX INFO: renamed from: b */
    public Object f9291b;

    /* JADX INFO: renamed from: c */
    public Object f9292c;

    public AbstractC2351b(EnumC37183e enumC37183e, InterfaceC4339a interfaceC4339a) {
        this.f9291b = enumC37183e;
        this.f9292c = interfaceC4339a;
        Set setM74059b1 = AbstractC25260n.m74059b1(new EnumC37183e[]{EnumC37183e.SIGV4, EnumC37183e.SIGV4_ASYMMETRIC});
        if (setM74059b1.contains(enumC37183e)) {
            return;
        }
        throw new IllegalStateException(("This class should only be used for " + AbstractC25265s.m74110N0(setM74059b1, null, null, null, null, 63) + ", got " + enumC37183e).toString());
    }

    /* JADX INFO: renamed from: o */
    public static float m7240o(int i13, int i14, int i15) {
        return (i13 - i14) / i15;
    }

    /* JADX INFO: renamed from: x */
    public static byte[] m7241x(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i13 = iRemaining % 16;
        int i14 = (i13 == 0 ? iRemaining : (iRemaining + 16) - i13) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i14 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i14);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    /* JADX INFO: renamed from: A */
    public byte[] m7242A(int i13) {
        InputStream inputStream = (InputStream) this.f9291b;
        try {
            byte[] bArr = new byte[i13];
            int i14 = inputStream.read(bArr);
            if (i14 != i13) {
                if (i14 == -1) {
                    throw new IOException("Unexpected end of stream");
                }
                int i15 = i13 - i14;
                while (i15 > 0) {
                    int i16 = inputStream.read(bArr, i13 - i15, i15);
                    if (i16 == -1) {
                        throw new IOException("Unexpected end of stream");
                    }
                    i15 -= i16;
                }
            }
            return bArr;
        } catch (IOException e5) {
            throw new CborException(e5);
        }
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo7243B();

    /* JADX INFO: renamed from: C */
    public abstract int[] mo7244C(int i13);

    /* JADX INFO: renamed from: D */
    public abstract void mo7245D(C14692c c14692c);

    /* JADX INFO: renamed from: E */
    public abstract void mo7246E();

    /* JADX INFO: renamed from: F */
    public abstract void mo7247F();

    /* JADX INFO: renamed from: G */
    public abstract void mo7248G();

    /* JADX INFO: renamed from: H */
    public void m7249H() {
        m7255h();
        IntentFilter intentFilterMo7256i = mo7256i();
        if (intentFilterMo7256i.countActions() == 0) {
            return;
        }
        if (((C11787e) this.f9291b) == null) {
            this.f9291b = new C11787e(this, 2);
        }
        ((LayoutInflaterFactory2C24829a0) this.f9292c).f97209K.registerReceiver((C11787e) this.f9291b, intentFilterMo7256i);
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo7250I();

    /* JADX INFO: renamed from: J */
    public String m7251J(String canonicalRequest, C37187g c37187g) {
        AbstractC22676k.m65750j(canonicalRequest, "canonicalRequest");
        return ((EnumC37183e) this.f9291b).f158986w + '\n' + c37187g.f159005d.m110113b(EnumC34931t.f147049x) + '\n' + AbstractC32098d.m99842h(c37187g) + '\n' + AbstractC33774f.m106780a(AbstractC32417h.m101180K(AbstractC39421y.m125919D(canonicalRequest), mo7266t()));
    }

    /* JADX INFO: renamed from: K */
    public abstract void mo7252K();

    /* JADX INFO: renamed from: f */
    public abstract void mo7253f();

    /* JADX INFO: renamed from: g */
    public void m7254g() {
        RunnableC2736d runnableC2736d = (RunnableC2736d) this.f9292c;
        if (runnableC2736d != null) {
            ((Handler) this.f9291b).removeCallbacks(runnableC2736d);
            this.f9292c = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m7255h() {
        C11787e c11787e = (C11787e) this.f9291b;
        if (c11787e != null) {
            try {
                ((LayoutInflaterFactory2C24829a0) this.f9292c).f97209K.unregisterReceiver(c11787e);
            } catch (IllegalArgumentException unused) {
            }
            this.f9291b = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract IntentFilter mo7256i();

    /* JADX INFO: renamed from: j */
    public byte[] m7257j(long j7) throws CborException {
        if (j7 > 2147483647L) {
            throw new CborException("Decoding fixed size items is limited to INTMAX");
        }
        int i13 = (int) j7;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.abs(i13));
        if (j7 > 4096) {
            j7 = 4096;
        }
        int i14 = (int) j7;
        byte[] bArr = new byte[i14];
        while (i13 > 0) {
            try {
                int i15 = ((InputStream) this.f9291b).read(bArr, 0, i13 > i14 ? i14 : i13);
                if (i15 == -1) {
                    throw new IOException("Unexpected end of stream");
                }
                byteArrayOutputStream.write(bArr, 0, i15);
                i13 -= i15;
            } catch (IOException e5) {
                throw new CborException(e5);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: k */
    public byte[] m7258k(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((AbstractC1400l) this.f9292c).m4426d(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(AbstractC32410a.m101052v(bArr4, m7241x(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            AbstractC1400l abstractC1400l = (AbstractC1400l) this.f9291b;
            abstractC1400l.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            abstractC1400l.m4432p(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e5) {
            throw new AEADBadTagException(e5.toString());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m7259l(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        AbstractC1400l abstractC1400l = (AbstractC1400l) this.f9291b;
        abstractC1400l.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        abstractC1400l.m4432p(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        ((AbstractC1400l) this.f9292c).m4426d(0, bArr).get(bArr4);
        byte[] bArrM101052v = AbstractC32410a.m101052v(bArr4, m7241x(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrM101052v);
    }

    /* JADX INFO: renamed from: m */
    public void m7260m() {
        Handler handler = (Handler) this.f9291b;
        RunnableC2736d runnableC2736d = (RunnableC2736d) this.f9292c;
        if (runnableC2736d != null) {
            handler.removeCallbacks(runnableC2736d);
        }
        RunnableC2736d runnableC2736d2 = new RunnableC2736d(this);
        this.f9292c = runnableC2736d2;
        handler.post(runnableC2736d2);
    }

    /* JADX INFO: renamed from: n */
    public abstract int[] mo7261n(int i13);

    /* JADX INFO: renamed from: p */
    public long m7262p(int i13) {
        int i14;
        int i15 = i13 & 31;
        switch (i15) {
            case 24:
                i14 = 2;
                break;
            case 25:
                i14 = 3;
                break;
            case 26:
                i14 = 4;
                break;
            case 27:
                i14 = 5;
                break;
            case 28:
            case 29:
            case 30:
                i14 = 6;
                break;
            case 31:
                i14 = 7;
                break;
            default:
                i14 = 1;
                break;
        }
        int iM35485e = AbstractC12682p.m35485e(i14);
        if (iM35485e == 0) {
            return i15;
        }
        if (iM35485e == 1) {
            return m7271z();
        }
        if (iM35485e == 2) {
            byte[] bArrM7242A = m7242A(2);
            return ((long) (bArrM7242A[1] & 255)) | ((long) ((bArrM7242A[0] & 255) << 8));
        }
        if (iM35485e == 3) {
            byte[] bArrM7242A2 = m7242A(4);
            return ((long) (bArrM7242A2[3] & 255)) | (((long) (bArrM7242A2[0] & 255)) << 24) | (((long) (bArrM7242A2[1] & 255)) << 16) | (((long) (bArrM7242A2[2] & 255)) << 8);
        }
        if (iM35485e != 4) {
            if (iM35485e == 6) {
                return -1L;
            }
            throw new CborException("Reserved additional information");
        }
        byte[] bArrM7242A3 = m7242A(8);
        return (((long) (bArrM7242A3[1] & 255)) << 48) | (((long) (bArrM7242A3[0] & 255)) << 56) | (((long) (bArrM7242A3[2] & 255)) << 40) | (((long) (bArrM7242A3[3] & 255)) << 32) | (((long) (bArrM7242A3[4] & 255)) << 24) | (((long) (bArrM7242A3[5] & 255)) << 16) | (((long) (bArrM7242A3[6] & 255)) << 8) | ((long) (bArrM7242A3[7] & 255));
    }

    /* JADX INFO: renamed from: q */
    public BigInteger m7263q(int i13) throws CborException {
        int i14;
        int i15 = i13 & 31;
        switch (i15) {
            case 24:
                i14 = 2;
                break;
            case 25:
                i14 = 3;
                break;
            case 26:
                i14 = 4;
                break;
            case 27:
                i14 = 5;
                break;
            case 28:
            case 29:
            case 30:
                i14 = 6;
                break;
            case 31:
                i14 = 7;
                break;
            default:
                i14 = 1;
                break;
        }
        int iM35485e = AbstractC12682p.m35485e(i14);
        if (iM35485e == 0) {
            return BigInteger.valueOf(i15);
        }
        if (iM35485e == 1) {
            return BigInteger.valueOf(m7271z());
        }
        if (iM35485e == 2) {
            byte[] bArrM7242A = m7242A(2);
            return BigInteger.valueOf(((long) ((bArrM7242A[0] & 255) << 8)) | ((long) (bArrM7242A[1] & 255)));
        }
        if (iM35485e == 3) {
            byte[] bArrM7242A2 = m7242A(4);
            return BigInteger.valueOf((((long) (bArrM7242A2[0] & 255)) << 24) | (((long) (bArrM7242A2[1] & 255)) << 16) | (((long) (bArrM7242A2[2] & 255)) << 8) | ((long) (bArrM7242A2[3] & 255)));
        }
        if (iM35485e != 4) {
            if (iM35485e == 6) {
                return BigInteger.valueOf(-1L);
            }
            throw new CborException("Reserved additional information");
        }
        BigInteger bigInteger = BigInteger.ZERO;
        byte[] bArrM7242A3 = m7242A(8);
        return bigInteger.or(BigInteger.valueOf(bArrM7242A3[0] & 255).shiftLeft(56)).or(BigInteger.valueOf(bArrM7242A3[1] & 255).shiftLeft(48)).or(BigInteger.valueOf(bArrM7242A3[2] & 255).shiftLeft(40)).or(BigInteger.valueOf(bArrM7242A3[3] & 255).shiftLeft(32)).or(BigInteger.valueOf(bArrM7242A3[4] & 255).shiftLeft(24)).or(BigInteger.valueOf(bArrM7242A3[5] & 255).shiftLeft(16)).or(BigInteger.valueOf(bArrM7242A3[6] & 255).shiftLeft(8)).or(BigInteger.valueOf(bArrM7242A3[7] & 255).shiftLeft(0));
    }

    /* JADX INFO: renamed from: r */
    public MenuItem m7264r(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC37950a)) {
            return menuItem;
        }
        InterfaceMenuItemC37950a interfaceMenuItemC37950a = (InterfaceMenuItemC37950a) menuItem;
        if (((C0021f1) this.f9292c) == null) {
            this.f9292c = new C0021f1(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C0021f1) this.f9292c).get(interfaceMenuItemC37950a);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC30825s menuItemC30825s = new MenuItemC30825s((Context) this.f9291b, interfaceMenuItemC37950a);
        ((C0021f1) this.f9292c).put(interfaceMenuItemC37950a, menuItemC30825s);
        return menuItemC30825s;
    }

    /* JADX INFO: renamed from: s */
    public int[] m7265s(int i13, int i14) {
        if (i13 < 0 || i14 < 0 || i13 == i14) {
            return null;
        }
        int[] iArr = (int[]) this.f9292c;
        iArr[0] = i13;
        iArr[1] = i14;
        return iArr;
    }

    /* JADX INFO: renamed from: t */
    public abstract InterfaceC4339a mo7266t();

    /* JADX INFO: renamed from: u */
    public String m7267u() {
        String str = (String) this.f9291b;
        if (str != null) {
            return str;
        }
        AbstractC22676k.m65757q("text");
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public void mo7268v(String str) {
        this.f9291b = str;
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo7269w();

    /* JADX INFO: renamed from: y */
    public abstract AbstractC1400l mo7270y(int i13, byte[] bArr);

    /* JADX INFO: renamed from: z */
    public int m7271z() throws CborException {
        try {
            int i13 = ((InputStream) this.f9291b).read();
            if (i13 != -1) {
                return i13;
            }
            throw new IOException("Unexpected end of stream");
        } catch (IOException e5) {
            throw new CborException(e5);
        }
    }

    public AbstractC2351b(C13668i c13668i, InputStream inputStream) {
        this.f9292c = c13668i;
        this.f9291b = inputStream;
    }

    public AbstractC2351b(Context context) {
        this.f9291b = context;
    }

    public AbstractC2351b(int i13) {
        this.f9292c = new ArrayList();
        for (int i14 = 0; i14 < i13; i14++) {
            ((ArrayList) this.f9292c).add(new C14703n());
        }
    }

    public AbstractC2351b() {
        this.f9292c = new int[2];
    }

    public AbstractC2351b(Set set) {
        this.f9292c = new C23548b(0);
        Objects.requireNonNull(set);
        this.f9291b = Collections.unmodifiableSet(set);
    }

    public AbstractC2351b(LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0) {
        this.f9292c = layoutInflaterFactory2C24829a0;
    }
}
