package oa3;

import com.google.crypto.tink.internal.C5099k0;
import gm.C15990r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m63.C25126d;
import p619xl.C38445a;
import va3.C35845c;
import w93.C36968a;

/* JADX INFO: renamed from: oa3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C27759b extends C15990r {

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C38445a f111940F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27759b(C38445a c38445a, C27775r c27775r) {
        super(c38445a, c27775r);
        this.f111940F = c38445a;
    }

    /* JADX INFO: renamed from: X */
    public final C25126d m83858X(int i13, C35845c c35845c, C36968a c36968a) {
        C27775r c27775r = new C27775r(((C27775r) this.f60512x).f111972a + '@' + i13);
        C38445a c38445a = this.f111940F;
        HashMap map = (HashMap) c38445a.f164637y;
        List arrayList = (List) map.get(c27775r);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(c27775r, arrayList);
        }
        return ((C5099k0) c38445a.f164636x).m15989G(c35845c, c36968a, arrayList);
    }
}
