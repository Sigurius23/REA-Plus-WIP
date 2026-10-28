package ls;

import a33.C0352d;
import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5097j0;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5110q;
import com.google.crypto.tink.internal.C5117v;
import com.google.crypto.tink.internal.C5118w;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import p154fs.AbstractC14724b;
import p154fs.AbstractC14737o;
import p154fs.InterfaceC14725c;
import p560vs.C36379k3;
import p560vs.C36391m3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p715kotlin.jvm.internal.AbstractC22674j;
import u00.C34377e;

/* JADX INFO: renamed from: ls.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C24709f implements InterfaceC14725c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f96637a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f96638b;

    /* JADX INFO: renamed from: c */
    public final Object f96639c;

    /* JADX INFO: renamed from: d */
    public final Object f96640d;

    public C24709f(C0352d c0352d) {
        C34377e c34377e = AbstractC5078a.f21388h;
        this.f96638b = c0352d;
        if (!c0352d.m953z()) {
            this.f96639c = c34377e;
            this.f96640d = c34377e;
            return;
        }
        C5117v c5117vM16084a = C5118w.f21467b.m16084a();
        AbstractC5078a.m15936i(c0352d);
        c5117vM16084a.getClass();
        this.f96639c = c34377e;
        this.f96640d = c34377e;
    }

    /* JADX INFO: renamed from: c */
    public static C24709f m72318c(C5110q c5110q) throws GeneralSecurityException {
        byte[] bArrArray;
        C5099k0 c5099k0 = c5110q.f21455a;
        C5110q.m16075V(c5099k0);
        C36379k3 c36379k3M116432G = C36391m3.m116432G();
        c36379k3M116432G.m116388h((String) c5099k0.f21439x);
        c36379k3M116432G.m116389i((AbstractC5146i) c5099k0.f21441z);
        c36379k3M116432G.m116387g((EnumC36385l3) c5099k0.f21436E);
        InterfaceC14725c interfaceC14725c = (InterfaceC14725c) AbstractC14737o.m42241a((C36391m3) c36379k3M116432G.m16347b(), InterfaceC14725c.class);
        EnumC36362h4 enumC36362h4 = (EnumC36362h4) c5099k0.f21437F;
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + enumC36362h4.m116306b());
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        } else {
            bArrArray = new byte[0];
        }
        return new C24709f(interfaceC14725c, enumC36362h4, bArrArray);
    }

    @Override // p154fs.InterfaceC14725c
    /* JADX INFO: renamed from: a */
    public final byte[] mo5993a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f96637a) {
            case 0:
                C34377e c34377e = (C34377e) this.f96639c;
                C0352d c0352d = (C0352d) this.f96638b;
                try {
                    byte[] bArrMo5993a = ((InterfaceC14725c) ((C5097j0) c0352d.f1238y).f21429a).mo5993a(bArr, bArr2);
                    int i13 = ((C5097j0) c0352d.f1238y).f21432d;
                    int length = bArr.length;
                    c34377e.getClass();
                    return bArrMo5993a;
                } catch (GeneralSecurityException e5) {
                    c34377e.getClass();
                    throw e5;
                }
            default:
                InterfaceC14725c interfaceC14725c = (InterfaceC14725c) this.f96638b;
                return ((EnumC36362h4) this.f96639c) == EnumC36362h4.RAW ? interfaceC14725c.mo5993a(bArr, bArr2) : AbstractC22674j.m65737w((byte[]) this.f96640d, interfaceC14725c.mo5993a(bArr, bArr2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    @Override // p154fs.InterfaceC14725c
    /* JADX INFO: renamed from: b */
    public final byte[] mo5994b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it;
        byte[] bArrMo5994b;
        switch (this.f96637a) {
            case 0:
                C0352d c0352d = (C0352d) this.f96638b;
                C34377e c34377e = (C34377e) this.f96640d;
                if (bArr.length <= 5) {
                    it = c0352d.m949v(AbstractC14724b.f54463a).iterator();
                    while (it.hasNext()) {
                        bArrMo5994b = ((InterfaceC14725c) ((C5097j0) it.next()).f21429a).mo5994b(bArr, bArr2);
                        c34377e.getClass();
                    }
                    c34377e.getClass();
                    throw new GeneralSecurityException("decryption failed");
                }
                Iterator it3 = c0352d.m949v(Arrays.copyOf(bArr, 5)).iterator();
                while (it3.hasNext()) {
                    try {
                        bArrMo5994b = ((InterfaceC14725c) ((C5097j0) it3.next()).f21429a).mo5994b(bArr, bArr2);
                        c34377e.getClass();
                    } catch (GeneralSecurityException unused) {
                    }
                }
                it = c0352d.m949v(AbstractC14724b.f54463a).iterator();
                while (it.hasNext()) {
                    try {
                        bArrMo5994b = ((InterfaceC14725c) ((C5097j0) it.next()).f21429a).mo5994b(bArr, bArr2);
                        c34377e.getClass();
                    } catch (GeneralSecurityException unused2) {
                    }
                }
                c34377e.getClass();
                throw new GeneralSecurityException("decryption failed");
                return bArrMo5994b;
            default:
                InterfaceC14725c interfaceC14725c = (InterfaceC14725c) this.f96638b;
                if (((EnumC36362h4) this.f96639c) == EnumC36362h4.RAW) {
                    return interfaceC14725c.mo5994b(bArr, bArr2);
                }
                if (AbstractC5113r0.m16077a((byte[]) this.f96640d, bArr)) {
                    return interfaceC14725c.mo5994b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
        }
    }

    public C24709f(InterfaceC14725c interfaceC14725c, EnumC36362h4 enumC36362h4, byte[] bArr) {
        this.f96638b = interfaceC14725c;
        this.f96639c = enumC36362h4;
        this.f96640d = bArr;
    }
}
