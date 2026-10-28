package sn;

import p299l9.C23537y;

/* JADX INFO: renamed from: sn.x */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC32767x implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C23537y f136264E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f136265w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32770z f136266x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC32722a0 f136267y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C32745m f136268z;

    public /* synthetic */ RunnableC32767x(C32770z c32770z, InterfaceC32722a0 interfaceC32722a0, C32745m c32745m, C23537y c23537y, int i13) {
        this.f136265w = i13;
        this.f136266x = c32770z;
        this.f136267y = interfaceC32722a0;
        this.f136268z = c32745m;
        this.f136264E = c23537y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f136265w) {
            case 0:
                C32770z c32770z = this.f136266x;
                this.f136267y.mo91111d(c32770z.f136275a, c32770z.f136276b, this.f136268z, this.f136264E);
                break;
            case 1:
                C32770z c32770z2 = this.f136266x;
                this.f136267y.mo91134x(c32770z2.f136275a, c32770z2.f136276b, this.f136268z, this.f136264E);
                break;
            default:
                C32770z c32770z3 = this.f136266x;
                this.f136267y.mo91107a0(c32770z3.f136275a, c32770z3.f136276b, this.f136268z, this.f136264E);
                break;
        }
    }
}
