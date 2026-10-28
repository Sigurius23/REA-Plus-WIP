package p684zk;

import java.io.File;
import java.util.List;
import p093dl.C12154s;
import p093dl.InterfaceC12155t;
import p586wk.EnumC37323a;
import p586wk.InterfaceC37327e;
import p618xk.InterfaceC38413d;

/* JADX INFO: renamed from: zk.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C40776c implements InterfaceC40781f, InterfaceC38413d {

    /* JADX INFO: renamed from: E */
    public InterfaceC37327e f175820E;

    /* JADX INFO: renamed from: F */
    public List f175821F;

    /* JADX INFO: renamed from: G */
    public int f175822G;

    /* JADX INFO: renamed from: H */
    public volatile C12154s f175823H;

    /* JADX INFO: renamed from: I */
    public File f175824I;

    /* JADX INFO: renamed from: w */
    public final List f175825w;

    /* JADX INFO: renamed from: x */
    public final C40782g f175826x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC40780e f175827y;

    /* JADX INFO: renamed from: z */
    public int f175828z = -1;

    public C40776c(List list, C40782g c40782g, InterfaceC40780e interfaceC40780e) {
        this.f175825w = list;
        this.f175826x = c40782g;
        this.f175827y = interfaceC40780e;
    }

    @Override // p684zk.InterfaceC40781f
    /* JADX INFO: renamed from: b */
    public final boolean mo132263b() {
        while (true) {
            List list = this.f175821F;
            boolean z4 = false;
            if (list != null && this.f175822G < list.size()) {
                this.f175823H = null;
                while (!z4 && this.f175822G < this.f175821F.size()) {
                    List list2 = this.f175821F;
                    int i13 = this.f175822G;
                    this.f175822G = i13 + 1;
                    InterfaceC12155t interfaceC12155t = (InterfaceC12155t) list2.get(i13);
                    File file = this.f175824I;
                    C40782g c40782g = this.f175826x;
                    this.f175823H = interfaceC12155t.mo33591b(file, c40782g.f175842e, c40782g.f175843f, c40782g.f175846i);
                    if (this.f175823H != null && this.f175826x.m132268c(this.f175823H.f40409c.mo33598b()) != null) {
                        this.f175823H.f40409c.mo33600e(this.f175826x.f175852o, this);
                        z4 = true;
                    }
                }
                return z4;
            }
            int i14 = this.f175828z + 1;
            this.f175828z = i14;
            if (i14 >= this.f175825w.size()) {
                return false;
            }
            InterfaceC37327e interfaceC37327e = (InterfaceC37327e) this.f175825w.get(this.f175828z);
            C40782g c40782g2 = this.f175826x;
            File fileMo9711n = c40782g2.f175845h.m56071a().mo9711n(new C40778d(interfaceC37327e, c40782g2.f175851n));
            this.f175824I = fileMo9711n;
            if (fileMo9711n != null) {
                this.f175820E = interfaceC37327e;
                this.f175821F = this.f175826x.f175840c.f20303b.m559i(fileMo9711n);
                this.f175822G = 0;
            }
        }
    }

    @Override // p618xk.InterfaceC38413d
    /* JADX INFO: renamed from: c */
    public final void mo33617c(Exception exc) {
        this.f175827y.mo132264a(this.f175820E, exc, this.f175823H.f40409c, EnumC37323a.f159583y);
    }

    @Override // p684zk.InterfaceC40781f
    public final void cancel() {
        C12154s c12154s = this.f175823H;
        if (c12154s != null) {
            c12154s.f40409c.cancel();
        }
    }

    @Override // p618xk.InterfaceC38413d
    /* JADX INFO: renamed from: f */
    public final void mo33618f(Object obj) {
        this.f175827y.mo132265c(this.f175820E, obj, this.f175823H.f40409c, EnumC37323a.f159583y, this.f175820E);
    }
}
