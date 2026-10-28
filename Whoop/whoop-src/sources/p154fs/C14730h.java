package p154fs;

import a33.C0352d;
import android.content.SharedPreferences;
import b30.C2570m;
import com.google.crypto.tink.internal.C5095i0;
import com.google.crypto.tink.internal.C5097j0;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5107o0;
import com.google.crypto.tink.internal.C5110q;
import com.google.crypto.tink.internal.C5111q0;
import com.google.crypto.tink.internal.C5120y;
import com.google.crypto.tink.internal.C5121z;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p075ct.C11105a;
import p505ts.AbstractC34132o;
import p560vs.C36342e2;
import p560vs.C36348f2;
import p560vs.C36433t3;
import p560vs.C36439u3;
import p560vs.C36463y3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p560vs.EnumC36397n3;
import ps.C29500b;
import qg3.C30352d;
import se.AbstractC32410a;
import ss.C32945a;

/* JADX INFO: renamed from: fs.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C14730h {

    /* JADX INFO: renamed from: a */
    public final C36439u3 f54470a;

    /* JADX INFO: renamed from: b */
    public final List f54471b;

    /* JADX INFO: renamed from: c */
    public final C32945a f54472c = C32945a.f137237b;

    public C14730h(C36439u3 c36439u3, List list) {
        this.f54470a = c36439u3;
        this.f54471b = list;
    }

    /* JADX INFO: renamed from: a */
    public static final C14730h m42231a(C36439u3 c36439u3) throws GeneralSecurityException {
        if (c36439u3.m116675C() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(c36439u3.m116675C());
        for (C36433t3 c36433t3 : c36439u3.m116676D()) {
            c36433t3.getClass();
            try {
                AbstractC34132o abstractC34132oM42233d = m42233d(c36433t3);
                int iOrdinal = c36433t3.m116648G().ordinal();
                if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                    throw new GeneralSecurityException("Unknown key status");
                }
                arrayList.add(new C14729g(abstractC34132oM42233d));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return new C14730h(c36439u3, Collections.unmodifiableList(arrayList));
    }

    /* JADX INFO: renamed from: c */
    public static final C14730h m42232c(C14728f c14728f, C29500b c29500b) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) c14728f.f54468b;
        try {
            C36348f2 c36348f2M116239D = C36348f2.m116239D(byteArrayInputStream, C5167p.m16298a());
            byteArrayInputStream.close();
            if (c36348f2M116239D.m116241B().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                C36439u3 c36439u3M116672H = C36439u3.m116672H(c29500b.mo5980b(c36348f2M116239D.m116241B().m16174g(), bArr), C5167p.m16298a());
                if (c36439u3M116672H.m116675C() > 0) {
                    return m42231a(c36439u3M116672H);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th3) {
            byteArrayInputStream.close();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC34132o m42233d(C36433t3 c36433t3) {
        try {
            C5099k0 c5099k0M15980m = C5099k0.m15980m(c36433t3.m116645D().m116435E(), c36433t3.m116645D().m116436F(), c36433t3.m116645D().m116434D(), c36433t3.m116647F(), c36433t3.m116647F() == EnumC36362h4.RAW ? null : Integer.valueOf(c36433t3.m116646E()));
            C5121z c5121z = C5121z.f21474b;
            C5111q0 c5111q0 = (C5111q0) c5121z.f21475a.get();
            c5111q0.getClass();
            return !c5111q0.f21457b.containsKey(new C5107o0(C5099k0.class, (C11105a) c5099k0M15980m.f21440y)) ? new C5110q(c5099k0M15980m) : c5121z.m16091a(c5099k0M15980m);
        } catch (GeneralSecurityException e5) {
            throw new TinkBugException("Creating a protokey serialization failed", e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m42234b(Class cls) throws GeneralSecurityException {
        Class clsM16087a;
        int i13 = AbstractC14737o.f54474a;
        try {
            clsM16087a = C5120y.f21472b.m16087a(cls);
        } catch (GeneralSecurityException unused) {
            clsM16087a = null;
        }
        if (clsM16087a == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i14 = AbstractC14740r.f54476a;
        C36439u3 c36439u3 = this.f54470a;
        int iM116677E = c36439u3.m116677E();
        Iterator it = c36439u3.m116676D().iterator();
        int i15 = 0;
        boolean z4 = false;
        boolean z13 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            EnumC36397n3 enumC36397n3 = EnumC36397n3.ENABLED;
            if (zHasNext) {
                C36433t3 c36433t3 = (C36433t3) it.next();
                if (c36433t3.m116648G() == enumC36397n3) {
                    if (!c36433t3.m116649H()) {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c36433t3.m116646E())));
                    }
                    if (c36433t3.m116647F() == EnumC36362h4.UNKNOWN_PREFIX) {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c36433t3.m116646E())));
                    }
                    if (c36433t3.m116648G() == EnumC36397n3.UNKNOWN_STATUS) {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c36433t3.m116646E())));
                    }
                    if (c36433t3.m116646E() == iM116677E) {
                        if (z4) {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                        z4 = true;
                    }
                    if (c36433t3.m116645D().m116434D() != EnumC36385l3.ASYMMETRIC_PUBLIC) {
                        z13 = false;
                    }
                    i15++;
                }
            } else {
                if (i15 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z4 && !z13) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                C2570m c2570m = new C2570m(clsM16087a);
                if (((HashMap) c2570m.f9988y) == null) {
                    throw new IllegalStateException("setAnnotations cannot be called after build");
                }
                c2570m.f9985F = this.f54472c;
                int i16 = 0;
                while (true) {
                    List list = this.f54471b;
                    if (i16 >= list.size()) {
                        HashMap map = (HashMap) c2570m.f9988y;
                        if (map == null) {
                            throw new IllegalStateException("build cannot be called twice");
                        }
                        C5097j0 c5097j0 = (C5097j0) c2570m.f9984E;
                        C32945a c32945a = (C32945a) c2570m.f9985F;
                        Class cls2 = (Class) c2570m.f9987x;
                        C0352d c0352d = new C0352d(map, c5097j0, c32945a, cls2);
                        c2570m.f9988y = null;
                        int i17 = AbstractC14737o.f54474a;
                        HashMap map2 = ((C5095i0) C5120y.f21472b.f21473a.get()).f21424b;
                        if (!map2.containsKey(cls)) {
                            throw new GeneralSecurityException(AbstractC11266d.m30459m(cls, "No wrapper found for "));
                        }
                        InterfaceC14734l interfaceC14734l = (InterfaceC14734l) map2.get(cls);
                        if (cls2.equals(interfaceC14734l.mo42238a()) && interfaceC14734l.mo42238a().equals(cls2)) {
                            return interfaceC14734l.mo42240c(c0352d);
                        }
                        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
                    }
                    C36433t3 c36433t3M116674B = c36439u3.m116674B(i16);
                    if (c36433t3M116674B.m116648G().equals(enumC36397n3)) {
                        C14729g c14729g = (C14729g) list.get(i16);
                        if (c14729g == null) {
                            StringBuilder sbM30466t = AbstractC11266d.m30466t(i16, "Key parsing of key with index ", " and type_url ");
                            sbM30466t.append(c36433t3M116674B.m116645D().m116435E());
                            sbM30466t.append(" failed, unable to get primitive");
                            throw new GeneralSecurityException(sbM30466t.toString());
                        }
                        try {
                            Object objM16088b = C5120y.f21472b.m16088b(c14729g.f54469a, clsM16087a);
                            if (c36433t3M116674B.m116646E() == c36439u3.m116677E()) {
                                c2570m.m7491k(objM16088b, c36433t3M116674B, true);
                            } else {
                                c2570m.m7491k(objM16088b, c36433t3M116674B, false);
                            }
                        } catch (GeneralSecurityException e5) {
                            throw new GeneralSecurityException("Unable to get primitive " + clsM16087a + " for key of type " + c36433t3M116674B.m116645D().m116435E() + ", see https://developers.google.com/tink/faq/registration_errors", e5);
                        }
                    }
                    i16++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m42235e(C30352d c30352d, C29500b c29500b) {
        byte[] bArr = new byte[0];
        C36439u3 c36439u3 = this.f54470a;
        byte[] bArrMo5979a = c29500b.mo5979a(c36439u3.m16108e(), bArr);
        try {
            if (!C36439u3.m116672H(c29500b.mo5980b(bArrMo5979a, bArr), C5167p.m16298a()).equals(c36439u3)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            C36342e2 c36342e2M116238C = C36348f2.m116238C();
            C5143h c5143hM16173d = AbstractC5146i.m16173d(bArrMo5979a, 0, bArrMo5979a.length);
            c36342e2M116238C.m16350e();
            C36348f2.m116240z((C36348f2) c36342e2M116238C.f21594x, c5143hM16173d);
            C36463y3 c36463y3M42243a = AbstractC14740r.m42243a(c36439u3);
            c36342e2M116238C.m16350e();
            C36348f2.m116237A((C36348f2) c36342e2M116238C.f21594x, c36463y3M42243a);
            if (!((SharedPreferences.Editor) c30352d.f124535x).putString((String) c30352d.f124536y, AbstractC32410a.m101003K(((C36348f2) c36342e2M116238C.m16347b()).m16108e())).commit()) {
                throw new IOException("Failed to write to SharedPreferences");
            }
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final String toString() {
        return AbstractC14740r.m42243a(this.f54470a).toString();
    }
}
