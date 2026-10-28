package p009a8;

import android.os.IBinder;
import android.os.IInterface;
import p170g8.AbstractBinderC15558b;
import p170g8.C15557a;
import p170g8.InterfaceC15559c;
import p537ux.C35331f0;
import p546v7.C35752b;
import qg3.C30352d;

/* JADX INFO: renamed from: a8.a */
/* JADX INFO: loaded from: classes5.dex */
public class C0531a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1840a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f1841b;

    public C0531a(C30352d c30352d) {
        c30352d.getClass();
        this.f1841b = c30352d;
    }

    /* JADX INFO: renamed from: b */
    private void m1295b(IBinder iBinder) {
    }

    /* JADX INFO: renamed from: d */
    private void m1296d(Exception exc) {
    }

    /* JADX INFO: renamed from: e */
    private final void m1297e(Exception exc) {
    }

    /* JADX INFO: renamed from: a */
    public void mo1298a(IBinder iBinder) {
        InterfaceC15559c interfaceC15559c;
        switch (this.f1840a) {
            case 0:
                break;
            default:
                C35752b c35752b = (C35752b) this.f1841b;
                int i13 = AbstractBinderC15558b.f58386f;
                if (iBinder == null) {
                    interfaceC15559c = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IHealthDataService");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC15559c)) {
                        C15557a c15557a = new C15557a();
                        c15557a.f58385f = iBinder;
                        interfaceC15559c = c15557a;
                    } else {
                        interfaceC15559c = (InterfaceC15559c) iInterfaceQueryLocalInterface;
                    }
                }
                c35752b.f152042e = C35331f0.m112187b(interfaceC15559c).intValue();
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo1299c(Exception exc) {
        int i13 = this.f1840a;
    }

    /* JADX INFO: renamed from: f */
    public C0531a mo1300f(C0534d c0534d) {
        int i13 = this.f1840a;
        return this;
    }

    public C0531a(C35752b c35752b, C35331f0 c35331f0, C35331f0 c35331f1) {
        this.f1841b = c35752b;
    }
}
