package p540v1;

import java.util.Iterator;
import m83.AbstractC25254k;
import p002a0.C0053t0;
import p476s1.InterfaceC32058e;
import p511u1.C34396c;
import p569w1.C36688b;

/* JADX INFO: renamed from: v1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C35524b extends AbstractC25254k implements InterfaceC32058e {

    /* JADX INFO: renamed from: z */
    public static final C35524b f151145z;

    /* JADX INFO: renamed from: w */
    public final Object f151146w;

    /* JADX INFO: renamed from: x */
    public final Object f151147x;

    /* JADX INFO: renamed from: y */
    public final C34396c f151148y;

    static {
        C36688b c36688b = C36688b.f157125a;
        f151145z = new C35524b(c36688b, c36688b, C34396c.f144601y);
    }

    public C35524b(Object obj, Object obj2, C34396c c34396c) {
        this.f151146w = obj;
        this.f151147x = obj2;
        this.f151148y = c34396c;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        C34396c c34396c = this.f151148y;
        c34396c.getClass();
        return c34396c.f144603x;
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f151148y.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0053t0(this.f151146w, this.f151148y);
    }
}
