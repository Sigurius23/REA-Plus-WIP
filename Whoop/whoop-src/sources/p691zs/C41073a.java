package p691zs;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5101l0;
import com.google.crypto.tink.internal.InterfaceC5083c0;
import com.google.crypto.tink.internal.InterfaceC5087e0;
import com.google.crypto.tink.internal.InterfaceC5100l;
import com.google.crypto.tink.internal.InterfaceC5104n;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import p073cq.InterfaceC11033b;
import p127ev.AbstractC13673n;
import p154fs.AbstractC14733k;
import p154fs.C14738p;
import p505ts.AbstractC34132o;
import p560vs.C36352g0;
import p560vs.C36358h0;
import p560vs.C36364i0;
import p560vs.C36370j0;
import p560vs.C36403o3;
import p560vs.C36405p;
import p560vs.C36409p3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p659ys.C39739a;
import p659ys.C39742d;
import p659ys.C39743e;
import p659ys.C39745g;
import ro.C31624i;

/* JADX INFO: renamed from: zs.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C41073a implements InterfaceC5100l, InterfaceC5087e0, InterfaceC5083c0, InterfaceC5104n, InterfaceC11033b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f177089w;

    public /* synthetic */ C41073a(int i13) {
        this.f177089w = i13;
    }

    @Override // p073cq.InterfaceC11033b
    /* JADX INFO: renamed from: a */
    public Object mo11178a(Task task) throws IOException {
        switch (this.f177089w) {
            case 5:
                return -1;
            default:
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5087e0
    /* JADX INFO: renamed from: c */
    public C5101l0 mo7220c(AbstractC14733k abstractC14733k) {
        C39745g c39745g = (C39745g) abstractC14733k;
        C36403o3 c36403o3M116529G = C36409p3.m116529G();
        c36403o3M116529G.m116484h("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
        C36364i0 c36364i0M116338E = C36370j0.m116338E();
        c36364i0M116338E.m116308g(c39745g.f171117a.intValue());
        c36364i0M116338E.m116309h(AbstractC41075c.m133377b(c39745g));
        c36403o3M116529G.m116485i(((C36370j0) c36364i0M116338E.m16347b()).m16109f());
        c36403o3M116529G.m116483g(EnumC36362h4.RAW);
        return C5101l0.m16023G((C36409p3) c36403o3M116529G.m16347b());
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5104n
    /* JADX INFO: renamed from: d */
    public C5099k0 mo7221d(AbstractC34132o abstractC34132o) {
        C39743e c39743e = (C39743e) abstractC34132o;
        C36352g0 c36352g0M116284F = C36358h0.m116284F();
        byte[] bArrM97703F = c39743e.f171112c.m97703F(C14738p.f54475a);
        c36352g0M116284F.m116253g(AbstractC5146i.m16173d(bArrM97703F, 0, bArrM97703F.length));
        c36352g0M116284F.m116254h(AbstractC41075c.m133377b(c39743e.f171111b));
        return C5099k0.m15980m("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", ((C36358h0) c36352g0M116284F.m16347b()).m16109f(), EnumC36385l3.SYMMETRIC, EnumC36362h4.RAW, null);
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5100l
    /* JADX INFO: renamed from: e */
    public AbstractC34132o mo7222e(C5099k0 c5099k0) throws GeneralSecurityException {
        switch (this.f177089w) {
            case 0:
                C14738p c14738p = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters");
                }
                try {
                    C36405p c36405pM116509G = C36405p.m116509G((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36405pM116509G.m116514E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C39742d c39742dM133373b = AbstractC41074b.m133373b(c36405pM116509G.m116513D(), c36405pM116509G.m116512C().size());
                    C31624i c31624iM97697r = C31624i.m97697r(c36405pM116509G.m116512C().m16174g(), c14738p);
                    if (c39742dM133373b.f171105a.intValue() == c31624iM97697r.m97702E()) {
                        return new C39739a(c39742dM133373b, c31624iM97697r);
                    }
                    throw new GeneralSecurityException("Key size mismatch");
                } catch (InvalidProtocolBufferException unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacStreamingKey failed");
                }
            default:
                C14738p c14738p2 = C14738p.f54475a;
                if (!((String) c5099k0.f21439x).equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters");
                }
                try {
                    C36358h0 c36358h0M116285G = C36358h0.m116285G((AbstractC5146i) c5099k0.f21441z, C5167p.m16298a());
                    if (c36358h0M116285G.m116290E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C39745g c39745gM133376a = AbstractC41075c.m133376a(c36358h0M116285G.m116289D(), c36358h0M116285G.m116288C().size());
                    C31624i c31624iM97697r2 = C31624i.m97697r(c36358h0M116285G.m116288C().m16174g(), c14738p2);
                    if (c39745gM133376a.f171117a.intValue() == c31624iM97697r2.m97702E()) {
                        return new C39743e(c39745gM133376a, c31624iM97697r2);
                    }
                    throw new GeneralSecurityException("Key size mismatch");
                } catch (InvalidProtocolBufferException unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingKey failed");
                }
        }
    }

    @Override // com.google.crypto.tink.internal.InterfaceC5083c0
    /* JADX INFO: renamed from: g */
    public AbstractC14733k mo7224g(C5101l0 c5101l0) throws GeneralSecurityException {
        C36409p3 c36409p3 = (C36409p3) c5101l0.f21444y;
        if (!c36409p3.m116534E().equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
            throw new IllegalArgumentException(AbstractC13673n.m38566m(c36409p3, new StringBuilder("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters: ")));
        }
        try {
            C36370j0 c36370j0M116339F = C36370j0.m116339F(c36409p3.m116535F(), C5167p.m16298a());
            if (c36370j0M116339F.m116343D() == 0) {
                return AbstractC41075c.m133376a(c36370j0M116339F.m116342C(), c36370j0M116339F.m116341B());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingParameters failed: ", e5);
        }
    }

    public /* synthetic */ C41073a(C5099k0 c5099k0) {
        this.f177089w = 7;
    }
}
