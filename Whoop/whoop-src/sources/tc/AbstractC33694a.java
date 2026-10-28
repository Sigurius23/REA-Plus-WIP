package tc;

import e61.C12764g;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import ht2.C17632d;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p218ic.C18389w;
import p420qc.C30198h;
import p420qc.C30199i;
import p420qc.C30200j;
import p420qc.C30202l;
import p420qc.C30207q;
import p420qc.C30213w;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: tc.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC33694a {

    /* JADX INFO: renamed from: a */
    public static final String f140784a;

    static {
        String strM52887f = C18389w.m52887f("DiagnosticsWrkr");
        AbstractC22676k.m65749i(strM52887f, "tagWithPrefix(...)");
        f140784a = strM52887f;
    }

    /* JADX INFO: renamed from: a */
    public static final String m106451a(C30202l c30202l, C30213w c30213w, C30199i c30199i, List list) {
        StringBuilder sb4 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30207q c30207q = (C30207q) it.next();
            C30200j c30200jM48869P = AbstractC17269i.m48869P(c30207q);
            String workSpecId = c30207q.f123634a;
            C30198h c30198hM92421a = c30199i.m92421a(c30200jM48869P);
            Integer numValueOf = c30198hM92421a != null ? Integer.valueOf(c30198hM92421a.f123600c) : null;
            c30202l.getClass();
            AbstractC22676k.m65750j(workSpecId, "workSpecId");
            String strM74110N0 = AbstractC25265s.m74110N0((List) AbstractC15751g.m44432L(c30202l.f123607a, true, false, new C17632d(workSpecId, 27)), ",", null, null, null, 62);
            c30213w.getClass();
            String strM74110N1 = AbstractC25265s.m74110N0((List) AbstractC15751g.m44432L(c30213w.f123670a, true, false, new C12764g(workSpecId, 18)), ",", null, null, null, 62);
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("\n", workSpecId, "\t ");
            AbstractC30007c.m91853w(numValueOf, c30207q.f123636c, "\t ", "\t ", sbM53375p);
            sbM53375p.append(c30207q.f123635b.name());
            sbM53375p.append("\t ");
            sbM53375p.append(strM74110N0);
            sbM53375p.append("\t ");
            sbM53375p.append(strM74110N1);
            sbM53375p.append('\t');
            sb4.append(sbM53375p.toString());
        }
        return sb4.toString();
    }
}
