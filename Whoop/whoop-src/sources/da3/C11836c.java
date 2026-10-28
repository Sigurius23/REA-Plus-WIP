package da3;

import ba3.C2911i;
import java.util.List;
import l83.C23465k;
import p505ts.AbstractC34132o;
import p530up.AbstractC35148d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30122c0;
import qa3.C30123c1;
import sa3.C32334h;
import sa3.C32336j;
import ua3.C34726f;
import ua3.C34727g;

/* JADX INFO: renamed from: da3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11836c extends AbstractC35148d {
    public C11836c(Metadata metadata) {
        String[] strArrM65680d1 = metadata.m65680d1();
        strArrM65680d1 = strArrM65680d1.length == 0 ? null : strArrM65680d1;
        if (strArrM65680d1 != null) {
            C23465k c23465kM109655g = C34727g.m109655g(strArrM65680d1, metadata.m65681d2());
            C34726f strings = (C34726f) c23465kM109655g.f92937w;
            C30122c0 c30122c0 = (C30122c0) c23465kM109655g.f92938x;
            boolean z4 = new C11834a(metadata.m65683mv()).compareTo(new C11834a(1, 4, 0)) < 0;
            AbstractC22676k.m65750j(c30122c0, "<this>");
            AbstractC22676k.m65750j(strings, "strings");
            C30123c1 c30123c1 = c30122c0.f123048Q;
            AbstractC22676k.m65749i(c30123c1, "getTypeTable(...)");
            AbstractC34132o.m107868M(c30122c0, new C2911i(strings, new C32334h(c30123c1), C32336j.f133837b, z4, (List) null, 48));
        }
        new C11834a(metadata.m65683mv());
        metadata.m65685xi();
    }
}
