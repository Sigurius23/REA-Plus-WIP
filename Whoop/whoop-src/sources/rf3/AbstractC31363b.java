package rf3;

import java.util.ArrayList;
import m83.AbstractC25265s;
import nf3.C26669a;
import org.koin.core.error.InstanceCreationException;
import p005a3.C0237p;
import p108e4.AbstractC12682p;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qf3.C30330b;
import uf3.C34911a;
import xf3.C38266c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: rf3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31363b {

    /* JADX INFO: renamed from: a */
    public final C30330b f129023a;

    public AbstractC31363b(C30330b c30330b) {
        this.f129023a = c30330b;
    }

    /* JADX INFO: renamed from: a */
    public Object mo96460a(C0237p c0237p) throws InstanceCreationException {
        C26669a c26669a = (C26669a) c0237p.f812x;
        boolean zM92137D = c26669a.f106048c.m92137D(1);
        C30330b c30330b = this.f129023a;
        if (zM92137D) {
            c26669a.f106048c.m92139r(AbstractC22676k.m65755o(c30330b, "| create instance for "));
        }
        try {
            C34911a c34911a = (C34911a) c0237p.f814z;
            if (c34911a == null) {
                c34911a = new C34911a(new ArrayList());
            }
            return c30330b.f124473d.invoke((C38266c) c0237p.f813y, c34911a);
        } catch (Exception e5) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(e5);
            sb4.append("\n\t");
            StackTraceElement[] stackTrace = e5.getStackTrace();
            AbstractC22676k.m65749i(stackTrace, "e.stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                AbstractC22676k.m65749i(className, "it.className");
                if (AbstractC39414r.m125876U(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb4.append(AbstractC25265s.m74110N0(arrayList, "\n\t", null, null, null, 62));
            String string = sb4.toString();
            AbstractC30060g abstractC30060g = c26669a.f106048c;
            String msg = "Instance creation error : could not create instance for " + c30330b + ": " + string;
            abstractC30060g.getClass();
            AbstractC22676k.m65750j(msg, "msg");
            if (AbstractC12682p.m35482b(4, 3) <= 0) {
                abstractC30060g.mo48820I(3, msg);
            }
            String msg2 = AbstractC22676k.m65755o(c30330b, "Could not create instance for ");
            AbstractC22676k.m65750j(msg2, "msg");
            throw new InstanceCreationException(msg2, e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo96459b(C0237p c0237p);
}
