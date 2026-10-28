package r93;

import java.util.List;
import kb3.C22336e;
import kb3.C22342k;
import m83.AbstractC25265s;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import u93.C34696q;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;

/* JADX INFO: renamed from: r93.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31115d0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128319w;

    /* JADX INFO: renamed from: x */
    public final C41113q f128320x;

    public /* synthetic */ C31115d0(C41113q c41113q, int i13) {
        this.f128319w = i13;
        this.f128320x = c41113q;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f128319w) {
            case 0:
                C35847e fqName = (C35847e) obj;
                AbstractC22676k.m65750j(fqName, "fqName");
                return new C34696q((InterfaceC31109b0) this.f128320x.f177225y, fqName);
            default:
                C31118e0 c31118e0 = (C31118e0) obj;
                AbstractC22676k.m65750j(c31118e0, "<destruct>");
                C35845c c35845cM95865a = c31118e0.m95865a();
                List listM95866b = c31118e0.m95866b();
                if (c35845cM95865a.f152611c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + c35845cM95865a);
                }
                C35845c c35845cM113776e = c35845cM95865a.m113776e();
                C41113q c41113q = this.f128320x;
                InterfaceC31123g interfaceC31123gM133473t = c35845cM113776e != null ? c41113q.m133473t(c35845cM113776e, AbstractC25265s.m74161z0(listM95866b, 1)) : (InterfaceC31123g) ((C22336e) c41113q.f177226z).invoke(c35845cM95865a.f152609a);
                boolean zM113778g = c35845cM95865a.m113778g();
                C22342k c22342k = (C22342k) c41113q.f177224x;
                C35850h c35850hM113777f = c35845cM95865a.m113777f();
                Integer num = (Integer) AbstractC25265s.m74100H0(listM95866b);
                return new C31121f0(c22342k, interfaceC31123gM133473t, c35850hM113777f, zM113778g, num != null ? num.intValue() : 0);
        }
    }
}
