package p012ab;

import al0.C0971f;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import android.util.SparseArray;
import androidx.health.platform.client.proto.C1533u;
import b83.C2810f;
import b83.C2811g;
import b83.EnumC2812h;
import b83.InterfaceC2805a;
import com.iterable.iterableapi.C5327g1;
import e83.C12857b;
import fi.C14498d;
import fi.C14511q;
import fi.InterfaceC14506l;
import i93.C18284j;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.KeyGenerator;
import jg3.AbstractC21688o;
import jg3.C21677d;
import jp.HandlerC21846d;
import kg3.AbstractC22465d;
import kg3.C22466e;
import l83.C23470p;
import lg3.C24040b;
import lg3.C24056r;
import mc3.AbstractC25438d;
import ng3.AbstractC26703p;
import ng3.EnumC26688a;
import ng3.InterfaceC26698k;
import ng3.InterfaceC26700m;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.threeten.p379bp.DateTimeException;
import p000.AbstractC11266d;
import p001a.C0001h;
import p002a0.AbstractC0065z0;
import p002a0.C0022g;
import p002a0.C0039m0;
import p027b3.InterfaceC2395j3;
import p031b9.AbstractC2875y;
import p044c5.RunnableC4221m;
import p076d.AbstractC11305p;
import p076d.C11273c;
import p076d.C11286g0;
import p076d.C11287g1;
import p076d.C11289h0;
import p076d.C11291i;
import p076d.C11303o;
import p076d.C11308q0;
import p076d.C11310r0;
import p076d.C11311s;
import p076d.C11319w;
import p076d.InterfaceC11282f;
import p076d.InterfaceC11307q;
import p087db.C11856j0;
import p149fh.C14477a;
import p196hi.C17302a;
import p213i7.C18194g;
import p249jc.C21567b;
import p253ji.InterfaceC21712e;
import p268k0.AbstractC22086a;
import p319m4.AbstractC25012a;
import p389p0.AbstractC28560y;
import p389p0.C28520f;
import p389p0.C28526h;
import p389p0.InterfaceC28544q;
import p446r1.C30849c;
import p461rh.AbstractC31426o;
import p461rh.InterfaceC31421j;
import p463rj.AbstractC31484o;
import p499t9.C33628f;
import p499t9.InterfaceC33630g;
import p499t9.InterfaceC33646o;
import p508ty.C34249c;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p607x8.C38064s;
import p658yr.C39715b;
import p658yr.C39716c;
import p658yr.C39721h;
import p674z8.InterfaceC40169e;
import p690zr.AbstractC41005a0;
import p690zr.AbstractC41032j0;
import p690zr.AbstractC41047q;
import p690zr.C41009b1;
import p690zr.C41026h0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30063j;
import sb.AbstractC32339c;
import sm.C32710c;
import to.AbstractC33975h;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: ab.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0682h0 implements InterfaceC33630g, InterfaceC21712e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f2431w;

    /* JADX INFO: renamed from: x */
    public int f2432x;

    /* JADX INFO: renamed from: y */
    public Object f2433y;

    /* JADX INFO: renamed from: z */
    public Object f2434z;

    public /* synthetic */ C0682h0(Object obj, int i13, Serializable serializable, int i14) {
        this.f2431w = i14;
        this.f2433y = obj;
        this.f2432x = i13;
        this.f2434z = serializable;
    }

    /* JADX INFO: renamed from: s */
    public static C0682h0 m1685s(char c3) {
        return new C0682h0(new C34249c(new C39715b(c3), 27));
    }

    @Override // p253ji.InterfaceC21712e
    /* JADX INFO: renamed from: a */
    public void mo1686a() {
        C17302a c17302a = (C17302a) this.f2433y;
        Drawable drawable = c17302a.f66506x.getDrawable();
        InterfaceC14506l interfaceC14506l = (InterfaceC14506l) this.f2434z;
        InterfaceC31421j interfaceC31421jMo41407e = interfaceC14506l.mo41407e();
        boolean z4 = interfaceC14506l instanceof C14511q;
        C14477a c14477a = new C14477a(drawable, interfaceC31421jMo41407e != null ? AbstractC31426o.m96738b(interfaceC31421jMo41407e, c17302a.f66506x.getResources()) : null, interfaceC14506l.mo41406d().f52984q, this.f2432x, (z4 && ((C14511q) interfaceC14506l).f53019g) ? false : true);
        if (z4) {
            c17302a.m48989b(AbstractC31426o.m96739c(c14477a));
        } else {
            if (!(interfaceC14506l instanceof C14498d)) {
                throw new NoWhenBranchMatchedException();
            }
            c17302a.m48989b(AbstractC31426o.m96739c(c14477a));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[][], java.io.Serializable] */
    /* JADX INFO: renamed from: b */
    public InterfaceC11307q m1687b(int i13) throws IOException {
        ?? r10 = (byte[][]) this.f2434z;
        int i14 = this.f2432x;
        AbstractC11305p abstractC11305p = (AbstractC11305p) this.f2433y;
        if (abstractC11305p instanceof C11291i) {
            C11291i c11291i = (C11291i) abstractC11305p;
            c11291i.f36217F = false;
            c11291i.m30508h();
        }
        int iM30496b = C11286g0.m30496b(abstractC11305p, i13);
        int iM30497h = C11286g0.m30497h(abstractC11305p, i14, iM30496b == 3 || iM30496b == 4 || iM30496b == 16 || iM30496b == 17 || iM30496b == 8);
        if (iM30497h < 0) {
            if ((i13 & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            C0682h0 c0682h0 = new C0682h0(new C11291i(abstractC11305p, i14), i14, r10, 5);
            int i15 = i13 & 192;
            if (i15 != 0) {
                return new C11308q0(i15, iM30496b, c0682h0);
            }
            if (iM30496b == 3) {
                return new C11319w(c0682h0);
            }
            if (iM30496b == 4) {
                return new C11303o(c0682h0, 1);
            }
            if (iM30496b == 8) {
                return new C11289h0(c0682h0, 3);
            }
            if (iM30496b == 16) {
                return new C11289h0(c0682h0, 0);
            }
            if (iM30496b == 17) {
                return new C11289h0(c0682h0, 1);
            }
            throw new C0001h("unknown BER object encountered: 0x" + Integer.toHexString(iM30496b));
        }
        C11273c c11273c = new C11273c(abstractC11305p, iM30497h, i14);
        if ((i13 & 224) == 0) {
            if (iM30496b == 3) {
                return new C11310r0(c11273c);
            }
            if (iM30496b == 4) {
                return new C11303o(c11273c, 0);
            }
            if (iM30496b == 8) {
                throw new C0001h("externals must use constructed encoding (see X.690 8.18)");
            }
            if (iM30496b == 16) {
                throw new C0001h("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (iM30496b == 17) {
                throw new C0001h("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return C11286g0.m30498m(iM30496b, c11273c, r10);
            } catch (IllegalArgumentException e5) {
                throw new C0001h(e5, "corrupted stream detected");
            }
        }
        C0682h0 c0682h1 = new C0682h0(c11273c, c11273c.f36235x, r10, 5);
        int i16 = i13 & 192;
        if (i16 != 0) {
            return new C11287g1(i16, iM30496b, (i13 & 32) != 0, c0682h1);
        }
        if (iM30496b == 3) {
            return new C11319w(c0682h1);
        }
        if (iM30496b == 4) {
            return new C11303o(c0682h1, 1);
        }
        if (iM30496b == 8) {
            return new C11289h0(c0682h1, 3);
        }
        if (iM30496b == 16) {
            return new C11289h0(c0682h1, 2);
        }
        if (iM30496b == 17) {
            return new C11289h0(c0682h1, 4);
        }
        throw new C0001h("unknown DL object encountered: 0x" + Integer.toHexString(iM30496b));
    }

    /* JADX INFO: renamed from: c */
    public C11311s m1688c() throws IOException {
        AbstractC11305p abstractC11305p = (AbstractC11305p) this.f2433y;
        int i13 = abstractC11305p.read();
        if (i13 < 0) {
            return new C11311s(0);
        }
        C11311s c11311s = new C11311s(10);
        do {
            InterfaceC11307q interfaceC11307qM1687b = m1687b(i13);
            c11311s.m30522e(interfaceC11307qM1687b instanceof InterfaceC11282f ? ((InterfaceC11282f) interfaceC11307qM1687b).mo30486b() : interfaceC11307qM1687b.mo30482d());
            i13 = abstractC11305p.read();
        } while (i13 >= 0);
        return c11311s;
    }

    @Override // p499t9.InterfaceC33630g
    /* JADX INFO: renamed from: d */
    public void mo1689d() {
        C38059n c38059n = (C38059n) this.f2434z;
        byte[] bArr = AbstractC38065t.f163033c;
        c38059n.getClass();
        c38059n.m121844D(bArr.length, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [eg3.b, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public void m1690e(C12857b c12857b) {
        Object obj;
        for (Object[] objArr = (Object[]) this.f2433y; objArr != null; objArr = (Object[]) objArr[4]) {
            for (int i13 = 0; i13 < 4 && (obj = objArr[i13]) != null; i13++) {
                if (obj == EnumC2812h.f11003w) {
                    c12857b.onComplete();
                    return;
                } else {
                    if (obj instanceof C2810f) {
                        c12857b.onError(((C2810f) obj).f11001w);
                        return;
                    }
                    if (obj instanceof C2811g) {
                        c12857b.mo36113b(((C2811g) obj).f11002w);
                    } else {
                        c12857b.onNext(obj);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1691f(Object obj) {
        int i13 = this.f2432x;
        if (i13 == 4) {
            Object[] objArr = new Object[5];
            ((Object[]) this.f2434z)[4] = objArr;
            this.f2434z = objArr;
            i13 = 0;
        }
        ((Object[]) this.f2434z)[i13] = obj;
        this.f2432x = i13 + 1;
    }

    /* JADX INFO: renamed from: g */
    public void m1692g(int i13, InterfaceC28544q interfaceC28544q) {
        if (i13 < 0) {
            AbstractC22086a.m63158a("size should be >=0");
        }
        if (i13 == 0) {
            return;
        }
        C28526h c28526h = new C28526h(this.f2432x, i13, interfaceC28544q);
        this.f2432x += i13;
        ((C30849c) this.f2433y).m94885b(c28526h);
    }

    /* JADX INFO: renamed from: h */
    public C11856j0 m1693h() {
        int i13 = this.f2432x;
        if (i13 == 0 && ((KeyGenParameterSpec) this.f2434z) == null) {
            throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
        }
        if (i13 == 1) {
            this.f2434z = new KeyGenParameterSpec.Builder((String) this.f2433y, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        }
        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) this.f2434z;
        if (keyGenParameterSpec == null) {
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }
        Object obj = AbstractC32339c.f133847a;
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        synchronized (AbstractC32339c.f133847a) {
            String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpec);
                    keyGenerator.generateKey();
                } catch (ProviderException e5) {
                    throw new GeneralSecurityException(e5.getMessage(), e5);
                }
            }
        }
        return new C11856j0(keyGenParameterSpec.getKeystoreAlias(), (KeyGenParameterSpec) this.f2434z);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: i */
    public C41009b1 m1694i() {
        int i13;
        boolean z4;
        char c3;
        ?? r10;
        char c7;
        short[] sArr;
        int i14;
        boolean z13;
        ?? r17;
        boolean z14;
        ?? r14;
        C41009b1 c41009b1;
        boolean z15;
        C41026h0 c41026h0 = (C41026h0) this.f2434z;
        if (c41026h0 != null) {
            throw c41026h0.m133260a();
        }
        int i15 = this.f2432x;
        Object[] objArrCopyOf = (Object[]) this.f2433y;
        if (i15 == 0) {
            c41009b1 = C41009b1.f176959G;
        } else {
            int i16 = 1;
            C41026h0 c41026h1 = null;
            ?? r15 = 0;
            C41026h0 c41026h2 = null;
            C41026h0 c41026h3 = null;
            boolean z16 = false;
            if (i15 == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                c41009b1 = new C41009b1(objArrCopyOf, 1, null);
            } else {
                AbstractC31484o.m96959k(i15, objArrCopyOf.length >> 1);
                int iM133262j = AbstractC41032j0.m133262j(i15);
                char c14 = 2;
                if (i15 == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                    i13 = 1;
                    z15 = false;
                } else {
                    int i17 = iM133262j - 1;
                    if (iM133262j <= 128) {
                        byte[] bArr = new byte[iM133262j];
                        Arrays.fill(bArr, (byte) -1);
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < i15) {
                            int i24 = i18 * 2;
                            int i25 = i19 * 2;
                            Object obj = objArrCopyOf[i24];
                            Objects.requireNonNull(obj);
                            Object obj2 = objArrCopyOf[i24 ^ i16];
                            Objects.requireNonNull(obj2);
                            int iM133286p = AbstractC41047q.m133286p(obj.hashCode());
                            while (true) {
                                int i26 = iM133286p & i17;
                                i14 = i16;
                                z13 = z16;
                                int i27 = bArr[i26] & 255;
                                if (i27 == 255) {
                                    bArr[i26] = (byte) i25;
                                    if (i19 < i18) {
                                        objArrCopyOf[i25] = obj;
                                        objArrCopyOf[i25 ^ 1] = obj2;
                                    }
                                    i19++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i27 == true ? 1 : 0])) {
                                    int i28 = ~i27;
                                    Object obj3 = objArrCopyOf[i28 == true ? 1 : 0];
                                    Objects.requireNonNull(obj3);
                                    c41026h2 = new C41026h0(obj, obj2, obj3);
                                    objArrCopyOf[i28 == true ? 1 : 0] = obj2;
                                    break;
                                }
                                iM133286p = i26 + 1;
                                i16 = i14;
                                z16 = z13;
                            }
                            i18++;
                            i16 = i14;
                            z16 = z13;
                        }
                        i13 = i16;
                        z4 = z16;
                        if (i19 == i15) {
                            r15 = bArr;
                            z15 = z4;
                        } else {
                            sArr = new Object[3];
                            sArr[z4 ? 1 : 0] = bArr;
                            sArr[i13] = Integer.valueOf(i19);
                            sArr[2] = c41026h2;
                            r15 = sArr;
                            z15 = z4;
                        }
                    } else {
                        i13 = 1;
                        z4 = false;
                        if (iM133262j <= 32768) {
                            sArr = new short[iM133262j];
                            Arrays.fill(sArr, (short) -1);
                            int i29 = 0;
                            for (int i34 = 0; i34 < i15; i34++) {
                                int i35 = i34 * 2;
                                int i36 = i29 * 2;
                                Object obj4 = objArrCopyOf[i35];
                                Objects.requireNonNull(obj4);
                                Object obj5 = objArrCopyOf[i35 ^ 1];
                                Objects.requireNonNull(obj5);
                                int iM133286p2 = AbstractC41047q.m133286p(obj4.hashCode());
                                while (true) {
                                    int i37 = iM133286p2 & i17;
                                    int i38 = sArr[i37] & 65535;
                                    if (i38 == 65535) {
                                        sArr[i37] = (short) i36;
                                        if (i29 < i34) {
                                            objArrCopyOf[i36] = obj4;
                                            objArrCopyOf[i36 ^ 1] = obj5;
                                        }
                                        i29++;
                                        break;
                                    }
                                    if (obj4.equals(objArrCopyOf[i38 == true ? 1 : 0])) {
                                        int i39 = ~i38;
                                        Object obj6 = objArrCopyOf[i39 == true ? 1 : 0];
                                        Objects.requireNonNull(obj6);
                                        c41026h3 = new C41026h0(obj4, obj5, obj6);
                                        objArrCopyOf[i39 == true ? 1 : 0] = obj5;
                                        break;
                                    }
                                    iM133286p2 = i37 + 1;
                                }
                            }
                            if (i29 == i15) {
                                r15 = sArr;
                                z15 = z4;
                            } else {
                                r15 = new Object[]{sArr, Integer.valueOf(i29), c41026h3};
                                z15 = z4;
                            }
                        } else {
                            int[] iArr = new int[iM133262j];
                            Arrays.fill(iArr, -1);
                            int i44 = 0;
                            int i45 = 0;
                            while (i44 < i15) {
                                int i46 = i44 * 2;
                                int i47 = i45 * 2;
                                Object obj7 = objArrCopyOf[i46];
                                Objects.requireNonNull(obj7);
                                Object obj8 = objArrCopyOf[i46 ^ 1];
                                Objects.requireNonNull(obj8);
                                int iM133286p3 = AbstractC41047q.m133286p(obj7.hashCode());
                                while (true) {
                                    int i48 = iM133286p3 & i17;
                                    int i49 = iArr[i48];
                                    if (i49 == -1) {
                                        iArr[i48] = i47;
                                        if (i45 < i44) {
                                            objArrCopyOf[i47] = obj7;
                                            objArrCopyOf[i47 ^ 1] = obj8;
                                        }
                                        i45++;
                                        c7 = c14;
                                        break;
                                    }
                                    c7 = c14;
                                    if (obj7.equals(objArrCopyOf[i49])) {
                                        int i54 = i49 ^ 1;
                                        Object obj9 = objArrCopyOf[i54];
                                        Objects.requireNonNull(obj9);
                                        c41026h1 = new C41026h0(obj7, obj8, obj9);
                                        objArrCopyOf[i54] = obj8;
                                        break;
                                    }
                                    iM133286p3 = i48 + 1;
                                    c14 = c7;
                                }
                                i44++;
                                c14 = c7;
                            }
                            c3 = c14;
                            if (i45 == i15) {
                                r10 = iArr;
                                r17 = z4;
                            } else {
                                Object[] objArr = new Object[3];
                                objArr[0] = iArr;
                                objArr[1] = Integer.valueOf(i45);
                                objArr[c3] = c41026h1;
                                r10 = objArr;
                                r17 = z4;
                            }
                        }
                    }
                    z14 = r10 instanceof Object[];
                    r14 = r10;
                    if (z14) {
                        Object[] objArr2 = (Object[]) r10;
                        this.f2434z = (C41026h0) objArr2[c3];
                        Object obj10 = objArr2[r17];
                        int iIntValue = ((Integer) objArr2[i13]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                        r14 = obj10;
                        i15 = iIntValue;
                    }
                    c41009b1 = new C41009b1(objArrCopyOf, i15, r14);
                }
                c3 = 2;
                r10 = r15;
                r17 = z15;
                z14 = r10 instanceof Object[];
                r14 = r10;
                if (z14) {
                    Object[] objArr3 = (Object[]) r10;
                    this.f2434z = (C41026h0) objArr3[c3];
                    Object obj11 = objArr3[r17];
                    int iIntValue2 = ((Integer) objArr3[i13]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
                    r14 = obj11;
                    i15 = iIntValue2;
                }
                c41009b1 = new C41009b1(objArrCopyOf, i15, r14);
            }
        }
        C41026h0 c41026h4 = (C41026h0) this.f2434z;
        if (c41026h4 == null) {
            return c41009b1;
        }
        throw c41026h4.m133260a();
    }

    @Override // p499t9.InterfaceC33630g
    /* JADX INFO: renamed from: j */
    public C33628f mo1695j(InterfaceC33646o interfaceC33646o, long j7) {
        long j13;
        long position = interfaceC33646o.getPosition();
        int iMin = (int) Math.min(112800, interfaceC33646o.getLength() - position);
        C38059n c38059n = (C38059n) this.f2434z;
        c38059n.m121843C(iMin);
        interfaceC33646o.mo3103p(c38059n.f163017a, 0, iMin);
        int i13 = c38059n.f163019c;
        long j14 = -1;
        long j15 = -1;
        long j16 = -9223372036854775807L;
        while (true) {
            if (c38059n.m121848a() < 188) {
                j13 = -9223372036854775807L;
                break;
            }
            byte[] bArr = c38059n.f163017a;
            int i14 = c38059n.f163018b;
            while (true) {
                if (i14 >= i13) {
                    j13 = -9223372036854775807L;
                    break;
                }
                j13 = -9223372036854775807L;
                if (bArr[i14] == 71) {
                    break;
                }
                i14++;
            }
            int i15 = i14 + 188;
            if (i15 > i13) {
                break;
            }
            long jM110130L = AbstractC34924m.m110130L(c38059n, i14, this.f2432x);
            if (jM110130L != j13) {
                long jM121883b = ((C38064s) this.f2433y).m121883b(jM110130L);
                if (jM121883b > j7) {
                    return j16 == j13 ? new C33628f(-1, jM121883b, position) : new C33628f(0, -9223372036854775807L, position + j15);
                }
                if (100000 + jM121883b > j7) {
                    return new C33628f(0, -9223372036854775807L, position + ((long) i14));
                }
                j16 = jM121883b;
                j15 = i14;
            }
            c38059n.m121846F(i15);
            j14 = i15;
        }
        return j16 != j13 ? new C33628f(-2, j16, position + j14) : C33628f.f140366d;
    }

    /* JADX INFO: renamed from: k */
    public void m1696k(InterfaceC2805a interfaceC2805a) {
        Object obj;
        for (Object[] objArr = (Object[]) this.f2433y; objArr != null; objArr = objArr[4]) {
            for (int i13 = 0; i13 < 4 && (obj = objArr[i13]) != null; i13++) {
                if (interfaceC2805a.test(obj)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public Object m1697l(int i13) {
        switch (this.f2431w) {
            case 10:
                SparseArray sparseArray = (SparseArray) this.f2433y;
                if (this.f2432x == -1) {
                    this.f2432x = 0;
                }
                while (true) {
                    int i14 = this.f2432x;
                    if (i14 > 0 && i13 < sparseArray.keyAt(i14)) {
                        this.f2432x--;
                    }
                }
                while (this.f2432x < sparseArray.size() - 1 && i13 >= sparseArray.keyAt(this.f2432x + 1)) {
                    this.f2432x++;
                }
                return sparseArray.valueAt(this.f2432x);
            default:
                SparseArray sparseArray2 = (SparseArray) this.f2433y;
                if (this.f2432x == -1) {
                    this.f2432x = 0;
                }
                while (true) {
                    int i15 = this.f2432x;
                    if (i15 > 0 && i13 < sparseArray2.keyAt(i15)) {
                        this.f2432x--;
                    }
                }
                while (this.f2432x < sparseArray2.size() - 1 && i13 >= sparseArray2.keyAt(this.f2432x + 1)) {
                    this.f2432x++;
                }
                return sparseArray2.valueAt(this.f2432x);
        }
    }

    /* JADX INFO: renamed from: m */
    public C28526h m1698m(int i13) {
        if (i13 < 0 || i13 >= this.f2432x) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index ", ", size ");
            sbM30466t.append(this.f2432x);
            AbstractC22086a.m63162e(sbM30466t.toString());
        }
        C28526h c28526h = (C28526h) this.f2434z;
        if (c28526h != null) {
            int i14 = c28526h.f115433a;
            if (i13 < c28526h.f115434b + i14 && i14 <= i13) {
                return c28526h;
            }
        }
        C30849c c30849c = (C30849c) this.f2433y;
        C28526h c28526h2 = (C28526h) c30849c.f127227w[AbstractC28560y.m86880g(i13, c30849c)];
        this.f2434z = c28526h2;
        return c28526h2;
    }

    /* JADX INFO: renamed from: n */
    public int m1699n(Object obj) {
        C0039m0 c0039m0 = (C0039m0) this.f2433y;
        int iM91d = c0039m0.m91d(obj);
        if (iM91d >= 0) {
            return c0039m0.f116c[iM91d];
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public Object m1700o(int i13) {
        Object[] objArr = (Object[]) this.f2434z;
        int i14 = i13 - this.f2432x;
        if (i14 < 0 || i14 >= objArr.length) {
            return null;
        }
        return objArr[i14];
    }

    /* JADX INFO: renamed from: p */
    public int m1701p() {
        int i13 = this.f2432x;
        if (i13 != 2) {
            return i13 != 3 ? 0 : 512;
        }
        return DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
    }

    /* JADX INFO: renamed from: q */
    public SharedPreferences m1702q() {
        Object value = ((C23470p) this.f2434z).getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    /* JADX INFO: renamed from: r */
    public Long m1703r(InterfaceC26700m interfaceC26700m) {
        try {
            return Long.valueOf(((InterfaceC26698k) this.f2433y).mo60987h(interfaceC26700m));
        } catch (DateTimeException e5) {
            if (this.f2432x > 0) {
                return null;
            }
            throw e5;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m1704t(Object obj, Object obj2) {
        int i13 = (this.f2432x + 1) * 2;
        Object[] objArr = (Object[]) this.f2433y;
        if (i13 > objArr.length) {
            this.f2433y = Arrays.copyOf(objArr, AbstractC41005a0.m133221e(objArr.length, i13));
        }
        if (obj == null) {
            throw new NullPointerException(AbstractC25012a.m73375h(obj2, "null key in entry: null="));
        }
        if (obj2 == null) {
            throw new NullPointerException(AbstractC18489d0.m53369j(obj, "null value in entry: ", "=null"));
        }
        Object[] objArr2 = (Object[]) this.f2433y;
        int i14 = this.f2432x;
        int i15 = i14 * 2;
        objArr2[i15] = obj;
        objArr2[i15 + 1] = obj2;
        this.f2432x = i14 + 1;
    }

    public String toString() {
        switch (this.f2431w) {
            case 11:
                return ((InterfaceC26698k) this.f2433y).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1705u(C2810f c2810f) {
        ((Object[]) this.f2433y)[0] = c2810f;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[Catch: all -> 0x00b4, TRY_LEAVE, TryCatch #2 {all -> 0x00b4, blocks: (B:36:0x00a9, B:38:0x00b1), top: B:66:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9 A[EXC_TOP_SPLITTER, PHI: r0 r8
      0x00a9: PHI (r0v3 mc3.a) = (r0v1 mc3.a), (r0v5 mc3.a) binds: [B:34:0x00a5, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r8v15 bc3.s) = (r8v13 bc3.s), (r8v19 bc3.s) binds: [B:34:0x00a5, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        if (r9 == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
    
        if (r9 == r2) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m1706v(p715kotlin.jvm.functions.Function1 r8, s83.AbstractC32269c r9) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012ab.C0682h0.m1706v(kotlin.jvm.functions.Function1, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: w */
    public List m1707w(CharSequence charSequence) {
        charSequence.getClass();
        C34249c c34249c = (C34249c) this.f2434z;
        c34249c.getClass();
        C39721h c39721h = new C39721h(c34249c, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (c39721h.hasNext()) {
            arrayList.add((String) c39721h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: x */
    public void m1708x(String str, AbstractC33975h abstractC33975h) {
        Map map = (Map) this.f2433y;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(AbstractC2875y.m8304q(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, abstractC33975h);
        if (this.f2432x > 0) {
            new HandlerC21846d(Looper.getMainLooper(), 2).post(new RunnableC4221m(this, abstractC33975h, str, 4));
        }
    }

    /* JADX INFO: renamed from: y */
    public void m1709y(Bundle bundle) {
        this.f2432x = 1;
        this.f2434z = bundle;
        for (Map.Entry entry : ((Map) this.f2433y).entrySet()) {
            ((AbstractC33975h) entry.getValue()).mo107440d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m1710z(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f2433y).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC33975h) entry.getValue()).mo107442g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public C0682h0(String str, String[] strArr) {
        String string;
        this.f2431w = 18;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append('[');
            for (String str2 : strArr) {
                if (sb4.length() > 1) {
                    sb4.append(",");
                }
                sb4.append(str2);
            }
            sb4.append("] ");
            string = sb4.toString();
        }
        this.f2434z = string;
        this.f2433y = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i13 = 2;
        while (i13 <= 7 && !Log.isLoggable((String) this.f2433y, i13)) {
            i13++;
        }
        this.f2432x = i13;
    }

    public C0682h0(C17302a c17302a, InterfaceC14506l interfaceC14506l, int i13) {
        this.f2431w = 8;
        this.f2433y = c17302a;
        this.f2434z = interfaceC14506l;
        this.f2432x = i13;
        if (i13 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    public C0682h0(int i13, byte b) {
        this.f2431w = i13;
        switch (i13) {
            case 3:
                break;
            case 12:
                this.f2433y = new C30849c(new C28526h[16]);
                break;
            case 16:
                this.f2433y = Collections.synchronizedMap(new C0022g(0));
                this.f2432x = 0;
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                this.f2433y = AbstractC25438d.m74669a();
                break;
            default:
                Object[] objArr = new Object[5];
                this.f2433y = objArr;
                this.f2434z = objArr;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    public C0682h0(C18284j c18284j, AbstractC28560y abstractC28560y) {
        Object c28520f;
        this.f2431w = 13;
        C0682h0 c0682h0Mo77527m = abstractC28560y.mo77527m();
        int i13 = c18284j.f71133w;
        if (i13 < 0) {
            AbstractC22086a.m63160c("negative nearestRange.first");
        }
        int iMin = Math.min(c18284j.f71134x, c0682h0Mo77527m.f2432x - 1);
        if (iMin < i13) {
            C0039m0 c0039m0 = AbstractC0065z0.f204a;
            AbstractC22676k.m65748h(c0039m0, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f2433y = c0039m0;
            this.f2434z = new Object[0];
            this.f2432x = 0;
            return;
        }
        int i14 = (iMin - i13) + 1;
        this.f2434z = new Object[i14];
        this.f2432x = i13;
        C0039m0 c0039m1 = new C0039m0(i14);
        C30849c c30849c = (C30849c) c0682h0Mo77527m.f2433y;
        if (i13 < 0 || i13 >= c0682h0Mo77527m.f2432x) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index ", ", size ");
            sbM30466t.append(c0682h0Mo77527m.f2432x);
            AbstractC22086a.m63162e(sbM30466t.toString());
        }
        if (iMin < 0 || iMin >= c0682h0Mo77527m.f2432x) {
            StringBuilder sbM30466t2 = AbstractC11266d.m30466t(iMin, "Index ", ", size ");
            sbM30466t2.append(c0682h0Mo77527m.f2432x);
            AbstractC22086a.m63162e(sbM30466t2.toString());
        }
        if (iMin < i13) {
            AbstractC22086a.m63158a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i13 + ')');
        }
        int iM86880g = AbstractC28560y.m86880g(i13, c30849c);
        int i15 = ((C28526h) c30849c.f127227w[iM86880g]).f115433a;
        while (i15 <= iMin) {
            C28526h c28526h = (C28526h) c30849c.f127227w[iM86880g];
            Function1 key = c28526h.f115435c.getKey();
            int i16 = c28526h.f115433a;
            int iMax = Math.max(i13, i16);
            int iMin2 = Math.min(iMin, (c28526h.f115434b + i16) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        c28520f = key.invoke(Integer.valueOf(iMax - i16));
                        c28520f = c28520f == null ? new C28520f(iMax) : c28520f;
                    }
                    c0039m1.m95h(c28520f, iMax);
                    ((Object[]) this.f2434z)[iMax - this.f2432x] = c28520f;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i15 += c28526h.f115434b;
            iM86880g++;
        }
        this.f2433y = c0039m1;
    }

    public C0682h0(C18194g c18194g) {
        this.f2431w = 10;
        this.f2433y = new SparseArray();
        this.f2434z = c18194g;
        this.f2432x = -1;
    }

    public C0682h0(C32710c c32710c) {
        this.f2431w = 15;
        this.f2433y = new SparseArray();
        this.f2434z = c32710c;
        this.f2432x = -1;
    }

    public C0682h0(int i13, C38064s c38064s) {
        this.f2431w = 0;
        this.f2432x = i13;
        this.f2433y = c38064s;
        this.f2434z = new C38059n();
    }

    public C0682h0(Context context, int i13, InterfaceC30063j interfaceC30063j) {
        this.f2431w = 9;
        this.f2432x = i13;
        this.f2433y = interfaceC30063j;
        this.f2434z = AbstractC30060g.m92088H(new C0971f(context, 5));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public C0682h0(InterfaceC26698k interfaceC26698k, C24040b c24040b) {
        boolean zEquals;
        this.f2431w = 11;
        AbstractC22465d abstractC22465d = c24040b.f95024e;
        if (abstractC22465d != null) {
            AbstractC22465d abstractC22465d2 = (AbstractC22465d) interfaceC26698k.mo14019g(AbstractC26703p.f106195b);
            AbstractC21688o abstractC21688o = (AbstractC21688o) interfaceC26698k.mo14019g(AbstractC26703p.f106194a);
            if (abstractC22465d2 == null) {
                if (abstractC22465d == null) {
                    zEquals = true;
                } else {
                    zEquals = false;
                }
            } else if (abstractC22465d == null) {
                zEquals = false;
            } else {
                zEquals = abstractC22465d2.equals(abstractC22465d);
            }
            C21677d c21677dM61002q0 = null;
            abstractC22465d = zEquals ? null : abstractC22465d;
            if (abstractC22465d != null) {
                AbstractC22465d abstractC22465d3 = abstractC22465d != null ? abstractC22465d : abstractC22465d2;
                if (abstractC22465d != null) {
                    if (interfaceC26698k.mo60986a(EnumC26688a.EPOCH_DAY)) {
                        ((C22466e) abstractC22465d3).getClass();
                        c21677dM61002q0 = C21677d.m61002q0(interfaceC26698k);
                    } else if (abstractC22465d != C22466e.f88015w || abstractC22465d2 != null) {
                        for (EnumC26688a enumC26688a : EnumC26688a.values()) {
                            if (enumC26688a.isDateBased() && interfaceC26698k.mo60986a(enumC26688a)) {
                                throw new DateTimeException("Invalid override chronology for temporal: " + abstractC22465d + " " + interfaceC26698k);
                            }
                        }
                    }
                }
                interfaceC26698k = new C24056r(c21677dM61002q0, interfaceC26698k, abstractC22465d3, abstractC21688o);
            }
        }
        this.f2433y = interfaceC26698k;
        this.f2434z = c24040b.f95022c;
    }

    public C0682h0(InterfaceC40169e interfaceC40169e) {
        this.f2431w = 6;
        C5327g1 c5327g1 = new C5327g1();
        c5327g1.f21695x = new C21567b(19);
        this.f2434z = c5327g1;
        this.f2433y = interfaceC40169e;
        this.f2432x = 1;
    }

    public C0682h0(C34249c c34249c) {
        this.f2431w = 19;
        this.f2434z = c34249c;
        this.f2433y = C39716c.f170955w;
        this.f2432x = Integer.MAX_VALUE;
    }

    public C0682h0(int i13, String str, int i14, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f2431w = 1;
        this.f2432x = i14;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f2433y = listUnmodifiableList;
        this.f2434z = bArr;
    }

    public C0682h0(Context context) {
        this.f2431w = 14;
        context.getApplicationContext();
        this.f2433y = "_androidx_security_master_key_";
    }

    public C0682h0(InterfaceC2395j3 interfaceC2395j3) {
        this.f2431w = 7;
        this.f2433y = interfaceC2395j3;
    }

    public C0682h0(int i13) {
        this.f2431w = 20;
        this.f2433y = new Object[i13 * 2];
        this.f2432x = 0;
    }
}
