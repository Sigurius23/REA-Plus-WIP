package ja3;

import c93.InterfaceC4339a;
import db3.C11890b;
import ia3.C18295a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25271y;
import oa3.C27764g;
import p715kotlin.jvm.internal.AbstractC22676k;
import pa3.C29039b;
import pa3.EnumC29038a;
import pf.AbstractC29125c;
import w93.C36969b;

/* JADX INFO: renamed from: ja3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C21520p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82547w;

    /* JADX INFO: renamed from: x */
    public final C21521q f82548x;

    public /* synthetic */ C21520p(C21521q c21521q, int i13) {
        this.f82547w = i13;
        this.f82548x = c21521q;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f82547w) {
            case 0:
                C21521q c21521q = this.f82548x;
                C27764g c27764g = ((C18295a) c21521q.f82551I.f177224x).f71234l;
                String packageFqName = c21521q.f146067F.f152613a.f152616a;
                c27764g.getClass();
                AbstractC22676k.m65750j(packageFqName, "packageFqName");
                return AbstractC25247g0.m74000i0(new ArrayList());
            case 1:
                this.f82548x.f82550H.getClass();
                return new ArrayList(AbstractC25267u.m74163i0(C25271y.f99162w, 10));
            default:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) AbstractC29125c.m88494C(this.f82548x.f82552J, C21521q.f82549N[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    C36969b c36969b = (C36969b) entry.getValue();
                    C11890b c11890bM31926c = C11890b.m31926c(str);
                    C29039b c29039b = c36969b.f158228b;
                    EnumC29038a enumC29038a = (EnumC29038a) c29039b.f117525d;
                    int iOrdinal = enumC29038a.ordinal();
                    if (iOrdinal == 2) {
                        map.put(c11890bM31926c, c11890bM31926c);
                    } else if (iOrdinal == 5) {
                        String str2 = c29039b.f117523b;
                        if (enumC29038a != EnumC29038a.MULTIFILE_CLASS_PART) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            map.put(c11890bM31926c, C11890b.m31926c(str2));
                        }
                    }
                }
                return map;
        }
    }
}
