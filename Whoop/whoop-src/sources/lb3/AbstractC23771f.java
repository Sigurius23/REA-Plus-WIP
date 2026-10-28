package lb3;

import dc3.C11934s;
import fa3.C14328u;
import java.util.Collection;
import java.util.List;
import kb3.C22335d;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import nb3.C26555l;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.C31161v0;
import r93.InterfaceC31126h;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: lb3.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23771f implements InterfaceC23796q0 {

    /* JADX INFO: renamed from: w */
    public int f94144w;

    /* JADX INFO: renamed from: x */
    public final C22335d f94145x;

    public AbstractC23771f(InterfaceC22345n storageManager) {
        AbstractC22676k.m65750j(storageManager, "storageManager");
        this.f94145x = new C22335d((C22342k) storageManager, new C14328u(this, 8), new C11934s(this, 8));
    }

    /* JADX INFO: renamed from: a */
    public abstract Collection mo60484a();

    /* JADX INFO: renamed from: e */
    public abstract AbstractC23811y mo69826e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC23796q0) && obj.hashCode() == hashCode()) {
            InterfaceC23796q0 interfaceC23796q0 = (InterfaceC23796q0) obj;
            if (interfaceC23796q0.getParameters().size() == getParameters().size()) {
                InterfaceC31126h interfaceC31126hMo1784d = mo1784d();
                InterfaceC31126h interfaceC31126hMo1784d2 = interfaceC23796q0.mo1784d();
                if (interfaceC31126hMo1784d2 == null || C26555l.m78685f(interfaceC31126hMo1784d) || AbstractC39363f.m125531m(interfaceC31126hMo1784d) || C26555l.m78685f(interfaceC31126hMo1784d2) || AbstractC39363f.m125531m(interfaceC31126hMo1784d2)) {
                    return false;
                }
                return mo69827i(interfaceC31126hMo1784d2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract C31161v0 mo60485g();

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final List getSupertypes() {
        return ((C23768e) this.f94145x.invoke()).f94142b;
    }

    public final int hashCode() {
        int i13 = this.f94144w;
        if (i13 != 0) {
            return i13;
        }
        InterfaceC31126h interfaceC31126hMo1784d = mo1784d();
        int iIdentityHashCode = (C26555l.m78685f(interfaceC31126hMo1784d) || AbstractC39363f.m125531m(interfaceC31126hMo1784d)) ? System.identityHashCode(this) : AbstractC39363f.m125524f(interfaceC31126hMo1784d).f152616a.hashCode();
        this.f94144w = iIdentityHashCode;
        return iIdentityHashCode;
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo69827i(InterfaceC31126h interfaceC31126h);

    /* JADX INFO: renamed from: j */
    public List mo69860j(List list) {
        return list;
    }
}
