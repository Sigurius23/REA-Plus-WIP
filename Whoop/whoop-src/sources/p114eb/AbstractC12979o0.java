package p114eb;

import android.content.Context;
import androidx.lifecycle.RunnableC1605m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc.C32352b;

/* JADX INFO: renamed from: eb.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12979o0 {

    /* JADX INFO: renamed from: a */
    public final Object f44827a;

    /* JADX INFO: renamed from: b */
    public final Object f44828b;

    /* JADX INFO: renamed from: c */
    public final Object f44829c;

    /* JADX INFO: renamed from: d */
    public final Object f44830d;

    /* JADX INFO: renamed from: e */
    public Object f44831e;

    public AbstractC12979o0(Context context, C32352b c32352b) {
        this.f44827a = c32352b;
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        this.f44828b = applicationContext;
        this.f44829c = new Object();
        this.f44830d = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public C12977n0 mo36473a() {
        C12977n0 c12977n0Mo36474b = mo36474b();
        c12977n0Mo36474b.f44825z = null;
        for (Map.Entry entry : ((LinkedHashMap) this.f44829c).entrySet()) {
            String argumentName = (String) entry.getKey();
            C12971l argument = (C12971l) entry.getValue();
            AbstractC22676k.m65750j(argumentName, "argumentName");
            AbstractC22676k.m65750j(argument, "argument");
            c12977n0Mo36474b.f44818G.put(argumentName, argument);
        }
        Iterator it = ((ArrayList) this.f44831e).iterator();
        while (it.hasNext()) {
            c12977n0Mo36474b.m36463a((C12954f0) it.next());
        }
        for (Map.Entry entry2 : ((LinkedHashMap) this.f44830d).entrySet()) {
            c12977n0Mo36474b.m36470n(((Number) entry2.getKey()).intValue(), (C12956g) entry2.getValue());
        }
        String str = (String) this.f44828b;
        if (str != null) {
            c12977n0Mo36474b.m36471o(str);
        }
        return c12977n0Mo36474b;
    }

    /* JADX INFO: renamed from: b */
    public C12977n0 mo36474b() {
        return ((AbstractC12964i1) this.f44827a).mo36423a();
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo36475c();

    /* JADX INFO: renamed from: d */
    public void m36476d(Object obj) {
        synchronized (this.f44829c) {
            Object obj2 = this.f44831e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f44831e = obj;
                ((C32352b) this.f44827a).f133918d.execute(new RunnableC1605m(27, AbstractC25265s.m74093D1((LinkedHashSet) this.f44830d), this));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo36477e();

    /* JADX INFO: renamed from: f */
    public abstract void mo36478f();

    public AbstractC12979o0(AbstractC12964i1 navigator, String str) {
        AbstractC22676k.m65750j(navigator, "navigator");
        this.f44827a = navigator;
        this.f44828b = str;
        this.f44829c = new LinkedHashMap();
        this.f44831e = new ArrayList();
        this.f44830d = new LinkedHashMap();
    }
}
