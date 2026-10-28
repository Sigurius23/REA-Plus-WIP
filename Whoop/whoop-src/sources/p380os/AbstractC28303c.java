package p380os;

import com.google.crypto.tink.internal.C5089f0;
import com.google.crypto.tink.internal.C5106o;
import com.google.crypto.tink.internal.C5108p;
import com.google.crypto.tink.internal.C5114s;
import p154fs.InterfaceC14726d;
import p154fs.InterfaceC14727e;
import p347ns.C27093n;
import p347ns.C27095p;
import p560vs.C36361h3;
import p560vs.C36373j3;
import p560vs.EnumC36385l3;

/* JADX INFO: renamed from: os.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC28303c {

    /* JADX INFO: renamed from: a */
    public static final C5089f0 f114116a = new C5089f0(C27093n.class, InterfaceC14726d.class, new C28301a(6));

    /* JADX INFO: renamed from: b */
    public static final C5089f0 f114117b = new C5089f0(C27095p.class, InterfaceC14727e.class, new C28301a(7));

    /* JADX INFO: renamed from: c */
    public static final C5106o f114118c;

    /* JADX INFO: renamed from: d */
    public static final C5108p f114119d;

    /* JADX INFO: renamed from: e */
    public static final C5114s f114120e;

    static {
        C36361h3.m116300I();
        f114118c = C5108p.m16073a(InterfaceC14726d.class, "type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        C36373j3.m116355J();
        f114119d = new C5108p("type.googleapis.com/google.crypto.tink.HpkePublicKey", InterfaceC14727e.class, EnumC36385l3.ASYMMETRIC_PUBLIC);
        f114120e = new C5114s(11);
    }
}
