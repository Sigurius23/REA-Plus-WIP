package p123en;

import ed3.C13117a;
import in.C18715c;
import in.InterfaceC18714b;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Arrays;
import org.joda.time.DateTimeConstants;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p497t7.InterfaceC33561b;
import p690zr.AbstractC41023g0;
import s40.AbstractC32145e0;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: en.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C13360g extends AbstractC13361h {

    /* JADX INFO: renamed from: o */
    public static final byte[] f46694o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p */
    public static final byte[] f46695p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: g */
    public static boolean m37621g(C13117a c13117a, byte[] bArr) {
        if (c13117a.m36692a() < bArr.length) {
            return false;
        }
        int i13 = c13117a.f45382b;
        byte[] bArr2 = new byte[bArr.length];
        c13117a.m36697g(bArr2, 0, bArr.length);
        c13117a.m36689K(i13);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: b */
    public final long mo37613b(C13117a c13117a) {
        int i13;
        int i14;
        byte[] bArr = c13117a.f45381a;
        byte b = bArr[0];
        int i15 = b & 255;
        int i16 = b & 3;
        if (i16 != 0) {
            i13 = 2;
            if (i16 != 1 && i16 != 2) {
                i13 = bArr[1] & 63;
            }
        } else {
            i13 = 1;
        }
        int i17 = i15 >> 3;
        int i18 = i17 & 3;
        if (i17 >= 16) {
            i14 = 2500 << i18;
        } else if (i17 >= 12) {
            i14 = InterfaceC33561b.INVALID_OWNERSHIP << (i17 & 1);
        } else {
            i14 = i18 == 3 ? DateTimeConstants.MILLIS_PER_MINUTE : InterfaceC33561b.INVALID_OWNERSHIP << i18;
        }
        return (((long) this.f46701f) * (((long) i13) * ((long) i14))) / 1000000;
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: d */
    public final boolean mo37614d(C13117a c13117a, long j7, C20378c c20378c) {
        if (m37621g(c13117a, f46694o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c13117a.f45381a, c13117a.f45383c);
            int i13 = bArrCopyOf[9] & 255;
            ArrayList arrayListM107327a = AbstractC33922a.m107327a(bArrCopyOf);
            AbstractC24543a.m71573i(((C31521c0) c20378c.f76422x) == null);
            C31518b0 c31518b0 = new C31518b0();
            c31518b0.f130047k = "audio/opus";
            c31518b0.f130060x = i13;
            c31518b0.f130061y = 48000;
            c31518b0.f130049m = arrayListM107327a;
            c20378c.f76422x = new C31521c0(c31518b0);
            return true;
        }
        if (!m37621g(c13117a, f46695p)) {
            AbstractC24543a.m71574j((C31521c0) c20378c.f76422x);
            return false;
        }
        AbstractC24543a.m71574j((C31521c0) c20378c.f76422x);
        c13117a.m36690L(8);
        C18715c c18715cM100099f = AbstractC32145e0.m100099f(AbstractC41023g0.m133253n(AbstractC32145e0.m100101h(c13117a, false, false).f140425a));
        if (c18715cM100099f == null) {
            return true;
        }
        C31518b0 c31518b0M97113a = ((C31521c0) c20378c.f76422x).m97113a();
        C18715c c18715c = ((C31521c0) c20378c.f76422x).f130075J;
        if (c18715c != null) {
            InterfaceC18714b[] interfaceC18714bArr = c18715c.f73525w;
            if (interfaceC18714bArr.length != 0) {
                InterfaceC18714b[] interfaceC18714bArr2 = c18715cM100099f.f73525w;
                int i14 = AbstractC24567y.f95875a;
                Object[] objArrCopyOf = Arrays.copyOf(interfaceC18714bArr2, interfaceC18714bArr2.length + interfaceC18714bArr.length);
                System.arraycopy(interfaceC18714bArr, 0, objArrCopyOf, interfaceC18714bArr2.length, interfaceC18714bArr.length);
                c18715cM100099f = new C18715c((InterfaceC18714b[]) objArrCopyOf);
            }
        }
        c31518b0M97113a.f130045i = c18715cM100099f;
        c20378c.f76422x = new C31521c0(c31518b0M97113a);
        return true;
    }
}
