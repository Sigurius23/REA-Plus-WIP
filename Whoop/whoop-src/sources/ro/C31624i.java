package ro;

import ai.C0895a;
import ai.C0896b;
import ai.C0897c;
import ai.C0900f;
import ai.C0904j;
import ai.InterfaceC0905k;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.C1072f;
import android.support.v4.media.session.C1073g;
import android.support.v4.media.session.C1082p;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import au.C2048e;
import au.C2049f;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.EnumC2998d0;
import bd3.AbstractC3118e;
import bd3.C3120f;
import bd3.C3128j;
import bh3.InterfaceC3262i;
import bn.C3490c;
import bn.C3491d;
import bn.C3492e;
import c23.ViewOnTouchListenerC3909o;
import com.google.android.exoplayer2.ParserException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import ed3.C13117a;
import i63.C18163d;
import i63.InterfaceC18165e;
import io.sentry.internal.debugmeta.C20378c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import m83.C25258m;
import mo.C25721b;
import org.json.JSONException;
import p003a1.C0109h;
import p003a1.C0112k;
import p005a3.AbstractC0201g;
import p025b1.AbstractC2218i;
import p025b1.InterfaceC2216g;
import p072cp.InterfaceC10939f;
import p073cq.C11040i;
import p073cq.C11043l;
import p073cq.InterfaceC11037f;
import p073cq.InterfaceC11038g;
import p075ct.C11105a;
import p076d.AbstractC11272b1;
import p076d.C11309r;
import p076d.C11326z0;
import p076d.InterfaceC11307q;
import p077d0.AbstractC11395r;
import p077d0.C11353g0;
import p077d0.InterfaceC11341d0;
import p077d0.InterfaceC11398s;
import p078d1.C11457j;
import p085d9.C11780a0;
import p085d9.RunnableC11791h;
import p096dq.AbstractC12257a;
import p096dq.C12262f;
import p096dq.C12265i;
import p096dq.C12269m;
import p127ev.C13668i;
import p154fs.C14738p;
import p268k0.AbstractC22086a;
import p461rh.InterfaceC31421j;
import p478s3.AbstractC32098d;
import p486sp.AbstractC32850a;
import p486sp.BinderC32859j;
import p486sp.C32857h;
import p486sp.C32860k;
import p588wm.C37376r;
import p588wm.InterfaceC37368j;
import p607x8.AbstractC38046a;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import q83.InterfaceC30057d;
import se.AbstractC32411b;
import to.InterfaceC33987n;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: ro.i */
/* JADX INFO: loaded from: classes6.dex */
public class C31624i implements InterfaceC0905k, InterfaceC18165e, InterfaceC3262i, InterfaceC11037f, InterfaceC11398s, InterfaceC33987n {

    /* JADX INFO: renamed from: y */
    public static C31624i f130663y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130664w;

    /* JADX INFO: renamed from: x */
    public Object f130665x;

    public /* synthetic */ C31624i(int i13) {
        this.f130664w = i13;
    }

    /* JADX INFO: renamed from: A */
    public static C31624i m97694A(int i13) {
        return new C31624i(C11105a.m30034a(AbstractC32411b.m101079W(i13)), 18);
    }

    /* JADX INFO: renamed from: G */
    public static synchronized C31624i m97695G(Context context) {
        C31624i c31624i;
        Context applicationContext = context.getApplicationContext();
        synchronized (C31624i.class) {
            c31624i = f130663y;
            if (c31624i == null) {
                c31624i = new C31624i(applicationContext);
                f130663y = c31624i;
            }
        }
        return c31624i;
        return c31624i;
    }

    /* JADX INFO: renamed from: b */
    public static int m97696b(int i13, boolean z4) {
        int i14;
        if (i13 >= 128) {
            i14 = 2;
            int i15 = i13;
            while (true) {
                i15 >>>= 8;
                if (i15 == 0) {
                    break;
                }
                i14++;
            }
        } else {
            i14 = 1;
        }
        return i14 + (z4 ? 1 : 0) + i13;
    }

