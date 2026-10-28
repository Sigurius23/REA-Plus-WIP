package p684zk;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import p093dl.C12154s;
import p412q3.C29875i;
import p586wk.EnumC37323a;
import p586wk.InterfaceC37325c;
import p586wk.InterfaceC37327e;
import p618xk.InterfaceC38414e;
import tl.AbstractC33908g;
import z63.C40132d;

/* JADX INFO: renamed from: zk.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C40779d0 implements InterfaceC40781f, InterfaceC40780e {

    /* JADX INFO: renamed from: E */
    public Object f175831E;

    /* JADX INFO: renamed from: F */
    public volatile C12154s f175832F;

    /* JADX INFO: renamed from: G */
    public C40778d f175833G;

    /* JADX INFO: renamed from: w */
    public final C40782g f175834w;

    /* JADX INFO: renamed from: x */
    public final RunnableC40784i f175835x;

    /* JADX INFO: renamed from: y */
    public int f175836y;

    /* JADX INFO: renamed from: z */
    public C40776c f175837z;

    public C40779d0(C40782g c40782g, RunnableC40784i runnableC40784i) {
        this.f175834w = c40782g;
        this.f175835x = runnableC40784i;
    }

    @Override // p684zk.InterfaceC40780e
    /* JADX INFO: renamed from: a */
    public final void mo132264a(InterfaceC37327e interfaceC37327e, Exception exc, InterfaceC38414e interfaceC38414e, EnumC37323a enumC37323a) {
        this.f175835x.mo132264a(interfaceC37327e, exc, interfaceC38414e, this.f175832F.f40409c.mo33599d());
    }

    @Override // p684zk.InterfaceC40781f
    /* JADX INFO: renamed from: b */
    public final boolean mo132263b() {
        Object obj = this.f175831E;
        if (obj != null) {
            this.f175831E = null;
            int i13 = AbstractC33908g.f142084b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                InterfaceC37325c interfaceC37325cM132269d = this.f175834w.m132269d(obj);
                C40132d c40132d = new C40132d(interfaceC37325cM132269d, obj, this.f175834w.f175846i);
                InterfaceC37327e interfaceC37327e = this.f175832F.f40407a;
                C40782g c40782g = this.f175834w;
                this.f175833G = new C40778d(interfaceC37327e, c40782g.f175851n);
                c40782g.f175845h.m56071a().mo9710j(this.f175833G, c40132d);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f175833G + ", data: " + obj + ", encoder: " + interfaceC37325cM132269d + ", duration: " + AbstractC33908g.m107258a(jElapsedRealtimeNanos));
                }
                this.f175832F.f40409c.mo33597a();
                this.f175837z = new C40776c(Collections.singletonList(this.f175832F.f40407a), this.f175834w, this);
            } catch (Throwable th3) {
                this.f175832F.f40409c.mo33597a();
                throw th3;
            }
        }
        C40776c c40776c = this.f175837z;
        if (c40776c != null && c40776c.mo132263b()) {
            return true;
        }
        this.f175837z = null;
        this.f175832F = null;
        boolean z4 = false;
        while (!z4 && this.f175836y < this.f175834w.m132267b().size()) {
            ArrayList arrayListM132267b = this.f175834w.m132267b();
            int i14 = this.f175836y;
            this.f175836y = i14 + 1;
            this.f175832F = (C12154s) arrayListM132267b.get(i14);
            if (this.f175832F != null && (this.f175834w.f175853p.m132286a(this.f175832F.f40409c.mo33599d()) || this.f175834w.m132268c(this.f175832F.f40409c.mo33598b()) != null)) {
                this.f175832F.f40409c.mo33600e(this.f175834w.f175852o, new C29875i(this, this.f175832F, false));
                z4 = true;
            }
        }
        return z4;
    }

    @Override // p684zk.InterfaceC40780e
    /* JADX INFO: renamed from: c */
    public final void mo132265c(InterfaceC37327e interfaceC37327e, Object obj, InterfaceC38414e interfaceC38414e, EnumC37323a enumC37323a, InterfaceC37327e interfaceC37327e2) {
        this.f175835x.mo132265c(interfaceC37327e, obj, interfaceC38414e, this.f175832F.f40409c.mo33599d(), interfaceC37327e);
    }

    @Override // p684zk.InterfaceC40781f
    public final void cancel() {
        C12154s c12154s = this.f175832F;
        if (c12154s != null) {
            c12154s.f40409c.cancel();
        }
    }
}
