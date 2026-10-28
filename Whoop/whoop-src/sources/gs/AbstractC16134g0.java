package gs;

import a00.C0072g;
import b23.C2342h;
import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p154fs.AbstractC14724b;
import p154fs.AbstractC14733k;
import p560vs.C36350f4;
import p560vs.C36356g4;
import p560vs.C36403o3;
import p560vs.C36409p3;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: gs.g0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16134g0 {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f61277a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f61278b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f61279c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f61280d;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f61277a = new C5085d0(C16132f0.class, new C2342h(24));
        f61278b = new C5081b0(c11105aM16079c, new C2342h(25));
        f61279c = new C5102m(C16130e0.class, new C2342h(26));
        f61280d = new C5098k(c11105aM16079c, new C2342h(27));
    }

    /* JADX INFO: renamed from: a */
    public static C16132f0 m45687a(C36356g4 c36356g4, EnumC36362h4 enumC36362h4) throws GeneralSecurityException {
        C16124b0 c16124b0;
        C16124b0 c16124b1;
        C36403o3 c36403o3M116529G = C36409p3.m116529G();
        c36403o3M116529G.m116484h(c36356g4.m116273C().m116534E());
        c36403o3M116529G.m116485i(c36356g4.m116273C().m116535F());
        c36403o3M116529G.m116483g(EnumC36362h4.RAW);
        AbstractC14733k abstractC14733kM42225b = AbstractC14724b.m42225b(((C36409p3) c36403o3M116529G.m16347b()).m16108e());
        if (abstractC14733kM42225b instanceof C16148q) {
            c16124b0 = C16124b0.f61243e;
        } else if (abstractC14733kM42225b instanceof C16154w) {
            c16124b0 = C16124b0.f61245g;
        } else if (abstractC14733kM42225b instanceof C16142k0) {
            c16124b0 = C16124b0.f61244f;
        } else if (abstractC14733kM42225b instanceof C16141k) {
            c16124b0 = C16124b0.f61246h;
        } else if (abstractC14733kM42225b instanceof C16145n) {
            c16124b0 = C16124b0.f61247i;
        } else {
            if (!(abstractC14733kM42225b instanceof C16151t)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + abstractC14733kM42225b);
            }
            c16124b0 = C16124b0.f61248j;
        }
        C0072g c0072g = new C0072g(11, false);
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            c16124b1 = C16124b0.f61249k;
        } else {
            if (iOrdinal != 3) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC36362h4.m116306b());
            }
            c16124b1 = C16124b0.f61250l;
        }
        c0072g.m177M(c16124b1);
        c0072g.m174J(c36356g4.m116274D());
        c0072g.m169E((AbstractC16127d) abstractC14733kM42225b);
        c0072g.m170F(c16124b0);
        return c0072g.m189g();
    }

    /* JADX INFO: renamed from: b */
    public static C36356g4 m45688b(C16132f0 c16132f0) throws GeneralSecurityException {
        try {
            C36409p3 c36409p3M116531I = C36409p3.m116531I(AbstractC14724b.m42226c(c16132f0.f61271d), C5167p.m16298a());
            C36350f4 c36350f4M116270E = C36356g4.m116270E();
            c36350f4M116270E.m116251h(c16132f0.f61269b);
            c36350f4M116270E.m116250g(c36409p3M116531I);
            return (C36356g4) c36350f4M116270E.m16347b();
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static EnumC36362h4 m45689c(C16124b0 c16124b0) {
        if (C16124b0.f61249k.equals(c16124b0)) {
            return EnumC36362h4.TINK;
        }
        if (C16124b0.f61250l.equals(c16124b0)) {
            return EnumC36362h4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c16124b0);
    }
}
