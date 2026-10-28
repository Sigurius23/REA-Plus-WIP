package ch3;

import android.content.Context;
import android.content.IntentFilter;
import jh3.C21705f;
import mh3.C25565b;
import p098dt.AbstractC12350b;
import p101dx.C12420a;
import p101dx.C12421b;
import xg3.AbstractC38292s;
import xg3.InterfaceC38278e;
import xg3.InterfaceC38279f;

/* JADX INFO: renamed from: ch3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C4703q implements InterfaceC38278e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19253w;

    /* JADX INFO: renamed from: x */
    public final Object f19254x;

    /* JADX INFO: renamed from: y */
    public final Object f19255y;

    public /* synthetic */ C4703q(int i13, Object obj, Object obj2) {
        this.f19253w = i13;
        this.f19254x = obj;
        this.f19255y = obj2;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f19253w) {
            case 0:
                AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
                try {
                    InterfaceC38279f interfaceC38279f = (InterfaceC38279f) this.f19255y;
                    C21705f.f83334f.m61159c().getClass();
                    AbstractC38292s abstractC38292s2 = (AbstractC38292s) interfaceC38279f.mo1678b(abstractC38292s);
                    try {
                        abstractC38292s2.mo14748d();
                        ((InterfaceC38278e) this.f19254x).mo9472b(abstractC38292s2);
                    } catch (Throwable th3) {
                        AbstractC12350b.m34573V(th3);
                        abstractC38292s2.onError(th3);
                    }
                } catch (Throwable th4) {
                    AbstractC12350b.m34573V(th4);
                    abstractC38292s.onError(th4);
                    return;
                }
                break;
            default:
                AbstractC38292s abstractC38292s3 = (AbstractC38292s) obj;
                C12420a c12420a = new C12420a(abstractC38292s3, 0);
                abstractC38292s3.m122688c(new C25565b(new C12421b(0, this, c12420a)));
                ((Context) this.f19254x).registerReceiver(c12420a, (IntentFilter) this.f19255y, null, null);
                break;
        }
    }
}
