package p105e1;

import as1.C1949j;
import p133f1.AbstractC13929c1;
import p133f1.C13926b1;
import p133f1.C13931d0;
import p133f1.C13984v;
import p133f1.C13987w;
import p133f1.InterfaceC13922a1;
import p181h2.C16617b;
import p510u0.InterfaceC34310d1;
import p635y2.InterfaceC39147y;

/* JADX INFO: renamed from: e1.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C12524k implements InterfaceC34310d1 {

    /* JADX INFO: renamed from: a */
    public long f42783a = 0;

    /* JADX INFO: renamed from: b */
    public long f42784b = 0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C12522i f42785c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC13922a1 f42786d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f42787e;

    public C12524k(long j7, C12522i c12522i, InterfaceC13922a1 interfaceC13922a1) {
        this.f42785c = c12522i;
        this.f42786d = interfaceC13922a1;
        this.f42787e = j7;
    }

    @Override // p510u0.InterfaceC34310d1
    /* JADX INFO: renamed from: a */
    public final void mo35182a() {
    }

    @Override // p510u0.InterfaceC34310d1
    /* JADX INFO: renamed from: b */
    public final void mo35183b(long j7) {
        InterfaceC39147y interfaceC39147y = (InterfaceC39147y) this.f42785c.invoke();
        InterfaceC13922a1 interfaceC13922a1 = this.f42786d;
        if (interfaceC39147y != null) {
            if (!interfaceC39147y.mo3532g()) {
                return;
            }
            C13984v c13984v = C13987w.f49896e;
            C1949j c1949j = ((C13926b1) interfaceC13922a1).f49651f;
            if (c1949j != null) {
                c1949j.invoke(Boolean.TRUE, interfaceC39147y, new C16617b(j7), c13984v);
            }
            this.f42783a = j7;
        }
        if (AbstractC13929c1.m39697a(interfaceC13922a1, this.f42787e)) {
            this.f42784b = 0L;
        }
    }

    @Override // p510u0.InterfaceC34310d1
    /* JADX INFO: renamed from: c */
    public final void mo35184c() {
    }

    @Override // p510u0.InterfaceC34310d1
    /* JADX INFO: renamed from: d */
    public final void mo35185d(long j7) {
        InterfaceC39147y interfaceC39147y = (InterfaceC39147y) this.f42785c.invoke();
        if (interfaceC39147y == null || !interfaceC39147y.mo3532g()) {
            return;
        }
        InterfaceC13922a1 interfaceC13922a1 = this.f42786d;
        if (AbstractC13929c1.m39697a(interfaceC13922a1, this.f42787e)) {
            long jM47192h = C16617b.m47192h(this.f42784b, j7);
            this.f42784b = jM47192h;
            long jM47192h2 = C16617b.m47192h(this.f42783a, jM47192h);
            if (((C13926b1) interfaceC13922a1).m39693d(interfaceC39147y, jM47192h2, this.f42783a, C13987w.f49896e, true)) {
                this.f42783a = jM47192h2;
                this.f42784b = 0L;
            }
        }
    }

    @Override // p510u0.InterfaceC34310d1
    public final void onCancel() {
        C13931d0 c13931d0;
        long j7 = this.f42787e;
        InterfaceC13922a1 interfaceC13922a1 = this.f42786d;
        if (!AbstractC13929c1.m39697a(interfaceC13922a1, j7) || (c13931d0 = ((C13926b1) interfaceC13922a1).f49653h) == null) {
            return;
        }
        c13931d0.invoke();
    }

    @Override // p510u0.InterfaceC34310d1
    public final void onStop() {
        C13931d0 c13931d0;
        long j7 = this.f42787e;
        InterfaceC13922a1 interfaceC13922a1 = this.f42786d;
        if (!AbstractC13929c1.m39697a(interfaceC13922a1, j7) || (c13931d0 = ((C13926b1) interfaceC13922a1).f49653h) == null) {
            return;
        }
        c13931d0.invoke();
    }
}
