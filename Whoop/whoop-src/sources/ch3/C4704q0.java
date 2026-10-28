package ch3;

import dh3.C12052a;
import fh3.C14493a;
import jh3.AbstractC21700a;
import mh3.C25565b;
import p037bu.C3632c;
import p098dt.AbstractC12350b;
import xg3.AbstractC38292s;
import xg3.C38280g;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: ch3.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4704q0 extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public boolean f19256E;

    /* JADX INFO: renamed from: F */
    public long f19257F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ AbstractC38292s f19258G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C12052a f19259H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C25565b f19260I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C4673b0 f19261J;

    public C4704q0(C4673b0 c4673b0, AbstractC38292s abstractC38292s, C12052a c12052a, C25565b c25565b) {
        this.f19261J = c4673b0;
        this.f19258G = abstractC38292s;
        this.f19259H = c12052a;
        this.f19260I = c25565b;
    }

    @Override // xg3.AbstractC38292s
    /* JADX INFO: renamed from: f */
    public final void mo14765f(InterfaceC38282i interfaceC38282i) {
        this.f19259H.m33225c(interfaceC38282i);
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        if (this.f19256E) {
            return;
        }
        this.f19256E = true;
        this.f19258G.onCompleted();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        if (this.f19256E) {
            AbstractC12350b.m34573V(th3);
            AbstractC21700a.m61126a(th3);
            return;
        }
        this.f19256E = true;
        try {
            mo14750b();
            C4702p0 c4702p0 = new C4702p0(this, 0);
            ((C14493a) this.f19260I.f100259x).m41405c(c4702p0);
            long j7 = this.f19257F;
            if (j7 != 0) {
                this.f19259H.m33224b(j7);
            }
            ((C38280g) ((C3632c) this.f19261J.f19128x).mo1678b(th3)).m122671W(c4702p0);
        } catch (Throwable th4) {
            AbstractC12350b.m34574W(th4, this.f19258G);
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        if (this.f19256E) {
            return;
        }
        this.f19257F++;
        this.f19258G.onNext(obj);
    }
}
