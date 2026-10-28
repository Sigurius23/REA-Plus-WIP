package p154fs;

import com.google.crypto.tink.internal.C5096j;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5108p;
import com.google.crypto.tink.internal.C5120y;
import com.google.crypto.tink.internal.C5121z;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import p505ts.InterfaceC34130m;
import p560vs.C36391m3;
import p560vs.C36409p3;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: fs.o */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC14737o {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f54474a = 0;

    static {
        Logger.getLogger(AbstractC14737o.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(InterfaceC14723a.class);
        hashSet.add(InterfaceC14725c.class);
        hashSet.add(InterfaceC14739q.class);
        hashSet.add(InterfaceC14727e.class);
        hashSet.add(InterfaceC14726d.class);
        hashSet.add(InterfaceC14732j.class);
        hashSet.add(InterfaceC34130m.class);
        hashSet.add(InterfaceC14735m.class);
        hashSet.add(InterfaceC14736n.class);
        Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: a */
    public static Object m42241a(C36391m3 c36391m3, Class cls) throws GeneralSecurityException {
        String strM116435E = c36391m3.m116435E();
        AbstractC5146i abstractC5146iM116436F = c36391m3.m116436F();
        C5108p c5108pM15971a = C5096j.f21426d.m15971a(strM116435E);
        if (c5108pM15971a.f21451b.equals(cls)) {
            return C5120y.f21472b.m16088b(C5121z.f21474b.m16091a(C5099k0.m15980m(c5108pM15971a.f21450a, abstractC5146iM116436F, c5108pM15971a.f21452c, EnumC36362h4.RAW, null)), c5108pM15971a.f21451b);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + c5108pM15971a.getClass() + ", which only supports: " + c5108pM15971a.f21451b);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C36391m3 m42242b(C36409p3 c36409p3) {
        C5108p c5108pM15971a;
        C5096j c5096j = C5096j.f21426d;
        c5108pM15971a = c5096j.m15971a(c36409p3.m116534E());
        if (!((Boolean) c5096j.f21428b.get(c36409p3.m116534E())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + c36409p3.m116534E());
        }
        return c5108pM15971a.m16074b(c36409p3.m116535F());
    }
}
