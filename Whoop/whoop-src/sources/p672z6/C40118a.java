package p672z6;

import p088dc.AbstractC11895b;
import p335n6.C26396m;
import p335n6.InterfaceC26392i;
import p335n6.InterfaceC26398o;

/* JADX INFO: renamed from: z6.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C40118a implements InterfaceC26392i {

    /* JADX INFO: renamed from: b */
    public C40123f f173163b;

    /* JADX INFO: renamed from: a */
    public String f173162a = "";

    /* JADX INFO: renamed from: c */
    public int f173164c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public InterfaceC26398o f173165d = C26396m.f104850a;

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: a */
    public final InterfaceC26392i mo78103a() {
        C40118a c40118a = new C40118a();
        c40118a.f173165d = this.f173165d;
        c40118a.f173162a = this.f173162a;
        c40118a.f173163b = this.f173163b;
        c40118a.f173164c = this.f173164c;
        return c40118a;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: b */
    public final void mo78104b(InterfaceC26398o interfaceC26398o) {
        this.f173165d = interfaceC26398o;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: c */
    public final InterfaceC26398o mo78105c() {
        return this.f173165d;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("EmittableText(");
        sb4.append(this.f173162a);
        sb4.append(", style=");
        sb4.append(this.f173163b);
        sb4.append(", modifier=");
        sb4.append(this.f173165d);
        sb4.append(", maxLines=");
        return AbstractC11895b.m31999r(sb4, this.f173164c, ')');
    }
}
