package p335n6;

import p545v6.C35720i;

/* JADX INFO: renamed from: n6.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C26393j implements InterfaceC26392i {

    /* JADX INFO: renamed from: b */
    public InterfaceC26401r f104845b;

    /* JADX INFO: renamed from: c */
    public Float f104846c;

    /* JADX INFO: renamed from: a */
    public InterfaceC26398o f104844a = C26396m.f104850a;

    /* JADX INFO: renamed from: d */
    public int f104847d = 1;

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: a */
    public final InterfaceC26392i mo78103a() {
        C26393j c26393j = new C26393j();
        c26393j.f104844a = this.f104844a;
        c26393j.f104845b = this.f104845b;
        c26393j.f104846c = this.f104846c;
        c26393j.f104847d = this.f104847d;
        return c26393j;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: b */
    public final void mo78104b(InterfaceC26398o interfaceC26398o) {
        this.f104844a = interfaceC26398o;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: c */
    public final InterfaceC26398o mo78105c() {
        return this.f104844a;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.f104844a + ", provider=" + this.f104845b + ", colorFilterParams=null, alpha=" + this.f104846c + ", contentScale=" + ((Object) C35720i.m113188a(this.f104847d)) + ')';
    }
}
