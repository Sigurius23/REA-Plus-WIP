package b23;

import aa3.C0627i1;
import android.view.contentcapture.ContentCaptureSession;
import androidx.health.platform.client.proto.C1533u;
import at.C1960d;
import at.C1961e;
import at.C1975s;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5101l0;
import com.google.crypto.tink.internal.C5110q;
import com.google.crypto.tink.internal.InterfaceC5083c0;
import com.google.crypto.tink.internal.InterfaceC5087e0;
import com.google.crypto.tink.internal.InterfaceC5091g0;
import com.google.crypto.tink.internal.InterfaceC5100l;
import com.google.crypto.tink.internal.InterfaceC5104n;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import gs.AbstractC16128d0;
import gs.AbstractC16134g0;
import gs.C16122a0;
import gs.C16126c0;
import gs.C16130e0;
import gs.C16132f0;
import gs.C16133g;
import gs.C16138i0;
import gs.C16143l;
import gs.C16146o;
import gs.C16149r;
import gs.C16152u;
import gs.C16156y;
import gt.C16177p;
import gt.InterfaceC16166e;
import is.C20869a;
import java.security.GeneralSecurityException;
import java.util.Set;
import p037bu.C3630a;
import p037bu.C3631b;
import p037bu.C3632c;
import p077d0.InterfaceC11419z;
import p127ev.AbstractC13673n;
import p154fs.AbstractC14731i;
import p154fs.AbstractC14733k;
import p200hs.C17593e;
import p505ts.AbstractC34132o;
import p560vs.C36318a4;
import p560vs.C36325b4;
import p560vs.C36332c4;
import p560vs.C36338d4;
import p560vs.C36344e4;
import p560vs.C36356g4;
import p560vs.C36403o3;
import p560vs.C36409p3;
import p560vs.C36469z3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b23.h */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2342h implements InterfaceC2339e, InterfaceC16166e, InterfaceC5104n, InterfaceC11419z, InterfaceC5091g0, InterfaceC5087e0, InterfaceC5083c0, InterfaceC5100l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9268w;

    public /* synthetic */ C2342h(int i13) {
        this.f9268w = i13;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m7219b(Object obj) {
        return (ContentCaptureSession) obj;
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5087e0
    /* JADX INFO: renamed from: c */
    public C5101l0 mo7220c(AbstractC14733k abstractC14733k) {
        switch (this.f9268w) {
            case 20:
                C16126c0 c16126c0 = (C16126c0) abstractC14733k;
                C36403o3 c36403o3M116529G = C36409p3.m116529G();
                c36403o3M116529G.m116484h("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                C36325b4 c36325b4M116186C = C36332c4.m116186C();
                c36325b4M116186C.m116168g(c16126c0.f61254a);
                c36403o3M116529G.m116485i(((C36332c4) c36325b4M116186C.m16347b()).m16109f());
                c36403o3M116529G.m116483g(AbstractC16128d0.m45684a(c16126c0.f61255b));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G.m16347b());
            default:
                C16132f0 c16132f0 = (C16132f0) abstractC14733k;
                C36403o3 c36403o3M116529G2 = C36409p3.m116529G();
                c36403o3M116529G2.m116484h("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                c36403o3M116529G2.m116485i(AbstractC16134g0.m45688b(c16132f0).m16109f());
                c36403o3M116529G2.m116483g(AbstractC16134g0.m45689c(c16132f0.f61268a));
                return C5101l0.m16023G((C36409p3) c36403o3M116529G2.m16347b());
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5104n
    /* JADX INFO: renamed from: d */
    public C5099k0 mo7221d(AbstractC34132o abstractC34132o) {
        switch (this.f9268w) {
            case 3:
                C5099k0 c5099k0 = ((C5110q) abstractC34132o).f21455a;
                C5110q.m16075V(c5099k0);
                return c5099k0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C16122a0 c16122a0 = (C16122a0) abstractC34132o;
                C36469z3 c36469z3M116134D = C36318a4.m116134D();
                C36325b4 c36325b4M116186C = C36332c4.m116186C();
                c36325b4M116186C.m116168g(c16122a0.f61237b.f61254a);
                c36469z3M116134D.m116825g((C36332c4) c36325b4M116186C.m16347b());
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((C36318a4) c36469z3M116134D.m16347b()).m16109f(), EnumC36385l3.REMOTE, AbstractC16128d0.m45684a(c16122a0.f61237b.f61255b), c16122a0.f61239d);
            default:
                C16130e0 c16130e0 = (C16130e0) abstractC34132o;
                C36338d4 c36338d4M116220D = C36344e4.m116220D();
                c36338d4M116220D.m116209g(AbstractC16134g0.m45688b(c16130e0.f61263b));
                return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((C36344e4) c36338d4M116220D.m16347b()).m16109f(), EnumC36385l3.REMOTE, AbstractC16134g0.m45689c(c16130e0.f61263b.f61268a), c16130e0.f61265d);
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5100l
    /* JADX INFO: renamed from: e */
    public AbstractC34132o mo7222e(C5099k0 c5099k0) throws GeneralSecurityException {
        switch (this.f9268w) {
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    C36318a4 c36318a4M116135E = C36318a4.m116135E((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36318a4M116135E.m116139C() == 0) {
                        return C16122a0.m45677Y(new C16126c0(c36318a4M116135E.m116138B().m116189B(), AbstractC16128d0.m45685b((EnumC36362h4) c5099k0.f21437F)), (Integer) c5099k0.f21438w);
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + c36318a4M116135E);
                } catch (InvalidProtocolBufferException e5) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e5);
                }
            default:
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    C36344e4 c36344e4M116221E = C36344e4.m116221E((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36344e4M116221E.m116225C() == 0) {
                        return C16130e0.m45686Y(AbstractC16134g0.m45687a(c36344e4M116221E.m116224B(), (EnumC36362h4) c5099k0.f21437F), (Integer) c5099k0.f21438w);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + c36344e4M116221E);
                } catch (InvalidProtocolBufferException e13) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e13);
                }
        }
    }

    @Override // gt.InterfaceC16166e
    /* JADX INFO: renamed from: f */
    public Object mo7223f(C0627i1 c0627i1) {
        Set setMo1620d = c0627i1.mo1620d(C16177p.m45715a(C3630a.class));
        C3632c c3632c = C3632c.f14786x;
        if (c3632c == null) {
            synchronized (C3632c.class) {
                try {
                    c3632c = C3632c.f14786x;
                    if (c3632c == null) {
                        c3632c = new C3632c(0);
                        C3632c.f14786x = c3632c;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return new C3631b(setMo1620d, c3632c);
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5083c0
    /* JADX INFO: renamed from: g */
    public AbstractC14733k mo7224g(C5101l0 c5101l0) throws GeneralSecurityException {
        switch (this.f9268w) {
            case 21:
                C36409p3 c36409p3 = (C36409p3) c5101l0.f21444y;
                if (!c36409p3.m116534E().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p3, new StringBuilder("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ")));
                }
                try {
                    return new C16126c0(C36332c4.m116187D(c36409p3.m116535F(), C5167p.m16298a()).m116189B(), AbstractC16128d0.m45685b(c36409p3.m116533D()));
                } catch (InvalidProtocolBufferException e5) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e5);
                }
            default:
                C36409p3 c36409p4 = (C36409p3) c5101l0.f21444y;
                if (!c36409p4.m116534E().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p4, new StringBuilder("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ")));
                }
                try {
                    return AbstractC16134g0.m45687a(C36356g4.m116271F(c36409p4.m116535F(), C5167p.m16298a()), c36409p4.m116533D());
                } catch (InvalidProtocolBufferException e13) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e13);
                }
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5091g0
    /* JADX INFO: renamed from: h */
    public Object mo7225h(AbstractC34132o abstractC34132o) {
        switch (this.f9268w) {
            case 12:
                return C1961e.m5983c((C5110q) abstractC34132o);
            case 13:
                return C1975s.m6024c((C16133g) abstractC34132o);
            case 14:
                return C1960d.m5976c((C16143l) abstractC34132o);
            case 15:
                return C1961e.m5985e((C16146o) abstractC34132o);
            case 16:
                return C20869a.m57651d((C16149r) abstractC34132o);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C16152u c16152u = (C16152u) abstractC34132o;
                return C17593e.m50104e() ? C17593e.m50103d(c16152u) : C1961e.m5986f(c16152u);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C16122a0 c16122a0 = (C16122a0) abstractC34132o;
                C16126c0 c16126c0 = c16122a0.f61237b;
                return C1961e.m5984d(AbstractC14731i.m42236a(c16126c0.f61254a).m90136c(c16126c0.f61254a), c16122a0.f61238c);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C16130e0 c16130e0 = (C16130e0) abstractC34132o;
                C16132f0 c16132f0 = c16130e0.f61263b;
                String str = c16132f0.f61269b;
                return C1961e.m5984d(C16156y.m45696c(c16132f0.f61271d, AbstractC14731i.m42236a(str).m90136c(str)), c16130e0.f61264c);
            default:
                C16138i0 c16138i0 = (C16138i0) abstractC34132o;
                return C1961e.m5989i() ? C1961e.m5988h(c16138i0) : C1961e.m5987g(c16138i0);
        }
    }

    @Override // p077d0.InterfaceC11419z
    /* JADX INFO: renamed from: i */
    public float mo7226i(float f13) {
        return f13;
    }

    @Override // b23.InterfaceC2339e
    public boolean isLoggable(EnumC2341g enumC2341g, String str) {
        AbstractC22676k.m65750j(str, "<unused var>");
        return enumC2341g.m7217a() >= EnumC2341g.ERROR.m7217a();
    }
}
