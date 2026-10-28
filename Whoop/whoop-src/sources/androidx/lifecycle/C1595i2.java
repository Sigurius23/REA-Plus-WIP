package androidx.lifecycle;

import bc3.C3033m;
import c93.InterfaceC4339a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.i2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1595i2 implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ EnumC1635w f6257w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC1638x f6258x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3033m f6259y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f6260z;

    public C1595i2(EnumC1635w enumC1635w, AbstractC1638x abstractC1638x, C3033m c3033m, InterfaceC4339a interfaceC4339a) {
        this.f6257w = enumC1635w;
        this.f6258x = abstractC1638x;
        this.f6259y = c3033m;
        this.f6260z = interfaceC4339a;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 source, EnumC1632v event) {
        Object objM107888l;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(event, "event");
        EnumC1632v.Companion.getClass();
        EnumC1632v enumC1632vM5034b = C1626t.m5034b(this.f6257w);
        C3033m c3033m = this.f6259y;
        AbstractC1638x abstractC1638x = this.f6258x;
        if (event != enumC1632vM5034b) {
            if (event == EnumC1632v.ON_DESTROY) {
                abstractC1638x.mo4988d(this);
                c3033m.resumeWith(AbstractC34132o.m107888l(new LifecycleDestroyedException()));
                return;
            }
            return;
        }
        abstractC1638x.mo4988d(this);
        try {
            objM107888l = this.f6260z.invoke();
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        c3033m.resumeWith(objM107888l);
    }
}
