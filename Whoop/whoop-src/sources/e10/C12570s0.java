package e10;

import a30.C0279c;
import a30.C0294h;
import androidx.lifecycle.C1601k1;
import b00.C2179a;
import b10.C2225c;
import b20.C2326f;
import bc3.C3003e1;
import c93.InterfaceC4339a;
import e00.C12500w;
import f10.C14000b;
import java.util.Set;
import p012ab.C0679g;
import p023ay.C2149w;
import p352ny.C27232d;
import p442qy.C30765d;
import p599wz.C37718g0;
import p599wz.C37734l1;
import p631xz.C38719e0;
import p695zx.C41193o;
import q30.C29938w0;
import q83.InterfaceC30063j;
import s10.C32063e;
import s10.C32064f;
import t40.C33536f;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: e10.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12570s0 implements InterfaceC35517d {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35521h f42925E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC35521h f42926F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC35521h f42927G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42928w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f42929x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f42930y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f42931z;

    public /* synthetic */ C12570s0(InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3, InterfaceC35521h interfaceC35521h4, InterfaceC35521h interfaceC35521h5, InterfaceC35517d interfaceC35517d, int i13) {
        this.f42928w = i13;
        this.f42929x = interfaceC35521h;
        this.f42930y = interfaceC35521h2;
        this.f42931z = interfaceC35521h3;
        this.f42925E = interfaceC35521h4;
        this.f42926F = interfaceC35521h5;
        this.f42927G = interfaceC35517d;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f42928w) {
            case 0:
                return new C12560n0((C0679g) ((C2225c) this.f42926F).get(), (C1601k1) this.f42929x.get(), (C2326f) this.f42930y.get(), (InterfaceC30063j) this.f42931z.get(), (C30765d) this.f42925E.get(), (C12554k0) ((C0294h) this.f42927G).get());
            case 1:
                return new C14000b((C2326f) this.f42929x.get(), (C33536f) this.f42930y.get(), C3003e1.f12012w, (InterfaceC30063j) this.f42931z.get(), (C29938w0) ((C0279c) this.f42926F).get(), (InterfaceC4339a) this.f42925E.get(), (Set) this.f42927G.get());
            case 2:
                return new C32063e((C37734l1) this.f42929x.get(), (C32064f) this.f42930y.get(), (C41193o) this.f42931z.get(), (C1601k1) this.f42925E.get(), (String) this.f42926F.get(), (C27232d) ((C2149w) this.f42927G).get());
            default:
                return new C38719e0((C2179a) this.f42929x.get(), (C12500w) this.f42930y.get(), (C33536f) this.f42931z.get(), (C2326f) this.f42925E.get(), (C37718g0) this.f42926F.get(), (String) ((C0294h) this.f42927G).get());
        }
    }

    public C12570s0(C2225c c2225c, InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3, InterfaceC35521h interfaceC35521h4, C0294h c0294h) {
        this.f42928w = 0;
        this.f42926F = c2225c;
        this.f42929x = interfaceC35521h;
        this.f42930y = interfaceC35521h2;
        this.f42931z = interfaceC35521h3;
        this.f42925E = interfaceC35521h4;
        this.f42927G = c0294h;
    }

    public C12570s0(InterfaceC35521h interfaceC35521h, C0294h c0294h, InterfaceC35521h interfaceC35521h2, C0279c c0279c, InterfaceC35521h interfaceC35521h3, InterfaceC35521h interfaceC35521h4) {
        this.f42928w = 1;
        this.f42929x = interfaceC35521h;
        this.f42930y = c0294h;
        this.f42931z = interfaceC35521h2;
        this.f42926F = c0279c;
        this.f42925E = interfaceC35521h3;
        this.f42927G = interfaceC35521h4;
    }
}
