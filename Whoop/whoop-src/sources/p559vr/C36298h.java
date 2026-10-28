package p559vr;

import androidx.room.ServiceConnectionC1767b0;

/* JADX INFO: renamed from: vr.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C36298h extends AbstractRunnableC36295e {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f155539x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f155540y;

    public /* synthetic */ C36298h(Object obj, int i13) {
        this.f155539x = i13;
        this.f155540y = obj;
    }

    @Override // p559vr.AbstractRunnableC36295e
    /* JADX INFO: renamed from: a */
    public final void mo111312a() {
        switch (this.f155539x) {
            case 0:
                synchronized (((C36299i) this.f155540y).f155547f) {
                    try {
                        if (((C36299i) this.f155540y).f155552k.get() > 0 && ((C36299i) this.f155540y).f155552k.decrementAndGet() > 0) {
                            ((C36299i) this.f155540y).f155543b.m31831q("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C36299i c36299i = (C36299i) this.f155540y;
                        if (c36299i.f155554m != null) {
                            c36299i.f155543b.m31831q("Unbind from service.", new Object[0]);
                            C36299i c36299i2 = (C36299i) this.f155540y;
                            c36299i2.f155542a.unbindService(c36299i2.f155553l);
                            C36299i c36299i3 = (C36299i) this.f155540y;
                            c36299i3.f155548g = false;
                            c36299i3.f155554m = null;
                            c36299i3.f155553l = null;
                        }
                        ((C36299i) this.f155540y).m116022c();
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            default:
                C36299i c36299i4 = (C36299i) ((ServiceConnectionC1767b0) this.f155540y).f6963x;
                c36299i4.f155543b.m31831q("unlinkToDeath", new Object[0]);
                ((C36292b) c36299i4.f155554m).f155531f.unlinkToDeath(c36299i4.f155551j, 0);
                c36299i4.f155554m = null;
                c36299i4.f155548g = false;
                return;
        }
    }
}
