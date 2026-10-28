package p673z7;

import android.os.IBinder;
import android.os.IInterface;
import p009a8.C0531a;
import p009a8.C0534d;
import p009a8.RunnableC0533c;
import p097ds.C12320w;
import p097ds.EnumC12315r;
import p170g8.AbstractBinderC15558b;
import p170g8.C15557a;
import p170g8.InterfaceC15559c;
import p546v7.C35752b;
import qg3.C30352d;

/* JADX INFO: renamed from: z7.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C40138b extends C0531a {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC40139c f173196c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C12320w f173197d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C35752b f173198e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40138b(C35752b c35752b, C30352d c30352d, InterfaceC40139c interfaceC40139c, C12320w c12320w) {
        super(c30352d);
        this.f173198e = c35752b;
        this.f173196c = interfaceC40139c;
        this.f173197d = c12320w;
    }

    @Override // p009a8.C0531a
    /* JADX INFO: renamed from: a */
    public final void mo1298a(IBinder iBinder) {
        InterfaceC15559c interfaceC15559c;
        this.f173198e.f152040c.getClass();
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
        this.f173196c.mo93346c(interfaceC15559c, this.f173197d);
    }

    @Override // p009a8.C0531a
    /* JADX INFO: renamed from: c */
    public final void mo1299c(Exception exc) {
        this.f173197d.m34248k(exc);
    }

    @Override // p009a8.C0531a
    /* JADX INFO: renamed from: f */
    public final C0531a mo1300f(C0534d c0534d) {
        C12320w c12320w = this.f173197d;
        synchronized (c0534d.f1848a) {
            c0534d.f1848a.add(c12320w);
            c12320w.mo31061a(new RunnableC0533c(0, c0534d, c12320w), EnumC12315r.f41243w);
        }
        return this;
    }
}
