package p154fs;

import java.nio.charset.Charset;
import p560vs.C36433t3;
import p560vs.C36439u3;
import p560vs.C36445v3;
import p560vs.C36451w3;
import p560vs.C36457x3;
import p560vs.C36463y3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36397n3;

/* JADX INFO: renamed from: fs.r */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC14740r {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f54476a = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    public static C36463y3 m42243a(C36439u3 c36439u3) {
        C36445v3 c36445v3M116796C = C36463y3.m116796C();
        int iM116677E = c36439u3.m116677E();
        c36445v3M116796C.m16350e();
        C36463y3.m116797z((C36463y3) c36445v3M116796C.f21594x, iM116677E);
        for (C36433t3 c36433t3 : c36439u3.m116676D()) {
            C36451w3 c36451w3M116779E = C36457x3.m116779E();
            String strM116435E = c36433t3.m116645D().m116435E();
            c36451w3M116779E.m16350e();
            C36457x3.m116780z((C36457x3) c36451w3M116779E.f21594x, strM116435E);
            EnumC36397n3 enumC36397n3M116648G = c36433t3.m116648G();
            c36451w3M116779E.m16350e();
            C36457x3.m116777B((C36457x3) c36451w3M116779E.f21594x, enumC36397n3M116648G);
            EnumC36362h4 enumC36362h4M116647F = c36433t3.m116647F();
            c36451w3M116779E.m16350e();
            C36457x3.m116776A((C36457x3) c36451w3M116779E.f21594x, enumC36362h4M116647F);
            int iM116646E = c36433t3.m116646E();
            c36451w3M116779E.m16350e();
            C36457x3.m116778C((C36457x3) c36451w3M116779E.f21594x, iM116646E);
            C36457x3 c36457x3 = (C36457x3) c36451w3M116779E.m16347b();
            c36445v3M116796C.m16350e();
            C36463y3.m116795A((C36463y3) c36445v3M116796C.f21594x, c36457x3);
        }
        return (C36463y3) c36445v3M116796C.m16347b();
    }
}
