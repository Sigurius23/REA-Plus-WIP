package p299l9;

import c93.InterfaceC4339a;
import p171g9.C15587d;
import p607x8.InterfaceC38049d;
import p73.InterfaceC28960a;
import rq0.C31677k;

/* JADX INFO: renamed from: l9.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23494e0 implements InterfaceC38049d, InterfaceC28960a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f92998w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f92999x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f93000y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f93001z;

    public /* synthetic */ C23494e0(C15587d c15587d, C23527t c23527t, C23537y c23537y, int i13) {
        this.f92999x = c15587d;
        this.f93000y = c23527t;
        this.f93001z = c23537y;
        this.f92998w = i13;
    }

    @Override // p607x8.InterfaceC38049d
    public void accept(Object obj) {
        C15587d c15587d = (C15587d) this.f92999x;
        ((InterfaceC23506i0) obj).mo8319f(c15587d.f58537a, c15587d.f58538b, (C23527t) this.f93000y, (C23537y) this.f93001z, this.f92998w);
    }

    @Override // p73.InterfaceC28960a
    public void run() {
        C31677k.m98141f0((C31677k) this.f92999x, this.f92998w, (String) this.f93000y, (InterfaceC4339a) this.f93001z);
    }

    public /* synthetic */ C23494e0(C31677k c31677k, int i13, String str, InterfaceC4339a interfaceC4339a) {
        this.f92999x = c31677k;
        this.f92998w = i13;
        this.f93000y = str;
        this.f93001z = interfaceC4339a;
    }
}
