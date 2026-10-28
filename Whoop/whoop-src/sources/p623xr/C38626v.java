package p623xr;

import p073cq.C11040i;
import p499t9.C33652u;
import sr.AbstractC32899g;

/* JADX INFO: renamed from: xr.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C38626v extends AbstractRunnableC38625u {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11040i f166135x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC32899g f166136y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C38606b f166137z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38626v(C38606b c38606b, C11040i c11040i, C11040i c11040i2, AbstractC32899g abstractC32899g) {
        super(c11040i);
        this.f166135x = c11040i2;
        this.f166136y = abstractC32899g;
        this.f166137z = c38606b;
    }

    @Override // p623xr.AbstractRunnableC38625u
    /* JADX INFO: renamed from: b */
    public final void mo103289b() {
        synchronized (this.f166137z.f166099f) {
            try {
                C38606b c38606b = this.f166137z;
                C11040i c11040i = this.f166135x;
                c38606b.f166098e.add(c11040i);
                c11040i.f34644a.addOnCompleteListener(new C33652u(c38606b, c11040i));
                if (this.f166137z.f166105l.getAndIncrement() > 0) {
                    this.f166137z.f166095b.m123818b("Already connected to the service.", new Object[0]);
                }
                C38606b.m123802b(this.f166137z, this.f166136y);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