    /* JADX INFO: renamed from: r */
    public static C31624i m97697r(byte[] bArr, C14738p c14738p) {
        if (c14738p != null) {
            return new C31624i(C11105a.m30034a(bArr), 18);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    /* JADX INFO: renamed from: s */
    public static C31624i m97698s(BigInteger bigInteger) {
        return new C31624i(bigInteger, 17);
    }

    /* JADX INFO: renamed from: B */
    public void m97699B() {
        C3128j c3128j = (C3128j) this.f130665x;
        c3128j.getClass();
        C3120f c3120f = C3120f.f12244c;
        byte[] bArrArray = c3128j.f12270c.array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        c3120f.getClass();
        synchronized (c3120f) {
            int i13 = c3120f.f5933a;
            if (bArrArray.length + i13 < AbstractC3118e.f12241a) {
                c3120f.f5933a = i13 + (bArrArray.length / 2);
                ((C25258m) c3120f.f5934b).addLast(bArrArray);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m97700C(C2048e c2048e) {
        this.f130665x = c2048e;
    }

    /* JADX INFO: renamed from: D */
    public void m97701D() {
        InterfaceC2216g interfaceC2216g;
        C0112k c0112k = (C0112k) this.f130665x;
        if (c0112k == null) {
            AbstractC22086a.m63161d("ToolbarRequester is not initialized.");
            throw new KotlinNothingValueException();
        }
        if (c0112k.f9141N) {
            C2996c2 c2996c2 = c0112k.f350U;
            if ((c2996c2 == null || !c2996c2.isActive()) && (interfaceC2216g = (InterfaceC2216g) AbstractC0201g.m506f(c0112k, AbstractC2218i.f8840b)) != null) {
                c0112k.f350U = AbstractC3006f0.m8732z(c0112k.m7158L0(), null, EnumC2998d0.f12007z, new C0109h(c0112k, interfaceC2216g, (InterfaceC30057d) null), 1);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public int m97702E() {
        return ((C11105a) this.f130665x).f35302a.length;
    }

    /* JADX INFO: renamed from: F */
    public byte[] m97703F(C14738p c14738p) {
        if (c14738p != null) {
            return ((C11105a) this.f130665x).m30035b();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    /* JADX INFO: renamed from: H */
    public synchronized void m97704H() {
        C31617b c31617b = (C31617b) this.f130665x;
        ReentrantLock reentrantLock = c31617b.f130640a;
        reentrantLock.lock();
        try {
            c31617b.f130641b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    @Override // i63.InterfaceC18165e
    /* JADX INFO: renamed from: a */
    public boolean mo7833a(C18163d c18163d) {
        return c18163d.m52163f((C18163d) this.f130665x);
    }

    @Override // to.InterfaceC33987n
    public void accept(Object obj, Object obj2) {
        int i13 = this.f130664w;
        Status status = Status.f20490G;
        C32860k c32860k = (C32860k) obj;
        C11040i c11040i = (C11040i) obj2;
        switch (i13) {
            case 27:
                C12262f c12262f = (C12262f) this.f130665x;
                c32860k.getClass();
                BinderC32859j binderC32859j = new BinderC32859j(0, c11040i);
                try {
                    C32857h c32857h = (C32857h) c32860k.m111061j();
                    Bundle bundleM103129u = c32860k.m103129u();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken(c32857h.f78074h);
                    AbstractC32850a.m103119c(parcelObtain, c12262f);
                    AbstractC32850a.m103119c(parcelObtain, bundleM103129u);
                    AbstractC32850a.m103120d(parcelObtain, binderC32859j);
                    c32857h.m57323l0(parcelObtain, 14);
                } catch (RemoteException e5) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e5);
                    Bundle bundle = Bundle.EMPTY;
                    AbstractC32098d.m99850q(status, Boolean.FALSE, binderC32859j.f136890g);
                    return;
                }
                break;
            case 28:
                C12269m c12269m = (C12269m) this.f130665x;
                Bundle bundleM103129u2 = c32860k.m103129u();
                bundleM103129u2.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                BinderC32859j binderC32859j2 = new BinderC32859j(2, c11040i);
                try {
                    C32857h c32857h2 = (C32857h) c32860k.m111061j();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken(c32857h2.f78074h);
                    AbstractC32850a.m103119c(parcelObtain2, c12269m);
                    AbstractC32850a.m103119c(parcelObtain2, bundleM103129u2);
                    AbstractC32850a.m103120d(parcelObtain2, binderC32859j2);
                    c32857h2.m57323l0(parcelObtain2, 19);
                    break;
                } catch (RemoteException e13) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e13);
                    Bundle bundle2 = Bundle.EMPTY;
                    int i14 = AbstractC12257a.f41026a;
                    boolean zM15593b = status.m15593b();
                    C11040i c11040i2 = binderC32859j2.f136890g;
                    if (zM15593b) {
                        c11040i2.m29687b(null);
                        return;
                    } else {
                        c11040i2.m29686a(AbstractC32098d.m99841g(status));
                        return;
                    }
                }
                break;
            default:
                C12265i c12265i = (C12265i) this.f130665x;
                Bundle bundleM103129u3 = c32860k.m103129u();
                BinderC32859j binderC32859j3 = new BinderC32859j(1, c11040i);
                try {
                    C32857h c32857h3 = (C32857h) c32860k.m111061j();
                    Parcel parcelObtain3 = Parcel.obtain();
                    parcelObtain3.writeInterfaceToken(c32857h3.f78074h);
                    AbstractC32850a.m103119c(parcelObtain3, c12265i);
                    AbstractC32850a.m103119c(parcelObtain3, bundleM103129u3);
                    AbstractC32850a.m103120d(parcelObtain3, binderC32859j3);
                    c32857h3.m57323l0(parcelObtain3, 24);
                } catch (RemoteException e14) {
                    Log.e("WalletClientImpl", "RemoteException during getPaymentCardRecognitionIntent", e14);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public C11309r mo30515c() {
        return new C11309r((ByteArrayOutputStream) this.f130665x, 19);
    }

    @Override // ai.InterfaceC0905k
    public void clear() {
    }

    /* JADX INFO: renamed from: d */
    public void m97705d(int i13) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f130665x;
        if (i13 < 128) {
            byteArrayOutputStream.write(i13);
            return;
        }
        int i14 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i15 = i14 - 1;
            bArr[i15] = (byte) i13;
            i13 >>>= 8;
            if (i13 == 0) {
                int i16 = i14 - 2;
                bArr[i16] = (byte) ((5 - i15) | 128);
                byteArrayOutputStream.write(bArr, i16, 6 - i15);
                return;
            }
            i14 = i15;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m97706e(int i13, int i14) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f130665x;
        if (i14 < 31) {
            byteArrayOutputStream.write(i13 | i14);
            return;
        }
        byte[] bArr = new byte[6];
        int i15 = 5;
        bArr[5] = (byte) (i14 & 127);
        while (i14 > 127) {
            i14 >>>= 7;
            i15--;
            bArr[i15] = (byte) ((i14 & 127) | 128);
        }
        int i16 = i15 - 1;
        bArr[i16] = (byte) (i13 | 31);
        byteArrayOutputStream.write(bArr, i16, 6 - i16);
    }

    /* JADX INFO: renamed from: f */
    public void m97707f(int i13, boolean z4, byte[] bArr) throws IOException {
        m97709n(i13, z4);
        m97705d(bArr.length);
        ((ByteArrayOutputStream) this.f130665x).write(bArr, 0, bArr.length);
    }

    @Override // ai.InterfaceC0905k
    /* JADX INFO: renamed from: g */
    public void mo2229g(C0896b c0896b, InterfaceC31421j interfaceC31421j, Map map, long j7) {
        ((C0904j) this.f130665x).m2228o(c0896b, interfaceC31421j, map, j7);
    }

    @Override // p077d0.InterfaceC11398s
    public InterfaceC11341d0 get(int i13) {
        return ((C11353g0[]) this.f130665x)[i13];
    }

    @Override // ai.InterfaceC0905k
    public long getSize() {
        return 0L;
    }

    /* JADX INFO: renamed from: h */
    public void m97708h(boolean z4, int i13, InterfaceC11307q[] interfaceC11307qArr) throws IOException {
        m97709n(i13, z4);
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f130665x;
        byteArrayOutputStream.write(128);
        mo30516i(interfaceC11307qArr);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
    }

    /* JADX INFO: renamed from: i */
    public void mo30516i(InterfaceC11307q[] interfaceC11307qArr) {
        for (InterfaceC11307q interfaceC11307q : interfaceC11307qArr) {
            interfaceC11307q.mo30482d().mo30480f(this, true);
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo30517j(AbstractC11272b1[] abstractC11272b1Arr) {
        for (AbstractC11272b1 abstractC11272b1 : abstractC11272b1Arr) {
            abstractC11272b1.mo30480f(this, true);
        }
    }

    @Override // ai.InterfaceC0905k
    /* JADX INFO: renamed from: k */
    public C0897c mo2230k(C0896b c0896b) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public C11326z0 mo30533l() {
        return new C11326z0((ByteArrayOutputStream) this.f130665x, 19);
    }

    @Override // ai.InterfaceC0905k
    /* JADX INFO: renamed from: m */
    public void mo2231m(long j7) {
    }

    /* JADX INFO: renamed from: n */
    public void m97709n(int i13, boolean z4) throws IOException {
        if (z4) {
            ((ByteArrayOutputStream) this.f130665x).write(i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02a1  */
    /* JADX INFO: renamed from: o */
    public void m97710o(int i13, int i14, InterfaceC37368j interfaceC37368j) throws ParserException {
        int i15;
        int i16;
        int i17;
        long j7;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        C3491d c3491d = (C3491d) this.f130665x;
        C3492e c3492e = c3491d.f13820b;
        SparseArray sparseArray = c3491d.f13821c;
        C13117a c13117a = c3491d.f13827i;
        C13117a c13117a2 = c3491d.f13825g;
        int i27 = 1;
        int i28 = 0;
        if (i13 != 161 && i13 != 163) {
            if (i13 == 165) {
                if (c3491d.f13798G != 2) {
                    return;
                }
                C3490c c3490c = (C3490c) sparseArray.get(c3491d.f13804M);
                int i29 = c3491d.f13807P;
                C13117a c13117a3 = c3491d.f13832n;
                if (i29 != 4 || !"V_VP9".equals(c3490c.f13761b)) {
                    interfaceC37368j.mo3100n(i14);
                    return;
                } else {
                    c13117a3.m36686H(i14);
                    interfaceC37368j.readFully(c13117a3.f45381a, 0, i14);
                    return;
                }
            }
            if (i13 == 16877) {
                c3491d.m10289c(i13);
                C3490c c3490c2 = c3491d.f13839u;
                int i34 = c3490c2.f13766g;
                if (i34 != 1685485123 && i34 != 1685480259) {
                    interfaceC37368j.mo3100n(i14);
                    return;
                }
                byte[] bArr = new byte[i14];
                c3490c2.f13748N = bArr;
                interfaceC37368j.readFully(bArr, 0, i14);
                return;
            }
            if (i13 == 16981) {
                c3491d.m10289c(i13);
                byte[] bArr2 = new byte[i14];
                c3491d.f13839u.f13768i = bArr2;
                interfaceC37368j.readFully(bArr2, 0, i14);
                return;
            }
            if (i13 == 18402) {
                byte[] bArr3 = new byte[i14];
                interfaceC37368j.readFully(bArr3, 0, i14);
                c3491d.m10289c(i13);
                c3491d.f13839u.f13769j = new C37376r(1, 0, 0, bArr3);
                return;
            }
            if (i13 == 21419) {
                Arrays.fill(c13117a.f45381a, (byte) 0);
                interfaceC37368j.readFully(c13117a.f45381a, 4 - i14, i14);
                c13117a.m36689K(0);
                c3491d.f13841w = (int) c13117a.m36716z();
                return;
            }
            if (i13 == 25506) {
                c3491d.m10289c(i13);
                byte[] bArr4 = new byte[i14];
                c3491d.f13839u.f13770k = bArr4;
                interfaceC37368j.readFully(bArr4, 0, i14);
                return;
            }
            if (i13 != 30322) {
                StringBuilder sb4 = new StringBuilder(26);
                sb4.append("Unexpected id: ");
                sb4.append(i13);
                throw ParserException.m15562a(null, sb4.toString());
            }
            c3491d.m10289c(i13);
            byte[] bArr5 = new byte[i14];
            c3491d.f13839u.f13781v = bArr5;
            interfaceC37368j.readFully(bArr5, 0, i14);
            return;
        }
        if (c3491d.f13798G == 0) {
            c3491d.f13804M = (int) c3492e.m10297b(interfaceC37368j, false, true, 8);
            c3491d.f13805N = c3492e.f13848c;
            c3491d.f13800I = -9223372036854775807L;
            c3491d.f13798G = 1;
            c13117a2.m36686H(0);
        }
        C3490c c3490c3 = (C3490c) sparseArray.get(c3491d.f13804M);
        if (c3490c3 == null) {
            interfaceC37368j.mo3100n(i14 - c3491d.f13805N);
            c3491d.f13798G = 0;
            return;
        }
        c3490c3.f13758X.getClass();
        if (c3491d.f13798G == 1) {
            c3491d.m10291f(interfaceC37368j, 3);
            int i35 = (c13117a2.f45381a[2] & 6) >> 1;
            byte b = 255;
            if (i35 == 0) {
                c3491d.f13802K = 1;
                int[] iArr = c3491d.f13803L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                c3491d.f13803L = iArr;
                iArr[0] = (i14 - c3491d.f13805N) - 3;
            } else {
                c3491d.m10291f(interfaceC37368j, 4);
                int i36 = (c13117a2.f45381a[3] & 255) + 1;
                c3491d.f13802K = i36;
                int[] iArr2 = c3491d.f13803L;
                if (iArr2 == null) {
                    iArr2 = new int[i36];
                } else if (iArr2.length < i36) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i36)];
                }
                c3491d.f13803L = iArr2;
                if (i35 == 2) {
                    int i37 = (i14 - c3491d.f13805N) - 4;
                    int i38 = c3491d.f13802K;
                    Arrays.fill(iArr2, 0, i38, i37 / i38);
                } else {
                    if (i35 == 1) {
                        int i39 = 0;
                        int i44 = 0;
                        int i45 = 4;
                        while (true) {
                            i19 = c3491d.f13802K - 1;
                            if (i39 >= i19) {
                                break;
                            }
                            c3491d.f13803L[i39] = 0;
                            while (true) {
                                i24 = i45 + 1;
                                c3491d.m10291f(interfaceC37368j, i24);
                                int i46 = c13117a2.f45381a[i45] & 255;
                                int[] iArr3 = c3491d.f13803L;
                                i25 = iArr3[i39] + i46;
                                iArr3[i39] = i25;
                                if (i46 != 255) {
                                    break;
                                } else {
                                    i45 = i24;
                                }
                            }
                            i44 += i25;
                            i39++;
                            i45 = i24;
                        }
                        c3491d.f13803L[i19] = ((i14 - c3491d.f13805N) - i45) - i44;
                    } else {
                        if (i35 != 3) {
                            StringBuilder sb5 = new StringBuilder(36);
                            sb5.append("Unexpected lacing value: ");
                            sb5.append(i35);
                            throw ParserException.m15562a(null, sb5.toString());
                        }
                        int i47 = 0;
                        int i48 = 0;
                        int i49 = 4;
                        while (true) {
                            int i54 = c3491d.f13802K - i27;
                            if (i47 >= i54) {
                                i15 = i27;
                                i16 = i28;
                                c3491d.f13803L[i54] = ((i14 - c3491d.f13805N) - i49) - i48;
                                break;
                            }
                            c3491d.f13803L[i47] = i28;
                            int i55 = i49 + 1;
                            c3491d.m10291f(interfaceC37368j, i55);
                            if (c13117a2.f45381a[i49] == 0) {
                                throw ParserException.m15562a(null, "No valid varint length mask found");
                            }
                            int i56 = i27;
                            int i57 = i28;
                            while (true) {
                                if (i57 >= 8) {
                                    i17 = i28;
                                    j7 = 0;
                                    i18 = i55;
                                    break;
                                }
                                int i58 = i56 << (7 - i57);
                                i17 = i28;
                                if ((c13117a2.f45381a[i49] & i58) != 0) {
                                    i18 = i55 + i57;
                                    c3491d.m10291f(interfaceC37368j, i18);
                                    j7 = c13117a2.f45381a[i49] & b & (~i58);
                                    while (i55 < i18) {
                                        j7 = (j7 << 8) | ((long) (c13117a2.f45381a[i55] & b));
                                        i55++;
                                        b = 255;
                                    }
                                    if (i47 <= 0) {
                                        break;
                                    }
                                    j7 -= (1 << ((i57 * 7) + 6)) - 1;
                                    break;
                                }
                                i57++;
                                i28 = i17;
                                b = 255;
                            }
                            if (j7 < -2147483648L || j7 > 2147483647L) {
                                throw ParserException.m15562a(null, "EBML lacing sample size out of range.");
                            }
                            int i59 = (int) j7;
                            int[] iArr4 = c3491d.f13803L;
                            if (i47 != 0) {
                                i59 += iArr4[i47 - 1];
                            }
                            iArr4[i47] = i59;
                            i48 += i59;
                            i47++;
                            i49 = i18;
                            i27 = i56;
                            i28 = i17;
                            b = 255;
                        }
                    }
                    byte[] bArr6 = c13117a2.f45381a;
                    c3491d.f13799H = c3491d.m10293k((bArr6[i15] & 255) | (bArr6[i16] << 8)) + c3491d.f13793B;
                    if (c3490c3.f13763d != 2 || (i13 == 163 && (c13117a2.f45381a[2] & 128) == 128)) {
                        i26 = i15;
                    } else {
                        i26 = i16;
                    }
                    c3491d.f13806O = i26;
                    c3491d.f13798G = 2;
                    c3491d.f13801J = i16;
                }
            }
            i15 = 1;
            i16 = 0;
            byte[] bArr7 = c13117a2.f45381a;
            c3491d.f13799H = c3491d.m10293k((bArr7[i15] & 255) | (bArr7[i16] << 8)) + c3491d.f13793B;
            if (c3490c3.f13763d != 2) {
                i26 = i15;
            } else {
                i26 = i15;
            }
            c3491d.f13806O = i26;
            c3491d.f13798G = 2;
            c3491d.f13801J = i16;
        }
        if (i13 == 163) {
            while (true) {
                int i64 = c3491d.f13801J;
                if (i64 >= c3491d.f13802K) {
                    c3491d.f13798G = 0;
                    return;
                }
                c3491d.m10290d(c3490c3, ((long) ((c3491d.f13801J * c3490c3.f13764e) / 1000)) + c3491d.f13799H, c3491d.f13806O, c3491d.m10294l(interfaceC37368j, c3490c3, c3491d.f13803L[i64]), 0);
                c3491d.f13801J++;
            }
        } else {
            while (true) {
                int i65 = c3491d.f13801J;
                if (i65 >= c3491d.f13802K) {
                    return;
                }
                int[] iArr5 = c3491d.f13803L;
                iArr5[i65] = c3491d.m10294l(interfaceC37368j, c3490c3, iArr5[i65]);
                c3491d.f13801J++;
            }
        }
    }

    @Override // p073cq.InterfaceC11037f
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ((InterfaceC11038g) this.f130665x).mo29685d();
    }

    /* JADX INFO: renamed from: p */
    public C0900f m97711p() {
        C0904j c0904j = new C0904j(0, false);
        C0895a c0895a = (C0895a) this.f130665x;
        if (c0895a == null) {
            throw new IllegalStateException("maxSizeBytesFactory == null");
        }
        long jLongValue = ((Number) c0895a.invoke()).longValue();
        return new C0900f(jLongValue > 0 ? new C11457j(jLongValue, c0904j) : new C31624i(c0904j, 2), c0904j);
    }

    /* JADX INFO: renamed from: q */
    public C2049f m97712q() {
        return new C2049f((C2048e) this.f130665x);
    }

    @Override // ai.InterfaceC0905k
    /* JADX INFO: renamed from: t */
    public boolean mo2232t(C0896b c0896b) {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public BigInteger m97713u(C14738p c14738p) {
        if (c14738p != null) {
            return (BigInteger) this.f130665x;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    /* JADX INFO: renamed from: v */
    public void m97714v(int i13, long j7) throws ParserException {
        C3491d c3491d = (C3491d) this.f130665x;
        if (i13 == 20529) {
            if (j7 == 0) {
                return;
            }
            StringBuilder sb4 = new StringBuilder(55);
            sb4.append("ContentEncodingOrder ");
            sb4.append(j7);
            sb4.append(" not supported");
            throw ParserException.m15562a(null, sb4.toString());
        }
        if (i13 == 20530) {
            if (j7 == 1) {
                return;
            }
            StringBuilder sb5 = new StringBuilder(55);
            sb5.append("ContentEncodingScope ");
            sb5.append(j7);
            sb5.append(" not supported");
            throw ParserException.m15562a(null, sb5.toString());
        }
        int i14 = 3;
        switch (i13) {
            case 131:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13763d = (int) j7;
                return;
            case 136:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13756V = j7 == 1;
                return;
            case 155:
                c3491d.f13800I = c3491d.m10293k(j7);
                return;
            case 159:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13749O = (int) j7;
                return;
            case 176:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13772m = (int) j7;
                return;
            case 179:
                c3491d.m10288a(i13);
                c3491d.f13794C.m71597a(c3491d.m10293k(j7));
                return;
            case 186:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13773n = (int) j7;
                return;
            case 215:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13762c = (int) j7;
                return;
            case 231:
                c3491d.f13793B = c3491d.m10293k(j7);
                return;
            case 238:
                c3491d.f13807P = (int) j7;
                return;
            case 241:
                if (c3491d.f13796E) {
                    return;
                }
                c3491d.m10288a(i13);
                c3491d.f13795D.m71597a(j7);
                c3491d.f13796E = true;
                return;
            case 251:
                c3491d.f13808Q = true;
                return;
            case 16871:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13766g = (int) j7;
                return;
            case 16980:
                if (j7 == 3) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(50);
                sb6.append("ContentCompAlgo ");
                sb6.append(j7);
                sb6.append(" not supported");
                throw ParserException.m15562a(null, sb6.toString());
            case 17029:
                if (j7 < 1 || j7 > 2) {
                    StringBuilder sb7 = new StringBuilder(53);
                    sb7.append("DocTypeReadVersion ");
                    sb7.append(j7);
                    sb7.append(" not supported");
                    throw ParserException.m15562a(null, sb7.toString());
                }
                return;
            case 17143:
                if (j7 == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(50);
                sb8.append("EBMLReadVersion ");
                sb8.append(j7);
                sb8.append(" not supported");
                throw ParserException.m15562a(null, sb8.toString());
            case 18401:
                if (j7 == 5) {
                    return;
                }
                StringBuilder sb9 = new StringBuilder(49);
                sb9.append("ContentEncAlgo ");
                sb9.append(j7);
                sb9.append(" not supported");
                throw ParserException.m15562a(null, sb9.toString());
            case 18408:
                if (j7 == 1) {
                    return;
                }
                StringBuilder sb10 = new StringBuilder(56);
                sb10.append("AESSettingsCipherMode ");
                sb10.append(j7);
                sb10.append(" not supported");
                throw ParserException.m15562a(null, sb10.toString());
            case 21420:
                c3491d.f13842x = j7 + c3491d.f13835q;
                return;
            case 21432:
                int i15 = (int) j7;
                c3491d.m10289c(i13);
                if (i15 == 0) {
                    c3491d.f13839u.f13782w = 0;
                    return;
                }
                if (i15 == 1) {
                    c3491d.f13839u.f13782w = 2;
                    return;
                } else if (i15 == 3) {
                    c3491d.f13839u.f13782w = 1;
                    return;
                } else {
                    if (i15 != 15) {
                        return;
                    }
                    c3491d.f13839u.f13782w = 3;
                    return;
                }
            case 21680:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13774o = (int) j7;
                return;
            case 21682:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13776q = (int) j7;
                return;
            case 21690:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13775p = (int) j7;
                return;
            case 21930:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13755U = j7 == 1;
                return;
            case 21998:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13765f = (int) j7;
                return;
            case 22186:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13752R = j7;
                return;
            case 22203:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13753S = j7;
                return;
            case 25188:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13750P = (int) j7;
                return;
            case 30321:
                c3491d.m10289c(i13);
                int i16 = (int) j7;
                if (i16 == 0) {
                    c3491d.f13839u.f13777r = 0;
                    return;
                }
                if (i16 == 1) {
                    c3491d.f13839u.f13777r = 1;
                    return;
                } else if (i16 == 2) {
                    c3491d.f13839u.f13777r = 2;
                    return;
                } else {
                    if (i16 != 3) {
                        return;
                    }
                    c3491d.f13839u.f13777r = 3;
                    return;
                }
            case 2352003:
                c3491d.m10289c(i13);
                c3491d.f13839u.f13764e = (int) j7;
                return;
            case 2807729:
                c3491d.f13836r = j7;
                return;
            default:
                switch (i13) {
                    case 21945:
                        c3491d.m10289c(i13);
                        int i17 = (int) j7;
                        if (i17 == 1) {
                            c3491d.f13839u.f13735A = 2;
                            return;
                        } else {
                            if (i17 != 2) {
                                return;
                            }
                            c3491d.f13839u.f13735A = 1;
                            return;
                        }
                    case 21946:
                        c3491d.m10289c(i13);
                        int i18 = (int) j7;
                        if (i18 != 1) {
                            if (i18 == 16) {
                                i14 = 6;
                            } else if (i18 == 18) {
                                i14 = 7;
                            } else if (i18 != 6 && i18 != 7) {
                                i14 = -1;
                            }
                        }
                        if (i14 != -1) {
                            c3491d.f13839u.f13785z = i14;
                            return;
                        }
                        return;
                    case 21947:
                        c3491d.m10289c(i13);
                        c3491d.f13839u.f13783x = true;
                        int iM75838a = C25721b.m75838a((int) j7);
                        if (iM75838a != -1) {
                            c3491d.f13839u.f13784y = iM75838a;
                            return;
                        }
                        return;
                    case 21948:
                        c3491d.m10289c(i13);
                        c3491d.f13839u.f13736B = (int) j7;
                        return;
                    case 21949:
                        c3491d.m10289c(i13);
                        c3491d.f13839u.f13737C = (int) j7;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m97715w(Context context, double d3) {
        if (0.0d > d3 || d3 > 1.0d) {
            throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
        }
        this.f130665x = new C0895a(context, d3);
    }

    /* JADX INFO: renamed from: x */
    public void m97716x(Exception exc) {
        AbstractC38046a.m121813h("MediaCodecAudioRenderer", "Audio sink error", exc);
        C20378c c20378c = ((C11780a0) this.f130665x).f38178d1;
        Handler handler = (Handler) c20378c.f76422x;
        if (handler != null) {
            handler.post(new RunnableC11791h(c20378c, exc, 8));
        }
    }

    /* JADX INFO: renamed from: y */
    public void m97717y(C29938w0 c29938w0) {
        C13668i c13668i = (C13668i) this.f130665x;
        c13668i.f48454a = c29938w0;
        Iterator it = ((LinkedList) c13668i.f48456c).iterator();
        while (it.hasNext()) {
            ((InterfaceC10939f) it.next()).mo28990b();
        }
        ((LinkedList) c13668i.f48456c).clear();
        c13668i.f48455b = null;
    }

    /* JADX INFO: renamed from: z */
    public void m97718z(float f13, float f14, float f15, float f16, float f17) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = (ViewOnTouchListenerC3909o) this.f130665x;
        if (viewOnTouchListenerC3909o.m11893d() < viewOnTouchListenerC3909o.f15968F || f13 < 1.0f) {
            viewOnTouchListenerC3909o.getClass();
            viewOnTouchListenerC3909o.f15975M.postScale(f13, f13, f14, f15);
            viewOnTouchListenerC3909o.f15975M.postTranslate(f16, f17);
            viewOnTouchListenerC3909o.m11890a();
        }
    }

    public /* synthetic */ C31624i(Object obj, int i13) {
        this.f130664w = i13;
        this.f130665x = obj;
    }

    public C31624i(Context context) {
        String strM97684e;
        this.f130664w = 0;
        C31617b c31617bM97679a = C31617b.m97679a(context);
        this.f130665x = c31617bM97679a;
        c31617bM97679a.m97681b();
        String strM97684e2 = c31617bM97679a.m97684e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM97684e2) || (strM97684e = c31617bM97679a.m97684e(C31617b.m97680f("googleSignInOptions", strM97684e2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.m15584b(strM97684e);
        } catch (JSONException unused) {
        }
    }

    public C31624i(C11043l c11043l, InterfaceC11038g interfaceC11038g) {
        this.f130664w = 16;
        this.f130665x = interfaceC11038g;
    }

    public C31624i(InputStream stream2) {
        this.f130664w = 8;
        AbstractC22676k.m65750j(stream2, "stream");
        this.f130665x = new C3128j(stream2, AbstractC39397a.f169546a);
    }

    public C31624i(Context context, C1082p c1082p) {
        this.f130664w = 4;
        MediaSessionCompat$Token mediaSessionCompat$Token = c1082p.f4206a.f4198b;
        if (mediaSessionCompat$Token != null) {
            Collections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f130665x = new C1073g(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f130665x = new C1072f(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public C31624i(float f13, float f14, AbstractC11395r abstractC11395r) {
        this.f130664w = 20;
        int iMo30608b = abstractC11395r.mo30608b();
        C11353g0[] c11353g0Arr = new C11353g0[iMo30608b];
        for (int i13 = 0; i13 < iMo30608b; i13++) {
            c11353g0Arr[i13] = new C11353g0(f13, f14, abstractC11395r.mo30607a(i13));
        }
        this.f130665x = c11353g0Arr;
    }
}
