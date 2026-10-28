package p559vr;

import p073cq.C11040i;
import p412q3.C29875i;
import p532ur.C35176e;

/* JADX INFO: renamed from: vr.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C36297g extends AbstractRunnableC36295e {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11040i f155536x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C35176e f155537y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C36299i f155538z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36297g(C36299i c36299i, C11040i c11040i, C11040i c11040i2, C35176e c35176e) {
        super(c11040i);
        this.f155536x = c11040i2;
        this.f155537y = c35176e;
        this.f155538z = c36299i;
    }

    @Override // p559vr.AbstractRunnableC36295e
    /* JADX INFO: renamed from: a */
    public final void mo111312a() {
        synchronized (this.f155538z.f155547f) {
            try {
                C36299i c36299i = this.f155538z;
                C11040i c11040i = this.f155536x;
                c36299i.f155546e.add(c11040i);
                c11040i.f34644a.addOnCompleteListener(new C29875i(c36299i, c11040i));
                if (this.f155538z.f155552k.getAndIncrement() > 0) {
                    this.f155538z.f155543b.m31831q("Already connected to the service.", new Object[0]);
                }
                C36299i.m116020b(this.f155538z, this.f155537y);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
